package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class FutureC5301Ml<T> implements Future<T> {
    public final Function1<T, Unit> AEQbTJ;
    public final Call EZpvd;
    public volatile java.lang.Throwable KWHzl;
    public final java.lang.Object OLrzqt;
    public volatile boolean copydefault;
    public volatile T djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FutureC5301Ml() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FutureC5301Ml(Call call, Function1<? super T, Unit> function1) {
        this.EZpvd = call;
        this.AEQbTJ = function1;
        this.OLrzqt = new java.lang.Object();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:okhttp3.Call:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null okhttp3.Call) : (r2v0 okhttp3.Call))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(okhttp3.Call, kotlin.jvm.functions.Function1<? super T, kotlin.Unit>):void (m)] (LINE:10) call: o.Ml.<init>(okhttp3.Call, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ FutureC5301Ml(Call call, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : call, (i & 2) != 0 ? null : function1);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Call call = this.EZpvd;
        if (call == null) {
            return true;
        }
        call.cancel();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Call call = this.EZpvd;
        if (call != null) {
            return call.isCanceled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, java.lang.InterruptedException {
        synchronized (this.OLrzqt) {
            while (!this.copydefault) {
                this.OLrzqt.wait();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (this.KWHzl != null) {
            throw new ExecutionException(this.KWHzl);
        }
        T t = this.djBIcL;
        if (t != null) {
            return t;
        }
        throw new ExecutionException(new java.lang.NullPointerException("Future value must not be null"));
    }

    @Override // java.util.concurrent.Future
    public T get(long j, @NotNull java.util.concurrent.TimeUnit timeUnit) throws ExecutionException, java.lang.InterruptedException, TimeoutException {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        long nanos = timeUnit.toNanos(j);
        long jNanoTime = java.lang.System.nanoTime();
        synchronized (this.OLrzqt) {
            for (long jNanoTime2 = nanos; !this.copydefault && jNanoTime2 > 0; jNanoTime2 = (jNanoTime + nanos) - java.lang.System.nanoTime()) {
                java.util.concurrent.TimeUnit.NANOSECONDS.timedWait(this.OLrzqt, jNanoTime2);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!this.copydefault) {
            throw new TimeoutException();
        }
        if (this.KWHzl != null) {
            throw new ExecutionException(this.KWHzl);
        }
        T t = this.djBIcL;
        if (t != null) {
            return t;
        }
        throw new ExecutionException(new java.lang.NullPointerException("Future value must not be null"));
    }

    public final void copydefault(T t) {
        synchronized (this) {
            if (!this.copydefault) {
                this.djBIcL = t;
                synchronized (this.OLrzqt) {
                    this.copydefault = true;
                    Function1<T, Unit> function1 = this.AEQbTJ;
                    if (function1 != null) {
                        function1.invoke(t);
                    }
                    this.OLrzqt.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public final void OLrzqt(@NotNull java.lang.Throwable th) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(th, "");
            if (!this.copydefault) {
                this.KWHzl = th;
                synchronized (this.OLrzqt) {
                    this.copydefault = true;
                    this.OLrzqt.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }
}
