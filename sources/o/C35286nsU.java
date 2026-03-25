package o;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.nsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35286nsU {
    public static final <T> MutableSharedFlow<T> OLrzqt(T t) {
        MutableSharedFlow<T> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
        MutableSharedFlow.tryEmit(t);
        return MutableSharedFlow;
    }
}
