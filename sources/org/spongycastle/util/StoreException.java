package org.spongycastle.util;

/* JADX INFO: loaded from: classes25.dex */
public class StoreException extends RuntimeException {
    private Throwable _e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }

    public StoreException(String str, Throwable th) {
        super(str);
        this._e = th;
    }
}
