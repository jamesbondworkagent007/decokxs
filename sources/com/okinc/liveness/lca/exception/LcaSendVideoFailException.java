package com.okinc.liveness.lca.exception;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaSendVideoFailException extends Throwable {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public LcaSendVideoFailException(String str) {
        super(str);
        this.message = str;
    }
}
