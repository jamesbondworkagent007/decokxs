package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.data.po.TradeRadarPo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40897qgc {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qge
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40897qgc.OLrzqt();
        }
    });

    @yCM
    public C40897qgc() {
    }

    public final InterfaceC40900qgf copydefault() {
        return (InterfaceC40900qgf) this.EZpvd.getValue();
    }

    public static final InterfaceC40900qgf OLrzqt() {
        return (InterfaceC40900qgf) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC40900qgf.class));
    }

    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, int i2, @NotNull Continuation<? super ResponseData<java.util.List<TradeRadarPo>>> continuation) {
        InterfaceC40900qgf interfaceC40900qgfCopydefault = copydefault();
        PercentChangeRankingViewModel.ActionBar actionBar = PercentChangeRankingViewModel.Companion;
        return interfaceC40900qgfCopydefault.copydefault(str, i, i2, C41786qxQ.AEQbTJ(actionBar.copydefault(), actionBar.KWHzl(), actionBar.AEQbTJ()), continuation);
    }
}
