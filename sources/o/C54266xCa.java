package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.TradeBehaviorBean;
import com.okinc.unify_trade.net.TradeApiService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54266xCa extends xKQ<TradeBehaviorBean> {
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<TradeBehaviorBean>> continuation) {
        return ((TradeApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(TradeApiService.class), null, 1, null)).getTradeBehavior(continuation);
    }
}
