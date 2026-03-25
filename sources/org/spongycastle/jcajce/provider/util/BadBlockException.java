package org.spongycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes25.dex */
public class BadBlockException extends BadPaddingException {
    private final Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public BadBlockException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
