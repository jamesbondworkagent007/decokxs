package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes25.dex */
public class RC2Parameters extends KeyParameter {
    private int bits;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getEffectiveKeyBits() {
        return this.bits;
    }

    public RC2Parameters(byte[] bArr) {
        this(bArr, bArr.length > 128 ? 1024 : bArr.length * 8);
    }

    public RC2Parameters(byte[] bArr, int i) {
        super(bArr);
        this.bits = i;
    }
}
