package o;

import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ypc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class HandlerThreadC57819ypc extends android.os.HandlerThread {
    public static final java.lang.Object AEQbTJ = new java.lang.Object();
    public static HandlerThreadC57819ypc OLrzqt = null;
    public static final java.lang.String copydefault = "com.onesignal.OSTimeoutHandler";
    public final android.os.Handler EZpvd;

    public static HandlerThreadC57819ypc copydefault() {
        if (OLrzqt == null) {
            synchronized (AEQbTJ) {
                if (OLrzqt == null) {
                    OLrzqt = new HandlerThreadC57819ypc();
                }
            }
        }
        return OLrzqt;
    }

    private HandlerThreadC57819ypc() {
        super(copydefault);
        start();
        this.EZpvd = new android.os.Handler(getLooper());
    }

    public void AEQbTJ(long j, @androidx.annotation.NonNull java.lang.Runnable runnable) {
        synchronized (AEQbTJ) {
            EZpvd(runnable);
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Running startTimeout with timeout: " + j + " and runnable: " + runnable.toString());
            this.EZpvd.postDelayed(runnable, j);
        }
    }

    public void EZpvd(java.lang.Runnable runnable) {
        synchronized (AEQbTJ) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Running destroyTimeout with runnable: " + runnable.toString());
            this.EZpvd.removeCallbacks(runnable);
        }
    }
}
