package com.sparrowwallet.hummingbird.registry;

import com.sparrowwallet.hummingbird.registry.CryptoAddress;
import o.C5210Iy;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URAddress extends CryptoAddress {
    public URAddress(CryptoCoinInfo cryptoCoinInfo, CryptoAddress.Type type, byte[] bArr) {
        super(cryptoCoinInfo, type, bArr);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoAddress, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.ADDRESS;
    }

    public static URAddress fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        byte[] bArrKWHzl = null;
        URCoinInfo uRCoinInfoFromCbor = null;
        CryptoAddress.Type type = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            long jIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (jIntValue == 1) {
                uRCoinInfoFromCbor = URCoinInfo.fromCbor(ie.copydefault(c5211Iz2));
            } else if (jIntValue == 2) {
                type = CryptoAddress.Type.values()[((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue()];
            } else if (jIntValue == 3) {
                bArrKWHzl = ((C5210Iy) ie.copydefault(c5211Iz2)).KWHzl();
            }
        }
        if (bArrKWHzl == null) {
            throw new IllegalStateException("Data is null");
        }
        return new URAddress(uRCoinInfoFromCbor, type, bArrKWHzl);
    }
}
