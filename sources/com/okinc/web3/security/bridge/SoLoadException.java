package com.okinc.web3.security.bridge;

/* JADX INFO: loaded from: classes12.dex */
public final class SoLoadException extends Exception {
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

    public SoLoadException(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }
}
