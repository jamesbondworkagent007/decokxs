package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19443gCo extends AbstractC33073mpa {
    public final MutableStateFlow<java.lang.String> KWHzl;
    public final MutableLiveData<java.lang.Boolean> OLrzqt = new MutableLiveData<>(java.lang.Boolean.FALSE);
    public final StateFlow<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> copydefault() {
        return this.OLrzqt;
    }

    public C19443gCo() {
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.KWHzl = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setValue(java.lang.Boolean.TRUE);
        this.KWHzl.setValue(str);
    }
}
