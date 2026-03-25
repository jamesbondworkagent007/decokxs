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
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$cancelOrders$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$fetchCopyTradeStat$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$fetchCopyTradeStat$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$fetchStrategies$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$fetchStrategies$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getBridgeHistoryOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getBridgeOpenOrderList$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getBridgeOpenOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeDetail$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeDetail$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeFilteredOrderList$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeFilteredOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeOpenOrderList$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeOpenOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeStrategyNum$$inlined$getNewApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getCopyTradeStrategyNum$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getHistoryOrderList$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getHistoryOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getMaxActiveStrategyCount$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getOpenOrderList$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getOpenOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getStrategyOrderCount$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getStrategyOrderCount$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getStrategyPositions$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getStrategyPositions$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getStrategyTradesList$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getStrategyTradesList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getSwapOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getTeeOpenOrderStatusList$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getTeeOpenOrderStatusList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getTradesOrderList$$inlined$getApiResult$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$getTradesOrderList$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$reactivateOrders$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$reactivateOrders$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$subscribeSocket$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$subscribeSocket$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$unSubscribeSocket$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$unSubscribeSocket$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$updateCopeTradeOrderStatus$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.order.data.repo.OrderListRepositoryImpl$updateCopeTradeOrderStatus$1;
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
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20051gZb implements InterfaceC20053gZd {
    public java.lang.String EZpvd;
    public final CoroutineDispatcher KWHzl;
    public int OLrzqt;
    public final InterfaceC20052gZc copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public C20051gZb(@NotNull InterfaceC20052gZc interfaceC20052gZc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC20052gZc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC20052gZc;
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = "";
        this.OLrzqt = -1;
    }

    /* JADX INFO: renamed from: o.gZb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gZb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(int i, java.lang.String str, int i2, @NotNull java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiBridgeOrderInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getSwapOrderList$1 orderListRepositoryImpl$getSwapOrderList$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getSwapOrderList$1) {
            orderListRepositoryImpl$getSwapOrderList$1 = (OrderListRepositoryImpl$getSwapOrderList$1) continuation;
            int i3 = orderListRepositoryImpl$getSwapOrderList$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getSwapOrderList$1.label = i3 - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getSwapOrderList$1 = new OrderListRepositoryImpl$getSwapOrderList$1(this, continuation);
            }
        }
        OrderListRepositoryImpl$getSwapOrderList$1 orderListRepositoryImpl$getSwapOrderList$12 = orderListRepositoryImpl$getSwapOrderList$1;
        java.lang.Object objWithContext = orderListRepositoryImpl$getSwapOrderList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = orderListRepositoryImpl$getSwapOrderList$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1 orderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1(null, this, i, str, i2, str2, num, num2, str3, str4);
                orderListRepositoryImpl$getSwapOrderList$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getSwapOrderList$$inlined$getApiResult$1, orderListRepositoryImpl$getSwapOrderList$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.String str7, @NotNull Continuation<? super AbstractC43419rot<HistoryOrdersBean, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getBridgeHistoryOrderList$1 orderListRepositoryImpl$getBridgeHistoryOrderList$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getBridgeHistoryOrderList$1) {
            orderListRepositoryImpl$getBridgeHistoryOrderList$1 = (OrderListRepositoryImpl$getBridgeHistoryOrderList$1) continuation;
            int i2 = orderListRepositoryImpl$getBridgeHistoryOrderList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getBridgeHistoryOrderList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getBridgeHistoryOrderList$1 = new OrderListRepositoryImpl$getBridgeHistoryOrderList$1(this, continuation);
            }
        }
        OrderListRepositoryImpl$getBridgeHistoryOrderList$1 orderListRepositoryImpl$getBridgeHistoryOrderList$12 = orderListRepositoryImpl$getBridgeHistoryOrderList$1;
        java.lang.Object objWithContext = orderListRepositoryImpl$getBridgeHistoryOrderList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = orderListRepositoryImpl$getBridgeHistoryOrderList$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1 orderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1(null, this, str, i, str2, str3, str4, str5, str6, num, str7);
                orderListRepositoryImpl$getBridgeHistoryOrderList$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getBridgeHistoryOrderList$$inlined$getApiResult$1, orderListRepositoryImpl$getBridgeHistoryOrderList$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiBridgeOrderInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getBridgeOpenOrderList$1 orderListRepositoryImpl$getBridgeOpenOrderList$1;
        if (continuation instanceof OrderListRepositoryImpl$getBridgeOpenOrderList$1) {
            orderListRepositoryImpl$getBridgeOpenOrderList$1 = (OrderListRepositoryImpl$getBridgeOpenOrderList$1) continuation;
            int i = orderListRepositoryImpl$getBridgeOpenOrderList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getBridgeOpenOrderList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getBridgeOpenOrderList$1 = new OrderListRepositoryImpl$getBridgeOpenOrderList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getBridgeOpenOrderList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getBridgeOpenOrderList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getBridgeOpenOrderList$$inlined$getApiResult$1 orderListRepositoryImpl$getBridgeOpenOrderList$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getBridgeOpenOrderList$$inlined$getApiResult$1(null, this, str);
                orderListRepositoryImpl$getBridgeOpenOrderList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getBridgeOpenOrderList$$inlined$getApiResult$1, orderListRepositoryImpl$getBridgeOpenOrderList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TeeOrderStatusData>, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getTeeOpenOrderStatusList$1 orderListRepositoryImpl$getTeeOpenOrderStatusList$1;
        if (continuation instanceof OrderListRepositoryImpl$getTeeOpenOrderStatusList$1) {
            orderListRepositoryImpl$getTeeOpenOrderStatusList$1 = (OrderListRepositoryImpl$getTeeOpenOrderStatusList$1) continuation;
            int i = orderListRepositoryImpl$getTeeOpenOrderStatusList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getTeeOpenOrderStatusList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getTeeOpenOrderStatusList$1 = new OrderListRepositoryImpl$getTeeOpenOrderStatusList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getTeeOpenOrderStatusList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getTeeOpenOrderStatusList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getTeeOpenOrderStatusList$$inlined$getApiResult$1 orderListRepositoryImpl$getTeeOpenOrderStatusList$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getTeeOpenOrderStatusList$$inlined$getApiResult$1(null, this, str);
                orderListRepositoryImpl$getTeeOpenOrderStatusList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getTeeOpenOrderStatusList$$inlined$getApiResult$1, orderListRepositoryImpl$getTeeOpenOrderStatusList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull OpenOrderRequest openOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<OpenOrderData>, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getOpenOrderList$1 orderListRepositoryImpl$getOpenOrderList$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getOpenOrderList$1) {
            orderListRepositoryImpl$getOpenOrderList$1 = (OrderListRepositoryImpl$getOpenOrderList$1) continuation;
            int i = orderListRepositoryImpl$getOpenOrderList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getOpenOrderList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getOpenOrderList$1 = new OrderListRepositoryImpl$getOpenOrderList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getOpenOrderList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getOpenOrderList$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$getOpenOrderList$1.L$0 = null;
                orderListRepositoryImpl$getOpenOrderList$1.L$1 = null;
                orderListRepositoryImpl$getOpenOrderList$1.label = 2;
                objWithContext = interfaceC20052gZc.OLrzqt(openOrderRequest, orderListRepositoryImpl$getOpenOrderList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$getOpenOrderList$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$getOpenOrderList$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$getOpenOrderList$$inlined$getApiResultWithJwtCheck$1(null, this, openOrderRequest);
            orderListRepositoryImpl$getOpenOrderList$1.L$0 = this;
            orderListRepositoryImpl$getOpenOrderList$1.L$1 = openOrderRequest;
            orderListRepositoryImpl$getOpenOrderList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getOpenOrderList$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$getOpenOrderList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            openOrderRequest = (OpenOrderRequest) orderListRepositoryImpl$getOpenOrderList$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getOpenOrderList$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$getOpenOrderList$1.L$0 = null;
            orderListRepositoryImpl$getOpenOrderList$1.L$1 = null;
            orderListRepositoryImpl$getOpenOrderList$1.label = 2;
            objWithContext = interfaceC20052gZc2.OLrzqt(openOrderRequest, orderListRepositoryImpl$getOpenOrderList$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull HistoryOrderRequest historyOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<HistoryOrderData>, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getHistoryOrderList$1 orderListRepositoryImpl$getHistoryOrderList$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getHistoryOrderList$1) {
            orderListRepositoryImpl$getHistoryOrderList$1 = (OrderListRepositoryImpl$getHistoryOrderList$1) continuation;
            int i = orderListRepositoryImpl$getHistoryOrderList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getHistoryOrderList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getHistoryOrderList$1 = new OrderListRepositoryImpl$getHistoryOrderList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getHistoryOrderList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getHistoryOrderList$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$getHistoryOrderList$1.L$0 = null;
                orderListRepositoryImpl$getHistoryOrderList$1.L$1 = null;
                orderListRepositoryImpl$getHistoryOrderList$1.label = 2;
                objWithContext = interfaceC20052gZc.EZpvd(historyOrderRequest, orderListRepositoryImpl$getHistoryOrderList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$getHistoryOrderList$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$getHistoryOrderList$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$getHistoryOrderList$$inlined$getApiResultWithJwtCheck$1(null, this, historyOrderRequest);
            orderListRepositoryImpl$getHistoryOrderList$1.L$0 = this;
            orderListRepositoryImpl$getHistoryOrderList$1.L$1 = historyOrderRequest;
            orderListRepositoryImpl$getHistoryOrderList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getHistoryOrderList$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$getHistoryOrderList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            historyOrderRequest = (HistoryOrderRequest) orderListRepositoryImpl$getHistoryOrderList$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getHistoryOrderList$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$getHistoryOrderList$1.L$0 = null;
            orderListRepositoryImpl$getHistoryOrderList$1.L$1 = null;
            orderListRepositoryImpl$getHistoryOrderList$1.label = 2;
            objWithContext = interfaceC20052gZc2.EZpvd(historyOrderRequest, orderListRepositoryImpl$getHistoryOrderList$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull GetOrderCountRequest getOrderCountRequest, @NotNull Continuation<? super AbstractC43419rot<OrderCountResponse, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getStrategyOrderCount$1 orderListRepositoryImpl$getStrategyOrderCount$1;
        if (continuation instanceof OrderListRepositoryImpl$getStrategyOrderCount$1) {
            orderListRepositoryImpl$getStrategyOrderCount$1 = (OrderListRepositoryImpl$getStrategyOrderCount$1) continuation;
            int i = orderListRepositoryImpl$getStrategyOrderCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getStrategyOrderCount$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getStrategyOrderCount$1 = new OrderListRepositoryImpl$getStrategyOrderCount$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getStrategyOrderCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getStrategyOrderCount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getStrategyOrderCount$$inlined$getApiResult$1 orderListRepositoryImpl$getStrategyOrderCount$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getStrategyOrderCount$$inlined$getApiResult$1(null, this, getOrderCountRequest);
                orderListRepositoryImpl$getStrategyOrderCount$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getStrategyOrderCount$$inlined$getApiResult$1, orderListRepositoryImpl$getStrategyOrderCount$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<TradesOrderData>, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getTradesOrderList$1 orderListRepositoryImpl$getTradesOrderList$1;
        if (continuation instanceof OrderListRepositoryImpl$getTradesOrderList$1) {
            orderListRepositoryImpl$getTradesOrderList$1 = (OrderListRepositoryImpl$getTradesOrderList$1) continuation;
            int i = orderListRepositoryImpl$getTradesOrderList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getTradesOrderList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getTradesOrderList$1 = new OrderListRepositoryImpl$getTradesOrderList$1(this, continuation);
            }
        }
        OrderListRepositoryImpl$getTradesOrderList$1 orderListRepositoryImpl$getTradesOrderList$12 = orderListRepositoryImpl$getTradesOrderList$1;
        java.lang.Object objWithContext = orderListRepositoryImpl$getTradesOrderList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getTradesOrderList$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getTradesOrderList$$inlined$getApiResult$1 orderListRepositoryImpl$getTradesOrderList$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getTradesOrderList$$inlined$getApiResult$1(null, this, str, str2, str3, num, num2);
                orderListRepositoryImpl$getTradesOrderList$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getTradesOrderList$$inlined$getApiResult$1, orderListRepositoryImpl$getTradesOrderList$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$cancelOrders$1 orderListRepositoryImpl$cancelOrders$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$cancelOrders$1) {
            orderListRepositoryImpl$cancelOrders$1 = (OrderListRepositoryImpl$cancelOrders$1) continuation;
            int i = orderListRepositoryImpl$cancelOrders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$cancelOrders$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$cancelOrders$1 = new OrderListRepositoryImpl$cancelOrders$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$cancelOrders$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$cancelOrders$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$cancelOrders$1.L$0 = null;
                orderListRepositoryImpl$cancelOrders$1.L$1 = null;
                orderListRepositoryImpl$cancelOrders$1.label = 2;
                objWithContext = interfaceC20052gZc.KWHzl(cancelOrReactivateOrderRequest, orderListRepositoryImpl$cancelOrders$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                }
            } else {
                OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1(null, this, cancelOrReactivateOrderRequest);
                orderListRepositoryImpl$cancelOrders$1.L$0 = this;
                orderListRepositoryImpl$cancelOrders$1.L$1 = cancelOrReactivateOrderRequest;
                orderListRepositoryImpl$cancelOrders$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$cancelOrders$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$cancelOrders$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c20051gZb = this;
            }
        } else if (i2 == 1) {
            cancelOrReactivateOrderRequest = (CancelOrReactivateOrderRequest) orderListRepositoryImpl$cancelOrders$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$cancelOrders$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                }
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                    return new AbstractC43419rot.StateListAnimator(C56443yFo.AEQbTJ(((CancelOrReactivateOrderResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()).getUpdateNum()));
                }
                if (stateListAnimator instanceof AbstractC43419rot.ActionBar) {
                    return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$cancelOrders$1.L$0 = null;
            orderListRepositoryImpl$cancelOrders$1.L$1 = null;
            orderListRepositoryImpl$cancelOrders$1.label = 2;
            objWithContext = interfaceC20052gZc2.KWHzl(cancelOrReactivateOrderRequest, orderListRepositoryImpl$cancelOrders$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$reactivateOrders$1 orderListRepositoryImpl$reactivateOrders$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$reactivateOrders$1) {
            orderListRepositoryImpl$reactivateOrders$1 = (OrderListRepositoryImpl$reactivateOrders$1) continuation;
            int i = orderListRepositoryImpl$reactivateOrders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$reactivateOrders$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$reactivateOrders$1 = new OrderListRepositoryImpl$reactivateOrders$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$reactivateOrders$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$reactivateOrders$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$reactivateOrders$1.L$0 = null;
                orderListRepositoryImpl$reactivateOrders$1.L$1 = null;
                orderListRepositoryImpl$reactivateOrders$1.label = 2;
                objWithContext = interfaceC20052gZc.OLrzqt(cancelOrReactivateOrderRequest, orderListRepositoryImpl$reactivateOrders$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                }
            } else {
                OrderListRepositoryImpl$reactivateOrders$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$reactivateOrders$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$reactivateOrders$$inlined$getApiResultWithJwtCheck$1(null, this, cancelOrReactivateOrderRequest);
                orderListRepositoryImpl$reactivateOrders$1.L$0 = this;
                orderListRepositoryImpl$reactivateOrders$1.L$1 = cancelOrReactivateOrderRequest;
                orderListRepositoryImpl$reactivateOrders$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$reactivateOrders$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$reactivateOrders$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c20051gZb = this;
            }
        } else if (i2 == 1) {
            cancelOrReactivateOrderRequest = (CancelOrReactivateOrderRequest) orderListRepositoryImpl$reactivateOrders$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$reactivateOrders$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                }
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                    return new AbstractC43419rot.StateListAnimator(C56443yFo.AEQbTJ(((CancelOrReactivateOrderResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()).getUpdateNum()));
                }
                if (stateListAnimator instanceof AbstractC43419rot.ActionBar) {
                    return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$reactivateOrders$1.L$0 = null;
            orderListRepositoryImpl$reactivateOrders$1.L$1 = null;
            orderListRepositoryImpl$reactivateOrders$1.label = 2;
            objWithContext = interfaceC20052gZc2.OLrzqt(cancelOrReactivateOrderRequest, orderListRepositoryImpl$reactivateOrders$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:12:0x0029, B:34:0x007f, B:35:0x0081, B:37:0x0087, B:39:0x008d, B:40:0x009a, B:17:0x0041, B:25:0x0064, B:31:0x006c, B:21:0x004f), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<CopyTradeDetail, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getCopyTradeDetail$1 orderListRepositoryImpl$getCopyTradeDetail$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getCopyTradeDetail$1) {
            orderListRepositoryImpl$getCopyTradeDetail$1 = (OrderListRepositoryImpl$getCopyTradeDetail$1) continuation;
            int i = orderListRepositoryImpl$getCopyTradeDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getCopyTradeDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getCopyTradeDetail$1 = new OrderListRepositoryImpl$getCopyTradeDetail$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getCopyTradeDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getCopyTradeDetail$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$getCopyTradeDetail$1.L$0 = null;
                orderListRepositoryImpl$getCopyTradeDetail$1.L$1 = null;
                orderListRepositoryImpl$getCopyTradeDetail$1.L$2 = null;
                orderListRepositoryImpl$getCopyTradeDetail$1.label = 2;
                objWithContext = interfaceC20052gZc.KWHzl(str, str2, orderListRepositoryImpl$getCopyTradeDetail$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$getCopyTradeDetail$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$getCopyTradeDetail$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$getCopyTradeDetail$$inlined$getApiResultWithJwtCheck$1(null, this, str, str2);
            orderListRepositoryImpl$getCopyTradeDetail$1.L$0 = this;
            orderListRepositoryImpl$getCopyTradeDetail$1.L$1 = str;
            orderListRepositoryImpl$getCopyTradeDetail$1.L$2 = str2;
            orderListRepositoryImpl$getCopyTradeDetail$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getCopyTradeDetail$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$getCopyTradeDetail$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            java.lang.String str3 = (java.lang.String) orderListRepositoryImpl$getCopyTradeDetail$1.L$2;
            java.lang.String str4 = (java.lang.String) orderListRepositoryImpl$getCopyTradeDetail$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getCopyTradeDetail$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            str2 = str3;
            str = str4;
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$getCopyTradeDetail$1.L$0 = null;
            orderListRepositoryImpl$getCopyTradeDetail$1.L$1 = null;
            orderListRepositoryImpl$getCopyTradeDetail$1.L$2 = null;
            orderListRepositoryImpl$getCopyTradeDetail$1.label = 2;
            objWithContext = interfaceC20052gZc2.KWHzl(str, str2, orderListRepositoryImpl$getCopyTradeDetail$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull CopyTradeStatRequest copyTradeStatRequest, @NotNull Continuation<? super AbstractC43419rot<CopyTradingPnLResponse, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$fetchCopyTradeStat$1 orderListRepositoryImpl$fetchCopyTradeStat$1;
        if (continuation instanceof OrderListRepositoryImpl$fetchCopyTradeStat$1) {
            orderListRepositoryImpl$fetchCopyTradeStat$1 = (OrderListRepositoryImpl$fetchCopyTradeStat$1) continuation;
            int i = orderListRepositoryImpl$fetchCopyTradeStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$fetchCopyTradeStat$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$fetchCopyTradeStat$1 = new OrderListRepositoryImpl$fetchCopyTradeStat$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$fetchCopyTradeStat$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$fetchCopyTradeStat$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$fetchCopyTradeStat$$inlined$getApiResult$1 orderListRepositoryImpl$fetchCopyTradeStat$$inlined$getApiResult$1 = new OrderListRepositoryImpl$fetchCopyTradeStat$$inlined$getApiResult$1(null, this, copyTradeStatRequest);
                orderListRepositoryImpl$fetchCopyTradeStat$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$fetchCopyTradeStat$$inlined$getApiResult$1, orderListRepositoryImpl$fetchCopyTradeStat$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CTOpenOrderRequest cTOpenOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<CTOpenOrderResponse>, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getCopyTradeOpenOrderList$1 orderListRepositoryImpl$getCopyTradeOpenOrderList$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getCopyTradeOpenOrderList$1) {
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1 = (OrderListRepositoryImpl$getCopyTradeOpenOrderList$1) continuation;
            int i = orderListRepositoryImpl$getCopyTradeOpenOrderList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getCopyTradeOpenOrderList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getCopyTradeOpenOrderList$1 = new OrderListRepositoryImpl$getCopyTradeOpenOrderList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getCopyTradeOpenOrderList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getCopyTradeOpenOrderList$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$0 = null;
                orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$1 = null;
                orderListRepositoryImpl$getCopyTradeOpenOrderList$1.label = 2;
                objWithContext = interfaceC20052gZc.AEQbTJ(cTOpenOrderRequest, orderListRepositoryImpl$getCopyTradeOpenOrderList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$getCopyTradeOpenOrderList$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$getCopyTradeOpenOrderList$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$getCopyTradeOpenOrderList$$inlined$getApiResultWithJwtCheck$1(null, this, cTOpenOrderRequest);
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$0 = this;
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$1 = cTOpenOrderRequest;
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getCopyTradeOpenOrderList$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$getCopyTradeOpenOrderList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            cTOpenOrderRequest = (CTOpenOrderRequest) orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$0 = null;
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1.L$1 = null;
            orderListRepositoryImpl$getCopyTradeOpenOrderList$1.label = 2;
            objWithContext = interfaceC20052gZc2.AEQbTJ(cTOpenOrderRequest, orderListRepositoryImpl$getCopyTradeOpenOrderList$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull CTStrategiesRequest cTStrategiesRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<CTStrategy>, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$fetchStrategies$1 orderListRepositoryImpl$fetchStrategies$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$fetchStrategies$1) {
            orderListRepositoryImpl$fetchStrategies$1 = (OrderListRepositoryImpl$fetchStrategies$1) continuation;
            int i = orderListRepositoryImpl$fetchStrategies$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$fetchStrategies$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$fetchStrategies$1 = new OrderListRepositoryImpl$fetchStrategies$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$fetchStrategies$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$fetchStrategies$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$fetchStrategies$1.L$0 = null;
                orderListRepositoryImpl$fetchStrategies$1.L$1 = null;
                orderListRepositoryImpl$fetchStrategies$1.label = 2;
                objWithContext = interfaceC20052gZc.KWHzl(cTStrategiesRequest, orderListRepositoryImpl$fetchStrategies$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$fetchStrategies$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$fetchStrategies$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$fetchStrategies$$inlined$getApiResultWithJwtCheck$1(null, this, cTStrategiesRequest);
            orderListRepositoryImpl$fetchStrategies$1.L$0 = this;
            orderListRepositoryImpl$fetchStrategies$1.L$1 = cTStrategiesRequest;
            orderListRepositoryImpl$fetchStrategies$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$fetchStrategies$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$fetchStrategies$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            cTStrategiesRequest = (CTStrategiesRequest) orderListRepositoryImpl$fetchStrategies$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$fetchStrategies$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$fetchStrategies$1.L$0 = null;
            orderListRepositoryImpl$fetchStrategies$1.L$1 = null;
            orderListRepositoryImpl$fetchStrategies$1.label = 2;
            objWithContext = interfaceC20052gZc2.KWHzl(cTStrategiesRequest, orderListRepositoryImpl$fetchStrategies$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:12:0x002a, B:34:0x008c, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:40:0x00a7, B:17:0x003e, B:25:0x005c, B:31:0x0064, B:21:0x0049), top: B:45:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CTFilteredOrderRequest cTFilteredOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<CTFilteredOrderResponse>, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getCopyTradeFilteredOrderList$1 orderListRepositoryImpl$getCopyTradeFilteredOrderList$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getCopyTradeFilteredOrderList$1) {
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$1 = (OrderListRepositoryImpl$getCopyTradeFilteredOrderList$1) continuation;
            int i = orderListRepositoryImpl$getCopyTradeFilteredOrderList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getCopyTradeFilteredOrderList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getCopyTradeFilteredOrderList$1 = new OrderListRepositoryImpl$getCopyTradeFilteredOrderList$1(this, continuation);
            }
        }
        OrderListRepositoryImpl$getCopyTradeFilteredOrderList$1 orderListRepositoryImpl$getCopyTradeFilteredOrderList$12 = orderListRepositoryImpl$getCopyTradeFilteredOrderList$1;
        java.lang.Object objWithContext = orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                java.lang.String accountId = cTFilteredOrderRequest.getAccountId();
                java.lang.String strategyId = cTFilteredOrderRequest.getStrategyId();
                java.lang.String cursor = cTFilteredOrderRequest.getCursor();
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(cTFilteredOrderRequest.getLimit());
                orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$0 = null;
                orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$1 = null;
                orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.label = 2;
                objWithContext = interfaceC20052gZc.EZpvd(accountId, strategyId, cursor, numAEQbTJ, orderListRepositoryImpl$getCopyTradeFilteredOrderList$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$getCopyTradeFilteredOrderList$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$getCopyTradeFilteredOrderList$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$getCopyTradeFilteredOrderList$$inlined$getApiResultWithJwtCheck$1(null, this, cTFilteredOrderRequest);
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$0 = this;
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$1 = cTFilteredOrderRequest;
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getCopyTradeFilteredOrderList$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$getCopyTradeFilteredOrderList$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            cTFilteredOrderRequest = (CTFilteredOrderRequest) orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            java.lang.String accountId2 = cTFilteredOrderRequest.getAccountId();
            java.lang.String strategyId2 = cTFilteredOrderRequest.getStrategyId();
            java.lang.String cursor2 = cTFilteredOrderRequest.getCursor();
            java.lang.Integer numAEQbTJ2 = C56443yFo.AEQbTJ(cTFilteredOrderRequest.getLimit());
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$0 = null;
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.L$1 = null;
            orderListRepositoryImpl$getCopyTradeFilteredOrderList$12.label = 2;
            objWithContext = interfaceC20052gZc2.EZpvd(accountId2, strategyId2, cursor2, numAEQbTJ2, orderListRepositoryImpl$getCopyTradeFilteredOrderList$12);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CTUpdateStatusRequest cTUpdateStatusRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$updateCopeTradeOrderStatus$1 orderListRepositoryImpl$updateCopeTradeOrderStatus$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$updateCopeTradeOrderStatus$1) {
            orderListRepositoryImpl$updateCopeTradeOrderStatus$1 = (OrderListRepositoryImpl$updateCopeTradeOrderStatus$1) continuation;
            int i = orderListRepositoryImpl$updateCopeTradeOrderStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1 = new OrderListRepositoryImpl$updateCopeTradeOrderStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$updateCopeTradeOrderStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$updateCopeTradeOrderStatus$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$0 = null;
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$1 = null;
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.label = 2;
                objWithContext = interfaceC20052gZc.OLrzqt(cTUpdateStatusRequest, orderListRepositoryImpl$updateCopeTradeOrderStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                }
            } else {
                OrderListRepositoryImpl$updateCopeTradeOrderStatus$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$updateCopeTradeOrderStatus$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$updateCopeTradeOrderStatus$$inlined$getApiResultWithJwtCheck$1(null, this, cTUpdateStatusRequest);
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$0 = this;
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$1 = cTUpdateStatusRequest;
                orderListRepositoryImpl$updateCopeTradeOrderStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$updateCopeTradeOrderStatus$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$updateCopeTradeOrderStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c20051gZb = this;
            }
        } else if (i2 == 1) {
            cTUpdateStatusRequest = (CTUpdateStatusRequest) orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                }
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                    return new AbstractC43419rot.StateListAnimator(C56443yFo.AEQbTJ(((CancelOrReactivateOrderResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()).getUpdateNum()));
                }
                if (stateListAnimator instanceof AbstractC43419rot.ActionBar) {
                    return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$0 = null;
            orderListRepositoryImpl$updateCopeTradeOrderStatus$1.L$1 = null;
            orderListRepositoryImpl$updateCopeTradeOrderStatus$1.label = 2;
            objWithContext = interfaceC20052gZc2.OLrzqt(cTUpdateStatusRequest, orderListRepositoryImpl$updateCopeTradeOrderStatus$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull CTTradesOrderRequest cTTradesOrderRequest, @NotNull Continuation<? super AbstractC43419rot<OrderListPagerResult<TradesOrderData>, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getStrategyTradesList$1 orderListRepositoryImpl$getStrategyTradesList$1;
        if (continuation instanceof OrderListRepositoryImpl$getStrategyTradesList$1) {
            orderListRepositoryImpl$getStrategyTradesList$1 = (OrderListRepositoryImpl$getStrategyTradesList$1) continuation;
            int i = orderListRepositoryImpl$getStrategyTradesList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getStrategyTradesList$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getStrategyTradesList$1 = new OrderListRepositoryImpl$getStrategyTradesList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getStrategyTradesList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getStrategyTradesList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                OrderListRepositoryImpl$getStrategyTradesList$$inlined$getApiResult$1 orderListRepositoryImpl$getStrategyTradesList$$inlined$getApiResult$1 = new OrderListRepositoryImpl$getStrategyTradesList$$inlined$getApiResult$1(null, this, cTTradesOrderRequest);
                orderListRepositoryImpl$getStrategyTradesList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getStrategyTradesList$$inlined$getApiResult$1, orderListRepositoryImpl$getStrategyTradesList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest.copy$default(com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest, java.lang.String, com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam, int, java.lang.Object):com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x007c, B:35:0x007e, B:37:0x0084, B:39:0x008a, B:40:0x0097, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CTSubscribeRequest cTSubscribeRequest, @NotNull Continuation<? super AbstractC43419rot<CTSubscribeResponse, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$subscribeSocket$1 orderListRepositoryImpl$subscribeSocket$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$subscribeSocket$1) {
            orderListRepositoryImpl$subscribeSocket$1 = (OrderListRepositoryImpl$subscribeSocket$1) continuation;
            int i = orderListRepositoryImpl$subscribeSocket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$subscribeSocket$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$subscribeSocket$1 = new OrderListRepositoryImpl$subscribeSocket$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$subscribeSocket$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$subscribeSocket$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                CTSubscribeRequest cTSubscribeRequestCopy$default = CTSubscribeRequest.copy$default(cTSubscribeRequest, c20051gZb.EZpvd, null, 2, null);
                orderListRepositoryImpl$subscribeSocket$1.L$0 = null;
                orderListRepositoryImpl$subscribeSocket$1.L$1 = null;
                orderListRepositoryImpl$subscribeSocket$1.label = 2;
                objWithContext = interfaceC20052gZc.AEQbTJ(cTSubscribeRequestCopy$default, orderListRepositoryImpl$subscribeSocket$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$subscribeSocket$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$subscribeSocket$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$subscribeSocket$$inlined$getApiResultWithJwtCheck$1(null, this, cTSubscribeRequest);
            orderListRepositoryImpl$subscribeSocket$1.L$0 = this;
            orderListRepositoryImpl$subscribeSocket$1.L$1 = cTSubscribeRequest;
            orderListRepositoryImpl$subscribeSocket$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$subscribeSocket$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$subscribeSocket$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            cTSubscribeRequest = (CTSubscribeRequest) orderListRepositoryImpl$subscribeSocket$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$subscribeSocket$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            CTSubscribeRequest cTSubscribeRequestCopy$default2 = CTSubscribeRequest.copy$default(cTSubscribeRequest, c20051gZb.EZpvd, null, 2, null);
            orderListRepositoryImpl$subscribeSocket$1.L$0 = null;
            orderListRepositoryImpl$subscribeSocket$1.L$1 = null;
            orderListRepositoryImpl$subscribeSocket$1.label = 2;
            objWithContext = interfaceC20052gZc2.AEQbTJ(cTSubscribeRequestCopy$default2, orderListRepositoryImpl$subscribeSocket$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:12:0x0029, B:38:0x0090, B:39:0x0092, B:41:0x0098, B:43:0x009e, B:44:0x00ab, B:17:0x003d, B:29:0x0077, B:35:0x007f, B:25:0x0064), top: B:49:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull CTSubscribeRequest cTSubscribeRequest, @NotNull Continuation<? super AbstractC43419rot<? extends JsonElement, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$unSubscribeSocket$1 orderListRepositoryImpl$unSubscribeSocket$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$unSubscribeSocket$1) {
            orderListRepositoryImpl$unSubscribeSocket$1 = (OrderListRepositoryImpl$unSubscribeSocket$1) continuation;
            int i = orderListRepositoryImpl$unSubscribeSocket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$unSubscribeSocket$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$unSubscribeSocket$1 = new OrderListRepositoryImpl$unSubscribeSocket$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$unSubscribeSocket$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$unSubscribeSocket$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (this.EZpvd.length() == 0) {
                return new AbstractC43419rot.ActionBar(new OKServerException(0, "No active subscription to unsubscribe", null, null, 13, null));
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$unSubscribeSocket$1.L$0 = null;
                orderListRepositoryImpl$unSubscribeSocket$1.L$1 = null;
                orderListRepositoryImpl$unSubscribeSocket$1.label = 2;
                objWithContext = interfaceC20052gZc.EZpvd(cTSubscribeRequest, orderListRepositoryImpl$unSubscribeSocket$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$unSubscribeSocket$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$unSubscribeSocket$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$unSubscribeSocket$$inlined$getApiResultWithJwtCheck$1(null, this, cTSubscribeRequest);
            orderListRepositoryImpl$unSubscribeSocket$1.L$0 = this;
            orderListRepositoryImpl$unSubscribeSocket$1.L$1 = cTSubscribeRequest;
            orderListRepositoryImpl$unSubscribeSocket$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$unSubscribeSocket$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$unSubscribeSocket$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            cTSubscribeRequest = (CTSubscribeRequest) orderListRepositoryImpl$unSubscribeSocket$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$unSubscribeSocket$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$unSubscribeSocket$1.L$0 = null;
            orderListRepositoryImpl$unSubscribeSocket$1.L$1 = null;
            orderListRepositoryImpl$unSubscribeSocket$1.label = 2;
            objWithContext = interfaceC20052gZc2.EZpvd(cTSubscribeRequest, orderListRepositoryImpl$unSubscribeSocket$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004e, B:25:0x0056, B:27:0x005c, B:28:0x0069), top: B:43:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CopyTradeStrategyNumResponse, OKServerException>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getCopyTradeStrategyNum$1 orderListRepositoryImpl$getCopyTradeStrategyNum$1;
        java.lang.Exception e;
        C20051gZb c20051gZb;
        java.lang.Exception exc;
        AbstractC43419rot.ActionBar actionBar;
        java.lang.Object actionBar2;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getCopyTradeStrategyNum$1) {
            orderListRepositoryImpl$getCopyTradeStrategyNum$1 = (OrderListRepositoryImpl$getCopyTradeStrategyNum$1) continuation;
            int i = orderListRepositoryImpl$getCopyTradeStrategyNum$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getCopyTradeStrategyNum$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getCopyTradeStrategyNum$1 = new OrderListRepositoryImpl$getCopyTradeStrategyNum$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getCopyTradeStrategyNum$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getCopyTradeStrategyNum$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                OrderListRepositoryImpl$getCopyTradeStrategyNum$$inlined$getNewApiResult$1 orderListRepositoryImpl$getCopyTradeStrategyNum$$inlined$getNewApiResult$1 = new OrderListRepositoryImpl$getCopyTradeStrategyNum$$inlined$getNewApiResult$1(null, this, str);
                orderListRepositoryImpl$getCopyTradeStrategyNum$1.L$0 = this;
                orderListRepositoryImpl$getCopyTradeStrategyNum$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getCopyTradeStrategyNum$$inlined$getNewApiResult$1, orderListRepositoryImpl$getCopyTradeStrategyNum$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c20051gZb = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                c20051gZb = this;
                exc = e;
                if (!(exc instanceof OKServerException)) {
                    actionBar = new AbstractC43419rot.ActionBar(exc);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
                }
                actionBar2 = actionBar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getCopyTradeStrategyNum$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar2 = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                exc = e;
                if (!(exc instanceof OKServerException)) {
                }
                actionBar2 = actionBar;
            }
        }
        if (actionBar2 instanceof AbstractC43419rot.StateListAnimator) {
            c20051gZb.OLrzqt = ((CopyTradeStrategyNumResponse) ((AbstractC43419rot.StateListAnimator) actionBar2).KWHzl()).getMaxActiveStrategyCount();
        }
        return actionBar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getMaxActiveStrategyCount$1 orderListRepositoryImpl$getMaxActiveStrategyCount$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OrderListRepositoryImpl$getMaxActiveStrategyCount$1) {
            orderListRepositoryImpl$getMaxActiveStrategyCount$1 = (OrderListRepositoryImpl$getMaxActiveStrategyCount$1) continuation;
            int i = orderListRepositoryImpl$getMaxActiveStrategyCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getMaxActiveStrategyCount$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getMaxActiveStrategyCount$1 = new OrderListRepositoryImpl$getMaxActiveStrategyCount$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = orderListRepositoryImpl$getMaxActiveStrategyCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getMaxActiveStrategyCount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            int i3 = this.OLrzqt;
            if (i3 != -1) {
                return C56443yFo.AEQbTJ(i3);
            }
            orderListRepositoryImpl$getMaxActiveStrategyCount$1.label = 1;
            objOLrzqt = OLrzqt(str, orderListRepositoryImpl$getMaxActiveStrategyCount$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            actionBar = new AbstractC43419rot.StateListAnimator(C56443yFo.AEQbTJ(((CopyTradeStrategyNumResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getMaxActiveStrategyCount()));
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        java.lang.Integer num = (java.lang.Integer) actionBar.copydefault();
        return C56443yFo.AEQbTJ(num != null ? num.intValue() : 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC20053gZd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull CTPositionsRequest cTPositionsRequest, @NotNull Continuation<? super AbstractC43419rot<CTPositionsResponse, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        OrderListRepositoryImpl$getStrategyPositions$1 orderListRepositoryImpl$getStrategyPositions$1;
        AbstractC43419rot.ActionBar actionBar;
        C20051gZb c20051gZb;
        ResponseData responseData;
        if (continuation instanceof OrderListRepositoryImpl$getStrategyPositions$1) {
            orderListRepositoryImpl$getStrategyPositions$1 = (OrderListRepositoryImpl$getStrategyPositions$1) continuation;
            int i = orderListRepositoryImpl$getStrategyPositions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderListRepositoryImpl$getStrategyPositions$1.label = i - Integer.MIN_VALUE;
            } else {
                orderListRepositoryImpl$getStrategyPositions$1 = new OrderListRepositoryImpl$getStrategyPositions$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = orderListRepositoryImpl$getStrategyPositions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = orderListRepositoryImpl$getStrategyPositions$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            if (coroutineDispatcher == null) {
                c20051gZb = this;
                InterfaceC20052gZc interfaceC20052gZc = c20051gZb.copydefault;
                orderListRepositoryImpl$getStrategyPositions$1.L$0 = null;
                orderListRepositoryImpl$getStrategyPositions$1.L$1 = null;
                orderListRepositoryImpl$getStrategyPositions$1.label = 2;
                objWithContext = interfaceC20052gZc.OLrzqt(cTPositionsRequest, orderListRepositoryImpl$getStrategyPositions$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            OrderListRepositoryImpl$getStrategyPositions$$inlined$getApiResultWithJwtCheck$1 orderListRepositoryImpl$getStrategyPositions$$inlined$getApiResultWithJwtCheck$1 = new OrderListRepositoryImpl$getStrategyPositions$$inlined$getApiResultWithJwtCheck$1(null, this, cTPositionsRequest);
            orderListRepositoryImpl$getStrategyPositions$1.L$0 = this;
            orderListRepositoryImpl$getStrategyPositions$1.L$1 = cTPositionsRequest;
            orderListRepositoryImpl$getStrategyPositions$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, orderListRepositoryImpl$getStrategyPositions$$inlined$getApiResultWithJwtCheck$1, orderListRepositoryImpl$getStrategyPositions$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c20051gZb = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            cTPositionsRequest = (CTPositionsRequest) orderListRepositoryImpl$getStrategyPositions$1.L$1;
            c20051gZb = (C20051gZb) orderListRepositoryImpl$getStrategyPositions$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC20052gZc interfaceC20052gZc2 = c20051gZb.copydefault;
            orderListRepositoryImpl$getStrategyPositions$1.L$0 = null;
            orderListRepositoryImpl$getStrategyPositions$1.L$1 = null;
            orderListRepositoryImpl$getStrategyPositions$1.label = 2;
            objWithContext = interfaceC20052gZc2.OLrzqt(cTPositionsRequest, orderListRepositoryImpl$getStrategyPositions$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }
}
