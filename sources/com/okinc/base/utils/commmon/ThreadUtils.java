package com.okinc.base.utils.commmon;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.C54807xWa;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class ThreadUtils {
    public static Executor valueOf;
    public static final Handler copydefault = new Handler(Looper.getMainLooper());
    public static final Map<Integer, Map<Integer, ExecutorService>> EZpvd = new HashMap();
    public static final Map<StateListAnimator, ExecutorService> AEQbTJ = new ConcurrentHashMap();
    public static final int KWHzl = Runtime.getRuntime().availableProcessors();
    public static final Timer OLrzqt = new Timer();

    public static boolean valueOf() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void copydefault(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            copydefault.post(runnable);
        }
    }

    public static void AEQbTJ(Runnable runnable, long j) {
        copydefault.postDelayed(runnable, j);
    }

    public static ExecutorService gEmmrt() {
        return AEQbTJ(-1);
    }

    public static ExecutorService copydefault() {
        return AEQbTJ(-2);
    }

    public static ExecutorService djBIcL() {
        return AEQbTJ(-4);
    }

    public static ExecutorService OLrzqt() {
        return AEQbTJ(-8);
    }

    public static <T> void KWHzl(StateListAnimator<T> stateListAnimator) {
        copydefault(AEQbTJ(-4), stateListAnimator);
    }

    public static <T> void copydefault(ExecutorService executorService, StateListAnimator<T> stateListAnimator) {
        EZpvd(executorService, stateListAnimator, 0L, 0L, null);
    }

    public static <T> void EZpvd(final ExecutorService executorService, final StateListAnimator<T> stateListAnimator, long j, long j2, TimeUnit timeUnit) {
        Map<StateListAnimator, ExecutorService> map = AEQbTJ;
        synchronized (map) {
            if (map.get(stateListAnimator) != null) {
                pUU.copydefault("ThreadUtils", "Task can only be executed once.");
                return;
            }
            map.put(stateListAnimator, executorService);
            if (j2 != 0) {
                stateListAnimator.OLrzqt(true);
                OLrzqt.schedule(new TimerTask() { // from class: com.okinc.base.utils.commmon.ThreadUtils.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        executorService.execute(stateListAnimator);
                    }
                }, timeUnit.toMillis(j), timeUnit.toMillis(j2));
            } else if (j == 0) {
                executorService.execute(stateListAnimator);
            } else {
                OLrzqt.schedule(new TimerTask() { // from class: com.okinc.base.utils.commmon.ThreadUtils.4
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        executorService.execute(stateListAnimator);
                    }
                }, timeUnit.toMillis(j));
            }
        }
    }

    public static ExecutorService AEQbTJ(int i) {
        return EZpvd(i, 5);
    }

    public static ExecutorService EZpvd(int i, int i2) {
        ExecutorService executorServiceKWHzl;
        Map<Integer, Map<Integer, ExecutorService>> map = EZpvd;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceKWHzl = Activity.KWHzl(i, i2);
                concurrentHashMap.put(Integer.valueOf(i2), executorServiceKWHzl);
                map.put(Integer.valueOf(i), concurrentHashMap);
            } else {
                executorServiceKWHzl = map2.get(Integer.valueOf(i2));
                if (executorServiceKWHzl == null) {
                    executorServiceKWHzl = Activity.KWHzl(i, i2);
                    map2.put(Integer.valueOf(i2), executorServiceKWHzl);
                }
            }
        }
        return executorServiceKWHzl;
    }

    public static final class Activity extends ThreadPoolExecutor {
        public LinkedBlockingQueue4Util AEQbTJ;
        public final AtomicInteger KWHzl;

        public static ExecutorService KWHzl(int i, int i2) {
            if (i == -8) {
                if (C54807xWa.AEQbTJ()) {
                    pUU.KWHzl("Monitor.Device", "ThreadUtils use low Thread Pool");
                    return new Activity(2, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu-lowend", i2));
                }
                return new Activity(ThreadUtils.KWHzl, ThreadUtils.KWHzl, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i2));
            }
            if (i == -4) {
                if (C54807xWa.AEQbTJ()) {
                    pUU.KWHzl("Monitor.Device", "ThreadUtils use low Thread Pool");
                    return new Activity(2, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io-lowend", i2));
                }
                return new Activity((ThreadUtils.KWHzl * 2) + 1, (ThreadUtils.KWHzl * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i2));
            }
            if (i == -2) {
                if (C54807xWa.AEQbTJ()) {
                    pUU.KWHzl("Monitor.Device", "ThreadUtils use low Thread Pool");
                    return new Activity(0, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached-lowend", i2));
                }
                return new Activity(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i2));
            }
            if (i == -1) {
                return new Activity(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i2));
            }
            return new Activity(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i + ")", i2));
        }

        public Activity(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.KWHzl = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.AEQbTJ = linkedBlockingQueue4Util;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.KWHzl.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.KWHzl.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                pUU.copydefault("ThreadUtils", "This will not happen!");
                this.AEQbTJ.offer(runnable);
            } catch (Throwable unused2) {
                this.KWHzl.decrementAndGet();
            }
        }
    }

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile Activity mPool;

        public LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        public LinkedBlockingQueue4Util(boolean z) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueue4Util(int i) {
            this.mCapacity = i;
        }

        /* JADX DEBUG: Method merged with bridge method: offer(Ljava/lang/Object;)Z */
        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@NonNull Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public UtilsThreadFactory(String str, int i) {
            this(str, i, false);
        }

        public UtilsThreadFactory(String str, int i, boolean z) {
            this.namePrefix = str + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
            this.priority = i;
            this.isDaemon = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, this.namePrefix + getAndIncrement()) { // from class: com.okinc.base.utils.commmon.ThreadUtils.UtilsThreadFactory.4
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        pUU.AEQbTJ("ThreadUtils", "Request threw uncaught throwable", th);
                    }
                }
            };
            thread.setDaemon(this.isDaemon);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.okinc.base.utils.commmon.ThreadUtils.UtilsThreadFactory.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    System.out.println(th);
                }
            });
            thread.setPriority(this.priority);
            return thread;
        }
    }

    public static abstract class TaskDescription<T> extends StateListAnimator<T> {
        @Override // com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator
        public void KWHzl(Throwable th) {
            pUU.AEQbTJ("ThreadUtils", "onFail: ", th);
        }
    }

    public static abstract class StateListAnimator<T> implements Runnable {
        public volatile boolean AEQbTJ;
        public final AtomicInteger AYXKKw = new AtomicInteger(0);
        public Timer EZpvd;
        public InterfaceC0243StateListAnimator KWHzl;
        public long OLrzqt;
        public Executor copydefault;
        public volatile Thread valueOf;

        /* JADX INFO: renamed from: com.okinc.base.utils.commmon.ThreadUtils$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public interface InterfaceC0243StateListAnimator {
            void EZpvd();
        }

        public abstract T EZpvd() throws Throwable;

        public abstract void KWHzl(T t);

        public abstract void KWHzl(Throwable th);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.AEQbTJ = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.AEQbTJ) {
                if (this.valueOf == null) {
                    if (!this.AYXKKw.compareAndSet(0, 1)) {
                        return;
                    }
                    this.valueOf = Thread.currentThread();
                    if (this.KWHzl != null) {
                        pUU.valueOf("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.AYXKKw.get() != 1) {
                    return;
                }
            } else {
                if (!this.AYXKKw.compareAndSet(0, 1)) {
                    return;
                }
                this.valueOf = Thread.currentThread();
                if (this.KWHzl != null) {
                    Timer timer = new Timer();
                    this.EZpvd = timer;
                    timer.schedule(new TimerTask() { // from class: com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator.3
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            if (StateListAnimator.this.KWHzl() || StateListAnimator.this.KWHzl == null) {
                                return;
                            }
                            StateListAnimator.this.gEmmrt();
                            StateListAnimator.this.KWHzl.EZpvd();
                            StateListAnimator.this.copydefault();
                        }
                    }, this.OLrzqt);
                }
            }
            try {
                final T tEZpvd = EZpvd();
                if (this.AEQbTJ) {
                    if (this.AYXKKw.get() != 1) {
                        return;
                    }
                    AEQbTJ().execute(new Runnable() { // from class: com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator.5
                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.base.utils.commmon.ThreadUtils$StateListAnimator */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            StateListAnimator.this.KWHzl(tEZpvd);
                        }
                    });
                } else if (this.AYXKKw.compareAndSet(1, 3)) {
                    AEQbTJ().execute(new Runnable() { // from class: com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator.4
                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.base.utils.commmon.ThreadUtils$StateListAnimator */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            StateListAnimator.this.KWHzl(tEZpvd);
                            StateListAnimator.this.copydefault();
                        }
                    });
                }
            } catch (InterruptedException unused) {
                this.AYXKKw.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (this.AYXKKw.compareAndSet(1, 2)) {
                    AEQbTJ().execute(new Runnable() { // from class: com.okinc.base.utils.commmon.ThreadUtils.StateListAnimator.2
                        @Override // java.lang.Runnable
                        public void run() {
                            StateListAnimator.this.KWHzl(th);
                            StateListAnimator.this.copydefault();
                        }
                    });
                }
            }
        }

        public final void gEmmrt() {
            synchronized (this.AYXKKw) {
                if (this.AYXKKw.get() > 1) {
                    return;
                }
                this.AYXKKw.set(6);
                if (this.valueOf != null) {
                    this.valueOf.interrupt();
                }
            }
        }

        public boolean KWHzl() {
            return this.AYXKKw.get() > 1;
        }

        public final Executor AEQbTJ() {
            Executor executor = this.copydefault;
            return executor == null ? ThreadUtils.AYXKKw() : executor;
        }

        public void copydefault() {
            ThreadUtils.AEQbTJ.remove(this);
            Timer timer = this.EZpvd;
            if (timer != null) {
                timer.cancel();
                this.EZpvd = null;
                this.KWHzl = null;
            }
        }
    }

    public static Executor AYXKKw() {
        if (valueOf == null) {
            valueOf = new Application();
        }
        return valueOf;
    }

    public static class Application implements Executor {
        private Application() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            ThreadUtils.copydefault(runnable);
        }
    }
}
