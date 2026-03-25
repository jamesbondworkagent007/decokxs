package com.okinc.market.common.service;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.dexkline.market.data.model.KlineDexFlashPo;
import com.okinc.kline.data.CompareCandlesItem;
import com.okinc.kline.data.CompareCandlesReq;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KLineTechPic;
import com.okinc.kline.data.KLineTradeSubIndicatorBean;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.data.KlineDrawingDataReq;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.kline.data.QuotePriceBean;
import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.kline.news.data.po.KlineFlashPo;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.KlineIndicatorData;
import com.okinc.market.common.biz_spot.AnnounceDetail;
import com.okinc.market.common.biz_spot.CoinDataInfo;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.biz_spot.bean.DeleteRuleRep;
import com.okinc.market.common.biz_spot.bean.EditAlertReq;
import com.okinc.market.common.biz_spot.bean.TokenTradeInfoData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.CallAuctionInfoData;
import com.okinc.unify_trade.biz.PreQuoteInfoData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import o.C39417pru;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
public interface KlineBizMarketService {
    @POST("/priapi/v5/rubik/alert-common/rule/singleDelete")
    Object deletePriceRemindsByInstName(@Body @NotNull DeleteRuleRep deleteRuleRep, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/rubik/alert-common/rule/edit")
    Object editPriceReminds(@Body @NotNull EditAlertReq editAlertReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/v2/support/info/announce/detail")
    AbstractC58185ywX<ResponseData<AnnounceDetail>> getAnnounceDetail(@NotNull @Query("projectName") String str);

    @GET("/priapi/v5/market/candles-initialtime")
    Object getCandlesInitialTime(@Query("instId") String str, @NotNull Continuation<? super ResponseData<ArrayList<KlineStartTimeVo>>> continuation);

    @GET("/v2/support/info/announce/coinDataInfo")
    AbstractC58185ywX<ResponseData<CoinDataInfo>> getCoinDataInfo(@NotNull @Query("projectName") String str);

    @GET("/priapi/v5/rubik/public/coin-info")
    AbstractC58185ywX<ResponseData<KlineCoinInfo>> getCoinInvestment(@NotNull @Query("ccy") String str);

    @GET("/priapi/v5/market/currency-trend")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getCoinTrendCandles(@NotNull @Query("baseCcy") String str, @NotNull @Query("quoteCcy") String str2, @Query("isPremium") boolean z, @NotNull @Query("bar") String str3, @Query("limit") int i);

    @POST("priapi/v5/market/multi-candles")
    Object getCompareCandles(@Body List<CompareCandlesReq> list, @NotNull Continuation<? super ResponseData<ArrayList<CompareCandlesItem>>> continuation);

    @POST("priapi/v5/market/multi-history-candles")
    Object getCompareHistoryCandles(@Body List<CompareCandlesReq> list, @NotNull Continuation<? super ResponseData<ArrayList<CompareCandlesItem>>> continuation);

    @GET("/priapi/v5/rubik/content/dex/flash/detail/1")
    Object getDexContentFlashNewsList(@NotNull @Query("contractAddress") String str, @NotNull @Query("chainId") String str2, @NotNull @Query("token") String str3, @Query("group") String str4, @Query("cursor") String str5, @Query("size") Integer num, @NotNull Continuation<? super ResponseData<KlineFlashPo>> continuation);

    @GET("/priapi/v5/rubik/content/dex/flash/list/1")
    Object getDexFlashNewsList(@NotNull @Query("contractAddress") String str, @NotNull @Query("chainId") String str2, @NotNull @Query("token") String str3, @Query("group") String str4, @Query("cursor") String str5, @Query("size") Integer num, @NotNull Continuation<? super ResponseData<KlineDexFlashPo>> continuation);

    @GET("/priapi/v5/rubik/line-draw/read")
    AbstractC58185ywX<ResponseData<DrawingDataBean>> getDrawingData(@Query("instId") String str, @Query("timeVersion") String str2);

    @GET("/priapi/v5/rubik/public/stat/indicators")
    AbstractC58185ywX<ResponseData<KLineTradeSubIndicatorBean>> getFutureSubIndicators(@Query("instId") String str, @Query("indicators") String str2, @Query("unit") int i, @Query("limit") Integer num, @Query("bar") String str3, @Query(TtmlNode.RUBY_AFTER) Long l);

    @GET("priapi/v5/market-custom/history-combine-candles")
    Object getHistoryFormulaCandles(@NotNull @Query("calcExpression") String str, @NotNull @Query("instIdArray") String str2, @Query("bar") String str3, @Query(TtmlNode.RUBY_BEFORE) String str4, @Query(TtmlNode.RUBY_AFTER) String str5, @Query("limit") String str6, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    @GET("priapi/v5/market/history-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getHistoryMarketCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4, @Query(TtmlNode.RUBY_BEFORE) String str5);

    @GET("priapi/v5/market/history-index-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getHistoryMarketIndexCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4, @Query(TtmlNode.RUBY_BEFORE) String str5);

    @GET("priapi/v5/market/history-mark-price-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getHistoryMarketPriceCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4, @Query(TtmlNode.RUBY_BEFORE) String str5);

    @GET("/priapi/v5/market/index-candles-initialtime")
    Object getIndexCandlesInitialTime(@Query("instId") String str, @NotNull Continuation<? super ResponseData<ArrayList<KlineStartTimeVo>>> continuation);

    @GET("/priapi/v5/rubik/kline/indicator/read")
    AbstractC58185ywX<ResponseData<KlineIndicatorData>> getIndicatorList(@Query("keyNames") String str, @Query("timeVersion") String str2, @NotNull @Query("isShow") String str3);

    @GET("/priapi/v5/rubik/public/active-list")
    Object getKlineActiveList(@NotNull @Query("ccy") String str, @NotNull @Query("locationCode") String str2, @NotNull @Query("instName") String str3, @NotNull @Query("bizType") String str4, @Query("pageNo") Integer num, @Query("pageSize") Integer num2, @NotNull Continuation<? super ResponseData<KlineActiveListData>> continuation);

    @GET("/priapi/v5/content/public/flash/1")
    Object getKlineContentFlashData(@Query("group") String str, @NotNull @Query("token") String str2, @Query("important") boolean z, @Query("cursor") String str3, @Query("size") Integer num, @NotNull Continuation<? super ResponseData<KlineFlashPo>> continuation);

    @GET("/priapi/v5/rubik/calendar/kline-event")
    Object getKlineEvent(@Query(TtmlNode.RUBY_BEFORE) String str, @Query(TtmlNode.RUBY_AFTER) String str2, @Query("utcZone") String str3, @NotNull Continuation<? super ResponseData<ArrayList<KLineEventBean>>> continuation);

    @GET("/priapi/v5/rubik/alert-common/rule/unified/list")
    AbstractC58185ywX<ResponseData<ArrayList<AlertRemindPo>>> getListByInstrument(@Query("bizType") Integer num, @Query("instrumentName") String str);

    @GET("/priapi/v5/market/mark-price-candles-initialtime")
    Object getMarkCandlesInitialTime(@Query("instId") String str, @NotNull Continuation<? super ResponseData<ArrayList<KlineStartTimeVo>>> continuation);

    @GET("priapi/v5/market/call-auction-details")
    AbstractC58185ywX<ResponseData<List<CallAuctionInfoData>>> getMarketCallAuctionDetails(@NotNull @Query("instId") String str);

    @GET("/priapi/v5/market/market-cap-trend")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getMarketCapTrend(@NotNull @Query("symbol") String str);

    @GET("priapi/v5/public/pre-quote/details")
    AbstractC58185ywX<ResponseData<List<PreQuoteInfoData>>> getPreQuoteDetails(@NotNull @Query("instId") String str);

    @GET("/priapi/v3/b2c/deposit/quotedPrice")
    Object getQuotedPrice(@NotNull @Query("baseCurrency") String str, @NotNull @Query("quoteCurrency") String str2, @NotNull @Query(OtcExtraKeys.SIDE) String str3, @Query(OtcExtraKeys.AMOUNT) String str4, @Query("standard") int i, @Query("depositName") String str5, @NotNull Continuation<? super ResponseData<ArrayList<QuotePriceBean>>> continuation);

    @GET("/v2/asset/earn/categorized-products")
    Object getRecommendEarnProduct(@NotNull @Query("currencyId") String str, @NotNull @Query("page") String str2, @NotNull Continuation<? super ResponseData<List<C39417pru>>> continuation);

    @GET("/priapi/v5/rubik/public/chart/guidance-url")
    AbstractC58185ywX<ResponseData<List<KLineTechPic>>> getTechPics(@Query("language") String str, @Query("type") Integer num, @Query("useLanguage") Boolean bool);

    @GET("/priapi/v5/rubik/public/products")
    AbstractC58185ywX<ResponseData<TokenTradeInfoData>> getTokenTradeData(@NotNull @Query("ccy") String str, @NotNull @Query("ccyType") String str2);

    @GET("/priapi/v5/trade/queryAllOrderKLine")
    AbstractC58185ywX<ResponseData<List<List<String>>>> queryAllOrderKLine(@Query("instId") String str, @Query("instType") String str2, @Query("bar") String str3, @Query(TtmlNode.RUBY_AFTER) Long l, @Query("typeTime") String str4, @Query("ordType") String str5, @Query("_start") String str6, @Query("_end") String str7, @Query("state") String str8);

    @POST("/priapi/v5/rubik/line-draw/write")
    AbstractC58185ywX<ResponseData<List<String>>> uploadDrawingData(@Body KlineDrawingDataReq klineDrawingDataReq);

    @POST("/priapi/v5/rubik/kline/indicator/batch-write")
    AbstractC58185ywX<ResponseData<String>> uploadIndicatorData(@Body List<IndicatorDataReq> list);

    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC58185ywX getHistoryMarketCandles$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getHistoryMarketCandles(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryMarketCandles");
        }

        public static /* synthetic */ AbstractC58185ywX getHistoryMarketPriceCandles$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getHistoryMarketPriceCandles(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryMarketPriceCandles");
        }

        public static /* synthetic */ AbstractC58185ywX getHistoryMarketIndexCandles$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getHistoryMarketIndexCandles(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryMarketIndexCandles");
        }

        public static /* synthetic */ Object getQuotedPrice$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, int i, String str5, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getQuotedPrice(str, str2, str3, str4, i, (i2 & 32) != 0 ? null : str5, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuotedPrice");
        }

        public static /* synthetic */ Object getRecommendEarnProduct$default(KlineBizMarketService klineBizMarketService, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendEarnProduct");
            }
            if ((i & 2) != 0) {
                str2 = "TOKEN_PAGE";
            }
            return klineBizMarketService.getRecommendEarnProduct(str, str2, continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getIndicatorList$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIndicatorList");
            }
            if ((i & 4) != 0) {
                str3 = "1";
            }
            return klineBizMarketService.getIndicatorList(str, str2, str3);
        }

        public static /* synthetic */ Object getKlineActiveList$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, Integer num, Integer num2, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getKlineActiveList(str, str2, str3, str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineActiveList");
        }

        public static /* synthetic */ Object getDexFlashNewsList$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, String str5, Integer num, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getDexFlashNewsList(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexFlashNewsList");
        }

        public static /* synthetic */ Object getDexContentFlashNewsList$default(KlineBizMarketService klineBizMarketService, String str, String str2, String str3, String str4, String str5, Integer num, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return klineBizMarketService.getDexContentFlashNewsList(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexContentFlashNewsList");
        }
    }
}
