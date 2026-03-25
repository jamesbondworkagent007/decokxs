package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25428iwY {
    public final Function0<Unit> AEQbTJ;
    public final boolean KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25428iwY() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iwY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25428iwY copy$default(C25428iwY c25428iwY, boolean z, boolean z2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25428iwY.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = c25428iwY.OLrzqt;
        }
        if ((i & 4) != 0) {
            function0 = c25428iwY.AEQbTJ;
        }
        return c25428iwY.OLrzqt(z, z2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25428iwY OLrzqt(boolean z, boolean z2, Function0<Unit> function0) {
        return new C25428iwY(z, z2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25428iwY)) {
            return false;
        }
        C25428iwY c25428iwY = (C25428iwY) obj;
        return this.KWHzl == c25428iwY.KWHzl && this.OLrzqt == c25428iwY.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c25428iwY.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        Function0<Unit> function0 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TabArrowConfig(showArrow=" + this.KWHzl + ", isExpanded=" + this.OLrzqt + ", onArrowClick=" + this.AEQbTJ + ")";
    }

    public C25428iwY(boolean z, boolean z2, Function0<Unit> function0) {
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
 A[MD:(boolean, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:7) call: o.iwY.<init>(boolean, boolean, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C25428iwY(boolean z, boolean z2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : function0);
    }
}
