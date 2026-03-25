package org.spongycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes25.dex */
class ExtCRLException extends CRLException {
    Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ExtCRLException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
