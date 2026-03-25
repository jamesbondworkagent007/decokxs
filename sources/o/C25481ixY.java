package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25481ixY {
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String EZpvd;
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> KWHzl;
    public final int OLrzqt;
    public final InvestTipInfoVo copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final boolean valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25481ixY copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InvestTipInfoVo investTipInfoVo, int i, kotlin.Pair<java.lang.String, java.lang.Boolean> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25481ixY(str, str2, z, z2, z3, z4, z5, z6, investTipInfoVo, i, pair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25481ixY)) {
            return false;
        }
        C25481ixY c25481ixY = (C25481ixY) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25481ixY.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25481ixY.AEQbTJ) && this.AYXKKw == c25481ixY.AYXKKw && this.djBIcL == c25481ixY.djBIcL && this.AhwBna == c25481ixY.AhwBna && this.values == c25481ixY.values && this.gEmmrt == c25481ixY.gEmmrt && this.valueOf == c25481ixY.valueOf && Intrinsics.EZpvd(this.copydefault, c25481ixY.copydefault) && this.OLrzqt == c25481ixY.OLrzqt && Intrinsics.EZpvd(this.KWHzl, c25481ixY.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode4 = java.lang.Boolean.hashCode(this.djBIcL);
        int iHashCode5 = java.lang.Boolean.hashCode(this.AhwBna);
        int iHashCode6 = java.lang.Boolean.hashCode(this.values);
        int iHashCode7 = java.lang.Boolean.hashCode(this.gEmmrt);
        int iHashCode8 = java.lang.Boolean.hashCode(this.valueOf);
        InvestTipInfoVo investTipInfoVo = this.copydefault;
        int iHashCode9 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        int iHashCode10 = java.lang.Integer.hashCode(this.OLrzqt);
        kotlin.Pair<java.lang.String, java.lang.Boolean> pair = this.KWHzl;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (pair != null ? pair.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestInputBalanceUIBean(balance=" + this.EZpvd + ", balanceSymbol=" + this.AEQbTJ + ", isBalanceErro=" + this.AYXKKw + ", isBalanceInsufficient=" + this.djBIcL + ", isShowWarningTip=" + this.AhwBna + ", isSupportSwap=" + this.values + ", isLp=" + this.gEmmrt + ", isMainCoinAndInsufficient=" + this.valueOf + ", infoData=" + this.copydefault + ", investmentCategory=" + this.OLrzqt + ", balancePair=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    public C25481ixY(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InvestTipInfoVo investTipInfoVo, int i, kotlin.Pair<java.lang.String, java.lang.Boolean> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.AYXKKw = z;
        this.djBIcL = z2;
        this.AhwBna = z3;
        this.values = z4;
        this.gEmmrt = z5;
        this.valueOf = z6;
        this.copydefault = investTipInfoVo;
        this.OLrzqt = i;
        this.KWHzl = pair;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0033: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r24v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (r25v0 int)
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r26v0 kotlin.Pair))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.Pair<java.lang.String, java.lang.Boolean>):void (m)] (LINE:283) call: o.ixY.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.Pair):void type: THIS */
    public /* synthetic */ C25481ixY(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InvestTipInfoVo investTipInfoVo, int i, kotlin.Pair pair, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6, (i2 & 256) != 0 ? null : investTipInfoVo, i, (i2 & 1024) != 0 ? null : pair);
    }
}
