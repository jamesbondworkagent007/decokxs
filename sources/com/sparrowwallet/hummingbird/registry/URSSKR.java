package com.sparrowwallet.hummingbird.registry;

import java.util.Arrays;
import o.C5210Iy;
import o.C5211Iz;

/* JADX INFO: loaded from: classes17.dex */
public class URSSKR extends CryptoSskr {
    public URSSKR(byte[] bArr) {
        super(bArr);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CryptoSskr, com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.SSKR;
    }

    public static URSSKR fromCbor(C5211Iz c5211Iz) {
        byte[] bArrKWHzl = ((C5210Iy) c5211Iz).KWHzl();
        return new URSSKR(Arrays.copyOfRange(bArrKWHzl, 1, bArrKWHzl.length));
    }
}
