package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.MarketDiscoverOverviewTrendingCategoriesDetailPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.repository.MarketDiscoverOverviewTrendingCategoriesRepository$getMarketDiscoverOverviewTrendingCategoriesData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41069qjp {
    public final C41064qjk EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public C41069qjp(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41064qjk c41064qjk) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41064qjk, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = c41064qjk;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super MarketDiscoverOverviewTrendingCategoriesDetailPo> continuation) {
        return BuildersKt.withContext(OLrzqt(), new MarketDiscoverOverviewTrendingCategoriesRepository$getMarketDiscoverOverviewTrendingCategoriesData$2(this, str, null), continuation);
    }
}
