package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25155irQ {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public int KWHzl;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25155irQ() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.irQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25155irQ copy$default(C25155irQ c25155irQ, java.lang.String str, java.lang.String str2, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c25155irQ.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str2 = c25155irQ.EZpvd;
        }
        if ((i2 & 4) != 0) {
            i = c25155irQ.KWHzl;
        }
        if ((i2 & 8) != 0) {
            function0 = c25155irQ.copydefault;
        }
        return c25155irQ.EZpvd(str, str2, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25155irQ EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25155irQ(str, str2, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25155irQ)) {
            return false;
        }
        C25155irQ c25155irQ = (C25155irQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25155irQ.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25155irQ.EZpvd) && this.KWHzl == c25155irQ.KWHzl && Intrinsics.EZpvd(this.copydefault, c25155irQ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = java.lang.Integer.hashCode(this.KWHzl);
        Function0<Unit> function0 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionSimpleServiceFeeBean(title=" + this.AEQbTJ + ", value=" + this.EZpvd + ", colorInt=" + this.KWHzl + ", titleClickCallback=" + this.copydefault + ")";
    }

    public C25155irQ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = i;
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0012: INVOKE (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) STATIC call: o.ivf.KWHzl(int):int A[MD:(int):int (m), WRAPPED] (LINE:56)) : (r4v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0016: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:53) call: o.irQ.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C25155irQ(java.lang.String str, java.lang.String str2, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : i, (i2 & 8) != 0 ? null : function0);
    }
}
