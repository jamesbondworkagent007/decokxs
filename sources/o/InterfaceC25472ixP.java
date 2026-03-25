package o;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.invest_api.bean.Web3CampaignResponse;
import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import com.okinc.business.invest_biz.data.bean.CandleResultInfo;
import com.okinc.business.invest_biz.data.bean.CandleResultTvlInfo;
import com.okinc.business.invest_biz.data.bean.HomeLearnEarnVO;
import com.okinc.business.invest_biz.data.bean.HomeTabData;
import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestDetail;
import com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo;
import com.okinc.business.invest_biz.data.bean.InvestFilterData;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeResponse;
import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestPointsInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailParam;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import com.okinc.business.invest_biz.data.bean.InvestmentNetworkInfo;
import com.okinc.business.invest_biz.data.bean.PlatformRefreshResponse;
import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.bean.SearchRecommendResponse;
import com.okinc.business.invest_biz.data.bean.SecurityScoreInfo;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.data.bean.request.BonusPopupRequest;
import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailWarpReq;
import com.okinc.business.invest_biz.data.bean.request.DexRecommendRequestWrapper;
import com.okinc.business.invest_biz.data.bean.request.HomeOrderParam;
import com.okinc.business.invest_biz.data.bean.request.InvestMyInvestmentNewParam;
import com.okinc.business.invest_biz.data.bean.request.InvestOrderDetailsPageParam;
import com.okinc.business.invest_biz.data.bean.request.InvestProductDetailParam;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenDetailsReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam;
import com.okinc.business.invest_biz.data.bean.request.QueryInvestmentSecurityScoreParam;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.data.bean.response.BonusPopupDetailsResponse;
import com.okinc.business.invest_biz.data.bean.response.DashboardProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.bean.response.DashboardResponse;
import com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryResponse;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData;
import com.okinc.business.invest_biz.ui.screens.eventpage.SpecialZoneActivityParam;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import com.okinc.business.invest_biz.ui.widget.risk.InvestRiskRatingModel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.ixP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25472ixP {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    @GET("/priapi/v1/invest/app/products/dex/search/list")
    java.lang.Object AEQbTJ(@Query("tabId") int i, @Query("chainId") long j, @NotNull @Query("tokenAddress") java.lang.String str, @Query("pageNum") java.lang.Integer num, @NotNull @Query(OtcExtraKeys.ORDER) java.lang.String str2, @Query("property") java.lang.String str3, @NotNull Continuation<? super ResponseData<AggregateData>> continuation);

    @GET("/priapi/v1/dapp/boost/xstake/app/transaction/advanced/settings/new")
    java.lang.Object AEQbTJ(@Query("investmentId") long j, @Query("type") int i, @NotNull @Query("tokenAddress") java.lang.String str, @Query("stakeId") long j2, @NotNull Continuation<? super ResponseData<InvestGasPriceConfig>> continuation);

    @POST("/priapi/v1/invest/transaction/advanced/settings/new")
    java.lang.Object AEQbTJ(@Query("investmentId") long j, @Query("type") int i, @NotNull @Query("tokenAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<InvestGasPriceConfig>> continuation);

    @POST("/priapi/v1/invest/products/{investmentId}/tvl/chart")
    java.lang.Object AEQbTJ(@retrofit2.http.Path("investmentId") long j, @Query("type") int i, @NotNull Continuation<? super ResponseData<CandleResultTvlInfo>> continuation);

    @POST("/priapi/v1/invest/subscribe/token/list")
    java.lang.Object AEQbTJ(@Query("investmentId") long j, @NotNull @Query("accountId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<InvestTokenWithAmount>>> continuation);

    @POST("/priapi/v1/invest/app/transaction/callData")
    java.lang.Object AEQbTJ(@Body @NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    @POST("/priapi/v1/invest/app/transaction/claim/validate")
    java.lang.Object AEQbTJ(@Body @NotNull InvestGetGasFeeRequest investGetGasFeeRequest, @NotNull Continuation<? super ResponseData<InvestGetGasFeeResponse>> continuation);

    @POST("/priapi/v1/invest/app/orders/details/page")
    java.lang.Object AEQbTJ(@Body @NotNull InvestOrderDetailsPageParam investOrderDetailsPageParam, @NotNull Continuation<? super ResponseData<InvestOrderDetailsInfoVo>> continuation);

    @POST("/priapi/v1/dapp/boost/xstake/app/redeem/initial/info/new")
    java.lang.Object AEQbTJ(@Body @NotNull InvestRedeemInitialReq investRedeemInitialReq, @NotNull Continuation<? super ResponseData<InvestRedeemInitialInfo>> continuation);

    @POST("/priapi/v1/dapp/boost/xstake/app/subscribe/receive/info")
    java.lang.Object AEQbTJ(@Body @NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq, @NotNull Continuation<? super ResponseData<InvestSubscriptionReceiveInfo>> continuation);

    @GET("/priapi/v2/invest/app/userAsset/platform/list/refresh")
    java.lang.Object AEQbTJ(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull Continuation<? super ResponseData<PlatformRefreshResponse>> continuation);

    @GET("/priapi/v1/invest/web/support/search/keyword")
    java.lang.Object AEQbTJ(@Query("keyword") java.lang.String str, @NotNull Continuation<? super ResponseData<SearchRecommendResponse>> continuation);

    @POST("/priapi/v1/invest/transaction/submit")
    java.lang.Object AEQbTJ(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body RequestBody requestBody, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<InvestTxData>> continuation);

    @GET("/priapi/v1/invest/app/support/home/tab")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<HomeTabData>> continuation);

    @POST("/priapi/v1/invest/app/transaction/aaCallData")
    AbstractC58185ywX<ResponseData<JsonObject>> AEQbTJ(@Body @NotNull InvestCallDataReq investCallDataReq);

    @POST("/priapi/v1/invest/app/v3pool/subscribe/initial/info")
    AbstractC58185ywX<ResponseData<InvestUniv3SubscribeInfo>> AEQbTJ(@Body @NotNull InvestUniv3SubscribeInitialReq investUniv3SubscribeInitialReq);

    @POST("/priapi/v1/invest/app/v3pool/subscribe/receive/info")
    AbstractC58185ywX<ResponseData<InvestUniv3SubscribeReceiveInfo>> AEQbTJ(@Body @NotNull InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq);

    @POST("/priapi/v1/invest/support/validator/list")
    AbstractC58185ywX<ResponseData<java.util.List<InvestValidatorListItems>>> AEQbTJ(@Body @NotNull ValidatorRequestParam validatorRequestParam);

    @POST("/priapi/v1/invest/transaction/submit")
    AbstractC58185ywX<ResponseData<InvestTxData>> AEQbTJ(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body RequestBody requestBody, @Header("Encrypt-Strategy") @NotNull java.lang.String str);

    @GET("/priapi/v1/dapp/boost/xstake/app/redeem/check/allowed")
    java.lang.Object EZpvd(@Query("investmentId") long j, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str2, @Query("stakeId") long j2, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v1/invest/redeem/token/list")
    java.lang.Object EZpvd(@Query("investmentId") long j, @NotNull @Query("accountId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<InvestTokenWithAmount>>> continuation);

    @GET("/priapi/v2/invest/products/investment/bonus/info")
    java.lang.Object EZpvd(@Query("investmentId") long j, @NotNull Continuation<? super ResponseData<InvestmentBonusInfo>> continuation);

    @POST("/priapi/v5/reward-earn/web3/transaction/calldata")
    java.lang.Object EZpvd(@Body @NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    @POST("/priapi/v2/invest/app/userAsset/platform/detail/bonus/window")
    java.lang.Object EZpvd(@Body @NotNull BonusPopupRequest bonusPopupRequest, @NotNull Continuation<? super ResponseData<java.util.List<BonusPopupDetailsResponse>>> continuation);

    @POST("/priapi/v2/invest/app/userAsset/token-type/detail")
    java.lang.Object EZpvd(@Body @NotNull DashboardTokenDetailWarpReq dashboardTokenDetailWarpReq, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<ProtocolDetailsResponse>>> continuation);

    @POST("/priapi/v1/invest/app/subscribe/initial/info/new")
    java.lang.Object EZpvd(@Body @NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq, @NotNull Continuation<? super ResponseData<InvestSubscriptionInfo>> continuation);

    @POST("/priapi/v1/invest/support/validator/list")
    java.lang.Object EZpvd(@Body @NotNull ValidatorRequestParam validatorRequestParam, @NotNull Continuation<? super ResponseData<java.util.List<InvestValidatorListItems>>> continuation);

    @GET("/priapi/v1/invest/products/investment/point/info")
    java.lang.Object EZpvd(@Query("walletAddress") java.lang.String str, @Query("investmentId") long j, @Query("chainId") long j2, @NotNull Continuation<? super ResponseData<InvestPointsInfoResponse>> continuation);

    @GET("/priapi/v1/invest/app/userAsset/protocol/detail")
    java.lang.Object EZpvd(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @Query("platformList") java.lang.String str3, @Query("userAddress") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<DashboardProtocolDetailsResponse>>> continuation);

    @GET("/priapi/v1/invest/app/userAsset/holding/coin/recommend/list")
    java.lang.Object EZpvd(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull Continuation<? super ResponseData<HomeTokensResponse>> continuation);

    @GET("/priapi/v2/invest/products/protocol/rating")
    java.lang.Object EZpvd(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<InvestRiskRatingModel>>> continuation);

    @POST("/priapi/v1/invest/products/recommend/list")
    AbstractC58185ywX<ResponseData<java.util.List<InvestDetail>>> EZpvd();

    @POST("/priapi/v1/invest/app/redeem/receive/info")
    AbstractC58185ywX<ResponseData<InvestRedeemReceiveInfo>> EZpvd(@Body @NotNull InvestRedeemReceiveReq investRedeemReceiveReq);

    @POST("/priapi/v1/invest/products/security/score/info")
    AbstractC58185ywX<ResponseData<SecurityScoreInfo>> EZpvd(@Body @NotNull QueryInvestmentSecurityScoreParam queryInvestmentSecurityScoreParam);

    @GET("/priapi/v5/reward-earn/web3/campaign/portfolio")
    AbstractC58185ywX<ResponseData<Web3CampaignResponse>> EZpvd(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("userAddress") java.lang.String str2, @Query("chainIndex") int i, @NotNull @Query("tokenAddress") java.lang.String str3, @Query("businessLine") int i2);

    @GET("/priapi/v1/invest/app/products/home/v2/aggregate/header")
    java.lang.Object KWHzl(@Query("tabId") int i, @Query("itemKey") java.lang.String str, @Query("totalTokenAmount") java.lang.String str2, @Query("accountId") java.lang.String str3, @NotNull Continuation<? super ResponseData<AggregateHeaderData>> continuation);

    @POST("/priapi/v1/invest/v3pool/depth/price/chart/{investmentId}")
    java.lang.Object KWHzl(@retrofit2.http.Path("investmentId") long j, @Query("type") int i, @Query("dateType") java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.List<InvestUniv3ChartData>>> continuation);

    @POST("/priapi/v1/invest/redeem/check/allowed")
    java.lang.Object KWHzl(@Query("investmentId") long j, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v1/dapp/boost/xstake/app/transaction/callData")
    java.lang.Object KWHzl(@Body @NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    @POST("/priapi/v5/reward-earn/web3/support/claim/validate")
    java.lang.Object KWHzl(@Body @NotNull InvestGetGasFeeRequest investGetGasFeeRequest, @NotNull Continuation<? super ResponseData<InvestGetGasFeeResponse>> continuation);

    @POST("/priapi/v1/invest/app/products/holding-coin/recommend/v2/max-apy/list")
    java.lang.Object KWHzl(@Body @NotNull DexRecommendRequestWrapper dexRecommendRequestWrapper, @NotNull Continuation<? super ResponseData<java.util.List<EarnRecommendApyBean>>> continuation);

    @POST("/priapi/v1/invest/products/investment/detail")
    java.lang.Object KWHzl(@Body @NotNull InvestProductDetailParam investProductDetailParam, @NotNull Continuation<? super ResponseData<InvestProductDetailResponse>> continuation);

    @POST("/priapi/v1/invest/app/redeem/receive/info")
    java.lang.Object KWHzl(@Body @NotNull InvestRedeemReceiveReq investRedeemReceiveReq, @NotNull Continuation<? super ResponseData<InvestRedeemReceiveInfo>> continuation);

    @POST("/priapi/v1/dapp/boost/xstake/app/subscribe/initial/info/new")
    java.lang.Object KWHzl(@Body @NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq, @NotNull Continuation<? super ResponseData<InvestSubscriptionInfo>> continuation);

    @POST("/priapi/v1/invest/app/userAsset/token/balance/new")
    java.lang.Object KWHzl(@Body @NotNull InvestTokenBalanceReq investTokenBalanceReq, @NotNull Continuation<? super ResponseData<java.util.List<InvestTokenWithAmount>>> continuation);

    @POST("/priapi/v1/invest/app/orders/history/investment")
    java.lang.Object KWHzl(@Body @NotNull DetailOrderParam detailOrderParam, @NotNull Continuation<? super ResponseData<InvestHomeOrderVo>> continuation);

    @POST("/priapi/v1/invest/products/hot/zone/recommend/investment/list/new")
    java.lang.Object KWHzl(@Body @NotNull SpecialZoneActivityParam specialZoneActivityParam, @NotNull Continuation<? super ResponseData<InvestMultiTabEventPageData>> continuation);

    @POST("/priapi/v1/invest/app/products/invest/detail")
    java.lang.Object KWHzl(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @Body @NotNull InvestTokenDetailsReq investTokenDetailsReq, @NotNull Continuation<? super ResponseData<TokenInvestDetailResponse>> continuation);

    @GET("/priapi/v2/invest/app/userAsset/platform/list")
    java.lang.Object KWHzl(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @Query("chainId") java.lang.Long l, @Query("userAddress") java.lang.String str3, @NotNull Continuation<? super ResponseData<DashboardResponse>> continuation);

    @GET("/priapi/v1/invest/app/products/home/v2/search/header")
    java.lang.Object KWHzl(@Query("accountId") java.lang.String str, @Query("keyword") java.lang.String str2, @NotNull Continuation<? super ResponseData<SearchHeaderInfoResponse>> continuation);

    @POST("/priapi/v1/invest/support/home/qa/list")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<InvestQaVo>>> continuation);

    @POST("/priapi/v1/invest/support/filter/criteria")
    AbstractC58185ywX<ResponseData<InvestFilterData>> KWHzl();

    @POST("/priapi/v1/invest/products/{investmentId}/rate/chart")
    AbstractC58185ywX<ResponseData<java.util.List<CandleResultInfo>>> KWHzl(@retrofit2.http.Path("investmentId") long j, @Query("type") int i, @Query("investmentCategory") int i2);

    @POST("/priapi/v1/invest/app/transaction/callData")
    AbstractC58185ywX<ResponseData<JsonObject>> KWHzl(@Body @NotNull InvestCallDataReq investCallDataReq);

    @POST("/priapi/v1/invest/app/v3pool/redeem/initial/info")
    AbstractC58185ywX<ResponseData<InvestUniv3RedeemInitialInfo>> KWHzl(@Body @NotNull InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq);

    @GET("/priapi/v1/invest/app/products/home/v2/aggregate/list")
    java.lang.Object OLrzqt(@Query("tabId") int i, @Query("itemKey") java.lang.String str, @Query("pageNum") java.lang.Integer num, @Query("subTabId") java.lang.Integer num2, @Query("network") java.lang.String str2, @Query("filterTypeId") java.lang.String str3, @Query("property") java.lang.String str4, @Query("accountId") java.lang.String str5, @Query("riskFilterId") java.lang.String str6, @NotNull Continuation<? super ResponseData<AggregateData>> continuation);

    @GET("/priapi/v1/invest/app/products/home/v2/search/list")
    java.lang.Object OLrzqt(@Query("tabId") int i, @Query("keyword") java.lang.String str, @Query("pageNum") java.lang.Integer num, @Query("network") java.lang.String str2, @Query("investType") java.lang.String str3, @Query("property") java.lang.String str4, @Query("accountId") java.lang.String str5, @NotNull Continuation<? super ResponseData<AggregateData>> continuation);

    @POST("/priapi/v1/invest/products/aggregate/{aggregateProductId}/list")
    java.lang.Object OLrzqt(@retrofit2.http.Path("aggregateProductId") long j, @Query("investmentId") long j2, @Query("investmentCategory") int i, @NotNull Continuation<? super ResponseData<java.util.List<InvestmentNetworkInfo>>> continuation);

    @POST("/priapi/v1/invest/products/investment/detail")
    java.lang.Object OLrzqt(@Body @NotNull InvestProductDetailParam investProductDetailParam, @NotNull Continuation<? super ResponseData<ProductDetailsResponse>> continuation);

    @POST("/priapi/v1/dapp/boost/xstake/app/redeem/receive/info")
    java.lang.Object OLrzqt(@Body @NotNull InvestRedeemReceiveReq investRedeemReceiveReq, @NotNull Continuation<? super ResponseData<InvestRedeemReceiveInfo>> continuation);

    @POST("/priapi/v1/invest/app/subscribe/receive/info")
    java.lang.Object OLrzqt(@Body @NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq, @NotNull Continuation<? super ResponseData<InvestSubscriptionReceiveInfo>> continuation);

    @POST("/priapi/v1/invest/app/v3pool/redeem/initial/info")
    java.lang.Object OLrzqt(@Body @NotNull InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq, @NotNull Continuation<? super ResponseData<InvestUniv3RedeemInitialInfo>> continuation);

    @POST("/priapi/v1/invest/app/userAsset/reward/getUserClaimInfo")
    java.lang.Object OLrzqt(@Body @NotNull InvestUserUnstakeInfoParam investUserUnstakeInfoParam, @NotNull Continuation<? super ResponseData<InvestUserClaimInfoResponse>> continuation);

    @POST("/priapi/v1/invest/app/orders/history/investment")
    java.lang.Object OLrzqt(@Body @NotNull DetailOrderParam detailOrderParam, @NotNull Continuation<? super ResponseData<ProductDetailsHistoryResponse>> continuation);

    @GET("/priapi/v1/invest/app/products/holding/coin/recommend/list/v3")
    java.lang.Object OLrzqt(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull Continuation<? super ResponseData<HomeTokensResponse>> continuation);

    @GET("/priapi/v1/invest/products/protocol/recommend/list")
    java.lang.Object OLrzqt(@NotNull @Query("investmentId") java.lang.String str, @NotNull Continuation<? super ResponseData<InvestSubscriptionProtocolModel>> continuation);

    @POST("/priapi/v1/dapp/boost/xstake/app/transaction/submit")
    java.lang.Object OLrzqt(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body RequestBody requestBody, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<InvestTxData>> continuation);

    @POST("/priapi/v1/invest/transaction/advanced/settings/new")
    AbstractC58185ywX<ResponseData<InvestGasPriceConfig>> OLrzqt(@Query("investmentId") long j, @Query("type") int i, @NotNull @Query("tokenAddress") java.lang.String str);

    @POST("/priapi/v1/invest/app/redeem/initial/info/new")
    AbstractC58185ywX<ResponseData<InvestRedeemInitialInfo>> OLrzqt(@Body @NotNull InvestRedeemInitialReq investRedeemInitialReq);

    @POST("/priapi/v1/invest/app/subscribe/initial/info/new")
    AbstractC58185ywX<ResponseData<InvestSubscriptionInfo>> OLrzqt(@Body @NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq);

    @POST("/priapi/v1/invest/app/subscribe/receive/info")
    AbstractC58185ywX<ResponseData<InvestSubscriptionReceiveInfo>> OLrzqt(@Body @NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq);

    @POST("/priapi/v1/invest/app/userAsset/token/balance/new")
    AbstractC58185ywX<ResponseData<java.util.List<InvestTokenWithAmount>>> OLrzqt(@Body @NotNull InvestTokenBalanceReq investTokenBalanceReq);

    @GET("/priapi/v1/invest/support/coin/apy")
    AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, DeFiApyDataInfoData>>> OLrzqt(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2);

    @POST("/priapi/v1/invest/redeem/token/search")
    java.lang.Object copydefault(@Query("investmentId") long j, @NotNull @Query("accountId") java.lang.String str, @NotNull @Query("symbol") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<InvestTokenWithAmount>>> continuation);

    @GET("/priapi/v1/invest/app/products/dex/search/header")
    java.lang.Object copydefault(@Query("chainId") long j, @NotNull @Query("tokenAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<SearchHeaderInfoResponse>> continuation);

    @POST("/priapi/v1/invest/app/transaction/aaCallData")
    java.lang.Object copydefault(@Body @NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    @POST("/priapi/v1/invest/app/userAsset/stOkt/draw/detail")
    java.lang.Object copydefault(@Body @NotNull InvestStOktDrawDetailParam investStOktDrawDetailParam, @NotNull Continuation<? super ResponseData<InvestStOktDrawDetailResponse>> continuation);

    @POST("/priapi/v1/invest/app/userAsset/hold/investment/new")
    java.lang.Object copydefault(@Body @NotNull InvestMyInvestmentNewParam investMyInvestmentNewParam, @NotNull Continuation<? super ResponseData<java.util.List<InvestUserAssetDetailByInvestment>>> continuation);

    @POST("/priapi/v1/invest/app/redeem/initial/info/new")
    java.lang.Object copydefault(@Body @NotNull InvestRedeemInitialReq investRedeemInitialReq, @NotNull Continuation<? super ResponseData<InvestRedeemInitialInfo>> continuation);

    @POST("/priapi/v1/invest/app/v3pool/redeem/receive/info")
    java.lang.Object copydefault(@Body @NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, @NotNull Continuation<? super ResponseData<InvestUniv3RedeemReceiveInfo>> continuation);

    @GET("/priapi/v1/invest/app/userAsset/token-type/list")
    java.lang.Object copydefault(@Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DashboardTokenListResponse>>> continuation);

    @POST("/priapi/v5/reward-earn/web3/order/submit")
    java.lang.Object copydefault(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body RequestBody requestBody, @Header("Encrypt-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<InvestTxData>> continuation);

    @GET("/priapi/v1/invest/app/support/home/learnAndEarn")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<HomeLearnEarnVO>> continuation);

    @POST("/priapi/v1/invest/redeem/check/allowed")
    AbstractC58185ywX<ResponseData<java.lang.Object>> copydefault(@Query("investmentId") long j, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str2);

    @POST("/priapi/v1/invest/app/orders/history/home")
    AbstractC58185ywX<ResponseData<InvestDetailOrderVo>> copydefault(@Body @NotNull HomeOrderParam homeOrderParam);

    @POST("/priapi/v1/invest/app/v3pool/redeem/receive/info")
    AbstractC58185ywX<ResponseData<InvestUniv3RedeemReceiveInfo>> copydefault(@Body @NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq);

    @POST("/priapi/v1/invest/app/orders/history/investment")
    AbstractC58185ywX<ResponseData<InvestHomeOrderVo>> copydefault(@Body @NotNull DetailOrderParam detailOrderParam);

    /* JADX INFO: renamed from: o.ixP$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC25472ixP EZpvd(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (InterfaceC25472ixP) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC25472ixP.class), c43280rmM);
        }
    }

    static /* synthetic */ java.lang.Object getAggregateProductList$default(InterfaceC25472ixP interfaceC25472ixP, long j, long j2, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAggregateProductList");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return interfaceC25472ixP.OLrzqt(j, j2, i, (Continuation<? super ResponseData<java.util.List<InvestmentNetworkInfo>>>) continuation);
    }

    static /* synthetic */ AbstractC58185ywX submitTransaction$default(InterfaceC25472ixP interfaceC25472ixP, java.util.Map map, RequestBody requestBody, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitTransaction");
        }
        if ((i & 4) != 0) {
            str = "TIME";
        }
        return interfaceC25472ixP.AEQbTJ((java.util.Map<java.lang.String, java.lang.String>) map, requestBody, str);
    }

    static /* synthetic */ java.lang.Object suspendSubmitTransaction$default(InterfaceC25472ixP interfaceC25472ixP, java.util.Map map, RequestBody requestBody, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suspendSubmitTransaction");
        }
        if ((i & 4) != 0) {
            str = "TIME";
        }
        return interfaceC25472ixP.AEQbTJ((java.util.Map<java.lang.String, java.lang.String>) map, requestBody, str, (Continuation<? super ResponseData<InvestTxData>>) continuation);
    }

    static /* synthetic */ java.lang.Object suspendBoostSubmitTransaction$default(InterfaceC25472ixP interfaceC25472ixP, java.util.Map map, RequestBody requestBody, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suspendBoostSubmitTransaction");
        }
        if ((i & 4) != 0) {
            str = "TIME";
        }
        return interfaceC25472ixP.OLrzqt((java.util.Map<java.lang.String, java.lang.String>) map, requestBody, str, (Continuation<? super ResponseData<InvestTxData>>) continuation);
    }

    static /* synthetic */ java.lang.Object suspendSubmitWeb3ClaimTransaction$default(InterfaceC25472ixP interfaceC25472ixP, java.util.Map map, RequestBody requestBody, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suspendSubmitWeb3ClaimTransaction");
        }
        if ((i & 4) != 0) {
            str = "TIME";
        }
        return interfaceC25472ixP.copydefault((java.util.Map<java.lang.String, java.lang.String>) map, requestBody, str, (Continuation<? super ResponseData<InvestTxData>>) continuation);
    }

    static /* synthetic */ java.lang.Object getUniv3ChartData$default(InterfaceC25472ixP interfaceC25472ixP, long j, int i, java.lang.Integer num, Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUniv3ChartData");
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return interfaceC25472ixP.KWHzl(j, i, num, (Continuation<? super ResponseData<java.util.List<InvestUniv3ChartData>>>) continuation);
    }

    static /* synthetic */ java.lang.Object getDeFiDashboard$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeFiDashboard");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.KWHzl(str, str2, l, str3, (Continuation<? super ResponseData<DashboardResponse>>) continuation);
    }

    static /* synthetic */ java.lang.Object getDeFiDashboardTokenList$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeFiDashboardTokenList");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.copydefault(str, str2, (Continuation<? super ResponseData<java.util.List<DashboardTokenListResponse>>>) continuation);
    }

    static /* synthetic */ java.lang.Object getProtocolDetails$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProtocolDetails");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.EZpvd(str, str2, str3, str4, (Continuation<? super ResponseData<java.util.List<DashboardProtocolDetailsResponse>>>) continuation);
    }

    static /* synthetic */ java.lang.Object triggerDashboardRefresh$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerDashboardRefresh");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.AEQbTJ(str, str2, (Continuation<? super ResponseData<PlatformRefreshResponse>>) continuation);
    }

    static /* synthetic */ java.lang.Object getProtocolRating$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProtocolRating");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.EZpvd(str, (Continuation<? super ResponseData<java.util.List<InvestRiskRatingModel>>>) continuation);
    }

    static /* synthetic */ java.lang.Object getHomeTokens$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeTokens");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.OLrzqt(str, str2, (Continuation<? super ResponseData<HomeTokensResponse>>) continuation);
    }

    static /* synthetic */ java.lang.Object getDashboardRecommendTokens$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDashboardRecommendTokens");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.EZpvd(str, str2, (Continuation<? super ResponseData<HomeTokensResponse>>) continuation);
    }

    static /* synthetic */ java.lang.Object getTokenInvestDetail$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, InvestTokenDetailsReq investTokenDetailsReq, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTokenInvestDetail");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.KWHzl(str, investTokenDetailsReq, (Continuation<? super ResponseData<TokenInvestDetailResponse>>) continuation);
    }

    static /* synthetic */ AbstractC58185ywX getWeb3ClaimRewardInfo$default(InterfaceC25472ixP interfaceC25472ixP, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWeb3ClaimRewardInfo");
        }
        if ((i3 & 1) != 0) {
            str = "";
        }
        return interfaceC25472ixP.EZpvd(str, str2, i, str3, i2);
    }

    static /* synthetic */ java.lang.Object getDashboardTokenDetail$default(InterfaceC25472ixP interfaceC25472ixP, DashboardTokenDetailWarpReq dashboardTokenDetailWarpReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDashboardTokenDetail");
        }
        if ((i & 2) != 0) {
            str = "TIME";
        }
        return interfaceC25472ixP.EZpvd(dashboardTokenDetailWarpReq, str, (Continuation<? super ResponseData<java.util.List<ProtocolDetailsResponse>>>) continuation);
    }
}
