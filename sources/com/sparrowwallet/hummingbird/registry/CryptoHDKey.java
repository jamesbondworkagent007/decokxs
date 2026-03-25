package com.sparrowwallet.hummingbird.registry;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IG;
import o.IJ;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoHDKey extends RegistryItem {
    public static final int CHAIN_CODE_KEY = 4;
    public static final int CHILDREN_KEY = 7;
    public static final int IS_MASTER_KEY = 1;
    public static final int IS_PRIVATE_KEY = 2;
    public static final int KEY_DATA_KEY = 3;
    public static final int NAME_KEY = 9;
    public static final int NOTE_KEY = 10;
    public static final int ORIGIN_KEY = 6;
    public static final int PARENT_FINGERPRINT_KEY = 8;
    public static final int USE_INFO_KEY = 5;
    private final byte[] chainCode;
    private final CryptoKeypath children;
    private final byte[] key;
    private final boolean master;
    private final String name;
    private final String note;
    private final CryptoKeypath origin;
    private final byte[] parentFingerprint;
    private final Boolean privateKey;
    private final CryptoCoinInfo useInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getChainCode() {
        return this.chainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoKeypath getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNote() {
        return this.note;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoKeypath getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getParentFingerprint() {
        return this.parentFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoCoinInfo getUseInfo() {
        return this.useInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isMaster() {
        return this.master;
    }

    public CryptoHDKey(byte[] bArr, byte[] bArr2) {
        this.master = true;
        this.privateKey = Boolean.TRUE;
        this.key = bArr;
        this.chainCode = bArr2;
        this.useInfo = null;
        this.origin = null;
        this.children = null;
        this.parentFingerprint = null;
        this.name = null;
        this.note = null;
    }

    public CryptoHDKey(Boolean bool, byte[] bArr, byte[] bArr2, CryptoCoinInfo cryptoCoinInfo, CryptoKeypath cryptoKeypath, CryptoKeypath cryptoKeypath2, byte[] bArr3) {
        this(bool, bArr, bArr2, cryptoCoinInfo, cryptoKeypath, cryptoKeypath2, bArr3, null, null);
    }

    public CryptoHDKey(Boolean bool, byte[] bArr, byte[] bArr2, CryptoCoinInfo cryptoCoinInfo, CryptoKeypath cryptoKeypath, CryptoKeypath cryptoKeypath2, byte[] bArr3, String str, String str2) {
        this.master = false;
        this.privateKey = bool;
        this.key = bArr;
        this.chainCode = bArr2;
        this.useInfo = cryptoCoinInfo;
        this.origin = cryptoKeypath;
        this.children = cryptoKeypath2;
        this.parentFingerprint = bArr3 == null ? null : Arrays.copyOfRange(bArr3, bArr3.length - 4, bArr3.length);
        this.name = str;
        this.note = str2;
    }

    public boolean isPrivateKey() {
        Boolean bool = this.privateKey;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        if (this.master) {
            ie.EZpvd(new IL(1L), IG.EZpvd);
            ie.EZpvd(new IL(3L), new C5210Iy(this.key));
            ie.EZpvd(new IL(4L), new C5210Iy(this.chainCode));
        } else {
            if (this.privateKey != null) {
                ie.EZpvd(new IL(2L), this.privateKey.booleanValue() ? IG.EZpvd : IG.AEQbTJ);
            }
            ie.EZpvd(new IL(3L), new C5210Iy(this.key));
            if (this.chainCode != null) {
                ie.EZpvd(new IL(4L), new C5210Iy(this.chainCode));
            }
            CryptoCoinInfo cryptoCoinInfo = this.useInfo;
            if (cryptoCoinInfo != null) {
                C5211Iz cbor = cryptoCoinInfo.toCbor();
                cbor.EZpvd(RegistryType.CRYPTO_COIN_INFO.getTag().intValue());
                ie.EZpvd(new IL(5L), cbor);
            }
            CryptoKeypath cryptoKeypath = this.origin;
            if (cryptoKeypath != null) {
                C5211Iz cbor2 = cryptoKeypath.toCbor();
                cbor2.EZpvd(RegistryType.CRYPTO_KEYPATH.getTag().intValue());
                ie.EZpvd(new IL(6L), cbor2);
            }
            CryptoKeypath cryptoKeypath2 = this.children;
            if (cryptoKeypath2 != null) {
                C5211Iz cbor3 = cryptoKeypath2.toCbor();
                cbor3.EZpvd(RegistryType.CRYPTO_KEYPATH.getTag().intValue());
                ie.EZpvd(new IL(7L), cbor3);
            }
            if (this.parentFingerprint != null) {
                ie.EZpvd(new IL(8L), new IL(new BigInteger(1, this.parentFingerprint)));
            }
            if (this.name != null) {
                ie.EZpvd(new IL(9L), new IJ(this.name));
            }
            if (this.note != null) {
                ie.EZpvd(new IL(10L), new IJ(this.note));
            }
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_HDKEY;
    }

    public static CryptoHDKey fromCbor(C5211Iz c5211Iz) {
        String strAEQbTJ;
        String strAEQbTJ2;
        byte[] bArrBigIntegerToBytes;
        CryptoKeypath cryptoKeypathFromCbor;
        CryptoKeypath cryptoKeypathFromCbor2;
        CryptoCoinInfo cryptoCoinInfoFromCbor;
        byte[] bArrKWHzl;
        byte[] bArrKWHzl2;
        Boolean boolValueOf;
        boolean z;
        IE ie = (IE) c5211Iz;
        Iterator<C5211Iz> it = ie.KWHzl().iterator();
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        CryptoKeypath cryptoKeypath = null;
        CryptoKeypath cryptoKeypath2 = null;
        CryptoCoinInfo cryptoCoinInfo = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        Boolean bool = null;
        loop0: while (true) {
            strAEQbTJ = str;
            strAEQbTJ2 = str2;
            bArrBigIntegerToBytes = bArr;
            cryptoKeypathFromCbor = cryptoKeypath;
            cryptoKeypathFromCbor2 = cryptoKeypath2;
            cryptoCoinInfoFromCbor = cryptoCoinInfo;
            bArrKWHzl = bArr2;
            bArrKWHzl2 = bArr3;
            boolValueOf = bool;
            z = false;
            while (it.hasNext()) {
                IL il = (IL) it.next();
                int iIntValue = il.KWHzl().intValue();
                if (iIntValue == 1) {
                    if (ie.copydefault(il) == IG.EZpvd) {
                        z = true;
                    }
                } else if (iIntValue == 2) {
                    boolValueOf = Boolean.valueOf(ie.copydefault(il) == IG.EZpvd);
                } else if (iIntValue == 3) {
                    bArrKWHzl2 = ((C5210Iy) ie.copydefault(il)).KWHzl();
                } else if (iIntValue == 4) {
                    bArrKWHzl = ((C5210Iy) ie.copydefault(il)).KWHzl();
                } else if (iIntValue == 5) {
                    cryptoCoinInfoFromCbor = CryptoCoinInfo.fromCbor(ie.copydefault(il));
                } else if (iIntValue == 6) {
                    cryptoKeypathFromCbor2 = CryptoKeypath.fromCbor(ie.copydefault(il));
                } else if (iIntValue == 7) {
                    cryptoKeypathFromCbor = CryptoKeypath.fromCbor(ie.copydefault(il));
                } else if (iIntValue == 8) {
                    bArrBigIntegerToBytes = RegistryItem.bigIntegerToBytes(((IL) ie.copydefault(il)).KWHzl(), 4);
                } else if (iIntValue == 9) {
                    strAEQbTJ2 = ((IJ) ie.copydefault(il)).AEQbTJ();
                } else if (iIntValue == 10) {
                    strAEQbTJ = ((IJ) ie.copydefault(il)).AEQbTJ();
                }
            }
            bool = boolValueOf;
            bArr3 = bArrKWHzl2;
            bArr2 = bArrKWHzl;
            cryptoCoinInfo = cryptoCoinInfoFromCbor;
            cryptoKeypath2 = cryptoKeypathFromCbor2;
            cryptoKeypath = cryptoKeypathFromCbor;
            bArr = bArrBigIntegerToBytes;
            str2 = strAEQbTJ2;
            str = strAEQbTJ;
        }
        if (bArrKWHzl2 == null) {
            throw new IllegalStateException("Key data is null");
        }
        if (!z) {
            return new CryptoHDKey(boolValueOf, bArrKWHzl2, bArrKWHzl, cryptoCoinInfoFromCbor, cryptoKeypathFromCbor2, cryptoKeypathFromCbor, bArrBigIntegerToBytes, strAEQbTJ2, strAEQbTJ);
        }
        if (bArrKWHzl == null) {
            throw new IllegalStateException("Chain code data is null");
        }
        return new CryptoHDKey(bArrKWHzl2, bArrKWHzl);
    }
}
