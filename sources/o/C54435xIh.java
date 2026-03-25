package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.OrderLeadPosSize;
import com.okinc.unify_trade.biz.OrderPositions;
import com.okinc.unify_trade.biz.StrategyHistoryListReq;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.UserGuide;
import com.okinc.unify_trade.biz.UserGuideBean;
import com.okinc.unify_trade.biz.VirtualAccountPosData;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xIh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54435xIh {
    public final InterfaceC58217yxC OLrzqt(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, @NotNull final InterfaceC55701xos<java.util.List<TradeStrategyOrderData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (!z) {
            return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getStrategyPendingOrders(str4, str3, str11 == null ? "20" : str11, str, str2, str5, java.lang.Boolean.TRUE, str6, str7, str8, str9, str10), new Function1() { // from class: o.xIo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54435xIh.fetchVPNInfo(interfaceC55701xos, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.xIn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54435xIh.DbNXlk(interfaceC55701xos, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getStrategyHistoryOrders(str4, str3, str11 == null ? "20" : str11, str, str2, str5, java.lang.Boolean.TRUE, str6, str7, str8, str9, str10, str12), new Function1() { // from class: o.xIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.DbNXlk(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.fetchVPNInfo(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(@NotNull final InterfaceC55701xos<java.util.List<OrderPositions>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getOrdersAndPositions(), new Function1() { // from class: o.xIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.values(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.values(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit values(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull final InterfaceC55701xos<java.util.ArrayList<OrderLeadPosSize>> interfaceC55701xos) {
        AbstractC58185ywX<ResponseData<java.util.List<OrderLeadPosSize>>> abstractC58185ywXCopyPositionSize;
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        if (bizApiService == null || (abstractC58185ywXCopyPositionSize = bizApiService.copyPositionSize()) == null) {
            return null;
        }
        return C33024moe.subscribeOnIO$default(abstractC58185ywXCopyPositionSize, new Function1() { // from class: o.xIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.djBIcL(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.djBIcL(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit djBIcL(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String message = th.getMessage();
        interfaceC55701xos.EZpvd(false, null, new BizApiException(message == null ? "" : message, null, null, null, null, 30, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InterfaceC58217yxC getUserGuide$default(C54435xIh c54435xIh, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c54435xIh.AEQbTJ(str, (InterfaceC55701xos<java.util.List<UserGuideBean>>) interfaceC55701xos);
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, @NotNull final InterfaceC55701xos<java.util.List<UserGuideBean>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getUserGuide(new UserGuide(str)), new Function1() { // from class: o.xIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.AkhnZx(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.AkhnZx(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AkhnZx(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull StrategyPendingListReq strategyPendingListReq, @NotNull final InterfaceC55701xos<java.util.List<BizTradeStrategyInfo>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(BizApiService.TaskDescription.getPendingStrategyOrderList$default((BizApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(BizApiService.class), C56032xvE.KWHzl()), strategyPendingListReq.getAlgoId(), Intrinsics.EZpvd((java.lang.Object) strategyPendingListReq.getInstType(), (java.lang.Object) "ANY") ? null : strategyPendingListReq.getInstType(), strategyPendingListReq.getInstId(), strategyPendingListReq.getAfter(), strategyPendingListReq.getBefore(), strategyPendingListReq.getLimit(), strategyPendingListReq.getStart(), strategyPendingListReq.getEnd(), strategyPendingListReq.getTdMode(), strategyPendingListReq.getInstDirection(), strategyPendingListReq.getPosOrSide(), strategyPendingListReq.getReferName(), strategyPendingListReq.getSortType(), strategyPendingListReq.getSource(), strategyPendingListReq.getOrdType(), null, null, null, null, null, null, null, 4161536, null), new Function1() { // from class: o.xIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.isConnected(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.isConnected(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit isConnected(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull StrategyHistoryListReq strategyHistoryListReq, @NotNull final InterfaceC55701xos<java.util.List<BizTradeStrategyInfo>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String strKWHzl = c33489mxS.KWHzl(StrategyHistoryListReq.Companion.serializer(), strategyHistoryListReq);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.util.HashMap map = new java.util.HashMap((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
        if (Intrinsics.EZpvd(map.get("instType"), (java.lang.Object) "ANY")) {
            map.remove("instType");
        }
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getHistoryStrategyOrderList(map), new Function1() { // from class: o.xIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.AhwBna(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.valueOf(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AhwBna(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(@NotNull final InterfaceC55701xos<java.util.ArrayList<VirtualAccountPosData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).loadVirtualAccountPosAmt(), new Function1() { // from class: o.xIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.fJNWhG(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54435xIh.ejfBZ(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fJNWhG(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
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

    public static final Unit fetchVPNInfo(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            interfaceC55701xos.EZpvd(true, data instanceof java.util.ArrayList ? (java.util.ArrayList) data : null, null);
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

    public static final Unit isConnected(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            interfaceC55701xos.EZpvd(true, responseData.getData(), null);
        } else {
            interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
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
}
