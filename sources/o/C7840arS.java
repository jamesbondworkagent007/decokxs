package o;

/* JADX INFO: renamed from: o.arS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7840arS {
    public static volatile android.os.Handler OLrzqt;

    public static boolean KWHzl() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static void copydefault(java.lang.Runnable runnable) {
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("runnable is null");
        }
        AEQbTJ().post(runnable);
    }

    public static void KWHzl(java.lang.Runnable runnable) {
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("runnable is null");
        }
        AEQbTJ().postAtFrontOfQueue(runnable);
    }

    public static void KWHzl(java.lang.Object obj, java.lang.Runnable runnable, long j) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("tag is null");
        }
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("runnable is null");
        }
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("delayMill <= 0");
        }
        if ((obj instanceof java.lang.Number) || (obj instanceof java.lang.CharSequence)) {
            obj = obj.toString().intern();
        }
        android.os.Message messageObtain = android.os.Message.obtain(AEQbTJ(), runnable);
        messageObtain.obj = obj;
        AEQbTJ().sendMessageDelayed(messageObtain, j);
    }

    public static void KWHzl(java.lang.Object obj, java.lang.Runnable runnable) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("tag is null");
        }
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("runnable is null");
        }
        if ((obj instanceof java.lang.Number) || (obj instanceof java.lang.CharSequence)) {
            obj = obj.toString().intern();
        }
        AEQbTJ().removeCallbacks(runnable, obj);
    }

    public static void EZpvd(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("tag is null");
        }
        if ((obj instanceof java.lang.Number) || (obj instanceof java.lang.CharSequence)) {
            obj = obj.toString().intern();
        }
        AEQbTJ().removeCallbacksAndMessages(obj);
    }

    public static android.os.Handler AEQbTJ() {
        if (OLrzqt == null) {
            synchronized (C7840arS.class) {
                if (OLrzqt == null) {
                    OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
                }
            }
        }
        return OLrzqt;
    }
}
