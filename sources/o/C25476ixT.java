package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25476ixT {
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final long AhwBna;
    public final PoolProtocolType AkhnZx;
    public final InvestTipInfoVo AuCTel;
    public final ProductType DbNXlk;
    public final java.lang.String EZpvd;
    public final InvestAssetPositionType KWHzl;
    public final InvestPageSource OLrzqt;
    public final long copydefault;
    public final PaymentOption djBIcL;
    public final ProductDetailsUserTradeAction ejfBZ;
    public final java.lang.Long fARcdN;
    public final InvestTipInfoVo fIwbmz;
    public final java.lang.Long fJNWhG;
    public final boolean fetchVPNInfo;
    public final boolean gEmmrt;
    public final C23687iFp isConnected;
    public final InvestmentKind valueOf;
    public final ProtocolType values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PoolProtocolType AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolType AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23687iFp AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25476ixT EZpvd(long j, @NotNull InvestmentKind investmentKind, java.lang.Long l, long j2, @NotNull java.lang.String str, @NotNull PoolProtocolType poolProtocolType, @NotNull ProductType productType, @NotNull ProtocolType protocolType, @NotNull java.lang.String str2, boolean z, @NotNull PaymentOption paymentOption, @NotNull C23687iFp c23687iFp, ProductDetailsUserTradeAction productDetailsUserTradeAction, boolean z2, java.util.Map<java.lang.String, java.lang.String> map, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestAssetPositionType investAssetPositionType, @NotNull InvestPageSource investPageSource, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(poolProtocolType, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(c23687iFp, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        return new C25476ixT(j, investmentKind, l, j2, str, poolProtocolType, productType, protocolType, str2, z, paymentOption, c23687iFp, productDetailsUserTradeAction, z2, map, investTipInfoVo, investTipInfoVo2, investAssetPositionType, investPageSource, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentOption OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPageSource copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25476ixT)) {
            return false;
        }
        C25476ixT c25476ixT = (C25476ixT) obj;
        return this.AhwBna == c25476ixT.AhwBna && this.valueOf == c25476ixT.valueOf && Intrinsics.EZpvd(this.fARcdN, c25476ixT.fARcdN) && this.copydefault == c25476ixT.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25476ixT.EZpvd) && this.AkhnZx == c25476ixT.AkhnZx && this.DbNXlk == c25476ixT.DbNXlk && this.values == c25476ixT.values && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c25476ixT.AYXKKw) && this.gEmmrt == c25476ixT.gEmmrt && this.djBIcL == c25476ixT.djBIcL && Intrinsics.EZpvd(this.isConnected, c25476ixT.isConnected) && Intrinsics.EZpvd(this.ejfBZ, c25476ixT.ejfBZ) && this.fetchVPNInfo == c25476ixT.fetchVPNInfo && Intrinsics.EZpvd(this.AEQbTJ, c25476ixT.AEQbTJ) && Intrinsics.EZpvd(this.AuCTel, c25476ixT.AuCTel) && Intrinsics.EZpvd(this.fIwbmz, c25476ixT.fIwbmz) && this.KWHzl == c25476ixT.KWHzl && this.OLrzqt == c25476ixT.OLrzqt && Intrinsics.EZpvd(this.fJNWhG, c25476ixT.fJNWhG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo fARcdN() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsUserTradeAction fJNWhG() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.AhwBna);
        int iHashCode2 = this.valueOf.hashCode();
        java.lang.Long l = this.fARcdN;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        int iHashCode4 = java.lang.Long.hashCode(this.copydefault);
        int iHashCode5 = this.EZpvd.hashCode();
        int iHashCode6 = this.AkhnZx.hashCode();
        int iHashCode7 = this.DbNXlk.hashCode();
        int iHashCode8 = this.values.hashCode();
        int iHashCode9 = this.AYXKKw.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.gEmmrt);
        int iHashCode11 = this.djBIcL.hashCode();
        int iHashCode12 = this.isConnected.hashCode();
        ProductDetailsUserTradeAction productDetailsUserTradeAction = this.ejfBZ;
        int iHashCode13 = productDetailsUserTradeAction == null ? 0 : productDetailsUserTradeAction.hashCode();
        int iHashCode14 = java.lang.Boolean.hashCode(this.fetchVPNInfo);
        java.util.Map<java.lang.String, java.lang.String> map = this.AEQbTJ;
        int iHashCode15 = map == null ? 0 : map.hashCode();
        InvestTipInfoVo investTipInfoVo = this.AuCTel;
        int iHashCode16 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.fIwbmz;
        int iHashCode17 = investTipInfoVo2 == null ? 0 : investTipInfoVo2.hashCode();
        InvestAssetPositionType investAssetPositionType = this.KWHzl;
        int iHashCode18 = investAssetPositionType == null ? 0 : investAssetPositionType.hashCode();
        int iHashCode19 = this.OLrzqt.hashCode();
        java.lang.Long l2 = this.fJNWhG;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (l2 == null ? 0 : l2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeFiOrderEntryParams(investmentId=" + this.AhwBna + ", investmentKind=" + this.valueOf + ", sourceInvestmentId=" + this.fARcdN + ", chainId=" + this.copydefault + ", chainName=" + this.EZpvd + ", poolType=" + this.AkhnZx + ", productType=" + this.DbNXlk + ", protocolType=" + this.values + ", poolId=" + this.AYXKKw + ", hasBonus=" + this.gEmmrt + ", investPaymentOption=" + this.djBIcL + ", riskInfo=" + this.isConnected + ", userAction=" + this.ejfBZ + ", riskTipEnable=" + this.fetchVPNInfo + ", extraParams=" + this.AEQbTJ + ", unableSubscribeTip=" + this.AuCTel + ", unableToRedeemTip=" + this.fIwbmz + ", assetPositionType=" + this.KWHzl + ", entrySource=" + this.OLrzqt + ", stakeId=" + this.fJNWhG + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo values() {
        return this.AuCTel;
    }

    public C25476ixT(long j, @NotNull InvestmentKind investmentKind, java.lang.Long l, long j2, @NotNull java.lang.String str, @NotNull PoolProtocolType poolProtocolType, @NotNull ProductType productType, @NotNull ProtocolType protocolType, @NotNull java.lang.String str2, boolean z, @NotNull PaymentOption paymentOption, @NotNull C23687iFp c23687iFp, ProductDetailsUserTradeAction productDetailsUserTradeAction, boolean z2, java.util.Map<java.lang.String, java.lang.String> map, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestAssetPositionType investAssetPositionType, @NotNull InvestPageSource investPageSource, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(poolProtocolType, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(protocolType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        Intrinsics.checkNotNullParameter(c23687iFp, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        this.AhwBna = j;
        this.valueOf = investmentKind;
        this.fARcdN = l;
        this.copydefault = j2;
        this.EZpvd = str;
        this.AkhnZx = poolProtocolType;
        this.DbNXlk = productType;
        this.values = protocolType;
        this.AYXKKw = str2;
        this.gEmmrt = z;
        this.djBIcL = paymentOption;
        this.isConnected = c23687iFp;
        this.ejfBZ = productDetailsUserTradeAction;
        this.fetchVPNInfo = z2;
        this.AEQbTJ = map;
        this.AuCTel = investTipInfoVo;
        this.fIwbmz = investTipInfoVo2;
        this.KWHzl = investAssetPositionType;
        this.OLrzqt = investPageSource;
        this.fJNWhG = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c2: CONSTRUCTOR 
  (r26v0 long)
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:18) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r28v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (r30v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.PoolProtocolType:?: TERNARY null = ((wrap:int:0x001f: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] (LINE:22) com.okinc.business.invest_biz.data.contants.PoolProtocolType.Unknown com.okinc.business.invest_biz.data.contants.PoolProtocolType) : (r33v0 com.okinc.business.invest_biz.data.contants.PoolProtocolType))
  (wrap:com.okinc.business.invest_biz.data.contants.ProductType:?: TERNARY null = ((wrap:int:0x0029: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: SGET  A[WRAPPED] (LINE:23) com.okinc.business.invest_biz.data.contants.ProductType.Save com.okinc.business.invest_biz.data.contants.ProductType) : (r34v0 com.okinc.business.invest_biz.data.contants.ProductType))
  (wrap:com.okinc.business.invest_biz.data.contants.ProtocolType:?: TERNARY null = ((wrap:int:0x0033: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:24) com.okinc.business.invest_biz.data.contants.ProtocolType.Unknown com.okinc.business.invest_biz.data.contants.ProtocolType) : (r35v0 com.okinc.business.invest_biz.data.contants.ProtocolType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.contants.PaymentOption:?: TERNARY null = ((wrap:int:0x004e: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: SGET  A[WRAPPED] (LINE:27) com.okinc.business.invest_biz.data.contants.PaymentOption.SingleToken com.okinc.business.invest_biz.data.contants.PaymentOption) : (r38v0 com.okinc.business.invest_biz.data.contants.PaymentOption))
  (wrap:o.iFp:?: TERNARY null = ((wrap:int:0x0058: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: INVOKE (wrap:o.iFp$StateListAnimator:0x005c: SGET  A[WRAPPED] (LINE:28) o.iFp.Companion o.iFp$StateListAnimator) VIRTUAL call: o.iFp.StateListAnimator.copydefault():o.iFp A[MD:():o.iFp (m), WRAPPED] (LINE:28)) : (r39v0 o.iFp))
  (wrap:com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction:?: TERNARY null = ((wrap:int:0x0067: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction) : (r40v0 com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0070: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r41v0 boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x007a: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0082: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:31)) : (r42v0 java.util.Map))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x008a: ARITH (32768 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r43v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0094: ARITH (65536 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r44v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x009e: ARITH (131072 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (r45v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource:?: TERNARY null = ((wrap:int:0x00a8: ARITH (262144 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ad: SGET  A[WRAPPED] (LINE:38) com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.Default com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource) : (r46v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r47v0 java.lang.Long))
 A[MD:(long, com.okinc.business.invest_biz.data.contants.InvestmentKind, java.lang.Long, long, java.lang.String, com.okinc.business.invest_biz.data.contants.PoolProtocolType, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.contants.ProtocolType, java.lang.String, boolean, com.okinc.business.invest_biz.data.contants.PaymentOption, o.iFp, com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, boolean, java.util.Map<java.lang.String, java.lang.String>, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, java.lang.Long):void (m)] (LINE:15) call: o.ixT.<init>(long, com.okinc.business.invest_biz.data.contants.InvestmentKind, java.lang.Long, long, java.lang.String, com.okinc.business.invest_biz.data.contants.PoolProtocolType, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.contants.ProtocolType, java.lang.String, boolean, com.okinc.business.invest_biz.data.contants.PaymentOption, o.iFp, com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, boolean, java.util.Map, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, java.lang.Long):void type: THIS */
    public /* synthetic */ C25476ixT(long j, InvestmentKind investmentKind, java.lang.Long l, long j2, java.lang.String str, PoolProtocolType poolProtocolType, ProductType productType, ProtocolType protocolType, java.lang.String str2, boolean z, PaymentOption paymentOption, C23687iFp c23687iFp, ProductDetailsUserTradeAction productDetailsUserTradeAction, boolean z2, java.util.Map map, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestAssetPositionType investAssetPositionType, InvestPageSource investPageSource, java.lang.Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? InvestmentKind.Default : investmentKind, (i & 4) != 0 ? null : l, j2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? PoolProtocolType.Unknown : poolProtocolType, (i & 64) != 0 ? ProductType.Save : productType, (i & 128) != 0 ? ProtocolType.Unknown : protocolType, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? PaymentOption.SingleToken : paymentOption, (i & 2048) != 0 ? C23687iFp.Companion.copydefault() : c23687iFp, (i & 4096) != 0 ? null : productDetailsUserTradeAction, (i & 8192) != 0 ? true : z2, (i & 16384) != 0 ? C56424yEw.KWHzl() : map, (32768 & i) != 0 ? null : investTipInfoVo, (65536 & i) != 0 ? null : investTipInfoVo2, (131072 & i) != 0 ? null : investAssetPositionType, (262144 & i) != 0 ? InvestPageSource.Default : investPageSource, (i & 524288) != 0 ? null : l2);
    }
}
