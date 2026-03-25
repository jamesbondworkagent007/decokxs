package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uLN<Event> extends AbstractC33073mpa {
    public final SharedFlow<Event> getFieldNames;
    public final MutableSharedFlow<Event> uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Event> fJNWhG() {
        return this.getFieldNames;
    }

    public uLN() {
        MutableSharedFlow<Event> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.uzCIH = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void EZpvd(Event event) {
        this.uzCIH.tryEmit(event);
    }

    public final java.lang.Object OLrzqt(Event event, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEmit = this.uzCIH.emit(event, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }
}
