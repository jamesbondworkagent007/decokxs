package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tLY<Event> extends AbstractC33073mpa {
    public final MutableSharedFlow<Event> DbNXlk;
    public final SharedFlow<Event> fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Event> gEmmrt() {
        return this.fetchVPNInfo;
    }

    public tLY() {
        MutableSharedFlow<Event> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void EZpvd(Event event) {
        this.DbNXlk.tryEmit(event);
    }

    public final java.lang.Object EZpvd(Event event, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEmit = this.DbNXlk.emit(event, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }
}
