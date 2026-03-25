package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.core.usecase.todo.BizInitUseCase$doRetrieveFlowData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xCN extends xKW<java.lang.Boolean> {
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
    }

    @Override // o.xKQ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<java.lang.Boolean>>> continuation) {
        return FlowKt.callbackFlow(new BizInitUseCase$doRetrieveFlowData$2(this, null));
    }
}
