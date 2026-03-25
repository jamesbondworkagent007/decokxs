package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iXA {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public final java.lang.String AuCTel;
    public final boolean DbNXlk;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.Map<java.lang.String, C24179iXv> djBIcL;
    public final InvestTokenWithAmount ejfBZ;
    public final java.util.List<InvestTokenWithAmount> fARcdN;
    public final int fIwbmz;
    public final InvestTipInfoVo fJNWhG;
    public final boolean fetchVPNInfo;
    public final boolean gEmmrt;
    public final C25479ixW isConnected;
    public final boolean valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iXA AEQbTJ(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull java.lang.String str3, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull java.util.List<InvestTokenWithAmount> list, @NotNull java.util.Map<java.lang.String, C24179iXv> map, int i, int i2, boolean z2, boolean z3, InvestTipInfoVo investTipInfoVo, @NotNull java.lang.String str4, @NotNull java.lang.String str5, C25479ixW c25479ixW, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new iXA(str, z, str2, str3, investTokenWithAmount, list, map, i, i2, z2, z3, investTipInfoVo, str4, str5, c25479ixW, z4, z5, z6, z7, z8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestTokenWithAmount> AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, C24179iXv> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iXA)) {
            return false;
        }
        iXA ixa = (iXA) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) ixa.AuCTel) && this.DbNXlk == ixa.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ixa.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) ixa.AYXKKw) && Intrinsics.EZpvd(this.ejfBZ, ixa.ejfBZ) && Intrinsics.EZpvd(this.fARcdN, ixa.fARcdN) && Intrinsics.EZpvd(this.djBIcL, ixa.djBIcL) && this.EZpvd == ixa.EZpvd && this.fIwbmz == ixa.fIwbmz && this.AkhnZx == ixa.AkhnZx && this.values == ixa.values && Intrinsics.EZpvd(this.fJNWhG, ixa.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ixa.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ixa.AEQbTJ) && Intrinsics.EZpvd(this.isConnected, ixa.isConnected) && this.AhwBna == ixa.AhwBna && this.valueOf == ixa.valueOf && this.OLrzqt == ixa.OLrzqt && this.fetchVPNInfo == ixa.fetchVPNInfo && this.gEmmrt == ixa.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AuCTel.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.DbNXlk);
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.ejfBZ.hashCode();
        int iHashCode6 = this.fARcdN.hashCode();
        int iHashCode7 = this.djBIcL.hashCode();
        int iHashCode8 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode9 = java.lang.Integer.hashCode(this.fIwbmz);
        int iHashCode10 = java.lang.Boolean.hashCode(this.AkhnZx);
        int iHashCode11 = java.lang.Boolean.hashCode(this.values);
        InvestTipInfoVo investTipInfoVo = this.fJNWhG;
        int iHashCode12 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        int iHashCode13 = this.KWHzl.hashCode();
        int iHashCode14 = this.AEQbTJ.hashCode();
        C25479ixW c25479ixW = this.isConnected;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (c25479ixW == null ? 0 : c25479ixW.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiTokenAmountInput(reserveFee=" + this.AuCTel + ", isLoading=" + this.DbNXlk + ", error=" + this.copydefault + ", investmentName=" + this.AYXKKw + ", transactionToken=" + this.ejfBZ + ", multiTransactionTokens=" + this.fARcdN + ", inputErrors=" + this.djBIcL + ", currentTokenIndex=" + this.EZpvd + ", tokenPrecision=" + this.fIwbmz + ", isSupportSwap=" + this.AkhnZx + ", isLp=" + this.values + ", tip=" + this.fJNWhG + ", amount=" + this.KWHzl + ", fiatValue=" + this.AEQbTJ + ", message=" + this.isConnected + ", isInit=" + this.AhwBna + ", isAutoInput=" + this.valueOf + ", canBackToInput=" + this.OLrzqt + ", isSliderInput=" + this.fetchVPNInfo + ", isAllowSubscribe=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25479ixW valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount values() {
        return this.ejfBZ;
    }

    public iXA(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull java.lang.String str3, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull java.util.List<InvestTokenWithAmount> list, @NotNull java.util.Map<java.lang.String, C24179iXv> map, int i, int i2, boolean z2, boolean z3, InvestTipInfoVo investTipInfoVo, @NotNull java.lang.String str4, @NotNull java.lang.String str5, C25479ixW c25479ixW, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AuCTel = str;
        this.DbNXlk = z;
        this.copydefault = str2;
        this.AYXKKw = str3;
        this.ejfBZ = investTokenWithAmount;
        this.fARcdN = list;
        this.djBIcL = map;
        this.EZpvd = i;
        this.fIwbmz = i2;
        this.AkhnZx = z2;
        this.values = z3;
        this.fJNWhG = investTipInfoVo;
        this.KWHzl = str4;
        this.AEQbTJ = str5;
        this.isConnected = c25479ixW;
        this.AhwBna = z4;
        this.valueOf = z5;
        this.OLrzqt = z6;
        this.fetchVPNInfo = z7;
        this.gEmmrt = z8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r45v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r45v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r45v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r45v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (r29v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r45v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:79)) : (r30v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0032: ARITH (r45v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:81)) : (r31v0 java.util.Map))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r45v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (r33v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r45v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r45v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0056: ARITH (r45v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r36v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (wrap:o.ixW:?: TERNARY null = ((wrap:int:0x005e: ARITH (r45v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null o.ixW) : (r39v0 o.ixW))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006a: ARITH (32768 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0074: ARITH (65536 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (131072 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (262144 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0092: ARITH (r45v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? true : (r44v0 boolean))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.Map<java.lang.String, o.iXv>, int, int, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String, java.lang.String, o.ixW, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:71) call: o.iXA.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List, java.util.Map, int, int, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String, java.lang.String, o.ixW, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ iXA(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, InvestTokenWithAmount investTokenWithAmount, java.util.List list, java.util.Map map, int i, int i2, boolean z2, boolean z3, InvestTipInfoVo investTipInfoVo, java.lang.String str4, java.lang.String str5, C25479ixW c25479ixW, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? "" : str3, investTokenWithAmount, (i3 & 32) != 0 ? yDY.AhwBna() : list, (i3 & 64) != 0 ? C56424yEw.KWHzl() : map, (i3 & 128) != 0 ? 0 : i, i2, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? false : z3, (i3 & 2048) != 0 ? null : investTipInfoVo, str4, str5, (i3 & 16384) != 0 ? null : c25479ixW, (32768 & i3) != 0 ? false : z4, (65536 & i3) != 0 ? false : z5, (131072 & i3) != 0 ? false : z6, (262144 & i3) != 0 ? false : z7, (i3 & 524288) != 0 ? true : z8);
    }
}
