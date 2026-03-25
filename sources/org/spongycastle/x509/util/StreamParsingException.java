package org.spongycastle.x509.util;

/* JADX INFO: loaded from: classes25.dex */
public class StreamParsingException extends Exception {
    Throwable _e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this._e = th;
    }
}
