package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.core.usecase.algo.trade.marketplace.BotUserSummaryUseCase$doRetrieveFlowData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xAL extends xKW<BotUserSummaryData> {
    public BotUserSummaryReq AEQbTJ;
    public java.lang.Boolean KWHzl = java.lang.Boolean.FALSE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull BotUserSummaryReq botUserSummaryReq, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(botUserSummaryReq, "");
        this.AEQbTJ = botUserSummaryReq;
        this.KWHzl = bool;
    }

    public static /* synthetic */ void setReq$default(xAL xal, BotUserSummaryReq botUserSummaryReq, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        xal.OLrzqt(botUserSummaryReq, bool);
    }

    @Override // o.xKQ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<BotUserSummaryData>>> continuation) {
        return FlowKt.callbackFlow(new BotUserSummaryUseCase$doRetrieveFlowData$2(this, null));
    }
}
