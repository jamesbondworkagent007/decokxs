package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27673jzd {
    public final MutableSharedFlow<java.lang.String> AEQbTJ;
    public final SharedFlow<java.lang.String> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    public C27673jzd() {
        MutableSharedFlow<java.lang.String> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 1000, BufferOverflow.DROP_OLDEST);
        this.AEQbTJ = MutableSharedFlow;
        this.EZpvd = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.tryEmit(str);
    }
}
