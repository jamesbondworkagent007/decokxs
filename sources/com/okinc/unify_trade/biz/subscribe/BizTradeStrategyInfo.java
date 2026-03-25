package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcelable;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC55726xpQ;
import o.InterfaceC55847xrf;

/* JADX INFO: loaded from: classes12.dex */
public interface BizTradeStrategyInfo extends Parcelable, InterfaceC55726xpQ, InterfaceC55847xrf {
    String alternativeCurrency();

    String createTime();

    String curBaseSz();

    String curQuoteSz();

    String currency();

    String earlyFillSettleTime();

    String earlyFilledTime();

    boolean endStatusFlag();

    String estimateProfit();

    String expiryTime();

    ExtendedBusinessInfo extendedBusinessInfo();

    String fmtEarlyAmount();

    String fmtEarlyPrice();

    String fmtEarlyTotal();

    String getArbOrderPnl();

    String getArbStakingError();

    boolean getArbiDisplayMinPaybackDays();

    List<FundingFeeApyItem> getArbiFundingFeeApyList();

    String getArbiHighestApyPeriod();

    ArbitrageTotalPnlInfo getArbiTotalPnlInfo();

    List<ArbitrageOrderBean> getArbitrageList();

    String getAutoMarginMaxAmount();

    boolean getAutoMarginSwitch();

    String getAvgPrice();

    BalanceDetailInfoDto getBalanceDetailInfoDto();

    String getBaseDigit();

    BotVo getBotVo();

    String getCancelTime();

    @Override // o.InterfaceC55847xrf
    String getCompleteCycles();

    String getCurrentTradeQuoteCcy();

    String getDcaInitOrdAmt();

    String getDcaSafetyOrdAmt();

    List<DcaTriggerParam> getDcaTriggerParams();

    String getDcdBotState();

    String getErrorMsg();

    String getFilledPercent();

    ArrayList<String> getForbiddenFunctions();

    List<SignParamItem> getGridSignParams();

    String getGridSlPnlRatio();

    String getGridState();

    String getGridTpPnlRatio();

    ArrayList<String> getHiddenFeaturesData();

    StrategyProfitResponse getLatestProfitData();

    Float getLeverPrincipal();

    String getMTrailingDownFund();

    String getMaxSafetyOrders();

    List<StrategyProfitResponse> getOngoingProfitSnapshots();

    String getOrdCopyType();

    String getOrderActivePx();

    String getOrderActualMarginSz();

    String getOrderAvailableMargin();

    String getOrderCTime();

    String getOrderCallbackRatio();

    String getOrderCallbackSpread();

    String getOrderCancelType();

    String getOrderCloseFraction();

    String getOrderCtVal();

    String getOrderDirection();

    String getOrderDisplayId();

    StrategyDcaEditResp getOrderEffectiveEditParametersDetails();

    String getOrderExtraMarginSz();

    String getOrderFloatingPnl();

    String getOrderGridNum();

    String getOrderInstFamily();

    @Override // o.InterfaceC55847xrf
    ArrayList<String> getOrderInstIds();

    String getOrderInvestment();

    String getOrderLast();

    String getOrderLiqPx();

    @Override // o.InterfaceC55847xrf
    String getOrderMaxPx();

    @Override // o.InterfaceC55847xrf
    String getOrderMinPx();

    String getOrderMktCap();

    String getOrderNotionalUsd();

    String getOrderOrdPx();

    String getOrderPTime();

    @Override // o.InterfaceC55847xrf
    String getOrderPnlRatio();

    String getOrderPxLimit();

    String getOrderPxSpread();

    String getOrderPxVar();

    String getOrderRuleType();

    String getOrderRunType();

    String getOrderSignalChanId();

    String getOrderSignalChanName();

    String getOrderSignalCount();

    String getOrderState();

    String getOrderStopResult();

    String getOrderSymbolsNumber();

    String getOrderSzLimit();

    List<Integer> getOrderTags();

    String getOrderTimeInterval();

    String getOrderTotalAmt();

    @Override // o.InterfaceC55847xrf
    String getOrderTotalPnl();

    String getOrderTotalPnlRatio();

    TpSlTriggerParamReqResp getOrderTpSlTriggerParam();

    String getOrderTradeNum();

    String getOrderTriggerLast();

    String getOrderTriggerPx();

    String getOrderTriggerPxType();

    String getOrderUly();

    @Override // o.InterfaceC55847xrf
    String getPortfolioBalInterval();

    @Override // o.InterfaceC55847xrf
    String getPortfolioBalRatio();

    @Override // o.InterfaceC55847xrf
    String getPortfolioBalType();

    String getProfitValue();

    String getQuoteDigit();

    @Override // o.InterfaceC55847xrf
    ArrayList<RecurringListItem> getRecList();

    @Override // o.InterfaceC55847xrf
    RecurringBuyDetails getRecurringBuyDetails();

    boolean getReinvestmentInfo();

    String getSharingRatio();

    EntrySignalOrderAmtParam getSignalAmtParam();

    ExitSignalOrderAmtParam getSignalBotStopParam();

    String getSlPrice();

    ArrayList<SmartArbListItem> getSmartArbList();

    SmartArbProfitsInfo getSmartArbProfitsInfo();

    SmartEarnParam getSmartEarn();

    @Override // o.InterfaceC55847xrf
    ArrayList<SmartPortfolioListItem> getSmartPortfolioList();

    String getSourceId();

    @Override // o.InterfaceC55847xrf
    String getStgyInvestCcy();

    String getStopBotType();

    String getStopLessMode();

    String getStrategyName();

    TacticsVoucherInfo getTacticsVoucherInfo();

    String getTpPrice();

    String getTpRange();

    TrailingConfig getTrailingDown();

    TrailingConfig getTrailingUp();

    String getUTimeValue();

    List<String> getVipProfitState();

    boolean isArbitrageWithStaking();

    Boolean isAssociate();

    boolean isBasePos();

    Boolean isBorrowMode();

    boolean isCopy();

    @Override // o.InterfaceC55847xrf
    boolean isHistoryOrder();

    String isNeedPostWarning();

    boolean isOutOfRange();

    boolean isShowTWapTips();

    boolean isStop();

    String lastSettlementSettledTime();

    String lastTradeExpireTime();

    String notionalAmount();

    String participationRatio();

    String perGridProfitRatio();

    String perMaxProfitRate();

    String perMinProfitRate();

    String pxSteps();

    String pxStepsMult();

    Boolean reserveFunds();

    void setOngoingProfitSnapshots(List<StrategyProfitResponse> list);

    String settlementAmount();

    String slPct();

    @Override // o.InterfaceC55847xrf
    String sourceCcy();

    String sourceCcySz();

    String status();

    String strike();

    String strikePrecision();

    boolean supportEarlyFill();

    String timeLeft();

    String tpPct();

    String tradeId();

    String tradeSide();

    String turnoverRatio();

    String volMult();
}
