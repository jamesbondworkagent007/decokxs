package o;

/* JADX INFO: renamed from: o.Sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5469Sx {
    public static final java.util.concurrent.Executor OLrzqt = new java.util.concurrent.Executor() { // from class: o.Sx.5
        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable runnable) {
            SI.copydefault(runnable);
        }
    };
    public static final java.util.concurrent.Executor copydefault = new java.util.concurrent.Executor() { // from class: o.Sx.2
        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.util.concurrent.Executor AEQbTJ() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.util.concurrent.Executor OLrzqt() {
        return copydefault;
    }

    private C5469Sx() {
    }
}
