package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xAR extends xKE<java.util.List<? extends StrategyResponse>> {
    public RecurringOrderData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull RecurringOrderData recurringOrderData) {
        Intrinsics.checkNotNullParameter(recurringOrderData, "");
        this.copydefault = recurringOrderData;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        RecurringOrderData recurringOrderData = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        RecurringOrderData recurringOrderData2 = this.copydefault;
        if (recurringOrderData2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recurringOrderData = recurringOrderData2;
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXRecurringOrder = bizApiService.recurringOrder(recurringOrderData);
        final Function1 function1 = new Function1() { // from class: o.xAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xAR.OLrzqt(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXRecurringOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xAR.copydefault(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xAR.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xAR.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xAR xar, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        RecurringOrderData recurringOrderData = null;
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        RecurringOrderData recurringOrderData2 = xar.copydefault;
        if (recurringOrderData2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recurringOrderData = recurringOrderData2;
        }
        java.util.List<CoinRatioParam> recurringList = recurringOrderData.getRecurringList();
        if (recurringList == null) {
            recurringList = yDY.AhwBna();
        }
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "recurring", CollectionsKt___CollectionsKt.joinToString$default(recurringList, ",", null, null, 0, null, null, 62, null), null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(xAR xar, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        RecurringOrderData recurringOrderData = xar.copydefault;
        if (recurringOrderData == null) {
            Intrinsics.gEmmrt("");
            recurringOrderData = null;
        }
        java.util.List<CoinRatioParam> recurringList = recurringOrderData.getRecurringList();
        if (recurringList == null) {
            recurringList = yDY.AhwBna();
        }
        c55867xrz.OLrzqt((java.lang.String) null, "recurring", CollectionsKt___CollectionsKt.joinToString$default(recurringList, ",", null, null, 0, null, null, 62, null), th);
        return Unit.INSTANCE;
    }
}
