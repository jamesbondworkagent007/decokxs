package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TrailingPxReq;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.net.BotApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56225xym extends xKQ<java.util.List<? extends TrailingPxResp>> {
    public TrailingPxReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull TrailingPxReq trailingPxReq) {
        Intrinsics.checkNotNullParameter(trailingPxReq, "");
        this.OLrzqt = trailingPxReq;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.TrailingPxResp>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends TrailingPxResp>>> continuation) {
        BotApiService botApiServiceAEQbTJ = BotApiService.Companion.AEQbTJ();
        TrailingPxReq trailingPxReq = this.OLrzqt;
        if (trailingPxReq == null) {
            Intrinsics.gEmmrt("");
            trailingPxReq = null;
        }
        return botApiServiceAEQbTJ.getTrailingPx(trailingPxReq, continuation);
    }
}
