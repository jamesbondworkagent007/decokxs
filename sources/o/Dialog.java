package o;

/* JADX INFO: loaded from: classes.dex */
public final class Dialog {
    public static final java.lang.String KWHzl = "_COROUTINE";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl() {
        return KWHzl;
    }

    public static final java.lang.StackTraceElement EZpvd(java.lang.Throwable th, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new java.lang.StackTraceElement(KWHzl + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
