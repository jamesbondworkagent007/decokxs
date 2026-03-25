package o;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC10343bmf;

/* JADX INFO: renamed from: o.bme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10342bme extends ViewModel {
    public final MutableStateFlow<InterfaceC10343bmf> EZpvd;
    public final StateFlow<InterfaceC10343bmf> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC10343bmf> OLrzqt() {
        return this.copydefault;
    }

    public C10342bme() {
        MutableStateFlow<InterfaceC10343bmf> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC10343bmf.ActionBar.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(boolean z) {
        InterfaceC10343bmf interfaceC10343bmf;
        MutableStateFlow<InterfaceC10343bmf> mutableStateFlow = this.EZpvd;
        if (z) {
            interfaceC10343bmf = InterfaceC10343bmf.Application.AEQbTJ;
        } else {
            interfaceC10343bmf = InterfaceC10343bmf.ActionBar.EZpvd;
        }
        mutableStateFlow.setValue(interfaceC10343bmf);
    }
}
