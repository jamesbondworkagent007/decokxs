package o;

import com.onesignal.OneSignal;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.ypa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57817ypa {
    public ExecutorService EZpvd;
    public final InterfaceC57738yoA KWHzl;
    public final Queue<java.lang.Runnable> AEQbTJ = new LinkedBlockingQueue();
    public final AtomicLong OLrzqt = new AtomicLong();

    public C57817ypa(InterfaceC57738yoA interfaceC57738yoA) {
        this.KWHzl = interfaceC57738yoA;
    }

    public boolean OLrzqt() {
        if (java.lang.Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        if (OneSignal.iZzfmt() && this.EZpvd == null) {
            return false;
        }
        if (OneSignal.iZzfmt() || this.EZpvd != null) {
            return !this.EZpvd.isShutdown();
        }
        return true;
    }

    public void KWHzl(java.lang.Runnable runnable) {
        OLrzqt(new Application(this, runnable));
    }

    public final void OLrzqt(Application application) {
        synchronized (this.AEQbTJ) {
            application.copydefault = this.OLrzqt.incrementAndGet();
            ExecutorService executorService = this.EZpvd;
            if (executorService == null) {
                this.KWHzl.OLrzqt("Adding a task to the pending queue with ID: " + application.copydefault);
                this.AEQbTJ.add(application);
            } else {
                if (!executorService.isShutdown()) {
                    this.KWHzl.OLrzqt("Executor is still running, add to the executor with ID: " + application.copydefault);
                    try {
                        this.EZpvd.submit(application);
                    } catch (RejectedExecutionException e) {
                        this.KWHzl.copydefault("Executor is shutdown, running task manually with ID: " + application.copydefault);
                        application.run();
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void copydefault() {
        synchronized (this.AEQbTJ) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "startPendingTasks with task queue quantity: " + this.AEQbTJ.size());
            if (!this.AEQbTJ.isEmpty()) {
                this.EZpvd = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.ypa.2
                    @Override // java.util.concurrent.ThreadFactory
                    public java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable runnable) {
                        java.lang.Thread thread = new java.lang.Thread(runnable);
                        thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
                        return thread;
                    }
                });
                while (!this.AEQbTJ.isEmpty()) {
                    this.EZpvd.submit(this.AEQbTJ.poll());
                }
            }
        }
    }

    public final void copydefault(long j) {
        if (this.OLrzqt.get() == j) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Last Pending Task has ran, shutting down");
            this.EZpvd.shutdown();
        }
    }

    /* JADX INFO: renamed from: o.ypa$Application */
    public static class Application implements java.lang.Runnable {
        public java.lang.Runnable AEQbTJ;
        public C57817ypa EZpvd;
        public long copydefault;

        public Application(C57817ypa c57817ypa, java.lang.Runnable runnable) {
            this.EZpvd = c57817ypa;
            this.AEQbTJ = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.AEQbTJ.run();
            this.EZpvd.copydefault(this.copydefault);
        }

        public java.lang.String toString() {
            return "PendingTaskRunnable{innerTask=" + this.AEQbTJ + ", taskId=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
