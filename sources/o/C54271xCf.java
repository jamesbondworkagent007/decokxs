package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AccountTradeConfig;
import com.okinc.unify_trade.net.TradeApiService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54271xCf extends xKQ<java.util.ArrayList<AccountTradeConfig>> {
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.ArrayList<AccountTradeConfig>>> continuation) {
        return ((TradeApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(TradeApiService.class), null, 1, null)).getTradeInfoAndConfig(continuation);
    }
}
