package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.net.requestbean.CeDefiDeleteRuleRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.CeDefiPriceRemindAddRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.DeleteRuleApiRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.DexTokenListRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.PriceRemindAddApiRequestBean;
import com.okinc.crcore.coreapi.net.responsebean.AlertRemindResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.BusinessSupportResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CategoryOverviewResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CategoryPairListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CategoryTokenListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CategoryTopGainersResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CoinPastReturnResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CoinResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.ConceptChainResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.DexChainResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.DexRiskResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.DexTokenResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.FairPriceResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.FavoriteRecommendResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.FeatureCardsResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.InstrumentItemResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.NewCoinGroupResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.NewCoinListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.PairGainersLosersResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.PairHotResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SearchResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SimpleCategoriesResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SpotBuyAndSellResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotsDexTradersResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.StockRankResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.TokenChartResponseBeans;
import com.okinc.crcore.coreapi.net.responsebean.TrendingCategoriesResponseBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC31771mDh {
    public static final Activity Companion = Activity.AEQbTJ;

    @POST("/priapi/v5/rubik/cedefi/alert/rule/delete")
    java.lang.Object AEQbTJ(@Body CeDefiDeleteRuleRequestBean ceDefiDeleteRuleRequestBean, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/rubik/cr/rank/hot-fever")
    java.lang.Object AEQbTJ(@Query("num") java.lang.Integer num, @Query("rank") java.lang.Integer num2, @Query("category") java.lang.String str, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CoinResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/search/cedefi")
    java.lang.Object AEQbTJ(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) java.lang.String str, @NotNull @Query("periodType") java.lang.String str2, @NotNull @Query("filterChainTag") java.lang.String str3, @NotNull @Query("filterCexListing") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/category/token-list")
    java.lang.Object AEQbTJ(@NotNull @Query("id") java.lang.String str, @NotNull @Query("interval") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CategoryTokenListResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/app/public/plate-info")
    java.lang.Object AEQbTJ(@NotNull @Query("code") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<ConceptChainResponseBean>>> continuation);

    @GET("/priapi/v5/public/dex/dex-chains")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<DexChainResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/app/public/up-down-rank")
    java.lang.Object EZpvd(@Query("rank") int i, @NotNull @Query("type") java.lang.String str, @NotNull @Query("zone") java.lang.String str2, @Query("num") int i2, @NotNull Continuation<? super ResponseData<java.util.List<java.util.Map<java.lang.String, java.util.List<PairGainersLosersResponseBean>>>>> continuation);

    @GET("/priapi/v5/rubik/cr/advanced/groups-with-new-coin")
    java.lang.Object EZpvd(@Query("earliestDate") long j, @NotNull Continuation<? super ResponseData<java.util.List<NewCoinGroupResponseBean>>> continuation);

    @POST("/priapi/v5/rubik/cedefi/alert/rule/add")
    java.lang.Object EZpvd(@Body CeDefiPriceRemindAddRequestBean ceDefiPriceRemindAddRequestBean, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/rubik/alert/user/rule/add")
    java.lang.Object EZpvd(@Body PriceRemindAddApiRequestBean priceRemindAddApiRequestBean, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/rubik/alert/user/rule/list_by_coin")
    java.lang.Object EZpvd(@NotNull @Query("coin") java.lang.String str, @Query("promptType") java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.ArrayList<InstrumentItemResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/dex/rank")
    java.lang.Object EZpvd(@Query("chainIds") java.lang.String str, @NotNull @Query("rankBy") java.lang.String str2, @NotNull @Query("periodType") java.lang.String str3, @Query("pageSize") int i, @Query("desc") boolean z, @NotNull @Query("filterChainTag") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/category/simple-list")
    java.lang.Object EZpvd(@NotNull @Query("interval") java.lang.String str, @NotNull @Query("size") java.lang.String str2, @NotNull @Query("sortBy") java.lang.String str3, @NotNull @Query("timezone") java.lang.String str4, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str5, @NotNull Continuation<? super ResponseData<java.util.List<SimpleCategoriesResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/category/pair-list")
    java.lang.Object EZpvd(@NotNull @Query("id") java.lang.String str, @NotNull @Query("interval") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CategoryPairListResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/public/coin-past-return")
    java.lang.Object EZpvd(@NotNull @Query("ccy") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.ArrayList<CoinPastReturnResponseBean>>> continuation);

    @POST("/priapi/v5/rubik/alert/user/rule/delete")
    java.lang.Object KWHzl(@Body DeleteRuleApiRequestBean deleteRuleApiRequestBean, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/rubik/cr/rank/new-coin")
    java.lang.Object KWHzl(@Query("num") java.lang.Integer num, @Query("rank") java.lang.Integer num2, @Query("earliestDate") java.lang.Long l, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @NotNull Continuation<? super ResponseData<java.util.List<CoinResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/cedefi/alert/unified/rule/list")
    java.lang.Object KWHzl(@Query("sourceType") java.lang.Integer num, @NotNull Continuation<? super ResponseData<java.util.ArrayList<AlertRemindResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/cr/advanced/new-rank")
    java.lang.Object KWHzl(@NotNull @Query("type") java.lang.String str, @Query("earliestDate") long j, @NotNull Continuation<? super ResponseData<java.util.List<NewCoinListResponseBean>>> continuation);

    @GET("priapi/v5/rubik/cr/trend-line")
    java.lang.Object KWHzl(@NotNull @Query("coinList") java.lang.String str, @NotNull @Query("fiatCoin") java.lang.String str2, @Header("Cache-Strategy") @NotNull java.lang.String str3, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<java.util.List<TokenChartResponseBeans>>> continuation);

    @GET("/priapi/v5/rubik/cr/search/hot-rank")
    java.lang.Object KWHzl(@Query("size") java.lang.String str, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CoinResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/category/overview")
    java.lang.Object KWHzl(@NotNull @Query("id") java.lang.String str, @NotNull Continuation<? super ResponseData<CategoryOverviewResponseBean>> continuation);

    @GET("priapi/v5/rubik/cr/rank/market-cap")
    java.lang.Object OLrzqt(@Query("num") java.lang.Integer num, @Query("rank") java.lang.Integer num2, @Query("category") java.lang.String str, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str2, @Header("Cache-Strategy") @NotNull java.lang.String str3, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @NotNull Continuation<? super ResponseData<java.util.List<CoinResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/lite/spot/buy-sell")
    java.lang.Object OLrzqt(@Query("ccy") java.lang.String str, @Query("category") java.lang.String str2, @Header("Cache-Strategy") @NotNull java.lang.String str3, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<java.util.ArrayList<SpotBuyAndSellResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/cr/favorite/coin-rec")
    java.lang.Object OLrzqt(@Query("zone") java.lang.String str, @Query("num") java.lang.String str2, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str3, @Header("Cache-Strategy") @NotNull java.lang.String str4, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @NotNull Continuation<? super ResponseData<java.util.List<CoinResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/search/result")
    java.lang.Object OLrzqt(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) java.lang.String str, @NotNull @Query("filterCexListing") java.lang.String str2, @NotNull @Query("filterChainTag") java.lang.String str3, @NotNull Continuation<? super ResponseData<SpotSearchBotsDexTradersResponseBean>> continuation);

    @GET("/priapi/v5/rubik/lite/market-cap-candles")
    java.lang.Object OLrzqt(@NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str, @NotNull @Query("category") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<java.util.List<java.lang.String>>>> continuation);

    @GET("priapi/v5/rubik/cr/getFairPrice")
    java.lang.Object OLrzqt(@NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str, @Query("tokenList") java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<java.util.List<FairPriceResponseBean>>> continuation);

    @GET("priapi/v5/rubik/cr/business/support")
    java.lang.Object OLrzqt(@NotNull @Query("coin") java.lang.String str, @NotNull Continuation<? super ResponseData<BusinessSupportResponseBean>> continuation);

    @POST("/priapi/v5/rubik/dex/details")
    java.lang.Object OLrzqt(@Body @NotNull java.util.List<DexTokenListRequestBean> list, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/banner/feature-cards")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<FeatureCardsResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/app/public/stock-rank")
    java.lang.Object copydefault(@Query("num") int i, @NotNull Continuation<? super ResponseData<java.util.List<StockRankResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/cr/rank/up-down")
    java.lang.Object copydefault(@Query("num") java.lang.Integer num, @Query("rank") java.lang.Integer num2, @Query("zone") java.lang.String str, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<CoinResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/app/public/hot-rank")
    java.lang.Object copydefault(@NotNull @Query("type") java.lang.String str, @Query("rank") int i, @Query("num") int i2, @NotNull Continuation<? super ResponseData<java.util.List<PairHotResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/private/favorite/adv-recommend")
    java.lang.Object copydefault(@Query("num") java.lang.String str, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i, @Header("Cache-Token-Valid") int i2, @NotNull Continuation<? super ResponseData<java.util.List<FavoriteRecommendResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/category/list")
    java.lang.Object copydefault(@NotNull @Query("interval") java.lang.String str, @NotNull @Query("size") java.lang.String str2, @NotNull @Query("sortBy") java.lang.String str3, @NotNull @Query("timezone") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<TrendingCategoriesResponseBean>>> continuation);

    @GET("/priapi/v5/rubik/category/top-gainers")
    java.lang.Object copydefault(@NotNull @Query("id") java.lang.String str, @NotNull @Query("interval") java.lang.String str2, @NotNull @Query("timezone") java.lang.String str3, @NotNull Continuation<? super ResponseData<CategoryTopGainersResponseBean>> continuation);

    @GET("/priapi/v5/rubik/cedefi/token-risk")
    java.lang.Object copydefault(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("contractAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<DexRiskResponseBean>> continuation);

    @GET("/priapi/v5/rubik/search/hot-rank")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<SearchResponseBean>>> continuation);

    /* JADX INFO: renamed from: o.mDh$Application */
    public static final class Application {
        public static /* synthetic */ java.lang.Object getListByCoin$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListByCoin");
            }
            if ((i & 2) != 0) {
                num = 6;
            }
            return interfaceC31771mDh.EZpvd(str, num, (Continuation<? super ResponseData<java.util.ArrayList<InstrumentItemResponseBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getCeDefiAlertList$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCeDefiAlertList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return interfaceC31771mDh.KWHzl(num, (Continuation<? super ResponseData<java.util.ArrayList<AlertRemindResponseBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getSearchHotRankCoins$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchHotRankCoins");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC31771mDh.KWHzl(str, str2, (Continuation<? super ResponseData<java.util.List<CoinResponseBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getAllMarketCapRankCoins$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31771mDh.OLrzqt((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : num2, (i3 & 4) != 0 ? null : str, str2, (i3 & 16) != 0 ? "FIRST_CACHE" : str3, (i3 & 32) != 0 ? 300 : i, (i3 & 64) != 0 ? 1 : i2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllMarketCapRankCoins");
        }

        public static /* synthetic */ java.lang.Object getHotFeverRankCoins$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31771mDh.AEQbTJ((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, str2, (Continuation<? super ResponseData<java.util.List<CoinResponseBean>>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHotFeverRankCoins");
        }

        public static /* synthetic */ java.lang.Object getUpDownRankCoins$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31771mDh.copydefault((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, str2, (Continuation<? super ResponseData<java.util.List<CoinResponseBean>>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUpDownRankCoins");
        }

        public static /* synthetic */ java.lang.Object getMarketSpotBuyAndSellV2$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketSpotBuyAndSellV2");
            }
            java.lang.String str4 = (i2 & 1) != 0 ? "" : str;
            java.lang.String str5 = (i2 & 2) != 0 ? "" : str2;
            if ((i2 & 8) != 0) {
                i = 300;
            }
            return interfaceC31771mDh.OLrzqt(str4, str5, str3, i, continuation);
        }

        public static /* synthetic */ java.lang.Object getRecommendTokens$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31771mDh.OLrzqt((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, str3, (i3 & 8) != 0 ? "FIRST_CACHE" : str4, (i3 & 16) != 0 ? 86400 : i, (i3 & 32) != 0 ? 1 : i2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendTokens");
        }

        public static /* synthetic */ java.lang.Object getChartsForTokens$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChartsForTokens");
            }
            if ((i2 & 4) != 0) {
                str3 = "NO_CACHE";
            }
            java.lang.String str4 = str3;
            if ((i2 & 8) != 0) {
                i = RemoteMessageConst.DEFAULT_TTL;
            }
            return interfaceC31771mDh.KWHzl(str, str2, str4, i, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mDh */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getFairPrice$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFairPrice");
            }
            if ((i & 2) != 0) {
                list = null;
            }
            return interfaceC31771mDh.OLrzqt(str, (java.util.List<java.lang.String>) list, (Continuation<? super ResponseData<java.util.List<FairPriceResponseBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getRecommendPairs$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendPairs");
            }
            if ((i3 & 1) != 0) {
                str = null;
            }
            java.lang.String str3 = str;
            if ((i3 & 2) != 0) {
                str2 = "FIRST_CACHE";
            }
            java.lang.String str4 = str2;
            if ((i3 & 4) != 0) {
                i = 30;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = 1;
            }
            return interfaceC31771mDh.copydefault(str3, str4, i4, i2, (Continuation<? super ResponseData<java.util.List<FavoriteRecommendResponseBean>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getNewCoins$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.Integer num, java.lang.Integer num2, java.lang.Long l, java.lang.String str, java.lang.String str2, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31771mDh.KWHzl((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : num2, (i3 & 4) != 0 ? null : l, str, (i3 & 16) != 0 ? "FIRST_CACHE" : str2, (i3 & 32) != 0 ? 300 : i, (i3 & 64) != 0 ? 1 : i2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewCoins");
        }

        public static /* synthetic */ java.lang.Object getDexTokenRankingList$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, java.lang.String str4, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31771mDh.EZpvd((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "9" : str2, (i2 & 4) != 0 ? "4" : str3, (i2 & 8) != 0 ? 100 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? "1" : str4, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexTokenRankingList");
        }

        public static /* synthetic */ java.lang.Object searchDexTokenList$default(InterfaceC31771mDh interfaceC31771mDh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchDexTokenList");
            }
            if ((i & 2) != 0) {
                str2 = "4";
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = "1";
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = "0";
            }
            return interfaceC31771mDh.AEQbTJ(str, str5, str6, str4, (Continuation<? super ResponseData<java.util.List<DexTokenResponseBean>>>) continuation);
        }
    }

    /* JADX INFO: renamed from: o.mDh$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity AEQbTJ = new Activity();

        private Activity() {
        }

        public final InterfaceC31771mDh AEQbTJ() {
            return (InterfaceC31771mDh) C31710mBa.okCRHttpService$default(C56524yIo.AEQbTJ(InterfaceC31771mDh.class), null, 1, null);
        }
    }
}
