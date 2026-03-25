package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam$$serializer;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizTradeOrderReq {
    private boolean _feReq;
    private String assetNeedTransfer;
    private ArrayList<TradeOrderStopParam> attachAlgoOrds;
    private String banAmend;
    private String bboType;
    private String ccy;
    private String cost;
    private String instId;
    private Boolean isFullPercent;
    private Boolean isTradeBorrowMode;
    private String ordType;
    private String orderSignType;
    private String orderValue;
    private String posSide;
    private String px;
    private String pxUsd;
    private String pxVol;
    private String quickMgnType;
    private Boolean reduceOnly;
    private String side;
    private String simpleEarnNeedTransfer;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String sz;
    private String tag;
    private String tdMode;
    private String tgtCcy;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tradeAvail;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bboType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.isFullPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.orderSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> component23() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.pxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.pxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component26() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.assetNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.simpleEarnNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.tradeAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this._feReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizTradeOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool2, String str17, String str18, String str19, ArrayList<TradeOrderStopParam> arrayList, String str20, String str21, Boolean bool3, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BizTradeOrderReq(str, str2, str3, str4, str5, z, str6, str7, bool, str8, str9, str10, str11, str12, str13, str14, str15, str16, bool2, str17, str18, str19, arrayList, str20, str21, bool3, str22, str23, str24, str25, str26, str27, str28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizTradeOrderReq)) {
            return false;
        }
        BizTradeOrderReq bizTradeOrderReq = (BizTradeOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) bizTradeOrderReq.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) bizTradeOrderReq.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) bizTradeOrderReq.side) && Intrinsics.EZpvd((Object) this.ordType, (Object) bizTradeOrderReq.ordType) && Intrinsics.EZpvd((Object) this.sz, (Object) bizTradeOrderReq.sz) && this._feReq == bizTradeOrderReq._feReq && Intrinsics.EZpvd((Object) this.posSide, (Object) bizTradeOrderReq.posSide) && Intrinsics.EZpvd((Object) this.px, (Object) bizTradeOrderReq.px) && Intrinsics.EZpvd(this.reduceOnly, bizTradeOrderReq.reduceOnly) && Intrinsics.EZpvd((Object) this.bboType, (Object) bizTradeOrderReq.bboType) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) bizTradeOrderReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) bizTradeOrderReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) bizTradeOrderReq.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) bizTradeOrderReq.slOrdPx) && Intrinsics.EZpvd((Object) this.ccy, (Object) bizTradeOrderReq.ccy) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) bizTradeOrderReq.tgtCcy) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) bizTradeOrderReq.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) bizTradeOrderReq.slTriggerPxType) && Intrinsics.EZpvd(this.isFullPercent, bizTradeOrderReq.isFullPercent) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) bizTradeOrderReq.quickMgnType) && Intrinsics.EZpvd((Object) this.cost, (Object) bizTradeOrderReq.cost) && Intrinsics.EZpvd((Object) this.orderSignType, (Object) bizTradeOrderReq.orderSignType) && Intrinsics.EZpvd(this.attachAlgoOrds, bizTradeOrderReq.attachAlgoOrds) && Intrinsics.EZpvd((Object) this.pxUsd, (Object) bizTradeOrderReq.pxUsd) && Intrinsics.EZpvd((Object) this.pxVol, (Object) bizTradeOrderReq.pxVol) && Intrinsics.EZpvd(this.isTradeBorrowMode, bizTradeOrderReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.banAmend, (Object) bizTradeOrderReq.banAmend) && Intrinsics.EZpvd((Object) this.assetNeedTransfer, (Object) bizTradeOrderReq.assetNeedTransfer) && Intrinsics.EZpvd((Object) this.simpleEarnNeedTransfer, (Object) bizTradeOrderReq.simpleEarnNeedTransfer) && Intrinsics.EZpvd((Object) this.tradeAvail, (Object) bizTradeOrderReq.tradeAvail) && Intrinsics.EZpvd((Object) this.orderValue, (Object) bizTradeOrderReq.orderValue) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) bizTradeOrderReq.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.tag, (Object) bizTradeOrderReq.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetNeedTransfer() {
        return this.assetNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TradeOrderStopParam> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBanAmend() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBboType() {
        return this.bboType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCost() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSignType() {
        return this.orderSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxUsd() {
        return this.pxUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVol() {
        return this.pxVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnNeedTransfer() {
        return this.simpleEarnNeedTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeAvail() {
        return this.tradeAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean get_feReq() {
        return this._feReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.tdMode.hashCode();
        int iHashCode3 = this.side.hashCode();
        int iHashCode4 = this.ordType.hashCode();
        int iHashCode5 = this.sz.hashCode();
        int iHashCode6 = Boolean.hashCode(this._feReq);
        String str = this.posSide;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.px;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.reduceOnly;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str3 = this.bboType;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tpTriggerPx;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tpOrdPx;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slTriggerPx;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.slOrdPx;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.ccy;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tgtCcy;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tpTriggerPxType;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.slTriggerPxType;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        Boolean bool2 = this.isFullPercent;
        int iHashCode19 = bool2 == null ? 0 : bool2.hashCode();
        String str12 = this.quickMgnType;
        int iHashCode20 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.cost;
        int iHashCode21 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.orderSignType;
        int iHashCode22 = str14 == null ? 0 : str14.hashCode();
        ArrayList<TradeOrderStopParam> arrayList = this.attachAlgoOrds;
        int iHashCode23 = arrayList == null ? 0 : arrayList.hashCode();
        String str15 = this.pxUsd;
        int iHashCode24 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.pxVol;
        int iHashCode25 = str16 == null ? 0 : str16.hashCode();
        Boolean bool3 = this.isTradeBorrowMode;
        int iHashCode26 = bool3 == null ? 0 : bool3.hashCode();
        String str17 = this.banAmend;
        int iHashCode27 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.assetNeedTransfer;
        int iHashCode28 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.simpleEarnNeedTransfer;
        int iHashCode29 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.tradeAvail;
        int iHashCode30 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.orderValue;
        int iHashCode31 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.tradeQuoteCcy;
        int iHashCode32 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.tag;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (str23 == null ? 0 : str23.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFullPercent() {
        return this.isFullPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetNeedTransfer(String str) {
        this.assetNeedTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(ArrayList<TradeOrderStopParam> arrayList) {
        this.attachAlgoOrds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBanAmend(String str) {
        this.banAmend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBboType(String str) {
        this.bboType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCost(String str) {
        this.cost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullPercent(Boolean bool) {
        this.isFullPercent = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSignType(String str) {
        this.orderSignType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(String str) {
        this.orderValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxUsd(String str) {
        this.pxUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVol(String str) {
        this.pxVol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(String str) {
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimpleEarnNeedTransfer(String str) {
        this.simpleEarnNeedTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTgtCcy(String str) {
        this.tgtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeAvail(String str) {
        this.tradeAvail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_feReq(boolean z) {
        this._feReq = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizTradeOrderReq(instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", ordType=" + this.ordType + ", sz=" + this.sz + ", _feReq=" + this._feReq + ", posSide=" + this.posSide + ", px=" + this.px + ", reduceOnly=" + this.reduceOnly + ", bboType=" + this.bboType + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", ccy=" + this.ccy + ", tgtCcy=" + this.tgtCcy + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", isFullPercent=" + this.isFullPercent + ", quickMgnType=" + this.quickMgnType + ", cost=" + this.cost + ", orderSignType=" + this.orderSignType + ", attachAlgoOrds=" + this.attachAlgoOrds + ", pxUsd=" + this.pxUsd + ", pxVol=" + this.pxVol + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", banAmend=" + this.banAmend + ", assetNeedTransfer=" + this.assetNeedTransfer + ", simpleEarnNeedTransfer=" + this.simpleEarnNeedTransfer + ", tradeAvail=" + this.tradeAvail + ", orderValue=" + this.orderValue + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", tag=" + this.tag + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizTradeOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizTradeOrderReq> serializer() {
            return BizTradeOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizTradeOrderReq(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool2, String str17, String str18, String str19, ArrayList arrayList, String str20, String str21, Boolean bool3, String str22, String str23, String str24, String str25, String str26, String str27, String str28, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{31, 0}, BizTradeOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.ordType = str4;
        this.sz = str5;
        if ((i & 32) == 0) {
            this._feReq = true;
        } else {
            this._feReq = z;
        }
        if ((i & 64) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str6;
        }
        if ((i & 128) == 0) {
            this.px = null;
        } else {
            this.px = str7;
        }
        if ((i & 256) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((i & 512) == 0) {
            this.bboType = null;
        } else {
            this.bboType = str8;
        }
        if ((i & 1024) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str9;
        }
        if ((i & 2048) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str10;
        }
        if ((i & 4096) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str11;
        }
        if ((i & 8192) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str12;
        }
        if ((i & 16384) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str13;
        }
        if ((32768 & i) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str14;
        }
        if ((65536 & i) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str15;
        }
        if ((131072 & i) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str16;
        }
        if ((262144 & i) == 0) {
            this.isFullPercent = null;
        } else {
            this.isFullPercent = bool2;
        }
        if ((524288 & i) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str17;
        }
        if ((1048576 & i) == 0) {
            this.cost = null;
        } else {
            this.cost = str18;
        }
        if ((2097152 & i) == 0) {
            this.orderSignType = null;
        } else {
            this.orderSignType = str19;
        }
        if ((4194304 & i) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = arrayList;
        }
        if ((8388608 & i) == 0) {
            this.pxUsd = null;
        } else {
            this.pxUsd = str20;
        }
        if ((16777216 & i) == 0) {
            this.pxVol = null;
        } else {
            this.pxVol = str21;
        }
        if ((33554432 & i) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool3;
        }
        if ((67108864 & i) == 0) {
            this.banAmend = null;
        } else {
            this.banAmend = str22;
        }
        if ((134217728 & i) == 0) {
            this.assetNeedTransfer = null;
        } else {
            this.assetNeedTransfer = str23;
        }
        if ((268435456 & i) == 0) {
            this.simpleEarnNeedTransfer = null;
        } else {
            this.simpleEarnNeedTransfer = str24;
        }
        if ((536870912 & i) == 0) {
            this.tradeAvail = null;
        } else {
            this.tradeAvail = str25;
        }
        if ((1073741824 & i) == 0) {
            this.orderValue = null;
        } else {
            this.orderValue = str26;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str27;
        }
        if ((i2 & 1) == 0) {
            this.tag = null;
        } else {
            this.tag = str28;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizTradeOrderReq bizTradeOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizTradeOrderReq.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bizTradeOrderReq.tdMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bizTradeOrderReq.side);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, bizTradeOrderReq.ordType);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, bizTradeOrderReq.sz);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !bizTradeOrderReq._feReq) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, bizTradeOrderReq._feReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bizTradeOrderReq.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bizTradeOrderReq.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bizTradeOrderReq.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bizTradeOrderReq.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bizTradeOrderReq.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bizTradeOrderReq.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bizTradeOrderReq.bboType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, bizTradeOrderReq.bboType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || bizTradeOrderReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, bizTradeOrderReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || bizTradeOrderReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, bizTradeOrderReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || bizTradeOrderReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, bizTradeOrderReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || bizTradeOrderReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, bizTradeOrderReq.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || bizTradeOrderReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, bizTradeOrderReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || bizTradeOrderReq.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, bizTradeOrderReq.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || bizTradeOrderReq.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, bizTradeOrderReq.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || bizTradeOrderReq.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, bizTradeOrderReq.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || bizTradeOrderReq.isFullPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bizTradeOrderReq.isFullPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || bizTradeOrderReq.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, bizTradeOrderReq.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || bizTradeOrderReq.cost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, bizTradeOrderReq.cost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || bizTradeOrderReq.orderSignType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, bizTradeOrderReq.orderSignType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || bizTradeOrderReq.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, kSerializerArr[22], bizTradeOrderReq.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || bizTradeOrderReq.pxUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, bizTradeOrderReq.pxUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || bizTradeOrderReq.pxVol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, bizTradeOrderReq.pxVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || bizTradeOrderReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, BooleanSerializer.INSTANCE, bizTradeOrderReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || bizTradeOrderReq.banAmend != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, bizTradeOrderReq.banAmend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || bizTradeOrderReq.assetNeedTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, bizTradeOrderReq.assetNeedTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || bizTradeOrderReq.simpleEarnNeedTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, bizTradeOrderReq.simpleEarnNeedTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || bizTradeOrderReq.tradeAvail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, bizTradeOrderReq.tradeAvail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || bizTradeOrderReq.orderValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, bizTradeOrderReq.orderValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || bizTradeOrderReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, bizTradeOrderReq.tradeQuoteCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) && bizTradeOrderReq.tag == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, bizTradeOrderReq.tag);
    }

    public BizTradeOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool2, String str17, String str18, String str19, ArrayList<TradeOrderStopParam> arrayList, String str20, String str21, Boolean bool3, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.ordType = str4;
        this.sz = str5;
        this._feReq = z;
        this.posSide = str6;
        this.px = str7;
        this.reduceOnly = bool;
        this.bboType = str8;
        this.tpTriggerPx = str9;
        this.tpOrdPx = str10;
        this.slTriggerPx = str11;
        this.slOrdPx = str12;
        this.ccy = str13;
        this.tgtCcy = str14;
        this.tpTriggerPxType = str15;
        this.slTriggerPxType = str16;
        this.isFullPercent = bool2;
        this.quickMgnType = str17;
        this.cost = str18;
        this.orderSignType = str19;
        this.attachAlgoOrds = arrayList;
        this.pxUsd = str20;
        this.pxVol = str21;
        this.isTradeBorrowMode = bool3;
        this.banAmend = str22;
        this.assetNeedTransfer = str23;
        this.simpleEarnNeedTransfer = str24;
        this.tradeAvail = str25;
        this.orderValue = str26;
        this.tradeQuoteCcy = str27;
        this.tag = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0117: CONSTRUCTOR 
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r71v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r43v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r71v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r71v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r71v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r46v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r71v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r71v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r71v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r71v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r71v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r71v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (32768 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (65536 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (131072 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0078: ARITH (262144 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r56v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (524288 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (1048576 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (2097152 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x00a0: ARITH (4194304 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r60v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (8388608 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (16777216 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00be: ARITH (33554432 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r63v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c8: ARITH (67108864 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (134217728 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (268435456 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (536870912 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (1073741824 int) & (r71v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r71v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0102: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:407) call: com.okinc.unify_trade.biz.BizTradeOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizTradeOrderReq(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool2, String str17, String str18, String str19, ArrayList arrayList, String str20, String str21, Boolean bool3, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? null : str14, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : str16, (262144 & i) != 0 ? null : bool2, (524288 & i) != 0 ? null : str17, (1048576 & i) != 0 ? null : str18, (2097152 & i) != 0 ? null : str19, (4194304 & i) != 0 ? null : arrayList, (8388608 & i) != 0 ? null : str20, (16777216 & i) != 0 ? null : str21, (33554432 & i) != 0 ? null : bool3, (67108864 & i) != 0 ? null : str22, (134217728 & i) != 0 ? null : str23, (268435456 & i) != 0 ? null : str24, (536870912 & i) != 0 ? null : str25, (1073741824 & i) != 0 ? null : str26, (i & Integer.MIN_VALUE) != 0 ? null : str27, (i2 & 1) != 0 ? null : str28);
    }

    public final void setOptional(OptionalTradeOrderReq optionalTradeOrderReq) {
        if (optionalTradeOrderReq != null) {
            this.posSide = optionalTradeOrderReq.getPosSide();
            this.px = optionalTradeOrderReq.getPx();
            this.reduceOnly = optionalTradeOrderReq.getReduceOnly();
            this.bboType = optionalTradeOrderReq.getBboType();
            this.ccy = optionalTradeOrderReq.getCcy();
            this.tgtCcy = optionalTradeOrderReq.getTgtCcy();
            this.quickMgnType = optionalTradeOrderReq.getQuickMgnType();
            this.cost = optionalTradeOrderReq.getCost();
            this.pxUsd = optionalTradeOrderReq.getPxUsd();
            this.pxVol = optionalTradeOrderReq.getPxVol();
            this.isTradeBorrowMode = optionalTradeOrderReq.isTradeBorrowMode();
            this.banAmend = optionalTradeOrderReq.getBanAmend();
            this.assetNeedTransfer = C33129mqd.AEQbTJ(optionalTradeOrderReq.getAssetNeedTransfer(), 0) ? optionalTradeOrderReq.getAssetNeedTransfer() : null;
            this.simpleEarnNeedTransfer = C33129mqd.AEQbTJ(optionalTradeOrderReq.getSimpleEarnNeedTransfer(), 0) ? optionalTradeOrderReq.getSimpleEarnNeedTransfer() : null;
            this.tradeAvail = C33129mqd.AEQbTJ(optionalTradeOrderReq.getTradeAvail(), 0) ? optionalTradeOrderReq.getTradeAvail() : null;
            this.orderValue = optionalTradeOrderReq.getOrderValue();
            this.tradeQuoteCcy = optionalTradeOrderReq.getTradeQuoteCcy();
        }
    }

    public final void setAttachOrderStopInfo(ArrayList<TradeOrderStopParam> arrayList) {
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                i++;
            }
        } else {
            arrayList = null;
        }
        this.attachAlgoOrds = arrayList;
    }
}
