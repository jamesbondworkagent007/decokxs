package o;

/* JADX INFO: loaded from: classes13.dex */
public final class yFA {
    public static final void copydefault(java.io.Closeable closeable, java.lang.Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                C56379yDe.EZpvd(th, th2);
            }
        }
    }
}
