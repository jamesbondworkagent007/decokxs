package com.sparrowwallet.hummingbird.registry;

import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IG;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URECKey extends CryptoECKey {
    public URECKey(Integer num, Boolean bool, byte[] bArr) {
        super(num, bool, bArr);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoECKey, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.ECKEY;
    }

    public static URECKey fromCbor(C5211Iz c5211Iz) {
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
        return new URECKey(numValueOf, boolValueOf, bArrKWHzl);
    }
}
