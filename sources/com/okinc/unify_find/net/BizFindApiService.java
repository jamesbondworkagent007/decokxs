package com.okinc.unify_find.net;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.market.bean.PremarketExistPo;
import com.okinc.find_ui.widgetprovider.data.CoinCandle;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsInfo;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PPairsPriceInfo;
import com.okinc.market.common.biz_spot.AnnounceDetail;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.home.NewCoinInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_find.bean.SearchPlateResponse;
import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.MarketCapRank;
import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.RankListConfig;
import com.okinc.unify_find.data.RankTag;
import com.okinc.unify_find.data.TurnOverRank;
import com.okinc.unify_find.data.UpDownRank;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes11.dex */
public interface BizFindApiService {
    @GET("/v2/support/info/announce/detail")
    Object getAnnounceDetail(@NotNull @Query("projectName") String str, @NotNull Continuation<? super ResponseData<AnnounceDetail>> continuation);

    @GET("/priapi/v5/rubik/public/ticker-with-candles")
    Object getAppWidgetTickerInfos(@NotNull @Query("instNames") String str, @NotNull Continuation<? super ResponseData<List<CoinCandle>>> continuation);

    @GET("/priapi/v5/rubik/stat/option/atm-implied-volatility")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getAtmImpliedVolatilityV5(@NotNull @Query("ccy") String str);

