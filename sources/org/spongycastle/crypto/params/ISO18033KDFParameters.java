package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes25.dex */
public class ISO18033KDFParameters implements DerivationParameters {
    byte[] seed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getSeed() {
        return this.seed;
    }

    public ISO18033KDFParameters(byte[] bArr) {
        this.seed = bArr;
    }
}
