package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.HiddenCurrencyBean;
import com.okinc.unify_trade.net.TradeApiService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54273xCh extends xKQ<java.util.ArrayList<HiddenCurrencyBean>> {
    public boolean KWHzl = true;

    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.ArrayList<HiddenCurrencyBean>>> continuation) {
        return ((TradeApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(TradeApiService.class), null, 1, null)).loadHiddenCoinsList(this.KWHzl, continuation);
    }
}
