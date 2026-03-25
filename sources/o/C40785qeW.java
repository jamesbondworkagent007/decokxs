package o;

import com.okinc.market.discover.features.markets.sub.overview.data.datasource.IOverviewDataSource;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallStatsPo;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40785qeW implements IOverviewDataSource {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qeY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40785qeW.OLrzqt();
        }
    });

    @yCM
    public C40785qeW() {
    }

    public final InterfaceC40782qeT AEQbTJ() {
        return (InterfaceC40782qeT) this.copydefault.getValue();
    }

    public static final InterfaceC40782qeT OLrzqt() {
        return (InterfaceC40782qeT) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC40782qeT.class));
    }

    public java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<MarketDiscoverFlowPo>> continuation) {
        return AEQbTJ().KWHzl(map, continuation);
    }

    public java.lang.Object EZpvd(@NotNull IOverviewDataSource.PayloadTimeZone payloadTimeZone, @NotNull Continuation<? super ResponseData<MarketDiscoverOverallStatsPo>> continuation) {
        return AEQbTJ().KWHzl(continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull IOverviewDataSource.PayloadOverallType payloadOverallType, @NotNull IOverviewDataSource.PayloadPeriod payloadPeriod, java.lang.String str, @NotNull Continuation<? super ResponseData<MarketDiscoverOverallTrendPo>> continuation) {
        return AEQbTJ().KWHzl(payloadPeriod.getValue(), payloadOverallType.getValue(), str, continuation);
    }
}
