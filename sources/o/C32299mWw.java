package o;

import com.okinc.dexkline.market.common.constants.RiskControlLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32299mWw {
    public final java.lang.String AEQbTJ;
    public final RiskControlLevel AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<C32250mVa> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<C32250mVa> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32299mWw() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C32250mVa> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskControlLevel OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32299mWw OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<C32250mVa> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.List<C32250mVa> list2, @NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        return new C32299mWw(str, list, str2, str3, str4, str5, list2, riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C32250mVa> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32299mWw)) {
            return false;
        }
        C32299mWw c32299mWw = (C32299mWw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c32299mWw.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c32299mWw.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c32299mWw.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c32299mWw.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c32299mWw.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c32299mWw.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c32299mWw.gEmmrt) && this.AhwBna == c32299mWw.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinRisk(buyTaxes=" + this.copydefault + ", contractAnalysis=" + this.OLrzqt + ", highRiskNum=" + this.AEQbTJ + ", lowRiskNum=" + this.KWHzl + ", middleRiskNum=" + this.EZpvd + ", sellTaxes=" + this.djBIcL + ", swapAnalysis=" + this.gEmmrt + ", riskControlLevel=" + this.AhwBna + ")";
    }

    public C32299mWw(@NotNull java.lang.String str, @NotNull java.util.List<C32250mVa> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.List<C32250mVa> list2, @NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        this.copydefault = str;
        this.OLrzqt = list;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
        this.EZpvd = str4;
        this.djBIcL = str5;
        this.gEmmrt = list2;
        this.AhwBna = riskControlLevel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:8)) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0030: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r15v0 java.util.List))
  (wrap:com.okinc.dexkline.market.common.constants.RiskControlLevel:?: TERNARY null = ((wrap:int:0x003a: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: SGET  A[WRAPPED] (LINE:14) com.okinc.dexkline.market.common.constants.RiskControlLevel.UNKNOWN com.okinc.dexkline.market.common.constants.RiskControlLevel) : (r16v0 com.okinc.dexkline.market.common.constants.RiskControlLevel))
 A[MD:(java.lang.String, java.util.List<o.mVa>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<o.mVa>, com.okinc.dexkline.market.common.constants.RiskControlLevel):void (m)] (LINE:6) call: o.mWw.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.dexkline.market.common.constants.RiskControlLevel):void type: THIS */
    public /* synthetic */ C32299mWw(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list2, RiskControlLevel riskControlLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? yDY.AhwBna() : list2, (i & 128) != 0 ? RiskControlLevel.UNKNOWN : riskControlLevel);
    }
}
