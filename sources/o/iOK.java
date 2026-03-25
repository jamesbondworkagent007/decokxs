package o;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC26500jdW;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iOK extends ViewModel {
    public final MutableStateFlow<InterfaceC26500jdW> EZpvd;
    public final StateFlow<InterfaceC26500jdW> KWHzl;

    public void EZpvd(long j) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26500jdW> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<InterfaceC26500jdW> OLrzqt() {
        return this.EZpvd;
    }

    public iOK() {
        MutableStateFlow<InterfaceC26500jdW> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26500jdW.Activity.AEQbTJ);
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }
}
