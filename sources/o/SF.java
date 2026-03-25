package o;

/* JADX INFO: loaded from: classes2.dex */
public final class SF {
    public static final double copydefault = 1.0d / java.lang.Math.pow(10.0d, 6.0d);

    private SF() {
    }

    public static long copydefault() {
        return android.os.SystemClock.elapsedRealtimeNanos();
    }

    public static double OLrzqt(long j) {
        return (copydefault() - j) * copydefault;
    }
}
