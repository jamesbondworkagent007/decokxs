package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class yAX implements Callable<java.lang.Void>, InterfaceC58217yxC {
    public static final FutureTask<java.lang.Void> OLrzqt = new FutureTask<>(Functions.AYXKKw, null);
    public final ExecutorService AEQbTJ;
    public final java.lang.Runnable AYXKKw;
    public java.lang.Thread EZpvd;
    public final AtomicReference<Future<?>> copydefault = new AtomicReference<>();
    public final AtomicReference<Future<?>> KWHzl = new AtomicReference<>();

    public yAX(java.lang.Runnable runnable, ExecutorService executorService) {
        this.AYXKKw = runnable;
        this.AEQbTJ = executorService;
    }

    /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Void call() throws java.lang.Exception {
        this.EZpvd = java.lang.Thread.currentThread();
        try {
            this.AYXKKw.run();
            EZpvd(this.AEQbTJ.submit(this));
            this.EZpvd = null;
        } catch (java.lang.Throwable th) {
            this.EZpvd = null;
            yBG.copydefault(th);
        }
        return null;
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.copydefault;
        FutureTask<java.lang.Void> futureTask = OLrzqt;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.EZpvd != java.lang.Thread.currentThread());
        }
        Future<?> andSet2 = this.KWHzl.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.EZpvd != java.lang.Thread.currentThread());
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.copydefault.get() == OLrzqt;
    }

    public void copydefault(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.copydefault.get();
            if (future2 == OLrzqt) {
                future.cancel(this.EZpvd != java.lang.Thread.currentThread());
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.copydefault, future2, future));
    }

    public void EZpvd(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.KWHzl.get();
            if (future2 == OLrzqt) {
                future.cancel(this.EZpvd != java.lang.Thread.currentThread());
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.KWHzl, future2, future));
    }
}
