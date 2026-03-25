package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: renamed from: o.yxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58253yxm {
    static boolean IS_DRIFT_USE_NANOTIME = java.lang.Boolean.getBoolean("rx2.scheduler.use-nanotime");
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = java.util.concurrent.TimeUnit.MINUTES.toNanos(java.lang.Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long clockDriftTolerance() {
        return CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
    }

    public abstract StateListAnimator createWorker();

    public void shutdown() {
    }

    public void start() {
    }

    public static long computeNow(java.util.concurrent.TimeUnit timeUnit) {
        if (!IS_DRIFT_USE_NANOTIME) {
            return timeUnit.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public long now(java.util.concurrent.TimeUnit timeUnit) {
        return computeNow(timeUnit);
    }

    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable) {
        return scheduleDirect(runnable, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        StateListAnimator stateListAnimatorCreateWorker = createWorker();
        Activity activity = new Activity(yBG.KWHzl(runnable), stateListAnimatorCreateWorker);
        stateListAnimatorCreateWorker.schedule(activity, j, timeUnit);
        return activity;
    }

    public InterfaceC58217yxC schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        StateListAnimator stateListAnimatorCreateWorker = createWorker();
        ActionBar actionBar = new ActionBar(yBG.KWHzl(runnable), stateListAnimatorCreateWorker);
        InterfaceC58217yxC interfaceC58217yxCSchedulePeriodically = stateListAnimatorCreateWorker.schedulePeriodically(actionBar, j, j2, timeUnit);
        return interfaceC58217yxCSchedulePeriodically == EmptyDisposable.INSTANCE ? interfaceC58217yxCSchedulePeriodically : actionBar;
    }

    public <S extends AbstractC58253yxm & InterfaceC58217yxC> S when(InterfaceC58229yxO<AbstractC58185ywX<AbstractC58185ywX<AbstractC58177ywP>>, AbstractC58177ywP> interfaceC58229yxO) {
        return new SchedulerWhen(interfaceC58229yxO, this);
    }

    /* JADX INFO: renamed from: o.yxm$StateListAnimator */
    public static abstract class StateListAnimator implements InterfaceC58217yxC {
        public abstract InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit);

        public InterfaceC58217yxC schedule(java.lang.Runnable runnable) {
            return schedule(runnable, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public InterfaceC58217yxC schedulePeriodically(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            java.lang.Runnable runnableKWHzl = yBG.KWHzl(runnable);
            long nanos = timeUnit.toNanos(j2);
            long jNow = now(java.util.concurrent.TimeUnit.NANOSECONDS);
            InterfaceC58217yxC interfaceC58217yxCSchedule = schedule(new ActionBar(jNow + timeUnit.toNanos(j), runnableKWHzl, jNow, sequentialDisposable2, nanos), j, timeUnit);
            if (interfaceC58217yxCSchedule == EmptyDisposable.INSTANCE) {
                return interfaceC58217yxCSchedule;
            }
            sequentialDisposable.replace(interfaceC58217yxCSchedule);
            return sequentialDisposable2;
        }

        public long now(java.util.concurrent.TimeUnit timeUnit) {
            return AbstractC58253yxm.computeNow(timeUnit);
        }

        /* JADX INFO: renamed from: o.yxm$StateListAnimator$ActionBar */
        public final class ActionBar implements java.lang.Runnable {
            public final long AEQbTJ;
            public long AYXKKw;
            public final SequentialDisposable EZpvd;
            public long KWHzl;
            public final java.lang.Runnable OLrzqt;
            public long copydefault;

            public ActionBar(long j, java.lang.Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.OLrzqt = runnable;
                this.EZpvd = sequentialDisposable;
                this.AEQbTJ = j3;
                this.copydefault = j2;
                this.AYXKKw = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                long j;
                this.OLrzqt.run();
                if (this.EZpvd.isDisposed()) {
                    return;
                }
                StateListAnimator stateListAnimator = StateListAnimator.this;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                long jNow = stateListAnimator.now(timeUnit);
                long j2 = AbstractC58253yxm.CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
                long j3 = this.copydefault;
                if (jNow + j2 >= j3) {
                    long j4 = this.AEQbTJ;
                    if (jNow >= j3 + j4 + j2) {
                        long j5 = this.AEQbTJ;
                        long j6 = jNow + j5;
                        long j7 = this.KWHzl + 1;
                        this.KWHzl = j7;
                        this.AYXKKw = j6 - (j5 * j7);
                        j = j6;
                    } else {
                        long j8 = this.AYXKKw;
                        long j9 = this.KWHzl + 1;
                        this.KWHzl = j9;
                        j = j8 + (j9 * j4);
                    }
                }
                this.copydefault = jNow;
                this.EZpvd.replace(StateListAnimator.this.schedule(this, j - jNow, timeUnit));
            }
        }
    }

    /* JADX INFO: renamed from: o.yxm$ActionBar */
    public static final class ActionBar implements InterfaceC58217yxC, java.lang.Runnable {
        public final StateListAnimator AEQbTJ;
        public volatile boolean OLrzqt;
        public final java.lang.Runnable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt;
        }

        public ActionBar(java.lang.Runnable runnable, StateListAnimator stateListAnimator) {
            this.copydefault = runnable;
            this.AEQbTJ = stateListAnimator;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.OLrzqt) {
                return;
            }
            try {
                this.copydefault.run();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.AEQbTJ.dispose();
                throw ExceptionHelper.AEQbTJ(th);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.OLrzqt = true;
            this.AEQbTJ.dispose();
        }
    }

    /* JADX INFO: renamed from: o.yxm$Activity */
    public static final class Activity implements InterfaceC58217yxC, java.lang.Runnable {
        public java.lang.Thread AEQbTJ;
        public final StateListAnimator EZpvd;
        public final java.lang.Runnable copydefault;

        public Activity(java.lang.Runnable runnable, StateListAnimator stateListAnimator) {
            this.copydefault = runnable;
            this.EZpvd = stateListAnimator;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.AEQbTJ = java.lang.Thread.currentThread();
            try {
                this.copydefault.run();
            } finally {
                dispose();
                this.AEQbTJ = null;
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.AEQbTJ == java.lang.Thread.currentThread()) {
                StateListAnimator stateListAnimator = this.EZpvd;
                if (stateListAnimator instanceof yAT) {
                    ((yAT) stateListAnimator).copydefault();
                    return;
                }
            }
            this.EZpvd.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd.isDisposed();
        }
    }
}
