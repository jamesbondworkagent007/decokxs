package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.BaseTradeOrderReq;
import com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq;
import com.okinc.unify_trade.biz.BizCancelStrategyOrderReq;
import com.okinc.unify_trade.biz.BizStrategyTradeOrderReq;
import com.okinc.unify_trade.biz.BizTradeClosePosition;
import com.okinc.unify_trade.biz.BizTradeOrderReq;
import com.okinc.unify_trade.biz.DeriConfigData;
import com.okinc.unify_trade.biz.MarginBalanceData;
import com.okinc.unify_trade.biz.NaviBody;
import com.okinc.unify_trade.biz.OptionCheckPreReq;
import com.okinc.unify_trade.biz.OptionalTradeOrderReq;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.biz.OrderForceDetails;
import com.okinc.unify_trade.biz.OrderPreCheckResp;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.RiskTrendData;
import com.okinc.unify_trade.biz.SimpleNotes;
import com.okinc.unify_trade.biz.SimpleProducts;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.biz.TradeFillsData;
import com.okinc.unify_trade.biz.TradeOrderSpReq;
import com.okinc.unify_trade.biz.TriggerStrategyOrderReq;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xJC {

    public static final class ActionBar extends TypeToken<ResponseData<java.util.List<? extends OrderExpResp>>> {
    }

    public static final class Activity extends TypeToken<ResponseData<java.util.List<? extends OrderExpResp>>> {
    }

    public static final class Application extends TypeToken<ResponseData<java.util.List<? extends StrategyStopResponse>>> {
    }

    public static final class Fragment extends TypeToken<ResponseData<java.util.List<? extends OrderExpResp>>> {
    }

    public static final class LoaderManager extends TypeToken<ResponseData<java.util.List<? extends OrderPreCheckResp>>> {
    }

    public static final class StateListAnimator extends TypeToken<ResponseData<java.util.List<? extends OrderExpResp>>> {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xJC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC makeNormalOrderRequest$default(xJC xjc, BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList arrayList, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            arrayList = null;
        }
        return xjc.AEQbTJ(baseTradeOrderReq, optionalTradeOrderReq, arrayList, interfaceC55701xos);
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList<TradeOrderStopParam> arrayList, @NotNull final InterfaceC55701xos<java.util.List<OrderExpResp>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(baseTradeOrderReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).makeOrder(AEQbTJ(baseTradeOrderReq, optionalTradeOrderReq, arrayList)), new Function1() { // from class: o.xJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.djBIcL(interfaceC55701xos, this, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.AhwBna(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit djBIcL(InterfaceC55701xos interfaceC55701xos, xJC xjc, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getResponse() == null) {
                interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
            } else {
                ResponseData<java.util.List<OrderExpResp>> responseData = (ResponseData) xVL.EZpvd.KWHzl(oKServerException.getResponse(), new StateListAnimator());
                interfaceC55701xos.EZpvd(false, null, responseData != null ? xjc.KWHzl(responseData) : null);
            }
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final BizApiException KWHzl(ResponseData<java.util.List<OrderExpResp>> responseData) {
        if (!C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            return new BizApiException(responseData.getMsg(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, 28, null);
        }
        java.util.List<OrderExpResp> data = responseData.getData();
        Intrinsics.copydefault(data);
        java.lang.String sMsg = data.get(0).getSMsg();
        java.util.List<OrderExpResp> data2 = responseData.getData();
        Intrinsics.copydefault(data2);
        java.lang.String sCode = data2.get(0).getSCode();
        java.util.List<OrderExpResp> data3 = responseData.getData();
        Intrinsics.copydefault(data3);
        java.lang.String sCode2 = data3.get(0).getSCode();
        java.util.List<OrderExpResp> data4 = responseData.getData();
        Intrinsics.copydefault(data4);
        java.lang.String str = data4.get(0).get_data();
        java.util.List<OrderExpResp> data5 = responseData.getData();
        Intrinsics.copydefault(data5);
        return new BizApiException(sMsg, sCode, sCode2, str, data5.get(0).isCalLeverage());
    }

    public final InterfaceC58217yxC KWHzl(@NotNull BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, java.util.List<TradeOrderStopParam> list, @NotNull final InterfaceC55701xos<java.util.List<OrderExpResp>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(baseTradeStrategyOrderReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).makeStrategyOrder(EZpvd(baseTradeStrategyOrderReq, triggerStrategyOrderReq, tradeOrderSpReq, list)), new Function1() { // from class: o.xJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.AhwBna(interfaceC55701xos, this, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.valueOf(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AhwBna(InterfaceC55701xos interfaceC55701xos, xJC xjc, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getResponse() != null) {
                ResponseData<java.util.List<OrderExpResp>> responseData = (ResponseData) xVL.EZpvd.KWHzl(oKServerException.getResponse(), new Activity());
                interfaceC55701xos.EZpvd(false, null, responseData != null ? xjc.KWHzl(responseData) : null);
            } else {
                interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InterfaceC58217yxC cancelStrategyOrder$default(xJC xjc, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        return xjc.OLrzqt(str, str2, interfaceC55701xos, str3, str4);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "move_order_stop")) {
            return KWHzl(str, str2, interfaceC55701xos, str3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new BizCancelStrategyOrderReq(str, str2, str3, str4));
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).cancelStrategyOrder(arrayList), new Function1() { // from class: o.xJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.KWHzl(interfaceC55701xos, this, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.copydefault(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(InterfaceC55701xos interfaceC55701xos, xJC xjc, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getResponse() != null) {
                ResponseData<java.util.List<OrderExpResp>> responseData = (ResponseData) xVL.EZpvd.KWHzl(oKServerException.getResponse(), new ActionBar());
                interfaceC55701xos.EZpvd(false, null, responseData != null ? xjc.KWHzl(responseData) : null);
            } else {
                interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
            }
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends StrategyStopResponse>> {
        public final /* synthetic */ InterfaceC55701xos<Unit> copydefault;

        public TaskDescription(InterfaceC55701xos<Unit> interfaceC55701xos) {
            this.copydefault = interfaceC55701xos;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<StrategyStopResponse> list, java.lang.Exception exc) {
            this.copydefault.EZpvd(z, null, exc);
        }
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(yDY.AhwBna(new StrategyStopReq(str, str2, str3, (java.lang.String) null, (PlaceOrderCondition) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null)), new TaskDescription(interfaceC55701xos));
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).tradeClosePosition(new BizTradeClosePosition(str, str2, str3, str4, (java.lang.String) null, (java.lang.String) null, 48, (DefaultConstructorMarker) null)), new Function1() { // from class: o.xJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.valueOf(interfaceC55701xos, this, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.gEmmrt(interfaceC55701xos, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, xJC xjc, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getResponse() != null) {
                ResponseData<java.util.List<OrderExpResp>> responseData = (ResponseData) xVL.EZpvd.KWHzl(oKServerException.getResponse(), new Fragment());
                interfaceC55701xos.EZpvd(false, null, responseData != null ? xjc.KWHzl(responseData) : null);
            } else {
                interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
            }
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionCheckPreReq optionCheckPreReq, @NotNull final InterfaceC55701xos<OrderPreCheckResp> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(baseTradeOrderReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).tradeOrderPreCheck(baseTradeOrderReq.getInstId(), baseTradeOrderReq.getTdMode(), optionCheckPreReq != null ? optionCheckPreReq.getCcy() : null, baseTradeOrderReq.getSide(), optionCheckPreReq != null ? optionCheckPreReq.getPosSide() : null, baseTradeOrderReq.getOrderType(), baseTradeOrderReq.getSz(), optionCheckPreReq != null ? optionCheckPreReq.getPx() : null, optionCheckPreReq != null ? optionCheckPreReq.getBboType() : null, optionCheckPreReq != null ? optionCheckPreReq.getReduceOnly() : null, optionCheckPreReq != null ? optionCheckPreReq.getTgtCcy() : null, optionCheckPreReq != null ? optionCheckPreReq.getQuickMgnType() : null, optionCheckPreReq != null ? optionCheckPreReq.getCost() : null, baseTradeOrderReq.getOrderSignType(), optionCheckPreReq != null ? optionCheckPreReq.isTradeBorrowMode() : null, optionCheckPreReq != null ? optionCheckPreReq.getTradeQuoteCcy() : null), new Function1() { // from class: o.xJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.getFieldNames(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.hDKMBd(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit getFieldNames(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        java.lang.String sCode;
        java.lang.String msg;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getResponse() != null) {
                ResponseData responseData = (ResponseData) xVL.EZpvd.KWHzl(oKServerException.getResponse(), new LoaderManager());
                java.lang.String str2 = (responseData == null || (msg = responseData.getMsg()) == null) ? "" : msg;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(responseData != null ? java.lang.Integer.valueOf(responseData.getCode()) : null);
                if (C33129mqd.KWHzl((java.util.Collection) (responseData != null ? (java.util.List) responseData.getData() : null))) {
                    java.util.List list = responseData != null ? (java.util.List) responseData.getData() : null;
                    Intrinsics.copydefault(list);
                    sCode = ((OrderPreCheckResp) list.get(0)).getSCode();
                } else {
                    sCode = "";
                }
                if (C33129mqd.KWHzl((java.util.Collection) (responseData != null ? (java.util.List) responseData.getData() : null))) {
                    java.util.List list2 = responseData != null ? (java.util.List) responseData.getData() : null;
                    Intrinsics.copydefault(list2);
                    str = ((OrderPreCheckResp) list2.get(0)).get_data();
                }
                interfaceC55701xos.EZpvd(false, null, new BizApiException(str2, strGEmmrt, sCode, str, null, 16, null).jsonParse());
            } else {
                interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
            }
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull final InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).marginBalance(new MarginBalanceData(str, str2, z ? "add" : "reduce", str3, str4, str5)), new Function1() { // from class: o.xJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fIwbmz(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fARcdN(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fIwbmz(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull final InterfaceC55701xos<java.util.List<TradeFillsData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getTradeFill(str, str2, str3, str4, str5, "20", "growth_coupon"), new Function1() { // from class: o.xJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.ejfBZ(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fIwbmz(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit ejfBZ(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(java.lang.String str, @NotNull final InterfaceC55701xos<AccountBalanceData> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getAccountBalance(str), new Function1() { // from class: o.xJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.DbNXlk(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.values(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit DbNXlk(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(java.lang.String str, @NotNull final InterfaceC55701xos<java.util.List<OrderForceDetails>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getOrderForceDetail(str), new Function1() { // from class: o.xKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.isConnected(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fetchVPNInfo(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit isConnected(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull final InterfaceC55701xos<java.util.List<RiskTrendData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getRiskTrend(str, str2, str3, str4, true), new Function1() { // from class: o.xJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fetchVPNInfo(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.DbNXlk(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            java.lang.String message2 = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(message2 != null ? message2 : ""));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xJC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BizTradeOrderReq convertOrderReqData$default(xJC xjc, BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            arrayList = null;
        }
        return xjc.AEQbTJ(baseTradeOrderReq, optionalTradeOrderReq, (java.util.ArrayList<TradeOrderStopParam>) arrayList);
    }

    public final BizTradeOrderReq AEQbTJ(BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList<TradeOrderStopParam> arrayList) {
        BizTradeOrderReq bizTradeOrderReq = new BizTradeOrderReq(baseTradeOrderReq.getInstId(), baseTradeOrderReq.getTdMode(), baseTradeOrderReq.getSide(), baseTradeOrderReq.getOrderType(), baseTradeOrderReq.getSz(), false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, baseTradeOrderReq.isFullPercent(), (java.lang.String) null, (java.lang.String) null, baseTradeOrderReq.getOrderSignType(), (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, optionalTradeOrderReq != null ? optionalTradeOrderReq.isTradeBorrowMode() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -35913760, 1, (DefaultConstructorMarker) null);
        bizTradeOrderReq.setOptional(optionalTradeOrderReq);
        bizTradeOrderReq.setAttachOrderStopInfo(arrayList);
        bizTradeOrderReq.setTag(xHV.getOrderTag$default(xHV.AEQbTJ, false, 1, null));
        return bizTradeOrderReq;
    }

    public final BizStrategyTradeOrderReq EZpvd(BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, java.util.List<TradeOrderStopParam> list) {
        BizStrategyTradeOrderReq bizStrategyTradeOrderReq;
        java.lang.String closeFraction = baseTradeStrategyOrderReq.getCloseFraction();
        if (closeFraction == null || closeFraction.length() == 0) {
            java.lang.String instId = baseTradeStrategyOrderReq.getInstId();
            java.lang.String tdMode = baseTradeStrategyOrderReq.getTdMode();
            java.lang.String side = baseTradeStrategyOrderReq.getSide();
            java.lang.String posSide = baseTradeStrategyOrderReq.getPosSide();
            java.lang.String ccy = baseTradeStrategyOrderReq.getCcy();
            java.lang.String orderType = baseTradeStrategyOrderReq.getOrderType();
            java.lang.String sz = baseTradeStrategyOrderReq.getSz();
            java.lang.String str = baseTradeStrategyOrderReq.get_last();
            bizStrategyTradeOrderReq = new BizStrategyTradeOrderReq(instId, tdMode, side, posSide, ccy, orderType, sz, (java.lang.String) null, str == null ? "" : str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, baseTradeStrategyOrderReq.getTgtCcy(), (java.lang.String) null, (java.lang.String) null, baseTradeStrategyOrderReq.getReduceOnly(), (java.lang.String) null, (java.lang.String) null, baseTradeStrategyOrderReq.getQuickMgnType(), baseTradeStrategyOrderReq.getCxlOnClosePos(), (java.util.List) null, tradeOrderSpReq != null ? tradeOrderSpReq.isTPLimit() : null, tradeOrderSpReq != null ? tradeOrderSpReq.getTpOrdKind() : null, baseTradeStrategyOrderReq.isTradeBorrowMode(), baseTradeStrategyOrderReq.getBanAmend(), baseTradeStrategyOrderReq.getTradeQuoteCcy(), baseTradeStrategyOrderReq.getAdvanceOrdType(), (java.lang.String) null, 1083932288, (DefaultConstructorMarker) null);
        } else {
            java.lang.String instId2 = baseTradeStrategyOrderReq.getInstId();
            java.lang.String tdMode2 = baseTradeStrategyOrderReq.getTdMode();
            java.lang.String side2 = baseTradeStrategyOrderReq.getSide();
            java.lang.String posSide2 = baseTradeStrategyOrderReq.getPosSide();
            java.lang.String ccy2 = baseTradeStrategyOrderReq.getCcy();
            java.lang.String orderType2 = baseTradeStrategyOrderReq.getOrderType();
            java.lang.String closeFraction2 = baseTradeStrategyOrderReq.getCloseFraction();
            java.lang.String str2 = closeFraction2 == null ? "" : closeFraction2;
            java.lang.String str3 = baseTradeStrategyOrderReq.get_last();
            bizStrategyTradeOrderReq = new BizStrategyTradeOrderReq(instId2, tdMode2, side2, posSide2, ccy2, orderType2, (java.lang.String) null, str2, str3 == null ? "" : str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, baseTradeStrategyOrderReq.getTgtCcy(), (java.lang.String) null, (java.lang.String) null, baseTradeStrategyOrderReq.getReduceOnly(), (java.lang.String) null, (java.lang.String) null, baseTradeStrategyOrderReq.getQuickMgnType(), baseTradeStrategyOrderReq.getCxlOnClosePos(), (java.util.List) null, (java.lang.Boolean) null, tradeOrderSpReq != null ? tradeOrderSpReq.getTpOrdKind() : null, baseTradeStrategyOrderReq.isTradeBorrowMode(), baseTradeStrategyOrderReq.getBanAmend(), baseTradeStrategyOrderReq.getTradeQuoteCcy(), (java.lang.String) null, (java.lang.String) null, 1637580352, (DefaultConstructorMarker) null);
        }
        bizStrategyTradeOrderReq.setTriggerInfo(triggerStrategyOrderReq);
        bizStrategyTradeOrderReq.setStopProfitInfo(tradeOrderSpReq);
        bizStrategyTradeOrderReq.setAttachOrderStopInfo(list);
        bizStrategyTradeOrderReq.setTag(xHV.AEQbTJ.OLrzqt(true));
        return bizStrategyTradeOrderReq;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, final InterfaceC55701xos<java.util.ArrayList<SimpleNotes>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSimpleNotes(str), new Function1() { // from class: o.xJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.AuCTel(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.AuCTel(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AuCTel(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            if (interfaceC55701xos != null) {
                java.lang.String message = th.getMessage();
                interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
            }
        } else if (interfaceC55701xos != null) {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull java.util.List<StrategyStopReq> list, @NotNull final InterfaceC55701xos<java.util.List<StrategyStopResponse>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).stopStrategyOrder(list), new Function1() { // from class: o.xJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.iwGUEr(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.uzCIH(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit iwGUEr(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            ResponseData responseData = (ResponseData) xVL.EZpvd.KWHzl(oKServerException.getResponse(), new Application());
            if (oKServerException.getCode() == 1) {
                if (C33129mqd.KWHzl((java.util.Collection) (responseData != null ? (java.util.List) responseData.getData() : null))) {
                    java.util.List list = responseData != null ? (java.util.List) responseData.getData() : null;
                    Intrinsics.copydefault(list);
                    StrategyStopResponse strategyStopResponse = (StrategyStopResponse) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                    interfaceC55701xos.EZpvd(false, null, new BizApiException(strategyStopResponse.getSMsg(), strategyStopResponse.getSCode(), null, null, null, 28, null));
                }
            } else if (oKServerException.getCode() != 2) {
                java.lang.String message = th.getMessage();
                interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, java.lang.String.valueOf(oKServerException.getCode()), null, null, null, 28, null));
            } else {
                if (C33129mqd.KWHzl((java.util.Collection) (responseData != null ? (java.util.List) responseData.getData() : null))) {
                    java.util.List list2 = responseData != null ? (java.util.List) responseData.getData() : null;
                    Intrinsics.copydefault(list2);
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (!Intrinsics.EZpvd((java.lang.Object) ((StrategyStopResponse) next).getSCode(), (java.lang.Object) "0")) {
                            break;
                        }
                    }
                    StrategyStopResponse strategyStopResponse2 = (StrategyStopResponse) next;
                    if (strategyStopResponse2 != null) {
                        interfaceC55701xos.EZpvd(false, null, new BizApiException(strategyStopResponse2.getSMsg(), strategyStopResponse2.getSCode(), null, null, null, 28, null));
                    } else {
                        interfaceC55701xos.EZpvd(false, null, new BizSystemException(C33070mpX.AYXKKw(C55688xof.Application.putInt)));
                    }
                }
            }
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, final InterfaceC55701xos<java.util.ArrayList<java.util.ArrayList<SimpleProducts>>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSimPleProducts(str, str2, str3), new Function1() { // from class: o.xJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fARcdN(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fJNWhG(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fARcdN(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            if (interfaceC55701xos != null) {
                java.lang.String message = th.getMessage();
                interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
            }
        } else if (interfaceC55701xos != null) {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InterfaceC58217yxC setNavType$default(xJC xjc, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return xjc.EZpvd(str, str2, (InterfaceC55701xos<java.util.List<DeriConfigData>>) interfaceC55701xos);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull final InterfaceC55701xos<java.util.List<DeriConfigData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        NaviBody naviBody = new NaviBody();
        naviBody.setConfigType(str);
        naviBody.setConfigValue(str2);
        return C33024moe.subscribeOnIO$default(bizApiService.setNaviType(naviBody), new Function1() { // from class: o.xKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.fJNWhG(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.ejfBZ(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fJNWhG(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(@NotNull final InterfaceC55701xos<java.util.List<DeriConfigData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getNavType(), new Function1() { // from class: o.xJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.AkhnZx(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xJC.AkhnZx(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AkhnZx(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            java.lang.String message = th.getMessage();
            interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(InterfaceC55701xos interfaceC55701xos, xJC xjc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), C33129mqd.KWHzl((java.util.Collection) responseData.getData()) ? xjc.KWHzl(responseData) : null);
        } else {
            interfaceC55701xos.EZpvd(false, null, xjc.KWHzl(responseData));
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, xJC xjc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, xjc.KWHzl(responseData));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC55701xos interfaceC55701xos, xJC xjc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, null, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, xjc.KWHzl(responseData));
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(InterfaceC55701xos interfaceC55701xos, xJC xjc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, null, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, xjc.KWHzl(responseData));
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        java.lang.String sCode;
        OrderPreCheckResp orderPreCheckResp;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                orderPreCheckResp = (OrderPreCheckResp) ((java.util.List) data).get(0);
            } else {
                orderPreCheckResp = null;
            }
            interfaceC55701xos.EZpvd(true, orderPreCheckResp, null);
        } else {
            java.lang.String msg = responseData.getMsg();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode()));
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                sCode = ((OrderPreCheckResp) ((java.util.List) data2).get(0)).getSCode();
            } else {
                sCode = "";
            }
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                str = ((OrderPreCheckResp) ((java.util.List) data3).get(0)).get_data();
            }
            interfaceC55701xos.EZpvd(false, null, new BizApiException(msg, strGEmmrt, sCode, str, null, 16, null).jsonParse());
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, null, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        AccountBalanceData accountBalanceData;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                accountBalanceData = (AccountBalanceData) ((java.util.List) data).get(0);
            } else {
                accountBalanceData = null;
            }
            interfaceC55701xos.EZpvd(true, accountBalanceData, null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            if (interfaceC55701xos != null) {
                interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
            }
        } else if (interfaceC55701xos != null) {
            interfaceC55701xos.EZpvd(responseData.getCode() == 0, responseData.getData(), null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else if (responseData.getCode() == 1 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            StrategyStopResponse strategyStopResponse = (StrategyStopResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) data);
            interfaceC55701xos.EZpvd(false, null, new BizApiException(strategyStopResponse.getSMsg(), strategyStopResponse.getSCode(), null, null, null, 28, null));
        } else if (responseData.getCode() == 2 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            java.util.Iterator it = ((java.lang.Iterable) data2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!Intrinsics.EZpvd((java.lang.Object) ((StrategyStopResponse) next).getSCode(), (java.lang.Object) "0")) {
                    break;
                }
            }
            StrategyStopResponse strategyStopResponse2 = (StrategyStopResponse) next;
            if (strategyStopResponse2 != null) {
                interfaceC55701xos.EZpvd(false, null, new BizApiException(strategyStopResponse2.getSMsg(), strategyStopResponse2.getSCode(), null, null, null, 28, null));
            } else {
                interfaceC55701xos.EZpvd(false, null, new BizSystemException(C33070mpX.AYXKKw(C55688xof.Application.putInt)));
            }
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            if (interfaceC55701xos != null) {
                interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
            }
        } else if (interfaceC55701xos != null) {
            interfaceC55701xos.EZpvd(responseData.getCode() == 0, responseData.getData(), null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}
