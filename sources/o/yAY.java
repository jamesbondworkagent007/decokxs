package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC58253yxm;

/* JADX INFO: loaded from: classes13.dex */
public final class yAY extends AbstractC58253yxm {
    public static final ScheduledExecutorService EZpvd;
    public static final RxThreadFactory copydefault;
    public final ThreadFactory KWHzl;
    public final AtomicReference<ScheduledExecutorService> OLrzqt;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        EZpvd = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        copydefault = new RxThreadFactory("RxSingleScheduler", java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public yAY() {
        this(copydefault);
    }

    public yAY(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.OLrzqt = atomicReference;
        this.KWHzl = threadFactory;
        atomicReference.lazySet(KWHzl(threadFactory));
    }

    public static ScheduledExecutorService KWHzl(ThreadFactory threadFactory) {
        return yAZ.copydefault(threadFactory);
    }

    @Override // o.AbstractC58253yxm
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceKWHzl = null;
        do {
            scheduledExecutorService = this.OLrzqt.get();
            if (scheduledExecutorService != EZpvd) {
                if (scheduledExecutorServiceKWHzl != null) {
                    scheduledExecutorServiceKWHzl.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceKWHzl == null) {
                scheduledExecutorServiceKWHzl = KWHzl(this.KWHzl);
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.OLrzqt, scheduledExecutorService, scheduledExecutorServiceKWHzl));
    }

    @Override // o.AbstractC58253yxm
    public void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.OLrzqt.get();
        ScheduledExecutorService scheduledExecutorService2 = EZpvd;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.OLrzqt.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // o.AbstractC58253yxm
    public AbstractC58253yxm.StateListAnimator createWorker() {
        return new Application(this.OLrzqt.get());
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        Future<?> futureSchedule;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(yBG.KWHzl(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.OLrzqt.get().submit(scheduledDirectTask);
            } else {
                futureSchedule = this.OLrzqt.get().schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(futureSchedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            yBG.copydefault(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        Future<?> futureSchedule;
        java.lang.Runnable runnableKWHzl = yBG.KWHzl(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.OLrzqt.get();
            yAX yax = new yAX(runnableKWHzl, scheduledExecutorService);
            try {
                if (j <= 0) {
                    futureSchedule = scheduledExecutorService.submit(yax);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(yax, j, timeUnit);
                }
                yax.copydefault(futureSchedule);
                return yax;
            } catch (RejectedExecutionException e) {
                yBG.copydefault(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableKWHzl);
        try {
            scheduledDirectPeriodicTask.setFuture(this.OLrzqt.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            yBG.copydefault(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public static final class Application extends AbstractC58253yxm.StateListAnimator {
        public final C58216yxB EZpvd = new C58216yxB();
        public final ScheduledExecutorService KWHzl;
        public volatile boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt;
        }

        public Application(ScheduledExecutorService scheduledExecutorService) {
            this.KWHzl = scheduledExecutorService;
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            Future<?> futureSchedule;
            if (this.OLrzqt) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(yBG.KWHzl(runnable), this.EZpvd);
            this.EZpvd.AEQbTJ(scheduledRunnable);
            try {
                if (j <= 0) {
                    futureSchedule = this.KWHzl.submit((Callable) scheduledRunnable);
                } else {
                    futureSchedule = this.KWHzl.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.setFuture(futureSchedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                yBG.copydefault(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.OLrzqt) {
                return;
            }
            this.OLrzqt = true;
            this.EZpvd.dispose();
        }
    }
}
