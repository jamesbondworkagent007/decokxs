package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40955qhh extends C40512qYp {
    public C40955qhh(@NotNull Function1<? super MarketDiscoverOverviewTradeCalendarVo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        register(MarketDiscoverOverviewTradeCalendarVo.class, new C40873qgE(function1));
    }
}
