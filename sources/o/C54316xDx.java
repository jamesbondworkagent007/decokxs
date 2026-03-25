package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54316xDx extends xKE<java.util.List<? extends TradeAllOrderApi>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna = "20";
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Boolean copydefault;
    public java.lang.String djBIcL;
    public java.lang.Boolean gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Boolean bool) {
        this.gEmmrt = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Boolean bool) {
        this.copydefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    public C54316xDx() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.copydefault = bool;
        this.gEmmrt = bool;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeAllOrderApi>>> EZpvd() {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) ((BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class))).loadAllHistoryOrders(this.djBIcL, this.AEQbTJ, this.OLrzqt, this.AhwBna, this.KWHzl, this.EZpvd, this.copydefault, this.gEmmrt, this.AYXKKw, this.valueOf, java.lang.Boolean.TRUE)).KWHzl(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.xDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54316xDx.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<? extends TradeAllOrderApi>>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.xDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54316xDx.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    private final java.util.List<TradeAllOrderApi> EZpvd(java.util.List<AllOrderDataInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TradeAllOrderApi tradeAllOrderApiConvertDataByOrderType = ((AllOrderDataInfo) it.next()).convertDataByOrderType(true);
            if (tradeAllOrderApiConvertDataByOrderType != null) {
                arrayList.add(tradeAllOrderApiConvertDataByOrderType);
            }
        }
        return arrayList;
    }

    public static final ResponseData EZpvd(C54316xDx c54316xDx, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new ResponseData(0, null, null, null, c54316xDx.EZpvd((java.util.List<AllOrderDataInfo>) data), null, 46, null);
        }
        return new ResponseData(-1, null, null, null, null, null, 46, null);
    }
}
