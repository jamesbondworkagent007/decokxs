package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import com.okinc.unify_trade.core.usecase.ipublic.trade.info.OpenInterestWsUseCase$doRetrieveFlowData$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54280xCo extends xKW<OpenInterestData> {
    public java.lang.String EZpvd = "";

    @Override // o.xKQ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<OpenInterestData>>> continuation) {
        return FlowKt.callbackFlow(new OpenInterestWsUseCase$doRetrieveFlowData$2(this, null));
    }
}
