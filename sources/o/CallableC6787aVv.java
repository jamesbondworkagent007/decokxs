package o;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC6787aVv<T> implements Callable<T> {
    public final Callable<T> KWHzl;
    public final AbstractCallableC6746aVG<T> copydefault;

    public CallableC6787aVv(@NotNull AbstractCallableC6746aVG<T> abstractCallableC6746aVG, @NotNull Callable<T> callable) {
        Intrinsics.checkNotNullParameter(abstractCallableC6746aVG, "");
        Intrinsics.checkNotNullParameter(callable, "");
        this.copydefault = abstractCallableC6746aVG;
        this.KWHzl = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
        long jNanoTime = java.lang.System.nanoTime();
        long jMax = java.lang.Math.max(0L, java.lang.System.currentTimeMillis() - this.copydefault.AEQbTJ());
        java.lang.String name = java.lang.Thread.currentThread().getName();
        try {
            T tCall = this.KWHzl.call();
            long jNanoTime2 = (java.lang.System.nanoTime() - jNanoTime) / ((long) 1000000);
            pUU.KWHzl("Monitor.TPM", this.copydefault.OLrzqt() + " completed: exec=" + jNanoTime2 + "ms wait=" + jMax + "ms thread=" + name);
            return tCall;
        } catch (java.lang.Exception e) {
            long jNanoTime3 = java.lang.System.nanoTime() - jNanoTime;
            pUU.valueOf("Monitor.TPM", this.copydefault.OLrzqt() + " failed: exec=" + (jNanoTime3 / ((long) 1000000)) + "ms thread=" + name + " error=" + e.getMessage());
            throw e;
        }
    }
}
