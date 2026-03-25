package o;

import android.os.StrictMode;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.Pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorServiceC5373Pf implements ExecutorService {
    public static volatile int AEQbTJ;
    public static final long OLrzqt = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);
    public final ExecutorService copydefault;

    public static TaskDescription OLrzqt() {
        return new TaskDescription(true).AEQbTJ(1).copydefault("disk-cache");
    }

    public static ExecutorServiceC5373Pf AYXKKw() {
        return OLrzqt().KWHzl();
    }

    public static TaskDescription gEmmrt() {
        return new TaskDescription(false).AEQbTJ(AEQbTJ()).copydefault("source");
    }

    public static ExecutorServiceC5373Pf valueOf() {
        return gEmmrt().KWHzl();
    }

    public static ExecutorServiceC5373Pf AhwBna() {
        return new ExecutorServiceC5373Pf(new ThreadPoolExecutor(0, Integer.MAX_VALUE, OLrzqt, java.util.concurrent.TimeUnit.MILLISECONDS, new SynchronousQueue(), new ActionBar(new StateListAnimator(), "source-unlimited", Activity.AEQbTJ, false)));
    }

    public static TaskDescription EZpvd() {
        return new TaskDescription(true).AEQbTJ(KWHzl()).copydefault("animation");
    }

    public static int KWHzl() {
        return AEQbTJ() >= 4 ? 2 : 1;
    }

    public static ExecutorServiceC5373Pf copydefault() {
        return EZpvd().KWHzl();
    }

    public ExecutorServiceC5373Pf(ExecutorService executorService) {
        this.copydefault = executorService;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable runnable) {
        this.copydefault.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(@androidx.annotation.NonNull java.lang.Runnable runnable) {
        return this.copydefault.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<Future<T>> invokeAll(@androidx.annotation.NonNull java.util.Collection<? extends Callable<T>> collection) throws java.lang.InterruptedException {
        return this.copydefault.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<Future<T>> invokeAll(@androidx.annotation.NonNull java.util.Collection<? extends Callable<T>> collection, long j, @androidx.annotation.NonNull java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.copydefault.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@androidx.annotation.NonNull java.util.Collection<? extends Callable<T>> collection) throws ExecutionException, java.lang.InterruptedException {
        return (T) this.copydefault.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@androidx.annotation.NonNull java.util.Collection<? extends Callable<T>> collection, long j, @androidx.annotation.NonNull java.util.concurrent.TimeUnit timeUnit) throws ExecutionException, java.lang.InterruptedException, TimeoutException {
        return (T) this.copydefault.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@androidx.annotation.NonNull java.lang.Runnable runnable, T t) {
        return this.copydefault.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@androidx.annotation.NonNull Callable<T> callable) {
        return this.copydefault.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.copydefault.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        return this.copydefault.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.copydefault.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.copydefault.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @androidx.annotation.NonNull java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.copydefault.awaitTermination(j, timeUnit);
    }

    public java.lang.String toString() {
        return this.copydefault.toString();
    }

    public static int AEQbTJ() {
        if (AEQbTJ == 0) {
            AEQbTJ = java.lang.Math.min(4, C5371Pd.EZpvd());
        }
        return AEQbTJ;
    }

    /* JADX INFO: renamed from: o.Pf$Activity */
    public interface Activity {
        public static final Activity AEQbTJ;
        public static final Activity EZpvd;
        public static final Activity KWHzl = new Activity() { // from class: o.Pf.Activity.5
            @Override // o.ExecutorServiceC5373Pf.Activity
            public void AEQbTJ(java.lang.Throwable th) {
            }
        };
        public static final Activity copydefault;

        void AEQbTJ(java.lang.Throwable th);

        static {
            Activity activity = new Activity() { // from class: o.Pf.Activity.4
                @Override // o.ExecutorServiceC5373Pf.Activity
                public void AEQbTJ(java.lang.Throwable th) {
                }
            };
            EZpvd = activity;
            copydefault = new Activity() { // from class: o.Pf.Activity.1
                @Override // o.ExecutorServiceC5373Pf.Activity
                public void AEQbTJ(java.lang.Throwable th) {
                    if (th != null) {
                        throw new java.lang.RuntimeException("Request threw uncaught throwable", th);
                    }
                }
            };
            AEQbTJ = activity;
        }
    }

    /* JADX INFO: renamed from: o.Pf$StateListAnimator */
    public static final class StateListAnimator implements ThreadFactory {
        private StateListAnimator() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable runnable) {
            return new java.lang.Thread(runnable) { // from class: o.Pf.StateListAnimator.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    android.os.Process.setThreadPriority(9);
                    super.run();
                }
            };
        }
    }

    /* JADX INFO: renamed from: o.Pf$ActionBar */
    public static final class ActionBar implements ThreadFactory {
        public final AtomicInteger AEQbTJ = new AtomicInteger();
        public final ThreadFactory EZpvd;
        public final java.lang.String KWHzl;
        public final Activity OLrzqt;
        public final boolean copydefault;

        public ActionBar(ThreadFactory threadFactory, java.lang.String str, Activity activity, boolean z) {
            this.EZpvd = threadFactory;
            this.KWHzl = str;
            this.OLrzqt = activity;
            this.copydefault = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(@androidx.annotation.NonNull final java.lang.Runnable runnable) {
            java.lang.Thread threadNewThread = this.EZpvd.newThread(new java.lang.Runnable() { // from class: o.Pf.ActionBar.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ActionBar.this.copydefault) {
                        android.os.StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (java.lang.Throwable th) {
                        ActionBar.this.OLrzqt.AEQbTJ(th);
                    }
                }
            });
            threadNewThread.setName("glide-" + this.KWHzl + "-thread-" + this.AEQbTJ.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: o.Pf$TaskDescription */
    public static final class TaskDescription {
        public int AEQbTJ;
        public final boolean KWHzl;
        public int OLrzqt;
        public java.lang.String copydefault;
        public long djBIcL;
        public final ThreadFactory EZpvd = new StateListAnimator();
        public Activity AhwBna = Activity.AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription AEQbTJ(@androidx.annotation.IntRange(from = 1) int i) {
            this.AEQbTJ = i;
            this.OLrzqt = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription copydefault(java.lang.String str) {
            this.copydefault = str;
            return this;
        }

        public TaskDescription(boolean z) {
            this.KWHzl = z;
        }

        public ExecutorServiceC5373Pf KWHzl() {
            if (android.text.TextUtils.isEmpty(this.copydefault)) {
                throw new java.lang.IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.copydefault);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.AEQbTJ, this.OLrzqt, this.djBIcL, java.util.concurrent.TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ActionBar(this.EZpvd, this.copydefault, this.AhwBna, this.KWHzl));
            if (this.djBIcL != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC5373Pf(threadPoolExecutor);
        }
    }
}
