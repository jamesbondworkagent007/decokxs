package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragmentShareViewModel$setCurrentInputMode$1;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragmentShareViewModel$setCurrentTextInput$1;
import com.okinc.im.widgets.inputpanel.InputMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35461nvm extends ViewModel {
    public final MutableStateFlow<InputMode> AEQbTJ;
    public final StateFlow<InputMode> KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InputMode> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public C35461nvm() {
        MutableStateFlow<InputMode> MutableStateFlow = StateFlowKt.MutableStateFlow(InputMode.DefaultMode);
        this.AEQbTJ = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void EZpvd(@NotNull InputMode inputMode) {
        Intrinsics.checkNotNullParameter(inputMode, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageInputPanelFragmentShareViewModel$setCurrentInputMode$1(this, inputMode, null), 3, null);
    }

    public final void OLrzqt(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageInputPanelFragmentShareViewModel$setCurrentTextInput$1(this, str, null), 3, null);
    }
}
