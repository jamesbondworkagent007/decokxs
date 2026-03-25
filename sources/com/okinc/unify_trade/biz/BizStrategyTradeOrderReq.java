package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam$$serializer;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizStrategyTradeOrderReq {
    private String _last;
    private String advanceOrdType;
    private List<TradeOrderStopParam> attachAlgoOrds;
    private String banAmend;
    private String ccy;
    private String closeFraction;
    private Boolean cxlOnClosePos;
    private String instId;
    private Boolean isTPLimit;
    private Boolean isTradeBorrowMode;
    private String ordType;
    private String orderPx;
    private String posSide;
    private String proposedPx;
    private String quickMgnType;
    private Boolean reduceOnly;
    private String side;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String sz;
    private String tag;
    private String tdMode;
    private String tgtCcy;
    private String tpOrdKind;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tradeQuoteCcy;
    private String triggerPx;
    private String triggerPxType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TradeOrderStopParam$$serializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.orderPx;
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
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.proposedPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component23() {
        return this.cxlOnClosePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeOrderStopParam> component24() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component25() {
        return this.isTPLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this._last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizStrategyTradeOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, String str19, String str20, String str21, Boolean bool2, List<TradeOrderStopParam> list, Boolean bool3, String str22, Boolean bool4, String str23, String str24, String str25, String str26) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new BizStrategyTradeOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, bool, str19, str20, str21, bool2, list, bool3, str22, bool4, str23, str24, str25, str26);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizStrategyTradeOrderReq)) {
            return false;
        }
        BizStrategyTradeOrderReq bizStrategyTradeOrderReq = (BizStrategyTradeOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) bizStrategyTradeOrderReq.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) bizStrategyTradeOrderReq.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) bizStrategyTradeOrderReq.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) bizStrategyTradeOrderReq.posSide) && Intrinsics.EZpvd((Object) this.ccy, (Object) bizStrategyTradeOrderReq.ccy) && Intrinsics.EZpvd((Object) this.ordType, (Object) bizStrategyTradeOrderReq.ordType) && Intrinsics.EZpvd((Object) this.sz, (Object) bizStrategyTradeOrderReq.sz) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) bizStrategyTradeOrderReq.closeFraction) && Intrinsics.EZpvd((Object) this._last, (Object) bizStrategyTradeOrderReq._last) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) bizStrategyTradeOrderReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) bizStrategyTradeOrderReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) bizStrategyTradeOrderReq.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) bizStrategyTradeOrderReq.slOrdPx) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) bizStrategyTradeOrderReq.triggerPx) && Intrinsics.EZpvd((Object) this.orderPx, (Object) bizStrategyTradeOrderReq.orderPx) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) bizStrategyTradeOrderReq.tgtCcy) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) bizStrategyTradeOrderReq.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) bizStrategyTradeOrderReq.slTriggerPxType) && Intrinsics.EZpvd(this.reduceOnly, bizStrategyTradeOrderReq.reduceOnly) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) bizStrategyTradeOrderReq.triggerPxType) && Intrinsics.EZpvd((Object) this.proposedPx, (Object) bizStrategyTradeOrderReq.proposedPx) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) bizStrategyTradeOrderReq.quickMgnType) && Intrinsics.EZpvd(this.cxlOnClosePos, bizStrategyTradeOrderReq.cxlOnClosePos) && Intrinsics.EZpvd(this.attachAlgoOrds, bizStrategyTradeOrderReq.attachAlgoOrds) && Intrinsics.EZpvd(this.isTPLimit, bizStrategyTradeOrderReq.isTPLimit) && Intrinsics.EZpvd((Object) this.tpOrdKind, (Object) bizStrategyTradeOrderReq.tpOrdKind) && Intrinsics.EZpvd(this.isTradeBorrowMode, bizStrategyTradeOrderReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.banAmend, (Object) bizStrategyTradeOrderReq.banAmend) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) bizStrategyTradeOrderReq.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) bizStrategyTradeOrderReq.advanceOrdType) && Intrinsics.EZpvd((Object) this.tag, (Object) bizStrategyTradeOrderReq.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceOrdType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeOrderStopParam> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBanAmend() {
        return this.banAmend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCxlOnClosePos() {
        return this.cxlOnClosePos;
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
    public final String getOrderPx() {
        return this.orderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposedPx() {
        return this.proposedPx;
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
    public final String getTpOrdKind() {
        return this.tpOrdKind;
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
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_last() {
        return this._last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.tdMode.hashCode();
        int iHashCode3 = this.side.hashCode();
        String str = this.posSide;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.ccy;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.ordType.hashCode();
        String str3 = this.sz;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.closeFraction;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        int iHashCode9 = this._last.hashCode();
        String str5 = this.tpTriggerPx;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tpOrdPx;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.slTriggerPx;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.slOrdPx;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.triggerPx;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.orderPx;
        int iHashCode15 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tgtCcy;
        int iHashCode16 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tpTriggerPxType;
        int iHashCode17 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.slTriggerPxType;
        int iHashCode18 = str13 == null ? 0 : str13.hashCode();
        Boolean bool = this.reduceOnly;
        int iHashCode19 = bool == null ? 0 : bool.hashCode();
        String str14 = this.triggerPxType;
        int iHashCode20 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.proposedPx;
        int iHashCode21 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.quickMgnType;
        int iHashCode22 = str16 == null ? 0 : str16.hashCode();
        Boolean bool2 = this.cxlOnClosePos;
        int iHashCode23 = bool2 == null ? 0 : bool2.hashCode();
        List<TradeOrderStopParam> list = this.attachAlgoOrds;
        int iHashCode24 = list == null ? 0 : list.hashCode();
        Boolean bool3 = this.isTPLimit;
        int iHashCode25 = bool3 == null ? 0 : bool3.hashCode();
        String str17 = this.tpOrdKind;
        int iHashCode26 = str17 == null ? 0 : str17.hashCode();
        Boolean bool4 = this.isTradeBorrowMode;
        int iHashCode27 = bool4 == null ? 0 : bool4.hashCode();
        String str18 = this.banAmend;
        int iHashCode28 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.tradeQuoteCcy;
        int iHashCode29 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.advanceOrdType;
        int iHashCode30 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.tag;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str21 == null ? 0 : str21.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTPLimit() {
        return this.isTPLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdvanceOrdType(String str) {
        this.advanceOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(List<TradeOrderStopParam> list) {
        this.attachAlgoOrds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachOrderStopInfo(List<TradeOrderStopParam> list) {
        this.attachAlgoOrds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBanAmend(String str) {
        this.banAmend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseFraction(String str) {
        this.closeFraction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCxlOnClosePos(Boolean bool) {
        this.cxlOnClosePos = bool;
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
    public final void setOrderPx(String str) {
        this.orderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposedPx(String str) {
        this.proposedPx = str;
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
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPLimit(Boolean bool) {
        this.isTPLimit = bool;
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
    public final void setTpOrdKind(String str) {
        this.tpOrdKind = str;
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
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(String str) {
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_last(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizStrategyTradeOrderReq(instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", posSide=" + this.posSide + ", ccy=" + this.ccy + ", ordType=" + this.ordType + ", sz=" + this.sz + ", closeFraction=" + this.closeFraction + ", _last=" + this._last + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", triggerPx=" + this.triggerPx + ", orderPx=" + this.orderPx + ", tgtCcy=" + this.tgtCcy + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", reduceOnly=" + this.reduceOnly + ", triggerPxType=" + this.triggerPxType + ", proposedPx=" + this.proposedPx + ", quickMgnType=" + this.quickMgnType + ", cxlOnClosePos=" + this.cxlOnClosePos + ", attachAlgoOrds=" + this.attachAlgoOrds + ", isTPLimit=" + this.isTPLimit + ", tpOrdKind=" + this.tpOrdKind + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", banAmend=" + this.banAmend + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", advanceOrdType=" + this.advanceOrdType + ", tag=" + this.tag + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizStrategyTradeOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizStrategyTradeOrderReq> serializer() {
            return BizStrategyTradeOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizStrategyTradeOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, String str19, String str20, String str21, Boolean bool2, List list, Boolean bool3, String str22, Boolean bool4, String str23, String str24, String str25, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        if (319 != (i & 319)) {
            PluginExceptionsKt.throwMissingFieldException(i, 319, BizStrategyTradeOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.posSide = str4;
        this.ccy = str5;
        this.ordType = str6;
        if ((i & 64) == 0) {
            this.sz = null;
        } else {
            this.sz = str7;
        }
        if ((i & 128) == 0) {
            this.closeFraction = null;
        } else {
            this.closeFraction = str8;
        }
        this._last = str9;
        if ((i & 512) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str10;
        }
        if ((i & 1024) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str11;
        }
        if ((i & 2048) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str12;
        }
        if ((i & 4096) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str13;
        }
        if ((i & 8192) == 0) {
            this.triggerPx = null;
        } else {
            this.triggerPx = str14;
        }
        if ((i & 16384) == 0) {
            this.orderPx = null;
        } else {
            this.orderPx = str15;
        }
        if ((32768 & i) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str16;
        }
        if ((65536 & i) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str17;
        }
        if ((131072 & i) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str18;
        }
        if ((262144 & i) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((524288 & i) == 0) {
            this.triggerPxType = null;
        } else {
            this.triggerPxType = str19;
        }
        if ((1048576 & i) == 0) {
            this.proposedPx = null;
        } else {
            this.proposedPx = str20;
        }
        if ((2097152 & i) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str21;
        }
        if ((4194304 & i) == 0) {
            this.cxlOnClosePos = null;
        } else {
            this.cxlOnClosePos = bool2;
        }
        if ((8388608 & i) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = list;
        }
        if ((16777216 & i) == 0) {
            this.isTPLimit = null;
        } else {
            this.isTPLimit = bool3;
        }
        if ((33554432 & i) == 0) {
            this.tpOrdKind = null;
        } else {
            this.tpOrdKind = str22;
        }
        if ((67108864 & i) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool4;
        }
        if ((134217728 & i) == 0) {
            this.banAmend = null;
        } else {
            this.banAmend = str23;
        }
        if ((268435456 & i) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str24;
        }
        if ((536870912 & i) == 0) {
            this.advanceOrdType = null;
        } else {
            this.advanceOrdType = str25;
        }
        if ((i & 1073741824) == 0) {
            this.tag = null;
        } else {
            this.tag = str26;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizStrategyTradeOrderReq bizStrategyTradeOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizStrategyTradeOrderReq.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bizStrategyTradeOrderReq.tdMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bizStrategyTradeOrderReq.side);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, bizStrategyTradeOrderReq.posSide);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, bizStrategyTradeOrderReq.ccy);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, bizStrategyTradeOrderReq.ordType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || bizStrategyTradeOrderReq.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, bizStrategyTradeOrderReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || bizStrategyTradeOrderReq.closeFraction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, bizStrategyTradeOrderReq.closeFraction);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, bizStrategyTradeOrderReq._last);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bizStrategyTradeOrderReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, bizStrategyTradeOrderReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || bizStrategyTradeOrderReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, bizStrategyTradeOrderReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || bizStrategyTradeOrderReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, bizStrategyTradeOrderReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || bizStrategyTradeOrderReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, bizStrategyTradeOrderReq.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || bizStrategyTradeOrderReq.triggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, bizStrategyTradeOrderReq.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || bizStrategyTradeOrderReq.orderPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, bizStrategyTradeOrderReq.orderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || bizStrategyTradeOrderReq.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, bizStrategyTradeOrderReq.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || bizStrategyTradeOrderReq.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, bizStrategyTradeOrderReq.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || bizStrategyTradeOrderReq.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, bizStrategyTradeOrderReq.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || bizStrategyTradeOrderReq.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bizStrategyTradeOrderReq.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || bizStrategyTradeOrderReq.triggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, bizStrategyTradeOrderReq.triggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || bizStrategyTradeOrderReq.proposedPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, bizStrategyTradeOrderReq.proposedPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || bizStrategyTradeOrderReq.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, bizStrategyTradeOrderReq.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || bizStrategyTradeOrderReq.cxlOnClosePos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, bizStrategyTradeOrderReq.cxlOnClosePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || bizStrategyTradeOrderReq.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, kSerializerArr[23], bizStrategyTradeOrderReq.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || bizStrategyTradeOrderReq.isTPLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, BooleanSerializer.INSTANCE, bizStrategyTradeOrderReq.isTPLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || bizStrategyTradeOrderReq.tpOrdKind != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, bizStrategyTradeOrderReq.tpOrdKind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || bizStrategyTradeOrderReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, bizStrategyTradeOrderReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || bizStrategyTradeOrderReq.banAmend != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, stringSerializer, bizStrategyTradeOrderReq.banAmend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || bizStrategyTradeOrderReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, stringSerializer, bizStrategyTradeOrderReq.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || bizStrategyTradeOrderReq.advanceOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, stringSerializer, bizStrategyTradeOrderReq.advanceOrdType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && bizStrategyTradeOrderReq.tag == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, stringSerializer, bizStrategyTradeOrderReq.tag);
    }

    public BizStrategyTradeOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, String str19, String str20, String str21, Boolean bool2, List<TradeOrderStopParam> list, Boolean bool3, String str22, Boolean bool4, String str23, String str24, String str25, String str26) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.posSide = str4;
        this.ccy = str5;
        this.ordType = str6;
        this.sz = str7;
        this.closeFraction = str8;
        this._last = str9;
        this.tpTriggerPx = str10;
        this.tpOrdPx = str11;
        this.slTriggerPx = str12;
        this.slOrdPx = str13;
        this.triggerPx = str14;
        this.orderPx = str15;
        this.tgtCcy = str16;
        this.tpTriggerPxType = str17;
        this.slTriggerPxType = str18;
        this.reduceOnly = bool;
        this.triggerPxType = str19;
        this.proposedPx = str20;
        this.quickMgnType = str21;
        this.cxlOnClosePos = bool2;
        this.attachAlgoOrds = list;
        this.isTPLimit = bool3;
        this.tpOrdKind = str22;
        this.isTradeBorrowMode = bool4;
        this.banAmend = str23;
        this.tradeQuoteCcy = str24;
        this.advanceOrdType = str25;
        this.tag = str26;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f7: CONSTRUCTOR 
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r67v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r67v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (r44v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r67v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r67v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r67v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r67v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r67v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r67v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (32768 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (65536 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (131072 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (262144 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r54v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (524288 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (1048576 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (2097152 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (4194304 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r58v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0099: ARITH (8388608 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r59v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (16777216 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r60v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (33554432 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b7: ARITH (67108864 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r62v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c1: ARITH (134217728 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (268435456 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (536870912 int) & (r67v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r67v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam>, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:660) call: com.okinc.unify_trade.biz.BizStrategyTradeOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizStrategyTradeOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, String str19, String str20, String str21, Boolean bool2, List list, Boolean bool3, String str22, Boolean bool4, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (32768 & i) != 0 ? null : str16, (65536 & i) != 0 ? null : str17, (131072 & i) != 0 ? null : str18, (262144 & i) != 0 ? null : bool, (524288 & i) != 0 ? null : str19, (1048576 & i) != 0 ? null : str20, (2097152 & i) != 0 ? null : str21, (4194304 & i) != 0 ? null : bool2, (8388608 & i) != 0 ? null : list, (16777216 & i) != 0 ? null : bool3, (33554432 & i) != 0 ? null : str22, (67108864 & i) != 0 ? null : bool4, (134217728 & i) != 0 ? null : str23, (268435456 & i) != 0 ? null : str24, (536870912 & i) != 0 ? null : str25, (i & 1073741824) != 0 ? null : str26);
    }

    public final void setTriggerInfo(TriggerStrategyOrderReq triggerStrategyOrderReq) {
        if (triggerStrategyOrderReq != null) {
            this.triggerPx = triggerStrategyOrderReq.getTriggerPx();
            this.orderPx = triggerStrategyOrderReq.getOrderPx();
            this.triggerPxType = triggerStrategyOrderReq.getTriggerPxType();
            this.proposedPx = triggerStrategyOrderReq.getProposedPx();
        }
    }

    public final void setStopProfitInfo(TradeOrderSpReq tradeOrderSpReq) {
        if (tradeOrderSpReq != null) {
            this.tpTriggerPx = tradeOrderSpReq.getTpTriggerPx();
            this.tpOrdPx = tradeOrderSpReq.getTpOrdPx();
            this.slTriggerPx = tradeOrderSpReq.getSlTriggerPx();
            this.slOrdPx = tradeOrderSpReq.getSlOrdPx();
            this.tpTriggerPxType = tradeOrderSpReq.getTpTriggerPxType();
            this.slTriggerPxType = tradeOrderSpReq.getSlTriggerPxType();
        }
    }
}
