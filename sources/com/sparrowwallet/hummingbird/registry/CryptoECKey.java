package com.sparrowwallet.hummingbird.registry;

import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IG;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoECKey extends RegistryItem {
    public static final long CURVE = 1;
    public static final long DATA = 3;
    public static final long PRIVATE = 2;
    private final Integer curve;
    private final byte[] data;
    private final Boolean privateKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getData() {
        return this.data;
    }

    public CryptoECKey(Integer num, Boolean bool, byte[] bArr) {
        this.curve = num;
        this.privateKey = bool;
        this.data = bArr;
    }

    public int getCurve() {
        Integer num = this.curve;
        if (num == null) {
            return 0;
        }
        return num.intValue();
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
        if (this.curve != null) {
            ie.EZpvd(new IL(1L), new IL(this.curve.intValue()));
        }
        if (this.privateKey != null) {
            ie.EZpvd(new IL(2L), this.privateKey.booleanValue() ? IG.EZpvd : IG.AEQbTJ);
        }
        ie.EZpvd(new IL(3L), new C5210Iy(this.data));
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_ECKEY;
    }

    public static CryptoECKey fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        byte[] bArrKWHzl = null;
        Integer numValueOf = null;
        Boolean boolValueOf = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            long jIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (jIntValue == 1) {
                numValueOf = Integer.valueOf(((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue());
            } else if (jIntValue == 2) {
                boolValueOf = Boolean.valueOf(ie.copydefault(c5211Iz2) == IG.EZpvd);
            } else if (jIntValue == 3) {
                bArrKWHzl = ((C5210Iy) ie.copydefault(c5211Iz2)).KWHzl();
            }
        }
        if (bArrKWHzl == null) {
            throw new IllegalStateException("Data is null");
        }
        return new CryptoECKey(numValueOf, boolValueOf, bArrKWHzl);
    }
}
