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

/* JADX INFO: renamed from: o.xxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56185xxz extends xKE<java.util.List<? extends StrategyResponse>> {
    public DcaOrderReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull DcaOrderReq dcaOrderReq) {
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        this.AEQbTJ = dcaOrderReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        DcaOrderReq dcaOrderReq = this.AEQbTJ;
        if (dcaOrderReq == null) {
            dcaOrderReq = new DcaOrderReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -1, 15, (DefaultConstructorMarker) null);
        }
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXContractDcaMakeOrder = bizApiService.contractDcaMakeOrder(dcaOrderReq);
        final Function1 function1 = new Function1() { // from class: o.xxD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56185xxz.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXKWHzl = abstractC58185ywXContractDcaMakeOrder.KWHzl(new InterfaceC58227yxM() { // from class: o.xxB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56185xxz.OLrzqt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.xxC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56185xxz.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<StrategyResponse>>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.xxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C56185xxz.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C56185xxz c56185xxz, ResponseData responseData) {
        StrategyResponse strategyResponse;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.util.List list = (java.util.List) responseData.getData();
        java.lang.String algoId = (list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : strategyResponse.getAlgoId();
        DcaOrderReq dcaOrderReq = c56185xxz.AEQbTJ;
        java.lang.String instId = dcaOrderReq != null ? dcaOrderReq.getInstId() : null;
        C55867xrz.trackOrderPlacementEvent$default(c55867xrz, algoId, "contract_dca", instId == null ? "" : instId, null, 8, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C56185xxz c56185xxz, java.lang.Throwable th) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        DcaOrderReq dcaOrderReq = c56185xxz.AEQbTJ;
        java.lang.String instId = dcaOrderReq != null ? dcaOrderReq.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        c55867xrz.OLrzqt((java.lang.String) null, "contract_dca", instId, th);
        return Unit.INSTANCE;
    }
}
