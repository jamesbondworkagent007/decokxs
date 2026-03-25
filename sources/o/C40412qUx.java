package o;

import com.okinc.market.ticker.datasource.impl.Ticker3sDataSource$bindTickers$1;
import com.okinc.market.ticker.datasource.impl.Ticker3sDataSource$bindTickers$cacheFlow$1;
import com.okinc.market.ticker.datasource.impl.Ticker3sDataSource$bindTickers$subscribeFlow$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40412qUx {
    public final qUV EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qUV copydefault() {
        return this.EZpvd;
    }

    @yCM
    public C40412qUx(@NotNull qUV quv) {
        Intrinsics.checkNotNullParameter(quv, "");
        this.EZpvd = quv;
    }

    public Flow<java.util.List<TickersData>> copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flatMapConcat(FlowKt.flowOf((java.lang.Object[]) new Flow[]{FlowKt.asFlow(new Ticker3sDataSource$bindTickers$cacheFlow$1(list, this, null)), FlowKt.onEach(C55626xnW.copydefault(list, str), new Ticker3sDataSource$bindTickers$subscribeFlow$1(str, this, null))}), new Ticker3sDataSource$bindTickers$1(null));
    }
}
