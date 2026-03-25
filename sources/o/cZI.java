package o;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cZI extends AbstractC43215rlA implements xWN {
    public final MutableSharedFlow<java.lang.Boolean> AEQbTJ;
    public final SharedFlow<java.lang.Boolean> KWHzl;
    public final MutableSharedFlow<java.lang.Boolean> OLrzqt;
    public final SharedFlow<java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWN
    public SharedFlow<java.lang.Boolean> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWN
    public SharedFlow<java.lang.Boolean> OLrzqt() {
        return this.copydefault;
    }

    public cZI() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    @Override // o.xWN
    public void EZpvd(boolean z) {
        this.OLrzqt.tryEmit(java.lang.Boolean.valueOf(z));
    }

    @Override // o.xWN
    public void KWHzl(boolean z) {
        this.AEQbTJ.tryEmit(java.lang.Boolean.valueOf(z));
    }
}
