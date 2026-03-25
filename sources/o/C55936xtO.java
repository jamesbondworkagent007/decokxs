package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.MarginPerCcyVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.ProfitMarginPerCcyVo;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.UnitDisplayVo;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotStatus;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ContractDcaSpecialData;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.SwapCoinMProfitSwitchUiModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelRoleData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVipProfitData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import com.okinc.unify_trade.bot.util.StrategyInfoOperatorBean;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C55688xof;
import o.C55770xqH;
import o.C55930xtI;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55936xtO implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyDetailsResponse>>, java.util.List<? extends TacticsData>> {

    /* JADX INFO: renamed from: o.xtO$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.INTEREST_RATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsVoucherType.STRATEGY_COMPENSATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ java.util.List<? extends TacticsData> KWHzl(C55804xqp<java.util.List<? extends StrategyDetailsResponse>> c55804xqp) {
        return EZpvd((C55804xqp<java.util.List<StrategyDetailsResponse>>) c55804xqp);
    }

    public java.util.List<TacticsData> EZpvd(@NotNull C55804xqp<java.util.List<StrategyDetailsResponse>> c55804xqp) {
        TacticsData tacticsDataAEQbTJ;
        xOR xorCopydefault;
        java.util.List<java.lang.String> listCopydefault;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.List<StrategyDetailsResponse> listCopydefault2 = c55804xqp.copydefault();
        java.util.ArrayList<StrategyDetailsResponse> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault2) {
            StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) obj;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) != null && (listCopydefault = xorCopydefault.copydefault()) != null && listCopydefault.contains(strategyDetailsResponse.getOrderType())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (StrategyDetailsResponse strategyDetailsResponse2 : arrayList) {
            if (strategyDetailsResponse2.isHistory() || Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse2.getState(), (java.lang.Object) "stopped")) {
                tacticsDataAEQbTJ = AEQbTJ(strategyDetailsResponse2);
            } else {
                tacticsDataAEQbTJ = EZpvd(strategyDetailsResponse2);
            }
            arrayList2.add(tacticsDataAEQbTJ);
        }
        return arrayList2;
    }

    public final TacticsData AEQbTJ(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instFamily;
        kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> pairAkhnZx;
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData;
        SmartArbitrageVo smartArbitrage;
        java.lang.Boolean boolZLjUOn;
        java.lang.String pnlRatio;
        ProfitMarginPerCcyVo profitMarginPerCcyVo;
        BizInstrument suggestedInstrument$default;
        java.lang.String strEZpvd = C56033xvF.EZpvd(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getCtVal());
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
        java.lang.String strKWHzl = c56059xvf.KWHzl(orderType, arbList != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList) : null, strategyDetailsResponse.getInstType());
        java.lang.String orderType2 = strategyDetailsResponse.getOrderType();
        java.util.ArrayList<SmartArbListItem> arbList2 = strategyDetailsResponse.getArbList();
        java.lang.String strEZpvd2 = c56059xvf.EZpvd(orderType2, arbList2 != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList2) : null, strategyDetailsResponse.getInstId());
        java.lang.String strAhwBna = C56033xvF.AhwBna(strKWHzl, strEZpvd2, strategyDetailsResponse.getDisplayId());
        java.lang.String tradeQuoteCcy = strategyDetailsResponse.getTradeQuoteCcy();
        java.lang.String str = (tradeQuoteCcy == null || tradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)) ? strAhwBna : tradeQuoteCcy;
        java.lang.String instFamily2 = strategyDetailsResponse.getInstFamily();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strKWHzl, strEZpvd2, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        java.lang.String str2 = (instFamily2 == null || instFamily2.length() == 0) ? instFamily : instFamily2;
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "smart_arbitrage")) {
            C55998xuX c55998xuX = C55998xuX.copydefault;
            pairAkhnZx = c55998xuX.AkhnZx(c55998xuX.KWHzl(strategyDetailsResponse, false));
        } else {
            pairAkhnZx = C55998xuX.copydefault.AkhnZx(new StrategyInfoOperatorBean(strategyDetailsResponse.isHistory(), strategyDetailsResponse.getCopyType(), strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getState(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getProfit(), "", "", 1, false, false, "", false, strategyDetailsResponse.getForbidden(), 2048, null));
        }
        kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> pair = pairAkhnZx;
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModelCopydefault = copydefault(strategyDetailsResponse);
        boolean z = swapCoinMProfitSwitchUiModelCopydefault != null && swapCoinMProfitSwitchUiModelCopydefault.isCoinM() && swapCoinMProfitSwitchUiModelCopydefault != null && swapCoinMProfitSwitchUiModelCopydefault.isUsdtSelected();
        if (strategyDetailsResponse.getProfitSnapshots() != null) {
            java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponse.getProfitSnapshots();
            if (profitSnapshots == null) {
                profitSnapshots = yDY.AhwBna();
            }
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitSnapshots);
            if (strategyProfitResponse == null) {
                strategyProfitResponse = new StrategyProfitResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 1023, (DefaultConstructorMarker) null);
            }
            if (!z || (profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT")) == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                pnlRatio = strategyProfitResponse.getPnlRatio();
            }
            mpStgyCopyProfitChangeData = new MpStgyCopyProfitChangeData(new kotlin.Pair(C56033xvF.fmtBotPnlPercent$default(pnlRatio, true, 0, 4, null), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) pnlRatio))), (java.lang.String) null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) profitSnapshots), strategyDetailsResponse.getAlgoId(), false, z, 18, (DefaultConstructorMarker) null);
        } else {
            mpStgyCopyProfitChangeData = null;
        }
        java.lang.String orderType3 = strategyDetailsResponse.getOrderType();
        java.lang.String algoId = strategyDetailsResponse.getAlgoId();
        java.lang.String state = strategyDetailsResponse.getState();
        java.lang.String strAEQbTJ = AEQbTJ(strategyDetailsResponse, true);
        TacticsType tacticsTypeUzCIH = C56033xvF.uzCIH(strategyDetailsResponse.getOrderType());
        java.lang.String botLever$default = C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null);
        java.lang.String strEZpvd3 = EZpvd(strategyDetailsResponse.getCTime());
        long jValueOf = C33129mqd.valueOf(strategyDetailsResponse.getCTime());
        java.lang.String strOLrzqt = OLrzqt(strategyDetailsResponse);
        java.util.ArrayList arrayListConversionInsideData$default = conversionInsideData$default(this, strategyDetailsResponse, str, strAhwBna, null, null, 24, null);
        java.lang.String cancelType = strategyDetailsResponse.getCancelType();
        java.lang.String strCopydefault = copydefault(strategyDetailsResponse.getStopResult(), strEZpvd);
        java.lang.String strSubS$default = C33129mqd.subS$default(strategyDetailsResponse.getPTime(), strategyDetailsResponse.getCTime(), null, null, null, 14, null);
        ShareData shareDataKWHzl = KWHzl(strategyDetailsResponse);
        java.lang.String stgyName = strategyDetailsResponse.getStgyName();
        java.lang.String direction = strategyDetailsResponse.getDirection();
        java.lang.String investCcy = strategyDetailsResponse.getInvestCcy();
        java.lang.String tpTriggerPx = strategyDetailsResponse.getTpTriggerPx();
        java.lang.String slTriggerPx = strategyDetailsResponse.getSlTriggerPx();
        java.lang.String tpRatio = strategyDetailsResponse.getTpRatio();
        java.lang.String slRatio = strategyDetailsResponse.getSlRatio();
        java.util.ArrayList<RecurringListItem> recurringList = strategyDetailsResponse.getRecurringList();
        java.lang.String gridStatus = strategyDetailsResponse.getGridStatus();
        java.util.List<TacticsListButtonItem> first = pair.getFirst();
        java.util.List<TacticsListButtonItem> second = pair.getSecond();
        java.lang.String profit = strategyDetailsResponse.getProfit();
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        java.lang.String uTime = strategyDetailsResponse.getUTime();
        java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
        java.lang.String actualMarginSz = strategyDetailsResponse.getActualMarginSz();
        java.lang.String extraMarginSz = strategyDetailsResponse.getExtraMarginSz();
        java.lang.String mktCap = strategyDetailsResponse.getMktCap();
        java.lang.String signalChanId = strategyDetailsResponse.getSignalChanId();
        java.lang.String signalChanName = strategyDetailsResponse.getSignalChanName();
        java.lang.String signalCount = strategyDetailsResponse.getSignalCount();
        java.util.List<java.lang.String> instIds = strategyDetailsResponse.getInstIds();
        java.lang.String runType = strategyDetailsResponse.getRunType();
        java.lang.String gridNum = strategyDetailsResponse.getGridNum();
        TrailingConfig trailingUpConfig = strategyDetailsResponse.getTrailingUpConfig();
        TrailingConfig trailingDownConfig = strategyDetailsResponse.getTrailingDownConfig();
        boolean basePos = strategyDetailsResponse.getBasePos();
        java.util.List listAhwBna = yDY.AhwBna();
        java.util.ArrayList<SmartPortfolioListItem> portfolioList = strategyDetailsResponse.getPortfolioList();
        java.lang.String dcdState = strategyDetailsResponse.getDcdState();
        java.lang.String str3 = dcdState == null ? "" : dcdState;
        java.lang.String balType = strategyDetailsResponse.getBalType();
        java.lang.String interval = strategyDetailsResponse.getInterval();
        java.lang.String deltaRatio = strategyDetailsResponse.getDeltaRatio();
        java.lang.String slMode = strategyDetailsResponse.getSlMode();
        boolean autoMarginReloadSwitch = strategyDetailsResponse.getAutoMarginReloadSwitch();
        java.lang.String symbolsNumber = strategyDetailsResponse.getSymbolsNumber();
        java.util.ArrayList<TacticsListLabelUiData> arrayListAEQbTJ = AEQbTJ(strategyDetailsResponse, true, strEZpvd2, strKWHzl);
        java.lang.String stopType = strategyDetailsResponse.getStopType();
        java.lang.String tpPx = strategyDetailsResponse.getTpPx();
        java.lang.String slPx = strategyDetailsResponse.getSlPx();
        java.lang.String tpPriceRange = strategyDetailsResponse.getTpPriceRange();
        java.lang.String lever = strategyDetailsResponse.getLever();
        java.lang.String liqPx = strategyDetailsResponse.getLiqPx();
        java.lang.String tradeNum = strategyDetailsResponse.getTradeNum();
        java.lang.String pxSpread = strategyDetailsResponse.getPxSpread();
        java.lang.String pxVar = strategyDetailsResponse.getPxVar();
        java.lang.String pxLimit = strategyDetailsResponse.getPxLimit();
        java.lang.String timeInterval = strategyDetailsResponse.getTimeInterval();
        java.lang.String szLimit = strategyDetailsResponse.getSzLimit();
        java.lang.String sz = strategyDetailsResponse.getSz();
        java.lang.String side = strategyDetailsResponse.getSide();
        java.lang.String posSide = strategyDetailsResponse.getPosSide();
        java.lang.String tdMode = strategyDetailsResponse.getTdMode();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        java.lang.String copyType = strategyDetailsResponse.getCopyType();
        java.lang.String profitSharingRatio = strategyDetailsResponse.getProfitSharingRatio();
        java.lang.String sourceAlgoId = strategyDetailsResponse.getSourceAlgoId();
        java.lang.String totalAmt = strategyDetailsResponse.getTotalAmt();
        java.lang.String floatingPnl = strategyDetailsResponse.getFloatingPnl();
        java.lang.String availableMargin = strategyDetailsResponse.getAvailableMargin();
        java.lang.String totalPnlRatio = strategyDetailsResponse.getTotalPnlRatio();
        boolean reserveFunds = strategyDetailsResponse.getReserveFunds();
        java.lang.String perGridProfitRatio = strategyDetailsResponse.getPerGridProfitRatio();
        java.lang.String perMinProfitRate = strategyDetailsResponse.getPerMinProfitRate();
        java.lang.String perMaxProfitRate = strategyDetailsResponse.getPerMaxProfitRate();
        java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
        java.lang.String pxSteps = strategyDetailsResponse.getPxSteps();
        java.lang.String pxStepsMult = strategyDetailsResponse.getPxStepsMult();
        java.lang.String volMult = strategyDetailsResponse.getVolMult();
        java.lang.String tpPct = strategyDetailsResponse.getTpPct();
        java.lang.String slPct = strategyDetailsResponse.getSlPct();
        java.lang.String autoMarginReloadMaxAmount = strategyDetailsResponse.getAutoMarginReloadMaxAmount();
        ExtendedBusinessInfo extendedBusinessInfo = strategyDetailsResponse.getExtendedBusinessInfo();
        boolean outOfRange = strategyDetailsResponse.getOutOfRange();
        java.lang.String sourceCcy = strategyDetailsResponse.getSourceCcy();
        java.lang.String str4 = sourceCcy == null ? "" : sourceCcy;
        java.lang.String curBaseSz = strategyDetailsResponse.getCurBaseSz();
        java.lang.String curQuoteSz = strategyDetailsResponse.getCurQuoteSz();
        java.lang.String minPx = strategyDetailsResponse.getMinPx();
        java.lang.String maxPx = strategyDetailsResponse.getMaxPx();
        java.lang.String totalPnl = strategyDetailsResponse.getTotalPnl();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = strategyDetailsResponse.getArbitrageTotalPnlInfo();
        java.lang.String initOrdAmt = strategyDetailsResponse.getInitOrdAmt();
        java.lang.Boolean boolIsTradeBorrowMode = strategyDetailsResponse.isTradeBorrowMode();
        SmartEarnParam simpleEarn = strategyDetailsResponse.getSimpleEarn();
        java.lang.Float fEZpvd = C55770xqH.Activity.copydefault.EZpvd(strategyDetailsResponse.getLeveragePrincipal());
        BotVo bot = strategyDetailsResponse.getBot();
        java.lang.String safetyOrdAmt = strategyDetailsResponse.getSafetyOrdAmt();
        StrategyDcaEditResp effectiveEditParametersDetails = strategyDetailsResponse.getEffectiveEditParametersDetails();
        java.util.List<java.lang.Integer> strategyTags = strategyDetailsResponse.getStrategyTags();
        EntrySignalOrderAmtParam signalOrderAmtParam = strategyDetailsResponse.getSignalOrderAmtParam();
        ExitSignalOrderAmtParam signalBotOrderStopParam = strategyDetailsResponse.getSignalBotOrderStopParam();
        TacticsVoucherInfo voucherInfo = strategyDetailsResponse.getVoucherInfo();
        java.util.ArrayList<java.lang.String> forbidden = strategyDetailsResponse.getForbidden();
        if (forbidden == null) {
            forbidden = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.String> arrayList = forbidden;
        java.lang.String reinvestment = strategyDetailsResponse.getReinvestment();
        boolean zBooleanValue = (reinvestment == null || (boolZLjUOn = StringsKt__StringsKt.zLjUOn(reinvestment)) == null) ? false : boolZLjUOn.booleanValue();
        java.util.ArrayList<java.lang.String> hiddenFeatures = strategyDetailsResponse.getHiddenFeatures();
        if (hiddenFeatures == null) {
            hiddenFeatures = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.String> arrayList2 = hiddenFeatures;
        java.lang.String lastTradeExpireTime = strategyDetailsResponse.getLastTradeExpireTime();
        java.lang.String lastSettlementSettledTime = strategyDetailsResponse.getLastSettlementSettledTime();
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData2 = mpStgyCopyProfitChangeData == null ? new MpStgyCopyProfitChangeData(new kotlin.Pair("", 0), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, 58, (DefaultConstructorMarker) null) : mpStgyCopyProfitChangeData;
        boolean zIsArbitrageWithStaking = strategyDetailsResponse.isArbitrageWithStaking();
        java.lang.String tradeQuoteCcy2 = strategyDetailsResponse.getTradeQuoteCcy();
        java.lang.String highestApyPeriod = strategyDetailsResponse.getHighestApyPeriod();
        boolean displayMinPaybackDays = strategyDetailsResponse.getDisplayMinPaybackDays();
        java.util.List<FundingFeeApyItem> fundingFeeApyList = strategyDetailsResponse.getFundingFeeApyList();
        java.lang.String totalSpreadProfit = strategyDetailsResponse.getTotalSpreadProfit();
        java.lang.String totalApy = strategyDetailsResponse.getTotalApy();
        java.lang.String fee = strategyDetailsResponse.getFee();
        java.lang.String totalInterestAmt = strategyDetailsResponse.getTotalInterestAmt();
        java.lang.String debtCcy = strategyDetailsResponse.getDebtCcy();
        ProfitDetailResponse arbitrageProfit = strategyDetailsResponse.getArbitrageProfit();
        ProfitDetailResponse stakingProfit = strategyDetailsResponse.getStakingProfit();
        BotVo bot2 = strategyDetailsResponse.getBot();
        SmartArbProfitsInfo smartArbProfitsInfo = new SmartArbProfitsInfo(totalSpreadProfit, totalApy, fee, totalInterestAmt, debtCcy, arbitrageProfit, stakingProfit, (bot2 == null || (smartArbitrage = bot2.getSmartArbitrage()) == null) ? null : smartArbitrage.getAutoStakingProfit(), null, null, null, 1792, null);
        java.util.ArrayList<SmartArbListItem> arbList3 = strategyDetailsResponse.getArbList();
        java.util.List<StrategyProfitResponse> profitSnapshots2 = strategyDetailsResponse.getProfitSnapshots();
        java.util.List listFJNWhG = profitSnapshots2 != null ? CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) profitSnapshots2) : null;
        BalanceDetailInfoDto balanceDetails = strategyDetailsResponse.getBalanceDetails();
        java.lang.String ruleType = strategyDetailsResponse.getRuleType();
        TpSlTriggerParam tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(strategyDetailsResponse.getTpslTriggerParamResp());
        java.lang.String period = strategyDetailsResponse.getPeriod();
        java.lang.String recurringDay = strategyDetailsResponse.getRecurringDay();
        java.lang.String recurringHour = strategyDetailsResponse.getRecurringHour();
        java.lang.String recurringTime = strategyDetailsResponse.getRecurringTime();
        java.util.ArrayList<RecurringListItem> recurringList2 = strategyDetailsResponse.getRecurringList();
        BotVo bot3 = strategyDetailsResponse.getBot();
        return new TacticsData(orderType3, algoId, strKWHzl, strEZpvd2, state, "", true, strAEQbTJ, tacticsTypeUzCIH, 0, botLever$default, strEZpvd3, jValueOf, strOLrzqt, arrayListConversionInsideData$default, strEZpvd, cancelType, strCopydefault, shareDataKWHzl, listAhwBna, null, stgyName, direction, tpTriggerPx, slTriggerPx, tpRatio, slRatio, null, recurringList, portfolioList, investCcy, null, first, second, arrayListAEQbTJ, signParams, uTime, triggerParams, null, stopType, tpPx, slPx, tpSlTriggerParamOLrzqt, tpPriceRange, gridStatus, lever, actualMarginSz, extraMarginSz, liqPx, null, null, tradeNum, pxSpread, pxVar, pxLimit, timeInterval, szLimit, sz, side, posSide, tdMode, null, ccy, copyType, profitSharingRatio, sourceAlgoId, mktCap, instIds, totalAmt, signalChanId, signalChanName, floatingPnl, availableMargin, totalPnlRatio, signalCount, false, null, null, null, null, profit, symbolsNumber, 0, maxPx, minPx, runType, gridNum, trailingUpConfig, trailingDownConfig, null, java.lang.Boolean.valueOf(reserveFunds), basePos, perGridProfitRatio, perMinProfitRate, perMaxProfitRate, balType, interval, deltaRatio, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, slMode, null, null, autoMarginReloadSwitch, autoMarginReloadMaxAmount, extendedBusinessInfo, str2, arbList3, outOfRange, str4, null, curQuoteSz, curBaseSz, null, ruleType, boolIsTradeBorrowMode, totalPnl, false, strategyTags, signalOrderAmtParam, signalBotOrderStopParam, voucherInfo, arrayList, arrayList2, str3, zBooleanValue, lastTradeExpireTime, lastSettlementSettledTime, mpStgyCopyProfitChangeData2, strSubS$default, null, zIsArbitrageWithStaking, null, null, null, simpleEarn, null, null, null, null, arbitrageTotalPnlInfo, fEZpvd, null, highestApyPeriod, displayMinPaybackDays, fundingFeeApyList, listFJNWhG, null, tradeQuoteCcy2, smartArbProfitsInfo, balanceDetails, bot, null, initOrdAmt, safetyOrdAmt, effectiveEditParametersDetails, swapCoinMProfitSwitchUiModelCopydefault, new RecurringBuyDetails(period, recurringDay, recurringHour, recurringTime, recurringList2, bot3 != null ? bot3.getRecurring() : null, strategyDetailsResponse.getAmt()), -2013265408, 537264192, 33880064, 2360832, 277149504, 0, null);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL, (java.lang.Object) str) ? C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getPosition), C56424yEw.gEmmrt(C56390yDp.OLrzqt("tradeSymbolOne", str2), C56390yDp.OLrzqt("tradeSymbolTwo", str2))) : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TacticsData EZpvd(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instFamily;
        kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> pairAkhnZx;
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData;
        boolean z;
        SmartArbitrageVo smartArbitrage;
        java.lang.Boolean boolZLjUOn;
        BacktestDto backtest;
        BacktestDto backtest2;
        java.lang.String pnlRatio;
        ProfitMarginPerCcyVo profitMarginPerCcyVo;
        BizInstrument suggestedInstrument$default;
        java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), "", null, 8, null);
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
        java.lang.String strKWHzl = c56059xvf.KWHzl(orderType, arbList != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList) : null, strategyDetailsResponse.getInstType());
        java.lang.String orderType2 = strategyDetailsResponse.getOrderType();
        java.util.ArrayList<SmartArbListItem> arbList2 = strategyDetailsResponse.getArbList();
        java.lang.String strEZpvd = c56059xvf.EZpvd(orderType2, arbList2 != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList2) : null, strategyDetailsResponse.getInstId());
        java.lang.String instFamily2 = strategyDetailsResponse.getInstFamily();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strKWHzl, strEZpvd, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        java.lang.String str = (instFamily2 == null || instFamily2.length() == 0) ? instFamily : instFamily2;
        ContractDcaSpecialData contractDcaSpecialData = new ContractDcaSpecialData((java.lang.String) null, 1, (DefaultConstructorMarker) null);
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "contract_dca")) {
            contractDcaSpecialData.setAvgPx(C33129mqd.valueOf(strategyDetailsResponse.getAvgPx(), 0) ? "--" : strategyDetailsResponse.getAvgPx());
        }
        java.lang.String strAhwBna = C56033xvF.AhwBna(strKWHzl, strEZpvd, strategyDetailsResponse.getDisplayId());
        java.lang.String tradeQuoteCcy = strategyDetailsResponse.getTradeQuoteCcy();
        java.lang.String str2 = (tradeQuoteCcy == null || tradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)) ? strAhwBna : tradeQuoteCcy;
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "smart_arbitrage")) {
            C55998xuX c55998xuX = C55998xuX.copydefault;
            pairAkhnZx = c55998xuX.AkhnZx(c55998xuX.KWHzl(strategyDetailsResponse));
        } else {
            pairAkhnZx = C55998xuX.copydefault.AkhnZx(new StrategyInfoOperatorBean(strategyDetailsResponse.isHistory(), strategyDetailsResponse.getCopyType(), strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getState(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getProfit(), "", "", 1, false, false, "", false, strategyDetailsResponse.getForbidden(), 2048, null));
        }
        kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> pair = pairAkhnZx;
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModelCopydefault = copydefault(strategyDetailsResponse);
        boolean z2 = swapCoinMProfitSwitchUiModelCopydefault != null && swapCoinMProfitSwitchUiModelCopydefault.isCoinM() && swapCoinMProfitSwitchUiModelCopydefault != null && swapCoinMProfitSwitchUiModelCopydefault.isUsdtSelected();
        if (strategyDetailsResponse.getProfitSnapshots() != null) {
            java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponse.getProfitSnapshots();
            if (profitSnapshots == null) {
                profitSnapshots = yDY.AhwBna();
            }
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitSnapshots);
            if (strategyProfitResponse == null) {
                strategyProfitResponse = new StrategyProfitResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 1023, (DefaultConstructorMarker) null);
            }
            if (!z2 || (profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT")) == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                pnlRatio = strategyProfitResponse.getPnlRatio();
            }
            mpStgyCopyProfitChangeData = new MpStgyCopyProfitChangeData(new kotlin.Pair(C56033xvF.fmtBotPnlPercent$default(pnlRatio, true, 0, 4, null), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) pnlRatio))), (java.lang.String) null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) profitSnapshots), strategyDetailsResponse.getAlgoId(), false, z2, 18, (DefaultConstructorMarker) null);
        } else {
            mpStgyCopyProfitChangeData = null;
        }
        java.lang.String orderType3 = strategyDetailsResponse.getOrderType();
        java.lang.String algoId = strategyDetailsResponse.getAlgoId();
        java.lang.String state = strategyDetailsResponse.getState();
        java.lang.String botLever$default = C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null);
        java.lang.String strOLrzqt = OLrzqt(strategyDetailsResponse);
        BotVo bot = strategyDetailsResponse.getBot();
        if (((bot == null || (backtest2 = bot.getBacktest()) == null) ? null : backtest2.getStatus()) == BotStatus.Completed) {
            z = true;
        } else {
            BotVo bot2 = strategyDetailsResponse.getBot();
            if (((bot2 == null || (backtest = bot2.getBacktest()) == null) ? null : backtest.getStatus()) != BotStatus.Failed) {
                z = false;
            }
        }
        java.lang.String strAEQbTJ = AEQbTJ(strategyDetailsResponse, false);
        TacticsType tacticsTypeUzCIH = C56033xvF.uzCIH(strategyDetailsResponse.getOrderType());
        java.lang.String strEZpvd2 = EZpvd(strategyDetailsResponse.getCTime());
        long jValueOf = C33129mqd.valueOf(strategyDetailsResponse.getCTime());
        java.util.ArrayList<TacticsInsideItemData> arrayListOLrzqt = OLrzqt(strategyDetailsResponse, str2, strAhwBna, strEZpvd, strKWHzl);
        java.lang.String strSubS$default = C33129mqd.subS$default(strategyDetailsResponse.getPTime(), strategyDetailsResponse.getCTime(), null, null, null, 14, null);
        ShareData shareDataKWHzl = KWHzl(strategyDetailsResponse);
        java.lang.String direction = strategyDetailsResponse.getDirection();
        java.lang.String investCcy = strategyDetailsResponse.getInvestCcy();
        java.lang.String tpTriggerPx = strategyDetailsResponse.getTpTriggerPx();
        java.lang.String slTriggerPx = strategyDetailsResponse.getSlTriggerPx();
        java.lang.String tpRatio = strategyDetailsResponse.getTpRatio();
        java.lang.String slRatio = strategyDetailsResponse.getSlRatio();
        java.util.ArrayList<RecurringListItem> recurringList = strategyDetailsResponse.getRecurringList();
        java.lang.String gridStatus = strategyDetailsResponse.getGridStatus();
        java.util.List<TacticsListButtonItem> first = pair.getFirst();
        java.util.List<TacticsListButtonItem> second = pair.getSecond();
        java.lang.String profit = strategyDetailsResponse.getProfit();
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
        java.lang.String actualMarginSz = strategyDetailsResponse.getActualMarginSz();
        java.lang.String extraMarginSz = strategyDetailsResponse.getExtraMarginSz();
        java.lang.String mktCap = strategyDetailsResponse.getMktCap();
        java.lang.String signalChanId = strategyDetailsResponse.getSignalChanId();
        java.lang.String signalChanName = strategyDetailsResponse.getSignalChanName();
        java.lang.String signalCount = strategyDetailsResponse.getSignalCount();
        java.util.List<java.lang.String> instIds = strategyDetailsResponse.getInstIds();
        java.lang.String runType = strategyDetailsResponse.getRunType();
        java.lang.String gridNum = strategyDetailsResponse.getGridNum();
        TrailingConfig trailingUpConfig = strategyDetailsResponse.getTrailingUpConfig();
        TrailingConfig trailingDownConfig = strategyDetailsResponse.getTrailingDownConfig();
        java.lang.String trailingDownFund = strategyDetailsResponse.getTrailingDownFund();
        boolean basePos = strategyDetailsResponse.getBasePos();
        java.util.List listAhwBna = yDY.AhwBna();
        java.util.ArrayList<SmartPortfolioListItem> portfolioList = strategyDetailsResponse.getPortfolioList();
        java.lang.String dcdState = strategyDetailsResponse.getDcdState();
        java.lang.String str3 = dcdState == null ? "" : dcdState;
        java.lang.String balType = strategyDetailsResponse.getBalType();
        java.lang.String interval = strategyDetailsResponse.getInterval();
        java.lang.String deltaRatio = strategyDetailsResponse.getDeltaRatio();
        java.lang.String slMode = strategyDetailsResponse.getSlMode();
        boolean autoMarginReloadSwitch = strategyDetailsResponse.getAutoMarginReloadSwitch();
        java.lang.String symbolsNumber = strategyDetailsResponse.getSymbolsNumber();
        java.util.ArrayList<TacticsListLabelUiData> arrayListAEQbTJ = AEQbTJ(strategyDetailsResponse, false, strEZpvd, strKWHzl);
        java.lang.String strAddS$default = C33129mqd.addS$default(strategyDetailsResponse.getCompletedCycles(), 1, null, null, null, 14, null);
        java.lang.String stopType = strategyDetailsResponse.getStopType();
        java.lang.String tpPx = strategyDetailsResponse.getTpPx();
        java.lang.String slPx = strategyDetailsResponse.getSlPx();
        java.lang.String tpPriceRange = strategyDetailsResponse.getTpPriceRange();
        java.lang.String lever = strategyDetailsResponse.getLever();
        java.lang.String liqPx = strategyDetailsResponse.getLiqPx();
        java.lang.String tradeNum = strategyDetailsResponse.getTradeNum();
        java.lang.String pxSpread = strategyDetailsResponse.getPxSpread();
        java.lang.String pxVar = strategyDetailsResponse.getPxVar();
        java.lang.String pxLimit = strategyDetailsResponse.getPxLimit();
        java.lang.String timeInterval = strategyDetailsResponse.getTimeInterval();
        java.lang.String szLimit = strategyDetailsResponse.getSzLimit();
        java.lang.String sz = strategyDetailsResponse.getSz();
        java.lang.String side = strategyDetailsResponse.getSide();
        java.lang.String posSide = strategyDetailsResponse.getPosSide();
        java.lang.String tdMode = strategyDetailsResponse.getTdMode();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        java.lang.String copyType = strategyDetailsResponse.getCopyType();
        java.lang.String profitSharingRatio = strategyDetailsResponse.getProfitSharingRatio();
        java.lang.String sourceAlgoId = strategyDetailsResponse.getSourceAlgoId();
        java.lang.String totalAmt = strategyDetailsResponse.getTotalAmt();
        java.lang.String floatingPnl = strategyDetailsResponse.getFloatingPnl();
        java.lang.String availableMargin = strategyDetailsResponse.getAvailableMargin();
        java.lang.String totalPnlRatio = strategyDetailsResponse.getTotalPnlRatio();
        boolean reserveFunds = strategyDetailsResponse.getReserveFunds();
        java.lang.String perGridProfitRatio = strategyDetailsResponse.getPerGridProfitRatio();
        java.lang.String perMinProfitRate = strategyDetailsResponse.getPerMinProfitRate();
        java.lang.String perMaxProfitRate = strategyDetailsResponse.getPerMaxProfitRate();
        java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
        java.lang.String pxSteps = strategyDetailsResponse.getPxSteps();
        java.lang.String pxStepsMult = strategyDetailsResponse.getPxStepsMult();
        java.lang.String volMult = strategyDetailsResponse.getVolMult();
        java.lang.String tpPct = strategyDetailsResponse.getTpPct();
        java.lang.String slPct = strategyDetailsResponse.getSlPct();
        java.lang.String autoMarginReloadMaxAmount = strategyDetailsResponse.getAutoMarginReloadMaxAmount();
        ExtendedBusinessInfo extendedBusinessInfo = strategyDetailsResponse.getExtendedBusinessInfo();
        boolean outOfRange = strategyDetailsResponse.getOutOfRange();
        java.lang.String sourceCcy = strategyDetailsResponse.getSourceCcy();
        java.lang.String str4 = sourceCcy == null ? "" : sourceCcy;
        java.lang.String curBaseSz = strategyDetailsResponse.getCurBaseSz();
        java.lang.String curQuoteSz = strategyDetailsResponse.getCurQuoteSz();
        java.lang.String minPx = strategyDetailsResponse.getMinPx();
        java.lang.String maxPx = strategyDetailsResponse.getMaxPx();
        java.lang.String totalPnl = strategyDetailsResponse.getTotalPnl();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = strategyDetailsResponse.getArbitrageTotalPnlInfo();
        java.lang.String initOrdAmt = strategyDetailsResponse.getInitOrdAmt();
        java.lang.Boolean boolIsTradeBorrowMode = strategyDetailsResponse.isTradeBorrowMode();
        SmartEarnParam simpleEarn = strategyDetailsResponse.getSimpleEarn();
        java.lang.Float fEZpvd = C55770xqH.Activity.copydefault.EZpvd(strategyDetailsResponse.getLeveragePrincipal());
        BotVo bot3 = strategyDetailsResponse.getBot();
        java.lang.String safetyOrdAmt = strategyDetailsResponse.getSafetyOrdAmt();
        StrategyDcaEditResp effectiveEditParametersDetails = strategyDetailsResponse.getEffectiveEditParametersDetails();
        java.util.List<java.lang.Integer> strategyTags = strategyDetailsResponse.getStrategyTags();
        EntrySignalOrderAmtParam signalOrderAmtParam = strategyDetailsResponse.getSignalOrderAmtParam();
        ExitSignalOrderAmtParam signalBotOrderStopParam = strategyDetailsResponse.getSignalBotOrderStopParam();
        TacticsVoucherInfo voucherInfo = strategyDetailsResponse.getVoucherInfo();
        java.util.ArrayList<java.lang.String> forbidden = strategyDetailsResponse.getForbidden();
        if (forbidden == null) {
            forbidden = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.String> arrayList = forbidden;
        java.lang.String reinvestment = strategyDetailsResponse.getReinvestment();
        boolean zBooleanValue = (reinvestment == null || (boolZLjUOn = StringsKt__StringsKt.zLjUOn(reinvestment)) == null) ? false : boolZLjUOn.booleanValue();
        java.util.ArrayList<java.lang.String> hiddenFeatures = strategyDetailsResponse.getHiddenFeatures();
        if (hiddenFeatures == null) {
            hiddenFeatures = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.String> arrayList2 = hiddenFeatures;
        java.lang.String lastTradeExpireTime = strategyDetailsResponse.getLastTradeExpireTime();
        java.lang.String lastSettlementSettledTime = strategyDetailsResponse.getLastSettlementSettledTime();
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData2 = mpStgyCopyProfitChangeData == null ? new MpStgyCopyProfitChangeData(new kotlin.Pair("", 0), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, 58, (DefaultConstructorMarker) null) : mpStgyCopyProfitChangeData;
        boolean zIsArbitrageWithStaking = strategyDetailsResponse.isArbitrageWithStaking();
        java.lang.String tradeQuoteCcy2 = strategyDetailsResponse.getTradeQuoteCcy();
        java.lang.String highestApyPeriod = strategyDetailsResponse.getHighestApyPeriod();
        boolean displayMinPaybackDays = strategyDetailsResponse.getDisplayMinPaybackDays();
        java.util.List<FundingFeeApyItem> fundingFeeApyList = strategyDetailsResponse.getFundingFeeApyList();
        java.lang.String totalSpreadProfit = strategyDetailsResponse.getTotalSpreadProfit();
        java.lang.String totalApy = strategyDetailsResponse.getTotalApy();
        java.lang.String fee = strategyDetailsResponse.getFee();
        java.lang.String totalInterestAmt = strategyDetailsResponse.getTotalInterestAmt();
        java.lang.String debtCcy = strategyDetailsResponse.getDebtCcy();
        ProfitDetailResponse arbitrageProfit = strategyDetailsResponse.getArbitrageProfit();
        ProfitDetailResponse stakingProfit = strategyDetailsResponse.getStakingProfit();
        BotVo bot4 = strategyDetailsResponse.getBot();
        SmartArbProfitsInfo smartArbProfitsInfo = new SmartArbProfitsInfo(totalSpreadProfit, totalApy, fee, totalInterestAmt, debtCcy, arbitrageProfit, stakingProfit, (bot4 == null || (smartArbitrage = bot4.getSmartArbitrage()) == null) ? null : smartArbitrage.getAutoStakingProfit(), null, null, null, 1792, null);
        java.util.ArrayList<SmartArbListItem> arbList3 = strategyDetailsResponse.getArbList();
        java.util.List<StrategyProfitResponse> profitSnapshots2 = strategyDetailsResponse.getProfitSnapshots();
        java.util.List listFJNWhG = profitSnapshots2 != null ? CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) profitSnapshots2) : null;
        BalanceDetailInfoDto balanceDetails = strategyDetailsResponse.getBalanceDetails();
        TpSlTriggerParam tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(strategyDetailsResponse.getTpslTriggerParamResp());
        java.lang.String period = strategyDetailsResponse.getPeriod();
        java.lang.String recurringDay = strategyDetailsResponse.getRecurringDay();
        java.lang.String recurringHour = strategyDetailsResponse.getRecurringHour();
        java.lang.String recurringTime = strategyDetailsResponse.getRecurringTime();
        java.util.ArrayList<RecurringListItem> recurringList2 = strategyDetailsResponse.getRecurringList();
        BotVo bot5 = strategyDetailsResponse.getBot();
        return new TacticsData(orderType3, algoId, strKWHzl, strEZpvd, state, "", z, strAEQbTJ, tacticsTypeUzCIH, 0, botLever$default, strEZpvd2, jValueOf, strOLrzqt, arrayListOLrzqt, botAmountUnit$default, "", null, shareDataKWHzl, listAhwBna, null, "", direction, tpTriggerPx, slTriggerPx, tpRatio, slRatio, null, recurringList, portfolioList, investCcy, null, first, second, arrayListAEQbTJ, signParams, "", triggerParams, strAddS$default, stopType, tpPx, slPx, tpSlTriggerParamOLrzqt, tpPriceRange, gridStatus, lever, actualMarginSz, extraMarginSz, liqPx, null, null, tradeNum, pxSpread, pxVar, pxLimit, timeInterval, szLimit, sz, side, posSide, tdMode, null, ccy, copyType, profitSharingRatio, sourceAlgoId, mktCap, instIds, totalAmt, signalChanId, signalChanName, floatingPnl, availableMargin, totalPnlRatio, signalCount, false, null, null, null, null, profit, symbolsNumber, 0, maxPx, minPx, runType, gridNum, trailingUpConfig, trailingDownConfig, trailingDownFund, java.lang.Boolean.valueOf(reserveFunds), basePos, perGridProfitRatio, perMinProfitRate, perMaxProfitRate, balType, interval, deltaRatio, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, slMode, null, null, autoMarginReloadSwitch, autoMarginReloadMaxAmount, extendedBusinessInfo, str, arbList3, outOfRange, str4, null, curQuoteSz, curBaseSz, null, null, boolIsTradeBorrowMode, totalPnl, false, strategyTags, signalOrderAmtParam, signalBotOrderStopParam, voucherInfo, arrayList, arrayList2, str3, zBooleanValue, lastTradeExpireTime, lastSettlementSettledTime, mpStgyCopyProfitChangeData2, strSubS$default, null, zIsArbitrageWithStaking, null, null, null, simpleEarn, null, null, null, null, arbitrageTotalPnlInfo, fEZpvd, contractDcaSpecialData, highestApyPeriod, displayMinPaybackDays, fundingFeeApyList, listFJNWhG, null, tradeQuoteCcy2, smartArbProfitsInfo, balanceDetails, bot3, null, initOrdAmt, safetyOrdAmt, effectiveEditParametersDetails, swapCoinMProfitSwitchUiModelCopydefault, new RecurringBuyDetails(period, recurringDay, recurringHour, recurringTime, recurringList2, bot5 != null ? bot5.getRecurring() : null, strategyDetailsResponse.getAmt()), -2013134336, 537264128, 325632, 6555136, 276887360, 0, null);
    }

    public final SwapCoinMProfitSwitchUiModel copydefault(StrategyDetailsResponse strategyDetailsResponse) {
        C55887xsS c55887xsS = new C55887xsS(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
        C55889xsU c55889xsU = C55889xsU.copydefault;
        boolean zCopydefault = c55889xsU.copydefault(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getBot());
        if (!zCopydefault) {
            return null;
        }
        int iAEQbTJ = c55889xsU.AEQbTJ(strategyDetailsResponse.getAlgoId());
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        return new SwapCoinMProfitSwitchUiModel(zCopydefault, iAEQbTJ, bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarketInfoSettleCcy() : null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r0.equals("contract_grid") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r0.equals("smart_arbitrage") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r0.equals("signal_bot") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r0.equals("contract_dca") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r0.equals("spot_dca") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r3.getPnlRatio();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0.equals("recurring") == false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                break;
            case -1402017003:
                break;
            case -1086683216:
                break;
            case -557961837:
                break;
            case -512749997:
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
                        return strategyDetailsResponse.getPnlRatioInSourceCcy();
                    }
                    return strategyDetailsResponse.getPnlRatio();
                }
                return "";
            case 1165749981:
                break;
            default:
                return "";
        }
    }

    public final ShareData KWHzl(StrategyDetailsResponse strategyDetailsResponse) {
        BizTradeStrategyInfo bizTradeStrategyInfoKWHzl;
        if (strategyDetailsResponse.isHistory()) {
            bizTradeStrategyInfoKWHzl = C55891xsW.AEQbTJ.EZpvd(strategyDetailsResponse);
        } else {
            bizTradeStrategyInfoKWHzl = C55891xsW.AEQbTJ.KWHzl(strategyDetailsResponse);
        }
        return new C55930xtI(true).djBIcL(bizTradeStrategyInfoKWHzl);
    }

    public static /* synthetic */ java.util.ArrayList getLabelList$default(C55936xtO c55936xtO, StrategyDetailsResponse strategyDetailsResponse, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return c55936xtO.AEQbTJ(strategyDetailsResponse, z, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<TacticsListLabelUiData> AEQbTJ(StrategyDetailsResponse strategyDetailsResponse, boolean z, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList<TacticsListLabelUiData> arrayListCopydefault;
        java.lang.String str3;
        java.lang.String strAYXKKw;
        int iHashCode;
        TacticsVoucherInfo voucherInfo;
        java.lang.Integer numValueOf;
        java.lang.Integer label;
        SmartArbListItem smartArbListItem;
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        int iHashCode2 = orderType.hashCode();
        if (iHashCode2 != -1402017003) {
            if (iHashCode2 == -557961837) {
                if (orderType.equals("smart_arbitrage")) {
                    arrayListCopydefault = new java.util.ArrayList<>();
                    java.lang.Float leverPrincipal = strategyDetailsResponse.getLeverPrincipal();
                    if (leverPrincipal != null) {
                        float fFloatValue = leverPrincipal.floatValue();
                        java.lang.String leverPrincipal$default = C56033xvF.formatLeverPrincipal$default(java.lang.Float.valueOf(fFloatValue), null, 2, null);
                        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Float.valueOf(fFloatValue));
                        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(strategyDetailsResponse.getTotalAmt());
                        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                        java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
                        java.lang.String instFamily = (arbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null) ? null : smartArbListItem.getInstFamily();
                        if (instFamily == null) {
                            instFamily = "";
                        }
                        BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, "SWAP");
                        java.lang.String quoteSymbol = bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getQuoteSymbol() : null;
                        arrayListCopydefault.add(new TacticsListLabelLeverPrincipalData(leverPrincipal$default, bigDecimalEZpvd, bigDecimalEZpvd2, quoteSymbol == null ? "" : quoteSymbol, false, 0, 0, 0, PsExtractor.VIDEO_STREAM_MASK, null));
                    }
                }
            } else {
                arrayListCopydefault = (iHashCode2 == -512749997 && orderType.equals("contract_grid")) ? yDY.copydefault(new TacticsListLabelData(C56033xvF.AhwBna(strategyDetailsResponse.getDirection()), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null), new TacticsListLabelData(C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null)) : new java.util.ArrayList<>();
            }
        } else if (orderType.equals("contract_dca")) {
            arrayListCopydefault = yDY.copydefault(new TacticsListLabelData(C56033xvF.AhwBna(strategyDetailsResponse.getDirection()), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null), new TacticsListLabelData(C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null), false, C56033xvF.valueOf(strategyDetailsResponse.getDirection()), 0, 0, 26, null));
        }
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "3")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onPlayFromMediaId);
        } else if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.izFvvl);
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceAlgoId())) {
                str3 = "";
                if (str3.length() > 0) {
                    arrayListCopydefault.add(new TacticsListLabelRoleData(str3, false, 0, 0, 0, 30, null));
                }
                java.lang.String orderType2 = strategyDetailsResponse.getOrderType();
                iHashCode = orderType2.hashCode();
                if (iHashCode == -557961837 ? orderType2.equals("smart_arbitrage") : !(iHashCode == -512749997 ? !orderType2.equals("contract_grid") : !(iHashCode == 3181382 && orderType2.equals("grid")))) {
                    voucherInfo = strategyDetailsResponse.getVoucherInfo();
                    if (voucherInfo != null) {
                        TacticsVoucherType voucherType = voucherInfo.getVoucherType();
                        int i = voucherType == null ? -1 : Activity.OLrzqt[voucherType.ordinal()];
                        if (i == 1) {
                            numValueOf = java.lang.Integer.valueOf(C55688xof.Application.read);
                        } else if (i == 2) {
                            numValueOf = java.lang.Integer.valueOf(C55688xof.Application.HJWChPiaHEvk);
                        } else {
                            numValueOf = i != 3 ? null : java.lang.Integer.valueOf(C55688xof.Application.ilfrrN);
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            kotlin.Pair[] pairArr = new kotlin.Pair[4];
                            pairArr[0] = C56390yDp.OLrzqt("percent", C56033xvF.fmtBotPnlPercent$default(voucherInfo.getVoucherPnlRatio(), false, 0, 6, null));
                            pairArr[1] = C56390yDp.OLrzqt("num", pTB.formatLocalized$default(xVG.KWHzl(voucherInfo.getAmount()), null, 1, null));
                            java.lang.String unit = voucherInfo.getUnit();
                            if (unit.length() == 0) {
                                unit = "USDT";
                            }
                            pairArr[2] = C56390yDp.OLrzqt("ccy", unit);
                            VoucherStatus voucherStatus = voucherInfo.getVoucherStatus();
                            java.lang.String strAYXKKw2 = (voucherStatus == null || (label = voucherStatus.getLabel()) == null) ? null : C33070mpX.AYXKKw(label.intValue());
                            if (strAYXKKw2 == null) {
                                strAYXKKw2 = "";
                            }
                            pairArr[3] = C56390yDp.OLrzqt("status", strAYXKKw2);
                            arrayListCopydefault.add(new TacticsListLabelVoucherData(C33069mpW.copydefault(iIntValue, C56424yEw.gEmmrt(pairArr)), true, 0, 0, 0, voucherInfo, 28, null));
                        }
                    }
                }
                java.util.List<java.lang.String> vipProfitState = strategyDetailsResponse.getVipProfitState();
                if (!z) {
                    for (java.lang.String str4 : vipProfitState) {
                        java.lang.String instId = strategyDetailsResponse.getInstId();
                        if (instId.length() == 0) {
                            instId = null;
                        }
                        java.lang.String str5 = instId == null ? str : instId;
                        java.lang.String instType = strategyDetailsResponse.getInstType();
                        if (instType.length() == 0) {
                            instType = null;
                        }
                        arrayListCopydefault.add(new TacticsListLabelVipProfitData(str4, true, 8, -5, 0, new TacticsVipProfitData(str5, instType == null ? str2 : instType, Intrinsics.EZpvd((java.lang.Object) C33070mpX.AYXKKw(C55688xof.Application.getQueueTitle), (java.lang.Object) str4) ? "auto_education_single_earn" : "auto_education_single_staking", strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getTradeQuoteCcy(), Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "smart_portfolio") ? CollectionsKt___CollectionsKt.joinToString$default(strategyDetailsResponse.getPortfolioList(), ",", null, null, 0, null, new Function1() { // from class: o.xtM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C55936xtO.KWHzl((SmartPortfolioListItem) obj);
                            }
                        }, 30, null) : ""), 16, null));
                    }
                }
                return arrayListCopydefault;
            }
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.sanrWj);
        }
        str3 = strAYXKKw;
        if (str3.length() > 0) {
        }
        java.lang.String orderType22 = strategyDetailsResponse.getOrderType();
        iHashCode = orderType22.hashCode();
        if (iHashCode == -557961837) {
            voucherInfo = strategyDetailsResponse.getVoucherInfo();
            if (voucherInfo != null) {
            }
        }
        java.util.List<java.lang.String> vipProfitState2 = strategyDetailsResponse.getVipProfitState();
        if (!z) {
        }
        return arrayListCopydefault;
    }

    public static final java.lang.CharSequence KWHzl(SmartPortfolioListItem smartPortfolioListItem) {
        Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
        java.lang.String ccy = smartPortfolioListItem.getCcy();
        return ccy == null ? "" : ccy;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(StrategyDetailsResponse strategyDetailsResponse, boolean z) {
        java.lang.String strKWHzl;
        java.lang.String instFamily;
        SmartArbListItem smartArbListItem;
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                if (!orderType.equals("spot_dca")) {
                    strKWHzl = "--";
                } else {
                    strKWHzl = C56033xvF.AEQbTJ(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), z, strategyDetailsResponse.getRuleType(), strategyDetailsResponse.getDisplayId());
                }
                break;
            case -1402017003:
                if (!orderType.equals("contract_dca")) {
                }
                break;
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                    java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
                    if (arbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (instFamily = smartArbListItem.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    strKWHzl = c56051xvX.KWHzl(instFamily);
                    break;
                }
                break;
            case -512749997:
                if (!orderType.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (!orderType.equals("grid")) {
                }
                break;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "recurring")) {
            java.lang.String stgyName = strategyDetailsResponse.getStgyName();
            if (stgyName.length() != 0) {
                return stgyName;
            }
            java.util.ArrayList<RecurringListItem> recurringList = strategyDetailsResponse.getRecurringList();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(recurringList, 10));
            java.util.Iterator<T> it = recurringList.iterator();
            while (it.hasNext()) {
                arrayList.add(((RecurringListItem) it.next()).getCcy());
            }
            return C55962xto.KWHzl(arrayList, C33070mpX.AYXKKw(C55688xof.Application.addCustomAction));
        }
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(strategyDetailsResponse.getOrderType());
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) (strKWHzl + " " + (tacticsTypeAEQbTJ != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()) : null))).toString();
    }

    public static /* synthetic */ java.util.ArrayList conversionInsideData$default(C55936xtO c55936xtO, StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        return c55936xtO.OLrzqt(strategyDetailsResponse, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<TacticsInsideItemData> OLrzqt(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "stopped") || strategyDetailsResponse.isHistory()) {
            java.lang.String orderType = strategyDetailsResponse.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    if (orderType.equals("spot_dca")) {
                        arrayList.addAll(new C55930xtI(true).EZpvd(C55891xsW.AEQbTJ.EZpvd(strategyDetailsResponse), "", str, str2));
                    }
                    break;
                case -1402017003:
                    if (orderType.equals("contract_dca")) {
                    }
                    break;
                case -557961837:
                    if (orderType.equals("smart_arbitrage")) {
                        convertSmartArbInsideData$default(this, strategyDetailsResponse, arrayList, null, null, 12, null);
                    }
                    break;
                case -512749997:
                    if (orderType.equals("contract_grid")) {
                        copydefault(strategyDetailsResponse, C56066xvm.EZpvd.OLrzqt(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getCcy()), arrayList);
                    }
                    break;
                case 3181382:
                    if (orderType.equals("grid")) {
                    }
                    break;
                case 1165749981:
                    if (orderType.equals("recurring")) {
                    }
                    break;
            }
        } else {
            java.lang.String orderType2 = strategyDetailsResponse.getOrderType();
            switch (orderType2.hashCode()) {
                case -1831183611:
                    if (orderType2.equals("spot_dca")) {
                        arrayList.addAll(new C55930xtI(true).EZpvd(C55891xsW.AEQbTJ.KWHzl(strategyDetailsResponse), "", str, str2));
                    }
                    break;
                case -1402017003:
                    if (orderType2.equals("contract_dca")) {
                    }
                    break;
                case -557961837:
                    if (orderType2.equals("smart_arbitrage")) {
                        AEQbTJ(strategyDetailsResponse, arrayList, str3, str4);
                    }
                    break;
                case -512749997:
                    if (orderType2.equals("contract_grid")) {
                        copydefault(strategyDetailsResponse, str, str2, arrayList);
                    }
                    break;
                case 3181382:
                    if (orderType2.equals("grid")) {
                    }
                    break;
                case 1165749981:
                    if (orderType2.equals("recurring")) {
                    }
                    break;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void convertSmartArbInsideData$default(C55936xtO c55936xtO, StrategyDetailsResponse strategyDetailsResponse, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        c55936xtO.AEQbTJ(strategyDetailsResponse, (java.util.ArrayList<TacticsInsideItemData>) arrayList, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(StrategyDetailsResponse strategyDetailsResponse, java.util.ArrayList<TacticsInsideItemData> arrayList, java.lang.String str, java.lang.String str2) {
        SmartArbPlanLeg smartArbPlanLeg;
        java.lang.String instFamily;
        java.lang.String instType;
        java.lang.String str3;
        java.lang.String strFmtBotValueBySymbol$default;
        java.lang.String sourceCcy;
        kotlin.Pair pairOLrzqt;
        TacticsInsideItemData tacticsInsideItemData;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        TacticsInsideItemData tacticsInsideItemData2;
        java.lang.String smartArbProfit$default;
        TacticsInsideItemData tacticsInsideItemData3;
        java.lang.String smartArbProfit$default2;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String ccy;
        int i;
        SmartArbitrageVo smartArbitrage;
        ProfitDetailResponse quote;
        SmartArbitrageVo smartArbitrage2;
        ProfitDetailResponse autoStakingProfit;
        ProfitDetailResponse quote2;
        java.lang.String total;
        ProfitDetailResponse quote3;
        java.lang.String total2;
        BotCommon common;
        java.lang.String displayQuoteSymbol;
        SmartArbListItem smartArbListItem;
        SmartArbListItem smartArbListItem2;
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        java.lang.Object next;
        java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
        if (arbList == null || (smartArbListItem2 = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (planLeg = smartArbListItem2.getPlanLeg()) == null) {
            smartArbPlanLeg = null;
        } else {
            java.util.Iterator<T> it = planLeg.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((SmartArbPlanLeg) next).getInstType(), (java.lang.Object) "SWAP")) {
                        break;
                    }
                }
            }
            smartArbPlanLeg = (SmartArbPlanLeg) next;
        }
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        java.util.ArrayList<SmartArbListItem> arbList2 = strategyDetailsResponse.getArbList();
        if (arbList2 == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList2)) == null || (instFamily = smartArbListItem.getInstFamily()) == null) {
            instFamily = "";
        }
        if (smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) {
            instType = "";
        }
        BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, instType);
        java.lang.String smartArbProfit$default3 = C56051xvX.getSmartArbProfit$default(c56051xvX, strategyDetailsResponse.getTotalPnl(), bizInstrumentCopydefault, false, false, 12, null);
        java.lang.String str9 = (bizInstrumentCopydefault == null || (displayQuoteSymbol = bizInstrumentCopydefault.getDisplayQuoteSymbol()) == null) ? "" : displayQuoteSymbol;
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String strCopydefault = c56068xvo.copydefault(strategyDetailsResponse.getPnlRatio(), true);
        java.lang.String totalApy = strategyDetailsResponse.getTotalApy();
        if (totalApy == null) {
            totalApy = "";
        }
        TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActiveNotifications), C33129mqd.OLrzqt((java.lang.CharSequence) totalApy) ? c56068xvo.copydefault(totalApy, true) : "--", null, C56033xvF.OLrzqt((java.lang.Object) totalApy), 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.getActiveNotifications), C33070mpX.AYXKKw(C55688xof.Application.onExtraCallback)), null, null, null, null, null, null, null, 130548, null);
        int i2 = C32113mPz.Dialog.OcIXYQ;
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) strategyDetailsResponse.getTotalPnl());
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r45 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        TacticsInsideItemData tacticsInsideItemData5 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.writeTypedObject) + " (" + str9 + ")", smartArbProfit$default3 + " (" + strCopydefault + ")", C33070mpX.AYXKKw(C55688xof.Application.areNotificationsEnabled), iOLrzqt, 0, 0, 0, i2, null, r45, null, C33070mpX.AYXKKw(C55688xof.Application.getCurrent), null, null, null, null, null, 128368, null);
        java.lang.String str10 = C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt) + " (" + str9 + ")";
        java.lang.String totalAmt = strategyDetailsResponse.getTotalAmt();
        if (totalAmt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalAmt)) {
            str3 = ")";
            strFmtBotValueBySymbol$default = "--";
        } else {
            java.lang.String totalAmt2 = strategyDetailsResponse.getTotalAmt();
            str3 = ")";
            strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(str9, totalAmt2 == null ? "" : totalAmt2, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
        }
        TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(str10, strFmtBotValueBySymbol$default, null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
        ProfitDetailResponse arbitrageProfit = strategyDetailsResponse.getArbitrageProfit();
        java.lang.String total3 = arbitrageProfit != null ? arbitrageProfit.getTotal() : null;
        java.lang.String str11 = str9;
        java.lang.String smartArbProfit$default4 = C56051xvX.getSmartArbProfit$default(c56051xvX, total3 == null ? "" : total3, bizInstrumentCopydefault, false, false, 12, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.access100);
        ProfitDetailResponse arbitrageProfit2 = strategyDetailsResponse.getArbitrageProfit();
        java.lang.String total4 = arbitrageProfit2 != null ? arbitrageProfit2.getTotal() : null;
        java.lang.String str12 = (total4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) total4)) ? "--" : smartArbProfit$default4;
        ProfitDetailResponse arbitrageProfit3 = strategyDetailsResponse.getArbitrageProfit();
        TacticsInsideItemData tacticsInsideItemData7 = new TacticsInsideItemData(strAYXKKw, str12, C33070mpX.AYXKKw(C55688xof.Application.getRoot), C56033xvF.OLrzqt((java.lang.Object) (arbitrageProfit3 != null ? arbitrageProfit3.getTotal() : null)), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbProfitsDetails.EZpvd, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
            sourceCcy = strategyDetailsResponse.getSourceCcy();
            Intrinsics.copydefault((java.lang.Object) sourceCcy);
        } else {
            sourceCcy = str11;
        }
        if (strategyDetailsResponse.getShouldShowAutoEarn()) {
            BotVo bot = strategyDetailsResponse.getBot();
            if (((bot == null || (common = bot.getCommon()) == null) ? null : common.getAutoEarn()) != null) {
                pairOLrzqt = C55884xsP.copydefault(strategyDetailsResponse.getBot().getCommon().getAutoEarn().getTotalProfit(), strategyDetailsResponse.getBot().getCommon().getAutoEarn().getStatus(), str, str2, sourceCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : strategyDetailsResponse.isHistory());
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str13 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.getMediaUri);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(strAYXKKw2);
        sb.append("(");
        sb.append(sourceCcy);
        java.lang.String str14 = str3;
        sb.append(str14);
        TacticsInsideItemData tacticsInsideItemData8 = new TacticsInsideItemData(sb.toString(), (str13 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str13)) ? "--" : str13, null, iIntValue, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getInstId(), (java.lang.Object) "--") ? "" : "arbitrage_auto_earn", TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbAutoEarn.EZpvd, null, null, null, null, null, null, null, 130292, null);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStub);
        java.lang.String totalSpreadProfit = strategyDetailsResponse.getTotalSpreadProfit();
        if (totalSpreadProfit == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalSpreadProfit)) {
            tacticsInsideItemData = tacticsInsideItemData8;
            str4 = "--";
            str5 = str14;
            str6 = "";
            tacticsInsideItemData2 = tacticsInsideItemData7;
            smartArbProfit$default = str4;
        } else {
            tacticsInsideItemData = tacticsInsideItemData8;
            str4 = "--";
            str5 = str14;
            str6 = "";
            tacticsInsideItemData2 = tacticsInsideItemData7;
            smartArbProfit$default = C56051xvX.getSmartArbProfit$default(c56051xvX, strategyDetailsResponse.getTotalSpreadProfit(), bizInstrumentCopydefault, false, false, 12, null);
        }
        TacticsInsideItemData tacticsInsideItemData9 = new TacticsInsideItemData(strAYXKKw3, smartArbProfit$default, null, C56033xvF.OLrzqt((java.lang.Object) strategyDetailsResponse.getTotalSpreadProfit()), 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStub), C33070mpX.AYXKKw(C55688xof.Application.IPostMessageServiceStub)), null, null, null, null, null, null, null, 130548, null);
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanionCREATOR1);
        java.lang.String fee = strategyDetailsResponse.getFee();
        if (fee == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fee)) {
            tacticsInsideItemData3 = tacticsInsideItemData9;
            smartArbProfit$default2 = str4;
        } else {
            tacticsInsideItemData3 = tacticsInsideItemData9;
            smartArbProfit$default2 = C56051xvX.getSmartArbProfit$default(c56051xvX, strategyDetailsResponse.getFee(), bizInstrumentCopydefault, false, false, 12, null);
        }
        TacticsInsideItemData tacticsInsideItemData10 = new TacticsInsideItemData(strAYXKKw4, smartArbProfit$default2, null, 0, 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanionCREATOR1), C33070mpX.AYXKKw(C55688xof.Application.IPostMessageServiceDefault)), null, null, null, null, null, null, null, 130556, null);
        java.lang.String str15 = C33070mpX.AYXKKw(C55688xof.Application.notifyNotificationWithChannel) + " (" + str11 + str5;
        java.lang.String totalInterestAmt = strategyDetailsResponse.getTotalInterestAmt();
        TacticsInsideItemData tacticsInsideItemData11 = new TacticsInsideItemData(str15, (totalInterestAmt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalInterestAmt)) ? str4 : StringsKt__StringsKt.iwGUEr((java.lang.CharSequence) C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(strategyDetailsResponse.getTotalInterestAmt()), "", RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(4), null, null, null, 56, null)).toString(), null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getInstId(), (java.lang.Object) str4) ? str6 : "loan_interest_order", null, null, null, null, null, null, null, null, 130812, null);
        ProfitDetailResponse stakingProfit = strategyDetailsResponse.getStakingProfit();
        if (stakingProfit == null || (quote3 = stakingProfit.getQuote()) == null || (total2 = quote3.getTotal()) == null) {
            str7 = null;
        } else {
            str7 = (total2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) total2)) ? "0" : total2;
        }
        BotVo bot2 = strategyDetailsResponse.getBot();
        if (bot2 == null || (smartArbitrage2 = bot2.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage2.getAutoStakingProfit()) == null || (quote2 = autoStakingProfit.getQuote()) == null || (total = quote2.getTotal()) == null) {
            str8 = null;
        } else {
            str8 = (total.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) total)) ? "0" : total;
        }
        java.lang.String strAddS$default = C33129mqd.addS$default(str7, str8, null, null, null, 14, null);
        ProfitDetailResponse stakingProfit2 = strategyDetailsResponse.getStakingProfit();
        java.lang.String total5 = stakingProfit2 != null ? stakingProfit2.getTotal() : null;
        ProfitDetailResponse stakingProfit3 = strategyDetailsResponse.getStakingProfit();
        C56034xvG c56034xvG = new C56034xvG(total5, strAddS$default, stakingProfit3 != null ? stakingProfit3.getCcy() : null);
        int i3 = C55688xof.Application.ITrustedWebActivityService;
        ProfitDetailResponse stakingProfit4 = strategyDetailsResponse.getStakingProfit();
        if (stakingProfit4 == null || (quote = stakingProfit4.getQuote()) == null || (ccy = quote.getCcy()) == null) {
            ccy = "USDT";
        }
        TacticsInsideItemData tacticsInsideItemData12 = new TacticsInsideItemData(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy))), c56034xvG.copydefault(), null, C56033xvF.OLrzqt((java.lang.Object) strAddS$default), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbStakingProfitsDetails.copydefault, null, null, null, null, null, null, null, 130548, null);
        BotVo bot3 = strategyDetailsResponse.getBot();
        java.lang.String totalReturnedAmt = (bot3 == null || (smartArbitrage = bot3.getSmartArbitrage()) == null) ? null : smartArbitrage.getTotalReturnedAmt();
        if (totalReturnedAmt == null) {
            totalReturnedAmt = str6;
        }
        TacticsInsideItemData tacticsInsideItemData13 = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.setInternalConnectionCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str11))), C56033xvF.fmtBotValueBySymbol$default(str11, totalReturnedAmt, null, false, null, false, null, null, null, null, null, 2044, null), C33070mpX.AYXKKw(C55688xof.Application.onConnectionSuspended), 0, 0, 0, 0, 0, null, r45, null, C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatCustomActionCallback), null, null, null, null, null, 128504, null);
        arrayList.add(tacticsInsideItemData6);
        arrayList.add(tacticsInsideItemData5);
        arrayList.add(tacticsInsideItemData4);
        arrayList.add(tacticsInsideItemData2);
        if (!strategyDetailsResponse.isArbitrageWithStaking()) {
            BotVo bot4 = strategyDetailsResponse.getBot();
            if (bot4 != null) {
                i = 1;
                if (bot4.isAutoStaking()) {
                }
            } else {
                i = 1;
            }
            if (StrategyDetailsResponse.isDetailsEarn$default(strategyDetailsResponse, null, i, null)) {
                arrayList.add(tacticsInsideItemData);
            }
            arrayList.add(tacticsInsideItemData3);
            arrayList.add(tacticsInsideItemData10);
            arrayList.add(tacticsInsideItemData11);
            arrayList.add(tacticsInsideItemData13);
        }
        i = 1;
        arrayList.add(tacticsInsideItemData12);
        if (StrategyDetailsResponse.isDetailsEarn$default(strategyDetailsResponse, null, i, null)) {
        }
        arrayList.add(tacticsInsideItemData3);
        arrayList.add(tacticsInsideItemData10);
        arrayList.add(tacticsInsideItemData11);
        arrayList.add(tacticsInsideItemData13);
    }

    public final void copydefault(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.util.ArrayList<TacticsInsideItemData> arrayList) {
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ2;
        java.lang.String pnlRatio;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ3;
        java.lang.String gridProfitRate;
        java.lang.String arbitrageApy;
        java.lang.String totalApy;
        BotVo bot;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        java.util.Map<java.lang.String, MarginPerCcyVo> marginPerCcy;
        C55889xsU c55889xsU = C55889xsU.copydefault;
        boolean z = c55889xsU.copydefault(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getBot()) && c55889xsU.AEQbTJ(strategyDetailsResponse.getAlgoId()) == CoinMarginedCcyDisplay.USDT.getIndex();
        TacticsInsideItemData tacticsInsideItemData = null;
        MarginPerCcyVo marginPerCcyVo = (!z || (bot = strategyDetailsResponse.getBot()) == null || (contractGrid = bot.getContractGrid()) == null || (unitDisplayVO = contractGrid.getUnitDisplayVO()) == null || (marginPerCcy = unitDisplayVO.getMarginPerCcy()) == null) ? null : marginPerCcy.get("USDT");
        if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
            tacticsInsideItemData = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.isEmpty);
        java.lang.String str2 = C55962xto.OLrzqt(strategyDetailsResponse.getAvgDailyArbitrageNum()) + "/" + C55962xto.OLrzqt(strategyDetailsResponse.getArbitrageNum()) + " ";
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r8 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(strAYXKKw, str2, C33070mpX.AYXKKw(C55688xof.Application.putCallback), 0, 0, 0, 0, 0, null, r8, null, null, null, null, null, null, null, 130552, null);
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getInvestment()), marginPerCcyVo.getInvestment());
        } else {
            pairAEQbTJ = C55930xtI.ActionBar.AEQbTJ(C56033xvF.fmtBotValueBySymbol$default(C56033xvF.OLrzqt(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), ""), strategyDetailsResponse.getSz(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), strategyDetailsResponse.getSz());
        }
        java.lang.String investCcy = (!z || marginPerCcyVo == null) ? strategyDetailsResponse.getInvestCcy() : "USDT";
        C56066xvm c56066xvm = C56066xvm.EZpvd;
        TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(C55962xto.EZpvd(c56066xvm.OLrzqt(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), investCcy)), C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ), C33070mpX.AYXKKw(C55688xof.Application.zXhzOT), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r8, null, null, null, null, null, null, null, 130424, null);
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ2 = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getTotalPnl()), marginPerCcyVo.getTotalPnl());
        } else {
            pairAEQbTJ2 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getTotalPnl());
        }
        if (z && marginPerCcyVo != null) {
            pnlRatio = marginPerCcyVo.getPnlRatio();
        } else {
            pnlRatio = strategyDetailsResponse.getPnlRatio();
        }
        java.lang.String strCopydefault = C56068xvo.copydefault.copydefault(pnlRatio, true);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.getCurrent);
        TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(strAYXKKw2 + " (" + c56066xvm.KWHzl(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), (!z || marginPerCcyVo == null) ? strategyDetailsResponse.getCcy() : "USDT") + ")", C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ2) + " (" + strCopydefault + ")", C33070mpX.AYXKKw(C55688xof.Application.getCurrentPosition), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C55930xtI.ActionBar.KWHzl(pairAEQbTJ2), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r8, null, null, null, null, null, null, null, 130416, null);
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ3 = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getGridProfit()), marginPerCcyVo.getGridProfit());
        } else {
            pairAEQbTJ3 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getGridProfit(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getGridProfit());
        }
        java.lang.String strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) C55930xtI.ActionBar.OLrzqt(pairAEQbTJ3), (java.lang.Object) 0) ? C55962xto.OLrzqt("0") : C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ3);
        if (z && marginPerCcyVo != null) {
            gridProfitRate = marginPerCcyVo.getGridProfitRate();
        } else {
            gridProfitRate = strategyDetailsResponse.getGridProfitRate();
        }
        java.lang.String strKWHzl = C55962xto.KWHzl(gridProfitRate);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent);
        int i = C32113mPz.Dialog.fIwbmz;
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) C55930xtI.ActionBar.KWHzl(pairAEQbTJ3));
        BalanceDetailInfoDto balanceDetails = strategyDetailsResponse.getBalanceDetails();
        if (balanceDetails == null) {
            balanceDetails = BalanceDetailInfoDto.Companion.EZpvd();
        }
        TacticsInsideItemData tacticsInsideItemData5 = new TacticsInsideItemData(strAYXKKw3, strOLrzqt, C33070mpX.AYXKKw(C55688xof.Application.selectTab), iOLrzqt, 0, 0, i, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails(strategyDetailsResponse.getAlgoId(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), balanceDetails), null, null, null, null, strKWHzl, null, null, 114096, null);
        if (z && marginPerCcyVo != null) {
            arbitrageApy = marginPerCcyVo.getArbitrageApy();
        } else {
            arbitrageApy = strategyDetailsResponse.getArbitrageApy();
        }
        if (z && marginPerCcyVo != null) {
            totalApy = marginPerCcyVo.getTotalApy();
        } else {
            totalApy = strategyDetailsResponse.getTotalApy();
        }
        java.lang.String strKWHzl2 = C55962xto.KWHzl(arbitrageApy);
        java.lang.String strKWHzl3 = C55962xto.KWHzl(totalApy != null ? totalApy : "0");
        TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl2 + "\n" + strKWHzl3, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) arbitrageApy), C56033xvF.OLrzqt((java.lang.Object) totalApy), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl2 + "\n" + strKWHzl3), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r8, null, null, null, null, null, null, null, 130496, null);
        arrayList.add(tacticsInsideItemData3);
        arrayList.add(tacticsInsideItemData4);
        arrayList.add(tacticsInsideItemData5);
        arrayList.add(tacticsInsideItemData6);
        if (tacticsInsideItemData != null) {
            arrayList.add(tacticsInsideItemData);
        }
        arrayList.add(tacticsInsideItemData2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x07d2, code lost:
    
        if (r8.equals("starting") == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x080e, code lost:
    
        if (r8.equals("pending_signal") == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0811, code lost:
    
        r51.add(r3);
        r51.add(r9);
        r51.add(r10);
        r51.add(r11);
        r51.add(r12);
        r51.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0823, code lost:
    
        if (r13 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0825, code lost:
    
        r51.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0828, code lost:
    
        r51.add(r1);
        r51.add(r2);
        r51.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0831, code lost:
    
        if (r6 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0833, code lost:
    
        r51.add(r6);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x085f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(StrategyDetailsResponse strategyDetailsResponse, java.lang.String str, java.lang.String str2, java.util.ArrayList<TacticsInsideItemData> arrayList) {
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ;
        java.lang.String pnlRatio;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ2;
        java.lang.String gridProfitRate;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ3;
        java.lang.String floatProfitRate;
        java.lang.String arbitrageApy;
        java.lang.String totalApy;
        TacticsInsideItemData tacticsInsideItemData;
        TacticsInsideItemData tacticsInsideItemData2;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ4;
        java.lang.String extraMargin;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ5;
        java.lang.String extraMargin2;
        java.lang.String botPrice$default;
        TacticsInsideItemData tacticsInsideItemData3;
        TacticsInsideItemData tacticsInsideItemData4;
        TacticsInsideItemData tacticsInsideItemData5;
        TacticsInsideItemData tacticsInsideItemData6;
        TacticsInsideItemData tacticsInsideItemData7;
        BotVo bot;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        java.util.Map<java.lang.String, MarginPerCcyVo> marginPerCcy;
        C55889xsU c55889xsU = C55889xsU.copydefault;
        boolean z = c55889xsU.copydefault(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getBot()) && c55889xsU.AEQbTJ(strategyDetailsResponse.getAlgoId()) == CoinMarginedCcyDisplay.USDT.getIndex();
        MarginPerCcyVo marginPerCcyVo = (!z || (bot = strategyDetailsResponse.getBot()) == null || (contractGrid = bot.getContractGrid()) == null || (unitDisplayVO = contractGrid.getUnitDisplayVO()) == null || (marginPerCcy = unitDisplayVO.getMarginPerCcy()) == null) ? null : marginPerCcy.get("USDT");
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getTotalPnl()), marginPerCcyVo.getTotalPnl());
        } else {
            pairAEQbTJ = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getTotalPnl());
        }
        if (z && marginPerCcyVo != null) {
            pnlRatio = marginPerCcyVo.getPnlRatio();
        } else {
            pnlRatio = strategyDetailsResponse.getPnlRatio();
        }
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String strCopydefault = c56068xvo.copydefault(pnlRatio, true);
        C56066xvm c56066xvm = C56066xvm.EZpvd;
        java.lang.String str3 = C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + c56066xvm.KWHzl(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), (!z || marginPerCcyVo == null) ? strategyDetailsResponse.getCcy() : "USDT") + ")";
        java.lang.String str4 = C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ) + " (" + strCopydefault + ")";
        int i = C32113mPz.Dialog.OcIXYQ;
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C55930xtI.ActionBar.KWHzl(pairAEQbTJ), null, 8, null));
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r8 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        TacticsInsideItemData tacticsInsideItemData8 = new TacticsInsideItemData(str3, str4, C33070mpX.AYXKKw(C55688xof.Application.getCurrentPosition), iOLrzqt, 0, 0, 0, i, null, r8, null, null, null, null, null, null, null, 130416, null);
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ2 = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getGridProfit()), marginPerCcyVo.getGridProfit());
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
            pairAEQbTJ2 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getGridProfitInSourceCcy(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getGridProfitInSourceCcy());
        } else {
            pairAEQbTJ2 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getGridProfit(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getGridProfit());
        }
        java.lang.String strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) C55930xtI.ActionBar.KWHzl(pairAEQbTJ2), (java.lang.Object) 0) ? C55962xto.OLrzqt("0") : C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ2);
        if (z && marginPerCcyVo != null) {
            gridProfitRate = marginPerCcyVo.getGridProfitRate();
        } else {
            gridProfitRate = strategyDetailsResponse.getGridProfitRate();
        }
        java.lang.String strKWHzl = C55962xto.KWHzl(gridProfitRate);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent);
        int i2 = C32113mPz.Dialog.fIwbmz;
        int iOLrzqt2 = C56033xvF.OLrzqt((java.lang.Object) C55930xtI.ActionBar.KWHzl(pairAEQbTJ2));
        BalanceDetailInfoDto balanceDetails = strategyDetailsResponse.getBalanceDetails();
        if (balanceDetails == null) {
            balanceDetails = BalanceDetailInfoDto.Companion.EZpvd();
        }
        TacticsInsideItemData tacticsInsideItemData9 = new TacticsInsideItemData(strAYXKKw, strOLrzqt, C33070mpX.AYXKKw(C55688xof.Application.selectTab), iOLrzqt2, 0, 0, i2, 0, "WithdrawProfitIcon", new TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails(strategyDetailsResponse.getAlgoId(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), balanceDetails), null, null, null, null, strKWHzl, null, null, 113840, null);
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ3 = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getFloatProfit()), marginPerCcyVo.getFloatProfit());
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
            pairAEQbTJ3 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getFloatProfitInSourceCcy(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getFloatProfitInSourceCcy());
        } else {
            pairAEQbTJ3 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getFloatProfit(), null, false, true, null, false, null, null, null, 2008, null), strategyDetailsResponse.getFloatProfit());
        }
        if (z && marginPerCcyVo != null) {
            floatProfitRate = marginPerCcyVo.getFloatProfitRate();
        } else {
            floatProfitRate = strategyDetailsResponse.getFloatProfitRate();
        }
        TacticsInsideItemData tacticsInsideItemData10 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ3) + "\n" + c56068xvo.copydefault(floatProfitRate, true), C33070mpX.AYXKKw(C55688xof.Application.setCustomView), C56033xvF.OLrzqt((java.lang.Object) C55930xtI.ActionBar.KWHzl(pairAEQbTJ3)), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r8, null, C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), null, null, null, null, null, 128432, null);
        if (z && marginPerCcyVo != null) {
            arbitrageApy = marginPerCcyVo.getArbitrageApy();
        } else {
            arbitrageApy = strategyDetailsResponse.getArbitrageApy();
        }
        if (z && marginPerCcyVo != null) {
            totalApy = marginPerCcyVo.getTotalApy();
        } else {
            totalApy = strategyDetailsResponse.getTotalApy();
        }
        java.lang.String strKWHzl2 = C55962xto.KWHzl(arbitrageApy);
        java.lang.String strKWHzl3 = C55962xto.KWHzl(totalApy != null ? totalApy : "0");
        TacticsInsideItemData tacticsInsideItemData11 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl2 + "\n" + strKWHzl3, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) arbitrageApy), C56033xvF.OLrzqt((java.lang.Object) totalApy), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl2 + "\n" + strKWHzl3), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r8, null, null, null, null, null, null, null, 130496, null);
        TacticsInsideItemData tacticsInsideItemData12 = Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2") ? null : new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMaxPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsInsideItemData tacticsInsideItemData13 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isEmpty), C55962xto.OLrzqt(strategyDetailsResponse.getAvgDailyArbitrageNum()) + "/" + C55962xto.OLrzqt(strategyDetailsResponse.getArbitrageNum()) + " ", C33070mpX.AYXKKw(C55688xof.Application.putCallback), 0, 0, 0, 0, 0, null, r8, null, null, null, null, null, null, null, 130552, null);
        if (z && marginPerCcyVo != null) {
            tacticsInsideItemData2 = tacticsInsideItemData13;
            tacticsInsideItemData = tacticsInsideItemData12;
            pairAEQbTJ4 = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getInvestment()), marginPerCcyVo.getInvestment());
        } else {
            tacticsInsideItemData = tacticsInsideItemData12;
            tacticsInsideItemData2 = tacticsInsideItemData13;
            pairAEQbTJ4 = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getSz(), C56033xvF.OLrzqt(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), ""), false, false, null, false, null, null, null, 1984, null), strategyDetailsResponse.getSz());
        }
        TacticsInsideItemData tacticsInsideItemData14 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DAIeex) + " (" + c56066xvm.OLrzqt(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), (!z || marginPerCcyVo == null) ? strategyDetailsResponse.getInvestCcy() : "USDT") + ")", C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ4), C33070mpX.AYXKKw(C55688xof.Application.zXhzOT), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r8, null, null, null, null, null, null, null, 130424, null);
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ5 = C55930xtI.ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), marginPerCcyVo.getExtraMargin()), marginPerCcyVo.getExtraMargin());
        } else {
            java.lang.String instId = strategyDetailsResponse.getInstId();
            java.lang.String instType = strategyDetailsResponse.getInstType();
            BalanceDetailInfoDto balanceDetails2 = strategyDetailsResponse.getBalanceDetails();
            java.lang.String botPnl$default = C56033xvF.getBotPnl$default(instId, instType, (balanceDetails2 == null || (extraMargin2 = balanceDetails2.getExtraMargin()) == null) ? "" : extraMargin2, null, false, false, null, false, null, null, null, 2040, null);
            BalanceDetailInfoDto balanceDetails3 = strategyDetailsResponse.getBalanceDetails();
            if (balanceDetails3 == null || (extraMargin = balanceDetails3.getExtraMargin()) == null) {
                extraMargin = "";
            }
            pairAEQbTJ5 = C55930xtI.ActionBar.AEQbTJ(botPnl$default, extraMargin);
        }
        TacticsInsideItemData tacticsInsideItemData15 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21PlaybackInfo) + " (" + c56066xvm.KWHzl(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), (!z || marginPerCcyVo == null) ? strategyDetailsResponse.getCcy() : "USDT") + ")", C55930xtI.ActionBar.AEQbTJ(pairAEQbTJ5), C33070mpX.AYXKKw(C55688xof.Application.createOnBackInvokedCallbacklambda0), 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getInstId(), (java.lang.Object) "--") ? "" : "extra_margin", r8, null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21PlaybackInfo), null, null, null, null, null, 128248, null);
        TacticsInsideItemData tacticsInsideItemData16 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy), C56068xvo.getForcedClosePrice$default(c56068xvo, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getLiqPx(), strategyDetailsResponse.getDirection(), false, false, 48, null), C33070mpX.AYXKKw(C55688xof.Application.ParcelableVolumeInfo1), 0, 0, 0, 0, 0, null, r8, null, null, null, null, null, null, null, 130552, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getLastPrice())) {
            java.lang.String instType2 = strategyDetailsResponse.getInstType();
            java.lang.String instId2 = strategyDetailsResponse.getInstId();
            java.lang.String lastPrice = strategyDetailsResponse.getLastPrice();
            botPrice$default = C56033xvF.getBotPrice$default(instType2, instId2, lastPrice == null ? "" : lastPrice, false, false, null, null, 120, null);
        } else {
            botPrice$default = "--";
        }
        TacticsInsideItemData tacticsInsideItemData17 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.parameter) + " (" + str + ")", botPrice$default, null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) botPrice$default, (java.lang.Object) "--") ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
        TacticsInsideItemData tacticsInsideItemData18 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), C55962xto.AEQbTJ(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), C55962xto.OLrzqt(strategyDetailsResponse.getSignParams())), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsInsideItemData tacticsInsideItemData19 = Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2") ? null : new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56068xvo.getProcessedPrice$default(c56068xvo, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), RoundingMode.UP, false, false, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        java.lang.String state = strategyDetailsResponse.getState();
        switch (state.hashCode()) {
            case -2127938992:
                tacticsInsideItemData3 = tacticsInsideItemData10;
                tacticsInsideItemData4 = tacticsInsideItemData9;
                tacticsInsideItemData5 = tacticsInsideItemData2;
                tacticsInsideItemData6 = tacticsInsideItemData;
                tacticsInsideItemData7 = tacticsInsideItemData11;
                break;
            case -1821824562:
                tacticsInsideItemData3 = tacticsInsideItemData10;
                tacticsInsideItemData4 = tacticsInsideItemData9;
                tacticsInsideItemData5 = tacticsInsideItemData2;
                tacticsInsideItemData6 = tacticsInsideItemData;
                tacticsInsideItemData7 = tacticsInsideItemData11;
                if (state.equals("no_close_position")) {
                    arrayList.add(tacticsInsideItemData14);
                    arrayList.add(tacticsInsideItemData8);
                    arrayList.add(tacticsInsideItemData17);
                    if (tacticsInsideItemData6 != null) {
                        arrayList.add(tacticsInsideItemData6);
                    }
                    arrayList.add(tacticsInsideItemData5);
                    arrayList.add(tacticsInsideItemData16);
                }
                arrayList.add(tacticsInsideItemData14);
                arrayList.add(tacticsInsideItemData8);
                if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                    arrayList.add(tacticsInsideItemData5);
                    arrayList.add(tacticsInsideItemData4);
                    arrayList.add(tacticsInsideItemData3);
                    arrayList.add(tacticsInsideItemData7);
                    arrayList.add(tacticsInsideItemData17);
                    arrayList.add(tacticsInsideItemData15);
                    arrayList.add(tacticsInsideItemData16);
                } else {
                    arrayList.add(tacticsInsideItemData5);
                    arrayList.add(tacticsInsideItemData4);
                    arrayList.add(tacticsInsideItemData3);
                    arrayList.add(tacticsInsideItemData7);
                    if (tacticsInsideItemData6 != null) {
                        arrayList.add(tacticsInsideItemData6);
                    }
                    arrayList.add(tacticsInsideItemData17);
                    arrayList.add(tacticsInsideItemData15);
                    arrayList.add(tacticsInsideItemData16);
                }
                break;
            case 1316806720:
                tacticsInsideItemData3 = tacticsInsideItemData10;
                tacticsInsideItemData4 = tacticsInsideItemData9;
                tacticsInsideItemData5 = tacticsInsideItemData2;
                tacticsInsideItemData6 = tacticsInsideItemData;
                tacticsInsideItemData7 = tacticsInsideItemData11;
                break;
            case 1550783935:
                if (state.equals("running")) {
                    arrayList.add(tacticsInsideItemData14);
                    arrayList.add(tacticsInsideItemData8);
                    arrayList.add(tacticsInsideItemData9);
                    arrayList.add(tacticsInsideItemData10);
                    arrayList.add(tacticsInsideItemData11);
                    arrayList.add(tacticsInsideItemData17);
                    if (tacticsInsideItemData != null) {
                        arrayList.add(tacticsInsideItemData);
                    }
                    arrayList.add(tacticsInsideItemData2);
                    arrayList.add(tacticsInsideItemData15);
                    arrayList.add(tacticsInsideItemData16);
                    if (tacticsInsideItemData19 != null) {
                        arrayList.add(tacticsInsideItemData19);
                        Unit unit = Unit.INSTANCE;
                    }
                    break;
                }
            default:
                tacticsInsideItemData3 = tacticsInsideItemData10;
                tacticsInsideItemData4 = tacticsInsideItemData9;
                tacticsInsideItemData5 = tacticsInsideItemData2;
                tacticsInsideItemData6 = tacticsInsideItemData;
                tacticsInsideItemData7 = tacticsInsideItemData11;
                arrayList.add(tacticsInsideItemData14);
                arrayList.add(tacticsInsideItemData8);
                if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2")) {
                }
                break;
        }
    }

    private final java.lang.String EZpvd(java.lang.String str) {
        return pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(str)), null, 1, null);
    }
}
