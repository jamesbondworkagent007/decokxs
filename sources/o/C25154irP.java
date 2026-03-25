package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25154irP {
    public java.lang.String AEQbTJ;
    public int EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25154irP() {
        this(null, null, null, 0, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.irP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25154irP copy$default(C25154irP c25154irP, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c25154irP.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str2 = c25154irP.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = c25154irP.OLrzqt;
        }
        java.lang.String str5 = str3;
        if ((i2 & 8) != 0) {
            i = c25154irP.EZpvd;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            function0 = c25154irP.copydefault;
        }
        return c25154irP.EZpvd(str, str4, str5, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25154irP EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C25154irP(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25154irP)) {
            return false;
        }
        C25154irP c25154irP = (C25154irP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25154irP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25154irP.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c25154irP.OLrzqt) && this.EZpvd == c25154irP.EZpvd && Intrinsics.EZpvd(this.copydefault, c25154irP.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = java.lang.Integer.hashCode(this.EZpvd);
        Function0<Unit> function0 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionSlipPageInfoBean(title=" + this.AEQbTJ + ", value=" + this.KWHzl + ", hint=" + this.OLrzqt + ", colorInt=" + this.EZpvd + ", slippageClickCallback=" + this.copydefault + ")";
    }

    public C25154irP(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.EZpvd = i;
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:int:0x0020: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001c: INVOKE (wrap:int:0x001a: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) STATIC call: o.ivf.KWHzl(int):int A[MD:(int):int (m), WRAPPED] (LINE:41)) : (r7v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0021: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r8v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:37) call: o.irP.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C25154irP(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : i, (i2 & 16) != 0 ? null : function0);
    }
}
