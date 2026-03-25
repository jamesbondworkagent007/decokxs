package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.repository.TradingCalendarRepository$getTradingCalendarData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40889qgU {
    public final C40883qgO AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C40889qgU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40883qgO c40883qgO) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40883qgO, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c40883qgO;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super java.util.List<TradingCalendarPo>> continuation) {
        return BuildersKt.withContext(AEQbTJ(), new TradingCalendarRepository$getTradingCalendarData$2(this, str, str2, str3, str4, null), continuation);
    }
}
