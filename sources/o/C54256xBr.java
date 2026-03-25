package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.BizDexOrderReq;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54256xBr extends xKE<java.util.List<? extends TradeOrderData>> {
    public BizDexOrderReq OLrzqt = new BizDexOrderReq(null, null, null, null, null, null, false, null, false, FrameMetricsAggregator.EVERY_DURATION, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BizDexOrderReq bizDexOrderReq) {
        Intrinsics.checkNotNullParameter(bizDexOrderReq, "");
        this.OLrzqt = bizDexOrderReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.TradeOrderData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends TradeOrderData>>> EZpvd() {
        return BizApiService.TaskDescription.getOrdersDexPending$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), this.OLrzqt.getOrdType(), !Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getInstType(), (java.lang.Object) "ANY") ? this.OLrzqt.getInstType() : null, this.OLrzqt.getInstId(), this.OLrzqt.getTokenAddress(), this.OLrzqt.getChainIndex(), this.OLrzqt.getLimit(), null, 64, null);
    }
}
