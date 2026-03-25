package o;

/* JADX INFO: renamed from: o.yvO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58123yvO {
    public static java.lang.Thread OLrzqt;

    private C58123yvO() {
    }

    public static boolean OLrzqt() {
        if (OLrzqt == null) {
            OLrzqt = android.os.Looper.getMainLooper().getThread();
        }
        return java.lang.Thread.currentThread() == OLrzqt;
    }

    public static void AEQbTJ() {
        if (!OLrzqt()) {
            throw new java.lang.IllegalStateException("Must be called on the Main thread.");
        }
    }
}
