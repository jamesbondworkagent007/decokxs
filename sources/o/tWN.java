package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tWN {
    public static final SharedFlow<tWO> EZpvd;
    public static final int KWHzl;
    public static final tWN OLrzqt = new tWN();
    public static final MutableSharedFlow<tWO> copydefault;

    private tWN() {
    }

    static {
        MutableSharedFlow<tWO> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
        copydefault = mutableSharedFlowMutableSharedFlow$default;
        EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        KWHzl = 8;
    }

    public final boolean EZpvd(@NotNull tWO two) {
        Intrinsics.checkNotNullParameter(two, "");
        return copydefault.tryEmit(two);
    }
}
