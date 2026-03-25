package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes25.dex */
public class AsymmetricKeyParameter implements CipherParameters {
    boolean privateKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isPrivate() {
        return this.privateKey;
    }

    public AsymmetricKeyParameter(boolean z) {
        this.privateKey = z;
    }
}
