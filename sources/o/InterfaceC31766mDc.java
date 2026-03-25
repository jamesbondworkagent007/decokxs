package o;

import com.okinc.crcore.coreapi.net.requestbean.ExchangeQuoteRequestBean;
import com.okinc.crcore.coreapi.net.responsebean.CategoryResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyPairsResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CurrencySuggestionPairsResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.ExchangeQuoteResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.IndicativePriceDataResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.MarketHistoryResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.QuickChangeOrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.TxnActivityFilterResponseBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC31766mDc {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    @GET("/v2/asset/activity/filter")
    java.lang.Object AEQbTJ(@Query("queryType") int i, @NotNull Continuation<? super ResponseData<TxnActivityFilterResponseBean>> continuation);

    @GET("/v2/asset/quick/exchange/currency-pairs")
    java.lang.Object EZpvd(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @NotNull @Query("fromCcy") java.lang.String str2, @NotNull @Query("toCcy") java.lang.String str3, @NotNull Continuation<? super ResponseData<ConvertCurrencyPairsResponseBean>> continuation);

    @GET("/v2/asset/quick/exchange/detail")
    java.lang.Object EZpvd(@Query("tradeId") java.lang.String str, @NotNull Continuation<? super ResponseData<QuickChangeOrderDetailResponseBean>> continuation);

    @POST("/v2/asset/quick/exchange/quote")
    java.lang.Object KWHzl(@Body @NotNull ExchangeQuoteRequestBean exchangeQuoteRequestBean, @NotNull Continuation<? super ResponseData<ExchangeQuoteResponseBean>> continuation);

    @GET("/v2/asset/currency-classification")
    java.lang.Object KWHzl(@NotNull @Query("targetId") java.lang.String str, @Query("sort") int i, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i2, @NotNull Continuation<? super ResponseData<java.util.List<CategoryResponseBean>>> continuation);

    @GET("/v2/asset/earn/getOkxUserTxHistoryById")
    java.lang.Object OLrzqt(@Query("id") long j, @NotNull Continuation<? super ResponseData<MarketHistoryResponseBean>> continuation);

    @GET("/v2/asset/quick/exchange/convertExistCurrencies")
    java.lang.Object OLrzqt(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @NotNull @Query("localCurrency") java.lang.String str2, @Query("settleSourceType") java.lang.Integer num2, @Query("filterFundingBalance") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<java.util.ArrayList<ConvertCurrencyResponseBean>>> continuation);

    @GET("/v2/asset/quick/exchange/indicative-quote")
    java.lang.Object OLrzqt(@NotNull @Query("instId") java.lang.String str, @NotNull @Query(OtcExtraKeys.SIDE) java.lang.String str2, @NotNull Continuation<? super ResponseData<IndicativePriceDataResponseBean>> continuation);

    @GET("/v2/asset/quick/exchange/currency-pair-suggestion")
    java.lang.Object copydefault(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Query("symbol") java.lang.String str2, @Query("contextType") java.lang.Integer num2, @NotNull @Query("valuationUnit") java.lang.String str3, @Query("settleSourceType") java.lang.Integer num3, @Query("filterFundingBalance") java.lang.Boolean bool, @NotNull Continuation<? super ResponseData<CurrencySuggestionPairsResponseBean>> continuation);

    @GET("/v2/asset/quick/exchange/convertTo")
    java.lang.Object copydefault(@Header("Cache-Strategy") java.lang.String str, @Header("Cache-Expire") java.lang.Integer num, @Query("from") java.lang.String str2, @Query("localCurrency") java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.ArrayList<ConvertCurrencyResponseBean>>> continuation);

    /* JADX INFO: renamed from: o.mDc$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public final InterfaceC31766mDc AEQbTJ() {
            return (InterfaceC31766mDc) C31710mBa.okCRHttpService$default(C56524yIo.AEQbTJ(InterfaceC31766mDc.class), null, 1, null);
        }
    }
}
