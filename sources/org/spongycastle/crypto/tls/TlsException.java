package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes25.dex */
public class TlsException extends IOException {
    protected Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public TlsException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
