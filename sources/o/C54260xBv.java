package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.subscribe.BizDexOrderReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54260xBv extends xKE<java.util.List<? extends TradeAllOrderApi>> {
    public BizDexOrderReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BizDexOrderReq bizDexOrderReq) {
        Intrinsics.checkNotNullParameter(bizDexOrderReq, "");
        this.AEQbTJ = bizDexOrderReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeAllOrderApi>>> EZpvd() {
        java.lang.String instType;
        BizDexOrderReq bizDexOrderReq = this.AEQbTJ;
        BizDexOrderReq bizDexOrderReq2 = null;
        if (bizDexOrderReq == null) {
            Intrinsics.gEmmrt("");
            bizDexOrderReq = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) bizDexOrderReq.getInstType(), (java.lang.Object) "ANY")) {
            instType = null;
        } else {
            BizDexOrderReq bizDexOrderReq3 = this.AEQbTJ;
            if (bizDexOrderReq3 == null) {
                Intrinsics.gEmmrt("");
                bizDexOrderReq3 = null;
            }
            instType = bizDexOrderReq3.getInstType();
        }
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        BizDexOrderReq bizDexOrderReq4 = this.AEQbTJ;
        if (bizDexOrderReq4 == null) {
            Intrinsics.gEmmrt("");
            bizDexOrderReq4 = null;
        }
        java.lang.String chainIndex = bizDexOrderReq4.getChainIndex();
        BizDexOrderReq bizDexOrderReq5 = this.AEQbTJ;
        if (bizDexOrderReq5 == null) {
            Intrinsics.gEmmrt("");
            bizDexOrderReq5 = null;
        }
        java.lang.String instId = bizDexOrderReq5.getInstId();
        BizDexOrderReq bizDexOrderReq6 = this.AEQbTJ;
        if (bizDexOrderReq6 == null) {
            Intrinsics.gEmmrt("");
            bizDexOrderReq6 = null;
        }
        java.lang.String tokenAddress = bizDexOrderReq6.getTokenAddress();
        BizDexOrderReq bizDexOrderReq7 = this.AEQbTJ;
        if (bizDexOrderReq7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            bizDexOrderReq2 = bizDexOrderReq7;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(BizApiService.TaskDescription.getOrdersDexPendingAll$default(bizApiService, instType, instId, tokenAddress, chainIndex, bizDexOrderReq2.getLimit(), null, 32, null)).KWHzl(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.xBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54260xBv.KWHzl(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<? extends TradeAllOrderApi>>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.xBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54260xBv.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public final java.util.List<TradeAllOrderApi> KWHzl(java.util.List<AllOrderDataInfo> list) {
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

    public static final ResponseData KWHzl(C54260xBv c54260xBv, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new ResponseData(0, null, null, null, c54260xBv.KWHzl((java.util.List<AllOrderDataInfo>) data), null, 46, null);
        }
        return new ResponseData(-1, null, null, null, null, null, 46, null);
    }
}
