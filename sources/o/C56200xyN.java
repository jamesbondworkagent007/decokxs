package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.net.BotApiService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56200xyN extends xKQ<java.util.List<? extends StrategyUserSummaryData>> {
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyUserSummaryData>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends StrategyUserSummaryData>>> continuation) {
        BotApiService botApiServiceAEQbTJ = BotApiService.Companion.AEQbTJ();
        java.lang.String str = this.AEQbTJ;
        if (str == null) {
            str = "";
        }
        return botApiServiceAEQbTJ.getBotUserSummary(str, continuation);
    }
}
