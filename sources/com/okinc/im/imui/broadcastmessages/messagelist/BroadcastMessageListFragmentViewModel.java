package com.okinc.im.imui.broadcastmessages.messagelist;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35254nrp;
import o.C35764oCv;
import o.oGH;
import o.oGM;
import o.oGQ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageListFragmentViewModel extends ViewModel {
    public final SharedFlow<List<C35254nrp>> AEQbTJ;
    public final oGQ AYXKKw;
    public final C35764oCv AhwBna;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<List<C35254nrp>> KWHzl;
    public final MutableStateFlow<C35254nrp> OLrzqt;
    public final MutableSharedFlow<OKMessage> copydefault;
    public final oGH djBIcL;
    public final SharedFlow<OKMessage> gEmmrt;
    public final SharedFlow<Unit> isConnected;
    public final oGM valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<C35254nrp>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<OKMessage> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public BroadcastMessageListFragmentViewModel(@NotNull C35764oCv c35764oCv, @NotNull oGQ ogq, @NotNull oGM ogm, @NotNull oGH ogh) {
        Intrinsics.checkNotNullParameter(c35764oCv, "");
        Intrinsics.checkNotNullParameter(ogq, "");
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(ogh, "");
        this.AhwBna = c35764oCv;
        this.AYXKKw = ogq;
        this.valueOf = ogm;
        this.djBIcL = ogh;
        MutableSharedFlow<OKMessage> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<C35254nrp> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        MutableSharedFlow<List<C35254nrp>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        mutableSharedFlowMutableSharedFlow$default2.tryEmit(yDY.AhwBna());
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default3;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        this.AEQbTJ = FlowKt.shareIn(FlowKt.combine(MutableStateFlow, mutableSharedFlowMutableSharedFlow$default2, new BroadcastMessageListFragmentViewModel$actualMessageList$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 1);
    }

    public final void OLrzqt(@NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
        Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageListFragmentViewModel$init$1(this, broadcastMessagePageParam, null), 3, null);
    }

    public final void AEQbTJ(@NotNull List<OKMessage> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageListFragmentViewModel$onMessagesReceived$1(this, z, list, null), 3, null);
    }

    public final void AEQbTJ(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageListFragmentViewModel$retryMessage$1(this, i, null), 3, null);
    }
}
