package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23956iPo {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23956iPo() {
        this(null, null, 0, false, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23956iPo copy$default(C23956iPo c23956iPo, java.lang.String str, java.lang.String str2, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c23956iPo.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str2 = c23956iPo.EZpvd;
        }
        java.lang.String str3 = str2;
        if ((i2 & 4) != 0) {
            i = c23956iPo.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = c23956iPo.copydefault;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = c23956iPo.AEQbTJ;
        }
        return c23956iPo.OLrzqt(str, str3, i3, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23956iPo OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.StringRes int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C23956iPo(str, str2, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23956iPo)) {
            return false;
        }
        C23956iPo c23956iPo = (C23956iPo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23956iPo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23956iPo.EZpvd) && this.OLrzqt == c23956iPo.OLrzqt && this.copydefault == c23956iPo.copydefault && this.AEQbTJ == c23956iPo.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3AprUIBean(title=" + this.KWHzl + ", apr=" + this.EZpvd + ", aprPopUpContent=" + this.OLrzqt + ", isInit=" + this.copydefault + ", isDataError=" + this.AEQbTJ + ")";
    }

    public C23956iPo(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.StringRes int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.OLrzqt = i;
        this.copydefault = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("APR") : (r4v0 java.lang.String))
  (wrap:java.lang.String:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:int:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.ixk.FragmentManager.geLlBI int) : (r6v0 int))
  (wrap:boolean:0x0018: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, int, boolean, boolean):void (m)] (LINE:57) call: o.iPo.<init>(java.lang.String, java.lang.String, int, boolean, boolean):void type: THIS */
    public /* synthetic */ C23956iPo(java.lang.String str, java.lang.String str2, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "APR" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? C25493ixk.FragmentManager.geLlBI : i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2);
    }
}
