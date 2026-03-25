package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.broadcastmessages.pluginpanel.BroadcastMessagePluginPanelFragmentShareViewModel$dispatchMessagesEvent$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35443nvU extends ViewModel {
    public final SharedFlow<java.util.List<OKMessage>> AEQbTJ;
    public final MutableSharedFlow<java.util.List<OKMessage>> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<OKMessage>> KWHzl() {
        return this.AEQbTJ;
    }

    public C35443nvU() {
        MutableSharedFlow<java.util.List<OKMessage>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void copydefault(@NotNull java.util.List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagePluginPanelFragmentShareViewModel$dispatchMessagesEvent$1(this, list, null), 3, null);
    }
}
