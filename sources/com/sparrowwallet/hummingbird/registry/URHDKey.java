package com.sparrowwallet.hummingbird.registry;

import java.util.Iterator;
import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IG;
import o.IJ;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URHDKey extends CryptoHDKey {
    public URHDKey(byte[] bArr, byte[] bArr2) {
        super(bArr, bArr2);
    }

    public URHDKey(Boolean bool, byte[] bArr, byte[] bArr2, URCoinInfo uRCoinInfo, URKeypath uRKeypath, URKeypath uRKeypath2, byte[] bArr3) {
        super(bool, bArr, bArr2, uRCoinInfo, uRKeypath, uRKeypath2, bArr3);
    }

    public URHDKey(Boolean bool, byte[] bArr, byte[] bArr2, URCoinInfo uRCoinInfo, URKeypath uRKeypath, URKeypath uRKeypath2, byte[] bArr3, String str, String str2) {
        super(bool, bArr, bArr2, uRCoinInfo, uRKeypath, uRKeypath2, bArr3, str, str2);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoHDKey, com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = (IE) super.toCbor();
        C5211Iz c5211IzCopydefault = ie.copydefault(new IL(5L));
        if (c5211IzCopydefault != null) {
            c5211IzCopydefault.EZpvd(RegistryType.COIN_INFO.getTag().intValue());
        }
        C5211Iz c5211IzCopydefault2 = ie.copydefault(new IL(6L));
        if (c5211IzCopydefault2 != null) {
            c5211IzCopydefault2.EZpvd(RegistryType.KEYPATH.getTag().intValue());
        }
        C5211Iz c5211IzCopydefault3 = ie.copydefault(new IL(7L));
        if (c5211IzCopydefault3 != null) {
            c5211IzCopydefault3.EZpvd(RegistryType.KEYPATH.getTag().intValue());
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoHDKey, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.HDKEY;
    }

    public static URHDKey fromCbor(C5211Iz c5211Iz) {
        String strAEQbTJ;
        String strAEQbTJ2;
        byte[] bArrBigIntegerToBytes;
        URKeypath uRKeypathFromCbor;
        URKeypath uRKeypathFromCbor2;
        URCoinInfo uRCoinInfoFromCbor;
        byte[] bArrKWHzl;
        byte[] bArrKWHzl2;
        Boolean boolValueOf;
        boolean z;
        IE ie = (IE) c5211Iz;
        Iterator<C5211Iz> it = ie.KWHzl().iterator();
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        URKeypath uRKeypath = null;
        URKeypath uRKeypath2 = null;
        URCoinInfo uRCoinInfo = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        Boolean bool = null;
        loop0: while (true) {
            strAEQbTJ = str;
            strAEQbTJ2 = str2;
            bArrBigIntegerToBytes = bArr;
            uRKeypathFromCbor = uRKeypath;
            uRKeypathFromCbor2 = uRKeypath2;
            uRCoinInfoFromCbor = uRCoinInfo;
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
                    uRCoinInfoFromCbor = URCoinInfo.fromCbor(ie.copydefault(il));
                } else if (iIntValue == 6) {
                    uRKeypathFromCbor2 = URKeypath.fromCbor(ie.copydefault(il));
                } else if (iIntValue == 7) {
                    uRKeypathFromCbor = URKeypath.fromCbor(ie.copydefault(il));
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
            uRCoinInfo = uRCoinInfoFromCbor;
            uRKeypath2 = uRKeypathFromCbor2;
            uRKeypath = uRKeypathFromCbor;
            bArr = bArrBigIntegerToBytes;
            str2 = strAEQbTJ2;
            str = strAEQbTJ;
        }
        if (bArrKWHzl2 == null) {
            throw new IllegalStateException("Key data is null");
        }
        if (!z) {
            return new URHDKey(boolValueOf, bArrKWHzl2, bArrKWHzl, uRCoinInfoFromCbor, uRKeypathFromCbor2, uRKeypathFromCbor, bArrBigIntegerToBytes, strAEQbTJ2, strAEQbTJ);
        }
        if (bArrKWHzl == null) {
            throw new IllegalStateException("Chain code data is null");
        }
        return new URHDKey(bArrKWHzl2, bArrKWHzl);
    }
}
