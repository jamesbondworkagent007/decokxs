package com.okinc.business.invest_biz.ui.screens.tvl_chart;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C26823jjb;
import o.C27493jwI;
import o.InterfaceC26824jjc;
import o.iEM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TvlChartViewModel extends ViewModel {
    public final StateFlow<InterfaceC26824jjc> AEQbTJ;
    public final iEM EZpvd;
    public final MutableStateFlow<InterfaceC26824jjc> KWHzl;
    public final C26823jjb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26824jjc> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public TvlChartViewModel(@NotNull iEM iem, @NotNull C26823jjb c26823jjb) {
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(c26823jjb, "");
        this.EZpvd = iem;
        this.copydefault = c26823jjb;
        MutableStateFlow<InterfaceC26824jjc> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26824jjc.ActionBar.EZpvd);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(long j, @NotNull ChartInterval chartInterval) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TvlChartViewModel$loadTvlChart$1(this, chartInterval, j, null), 3, null);
    }
}
