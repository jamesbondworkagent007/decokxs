package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C58013ytK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yrW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57919yrW {
    public final int AEQbTJ;
    public final Function2<java.lang.String, java.lang.Long, Unit> EZpvd;
    public final yHO<java.lang.String, java.lang.String, java.lang.Long, Unit> KWHzl;
    public final java.util.concurrent.Executor OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57919yrW() {
        this(null, 0, 0L, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yrW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57919yrW copy$default(C57919yrW c57919yrW, java.util.concurrent.Executor executor, int i, long j, Function2 function2, yHO yho, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            executor = c57919yrW.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = c57919yrW.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = c57919yrW.copydefault;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            function2 = c57919yrW.EZpvd;
        }
        Function2 function22 = function2;
        if ((i2 & 16) != 0) {
            yho = c57919yrW.KWHzl;
        }
        return c57919yrW.AEQbTJ(executor, i3, j2, function22, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<java.lang.String, java.lang.String, java.lang.Long, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57919yrW AEQbTJ(java.util.concurrent.Executor executor, int i, long j, @NotNull Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, Unit> yho) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        return new C57919yrW(executor, i, j, function2, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.String, java.lang.Long, Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.concurrent.Executor copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57919yrW)) {
            return false;
        }
        C57919yrW c57919yrW = (C57919yrW) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c57919yrW.OLrzqt) && this.AEQbTJ == c57919yrW.AEQbTJ && this.copydefault == c57919yrW.copydefault && Intrinsics.EZpvd(this.EZpvd, c57919yrW.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c57919yrW.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.concurrent.Executor executor = this.OLrzqt;
        return ((((((((executor == null ? 0 : executor.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LifecycleThreadConfig(externalExecutor=" + this.OLrzqt + ", maxPoolSize=" + this.AEQbTJ + ", keepAliveSeconds=" + this.copydefault + ", onHeavyTaskDetected=" + this.EZpvd + ", onWorkerBlocked=" + this.KWHzl + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57919yrW(java.util.concurrent.Executor executor, int i, long j, @NotNull Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, Unit> yho) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.OLrzqt = executor;
        this.AEQbTJ = i;
        this.copydefault = j;
        this.EZpvd = function2;
        this.KWHzl = yho;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:java.util.concurrent.Executor:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.concurrent.Executor) : (r5v0 java.util.concurrent.Executor))
  (wrap:int:0x000a: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r6v0 int))
  (wrap:long:0x0011: TERNARY null = ((wrap:int:0x000b: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (30 long) : (r7v0 long))
  (wrap:kotlin.jvm.functions.Function2:0x0018: TERNARY null = ((wrap:int:0x0012: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function2:0x0016: SGET  A[WRAPPED] (LINE:15) com.tencent.matrix.lifecycle.LifecycleThreadConfig$1.INSTANCE com.tencent.matrix.lifecycle.LifecycleThreadConfig$1) : (r9v0 kotlin.jvm.functions.Function2))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0019: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yHO:0x001d: SGET  A[WRAPPED] (LINE:18) com.tencent.matrix.lifecycle.LifecycleThreadConfig$2.INSTANCE com.tencent.matrix.lifecycle.LifecycleThreadConfig$2) : (r10v0 o.yHO))
 A[MD:(java.util.concurrent.Executor, int, long, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Long, kotlin.Unit>, o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Long, kotlin.Unit>):void (m)] (LINE:11) call: o.yrW.<init>(java.util.concurrent.Executor, int, long, kotlin.jvm.functions.Function2, o.yHO):void type: THIS */
    public /* synthetic */ C57919yrW(java.util.concurrent.Executor executor, int i, long j, Function2 function2, yHO yho, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : executor, (i2 & 2) != 0 ? 5 : i, (i2 & 4) != 0 ? 30L : j, (i2 & 8) != 0 ? new Function2<java.lang.String, java.lang.Long, Unit>() { // from class: com.tencent.matrix.lifecycle.LifecycleThreadConfig$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(String str, Long l) {
                invoke(str, l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str, long j2) {
                Intrinsics.checkNotNullParameter(str, "");
                C58013ytK.OLrzqt("Matrix.Thread", "heavy task(cost " + j2 + "ms):" + str, new Object[0]);
            }
        } : function2, (i2 & 16) != 0 ? new yHO<java.lang.String, java.lang.String, java.lang.Long, Unit>() { // from class: com.tencent.matrix.lifecycle.LifecycleThreadConfig$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(String str, String str2, Long l) {
                invoke(str, str2, l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str, @NotNull String str2, long j2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                C58013ytK.OLrzqt("Matrix.Thread", "thread: " + str + ", cost: " + j2 + ", " + str2, new Object[0]);
            }
        } : yho);
    }
}
