package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.okinc.unify_trade.net.BotApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56203xyQ extends xKQ<java.util.List<? extends BotAssetsHistoryData>> {
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotAssetsHistoryData>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends BotAssetsHistoryData>>> continuation) {
        return BotApiService.Companion.AEQbTJ().getBotAssetsHistory(this.KWHzl, continuation);
    }
}
