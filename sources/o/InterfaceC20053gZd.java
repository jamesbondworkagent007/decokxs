package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderRequest;
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
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStrategyNumResponse;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderData;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderCountResponse;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.TeeOrderStatusData;
import com.okinc.business.dex.trade.order.domain.model.TradesOrderData;
import com.okinc.business.dexlogic.bean.HistoryOrdersBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20053gZd {
    java.lang.Object AEQbTJ(@NotNull CTTradesOrderRequest cTTradesOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<TradesOrderData>, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, ? extends java.lang.Exception>> continuation);

    java.lang.Object AEQbTJ(@NotNull HistoryOrderRequest historyOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<HistoryOrderData>, ? extends java.lang.Exception>> continuation);

    java.lang.Object AEQbTJ(java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.String str7, @NotNull Continuation<? super AbstractC43419rot<HistoryOrdersBean, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TeeOrderStatusData>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull CTStrategiesRequest cTStrategiesRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<CTStrategy>, ? extends java.lang.Exception>> continuation);

    java.lang.Object EZpvd(@NotNull CTSubscribeRequest cTSubscribeRequest, @NotNull Continuation<? super AbstractC43419rot<? extends JsonElement, ? extends java.lang.Exception>> continuation);

    java.lang.Object EZpvd(@NotNull GetOrderCountRequest getOrderCountRequest, @NotNull Continuation<? super AbstractC43419rot<OrderCountResponse, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull CopyTradeStatRequest copyTradeStatRequest, @NotNull Continuation<? super AbstractC43419rot<CopyTradingPnLResponse, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull CTPositionsRequest cTPositionsRequest, @NotNull Continuation<? super AbstractC43419rot<CTPositionsResponse, ? extends java.lang.Exception>> continuation);

    java.lang.Object OLrzqt(@NotNull OpenOrderRequest openOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<OpenOrderData>, ? extends java.lang.Exception>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CopyTradeStrategyNumResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull CTFilteredOrderRequest cTFilteredOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<CTFilteredOrderResponse>, ? extends java.lang.Exception>> continuation);

    java.lang.Object copydefault(@NotNull CTOpenOrderRequest cTOpenOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<CTOpenOrderResponse>, ? extends java.lang.Exception>> continuation);

    java.lang.Object copydefault(@NotNull CTSubscribeRequest cTSubscribeRequest, @NotNull Continuation<? super AbstractC43419rot<CTSubscribeResponse, ? extends java.lang.Exception>> continuation);

    java.lang.Object copydefault(@NotNull CTUpdateStatusRequest cTUpdateStatusRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, ? extends java.lang.Exception>> continuation);

    java.lang.Object copydefault(@NotNull CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, ? extends java.lang.Exception>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<TradesOrderData>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<CopyTradeDetail, ? extends java.lang.Exception>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);
}
