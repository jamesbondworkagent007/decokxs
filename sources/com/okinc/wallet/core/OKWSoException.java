package com.okinc.wallet.core;

import o.C6777aVl;

/* JADX INFO: loaded from: classes24.dex */
public final class OKWSoException extends Exception {
    public static final int $stable = 8;
    private final Throwable cause;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public OKWSoException(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }

    public final void postException() {
        C6777aVl.Companion.EZpvd(this);
    }
}
