package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes25.dex */
public class IESParameters implements CipherParameters {
    private byte[] derivation;
    private byte[] encoding;
    private int macKeySize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getDerivationV() {
        return this.derivation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getEncodingV() {
        return this.encoding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMacKeySize() {
        return this.macKeySize;
    }

    public IESParameters(byte[] bArr, byte[] bArr2, int i) {
        this.derivation = bArr;
        this.encoding = bArr2;
        this.macKeySize = i;
    }
}
