package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends IOException {
    private Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public i(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
