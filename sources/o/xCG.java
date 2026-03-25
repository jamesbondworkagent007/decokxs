package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.core.usecase.todo.AvailBalanceUseCase$doRetrieveFlowData$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class xCG extends xKW<MaxAvailableResp> {
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "";

    @Override // o.xKQ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<MaxAvailableResp>>> continuation) {
        return FlowKt.callbackFlow(new AvailBalanceUseCase$doRetrieveFlowData$2(this, null));
    }
}
