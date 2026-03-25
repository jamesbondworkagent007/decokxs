package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstTypeGroup;
import com.okinc.unify_trade.net.TradeApiService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54267xCb extends xKQ<java.util.List<? extends InstTypeGroup>> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstTypeGroup>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends InstTypeGroup>>> continuation) {
        return ((TradeApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(TradeApiService.class), null, 1, null)).getInstTypeAndGroup(continuation);
    }
}
