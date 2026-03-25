package com.okinc.liveness.lca.exception;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJniFaceQcLoadFailException extends Throwable {
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

    public LcaJniFaceQcLoadFailException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }
}
