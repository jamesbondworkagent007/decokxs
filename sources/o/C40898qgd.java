package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.data.po.TradeRadarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.data.repository.TradeRadarRepository$getTradeRadarData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40898qgd {
    public final CoroutineDispatcher AEQbTJ;
    public final C40897qgc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.AEQbTJ;
    }

    @yCM
    public C40898qgd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40897qgc c40897qgc) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40897qgc, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c40897qgc;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, int i2, @NotNull Continuation<? super java.util.List<TradeRadarPo>> continuation) {
        return BuildersKt.withContext(EZpvd(), new TradeRadarRepository$getTradeRadarData$2(this, str, i, i2, null), continuation);
    }
}
