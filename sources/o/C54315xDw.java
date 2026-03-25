package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.core.usecase.todo.TradeInitUseCase$doRetrieveFlowData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54315xDw extends xKW<java.lang.Boolean> {
    public static final int EZpvd = 8;
    public java.util.List<java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    @Override // o.xKQ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<java.lang.Boolean>>> continuation) {
        return FlowKt.callbackFlow(new TradeInitUseCase$doRetrieveFlowData$2(this, null));
    }
}
