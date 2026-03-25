package com.sparrowwallet.hummingbird.registry;

import o.C5210Iy;
import o.C5211Iz;

/* JADX INFO: loaded from: classes17.dex */
public class URPSBT extends CryptoPSBT {
    public URPSBT(byte[] bArr) {
        super(bArr);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoPSBT, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.PSBT;
    }

    public static URPSBT fromCbor(C5211Iz c5211Iz) {
        return new URPSBT(((C5210Iy) c5211Iz).KWHzl());
    }
}
