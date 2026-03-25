package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonObject;
import com.okinc.business.data.model.market.HolderDetailResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dexlogic.bean.CollectionTokenParam;
import com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult;
import com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.bean.LiquidityPairData;
import com.okinc.business.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.business.market.data.model.BannerConfigData;
import com.okinc.business.market.data.model.BannerEventData;
import com.okinc.business.market.data.model.DevAnalysisData;
import com.okinc.business.market.data.model.LiquidityChartData;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.business.market.data.model.MarketConfigData;
import com.okinc.business.market.data.model.ModuleBoostHeaderData;
import com.okinc.business.market.data.model.ModuleData;
import com.okinc.business.market.data.model.holder.HolderChartData;
import com.okinc.business.market.data.model.holdings.HoldingListResponseData;
import com.okinc.business.market.data.model.traders.TradersWrapperData;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData;
import com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData;
import com.okinc.business.market.features.meme.data.model.MemeTokenV2Data;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokensResponseData;
import com.okinc.business.market.features.vibes.domain.VibesOverviewData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.huL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23229huL {
    public static final Application Companion = Application.AEQbTJ;

    @GET("/priapi/v1/dx/market/v2/memefun/search/similar-tokens")
    java.lang.Object AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @Query("keyword") java.lang.String str3, @NotNull Continuation<? super ResponseData<SimilarTokensResponseData>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/meme-bundle-detail")
    java.lang.Object AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<BundleDetailData>> continuation);

    @GET("/priapi/v1/dx/market/pool/list")
    java.lang.Object AEQbTJ(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<LiquidityPairData>> continuation);

    @POST("/priapi/v1/dx/market/batch/addOrCancelCollectionToken")
    java.lang.Object AEQbTJ(@Body @NotNull java.util.List<CollectionTokenParam> list, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("/priapi/v1/dx/market/v2/config/info")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<MarketConfigData>> continuation);

    @GET("/priapi/v1/dx/market/v2/latest/info")
    AbstractC58185ywX<ResponseData<LatestMarketInfoBean>> AEQbTJ(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @Query("walletAddress") java.lang.String str4);

    @GET("/priapi/v5/dex/token/market/dex-token-hlc-candles")
    AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str4, @NotNull @Query("bar") java.lang.String str5, @NotNull @Query("limit") java.lang.String str6);

    @GET("/priapi/v1/dx/market/v2/pool-liquidity/tendency/chart")
    java.lang.Object AYXKKw(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LiquidityChartData>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/top-trader/ranking-list")
    java.lang.Object AhwBna(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<TradersWrapperData>> continuation);

    @GET("/priapi/v1/dx/market/v2/dev/analysis-list")
    java.lang.Object EZpvd(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<DevAnalysisData>> continuation);

    @GET("/priapi/v1/dx/market/banner/list")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<BannerConfigData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/same-car/holdings")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("walletAddress") java.lang.String str2, @NotNull @Query("tokenAddress") java.lang.String str3, @Query("limit") int i, @NotNull Continuation<? super ResponseData<ApedTogetherResponseData>> continuation);

    @GET("/priapi/v1/dx/market/v2/holders/single-detail-info")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("holderAddress") java.lang.String str3, @NotNull Continuation<? super ResponseData<HolderDetailResponseData>> continuation);

    @GET("/priapi/v1/dx/market/v2/holders/early-buyer/list")
    java.lang.Object KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<EarlyBuyers>> continuation);

    @GET("/priapi/v1/dx/market/v2/holders/holding-list")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.Object> map, @NotNull Continuation<? super ResponseData<HoldingListResponseData>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/ranking/config")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<ConfigInfoData>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading/tag/kline-bs-point")
    AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> KWHzl(@NotNull @Query("bar") java.lang.String str, @Query("limit") int i, @NotNull @Query("chainId") java.lang.String str2, @NotNull @Query("tokenAddress") java.lang.String str3, @Query("fromAddressTag") java.lang.String str4);

    @GET("/priapi/v1/dx/market/v2/token/composite-info")
    AbstractC58185ywX<ResponseData<CompositeInfoBean>> KWHzl(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenAddress") java.lang.String str2);

    @GET("/priapi/v5/dex/token/market/dex-token-hlc-candles")
    java.lang.Object OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str4, @NotNull @Query("bar") java.lang.String str5, @NotNull @Query("limit") java.lang.String str6, @NotNull Continuation<? super ResponseData<java.util.List<java.util.List<java.lang.String>>>> continuation);

    @GET("/priapi/v1/dx/market/v2/latest/info")
    java.lang.Object OLrzqt(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @Query("walletAddress") java.lang.String str4, @NotNull Continuation<? super ResponseData<LatestMarketInfoBean>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/holder/info")
    java.lang.Object OLrzqt(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("holderAddress") java.lang.String str3, @NotNull Continuation<? super ResponseData<HolderInfoData>> continuation);

    @GET("/priapi/v1/dx/market/v2/token/share/detail")
    java.lang.Object OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    @GET("/priapi/v1/dx/market/v2/holders/analysis-info")
    java.lang.Object OLrzqt(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<HolderChartData>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/meme-ranking/content")
    java.lang.Object OLrzqt(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<MemeTokenV2Data>>> continuation);

    @GET("/priapi/v1/dx/market/v2/memefun/category/info/new")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<ModuleData>>> continuation);

    @POST("/priapi/v1/dx/market/coin/check")
    AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> OLrzqt(@Body @NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO);

    @GET("/priapi/v1/dx/market/v2/trading/kline-bs-point")
    AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> OLrzqt(@NotNull @Query("bar") java.lang.String str, @Query("limit") int i, @NotNull @Query("chainId") java.lang.String str2, @NotNull @Query("tokenAddress") java.lang.String str3, @Query("fromAddress") java.lang.String str4);

    @GET("/priapi/v1/dx/trade/multi/support/swap")
    AbstractC58185ywX<ResponseData<SupportSwapData>> OLrzqt(@NotNull @Query("tokenContractAddress") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2);

    @GET("/priapi/v5/dex/token/market/history-dex-token-hlc-candles")
    AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> OLrzqt(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @Query(TtmlNode.RUBY_AFTER) java.lang.String str3, @Query(TtmlNode.RUBY_BEFORE) java.lang.String str4, @NotNull @Query("bar") java.lang.String str5, @NotNull @Query("limit") java.lang.String str6);

    @GET("/priapi/v1/dx/market/v2/token/vibe/hot-index")
    java.lang.Object copydefault(@NotNull @Query("chainIndex") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<VibesOverviewData>> continuation);

    @POST("/priapi/v1/dapp/advert/entryBannerList")
    java.lang.Object copydefault(@Body @NotNull java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> map, @NotNull Continuation<? super ResponseData<java.util.List<BannerEventData>>> continuation);

    @GET("/priapi/v1/dapp/boost/rankHeader")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<ModuleBoostHeaderData>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/share/info")
    AbstractC58185ywX<ResponseData<JsonObject>> copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("walletAddress") java.lang.String str3, @NotNull @Query("accountId") java.lang.String str4, @Query("moduleType") int i);

    @POST("/priapi/v1/dx/market/v2/report/valid-search")
    java.lang.Object djBIcL(@Body @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v1/dx/market/v2/holders/ranking-list")
    java.lang.Object gEmmrt(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<TokenHolderResponseData>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading-history/statistics")
    java.lang.Object valueOf(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<TradingHistoryStatisticsResult>> continuation);

    /* JADX INFO: renamed from: o.huL$Application */
    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();

        private Application() {
        }

        public final InterfaceC23229huL EZpvd(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (InterfaceC23229huL) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC23229huL.class), c43280rmM);
        }
    }
}
