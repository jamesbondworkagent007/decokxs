package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXL extends AbstractC43215rlA implements dTN, dTP {
    public final MutableStateFlow<dTH> OLrzqt = StateFlowKt.MutableStateFlow(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lkotlinx/coroutines/flow/StateFlow; */
    @Override // o.dTN
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<dTH> OLrzqt() {
        return this.OLrzqt;
    }

    @Override // o.dTP
    public void OLrzqt(@NotNull dTH dth) {
        Intrinsics.checkNotNullParameter(dth, "");
        OLrzqt().setValue(dth);
    }
}
