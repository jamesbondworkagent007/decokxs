package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC58253yxm;

/* JADX INFO: loaded from: classes13.dex */
public final class yAU extends AbstractC58253yxm {
    public static final Application AEQbTJ;
    public static boolean AYXKKw = false;
    public static final RxThreadFactory AhwBna;
    public static final Activity OLrzqt;
    public static final RxThreadFactory copydefault;
    public final ThreadFactory gEmmrt;
    public final AtomicReference<Application> valueOf;
    public static final java.util.concurrent.TimeUnit KWHzl = java.util.concurrent.TimeUnit.SECONDS;
    public static final long EZpvd = java.lang.Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        Activity activity = new Activity(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        OLrzqt = activity;
        activity.dispose();
        int iMax = java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        AhwBna = rxThreadFactory;
        copydefault = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        AYXKKw = java.lang.Boolean.getBoolean("rx2.io-scheduled-release");
        Application application = new Application(0L, null, rxThreadFactory);
        AEQbTJ = application;
        application.KWHzl();
    }

    public static final class Application implements java.lang.Runnable {
        public final long AEQbTJ;
        public final ScheduledExecutorService EZpvd;
        public final Future<?> KWHzl;
        public final ConcurrentLinkedQueue<Activity> OLrzqt;
        public final C58216yxB copydefault;
        public final ThreadFactory valueOf;

        public Application(long j, java.util.concurrent.TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.AEQbTJ = nanos;
            this.OLrzqt = new ConcurrentLinkedQueue<>();
            this.copydefault = new C58216yxB();
            this.valueOf = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, yAU.copydefault);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.EZpvd = scheduledExecutorServiceNewScheduledThreadPool;
            this.KWHzl = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public void run() {
            copydefault();
        }

        public Activity EZpvd() {
            if (this.copydefault.isDisposed()) {
                return yAU.OLrzqt;
            }
            while (!this.OLrzqt.isEmpty()) {
                Activity activityPoll = this.OLrzqt.poll();
                if (activityPoll != null) {
                    return activityPoll;
                }
            }
            Activity activity = new Activity(this.valueOf);
            this.copydefault.AEQbTJ(activity);
            return activity;
        }

        public void KWHzl(Activity activity) {
            activity.copydefault(OLrzqt() + this.AEQbTJ);
            this.OLrzqt.offer(activity);
        }

        public void copydefault() {
            if (this.OLrzqt.isEmpty()) {
                return;
            }
            long jOLrzqt = OLrzqt();
            for (Activity activity : this.OLrzqt) {
                if (activity.OLrzqt() > jOLrzqt) {
                    return;
                }
                if (this.OLrzqt.remove(activity)) {
                    this.copydefault.EZpvd(activity);
                }
            }
        }

        public long OLrzqt() {
            return java.lang.System.nanoTime();
        }

        public void KWHzl() {
            this.copydefault.dispose();
            Future<?> future = this.KWHzl;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.EZpvd;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public yAU() {
        this(AhwBna);
    }

    public yAU(ThreadFactory threadFactory) {
        this.gEmmrt = threadFactory;
        this.valueOf = new AtomicReference<>(AEQbTJ);
        start();
    }

    @Override // o.AbstractC58253yxm
    public void start() {
        Application application = new Application(EZpvd, KWHzl, this.gEmmrt);
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.valueOf, AEQbTJ, application)) {
            return;
        }
        application.KWHzl();
    }

    @Override // o.AbstractC58253yxm
    public void shutdown() {
        Application application;
        Application application2;
        do {
            application = this.valueOf.get();
            application2 = AEQbTJ;
            if (application == application2) {
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.valueOf, application, application2));
        application.KWHzl();
    }

    @Override // o.AbstractC58253yxm
    public AbstractC58253yxm.StateListAnimator createWorker() {
        return new ActionBar(this.valueOf.get());
    }

    public static final class ActionBar extends AbstractC58253yxm.StateListAnimator implements java.lang.Runnable {
        public final Activity KWHzl;
        public final Application OLrzqt;
        public final AtomicBoolean copydefault = new AtomicBoolean();
        public final C58216yxB AEQbTJ = new C58216yxB();

        public ActionBar(Application application) {
            this.OLrzqt = application;
            this.KWHzl = application.EZpvd();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.copydefault.compareAndSet(false, true)) {
                this.AEQbTJ.dispose();
                if (yAU.AYXKKw) {
                    this.KWHzl.OLrzqt(this, 0L, java.util.concurrent.TimeUnit.NANOSECONDS, null);
                } else {
                    this.OLrzqt.KWHzl(this.KWHzl);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.OLrzqt.KWHzl(this.KWHzl);
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault.get();
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.AEQbTJ.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.KWHzl.OLrzqt(runnable, j, timeUnit, this.AEQbTJ);
        }
    }

    public static final class Activity extends yAT {
        public long AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(long j) {
            this.AEQbTJ = j;
        }

        public Activity(ThreadFactory threadFactory) {
            super(threadFactory);
            this.AEQbTJ = 0L;
        }
    }
}
