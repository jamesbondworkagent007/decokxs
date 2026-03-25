package org.spongycastle.jce.provider;

import org.spongycastle.jce.exception.ExtException;

/* JADX INFO: loaded from: classes25.dex */
public class AnnotatedException extends Exception implements ExtException {
    private Throwable _underlyingException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable, org.spongycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this._underlyingException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }

    public AnnotatedException(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    public AnnotatedException(String str) {
        this(str, null);
    }
}
