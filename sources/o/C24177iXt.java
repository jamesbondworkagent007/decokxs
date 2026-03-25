package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24177iXt {
    public final InvestTipInfoVo AEQbTJ;
    public final int AYXKKw;
    public final boolean EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;
    public final DisplayText copydefault;
    public final int djBIcL;
    public final DisplayText valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayText copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24177iXt copydefault(@NotNull DisplayText displayText, DisplayText displayText2, int i, boolean z, boolean z2, @NotNull InvestTipInfoVo investTipInfoVo, int i2, int i3) {
        Intrinsics.checkNotNullParameter(displayText, "");
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        return new C24177iXt(displayText, displayText2, i, z, z2, investTipInfoVo, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24177iXt)) {
            return false;
        }
        C24177iXt c24177iXt = (C24177iXt) obj;
        return Intrinsics.EZpvd(this.copydefault, c24177iXt.copydefault) && Intrinsics.EZpvd(this.valueOf, c24177iXt.valueOf) && this.djBIcL == c24177iXt.djBIcL && this.OLrzqt == c24177iXt.OLrzqt && this.EZpvd == c24177iXt.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c24177iXt.AEQbTJ) && this.AYXKKw == c24177iXt.AYXKKw && this.KWHzl == c24177iXt.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        DisplayText displayText = this.valueOf;
        return (((((((((((((iHashCode * 31) + (displayText == null ? 0 : displayText.hashCode())) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ButtonConfig(displayText=" + this.copydefault + ", loadingDisplayText=" + this.valueOf + ", orderType=" + this.djBIcL + ", isEnabled=" + this.OLrzqt + ", isLoading=" + this.EZpvd + ", infoTip=" + this.AEQbTJ + ", tipStyle=" + this.AYXKKw + ", action=" + this.KWHzl + ")";
    }

    public C24177iXt(@NotNull DisplayText displayText, DisplayText displayText2, int i, boolean z, boolean z2, @NotNull InvestTipInfoVo investTipInfoVo, int i2, int i3) {
        Intrinsics.checkNotNullParameter(displayText, "");
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        this.copydefault = displayText;
        this.valueOf = displayText2;
        this.djBIcL = i;
        this.OLrzqt = z;
        this.EZpvd = z2;
        this.AEQbTJ = investTipInfoVo;
        this.AYXKKw = i2;
        this.KWHzl = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (r21v0 com.okinc.business.invest_biz.data.bean.DisplayText)
  (wrap:com.okinc.business.invest_biz.data.bean.DisplayText:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.DisplayText) : (r22v0 com.okinc.business.invest_biz.data.bean.DisplayText))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r23v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestClickActionType:?: CAST (com.okinc.business.invest_biz.data.bean.InvestClickActionType) (null com.okinc.business.invest_biz.data.bean.InvestClickActionType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData:?: CAST (com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData) (null com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestHoverOnData:?: CAST (com.okinc.business.invest_biz.data.bean.InvestHoverOnData) (null com.okinc.business.invest_biz.data.bean.InvestHoverOnData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestPopUpData:?: CAST (com.okinc.business.invest_biz.data.bean.InvestPopUpData) (null com.okinc.business.invest_biz.data.bean.InvestPopUpData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestRedirectData:?: CAST (com.okinc.business.invest_biz.data.bean.InvestRedirectData) (null com.okinc.business.invest_biz.data.bean.InvestRedirectData))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (1023 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestClickActionType, com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData, com.okinc.business.invest_biz.data.bean.InvestHoverOnData, com.okinc.business.invest_biz.data.bean.InvestPopUpData, com.okinc.business.invest_biz.data.bean.InvestRedirectData, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:273) call: com.okinc.business.invest_biz.data.bean.InvestTipInfoVo.<init>(com.okinc.business.invest_biz.data.bean.InvestClickActionType, com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData, com.okinc.business.invest_biz.data.bean.InvestHoverOnData, com.okinc.business.invest_biz.data.bean.InvestPopUpData, com.okinc.business.invest_biz.data.bean.InvestRedirectData, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0048: ARITH (r29v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r28v0 int) : (0 int))
 A[MD:(com.okinc.business.invest_biz.data.bean.DisplayText, com.okinc.business.invest_biz.data.bean.DisplayText, int, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, int):void (m)] (LINE:267) call: o.iXt.<init>(com.okinc.business.invest_biz.data.bean.DisplayText, com.okinc.business.invest_biz.data.bean.DisplayText, int, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, int):void type: THIS */
    public /* synthetic */ C24177iXt(DisplayText displayText, DisplayText displayText2, int i, boolean z, boolean z2, InvestTipInfoVo investTipInfoVo, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(displayText, (i4 & 2) != 0 ? null : displayText2, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? new InvestTipInfoVo((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 1023, (DefaultConstructorMarker) null) : investTipInfoVo, (i4 & 64) != 0 ? 2 : i2, (i4 & 128) == 0 ? i3 : 0);
    }
}
