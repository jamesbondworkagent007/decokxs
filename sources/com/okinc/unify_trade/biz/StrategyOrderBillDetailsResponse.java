package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.math.RoundingMode;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C56390yDp;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyOrderBillDetailsResponse {
    private String accFillSz;
    private String algoId;
    private String algoOrdType;
    private String avgPx;
    private String baseFee;
    private String cTime;
    private String ccy;
    private String clientOrdId;
    private String ctVal;
    private String cycleId;
    private String dcaOrdType;
    private String displayId;
    private final String fee;
    private String feeCcy;
    private final String feeType;
    private String groupId;
    private String instId;
    private String instType;
    private String lever;
    private String mgnCcy;
    private String ordId;
    private String ordType;
    private String orderTag;
    private String pnl;
    private String pnlCcy;
    private String pnlRatio;
    private String posSide;
    private String px;
    private String quoteFee;
    private String rebate;
    private String rebateCcy;
    private String reduceOnly;
    private String side;
    private String state;
    private final String strategyOrderType;
    private String sz;
    private String tdMode;
    private final String tradeQuoteCcy;
    private String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyOrderBillDetailsResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.quoteFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.clientOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.mgnCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.dcaOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.strategyOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyOrderBillDetailsResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, String str30, String str31, String str32, String str33, @NotNull String str34, @NotNull String str35, String str36, String str37, @NotNull String str38, @NotNull String str39) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        return new StrategyOrderBillDetailsResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyOrderBillDetailsResponse)) {
            return false;
        }
        StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse = (StrategyOrderBillDetailsResponse) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) strategyOrderBillDetailsResponse.cTime) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyOrderBillDetailsResponse.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyOrderBillDetailsResponse.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) strategyOrderBillDetailsResponse.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyOrderBillDetailsResponse.posSide) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyOrderBillDetailsResponse.lever) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyOrderBillDetailsResponse.ordType) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyOrderBillDetailsResponse.sz) && Intrinsics.EZpvd((Object) this.px, (Object) strategyOrderBillDetailsResponse.px) && Intrinsics.EZpvd((Object) this.accFillSz, (Object) strategyOrderBillDetailsResponse.accFillSz) && Intrinsics.EZpvd((Object) this.avgPx, (Object) strategyOrderBillDetailsResponse.avgPx) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) strategyOrderBillDetailsResponse.pnlRatio) && Intrinsics.EZpvd((Object) this.pnl, (Object) strategyOrderBillDetailsResponse.pnl) && Intrinsics.EZpvd((Object) this.baseFee, (Object) strategyOrderBillDetailsResponse.baseFee) && Intrinsics.EZpvd((Object) this.quoteFee, (Object) strategyOrderBillDetailsResponse.quoteFee) && Intrinsics.EZpvd((Object) this.groupId, (Object) strategyOrderBillDetailsResponse.groupId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) strategyOrderBillDetailsResponse.algoOrdType) && Intrinsics.EZpvd((Object) this.instType, (Object) strategyOrderBillDetailsResponse.instType) && Intrinsics.EZpvd((Object) this.state, (Object) strategyOrderBillDetailsResponse.state) && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyOrderBillDetailsResponse.algoId) && Intrinsics.EZpvd((Object) this.ordId, (Object) strategyOrderBillDetailsResponse.ordId) && Intrinsics.EZpvd((Object) this.clientOrdId, (Object) strategyOrderBillDetailsResponse.clientOrdId) && Intrinsics.EZpvd((Object) this.ctVal, (Object) strategyOrderBillDetailsResponse.ctVal) && Intrinsics.EZpvd((Object) this.mgnCcy, (Object) strategyOrderBillDetailsResponse.mgnCcy) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyOrderBillDetailsResponse.ccy) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) strategyOrderBillDetailsResponse.pnlCcy) && Intrinsics.EZpvd((Object) this.uTime, (Object) strategyOrderBillDetailsResponse.uTime) && Intrinsics.EZpvd((Object) this.cycleId, (Object) strategyOrderBillDetailsResponse.cycleId) && Intrinsics.EZpvd((Object) this.dcaOrdType, (Object) strategyOrderBillDetailsResponse.dcaOrdType) && Intrinsics.EZpvd((Object) this.rebate, (Object) strategyOrderBillDetailsResponse.rebate) && Intrinsics.EZpvd((Object) this.rebateCcy, (Object) strategyOrderBillDetailsResponse.rebateCcy) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) strategyOrderBillDetailsResponse.reduceOnly) && Intrinsics.EZpvd((Object) this.orderTag, (Object) strategyOrderBillDetailsResponse.orderTag) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) strategyOrderBillDetailsResponse.feeCcy) && Intrinsics.EZpvd((Object) this.displayId, (Object) strategyOrderBillDetailsResponse.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyOrderBillDetailsResponse.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.feeType, (Object) strategyOrderBillDetailsResponse.feeType) && Intrinsics.EZpvd((Object) this.fee, (Object) strategyOrderBillDetailsResponse.fee) && Intrinsics.EZpvd((Object) this.strategyOrderType, (Object) strategyOrderBillDetailsResponse.strategyOrderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccFillSz() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientOrdId() {
        return this.clientOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcaOrdType() {
        return this.dcaOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeType() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnCcy() {
        return this.mgnCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTag() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlCcy() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
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
    public final String getQuoteFee() {
        return this.quoteFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebate() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebateCcy() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyOrderType() {
        return this.strategyOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.cTime.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.tdMode.hashCode();
        int iHashCode4 = this.side.hashCode();
        int iHashCode5 = this.posSide.hashCode();
        int iHashCode6 = this.lever.hashCode();
        int iHashCode7 = this.ordType.hashCode();
        int iHashCode8 = this.sz.hashCode();
        int iHashCode9 = this.px.hashCode();
        int iHashCode10 = this.accFillSz.hashCode();
        int iHashCode11 = this.avgPx.hashCode();
        int iHashCode12 = this.pnlRatio.hashCode();
        int iHashCode13 = this.pnl.hashCode();
        int iHashCode14 = this.baseFee.hashCode();
        int iHashCode15 = this.quoteFee.hashCode();
        int iHashCode16 = this.groupId.hashCode();
        int iHashCode17 = this.algoOrdType.hashCode();
        int iHashCode18 = this.instType.hashCode();
        int iHashCode19 = this.state.hashCode();
        int iHashCode20 = this.algoId.hashCode();
        int iHashCode21 = this.ordId.hashCode();
        int iHashCode22 = this.clientOrdId.hashCode();
        int iHashCode23 = this.ctVal.hashCode();
        int iHashCode24 = this.mgnCcy.hashCode();
        int iHashCode25 = this.ccy.hashCode();
        int iHashCode26 = this.pnlCcy.hashCode();
        int iHashCode27 = this.uTime.hashCode();
        int iHashCode28 = this.cycleId.hashCode();
        int iHashCode29 = this.dcaOrdType.hashCode();
        String str = this.rebate;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        String str2 = this.rebateCcy;
        int iHashCode31 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.reduceOnly;
        int iHashCode32 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.orderTag;
        int iHashCode33 = str4 == null ? 0 : str4.hashCode();
        int iHashCode34 = this.feeCcy.hashCode();
        int iHashCode35 = this.displayId.hashCode();
        String str5 = this.tradeQuoteCcy;
        int iHashCode36 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.feeType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.fee.hashCode()) * 31) + this.strategyOrderType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccFillSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accFillSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clientOrdId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cycleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDcaOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dcaOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderTag(String str) {
        this.orderTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebate(String str) {
        this.rebate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebateCcy(String str) {
        this.rebateCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(String str) {
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyOrderBillDetailsResponse(cTime=" + this.cTime + ", instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", posSide=" + this.posSide + ", lever=" + this.lever + ", ordType=" + this.ordType + ", sz=" + this.sz + ", px=" + this.px + ", accFillSz=" + this.accFillSz + ", avgPx=" + this.avgPx + ", pnlRatio=" + this.pnlRatio + ", pnl=" + this.pnl + ", baseFee=" + this.baseFee + ", quoteFee=" + this.quoteFee + ", groupId=" + this.groupId + ", algoOrdType=" + this.algoOrdType + ", instType=" + this.instType + ", state=" + this.state + ", algoId=" + this.algoId + ", ordId=" + this.ordId + ", clientOrdId=" + this.clientOrdId + ", ctVal=" + this.ctVal + ", mgnCcy=" + this.mgnCcy + ", ccy=" + this.ccy + ", pnlCcy=" + this.pnlCcy + ", uTime=" + this.uTime + ", cycleId=" + this.cycleId + ", dcaOrdType=" + this.dcaOrdType + ", rebate=" + this.rebate + ", rebateCcy=" + this.rebateCcy + ", reduceOnly=" + this.reduceOnly + ", orderTag=" + this.orderTag + ", feeCcy=" + this.feeCcy + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", feeType=" + this.feeType + ", fee=" + this.fee + ", strategyOrderType=" + this.strategyOrderType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyOrderBillDetailsResponse> serializer() {
            return StrategyOrderBillDetailsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyOrderBillDetailsResponse(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str3;
        }
        if ((i & 8) == 0) {
            this.side = "";
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str5;
        }
        if ((i & 32) == 0) {
            this.lever = "";
        } else {
            this.lever = str6;
        }
        if ((i & 64) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str7;
        }
        if ((i & 128) == 0) {
            this.sz = "";
        } else {
            this.sz = str8;
        }
        if ((i & 256) == 0) {
            this.px = "";
        } else {
            this.px = str9;
        }
        if ((i & 512) == 0) {
            this.accFillSz = "";
        } else {
            this.accFillSz = str10;
        }
        if ((i & 1024) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str11;
        }
        if ((i & 2048) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str12;
        }
        if ((i & 4096) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str13;
        }
        if ((i & 8192) == 0) {
            this.baseFee = "";
        } else {
            this.baseFee = str14;
        }
        if ((i & 16384) == 0) {
            this.quoteFee = "";
        } else {
            this.quoteFee = str15;
        }
        if ((32768 & i) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str16;
        }
        if ((65536 & i) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str17;
        }
        if ((131072 & i) == 0) {
            this.instType = "";
        } else {
            this.instType = str18;
        }
        if ((262144 & i) == 0) {
            this.state = "";
        } else {
            this.state = str19;
        }
        if ((524288 & i) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str20;
        }
        if ((1048576 & i) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str21;
        }
        if ((2097152 & i) == 0) {
            this.clientOrdId = "";
        } else {
            this.clientOrdId = str22;
        }
        if ((4194304 & i) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str23;
        }
        if ((8388608 & i) == 0) {
            this.mgnCcy = "";
        } else {
            this.mgnCcy = str24;
        }
        if ((16777216 & i) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str25;
        }
        if ((33554432 & i) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str26;
        }
        if ((67108864 & i) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str27;
        }
        if ((134217728 & i) == 0) {
            this.cycleId = "";
        } else {
            this.cycleId = str28;
        }
        if ((268435456 & i) == 0) {
            this.dcaOrdType = "";
        } else {
            this.dcaOrdType = str29;
        }
        if ((536870912 & i) == 0) {
            this.rebate = null;
        } else {
            this.rebate = str30;
        }
        if ((1073741824 & i) == 0) {
            this.rebateCcy = null;
        } else {
            this.rebateCcy = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = str32;
        }
        if ((i2 & 1) == 0) {
            this.orderTag = null;
        } else {
            this.orderTag = str33;
        }
        if ((i2 & 2) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str34;
        }
        if ((i2 & 4) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str35;
        }
        if ((i2 & 8) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str36;
        }
        if ((i2 & 16) == 0) {
            this.feeType = null;
        } else {
            this.feeType = str37;
        }
        if ((i2 & 32) == 0) {
            this.fee = "";
        } else {
            this.fee = str38;
        }
        if ((i2 & 64) == 0) {
            this.strategyOrderType = "";
        } else {
            this.strategyOrderType = str39;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyOrderBillDetailsResponse.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyOrderBillDetailsResponse.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyOrderBillDetailsResponse.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyOrderBillDetailsResponse.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyOrderBillDetailsResponse.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyOrderBillDetailsResponse.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyOrderBillDetailsResponse.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyOrderBillDetailsResponse.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyOrderBillDetailsResponse.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.accFillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyOrderBillDetailsResponse.accFillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyOrderBillDetailsResponse.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyOrderBillDetailsResponse.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyOrderBillDetailsResponse.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.baseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyOrderBillDetailsResponse.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.quoteFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyOrderBillDetailsResponse.quoteFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyOrderBillDetailsResponse.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyOrderBillDetailsResponse.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyOrderBillDetailsResponse.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyOrderBillDetailsResponse.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyOrderBillDetailsResponse.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyOrderBillDetailsResponse.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.clientOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyOrderBillDetailsResponse.clientOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyOrderBillDetailsResponse.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.mgnCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyOrderBillDetailsResponse.mgnCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyOrderBillDetailsResponse.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyOrderBillDetailsResponse.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyOrderBillDetailsResponse.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.cycleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyOrderBillDetailsResponse.cycleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.dcaOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyOrderBillDetailsResponse.dcaOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || strategyOrderBillDetailsResponse.rebate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, strategyOrderBillDetailsResponse.rebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || strategyOrderBillDetailsResponse.rebateCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, strategyOrderBillDetailsResponse.rebateCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || strategyOrderBillDetailsResponse.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, strategyOrderBillDetailsResponse.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || strategyOrderBillDetailsResponse.orderTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, strategyOrderBillDetailsResponse.orderTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyOrderBillDetailsResponse.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyOrderBillDetailsResponse.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || strategyOrderBillDetailsResponse.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, strategyOrderBillDetailsResponse.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || strategyOrderBillDetailsResponse.feeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, strategyOrderBillDetailsResponse.feeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyOrderBillDetailsResponse.fee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) && Intrinsics.EZpvd((Object) strategyOrderBillDetailsResponse.strategyOrderType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 38, strategyOrderBillDetailsResponse.strategyOrderType);
    }

    public StrategyOrderBillDetailsResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, String str30, String str31, String str32, String str33, @NotNull String str34, @NotNull String str35, String str36, String str37, @NotNull String str38, @NotNull String str39) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        this.cTime = str;
        this.instId = str2;
        this.tdMode = str3;
        this.side = str4;
        this.posSide = str5;
        this.lever = str6;
        this.ordType = str7;
        this.sz = str8;
        this.px = str9;
        this.accFillSz = str10;
        this.avgPx = str11;
        this.pnlRatio = str12;
        this.pnl = str13;
        this.baseFee = str14;
        this.quoteFee = str15;
        this.groupId = str16;
        this.algoOrdType = str17;
        this.instType = str18;
        this.state = str19;
        this.algoId = str20;
        this.ordId = str21;
        this.clientOrdId = str22;
        this.ctVal = str23;
        this.mgnCcy = str24;
        this.ccy = str25;
        this.pnlCcy = str26;
        this.uTime = str27;
        this.cycleId = str28;
        this.dcaOrdType = str29;
        this.rebate = str30;
        this.rebateCcy = str31;
        this.reduceOnly = str32;
        this.orderTag = str33;
        this.feeCcy = str34;
        this.displayId = str35;
        this.tradeQuoteCcy = str36;
        this.feeType = str37;
        this.fee = str38;
        this.strategyOrderType = str39;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01ca: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r79v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r79v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r79v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r79v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r79v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r79v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r79v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r79v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r79v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r79v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r79v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r79v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r79v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r79v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r79v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r79v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r79v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r79v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r79v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r79v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r79v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r79v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r79v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r79v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r79v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r79v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r79v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r79v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r79v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r79v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r79v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r79v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r80v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0146: ARITH (r80v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014f: ARITH (r80v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0158: ARITH (r80v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0161: ARITH (r80v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r76v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0168: ARITH (r80v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0171: ARITH (r80v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1876) call: com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyOrderBillDetailsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? null : str30, (i & 1073741824) != 0 ? null : str31, (i & Integer.MIN_VALUE) != 0 ? null : str32, (i2 & 1) != 0 ? null : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? null : str36, (i2 & 16) == 0 ? str37 : null, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39);
    }

    public final String takeNonBlankTradeQuoteCcy() {
        String str = this.tradeQuoteCcy;
        if (str == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
            return null;
        }
        return str;
    }

    public final Pair<String, String> getBuySellPercentData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.px.length() == 0 || str.length() == 0) {
            return C56390yDp.OLrzqt("", "");
        }
        String strDivS$default = C33129mqd.divS$default(C33129mqd.subS$default(this.px, str, null, null, null, 14, null), str, null, null, null, 14, null);
        return C56390yDp.OLrzqt(strDivS$default, xMR.formatPercentWithSymbol$default(xMR.copydefault, strDivS$default, 2, 0, RoundingMode.DOWN, 4, null));
    }
}
