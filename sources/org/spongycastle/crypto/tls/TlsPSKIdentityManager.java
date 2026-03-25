package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes25.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}
