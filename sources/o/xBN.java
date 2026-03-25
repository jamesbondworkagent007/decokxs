package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.net.TradeApiService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBN extends xKQ<java.util.ArrayList<TradeCoinInfo>> {
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.ArrayList<TradeCoinInfo>>> continuation) {
        return ((TradeApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(TradeApiService.class), null, 1, null)).getTradeCoins(continuation);
    }
}
