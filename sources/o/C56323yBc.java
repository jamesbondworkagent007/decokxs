package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC58253yxm;

/* JADX INFO: renamed from: o.yBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56323yBc extends AbstractC58253yxm {
    public static final C56323yBc AEQbTJ = new C56323yBc();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C56323yBc AEQbTJ() {
        return AEQbTJ;
    }

    @Override // o.AbstractC58253yxm
    public AbstractC58253yxm.StateListAnimator createWorker() {
        return new Application();
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable) {
        yBG.KWHzl(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            yBG.KWHzl(runnable).run();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            yBG.copydefault(e);
        }
        return EmptyDisposable.INSTANCE;
    }

    /* JADX INFO: renamed from: o.yBc$Application */
    public static final class Application extends AbstractC58253yxm.StateListAnimator {
        public volatile boolean copydefault;
        public final PriorityBlockingQueue<Activity> KWHzl = new PriorityBlockingQueue<>();
        public final AtomicInteger AEQbTJ = new AtomicInteger();
        public final AtomicInteger OLrzqt = new AtomicInteger();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault;
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable) {
            return OLrzqt(runnable, now(java.util.concurrent.TimeUnit.MILLISECONDS));
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            long jNow = now(java.util.concurrent.TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return OLrzqt(new TaskDescription(runnable, this, jNow), jNow);
        }

        public InterfaceC58217yxC OLrzqt(java.lang.Runnable runnable, long j) {
            if (this.copydefault) {
                return EmptyDisposable.INSTANCE;
            }
            Activity activity = new Activity(runnable, java.lang.Long.valueOf(j), this.OLrzqt.incrementAndGet());
            this.KWHzl.add(activity);
            if (this.AEQbTJ.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.copydefault) {
                    Activity activityPoll = this.KWHzl.poll();
                    if (activityPoll != null) {
                        if (!activityPoll.KWHzl) {
                            activityPoll.copydefault.run();
                        }
                    } else {
                        iAddAndGet = this.AEQbTJ.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return EmptyDisposable.INSTANCE;
                        }
                    }
                }
                this.KWHzl.clear();
                return EmptyDisposable.INSTANCE;
            }
            return C58215yxA.AEQbTJ(new TaskDescription(activity));
        }

        /* JADX INFO: renamed from: o.yBc$Application$TaskDescription */
        public final class TaskDescription implements java.lang.Runnable {
            public final Activity AEQbTJ;

            public TaskDescription(Activity activity) {
                this.AEQbTJ = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.AEQbTJ.KWHzl = true;
                Application.this.KWHzl.remove(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.yBc$Activity */
    public static final class Activity implements java.lang.Comparable<Activity> {
        public final int AEQbTJ;
        public final long EZpvd;
        public volatile boolean KWHzl;
        public final java.lang.Runnable copydefault;

        public Activity(java.lang.Runnable runnable, java.lang.Long l, int i) {
            this.copydefault = runnable;
            this.EZpvd = l.longValue();
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public int compareTo(Activity activity) {
            int iAEQbTJ = C58297yyd.AEQbTJ(this.EZpvd, activity.EZpvd);
            return iAEQbTJ == 0 ? C58297yyd.copydefault(this.AEQbTJ, activity.AEQbTJ) : iAEQbTJ;
        }
    }

    /* JADX INFO: renamed from: o.yBc$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public final java.lang.Runnable AEQbTJ;
        public final long OLrzqt;
        public final Application copydefault;

        public TaskDescription(java.lang.Runnable runnable, Application application, long j) {
            this.AEQbTJ = runnable;
            this.copydefault = application;
            this.OLrzqt = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.copydefault.copydefault) {
                return;
            }
            long jNow = this.copydefault.now(java.util.concurrent.TimeUnit.MILLISECONDS);
            long j = this.OLrzqt;
            if (j > jNow) {
                try {
                    java.lang.Thread.sleep(j - jNow);
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    yBG.copydefault(e);
                    return;
                }
            }
            if (this.copydefault.copydefault) {
                return;
            }
            this.AEQbTJ.run();
        }
    }
}
