package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCG {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC44375sNm OLrzqt;

    @yCM
    public oCG(@NotNull InterfaceC44375sNm interfaceC44375sNm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC44375sNm;
        this.EZpvd = coroutineDispatcher;
    }

    public final Flow<java.util.Set<java.lang.String>> OLrzqt() {
        return FlowKt.flowOn(this.OLrzqt.OLrzqt(), this.EZpvd);
    }
}
