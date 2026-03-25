package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56144xxK extends xKE<java.util.List<? extends StrategyResponse>> {
    public static final int AEQbTJ = 8;
    public DcaOrderReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56144xxK OLrzqt(@NotNull DcaOrderReq dcaOrderReq) {
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        this.OLrzqt = dcaOrderReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        DcaOrderReq dcaOrderReq = this.OLrzqt;
        if (dcaOrderReq == null) {
            dcaOrderReq = new DcaOrderReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -1, 15, (DefaultConstructorMarker) null);
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXDcaAggregationMakeOrder = bizApiService.dcaAggregationMakeOrder(dcaOrderReq);
        final Function1 function1 = new Function1() { // from class: o.xxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56144xxK.KWHzl(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXDcaAggregationMakeOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56144xxK.copydefault(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56144xxK.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56144xxK.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C56144xxK c56144xxK, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        DcaOrderReq dcaOrderReq = c56144xxK.OLrzqt;
        java.lang.String instId = dcaOrderReq != null ? dcaOrderReq.getInstId() : null;
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "spot_dca", instId == null ? "" : instId, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C56144xxK c56144xxK, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        DcaOrderReq dcaOrderReq = c56144xxK.OLrzqt;
        java.lang.String instId = dcaOrderReq != null ? dcaOrderReq.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        c55867xrz.OLrzqt((java.lang.String) null, "spot_dca", instId, th);
        return Unit.INSTANCE;
    }
}
