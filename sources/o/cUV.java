package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cUV extends AbstractC43215rlA implements InterfaceC54826xWt, InterfaceC54823xWq {
    public final MutableStateFlow<xWY> OLrzqt = StateFlowKt.MutableStateFlow(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54826xWt
    public Flow<xWY> OLrzqt() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC54823xWq
    public void AEQbTJ(@NotNull xWY xwy) {
        Intrinsics.checkNotNullParameter(xwy, "");
        MutableStateFlow<xWY> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), xwy)) {
        }
    }
}
