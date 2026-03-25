package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cUE extends AbstractC43215rlA implements dTL, dTI {
    public final MutableStateFlow<dTK> AEQbTJ;
    public final MutableStateFlow<dTK> EZpvd = StateFlowKt.MutableStateFlow(null);
    public final StateFlow<dTK> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.dTL
    public StateFlow<dTK> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lkotlinx/coroutines/flow/StateFlow; */
    @Override // o.dTL
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<dTK> AEQbTJ() {
        return this.EZpvd;
    }

    public cUE() {
        MutableStateFlow<dTK> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // o.dTI
    public void copydefault(@NotNull dTK dtk) {
        Intrinsics.checkNotNullParameter(dtk, "");
        AEQbTJ().setValue(dtk);
    }

    @Override // o.dTI
    public void EZpvd(@NotNull dTK dtk) {
        Intrinsics.checkNotNullParameter(dtk, "");
        this.AEQbTJ.setValue(dtk);
    }

    @Override // o.dTL
    public void OLrzqt() {
        this.AEQbTJ.setValue(null);
    }
}
