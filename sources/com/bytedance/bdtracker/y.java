package com.bytedance.bdtracker;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f301a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final BlockingQueue<Runnable> f;
    public static final b g;
    public static final RejectedExecutionHandler h;

    public static final class a implements RejectedExecutionHandler {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    }

    public static class b implements ThreadFactory {
        public static final AtomicInteger d = new AtomicInteger(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadGroup f302a;
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f302a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.c = str + "-" + d.getAndIncrement() + "-Thread-";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f302a, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        b = iAvailableProcessors;
        if (iAvailableProcessors <= 0) {
            iAvailableProcessors = 1;
        }
        c = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 6));
        int i = iMax * 2;
        d = i;
        int i2 = (iMax * 4) + 1;
        e = i2;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f = linkedBlockingQueue;
        b bVar = new b("TTDefaultExecutors");
        g = bVar;
        a aVar = new a();
        h = aVar;
        z zVar = new z(i, i2, 30L, TimeUnit.SECONDS, linkedBlockingQueue, bVar, aVar);
        f301a = zVar;
        zVar.allowCoreThreadTimeOut(true);
    }
}
