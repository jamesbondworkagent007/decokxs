package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDC extends xKE<java.util.List<? extends TradeAllOrderApi>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt = "20";
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeAllOrderApi>>> EZpvd() {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) ((BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class))).loadAllPendingOpenOrders(this.copydefault, this.EZpvd, this.AEQbTJ, this.OLrzqt)).KWHzl(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.xDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDC.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<? extends TradeAllOrderApi>>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.xDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xDC.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    private final java.util.List<TradeAllOrderApi> copydefault(java.util.List<AllOrderDataInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TradeAllOrderApi tradeAllOrderApiConvertDataByOrderType = ((AllOrderDataInfo) it.next()).convertDataByOrderType(false);
            if (tradeAllOrderApiConvertDataByOrderType != null) {
                arrayList.add(tradeAllOrderApiConvertDataByOrderType);
            }
        }
        return arrayList;
    }

    public static final ResponseData AEQbTJ(xDC xdc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new ResponseData(0, null, null, null, xdc.copydefault((java.util.List<AllOrderDataInfo>) data), null, 46, null);
        }
        return new ResponseData(-1, null, null, null, null, null, 46, null);
    }
}
