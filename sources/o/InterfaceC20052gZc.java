package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CTPositionsRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategiesRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CTTradesOrderRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTUpdateStatusRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStrategyNumRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStrategyNumResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderResponse;
import com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderData;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderCountResponse;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.TeeOrderStatusData;
import com.okinc.business.dex.trade.order.domain.model.TradesOrderData;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.business.dexlogic.bean.HistoryOrdersBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.gZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20052gZc {
    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/copyTrade/getOpenOrderList")
    java.lang.Object AEQbTJ(@Body @NotNull CTOpenOrderRequest cTOpenOrderRequest, @NotNull Continuation<? super ResponseData<OrderListPagerResult<CTOpenOrderResponse>>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/common/subscribe")
    java.lang.Object AEQbTJ(@Body @NotNull CTSubscribeRequest cTSubscribeRequest, @NotNull Continuation<? super ResponseData<CTSubscribeResponse>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/common/unsubscribe")
    java.lang.Object EZpvd(@Body @NotNull CTSubscribeRequest cTSubscribeRequest, @NotNull Continuation<? super ResponseData<JsonElement>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/trade/multi/v2/orderHistory")
    java.lang.Object EZpvd(@Body @NotNull HistoryOrderRequest historyOrderRequest, @NotNull Continuation<? super ResponseData<OrderListPagerResult<HistoryOrderData>>> continuation);

    @InterfaceC9841bdG
    @GET("/priapi/v1/dx/strategy/copyTrade/getFilteredList")
    java.lang.Object EZpvd(@NotNull @Query("accountId") java.lang.String str, @NotNull @Query("strategyId") java.lang.String str2, @Query("cursor") java.lang.String str3, @Query("limit") java.lang.Integer num, @NotNull Continuation<? super ResponseData<OrderListPagerResult<CTFilteredOrderResponse>>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/copyTrade/getCopyTradeList")
    java.lang.Object KWHzl(@Body @NotNull CTStrategiesRequest cTStrategiesRequest, @NotNull Continuation<? super ResponseData<OrderListPagerResult<CTStrategy>>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/common/cancel")
    java.lang.Object KWHzl(@Body @NotNull CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, @NotNull Continuation<? super ResponseData<CancelOrReactivateOrderResponse>> continuation);

    @POST("/priapi/v1/dx/strategy/common/getActiveStats")
    java.lang.Object KWHzl(@Body @NotNull GetOrderCountRequest getOrderCountRequest, @NotNull Continuation<? super ResponseData<OrderCountResponse>> continuation);

    @GET("/priapi/v1/dx/trade/bridge/ordersByPage")
    java.lang.Object KWHzl(@Query("lastCreateTime") java.lang.String str, @Query("pageSize") int i, @NotNull @Query("accountId") java.lang.String str2, @Query("fromChainId") java.lang.String str3, @Query("toChainId") java.lang.String str4, @Query("fromTokenAddress") java.lang.String str5, @Query("toTokenAddress") java.lang.String str6, @Query("status") java.lang.Integer num, @Query("inputContent") java.lang.String str7, @NotNull Continuation<? super ResponseData<HistoryOrdersBean>> continuation);

    @InterfaceC9841bdG
    @GET("/priapi/v1/dx/strategy/copyTrade/copyTradeDetail")
    java.lang.Object KWHzl(@Query("accountId") java.lang.String str, @NotNull @Query("strategyId") java.lang.String str2, @NotNull Continuation<? super ResponseData<CopyTradeDetail>> continuation);

    @GET("/priapi/v1/dx/trade/multi/getOpenOrderStatusList")
    java.lang.Object KWHzl(@NotNull @Query("accountId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<TeeOrderStatusData>>> continuation);

    @GET("/priapi/v1/dx/trade/single/searchOrders")
    java.lang.Object OLrzqt(@Query("execStatus") int i, @Query("lastCreateTime") java.lang.String str, @Query("pageSize") int i2, @NotNull @Query("accountId") java.lang.String str2, @Query("status") java.lang.Integer num, @Query(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) java.lang.Integer num2, @Query("chainId") java.lang.String str3, @Query("tokenAddress") java.lang.String str4, @NotNull Continuation<? super ResponseData<java.util.List<DefiBridgeOrderInfo>>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/common/getTokenPositions")
    java.lang.Object OLrzqt(@Body @NotNull CTPositionsRequest cTPositionsRequest, @NotNull Continuation<? super ResponseData<CTPositionsResponse>> continuation);

    @POST("/priapi/v1/dx/strategy/common/getTradeList")
    java.lang.Object OLrzqt(@Body @NotNull CTTradesOrderRequest cTTradesOrderRequest, @NotNull Continuation<? super ResponseData<OrderListPagerResult<TradesOrderData>>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/copyTrade/updateStatus")
    java.lang.Object OLrzqt(@Body @NotNull CTUpdateStatusRequest cTUpdateStatusRequest, @NotNull Continuation<? super ResponseData<CancelOrReactivateOrderResponse>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/strategy/common/reactivate")
    java.lang.Object OLrzqt(@Body @NotNull CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, @NotNull Continuation<? super ResponseData<CancelOrReactivateOrderResponse>> continuation);

    @InterfaceC9841bdG
    @POST("/priapi/v1/dx/trade/multi/v3/openOrder")
    java.lang.Object OLrzqt(@Body @NotNull OpenOrderRequest openOrderRequest, @NotNull Continuation<? super ResponseData<OrderListPagerResult<OpenOrderData>>> continuation);

    @GET("/priapi/v1/dx/trade/multi/myTrades")
    java.lang.Object OLrzqt(@NotNull @Query("accountId") java.lang.String str, @Query("chainId") java.lang.String str2, @Query("cursor") java.lang.String str3, @Query("pageSize") java.lang.Integer num, @Query("status") java.lang.Integer num2, @NotNull Continuation<? super ResponseData<OrderListPagerResult<TradesOrderData>>> continuation);

    @POST("/priapi/v1/dx/trade/bridge/pending/orders")
    java.lang.Object OLrzqt(@Body @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<java.util.List<DefiBridgeOrderInfo>>> continuation);

    @POST("/priapi/v1/dx/strategy/copyTrade/getCopyTradeStat")
    java.lang.Object copydefault(@Body @NotNull CopyTradeStatRequest copyTradeStatRequest, @NotNull Continuation<? super ResponseData<CopyTradingPnLResponse>> continuation);

    @POST("/priapi/v1/dx/strategy/copyTrade/countCopyTradeStrategyNum")
    java.lang.Object copydefault(@Body @NotNull CopyTradeStrategyNumRequest copyTradeStrategyNumRequest, @NotNull Continuation<? super ResponseData<CopyTradeStrategyNumResponse>> continuation);
}
