package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes25.dex */
public class IESWithCipherParameters extends IESParameters {
    private int cipherKeySize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getCipherKeySize() {
        return this.cipherKeySize;
    }

    public IESWithCipherParameters(byte[] bArr, byte[] bArr2, int i, int i2) {
        super(bArr, bArr2, i);
        this.cipherKeySize = i2;
    }
}
