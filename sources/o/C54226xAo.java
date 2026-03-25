package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54226xAo extends xKE<java.util.List<? extends StrategyResponse>> {
    public DcdOrderReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull DcdOrderReq dcdOrderReq) {
        Intrinsics.checkNotNullParameter(dcdOrderReq, "");
        this.EZpvd = dcdOrderReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        DcdOrderReq dcdOrderReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        DcdOrderReq dcdOrderReq2 = this.EZpvd;
        if (dcdOrderReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            dcdOrderReq = dcdOrderReq2;
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXMakeDcdOrder = bizApiService.makeDcdOrder(dcdOrderReq);
        final Function1 function1 = new Function1() { // from class: o.xAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54226xAo.KWHzl(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXMakeDcdOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54226xAo.KWHzl(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54226xAo.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54226xAo.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C54226xAo c54226xAo, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        DcdOrderReq dcdOrderReq = null;
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        DcdOrderReq dcdOrderReq2 = c54226xAo.EZpvd;
        if (dcdOrderReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            dcdOrderReq = dcdOrderReq2;
        }
        java.lang.String currencyId = dcdOrderReq.getCurrencyId();
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "dcd_bot", currencyId == null ? "" : currencyId, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C54226xAo c54226xAo, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        DcdOrderReq dcdOrderReq = c54226xAo.EZpvd;
        if (dcdOrderReq == null) {
            Intrinsics.gEmmrt("");
            dcdOrderReq = null;
        }
        java.lang.String currencyId = dcdOrderReq.getCurrencyId();
        c55867xrz.OLrzqt((java.lang.String) null, "dcd_bot", currencyId != null ? currencyId : "", th);
        return Unit.INSTANCE;
    }
}
