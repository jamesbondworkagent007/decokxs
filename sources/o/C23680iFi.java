package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23680iFi {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final C23680iFi KWHzl = new C23680iFi(null, null, null, null, null, false, false, false, null, FrameMetricsAggregator.EVERY_DURATION, null);
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final InvestTipInfoVo AhwBna;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.util.List<C23623iDf> gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23680iFi() {
        this(null, null, null, null, null, false, false, false, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23680iFi AEQbTJ(@NotNull java.util.List<C23623iDf> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C23680iFi(list, str, str2, str3, str4, z, z2, z3, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23680iFi)) {
            return false;
        }
        C23680iFi c23680iFi = (C23680iFi) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c23680iFi.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c23680iFi.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c23680iFi.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c23680iFi.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c23680iFi.fetchVPNInfo) && this.copydefault == c23680iFi.copydefault && this.AEQbTJ == c23680iFi.AEQbTJ && this.OLrzqt == c23680iFi.OLrzqt && Intrinsics.EZpvd(this.AhwBna, c23680iFi.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        int iHashCode5 = this.fetchVPNInfo.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode7 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode8 = java.lang.Boolean.hashCode(this.OLrzqt);
        InvestTipInfoVo investTipInfoVo = this.AhwBna;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductEarningInfo(earningTokens=" + this.gEmmrt + ", dailyRoi=" + this.AYXKKw + ", weeklyRoi=" + this.valueOf + ", monthlyRoi=" + this.djBIcL + ", yearlyRoi=" + this.fetchVPNInfo + ", canSupportBatchClaim=" + this.copydefault + ", canEarnTradingFee=" + this.AEQbTJ + ", canEarnPoolReward=" + this.OLrzqt + ", earnedTokenInfo=" + this.AhwBna + ")";
    }

    public C23680iFi(@NotNull java.util.List<C23623iDf> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.gEmmrt = list;
        this.AYXKKw = str;
        this.valueOf = str2;
        this.djBIcL = str3;
        this.fetchVPNInfo = str4;
        this.copydefault = z;
        this.AEQbTJ = z2;
        this.OLrzqt = z3;
        this.AhwBna = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:91)) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : false)
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0041: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r19v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(java.util.List<o.iDf>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:90) call: o.iFi.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ C23680iFi(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) == 0 ? z3 : false, (i & 256) != 0 ? null : investTipInfoVo);
    }

    /* JADX INFO: renamed from: o.iFi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C23680iFi copydefault() {
            return C23680iFi.KWHzl;
        }
    }
}
