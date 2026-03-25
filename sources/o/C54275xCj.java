package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54275xCj extends xKQ<java.util.List<? extends OKTDexChainInfoModel>> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends OKTDexChainInfoModel>>> continuation) {
        return ((InterfaceC54490xKi) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC54490xKi.class), null, 1, null)).KWHzl(continuation);
    }
}
