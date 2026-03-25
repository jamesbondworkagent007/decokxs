package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qUY {
    public final C40409qUu EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.copydefault;
    }

    @yCM
    public qUY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40409qUu c40409qUu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40409qUu, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c40409qUu;
    }

    public final Flow<C40398qUj> KWHzl() {
        return FlowKt.flowOn(this.EZpvd.AEQbTJ(), EZpvd());
    }
}
