package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5067Dl implements CN {
    public final CN AEQbTJ;
    public Job KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5067Dl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public int AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CT
    public java.lang.Object AEQbTJ(@NotNull CQ cq, long j, @NotNull Continuation<? super Unit> continuation) {
        return this.AEQbTJ.AEQbTJ(cq, j, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CT
    public int AYXKKw() {
        return this.AEQbTJ.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public java.lang.Throwable EZpvd() {
        return this.AEQbTJ.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public boolean KWHzl() {
        return this.AEQbTJ.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CN, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.AEQbTJ.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) {
        return this.AEQbTJ.copydefault(cq, j, continuation);
    }

    public C5067Dl(@NotNull CN cn2) {
        Intrinsics.checkNotNullParameter(cn2, "");
        this.AEQbTJ = cn2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.CN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.CN:0x0007: INVOKE true, (0 int), (2 int), (null java.lang.Object) STATIC call: o.CW.SdkByteChannel$default(boolean, int, int, java.lang.Object):o.CN A[MD:(boolean, int, int, java.lang.Object):o.CN (m), WRAPPED] (LINE:22)) : (r2v0 o.CN))
 A[MD:(o.CN):void (m)] (LINE:21) call: o.Dl.<init>(o.CN):void type: THIS */
    public /* synthetic */ C5067Dl(CN cn2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CW.SdkByteChannel$default(true, 0, 2, null) : cn2);
    }

    public final void copydefault(@NotNull Job job) {
        Intrinsics.checkNotNullParameter(job, "");
        if (KWHzl()) {
            job.cancel(ExceptionsKt.CancellationException("channel was already closed", this.AEQbTJ.EZpvd()));
        } else {
            this.KWHzl = job;
        }
    }

    @Override // o.CS
    public boolean OLrzqt(java.lang.Throwable th) {
        Job job = this.KWHzl;
        if (job != null) {
            job.cancel(ExceptionsKt.CancellationException("channel was cancelled", th));
        }
        return this.AEQbTJ.OLrzqt(th);
    }

    @Override // o.CT
    public boolean copydefault(java.lang.Throwable th) {
        Job job;
        if (th != null && (job = this.KWHzl) != null) {
            job.cancel(ExceptionsKt.CancellationException("channel was closed with cause", th));
        }
        return this.AEQbTJ.copydefault(th);
    }
}
