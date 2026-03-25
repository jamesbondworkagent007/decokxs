package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.data.model.AddressLoginResponse;
import com.okinc.business.market.data.model.AddressTrackerNotificationData;
import com.okinc.business.market.data.model.BatchCollectGroupAddressRequest;
import com.okinc.business.market.data.model.BatchImportAddressListRequest;
import com.okinc.business.market.data.model.BatchImportAddressListResponse;
import com.okinc.business.market.data.model.EmojiAddressData;
import com.okinc.business.market.data.model.GetAddressTrackerTxnResponse;
import com.okinc.business.market.data.model.GetSignMessageResponse;
import com.okinc.business.market.data.model.GetTrackingAddressGroup;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.data.model.HomeTabContentResponse;
import com.okinc.business.market.data.model.HomepageConfigResponse;
import com.okinc.business.market.data.model.LiquidityChangeFilterRequest;
import com.okinc.business.market.data.model.LiquidityChangeResponse;
import com.okinc.business.market.data.model.LiquidityFilterConfigResponse;
import com.okinc.business.market.data.model.OverviewData;
import com.okinc.business.market.data.model.TagMetaData;
import com.okinc.business.market.data.model.TransactionInfoData;
import com.okinc.business.market.data.model.UpdateSignalAlertsRequest;
import com.okinc.business.market.data.model.WatchlistTokenData;
import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryChangeResponse;
import com.okinc.business.market.data.model.history.HistoryFilterConfigResponse;
import com.okinc.business.market.data.model.history.NativeTokenPriceData;
import com.okinc.business.market.data.model.position_pnl.AddressLoginRequest;
import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.business.market.data.model.smart_money.AddressResponse;
import com.okinc.business.market.data.model.smart_money.SignalActivityResponse;
import com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData;
import com.okinc.business.market.data.model.smart_money.SignalAlertResponse;
import com.okinc.business.market.data.model.smart_money.SignalGemsData;
import com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse;
import com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest;
import com.okinc.business.market.data.model.smart_money.SignalOverviewResponse;
import com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest;
import com.okinc.business.market.data.model.watchlist.GroupSortingRequest;
import com.okinc.business.market.data.model.watchlist.PinTokenToTopRequest;
import com.okinc.business.market.data.model.watchlist.TrackerGroupSortingRequest;
import com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest;
import com.okinc.business.market.data.model.watchlist.WatchlistGroupRequest;
import com.okinc.business.market.features.address_tracker.domain.TrackerGroupRequest;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker.domain.UpdateTrackerRequest;
import com.okinc.business.market.features.address_tracker.repo.BatchEnableOrDisableNotificationRequest;
import com.okinc.business.market.features.address_tracker.repo.UpdateAddressNotificationRequest;
import com.okinc.business.market.features.address_tracker.repo.UpdateDeviceRequest;
import com.okinc.business.market.features.address_tracker_sa.domain.model.KolStrategyRes;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.BatchMigrateRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.BatchUnfollowRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader;
import com.okinc.business.market.features.filter_tag.data.model.FilterTagData;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData;
import com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SignalConfigData;
import com.okinc.business.market.features.tag.domain.TagAttribute;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.jyE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC27595jyE {
    @POST("/priapi/v1/dx/market/user/login")
    java.lang.Object AEQbTJ(@Body AddressLoginRequest addressLoginRequest, @NotNull Continuation<? super ResponseData<AddressLoginResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/watchlist/token/tokenSort")
    java.lang.Object AEQbTJ(@Body @NotNull FavoriteTokensSortRequest favoriteTokensSortRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @POST("/priapi/v1/dx/market/v2/smartmoney/signal/alert")
    java.lang.Object AEQbTJ(@Header("Market-Token") @NotNull java.lang.String str, @Header("devid") @NotNull java.lang.String str2, @Header("chainIndex") long j, @Body @NotNull UpdateSignalAlertsRequest updateSignalAlertsRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @POST("/priapi/v1/dx/market/v2/tracker/device/update")
    java.lang.Object AEQbTJ(@Header("Market-Token") @NotNull java.lang.String str, @Header("devid") @NotNull java.lang.String str2, @Body @NotNull UpdateDeviceRequest updateDeviceRequest, @NotNull Continuation<? super ResponseData<java.util.List<GetAddressTrackerTxnResponse>>> continuation);

    @GET("/priapi/v1/dx/market/tag/holderTagFilter")
    java.lang.Object AEQbTJ(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("currentUserWalletAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<FilterTagData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/surge/trending/ranking/list")
    java.lang.Object AEQbTJ(@NotNull @Query("rankType") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<TrendingTokenData>>> continuation);

    @GET("/priapi/v1/dx/market/sa/leaderboard/kol-strategy")
    java.lang.Object AEQbTJ(@Query("chainId") java.lang.String str, @NotNull Continuation<? super ResponseData<KolStrategyRes>> continuation);

    @GET("/priapi/v1/dx/market/v2/my-position/latest-pnl")
    java.lang.Object AEQbTJ(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LatestPnLData>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal/query-alert")
    java.lang.Object AEQbTJ(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<SignalAlertResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal/config")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<SignalConfigData>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal/gems-sliding-bar")
    java.lang.Object AYXKKw(@NotNull @Query("chainId") java.lang.String str, @NotNull Continuation<? super ResponseData<SurgeSignalGemsData>> continuation);

    @GET("/priapi/v1/dx/market/v2/token/overview")
    java.lang.Object AYXKKw(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<OverviewData>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal-detail")
    java.lang.Object AYXKKw(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<AddressResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading-history/info")
    java.lang.Object AhwBna(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<TransactionInfoData>> continuation);

    @GET("/priapi/v1/dx/market/v2/watchlist/token/inGroups")
    java.lang.Object AhwBna(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<java.util.List<CommonGroupData>>> continuation);

    @POST("/priapi/v1/dx/market/v2/smartmoney/signal/filter-activity")
    java.lang.Object EZpvd(@Body @NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, @NotNull Continuation<? super ResponseData<SignalActivityResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/collect/batch/update")
    java.lang.Object EZpvd(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull BatchCollectGroupAddressRequest batchCollectGroupAddressRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/collect/batch/import")
    java.lang.Object EZpvd(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull BatchImportAddressListRequest batchImportAddressListRequest, @NotNull Continuation<? super ResponseData<BatchImportAddressListResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/top-trader/tag-list")
    java.lang.Object EZpvd(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("currentUserWalletAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<FilterTagData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/token/pump/live/info")
    java.lang.Object EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<PumpLiveInfoData>> continuation);

    @GET("/priapi/v1/dx/market/user/sign")
    java.lang.Object EZpvd(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<GetSignMessageResponse>> continuation);

    @GET("/priapi/v1/dx/market/sa/monitor/address/source/config")
    java.lang.Object EZpvd(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<TrackerAddressSourceResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal/alert-history")
    java.lang.Object EZpvd(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<SignalAlertHistoryData>> continuation);

    @GET("/priapi/v1/dx/market/tag/meta")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<TagMetaData>>> continuation);

    @POST("/priapi/v1/dx/market/v2/watchlist/token/group/sort")
    java.lang.Object KWHzl(@Body @NotNull GroupSortingRequest groupSortingRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/dx/market/v2/watchlist/token/group/tokenTop")
    java.lang.Object KWHzl(@Body @NotNull PinTokenToTopRequest pinTokenToTopRequest, @NotNull Continuation<? super ResponseData<java.lang.Boolean>> continuation);

    @POST("/priapi/v1/dx/market/v2/watchlist/token/group/create")
    java.lang.Object KWHzl(@Body @NotNull WatchlistGroupRequest watchlistGroupRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @POST("/priapi/v1/dx/market/v2/alert/address/batchEnableOrDisable")
    java.lang.Object KWHzl(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull BatchEnableOrDisableNotificationRequest batchEnableOrDisableNotificationRequest, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/collect/group/migrate")
    java.lang.Object KWHzl(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull BatchMigrateRequest batchMigrateRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("/priapi/v1/dx/market/v2/preview/twitter/v2")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenAddress") java.lang.String str2, @Query("t") long j, @NotNull Continuation<? super ResponseData<TwitterV2Response>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/notify/query")
    java.lang.Object KWHzl(@NotNull @Query("walletAddress") java.lang.String str, @NotNull @Query("collectAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<AddressTrackerNotificationData>> continuation);

    @GET("/priapi/v1/dx/market/v2/query/nativeToken/price")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull Continuation<? super ResponseData<NativeTokenPriceData>> continuation);

    @GET("/priapi/v1/dx/market/sa/leaderboard/ranking-list")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<jBB>> continuation);

    @GET("/priapi/v1/dx/market/v3/advanced/ranking/content")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<HomeTabContentResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/pool-liquidity/change-history/filter-config")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<LiquidityFilterConfigResponse>> continuation);

    @GET("/priapi/v1/dx/market/v3/advanced/ranking/config")
    java.lang.Object OLrzqt(@Query("platformType") int i, @Query("accountType") int i2, @NotNull Continuation<? super ResponseData<HomepageConfigResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/smartmoney/signal/filter-overview")
    java.lang.Object OLrzqt(@Body @NotNull SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, @NotNull Continuation<? super ResponseData<SignalOverviewResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/watchlist/token/group/rename")
    java.lang.Object OLrzqt(@Body @NotNull WatchlistGroupRequest watchlistGroupRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/dx/market/sa/activity")
    java.lang.Object OLrzqt(@Body @NotNull TrackerActivityRequest trackerActivityRequest, @NotNull Continuation<? super ResponseData<java.util.List<TrackerActivityResponse>>> continuation);

    @POST("/priapi/v1/dx/market/sa/trends")
    java.lang.Object OLrzqt(@Body @NotNull TrackerTrendRequest trackerTrendRequest, @NotNull Continuation<? super ResponseData<TrackerTrendResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/collect/batch/unfollow")
    java.lang.Object OLrzqt(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull BatchUnfollowRequest batchUnfollowRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("priapi/v1/dx/market/tag/txHistoryTagFilter")
    java.lang.Object OLrzqt(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("currentUserWalletAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<FilterTagData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/watchlist/token/all/list")
    java.lang.Object OLrzqt(@NotNull @Query("walletAddress") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<WatchlistTokenData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/collect/simplify/query")
    java.lang.Object OLrzqt(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<java.lang.String>>> continuation);

    @GET("priapi/v1/dx/trade/multi/v2/checkAndGetTokenInfo")
    java.lang.Object OLrzqt(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<DexMultiTokenInfoBean>> continuation);

    @GET("/priapi/v5/dex/token/market/dex-token-hlc-candles")
    java.lang.Object OLrzqt(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<java.util.List<java.util.List<java.lang.String>>>> continuation);

    @GET("/priapi/v1/dx/market/sa/leaderboard/config")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<jBC>> continuation);

    @POST("/priapi/v1/dx/market/v2/pool-liquidity/change-history/filter-list")
    java.lang.Object copydefault(@Body @NotNull LiquidityChangeFilterRequest liquidityChangeFilterRequest, @NotNull Continuation<? super ResponseData<LiquidityChangeResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/trading-history/filter-list")
    java.lang.Object copydefault(@Body @NotNull HistoryChangeFilterRequest historyChangeFilterRequest, @NotNull Continuation<? super ResponseData<HistoryChangeResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/watchlist/token/batch/addOrDelete")
    java.lang.Object copydefault(@Body @NotNull UpdateFavoriteTokensRequest updateFavoriteTokensRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @HTTP(hasBody = true, method = "DELETE", path = "/priapi/v1/dx/market/v2/watchlist/token/group/delete")
    java.lang.Object copydefault(@Body @NotNull WatchlistGroupRequest watchlistGroupRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @POST("/priapi/v1/dx/market/sa/trends/detail")
    java.lang.Object copydefault(@Body @NotNull TrackerTrendDetailRequest trackerTrendDetailRequest, @NotNull Continuation<? super ResponseData<java.util.List<TrendTrader>>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/collect/group/sort")
    java.lang.Object copydefault(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull TrackerGroupSortingRequest trackerGroupSortingRequest, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/collect/group/update")
    java.lang.Object copydefault(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull TrackerGroupRequest trackerGroupRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/alias/update")
    java.lang.Object copydefault(@Header("Market-Token") @NotNull java.lang.String str, @Body @NotNull UpdateTrackerRequest updateTrackerRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("/priapi/v1/dx/market/v2/translate/twitter")
    java.lang.Object copydefault(@NotNull @Query("id") java.lang.String str, @Query("referencedIds") java.lang.String str2, @Query("type") int i, @NotNull Continuation<? super ResponseData<TwitterTranslateResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/notify/update")
    java.lang.Object copydefault(@Header("Market-Token") @NotNull java.lang.String str, @Header("devid") @NotNull java.lang.String str2, @Body @NotNull UpdateAddressNotificationRequest updateAddressNotificationRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("/priapi/v1/dx/market/v2/latest/info")
    java.lang.Object copydefault(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<LatestMarketInfoBean>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/collect/groupId/query")
    java.lang.Object copydefault(@NotNull @Query("walletAddress") java.lang.String str, @NotNull @Query("collectAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<java.lang.Integer>>> continuation);

    @GET("/priapi/v1/dx/market/v2/rwa/token/marketTagList")
    java.lang.Object copydefault(@NotNull @Query(MTPushConstants.PlatformNode.KEY_PLATFORM) java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TagMetaData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/getLimitOrderBalance")
    java.lang.Object copydefault(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LimitOrderBalanceData>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal/gems-list")
    java.lang.Object copydefault(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<SignalGemsData>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading-history/filter-config")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<HistoryFilterConfigResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/alias/simplify/query")
    java.lang.Object djBIcL(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TrackingAddressAlias>>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/collect/detail-query")
    java.lang.Object djBIcL(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<GetTrackingAddressListResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/surge/trending/ranking/config")
    java.lang.Object djBIcL(@NotNull Continuation<? super ResponseData<TrendingConfigData>> continuation);

    @GET("/priapi/v1/dx/market/v2/watchlist/token/group/tokenList")
    java.lang.Object fetchVPNInfo(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<java.util.List<HomeFavoriteTokenData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/preview/twitter")
    java.lang.Object gEmmrt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<TwitterPreviewData>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/emoji/query")
    java.lang.Object gEmmrt(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<EmojiAddressData>>> continuation);

    @GET("/priapi/v1/dx/market/tag/getTagAttribute")
    java.lang.Object gEmmrt(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<TagAttribute>>> continuation);

    @POST("/priapi/v1/dx/market/v2/smartmoney/signal/filter-overview")
    java.lang.Object gEmmrt(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<SignalOverviewResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/collect/group/query")
    java.lang.Object valueOf(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<GetTrackingAddressGroup>>> continuation);

    @GET("/priapi/v1/dx/market/v2/my-position/recent-transactions")
    java.lang.Object valueOf(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<PnLTransactionResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/smartmoney/signal/address-list")
    java.lang.Object valueOf(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<SignalOverviewAddressResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/watchlist/token/group/list")
    java.lang.Object values(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<java.util.List<CommonGroupData>>> continuation);

    /* JADX INFO: renamed from: o.jyE$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getHomepageConfig$default(InterfaceC27595jyE interfaceC27595jyE, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomepageConfig");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 1;
            }
            return interfaceC27595jyE.OLrzqt(i, i2, (Continuation<? super ResponseData<HomepageConfigResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getTwitterPreviewV2$default(InterfaceC27595jyE interfaceC27595jyE, java.lang.String str, java.lang.String str2, long j, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTwitterPreviewV2");
            }
            if ((i & 4) != 0) {
                j = java.lang.System.currentTimeMillis();
            }
            return interfaceC27595jyE.KWHzl(str, str2, j, continuation);
        }

        public static /* synthetic */ java.lang.Object translateTwitter$default(InterfaceC27595jyE interfaceC27595jyE, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateTwitter");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return interfaceC27595jyE.copydefault(str, str2, i, (Continuation<? super ResponseData<TwitterTranslateResponse>>) continuation);
        }
    }
}
