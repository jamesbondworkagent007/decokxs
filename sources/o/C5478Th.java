package o;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5478Th {
    public final long AEQbTJ;
    public final BlockingQueue<java.lang.Runnable> AYXKKw;
    public final int EZpvd;
    public final int KWHzl;
    public ExecutorService OLrzqt;
    public final int copydefault;
    public final ThreadFactory valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExecutorService AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.Th$ActionBar */
    public static final class ActionBar implements ThreadFactory {
        public final AtomicInteger copydefault = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(@NotNull java.lang.Runnable runnable) {
            Intrinsics.EZpvd((java.lang.Object) runnable, "");
            return new java.lang.Thread(runnable, "Anchors Thread #" + this.copydefault.getAndIncrement());
        }
    }

    public C5478Th(ExecutorService executorService) {
        int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        this.KWHzl = iAvailableProcessors;
        int iMax = java.lang.Math.max(4, java.lang.Math.min(iAvailableProcessors - 1, 8));
        this.copydefault = iMax;
        int i = (iMax * 2) + 1;
        this.EZpvd = i;
        this.AEQbTJ = 30L;
        ActionBar actionBar = new ActionBar();
        this.valueOf = actionBar;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(128);
        this.AYXKKw = priorityBlockingQueue;
        ExecutorService executorService2 = executorService;
        if (executorService == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i, 30L, java.util.concurrent.TimeUnit.SECONDS, priorityBlockingQueue, actionBar);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor;
        }
        this.OLrzqt = executorService2;
    }
}
