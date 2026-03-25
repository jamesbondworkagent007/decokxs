package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestDetailRate;
import com.okinc.business.invest_biz.data.contants.BtcProtocolType;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.RateType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23684iFm {
    public final BtcProtocolType AEQbTJ;
    public final boolean AYXKKw;
    public final InvestmentKind AhwBna;
    public final ProtocolType AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final InvestAssetPositionType KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final PaymentOption ejfBZ;
    public final java.util.List<InvestDetailRate> fARcdN;
    public final RateType fIwbmz;
    public final java.lang.String fJNWhG;
    public final int fetchVPNInfo;
    public final PaymentOption gEmmrt;
    public final PaymentOption getFieldNames;
    public final PaymentOption getNewProxyInstance;
    public final PoolProtocolType isConnected;
    public final boolean iwGUEr;
    public final PaymentOption valueOf;
    public final ProductType values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final C23684iFm EZpvd = new C23684iFm(null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, 2097151, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23684iFm() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolType AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateType DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentOption EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23684iFm copydefault(@NotNull InvestmentKind investmentKind, @NotNull ProductType productType, @NotNull PoolProtocolType poolProtocolType, @NotNull ProtocolType protocolType, @NotNull BtcProtocolType btcProtocolType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull RateType rateType, @NotNull java.lang.String str4, boolean z, boolean z2, int i, @NotNull java.lang.String str5, @NotNull PaymentOption paymentOption, @NotNull PaymentOption paymentOption2, @NotNull PaymentOption paymentOption3, @NotNull PaymentOption paymentOption4, @NotNull PaymentOption paymentOption5, InvestAssetPositionType investAssetPositionType, java.util.List<InvestDetailRate> list) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(poolProtocolType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        Intrinsics.checkNotNullParameter(btcProtocolType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(paymentOption2, "");
        Intrinsics.checkNotNullParameter(paymentOption3, "");
        Intrinsics.checkNotNullParameter(paymentOption4, "");
        Intrinsics.checkNotNullParameter(paymentOption5, "");
        return new C23684iFm(investmentKind, productType, poolProtocolType, protocolType, btcProtocolType, str, str2, str3, rateType, str4, z, z2, i, str5, paymentOption, paymentOption2, paymentOption3, paymentOption4, paymentOption5, investAssetPositionType, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PoolProtocolType djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23684iFm)) {
            return false;
        }
        C23684iFm c23684iFm = (C23684iFm) obj;
        return this.AhwBna == c23684iFm.AhwBna && this.values == c23684iFm.values && this.isConnected == c23684iFm.isConnected && this.AkhnZx == c23684iFm.AkhnZx && this.AEQbTJ == c23684iFm.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c23684iFm.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c23684iFm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c23684iFm.AuCTel) && this.fIwbmz == c23684iFm.fIwbmz && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c23684iFm.fJNWhG) && this.AYXKKw == c23684iFm.AYXKKw && this.iwGUEr == c23684iFm.iwGUEr && this.fetchVPNInfo == c23684iFm.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c23684iFm.djBIcL) && this.valueOf == c23684iFm.valueOf && this.getNewProxyInstance == c23684iFm.getNewProxyInstance && this.ejfBZ == c23684iFm.ejfBZ && this.getFieldNames == c23684iFm.getFieldNames && this.gEmmrt == c23684iFm.gEmmrt && this.KWHzl == c23684iFm.KWHzl && Intrinsics.EZpvd(this.fARcdN, c23684iFm.fARcdN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.values.hashCode();
        int iHashCode3 = this.isConnected.hashCode();
        int iHashCode4 = this.AkhnZx.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = this.DbNXlk.hashCode();
        int iHashCode7 = this.OLrzqt.hashCode();
        int iHashCode8 = this.AuCTel.hashCode();
        int iHashCode9 = this.fIwbmz.hashCode();
        int iHashCode10 = this.fJNWhG.hashCode();
        int iHashCode11 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode12 = java.lang.Boolean.hashCode(this.iwGUEr);
        int iHashCode13 = java.lang.Integer.hashCode(this.fetchVPNInfo);
        int iHashCode14 = this.djBIcL.hashCode();
        int iHashCode15 = this.valueOf.hashCode();
        int iHashCode16 = this.getNewProxyInstance.hashCode();
        int iHashCode17 = this.ejfBZ.hashCode();
        int iHashCode18 = this.getFieldNames.hashCode();
        int iHashCode19 = this.gEmmrt.hashCode();
        InvestAssetPositionType investAssetPositionType = this.KWHzl;
        int iHashCode20 = investAssetPositionType == null ? 0 : investAssetPositionType.hashCode();
        java.util.List<InvestDetailRate> list = this.fARcdN;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductInvestingInfo(investmentKind=" + this.AhwBna + ", productType=" + this.values + ", poolType=" + this.isConnected + ", protocolType=" + this.AkhnZx + ", btcProtocolType=" + this.AEQbTJ + ", poolId=" + this.DbNXlk + ", baseRate=" + this.OLrzqt + ", rate=" + this.AuCTel + ", rateType=" + this.fIwbmz + ", rateDesc=" + this.fJNWhG + ", hasBonus=" + this.AYXKKw + ", showBonusInfo=" + this.iwGUEr + ", pointTag=" + this.fetchVPNInfo + ", dueTime=" + this.djBIcL + ", paymentOption=" + this.valueOf + ", recommendedRedeemPaymentOption=" + this.getNewProxyInstance + ", recommendedInvestPaymentOption=" + this.ejfBZ + ", redeemPaymentOption=" + this.getFieldNames + ", investPaymentOption=" + this.gEmmrt + ", assetPositionType=" + this.KWHzl + ", rateDetails=" + this.fARcdN + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.iwGUEr;
    }

    public C23684iFm(@NotNull InvestmentKind investmentKind, @NotNull ProductType productType, @NotNull PoolProtocolType poolProtocolType, @NotNull ProtocolType protocolType, @NotNull BtcProtocolType btcProtocolType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull RateType rateType, @NotNull java.lang.String str4, boolean z, boolean z2, int i, @NotNull java.lang.String str5, @NotNull PaymentOption paymentOption, @NotNull PaymentOption paymentOption2, @NotNull PaymentOption paymentOption3, @NotNull PaymentOption paymentOption4, @NotNull PaymentOption paymentOption5, InvestAssetPositionType investAssetPositionType, java.util.List<InvestDetailRate> list) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(poolProtocolType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        Intrinsics.checkNotNullParameter(btcProtocolType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(paymentOption2, "");
        Intrinsics.checkNotNullParameter(paymentOption3, "");
        Intrinsics.checkNotNullParameter(paymentOption4, "");
        Intrinsics.checkNotNullParameter(paymentOption5, "");
        this.AhwBna = investmentKind;
        this.values = productType;
        this.isConnected = poolProtocolType;
        this.AkhnZx = protocolType;
        this.AEQbTJ = btcProtocolType;
        this.DbNXlk = str;
        this.OLrzqt = str2;
        this.AuCTel = str3;
        this.fIwbmz = rateType;
        this.fJNWhG = str4;
        this.AYXKKw = z;
        this.iwGUEr = z2;
        this.fetchVPNInfo = i;
        this.djBIcL = str5;
        this.valueOf = paymentOption;
        this.getNewProxyInstance = paymentOption2;
        this.ejfBZ = paymentOption3;
        this.getFieldNames = paymentOption4;
        this.gEmmrt = paymentOption5;
        this.KWHzl = investAssetPositionType;
        this.fARcdN = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f1: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0002: ARITH (r45v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:63) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r24v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
  (wrap:com.okinc.business.invest_biz.data.contants.ProductType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r45v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:64) com.okinc.business.invest_biz.data.contants.ProductType.Save com.okinc.business.invest_biz.data.contants.ProductType) : (r25v0 com.okinc.business.invest_biz.data.contants.ProductType))
  (wrap:com.okinc.business.invest_biz.data.contants.PoolProtocolType:?: TERNARY null = ((wrap:int:0x0014: ARITH (r45v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] (LINE:65) com.okinc.business.invest_biz.data.contants.PoolProtocolType.Unknown com.okinc.business.invest_biz.data.contants.PoolProtocolType) : (r26v0 com.okinc.business.invest_biz.data.contants.PoolProtocolType))
  (wrap:com.okinc.business.invest_biz.data.contants.ProtocolType:?: TERNARY null = ((wrap:int:0x001d: ARITH (r45v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] (LINE:66) com.okinc.business.invest_biz.data.contants.ProtocolType.Unknown com.okinc.business.invest_biz.data.contants.ProtocolType) : (r27v0 com.okinc.business.invest_biz.data.contants.ProtocolType))
  (wrap:com.okinc.business.invest_biz.data.contants.BtcProtocolType:?: TERNARY null = ((wrap:int:0x0026: ARITH (r45v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] (LINE:67) com.okinc.business.invest_biz.data.contants.BtcProtocolType.Unknown com.okinc.business.invest_biz.data.contants.BtcProtocolType) : (r28v0 com.okinc.business.invest_biz.data.contants.BtcProtocolType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r45v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r45v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r45v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.RateType:?: TERNARY null = ((wrap:int:0x0049: ARITH (r45v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: SGET  A[WRAPPED] (LINE:71) com.okinc.business.invest_biz.data.contants.RateType.Unknown com.okinc.business.invest_biz.data.contants.RateType) : (r32v0 com.okinc.business.invest_biz.data.contants.RateType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r45v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r45v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r45v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006b: ARITH (r45v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r36v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r45v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r37v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.contants.PaymentOption:?: TERNARY null = ((wrap:int:0x0079: ARITH (r45v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007d: SGET  A[WRAPPED] (LINE:77) com.okinc.business.invest_biz.data.contants.PaymentOption.NotDecided com.okinc.business.invest_biz.data.contants.PaymentOption) : (r38v0 com.okinc.business.invest_biz.data.contants.PaymentOption))
  (wrap:com.okinc.business.invest_biz.data.contants.PaymentOption:?: TERNARY null = ((wrap:int:0x0085: ARITH (r45v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0089: SGET  A[WRAPPED] (LINE:78) com.okinc.business.invest_biz.data.contants.PaymentOption.NotDecided com.okinc.business.invest_biz.data.contants.PaymentOption) : (r39v0 com.okinc.business.invest_biz.data.contants.PaymentOption))
  (wrap:com.okinc.business.invest_biz.data.contants.PaymentOption:?: TERNARY null = ((wrap:int:0x0090: ARITH (r45v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0094: SGET  A[WRAPPED] (LINE:79) com.okinc.business.invest_biz.data.contants.PaymentOption.NotDecided com.okinc.business.invest_biz.data.contants.PaymentOption) : (r40v0 com.okinc.business.invest_biz.data.contants.PaymentOption))
  (wrap:com.okinc.business.invest_biz.data.contants.PaymentOption:?: TERNARY null = ((wrap:int:0x009b: ARITH (r45v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009f: SGET  A[WRAPPED] (LINE:80) com.okinc.business.invest_biz.data.contants.PaymentOption.NotDecided com.okinc.business.invest_biz.data.contants.PaymentOption) : (r41v0 com.okinc.business.invest_biz.data.contants.PaymentOption))
  (wrap:com.okinc.business.invest_biz.data.contants.PaymentOption:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r45v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00aa: SGET  A[WRAPPED] (LINE:81) com.okinc.business.invest_biz.data.contants.PaymentOption.NotDecided com.okinc.business.invest_biz.data.contants.PaymentOption) : (r42v0 com.okinc.business.invest_biz.data.contants.PaymentOption))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r45v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (r43v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00be: ARITH (r45v0 int) & (1048576 int) A[WRAPPED]) == (0 int)) ? (r44v0 java.util.List) : (null java.util.List))
 A[MD:(com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.contants.PoolProtocolType, com.okinc.business.invest_biz.data.contants.ProtocolType, com.okinc.business.invest_biz.data.contants.BtcProtocolType, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.RateType, java.lang.String, boolean, boolean, int, java.lang.String, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.util.List<com.okinc.business.invest_biz.data.bean.InvestDetailRate>):void (m)] (LINE:62) call: o.iFm.<init>(com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.contants.PoolProtocolType, com.okinc.business.invest_biz.data.contants.ProtocolType, com.okinc.business.invest_biz.data.contants.BtcProtocolType, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.RateType, java.lang.String, boolean, boolean, int, java.lang.String, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.contants.PaymentOption, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.util.List):void type: THIS */
    public /* synthetic */ C23684iFm(InvestmentKind investmentKind, ProductType productType, PoolProtocolType poolProtocolType, ProtocolType protocolType, BtcProtocolType btcProtocolType, java.lang.String str, java.lang.String str2, java.lang.String str3, RateType rateType, java.lang.String str4, boolean z, boolean z2, int i, java.lang.String str5, PaymentOption paymentOption, PaymentOption paymentOption2, PaymentOption paymentOption3, PaymentOption paymentOption4, PaymentOption paymentOption5, InvestAssetPositionType investAssetPositionType, java.util.List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? InvestmentKind.Default : investmentKind, (i2 & 2) != 0 ? ProductType.Save : productType, (i2 & 4) != 0 ? PoolProtocolType.Unknown : poolProtocolType, (i2 & 8) != 0 ? ProtocolType.Unknown : protocolType, (i2 & 16) != 0 ? BtcProtocolType.Unknown : btcProtocolType, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? RateType.Unknown : rateType, (i2 & 512) != 0 ? "" : str4, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? false : z2, (i2 & 4096) == 0 ? i : 0, (i2 & 8192) == 0 ? str5 : "", (i2 & 16384) != 0 ? PaymentOption.NotDecided : paymentOption, (i2 & 32768) != 0 ? PaymentOption.NotDecided : paymentOption2, (i2 & 65536) != 0 ? PaymentOption.NotDecided : paymentOption3, (i2 & 131072) != 0 ? PaymentOption.NotDecided : paymentOption4, (i2 & 262144) != 0 ? PaymentOption.NotDecided : paymentOption5, (i2 & 524288) != 0 ? null : investAssetPositionType, (i2 & 1048576) == 0 ? list : null);
    }

    /* JADX INFO: renamed from: o.iFm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C23684iFm KWHzl() {
            return C23684iFm.EZpvd;
        }
    }
}
