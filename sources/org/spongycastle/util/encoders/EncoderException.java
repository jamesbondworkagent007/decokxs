package org.spongycastle.util.encoders;

/* JADX INFO: loaded from: classes25.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public EncoderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
