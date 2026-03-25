package org.spongycastle.jcajce.spec;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes25.dex */
public class RepeatedSecretKeySpec implements SecretKey {
    private String algorithm;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    public RepeatedSecretKeySpec(String str) {
        this.algorithm = str;
    }
}
