package o;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.tBh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45924tBh {
    public static final MutableSharedFlow<java.lang.Long> AEQbTJ;
    public static final int EZpvd;
    public static final C45924tBh KWHzl = new C45924tBh();
    public static final SharedFlow<java.lang.Long> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.Long> EZpvd() {
        return OLrzqt;
    }

    private C45924tBh() {
    }

    static {
        MutableSharedFlow<java.lang.Long> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
        AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        EZpvd = 8;
    }

    public final boolean EZpvd(long j) {
        return AEQbTJ.tryEmit(java.lang.Long.valueOf(j));
    }
}
