package com.okinc.unify_trade.net;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.GuideProductInfo;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.bean.OuterAccountActive;
import com.okinc.tradeapi.bean.OuterAccountLevelData;
import com.okinc.tradeapi.bean.OuterEmptyResp;
import com.okinc.tradeapi.bean.OuterTickersData;
import com.okinc.tradeapi.bean.TradeBehaviorBean;
import com.okinc.tradeapi.bean.UserTradeInfo;
import com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo;
import com.okinc.unify_trade.api.subscribe.orders.CancelAllReq;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AccountAssets;
import com.okinc.unify_trade.biz.AccountBills;
import com.okinc.unify_trade.biz.AccountEquityActive;
import com.okinc.unify_trade.biz.AccountLevelData;
import com.okinc.unify_trade.biz.AccountModePreCheckData;
import com.okinc.unify_trade.biz.AccountSwitchCheckInfo;
import com.okinc.unify_trade.biz.AccountTierData;
import com.okinc.unify_trade.biz.AccountTradeConfig;
import com.okinc.unify_trade.biz.ActiveProductsResponse;
import com.okinc.unify_trade.biz.AddSpotGridAddInvestmentReq;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.AlgoShareConfigInfo;
import com.okinc.unify_trade.biz.AmendCostRequest;
import com.okinc.unify_trade.biz.ApplyLossInsuranceBean;
import com.okinc.unify_trade.biz.ApplyLossInsuranceReq;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbitrageFavoriteBean;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageOrderData;
import com.okinc.unify_trade.biz.ArbitrageOrderResponse;
import com.okinc.unify_trade.biz.ArbitragePriceSetting;
import com.okinc.unify_trade.biz.ArbitragePriceSettingModel;
import com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean;
import com.okinc.unify_trade.biz.AssetBalanceData;
import com.okinc.unify_trade.biz.AssetCurrenciesItemData;
import com.okinc.unify_trade.biz.AssetDepositHistoryData;
import com.okinc.unify_trade.biz.AssetPurchaseRedemptData;
import com.okinc.unify_trade.biz.AssetWithdrawalData;
import com.okinc.unify_trade.biz.AssetWithdrawalHistoryData;
import com.okinc.unify_trade.biz.AssetsCoinTransferTarget;
import com.okinc.unify_trade.biz.AssetsRubikIncome;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.BaseLeverageMarginInfo;
import com.okinc.unify_trade.biz.BillTypeData;
import com.okinc.unify_trade.biz.BizCancelBatchOrderReq;
import com.okinc.unify_trade.biz.BizCancelDexOrderReq;
import com.okinc.unify_trade.biz.BizCancelOrderReq;
import com.okinc.unify_trade.biz.BizCancelStrategyOrderReq;
import com.okinc.unify_trade.biz.BizCreateTPSLReq;
import com.okinc.unify_trade.biz.BizModifyAlgoOrderReq;
import com.okinc.unify_trade.biz.BizModifyDexOrderReq;
import com.okinc.unify_trade.biz.BizModifyOrderReq;
import com.okinc.unify_trade.biz.BizStrategyTradeOrderReq;
import com.okinc.unify_trade.biz.BizTradeClosePosition;
import com.okinc.unify_trade.biz.BizTradeOrderReq;
import com.okinc.unify_trade.biz.BorrowRepayReq;
import com.okinc.unify_trade.biz.BorrowRepayResp;
import com.okinc.unify_trade.biz.BotAddInvestLimitResponse;
import com.okinc.unify_trade.biz.BotAddInvestmentData;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotLeadOverviewModel;
import com.okinc.unify_trade.biz.BotLeadProfitOverviewModel;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.biz.BotLeadProfitSummaryModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderPendingSummaryModel;
import com.okinc.unify_trade.biz.BotMaxAvailableResult;
import com.okinc.unify_trade.biz.BotModifyReq;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.biz.BotRecommendationResult;
import com.okinc.unify_trade.biz.BotSectorUnderlyingListBean;
import com.okinc.unify_trade.biz.BotShareResult;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.BotUserCount;
import com.okinc.unify_trade.biz.BotVisibilityInfo;
import com.okinc.unify_trade.biz.BotVisibilityResult;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.BusinessConfigReq;
import com.okinc.unify_trade.biz.CallAuctionInfoData;
import com.okinc.unify_trade.biz.CancelSpotDcaOrderBody;
import com.okinc.unify_trade.biz.CategoryRespData;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.ChaseOrderInfoBean;
import com.okinc.unify_trade.biz.CloseBatchPositionRequest;
import com.okinc.unify_trade.biz.CloseBatchPositionResponse;
import com.okinc.unify_trade.biz.CmrPreCheckResp;
import com.okinc.unify_trade.biz.CoinFreeInfo;
import com.okinc.unify_trade.biz.CollateralCoinConfig;
import com.okinc.unify_trade.biz.CollateralTokenListResp;
import com.okinc.unify_trade.biz.ConceptRankData;
import com.okinc.unify_trade.biz.ConfigReq;
import com.okinc.unify_trade.biz.ConfirmInfoForSpotGridAddInvestment;
import com.okinc.unify_trade.biz.ContractCoupon;
import com.okinc.unify_trade.biz.ContractDcaAvaData;
import com.okinc.unify_trade.biz.ContractDcaLiqPxResult;
import com.okinc.unify_trade.biz.ContractExpLeverageConfig;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginReq;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginResp;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.ContractGridSyncParamReq;
import com.okinc.unify_trade.biz.ContractGridSyncParamResp;
import com.okinc.unify_trade.biz.ContractLeverTierLimitResult;
import com.okinc.unify_trade.biz.ContractOrderResponse;
import com.okinc.unify_trade.biz.ContractTopEarnRate;
import com.okinc.unify_trade.biz.ConvertCanWithdrawBeanNew;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CounterPartiesResp;
import com.okinc.unify_trade.biz.CurrencyConfigResp;
import com.okinc.unify_trade.biz.DcaAiData;
import com.okinc.unify_trade.biz.DcaMinMarginResponse;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTradeListResponse;
import com.okinc.unify_trade.biz.DcdArbDetail;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.DcdRecommendedParams;
import com.okinc.unify_trade.biz.DebtBean;
import com.okinc.unify_trade.biz.DebtCanWithdrawBean;
import com.okinc.unify_trade.biz.DebtQuoteBean;
import com.okinc.unify_trade.biz.DebtQuoteReplayBean;
import com.okinc.unify_trade.biz.DeltaNeutralConfig;
import com.okinc.unify_trade.biz.DepthCountInfo;
import com.okinc.unify_trade.biz.DeriConfigData;
import com.okinc.unify_trade.biz.DiscountData;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.DownLoadListRequest;
import com.okinc.unify_trade.biz.DownLoadListResponse;
import com.okinc.unify_trade.biz.DownLoadRequest;
import com.okinc.unify_trade.biz.DualLeverageReq;
import com.okinc.unify_trade.biz.DualLeverageResp;
import com.okinc.unify_trade.biz.EarlyFillQuoteResp;
import com.okinc.unify_trade.biz.EarlyFillReq;
import com.okinc.unify_trade.biz.EarlyFillResp;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.EditGridProfitAutoReinvestRequest;
import com.okinc.unify_trade.biz.EditGridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.EditStrategyNameReq;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.EquityPerpDisClosureReq;
import com.okinc.unify_trade.biz.EstAvgCostResponse;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.biz.FinancialData;
import com.okinc.unify_trade.biz.FinancialProductConfigInfo;
import com.okinc.unify_trade.biz.FundingRateConfigReq;
import com.okinc.unify_trade.biz.FundingRateQueryResp;
import com.okinc.unify_trade.biz.FundingRateSwitchReq;
import com.okinc.unify_trade.biz.FundingRateThresholdReq;
import com.okinc.unify_trade.biz.FundingRateWithDayBean;
import com.okinc.unify_trade.biz.GridInstantTriggerReq;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridOrderTpSlReq;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckRequest;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse;
import com.okinc.unify_trade.biz.GridProfitDetailsResponse;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.GridProfitReq;
import com.okinc.unify_trade.biz.GridProfitResponse;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.biz.GridStopInfoDto;
import com.okinc.unify_trade.biz.GridTriggerResp;
import com.okinc.unify_trade.biz.HedgingEstimatesResp;
import com.okinc.unify_trade.biz.HiddenCurrencyBean;
import com.okinc.unify_trade.biz.HistoryPositionDelay;
import com.okinc.unify_trade.biz.HomeSignalCardResult;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.biz.HotCoinData;
import com.okinc.unify_trade.biz.InstConfigInfo;
import com.okinc.unify_trade.biz.InstMarginModeConfigs;
import com.okinc.unify_trade.biz.InstTierItem;
import com.okinc.unify_trade.biz.InstTypeData;
import com.okinc.unify_trade.biz.InstTypeGroup;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.InterestAccruedData;
import com.okinc.unify_trade.biz.InterestDeductedData;
import com.okinc.unify_trade.biz.InterestLimitData;
import com.okinc.unify_trade.biz.IsoSetReq;
import com.okinc.unify_trade.biz.KlineFundingRateData;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.biz.LeverageReq;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.LiquidationGearInfo;
import com.okinc.unify_trade.biz.LiquidationGearReq;
import com.okinc.unify_trade.biz.LoanHistoricalRate;
import com.okinc.unify_trade.biz.LoanModeReq;
import com.okinc.unify_trade.biz.MPBotBannerResult;
import com.okinc.unify_trade.biz.MaintenancesInfo;
import com.okinc.unify_trade.biz.MarginBalanceData;
import com.okinc.unify_trade.biz.MarginInfoUserLevel;
import com.okinc.unify_trade.biz.MarginLoanInterest;
import com.okinc.unify_trade.biz.MarginModeConfigData;
import com.okinc.unify_trade.biz.MarginModeInitConfigData;
import com.okinc.unify_trade.biz.MarginQuoteRateInfo;
import com.okinc.unify_trade.biz.MarketLendingHistory;
import com.okinc.unify_trade.biz.MarketLendingInfo;
import com.okinc.unify_trade.biz.MarketOverviewResponse;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MaxWithdrawalData;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.MinStrikePxResp;
import com.okinc.unify_trade.biz.MinTopUpResp;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MultiMinAmountItem;
import com.okinc.unify_trade.biz.NaviBody;
import com.okinc.unify_trade.biz.NewBieUserState;
import com.okinc.unify_trade.biz.NoticeData;
import com.okinc.unify_trade.biz.OKTDexTpslUpdateResponse;
import com.okinc.unify_trade.biz.OldCoinList;
import com.okinc.unify_trade.biz.OpenSimpleModeAutoRepay;
import com.okinc.unify_trade.biz.OpenSimpleModeLoan;
import com.okinc.unify_trade.biz.OptionCoolState;
import com.okinc.unify_trade.biz.OptionExerciseHisData;
import com.okinc.unify_trade.biz.OptionMultiplePrice;
import com.okinc.unify_trade.biz.OptionPnlReq;
import com.okinc.unify_trade.biz.OptionPnlResp;
import com.okinc.unify_trade.biz.OptionSquareAssetInfoResponse;
import com.okinc.unify_trade.biz.OptionsAvailBalance;
import com.okinc.unify_trade.biz.OptionsDiscoveryEstCostBean;
import com.okinc.unify_trade.biz.OptionsDiscoveryPlaceOrderBean;
import com.okinc.unify_trade.biz.OptionsDiscoveryPlaceOrderBody;
import com.okinc.unify_trade.biz.OptionsSquarePositionsCountResp;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.biz.OrderForceData;
import com.okinc.unify_trade.biz.OrderForceDetails;
import com.okinc.unify_trade.biz.OrderLeadMarketCloseReq;
import com.okinc.unify_trade.biz.OrderLeadPosSize;
import com.okinc.unify_trade.biz.OrderLeadSpBean;
import com.okinc.unify_trade.biz.OrderLeadSpReq;
import com.okinc.unify_trade.biz.OrderPositions;
import com.okinc.unify_trade.biz.OrderPreCheckResp;
import com.okinc.unify_trade.biz.OrderQuoteBean;
import com.okinc.unify_trade.biz.OrderStrategyPreCheckResp;
import com.okinc.unify_trade.biz.OrdersPendingQueryVO;
import com.okinc.unify_trade.biz.PinBotReq;
import com.okinc.unify_trade.biz.PinBotResp;
import com.okinc.unify_trade.biz.PmTierRes;
import com.okinc.unify_trade.biz.PortfolioData;
import com.okinc.unify_trade.biz.PositionModeReq;
import com.okinc.unify_trade.biz.PreQuoteInfoData;
import com.okinc.unify_trade.biz.PreferredStableCoinReq;
import com.okinc.unify_trade.biz.PreferredUSDSettleCcyCoinReq;
import com.okinc.unify_trade.biz.PriceLockOrders;
import com.okinc.unify_trade.biz.PriceLockerStateVolume;
import com.okinc.unify_trade.biz.PriceLockerTradeReq;
import com.okinc.unify_trade.biz.PriceLockerTradeResp;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.biz.QueryMarginInfo;
import com.okinc.unify_trade.biz.QuickChangeCurrencyData;
import com.okinc.unify_trade.biz.RFQCancelReq;
import com.okinc.unify_trade.biz.RFQCreateReq;
import com.okinc.unify_trade.biz.RFQCreateResp;
import com.okinc.unify_trade.biz.RFQExecuteReq;
import com.okinc.unify_trade.biz.RFQExecuteResp;
import com.okinc.unify_trade.biz.RFQSData;
import com.okinc.unify_trade.biz.RecommendBulletMPData;
import com.okinc.unify_trade.biz.RecurringEditCycleTimeReq;
import com.okinc.unify_trade.biz.RecurringEditPriceRangeReq;
import com.okinc.unify_trade.biz.RecurringModifyInvestmentReq;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.RequestForQuoteReq;
import com.okinc.unify_trade.biz.RequestForQuoteResp;
import com.okinc.unify_trade.biz.ReversePosRequestBean;
import com.okinc.unify_trade.biz.ReversePosResponse;
import com.okinc.unify_trade.biz.ReversePreCheckResponse;
import com.okinc.unify_trade.biz.RickTotalData;
import com.okinc.unify_trade.biz.RiskBillsData;
import com.okinc.unify_trade.biz.RiskOffsetAmtReq;
import com.okinc.unify_trade.biz.RiskOffsetAmtResp;
import com.okinc.unify_trade.biz.RiskStatus;
import com.okinc.unify_trade.biz.RiskTrendData;
import com.okinc.unify_trade.biz.RiskUnitMRDetails;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.SegmentOrderRequest;
import com.okinc.unify_trade.biz.SegmentOrderResponse;
import com.okinc.unify_trade.biz.SelfTradePreventionSettingReq;
import com.okinc.unify_trade.biz.SelfTradePreventionSettingResp;
import com.okinc.unify_trade.biz.SetCollateralPreCheckResp;
import com.okinc.unify_trade.biz.SetFeeTypeReq;
import com.okinc.unify_trade.biz.SetFeeTypeResp;
import com.okinc.unify_trade.biz.SettleDateReq;
import com.okinc.unify_trade.biz.SettleDateResp;
import com.okinc.unify_trade.biz.SettlementHisData;
import com.okinc.unify_trade.biz.SignalBotCreateSignReq;
import com.okinc.unify_trade.biz.SignalBotManualOrderReq;
import com.okinc.unify_trade.biz.SignalBotSettlementDetailBean;
import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.biz.SignalBotSignalListBean;
import com.okinc.unify_trade.biz.SignalBotSubsInfoListBean;
import com.okinc.unify_trade.biz.SignalBotSummaryBean;
import com.okinc.unify_trade.biz.SignalBotUpdateReq;
import com.okinc.unify_trade.biz.SignalCloneInfo;
import com.okinc.unify_trade.biz.SignalCloneUrl;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalEventDetail;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalListResult;
import com.okinc.unify_trade.biz.SignalProfits;
import com.okinc.unify_trade.biz.SignalPublishInfo;
import com.okinc.unify_trade.biz.SignalSubsReq;
import com.okinc.unify_trade.biz.SignalTriggerDetails;
import com.okinc.unify_trade.biz.SimpleModePreCheckResp;
import com.okinc.unify_trade.biz.SimpleModeQuickRepayReq;
import com.okinc.unify_trade.biz.SimpleModeQuickRepayResp;
import com.okinc.unify_trade.biz.SimpleModeRepayDetailResp;
import com.okinc.unify_trade.biz.SimpleNotes;
import com.okinc.unify_trade.biz.SimpleOptionClosePositionReq;
import com.okinc.unify_trade.biz.SimpleOptionClosePositionResponse;
import com.okinc.unify_trade.biz.SimpleOptionOrderReq;
import com.okinc.unify_trade.biz.SimpleOptionOrderResponse;
import com.okinc.unify_trade.biz.SimpleOptionPreviewCloseResponse;
import com.okinc.unify_trade.biz.SimpleOptionPreviewOrderResponse;
import com.okinc.unify_trade.biz.SimpleOptionProduct;
import com.okinc.unify_trade.biz.SimpleOptionsPositionVo;
import com.okinc.unify_trade.biz.SimpleProducts;
import com.okinc.unify_trade.biz.SimpleTargetPrice;
import com.okinc.unify_trade.biz.SimulateAssetsRequest;
import com.okinc.unify_trade.biz.SlippageControlEditParamRep;
import com.okinc.unify_trade.biz.SmartArbHisOrderItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbitrageModificationReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.SpotBorrowRepayHistoryResp;
import com.okinc.unify_trade.biz.SpotCopyInstSwitchConfig;
import com.okinc.unify_trade.biz.SpotCopySwitchRequest;
import com.okinc.unify_trade.biz.SpotGridAddInvestmentInfo;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.SpotInUseAmtResp;
import com.okinc.unify_trade.biz.SpotInUseConfirmResp;
import com.okinc.unify_trade.biz.SpotManualBorrowRepayReq;
import com.okinc.unify_trade.biz.SpotManualBorrowRepayResp;
import com.okinc.unify_trade.biz.SpreadTrendWithDayBean;
import com.okinc.unify_trade.biz.SpreadTrendWithDayBody;
import com.okinc.unify_trade.biz.StableCoinProfitRatio;
import com.okinc.unify_trade.biz.StableInstrumentInfo;
import com.okinc.unify_trade.biz.StgyFavouriteReq;
import com.okinc.unify_trade.biz.StgyFavouriteResult;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StopTradeOrderReq;
import com.okinc.unify_trade.biz.StrategyAmendReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse;
import com.okinc.unify_trade.biz.StrategyHomePagePublicInfoData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyPreCheckReq;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.biz.StrategySupport;
import com.okinc.unify_trade.biz.StrikeConfigResp;
import com.okinc.unify_trade.biz.StrtagyOrders;
import com.okinc.unify_trade.biz.SubAccountLimitRateRespData;
import com.okinc.unify_trade.biz.SubAccountLimitRateUpdateReq;
import com.okinc.unify_trade.biz.SupportCurrencyPair;
import com.okinc.unify_trade.biz.SupportMultiplePriceResponse;
import com.okinc.unify_trade.biz.SupportedPairsItem;
import com.okinc.unify_trade.biz.SupportedSimpleOption;
import com.okinc.unify_trade.biz.SwitchAccountPresetReq;
import com.okinc.unify_trade.biz.SwitchAccountPresetResp;
import com.okinc.unify_trade.biz.SwitchRenewData;
import com.okinc.unify_trade.biz.SyncParamsMinTopupInfo;
import com.okinc.unify_trade.biz.SystemTimeData;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TicketEligibility;
import com.okinc.unify_trade.biz.ToggleReinvestmentReq;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.biz.TradeEarnUserAssets;
import com.okinc.unify_trade.biz.TradeFeeInfo;
import com.okinc.unify_trade.biz.TradeFillsData;
import com.okinc.unify_trade.biz.TradeGreeksData;
import com.okinc.unify_trade.biz.TradeNoOrderRecomend;
import com.okinc.unify_trade.biz.TradeShareBackgroundData;
import com.okinc.unify_trade.biz.TradeSizeConfigResp;
import com.okinc.unify_trade.biz.TradeUnitReq;
import com.okinc.unify_trade.biz.TradeUpgradeStateResp;
import com.okinc.unify_trade.biz.TraderTiskInfo;
import com.okinc.unify_trade.biz.TradingRuleListInfo;
import com.okinc.unify_trade.biz.TrailingDownReq;
import com.okinc.unify_trade.biz.TransferReq;
import com.okinc.unify_trade.biz.TwapModifyReq;
import com.okinc.unify_trade.biz.UploadSettingConfigBean;
import com.okinc.unify_trade.biz.UploadSettingConfigReq;
import com.okinc.unify_trade.biz.UseContractCouponReq;
import com.okinc.unify_trade.biz.UserCurrencyListBalanceReq;
import com.okinc.unify_trade.biz.UserCurrencyListBalanceResp;
import com.okinc.unify_trade.biz.UserGuide;
import com.okinc.unify_trade.biz.UserGuideBean;
import com.okinc.unify_trade.biz.UserTierData;
import com.okinc.unify_trade.biz.VipInterest;
import com.okinc.unify_trade.biz.VipLendingToken;
import com.okinc.unify_trade.biz.VipLoanLimitSwitchData;
import com.okinc.unify_trade.biz.VipLoanLimitSwitchSetReqData;
import com.okinc.unify_trade.biz.VirtualAccountPosData;
import com.okinc.unify_trade.biz.WalletEscapeCheckResult;
import com.okinc.unify_trade.biz.YieldHunterBannerData;
import com.okinc.unify_trade.biz.YieldHunterCloseReq;
import com.okinc.unify_trade.biz.YieldHunterInstrumentResponse;
import com.okinc.unify_trade.biz.YieldHunterOrderReq;
import com.okinc.unify_trade.biz.YieldHunterPortfolioResponse;
import com.okinc.unify_trade.biz.YieldHunterPositionCountResponse;
import com.okinc.unify_trade.biz.YieldHunterPositionsResp;
import com.okinc.unify_trade.biz.YieldHunterPreviewCloseResp;
import com.okinc.unify_trade.biz.YieldHunterPreviewOrderResp;
import com.okinc.unify_trade.biz.YieldHunterSettlementCurrencyResponse;
import com.okinc.unify_trade.biz.bot.LockVoucherBody;
import com.okinc.unify_trade.biz.bot.LockVoucherResponse;
import com.okinc.unify_trade.biz.bot.MaxCapital;
import com.okinc.unify_trade.biz.bot.PreInvestDetail;
import com.okinc.unify_trade.biz.bot.RecommendedParamsDto;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.SpotGridPauseResumeDto;
import com.okinc.unify_trade.biz.bot.SpotGridPauseResumeWithAmtDto;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.ArbitrageFundingResp;
import com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadResp;
import com.okinc.unify_trade.biz.subscribe.BizTradeData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.biz.subscribe.DexOrderDetail;
import com.okinc.unify_trade.biz.subscribe.EstimatedPriceData;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateReq;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse;
import com.okinc.unify_trade.biz.subscribe.FundingRateAllData;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.MarkPriceData;
import com.okinc.unify_trade.biz.subscribe.MarketBooksData;
import com.okinc.unify_trade.biz.subscribe.MovementBean;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import com.okinc.unify_trade.biz.subscribe.OptSummaryData;
import com.okinc.unify_trade.biz.subscribe.PosAttachAlgoData;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.TradeHisPosOrder;
import com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderReq;
import com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderResp;
import com.okinc.unify_trade.biz.subscribe.TradeHisPostionData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradePositionInfo;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import com.okinc.unify_trade.biz.subscribe.VolumeData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.bot.data.BotToMPRecommend;
import com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean;
import com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData;
import com.okinc.unify_trade.manager.CoinLoanCheckBoxBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import o.C54487xKf;
import o.C54488xKg;
import o.C54589xNz;
import o.C56157xxX;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes12.dex */
public interface BizApiService {
    @POST("/priapi/v5/algo/grid/sync-param")
    AbstractC58185ywX<ResponseData<List<ContractGridSyncParamResp>>> ContractGridSyncParam(@Body @NotNull ContractGridSyncParamReq contractGridSyncParamReq);

