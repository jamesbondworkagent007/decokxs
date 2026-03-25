package o;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeParam;
import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CanCreateStrategyRequest;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CreateOrderResult;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.bean.AddressCheckVo;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.BlackListTypes;
import com.okinc.business.dexlogic.bean.BridgeApproveInfoReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastResponse;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataResponse;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.CheckServiceOfflineBean;
import com.okinc.business.dexlogic.bean.CloseAccountBean;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ExtendOrderBroadcast;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData;
import com.okinc.business.dexlogic.bean.IntentQuoteCallData;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.dexlogic.bean.MemeTokenInfo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PreCheckParam;
import com.okinc.business.dexlogic.bean.QuotaInfoBean;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallDataReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.RepeatOrderResponse;
import com.okinc.business.dexlogic.bean.SaveIntentBridgeOrderData;
import com.okinc.business.dexlogic.bean.SaveIntentOrderData;
import com.okinc.business.dexlogic.bean.SelfSwapStatus;
import com.okinc.business.dexlogic.bean.SellMemeConfigBean;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.bean.TokenMarketInfoResponse;
import com.okinc.business.dexlogic.bean.TokenPriceResponse;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse;
import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryChangeResponse;
import com.okinc.business.trade.features.home.ui.autosell.data.TPSLRemoteConfigResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.MemeSearchBean;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.huQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23234huQ {
    public static final TaskDescription Companion = TaskDescription.copydefault;

    @POST("/priapi/v1/dx/trade/multi/v2/tokenAdd")
    java.lang.Object AEQbTJ(@Body @NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super ResponseData<java.util.List<DexMultiTokenInfoBean>>> continuation);

    @POST("/priapi/v6/dx/trade/multi/preCheck")
    java.lang.Object AEQbTJ(@Body @NotNull PreCheckParam preCheckParam, @NotNull Continuation<? super ResponseData<PreCheckBean>> continuation);

    @POST("/priapi/v1/dx/market/v2/trading-history/filter-list")
    java.lang.Object AEQbTJ(@Body @NotNull HistoryChangeFilterRequest historyChangeFilterRequest, @NotNull Continuation<? super ResponseData<HistoryChangeResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading/metrics")
    java.lang.Object AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<TokenPriceResponse>> continuation);

    @GET("/priapi/v1/dx/trade/multi/v2/meme/default/configs")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<SellMemeConfigBean>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/slippage/configs")
    AbstractC58185ywX<ResponseData<java.util.List<SlippageConfigVo>>> AEQbTJ();

    @POST("/priapi/v1/dx/trade/bridge/common/check")
    AbstractC58185ywX<ResponseData<CrossChainBridgeRulesData>> AEQbTJ(@Body @NotNull CrossChainBridgeRulesRequest crossChainBridgeRulesRequest);

    @POST("/priapi/v1/dx/trade/multi/v2/tokenAdd")
    AbstractC58185ywX<ResponseData<java.util.List<DexMultiTokenInfoBean>>> AEQbTJ(@Body @NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq);

    @POST("/priapi/v1/dx/trade/bridge/intent/orderSubmit")
    AbstractC58185ywX<ResponseData<SaveIntentData>> AEQbTJ(@Body @NotNull SaveIntentBridgeOrderData saveIntentBridgeOrderData);

    @GET("/priapi/v1/dx/trade/multi/liquidityList")
    AbstractC58185ywX<ResponseData<java.util.List<LiquidityListItem>>> AEQbTJ(@NotNull @Query("chainId") java.lang.String str);

    @GET("/priapi/v1/dx/trade/multi/callData/close")
    AbstractC58185ywX<ResponseData<CloseAccountBean>> AEQbTJ(@NotNull @Query("orderId") java.lang.String str, @NotNull @Query("userWalletAddress") java.lang.String str2);

    @GET("/priapi/v1/dx/trade/bridge/dapp-list")
    AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> AEQbTJ(@NotNull @Query("fromChainId") java.lang.String str, @NotNull @Query("fromTokenAddress") java.lang.String str2, @NotNull @Query("toChainId") java.lang.String str3, @NotNull @Query("toTokenAddress") java.lang.String str4);

    @POST("/priapi/v1/dx/trade/multi/dusttoken/check-repeat")
    java.lang.Object EZpvd(@Body @NotNull CheckRepeatParam checkRepeatParam, @NotNull Continuation<? super ResponseData<CheckRepeatResult>> continuation);

    @GET("/priapi/v1/dx/trade/multi/cefi/mode/myAssetsTokenList")
    java.lang.Object EZpvd(@NotNull @Query("userUniqueId") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @Query("chainId") java.lang.String str3, @Query("tokenContractAddress") java.lang.String str4, @Query("hideQuoteToken") java.lang.String str5, @Query("orderBy") java.lang.String str6, @Query("desc") java.lang.String str7, @Query("filterChainIdList") java.lang.String str8, @Query("filterTokenAddressList") java.lang.String str9, @Query("minAmountThreshold") java.lang.String str10, @NotNull Continuation<? super ResponseData<java.util.List<DexMultiTokenInfoBean>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/cefi/mode/validateAndRecommendToken")
    java.lang.Object EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("quoteTokenAddress") java.lang.String str2, @NotNull @Query("baseTokenAddress") java.lang.String str3, @Query("userUniqueId") java.lang.String str4, @Query("accountId") java.lang.String str5, @NotNull @Query("type") java.lang.String str6, @NotNull Continuation<? super ResponseData<ValidateTokensResponse>> continuation);

    @GET("/priapi/v1/dx/trade/multi/meme/search")
    java.lang.Object EZpvd(@Query("chainId") java.lang.String str, @NotNull @Query("inputContent") java.lang.String str2, @NotNull @Query("accountId") java.lang.String str3, @NotNull @Query("userUniqueId") java.lang.String str4, @NotNull Continuation<? super ResponseData<MemeSearchBean>> continuation);

    @GET("/priapi/v1/dx/trade/multi/meme/openOrders")
    java.lang.Object EZpvd(@Query("chainId") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @Query("exchangeDirection") java.util.List<java.lang.String> list, @Query("strategyType") java.util.List<java.lang.String> list2, @Query("tokenContractAddress") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<OpenOrderData>>> continuation);

    @GET("/priapi/v1/dx/trade/preset/reset")
    java.lang.Object EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("presetType") java.lang.String str2, @NotNull Continuation<? super ResponseData<DexPresetResultVO>> continuation);

    @GET("/priapi/v1/dx/strategy/common/queryQuotaInfo")
    java.lang.Object EZpvd(@NotNull @Query("accountId") java.lang.String str, @NotNull Continuation<? super ResponseData<QuotaInfoBean>> continuation);

    @GET("/priapi/v1/dx/trade/multi/cefi/mode/configs")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<AdvancedMainConfig>>> continuation);

    @POST("/priapi/v6/dx/trade/multi/calldata")
    AbstractC58185ywX<ResponseData<V6CalldataResponseData>> EZpvd(@Body @NotNull V6CalldataRequest v6CalldataRequest);

    @GET("/priapi/v1/dx/trade/bridge/orders/details")
    AbstractC58185ywX<ResponseData<OrderDetailBean>> EZpvd(@NotNull @Query("orderId") java.lang.String str);

    @GET("/priapi/v1/dx/trade/multi/tokens/tx/status")
    AbstractC58185ywX<ResponseData<AddressCheckVo>> EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2);

    @GET("/priapi/v1/dx/public/swap/chain/ca-dapp-list")
    AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> EZpvd(@NotNull @Query("fromChainId") java.lang.String str, @NotNull @Query("toChainId") java.lang.String str2, @NotNull @Query("fromTokenAddress") java.lang.String str3, @NotNull @Query("toTokenAddress") java.lang.String str4);

    @GET("/priapi/v1/dx/trade/single/toastTokenCheck")
    AbstractC58185ywX<ResponseData<TokenCheckInfo>> EZpvd(@NotNull @Query("chainId") java.lang.String str, @Query("fromTokenAddress") java.lang.String str2, @Query("toTokenAddress") java.lang.String str3, @Query("accountId") java.lang.String str4, @Query("userUniqueId") java.lang.String str5);

    @GET("/priapi/v1/dx/trade/bridge/crossTokenCheck")
    AbstractC58185ywX<ResponseData<TokenCheckInfo>> EZpvd(@NotNull @Query("chainId") java.lang.String str, @Query("fromTokenAddress") java.lang.String str2, @Query("toChainId") java.lang.String str3, @Query("toTokenAddress") java.lang.String str4, @Query("walletId") java.lang.String str5, @Query("userUniqueId") java.lang.String str6);

    @POST("/priapi/v1/dx/trade/bridge/approve/save/broadcast")
    AbstractC58185ywX<ResponseData<ApproveResultInfo>> EZpvd(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull BridgeApproveInfoReq bridgeApproveInfoReq, @Header("Encrypt-Strategy") @NotNull java.lang.String str);

    @POST("/priapi/v1/dx/trade/bridge/v3/quote/callData")
    AbstractC58185ywX<ResponseData<QuoteCallData>> EZpvd(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull QuoteCallDataReq quoteCallDataReq, @Header("sign") @NotNull java.lang.String str, @Header("Encrypt-Strategy") @NotNull java.lang.String str2);

    @POST("/priapi/v1/dx/trade/bridge/order/save/broadcast")
    AbstractC58185ywX<ResponseData<java.lang.Object>> EZpvd(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull SwapOrderInfoReq swapOrderInfoReq, @Header("Encrypt-Strategy") @NotNull java.lang.String str);

    @POST("/priapi/v1/dx/trade/multi/dusttoken/quote")
    java.lang.Object KWHzl(@Body @NotNull DustTokenQuoteParam dustTokenQuoteParam, @NotNull Continuation<? super ResponseData<SmallAssetQuoteData>> continuation);

    @POST("/priapi/v1/dx/trade/multi/boost/estimateVolume")
    java.lang.Object KWHzl(@Body @NotNull BoostEstimateVolumeParam boostEstimateVolumeParam, @NotNull Continuation<? super ResponseData<BoostEstimateVolumeResponse>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/copyTrade/modify")
    java.lang.Object KWHzl(@Body @NotNull CopyTradingStrategy copyTradingStrategy, @NotNull Continuation<? super ResponseData<JsonElement>> continuation);

    @GET("/priapi/v1/dx/trade/multi/toastTokenCheck")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenAddress") java.lang.String str2, @NotNull @Query("walletAddress") java.lang.String str3, @NotNull @Query("accountId") java.lang.String str4, @NotNull @Query("userUniqueId") java.lang.String str5, @NotNull Continuation<? super ResponseData<CoinDetailTradeJumpBean>> continuation);

    @GET("/priapi/v1/dx/trade/multi/meme/currencyTokenList")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tradeType") java.lang.String str2, @NotNull @Query("accountId") java.lang.String str3, @NotNull @Query("userUniqueId") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<MemeCurrencyBean>>> continuation);

    @GET("/priapi/v1/dx/strategy/copyTrade/getDefaultConfig")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @Query("userWalletAddress") java.lang.String str2, @Query("refCode") java.lang.String str3, @NotNull Continuation<? super ResponseData<CopyTradingDefaultConfig>> continuation);

    @GET("/priapi/v1/dx/market/v2/tokenomics/metrics")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<TokenMarketInfoResponse>> continuation);

    @GET("/priapi/v1/dx/trade/multi/cefi/mode/realTimeOrderHistoryFilterConfig")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<AdvancedOrderBookFilter>>> continuation);

    @GET("/priapi/v1/dx/public/app/swap/chain/list")
    java.lang.Object KWHzl(@Query("supportCefiMode") boolean z, @NotNull Continuation<? super ResponseData<java.util.List<DefiChainInfo>>> continuation);

    @GET("priapi/v1/dx/trade/multi/orders/details")
    AbstractC58185ywX<ResponseData<OrderDetailBean>> KWHzl(@NotNull @Query("orderId") java.lang.String str);

    @GET("/priapi/v1/dx/trade/bridge/approveData")
    AbstractC58185ywX<ResponseData<ApproveUnsignedData>> KWHzl(@NotNull @Query("userWalletAddress") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull @Query("cancelApproveTag") java.lang.String str4, @Query("defiPlatformId") java.lang.String str5);

    @GET("/priapi/v1/dx/trade/multi/approveData")
    AbstractC58185ywX<ResponseData<ApproveUnsignedData>> KWHzl(@NotNull @Query("userWalletAddress") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull @Query("toTokenContractAddress") java.lang.String str4, @NotNull @Query("cancelApproveTag") java.lang.String str5, @Query("defiPlatformId") java.lang.String str6);

    @GET("/priapi/v1/dx/trade/intent/quote/callData")
    AbstractC58185ywX<ResponseData<IntentQuoteCallData>> KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("toChainId") java.lang.String str2, @Query("userWalletAddress") java.lang.String str3, @NotNull @Query("fromTokenAddress") java.lang.String str4, @NotNull @Query("toTokenAddress") java.lang.String str5, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str6, @NotNull @Query("slippage") java.lang.String str7, @Query("defiPlatformId") java.lang.String str8);

    @InterfaceC9841bdG
    @POST("/priapi/v6/dx/trade/multi/broadcast")
    AbstractC58185ywX<ResponseData<V6BroadcastResponseData>> KWHzl(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull V6BroadcastRequest v6BroadcastRequest);

    @POST("/priapi/v1/dx/trade/multi/dusttoken/order")
    java.lang.Object OLrzqt(@Body @NotNull SmallAssetOrderParam smallAssetOrderParam, @NotNull Continuation<? super ResponseData<JsonElement>> continuation);

    @POST("/priapi/v1/dx/strategy/copyTrade/checkCreateStrategy")
    java.lang.Object OLrzqt(@Body @NotNull CanCreateStrategyRequest canCreateStrategyRequest, @NotNull Continuation<? super ResponseData<JsonElement>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/copyTrade/create")
    java.lang.Object OLrzqt(@Body @NotNull CopyTradingStrategy copyTradingStrategy, @NotNull Continuation<? super ResponseData<CreateOrderResult>> continuation);

    @GET("/priapi/v1/dx/trade/multi/approveData")
    java.lang.Object OLrzqt(@NotNull @Query("userWalletAddress") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull @Query("toTokenContractAddress") java.lang.String str4, @NotNull @Query("cancelApproveTag") java.lang.String str5, @Query("defiPlatformId") java.lang.String str6, @NotNull Continuation<? super ResponseData<ApproveUnsignedData>> continuation);

    @GET("/priapi/v1/dx/trade/multi/app/getTokenInfo")
    java.lang.Object OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("walletId") java.lang.String str2, @NotNull @Query("tokenContractAddress") java.lang.String str3, @NotNull @Query("userUniqueId") java.lang.String str4, @NotNull @Query("userWalletAddress") java.lang.String str5, @NotNull Continuation<? super ResponseData<DexMultiTokenInfoBean>> continuation);

    @GET("/priapi/v6/dx/trade/multi/saving/summary")
    java.lang.Object OLrzqt(@NotNull @Query("accountId") java.lang.String str, @NotNull Continuation<? super ResponseData<SavingsSummaryResponse>> continuation);

    @GET("/priapi/v1/dx/trade/multi/checkServiceOffLine")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<CheckServiceOfflineBean>> continuation);

    @POST("/priapi/v6/dx/trade/multi/marketQuoteAndCalldata")
    AbstractC58185ywX<ResponseData<V6QuoteAndCalldataResponseData>> OLrzqt(@Body @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest);

    @POST("/priapi/v1/dx/trade/bridge/callData")
    AbstractC58185ywX<ResponseData<UnsignedSwapData>> OLrzqt(@Body @NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, @Header("sign") @NotNull java.lang.String str, @Header("Encrypt-Strategy") @NotNull java.lang.String str2);

    @GET("/priapi/v1/dx/trade/multi/meme/marketTokenInfo")
    AbstractC58185ywX<ResponseData<MemeTokenInfo>> OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2);

    @GET("/priapi/v1/dx/trade/multi/order/checkContinue")
    AbstractC58185ywX<ResponseData<CheckContinueBean>> OLrzqt(@NotNull @Query("fromChainId") java.lang.String str, @NotNull @Query("toChainId") java.lang.String str2, @NotNull @Query("userWalletAddress") java.lang.String str3, @NotNull @Query("swapTradeType") java.lang.String str4);

    @GET("/priapi/v1/dx/trade/multi/app/getTokenInfo")
    AbstractC58185ywX<ResponseData<DexMultiTokenInfoBean>> OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("walletId") java.lang.String str2, @NotNull @Query("tokenContractAddress") java.lang.String str3, @NotNull @Query("userUniqueId") java.lang.String str4, @NotNull @Query("userWalletAddress") java.lang.String str5);

    @GET("/priapi/v1/dx/trade/bridge/crossTokenCheck")
    AbstractC58185ywX<ResponseData<TokenCheckInfo>> OLrzqt(@Query("chainId") java.lang.String str, @Query("fromTokenAddress") java.lang.String str2, @Query("toChainId") java.lang.String str3, @Query("toTokenAddress") java.lang.String str4, @Query("userUniqueId") java.lang.String str5, @Query("walletId") java.lang.String str6);

    @GET("/priapi/v1/dx/trade/bridge/intent/quote/calldata")
    AbstractC58185ywX<ResponseData<IntentBridgeQuoteCallData>> OLrzqt(@Query("bridgeId") java.lang.String str, @Query("slippage") java.lang.String str2, @Query("toChainId") java.lang.String str3, @Query("receiveWalletAddress") java.lang.String str4, @Query("userWalletAddress") java.lang.String str5, @Query("chainId") java.lang.String str6, @Query("fromTokenAddress") java.lang.String str7, @Query("toTokenAddress") java.lang.String str8, @Query(OtcExtraKeys.AMOUNT) java.lang.String str9);

    @POST("/priapi/v1/dx/trade/bridge/v3/quote")
    AbstractC58185ywX<ResponseData<QuotePriceRes>> OLrzqt(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    @POST("/priapi/v1/dx/trade/multi/approve/save/broadcast")
    AbstractC58185ywX<ResponseData<ApproveResultInfo>> OLrzqt(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull SwapApproveInfoReq swapApproveInfoReq, @Header("Encrypt-Strategy") @NotNull java.lang.String str);

    @POST("/priapi/v1/dx/trade/preset/save")
    java.lang.Object copydefault(@Body @NotNull PresetUserParams presetUserParams, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v1/dx/trade/multi/batchGetTokenApproveInfo")
    java.lang.Object copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("userWalletAddress") java.lang.String str2, @NotNull @Query("tokenContractAddress") java.lang.String str3, @NotNull @Query("toTokenContractAddress") java.lang.String str4, @NotNull @Query("defiPlatformIds") java.lang.String str5, @NotNull Continuation<? super ResponseData<java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/cefi/mode/priceTokenList")
    java.lang.Object copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("inputTokenAddress") java.lang.String str2, @Query("accountId") java.lang.String str3, @Query("userUniqueId") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<DexMultiTokenInfoBean>>> continuation);

    @GET("/priapi/v1/dx/trade/preset/config")
    java.lang.Object copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("walletAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<DexPresetResultVO>> continuation);

    @GET("/priapi/v6/dx/trade/multi/queryQuotaInfo")
    java.lang.Object copydefault(@NotNull @Query("accountId") java.lang.String str, @NotNull Continuation<? super ResponseData<QuotaInfoBean>> continuation);

    @GET("/priapi/v1/dx/strategy/limitOrder/tpSlConfig")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<TPSLRemoteConfigResponse>> continuation);

    @POST("/priapi/v6/dx/trade/multi/quote")
    AbstractC58185ywX<ResponseData<V6QuoteResponseData>> copydefault(@Body @NotNull V6QuoteRequest v6QuoteRequest);

    @POST("/priapi/v1/dx/trade/bridge/redeem/update/broadcast")
    AbstractC58185ywX<ResponseData<BridgeRedeemBroadcastResponse>> copydefault(@Body @NotNull BridgeRedeemBroadcastReq bridgeRedeemBroadcastReq);

    @POST("/priapi/v1/dx/trade/bridge/redeem/calldata")
    AbstractC58185ywX<ResponseData<BridgeRedeemCallDataResponse>> copydefault(@Body @NotNull BridgeRedeemCallDataReq bridgeRedeemCallDataReq);

    @POST("/priapi/v1/dx/trade/intent/createOrder")
    AbstractC58185ywX<ResponseData<SaveIntentData>> copydefault(@Body @NotNull SaveIntentOrderData saveIntentOrderData);

    @GET("/priapi/v1/dx/trade/multi/solana/redPoint")
    AbstractC58185ywX<ResponseData<SelfSwapStatus>> copydefault(@NotNull @Query("userWalletAddress") java.lang.String str);

    @GET("/priapi/v1/dx/trade/bridge/queryBlackList")
    AbstractC58185ywX<ResponseData<BlackListTypes>> copydefault(@NotNull @Query("userWalletAddress") java.lang.String str, @Query("receiveWalletAddress") java.lang.String str2);

    @GET("/priapi/v1/dx/trade/multi/batchGetTokenApproveInfo")
    AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>>> copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("userWalletAddress") java.lang.String str2, @NotNull @Query("tokenContractAddress") java.lang.String str3, @NotNull @Query("toTokenContractAddress") java.lang.String str4, @NotNull @Query("defiPlatformIds") java.lang.String str5);

    @GET("/priapi/v1/dx/trade/multi/order/checkRepeat")
    AbstractC58185ywX<ResponseData<RepeatOrderResponse>> copydefault(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    @POST("/priapi/v1/dx/trade/multi/extendOrder/broadcast")
    AbstractC58185ywX<ResponseData<java.lang.Object>> copydefault(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull ExtendOrderBroadcast extendOrderBroadcast);

    /* JADX INFO: renamed from: o.huQ$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC23234huQ EZpvd(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (InterfaceC23234huQ) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC23234huQ.class), c43280rmM);
        }
    }

    /* JADX INFO: renamed from: o.huQ$Application */
    public static final class Application {
        public static /* synthetic */ AbstractC58185ywX getBridgeCallData$default(InterfaceC23234huQ interfaceC23234huQ, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBridgeCallData");
            }
            if ((i & 4) != 0) {
                str2 = "TIME";
            }
            return interfaceC23234huQ.OLrzqt(defiMultiSwapOrderInfoReq, str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getBridgeQuoteOrCallData$default(InterfaceC23234huQ interfaceC23234huQ, java.util.Map map, QuoteCallDataReq quoteCallDataReq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBridgeQuoteOrCallData");
            }
            if ((i & 8) != 0) {
                str2 = "TIME";
            }
            return interfaceC23234huQ.EZpvd((java.util.Map<java.lang.String, java.lang.String>) map, quoteCallDataReq, str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX bridgeSaveOrderBroadCast$default(InterfaceC23234huQ interfaceC23234huQ, java.util.Map map, SwapOrderInfoReq swapOrderInfoReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bridgeSaveOrderBroadCast");
            }
            if ((i & 4) != 0) {
                str = "TIME";
            }
            return interfaceC23234huQ.EZpvd((java.util.Map<java.lang.String, java.lang.String>) map, swapOrderInfoReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX saveApproveBroadCast$default(InterfaceC23234huQ interfaceC23234huQ, java.util.Map map, SwapApproveInfoReq swapApproveInfoReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveApproveBroadCast");
            }
            if ((i & 4) != 0) {
                str = "TIME";
            }
            return interfaceC23234huQ.OLrzqt((java.util.Map<java.lang.String, java.lang.String>) map, swapApproveInfoReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX saveBridgeApproveBroadCast$default(InterfaceC23234huQ interfaceC23234huQ, java.util.Map map, BridgeApproveInfoReq bridgeApproveInfoReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveBridgeApproveBroadCast");
            }
            if ((i & 4) != 0) {
                str = "TIME";
            }
            return interfaceC23234huQ.EZpvd((java.util.Map<java.lang.String, java.lang.String>) map, bridgeApproveInfoReq, str);
        }

        public static /* synthetic */ java.lang.Object memeSearch$default(InterfaceC23234huQ interfaceC23234huQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: memeSearch");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC23234huQ.EZpvd(str, str2, str3, str4, (Continuation<? super ResponseData<MemeSearchBean>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getAdvancedPricingTokens$default(InterfaceC23234huQ interfaceC23234huQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC23234huQ.copydefault(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (Continuation<? super ResponseData<java.util.List<DexMultiTokenInfoBean>>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAdvancedPricingTokens");
        }

        public static /* synthetic */ java.lang.Object validateMarketTokens$default(InterfaceC23234huQ interfaceC23234huQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC23234huQ.EZpvd(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateMarketTokens");
        }

        public static /* synthetic */ java.lang.Object getAdvancedMyPositions$default(InterfaceC23234huQ interfaceC23234huQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC23234huQ.EZpvd(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, str10, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAdvancedMyPositions");
        }

        public static /* synthetic */ java.lang.Object openOrders$default(InterfaceC23234huQ interfaceC23234huQ, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC23234huQ.EZpvd((i & 1) != 0 ? null : str, str2, (java.util.List<java.lang.String>) list, (java.util.List<java.lang.String>) list2, (i & 16) != 0 ? null : str3, (Continuation<? super ResponseData<java.util.List<OpenOrderData>>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrders");
        }

        public static /* synthetic */ java.lang.Object checkTokensToTrade$default(InterfaceC23234huQ interfaceC23234huQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC23234huQ.KWHzl((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (Continuation<? super ResponseData<CoinDetailTradeJumpBean>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkTokensToTrade");
        }
    }
}
