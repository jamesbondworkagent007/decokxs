package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46095tHq {
    public final Function0<Unit> AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer OLrzqt;
    public final boolean copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.tHq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46095tHq copy$default(C46095tHq c46095tHq, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46095tHq.gEmmrt;
        }
        if ((i & 2) != 0) {
            num = c46095tHq.EZpvd;
        }
        java.lang.Integer num4 = num;
        if ((i & 4) != 0) {
            num2 = c46095tHq.KWHzl;
        }
        java.lang.Integer num5 = num2;
        if ((i & 8) != 0) {
            num3 = c46095tHq.OLrzqt;
        }
        java.lang.Integer num6 = num3;
        if ((i & 16) != 0) {
            z = c46095tHq.copydefault;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            function0 = c46095tHq.AEQbTJ;
        }
        return c46095tHq.KWHzl(str, num4, num5, num6, z2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46095tHq KWHzl(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new C46095tHq(str, num, num2, num3, z, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46095tHq)) {
            return false;
        }
        C46095tHq c46095tHq = (C46095tHq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46095tHq.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, c46095tHq.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c46095tHq.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c46095tHq.OLrzqt) && this.copydefault == c46095tHq.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c46095tHq.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.gEmmrt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.EZpvd;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.KWHzl;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        java.lang.Integer num3 = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ButtonParams(text=" + this.gEmmrt + ", okButtonType=" + this.EZpvd + ", okButtonSize=" + this.KWHzl + ", okButtonPill=" + this.OLrzqt + ", isEnabled=" + this.copydefault + ", onClick=" + this.AEQbTJ + ")";
    }

    public C46095tHq(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = str;
        this.EZpvd = num;
        this.KWHzl = num2;
        this.OLrzqt = num3;
        this.copydefault = z;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (r15v0 kotlin.jvm.functions.Function0)
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:111) call: o.tHq.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C46095tHq(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? true : z, function0);
    }
}
