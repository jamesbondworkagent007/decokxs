package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40421qVf {
    public final CoroutineDispatcher AEQbTJ;
    public final qUD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public C40421qVf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qUD qud) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qud, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = qud;
    }

    public final Flow<C40398qUj> KWHzl() {
        return FlowKt.flowOn(this.copydefault.OLrzqt(), OLrzqt());
    }
}
