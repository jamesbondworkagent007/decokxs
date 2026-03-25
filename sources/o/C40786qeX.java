package o;

import com.okinc.market.discover.features.markets.sub.overview.data.datasource.IOverviewDataSource;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallStatsPo;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo;
import com.okinc.market.discover.features.markets.sub.overview.data.repository.MarketDiscoverOverviewRepository$getMarketDiscoverOverallStats$2;
import com.okinc.market.discover.features.markets.sub.overview.data.repository.MarketDiscoverOverviewRepository$getMarketDiscoverOverallTrend$2;
import com.okinc.market.discover.features.markets.sub.overview.data.repository.MarketDiscoverOverviewRepository$getMarketFlowData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40786qeX {
    public final C40785qeW OLrzqt;
    public final CoroutineDispatcher copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher KWHzl() {
        return this.copydefault;
    }

    @yCM
    public C40786qeX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40785qeW c40785qeW) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40785qeW, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = c40785qeW;
    }

    /* JADX INFO: renamed from: o.qeX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qeX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.Object EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super MarketDiscoverFlowPo> continuation) {
        return BuildersKt.withContext(KWHzl(), new MarketDiscoverOverviewRepository$getMarketFlowData$2(this, map, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull IOverviewDataSource.PayloadTimeZone payloadTimeZone, @NotNull Continuation<? super MarketDiscoverOverallStatsPo> continuation) {
        return BuildersKt.withContext(KWHzl(), new MarketDiscoverOverviewRepository$getMarketDiscoverOverallStats$2(this, payloadTimeZone, null), continuation);
    }

    public static /* synthetic */ java.lang.Object getMarketDiscoverOverallTrend$default(C40786qeX c40786qeX, IOverviewDataSource.PayloadOverallType payloadOverallType, IOverviewDataSource.PayloadPeriod payloadPeriod, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return c40786qeX.EZpvd(payloadOverallType, payloadPeriod, str, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull IOverviewDataSource.PayloadOverallType payloadOverallType, @NotNull IOverviewDataSource.PayloadPeriod payloadPeriod, java.lang.String str, @NotNull Continuation<? super MarketDiscoverOverallTrendPo> continuation) {
        return BuildersKt.withContext(KWHzl(), new MarketDiscoverOverviewRepository$getMarketDiscoverOverallTrend$2(this, payloadOverallType, payloadPeriod, str, null), continuation);
    }
}
