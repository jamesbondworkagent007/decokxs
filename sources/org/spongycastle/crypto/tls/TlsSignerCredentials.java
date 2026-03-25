package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes25.dex */
public interface TlsSignerCredentials extends TlsCredentials {
    byte[] generateCertificateSignature(byte[] bArr) throws IOException;

    SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
}