    @GET("/priapi/v5/rubik/app/public/tag-k-line")
    AbstractC58185ywX<ResponseData<List<RankTag>>> getConceptTagKLine(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/rubik/app/public/hot-rank")
    AbstractC58185ywX<ResponseData<List<HotRankResponse>>> getHotRank(@QueryMap @NotNull Map<String, String> map, @Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("priapi/v5/rubik/app/public/hot-rank-new")
    AbstractC58185ywX<ResponseData<List<HotRankResponse>>> getHotRankNew(@QueryMap @NotNull Map<String, String> map, @Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/rubik/stat/option/implied-volatility-skew")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getImpliedVolatilitySkewV5(@NotNull @Query("ccy") String str, @NotNull @Query("distance") String str2);

    @GET("/priapi/v5/rubik/stat/option/implied-volatility")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getImpliedVolatilityV5(@NotNull @Query("ccy") String str, @NotNull @Query("expTime") String str2);

    @GET("/priapi/v5/rubik/stat/option/implied-volatility-hist")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getImpliedVolatilityVsIndexHistoricalVolatilityV5(@NotNull @Query("ccy") String str);

    @GET("/priapi/v5/market/candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getMarketCandles(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/rubik/app/public/market-cap-rank")
    AbstractC58185ywX<ResponseData<List<MarketCapRank>>> getMarketCapRank(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/rubik/app/public/new/common-news")
    AbstractC58185ywX<ResponseData<ArrayList<NewCoinInfo>>> getNewCoinNumbers(@NotNull @Query("group") String str, @Header("Cache-Strategy") @NotNull String str2, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/rubik/app/public/new-coin-rank")
    AbstractC58185ywX<ResponseData<List<NewCoinGroupResponse>>> getNewCoinRank(@QueryMap @NotNull Map<String, String> map, @Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/rubik/stat/option/open-interest-volume")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> getOpenInterestAndTradingVolume(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/option/open-interest-volume-expiry")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> getOpenInterestAndTradingVolumeByExpiry(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/option/open-interest-volume-strike")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> getOpenInterestAndTradingVolumeByStrike(@NotNull @Query("ccy") String str, @NotNull @Query("expTime") String str2, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str3);

    @GET("/priapi/v5/rubik/stat/option/open-interest-volume-ratio")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> getOpenInterestVolumeRatio(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/option/order-flow")
    AbstractC58185ywX<ResponseData<List<List<Object>>>> getOrderScatterV5(@NotNull @Query("ccy") String str);

    @GET("v4/c2c/widget/price")
    Object getP2PWidgetCurrencyPairsPrice(@NotNull @Query(OtcExtraKeys.SIDE) String str, @NotNull @Query(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK) String str2, @NotNull @Query(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK) String str3, @NotNull Continuation<? super ResponseData<List<P2PPairsPriceInfo>>> continuation);

    @GET("/v3/c2c/currency/defaultCurrency")
    Object getP2PWidgetDefaultFiat(@NotNull Continuation<? super ResponseData<String>> continuation);

    @GET("v4/c2c/widget/pairs")
    Object getP2PWidgetPairs(@NotNull @Query(OtcExtraKeys.SIDE) String str, @NotNull Continuation<? super ResponseData<List<P2PPairsInfo>>> continuation);

    @GET("/priapi/v5/public/premarket/isExist")
    Object getPremarketIsExist(@NotNull Continuation<? super ResponseData<List<PremarketExistPo>>> continuation);

    @GET("/priapi/v5/rubik/app/public/rank-list")
    AbstractC58185ywX<ResponseData<RankListConfig>> getRanklistConfig();

    @GET("/priapi/v5/public/simpleProduct")
    Object getSimpleInstrumentsInfo(@NotNull @Query("instType") String str, @NotNull Continuation<? super ResponseData<List<InstrumentInfo>>> continuation);

    @GET("/priapi/v5/market/index-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getSpotIndexCandles(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/rubik/stat/option/taker-block-volume")
    AbstractC58185ywX<ResponseData<ArrayList<String>>> getTakerBlockVolume(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/contracts/top-trader-average-margin")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getTopTraderAverageMarginV5(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/stat/contracts/top-trader-sentiment-index")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getTopTraderSentimentIndexV5(@NotNull @Query("ccy") String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str2);

    @GET("/priapi/v5/rubik/app/public/turn-over-rank")
    AbstractC58185ywX<ResponseData<List<TurnOverRank>>> getTurnOverRank(@QueryMap @NotNull Map<String, String> map);

    @GET("/priapi/v5/rubik/app/public/up-down-rank")
    AbstractC58185ywX<ResponseData<List<Map<String, List<UpDownRank>>>>> getUpDownRank(@QueryMap @NotNull Map<String, String> map, @Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v5/rubik/public/rank/customize-main-coins")
    Object getWidgetTopCoins(@Query("type") String str, @NotNull @Query("bizType") String str2, @NotNull Continuation<? super ResponseData<List<String>>> continuation);

    @GET("/priapi/v5/rubik/stat/contracts/funding-rate-history-new")
    AbstractC58185ywX<ResponseData<List<List<String>>>> loadFundRateV5(@NotNull @Query("ccy") String str);

    @GET("/priapi/v5/rubik/stat/contracts/open-interest-volume")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> loadPositionVolumeData(@NotNull @Query("ccy") String str, @NotNull @Query("begin") String str2, @NotNull @Query(TtmlNode.END) String str3, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str4);

    @GET("/priapi/v5/rubik/stat/taker-volume")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> loadSpotBigDataBuySell(@NotNull @Query("ccy") String str, @NotNull @Query("begin") String str2, @NotNull @Query(TtmlNode.END) String str3, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str4, @NotNull @Query("instType") String str5);

    @GET("/priapi/v5/rubik/stat/margin/loan-ratio")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> loadSpotBigDataLendingRate(@NotNull @Query("ccy") String str, @NotNull @Query("begin") String str2, @NotNull @Query(TtmlNode.END) String str3, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str4);

    @GET("/priapi/v5/rubik/stat/contracts/long-short-account-ratio")
    AbstractC58185ywX<ResponseData<ArrayList<ArrayList<String>>>> longShortPositionRatio(@NotNull @Query("ccy") String str, @NotNull @Query("begin") String str2, @NotNull @Query(TtmlNode.END) String str3, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) String str4);

    @GET("/priapi/v5/rubik/search/result-plate")
    Object searchPlate(@NotNull @Query(JwtUtilsKt.DID_METHOD_KEY) String str, @NotNull Continuation<? super ResponseData<SearchPlateResponse>> continuation);

    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC58185ywX getHotRank$default(BizFindApiService bizFindApiService, Map map, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHotRank");
            }
            if ((i2 & 2) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 4) != 0) {
                i = 5;
            }
            return bizFindApiService.getHotRank(map, str, i);
        }

        public static /* synthetic */ AbstractC58185ywX getHotRankNew$default(BizFindApiService bizFindApiService, Map map, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHotRankNew");
            }
            if ((i2 & 2) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 4) != 0) {
                i = 5;
            }
            return bizFindApiService.getHotRankNew(map, str, i);
        }

        public static /* synthetic */ AbstractC58185ywX getNewCoinRank$default(BizFindApiService bizFindApiService, Map map, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewCoinRank");
            }
            if ((i2 & 2) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 4) != 0) {
                i = 5;
            }
            return bizFindApiService.getNewCoinRank(map, str, i);
        }

        public static /* synthetic */ AbstractC58185ywX getUpDownRank$default(BizFindApiService bizFindApiService, Map map, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUpDownRank");
            }
            if ((i2 & 2) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 4) != 0) {
                i = 5;
            }
            return bizFindApiService.getUpDownRank(map, str, i);
        }

        public static /* synthetic */ Object getWidgetTopCoins$default(BizFindApiService bizFindApiService, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWidgetTopCoins");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return bizFindApiService.getWidgetTopCoins(str, str2, continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getNewCoinNumbers$default(BizFindApiService bizFindApiService, String str, String str2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewCoinNumbers");
            }
            if ((i2 & 2) != 0) {
                str2 = "FIRST_CACHE";
            }
            if ((i2 & 4) != 0) {
                i = 60;
            }
            return bizFindApiService.getNewCoinNumbers(str, str2, i);
        }
    }
}
