package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23955iPn {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23955iPn() {
        this(null, null, null, false, false, 0, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23955iPn copy$default(C23955iPn c23955iPn, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c23955iPn.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str2 = c23955iPn.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = c23955iPn.gEmmrt;
        }
        java.lang.String str5 = str3;
        if ((i2 & 8) != 0) {
            z = c23955iPn.KWHzl;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = c23955iPn.AEQbTJ;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            i = c23955iPn.copydefault;
        }
        return c23955iPn.AEQbTJ(str, str4, str5, z3, z4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23955iPn AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C23955iPn(str, str2, str3, z, z2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23955iPn)) {
            return false;
        }
        C23955iPn c23955iPn = (C23955iPn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23955iPn.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c23955iPn.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c23955iPn.gEmmrt) && this.KWHzl == c23955iPn.KWHzl && this.AEQbTJ == c23955iPn.AEQbTJ && this.copydefault == c23955iPn.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3CurrentPriceUIBean(currentPrice=" + this.EZpvd + ", token0=" + this.OLrzqt + ", token1=" + this.gEmmrt + ", isInit=" + this.KWHzl + ", isDataErro=" + this.AEQbTJ + ", style=" + this.copydefault + ")";
    }

    public C23955iPn(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.gEmmrt = str3;
        this.KWHzl = z;
        this.AEQbTJ = z2;
        this.copydefault = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int):void (m)] (LINE:40) call: o.iPn.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int):void type: THIS */
    public /* synthetic */ C23955iPn(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i);
    }
}
