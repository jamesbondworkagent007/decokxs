package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25150irL {
    public Function0<Unit> AEQbTJ;
    public int KWHzl;
    public java.lang.CharSequence OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25150irL() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.irL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25150irL copy$default(C25150irL c25150irL, java.lang.String str, java.lang.CharSequence charSequence, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c25150irL.copydefault;
        }
        if ((i2 & 2) != 0) {
            charSequence = c25150irL.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            i = c25150irL.KWHzl;
        }
        if ((i2 & 8) != 0) {
            function0 = c25150irL.AEQbTJ;
        }
        return c25150irL.AEQbTJ(str, charSequence, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25150irL AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new C25150irL(str, charSequence, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25150irL)) {
            return false;
        }
        C25150irL c25150irL = (C25150irL) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25150irL.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c25150irL.OLrzqt) && this.KWHzl == c25150irL.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c25150irL.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = java.lang.Integer.hashCode(this.KWHzl);
        Function0<Unit> function0 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.copydefault;
        java.lang.CharSequence charSequence = this.OLrzqt;
        return "TransactionServiceFeeBean(title=" + str + ", value=" + ((java.lang.Object) charSequence) + ", colorInt=" + this.KWHzl + ", titleClickCallback=" + this.AEQbTJ + ")";
    }

    public C25150irL(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault = str;
        this.OLrzqt = charSequence;
        this.KWHzl = i;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.CharSequence))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0012: INVOKE (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) STATIC call: o.ivf.KWHzl(int):int A[MD:(int):int (m), WRAPPED] (LINE:48)) : (r4v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0016: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.CharSequence, int, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:45) call: o.irL.<init>(java.lang.String, java.lang.CharSequence, int, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C25150irL(java.lang.String str, java.lang.String str2, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : i, (i2 & 8) != 0 ? null : function0);
    }
}
