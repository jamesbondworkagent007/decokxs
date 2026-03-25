package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes25.dex */
public interface TlsEncryptionCredentials extends TlsCredentials {
    byte[] decryptPreMasterSecret(byte[] bArr) throws IOException;
}
