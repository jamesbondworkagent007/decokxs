package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import o.AbstractC58253yxm;

/* JADX INFO: loaded from: classes13.dex */
public class yAT extends AbstractC58253yxm.StateListAnimator {
    public final ScheduledExecutorService KWHzl;
    public volatile boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.OLrzqt;
    }

    public yAT(ThreadFactory threadFactory) {
        this.KWHzl = yAZ.copydefault(threadFactory);
    }

    @Override // o.AbstractC58253yxm.StateListAnimator
    public InterfaceC58217yxC schedule(java.lang.Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @Override // o.AbstractC58253yxm.StateListAnimator
    public InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (this.OLrzqt) {
            return EmptyDisposable.INSTANCE;
        }
        return OLrzqt(runnable, j, timeUnit, null);
    }

    public InterfaceC58217yxC EZpvd(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        Future<?> futureSchedule;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(yBG.KWHzl(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.KWHzl.submit(scheduledDirectTask);
            } else {
                futureSchedule = this.KWHzl.schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(futureSchedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            yBG.copydefault(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public InterfaceC58217yxC copydefault(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        Future<?> futureSchedule;
        java.lang.Runnable runnableKWHzl = yBG.KWHzl(runnable);
        if (j2 <= 0) {
            yAX yax = new yAX(runnableKWHzl, this.KWHzl);
            try {
                if (j <= 0) {
                    futureSchedule = this.KWHzl.submit(yax);
                } else {
                    futureSchedule = this.KWHzl.schedule(yax, j, timeUnit);
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
            scheduledDirectPeriodicTask.setFuture(this.KWHzl.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            yBG.copydefault(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public ScheduledRunnable OLrzqt(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, InterfaceC58238yxX interfaceC58238yxX) {
        Future<?> futureSchedule;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(yBG.KWHzl(runnable), interfaceC58238yxX);
        if (interfaceC58238yxX != null && !interfaceC58238yxX.AEQbTJ(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            if (j <= 0) {
                futureSchedule = this.KWHzl.submit((Callable) scheduledRunnable);
            } else {
                futureSchedule = this.KWHzl.schedule((Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(futureSchedule);
        } catch (RejectedExecutionException e) {
            if (interfaceC58238yxX != null) {
                interfaceC58238yxX.EZpvd(scheduledRunnable);
            }
            yBG.copydefault(e);
        }
        return scheduledRunnable;
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.KWHzl.shutdownNow();
    }

    public void copydefault() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.KWHzl.shutdown();
    }
}
