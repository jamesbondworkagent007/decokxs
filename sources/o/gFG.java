package o;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gFG extends ViewModel {
    public final StateFlow<java.lang.Boolean> AEQbTJ;
    public boolean EZpvd;
    public final MutableStateFlow<java.lang.Boolean> KWHzl;
    public final MutableStateFlow<java.lang.Boolean> OLrzqt;
    public final StateFlow<java.lang.Boolean> copydefault;
    public C10525bqB djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10525bqB EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C10525bqB c10525bqB) {
        this.djBIcL = c10525bqB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    public gFG() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.KWHzl = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void AhwBna() {
        this.KWHzl.setValue(java.lang.Boolean.TRUE);
    }

    public final void copydefault() {
        this.KWHzl.setValue(java.lang.Boolean.FALSE);
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt.setValue(java.lang.Boolean.valueOf(z));
    }
}
