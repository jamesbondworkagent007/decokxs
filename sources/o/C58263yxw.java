package o;

import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58263yxw extends AbstractC58253yxm {
    public final android.os.Handler AEQbTJ;

    public C58263yxw(android.os.Handler handler) {
        this.AEQbTJ = handler;
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (runnable == null) {
            throw new java.lang.NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("unit == null");
        }
        Activity activity = new Activity(this.AEQbTJ, yBG.KWHzl(runnable));
        this.AEQbTJ.postDelayed(activity, java.lang.Math.max(0L, timeUnit.toMillis(j)));
        return activity;
    }

    @Override // o.AbstractC58253yxm
    public AbstractC58253yxm.StateListAnimator createWorker() {
        return new TaskDescription(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.yxw$TaskDescription */
    public static final class TaskDescription extends AbstractC58253yxm.StateListAnimator {
        public final android.os.Handler KWHzl;
        public volatile boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault;
        }

        public TaskDescription(android.os.Handler handler) {
            this.KWHzl = handler;
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (runnable == null) {
                throw new java.lang.NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new java.lang.NullPointerException("unit == null");
            }
            if (this.copydefault) {
                return C58215yxA.EZpvd();
            }
            Activity activity = new Activity(this.KWHzl, yBG.KWHzl(runnable));
            android.os.Message messageObtain = android.os.Message.obtain(this.KWHzl, activity);
            messageObtain.obj = this;
            this.KWHzl.sendMessageDelayed(messageObtain, java.lang.Math.max(0L, timeUnit.toMillis(j)));
            if (!this.copydefault) {
                return activity;
            }
            this.KWHzl.removeCallbacks(activity);
            return C58215yxA.EZpvd();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault = true;
            this.KWHzl.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: o.yxw$Activity */
    public static final class Activity implements java.lang.Runnable, InterfaceC58217yxC {
        public final java.lang.Runnable EZpvd;
        public final android.os.Handler OLrzqt;
        public volatile boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault;
        }

        public Activity(android.os.Handler handler, java.lang.Runnable runnable) {
            this.OLrzqt = handler;
            this.EZpvd = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.EZpvd.run();
            } catch (java.lang.Throwable th) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Fatal Exception thrown on Scheduler.", th);
                yBG.copydefault(illegalStateException);
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault = true;
            this.OLrzqt.removeCallbacks(this);
        }
    }
}
