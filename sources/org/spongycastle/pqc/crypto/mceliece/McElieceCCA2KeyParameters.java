package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes25.dex */
public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter {
    private String params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDigest() {
        return this.params;
    }

    public McElieceCCA2KeyParameters(boolean z, String str) {
        super(z);
        this.params = str;
    }
}
