package o;

import com.okinc.planet.biz_content.input.GenericInputParentViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.twF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47759twF extends GenericInputParentViewModel {
    public final StateFlow<java.lang.String> AwvSrB;
    public final MutableStateFlow<java.lang.String> zuBGHE;

    public C47759twF() {
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.zuBGHE = MutableStateFlow;
        this.AwvSrB = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void ejfBZ() {
        this.zuBGHE.setValue("");
    }
}
