package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C40423qVh {
    public final CoroutineDispatcher AEQbTJ;
    public final qUN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public C40423qVh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qUN qun) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qun, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = qun;
    }

    public final Flow<java.util.List<TickersData>> AEQbTJ(@NotNull Flow<? extends java.util.List<? extends BizInstrument>> flow) {
        Intrinsics.checkNotNullParameter(flow, "");
        return FlowKt.flowOn(this.copydefault.copydefault(flow), KWHzl());
    }
}
