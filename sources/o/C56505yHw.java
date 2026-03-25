package o;

/* JADX INFO: renamed from: o.yHw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56505yHw {
    public static final void KWHzl(java.lang.AutoCloseable autoCloseable, java.lang.Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (java.lang.Throwable th2) {
                C56379yDe.EZpvd(th, th2);
            }
        }
    }
}
