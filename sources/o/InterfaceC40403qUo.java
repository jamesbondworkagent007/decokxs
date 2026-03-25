package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.qUo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40403qUo {
    public static final int BATCH_REQUEST_MAX_COUNT = 50;
    public static final Activity Companion = Activity.KWHzl;

    @GET("priapi/v5/market/index-tickers")
    java.lang.Object AEQbTJ(@Query("quoteCcy") java.lang.String str, @Query("instId") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<IndexTickersData>>> continuation);

    @GET("priapi/v5/market/mult-cup-tickers")
    java.lang.Object EZpvd(@NotNull @Query("ccys") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    @GET("/priapi/v5/market/sort-mp-tickers")
    java.lang.Object OLrzqt(@NotNull @Query("instType") java.lang.String str, @Query("instFamily") java.lang.String str2, @NotNull @Query("sortField") java.lang.String str3, @Query(OtcExtraKeys.ORDER) java.lang.String str4, @Query("sz") java.lang.String str5, @NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    @GET("priapi/v5/market/tickers")
    java.lang.Object OLrzqt(@NotNull @Query("instType") java.lang.String str, @Query("instFamily") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    @GET("/priapi/v5/market/mult-mp-tickers")
    java.lang.Object OLrzqt(@NotNull @Query("instIds") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    @GET("priapi/v5/market/mult-tickers")
    java.lang.Object copydefault(@NotNull @Query("instIds") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    @GET("priapi/v5/market/all-cup-tickers")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<TickersData>>> continuation);

    /* JADX INFO: renamed from: o.qUo$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.qUo$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getMarketAllPairTickers$default(InterfaceC40403qUo interfaceC40403qUo, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketAllPairTickers");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC40403qUo.OLrzqt(str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getMarketAllMarkPriceTickers$default(InterfaceC40403qUo interfaceC40403qUo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketAllMarkPriceTickers");
            }
            if ((i & 1) != 0) {
                str = "OPTION";
            }
            return interfaceC40403qUo.OLrzqt(str, str2, str3, str4, str5, continuation);
        }
    }
}
