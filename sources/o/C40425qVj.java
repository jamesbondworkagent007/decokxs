package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40425qVj {
    public final C40412qUx EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public C40425qVj(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40412qUx c40412qUx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40412qUx, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c40412qUx;
    }

    public final Flow<java.util.List<TickersData>> AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(this.EZpvd.copydefault(list, str), EZpvd());
    }
}
