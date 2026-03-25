package com.sparrowwallet.hummingbird.registry;

import com.sparrowwallet.hummingbird.registry.CryptoCoinInfo;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class URCoinInfo extends CryptoCoinInfo {
    public URCoinInfo(Integer num, Integer num2) {
        super(num, num2);
    }

    public URCoinInfo(CryptoCoinInfo.Type type, CryptoCoinInfo.Network network) {
        super(type, network);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoCoinInfo, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.COIN_INFO;
    }

    public static URCoinInfo fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            int iIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (iIntValue == 1) {
                numValueOf = Integer.valueOf(((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue());
            } else if (iIntValue == 2) {
                numValueOf2 = Integer.valueOf(((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue());
            }
        }
        return new URCoinInfo(numValueOf, numValueOf2);
    }
}
