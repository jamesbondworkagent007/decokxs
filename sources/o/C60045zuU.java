package o;

import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.zuU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60045zuU {
    public static int AEQbTJ;
    public static TaskDescription EZpvd;
    public static final java.util.Map<Globals, TaskDescription> copydefault = new java.util.HashMap();
    public static final java.lang.String[] KWHzl = {"B", "KB", "MB", "GB"};

    /* JADX INFO: renamed from: o.zuU$Application */
    public interface Application {
        void KWHzl(long j);
    }

    public static java.lang.String copydefault(long j) {
        int length = KWHzl.length;
        int i = 0;
        long j2 = j;
        long j3 = j2;
        while (true) {
            j2 >>>= 10;
            if (j2 <= 0) {
                int i2 = i * 10;
                return java.lang.String.format("%.2f%s", java.lang.Float.valueOf(j3 + ((j - (j3 << i2)) / (1 << i2))), KWHzl[i]);
            }
            int i3 = i + 1;
            if (i3 < length) {
                j3 = j2;
                i = i3;
            }
        }
    }

    public static void AEQbTJ(Application application) {
        synchronized (C60045zuU.class) {
            if (AEQbTJ <= 0) {
                return;
            }
            if (EZpvd == null) {
                TaskDescription taskDescription = new TaskDescription();
                EZpvd = taskDescription;
                taskDescription.start();
            }
            EZpvd.KWHzl(application);
        }
    }

    /* JADX INFO: renamed from: o.zuU$TaskDescription */
    public static final class TaskDescription extends java.lang.Thread {
        public boolean AEQbTJ;
        public volatile Application KWHzl;
        public final Globals copydefault;

        public TaskDescription() {
            super("LuaVmMemMonitor");
            this.AEQbTJ = true;
            this.copydefault = null;
        }

        public void KWHzl(Application application) {
            synchronized (this) {
                this.KWHzl = application;
                notify();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (C60045zuU.AEQbTJ > 0 && this.copydefault == null) {
                KWHzl();
            }
        }

        public final void KWHzl() {
            while (this.AEQbTJ) {
                synchronized (this) {
                    while (this.KWHzl == null && C60045zuU.AEQbTJ > 0 && this.AEQbTJ) {
                        try {
                            wait();
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    try {
                        java.lang.Thread.sleep(C60045zuU.AEQbTJ);
                    } catch (java.lang.Throwable unused2) {
                    }
                    this.KWHzl.KWHzl(Globals.EZpvd());
                }
            }
        }
    }
}
