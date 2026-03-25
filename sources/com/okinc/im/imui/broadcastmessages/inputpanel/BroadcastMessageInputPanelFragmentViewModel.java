package com.okinc.im.imui.broadcastmessages.inputpanel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.oCS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageInputPanelFragmentViewModel extends ViewModel {
    public final MutableSharedFlow<GeneralAction> AEQbTJ;
    public final SharedFlow<List<SendMessageRequestParam>> AYXKKw;
    public final MutableSharedFlow<Unit> EZpvd;
    public final SharedFlow<Unit> KWHzl;
    public final MutableSharedFlow<List<SendMessageRequestParam>> OLrzqt;
    public final SharedFlow<GeneralAction> copydefault;
    public final oCS djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<SendMessageRequestParam>> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<GeneralAction> copydefault() {
        return this.copydefault;
    }

    @yCM
    public BroadcastMessageInputPanelFragmentViewModel(@NotNull oCS ocs) {
        Intrinsics.checkNotNullParameter(ocs, "");
        this.djBIcL = ocs;
        MutableSharedFlow<List<SendMessageRequestParam>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<GeneralAction> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default3;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final void EZpvd(boolean z, @NotNull List<? extends SendMessageRequestParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageInputPanelFragmentViewModel$sendMessage$1(this, z, list, null), 3, null);
    }
}
