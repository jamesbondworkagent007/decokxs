package o;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.pwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39658pwW extends ViewModel {
    public final MutableStateFlow<java.lang.Boolean> EZpvd = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
    public final MutableStateFlow<java.lang.String> AEQbTJ = StateFlowKt.MutableStateFlow("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.Boolean> copydefault() {
        return this.EZpvd;
    }
}
