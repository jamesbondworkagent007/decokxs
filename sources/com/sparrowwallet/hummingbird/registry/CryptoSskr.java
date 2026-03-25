package com.sparrowwallet.hummingbird.registry;

import java.util.Arrays;
import o.C5210Iy;
import o.C5211Iz;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoSskr extends RegistryItem {
    private final byte[] split;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSplit() {
        return this.split;
    }

    public CryptoSskr(byte[] bArr) {
        this.split = bArr;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        return new C5210Iy(this.split);
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_SSKR;
    }

    public static CryptoSskr fromCbor(C5211Iz c5211Iz) {
        byte[] bArrKWHzl = ((C5210Iy) c5211Iz).KWHzl();
        return new CryptoSskr(Arrays.copyOfRange(bArrKWHzl, 1, bArrKWHzl.length));
    }
}
