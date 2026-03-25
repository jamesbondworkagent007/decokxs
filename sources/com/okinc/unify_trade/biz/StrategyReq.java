package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam$$serializer;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp$$serializer;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C55770xqH;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyReq {
    private static final KSerializer<Object>[] $childSerializers;
    private String activePx;
    private String activePxType;
    private String actualMarginSz;
    private String aggressiveness;
    private boolean allowMultipleEntry;
    private String arbType;
    private Boolean autoReserve;
    private String autoTransfer;
    private Boolean basePos;
    private String baseSz;
    private String callbackRatio;
    private String callbackSpread;
    private String ccy;
    private String chaseType;
    private String chaseVal;
    private String contractGridVersion;
    private String currentPrice;
    private Boolean cxlOnClosePos;
    private String direction;
    private String duration;
    private SmartEarnRequestParam earnParam;
    private String extraMarginSz;
    private String gridNum;
    private String instFamily;
    private String instId;
    private ArrayList<String> instIds;
    private String investType;
    private Boolean isTradeBorrowMode;
    private String lever;
    private Float leveragePrincipal;
    private String lmtOrderNumber;
    private String maxChaseType;
    private String maxChaseVal;
    private String maxPx;
    private String minPx;
    private String nmpUnderlyingId;
    private PlaceOrderCondition openCondition;
    private String openPosSlippage;
    private String ordType;
    private String ordVariant;
    private String perGridProfitRatio;
    private String posSide;
    private ProfitAutoReinvestParam profitAutoReinvestParam;
    private String profitSharingRatio;
    private String pxLimit;
    private String pxSpread;
    private String pxVar;
    private String quickMgnType;
    private String quoteSz;
    private String ratio;
    private Boolean reduceOnly;
    private Boolean reserveFunds;
    private String runType;
    private String side;
    private List<AdvancedTriggerSign> signParams;
    private ExitSignalOrderAmtParam signalBotOrderStopParam;
    private String signalChanId;
    private EntrySignalOrderAmtParam signalOrderAmtParam;
    private String slOrdPx;
    private String slOrderPx;
    private String slRatio;
    private String slTriggerPx;
    private String sourceAlgoId;
    private String sourceCcy;
    private String sourceCcySz;
    private List<? extends SubArbitrageType4Remote> subArbTypes;
    private String subOrdType;
    private String systemSource;
    private String sz;
    private String szLimit;
    private String tag;
    private String tdMode;
    private String tgtCcy;
    private String timeInterval;
    private String totalAmt;
    private String tpOrdPx;
    private String tpOrderPx;
    private String tpRatio;
    private String tpTriggerPx;
    private TpSlTriggerParamReqResp tpslTriggerParam;
    private String tradeQuoteCcy;
    private TrailingConfig trailingDownConfig;
    private TrailingConfig trailingUpConfig;
    private List<AdvancedTriggerSign> triggerParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (Float) null, (PlaceOrderCondition) null, (ProfitAutoReinvestParam) null, (String) null, -1, -1, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.contractGridVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.ordVariant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component29() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component40() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> component48() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component49() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component50() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component51() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> component55() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component58() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam component62() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component63() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component64() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component65() {
        return this.cxlOnClosePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.arbType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> component71() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component74() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.maxChaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.maxChaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnRequestParam component79() {
        return this.earnParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component81() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition component82() {
        return this.openCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitAutoReinvestParam component83() {
        return this.profitAutoReinvestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component84() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyReq copy(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, Boolean bool, @NotNull String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool3, String str37, String str38, String str39, String str40, String str41, String str42, String str43, List<AdvancedTriggerSign> list, Boolean bool4, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str44, String str45, String str46, List<AdvancedTriggerSign> list2, String str47, @NotNull String str48, @NotNull ArrayList<String> arrayList, @NotNull String str49, @NotNull String str50, String str51, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, Boolean bool5, String str52, String str53, String str54, String str55, String str56, List<? extends SubArbitrageType4Remote> list3, String str57, String str58, Boolean bool6, String str59, String str60, String str61, String str62, SmartEarnRequestParam smartEarnRequestParam, String str63, Float f, PlaceOrderCondition placeOrderCondition, ProfitAutoReinvestParam profitAutoReinvestParam, String str64) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        return new StrategyReq(str, str2, str3, str4, str5, bool, str6, str7, str8, str9, str10, str11, str12, str13, str14, bool2, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, tpSlTriggerParamReqResp, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, bool3, str37, str38, str39, str40, str41, str42, str43, list, bool4, trailingConfig, trailingConfig2, str44, str45, str46, list2, str47, str48, arrayList, str49, str50, str51, entrySignalOrderAmtParam, exitSignalOrderAmtParam, z, bool5, str52, str53, str54, str55, str56, list3, str57, str58, bool6, str59, str60, str61, str62, smartEarnRequestParam, str63, f, placeOrderCondition, profitAutoReinvestParam, str64);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyReq)) {
            return false;
        }
        StrategyReq strategyReq = (StrategyReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) strategyReq.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyReq.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) strategyReq.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyReq.posSide) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyReq.ccy) && Intrinsics.EZpvd(this.reduceOnly, strategyReq.reduceOnly) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyReq.ordType) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) strategyReq.pxLimit) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) strategyReq.pxSpread) && Intrinsics.EZpvd((Object) this.pxVar, (Object) strategyReq.pxVar) && Intrinsics.EZpvd((Object) this.szLimit, (Object) strategyReq.szLimit) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) strategyReq.timeInterval) && Intrinsics.EZpvd((Object) this.sz, (Object) strategyReq.sz) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) strategyReq.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) strategyReq.extraMarginSz) && Intrinsics.EZpvd(this.autoReserve, strategyReq.autoReserve) && Intrinsics.EZpvd((Object) this.contractGridVersion, (Object) strategyReq.contractGridVersion) && Intrinsics.EZpvd((Object) this.openPosSlippage, (Object) strategyReq.openPosSlippage) && Intrinsics.EZpvd((Object) this.ordVariant, (Object) strategyReq.ordVariant) && Intrinsics.EZpvd((Object) this.maxPx, (Object) strategyReq.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) strategyReq.minPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) strategyReq.gridNum) && Intrinsics.EZpvd((Object) this.runType, (Object) strategyReq.runType) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) strategyReq.quoteSz) && Intrinsics.EZpvd((Object) this.baseSz, (Object) strategyReq.baseSz) && Intrinsics.EZpvd((Object) this.investType, (Object) strategyReq.investType) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) strategyReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) strategyReq.slTriggerPx) && Intrinsics.EZpvd(this.tpslTriggerParam, strategyReq.tpslTriggerParam) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) strategyReq.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) strategyReq.slRatio) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) strategyReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) strategyReq.slOrdPx) && Intrinsics.EZpvd((Object) this.callbackRatio, (Object) strategyReq.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) strategyReq.callbackSpread) && Intrinsics.EZpvd((Object) this.activePx, (Object) strategyReq.activePx) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) strategyReq.tgtCcy) && Intrinsics.EZpvd((Object) this.activePxType, (Object) strategyReq.activePxType) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) strategyReq.currentPrice) && Intrinsics.EZpvd(this.basePos, strategyReq.basePos) && Intrinsics.EZpvd((Object) this.slOrderPx, (Object) strategyReq.slOrderPx) && Intrinsics.EZpvd((Object) this.tpOrderPx, (Object) strategyReq.tpOrderPx) && Intrinsics.EZpvd((Object) this.direction, (Object) strategyReq.direction) && Intrinsics.EZpvd((Object) this.lever, (Object) strategyReq.lever) && Intrinsics.EZpvd((Object) this.duration, (Object) strategyReq.duration) && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) strategyReq.sourceAlgoId) && Intrinsics.EZpvd((Object) this.quickMgnType, (Object) strategyReq.quickMgnType) && Intrinsics.EZpvd(this.signParams, strategyReq.signParams) && Intrinsics.EZpvd(this.reserveFunds, strategyReq.reserveFunds) && Intrinsics.EZpvd(this.trailingUpConfig, strategyReq.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, strategyReq.trailingDownConfig) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) strategyReq.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.lmtOrderNumber, (Object) strategyReq.lmtOrderNumber) && Intrinsics.EZpvd((Object) this.aggressiveness, (Object) strategyReq.aggressiveness) && Intrinsics.EZpvd(this.triggerParams, strategyReq.triggerParams) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) strategyReq.profitSharingRatio) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) strategyReq.signalChanId) && Intrinsics.EZpvd(this.instIds, strategyReq.instIds) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) strategyReq.totalAmt) && Intrinsics.EZpvd((Object) this.subOrdType, (Object) strategyReq.subOrdType) && Intrinsics.EZpvd((Object) this.ratio, (Object) strategyReq.ratio) && Intrinsics.EZpvd(this.signalOrderAmtParam, strategyReq.signalOrderAmtParam) && Intrinsics.EZpvd(this.signalBotOrderStopParam, strategyReq.signalBotOrderStopParam) && this.allowMultipleEntry == strategyReq.allowMultipleEntry && Intrinsics.EZpvd(this.cxlOnClosePos, strategyReq.cxlOnClosePos) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) strategyReq.sourceCcy) && Intrinsics.EZpvd((Object) this.sourceCcySz, (Object) strategyReq.sourceCcySz) && Intrinsics.EZpvd((Object) this.autoTransfer, (Object) strategyReq.autoTransfer) && Intrinsics.EZpvd((Object) this.instFamily, (Object) strategyReq.instFamily) && Intrinsics.EZpvd((Object) this.arbType, (Object) strategyReq.arbType) && Intrinsics.EZpvd(this.subArbTypes, strategyReq.subArbTypes) && Intrinsics.EZpvd((Object) this.systemSource, (Object) strategyReq.systemSource) && Intrinsics.EZpvd((Object) this.nmpUnderlyingId, (Object) strategyReq.nmpUnderlyingId) && Intrinsics.EZpvd(this.isTradeBorrowMode, strategyReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.chaseType, (Object) strategyReq.chaseType) && Intrinsics.EZpvd((Object) this.chaseVal, (Object) strategyReq.chaseVal) && Intrinsics.EZpvd((Object) this.maxChaseType, (Object) strategyReq.maxChaseType) && Intrinsics.EZpvd((Object) this.maxChaseVal, (Object) strategyReq.maxChaseVal) && Intrinsics.EZpvd(this.earnParam, strategyReq.earnParam) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) strategyReq.tradeQuoteCcy) && Intrinsics.EZpvd(this.leveragePrincipal, strategyReq.leveragePrincipal) && Intrinsics.EZpvd(this.openCondition, strategyReq.openCondition) && Intrinsics.EZpvd(this.profitAutoReinvestParam, strategyReq.profitAutoReinvestParam) && Intrinsics.EZpvd((Object) this.tag, (Object) strategyReq.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePxType() {
        return this.activePxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAggressiveness() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowMultipleEntry() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbType() {
        return this.arbType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoReserve() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoTransfer() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChaseType() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChaseVal() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractGridVersion() {
        return this.contractGridVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCxlOnClosePos() {
        return this.cxlOnClosePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnRequestParam getEarnParam() {
        return this.earnParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLeveragePrincipal() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLmtOrderNumber() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxChaseType() {
        return this.maxChaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxChaseVal() {
        return this.maxChaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingId() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition getOpenCondition() {
        return this.openCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPosSlippage() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdVariant() {
        return this.ordVariant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitAutoReinvestParam getProfitAutoReinvestParam() {
        return this.profitAutoReinvestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
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
    public final String getQuickMgnType() {
        return this.quickMgnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
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
    public final List<AdvancedTriggerSign> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam getSignalBotOrderStopParam() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam getSignalOrderAmtParam() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrderPx() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcySz() {
        return this.sourceCcySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote>, java.util.List<com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote> */
    public final List<SubArbitrageType4Remote> getSubArbTypes() {
        return this.subArbTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubOrdType() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemSource() {
        return this.systemSource;
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
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrderPx() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParam() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingUpConfig() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.tdMode.hashCode();
        String str = this.side;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.posSide;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ccy;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.reduceOnly;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = this.ordType.hashCode();
        String str4 = this.pxLimit;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pxSpread;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pxVar;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.szLimit;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.timeInterval;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.sz;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.actualMarginSz;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.extraMarginSz;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        Boolean bool2 = this.autoReserve;
        int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
        String str12 = this.contractGridVersion;
        int iHashCode17 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.openPosSlippage;
        int iHashCode18 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.ordVariant;
        int iHashCode19 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.maxPx;
        int iHashCode20 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.minPx;
        int iHashCode21 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.gridNum;
        int iHashCode22 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.runType;
        int iHashCode23 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.quoteSz;
        int iHashCode24 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.baseSz;
        int iHashCode25 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.investType;
        int iHashCode26 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.tpTriggerPx;
        int iHashCode27 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.slTriggerPx;
        int iHashCode28 = str23 == null ? 0 : str23.hashCode();
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParam;
        int iHashCode29 = tpSlTriggerParamReqResp == null ? 0 : tpSlTriggerParamReqResp.hashCode();
        String str24 = this.tpRatio;
        int iHashCode30 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.slRatio;
        int iHashCode31 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.tpOrdPx;
        int iHashCode32 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.slOrdPx;
        int iHashCode33 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.callbackRatio;
        int iHashCode34 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.callbackSpread;
        int iHashCode35 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.activePx;
        int iHashCode36 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.tgtCcy;
        int iHashCode37 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.activePxType;
        int iHashCode38 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.currentPrice;
        int iHashCode39 = str33 == null ? 0 : str33.hashCode();
        Boolean bool3 = this.basePos;
        int iHashCode40 = bool3 == null ? 0 : bool3.hashCode();
        String str34 = this.slOrderPx;
        int iHashCode41 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.tpOrderPx;
        int iHashCode42 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.direction;
        int iHashCode43 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.lever;
        int iHashCode44 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.duration;
        int iHashCode45 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.sourceAlgoId;
        int iHashCode46 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.quickMgnType;
        int iHashCode47 = str40 == null ? 0 : str40.hashCode();
        List<AdvancedTriggerSign> list = this.signParams;
        int iHashCode48 = list == null ? 0 : list.hashCode();
        Boolean bool4 = this.reserveFunds;
        int iHashCode49 = bool4 == null ? 0 : bool4.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode50 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode51 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        String str41 = this.perGridProfitRatio;
        int iHashCode52 = str41 == null ? 0 : str41.hashCode();
        String str42 = this.lmtOrderNumber;
        int iHashCode53 = str42 == null ? 0 : str42.hashCode();
        String str43 = this.aggressiveness;
        int iHashCode54 = str43 == null ? 0 : str43.hashCode();
        List<AdvancedTriggerSign> list2 = this.triggerParams;
        int iHashCode55 = list2 == null ? 0 : list2.hashCode();
        String str44 = this.profitSharingRatio;
        int iHashCode56 = str44 == null ? 0 : str44.hashCode();
        int iHashCode57 = this.signalChanId.hashCode();
        int iHashCode58 = this.instIds.hashCode();
        int iHashCode59 = this.totalAmt.hashCode();
        int iHashCode60 = this.subOrdType.hashCode();
        String str45 = this.ratio;
        int iHashCode61 = str45 == null ? 0 : str45.hashCode();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        int iHashCode62 = entrySignalOrderAmtParam == null ? 0 : entrySignalOrderAmtParam.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        int iHashCode63 = exitSignalOrderAmtParam == null ? 0 : exitSignalOrderAmtParam.hashCode();
        int iHashCode64 = Boolean.hashCode(this.allowMultipleEntry);
        Boolean bool5 = this.cxlOnClosePos;
        int iHashCode65 = bool5 == null ? 0 : bool5.hashCode();
        String str46 = this.sourceCcy;
        int iHashCode66 = str46 == null ? 0 : str46.hashCode();
        String str47 = this.sourceCcySz;
        int iHashCode67 = str47 == null ? 0 : str47.hashCode();
        String str48 = this.autoTransfer;
        int iHashCode68 = str48 == null ? 0 : str48.hashCode();
        String str49 = this.instFamily;
        int iHashCode69 = str49 == null ? 0 : str49.hashCode();
        String str50 = this.arbType;
        int iHashCode70 = str50 == null ? 0 : str50.hashCode();
        List<? extends SubArbitrageType4Remote> list3 = this.subArbTypes;
        int iHashCode71 = list3 == null ? 0 : list3.hashCode();
        String str51 = this.systemSource;
        int iHashCode72 = str51 == null ? 0 : str51.hashCode();
        String str52 = this.nmpUnderlyingId;
        int iHashCode73 = str52 == null ? 0 : str52.hashCode();
        Boolean bool6 = this.isTradeBorrowMode;
        int iHashCode74 = bool6 == null ? 0 : bool6.hashCode();
        String str53 = this.chaseType;
        int iHashCode75 = str53 == null ? 0 : str53.hashCode();
        String str54 = this.chaseVal;
        int iHashCode76 = str54 == null ? 0 : str54.hashCode();
        String str55 = this.maxChaseType;
        int iHashCode77 = str55 == null ? 0 : str55.hashCode();
        String str56 = this.maxChaseVal;
        int iHashCode78 = str56 == null ? 0 : str56.hashCode();
        SmartEarnRequestParam smartEarnRequestParam = this.earnParam;
        int iHashCode79 = smartEarnRequestParam == null ? 0 : smartEarnRequestParam.hashCode();
        String str57 = this.tradeQuoteCcy;
        int iHashCode80 = str57 == null ? 0 : str57.hashCode();
        Float f = this.leveragePrincipal;
        int iHashCode81 = f == null ? 0 : f.hashCode();
        PlaceOrderCondition placeOrderCondition = this.openCondition;
        int iHashCode82 = placeOrderCondition == null ? 0 : placeOrderCondition.hashCode();
        ProfitAutoReinvestParam profitAutoReinvestParam = this.profitAutoReinvestParam;
        int iHashCode83 = profitAutoReinvestParam == null ? 0 : profitAutoReinvestParam.hashCode();
        String str58 = this.tag;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + (str58 == null ? 0 : str58.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePx(String str) {
        this.activePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePxType(String str) {
        this.activePxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(String str) {
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggressiveness(String str) {
        this.aggressiveness = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowMultipleEntry(boolean z) {
        this.allowMultipleEntry = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbType(String str) {
        this.arbType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoReserve(Boolean bool) {
        this.autoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoTransfer(String str) {
        this.autoTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasePos(Boolean bool) {
        this.basePos = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSz(String str) {
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackRatio(String str) {
        this.callbackRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackSpread(String str) {
        this.callbackSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChaseType(String str) {
        this.chaseType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChaseVal(String str) {
        this.chaseVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractGridVersion(String str) {
        this.contractGridVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPrice(String str) {
        this.currentPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCxlOnClosePos(Boolean bool) {
        this.cxlOnClosePos = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(String str) {
        this.duration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnParam(SmartEarnRequestParam smartEarnRequestParam) {
        this.earnParam = smartEarnRequestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(String str) {
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(String str) {
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.instIds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(String str) {
        this.investType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeveragePrincipal(Float f) {
        this.leveragePrincipal = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLmtOrderNumber(String str) {
        this.lmtOrderNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxChaseType(String str) {
        this.maxChaseType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxChaseVal(String str) {
        this.maxChaseVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(String str) {
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(String str) {
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNmpUnderlyingId(String str) {
        this.nmpUnderlyingId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenCondition(PlaceOrderCondition placeOrderCondition) {
        this.openCondition = placeOrderCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippage(String str) {
        this.openPosSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdVariant(String str) {
        this.ordVariant = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerGridProfitRatio(String str) {
        this.perGridProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitAutoReinvestParam(ProfitAutoReinvestParam profitAutoReinvestParam) {
        this.profitAutoReinvestParam = profitAutoReinvestParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(String str) {
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSpread(String str) {
        this.pxSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(String str) {
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickMgnType(String str) {
        this.quickMgnType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(String str) {
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(String str) {
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(Boolean bool) {
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(String str) {
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(List<AdvancedTriggerSign> list) {
        this.signParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalBotOrderStopParam(ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalChanId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalOrderAmtParam(EntrySignalOrderAmtParam entrySignalOrderAmtParam) {
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrderPx(String str) {
        this.slOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlRatio(String str) {
        this.slRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceAlgoId(String str) {
        this.sourceAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcy(String str) {
        this.sourceCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCcySz(String str) {
        this.sourceCcySz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubArbTypes(List<? extends SubArbitrageType4Remote> list) {
        this.subArbTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemSource(String str) {
        this.systemSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzLimit(String str) {
        this.szLimit = str;
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
    public final void setTimeInterval(String str) {
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrderPx(String str) {
        this.tpOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpRatio(String str) {
        this.tpRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParam(TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
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
    public final void setTrailingDownConfig(TrailingConfig trailingConfig) {
        this.trailingDownConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingUpConfig(TrailingConfig trailingConfig) {
        this.trailingUpConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<AdvancedTriggerSign> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyReq(instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", posSide=" + this.posSide + ", ccy=" + this.ccy + ", reduceOnly=" + this.reduceOnly + ", ordType=" + this.ordType + ", pxLimit=" + this.pxLimit + ", pxSpread=" + this.pxSpread + ", pxVar=" + this.pxVar + ", szLimit=" + this.szLimit + ", timeInterval=" + this.timeInterval + ", sz=" + this.sz + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", autoReserve=" + this.autoReserve + ", contractGridVersion=" + this.contractGridVersion + ", openPosSlippage=" + this.openPosSlippage + ", ordVariant=" + this.ordVariant + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", gridNum=" + this.gridNum + ", runType=" + this.runType + ", quoteSz=" + this.quoteSz + ", baseSz=" + this.baseSz + ", investType=" + this.investType + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpslTriggerParam=" + this.tpslTriggerParam + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", tpOrdPx=" + this.tpOrdPx + ", slOrdPx=" + this.slOrdPx + ", callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", activePx=" + this.activePx + ", tgtCcy=" + this.tgtCcy + ", activePxType=" + this.activePxType + ", currentPrice=" + this.currentPrice + ", basePos=" + this.basePos + ", slOrderPx=" + this.slOrderPx + ", tpOrderPx=" + this.tpOrderPx + ", direction=" + this.direction + ", lever=" + this.lever + ", duration=" + this.duration + ", sourceAlgoId=" + this.sourceAlgoId + ", quickMgnType=" + this.quickMgnType + ", signParams=" + this.signParams + ", reserveFunds=" + this.reserveFunds + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", perGridProfitRatio=" + this.perGridProfitRatio + ", lmtOrderNumber=" + this.lmtOrderNumber + ", aggressiveness=" + this.aggressiveness + ", triggerParams=" + this.triggerParams + ", profitSharingRatio=" + this.profitSharingRatio + ", signalChanId=" + this.signalChanId + ", instIds=" + this.instIds + ", totalAmt=" + this.totalAmt + ", subOrdType=" + this.subOrdType + ", ratio=" + this.ratio + ", signalOrderAmtParam=" + this.signalOrderAmtParam + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ", allowMultipleEntry=" + this.allowMultipleEntry + ", cxlOnClosePos=" + this.cxlOnClosePos + ", sourceCcy=" + this.sourceCcy + ", sourceCcySz=" + this.sourceCcySz + ", autoTransfer=" + this.autoTransfer + ", instFamily=" + this.instFamily + ", arbType=" + this.arbType + ", subArbTypes=" + this.subArbTypes + ", systemSource=" + this.systemSource + ", nmpUnderlyingId=" + this.nmpUnderlyingId + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", chaseType=" + this.chaseType + ", chaseVal=" + this.chaseVal + ", maxChaseType=" + this.maxChaseType + ", maxChaseVal=" + this.maxChaseVal + ", earnParam=" + this.earnParam + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", leveragePrincipal=" + this.leveragePrincipal + ", openCondition=" + this.openCondition + ", profitAutoReinvestParam=" + this.profitAutoReinvestParam + ", tag=" + this.tag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyReq> serializer() {
            return StrategyReq$$serializer.INSTANCE;
        }
    }

    static {
        AdvancedTriggerSign$$serializer advancedTriggerSign$$serializer = AdvancedTriggerSign$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(advancedTriggerSign$$serializer), null, null, null, null, null, null, new ArrayListSerializer(advancedTriggerSign$$serializer), null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SubArbitrageType4Remote.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ StrategyReq(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool3, String str37, String str38, String str39, String str40, String str41, String str42, String str43, List list, Boolean bool4, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str44, String str45, String str46, List list2, String str47, String str48, ArrayList arrayList, String str49, String str50, String str51, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, Boolean bool5, String str52, String str53, String str54, String str55, String str56, List list3, String str57, String str58, Boolean bool6, String str59, String str60, String str61, String str62, SmartEarnRequestParam smartEarnRequestParam, String str63, Float f, PlaceOrderCondition placeOrderCondition, ProfitAutoReinvestParam profitAutoReinvestParam, String str64, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str2;
        }
        if ((i & 4) == 0) {
            this.side = null;
        } else {
            this.side = str3;
        }
        if ((i & 8) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str5;
        }
        if ((i & 32) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((i & 64) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str6;
        }
        if ((i & 128) == 0) {
            this.pxLimit = null;
        } else {
            this.pxLimit = str7;
        }
        if ((i & 256) == 0) {
            this.pxSpread = null;
        } else {
            this.pxSpread = str8;
        }
        if ((i & 512) == 0) {
            this.pxVar = null;
        } else {
            this.pxVar = str9;
        }
        if ((i & 1024) == 0) {
            this.szLimit = null;
        } else {
            this.szLimit = str10;
        }
        if ((i & 2048) == 0) {
            this.timeInterval = null;
        } else {
            this.timeInterval = str11;
        }
        if ((i & 4096) == 0) {
            this.sz = null;
        } else {
            this.sz = str12;
        }
        if ((i & 8192) == 0) {
            this.actualMarginSz = null;
        } else {
            this.actualMarginSz = str13;
        }
        if ((i & 16384) == 0) {
            this.extraMarginSz = null;
        } else {
            this.extraMarginSz = str14;
        }
        if ((i & 32768) == 0) {
            this.autoReserve = null;
        } else {
            this.autoReserve = bool2;
        }
        if ((i & 65536) == 0) {
            this.contractGridVersion = null;
        } else {
            this.contractGridVersion = str15;
        }
        if ((i & 131072) == 0) {
            this.openPosSlippage = null;
        } else {
            this.openPosSlippage = str16;
        }
        if ((i & 262144) == 0) {
            this.ordVariant = null;
        } else {
            this.ordVariant = str17;
        }
        if ((i & 524288) == 0) {
            this.maxPx = null;
        } else {
            this.maxPx = str18;
        }
        if ((1048576 & i) == 0) {
            this.minPx = null;
        } else {
            this.minPx = str19;
        }
        if ((2097152 & i) == 0) {
            this.gridNum = null;
        } else {
            this.gridNum = str20;
        }
        if ((4194304 & i) == 0) {
            this.runType = null;
        } else {
            this.runType = str21;
        }
        if ((8388608 & i) == 0) {
            this.quoteSz = null;
        } else {
            this.quoteSz = str22;
        }
        if ((16777216 & i) == 0) {
            this.baseSz = null;
        } else {
            this.baseSz = str23;
        }
        if ((33554432 & i) == 0) {
            this.investType = null;
        } else {
            this.investType = str24;
        }
        if ((67108864 & i) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str25;
        }
        if ((134217728 & i) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str26;
        }
        if ((268435456 & i) == 0) {
            this.tpslTriggerParam = null;
        } else {
            this.tpslTriggerParam = tpSlTriggerParamReqResp;
        }
        if ((536870912 & i) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str27;
        }
        if ((1073741824 & i) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str29;
        }
        if ((i2 & 1) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str30;
        }
        if ((i2 & 2) == 0) {
            this.callbackRatio = null;
        } else {
            this.callbackRatio = str31;
        }
        if ((i2 & 4) == 0) {
            this.callbackSpread = null;
        } else {
            this.callbackSpread = str32;
        }
        if ((i2 & 8) == 0) {
            this.activePx = null;
        } else {
            this.activePx = str33;
        }
        if ((i2 & 16) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str34;
        }
        if ((i2 & 32) == 0) {
            this.activePxType = null;
        } else {
            this.activePxType = str35;
        }
        if ((i2 & 64) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str36;
        }
        if ((i2 & 128) == 0) {
            this.basePos = null;
        } else {
            this.basePos = bool3;
        }
        if ((i2 & 256) == 0) {
            this.slOrderPx = null;
        } else {
            this.slOrderPx = str37;
        }
        if ((i2 & 512) == 0) {
            this.tpOrderPx = null;
        } else {
            this.tpOrderPx = str38;
        }
        if ((i2 & 1024) == 0) {
            this.direction = null;
        } else {
            this.direction = str39;
        }
        if ((i2 & 2048) == 0) {
            this.lever = null;
        } else {
            this.lever = str40;
        }
        if ((i2 & 4096) == 0) {
            this.duration = null;
        } else {
            this.duration = str41;
        }
        if ((i2 & 8192) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str42;
        }
        if ((i2 & 16384) == 0) {
            this.quickMgnType = null;
        } else {
            this.quickMgnType = str43;
        }
        if ((i2 & 32768) == 0) {
            this.signParams = null;
        } else {
            this.signParams = list;
        }
        if ((i2 & 65536) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool4;
        }
        if ((i2 & 131072) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((i2 & 262144) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        if ((i2 & 524288) == 0) {
            this.perGridProfitRatio = null;
        } else {
            this.perGridProfitRatio = str44;
        }
        if ((1048576 & i2) == 0) {
            this.lmtOrderNumber = null;
        } else {
            this.lmtOrderNumber = str45;
        }
        if ((2097152 & i2) == 0) {
            this.aggressiveness = null;
        } else {
            this.aggressiveness = str46;
        }
        if ((4194304 & i2) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list2;
        }
        if ((8388608 & i2) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str47;
        }
        if ((16777216 & i2) == 0) {
            this.signalChanId = "";
        } else {
            this.signalChanId = str48;
        }
        this.instIds = (33554432 & i2) == 0 ? new ArrayList() : arrayList;
        if ((67108864 & i2) == 0) {
            this.totalAmt = "";
        } else {
            this.totalAmt = str49;
        }
        if ((134217728 & i2) == 0) {
            this.subOrdType = "";
        } else {
            this.subOrdType = str50;
        }
        if ((268435456 & i2) == 0) {
            this.ratio = null;
        } else {
            this.ratio = str51;
        }
        if ((536870912 & i2) == 0) {
            this.signalOrderAmtParam = null;
        } else {
            this.signalOrderAmtParam = entrySignalOrderAmtParam;
        }
        if ((1073741824 & i2) == 0) {
            this.signalBotOrderStopParam = null;
        } else {
            this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        }
        this.allowMultipleEntry = (Integer.MIN_VALUE & i2) == 0 ? false : z;
        if ((i3 & 1) == 0) {
            this.cxlOnClosePos = null;
        } else {
            this.cxlOnClosePos = bool5;
        }
        if ((i3 & 2) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str52;
        }
        if ((i3 & 4) == 0) {
            this.sourceCcySz = null;
        } else {
            this.sourceCcySz = str53;
        }
        if ((i3 & 8) == 0) {
            this.autoTransfer = null;
        } else {
            this.autoTransfer = str54;
        }
        if ((i3 & 16) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str55;
        }
        if ((i3 & 32) == 0) {
            this.arbType = null;
        } else {
            this.arbType = str56;
        }
        if ((i3 & 64) == 0) {
            this.subArbTypes = null;
        } else {
            this.subArbTypes = list3;
        }
        if ((i3 & 128) == 0) {
            this.systemSource = null;
        } else {
            this.systemSource = str57;
        }
        if ((i3 & 256) == 0) {
            this.nmpUnderlyingId = null;
        } else {
            this.nmpUnderlyingId = str58;
        }
        if ((i3 & 512) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool6;
        }
        if ((i3 & 1024) == 0) {
            this.chaseType = null;
        } else {
            this.chaseType = str59;
        }
        if ((i3 & 2048) == 0) {
            this.chaseVal = null;
        } else {
            this.chaseVal = str60;
        }
        if ((i3 & 4096) == 0) {
            this.maxChaseType = null;
        } else {
            this.maxChaseType = str61;
        }
        if ((i3 & 8192) == 0) {
            this.maxChaseVal = null;
        } else {
            this.maxChaseVal = str62;
        }
        if ((i3 & 16384) == 0) {
            this.earnParam = null;
        } else {
            this.earnParam = smartEarnRequestParam;
        }
        if ((i3 & 32768) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str63;
        }
        if ((i3 & 65536) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = f;
        }
        if ((i3 & 131072) == 0) {
            this.openCondition = null;
        } else {
            this.openCondition = placeOrderCondition;
        }
        if ((i3 & 262144) == 0) {
            this.profitAutoReinvestParam = null;
        } else {
            this.profitAutoReinvestParam = profitAutoReinvestParam;
        }
        if ((i3 & 524288) == 0) {
            this.tag = null;
        } else {
            this.tag = str64;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyReq strategyReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyReq.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyReq.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyReq.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || strategyReq.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, strategyReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyReq.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, strategyReq.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || strategyReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, strategyReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || strategyReq.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, strategyReq.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || strategyReq.pxLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, strategyReq.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || strategyReq.pxSpread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, strategyReq.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || strategyReq.pxVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, strategyReq.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || strategyReq.szLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, strategyReq.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || strategyReq.timeInterval != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, strategyReq.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || strategyReq.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, strategyReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || strategyReq.actualMarginSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, strategyReq.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || strategyReq.extraMarginSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, strategyReq.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || strategyReq.autoReserve != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, strategyReq.autoReserve);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || strategyReq.contractGridVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, strategyReq.contractGridVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || strategyReq.openPosSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, strategyReq.openPosSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || strategyReq.ordVariant != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, strategyReq.ordVariant);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || strategyReq.maxPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, strategyReq.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || strategyReq.minPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, strategyReq.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || strategyReq.gridNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, strategyReq.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || strategyReq.runType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, strategyReq.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || strategyReq.quoteSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, strategyReq.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || strategyReq.baseSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, strategyReq.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || strategyReq.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, strategyReq.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || strategyReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, strategyReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || strategyReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, strategyReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || strategyReq.tpslTriggerParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, TpSlTriggerParamReqResp$$serializer.INSTANCE, strategyReq.tpslTriggerParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || strategyReq.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, strategyReq.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || strategyReq.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, strategyReq.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || strategyReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, strategyReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || strategyReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, strategyReq.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || strategyReq.callbackRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, strategyReq.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || strategyReq.callbackSpread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, strategyReq.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || strategyReq.activePx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, strategyReq.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || strategyReq.tgtCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, strategyReq.tgtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || strategyReq.activePxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, strategyReq.activePxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || strategyReq.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, strategyReq.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || strategyReq.basePos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, BooleanSerializer.INSTANCE, strategyReq.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || strategyReq.slOrderPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, strategyReq.slOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || strategyReq.tpOrderPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, strategyReq.tpOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || strategyReq.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, strategyReq.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || strategyReq.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, strategyReq.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || strategyReq.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, strategyReq.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || strategyReq.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, StringSerializer.INSTANCE, strategyReq.sourceAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || strategyReq.quickMgnType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, strategyReq.quickMgnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || strategyReq.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, kSerializerArr[47], strategyReq.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || strategyReq.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, BooleanSerializer.INSTANCE, strategyReq.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || strategyReq.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, TrailingConfig$$serializer.INSTANCE, strategyReq.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || strategyReq.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, TrailingConfig$$serializer.INSTANCE, strategyReq.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || strategyReq.perGridProfitRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, strategyReq.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || strategyReq.lmtOrderNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, strategyReq.lmtOrderNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || strategyReq.aggressiveness != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, strategyReq.aggressiveness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || strategyReq.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, kSerializerArr[54], strategyReq.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || strategyReq.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, strategyReq.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) strategyReq.signalChanId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, strategyReq.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd(strategyReq.instIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 57, kSerializerArr[57], strategyReq.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) strategyReq.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, strategyReq.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) strategyReq.subOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, strategyReq.subOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || strategyReq.ratio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 60, StringSerializer.INSTANCE, strategyReq.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || strategyReq.signalOrderAmtParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, EntrySignalOrderAmtParam$$serializer.INSTANCE, strategyReq.signalOrderAmtParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || strategyReq.signalBotOrderStopParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, ExitSignalOrderAmtParam$$serializer.INSTANCE, strategyReq.signalBotOrderStopParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || strategyReq.allowMultipleEntry) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 63, strategyReq.allowMultipleEntry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || strategyReq.cxlOnClosePos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, BooleanSerializer.INSTANCE, strategyReq.cxlOnClosePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || strategyReq.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 65, StringSerializer.INSTANCE, strategyReq.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || strategyReq.sourceCcySz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, StringSerializer.INSTANCE, strategyReq.sourceCcySz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || strategyReq.autoTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, StringSerializer.INSTANCE, strategyReq.autoTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || strategyReq.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, StringSerializer.INSTANCE, strategyReq.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || strategyReq.arbType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, strategyReq.arbType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || strategyReq.subArbTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, kSerializerArr[70], strategyReq.subArbTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || strategyReq.systemSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, StringSerializer.INSTANCE, strategyReq.systemSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || strategyReq.nmpUnderlyingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, strategyReq.nmpUnderlyingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || strategyReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, BooleanSerializer.INSTANCE, strategyReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || strategyReq.chaseType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, StringSerializer.INSTANCE, strategyReq.chaseType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || strategyReq.chaseVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, StringSerializer.INSTANCE, strategyReq.chaseVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || strategyReq.maxChaseType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 76, StringSerializer.INSTANCE, strategyReq.maxChaseType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || strategyReq.maxChaseVal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 77, StringSerializer.INSTANCE, strategyReq.maxChaseVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || strategyReq.earnParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 78, SmartEarnRequestParam$$serializer.INSTANCE, strategyReq.earnParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || strategyReq.tradeQuoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 79, StringSerializer.INSTANCE, strategyReq.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || strategyReq.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 80, FloatSerializer.INSTANCE, strategyReq.leveragePrincipal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || strategyReq.openCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 81, PlaceOrderCondition$$serializer.INSTANCE, strategyReq.openCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || strategyReq.profitAutoReinvestParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 82, ProfitAutoReinvestParam$$serializer.INSTANCE, strategyReq.profitAutoReinvestParam);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) && strategyReq.tag == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 83, StringSerializer.INSTANCE, strategyReq.tag);
    }

    public StrategyReq(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, Boolean bool, @NotNull String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool3, String str37, String str38, String str39, String str40, String str41, String str42, String str43, List<AdvancedTriggerSign> list, Boolean bool4, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str44, String str45, String str46, List<AdvancedTriggerSign> list2, String str47, @NotNull String str48, @NotNull ArrayList<String> arrayList, @NotNull String str49, @NotNull String str50, String str51, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, Boolean bool5, String str52, String str53, String str54, String str55, String str56, List<? extends SubArbitrageType4Remote> list3, String str57, String str58, Boolean bool6, String str59, String str60, String str61, String str62, SmartEarnRequestParam smartEarnRequestParam, String str63, Float f, PlaceOrderCondition placeOrderCondition, ProfitAutoReinvestParam profitAutoReinvestParam, String str64) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.posSide = str4;
        this.ccy = str5;
        this.reduceOnly = bool;
        this.ordType = str6;
        this.pxLimit = str7;
        this.pxSpread = str8;
        this.pxVar = str9;
        this.szLimit = str10;
        this.timeInterval = str11;
        this.sz = str12;
        this.actualMarginSz = str13;
        this.extraMarginSz = str14;
        this.autoReserve = bool2;
        this.contractGridVersion = str15;
        this.openPosSlippage = str16;
        this.ordVariant = str17;
        this.maxPx = str18;
        this.minPx = str19;
        this.gridNum = str20;
        this.runType = str21;
        this.quoteSz = str22;
        this.baseSz = str23;
        this.investType = str24;
        this.tpTriggerPx = str25;
        this.slTriggerPx = str26;
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
        this.tpRatio = str27;
        this.slRatio = str28;
        this.tpOrdPx = str29;
        this.slOrdPx = str30;
        this.callbackRatio = str31;
        this.callbackSpread = str32;
        this.activePx = str33;
        this.tgtCcy = str34;
        this.activePxType = str35;
        this.currentPrice = str36;
        this.basePos = bool3;
        this.slOrderPx = str37;
        this.tpOrderPx = str38;
        this.direction = str39;
        this.lever = str40;
        this.duration = str41;
        this.sourceAlgoId = str42;
        this.quickMgnType = str43;
        this.signParams = list;
        this.reserveFunds = bool4;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.perGridProfitRatio = str44;
        this.lmtOrderNumber = str45;
        this.aggressiveness = str46;
        this.triggerParams = list2;
        this.profitSharingRatio = str47;
        this.signalChanId = str48;
        this.instIds = arrayList;
        this.totalAmt = str49;
        this.subOrdType = str50;
        this.ratio = str51;
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        this.allowMultipleEntry = z;
        this.cxlOnClosePos = bool5;
        this.sourceCcy = str52;
        this.sourceCcySz = str53;
        this.autoTransfer = str54;
        this.instFamily = str55;
        this.arbType = str56;
        this.subArbTypes = list3;
        this.systemSource = str57;
        this.nmpUnderlyingId = str58;
        this.isTradeBorrowMode = bool6;
        this.chaseType = str59;
        this.chaseVal = str60;
        this.maxChaseType = str61;
        this.maxChaseVal = str62;
        this.earnParam = smartEarnRequestParam;
        this.tradeQuoteCcy = str63;
        this.leveragePrincipal = f;
        this.openCondition = placeOrderCondition;
        this.profitAutoReinvestParam = profitAutoReinvestParam;
        this.tag = str64;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrategyReq(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Boolean bool3, String str37, String str38, String str39, String str40, String str41, String str42, String str43, List list, Boolean bool4, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, String str44, String str45, String str46, List list2, String str47, String str48, ArrayList arrayList, String str49, String str50, String str51, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, Boolean bool5, String str52, String str53, String str54, String str55, String str56, List list3, String str57, String str58, Boolean bool6, String str59, String str60, String str61, String str62, SmartEarnRequestParam smartEarnRequestParam, String str63, Float f, PlaceOrderCondition placeOrderCondition, ProfitAutoReinvestParam profitAutoReinvestParam, String str64, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str65 = (i & 1) != 0 ? "" : str;
        String str66 = (i & 2) != 0 ? "" : str2;
        String str67 = (i & 4) != 0 ? null : str3;
        String str68 = (i & 8) != 0 ? null : str4;
        String str69 = (i & 16) != 0 ? null : str5;
        Boolean bool7 = (i & 32) != 0 ? null : bool;
        String str70 = (i & 64) != 0 ? "" : str6;
        String str71 = (i & 128) != 0 ? null : str7;
        String str72 = (i & 256) != 0 ? null : str8;
        String str73 = (i & 512) != 0 ? null : str9;
        String str74 = (i & 1024) != 0 ? null : str10;
        String str75 = (i & 2048) != 0 ? null : str11;
        String str76 = (i & 4096) != 0 ? null : str12;
        String str77 = (i & 8192) != 0 ? null : str13;
        String str78 = (i & 16384) != 0 ? null : str14;
        Boolean bool8 = (i & 32768) != 0 ? null : bool2;
        String str79 = (i & 65536) != 0 ? null : str15;
        String str80 = (i & 131072) != 0 ? null : str16;
        String str81 = (i & 262144) != 0 ? null : str17;
        String str82 = (i & 524288) != 0 ? null : str18;
        String str83 = (i & 1048576) != 0 ? null : str19;
        String str84 = (i & 2097152) != 0 ? null : str20;
        String str85 = (i & 4194304) != 0 ? null : str21;
        String str86 = (i & 8388608) != 0 ? null : str22;
        String str87 = (i & 16777216) != 0 ? null : str23;
        String str88 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24;
        String str89 = (i & 67108864) != 0 ? null : str25;
        String str90 = (i & 134217728) != 0 ? null : str26;
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp2 = (i & 268435456) != 0 ? null : tpSlTriggerParamReqResp;
        String str91 = (i & 536870912) != 0 ? null : str27;
        String str92 = (i & 1073741824) != 0 ? null : str28;
        String str93 = (i & Integer.MIN_VALUE) != 0 ? null : str29;
        this(str65, str66, str67, str68, str69, bool7, str70, str71, str72, str73, str74, str75, str76, str77, str78, bool8, str79, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, tpSlTriggerParamReqResp2, str91, str92, str93, (i2 & 1) != 0 ? null : str30, (i2 & 2) != 0 ? null : str31, (i2 & 4) != 0 ? null : str32, (i2 & 8) != 0 ? null : str33, (i2 & 16) != 0 ? null : str34, (i2 & 32) != 0 ? null : str35, (i2 & 64) != 0 ? null : str36, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str37, (i2 & 512) != 0 ? null : str38, (i2 & 1024) != 0 ? null : str39, (i2 & 2048) != 0 ? null : str40, (i2 & 4096) != 0 ? null : str41, (i2 & 8192) != 0 ? null : str42, (i2 & 16384) != 0 ? null : str43, (i2 & 32768) != 0 ? null : list, (i2 & 65536) != 0 ? null : bool4, (i2 & 131072) != 0 ? null : trailingConfig, (i2 & 262144) != 0 ? null : trailingConfig2, (i2 & 524288) != 0 ? null : str44, (i2 & 1048576) != 0 ? null : str45, (i2 & 2097152) != 0 ? null : str46, (i2 & 4194304) != 0 ? null : list2, (i2 & 8388608) != 0 ? null : str47, (i2 & 16777216) != 0 ? "" : str48, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new ArrayList() : arrayList, (i2 & 67108864) != 0 ? "" : str49, (i2 & 134217728) != 0 ? "" : str50, (i2 & 268435456) != 0 ? null : str51, (i2 & 536870912) != 0 ? null : entrySignalOrderAmtParam, (i2 & 1073741824) != 0 ? null : exitSignalOrderAmtParam, (i2 & Integer.MIN_VALUE) != 0 ? false : z, (i3 & 1) != 0 ? null : bool5, (i3 & 2) != 0 ? null : str52, (i3 & 4) != 0 ? null : str53, (i3 & 8) != 0 ? null : str54, (i3 & 16) != 0 ? null : str55, (i3 & 32) != 0 ? null : str56, (i3 & 64) != 0 ? null : list3, (i3 & 128) != 0 ? null : str57, (i3 & 256) != 0 ? null : str58, (i3 & 512) != 0 ? null : bool6, (i3 & 1024) != 0 ? null : str59, (i3 & 2048) != 0 ? null : str60, (i3 & 4096) != 0 ? null : str61, (i3 & 8192) != 0 ? null : str62, (i3 & 16384) != 0 ? null : smartEarnRequestParam, (i3 & 32768) != 0 ? null : str63, (i3 & 65536) != 0 ? null : f, (i3 & 131072) != 0 ? null : placeOrderCondition, (i3 & 262144) != 0 ? null : profitAutoReinvestParam, (i3 & 524288) != 0 ? null : str64);
    }

    public final void initChaseOrderReq(@NotNull ChaseOrderReq chaseOrderReq) {
        Intrinsics.checkNotNullParameter(chaseOrderReq, "");
        this.instId = chaseOrderReq.getInstId();
        this.ordType = chaseOrderReq.getOrdType();
        this.tdMode = chaseOrderReq.getTdMode();
        this.side = chaseOrderReq.getSide();
        this.posSide = chaseOrderReq.getPosSide();
        this.sz = chaseOrderReq.getSz();
        this.chaseType = chaseOrderReq.getChaseType();
        this.chaseVal = chaseOrderReq.getChaseVal();
        this.maxChaseType = chaseOrderReq.getMaxChaseType();
        this.maxChaseVal = chaseOrderReq.getMaxChaseVal();
        this.reduceOnly = chaseOrderReq.getReduceOnly();
    }

    public final void initBaseReq(@NotNull StrategyBaseReq strategyBaseReq) {
        Intrinsics.checkNotNullParameter(strategyBaseReq, "");
        this.instId = strategyBaseReq.getInstId();
        this.tdMode = strategyBaseReq.getTdMode();
        this.side = strategyBaseReq.getSide();
        this.posSide = strategyBaseReq.getPosSide();
        this.ccy = strategyBaseReq.getCcy();
        this.reduceOnly = strategyBaseReq.getReduceOnly();
        this.ordType = strategyBaseReq.getOrdType();
        this.sourceAlgoId = strategyBaseReq.getSourceAlgoId();
        this.cxlOnClosePos = strategyBaseReq.getCxlOnClosePos();
    }

    public final void initIceBergReq(@NotNull IceBergReq iceBergReq) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        this.pxLimit = iceBergReq.getPxLimit();
        this.pxSpread = iceBergReq.getPxSpread();
        this.pxVar = iceBergReq.getPxVar();
        this.szLimit = iceBergReq.getSzLimit();
        this.sz = iceBergReq.getSz();
    }

    public final void initSmartIceBergReq(@NotNull IceBergReq iceBergReq) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        String pxLimit = iceBergReq.getPxLimit();
        if (!C33129mqd.AEQbTJ(pxLimit, 0)) {
            pxLimit = null;
        }
        this.pxLimit = pxLimit;
        this.pxSpread = iceBergReq.getPxSpread();
        this.pxVar = iceBergReq.getPxVar();
        this.szLimit = iceBergReq.getSzLimit();
        this.sz = iceBergReq.getSz();
        this.lmtOrderNumber = iceBergReq.getLmtOrderNumber();
        this.aggressiveness = iceBergReq.getAggressiveness();
        this.triggerParams = iceBergReq.getTriggerParams();
        this.isTradeBorrowMode = iceBergReq.isTradeBorrowMode();
        this.tradeQuoteCcy = iceBergReq.getTradeQuoteCcy();
    }

    public final void initTwapReq(@NotNull TwapReq twapReq) {
        Intrinsics.checkNotNullParameter(twapReq, "");
        this.pxLimit = twapReq.getPxLimit();
        this.pxSpread = twapReq.getPxSpread();
        this.pxVar = twapReq.getPxVar();
        this.szLimit = twapReq.getSzLimit();
        this.timeInterval = twapReq.getTimeInterval();
        this.sz = twapReq.getSz();
        this.isTradeBorrowMode = twapReq.isTradeBorrowMode();
        this.tradeQuoteCcy = twapReq.getTradeQuoteCcy();
    }

    public final void initGridReq(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.maxPx = gridReq.getMaxPx();
        this.minPx = gridReq.getMinPx();
        this.gridNum = gridReq.getGridNum();
        this.runType = gridReq.getRunType();
        this.quoteSz = gridReq.getQuoteSz();
        this.baseSz = gridReq.getBaseSz();
        this.investType = gridReq.getInvestType();
        this.tpTriggerPx = gridReq.getTpTriggerPx();
        this.slTriggerPx = gridReq.getSlTriggerPx();
        this.tpslTriggerParam = gridReq.getTpslTriggerParamReq();
        this.tpOrdPx = gridReq.getTpOrdPx();
        this.slOrdPx = gridReq.getSlOrdPx();
        this.duration = gridReq.getDuration();
        this.signParams = gridReq.getSignParams();
        this.reserveFunds = gridReq.getReserveFunds();
        this.trailingUpConfig = gridReq.getTrailingUpConfig();
        this.trailingDownConfig = gridReq.getTrailingDownConfig();
        this.perGridProfitRatio = gridReq.getPerGridProfitRatio();
        this.profitSharingRatio = gridReq.getProfitSharingRatio();
        this.sourceCcy = gridReq.getSourceCcy();
        this.sourceCcySz = gridReq.getSourceCcySz();
        this.autoTransfer = gridReq.getAutoTransfer();
        this.systemSource = gridReq.getSystemSource();
        this.nmpUnderlyingId = gridReq.getNmpUnderlyingId();
        this.earnParam = gridReq.getEarnParam();
        this.tradeQuoteCcy = gridReq.getTradeQuoteCcy();
        this.profitAutoReinvestParam = gridReq.getProfitAutoReinvestParam();
    }

    public final void initMoonGridReq(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.maxPx = gridReq.getMaxPx();
        this.minPx = gridReq.getMinPx();
        this.gridNum = gridReq.getGridNum();
        this.quoteSz = gridReq.getQuoteSz();
        this.duration = gridReq.getDuration();
        this.signParams = gridReq.getSignParams();
    }

    public final void initMovingProfitReq(@NotNull StrategyMoveOrderReq strategyMoveOrderReq) {
        Intrinsics.checkNotNullParameter(strategyMoveOrderReq, "");
        this.callbackRatio = strategyMoveOrderReq.getCallbackRatio();
        this.callbackSpread = strategyMoveOrderReq.getCallbackSpread();
        this.activePx = strategyMoveOrderReq.getActivePx();
        this.sz = strategyMoveOrderReq.getSz();
        this.activePxType = strategyMoveOrderReq.getActivePxType();
        this.currentPrice = strategyMoveOrderReq.getCurrentPrice();
        this.quickMgnType = strategyMoveOrderReq.getQuickMgnType();
        this.isTradeBorrowMode = strategyMoveOrderReq.isTradeBorrowMode();
        this.tradeQuoteCcy = strategyMoveOrderReq.getTradeQuoteCcy();
        this.tag = strategyMoveOrderReq.getTag();
    }

    public final void initContractGridReq(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.basePos = contractGridReq.getBasePos();
        this.gridNum = contractGridReq.getGridNum();
        this.investType = contractGridReq.getInvestType();
        this.maxPx = contractGridReq.getMaxPx();
        this.minPx = contractGridReq.getMinPx();
        this.sz = contractGridReq.getSz();
        this.runType = contractGridReq.getRunType();
        this.slTriggerPx = contractGridReq.getSlTriggerPx();
        this.tpTriggerPx = contractGridReq.getTpTriggerPx();
        this.tpRatio = contractGridReq.getTpRatio();
        this.slRatio = contractGridReq.getSlRatio();
        this.direction = contractGridReq.getDirection();
        this.lever = contractGridReq.getLever();
        this.signParams = contractGridReq.getSignParams();
        this.profitSharingRatio = contractGridReq.getProfitSharingRatio();
        this.autoTransfer = contractGridReq.getAutoTransfer();
        this.systemSource = contractGridReq.getSystemSource();
        this.nmpUnderlyingId = contractGridReq.getNmpUnderlyingId();
        this.actualMarginSz = contractGridReq.getActualMarginSz();
        this.extraMarginSz = contractGridReq.getExtraMarginSz();
        this.autoReserve = contractGridReq.getAutoReserve();
        this.contractGridVersion = contractGridReq.getContractGridVersion();
        this.openPosSlippage = contractGridReq.getOpenPosSlippage();
        this.ordVariant = contractGridReq.getOrdVariant();
    }

    public final void initSignalBotReq(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        this.signalChanId = signalBotReq.getSignalChanId();
        this.instIds = signalBotReq.getInstIds();
        this.lever = signalBotReq.getLever();
        this.totalAmt = signalBotReq.getTotalAmt();
        this.subOrdType = signalBotReq.getSubOrdType();
        this.ratio = signalBotReq.getRatio();
        this.signalOrderAmtParam = signalBotReq.getSignalOrderAmtParam();
        this.signalBotOrderStopParam = signalBotReq.getSignalBotOrderStopParam();
        this.allowMultipleEntry = signalBotReq.getAllowMultipleEntry();
    }

    public final void initSmartArbitrageReq(@NotNull SmartArbitrageReq smartArbitrageReq) {
        Intrinsics.checkNotNullParameter(smartArbitrageReq, "");
        this.instFamily = smartArbitrageReq.getInstFamily();
        this.totalAmt = smartArbitrageReq.getTotalAmt();
        this.arbType = smartArbitrageReq.getArbType();
        HashMap<ArbInvestDetailsBeanStakingType4UI, SubArbitrageType4Remote> mapAEQbTJ = C55770xqH.ActionBar.OLrzqt.AEQbTJ();
        ArbInvestDetailsBean investDetails = smartArbitrageReq.getInvestDetails();
        SubArbitrageType4Remote subArbitrageType4Remote = mapAEQbTJ.get(investDetails != null ? investDetails.isStaking() : null);
        this.subArbTypes = subArbitrageType4Remote != null ? C56402yEa.EZpvd(subArbitrageType4Remote) : null;
        this.leveragePrincipal = smartArbitrageReq.getLeveragePrincipal();
        this.openCondition = smartArbitrageReq.getOpenCondition();
    }
}
