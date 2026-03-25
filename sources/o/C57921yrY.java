package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yrY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57921yrY {
    public final boolean AEQbTJ;
    public final C57974ysY EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final C57919yrW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57921yrY() {
        this(null, false, false, null, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57921yrY copy$default(C57921yrY c57921yrY, C57974ysY c57974ysY, boolean z, boolean z2, C57919yrW c57919yrW, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c57974ysY = c57921yrY.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c57921yrY.AEQbTJ;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = c57921yrY.OLrzqt;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            c57919yrW = c57921yrY.copydefault;
        }
        C57919yrW c57919yrW2 = c57919yrW;
        if ((i & 16) != 0) {
            z3 = c57921yrY.KWHzl;
        }
        return c57921yrY.KWHzl(c57974ysY, z4, z5, c57919yrW2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57919yrW AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57921yrY KWHzl(@NotNull C57974ysY c57974ysY, boolean z, boolean z2, @NotNull C57919yrW c57919yrW, boolean z3) {
        Intrinsics.checkNotNullParameter(c57974ysY, "");
        Intrinsics.checkNotNullParameter(c57919yrW, "");
        return new C57921yrY(c57974ysY, z, z2, c57919yrW, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57974ysY OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57921yrY)) {
            return false;
        }
        C57921yrY c57921yrY = (C57921yrY) obj;
        return Intrinsics.EZpvd(this.EZpvd, c57921yrY.EZpvd) && this.AEQbTJ == c57921yrY.AEQbTJ && this.OLrzqt == c57921yrY.OLrzqt && Intrinsics.EZpvd(this.copydefault, c57921yrY.copydefault) && this.KWHzl == c57921yrY.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        boolean z = this.AEQbTJ;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        boolean z2 = this.OLrzqt;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iHashCode2 = this.copydefault.hashCode();
        boolean z3 = this.KWHzl;
        return (((((((iHashCode * 31) + r1) * 31) + r3) * 31) + iHashCode2) * 31) + (z3 ? 1 : z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MatrixLifecycleConfig(supervisorConfig=" + this.EZpvd + ", enableFgServiceMonitor=" + this.AEQbTJ + ", enableOverlayWindowMonitor=" + this.OLrzqt + ", lifecycleThreadConfig=" + this.copydefault + ", enableLifecycleLogger=" + this.KWHzl + ')';
    }

    public C57921yrY(@NotNull C57974ysY c57974ysY, boolean z, boolean z2, @NotNull C57919yrW c57919yrW, boolean z3) {
        Intrinsics.checkNotNullParameter(c57974ysY, "");
        Intrinsics.checkNotNullParameter(c57919yrW, "");
        this.EZpvd = c57974ysY;
        this.AEQbTJ = z;
        this.OLrzqt = z2;
        this.copydefault = c57919yrW;
        this.KWHzl = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:o.ysY:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: CONSTRUCTOR false, false, (null java.util.List), (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: o.ysY.<init>(boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r15v0 o.ysY))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:o.yrW:?: TERNARY null = ((wrap:int:0x0022: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR 
  (null java.util.concurrent.Executor)
  (0 int)
  (0 long)
  (null kotlin.jvm.functions.Function2)
  (null o.yHO)
  (31 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.util.concurrent.Executor, int, long, kotlin.jvm.functions.Function2, o.yHO, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:28) call: o.yrW.<init>(java.util.concurrent.Executor, int, long, kotlin.jvm.functions.Function2, o.yHO, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 o.yrW))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
 A[MD:(o.ysY, boolean, boolean, o.yrW, boolean):void (m)] (LINE:17) call: o.yrY.<init>(o.ysY, boolean, boolean, o.yrW, boolean):void type: THIS */
    public /* synthetic */ C57921yrY(C57974ysY c57974ysY, boolean z, boolean z2, C57919yrW c57919yrW, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C57974ysY(false, false, null, 7, null) : c57974ysY, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? new C57919yrW(null, 0, 0L, null, null, 31, null) : c57919yrW, (i & 16) == 0 ? z3 : false);
    }
}
