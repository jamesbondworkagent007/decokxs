package com.sparrowwallet.hummingbird.registry;

import o.C5210Iy;
import o.C5211Iz;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoPSBT extends RegistryItem {
    private final byte[] psbt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getPsbt() {
        return this.psbt;
    }

    public CryptoPSBT(byte[] bArr) {
        this.psbt = bArr;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        return new C5210Iy(this.psbt);
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_PSBT;
    }

    public static CryptoPSBT fromCbor(C5211Iz c5211Iz) {
        return new CryptoPSBT(((C5210Iy) c5211Iz).KWHzl());
    }
}
