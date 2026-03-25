package com.okinc.business.defi.biz.core.error;

/* JADX INFO: loaded from: classes3.dex */
public class OKWException extends Exception {
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

    public OKWException(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }
}
