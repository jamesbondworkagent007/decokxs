package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25479ixW {
    public final int KWHzl;
    public final InvestTipInfoVo OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25479ixW copy$default(C25479ixW c25479ixW, java.lang.String str, int i, InvestTipInfoVo investTipInfoVo, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c25479ixW.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = c25479ixW.KWHzl;
        }
        if ((i2 & 4) != 0) {
            investTipInfoVo = c25479ixW.OLrzqt;
        }
        return c25479ixW.EZpvd(str, i, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25479ixW EZpvd(@NotNull java.lang.String str, int i, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C25479ixW(str, i, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        int i = this.KWHzl;
        return i == 6 || i == 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        int i = this.KWHzl;
        return (i == 7 || i == 9) ? C52761wXj.Activity.aappFQ : C52761wXj.Activity.DQzvGN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25479ixW)) {
            return false;
        }
        C25479ixW c25479ixW = (C25479ixW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25479ixW.copydefault) && this.KWHzl == c25479ixW.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c25479ixW.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.KWHzl);
        InvestTipInfoVo investTipInfoVo = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestInputMsgUIBean(text=" + this.copydefault + ", msgType=" + this.KWHzl + ", tipData=" + this.OLrzqt + ")";
    }

    public C25479ixW(@NotNull java.lang.String str, int i, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = i;
        this.OLrzqt = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r3v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(java.lang.String, int, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:313) call: o.ixW.<init>(java.lang.String, int, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ C25479ixW(java.lang.String str, int i, InvestTipInfoVo investTipInfoVo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : investTipInfoVo);
    }
}
