package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGO {
    public final CoroutineDispatcher OLrzqt;
    public final sFU copydefault;

    @yCM
    public oGO(@NotNull sFU sfu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sfu;
        this.OLrzqt = coroutineDispatcher;
    }

    public final Flow<com.okinc.okimcore.model.remote.UserInfo> EZpvd() {
        return FlowKt.flowOn(this.copydefault.AEQbTJ(), this.OLrzqt);
    }
}
