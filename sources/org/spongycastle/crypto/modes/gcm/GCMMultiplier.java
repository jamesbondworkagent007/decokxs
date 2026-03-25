package org.spongycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes25.dex */
public interface GCMMultiplier {
    void init(byte[] bArr);

    void multiplyH(byte[] bArr);
}
