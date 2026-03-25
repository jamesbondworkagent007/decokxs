package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl;
import com.okinc.business.invest_biz.data.bean.response.HealthRate;
import com.okinc.business.invest_biz.data.contants.PositionStatus;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24236iZy {
    public final java.lang.String AEQbTJ;
    public final Function0<Unit> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final ProductType DbNXlk;
    public final HealthRate EZpvd;
    public final java.lang.String KWHzl;
    public final C24230iZs OLrzqt;
    public final InvestAssetPositionType copydefault;
    public final NetworkLogoUrl djBIcL;
    public final java.lang.String ejfBZ;
    public final DeFiTokenModelAssetDetail.StyleType fARcdN;
    public final java.lang.String fIwbmz;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Long gEmmrt;
    public final java.lang.String isConnected;
    public final InvestLogo valueOf;
    public final PositionStatus values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24230iZs KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24236iZy OLrzqt(java.lang.Long l, ProductType productType, @NotNull java.lang.String str, @NotNull java.lang.String str2, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, @NotNull java.lang.String str3, java.lang.String str4, HealthRate healthRate, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, Function0<Unit> function0, @NotNull DeFiTokenModelAssetDetail.StyleType styleType, InvestAssetPositionType investAssetPositionType, PositionStatus positionStatus, C24230iZs c24230iZs) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(styleType, "");
        return new C24236iZy(l, productType, str, str2, investLogo, networkLogoUrl, str3, str4, healthRate, str5, str6, str7, str8, function0, styleType, investAssetPositionType, positionStatus, c24230iZs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24236iZy)) {
            return false;
        }
        C24236iZy c24236iZy = (C24236iZy) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c24236iZy.gEmmrt) && this.DbNXlk == c24236iZy.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c24236iZy.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c24236iZy.AkhnZx) && Intrinsics.EZpvd(this.valueOf, c24236iZy.valueOf) && Intrinsics.EZpvd(this.djBIcL, c24236iZy.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c24236iZy.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c24236iZy.ejfBZ) && Intrinsics.EZpvd(this.EZpvd, c24236iZy.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c24236iZy.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c24236iZy.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c24236iZy.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c24236iZy.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, c24236iZy.AYXKKw) && this.fARcdN == c24236iZy.fARcdN && this.copydefault == c24236iZy.copydefault && this.values == c24236iZy.values && Intrinsics.EZpvd(this.OLrzqt, c24236iZy.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionStatus fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.gEmmrt;
        int iHashCode = l == null ? 0 : l.hashCode();
        ProductType productType = this.DbNXlk;
        int iHashCode2 = productType == null ? 0 : productType.hashCode();
        int iHashCode3 = this.fIwbmz.hashCode();
        int iHashCode4 = this.AkhnZx.hashCode();
        InvestLogo investLogo = this.valueOf;
        int iHashCode5 = investLogo == null ? 0 : investLogo.hashCode();
        NetworkLogoUrl networkLogoUrl = this.djBIcL;
        int iHashCode6 = networkLogoUrl == null ? 0 : networkLogoUrl.hashCode();
        int iHashCode7 = this.KWHzl.hashCode();
        java.lang.String str = this.ejfBZ;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        HealthRate healthRate = this.EZpvd;
        int iHashCode9 = healthRate == null ? 0 : healthRate.hashCode();
        java.lang.String str2 = this.isConnected;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.fetchVPNInfo;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AhwBna;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.AEQbTJ;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Function0<Unit> function0 = this.AYXKKw;
        int iHashCode14 = function0 == null ? 0 : function0.hashCode();
        int iHashCode15 = this.fARcdN.hashCode();
        InvestAssetPositionType investAssetPositionType = this.copydefault;
        int iHashCode16 = investAssetPositionType == null ? 0 : investAssetPositionType.hashCode();
        PositionStatus positionStatus = this.values;
        int iHashCode17 = positionStatus == null ? 0 : positionStatus.hashCode();
        C24230iZs c24230iZs = this.OLrzqt;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (c24230iZs == null ? 0 : c24230iZs.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PrimaryAsset(id=" + this.gEmmrt + ", productType=" + this.DbNXlk + ", tokenName=" + this.fIwbmz + ", protocolName=" + this.AkhnZx + ", logos=" + this.valueOf + ", networkLogoUrl=" + this.djBIcL + ", fiatAmount=" + this.KWHzl + ", tag=" + this.ejfBZ + ", healthRate=" + this.EZpvd + ", positionId=" + this.isConnected + ", positionRange=" + this.fetchVPNInfo + ", platformUrl=" + this.AhwBna + ", buttonText=" + this.AEQbTJ + ", onButtonClick=" + this.AYXKKw + ", styleType=" + this.fARcdN + ", assetPositionType=" + this.copydefault + ", positionStatus=" + this.values + ", expandedData=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiTokenModelAssetDetail.StyleType values() {
        return this.fARcdN;
    }

    public C24236iZy(java.lang.Long l, ProductType productType, @NotNull java.lang.String str, @NotNull java.lang.String str2, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, @NotNull java.lang.String str3, java.lang.String str4, HealthRate healthRate, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, Function0<Unit> function0, @NotNull DeFiTokenModelAssetDetail.StyleType styleType, InvestAssetPositionType investAssetPositionType, PositionStatus positionStatus, C24230iZs c24230iZs) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(styleType, "");
        this.gEmmrt = l;
        this.DbNXlk = productType;
        this.fIwbmz = str;
        this.AkhnZx = str2;
        this.valueOf = investLogo;
        this.djBIcL = networkLogoUrl;
        this.KWHzl = str3;
        this.ejfBZ = str4;
        this.EZpvd = healthRate;
        this.isConnected = str5;
        this.fetchVPNInfo = str6;
        this.AhwBna = str7;
        this.AEQbTJ = str8;
        this.AYXKKw = function0;
        this.fARcdN = styleType;
        this.copydefault = investAssetPositionType;
        this.values = positionStatus;
        this.OLrzqt = c24230iZs;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008f: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
  (wrap:com.okinc.business.invest_biz.data.contants.ProductType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.contants.ProductType) : (r24v0 com.okinc.business.invest_biz.data.contants.ProductType))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (wrap:com.okinc.business.invest_biz.data.bean.InvestLogo:?: TERNARY null = ((wrap:int:0x0013: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestLogo) : (r27v0 com.okinc.business.invest_biz.data.bean.InvestLogo))
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkLogoUrl:?: TERNARY null = ((wrap:int:0x001b: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.NetworkLogoUrl) : (r28v0 com.okinc.business.invest_biz.data.bean.NetworkLogoUrl))
  (r29v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.response.HealthRate:?: TERNARY null = ((wrap:int:0x002b: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.HealthRate) : (r31v0 com.okinc.business.invest_biz.data.bean.response.HealthRate))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0054: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r36v0 kotlin.jvm.functions.Function0))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail$StyleType:?: TERNARY null = ((wrap:int:0x005d: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: SGET  A[WRAPPED] (LINE:42) com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail.StyleType.BASIC com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail$StyleType) : (r37v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail$StyleType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x006b: ARITH (32768 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (r38v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:com.okinc.business.invest_biz.data.contants.PositionStatus:?: TERNARY null = ((wrap:int:0x0075: ARITH (65536 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.contants.PositionStatus) : (r39v0 com.okinc.business.invest_biz.data.contants.PositionStatus))
  (wrap:o.iZs:?: TERNARY null = ((wrap:int:0x007f: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null o.iZs) : (r40v0 o.iZs))
 A[MD:(java.lang.Long, com.okinc.business.invest_biz.data.contants.ProductType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, com.okinc.business.invest_biz.data.bean.NetworkLogoUrl, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.HealthRate, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail$StyleType, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, com.okinc.business.invest_biz.data.contants.PositionStatus, o.iZs):void (m)] (LINE:24) call: o.iZy.<init>(java.lang.Long, com.okinc.business.invest_biz.data.contants.ProductType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestLogo, com.okinc.business.invest_biz.data.bean.NetworkLogoUrl, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.HealthRate, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail$StyleType, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, com.okinc.business.invest_biz.data.contants.PositionStatus, o.iZs):void type: THIS */
    public /* synthetic */ C24236iZy(java.lang.Long l, ProductType productType, java.lang.String str, java.lang.String str2, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, java.lang.String str3, java.lang.String str4, HealthRate healthRate, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, Function0 function0, DeFiTokenModelAssetDetail.StyleType styleType, InvestAssetPositionType investAssetPositionType, PositionStatus positionStatus, C24230iZs c24230iZs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : productType, str, str2, (i & 16) != 0 ? null : investLogo, (i & 32) != 0 ? null : networkLogoUrl, str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : healthRate, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : function0, (i & 16384) != 0 ? DeFiTokenModelAssetDetail.StyleType.BASIC : styleType, (32768 & i) != 0 ? null : investAssetPositionType, (65536 & i) != 0 ? null : positionStatus, (i & 131072) != 0 ? null : c24230iZs);
    }

    public final InvestLogo copydefault(@NotNull C24236iZy c24236iZy) {
        java.util.List<InvestLogoBaseVo> bottomRightLogoList;
        Intrinsics.checkNotNullParameter(c24236iZy, "");
        InvestLogo investLogo = c24236iZy.valueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (investLogo != null && (bottomRightLogoList = investLogo.getBottomRightLogoList()) != null) {
            arrayList.addAll(bottomRightLogoList);
        }
        NetworkLogoUrl networkLogoUrl = c24236iZy.djBIcL;
        arrayList.add(new InvestLogoBaseVo(networkLogoUrl != null ? networkLogoUrl.getLogo() : null, (java.lang.String) (0 == true ? 1 : 0), 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        InvestLogo investLogo2 = c24236iZy.valueOf;
        java.util.List<InvestLogoBaseVo> middleLogoList = investLogo2 != null ? investLogo2.getMiddleLogoList() : null;
        InvestLogo investLogo3 = c24236iZy.valueOf;
        java.util.List<InvestLogoBaseVo> topLeftLogoList = investLogo3 != null ? investLogo3.getTopLeftLogoList() : null;
        InvestLogo investLogo4 = c24236iZy.valueOf;
        return new InvestLogo(arrayList, middleLogoList, topLeftLogoList, investLogo4 != null ? investLogo4.getTopRightLogoList() : null);
    }
}
