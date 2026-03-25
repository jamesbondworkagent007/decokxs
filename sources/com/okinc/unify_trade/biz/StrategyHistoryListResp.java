package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class StrategyHistoryListResp {
    private String actualSz;
    private String algoId;
    private String arbitrageNum;
    private String avgPx;
    private String baseSz;
    private String cTime;
    private String cancelType;
    private String ccy;
    private String completedCycles;
    private String ctVal;
    private String fillSafetyOrds;
    private String gridNum;
    private String instId;
    private String instType;
    private String investment;
    private String lever;
    private String maxPx;
    private String maxSafetyOrds;
    private String minPx;
    private String ordId;
    private String ordType;
    private String pnlRatio;
    private String posSide;
    private String profitNum;
    private String pxLimit;
    private String pxSpread;
    private String pxVar;
    private String quoteSz;
    private String runType;
    private String side;
    private String slOrderPx;
    private String slPx;
    private String slTriggerPx;
    private String state;
    private String stopResult;
    private String sz;
    private String szLimit;
    private String tdMode;
    private String timeInterval;
    private String totalPnl;
    private String tpOrderPx;
    private String tpPx;
    private String tpTriggerPx;
    private String tradeNum;
    private String triggerTime;
    private String triggerType;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHistoryListResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47) {
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
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        return new StrategyHistoryListResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyHistoryListResp)) {
            return false;
        }
        StrategyHistoryListResp strategyHistoryListResp = (StrategyHistoryListResp) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) strategyHistoryListResp.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) strategyHistoryListResp.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) strategyHistoryListResp.uly) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyHistoryListResp.ccy) && Intrinsics.EZpvd((Object) this.ctVal, (Object) strategyHistoryListResp.ctVal) && Intrinsics.EZpvd((Object) this.ordId, (Object) strategyHistoryListResp.ordId) && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyHistoryListResp.algoId) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyHistoryListResp.ordType) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyHistoryListResp.tdMode) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyHistoryListResp.lever) && Intrinsics.EZpvd((Object) this.state, (Object) strategyHistoryListResp.state) && Intrinsics.EZpvd((Object) this.triggerTime, (Object) strategyHistoryListResp.triggerTime) && Intrinsics.EZpvd((Object) this.cTime, (Object) strategyHistoryListResp.cTime) && Intrinsics.EZpvd((Object) this.pxVar, (Object) strategyHistoryListResp.pxVar) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) strategyHistoryListResp.pxSpread) && Intrinsics.EZpvd((Object) this.szLimit, (Object) strategyHistoryListResp.szLimit) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) strategyHistoryListResp.pxLimit) && Intrinsics.EZpvd((Object) this.actualSz, (Object) strategyHistoryListResp.actualSz) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyHistoryListResp.sz) && Intrinsics.EZpvd((Object) this.side, (Object) strategyHistoryListResp.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyHistoryListResp.posSide) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) strategyHistoryListResp.timeInterval) && Intrinsics.EZpvd((Object) this.maxPx, (Object) strategyHistoryListResp.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) strategyHistoryListResp.minPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) strategyHistoryListResp.gridNum) && Intrinsics.EZpvd((Object) this.runType, (Object) strategyHistoryListResp.runType) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) strategyHistoryListResp.quoteSz) && Intrinsics.EZpvd((Object) this.baseSz, (Object) strategyHistoryListResp.baseSz) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) strategyHistoryListResp.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) strategyHistoryListResp.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrderPx, (Object) strategyHistoryListResp.tpOrderPx) && Intrinsics.EZpvd((Object) this.slOrderPx, (Object) strategyHistoryListResp.slOrderPx) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) strategyHistoryListResp.tradeNum) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyHistoryListResp.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) strategyHistoryListResp.pnlRatio) && Intrinsics.EZpvd((Object) this.investment, (Object) strategyHistoryListResp.investment) && Intrinsics.EZpvd((Object) this.cancelType, (Object) strategyHistoryListResp.cancelType) && Intrinsics.EZpvd((Object) this.stopResult, (Object) strategyHistoryListResp.stopResult) && Intrinsics.EZpvd((Object) this.profitNum, (Object) strategyHistoryListResp.profitNum) && Intrinsics.EZpvd((Object) this.arbitrageNum, (Object) strategyHistoryListResp.arbitrageNum) && Intrinsics.EZpvd((Object) this.triggerType, (Object) strategyHistoryListResp.triggerType) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) strategyHistoryListResp.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) strategyHistoryListResp.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.avgPx, (Object) strategyHistoryListResp.avgPx) && Intrinsics.EZpvd((Object) this.tpPx, (Object) strategyHistoryListResp.tpPx) && Intrinsics.EZpvd((Object) this.slPx, (Object) strategyHistoryListResp.slPx) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) strategyHistoryListResp.completedCycles);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualSz() {
        return this.actualSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageNum() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelType() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSafetyOrds() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
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
    public final String getInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
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
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitNum() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrderPx() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPx() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopResult() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzLimit() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrderPx() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPx() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeNum() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.instType.hashCode() * 31) + this.instId.hashCode()) * 31) + this.uly.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.ctVal.hashCode()) * 31) + this.ordId.hashCode()) * 31) + this.algoId.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.tdMode.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.state.hashCode()) * 31) + this.triggerTime.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.pxVar.hashCode()) * 31) + this.pxSpread.hashCode()) * 31) + this.szLimit.hashCode()) * 31) + this.pxLimit.hashCode()) * 31) + this.actualSz.hashCode()) * 31) + this.sz.hashCode()) * 31) + this.side.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.timeInterval.hashCode()) * 31) + this.maxPx.hashCode()) * 31) + this.minPx.hashCode()) * 31) + this.gridNum.hashCode()) * 31) + this.runType.hashCode()) * 31) + this.quoteSz.hashCode()) * 31) + this.baseSz.hashCode()) * 31) + this.tpTriggerPx.hashCode()) * 31) + this.slTriggerPx.hashCode()) * 31) + this.tpOrderPx.hashCode()) * 31) + this.slOrderPx.hashCode()) * 31) + this.tradeNum.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.investment.hashCode()) * 31) + this.cancelType.hashCode()) * 31) + this.stopResult.hashCode()) * 31) + this.profitNum.hashCode()) * 31) + this.arbitrageNum.hashCode()) * 31) + this.triggerType.hashCode()) * 31) + this.maxSafetyOrds.hashCode()) * 31) + this.fillSafetyOrds.hashCode()) * 31) + this.avgPx.hashCode()) * 31) + this.tpPx.hashCode()) * 31) + this.slPx.hashCode()) * 31) + this.completedCycles.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitrageNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedCycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
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
    public final void setInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
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
    public final void setProfitNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSpread(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrderPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stopResult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.szLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrderPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyHistoryListResp(instType=" + this.instType + ", instId=" + this.instId + ", uly=" + this.uly + ", ccy=" + this.ccy + ", ctVal=" + this.ctVal + ", ordId=" + this.ordId + ", algoId=" + this.algoId + ", ordType=" + this.ordType + ", tdMode=" + this.tdMode + ", lever=" + this.lever + ", state=" + this.state + ", triggerTime=" + this.triggerTime + ", cTime=" + this.cTime + ", pxVar=" + this.pxVar + ", pxSpread=" + this.pxSpread + ", szLimit=" + this.szLimit + ", pxLimit=" + this.pxLimit + ", actualSz=" + this.actualSz + ", sz=" + this.sz + ", side=" + this.side + ", posSide=" + this.posSide + ", timeInterval=" + this.timeInterval + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridNum=" + this.gridNum + ", runType=" + this.runType + ", quoteSz=" + this.quoteSz + ", baseSz=" + this.baseSz + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpOrderPx=" + this.tpOrderPx + ", slOrderPx=" + this.slOrderPx + ", tradeNum=" + this.tradeNum + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", investment=" + this.investment + ", cancelType=" + this.cancelType + ", stopResult=" + this.stopResult + ", profitNum=" + this.profitNum + ", arbitrageNum=" + this.arbitrageNum + ", triggerType=" + this.triggerType + ", maxSafetyOrds=" + this.maxSafetyOrds + ", fillSafetyOrds=" + this.fillSafetyOrds + ", avgPx=" + this.avgPx + ", tpPx=" + this.tpPx + ", slPx=" + this.slPx + ", completedCycles=" + this.completedCycles + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyHistoryListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyHistoryListResp> serializer() {
            return StrategyHistoryListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyHistoryListResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, SerializationConstructorMarker serializationConstructorMarker) {
        if (32512 != (i2 & 32512)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{0, 32512}, StrategyHistoryListResp$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.uly = "";
        } else {
            this.uly = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str4;
        }
        if ((i & 16) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str5;
        }
        if ((i & 32) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str6;
        }
        if ((i & 64) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str7;
        }
        if ((i & 128) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str8;
        }
        if ((i & 256) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str9;
        }
        if ((i & 512) == 0) {
            this.lever = "";
        } else {
            this.lever = str10;
        }
        if ((i & 1024) == 0) {
            this.state = "";
        } else {
            this.state = str11;
        }
        if ((i & 2048) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str12;
        }
        if ((i & 4096) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str13;
        }
        if ((i & 8192) == 0) {
            this.pxVar = "";
        } else {
            this.pxVar = str14;
        }
        if ((i & 16384) == 0) {
            this.pxSpread = "";
        } else {
            this.pxSpread = str15;
        }
        if ((32768 & i) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str16;
        }
        if ((65536 & i) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str17;
        }
        if ((131072 & i) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str18;
        }
        if ((262144 & i) == 0) {
            this.sz = "";
        } else {
            this.sz = str19;
        }
        if ((524288 & i) == 0) {
            this.side = "";
        } else {
            this.side = str20;
        }
        if ((1048576 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str21;
        }
        if ((2097152 & i) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str22;
        }
        if ((4194304 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str23;
        }
        if ((8388608 & i) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str24;
        }
        if ((16777216 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str25;
        }
        if ((33554432 & i) == 0) {
            this.runType = "";
        } else {
            this.runType = str26;
        }
        if ((67108864 & i) == 0) {
            this.quoteSz = "";
        } else {
            this.quoteSz = str27;
        }
        if ((134217728 & i) == 0) {
            this.baseSz = "";
        } else {
            this.baseSz = str28;
        }
        if ((268435456 & i) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str29;
        }
        if ((536870912 & i) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str30;
        }
        if ((1073741824 & i) == 0) {
            this.tpOrderPx = "";
        } else {
            this.tpOrderPx = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.slOrderPx = "";
        } else {
            this.slOrderPx = str32;
        }
        if ((i2 & 1) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str33;
        }
        if ((i2 & 2) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str34;
        }
        if ((i2 & 4) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str35;
        }
        if ((i2 & 8) == 0) {
            this.investment = "";
        } else {
            this.investment = str36;
        }
        if ((i2 & 16) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str37;
        }
        if ((i2 & 32) == 0) {
            this.stopResult = "";
        } else {
            this.stopResult = str38;
        }
        if ((i2 & 64) == 0) {
            this.profitNum = "";
        } else {
            this.profitNum = str39;
        }
        if ((i2 & 128) == 0) {
            this.arbitrageNum = "";
        } else {
            this.arbitrageNum = str40;
        }
        this.triggerType = str41;
        this.maxSafetyOrds = str42;
        this.fillSafetyOrds = str43;
        this.avgPx = str44;
        this.tpPx = str45;
        this.slPx = str46;
        this.completedCycles = str47;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyHistoryListResp strategyHistoryListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyHistoryListResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyHistoryListResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyHistoryListResp.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyHistoryListResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyHistoryListResp.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyHistoryListResp.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyHistoryListResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyHistoryListResp.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyHistoryListResp.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyHistoryListResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyHistoryListResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyHistoryListResp.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyHistoryListResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pxVar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyHistoryListResp.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pxSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyHistoryListResp.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyHistoryListResp.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyHistoryListResp.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyHistoryListResp.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyHistoryListResp.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyHistoryListResp.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyHistoryListResp.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyHistoryListResp.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyHistoryListResp.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyHistoryListResp.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyHistoryListResp.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyHistoryListResp.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.quoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyHistoryListResp.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.baseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyHistoryListResp.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyHistoryListResp.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, strategyHistoryListResp.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tpOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyHistoryListResp.tpOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.slOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyHistoryListResp.slOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyHistoryListResp.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyHistoryListResp.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyHistoryListResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, strategyHistoryListResp.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, strategyHistoryListResp.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.stopResult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyHistoryListResp.stopResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.profitNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, strategyHistoryListResp.profitNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) strategyHistoryListResp.arbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, strategyHistoryListResp.arbitrageNum);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 40, strategyHistoryListResp.triggerType);
        compositeEncoder.encodeStringElement(serialDescriptor, 41, strategyHistoryListResp.maxSafetyOrds);
        compositeEncoder.encodeStringElement(serialDescriptor, 42, strategyHistoryListResp.fillSafetyOrds);
        compositeEncoder.encodeStringElement(serialDescriptor, 43, strategyHistoryListResp.avgPx);
        compositeEncoder.encodeStringElement(serialDescriptor, 44, strategyHistoryListResp.tpPx);
        compositeEncoder.encodeStringElement(serialDescriptor, 45, strategyHistoryListResp.slPx);
        compositeEncoder.encodeStringElement(serialDescriptor, 46, strategyHistoryListResp.completedCycles);
    }

    public StrategyHistoryListResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47) {
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
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.ccy = str4;
        this.ctVal = str5;
        this.ordId = str6;
        this.algoId = str7;
        this.ordType = str8;
        this.tdMode = str9;
        this.lever = str10;
        this.state = str11;
        this.triggerTime = str12;
        this.cTime = str13;
        this.pxVar = str14;
        this.pxSpread = str15;
        this.szLimit = str16;
        this.pxLimit = str17;
        this.actualSz = str18;
        this.sz = str19;
        this.side = str20;
        this.posSide = str21;
        this.timeInterval = str22;
        this.maxPx = str23;
        this.minPx = str24;
        this.gridNum = str25;
        this.runType = str26;
        this.quoteSz = str27;
        this.baseSz = str28;
        this.tpTriggerPx = str29;
        this.slTriggerPx = str30;
        this.tpOrderPx = str31;
        this.slOrderPx = str32;
        this.tradeNum = str33;
        this.totalPnl = str34;
        this.pnlRatio = str35;
        this.investment = str36;
        this.cancelType = str37;
        this.stopResult = str38;
        this.profitNum = str39;
        this.arbitrageNum = str40;
        this.triggerType = str41;
        this.maxSafetyOrds = str42;
        this.fillSafetyOrds = str43;
        this.avgPx = str44;
        this.tpPx = str45;
        this.slPx = str46;
        this.completedCycles = str47;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0185: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r100v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r100v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r100v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r100v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r100v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r100v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r100v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r100v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r100v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r100v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r100v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r100v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r100v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r100v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r100v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (32768 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (65536 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (131072 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (262144 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (524288 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b7: ARITH (1048576 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c1: ARITH (2097152 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (4194304 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (8388608 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (16777216 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e9: ARITH (33554432 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (67108864 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (134217728 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0107: ARITH (268435456 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (536870912 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011b: ARITH (1073741824 int) & (r100v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0125: ARITH (r100v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r101v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0136: ARITH (r101v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (r101v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0148: ARITH (r101v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0151: ARITH (r101v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015a: ARITH (r101v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0163: ARITH (r101v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016c: ARITH (r101v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (r93v0 java.lang.String)
  (r94v0 java.lang.String)
  (r95v0 java.lang.String)
  (r96v0 java.lang.String)
  (r97v0 java.lang.String)
  (r98v0 java.lang.String)
  (r99v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1459) call: com.okinc.unify_trade.biz.StrategyHistoryListResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyHistoryListResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (32768 & i) != 0 ? "" : str16, (65536 & i) != 0 ? "" : str17, (131072 & i) != 0 ? "" : str18, (262144 & i) != 0 ? "" : str19, (524288 & i) != 0 ? "" : str20, (1048576 & i) != 0 ? "" : str21, (2097152 & i) != 0 ? "" : str22, (4194304 & i) != 0 ? "" : str23, (8388608 & i) != 0 ? "" : str24, (16777216 & i) != 0 ? "" : str25, (33554432 & i) != 0 ? "" : str26, (67108864 & i) != 0 ? "" : str27, (134217728 & i) != 0 ? "" : str28, (268435456 & i) != 0 ? "" : str29, (536870912 & i) != 0 ? "" : str30, (1073741824 & i) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39, (i2 & 128) != 0 ? "" : str40, str41, str42, str43, str44, str45, str46, str47);
    }
}
