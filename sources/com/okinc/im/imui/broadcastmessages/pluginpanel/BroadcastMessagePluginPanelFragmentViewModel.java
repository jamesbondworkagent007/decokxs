package com.okinc.im.imui.broadcastmessages.pluginpanel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35287nsV;
import o.C35386nuP;
import o.InterfaceC35288nsW;
import o.oFV;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagePluginPanelFragmentViewModel extends ViewModel {
    public final SharedFlow<List<GeneralAction>> AEQbTJ;
    public final C35386nuP AYXKKw;
    public final StateFlow<List<InterfaceC35288nsW>> AhwBna;
    public final oFV EZpvd;
    public final MutableStateFlow<C35287nsV> KWHzl;
    public final Flow<Integer> OLrzqt;
    public final MutableSharedFlow<List<GeneralAction>> copydefault;
    public MutableStateFlow<Integer> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<GeneralAction>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<InterfaceC35288nsW>> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public BroadcastMessagePluginPanelFragmentViewModel(@NotNull oFV ofv, @NotNull C35386nuP c35386nuP) {
        Intrinsics.checkNotNullParameter(ofv, "");
        Intrinsics.checkNotNullParameter(c35386nuP, "");
        this.EZpvd = ofv;
        this.AYXKKw = c35386nuP;
        MutableSharedFlow<List<GeneralAction>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<C35287nsV> MutableStateFlow = StateFlowKt.MutableStateFlow(new C35287nsV(null, null, null, 4, null));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = StateFlowKt.MutableStateFlow(0);
        Flow<Integer> flowCombine = FlowKt.combine(FlowKt.flowOf(20), c35386nuP.OLrzqt(), new BroadcastMessagePluginPanelFragmentViewModel$maxImageSelection$1(null));
        this.OLrzqt = flowCombine;
        this.AhwBna = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, this.gEmmrt, flowCombine, new BroadcastMessagePluginPanelFragmentViewModel$pluginList$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), yDY.AhwBna());
    }

    public final void KWHzl(@NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
        Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagePluginPanelFragmentViewModel$init$1(this, broadcastMessagePageParam, null), 3, null);
    }

    public final void EZpvd(@NotNull List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagePluginPanelFragmentViewModel$updateMaximumImageSelection$1(this, list, null), 3, null);
    }
}
