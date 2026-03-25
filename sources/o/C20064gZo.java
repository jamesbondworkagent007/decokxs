package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse;
import com.okinc.business.dex.trade.copytrading.home.data.PnLDetail;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderData;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20064gZo implements gYZ {
    public static final ActionBar Companion = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final int AuCTelauCTel;
    public final java.lang.String AubY;
    public final java.lang.String AwvSrB;
    public final boolean AxsJAY;
    public final java.lang.String DbNXlk;
    public final java.lang.Long EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final java.lang.String fIwbmz;
    public final java.lang.String fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.lang.String gHZMYf;
    public final boolean getFieldNames;
    public final java.lang.String getNewProxyInstance;
    public final boolean hDKMBd;
    public final java.lang.String isConnected;
    public final boolean iwGUEr;
    public final java.lang.String sSMYrx;
    public final java.lang.String uzCIH;
    public final OrderSubStatus valueOf;
    public final OrderStrategyType values;
    public final java.lang.String wlaJM;
    public final java.lang.String zLjUOn;
    public final OrderSide zsXlph;
    public final java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C20064gZo copy$default(C20064gZo c20064gZo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, OrderStrategyType orderStrategyType, OrderSubStatus orderSubStatus, OrderSide orderSide, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str15, java.lang.String str16, java.lang.String str17, boolean z5, java.lang.String str18, java.lang.String str19, boolean z6, java.lang.String str20, java.lang.String str21, boolean z7, java.lang.String str22, java.lang.String str23, java.lang.Long l, int i2, int i3, java.lang.Object obj) {
        return c20064gZo.copydefault((i2 & 1) != 0 ? c20064gZo.AYXKKw : str, (i2 & 2) != 0 ? c20064gZo.getNewProxyInstance : str2, (i2 & 4) != 0 ? c20064gZo.copydefault : str3, (i2 & 8) != 0 ? c20064gZo.AEQbTJ : str4, (i2 & 16) != 0 ? c20064gZo.AuCTelauCTel : i, (i2 & 32) != 0 ? c20064gZo.KWHzl : str5, (i2 & 64) != 0 ? c20064gZo.uzCIH : str6, (i2 & 128) != 0 ? c20064gZo.AuCTel : str7, (i2 & 256) != 0 ? c20064gZo.DbNXlk : str8, (i2 & 512) != 0 ? c20064gZo.AkhnZx : str9, (i2 & 1024) != 0 ? c20064gZo.fetchVPNInfo : str10, (i2 & 2048) != 0 ? c20064gZo.values : orderStrategyType, (i2 & 4096) != 0 ? c20064gZo.valueOf : orderSubStatus, (i2 & 8192) != 0 ? c20064gZo.zsXlph : orderSide, (i2 & 16384) != 0 ? c20064gZo.zuBGHE : str11, (i2 & 32768) != 0 ? c20064gZo.isConnected : str12, (i2 & 65536) != 0 ? c20064gZo.fJNWhG : str13, (i2 & 131072) != 0 ? c20064gZo.fARcdN : str14, (i2 & 262144) != 0 ? c20064gZo.getFieldNames : z, (i2 & 524288) != 0 ? c20064gZo.iwGUEr : z2, (i2 & 1048576) != 0 ? c20064gZo.OLrzqt : z3, (i2 & 2097152) != 0 ? c20064gZo.AxsJAY : z4, (i2 & 4194304) != 0 ? c20064gZo.sSMYrx : str15, (i2 & 8388608) != 0 ? c20064gZo.AwvSrB : str16, (i2 & 16777216) != 0 ? c20064gZo.gHZMYf : str17, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c20064gZo.hDKMBd : z5, (i2 & 67108864) != 0 ? c20064gZo.djBIcL : str18, (i2 & 134217728) != 0 ? c20064gZo.zLjUOn : str19, (i2 & 268435456) != 0 ? c20064gZo.gEmmrt : z6, (i2 & 536870912) != 0 ? c20064gZo.fIwbmz : str20, (i2 & 1073741824) != 0 ? c20064gZo.ejfBZ : str21, (i2 & Integer.MIN_VALUE) != 0 ? c20064gZo.AhwBna : z7, (i3 & 1) != 0 ? c20064gZo.wlaJM : str22, (i3 & 2) != 0 ? c20064gZo.AubY : str23, (i3 & 4) != 0 ? c20064gZo.EZpvd : l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSide AubY() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20064gZo copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull OrderStrategyType orderStrategyType, @NotNull OrderSubStatus orderSubStatus, @NotNull OrderSide orderSide, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, boolean z, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, boolean z5, @NotNull java.lang.String str18, @NotNull java.lang.String str19, boolean z6, java.lang.String str20, java.lang.String str21, boolean z7, @NotNull java.lang.String str22, @NotNull java.lang.String str23, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(orderStrategyType, "");
        Intrinsics.checkNotNullParameter(orderSubStatus, "");
        Intrinsics.checkNotNullParameter(orderSide, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        return new C20064gZo(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, orderStrategyType, orderSubStatus, orderSide, str11, str12, str13, str14, z, z2, z3, z4, str15, str16, str17, z5, str18, str19, z6, str20, str21, z7, str22, str23, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStrategyType djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20064gZo)) {
            return false;
        }
        C20064gZo c20064gZo = (C20064gZo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c20064gZo.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) c20064gZo.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c20064gZo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c20064gZo.AEQbTJ) && this.AuCTelauCTel == c20064gZo.AuCTelauCTel && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c20064gZo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) c20064gZo.uzCIH) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c20064gZo.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c20064gZo.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c20064gZo.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c20064gZo.fetchVPNInfo) && this.values == c20064gZo.values && this.valueOf == c20064gZo.valueOf && this.zsXlph == c20064gZo.zsXlph && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) c20064gZo.zuBGHE) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c20064gZo.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c20064gZo.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c20064gZo.fARcdN) && this.getFieldNames == c20064gZo.getFieldNames && this.iwGUEr == c20064gZo.iwGUEr && this.OLrzqt == c20064gZo.OLrzqt && this.AxsJAY == c20064gZo.AxsJAY && Intrinsics.EZpvd((java.lang.Object) this.sSMYrx, (java.lang.Object) c20064gZo.sSMYrx) && Intrinsics.EZpvd((java.lang.Object) this.AwvSrB, (java.lang.Object) c20064gZo.AwvSrB) && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) c20064gZo.gHZMYf) && this.hDKMBd == c20064gZo.hDKMBd && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c20064gZo.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.zLjUOn, (java.lang.Object) c20064gZo.zLjUOn) && this.gEmmrt == c20064gZo.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c20064gZo.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c20064gZo.ejfBZ) && this.AhwBna == c20064gZo.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) c20064gZo.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) c20064gZo.AubY) && Intrinsics.EZpvd(this.EZpvd, c20064gZo.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gYZ
    public java.lang.String fJNWhG() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.getNewProxyInstance.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.AuCTelauCTel);
        int iHashCode6 = this.KWHzl.hashCode();
        int iHashCode7 = this.uzCIH.hashCode();
        int iHashCode8 = this.AuCTel.hashCode();
        int iHashCode9 = this.DbNXlk.hashCode();
        int iHashCode10 = this.AkhnZx.hashCode();
        int iHashCode11 = this.fetchVPNInfo.hashCode();
        int iHashCode12 = this.values.hashCode();
        int iHashCode13 = this.valueOf.hashCode();
        int iHashCode14 = this.zsXlph.hashCode();
        int iHashCode15 = this.zuBGHE.hashCode();
        int iHashCode16 = this.isConnected.hashCode();
        int iHashCode17 = this.fJNWhG.hashCode();
        int iHashCode18 = this.fARcdN.hashCode();
        int iHashCode19 = java.lang.Boolean.hashCode(this.getFieldNames);
        int iHashCode20 = java.lang.Boolean.hashCode(this.iwGUEr);
        int iHashCode21 = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode22 = java.lang.Boolean.hashCode(this.AxsJAY);
        int iHashCode23 = this.sSMYrx.hashCode();
        int iHashCode24 = this.AwvSrB.hashCode();
        int iHashCode25 = this.gHZMYf.hashCode();
        int iHashCode26 = java.lang.Boolean.hashCode(this.hDKMBd);
        int iHashCode27 = this.djBIcL.hashCode();
        int iHashCode28 = this.zLjUOn.hashCode();
        int iHashCode29 = java.lang.Boolean.hashCode(this.gEmmrt);
        java.lang.String str = this.fIwbmz;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.ejfBZ;
        int iHashCode31 = str2 == null ? 0 : str2.hashCode();
        int iHashCode32 = java.lang.Boolean.hashCode(this.AhwBna);
        int iHashCode33 = this.wlaJM.hashCode();
        int iHashCode34 = this.AubY.hashCode();
        java.lang.Long l = this.EZpvd;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OpenOrderUiData(orderId=" + this.AYXKKw + ", receiveTokenLogo=" + this.getNewProxyInstance + ", chainId=" + this.copydefault + ", chainName=" + this.AEQbTJ + ", strategyMode=" + this.AuCTelauCTel + ", chainLogo=" + this.KWHzl + ", receiveTokenSymbol=" + this.uzCIH + ", receiveTokenAddress=" + this.AuCTel + ", payTokenSymbol=" + this.DbNXlk + ", payTokenAddress=" + this.AkhnZx + ", payTokenLogo=" + this.fetchVPNInfo + ", orderStrategyType=" + this.values + ", orderStatus=" + this.valueOf + ", side=" + this.zsXlph + ", time=" + this.zuBGHE + ", payAmount=" + this.isConnected + ", receiveAmount=" + this.fJNWhG + ", receiveCurrencyAmount=" + this.fARcdN + ", showCancel=" + this.getFieldNames + ", showResume=" + this.iwGUEr + ", fromIsCurrency=" + this.OLrzqt + ", toIsCurrency=" + this.AxsJAY + ", triggerMarketCapacity=" + this.sSMYrx + ", triggerPrice=" + this.AwvSrB + ", triggerRate=" + this.gHZMYf + ", showBottomLine=" + this.hDKMBd + ", groupTime=" + this.djBIcL + ", strategyTagContent=" + this.zLjUOn + ", isBuyStyle=" + this.gEmmrt + ", pnLUsdValue=" + this.fIwbmz + ", pnlPercent=" + this.ejfBZ + ", hasSurplus=" + this.AhwBna + ", surplusAmount=" + this.wlaJM + ", surplusValueUSD=" + this.AubY + ", expiredTime=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSubStatus valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zsXlph() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuBGHE() {
        return this.gEmmrt;
    }

    public C20064gZo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull OrderStrategyType orderStrategyType, @NotNull OrderSubStatus orderSubStatus, @NotNull OrderSide orderSide, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, boolean z, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, boolean z5, @NotNull java.lang.String str18, @NotNull java.lang.String str19, boolean z6, java.lang.String str20, java.lang.String str21, boolean z7, @NotNull java.lang.String str22, @NotNull java.lang.String str23, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(orderStrategyType, "");
        Intrinsics.checkNotNullParameter(orderSubStatus, "");
        Intrinsics.checkNotNullParameter(orderSide, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        this.AYXKKw = str;
        this.getNewProxyInstance = str2;
        this.copydefault = str3;
        this.AEQbTJ = str4;
        this.AuCTelauCTel = i;
        this.KWHzl = str5;
        this.uzCIH = str6;
        this.AuCTel = str7;
        this.DbNXlk = str8;
        this.AkhnZx = str9;
        this.fetchVPNInfo = str10;
        this.values = orderStrategyType;
        this.valueOf = orderSubStatus;
        this.zsXlph = orderSide;
        this.zuBGHE = str11;
        this.isConnected = str12;
        this.fJNWhG = str13;
        this.fARcdN = str14;
        this.getFieldNames = z;
        this.iwGUEr = z2;
        this.OLrzqt = z3;
        this.AxsJAY = z4;
        this.sSMYrx = str15;
        this.AwvSrB = str16;
        this.gHZMYf = str17;
        this.hDKMBd = z5;
        this.djBIcL = str18;
        this.zLjUOn = str19;
        this.gEmmrt = z6;
        this.fIwbmz = str20;
        this.ejfBZ = str21;
        this.AhwBna = z7;
        this.wlaJM = str22;
        this.AubY = str23;
        this.EZpvd = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b5: CONSTRUCTOR 
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 int)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (r48v0 java.lang.String)
  (r49v0 java.lang.String)
  (r50v0 com.okinc.business.dex.trade.order.domain.model.OrderStrategyType)
  (r51v0 com.okinc.business.dex.trade.order.domain.model.OrderSubStatus)
  (r52v0 com.okinc.business.dex.trade.order.domain.model.OrderSide)
  (r53v0 java.lang.String)
  (r54v0 java.lang.String)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 boolean)
  (r58v0 boolean)
  (r59v0 boolean)
  (r60v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r74v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r74v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r74v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r74v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? true : (r64v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r74v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r74v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r74v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? true : (r67v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r74v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r74v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0069: ARITH (r74v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r70v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (r73v0 java.lang.Long)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderStrategyType, com.okinc.business.dex.trade.order.domain.model.OrderSubStatus, com.okinc.business.dex.trade.order.domain.model.OrderSide, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:10) call: o.gZo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderStrategyType, com.okinc.business.dex.trade.order.domain.model.OrderSubStatus, com.okinc.business.dex.trade.order.domain.model.OrderSide, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ C20064gZo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, OrderStrategyType orderStrategyType, OrderSubStatus orderSubStatus, OrderSide orderSide, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str15, java.lang.String str16, java.lang.String str17, boolean z5, java.lang.String str18, java.lang.String str19, boolean z6, java.lang.String str20, java.lang.String str21, boolean z7, java.lang.String str22, java.lang.String str23, java.lang.Long l, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, orderStrategyType, orderSubStatus, orderSide, str11, str12, str13, str14, z, z2, z3, z4, (i2 & 4194304) != 0 ? "" : str15, (i2 & 8388608) != 0 ? "" : str16, (i2 & 16777216) != 0 ? "" : str17, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? true : z5, (i2 & 67108864) != 0 ? "" : str18, (i2 & 134217728) != 0 ? "" : str19, (i2 & 268435456) != 0 ? true : z6, (i2 & 536870912) != 0 ? null : str20, (i2 & 1073741824) != 0 ? null : str21, (i2 & Integer.MIN_VALUE) != 0 ? false : z7, (i3 & 1) != 0 ? "" : str22, (i3 & 2) != 0 ? "" : str23, l);
    }

    @Override // o.gYZ
    public java.lang.String ejfBZ() {
        return this.AYXKKw + this.values.getType();
    }

    @Override // o.gYZ
    public gYZ EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copy$default(this, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, false, str, null, false, null, null, false, null, null, null, -67108865, 7, null);
    }

    /* JADX INFO: renamed from: o.gZo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gZo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C20064gZo KWHzl(@NotNull HistoryOrderData historyOrderData) {
            Intrinsics.checkNotNullParameter(historyOrderData, "");
            java.lang.String strAEQbTJ = historyOrderData.getOrderType() != OrderStrategyType.Market.getType() ? C31206lpe.EZpvd.AEQbTJ(C33129mqd.AhwBna(historyOrderData.getStrategyType())) : "";
            boolean zOLrzqt = C31206lpe.EZpvd.OLrzqt(C33129mqd.AhwBna(historyOrderData.getStrategyType()));
            java.lang.String orderId = historyOrderData.getOrderId();
            java.lang.String chainId = historyOrderData.getChainId();
            java.lang.String tokenLogoUrl = historyOrderData.getToToken().getTokenLogoUrl();
            java.lang.String tokenContractAddress = historyOrderData.getToToken().getTokenContractAddress();
            java.lang.String tokenLogoUrl2 = historyOrderData.getFromToken().getTokenLogoUrl();
            java.lang.String chainLogoUrl = historyOrderData.getChainLogoUrl();
            java.lang.String tokenSymbol = historyOrderData.getToToken().getTokenSymbol();
            java.lang.String tokenSymbol2 = historyOrderData.getFromToken().getTokenSymbol();
            java.lang.String tokenContractAddress2 = historyOrderData.getFromToken().getTokenContractAddress();
            OrderStrategyType orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(historyOrderData.getOrderType());
            OrderSubStatus orderSubStatus = historyOrderData.getOrderSubStatus();
            OrderSide orderSideKWHzl = OrderSide.Companion.KWHzl(historyOrderData.getExchangeDirection());
            java.lang.String createTime = historyOrderData.getCreateTime();
            java.lang.String tokenAmount = historyOrderData.getFromToken().getTokenAmount();
            if (C23313hvq.copydefault(tokenAmount, -1)) {
                tokenAmount = null;
            }
            java.lang.String str = tokenAmount == null ? "" : tokenAmount;
            java.lang.String tokenAmount2 = historyOrderData.getToToken().getTokenAmount();
            if (C23313hvq.copydefault(tokenAmount2, -1)) {
                tokenAmount2 = null;
            }
            java.lang.String str2 = tokenAmount2 == null ? "" : tokenAmount2;
            java.lang.String tokenUsd = historyOrderData.getToToken().getTokenUsd();
            TriggerInfo triggerInfo = historyOrderData.getTriggerInfo();
            java.lang.String triggerMarketCapacity = triggerInfo != null ? triggerInfo.getTriggerMarketCapacity() : null;
            java.lang.String str3 = triggerMarketCapacity == null ? "" : triggerMarketCapacity;
            TriggerInfo triggerInfo2 = historyOrderData.getTriggerInfo();
            java.lang.String triggerPrice = triggerInfo2 != null ? triggerInfo2.getTriggerPrice() : null;
            java.lang.String str4 = triggerPrice == null ? "" : triggerPrice;
            TriggerInfo triggerInfo3 = historyOrderData.getTriggerInfo();
            java.lang.String triggerRate = triggerInfo3 != null ? triggerInfo3.getTriggerRate() : null;
            return new C20064gZo(orderId, tokenLogoUrl, chainId, "", historyOrderData.getStrategyMode(), chainLogoUrl, tokenSymbol, tokenContractAddress, tokenSymbol2, tokenContractAddress2, tokenLogoUrl2, orderStrategyTypeCopydefault, orderSubStatus, orderSideKWHzl, createTime, str, str2, tokenUsd, false, false, historyOrderData.getFromToken().getTokenIsCurrency(), historyOrderData.getToToken().getTokenIsCurrency(), str3, str4, triggerRate == null ? "" : triggerRate, false, null, strAEQbTJ, zOLrzqt, null, null, historyOrderData.orderHasSurplus(), historyOrderData.getSurplusAmount(), historyOrderData.getSurplusValueUSD(), null, 1711276032, 0, null);
        }

        public final C20064gZo OLrzqt(@NotNull CTOpenOrderResponse cTOpenOrderResponse, InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(cTOpenOrderResponse, "");
            java.lang.String strCopydefault = C31206lpe.EZpvd.copydefault(cTOpenOrderResponse.getOrderType());
            java.lang.String orderId = cTOpenOrderResponse.getOrderId();
            java.lang.String chainId = cTOpenOrderResponse.getChainId();
            java.lang.String tokenLogoUrl = cTOpenOrderResponse.getToToken().getTokenLogoUrl();
            java.lang.String tokenLogoUrl2 = cTOpenOrderResponse.getFromToken().getTokenLogoUrl();
            java.lang.String chainLogoUrl = cTOpenOrderResponse.getChainLogoUrl();
            java.lang.String tokenSymbol = cTOpenOrderResponse.getToToken().getTokenSymbol();
            java.lang.String tokenContractAddress = cTOpenOrderResponse.getToToken().getTokenContractAddress();
            java.lang.String tokenSymbol2 = cTOpenOrderResponse.getFromToken().getTokenSymbol();
            java.lang.String tokenContractAddress2 = cTOpenOrderResponse.getFromToken().getTokenContractAddress();
            OrderStrategyType orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(cTOpenOrderResponse.getOrderType());
            OrderSubStatus orderSubStatus = cTOpenOrderResponse.getOrderSubStatus();
            OrderSide orderSideKWHzl = OrderSide.Companion.KWHzl(java.lang.String.valueOf(cTOpenOrderResponse.getExchangeDirection()));
            java.lang.String createTime = cTOpenOrderResponse.getCreateTime();
            java.lang.String tokenAmount = cTOpenOrderResponse.getFromToken().getTokenAmount();
            if (C23313hvq.copydefault(tokenAmount, -1)) {
                tokenAmount = null;
            }
            java.lang.String str = tokenAmount == null ? "" : tokenAmount;
            java.lang.String tokenAmount2 = cTOpenOrderResponse.getToToken().getTokenAmount();
            if (C23313hvq.copydefault(tokenAmount2, -1)) {
                tokenAmount2 = null;
            }
            java.lang.String str2 = tokenAmount2 == null ? "" : tokenAmount2;
            java.lang.String tokenUsd = cTOpenOrderResponse.getToToken().getTokenUsd();
            java.lang.String triggerMarketCapacity = cTOpenOrderResponse.getTriggerInfo().getTriggerMarketCapacity();
            java.lang.String triggerPrice = cTOpenOrderResponse.getTriggerInfo().getTriggerPrice();
            java.lang.String triggerRate = cTOpenOrderResponse.getTriggerInfo().getTriggerRate();
            int strategyMode = cTOpenOrderResponse.getStrategyMode();
            boolean tokenIsCurrency = cTOpenOrderResponse.getFromToken().getTokenIsCurrency();
            boolean tokenIsCurrency2 = cTOpenOrderResponse.getToToken().getTokenIsCurrency();
            boolean zAEQbTJ = (interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF()) ? false : C20065gZp.AEQbTJ(cTOpenOrderResponse.getOrderSubStatus());
            boolean z = cTOpenOrderResponse.getOrderSubStatus() == OrderSubStatus.Suspended && cTOpenOrderResponse.getCanResume() && interfaceC9738bbJ != null && interfaceC9738bbJ.DTwDnp();
            PnLDetail realizedPnl = cTOpenOrderResponse.getRealizedPnl();
            java.lang.String pnLUsdValue = realizedPnl != null ? realizedPnl.getPnLUsdValue() : null;
            PnLDetail realizedPnl2 = cTOpenOrderResponse.getRealizedPnl();
            return new C20064gZo(orderId, tokenLogoUrl, chainId, "", strategyMode, chainLogoUrl, tokenSymbol, tokenContractAddress, tokenSymbol2, tokenContractAddress2, tokenLogoUrl2, orderStrategyTypeCopydefault, orderSubStatus, orderSideKWHzl, createTime, str, str2, tokenUsd, zAEQbTJ, z, tokenIsCurrency, tokenIsCurrency2, triggerMarketCapacity, triggerPrice, triggerRate, false, null, strCopydefault, false, pnLUsdValue, realizedPnl2 != null ? realizedPnl2.getPnLPercent() : null, false, null, null, StringsKt__StringNumberConversionsKt.getFieldNames(cTOpenOrderResponse.getExpireTime()), -1778384896, 3, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C20064gZo OLrzqt(@NotNull OpenOrderData openOrderData, InterfaceC9738bbJ interfaceC9738bbJ) {
            boolean zAEQbTJ;
            java.lang.String str;
            boolean z;
            java.lang.String surplusValueUSD;
            java.lang.String expireTime;
            DexMultiChildOrderInfoVo fromChildOrderDetailVo;
            Intrinsics.checkNotNullParameter(openOrderData, "");
            InterfaceC20067gZr orderDetailInfo = openOrderData.getOrderDetailInfo();
            java.lang.String strAEQbTJ = openOrderData.getStrategyOrderInfo() == null ? "" : C31206lpe.EZpvd.AEQbTJ(openOrderData.getStrategyOrderInfo().getStrategyType());
            boolean zOLrzqt = openOrderData.getStrategyOrderInfo() == null ? false : C31206lpe.EZpvd.OLrzqt(openOrderData.getStrategyOrderInfo().getStrategyType());
            OrderDetailBean marketOrderInfo = openOrderData.getMarketOrderInfo();
            java.lang.String orderId = orderDetailInfo.getOrderId();
            java.lang.String chainId = orderDetailInfo.getChainId();
            java.lang.String toTokenLogo = orderDetailInfo.getToTokenLogo();
            java.lang.String chainLogo = orderDetailInfo.getChainLogo();
            java.lang.String toTokenSymbol = orderDetailInfo.getToTokenSymbol();
            java.lang.String toTokenAddress = orderDetailInfo.getToTokenAddress();
            java.lang.String fromTokenSymbol = orderDetailInfo.getFromTokenSymbol();
            java.lang.String fromTokenAddress = orderDetailInfo.getFromTokenAddress();
            java.lang.String fromTokenLogo = orderDetailInfo.getFromTokenLogo();
            java.lang.String chainName = orderDetailInfo.getChainName();
            OrderStrategyType orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(openOrderData.getOrderType());
            OrderSubStatus orderStatus = orderDetailInfo.getOrderStatus();
            OrderSide orderSide = orderDetailInfo.getOrderSide();
            java.lang.String createTime = orderDetailInfo.getCreateTime();
            java.lang.String fromTokenAmount = orderDetailInfo.getFromTokenAmount();
            java.lang.String toTokenAmount = orderDetailInfo.getToTokenAmount();
            java.lang.String toTokenCurrencyAmount = orderDetailInfo.getToTokenCurrencyAmount();
            if (interfaceC9738bbJ == null || interfaceC9738bbJ.QfsBiF()) {
                zAEQbTJ = false;
            } else if (openOrderData.isMarketOrder()) {
                OrderDetailBean marketOrderInfo2 = openOrderData.getMarketOrderInfo();
                if (marketOrderInfo2 != null && (fromChildOrderDetailVo = marketOrderInfo2.getFromChildOrderDetailVo()) != null && fromChildOrderDetailVo.isShowCancel()) {
                    zAEQbTJ = true;
                }
            } else {
                zAEQbTJ = C20065gZp.AEQbTJ(orderDetailInfo.getOrderStatus());
            }
            int strategyMode = orderDetailInfo.getStrategyMode();
            boolean z2 = orderDetailInfo.getOrderStatus() == OrderSubStatus.Suspended && orderDetailInfo.getCanResume() && interfaceC9738bbJ != null && interfaceC9738bbJ.DTwDnp();
            boolean fromIsCurrency = orderDetailInfo.getFromIsCurrency();
            boolean toIsCurrency = orderDetailInfo.getToIsCurrency();
            LimitOrderDetailBean strategyOrderInfo = openOrderData.getStrategyOrderInfo();
            java.lang.String triggerMarketCapacity = strategyOrderInfo != null ? strategyOrderInfo.getTriggerMarketCapacity() : null;
            java.lang.String str2 = triggerMarketCapacity == null ? "" : triggerMarketCapacity;
            LimitOrderDetailBean strategyOrderInfo2 = openOrderData.getStrategyOrderInfo();
            java.lang.String triggerPrice = strategyOrderInfo2 != null ? strategyOrderInfo2.getTriggerPrice() : null;
            java.lang.String str3 = triggerPrice == null ? "" : triggerPrice;
            LimitOrderDetailBean strategyOrderInfo3 = openOrderData.getStrategyOrderInfo();
            java.lang.String triggerRate = strategyOrderInfo3 != null ? strategyOrderInfo3.getTriggerRate() : null;
            if (triggerRate == null) {
                triggerRate = "";
            }
            if (marketOrderInfo != null) {
                str = triggerRate;
                z = true;
                if (!marketOrderInfo.orderHasSurplus()) {
                }
                java.lang.String surplusAmount = marketOrderInfo == null ? marketOrderInfo.getSurplusAmount() : null;
                java.lang.String str4 = surplusAmount != null ? "" : surplusAmount;
                surplusValueUSD = marketOrderInfo == null ? marketOrderInfo.getSurplusValueUSD() : null;
                if (surplusValueUSD == null) {
                    surplusValueUSD = "";
                }
                LimitOrderDetailBean limitOrderDetailBean = !(orderDetailInfo instanceof LimitOrderDetailBean) ? (LimitOrderDetailBean) orderDetailInfo : null;
                return new C20064gZo(orderId, toTokenLogo, chainId, chainName, strategyMode, chainLogo, toTokenSymbol, toTokenAddress, fromTokenSymbol, fromTokenAddress, fromTokenLogo, orderStrategyTypeCopydefault, orderStatus, orderSide, createTime, fromTokenAmount, toTokenAmount, toTokenCurrencyAmount, zAEQbTJ, z2, fromIsCurrency, toIsCurrency, str2, str3, str, false, null, strAEQbTJ, zOLrzqt, null, null, z, str4, surplusValueUSD, (limitOrderDetailBean != null || (expireTime = limitOrderDetailBean.getExpireTime()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(expireTime), 1711276032, 0, null);
            }
            str = triggerRate;
            z = false;
            if (marketOrderInfo == null) {
            }
            if (surplusAmount != null) {
            }
            if (marketOrderInfo == null) {
            }
            if (surplusValueUSD == null) {
            }
            if (!(orderDetailInfo instanceof LimitOrderDetailBean)) {
            }
            return new C20064gZo(orderId, toTokenLogo, chainId, chainName, strategyMode, chainLogo, toTokenSymbol, toTokenAddress, fromTokenSymbol, fromTokenAddress, fromTokenLogo, orderStrategyTypeCopydefault, orderStatus, orderSide, createTime, fromTokenAmount, toTokenAmount, toTokenCurrencyAmount, zAEQbTJ, z2, fromIsCurrency, toIsCurrency, str2, str3, str, false, null, strAEQbTJ, zOLrzqt, null, null, z, str4, surplusValueUSD, (limitOrderDetailBean != null || (expireTime = limitOrderDetailBean.getExpireTime()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(expireTime), 1711276032, 0, null);
        }
    }
}
