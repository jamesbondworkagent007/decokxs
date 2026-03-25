package o;

import com.okinc.dexkline.market.data.model.OverviewData;
import com.okinc.dexkline.market.data.model.TagMetaData;
import com.okinc.dexkline.market.data.model.TransactionInfoData;
import com.okinc.dexkline.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.dexkline.market.data.model.history.HistoryChangeResponse;
import com.okinc.dexkline.market.data.model.history.HistoryFilterConfigResponse;
import com.okinc.dexkline.market.data.model.history.NativeTokenPriceData;
import com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData;
import com.okinc.dexkline.market.data.model.position_pnl.LimitOrderBalanceData;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.dexkline.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: o.mVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC32260mVk {
    @GET("/priapi/v1/dx/market/v2/query/nativeToken/price")
    java.lang.Object AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull Continuation<? super ResponseData<NativeTokenPriceData>> continuation);

    @GET("/priapi/v1/dx/market/v2/my-position/recent-transactions")
    java.lang.Object AEQbTJ(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<PnLTransactionResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/collect/simplify/query")
    java.lang.Object EZpvd(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<java.lang.String>>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading-history/info")
    java.lang.Object EZpvd(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<TransactionInfoData>> continuation);

    @GET("/priapi/v1/dx/market/tag/meta")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<TagMetaData>>> continuation);

    @GET("/priapi/v1/dx/market/v2/getLimitOrderBalance")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LimitOrderBalanceData>> continuation);

    @GET("/priapi/v1/dx/market/v2/trading-history/filter-config")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<HistoryFilterConfigResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/trading-history/filter-list")
    java.lang.Object OLrzqt(@Body @NotNull HistoryChangeFilterRequest historyChangeFilterRequest, @NotNull Continuation<? super ResponseData<HistoryChangeResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/my-position/latest-pnl")
    java.lang.Object OLrzqt(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<LatestPnLData>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/alias/simplify/query")
    java.lang.Object copydefault(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TrackingAddressAlias>>> continuation);

    @GET("/priapi/v1/dx/market/v2/token/overview")
    java.lang.Object copydefault(@QueryMap @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<OverviewData>> continuation);
}
