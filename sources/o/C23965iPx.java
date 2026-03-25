package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23965iPx {
    public final InvestTipInfoVo AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<InvestTokenWithAmount> KWHzl;
    public final java.util.List<InvestTokenWithAmount> OLrzqt;
    public final boolean copydefault;
    public final java.util.List<InvestTokenWithAmount> gEmmrt;
    public final java.util.List<InvestTokenWithAmount> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.iPx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C23965iPx copy$default(C23965iPx c23965iPx, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, InvestTipInfoVo investTipInfoVo, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c23965iPx.KWHzl;
        }
        if ((i & 2) != 0) {
            list2 = c23965iPx.OLrzqt;
        }
        java.util.List list5 = list2;
        if ((i & 4) != 0) {
            list3 = c23965iPx.gEmmrt;
        }
        java.util.List list6 = list3;
        if ((i & 8) != 0) {
            list4 = c23965iPx.valueOf;
        }
        java.util.List list7 = list4;
        if ((i & 16) != 0) {
            investTipInfoVo = c23965iPx.AEQbTJ;
        }
        InvestTipInfoVo investTipInfoVo2 = investTipInfoVo;
        if ((i & 32) != 0) {
            z = c23965iPx.copydefault;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = c23965iPx.EZpvd;
        }
        return c23965iPx.OLrzqt(list, list5, list6, list7, investTipInfoVo2, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23965iPx OLrzqt(java.util.List<InvestTokenWithAmount> list, java.util.List<InvestTokenWithAmount> list2, java.util.List<InvestTokenWithAmount> list3, java.util.List<InvestTokenWithAmount> list4, InvestTipInfoVo investTipInfoVo, boolean z, boolean z2) {
        return new C23965iPx(list, list2, list3, list4, investTipInfoVo, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23965iPx)) {
            return false;
        }
        C23965iPx c23965iPx = (C23965iPx) obj;
        return Intrinsics.EZpvd(this.KWHzl, c23965iPx.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c23965iPx.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, c23965iPx.gEmmrt) && Intrinsics.EZpvd(this.valueOf, c23965iPx.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c23965iPx.AEQbTJ) && this.copydefault == c23965iPx.copydefault && this.EZpvd == c23965iPx.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<InvestTokenWithAmount> list = this.KWHzl;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<InvestTokenWithAmount> list2 = this.OLrzqt;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<InvestTokenWithAmount> list3 = this.gEmmrt;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        java.util.List<InvestTokenWithAmount> list4 = this.valueOf;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        InvestTipInfoVo investTipInfoVo = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (investTipInfoVo != null ? investTipInfoVo.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3ReceiveUIBean(assetsList=" + this.KWHzl + ", feeInfoList=" + this.OLrzqt + ", rewardList=" + this.gEmmrt + ", receiveTokenList=" + this.valueOf + ", pendingFeeTip=" + this.AEQbTJ + ", isInit=" + this.copydefault + ", isDataErro=" + this.EZpvd + ")";
    }

    public C23965iPx(java.util.List<InvestTokenWithAmount> list, java.util.List<InvestTokenWithAmount> list2, java.util.List<InvestTokenWithAmount> list3, java.util.List<InvestTokenWithAmount> list4, InvestTipInfoVo investTipInfoVo, boolean z, boolean z2) {
        this.KWHzl = list;
        this.OLrzqt = list2;
        this.gEmmrt = list3;
        this.valueOf = list4;
        this.AEQbTJ = investTipInfoVo;
        this.copydefault = z;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r10v0 java.util.List)
  (r11v0 java.util.List)
  (r12v0 java.util.List)
  (r13v0 java.util.List)
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r14v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, boolean, boolean):void (m)] (LINE:65) call: o.iPx.<init>(java.util.List, java.util.List, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, boolean, boolean):void type: THIS */
    public /* synthetic */ C23965iPx(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, InvestTipInfoVo investTipInfoVo, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, (i & 16) != 0 ? null : investTipInfoVo, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2);
    }
}
