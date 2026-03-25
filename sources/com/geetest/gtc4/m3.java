package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class m3 extends IllegalStateException {
    private Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m3(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
