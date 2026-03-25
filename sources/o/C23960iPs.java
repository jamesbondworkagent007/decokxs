package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23960iPs {
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final InvestTipInfoVo AhwBna;
    public final java.util.List<InvestTokenWithAmount> EZpvd;
    public final java.util.List<InvestTokenWithAmount> KWHzl;
    public final java.util.List<InvestTokenWithAmount> OLrzqt;
    public final java.util.List<InvestTokenWithAmount> copydefault;
    public final java.util.List<InvestTokenWithAmount> djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.util.List<InvestTokenWithAmount> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23960iPs AEQbTJ(java.util.List<InvestTokenWithAmount> list, java.util.List<InvestTokenWithAmount> list2, java.util.List<InvestTokenWithAmount> list3, java.util.List<InvestTokenWithAmount> list4, java.util.List<InvestTokenWithAmount> list5, InvestTipInfoVo investTipInfoVo, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.util.List<InvestTokenWithAmount> list6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C23960iPs(list, list2, list3, list4, list5, investTipInfoVo, str, str2, z, z2, list6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23960iPs)) {
            return false;
        }
        C23960iPs c23960iPs = (C23960iPs) obj;
        return Intrinsics.EZpvd(this.copydefault, c23960iPs.copydefault) && Intrinsics.EZpvd(this.KWHzl, c23960iPs.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c23960iPs.djBIcL) && Intrinsics.EZpvd(this.valueOf, c23960iPs.valueOf) && Intrinsics.EZpvd(this.OLrzqt, c23960iPs.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, c23960iPs.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c23960iPs.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c23960iPs.fetchVPNInfo) && this.gEmmrt == c23960iPs.gEmmrt && this.AEQbTJ == c23960iPs.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c23960iPs.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<InvestTokenWithAmount> list = this.copydefault;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<InvestTokenWithAmount> list2 = this.KWHzl;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<InvestTokenWithAmount> list3 = this.djBIcL;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        java.util.List<InvestTokenWithAmount> list4 = this.valueOf;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        java.util.List<InvestTokenWithAmount> list5 = this.OLrzqt;
        int iHashCode5 = list5 == null ? 0 : list5.hashCode();
        InvestTipInfoVo investTipInfoVo = this.AhwBna;
        int iHashCode6 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        int iHashCode7 = this.AYXKKw.hashCode();
        int iHashCode8 = this.fetchVPNInfo.hashCode();
        int iHashCode9 = java.lang.Boolean.hashCode(this.gEmmrt);
        int iHashCode10 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.util.List<InvestTokenWithAmount> list6 = this.EZpvd;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list6 != null ? list6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3FarmReceiveUIBean(assetsList=" + this.copydefault + ", feeEarning=" + this.KWHzl + ", rewardList=" + this.djBIcL + ", receiveTokenList=" + this.valueOf + ", gainsTokenList=" + this.OLrzqt + ", pendingFeeTip=" + this.AhwBna + ", tokenId=" + this.AYXKKw + ", totalAmount=" + this.fetchVPNInfo + ", isInit=" + this.gEmmrt + ", isDataErro=" + this.AEQbTJ + ", investWithTokenList=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C23960iPs(java.util.List<InvestTokenWithAmount> list, java.util.List<InvestTokenWithAmount> list2, java.util.List<InvestTokenWithAmount> list3, java.util.List<InvestTokenWithAmount> list4, java.util.List<InvestTokenWithAmount> list5, InvestTipInfoVo investTipInfoVo, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.util.List<InvestTokenWithAmount> list6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = list;
        this.KWHzl = list2;
        this.djBIcL = list3;
        this.valueOf = list4;
        this.OLrzqt = list5;
        this.AhwBna = investTipInfoVo;
        this.AYXKKw = str;
        this.fetchVPNInfo = str2;
        this.gEmmrt = z;
        this.AEQbTJ = z2;
        this.EZpvd = list6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r16v0 java.util.List)
  (r17v0 java.util.List)
  (r18v0 java.util.List)
  (r19v0 java.util.List)
  (r20v0 java.util.List)
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r21v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String, java.lang.String, boolean, boolean, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>):void (m)] (LINE:115) call: o.iPs.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String, java.lang.String, boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C23960iPs(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, InvestTipInfoVo investTipInfoVo, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5, (i & 32) != 0 ? null : investTipInfoVo, str, str2, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : list6);
    }
}
