package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.dex.biz.data.OKTWalletInfo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54277xCl extends xKQ<java.util.List<? extends OKTWalletInfo>> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.dex.biz.data.OKTWalletInfo>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends OKTWalletInfo>>> continuation) {
        return ((InterfaceC54490xKi) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC54490xKi.class), null, 1, null)).copydefault(continuation);
    }
}
