package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.BizDexAlgoOrderReq;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54254xBp extends xKE<java.util.List<? extends TradeStrategyOrderData>> {
    public BizDexAlgoOrderReq copydefault = new BizDexAlgoOrderReq(null, null, null, null, false, null, false, 127, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull BizDexAlgoOrderReq bizDexAlgoOrderReq) {
        Intrinsics.checkNotNullParameter(bizDexAlgoOrderReq, "");
        this.copydefault = bizDexAlgoOrderReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeStrategyOrderData>>> EZpvd() {
        return BizApiService.TaskDescription.getOrdersAlgoDexPending$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), this.copydefault.getOrdType(), this.copydefault.getTokenAddress(), this.copydefault.getChainIndex(), this.copydefault.getLimit(), null, 16, null);
    }
}
