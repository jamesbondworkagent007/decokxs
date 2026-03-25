package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.aiBot.dto.AiCopyConfigResponseDto;
import com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import com.okinc.tradingbot.impl.aiBot.dto.DefaultPromptTemplateDto;
import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import com.okinc.tradingbot.impl.aiBot.dto.SetUserPopUpRequest;
import com.okinc.tradingbot.impl.aiBot.dto.TechnicalIndicatorsResponseDto;
import com.okinc.tradingbot.impl.aiBot.dto.UserPopUpDto;
import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.DcaPreviewResponse;
import com.okinc.tradingbot.impl.dto.EstReduceInfo;
import com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse;
import com.okinc.tradingbot.impl.dto.GridEventHistoryDto;
import com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import com.okinc.tradingbot.impl.dto.HomeArbitrageResponse;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.tradingbot.impl.dto.MarginUsage;
import com.okinc.tradingbot.impl.dto.RecurringEventHistoryDto;
import com.okinc.tradingbot.impl.dto.ReduceResultVo;
import com.okinc.tradingbot.impl.dto.TradeListResp;
import com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceRequest;
import com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceResponse;
import com.okinc.tradingbot.impl.futures_grid.dto.PositionMarginBalanceResponse;
import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.PostWithdrawLiquidationPriceResponse;
import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitBody;
import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse;
import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.WithdrawProfitResponse;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderBody;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AddOrderCheckResponse;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceResponse;
import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.PlaceOrderResponse;
import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkBody;
import com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkResponse;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistoryOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.CancelSpotDcaOrderBody;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.EditStrategyNameReq;
import com.okinc.unify_trade.biz.FundingRateArbResult;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.bot.EarnPayoutHistoryResponseDto;
import com.okinc.unify_trade.biz.bot.EditEarnRequestDto;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.vAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC50055vAf {
    @POST("/priapi/v5/algo/spot-dca/manual-add-order")
    java.lang.Object AEQbTJ(@Body @NotNull AddOrderBody addOrderBody, @NotNull Continuation<? super ResponseData<java.util.List<PlaceOrderResponse>>> continuation);

    @POST("/priapi/v5/algo/trade/order")
    java.lang.Object AEQbTJ(@Body AiOrderReq aiOrderReq, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/trade/contract-dca/order")
    java.lang.Object AEQbTJ(@Body @NotNull DcaOrderReq dcaOrderReq, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/trade/smart-portfolio/order")
    java.lang.Object AEQbTJ(@Body @NotNull SmartPortfolioReq smartPortfolioReq, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @GET("priapi/v5/account/bills-archive")
    java.lang.Object AEQbTJ(@Query("sId") java.lang.Long l, @NotNull @Query("instType") java.lang.String str, @NotNull @Query("subType") java.lang.String str2, @NotNull @Query("_start") java.lang.String str3, @NotNull @Query("_end") java.lang.String str4, @NotNull @Query("limit") java.lang.String str5, @NotNull Continuation<? super ResponseData<java.util.List<BillsArchive>>> continuation);

    @GET("/priapi/v5/algo/public/grid-margin-usage")
    java.lang.Object AEQbTJ(@NotNull @Query("instId") java.lang.String str, @Query("gridNum") int i, @NotNull @Query("maxPx") java.lang.String str2, @NotNull @Query("minPx") java.lang.String str3, @NotNull @Query("runType") java.lang.String str4, @Query("triggerStrategy") java.lang.String str5, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) java.lang.String str6, @Query("basePosition") java.lang.Boolean bool, @Query("leverage") java.lang.String str7, @Query("actualMarginSz") java.lang.String str8, @Query("extraMarginSz") java.lang.String str9, @NotNull Continuation<? super ResponseData<java.util.List<MarginUsage>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/staking-profit-list")
    java.lang.Object AEQbTJ(@NotNull @Query("algoId") java.lang.String str, @Query("accountId") long j, @NotNull @Query("ccy") java.lang.String str2, @Query("pageIndex") int i, @Query("pageSize") int i2, @NotNull Continuation<? super ResponseData<java.util.List<ArbitrageStakingProfitsResponse>>> continuation);

    @GET("/priapi/v5/algo/grid/reinvested-profits")
    java.lang.Object AEQbTJ(@NotNull @Query("algoId") java.lang.String str, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query("limit") java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.List<GridReinvestedProfitsQueryVO>>> continuation);

    @GET("/priapi/v5/algo/trade/trade-list")
    java.lang.Object AEQbTJ(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("type") java.lang.String str2, @NotNull @Query("cycleId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<TradeListResp>>> continuation);

    @GET("/priapi/v5/algo/dca/event-history")
    java.lang.Object AEQbTJ(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("algoOrdType") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<GridEventHistoryDto>>> continuation);

    @GET("/priapi/v5/algo/public/home/arbitrage")
    java.lang.Object AEQbTJ(@Query("instFamily") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<HomeArbitrageResponse>>> continuation);

    @GET("/priapi/v5/algo/backtest/list-preview")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<BacktestListPreviewDto>>> continuation);

    @POST("/priapi/v5/algo/dca/preview")
    java.lang.Object AEQbTJ(@Body @NotNull wTJ wtj, @NotNull Continuation<? super ResponseData<java.util.List<DcaPreviewResponse>>> continuation);

    @GET("/priapi/v5/algo/trade/positions")
    java.lang.Object AYXKKw(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<StrategyPositionResponse>>> continuation);

    @GET("/priapi/v5/algo/public/config")
    java.lang.Object AhwBna(@NotNull @Query("strategyType") java.lang.String str, @NotNull @Query("instId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<StrategyConfigInfo>>> continuation);

    @GET("/priapi/v5/algo/trade/ai/disclaimer/get")
    java.lang.Object AhwBna(@NotNull @Query("disclaimerName") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<LlmDisclaimerInfoDto>>> continuation);

    @GET("/priapi/v5/algo/backtest/copy-config")
    java.lang.Object AkhnZx(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<AiCopyConfigResponseDto>>> continuation);

    @GET("/priapi/v5/algo/trade/ai/getInstruments")
    java.lang.Object AuCTel(@Query("instType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<java.lang.String>>> continuation);

    @GET("priapi/v5/public/price-limit")
    java.lang.Object DbNXlk(@NotNull @Query("instId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<LimitPriceData>>> continuation);

    @POST("/priapi/v5/algo/trade/order")
    java.lang.Object EZpvd(@Body @NotNull StrategyReq strategyReq, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/trade/edit-earn")
    java.lang.Object EZpvd(@Body @NotNull EditEarnRequestDto editEarnRequestDto, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @GET("/priapi/v5/algo/backtest/list")
    java.lang.Object EZpvd(@Query("status") java.lang.String str, @Query("limit") java.lang.Integer num, @Query(TtmlNode.RUBY_AFTER) java.lang.String str2, @Query("requireProfits") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<java.util.List<StrategyPendingListResp>>> continuation);

    @GET("/priapi/v5/algo/grid/withdrawn-profits")
    java.lang.Object EZpvd(@NotNull @Query("algoId") java.lang.String str, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query("limit") java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.List<GridWithdrawnProfitsQueryVO>>> continuation);

    @GET("/priapi/v5/algo/public/trade/arbitrage/info")
    java.lang.Object EZpvd(@NotNull @Query("instFamily") java.lang.String str, @Query("totalAmt") java.lang.String str2, @NotNull @Query("arbType") java.lang.String str3, @Query("spreadRatio") java.lang.String str4, @Query("algoId") java.lang.String str5, @NotNull @Query("queryScene") java.lang.String str6, @Query("leveragePrincipal") java.lang.Float f, @Query("subArbTypes") SubArbitrageType4Remote subArbitrageType4Remote, @Query("stopType") java.lang.String str7, @NotNull Continuation<? super ResponseData<java.util.List<ArbitrageInfoResponse>>> continuation);

    @GET("/priapi/v5/algo/public/user-query-pop-ups")
    java.lang.Object EZpvd(@NotNull @Query("type") java.lang.String str, @NotNull @Query("strategyType") java.lang.String str2, @NotNull @Query("ts") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<UserPopUpDto>>> continuation);

    @GET("/priapi/v5/algo/trade/ai/history-events")
    java.lang.Object EZpvd(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("ordType") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<GridEventHistoryDto>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/withdraw")
    java.lang.Object EZpvd(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<SmartArbWithdrawProfitResponse>>> continuation);

    @GET("/priapi/v5/algo/trade/ai/home")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<AiHomeDto>>> continuation);

    @POST("/priapi/v5/algo/trade/recurring/audit-strategy-name")
    java.lang.Object EZpvd(@Body @NotNull C51011vev c51011vev, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v5/algo/backtest/edit-strategy-name")
    java.lang.Object KWHzl(@Body @NotNull EditStrategyNameReq editStrategyNameReq, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v5/algo/public/recurring/min-investment ")
    java.lang.Object KWHzl(@Body @NotNull MinInvestReq minInvestReq, @NotNull Continuation<? super ResponseData<java.util.List<MinInvestResp>>> continuation);

    @GET("/priapi/v5/algo/spot-dca/manual-add-order-check")
    java.lang.Object KWHzl(@NotNull @Query("algoId") java.lang.String str, @Query("px") java.lang.String str2, @NotNull @Query("amt") java.lang.String str3, @NotNull @Query("ordType") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<AddOrderCheckResponse>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/funding-fee-income")
    java.lang.Object KWHzl(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("timeZone") java.lang.String str2, @NotNull @Query("isHistory") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<FundingFeeIncomeResponse>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/estimated-reduce-info")
    java.lang.Object KWHzl(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("percentage") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<EstReduceInfo>>> continuation);

    @GET("/priapi/v5/algo/marketplace/dropdown-info")
    java.lang.Object KWHzl(@NotNull @Query("algoOrdType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<HomeStrategyDropDownInfo>>> continuation);

    @GET("/priapi/v5/algo/public/ai/getDefaultPromptTemplate")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<DefaultPromptTemplateDto>>> continuation);

    @POST("/priapi/v5/algo/public/user-set-pop-ups")
    java.lang.Object OLrzqt(@Body @NotNull SetUserPopUpRequest setUserPopUpRequest, @NotNull Continuation<? super ResponseData<java.util.List<UserPopUpDto>>> continuation);

    @POST("/priapi/v5/algo/trade/arbitrage/withdraw")
    java.lang.Object OLrzqt(@Body @NotNull SmartArbWithdrawProfitBody smartArbWithdrawProfitBody, @NotNull Continuation<? super ResponseData<java.util.List<WithdrawProfitResponse>>> continuation);

    @POST("/priapi/v5/algo/spot-dca/cancel-manual-order")
    java.lang.Object OLrzqt(@Body @NotNull CancelSpotDcaOrderBody cancelSpotDcaOrderBody, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/trade/dca/order")
    java.lang.Object OLrzqt(@Body @NotNull DcaOrderReq dcaOrderReq, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/backtest/delete")
    java.lang.Object OLrzqt(@Body @NotNull StrategyStopReq strategyStopReq, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v5/algo/public/grid-min-investment")
    java.lang.Object OLrzqt(@Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) java.lang.String str, @NotNull @Query("instId") java.lang.String str2, @Query("gridNum") java.lang.String str3, @Query("maxPx") java.lang.String str4, @NotNull @Query("minPx") java.lang.String str5, @Query("runType") int i, @Query(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) java.lang.String str6, @Query("basePos") java.lang.Boolean bool, @Query("investmentData") java.lang.String str7, @Query("perGridProfitRatio") java.lang.String str8, @Query("sourceAlgoId") java.lang.String str9, @Query("trailingUpStopPx") java.lang.String str10, @Query("trailingDownStopPx") java.lang.String str11, @Query("triggerStrategy") java.lang.String str12, @Query("sourceCcy") java.lang.String str13, @Query("autoReserve") java.lang.Boolean bool2, @Query("triggerPx") java.lang.String str14, @NotNull Continuation<? super ResponseData<java.util.List<MinInvestResp>>> continuation);

    @GET("/priapi/v5/algo/earn/config")
    java.lang.Object OLrzqt(@NotNull @Query("strategyType") java.lang.String str, @NotNull @Query("instId") java.lang.String str2, @NotNull @Query("tradeQuoteCcy") java.lang.String str3, @NotNull @Query("ccys") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<AutoEarnStakingQueryConfig>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/liquid-price")
    java.lang.Object OLrzqt(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("ccy") java.lang.String str2, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<PostWithdrawLiquidationPriceResponse>>> continuation);

    @GET("/priapi/v5/algo/public/arbitrage/funding-rate-arbitrage")
    java.lang.Object OLrzqt(@NotNull @Query("type") java.lang.String str, @NotNull @Query("ccyType") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<FundingRateArbResult>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/history-events")
    java.lang.Object OLrzqt(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<HistoryEventsDto>>> continuation);

    @GET("/priapi/v5/algo/public/strategy-type")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<BotCategoryConfig>>> continuation);

    @POST("/priapi/v5/algo/position/adjust-margin-balance")
    java.lang.Object copydefault(@Body @NotNull AdjustMarginBalanceRequest adjustMarginBalanceRequest, @NotNull Continuation<? super ResponseData<java.util.List<AdjustMarginBalanceResponse>>> continuation);

    @POST("/priapi/v5/algo/share/create-link")
    java.lang.Object copydefault(@Body @NotNull SignalCloneCreateLinkBody signalCloneCreateLinkBody, @NotNull Continuation<? super ResponseData<java.util.List<SignalCloneCreateLinkResponse>>> continuation);

    @POST("/priapi/v5/algo/contract-dca/cancel-manual-order")
    java.lang.Object copydefault(@Body @NotNull EditContractDcaReq editContractDcaReq, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/trade/recurring/order")
    java.lang.Object copydefault(@Body @NotNull RecurringOrderData recurringOrderData, @NotNull Continuation<? super ResponseData<java.util.List<StrategyResponse>>> continuation);

    @POST("/priapi/v5/algo/backtest/stop")
    java.lang.Object copydefault(@Body @NotNull StrategyStopReq strategyStopReq, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v5/algo/trade/order-pending-all/planet-bots")
    java.lang.Object copydefault(@Query("limit") java.lang.Integer num, @Query(TtmlNode.RUBY_AFTER) java.lang.String str, @Query("requireProfits") boolean z, @Query("algoId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<BotDto>>> continuation);

    @GET("/priapi/v5/algo/trade/earn-history")
    java.lang.Object copydefault(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("ccy") java.lang.String str2, @Query("pageIndex") int i, @Query("pageSize") int i2, @NotNull Continuation<? super ResponseData<java.util.List<EarnPayoutHistoryResponseDto>>> continuation);

    @GET("priapi/v5/algo/trade/earn-history")
    java.lang.Object copydefault(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("earnType") java.lang.String str2, @NotNull @Query("ccy") java.lang.String str3, @Query("pageIndex") int i, @Query("pageSize") int i2, @NotNull Continuation<? super ResponseData<java.util.List<AutoEarnStakingProfitHistoryOverView>>> continuation);

    @GET("/priapi/v5/account/max-available")
    java.lang.Object copydefault(@Query("excludeOrderId") java.lang.String str, @Query("excludeAlgoId") java.lang.String str2, @NotNull @Query("instId") java.lang.String str3, @Query("ccy") java.lang.String str4, @Query("px") java.lang.String str5, @NotNull @Query("tdMode") java.lang.String str6, @Query("reduceOnly") java.lang.Boolean bool, @Query(OtcExtraKeys.SIDE) java.lang.String str7, @Query("posMode") java.lang.String str8, @Query("needTransfer") java.lang.String str9, @Query("sz") java.lang.String str10, @Query("ordType") java.lang.String str11, @Query("tgtCcy") java.lang.String str12, @Query("quickMgnType") java.lang.String str13, @Query("unSpotOffset") java.lang.Boolean bool2, @Query("buySz") java.lang.String str14, @Query("sellSz") java.lang.String str15, @Query("baseOnPositionDebt") java.lang.Boolean bool3, @NotNull @Query("needQueryAssetAndEarn") java.lang.String str16, @Query("tradeQuoteCcy") java.lang.String str17, @NotNull Continuation<? super ResponseData<java.util.List<MaxAvailableResp>>> continuation);

    @GET("/priapi/v5/algo/recurring/history-events")
    java.lang.Object copydefault(@NotNull @Query("algoId") java.lang.String str, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query("limit") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<RecurringEventHistoryDto>>> continuation);

    @GET("/priapi/v5/algo/position/margin-balance")
    java.lang.Object copydefault(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("type") java.lang.String str2, @NotNull @Query("amt") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<PositionMarginBalanceResponse>>> continuation);

    @GET("priapi/v5/algo/earn/overview")
    java.lang.Object copydefault(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("earnType") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<AutoEarnOverView>>> continuation);

    @GET("/priapi/v5/algo/trade/arbitrage/interestInfo")
    java.lang.Object copydefault(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<InterestInfoResponse>>> continuation);

    @GET("/priapi/v5/rubik/mcp/supported-indicators")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<TechnicalIndicatorsResponseDto>>> continuation);

    @POST("/priapi/v5/algo/trade/arbitrage/reduce")
    java.lang.Object copydefault(@Body @NotNull C51014vey c51014vey, @NotNull Continuation<? super ResponseData<java.util.List<ReduceResultVo>>> continuation);

    @POST("/priapi/v5/algo/contract-dca/terminate-cycle")
    java.lang.Object copydefault(@Body @NotNull C51015vez c51015vez, @NotNull Continuation<? super ResponseData<java.util.List<C51015vez>>> continuation);

    @GET("/priapi/v5/algo/spot-dca/manual-add-order-available-balance")
    java.lang.Object djBIcL(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<AvailableBalanceResponse>>> continuation);

    @GET("/priapi/v5/market/ticker")
    java.lang.Object fetchVPNInfo(@NotNull @Query("instId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    @GET("/priapi/v5/algo/trade/ai/detail")
    java.lang.Object gEmmrt(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<AiDetailResponseDto>>> continuation);

    @GET("/priapi/v5/algo/public/algo-info")
    java.lang.Object isConnected(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<StrategyDetailsResponse>>> continuation);

    @GET("/priapi/v5/algo/grid/history-events")
    java.lang.Object valueOf(@NotNull @Query("algoId") java.lang.String str, @NotNull @Query("ordType") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<GridEventHistoryDto>>> continuation);

    @GET("/priapi/v5/algo/backtest/info")
    java.lang.Object valueOf(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<StrategyDetailsResponse>>> continuation);

    @GET("/priapi/v5/algo/backtest/detail")
    java.lang.Object values(@NotNull @Query("algoId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<AiDetailResponseDto>>> continuation);

    /* JADX INFO: renamed from: o.vAf$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object fetchEarnPayoutHistory$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchEarnPayoutHistory");
            }
            if ((i3 & 4) != 0) {
                i = 1;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = 20;
            }
            return interfaceC50055vAf.copydefault(str, str2, i4, i2, (Continuation<? super ResponseData<java.util.List<EarnPayoutHistoryResponseDto>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getMaxAvailable$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool2, java.lang.String str14, java.lang.String str15, java.lang.Boolean bool3, java.lang.String str16, java.lang.String str17, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.copydefault((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : bool, str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : bool2, (32768 & i) != 0 ? null : str14, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : bool3, (262144 & i) != 0 ? "0" : str16, (i & 524288) != 0 ? null : str17, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMaxAvailable");
        }

        public static /* synthetic */ java.lang.Object fetchHomeArbitrage$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchHomeArbitrage");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC50055vAf.AEQbTJ(str, (Continuation<? super ResponseData<java.util.List<HomeArbitrageResponse>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object fetchArbitrageInfo$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Float f, SubArbitrageType4Remote subArbitrageType4Remote, java.lang.String str7, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.EZpvd(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : subArbitrageType4Remote, (i & 256) != 0 ? null : str7, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchArbitrageInfo");
        }

        public static /* synthetic */ java.lang.Object fetchArbitrageStakingProfitsUseCase$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, long j, java.lang.String str2, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.AEQbTJ(str, j, str2, (i3 & 8) != 0 ? 1 : i, (i3 & 16) != 0 ? 20 : i2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchArbitrageStakingProfitsUseCase");
        }

        public static /* synthetic */ java.lang.Object earnProfitHistory$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: earnProfitHistory");
            }
            if ((i3 & 8) != 0) {
                i = 1;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = 20;
            }
            return interfaceC50055vAf.copydefault(str, str2, str3, i4, i2, continuation);
        }

        public static /* synthetic */ java.lang.Object getOngoingBotsForShare$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.Integer num, java.lang.String str, boolean z, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOngoingBotsForShare");
            }
            java.lang.Integer num2 = (i & 1) != 0 ? null : num;
            java.lang.String str3 = (i & 2) != 0 ? null : str;
            if ((i & 4) != 0) {
                z = true;
            }
            return interfaceC50055vAf.copydefault(num2, str3, z, (i & 8) != 0 ? null : str2, (Continuation<? super ResponseData<java.util.List<BotDto>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getGridReinvestedProfits$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.AEQbTJ(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridReinvestedProfits");
        }

        public static /* synthetic */ java.lang.Object getGridWithdrawnProfits$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.EZpvd(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (Continuation<? super ResponseData<java.util.List<GridWithdrawnProfitsQueryVO>>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridWithdrawnProfits");
        }

        public static /* synthetic */ java.lang.Object getMinInvestment$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool2, java.lang.String str14, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.OLrzqt(str, str2, str3, str4, str5, i, str6, bool, str7, str8, (i2 & 1024) != 0 ? null : str9, (i2 & 2048) != 0 ? null : str10, (i2 & 4096) != 0 ? null : str11, (i2 & 8192) != 0 ? null : str12, (i2 & 16384) != 0 ? null : str13, (32768 & i2) != 0 ? java.lang.Boolean.TRUE : bool2, (i2 & 65536) != 0 ? null : str14, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMinInvestment");
        }

        public static /* synthetic */ java.lang.Object fetchRecurringHistoryEvents$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.copydefault(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (Continuation<? super ResponseData<java.util.List<RecurringEventHistoryDto>>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRecurringHistoryEvents");
        }

        public static /* synthetic */ java.lang.Object getBacktestList$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBacktestList");
            }
            java.lang.String str3 = (i & 1) != 0 ? null : str;
            java.lang.Integer num2 = (i & 2) != 0 ? null : num;
            java.lang.String str4 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                bool = java.lang.Boolean.TRUE;
            }
            return interfaceC50055vAf.EZpvd(str3, num2, str4, bool, (Continuation<? super ResponseData<java.util.List<StrategyPendingListResp>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getGridMarginUsage$default(InterfaceC50055vAf interfaceC50055vAf, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.String str8, java.lang.String str9, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC50055vAf.AEQbTJ(str, i, str2, str3, str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : bool, str7, str8, str9, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGridMarginUsage");
        }
    }
}
