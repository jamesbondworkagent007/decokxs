package com.sparrowwallet.hummingbird.registry;

import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoAddress extends RegistryItem {
    public static final long DATA = 3;
    public static final long INFO = 1;
    public static final long TYPE = 2;
    private final byte[] data;
    private final CryptoCoinInfo info;
    private final Type type;

    /* JADX INFO: loaded from: classes24.dex */
    public enum Type {
        P2PKH,
        P2SH,
        P2WPKH
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoCoinInfo getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type getType() {
        return this.type;
    }

    public CryptoAddress(CryptoCoinInfo cryptoCoinInfo, Type type, byte[] bArr) {
        this.info = cryptoCoinInfo;
        this.type = type;
        this.data = bArr;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        if (this.info != null) {
            ie.EZpvd(new IL(1L), this.info.toCbor());
        }
        if (this.type != null) {
            ie.EZpvd(new IL(2L), new IL(this.type.ordinal()));
        }
        ie.EZpvd(new IL(3L), new C5210Iy(this.data));
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_ADDRESS;
    }

    public static CryptoAddress fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        byte[] bArrKWHzl = null;
        CryptoCoinInfo cryptoCoinInfoFromCbor = null;
        Type type = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            long jIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (jIntValue == 1) {
                cryptoCoinInfoFromCbor = CryptoCoinInfo.fromCbor(ie.copydefault(c5211Iz2));
            } else if (jIntValue == 2) {
                type = Type.values()[((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue()];
            } else if (jIntValue == 3) {
                bArrKWHzl = ((C5210Iy) ie.copydefault(c5211Iz2)).KWHzl();
            }
        }
        if (bArrKWHzl == null) {
            throw new IllegalStateException("Data is null");
        }
        return new CryptoAddress(cryptoCoinInfoFromCbor, type, bArrKWHzl);
    }
}
