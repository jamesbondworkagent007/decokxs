package o;

import com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30688lfq extends C43316rmw {
    public final AdvancedMarketFilter AEQbTJ;

    public C30688lfq(@NotNull AdvancedMarketFilter advancedMarketFilter, @NotNull Function1<? super C55276xgr, Unit> function1) {
        Intrinsics.checkNotNullParameter(advancedMarketFilter, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = advancedMarketFilter;
        register(C55276xgr.class, new C30692lfu(advancedMarketFilter, function1));
    }
}
