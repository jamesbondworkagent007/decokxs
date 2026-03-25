package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.MarketDiscoverOverviewTrendingCategoriesDetailPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41064qjk {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qjj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41064qjk.KWHzl();
        }
    });

    @yCM
    public C41064qjk() {
    }

    public final InterfaceC41055qjb copydefault() {
        return (InterfaceC41055qjb) this.OLrzqt.getValue();
    }

    public static final InterfaceC41055qjb KWHzl() {
        return (InterfaceC41055qjb) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC41055qjb.class));
    }

    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<MarketDiscoverOverviewTrendingCategoriesDetailPo>> continuation) {
        return copydefault().AEQbTJ(str, continuation);
    }
}