    @POST("priapi/v5/account/active")
    AbstractC58185ywX<ResponseData<List<OuterAccountActive>>> activateAccountForOuter(@Body @NotNull OuterAccountLevelData outerAccountLevelData);

    @GET("/priapi/v5/account/active-products")
    AbstractC58185ywX<ResponseData<List<ActiveProductsResponse>>> activeProducts(@Query("instType") String str, @Query("instId") String str2);

    @POST("/priapi/v5/algo/trade/add-investment")
    Object addInvestmentForSpotGrid(@Body @NotNull AddSpotGridAddInvestmentReq addSpotGridAddInvestmentReq, @NotNull Continuation<? super ResponseData<List<Object>>> continuation);

    @POST("/priapi/v5/algo/trade/signal/manual-add-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> addSignalBotManualOrder(@Body @NotNull SignalBotManualOrderReq signalBotManualOrderReq);

    @POST("priapi/v5/account/add-trade-borrow-protocol")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> addTradeBorrowProtocol();

    @GET("priapi/v5/account/adjust-margin-balance")
    AbstractC58185ywX<ResponseData<List<QueryMarginInfo>>> adjustMarginBalance(@NotNull @Query("instId") String str, @NotNull @Query("posSide") String str2, @NotNull @Query("type") String str3, @NotNull @Query("amt") String str4, @Query("ccy") String str5);

    @POST("/priapi/v5/algo/config/edit-strategy-name")
    AbstractC58185ywX<ResponseData<List<Object>>> amendBotName(@Body @NotNull EditStrategyNameReq editStrategyNameReq);

    @POST("priapi/v5/account/amend-cost")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> amendCost(@Body @NotNull AmendCostRequest amendCostRequest);

    @POST("/priapi/v5/algo/trade/amend-order-algo")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> amendStrategy(@Body @NotNull StrategyAmendReq strategyAmendReq);

    @POST("/priapi/v5/algo/marketplace/loss-insurance/voucher/apply")
    AbstractC58185ywX<ResponseData<List<ApplyLossInsuranceBean>>> applyLossInsurance(@Body @NotNull ApplyLossInsuranceReq applyLossInsuranceReq);

    @POST("/priapi/v5/algo/trade/multi-order")
    AbstractC58185ywX<ResponseData<List<ArbitrageOrderResponse>>> arbitrageOrder(@Body @NotNull ArbitrageOrderData arbitrageOrderData);

    @GET("priapi/v5/asset/purchase_redempt")
    AbstractC58185ywX<ResponseData<List<AssetPurchaseRedemptData>>> assetPurchaseRedempt(@Body @NotNull AssetPurchaseRedemptData assetPurchaseRedemptData);

    @POST("/priapi/v5/algo/marketplace/signal-customer/auto-switch")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> autoSwitchRenew(@Body @NotNull SwitchRenewData switchRenewData);

    @GET("priapi/v5/market/all-cup-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> batchMarketAllCupTickers();

    @GET("priapi/v5/market/mult-cup-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> batchMarketCupTickers(@NotNull @Query("ccys") String str);

    @GET("priapi/v5/market/mult-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> batchMarketTickers(@NotNull @Query("instIds") String str);

    @GET("/priapi/v5/algo/trade/add-investment/limits")
    AbstractC58185ywX<ResponseData<List<BotAddInvestLimitResponse>>> botAddInvestLimit(@NotNull @Query("algoId") String str, @NotNull @Query("instId") String str2, @NotNull @Query("ordType") String str3, @Query("contractGridVersion") String str4, @Query("autoReserve") Boolean bool);

    @POST("/priapi/v5/algo/trade/add-investment")
    AbstractC58185ywX<ResponseData<Object>> botAddInvestment(@Body @NotNull BotAddInvestmentData botAddInvestmentData);

    @POST("priapi/v5/trade/aggregate/cancel-orders")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> cancelAllOrders(@Body @NotNull List<CancelAllReq> list);

    @POST("priapi/v5/trade/cancel-batch-orders")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> cancelBatchOrders(@Body @NotNull List<BizCancelBatchOrderReq> list);

    @POST("/priapi/v5/algo/contract-dca/cancel-manual-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> cancelContractDcaManualOrder(@Body @NotNull EditContractDcaReq editContractDcaReq);

    @POST("/priapi/v5/algo/dca/cancel-order")
    AbstractC58185ywX<ResponseData<List<ContractGridClosePositionData>>> cancelDCASubOrder(@Body @NotNull ContractGridClosePositionData contractGridClosePositionData);

    @POST("/priapi/v5/dex/cefi/v2/trade/cancel")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> cancelDexOrder(@Body @NotNull BizCancelDexOrderReq bizCancelDexOrderReq);

    @POST("priapi/v5/trade/cancel-order")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> cancelOrder(@Body @NotNull BizCancelOrderReq bizCancelOrderReq);

    @POST("priapi/v5/rfq/cancel-rfq")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> cancelRFQ(@Body @NotNull RFQCancelReq rFQCancelReq);

    @POST("/priapi/v5/algo/spot-dca/cancel-manual-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> cancelSpotDcaManualOrder(@Body @NotNull CancelSpotDcaOrderBody cancelSpotDcaOrderBody);

    @POST("priapi/v5/trade/cancel-algos")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> cancelStrategyOrder(@Body @NotNull List<BizCancelStrategyOrderReq> list);

    @POST("/priapi/v5/algo/position/cancel-sub-order")
    AbstractC58185ywX<ResponseData<List<ContractGridClosePositionData>>> cancelSubOrder(@Body @NotNull ContractGridClosePositionData contractGridClosePositionData);

    @GET("/priapi/v5/algo/trade/order-pending")
    AbstractC58185ywX<ResponseData<List<ChaseOrderInfoBean>>> chaseOrderInfo(@NotNull @Query("ordType") String str, @NotNull @Query("algoId") String str2, @Query("requireProfits") boolean z);

    @POST("/priapi/v5/account/kyc-verify")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> checkAccountKyc();

    @GET("/priapi/v5/algo/contract-dca/manual-add-order-check")
    AbstractC58185ywX<ResponseData<List<ContractDcaAvaData>>> checkContractDcaAddOrder(@Query("algoId") String str, @Query("px") String str2, @Query("amt") String str3);

    @GET("priapi/v5/ecotrade/trader/risk-result")
    AbstractC58185ywX<ResponseData<List<TraderTiskInfo>>> checkRraderRiskResult(@Query("instId") String str);

    @POST("priapi/v5/trade/close-batch-positions")
    AbstractC58185ywX<ResponseData<List<CloseBatchPositionResponse>>> closeBatchPositions(@Body @NotNull List<CloseBatchPositionRequest> list);

    @FormUrlEncoded
    @POST("/priapi/v5/rubik/newbie/upload-state")
    AbstractC58185ywX<ResponseData<ArrayList<String>>> closeOptionCoolConfig(@Field("type") String str);

    @POST("priapi/v5/simple-options/close-position")
    AbstractC58185ywX<ResponseData<List<SimpleOptionClosePositionResponse>>> closeSimpleOptionPosition(@Body @NotNull SimpleOptionClosePositionReq simpleOptionClosePositionReq);

    @GET("/priapi/v5/trade/frozen-pre-check")
    AbstractC58185ywX<ResponseData<ArrayList<CmrPreCheckResp>>> cmrFrozenPreCheck(@Query("symbol") String str, @Query(OtcExtraKeys.AMOUNT) String str2);

    @POST("/v2/asset/accounts/transfer")
    AbstractC58185ywX<ResponseData<Unit>> coDoTransfer(@Body @NotNull TransferReq transferReq);

    @GET("/priapi/v5/account/coins/is-holding")
    AbstractC58185ywX<ResponseData<Object>> coinsIsHolding(@NotNull @Query("ccy") String str);

    @POST("/priapi/v5/account/spotinuse-confirmation")
    AbstractC58185ywX<ResponseData<List<SpotInUseConfirmResp>>> confirmSpotInUseAmt(@Body @NotNull RiskOffsetAmtReq riskOffsetAmtReq);

    @POST("/priapi/v5/algo/contract-dca/manual-add-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> contractDcaAddOrder(@Body @NotNull EditContractDcaReq editContractDcaReq);

    @POST("/priapi/v5/algo/trade/contract-dca/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> contractDcaMakeOrder(@Body @NotNull DcaOrderReq dcaOrderReq);

    @POST("/priapi/v5/ecotrade/marketplace/contract-dca/place-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> contractDcaPlaceOrder(@Body @NotNull DcaOrderReq dcaOrderReq);

    @POST("/priapi/v5/algo/position/adjust-margin-balance")
    AbstractC58185ywX<ResponseData<List<ContractGridAdjustMarginResp>>> contractGridAdjustMargin(@Body @NotNull ContractGridAdjustMarginReq contractGridAdjustMarginReq);

    @POST("/priapi/v5/algo/grid/adjust-order-stop")
    AbstractC58185ywX<ResponseData<List<C56157xxX>>> contractGridAdjustOrderStop(@Body @NotNull GridOrderTpSlReq gridOrderTpSlReq);

    @POST("/priapi/v5/algo/position/close-position")
    AbstractC58185ywX<ResponseData<List<ContractGridClosePositionData>>> contractGridClosePosition(@Body @NotNull ContractGridClosePositionReq contractGridClosePositionReq);

    @POST("/priapi/v5/ecotrade/marketplace/grid/place-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> contractGridPlaceOrder(@Body @NotNull ContractGridReq contractGridReq);

    @GET("/priapi/v5/ecotrade/trader/position-size")
    AbstractC58185ywX<ResponseData<List<OrderLeadPosSize>>> copyPositionSize();

    @POST("priapi/v5/rfq/create-rfq")
    AbstractC58185ywX<ResponseData<List<RFQCreateResp>>> createRFQ(@Body @NotNull RFQCreateReq rFQCreateReq);

    @POST("/priapi/v5/algo/trade/signal/create")
    AbstractC58185ywX<ResponseData<List<SignalListItem>>> createSignalBotSign(@Body @NotNull SignalBotCreateSignReq signalBotCreateSignReq);

    @POST("/priapi/v5/dex/cefi/v2/trade/create-tpsl")
    AbstractC58185ywX<ResponseData<List<OKTDexTpslUpdateResponse>>> createTPSL(@Body @NotNull BizCreateTPSLReq bizCreateTPSLReq);

    @GET("/priapi/v5/ecotrade/trader/position-detail")
    AbstractC58185ywX<ResponseData<List<OrderLeadSpBean>>> currentLeadDetailOrder(@Query("size") String str, @Query("instIds") String str2);

    @GET("/priapi/v5/ecotrade/trader/position-summary")
    AbstractC58185ywX<ResponseData<List<OrderLeadSpBean>>> currentLeadSummaryOrder(@Query("size") String str, @Query("instIds") String str2);

    @POST("/priapi/v5/algo/trade/dca/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> dcaAggregationMakeOrder(@Body @NotNull DcaOrderReq dcaOrderReq);

    @POST("/priapi/v5/user/debt-quote")
    AbstractC58185ywX<ResponseData<List<DebtQuoteReplayBean>>> debtQuote(@Body @NotNull DebtQuoteBean debtQuoteBean);

    @HTTP(hasBody = true, method = "DELETE", path = "/priapi/v5/algo/marketplace/user-favourite")
    AbstractC58185ywX<ResponseData<List<StgyFavouriteResult>>> deleteStgyFavourite(@Body @NotNull StgyFavouriteReq stgyFavouriteReq);

    @POST("/priapi/v5/algo/contract-dca/edit-strategy")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> editContractDca(@Body @NotNull EditContractDcaReq editContractDcaReq);

    @POST("/priapi/v5/algo/contract-dca/edit-price")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> editContractDcaPrice(@Body @NotNull EditContractDcaReq editContractDcaReq);

    @POST("/priapi/v5/algo/contract-dca/edit-strategy")
    Object editContractDcaSuspend(@Body @NotNull EditContractDcaReq editContractDcaReq, @NotNull Continuation<? super ResponseData<List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/rubik/funding-rate-alert/rule/set-threshold")
    AbstractC58185ywX<ResponseData<Object>> editFundingRateThreshold(@Body @NotNull FundingRateThresholdReq fundingRateThresholdReq);

    @POST("/priapi/v5/algo/grid/edit-profit-auto-reinvest")
    Object editGridProfitAutoReinvest(@Body @NotNull EditGridProfitAutoReinvestRequest editGridProfitAutoReinvestRequest, @NotNull Continuation<? super ResponseData<List<EditGridProfitAutoReinvestResponse>>> continuation);

    @GET("priapi/v5/account/est-avg-cost")
    AbstractC58185ywX<ResponseData<List<EstAvgCostResponse>>> estAvgCost(@NotNull @Query("px") String str, @NotNull @Query("ccy") String str2);

    @POST("priapi/v5/rfq/execute-quote")
    AbstractC58185ywX<ResponseData<List<RFQExecuteResp>>> executeRFQ(@Body @NotNull RFQExecuteReq rFQExecuteReq);

    @GET("/priapi/v5/algo/share/config")
    AbstractC58185ywX<ResponseData<List<AlgoShareConfigInfo>>> fetchAlgoShareConfig();

    @GET("/priapi/v5/account/history-positions")
    AbstractC58185ywX<ResponseData<List<TradeHisPostionData>>> fetchBotHistoryPosition(@NotNull @Query("positionId") String str, @NotNull @Query("sid") String str2, @NotNull @Query(TtmlNode.RUBY_BEFORE) String str3);

    @GET("/priapi/v5/algo/marketplace/lead-trader/profit-sharing/orders-details")
    Object fetchBotLeadDetailInfo(@NotNull @Query("algoId") String str, @NotNull Continuation<? super ResponseData<List<BotLeadProfitProfitOrderDetails>>> continuation);

    @GET("/priapi/v5/algo/trade/max-available")
    AbstractC58185ywX<ResponseData<List<BotMaxAvailableResult>>> fetchBotMaxAvailable(@Query("algoId") String str, @Query("reduceOnly") Boolean bool, @Query("instId") String str2, @Query("px") String str3);

    @GET("/priapi/v5/algo/marketplace/public/recommendation")
    AbstractC58185ywX<ResponseData<List<BotRecommendationResult>>> fetchBotRecommendationParam(@Query("algoOrdType") String str, @Query("instId") String str2, @Query("type") String str3, @Query("userRiskMode") String str4, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str5, @Query("ordVariant") String str6);

    @GET("priapi/v5/algo/marketplace/public/share")
    AbstractC58185ywX<ResponseData<List<BotShareResult>>> fetchBotShareUrl(@NotNull @Query("instId") String str, @NotNull @Query("instType") String str2, @NotNull @Query("algoOrdType") String str3, @NotNull @Query("algoId") String str4);

    @GET("/priapi/v5/algo/marketplace/user")
    AbstractC58185ywX<ResponseData<List<BotUserConfigInfo>>> fetchBotUserConfig();

    @GET("/priapi/v5/algo/trade/add-investment/estimate")
    Object fetchConfirmInfoForSpotGridAddInvestment(@NotNull @Query("algoId") String str, @NotNull @Query("topUpQuoteAmount") String str2, @NotNull @Query("shouldReinvestProfits") String str3, @NotNull Continuation<? super ResponseData<List<ConfirmInfoForSpotGridAddInvestment>>> continuation);

    @GET("/priapi/v5/algo/contract-dca/account-availab")
    AbstractC58185ywX<ResponseData<List<ContractDcaAvaData>>> fetchContractDcaAva(@Query("algoId") String str);

    @GET("/priapi/v5/algo/contract-dca/liquidate-price")
    AbstractC58185ywX<ResponseData<List<ContractDcaLiqPxResult>>> fetchContractDcaLiqPx(@Query("instId") String str, @Query("initOrdAmt") String str2, @Query("safetyOrdAmt") String str3, @Query("maxSafetyOrds") String str4, @Query("pxSteps") String str5, @Query("pxStepsMult") String str6, @Query("volMult") String str7, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str8, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str9, @Query("reserveFunds") Boolean bool, @Query("triggerPx") String str10);

    @GET("/priapi/v5/algo/contract-dca/tier-limit")
    AbstractC58185ywX<ResponseData<List<ContractLeverTierLimitResult>>> fetchContractDcaTierLimit(@Query("instId") String str, @Query("initOrdAmt") String str2, @Query("safetyOrdAmt") String str3, @Query("maxSafetyOrds") String str4, @Query("pxSteps") String str5, @Query("pxStepsMult") String str6, @Query("volMult") String str7, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str8, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str9, @Query("reserveFunds") Boolean bool);

    @POST("/v2/asset/balance/currency-rate")
    Object fetchCurrencyExchangeRate(@Body @NotNull ExchangeRateReq exchangeRateReq, @NotNull Continuation<? super ResponseData<ExchangeRateResponse>> continuation);

    @GET("/priapi/v5/algo/dca/precompute-stop")
    AbstractC58185ywX<ResponseData<List<GridStopInfoDto>>> fetchDCAStopInfo(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/dca/cycle-active-order")
    AbstractC58185ywX<ResponseData<List<StrategyOrderBillDetailsResponse>>> fetchDcaNoCloseOpenOrder(@NotNull @Query("algoId") String str, @NotNull @Query("algoOrdType") String str2, @Query("limit") String str3, @Query(TtmlNode.RUBY_AFTER) String str4, @Query(TtmlNode.RUBY_BEFORE) String str5);

    @GET("/priapi/v5/algo/trade/dcd/arbitrage-details")
    AbstractC58185ywX<ResponseData<List<DcdArbDetail>>> fetchDcdArbDetail(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/trade/dcd/quotes")
    AbstractC58185ywX<ResponseData<List<DcdBotQuotesDetail>>> fetchDcdQuotes(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/account/depth-count")
    AbstractC58185ywX<ResponseData<List<DepthCountInfo>>> fetchDepthCountSettingInfo();

    @POST("/priapi/v5/algo/trade/signal/edit-strategy")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> fetchEditStrategy(@Body @NotNull SignalBotEditStrategyBean signalBotEditStrategyBean);

    @GET("/priapi/v5/algo/grid/precompute-stop")
    AbstractC58185ywX<ResponseData<List<GridStopInfoDto>>> fetchGridStopInfo(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/marketplace/search")
    AbstractC58185ywX<ResponseData<List<HomeStrategyCardResult>>> fetchHomeStrategyCards(@NotNull @Query("showUserFav") String str, @NotNull @Query("algoOrdType") String str2, @NotNull @Query("ccy") String str3, @NotNull @Query("runningTime") String str4, @NotNull @Query("maxDrawdown") String str5, @NotNull @Query("pnlRatio") String str6, @NotNull @Query("leverage") String str7, @NotNull @Query("orderBy") String str8, @NotNull @Query("orderDirection") String str9, @NotNull @Query("page") String str10, @NotNull @Query("pageSize") String str11, @NotNull @Query("query") String str12, @Query("userRole") String str13, @Query("sourceType") String str14);

    @GET("/priapi/v5/algo/marketplace/dropdown-info")
    AbstractC58185ywX<ResponseData<List<HomeStrategyDropDownInfo>>> fetchHomeStrategyDropdownInfo(@NotNull @Query("algoOrdType") String str);

    @GET("/priapi/v5/algo/marketplace/public/building-blocks")
    AbstractC58185ywX<ResponseData<List<MPBotBannerResult>>> fetchMPBanner(@Query(OtcExtraKeys.TYPES) String str);

    @GET("/priapi/v5/algo/trade/multi-insts")
    AbstractC58185ywX<ResponseData<List<FetchMultiInstsResult>>> fetchMultiInsts(@Query("algoId") String str, @Query("isPosition") String str2);

    @GET("priapi/v5/account/risk-unit-mr-details")
    AbstractC58185ywX<ResponseData<List<RiskUnitMRDetails>>> fetchRiskUnitMRDetails(@NotNull @Query("riskUnit") String str);

    @GET("/priapi/v5/algo/marketplace/signal/settlement-details")
    AbstractC58185ywX<ResponseData<List<SignalBotSettlementDetailBean>>> fetchSettlementDetails(@NotNull @Query("page") String str, @NotNull @Query("pageSize") String str2, @NotNull @Query("userSubscriptionType") String str3, @NotNull @Query("signalChanId") String str4);

    @GET("priapi/v5/public/settlement-history")
    AbstractC58185ywX<ResponseData<List<SettlementHisData>>> fetchSettlementHistory(@NotNull @Query("instId") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query("limit") String str3);

    @GET("/priapi/v5/algo/trade/signal/query-description")
    AbstractC58185ywX<ResponseData<List<SignalListItem>>> fetchSignDesc(@Query("signalChanId") String str);

    @GET("/priapi/v5/algo/trade/signal/query-tv")
    AbstractC58185ywX<ResponseData<List<SignalBotSignParamsResult>>> fetchSignalBotSignParams(@Query("signalChanId") String str);

    @GET("/priapi/v5/algo/marketplace/signal-provider/summary")
    AbstractC58185ywX<ResponseData<List<SignalBotSummaryBean>>> fetchSignalBotSummary();

    @GET("/priapi/v5/algo/trade/signal/detail")
    AbstractC58185ywX<ResponseData<List<ThirdSignalDetail>>> fetchSignalDetail(@NotNull @Query("signalChanId") String str);

    @GET("/priapi/v5/algo/marketplace/public/signals")
    AbstractC58185ywX<ResponseData<List<HomeSignalCardResult>>> fetchSignalList(@Query("orderBy") String str, @Query("orderDirection") String str2, @Query("page") String str3, @Query("pageSize") String str4, @Query("type") String str5);

    @GET("/priapi/v5/algo/public/spot-dca/ai-param")
    AbstractC58185ywX<ResponseData<List<DcaAiData>>> fetchSpotDcaAiParam(@Query("instId") String str, @Query("userRiskMode") String str2);

    @GET("/priapi/v5/algo/trade/add-investment/limits")
    AbstractC58185ywX<ResponseData<List<SpotGridAddInvestmentInfo>>> fetchSpotGridAddInvestmentInfo(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/trade/signal")
    AbstractC58185ywX<ResponseData<List<SignalListResult>>> fetchSubSignalList(@Query("type") String str, @Query("page") String str2, @Query("limit") String str3);

    @GET("/v2/support/home/yield-hunter/app/banner")
    AbstractC58185ywX<ResponseData<List<YieldHunterBannerData>>> fetchYieldHunterBanner();

    @GET("/priapi/v5/public/structured-financial-product/config")
    AbstractC58185ywX<ResponseData<List<FinancialProductConfigInfo>>> financialProductConfig();

    @GET("/priapi/v1/loans/fixed-term/market-overview")
    AbstractC58185ywX<ResponseData<MarketOverviewResponse>> fixedLoanMarketOverview(@Query(FirebaseAnalytics.Param.TERM) String str, @Query("currencyId") String str2);

    @POST("priapi/v5/rubik/config-sync/config-sync-edit")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> fundingRateConfigSyncEdit(@Body @NotNull FundingRateConfigReq fundingRateConfigReq);

    @GET("priapi/v5/account/balance")
    AbstractC58185ywX<ResponseData<List<AccountBalanceData>>> getAccountBalance(@Query("ccy") String str);

    @GET("priapi/v5/account/balance")
    Object getAccountBalanceSuspend(@Query("ccy") String str, @NotNull Continuation<? super ResponseData<List<AccountBalanceData>>> continuation);

    @GET("/v2/asset/balance")
    AbstractC58185ywX<ResponseData<AccountAssets>> getAccountBanlance(@NotNull @Query("transferFrom") String str, @NotNull @Query("valuationUnit") String str2, @Query("sortByValuation") boolean z, @Query("limit") Integer num, @Query("version") String str3);

    @GET("priapi/v5/account/bills-archive")
    AbstractC58185ywX<ResponseData<List<AccountBills>>> getAccountBills(@Query("instType") String str, @Query("ctType") String str2, @Query("_instId") String str3, @Query("ccy") String str4, @Query("mgnMode") String str5, @Query("type") String str6, @Query("subType") String str7, @Query(TtmlNode.RUBY_AFTER) String str8, @Query("_start") String str9, @Query("_end") String str10, @Query("limit") String str11, @Query("filterType") String str12, @Query("sId") Long l);

    @GET("priapi/v5/public/account-level")
    AbstractC58185ywX<ResponseData<ArrayList<AccountLevelData>>> getAccountLevel();

    @GET("priapi/v5/account/account-summary")
    AbstractC58185ywX<ResponseData<List<WsAccountSummaryData>>> getAccountSummary();

    @GET("priapi/v5/user/tier-position-info")
    AbstractC58185ywX<ResponseData<List<AccountTierData>>> getAccountTier(@NotNull @Query("instType") String str, @NotNull @Query("mgnMode") String str2, @Query("instId") String str3, @Query("ccy") String str4, @Query("instFamily") String str5, @Query("currencyType") String str6);

    @POST("/priapi/v5/algo/grid/additional-investment")
    AbstractC58185ywX<ResponseData<List<AdditionalInvest>>> getAdditionalInvest(@Body @NotNull TrailingDownReq trailingDownReq);

    @GET("priapi/v5/account/adjust-lever-required")
    AbstractC58185ywX<ResponseData<List<AdjustLeverRequiredData>>> getAdjustLeverRequired(@NotNull @Query("instType") String str, @Query("mgnMode") String str2, @Query("instId") String str3, @Query("ccy") String str4, @Query("posSide") String str5, @NotNull @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str6, @Query(OtcExtraKeys.SIDE) String str7);

    @GET("/priapi/v5/algo/marketplace/public/bff/aggregated-info")
    AbstractC58185ywX<ResponseData<List<BotAggregatedInfoBean>>> getAggregatedInfo(@NotNull @Query("instId") String str, @NotNull @Query("algoOrdType") String str2, @NotNull @Query("investType") String str3, @Query("userRiskMode") String str4, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str5);

    @GET("priapi/v5/trade/orders-algo-history")
    AbstractC58185ywX<ResponseData<List<TradeStrategyOrderData>>> getAlgoHistoryOrderByOrdId(@Query("algoId") String str, @Query("ordType") String str2);

    @GET("priapi/v5/trade/orders-algo-pending")
    AbstractC58185ywX<ResponseData<List<TradeStrategyOrderData>>> getAlgoPendingOrderByOrdId(@Query("algoId") String str, @Query("ordType") String str2);

    @GET("/priapi/v5/algo/trade/order-history-all")
    AbstractC58185ywX<ResponseData<List<StrategyHistoryListResp>>> getAllBotHistoryList(@Query("limit") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query(TtmlNode.START) String str3, @Query(TtmlNode.END) String str4, @Query("systemSource") String str5, @Query("nmpUnderlyingIds") String str6, @Query("requireHisSnapshots") boolean z);

    @GET("/priapi/v5/algo/trade/order-pending-all")
    AbstractC58185ywX<ResponseData<List<StrategyPendingListResp>>> getAllBotRunningList(@Query("limit") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query("algoOrdType") String str3, @Query("algoId") String str4, @Query("systemSource") String str5, @Query("nmpUnderlyingIds") String str6, @Query("requireProfits") boolean z);

    @GET("/priapi/v5/algo/trade/config/query")
    AbstractC58185ywX<ResponseData<List<ArbitragePriceSettingModel>>> getArbitragePriceSetting(@NotNull @Query("ordType") String str);

    @GET("priapi/v5/asset/balances")
    AbstractC58185ywX<ResponseData<List<AssetBalanceData>>> getAssetBalances();

    @GET("priapi/v5/asset/currencies")
    AbstractC58185ywX<ResponseData<List<AssetCurrenciesItemData>>> getAssetCurrencies();

    @GET("priapi/v5/asset/withdrawal")
    AbstractC58185ywX<ResponseData<List<AssetWithdrawalData>>> getAssetWithdrawal(@NotNull @Query("ccy") String str, @NotNull @Query("amt") String str2, @NotNull @Query("toAddr") String str3, @NotNull @Query("pwd") String str4, @NotNull @Query("fee") String str5);

    @GET("/priapi/v5/ecotrade/marketplace/banner/order-details")
    AbstractC58185ywX<ResponseData<List<BannerOrderDetails>>> getBannerOrderDetails(@NotNull @Query("algoOrdType") String str, @NotNull @Query("algoIndexId") String str2);

    @GET("/priapi/v5/public/billTypes")
    AbstractC58185ywX<ResponseData<ArrayList<BillTypeData>>> getBillType(@Query("isConvertVersion") String str);

    @GET("/priapi/v5/algo/public/strategy-type")
    AbstractC58185ywX<ResponseData<List<BotCategoryConfig>>> getBotCategory();

    @GET("/priapi/v5/algo/marketplace/public/strategy-summary")
    AbstractC58185ywX<ResponseData<List<BotUserCount>>> getBotUserCount();

    @GET("/v2/asset/currency-classification")
    AbstractC58185ywX<ResponseData<List<CategoryRespData>>> getCategoryList(@NotNull @Query("targetId") String str);

    @GET("priapi/v5/public/group")
    AbstractC58185ywX<ResponseData<List<ChargeGroupData>>> getCoinGroup();

    @GET("/priapi/v5/public/guide/products")
    AbstractC58185ywX<ResponseData<List<GuideProductInfo>>> getCoinGuideProducts(@NotNull @Query("ccy") String str);

    @GET("/priapi/v5/user/coin/check-box")
    AbstractC58185ywX<ResponseData<ArrayList<CoinLoanCheckBoxBean>>> getCoinLoanCheckBox(@NotNull @Query("instId") String str);

    @GET("/priapi/v5/public/collateral-coins")
    AbstractC58185ywX<ResponseData<ArrayList<TradeCoinInfo>>> getCollateralCoins();

    @GET("/priapi/v5/account/collateral-assets")
    AbstractC58185ywX<ResponseData<List<CollateralTokenListResp>>> getCollateralTokenList();

    @GET("/priapi/v5/rubik/app/public/plate-simple-rank")
    AbstractC58185ywX<ResponseData<ArrayList<ConceptRankData>>> getConceptHotSort();

    @GET("/priapi/v5/algo/contract-dca/profit-sharing/liquidate-price")
    AbstractC58185ywX<ResponseData<List<ContractDcaLiqPxResult>>> getContractDcaLiqPx(@Query("sourceAlgoId") String str, @Query("copyBotMargin") String str2, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str3);

    @GET("/priapi/v5/algo/contract-dca/profit-sharing/minMargin")
    AbstractC58185ywX<ResponseData<List<DcaMinMarginResponse>>> getContractDcaMinMargin(@Query("sourceAlgoId") String str, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str2);

    @GET("/priapi/v5/algo/contract-dca/trade-list")
    AbstractC58185ywX<ResponseData<List<DcaTradeListResponse>>> getContractDcaTradeList(@NotNull @Query("algoId") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query(TtmlNode.RUBY_BEFORE) String str3, @Query("limit") String str4);

    @GET("/priapi/v5/algo/position/margin-balance")
    AbstractC58185ywX<ResponseData<List<ContractGridAdjustMarginResp>>> getContractGridAdjustMargin(@NotNull @Query("algoId") String str, @NotNull @Query("type") String str2, @NotNull @Query("amt") String str3);

    @GET("/priapi/v5/account/convert/coin-list-with-amount")
    AbstractC58185ywX<ResponseData<List<ConvertCanWithdrawBeanNew>>> getConvertCoinListNew(@Query("ccy") String str, @Query("source") String str2, @Query("coinType") String str3);

    @GET("priapi/v5/rubik/public/new-inst-countdown")
    AbstractC58185ywX<ResponseData<List<CountDownInfo>>> getCountDownBizList(@NotNull @Query("countryFilter") String str, @Query("instType") String str2);

    @GET("/priapi/v5/rfq/counterparties")
    AbstractC58185ywX<ResponseData<List<CounterPartiesResp>>> getCounterPartiesList(@NotNull @Query("t") String str);

    @GET("/priapi/v5/account/inst/risk-state")
    AbstractC58185ywX<ResponseData<List<RiskStatus>>> getCurrentStatus(@NotNull @Query("instId") String str);

    @GET("/priapi/v5/algo/public/trade/dcd/minimum-strike-price")
    AbstractC58185ywX<ResponseData<List<MinStrikePxResp>>> getDcdMinStrikePx(@NotNull @Query("currencyId") String str, @NotNull @Query("altCurrencyId") String str2, @NotNull @Query("dcdOptionType") String str3);

    @GET("/priapi/v5/algo/trade/dcd/product-list")
    AbstractC58185ywX<ResponseData<List<ProductItemResp>>> getDcdProductList(@NotNull @Query("currencyId") String str, @NotNull @Query("altCurrencyId") String str2, @NotNull @Query("dcdOptionType") String str3, @NotNull @Query("strike") String str4, @NotNull @Query("minAnnualYieldPercentage") String str5, @NotNull @Query("maxSettlementDay") String str6);

    @GET("/priapi/v5/algo/trade/dcd/product-list-advanced")
    AbstractC58185ywX<ResponseData<List<ProductItemResp>>> getDcdProductListAdvanced(@NotNull @Query("currencyId") String str, @NotNull @Query("altCurrencyId") String str2, @NotNull @Query("dcdOptionType") String str3, @NotNull @Query("strikePercentage") String str4, @NotNull @Query("minAnnualYieldPercentage") String str5, @NotNull @Query("maxSettlementDay") String str6);

    @GET("/priapi/v5/algo/public/trade/dcd/supported-pairs")
    AbstractC58185ywX<ResponseData<List<SupportedPairsItem>>> getDcdSupportedPairs();

    @GET("/priapi/v5/account/max-withdrawal")
    AbstractC58185ywX<ResponseData<List<DebtCanWithdrawBean>>> getDebtCanWithdrawList(@Query("ccy") String str);

    @GET("/priapi/v5/user/debt-coin-list")
    AbstractC58185ywX<ResponseData<List<DebtBean>>> getDebtList(@Query("type") String str);

    @GET("priapi/v5/public/delivery-exercise-history")
    AbstractC58185ywX<ResponseData<List<OptionExerciseHisData>>> getDeliveryExerciseHistory(@NotNull @Query("instType") String str, @NotNull @Query("instFamily") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4);

    @GET("priapi/v5/public/delta-neutral-config")
    AbstractC58185ywX<ResponseData<List<DeltaNeutralConfig>>> getDeltaNeutralConfig();

    @GET("priapi/v5/asset/deposit-history")
    AbstractC58185ywX<ResponseData<List<AssetDepositHistoryData>>> getDepositHistory(@Query("ccy") String str, @Query("state") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4);

    @GET("priapi/v5/dex/cefi/v2/dex-asset")
    AbstractC58185ywX<ResponseData<List<DexAssets>>> getDexAsset(@NotNull @Query("chainIndex") String str, @NotNull @Query("tokenAddress") String str2, @Header("x-cedefi-tag") @NotNull String str3);

    @GET("priapi/v5/dex/cefi/v2/dex-assets")
    AbstractC58185ywX<ResponseData<List<DexAssetsResponse>>> getDexAssets(@Query("hideSmallBalance") Integer num, @Query("pageNumber") Integer num2, @Query("pageSize") Integer num3, @Query("valuationUnit") String str, @Header("x-cedefi-tag") @NotNull String str2);

    @GET("priapi/v5/dex/cefi/v2/trade/orders-dex-all")
    AbstractC58185ywX<ResponseData<List<DexOrderDetail>>> getDexOrdersAll(@NotNull @Query("state") String str, @Query("chainIndex") String str2, @Query(TtmlNode.RUBY_BEFORE) String str3, @Query(TtmlNode.RUBY_AFTER) String str4, @Query(TtmlNode.START) String str5, @Query(TtmlNode.END) String str6, @Query("limit") String str7, @Query("tokenAddress") String str8, @Query("includeBoost") String str9, @Query("walletFilter") String str10, @Query("orderType") String str11, @Header("x-cedefi-tag") @NotNull String str12);

    @GET("/priapi/v5/dex/cefi/v2/account/private-summary")
    AbstractC58185ywX<ResponseData<List<OrderPositions>>> getDexPrivateSummary(@Header("x-cedefi-tag") @NotNull String str);

    @GET("priapi/v5/public/discount-rate")
    AbstractC58185ywX<ResponseData<ArrayList<DiscountData>>> getDiscountConfig(@Query("ccy") String str);

    @GET("priapi/v5/public/discount-rate-interest-free-quota")
    AbstractC58185ywX<ResponseData<List<CoinFreeInfo>>> getDiscountRateFreeInterest(@Query("ccy") String str);

    @POST("/v2/order-center/download-records")
    Object getDownloadListInfo(@Body @NotNull DownLoadListRequest downLoadListRequest, @NotNull Continuation<? super ResponseData<DownLoadListResponse>> continuation);

    @GET("/priapi/v5/account/upgrade-state")
    Object getEntityUpgradeState(@NotNull Continuation<? super ResponseData<List<TradeUpgradeStateResp>>> continuation);

    @GET("priapi/v5/public/estimated-price")
    AbstractC58185ywX<ResponseData<List<EstimatedPriceData>>> getEstimatedPrice(@NotNull @Query("instId") String str);

    @GET("/priapi/v5/algo/public/auto-reserve-utilisation")
    AbstractC58185ywX<ResponseData<List<ExtraActualMarginResp>>> getExtraMargin(@NotNull @Query("instId") String str, @Query("sz") String str2, @Query("contractGridVersion") String str3, @Query("minPx") String str4, @Query("maxPx") String str5, @Query("gridNum") String str6, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str7, @Query("basePosition") Boolean bool, @Query("leverage") String str8, @Query("triggerStrategy") String str9, @Query("algoId") String str10);

    @GET("priapi/v5/users/favorite/common/recomment")
    AbstractC58185ywX<ResponseData<List<WatchListData>>> getFavoriteComment(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/users/arbitrage/favourite/all")
    AbstractC58185ywX<ResponseData<List<ArbitrageFavoriteBean>>> getFavoriteList();

    @GET("/priapi/v2/financial/outer/currency")
    AbstractC58185ywX<ResponseData<List<FinancialData>>> getFinancialInfo();

    @GET("/priapi/v5/rubik/app/public/funding-rate-arbitrage")
    AbstractC58185ywX<ResponseData<List<FundingRateArbitrageData>>> getFundRateArbitrage(@NotNull @Query("ctType") String str, @NotNull @Query("ccyType") String str2, @Query("sort") String str3);

    @GET("priapi/v5/public/funding-rate")
    AbstractC58185ywX<ResponseData<List<FundingRateData>>> getFundingRate(@NotNull @Query("instId") String str);

    @GET("priapi/v5/public/funding-rate-all")
    AbstractC58185ywX<ResponseData<List<FundingRateAllData>>> getFundingRateAll(@NotNull @Query("currencyType") String str, @NotNull @Query("ccyType") String str2, @Query("instId") String str3);

    @GET("/priapi/v5/rubik/app/public/arbitrage-detail")
    AbstractC58185ywX<ResponseData<List<FundingRateArbitrageData>>> getFundingRateArbitrageDetail(@NotNull @Query("arbitrageId") String str, @NotNull @Query("portfolioType") String str2);

    @GET("priapi/v5/public/funding-rate-history")
    AbstractC58185ywX<ResponseData<List<FundingRateData>>> getFundingRateHistory(@NotNull @Query("instId") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query("limit") String str3, @Query(TtmlNode.RUBY_BEFORE) String str4);

    @GET("/priapi/v5/rubik/stat/contracts/{instName}/funding-rate-history")
    AbstractC58185ywX<ResponseData<ArrayList<KlineFundingRateData>>> getFundingRateSmartArbi(@Path("instName") @NotNull String str);

    @GET("/priapi/v5/rubik/funding-rate-alert/rule/query")
    AbstractC58185ywX<ResponseData<FundingRateQueryResp>> getFundingRateSwitch();

    @GET("/priapi/v5/rubik/app/public/funding-rate-trend")
    AbstractC58185ywX<ResponseData<List<FundingRateWithDayBean>>> getFundingRateWithDay(@NotNull @Query("queryDays") String str, @NotNull @Query("ctType") String str2, @NotNull @Query("ccyType") String str3, @NotNull @Query("contrastInstId") String str4);

    @GET("/priapi/v5/algo/public/grid-ai-param")
    AbstractC58185ywX<ResponseData<List<AIData>>> getGridAiData(@NotNull @Query("instId") String str, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str2, @Query("duration") String str3, @Query("algoOrdType") String str4, @Query("sourceCcy") String str5, @Query("investType") String str6);

    @GET("/priapi/v5/algo/public/grid-holding-distribution")
    AbstractC58185ywX<ResponseData<List<Distribution>>> getGridHoldingDistribution(@NotNull @Query("instId") String str, @Query("gridNum") int i, @NotNull @Query("maxPx") String str2, @NotNull @Query("minPx") String str3, @NotNull @Query("runType") String str4, @NotNull @Query("algoOrdType") String str5, @Query("baseSz") String str6, @Query("quoteSz") String str7, @Query("sourceCcySz") String str8, @Query("sourceCcy") String str9, @Query("triggerStrategy") String str10, @Query("triggerPx") String str11, @Query("tradeQuoteCcy") String str12);

    @GET("/priapi/v5/algo/public/grid-num-range")
    AbstractC58185ywX<ResponseData<List<GridNumRangeBean>>> getGridNumRange(@NotNull @Query("instId") String str, @NotNull @Query("ordType") String str2, @NotNull @Query("maxPx") String str3, @NotNull @Query("minPx") String str4, @NotNull @Query("runType") String str5, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str6);

    @POST("/priapi/v5/algo/public/pre-check-config")
    Object getGridProfitAutoReinvestPreCheck(@Body @NotNull GridProfitAutoReinvestPreCheckRequest gridProfitAutoReinvestPreCheckRequest, @NotNull Continuation<? super ResponseData<List<GridProfitAutoReinvestPreCheckResponse>>> continuation);

    @GET("/priapi/v5/algo/grid/profit-info")
    AbstractC58185ywX<ResponseData<List<GridProfitDetailsResponse>>> getGridProfitDetails(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/grid/profit-list")
    AbstractC58185ywX<ResponseData<List<StrategyProfitResponse>>> getGridProfitList(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/public/grid-profit-rate")
    AbstractC58185ywX<ResponseData<List<GridProfitRateResp>>> getGridProfitRate(@NotNull @Query("maxPx") String str, @NotNull @Query("minPx") String str2, @NotNull @Query("runType") String str3, @NotNull @Query("instId") String str4, @NotNull @Query("gridNum") String str5, @NotNull @Query("algoOrdType") String str6, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str7, @Query("baseSz") String str8, @Query("quoteSz") String str9, @Query("sourceCcySz") String str10, @Query("sourceCcy") String str11, @Query("triggerPx") String str12, @Query("tradeQuoteCcy") String str13);

    @GET("/priapi/v5/algo/grid/trade-list")
    AbstractC58185ywX<ResponseData<List<StrategyGridTradeOrderDetailsResponse>>> getGridTradeDetails(@NotNull @Query("algoId") String str, @NotNull @Query("instId") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query(TtmlNode.RUBY_BEFORE) String str4, @Query("limit") String str5, @Query("pageNum") Integer num, @Query("sort") String str6);

    @GET("/priapi/v5/algo/grid/hedging-estimates")
    AbstractC58185ywX<ResponseData<List<HedgingEstimatesResp>>> getHedgingEstimates(@NotNull @Query("maxPx") String str, @NotNull @Query("minPx") String str2, @NotNull @Query("runType") String str3, @NotNull @Query("instId") String str4, @NotNull @Query("gridNum") String str5, @NotNull @Query("startTrigger") String str6);

    @GET("priapi/v5/account/history-positions")
    AbstractC58185ywX<ResponseData<List<TradeHisPostionData>>> getHisPositionsList(@Query("instId") String str, @Query("instType") String str2, @Query("sortType") String str3, @Query("page") String str4, @Query("limit") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @Query("afterPositionHistoryId") String str7, @Query("afterModifyTime") String str8, @Query("positionHistoryId") String str9);

    @GET("priapi/v5/account/history-positions")
    Object getHisPositionsListSuspend(@Query("instId") String str, @Query("instType") String str2, @Query("sortType") String str3, @Query("page") String str4, @Query("limit") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @Query("afterPositionHistoryId") String str7, @Query("afterModifyTime") String str8, @Query("positionHistoryId") String str9, @NotNull Continuation<? super ResponseData<List<TradeHisPostionData>>> continuation);

    @POST("priapi/v5/account/history-positions/order-history")
    AbstractC58185ywX<ResponseData<List<TradeHisPosOrderResp>>> getHisPositionsOrders(@Body TradeHisPosOrderReq tradeHisPosOrderReq);

    @GET("priapi/v5/account/history-positions/order-history")
    Object getHisPositionsOrdersSuspend(@Query("instId") String str, @Query("instType") String str2, @Query("mgnMode") String str3, @Query("posDirection") String str4, @Query("ccy") String str5, @Query("startTime") String str6, @Query("endTime") String str7, @Query("paginateTime") String str8, @Query("paginateId") String str9, @Query("pageSize") String str10, @NotNull Continuation<? super ResponseData<List<TradeHisPosOrder>>> continuation);

    @GET("/priapi/v5/algo/trade/event-history-order")
    AbstractC58185ywX<ResponseData<List<StrategyOrderBillDetailsResponse>>> getHistoryEventOrders(@NotNull @Query("algoId") String str, @NotNull @Query("clOrdIds") String str2);

    @GET("priapi/v5/market/history-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getHistoryMarketCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4);

    @GET("/priapi/v5/trade/orders-history-archive-app")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getHistoryOrderIn3MonthsByOrdId(@Query("ordId") String str, @Query("ordType") String str2);

    @GET("priapi/v5/trade/orders-history-archive")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getHistoryOrders(@Query("instType") String str, @Query("uly") String str2, @Query("instFamily") String str3, @Query("instId") String str4, @Query("ordType") String str5, @Query("state") String str6, @Query(TtmlNode.RUBY_AFTER) String str7, @NotNull @Query("limit") String str8, @Query("_start") String str9, @Query("_end") String str10, @Query("_posOrSide") String str11, @Query("_instDirection") String str12, @Query("_tdMode") String str13, @Query("_sortType") String str14);

    @GET("/priapi/v5/trade/orders-history-archive-app")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getHistoryOrdersIn3Months(@Query("instType") String str, @Query("instFamily") String str2, @Query("instId") String str3, @Query("ordType") String str4, @Query("state") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @NotNull @Query("limit") String str7, @Query("_start") String str8, @Query("_end") String str9, @Query("_posOrSide") String str10, @Query("_instDirection") String str11, @Query("_tdMode") String str12, @Query("_sortType") String str13, @Query("convertType") String str14, @Query("aggregate") Boolean bool);

    @GET("/priapi/v5/trade/orders-history-app")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getHistoryOrdersIn7Days(@Query("instType") String str, @Query("instFamily") String str2, @Query("instId") String str3, @Query("ordType") String str4, @Query("state") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @NotNull @Query("limit") String str7, @Query("_start") String str8, @Query("_end") String str9, @Query("_posOrSide") String str10, @Query("_instDirection") String str11, @Query("_tdMode") String str12, @Query("_sortType") String str13, @Query("aggregate") Boolean bool);

    @GET("/priapi/v5/algo/trade/order-history")
    AbstractC58185ywX<ResponseData<List<StrategyHistoryListResp>>> getHistoryStrategyOrderList(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/public/get-hot-currency")
    AbstractC58185ywX<ResponseData<List<HotCoinData>>> getHotCurrency();

    @GET("priapi/v5/market/index-tickers")
    AbstractC58185ywX<ResponseData<List<IndexTickersData>>> getIndexTickers(@Query("quoteCcy") String str, @Query("instId") String str2);

    @GET("priapi/v5/public/allProductNames")
    AbstractC58185ywX<ResponseData<List<String>>> getInstIdsByType(@NotNull @Query("instType") String str, @Query("includeType") int i);

    @GET("/priapi/v5/algo/public/inst-tier")
    AbstractC58185ywX<ResponseData<List<InstTierItem>>> getInstTier(@NotNull @Query("instType") String str);

    @GET("priapi/v5/public/inst-type")
    AbstractC58185ywX<ResponseData<List<InstTypeData>>> getInstType();

    @GET("priapi/v5/public/inst-group")
    AbstractC58185ywX<ResponseData<List<InstTypeGroup>>> getInstTypeAndGroup();

    @GET("priapi/v5/public/products")
    AbstractC58185ywX<ResponseData<ArrayList<InstrumentInfo>>> getInstrumentDetails(@NotNull @Query("instId") String str, @NotNull @Query("instType") String str2, @Query("includeType") int i);

    @GET("priapi/v5/account/interest-accrued")
    AbstractC58185ywX<ResponseData<List<InterestAccruedData>>> getInterestAccrued(@Query("type") String str, @Query("instId") String str2, @Query("ccy") String str3, @Query("mgnMode") String str4, @Query(TtmlNode.RUBY_AFTER) String str5, @Query(TtmlNode.RUBY_BEFORE) String str6, @Query("_start") String str7, @Query("_end") String str8, @Query("limit") String str9);

    @GET("priapi/v5/account/interest-limits")
    AbstractC58185ywX<ResponseData<List<InterestLimitData>>> getInterestLimits(@NotNull @Query("type") String str, @Query("ccy") String str2);

    @GET("priapi/v5/public/interest-rate-loan-quota")
    AbstractC58185ywX<ResponseData<ArrayList<MarginLoanInterest>>> getInterestRateLoanQuote(@Query("coinId") String str, @Query(FirebaseAnalytics.Param.LEVEL) String str2, @Query("stgyType") String str3);

    @GET("priapi/v5/public/levelQuery")
    AbstractC58185ywX<ResponseData<ArrayList<MarginInfoUserLevel>>> getLevel(@Query("isVip") String str);

    @GET("/priapi/v5/public/lever-interval")
    AbstractC58185ywX<ResponseData<List<LeverIntervalData>>> getLeverInterval(@NotNull @Query("instType") String str, @Query("mgnMode") String str2, @Query("instId") String str3, @Query("ccy") String str4, @Query("instFamily") String str5);

    @GET("priapi/v5/account/leverage-info")
    AbstractC58185ywX<ResponseData<List<LeverageInfo>>> getLeverageInfo(@Query("instId") String str, @Query("mgnMode") String str2, @Query("_feCcy") String str3);

    @GET("priapi/v5/public/price-limit")
    AbstractC58185ywX<ResponseData<List<LimitPriceData>>> getLimitPrice(@NotNull @Query("instId") String str);

    @GET("priapi/v5/algo/position/liquidate-price")
    AbstractC58185ywX<ResponseData<List<LiquidatePriceResponse>>> getLiquidatePrice(@NotNull @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str, @NotNull @Query("instId") String str2, @NotNull @Query("gridNum") String str3, @NotNull @Query("maxPx") String str4, @NotNull @Query("minPx") String str5, @Query("sz") String str6, @NotNull @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str7, @Query("runType") Integer num, @Query("sourceAlgoId") String str8, @Query("triggerStrategy") String str9, @Query("basePos") Boolean bool, @Query("actualMarginSz") String str10, @Query("extraMarginSz") String str11, @Query("contractGridVersion") String str12, @Query("algoId") String str13, @Query("topupActualMarginSz") String str14);

    @GET("/priapi/v5/account/loans-rate-history")
    Object getLoanRateHistory(@NotNull @Query("currencyId") String str, @NotNull @Query("rateType") String str2, @NotNull Continuation<? super ResponseData<List<LoanHistoricalRate>>> continuation);

    @GET("/priapi/v1/sfp/lvf/stat/volume")
    AbstractC58185ywX<ResponseData<PriceLockerStateVolume>> getLvfStatVolume(@Query("ccy") String str, @Query("altCcy") String str2, @Query("tradeSide") String str3);

    @GET("/v2/support/status/maintenances")
    AbstractC58185ywX<ResponseData<ArrayList<MaintenancesInfo>>> getMaintenanceInfo(@NotNull @Query("displayType") String str);

    @GET("/priapi/v5/user/base-quote-rate")
    AbstractC58185ywX<ResponseData<List<MarginQuoteRateInfo>>> getMarginApr(@NotNull @Query("instId") String str, @Query("tradeQuoteCcy") String str2);

    @GET("/priapi/v5/account/inst-config-info")
    AbstractC58185ywX<ResponseData<ArrayList<InstConfigInfo>>> getMarginModeConfig();

    @GET("priapi/v5/public/mark-price")
    AbstractC58185ywX<ResponseData<List<MarkPriceData>>> getMarkPrice(@NotNull @Query("instType") String str, @Query("instFamily") String str2, @Query("instId") String str3);

    @GET("/priapi/v5/market/mult-mp-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> getMarkPriceMultTicker(@NotNull @Query("instIds") String str);

    @GET("/priapi/v5/market/sort-mp-tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> getMarkPriceTicker(@NotNull @Query("instType") String str, @Query("instFamily") String str2, @NotNull @Query("sortField") String str3, @Query(OtcExtraKeys.ORDER) String str4, @Query("sz") String str5);

    @GET("priapi/v5/market/books")
    AbstractC58185ywX<ResponseData<List<MarketBooksData>>> getMarketBooks(@NotNull @Query("instId") String str, @Query("sz") String str2);

    @GET("priapi/v5/market/call-auction-details")
    AbstractC58185ywX<ResponseData<List<CallAuctionInfoData>>> getMarketCallAuctionDetails(@NotNull @Query("instId") String str);

    @GET("priapi/v5/market/candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getMarketCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4);

    @GET("priapi/v5/market/candles")
    Object getMarketCandlesSuspend(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    @GET("priapi/v5/market/index-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getMarketIndexCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4);

    @GET("/priapi/v2/financial/market-lending-history")
    AbstractC58185ywX<ResponseData<MarketLendingHistory>> getMarketLedingHistory(@Query("currencyId") Integer num, @Query("pageIndex") Integer num2, @Query("pageSize") Integer num3);

    @GET("/priapi/v2/financial/market-lending-info")
    AbstractC58185ywX<ResponseData<MarketLendingInfo>> getMarketLedingInfo(@Query("currencyId") Integer num, @Query("pageIndex") Integer num2, @Query("pageSize") Integer num3);

    @GET("priapi/v5/market/mark-price-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getMarketMarkPriceCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query("limit") String str3);

    @GET("priapi/v5/market/mark-price-candles")
    Object getMarketMarkPriceCandlesSuspend(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query("limit") String str3, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    @GET("/priapi/v5/ecotrade/public/marketplace/bullet-chat-list")
    AbstractC58185ywX<ResponseData<ArrayList<RecommendBulletMPData>>> getMarketPlaceRecommend();

    @GET("priapi/v5/market/ticker")
    AbstractC58185ywX<ResponseData<List<TickersData>>> getMarketTickerByInstId(@NotNull @Query("instId") String str);

    @GET("priapi/v5/market/ticker")
    AbstractC58185ywX<ResponseData<List<OuterTickersData>>> getMarketTickerByInstIdForOuter(@NotNull @Query("instId") String str);

    @GET("priapi/v5/market/tickers")
    AbstractC58185ywX<ResponseData<List<TickersData>>> getMarketTickers(@NotNull @Query("instType") String str, @Query("instFamily") String str2);

    @GET("api/v5/market/trades")
    AbstractC58185ywX<ResponseData<List<BizTradeData>>> getMarketTrades(@NotNull @Query("instId") String str, @Query("limit") String str2);

    @GET("priapi/v5/account/max-available")
    AbstractC58185ywX<ResponseData<List<MaxAvailableResp>>> getMaxAvailable(@Query("excludeOrderId") String str, @Query("excludeAlgoId") String str2, @NotNull @Query("instId") String str3, @Query("ccy") String str4, @Query("px") String str5, @NotNull @Query("tdMode") String str6, @Query("reduceOnly") Boolean bool, @Query(OtcExtraKeys.SIDE) String str7, @Query("posMode") String str8, @Query("needTransfer") String str9, @Query("sz") String str10, @Query("ordType") String str11, @Query("tgtCcy") String str12, @Query("quickMgnType") String str13, @Query("unSpotOffset") Boolean bool2, @Query("buySz") String str14, @Query("sellSz") String str15, @Query("baseOnPositionDebt") Boolean bool3, @NotNull @Query("needQueryAssetAndEarn") String str16, @Query("tradeQuoteCcy") String str17);

    @GET("priapi/v5/account/max-withdrawal")
    AbstractC58185ywX<ResponseData<List<MaxWithdrawalData>>> getMaxWithdrawal(@Query("ccy") String str);

    @GET("/priapi/v5/algo/public/grid-min-investment")
    AbstractC58185ywX<ResponseData<List<MinInvestResp>>> getMinInvestment(@Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str, @NotNull @Query("instId") String str2, @Query("gridNum") String str3, @Query("maxPx") String str4, @NotNull @Query("minPx") String str5, @Query("runType") int i, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str6, @Query("basePos") Boolean bool, @Query("investmentData") String str7, @Query("perGridProfitRatio") String str8, @Query("sourceAlgoId") String str9, @Query("trailingUpStopPx") String str10, @Query("trailingDownStopPx") String str11, @Query("triggerStrategy") String str12, @Query("sourceCcy") String str13, @Query("autoReserve") Boolean bool2, @Query("triggerPx") String str14, @Query("contractGridVersion") String str15);

    @POST("/priapi/v5/algo/grid/edit-strategy/min-topup")
    AbstractC58185ywX<ResponseData<List<MinTopUpResp>>> getMinTopUp(@Body @NotNull SpotGridEditParamReq spotGridEditParamReq);

    @GET("/priapi/v5/algo/marketplace/strategy-info")
    AbstractC58185ywX<ResponseData<List<MpStgyInfo>>> getMpStgyInfo(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/trade/multi-insts-min-amount")
    AbstractC58185ywX<ResponseData<List<MultiMinAmountItem>>> getMultiInstsMinAmount(@Query("instIds") List<String> list, @Query("instId") String str, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str2, @Query("ordType") String str3, @Query("leveragePrincipal") String str4, @Query("subArbTypes") List<String> list2, @Query("spreadRatio") String str5);

    @GET("/priapi/v5/account/derivative-config")
    AbstractC58185ywX<ResponseData<List<DeriConfigData>>> getNavType();

    @GET("/priapi/v5/rubik/newbie/user-states")
    AbstractC58185ywX<ResponseData<List<NewBieUserState>>> getNewBieUserState();

    @GET("/priapi/v5/algo/public/new-strategy-type")
    AbstractC58185ywX<ResponseData<List<BotCategoryConfig>>> getNewBotCategory();

    @GET("priapi/v5/rubik/public/main-coins")
    AbstractC58185ywX<ResponseData<List<IndexTickersData>>> getNewIndexTickers(@Query("type") String str, @Query("quoteCcy") String str2, @Query("instId") String str3, @Query("num") String str4);

    @GET("/priapi/v5/public/non-pm-tier")
    AbstractC58185ywX<ResponseData<List<PmTierRes>>> getNonPmTier(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/rubik/public/notable-market-changes")
    AbstractC58185ywX<ResponseData<ArrayList<MovementBean>>> getNotableMarketChange(@QueryMap @NotNull HashMap<String, String> map);

    @GET("/priapi/v5/public/trade/notice")
    AbstractC58185ywX<ResponseData<ArrayList<NoticeData>>> getNoticeInfo(@NotNull @Query("instType") String str, @Query("instId") String str2);

    @GET("priapi/v5/public/app/offline-plan")
    AbstractC58185ywX<ResponseData<List<OfflinePlan>>> getOfflinePlan(@NotNull @Query("instId") String str, @NotNull @Query("bizType") String str2);

    @GET("/priapi/v5/ecotrade/public/marketplace/recommend-list")
    AbstractC58185ywX<ResponseData<ArrayList<BotToMPRecommend>>> getOngoingRecommend();

    @GET("priapi/v5/public/open-interest")
    AbstractC58185ywX<ResponseData<List<OpenInterestData>>> getOpenInterest(@NotNull @Query("instType") String str, @Query("instId") String str2, @Query("instFamily") String str3);

    @GET("priapi/v5/public/opt-summary")
    AbstractC58185ywX<ResponseData<List<OptSummaryData>>> getOptSummary(@NotNull @Query("instFamily") String str, @Query("expTime") String str2);

    @GET("/priapi/v5/rubik/newbie/cooling-info")
    AbstractC58185ywX<ResponseData<ArrayList<OptionCoolState>>> getOptionCoolConfig();

    @POST("/priapi/v5/account/calculate-pnl")
    AbstractC58185ywX<ResponseData<List<OptionPnlResp>>> getOptionRFQPnlChartData(@Body @NotNull OptionPnlReq optionPnlReq);

    @GET("/priapi/v5/public/simple-options/get-recommended-products")
    AbstractC58185ywX<ResponseData<List<SimpleOptionProduct>>> getOptionRecommendProducts(@NotNull @Query("instFamily") String str);

    @GET("/priapi/v5/options-square/asset-info")
    AbstractC58185ywX<ResponseData<List<OptionSquareAssetInfoResponse>>> getOptionSquareAssetInfo();

    @GET("priapi/v5/public/trade/volume")
    AbstractC58185ywX<ResponseData<List<VolumeData>>> getOptionTradeVolume(@Query("instFamily") String str);

    @GET("/priapi/v5/account/avail-info")
    AbstractC58185ywX<ResponseData<List<OptionsAvailBalance>>> getOptionsAvailBalance(@NotNull @Query("instId") String str, @Query("px") String str2, @NotNull @Query("ccy") String str3);

    @GET("/priapi/v5/trade/simple/inquiry")
    AbstractC58185ywX<ResponseData<List<OptionsDiscoveryEstCostBean>>> getOptionsDiscoveryEstCost(@Query("instId") String str, @Query(OtcExtraKeys.SIDE) String str2, @Query("px") String str3, @Query("sz") String str4);

    @GET("priapi/v5/options-square/positions-count")
    AbstractC58185ywX<ResponseData<List<OptionsSquarePositionsCountResp>>> getOptionsSquarePositionsCount();

    @GET("/priapi/v5/trade/order")
    Object getOrderDetail(@NotNull @Query("instId") String str, @Query("ordId") String str2, @Query("clOrdId") String str3, @NotNull Continuation<? super ResponseData<List<TradeOrderData>>> continuation);

    @POST("/v2/support/entrust/download")
    Object getOrderDownloadInfo(@Body @NotNull DownLoadRequest downLoadRequest, @NotNull Continuation<? super ResponseData<String>> continuation);

    @GET("priapi/v5/public/liquidation-orders")
    AbstractC58185ywX<ResponseData<List<OrderForceData>>> getOrderForce(@Query("instType") String str, @Query("ccy") String str2, @Query("mgnMode") String str3, @Query("instId") String str4, @Query("instFamily") String str5, @Query(MTPushConstants.Operation.KEY_ALIAS) String str6, @Query("state") String str7, @Query(TtmlNode.RUBY_AFTER) String str8, @Query("limit") String str9);

    @GET("priapi/v5/trade/order-force-details")
    AbstractC58185ywX<ResponseData<List<OrderForceDetails>>> getOrderForceDetail(@Query("ordId") String str);

    @GET("priapi/v5/dex/cefi/v2/trade/orders-algo-pending")
    AbstractC58185ywX<ResponseData<List<TradeStrategyOrderData>>> getOrdersAlgoDexPending(@Query("ordType") String str, @Query("tokenAddress") String str2, @Query("chainIndex") String str3, @Query("limit") String str4, @Header("x-cedefi-tag") @NotNull String str5);

    @GET("/priapi/v5/account/private-summary")
    AbstractC58185ywX<ResponseData<List<OrderPositions>>> getOrdersAndPositions();

    @GET("priapi/v5/dex/cefi/v2/trade/orders-pending")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getOrdersDexPending(@Query("ordType") String str, @Query("instType") String str2, @Query("instId") String str3, @Query("tokenAddress") String str4, @Query("chainIndex") String str5, @Query("limit") String str6, @Header("x-cedefi-tag") @NotNull String str7);

    @GET("priapi/v5/dex/cefi/v2/trade/orders-pending-all")
    AbstractC58185ywX<ResponseData<List<AllOrderDataInfo>>> getOrdersDexPendingAll(@Query("instType") String str, @Query("instId") String str2, @Query("tokenAddress") String str3, @Query("chainIndex") String str4, @Query("limit") String str5, @Header("x-cedefi-tag") @NotNull String str6);

    @GET("priapi/v5/trade/orders-pending")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getPendingOrderByOrdId(@Query("ordId") String str, @Query("ordType") String str2);

    @GET("/priapi/v5/trade/orders-pending-algo")
    AbstractC58185ywX<ResponseData<ArrayList<OrdersPendingQueryVO>>> getPendingOrders(@Query("instTypes") String str);

    @GET("priapi/v5/trade/orders-pending")
    AbstractC58185ywX<ResponseData<List<TradeOrderData>>> getPendingOrders(@Query("instType") String str, @Query("instFamily") String str2, @Query("instId") String str3, @Query("ordType") String str4, @Query("state") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @NotNull @Query("limit") String str7, @Query("_start") String str8, @Query("_end") String str9, @Query("_posOrSide") String str10, @Query("_instDirection") String str11, @Query("_tdMode") String str12);

    @GET("/priapi/v5/algo/trade/order-pending")
    AbstractC58185ywX<ResponseData<List<StrategyPendingListResp>>> getPendingStrategyOrderById(@Query("algoId") String str, @Query("ordType") String str2);

    @GET("/priapi/v5/algo/trade/order-pending")
    AbstractC58185ywX<ResponseData<List<StrategyPendingListResp>>> getPendingStrategyOrderList(@Query("algoId") String str, @Query("instType") String str2, @Query("instId") String str3, @Query(TtmlNode.RUBY_AFTER) String str4, @Query(TtmlNode.RUBY_BEFORE) String str5, @Query("limit") String str6, @Query(TtmlNode.START) String str7, @Query(TtmlNode.END) String str8, @Query("tdMode") String str9, @Query("instDirection") String str10, @Query("posOrSide") String str11, @Query("referName") String str12, @Query("sortType") String str13, @Query("source") String str14, @Query("ordType") String str15, @Query("arbType") String str16, @Query("requireProfits") Boolean bool, @Query("withSortedList") String str17, @Query("systemSource") String str18, @Query("nmpUnderlyingIds") String str19, @Query("baseCoins") String str20, @Query("sortOrder") String str21);

    @GET("/priapi/v5/public/pm-tier")
    AbstractC58185ywX<ResponseData<List<PmTierRes>>> getPmTier(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/algo/public/smart-portfolio/weights")
    AbstractC58185ywX<ResponseData<List<PortfolioData>>> getPortfolioWeight(@NotNull @Query("ccy") String str, @NotNull @Query("quoteCcy") String str2);

    @GET("/priapi/v5/account/positions-attach-algo")
    AbstractC58185ywX<ResponseData<List<PosAttachAlgoData>>> getPositionAttachAlgo(@NotNull @Query("instId") String str, @NotNull @Query("tdMode") String str2, @NotNull @Query("posSide") String str3, @NotNull @Query("pos") String str4, @NotNull @Query("posId") String str5, @NotNull @Query("type") String str6, @NotNull @Query("sortType") String str7, @Query("limit") String str8, @Query("curPage") String str9);

    @GET("/priapi/v5/account/position")
    AbstractC58185ywX<ResponseData<List<TradePositionData>>> getPositionByAlgoId(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/trade/positions-history")
    AbstractC58185ywX<ResponseData<List<StrategyPositionResponse>>> getPositionsHistory(@NotNull @Query("algoId") String str, @NotNull @Query("page") String str2, @NotNull @Query("limit") String str3);

    @GET("priapi/v5/account/app/positions")
    AbstractC58185ywX<ResponseData<List<TradePositionInfo>>> getPositionsList(@Query("instType") String str, @Query("instId") String str2, @Query("aggregate") Boolean bool);

    @GET("priapi/v5/account/app/positions")
    Object getPositionsListSuspend(@Query("instType") String str, @Query("instId") String str2, @Query("aggregate") Boolean bool, @NotNull Continuation<? super ResponseData<List<TradePositionInfo>>> continuation);

    @GET("priapi/v5/public/pre-quote/details")
    AbstractC58185ywX<ResponseData<List<PreQuoteInfoData>>> getPreQuoteDetails(@NotNull @Query("instId") String str);

    @GET("/priapi/v1/sfp/lvf/trades/count")
    AbstractC58185ywX<ResponseData<PriceLockOrders>> getPriceLockOrderCount();

    @GET("/priapi/v1/sfp/lvf/config/currency")
    AbstractC58185ywX<ResponseData<CurrencyConfigResp>> getPriceLockerCurrencyConfig();

    @POST("/priapi/v1/sfp/lvf/config/trade-size")
    AbstractC58185ywX<ResponseData<TradeSizeConfigResp>> getPriceLockerSizeConfig(@Body @NotNull ConfigReq configReq);

    @POST("/priapi/v1/sfp/lvf/config/strike")
    AbstractC58185ywX<ResponseData<StrikeConfigResp>> getPriceLockerStrikeConfig(@Body @NotNull ConfigReq configReq);

    @GET("/priapi/v1/sfp/lvf/config/currency/pair")
    AbstractC58185ywX<ResponseData<SupportCurrencyPair>> getPriceLockerSupportCurrency();

    @GET("/priapi/v5/algo/trade/profit-list")
    AbstractC58185ywX<ResponseData<List<StrategyProfitResponse>>> getProfitChangeList(@NotNull @Query("algoId") String str);

    @GET("priapi/v5/rfq/rfqs")
    AbstractC58185ywX<ResponseData<List<RFQSData>>> getRFQs(@NotNull @Query("rfqId") String str);

    @GET("/priapi/v5/ecotrade/marketplace/recommend-param")
    AbstractC58185ywX<ResponseData<List<RecommendedParamsDto>>> getRecommendedParam(@Query("batchNo") String str, @NotNull @Query("instId") String str2, @NotNull @Query("algoOrdType") String str3);

    @GET("/priapi/v5/algo/trade/dcd/recommended-param")
    AbstractC58185ywX<ResponseData<List<DcdRecommendedParams>>> getRecommendedParam(@NotNull @Query("aiParamType") String str, @NotNull @Query("currencyId") String str2, @NotNull @Query("altCurrencyId") String str3, @NotNull @Query("dcdOptionType") String str4, @NotNull @Query("strike") String str5, @NotNull @Query("strikePercentage") String str6, @NotNull @Query("minAnnualYieldPercentage") String str7, @NotNull @Query("maxSettlementDay") String str8);

    @GET("priapi/v5/public/risk-bills")
    AbstractC58185ywX<ResponseData<List<RiskBillsData>>> getRiskBills(@Query("instFamily") String str, @Query("ccy") String str2, @Query("type") String str3, @NotNull @Query("instType") String str4, @Query(TtmlNode.RUBY_AFTER) String str5, @Query("limit") String str6);

    @GET("/priapi/v5/public/risk-currencies")
    Object getRiskCurrencies(@NotNull Continuation<? super ResponseData<List<String>>> continuation);

    @GET("priapi/v5/public/risk-total")
    AbstractC58185ywX<ResponseData<List<RickTotalData>>> getRiskTotal();

    @GET("priapi/v5/public/risk-trend")
    AbstractC58185ywX<ResponseData<List<RiskTrendData>>> getRiskTrend(@Query("instFamily") String str, @NotNull @Query(MTPushConstants.NotificationTime.KEY_DAYS) String str2, @Query("ccy") String str3, @NotNull @Query("instType") String str4, @Query("isNew") boolean z);

    @GET("priapi/v5/rubik/coin/income")
    AbstractC58185ywX<ResponseData<List<AssetsRubikIncome>>> getRubikCoinIncome();

    @GET("/priapi/v5/ecotrade/marketplace/sector-underlying-list")
    AbstractC58185ywX<ResponseData<List<BotSectorUnderlyingListBean>>> getSectorUnderlyingList();

    @POST("/priapi/v1/sfp/lvf/product/expiry-time")
    AbstractC58185ywX<ResponseData<SettleDateResp>> getSettleDateList(@Body @NotNull SettleDateReq settleDateReq);

    @GET("/priapi/v5/rubik/public/sharing/get-all-image-list")
    Object getShareImageList(@Query("vipType") String str, @Query("profitType") String str2, @Query("trendType") String str3, @NotNull Continuation<? super ResponseData<List<TradeShareBackgroundData>>> continuation);

    @GET("/priapi/v5/algo/marketplace/public/signal-customer/signal-details")
    AbstractC58185ywX<ResponseData<List<SignalDetails>>> getSignalBotDetails(@NotNull @Query("signalChanId") String str);

    @GET("/priapi/v5/copytrade/sgl-clone/get-param")
    AbstractC58185ywX<ResponseData<List<SignalCloneInfo>>> getSignalCloneParamsById(@NotNull @Query("signalId") String str);

    @GET("priapi/v5/rubik/signal/clone")
    AbstractC58185ywX<ResponseData<SignalCloneUrl>> getSignalCloneShortLink(@NotNull @Query("instId") String str, @NotNull @Query(MetricsSQLiteCacheKt.METRICS_PARAMS) String str2);

    @GET("/priapi/v5/algo/trade/signal/history-events")
    AbstractC58185ywX<ResponseData<List<SignalEventDetail>>> getSignalHistoryEvent(@NotNull @Query("algoId") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query("limit") String str3);

    @GET("/priapi/v5/algo/public/signal/ai-param")
    AbstractC58185ywX<ResponseData<List<SignalProfits>>> getSignalProfits(@NotNull @Query("signalChanId") String str, @NotNull @Query("duration") String str2, @NotNull @Query("page") String str3, @NotNull @Query("limit") String str4);

    @GET("/priapi/v5/algo/marketplace/public/signal-provider/signals")
    AbstractC58185ywX<ResponseData<List<SignalBotSubsInfoListBean>>> getSignalProviderPersonalSignals(@NotNull @Query("traderUniqueName") String str, @NotNull @Query("page") String str2, @NotNull @Query("pageSize") String str3, @NotNull @Query("type") String str4);

    @GET("/priapi/v5/algo/marketplace/signal-provider/signals")
    AbstractC58185ywX<ResponseData<List<SignalBotSignalListBean>>> getSignalProviderSignals(@NotNull @Query("type") String str, @NotNull @Query("page") String str2, @NotNull @Query("pageSize") String str3);

    @GET("/priapi/v5/algo/public/trigger/details")
    AbstractC58185ywX<ResponseData<List<SignalTriggerDetails>>> getSignalTriggerDetails(@NotNull @Query("signalChanId") String str, @NotNull @Query("page") String str2, @NotNull @Query("limit") String str3);

    @GET("/priapi/v5/public/simple/getProducts")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<SimpleProducts>>>> getSimPleProducts(@NotNull @Query("uly") String str, @NotNull @Query("opType") String str2, @NotNull @Query("expiry") String str3);

    @GET("priapi/v5/public/simpleProduct")
    AbstractC58185ywX<ResponseData<List<InstrumentInfo>>> getSimpleInstrumentsInfo(@NotNull @Query("instType") String str, @Query("includeType") int i);

    @GET("/priapi/v5/public/simple/getNotes")
    AbstractC58185ywX<ResponseData<ArrayList<SimpleNotes>>> getSimpleNotes(@NotNull @Query("uly") String str);

    @GET("priapi/v5/simple-options/preview-close")
    AbstractC58185ywX<ResponseData<List<SimpleOptionPreviewCloseResponse>>> getSimpleOptionPreviewClose(@NotNull @Query("instId") String str, @NotNull @Query("clRefId") String str2, @NotNull @Query("sz") String str3);

    @GET("priapi/v5/simple-options/preview-order")
    AbstractC58185ywX<ResponseData<List<SimpleOptionPreviewOrderResponse>>> getSimpleOptionPreviewOrder(@NotNull @Query("instId") String str, @NotNull @Query("sz") String str2, @NotNull @Query("targetPrice") String str3);

    @GET("priapi/v5/simple-options/history-positions")
    AbstractC58185ywX<ResponseData<List<SimpleOptionsPositionVo>>> getSimpleOptionsHistoryPositions();

    @GET("priapi/v5/simple-options/positions")
    AbstractC58185ywX<ResponseData<List<SimpleOptionsPositionVo>>> getSimpleOptionsPositions();

    @GET("/priapi/v5/user/small-coin-list")
    AbstractC58185ywX<ResponseData<List<DebtCanWithdrawBean>>> getSmallCoinList(@Query("ccy") String str);

    @GET("/priapi/v5/algo/trade/arbitrage/order-detail")
    AbstractC58185ywX<ResponseData<List<SmartArbListItem>>> getSmartArbHisOrderDetail(@NotNull @Query("algoId") String str, @NotNull @Query("groupId") String str2);

    @GET("/priapi/v5/algo/trade/arbitrage/history-order")
    AbstractC58185ywX<ResponseData<List<SmartArbHisOrderItem>>> getSmartArbHistoryOrder(@NotNull @Query("algoId") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query(TtmlNode.RUBY_BEFORE) String str3, @Query("limit") String str4);

    @GET("/priapi/v5/algo/public/trade/arbitrage/info")
    AbstractC58185ywX<ResponseData<List<ArbInvestDetailsBean>>> getSmartArbInvestDetails(@NotNull @Query("instFamily") String str, @NotNull @Query("arbType") String str2, @Query("totalAmt") String str3, @Query("leveragePrincipal") String str4, @Query("spreadRatio") String str5, @Query("algoId") String str6, @Query("queryScene") String str7);

    @GET("/priapi/v5/algo/public/trade/arbitrage/info")
    AbstractC58185ywX<ResponseData<List<ArbitrageInfoResponse>>> getSmartArbInvestDetailsRefactor(@NotNull @Query("instFamily") String str, @NotNull @Query("arbType") String str2, @Query("totalAmt") String str3, @Query("leveragePrincipal") String str4, @Query("spreadRatio") String str5, @Query("algoId") String str6, @Query("queryScene") String str7, @Query("subArbTypes") SubArbitrageType4Remote subArbitrageType4Remote, @Query("stopType") String str8);

    @GET("/priapi/v5/algo/spot-dca/trade-list")
    AbstractC58185ywX<ResponseData<List<DcaTradeListResponse>>> getSpotDcaTradeList(@NotNull @Query("algoId") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query(TtmlNode.RUBY_BEFORE) String str3, @Query("limit") String str4);

    @GET("/priapi/v5/account/spotinuse-amt")
    AbstractC58185ywX<ResponseData<List<SpotInUseAmtResp>>> getSpotInUseAmt(@NotNull @Query("ccy") String str);

    @POST("priapi/v5/account/spot-manual-borrow-repay")
    AbstractC58185ywX<ResponseData<List<SpotManualBorrowRepayResp>>> getSpotManualBorrowRepay(@Body @NotNull SpotManualBorrowRepayReq spotManualBorrowRepayReq);

    @GET("priapi/v5/account/spot-manual-borrow-repay-pre-check")
    AbstractC58185ywX<ResponseData<List<SimpleModePreCheckResp>>> getSpotPreCheckInfo(@NotNull @Query("ccy") String str, @Query("amt") String str2, @NotNull @Query(OtcExtraKeys.SIDE) String str3);

    @GET("/priapi/v5/rubik/app/public/spread-arbitrage")
    AbstractC58185ywX<ResponseData<List<SpreadArbitrageData>>> getSpreadArbitrage(@NotNull @Query("ctType") String str, @NotNull @Query("ccyType") String str2, @NotNull @Query("arbitrageType") String str3);

    @GET("/priapi/v5/rubik/app/public/arbitrage-detail")
    AbstractC58185ywX<ResponseData<List<SpreadArbitrageData>>> getSpreadArbitrageDetail(@NotNull @Query("arbitrageId") String str, @NotNull @Query("portfolioType") String str2);

    @POST("/priapi/v5/rubik/public/spread-trend")
    AbstractC58185ywX<ResponseData<List<SpreadTrendWithDayBean>>> getSpreadTrendWithDay(@Body @NotNull SpreadTrendWithDayBody spreadTrendWithDayBody);

    @GET("/v2/asset/balance/twoCurrencyRatio")
    AbstractC58185ywX<ResponseData<StableCoinProfitRatio>> getStableCoinProfitRatio(@Query("dividEndCurrencyName") String str, @Query("divisorCurrencyName") String str2);

    @GET("/priapi/v5/public/instruments/stable/priceAlert")
    AbstractC58185ywX<ResponseData<ArrayList<StableInstrumentInfo>>> getStableInstrumentInfo();

    @GET("/priapi/v5/algo/marketplace/source-strategy-info")
    AbstractC58185ywX<ResponseData<List<StgySourceInfo>>> getStgySourceInfo(@NotNull @Query("sourceAlgoId") String str);

    @GET("/priapi/v5/algo/public/config")
    AbstractC58185ywX<ResponseData<List<StrategyConfigInfo>>> getStrategyConfig(@NotNull @Query("strategyType") String str, @NotNull @Query("instId") String str2, @Query("tradeQuoteCcy") String str3, @Query("coinNames") String str4);

    @GET("/priapi/v5/algo/trade/info")
    AbstractC58185ywX<ResponseData<List<StrategyDetailsResponse>>> getStrategyDetails(@NotNull @Query("algoId") String str);

    @GET("priapi/v5/trade/orders-algo-history")
    AbstractC58185ywX<ResponseData<List<TradeStrategyOrderData>>> getStrategyHistoryOrders(@Query("state") String str, @Query("ordType") String str2, @Query("limit") String str3, @Query("instType") String str4, @Query("instId") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @Query("_feReq") Boolean bool, @Query("_start") String str7, @Query("_end") String str8, @Query("_posOrSide") String str9, @Query("_instDirection") String str10, @Query("_tdMode") String str11, @Query("_sortType") String str12);

    @GET("/priapi/v5/algo/marketplace/homepage-public-info")
    AbstractC58185ywX<ResponseData<List<StrategyHomePagePublicInfoData>>> getStrategyHomePagePublicInfo();

    @GET("priapi/v5/trade/orders-algo-pending")
    AbstractC58185ywX<ResponseData<List<TradeStrategyOrderData>>> getStrategyPendingOrders(@Query("state") String str, @Query("ordType") String str2, @Query("limit") String str3, @Query("instType") String str4, @Query("instId") String str5, @Query(TtmlNode.RUBY_AFTER) String str6, @Query("_feReq") Boolean bool, @Query("_start") String str7, @Query("_end") String str8, @Query("_posOrSide") String str9, @Query("_instDirection") String str10, @Query("_tdMode") String str11);

    @GET("/priapi/v5/algo/trade/positions")
    AbstractC58185ywX<ResponseData<List<StrategyPositionResponse>>> getStrategyPositions(@NotNull @Query("algoId") String str, @Query("ordType") String str2, @Query("instIds") String str3);

    @GET("/priapi/v5/algo/trade/trade-list")
    AbstractC58185ywX<ResponseData<List<StrategyOrderBillDetailsResponse>>> getStrategyTradeBill(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/algo/trade/private-summary")
    AbstractC58185ywX<ResponseData<List<StrtagyOrders>>> getStrtegyOrders();

    @GET("/priapi/v5/account/vipAccount/loanAlloc/pageInfo")
    AbstractC58185ywX<ResponseData<List<SubAccountLimitRateRespData>>> getSubAccountLimitRateList(@Query("subLoginName") String str, @Query("pageNo") String str2, @Query("pageSize") String str3);

    @GET("/priapi/v5/account/subAccount/interest-limits")
    AbstractC58185ywX<ResponseData<List<InterestLimitData>>> getSubInterestLimits(@Query("ccy") String str, @Query("subAcct") String str2);

    @GET("/priapi/v5/account/amtPrice-white-config")
    AbstractC58185ywX<ResponseData<List<SupportMultiplePriceResponse>>> getSupportMultiplePriceType();

    @GET("/priapi/v5/algo/public/info")
    AbstractC58185ywX<ResponseData<List<StrategySupport>>> getSupportStrategyInfo();

    @GET("/priapi/v5/public/simple-options/supported-underlying")
    AbstractC58185ywX<ResponseData<ArrayList<SupportedSimpleOption>>> getSupportedSimpleOption();

    @GET("priapi/v5/public/time")
    AbstractC58185ywX<ResponseData<List<SystemTimeData>>> getSystemTime();

    @GET("priapi/v5/public/time")
    Object getSystemTimeSuspend(@NotNull Continuation<? super ResponseData<List<SystemTimeData>>> continuation);

    @POST("/v2/support/bill/newDownload")
    Object getTPFDownloadInfo(@Body @NotNull DownLoadRequest downLoadRequest, @NotNull Continuation<? super ResponseData<String>> continuation);

    @GET("/priapi/v5/public/tier")
    AbstractC58185ywX<ResponseData<List<UserTierData>>> getTier(@NotNull @Query("instType") String str, @Query("instId") String str2, @Query("ccy") String str3, @Query("instFamily") String str4, @Query("tier") String str5);

    @GET("priapi/v5/rubik/public/trade-behavior")
    AbstractC58185ywX<ResponseData<TradeBehaviorBean>> getTradeBehavior();

    @GET("priapi/v5/public/coins")
    AbstractC58185ywX<ResponseData<ArrayList<TradeCoinInfo>>> getTradeCoins();

    @GET("priapi/v5/public/config")
    AbstractC58185ywX<ResponseData<List<TradeConfigData>>> getTradeConfig(@NotNull @Query("instType") String str);

    @GET("priapi/v5/account/trade-fee")
    AbstractC58185ywX<ResponseData<List<TradeFeeInfo>>> getTradeFee(@Query("instId") String str, @NotNull @Query("instType") String str2, @Query("instFamily") String str3);

    @GET("priapi/v5/trade/fills")
    AbstractC58185ywX<ResponseData<List<TradeFillsData>>> getTradeFill(@Query("instType") String str, @Query("instFamily") String str2, @Query("instId") String str3, @Query("ordId") String str4, @Query(TtmlNode.RUBY_AFTER) String str5, @Query("limit") String str6, @Query("bizRefType") String str7);

    @GET("/priapi/v5/account/greeks")
    AbstractC58185ywX<ResponseData<List<TradeGreeksData>>> getTradeGreeksList(@Query("ccy") String str);

    @GET("priapi/v5/account/config-trade-info")
    AbstractC58185ywX<ResponseData<ArrayList<AccountTradeConfig>>> getTradeInfoAndConfig();

    @GET("/priapi/v5/algo/trade/trade-list")
    AbstractC58185ywX<ResponseData<List<StrategyOrderBillDetailsResponse>>> getTradeList(@NotNull @Query("algoId") String str, @NotNull @Query("type") String str2, @Query("instId") String str3, @Query(TtmlNode.RUBY_AFTER) String str4, @Query("afterTime") String str5, @Query("beforeTime") String str6, @Query("limit") String str7);

    @GET("/priapi/v5/public/trading-rules/list-info")
    AbstractC58185ywX<ResponseData<List<TradingRuleListInfo>>> getTradingRulesListInfo(@NotNull @Query("instId") String str);

    @GET("priapi/v5/account/query-active-level")
    AbstractC58185ywX<ResponseData<ArrayList<AccountLevelData>>> getUsefulActivate();

    @GET("/priapi/v5/account/user-debt-detail")
    AbstractC58185ywX<ResponseData<List<SimpleModeRepayDetailResp>>> getUserDebtDetail(@Query("debtCcy") String str);

    @POST("/priapi/v5/user/guide")
    AbstractC58185ywX<ResponseData<List<UserGuideBean>>> getUserGuide(@Body @NotNull UserGuide userGuide);

    @GET("priapi/v5/user/tier")
    AbstractC58185ywX<ResponseData<List<UserTierData>>> getUserTier(@NotNull @Query("instType") String str, @NotNull @Query("mgnMode") String str2, @Query("instId") String str3, @Query("ccy") String str4, @Query("instFamily") String str5);

    @GET("/v2/support/demoTrading/userTradeInfo")
    AbstractC58185ywX<ResponseData<UserTradeInfo>> getUserTradeInfo();

    @GET("priapi/v5/public/borrow-priority-coin")
    AbstractC58185ywX<ResponseData<List<String>>> getVipBorrowCcy();

    @GET("/priapi/v5/account/vipLoan/interest-accrued")
    AbstractC58185ywX<ResponseData<List<InterestAccruedData>>> getVipInterestAccrued(@Query("ccy") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query(TtmlNode.RUBY_BEFORE) String str3, @Query("_start") String str4, @Query("_end") String str5, @Query("limit") String str6);

    @GET("/priapi/v5/account/vipLoan/interest-deducted")
    AbstractC58185ywX<ResponseData<List<InterestDeductedData>>> getVipInterestDeducted(@Query("ccy") String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query(TtmlNode.RUBY_BEFORE) String str3, @Query("_start") String str4, @Query("_end") String str5, @Query("limit") String str6);

    @GET("priapi/v5/public/vip-interest-rate-loan-quota")
    AbstractC58185ywX<ResponseData<ArrayList<VipInterest>>> getVipInterestRateLoanQuote(@Query("coinId") String str, @Query(FirebaseAnalytics.Param.LEVEL) String str2);

    @GET("priapi/v5/public/priority-currency")
    AbstractC58185ywX<ResponseData<ArrayList<VipLendingToken>>> getVipLendingToken();

    @GET("/priapi/v5/account/vipAccount/loanAlloc/switchGet")
    AbstractC58185ywX<ResponseData<List<VipLoanLimitSwitchData>>> getVipLimitSwitchGet();

    @GET("priapi/v5/users/favorite/all")
    AbstractC58185ywX<ResponseData<List<WatchListData>>> getWatchListFavorite(@Query("shouldRemoveMargin") boolean z);

    @GET("priapi/v5/asset/withdrawal-history")
    AbstractC58185ywX<ResponseData<List<AssetWithdrawalHistoryData>>> getWithdrawalHistory(@Query("ccy") String str, @Query("state") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4);

    @POST("/priapi/v5/algo/trade/order-instant-trigger")
    AbstractC58185ywX<ResponseData<List<GridTriggerResp>>> gridInstantTrigger(@Body @NotNull GridInstantTriggerReq gridInstantTriggerReq);

    @GET("/priapi/v5/public/history-positions/delay")
    AbstractC58185ywX<ResponseData<List<HistoryPositionDelay>>> historyPosDelay();

    @GET("priapi/v5/trade/order-all/orders-history-app")
    AbstractC58185ywX<ResponseData<List<AllOrderDataInfo>>> loadAllHistoryOrders(@Query("instType") String str, @Query("instId") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @NotNull @Query("limit") String str4, @Query("begin") String str5, @Query(TtmlNode.END) String str6, @Query("hideCanceled") Boolean bool, @Query("archive") Boolean bool2, @Query("orderId") String str7, @Query("_sortType") String str8, @Query("aggregate") Boolean bool3);

    @GET("priapi/v5/trade/orders-pending-all")
    AbstractC58185ywX<ResponseData<List<AllOrderDataInfo>>> loadAllPendingOpenOrders(@Query("instType") String str, @Query("instId") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @NotNull @Query("limit") String str4);

    @GET("priapi/v5/account/bestLeverageMargin")
    AbstractC58185ywX<ResponseData<ArrayList<BaseLeverageMarginInfo>>> loadBestLeverageMargin(@NotNull @Query("instId") String str, @Query("px") String str2, @NotNull @Query("tdMode") String str3, @Query("ccy") String str4, @Query("reduceOnly") Boolean bool, @NotNull @Query(OtcExtraKeys.SIDE) String str5, @NotNull @Query("ordType") String str6, @Query("sz") String str7, @Query("tradeQuoteCcy") String str8);

    @GET("/priapi/v5/algo/marketplace/lead-trader/summary")
    AbstractC58185ywX<ResponseData<List<BotLeadProfitSummaryModel>>> loadBotLeadProfitSummary();

    @GET("/priapi/v5/algo/marketplace/profit-sharing/orders-details/users")
    AbstractC58185ywX<ResponseData<List<BotLeadProfitProfitDetails>>> loadBotProfitDetails(@NotNull @Query("algoId") String str, @NotNull @Query("page") String str2, @NotNull @Query("pageSize") String str3);

    @GET("/priapi/v5/algo/marketplace/lead-trader/profit-sharing/orders-details")
    AbstractC58185ywX<ResponseData<List<BotLeadProfitProfitOrderDetails>>> loadBotProfitOrdersDetails(@NotNull @Query("algoId") String str);

    @GET("/priapi/v5/algo/marketplace/lead-trader/profit-sharing/orders-history")
    AbstractC58185ywX<ResponseData<List<BotLeadUserOrderHistorySummaryModel>>> loadBotTraderOrderHistorySefl(@NotNull @Query("page") String str, @NotNull @Query("pageSize") String str2);

    @GET("/priapi/v5/algo/marketplace/public/profit-sharing/orders-history")
    AbstractC58185ywX<ResponseData<List<BotLeadUserOrderHistorySummaryModel>>> loadBotTraderOrderHistorySummary(@NotNull @Query("page") String str, @NotNull @Query("pageSize") String str2, @NotNull @Query("traderUniqueName") String str3);

    @GET("/priapi/v5/algo/marketplace/lead-trader/profit-sharing/orders-pending")
    AbstractC58185ywX<ResponseData<List<BotLeadUserOrderPendingSummaryModel>>> loadBotTraderOrderPendingSelf(@NotNull @Query("page") String str, @NotNull @Query("pageSize") String str2);

    @GET("/priapi/v5/algo/marketplace/public/profit-sharing/orders-pending")
    AbstractC58185ywX<ResponseData<List<BotLeadUserOrderPendingSummaryModel>>> loadBotTraderOrderPendingSummary(@NotNull @Query("page") String str, @NotNull @Query("pageSize") String str2, @NotNull @Query("traderUniqueName") String str3);

    @GET("/priapi/v5/algo/marketplace/public/lead-trader/profit-history")
    AbstractC58185ywX<ResponseData<List<BotLeadProfitOverviewModel>>> loadBotTraderProfitSummary(@NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str, @NotNull @Query("traderUniqueName") String str2);

    @GET("/priapi/v5/algo/marketplace/public/lead-trader/summary")
    AbstractC58185ywX<ResponseData<List<BotLeadOverviewModel>>> loadBotTraderSummary(@Query("traderUniqueName") String str);

    @POST("/priapi/v5/virtual-account/business-config")
    AbstractC58185ywX<ResponseData<ArrayList<ContractExpLeverageConfig>>> loadBusinessConfig(@Body @NotNull BusinessConfigReq businessConfigReq);

    @GET("/v2/support/info/announce/listProject")
    AbstractC58185ywX<ResponseData<OldCoinList>> loadCoinInfo(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/rubik/stat/contracts/funding-rate-history-new")
    AbstractC58185ywX<ResponseData<List<List<String>>>> loadFundRateV5(@NotNull @Query("ccy") String str);

    @GET("/priapi/v5/rubik/public/funding-rate-arbitrage")
    AbstractC58185ywX<ResponseData<ArbitrageFundingResp>> loadFundingArbitrageInfo();

    @GET("/v2/asset/accounts/hidden-currency-with-search")
    AbstractC58185ywX<ResponseData<ArrayList<HiddenCurrencyBean>>> loadHiddenCoinsList(@Query("checkBalance") boolean z);

    @GET("/priapi/v1/sfp/lvf/product/standard-products")
    AbstractC58185ywX<ResponseBody> loadLvfProductList(@Query("ccy") String str);

    @GET("/v2/asset/quick/exchange/currencies")
    AbstractC58185ywX<ResponseData<ArrayList<QuickChangeCurrencyData>>> loadQuickCurrencies(@Query(AppsFlyerProperties.CHANNEL) String str);

    @GET("/priapi/v5/public/simple-options/get-custom-recommended-products")
    AbstractC58185ywX<ResponseData<ArrayList<SimpleOptionProduct.SimpleOptionProductItemPo>>> loadSimpleOptionProducts(@Query("instFamily") String str, @Query("optType") String str2, @Query("targetPrice") String str3, @Query("expiry") String str4);

    @GET("/priapi/v5/public/simple-options/get-custom-recommended-products")
    AbstractC58185ywX<ResponseData<List<SimpleOptionProduct>>> loadSimpleOptionProductsV(@Query("instFamily") String str, @Query("opType") String str2, @Query("targetPrice") String str3, @Query("expiry") String str4);

    @GET("/priapi/v5/public/simple/getProducts/v2")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<SimpleProducts>>>> loadSimpleOptionProductsV2(@Query("uly") String str, @Query("instFamily") String str2, @Query("opType") String str3, @Query("targetPrice") String str4, @Query("expiry") String str5);

    @GET("/priapi/v5/public/simple/targetPriceList")
    AbstractC58185ywX<ResponseData<ArrayList<SimpleTargetPrice>>> loadSimpleOptionTargetPriceList(@Query("uly") String str, @Query("instFamily") String str2, @Query("opType") String str3);

    @GET("priapi/v5/account/spot-borrow-repay-history")
    AbstractC58185ywX<ResponseData<List<SpotBorrowRepayHistoryResp>>> loadSpotBorrowHistory(@Query("ccy") String str, @Query(OtcExtraKeys.SIDE) String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query(TtmlNode.RUBY_BEFORE) String str4, @Query("limit") String str5);

    @GET("/priapi/v5/rubik/public/spread-arbitrage")
    AbstractC58185ywX<ResponseData<ArbitrageSpreadResp>> loadSpreadArbitrageInfo();

    @GET("/priapi/v3/growth/contract-coupon/earn-rate")
    AbstractC58185ywX<ResponseData<List<ContractTopEarnRate>>> loadTopEarnRate();

    @GET("/priapi/v5/rubik/public/trade-page-rec")
    AbstractC58185ywX<ResponseData<List<TradeNoOrderRecomend>>> loadTradeNoOrderRecomend(@NotNull @Query("type") String str);

    @GET("/priapi/v3/growth/contract-coupon/valid-coupon")
    AbstractC58185ywX<ResponseData<ContractCoupon>> loadValidContractCoupon(@Query("couponId") Integer num);

    @GET("/priapi/v5/virtual-account/private-summary")
    AbstractC58185ywX<ResponseData<ArrayList<VirtualAccountPosData>>> loadVirtualAccountPosAmt();

    @GET("/priapi/v5/algo/webhook/queryAction")
    AbstractC58185ywX<ResponseData<List<BotWebHook>>> loadWebHookActions(@NotNull @Query("algoId") String str);

    @POST("/priapi/v5/ecotrade/marketplace/lock-voucher")
    AbstractC58185ywX<ResponseData<List<LockVoucherResponse>>> lockVoucher(@Body @NotNull LockVoucherBody lockVoucherBody);

    @POST("/priapi/v5/algo/trade/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> makeAllStrategyOrder(@Body @NotNull StrategyReq strategyReq);

    @POST("/priapi/v5/algo/trade/dcd/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> makeDcdOrder(@Body @NotNull DcdOrderReq dcdOrderReq);

    @POST("/priapi/v5/algo/grid/transfer-profit")
    AbstractC58185ywX<ResponseData<List<GridProfitResponse>>> makeGridProfit(@NotNull @Query("algoId") String str, @Body @NotNull GridProfitReq gridProfitReq);

    @POST("priapi/v5/ecotrade/algo-order")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> makeLeadSpOrder(@Body @NotNull OrderLeadSpReq orderLeadSpReq);

    @POST("priapi/v5/trade/order")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> makeOrder(@Body @NotNull BizTradeOrderReq bizTradeOrderReq);

    @POST("priapi/v5/trade/order-algo")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> makeStrategyOrder(@Body @NotNull BizStrategyTradeOrderReq bizStrategyTradeOrderReq);

    @POST("/priapi/v5/algo/marketplace/signal-customer/renew")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> manualRenew(@Body @NotNull SwitchRenewData switchRenewData);

    @POST("priapi/v5/account/position/margin-balance")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> marginBalance(@Body @NotNull MarginBalanceData marginBalanceData);

    @GET("/priapi/v5/algo/trade/smart-portfolio/max-capital")
    AbstractC58185ywX<ResponseData<List<MaxCapital>>> maxCapital(@Query("portfolioList") String str, @Query("quoteCcy") String str2, @Query("tradeQuoteCcy") String str3);

    @POST("/priapi/v5/trade/amend-algos")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> modifyAlgoOrder(@Body @NotNull BizModifyAlgoOrderReq bizModifyAlgoOrderReq);

    @POST("/priapi/v5/algo/trade/state")
    AbstractC58185ywX<ResponseData<List<BotModifyResp>>> modifyBotState(@Body @NotNull BotModifyReq botModifyReq);

    @POST("/priapi/v5/algo/trade/arbitrage/condition/modify")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> modifyConditionStrategyOrder(@Body @NotNull SmartArbitrageModificationReq smartArbitrageModificationReq);

    @POST("/priapi/v5/dex/cefi/v2/trade/modify-tpsl")
    AbstractC58185ywX<ResponseData<List<OKTDexTpslUpdateResponse>>> modifyDexOrder(@Body @NotNull BizModifyDexOrderReq bizModifyDexOrderReq);

    @POST("priapi/v5/trade/amend-order")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> modifyOrder(@Body @NotNull BizModifyOrderReq bizModifyOrderReq);

    @POST("priapi/v5/account/open-trade-borrow-mode")
    AbstractC58185ywX<ResponseData<Object>> openSimpleModeLoan(@Body @NotNull OpenSimpleModeLoan openSimpleModeLoan);

    @GET("priapi/v5/public/option-price-convert")
    AbstractC58185ywX<ResponseData<List<OptionMultiplePrice>>> optionPriceConvert(@NotNull @Query("instId") String str, @Query("px") String str2, @Query("pxUsd") String str3, @Query("pxVol") String str4);

    @POST("priapi/v5/ecotrade/close-copy-order")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> orderLeadClosePosition(@Body @NotNull OrderLeadMarketCloseReq orderLeadMarketCloseReq);

    @POST("/priapi/v5/user/debt-order")
    AbstractC58185ywX<ResponseData<List<String>>> orderQuote(@Body @NotNull OrderQuoteBean orderQuoteBean);

    @POST("/priapi/v5/algo/grid/pause")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> pauseSpotGrid(@Body @NotNull SpotGridPauseResumeDto spotGridPauseResumeDto);

    @POST("/priapi/v5/algo/config/pin-strategy")
    AbstractC58185ywX<ResponseData<List<PinBotResp>>> pinBot(@Body @NotNull PinBotReq pinBotReq);

    @POST("/priapi/v5/trade/simple/order")
    AbstractC58185ywX<ResponseData<List<OptionsDiscoveryPlaceOrderBean>>> placeOrderOptionsDiscovery(@Body @NotNull OptionsDiscoveryPlaceOrderBody optionsDiscoveryPlaceOrderBody);

    @POST("priapi/v5/simple-options/order")
    AbstractC58185ywX<ResponseData<List<SimpleOptionOrderResponse>>> placeSimpleOptionOrder(@Body @NotNull SimpleOptionOrderReq simpleOptionOrderReq);

    @GET("/priapi/v1/sfp/lvf/product/redirect/quote")
    AbstractC58185ywX<ResponseData<RequestForQuoteResp>> preCheckGuide(@Query("altCcy") String str, @Query("ccy") String str2, @Query("strike") String str3, @Query("tradeSide") String str4);

    @GET("/priapi/v5/algo/trade/smart-portfolio/preInvest-detail")
    AbstractC58185ywX<ResponseData<List<PreInvestDetail>>> preInvestDetail(@Query("portfolioList") String str, @Query("quoteCcy") String str2, @Query("initCapital") String str3, @Query("tradeQuoteCcy") String str4);

    @POST("/priapi/v1/sfp/lvf/trade")
    AbstractC58185ywX<ResponseData<PriceLockerTradeResp>> priceLockerTrade(@Body @NotNull PriceLockerTradeReq priceLockerTradeReq);

    @POST("/priapi/v5/algo/trade/signal/publish")
    AbstractC58185ywX<ResponseData<List<SignalListItem>>> publishSignal(@Body @NotNull SignalPublishInfo signalPublishInfo);

    @GET("/priapi/v5/trade/queryAllOrderKLine")
    Object queryAllOrderKLine(@Query("instId") String str, @Query("instType") String str2, @Query("bar") String str3, @Query(TtmlNode.RUBY_AFTER) Long l, @Query("typeTime") String str4, @Query("ordType") String str5, @Query("_start") String str6, @Query("_end") String str7, @Query("state") String str8, @Query("limit") String str9, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    @GET("priapi/v5/algo/marketplace/public/deep-link")
    AbstractC58185ywX<ResponseData<List<BotShareResult>>> queryBotShareUrl(@Query("signalChanId") String str);

    @GET("/v2/asset/accounts/currency-target")
    AbstractC58185ywX<ResponseData<List<AssetsCoinTransferTarget>>> queryCurrencyTarget(@Query("currencyId") int i, @Query("businessType") String str, @Query(ExtJson.BRC20TYPE_TRANSFER) boolean z);

    @GET("/priapi/v5/algo/marketplace/strategy-statistics")
    AbstractC58185ywX<ResponseData<List<GridStatistics>>> queryGridStatistics(@Query("instId") String str, @NotNull @Query("algoOrdType") String str2);

    @GET("/priapi/v5/algo/marketplace/public/recommendation")
    AbstractC58185ywX<ResponseData<List<SmartRecommendResp>>> queryRecommendList(@Query("instId") String str, @Query("type") String str2, @Query("algoOrdType") String str3, @Query("recommendId") String str4, @Query("t") long j, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) String str5, @Query("ordVariant") String str6);

    @GET("/priapi/v5/algo/public/query-rsi-trigger")
    AbstractC58185ywX<ResponseData<List<RsiTrigger>>> queryRsiTrigger(@Query("instId") String str, @Query("oversoldThold") String str2, @Query("timeframe") String str3, @Query("timePeriod") String str4, @Query("triggerCond") String str5);

    @GET("/priapi/v5/algo/grid/resume/min-topup")
    AbstractC58185ywX<ResponseData<List<ResumeSpotGridData>>> querySpotGrid(@NotNull @Query("algoId") String str);

    @POST("/v2/asset/accounts/user-currency-list-balance")
    AbstractC58185ywX<ResponseData<ArrayList<UserCurrencyListBalanceResp>>> queryUserCurrencyListBalance(@Body @NotNull UserCurrencyListBalanceReq userCurrencyListBalanceReq);

    @POST("/priapi/v5/algo/trade/recurring/edit-amount")
    AbstractC58185ywX<ResponseData<List<Object>>> recurringEditAmount(@Body @NotNull RecurringModifyInvestmentReq recurringModifyInvestmentReq);

    @POST("/priapi/v5/algo/trade/recurring/edit-cycle-time")
    AbstractC58185ywX<ResponseData<List<Object>>> recurringEditCycleTime(@Body @NotNull RecurringEditCycleTimeReq recurringEditCycleTimeReq);

    @POST("/priapi/v5/algo/trade/recurring/edit-price-range")
    AbstractC58185ywX<ResponseData<List<Object>>> recurringEditPriceRange(@Body @NotNull RecurringEditPriceRangeReq recurringEditPriceRangeReq);

    @POST("/priapi/v5/algo/trade/recurring/manual-add-order")
    AbstractC58185ywX<ResponseData<List<Object>>> recurringManualAddOrder(@Body @NotNull RecurringModifyInvestmentReq recurringModifyInvestmentReq);

    @POST("/priapi/v5/algo/public/recurring/min-investment ")
    AbstractC58185ywX<ResponseData<List<MinInvestResp>>> recurringMinInvest(@Body @NotNull MinInvestReq minInvestReq);

    @POST("/priapi/v5/algo/trade/recurring/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> recurringOrder(@Body @NotNull RecurringOrderData recurringOrderData);

    @POST("/priapi/v1/sfp/lvf/early-fill")
    AbstractC58185ywX<ResponseData<EarlyFillResp>> requestEarlyFill(@Body @NotNull EarlyFillReq earlyFillReq);

    @GET("/priapi/v1/sfp/lvf/quote/request-for-early-fill-quote")
    AbstractC58185ywX<ResponseData<EarlyFillQuoteResp>> requestForEarlyQuote(@Query("tradeId") String str);

    @POST("/priapi/v1/sfp/lvf/quote/request-for-quote")
    AbstractC58185ywX<ResponseData<RequestForQuoteResp>> requestForQuote(@Body @NotNull RequestForQuoteReq requestForQuoteReq);

    @POST("/priapi/v5/balance/reset")
    AbstractC58185ywX<ResponseData<List<Unit>>> resetSimulateAssets(@Body @NotNull SimulateAssetsRequest simulateAssetsRequest);

    @POST("/priapi/v5/algo/grid/resume")
    AbstractC58185ywX<ResponseData<List<ResumeSpotGridData>>> resumeSpotGrid(@Body @NotNull SpotGridPauseResumeDto spotGridPauseResumeDto);

    @POST("/priapi/v5/algo/grid/resume")
    AbstractC58185ywX<ResponseData<List<ResumeSpotGridData>>> resumeSpotGrid(@Body @NotNull SpotGridPauseResumeWithAmtDto spotGridPauseResumeWithAmtDto);

    @POST("priapi/v5/trade/reverse")
    AbstractC58185ywX<ResponseData<List<ReversePosResponse>>> reversePos(@Body @NotNull ReversePosRequestBean reversePosRequestBean);

    @GET("priapi/v5/trade/reverse-pre-check")
    AbstractC58185ywX<ResponseData<List<ReversePreCheckResponse>>> reversePosPreCheck(@NotNull @Query("instId") String str, @NotNull @Query("tdMode") String str2, @NotNull @Query("posSide") String str3);

    @POST("/priapi/v5/account/set-inst-mode")
    AbstractC58185ywX<ResponseData<ArrayList<InstMarginModeConfigs>>> saveMarginModeConfig(@Body @NotNull MarginModeConfigData marginModeConfigData);

    @POST("priapi/v5/copytrade/sgl-clone/create-link")
    AbstractC58185ywX<ResponseData<List<SignalCloneUrl>>> saveSettingsCloneParams(@Body UploadSettingConfigReq uploadSettingConfigReq);

    @POST("priapi/v5/copytrade/sgl-clone/create-link")
    AbstractC58185ywX<ResponseData<List<SignalCloneUrl>>> saveSignalCloneParams(@Body @NotNull SignalCloneInfo signalCloneInfo);

    @POST("/priapi/v5/trade/scaled-orders")
    AbstractC58185ywX<ResponseData<List<SegmentOrderResponse>>> scaledOrders(@Body @NotNull SegmentOrderRequest segmentOrderRequest);

    @POST("priapi/v5/account/set-account-level")
    AbstractC58185ywX<ResponseData<List<AccountLevelData>>> setAccountLevel(@Body @NotNull AccountLevelData accountLevelData);

    @POST("priapi/v5/account/active-and-check-equity")
    AbstractC58185ywX<ResponseData<List<AccountEquityActive>>> setActiveAndCheckEquity(@Body @NotNull AccountLevelData accountLevelData);

    @POST("/priapi/v5/algo/share/config")
    AbstractC58185ywX<ResponseData<List<AlgoShareConfigInfo>>> setAlgoShareConfig(@Body @NotNull AlgoShareConfigInfo algoShareConfigInfo);

    @POST("priapi/v5/users/favorite/setting-all")
    AbstractC58185ywX<ResponseData<EmptyResp>> setAllFavorite(@Body @NotNull List<SettingWatchList> list);

    @POST(" /priapi/v5/users/arbitrage/favourite/setting")
    AbstractC58185ywX<ResponseData<Unit>> setArbitrageFavorite(@Body @NotNull ArbitrageSetFavoriteBean arbitrageSetFavoriteBean);

    @POST("/priapi/v5/algo/trade/config/set")
    AbstractC58185ywX<ResponseData<List<ArbitragePriceSettingModel>>> setArbitragePriceSetting(@Body @NotNull ArbitragePriceSetting arbitragePriceSetting);

    @POST("priapi/v5/account/set-auto-loan")
    AbstractC58185ywX<ResponseData<List<LoanModeReq>>> setAutoLoan(@Body @NotNull LoanModeReq loanModeReq);

    @POST("priapi/v5/account/borrow-repay")
    AbstractC58185ywX<ResponseData<List<BorrowRepayResp>>> setBorrowRepay(@Body @NotNull BorrowRepayReq borrowRepayReq);

    @POST("/priapi/v5/algo/marketplace/user-strategy-visibility")
    AbstractC58185ywX<ResponseData<List<BotVisibilityResult>>> setBotVisibility(@Body @NotNull BotVisibilityInfo botVisibilityInfo);

    @POST("/priapi/v5/account/set-collateral-assets-pre-check")
    AbstractC58185ywX<ResponseData<List<SetCollateralPreCheckResp>>> setCollateralPreCheck(@Body List<CollateralCoinConfig> list);

    @POST("/priapi/v5/account/set-collateral-assets")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setCollateralToken(@Body List<CollateralCoinConfig> list);

    @POST("priapi/v5/account/set-combined-user-config-one-click-sync")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setCombinedSettingsOneClickSync(@Body @NotNull UploadSettingConfigBean uploadSettingConfigBean);

    @POST("priapi/v5/account/set-dual-leverage")
    AbstractC58185ywX<ResponseData<ArrayList<DualLeverageResp>>> setDualLeverage(@Body @NotNull DualLeverageReq dualLeverageReq);

    @POST("/priapi/v5/account/set-equity-perp-disclosure")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setEquityPerpDisclosure(@Body @NotNull EquityPerpDisClosureReq equityPerpDisClosureReq);

    @POST("priapi/v5/account/set-fee-type")
    AbstractC58185ywX<ResponseData<List<SetFeeTypeResp>>> setFeeType(@Body @NotNull SetFeeTypeReq setFeeTypeReq);

    @POST("/priapi/v5/account/set-isolated-mode")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setIsoTransferMode(@Body @NotNull IsoSetReq isoSetReq);

    @POST("priapi/v5/account/set-leverage")
    AbstractC58185ywX<ResponseData<ArrayList<LeverageReq>>> setLeverage(@Body @NotNull LeverageReq leverageReq);

    @POST("/priapi/v5/account/set-liquidation-gear")
    AbstractC58185ywX<ResponseData<ArrayList<LiquidationGearInfo>>> setLiquidationGear(@Body LiquidationGearReq liquidationGearReq);

    @POST("priapi/v5/account/set-max-account-level")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setMaxAccountLevel(@Body @NotNull AccountLevelData accountLevelData);

    @POST("priapi/v5/account/set-max-account-level")
    AbstractC58185ywX<ResponseData<List<OuterEmptyResp>>> setMaxAccountLevelForOuter(@Body @NotNull OuterAccountLevelData outerAccountLevelData);

    @POST("/priapi/v5/account/set-derivative")
    AbstractC58185ywX<ResponseData<List<DeriConfigData>>> setNaviType(@Body @NotNull NaviBody naviBody);

    @POST("priapi/v5/account/op/verify")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setOpAuth();

    @FormUrlEncoded
    @POST("/priapi/v5/rubik/newbie/set-cooling-time")
    AbstractC58185ywX<ResponseData<List<String>>> setOptionCoolConfig(@Field("type") @NotNull String str, @Field(CrashHianalyticsData.TIME) @NotNull String str2, @Field("coinScope") String str3);

    @POST("priapi/v5/account/set-position-mode")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setPositionMode(@Body @NotNull PositionModeReq positionModeReq);

    @POST("priapi/v5/account/mobile/preferredStableCoin/setConfig")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setPreferredStableCoinConfig(@Body @NotNull PreferredStableCoinReq preferredStableCoinReq);

    @POST("/priapi/v5/account/set-riskOffset-amt")
    AbstractC58185ywX<ResponseData<List<RiskOffsetAmtResp>>> setRiskOffsetAmt(@Body @NotNull RiskOffsetAmtReq riskOffsetAmtReq);

    @POST("/priapi/v5/account/set-riskOffset-amt-pre-check")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> setRiskOffsetAmtPreCheck(@Body @NotNull RiskOffsetAmtReq riskOffsetAmtReq);

    @POST("/priapi/v5/account/set-stp-mode")
    AbstractC58185ywX<ResponseData<List<SelfTradePreventionSettingResp>>> setSelfTradePreventionConfig(@Body @NotNull SelfTradePreventionSettingReq selfTradePreventionSettingReq);

    @POST("priapi/v5/account/set-settle-currency")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setSettleCurrencyConfig(@Body @NotNull PreferredUSDSettleCcyCoinReq preferredUSDSettleCcyCoinReq);

    @GET("priapi/v5/account/simple-borrow/balance")
    AbstractC58185ywX<ResponseData<List<AccountBalanceData>>> setSimpleBorrowBalance(@Query("ccy") String str);

    @POST("priapi/v5/account/set-auto-repay")
    AbstractC58185ywX<ResponseData<Object>> setSimpleModeAutoRepay(@Body @NotNull OpenSimpleModeAutoRepay openSimpleModeAutoRepay);

    @POST("/priapi/v5/algo/marketplace/user-favourite")
    AbstractC58185ywX<ResponseData<List<StgyFavouriteResult>>> setStgyFavourite(@Body @NotNull StgyFavouriteReq stgyFavouriteReq);

    @POST("priapi/v5/account/set-trade-unit")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> setTradeUnit(@Body @NotNull TradeUnitReq tradeUnitReq);

    @POST("priapi/v5/users/favorite/setting")
    AbstractC58185ywX<ResponseData<EmptyResp>> setWatchListFavorite(@Body @NotNull SettingWatchList settingWatchList);

    @GET("priapi/v5/yield-hunter/settlement-currencies")
    AbstractC58185ywX<ResponseData<ArrayList<YieldHunterSettlementCurrencyResponse>>> settlementCurrencies();

    @GET("priapi/v5/public/yield-hunter/settlement-currencies")
    AbstractC58185ywX<ResponseData<ArrayList<YieldHunterSettlementCurrencyResponse>>> settlementCurrenciesNotLogin();

    @POST("/priapi/v5/algo/trade/signal/close-all-positions")
    AbstractC58185ywX<ResponseData<List<ContractGridClosePositionData>>> signalClosePosition(@Body @NotNull ContractGridClosePositionReq contractGridClosePositionReq);

    @POST("/priapi/v5/algo/marketplace/signal-customer/subscribe")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> signalSubscribe(@Body @NotNull SignalSubsReq signalSubsReq);

    @POST("/priapi/v5/algo/grid/slippage-control/edit")
    AbstractC58185ywX<ResponseData<List<SpotGridEditParamRep>>> slippageControlEdit(@Body @NotNull SlippageControlEditParamRep slippageControlEditParamRep);

    @POST("/priapi/v5/algo/trade/smart-portfolio/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> smartPortfolioOrder(@Body @NotNull SmartPortfolioReq smartPortfolioReq);

    @POST("/priapi/v5/algo/trade/spot-dca/order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> spotDcaMakeOrder(@Body @NotNull DcaOrderReq dcaOrderReq);

    @POST("/priapi/v5/algo/grid/edit-strategy")
    AbstractC58185ywX<ResponseData<List<SpotGridEditParamRep>>> spotGridChangeParam(@Body @NotNull SpotGridEditParamReq spotGridEditParamReq);

    @POST("/priapi/v5/ecotrade/marketplace/grid/place-order")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> spotGridPlaceOrder(@Body @NotNull GridReq gridReq);

    @POST("/priapi/v5/algo/trade/stop")
    AbstractC58185ywX<ResponseData<List<StrategyStopResponse>>> stopStrategyOrder(@Body @NotNull List<StrategyStopReq> list);

    @GET("/priapi/v5/account/switch-pre-check")
    AbstractC58185ywX<ResponseData<List<AccountSwitchCheckInfo>>> switchAccountModePreCheck(@Query("type") Integer num);

    @GET("priapi/v5/account/set-account-switch-precheck")
    AbstractC58185ywX<ResponseData<List<AccountModePreCheckData>>> switchAccountModePreCheck(@NotNull @Query("acctLv") String str);

    @POST("priapi/v5/account/set-account-switch-precheck")
    AbstractC58185ywX<ResponseData<List<AccountModePreCheckData>>> switchAccountModePreCheckNew(@Body @NotNull AccountLevelData accountLevelData);

    @POST("priapi/v5/account/account-level-switch-preset")
    AbstractC58185ywX<ResponseData<List<SwitchAccountPresetResp>>> switchAccountModePreSet(@Body @NotNull SwitchAccountPresetReq switchAccountPresetReq);

    @POST("/priapi/v5/rubik/funding-rate-alert/rule/set-switch")
    AbstractC58185ywX<ResponseData<Object>> switchFundingRateAlert(@Body @NotNull FundingRateSwitchReq fundingRateSwitchReq);

    @GET("/priapi/v5/algo/grid/sync-param/min-topup")
    AbstractC58185ywX<ResponseData<List<SyncParamsMinTopupInfo>>> syncParamminTopup(@NotNull @Query("algoId") String str);

    @GET("/v3/users/mobile/security/sync")
    Object syncSecurity(@NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/algo/marketplace/ticket/eligibility")
    AbstractC58185ywX<ResponseData<List<TicketEligibility>>> ticketEligibility(@NotNull @Query("instId") String str, @NotNull @Query("algoOrdType") String str2, @NotNull @Query("entity") String str3);

    @POST("/priapi/v5/algo/trade/dcd/toggle-reinvestment")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> toggleReinvestment(@Body @NotNull ToggleReinvestmentReq toggleReinvestmentReq);

    @POST("priapi/v5/trade/close-position")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> tradeClosePosition(@Body @NotNull BizTradeClosePosition bizTradeClosePosition);

    @GET("/priapi/v1/earn/trade-grouped-user-assets")
    Object tradeEarnUserAssets(@NotNull @Query("valuationUnit") String str, @NotNull Continuation<? super ResponseData<TradeEarnUserAssets>> continuation);

    @GET("priapi/v5/trade/order-pre-check")
    AbstractC58185ywX<ResponseData<List<OrderPreCheckResp>>> tradeOrderPreCheck(@NotNull @Query("instId") String str, @NotNull @Query("tdMode") String str2, @Query("ccy") String str3, @NotNull @Query(OtcExtraKeys.SIDE) String str4, @Query("posSide") String str5, @NotNull @Query("ordType") String str6, @NotNull @Query("sz") String str7, @Query("px") String str8, @Query("bboType") String str9, @Query("reduceOnly") Boolean bool, @Query("tgtCcy") String str10, @Query("quickMgnType") String str11, @Query("cost") String str12, @Query("orderSignType") String str13, @Query("isTradeBorrowMode") Boolean bool2, @Query("tradeQuoteCcy") String str14);

    @POST("priapi/v5/trade/stoporder-pre-check")
    AbstractC58185ywX<ResponseData<List<OrderPreCheckResp>>> tradeStopOrderPreCheck(@Body @NotNull StopTradeOrderReq stopTradeOrderReq);

    @POST("/priapi/v5/algo/trade/order-pre-check")
    AbstractC58185ywX<ResponseData<List<OrderStrategyPreCheckResp>>> tradeStrategyOrderPreCheck(@Body @NotNull StrategyPreCheckReq strategyPreCheckReq);

    @POST("/priapi/v5/algo/trade/edit_strategy")
    AbstractC58185ywX<ResponseData<List<StrategyResponse>>> twapModifyOrder(@Body @NotNull TwapModifyReq twapModifyReq);

    @POST("/priapi/v5/account/init-inst-mode")
    AbstractC58185ywX<ResponseData<ArrayList<InstMarginModeConfigs>>> updateMarginModeInitConfig(@Body @NotNull MarginModeInitConfigData marginModeInitConfigData);

    @POST("/priapi/v5/account/set-copyInst-mode")
    AbstractC58185ywX<ResponseData<List<SpotCopyInstSwitchConfig>>> updateOrderLeaderSwitchStatus(@Body @NotNull SpotCopySwitchRequest spotCopySwitchRequest);

    @POST("/priapi/v5/algo/trade/signal/update")
    AbstractC58185ywX<ResponseData<List<SignalListItem>>> updateSignalBotSign(@Body @NotNull SignalBotUpdateReq signalBotUpdateReq);

    @FormUrlEncoded
    @POST("/priapi/v5/rubik/newbie/upload-state")
    AbstractC58185ywX<ResponseData<List<EmptyResp>>> uploadNewBieState(@FieldMap @NotNull Map<String, String> map);

    @POST("/priapi/v3/growth/contract-coupon/use")
    AbstractC58185ywX<ResponseData<ContractOrderResponse>> useContractCoupon(@Body @NotNull UseContractCouponReq useContractCouponReq);

    @POST("priapi/v5/account/user-debt-repay")
    AbstractC58185ywX<ResponseData<List<SimpleModeQuickRepayResp>>> userDebtRepay(@Body @NotNull SimpleModeQuickRepayReq simpleModeQuickRepayReq);

    @POST("/priapi/v5/account/vipAccount/loanAlloc/switchSet")
    AbstractC58185ywX<ResponseData<List<VipLoanLimitSwitchData>>> vipLimitSwitchSet(@Body @NotNull VipLoanLimitSwitchSetReqData vipLoanLimitSwitchSetReqData);

    @POST("/priapi/v5/account/vipSubAccount/loanAlloc/update")
    AbstractC58185ywX<ResponseData<List<VipLoanLimitSwitchData>>> vipSubAccountLimitRateUpdate(@Body @NotNull SubAccountLimitRateUpdateReq subAccountLimitRateUpdateReq);

    @GET("/priapi/v5/dex/wallet-escape-check")
    Object walletEscapeCheck(@NotNull Continuation<? super ResponseData<List<WalletEscapeCheckResult>>> continuation);

    @POST("/priapi/v5/yield-hunter/close-position")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> yieldHunterClose(@Body @NotNull YieldHunterCloseReq yieldHunterCloseReq);

    @GET("/priapi/v5/yield-hunter/history-positions")
    Object yieldHunterHistoryPositions(@NotNull Continuation<? super ResponseData<List<YieldHunterPositionsResp>>> continuation);

    @GET("priapi/v5/yield-hunter/instruments")
    AbstractC58185ywX<ResponseData<List<YieldHunterInstrumentResponse>>> yieldHunterInstruments(@NotNull @Query("stkHigh") String str, @NotNull @Query("stkLow") String str2, @Query("estAplRatioRange") Integer num, @Query("expTimeRange") Integer num2, @NotNull @Query("optType") String str3, @NotNull @Query("settleCcy") String str4);

    @GET("priapi/v5/public/yield-hunter/instruments")
    AbstractC58185ywX<ResponseData<List<YieldHunterInstrumentResponse>>> yieldHunterInstrumentsNotLogin(@NotNull @Query("stkHigh") String str, @NotNull @Query("stkLow") String str2, @Query("estAplRatioRange") Integer num, @Query("expTimeRange") Integer num2, @NotNull @Query("optType") String str3, @NotNull @Query("settleCcy") String str4);

    @POST("/priapi/v5/yield-hunter/order")
    AbstractC58185ywX<ResponseData<List<OrderExpResp>>> yieldHunterOrder(@Body @NotNull YieldHunterOrderReq yieldHunterOrderReq);

    @GET("priapi/v5/yield-hunter/portfolio")
    AbstractC58185ywX<ResponseData<List<YieldHunterPortfolioResponse>>> yieldHunterPortfolio();

    @GET("priapi/v5/yield-hunter/positions-count")
    AbstractC58185ywX<ResponseData<List<YieldHunterPositionCountResponse>>> yieldHunterPositionCount();

    @GET("/priapi/v5/yield-hunter/positions")
    Object yieldHunterPositions(@NotNull Continuation<? super ResponseData<List<YieldHunterPositionsResp>>> continuation);

    @GET("/priapi/v5/yield-hunter/preview-close")
    AbstractC58185ywX<ResponseData<List<YieldHunterPreviewCloseResp>>> yieldHunterPreviewClose(@Query("instId") String str, @Query("clRefId") String str2, @Query("sz") String str3);

    @GET("/priapi/v5/yield-hunter/preview-order")
    AbstractC58185ywX<ResponseData<List<YieldHunterPreviewOrderResp>>> yieldHunterPreviewOrder(@Query("instId") String str, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) String str2, @Query("cost") String str3, @Query("costCcy") String str4, @Query("targetPx") String str5);

    public static final class TaskDescription {
        public static /* synthetic */ AbstractC58185ywX loadCoinInfo$default(BizApiService bizApiService, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadCoinInfo");
            }
            if ((i2 & 1) != 0) {
                str = C54488xKg.copydefault.OLrzqt();
            }
            if ((i2 & 2) != 0) {
                i = C54488xKg.copydefault.KWHzl();
            }
            return bizApiService.loadCoinInfo(str, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58185ywX getInstIdsByType$default(BizApiService bizApiService, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInstIdsByType");
            }
            int iIsConnected = i;
            if ((i2 & 2) != 0) {
                iIsConnected = C54589xNz.EZpvd.isConnected();
            }
            return bizApiService.getInstIdsByType(str, iIsConnected);
        }

        public static /* synthetic */ AbstractC58185ywX getSimpleInstrumentsInfo$default(BizApiService bizApiService, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSimpleInstrumentsInfo");
            }
            if ((i2 & 2) != 0) {
                i = 1;
            }
            return bizApiService.getSimpleInstrumentsInfo(str, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58185ywX getInstrumentDetails$default(BizApiService bizApiService, String str, String str2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInstrumentDetails");
            }
            int iIsConnected = i;
            if ((i2 & 4) != 0) {
                iIsConnected = C54589xNz.EZpvd.isConnected();
            }
            return bizApiService.getInstrumentDetails(str, str2, iIsConnected);
        }

        public static /* synthetic */ AbstractC58185ywX getTradeFee$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeFee");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getTradeFee(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getFundingRateAll$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFundingRateAll");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getFundingRateAll(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getWatchListFavorite$default(BizApiService bizApiService, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWatchListFavorite");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return bizApiService.getWatchListFavorite(z);
        }

        public static /* synthetic */ AbstractC58185ywX getFavoriteComment$default(BizApiService bizApiService, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFavoriteComment");
            }
            if ((i2 & 1) != 0) {
                str = C54488xKg.copydefault.OLrzqt();
            }
            if ((i2 & 2) != 0) {
                i = 18000;
            }
            return bizApiService.getFavoriteComment(str, i);
        }

        public static /* synthetic */ AbstractC58185ywX getMarketTickers$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketTickers");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.getMarketTickers(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getMarketTrades$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketTrades");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.getMarketTrades(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX fetchDcaNoCloseOpenOrder$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchDcaNoCloseOpenOrder");
            }
            if ((i & 2) != 0) {
                str2 = "contract_dca";
            }
            return bizApiService.fetchDcaNoCloseOpenOrder(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public static /* synthetic */ AbstractC58185ywX tradeOrderPreCheck$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, Boolean bool2, String str14, int i, Object obj) {
            if (obj == null) {
                return bizApiService.tradeOrderPreCheck(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, str6, str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : str14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tradeOrderPreCheck");
        }

        public static /* synthetic */ AbstractC58185ywX getMaxAvailable$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2, String str14, String str15, Boolean bool3, String str16, String str17, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getMaxAvailable((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : bool, str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : bool2, (32768 & i) != 0 ? null : str14, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : bool3, (262144 & i) != 0 ? "0" : str16, (i & 524288) != 0 ? null : str17);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMaxAvailable");
        }

        public static /* synthetic */ AbstractC58185ywX getOptionsAvailBalance$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptionsAvailBalance");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            return bizApiService.getOptionsAvailBalance(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getHistoryOrdersIn7Days$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getHistoryOrdersIn7Days(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, (i & 8192) != 0 ? Boolean.FALSE : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryOrdersIn7Days");
        }

        public static /* synthetic */ AbstractC58185ywX getHistoryOrdersIn3Months$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getHistoryOrdersIn3Months(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, (i & 16384) != 0 ? Boolean.FALSE : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryOrdersIn3Months");
        }

        public static /* synthetic */ AbstractC58185ywX getPendingStrategyOrderById$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPendingStrategyOrderById");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.getPendingStrategyOrderById(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getAccountBills$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getAccountBills(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccountBills");
        }

        public static /* synthetic */ AbstractC58185ywX getPositionsList$default(BizApiService bizApiService, String str, String str2, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPositionsList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bool = Boolean.FALSE;
            }
            return bizApiService.getPositionsList(str, str2, bool);
        }

        public static /* synthetic */ Object getPositionsListSuspend$default(BizApiService bizApiService, String str, String str2, Boolean bool, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPositionsListSuspend");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bool = Boolean.FALSE;
            }
            return bizApiService.getPositionsListSuspend(str, str2, bool, continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getHisPositionsList$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHisPositionsList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            if ((i & 32) != 0) {
                str6 = null;
            }
            if ((i & 64) != 0) {
                str7 = null;
            }
            if ((i & 128) != 0) {
                str8 = null;
            }
            if ((i & 256) != 0) {
                str9 = null;
            }
            return bizApiService.getHisPositionsList(str, str2, str3, str4, str5, str6, str7, str8, str9);
        }

        public static /* synthetic */ Object getHisPositionsListSuspend$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getHisPositionsListSuspend((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHisPositionsListSuspend");
        }

        public static /* synthetic */ Object getHisPositionsOrdersSuspend$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getHisPositionsOrdersSuspend((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHisPositionsOrdersSuspend");
        }

        public static /* synthetic */ AbstractC58185ywX getAccountBanlance$default(BizApiService bizApiService, String str, String str2, boolean z, Integer num, String str3, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getAccountBanlance(str, str2, z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccountBanlance");
        }

        public static /* synthetic */ AbstractC58185ywX getDexPrivateSummary$default(BizApiService bizApiService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexPrivateSummary");
            }
            if ((i & 1) != 0) {
                str = C54487xKf.copydefault.OLrzqt();
            }
            return bizApiService.getDexPrivateSummary(str);
        }

        public static /* synthetic */ AbstractC58185ywX getFundRateArbitrage$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFundRateArbitrage");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getFundRateArbitrage(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getPendingStrategyOrderList$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18, String str19, String str20, String str21, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getPendingStrategyOrderList((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? Boolean.TRUE : bool, (i & 131072) != 0 ? "true" : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : str20, (i & 2097152) != 0 ? null : str21);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPendingStrategyOrderList");
        }

        public static /* synthetic */ AbstractC58185ywX getAllBotRunningList$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllBotRunningList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            if ((i & 32) != 0) {
                str6 = null;
            }
            if ((i & 64) != 0) {
                z = true;
            }
            return bizApiService.getAllBotRunningList(str, str2, str3, str4, str5, str6, z);
        }

        public static /* synthetic */ AbstractC58185ywX getAllBotHistoryList$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllBotHistoryList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            if ((i & 32) != 0) {
                str6 = null;
            }
            if ((i & 64) != 0) {
                z = false;
            }
            return bizApiService.getAllBotHistoryList(str, str2, str3, str4, str5, str6, z);
        }

        public static /* synthetic */ AbstractC58185ywX getGridTradeDetails$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getGridTradeDetails(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str6);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridTradeDetails");
        }

        public static /* synthetic */ AbstractC58185ywX getSignalHistoryEvent$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSignalHistoryEvent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getSignalHistoryEvent(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getMinInvestment$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, int i, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2, String str14, String str15, int i2, Object obj) {
            if (obj == null) {
                return bizApiService.getMinInvestment(str, str2, str3, str4, str5, i, str6, bool, str7, str8, (i2 & 1024) != 0 ? null : str9, (i2 & 2048) != 0 ? null : str10, (i2 & 4096) != 0 ? null : str11, (i2 & 8192) != 0 ? null : str12, (i2 & 16384) != 0 ? null : str13, (32768 & i2) != 0 ? Boolean.TRUE : bool2, (i2 & 65536) != 0 ? null : str14, str15);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMinInvestment");
        }

        public static /* synthetic */ AbstractC58185ywX getExtraMargin$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getExtraMargin(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : bool, str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExtraMargin");
        }

        public static /* synthetic */ AbstractC58185ywX getLiquidatePrice$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getLiquidatePrice(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiquidatePrice");
        }

        public static /* synthetic */ AbstractC58185ywX getGridProfitRate$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getGridProfitRate(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridProfitRate");
        }

        public static /* synthetic */ AbstractC58185ywX getGridHoldingDistribution$default(BizApiService bizApiService, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, Object obj) {
            if (obj == null) {
                return bizApiService.getGridHoldingDistribution(str, i, str2, str3, str4, str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridHoldingDistribution");
        }

        public static /* synthetic */ AbstractC58185ywX fetchHomeStrategyCards$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
            if (obj == null) {
                return bizApiService.fetchHomeStrategyCards(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchHomeStrategyCards");
        }

        public static /* synthetic */ AbstractC58185ywX getSmartArbInvestDetails$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getSmartArbInvestDetails(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSmartArbInvestDetails");
        }

        public static /* synthetic */ AbstractC58185ywX getSmartArbInvestDetailsRefactor$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, SubArbitrageType4Remote subArbitrageType4Remote, String str8, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getSmartArbInvestDetailsRefactor(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : subArbitrageType4Remote, (i & 256) != 0 ? null : str8);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSmartArbInvestDetailsRefactor");
        }

        public static /* synthetic */ AbstractC58185ywX getBannerOrderDetails$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBannerOrderDetails");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return bizApiService.getBannerOrderDetails(str, str2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.okinc.unify_trade.net.BizApiService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58185ywX getMultiInstsMinAmount$default(BizApiService bizApiService, List list, String str, String str2, String str3, String str4, List list2, String str5, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getMultiInstsMinAmount(list, str, str2, str3, str4, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultiInstsMinAmount");
        }

        public static /* synthetic */ AbstractC58185ywX loadLvfProductList$default(BizApiService bizApiService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLvfProductList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return bizApiService.loadLvfProductList(str);
        }

        public static /* synthetic */ AbstractC58185ywX currentLeadDetailOrder$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currentLeadDetailOrder");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.currentLeadDetailOrder(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX currentLeadSummaryOrder$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currentLeadSummaryOrder");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.currentLeadSummaryOrder(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX loadAllHistoryOrders$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, int i, Object obj) {
            if (obj == null) {
                return bizApiService.loadAllHistoryOrders(str, str2, str3, str4, str5, str6, bool, bool2, str7, str8, (i & 1024) != 0 ? Boolean.FALSE : bool3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAllHistoryOrders");
        }

        public static /* synthetic */ AbstractC58185ywX getInterestRateLoanQuote$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInterestRateLoanQuote");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getInterestRateLoanQuote(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getVipInterestRateLoanQuote$default(BizApiService bizApiService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVipInterestRateLoanQuote");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.getVipInterestRateLoanQuote(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getLevel$default(BizApiService bizApiService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLevel");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return bizApiService.getLevel(str);
        }

        public static /* synthetic */ AbstractC58185ywX optionPriceConvert$default(BizApiService bizApiService, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optionPriceConvert");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return bizApiService.optionPriceConvert(str, str2, str3, str4);
        }

        public static /* synthetic */ AbstractC58185ywX getAggregatedInfo$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getAggregatedInfo(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAggregatedInfo");
        }

        public static /* synthetic */ AbstractC58185ywX getGridNumRange$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridNumRange");
            }
            if ((i & 32) != 0) {
                str6 = null;
            }
            return bizApiService.getGridNumRange(str, str2, str3, str4, str5, str6);
        }

        public static /* synthetic */ AbstractC58185ywX getSpotPreCheckInfo$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSpotPreCheckInfo");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bizApiService.getSpotPreCheckInfo(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX setSimpleBorrowBalance$default(BizApiService bizApiService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSimpleBorrowBalance");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return bizApiService.setSimpleBorrowBalance(str);
        }

        public static /* synthetic */ AbstractC58185ywX loadSpotBorrowHistory$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadSpotBorrowHistory");
            }
            if ((i & 16) != 0) {
                str5 = null;
            }
            return bizApiService.loadSpotBorrowHistory(str, str2, str3, str4, str5);
        }

        public static /* synthetic */ AbstractC58185ywX chaseOrderInfo$default(BizApiService bizApiService, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: chaseOrderInfo");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return bizApiService.chaseOrderInfo(str, str2, z);
        }

        public static /* synthetic */ AbstractC58185ywX getDexAssets$default(BizApiService bizApiService, Integer num, Integer num2, Integer num3, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexAssets");
            }
            if ((i & 16) != 0) {
                str2 = C54487xKf.copydefault.OLrzqt();
            }
            return bizApiService.getDexAssets(num, num2, num3, str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getDexAsset$default(BizApiService bizApiService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexAsset");
            }
            if ((i & 4) != 0) {
                str3 = C54487xKf.copydefault.OLrzqt();
            }
            return bizApiService.getDexAsset(str, str2, str3);
        }

        public static /* synthetic */ AbstractC58185ywX getOrdersDexPendingAll$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrdersDexPendingAll");
            }
            if ((i & 32) != 0) {
                str6 = C54487xKf.copydefault.OLrzqt();
            }
            return bizApiService.getOrdersDexPendingAll(str, str2, str3, str4, str5, str6);
        }

        public static /* synthetic */ AbstractC58185ywX getOrdersDexPending$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getOrdersDexPending(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? C54487xKf.copydefault.OLrzqt() : str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrdersDexPending");
        }

        public static /* synthetic */ AbstractC58185ywX getOrdersAlgoDexPending$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrdersAlgoDexPending");
            }
            if ((i & 16) != 0) {
                str5 = C54487xKf.copydefault.OLrzqt();
            }
            return bizApiService.getOrdersAlgoDexPending(str, str2, str3, str4, str5);
        }

        public static /* synthetic */ AbstractC58185ywX getDexOrdersAll$default(BizApiService bizApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
            if (obj == null) {
                return bizApiService.getDexOrdersAll(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (i & 2048) != 0 ? C54487xKf.copydefault.OLrzqt() : str12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexOrdersAll");
        }

        public static /* synthetic */ Object getShareImageList$default(BizApiService bizApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShareImageList");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getShareImageList(str, str2, str3, continuation);
        }

        public static /* synthetic */ Object getOrderDetail$default(BizApiService bizApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderDetail");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return bizApiService.getOrderDetail(str, str2, str3, continuation);
        }
    }
}
