package o;

import com.okinc.im.usecase.broadcastmessage.RetryBroadcastMessageUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35766oCx {
    public final C35760oCr KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35766oCx(@NotNull C35760oCr c35760oCr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35760oCr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c35760oCr;
        this.OLrzqt = coroutineDispatcher;
    }

    public final Flow<AbstractC35761oCs> copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return FlowKt.flowOn(FlowKt.flow(new RetryBroadcastMessageUseCase$execute$1(oKMessage, this, null)), this.OLrzqt);
    }
}
