package o;

import android.os.Build;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: o.ytq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58045ytq {
    public static long EZpvd;
    public static long OLrzqt;
    public static AppMethodBeat.TaskDescription djBIcL = new AppMethodBeat.TaskDescription();
    public static AppMethodBeat.TaskDescription copydefault = new AppMethodBeat.TaskDescription();
    public static int KWHzl = Integer.MIN_VALUE;
    public static final java.util.HashSet<TaskDescription> AEQbTJ = new java.util.HashSet<>();
    public static boolean AhwBna = false;

    /* JADX INFO: renamed from: o.ytq$TaskDescription */
    public interface TaskDescription {
        void bM_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean KWHzl() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long copydefault() {
        return OLrzqt - EZpvd;
    }

    public static void KWHzl(TaskDescription taskDescription) {
        java.util.HashSet<TaskDescription> hashSet = AEQbTJ;
        synchronized (hashSet) {
            hashSet.add(taskDescription);
        }
    }

    public static void AEQbTJ() {
        try {
            EZpvd = android.os.SystemClock.uptimeMillis();
            copydefault = AppMethodBeat.getInstance().maskIndex("ApplicationCreateBeginMethodIndex");
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(cls);
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mH");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.Class<? super java.lang.Object> superclass = obj2.getClass().getSuperclass();
            if (superclass != null) {
                java.lang.reflect.Field declaredField3 = superclass.getDeclaredField("mCallback");
                declaredField3.setAccessible(true);
                declaredField3.set(obj2, new ActionBar((Handler.Callback) declaredField3.get(obj2)));
            }
            C58013ytK.EZpvd("Matrix.ActivityThreadHacker", "hook system handler completed. start:%s SDK_INT:%s", java.lang.Long.valueOf(EZpvd), java.lang.Integer.valueOf(Build.VERSION.SDK_INT));
        } catch (java.lang.Exception e) {
            C58013ytK.OLrzqt("Matrix.ActivityThreadHacker", "hook system handler err! %s", e.getCause().toString());
        }
    }

    /* JADX INFO: renamed from: o.ytq$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar implements Handler.Callback {
        public static int AEQbTJ = Integer.MAX_VALUE;
        public static boolean OLrzqt = false;
        public java.lang.reflect.Method KWHzl = null;
        public final Handler.Callback copydefault;

        public ActionBar(Handler.Callback callback) {
            this.copydefault = callback;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i;
            int i2;
            if (C58040ytl.AEQbTJ().EZpvd() && Build.VERSION.SDK_INT <= 25 && ((i2 = message.what) == 115 || i2 == 116 || i2 == 103 || i2 == 104 || i2 == 137)) {
                C58013ytK.EZpvd("Matrix.ActivityThreadHacker", "Fix SP ANR is enabled", new java.lang.Object[0]);
                KWHzl();
            }
            if (!AppMethodBeat.isRealTrace()) {
                Handler.Callback callback = this.copydefault;
                return callback != null && callback.handleMessage(message);
            }
            boolean zKWHzl = KWHzl(message);
            if (AEQbTJ > 0) {
                C58013ytK.EZpvd("Matrix.ActivityThreadHacker", "[handleMessage] msg.what:%s begin:%s isLaunchActivity:%s SDK_INT=%s", java.lang.Integer.valueOf(message.what), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), java.lang.Boolean.valueOf(zKWHzl), java.lang.Integer.valueOf(Build.VERSION.SDK_INT));
                AEQbTJ--;
            }
            if (!OLrzqt && (zKWHzl || (i = message.what) == 114 || i == 113)) {
                long unused = C58045ytq.OLrzqt = android.os.SystemClock.uptimeMillis();
                C58045ytq.KWHzl = message.what;
                OLrzqt = true;
                boolean unused2 = C58045ytq.AhwBna = zKWHzl;
                C58013ytK.EZpvd("Matrix.ActivityThreadHacker", "application create end, sApplicationCreateScene:%d, isLaunchActivity:%s", java.lang.Integer.valueOf(message.what), java.lang.Boolean.valueOf(zKWHzl));
                synchronized (C58045ytq.AEQbTJ) {
                    java.util.Iterator it = C58045ytq.AEQbTJ.iterator();
                    while (it.hasNext()) {
                        ((TaskDescription) it.next()).bM_();
                    }
                }
            }
            Handler.Callback callback2 = this.copydefault;
            return callback2 != null && callback2.handleMessage(message);
        }

        public final void KWHzl() {
            try {
                java.lang.reflect.Field declaredField = java.lang.Class.forName("android.app.QueuedWork").getDeclaredField("sPendingWorkFinishers");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    ((ConcurrentLinkedQueue) declaredField.get(null)).clear();
                    C58013ytK.EZpvd("Matrix.ActivityThreadHacker", "Fix SP ANR sPendingWorkFinishers.clear successful", new java.lang.Object[0]);
                }
            } catch (java.lang.ClassNotFoundException e) {
                C58013ytK.OLrzqt("Matrix.ActivityThreadHacker", "Fix SP ANR ClassNotFoundException = " + e.getMessage(), new java.lang.Object[0]);
                e.printStackTrace();
            } catch (java.lang.IllegalAccessException e2) {
                C58013ytK.OLrzqt("Matrix.ActivityThreadHacker", "Fix SP ANR IllegalAccessException =" + e2.getMessage(), new java.lang.Object[0]);
                e2.printStackTrace();
            } catch (java.lang.NoSuchFieldException e3) {
                C58013ytK.OLrzqt("Matrix.ActivityThreadHacker", "Fix SP ANR NoSuchFieldException = " + e3.getMessage(), new java.lang.Object[0]);
                e3.printStackTrace();
            } catch (java.lang.Exception e4) {
                C58013ytK.OLrzqt("Matrix.ActivityThreadHacker", "Fix SP ANR Exception = " + e4.getMessage(), new java.lang.Object[0]);
                e4.printStackTrace();
            }
        }

        public final boolean KWHzl(android.os.Message message) {
            if (Build.VERSION.SDK_INT > 27) {
                if (message.what == 159 && message.obj != null) {
                    try {
                        if (this.KWHzl == null) {
                            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredMethod("getCallbacks", new java.lang.Class[0]);
                            this.KWHzl = declaredMethod;
                            declaredMethod.setAccessible(true);
                        }
                        java.util.List list = (java.util.List) this.KWHzl.invoke(message.obj, new java.lang.Object[0]);
                        if (!list.isEmpty()) {
                            return list.get(0).getClass().getName().endsWith(".LaunchActivityItem");
                        }
                    } catch (java.lang.Exception e) {
                        C58013ytK.OLrzqt("Matrix.ActivityThreadHacker", "[isLaunchActivity] %s", e);
                    }
                }
                return message.what == 100;
            }
            int i = message.what;
            return i == 100 || i == 126;
        }
    }
}
