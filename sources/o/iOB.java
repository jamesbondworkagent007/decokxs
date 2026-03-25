package o;

import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.mln.ui.kline.ChartManager$loadChartData$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iOB {
    public final StateFlow<C27398juT> AEQbTJ;
    public InterfaceC23938iOx EZpvd;
    public final InterfaceC23939iOy KWHzl;
    public final CoroutineScope OLrzqt;
    public final MutableStateFlow<C27398juT> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C27398juT> EZpvd() {
        return this.AEQbTJ;
    }

    public iOB(@NotNull InterfaceC23939iOy interfaceC23939iOy) {
        Intrinsics.checkNotNullParameter(interfaceC23939iOy, "");
        this.KWHzl = interfaceC23939iOy;
        this.OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
        MutableStateFlow<C27398juT> MutableStateFlow = StateFlowKt.MutableStateFlow(new C27398juT(ChartInterval.Week, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, true, false, null, 7164, null));
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull InterfaceC23938iOx interfaceC23938iOx) {
        Intrinsics.checkNotNullParameter(interfaceC23938iOx, "");
        this.EZpvd = interfaceC23938iOx;
        KWHzl(interfaceC23938iOx.KWHzl());
    }

    public final void KWHzl(@NotNull ChartInterval chartInterval) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        InterfaceC23938iOx interfaceC23938iOx = this.EZpvd;
        if (interfaceC23938iOx == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new ChartManager$loadChartData$1(this, interfaceC23938iOx, chartInterval, null), 3, null);
    }

    public final void KWHzl() {
        KWHzl(this.copydefault.getValue().AEQbTJ());
    }

    public final void EZpvd(@NotNull ChartInterval chartInterval) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        KWHzl(chartInterval);
    }

    public final void copydefault() {
        this.EZpvd = null;
        CoroutineScopeKt.cancel$default(this.OLrzqt, null, 1, null);
    }
}
