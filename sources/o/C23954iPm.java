package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23954iPm {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<InvestTokenWithAmount> KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23954iPm() {
        this(null, null, false, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iPm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C23954iPm copy$default(C23954iPm c23954iPm, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c23954iPm.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c23954iPm.copydefault;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = c23954iPm.EZpvd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c23954iPm.OLrzqt;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            list = c23954iPm.KWHzl;
        }
        return c23954iPm.AEQbTJ(str, str3, z3, z4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23954iPm AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.util.List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C23954iPm(str, str2, z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23954iPm)) {
            return false;
        }
        C23954iPm c23954iPm = (C23954iPm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c23954iPm.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23954iPm.copydefault) && this.EZpvd == c23954iPm.EZpvd && this.OLrzqt == c23954iPm.OLrzqt && Intrinsics.EZpvd(this.KWHzl, c23954iPm.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3EstDailyYieldUIBean(currencyPrice=" + this.AEQbTJ + ", NoYieldText=" + this.copydefault + ", isInit=" + this.EZpvd + ", isDataErro=" + this.OLrzqt + ", gainTokenList=" + this.KWHzl + ")";
    }

    public C23954iPm(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.util.List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.KWHzl = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:boolean:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:54)) : (r8v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>):void (m)] (LINE:49) call: o.iPm.<init>(java.lang.String, java.lang.String, boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C23954iPm(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? yDY.AhwBna() : list);
    }
}
