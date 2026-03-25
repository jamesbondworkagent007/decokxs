package org.spongycastle.x509;

import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes25.dex */
class ExtCertificateEncodingException extends CertificateEncodingException {
    Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ExtCertificateEncodingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
