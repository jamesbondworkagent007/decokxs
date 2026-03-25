package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes25.dex */
public class Commitment {
    private final byte[] commitment;
    private final byte[] secret;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getCommitment() {
        return this.commitment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSecret() {
        return this.secret;
    }

    public Commitment(byte[] bArr, byte[] bArr2) {
        this.secret = bArr;
        this.commitment = bArr2;
    }
}
