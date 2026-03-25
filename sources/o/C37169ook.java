package o;

import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.im.imui.messages.audio.call.service.AudioCallStateCoordinator$sendCommand$1;
import com.okinc.im.imui.messages.audio.call.service.AudioCallStateCoordinator$sendStatus$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC37171oom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ook, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C37169ook {
    public final MutableSharedFlow<AbstractC37171oom> AEQbTJ;
    public final CoroutineScope AhwBna = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain().getImmediate()));
    public final SharedFlow<AbstractC37160oob> EZpvd;
    public final MutableSharedFlow<AbstractC37160oob> KWHzl;
    public final StateFlow<CallStatus> OLrzqt;
    public final MutableStateFlow<CallStatus> copydefault;
    public final SharedFlow<AbstractC37171oom> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC37160oob> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CallStatus> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC37171oom> OLrzqt() {
        return this.gEmmrt;
    }

    @yCM
    public C37169ook() {
        MutableSharedFlow<AbstractC37160oob> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 16, null, 4, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<AbstractC37171oom> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 16, null, 4, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableStateFlow<CallStatus> MutableStateFlow = StateFlowKt.MutableStateFlow(CallStatus.DISCONNECTED);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull AbstractC37160oob abstractC37160oob) {
        Intrinsics.checkNotNullParameter(abstractC37160oob, "");
        C44124sEe.imLogVoiceCall$default("AudioCallStateCoordinator: sending command " + abstractC37160oob.getClass().getSimpleName(), null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(this.AhwBna, null, null, new AudioCallStateCoordinator$sendCommand$1(this, abstractC37160oob, null), 3, null);
    }

    public final void copydefault(@NotNull AbstractC37171oom abstractC37171oom) {
        Intrinsics.checkNotNullParameter(abstractC37171oom, "");
        if (abstractC37171oom instanceof AbstractC37171oom.TaskDescription) {
            AbstractC37171oom.TaskDescription taskDescription = (AbstractC37171oom.TaskDescription) abstractC37171oom;
            this.copydefault.setValue(taskDescription.AEQbTJ());
            C44124sEe.imLogVoiceCall$default("AudioCallStateCoordinator: currentStatus updated to " + taskDescription.AEQbTJ(), null, 2, null);
        }
        C44124sEe.imLogVoiceCall$default("AudioCallStateCoordinator: sending status event " + abstractC37171oom.getClass().getSimpleName(), null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(this.AhwBna, null, null, new AudioCallStateCoordinator$sendStatus$1(this, abstractC37171oom, null), 3, null);
    }

    public final void KWHzl() {
        C44124sEe.imLogVoiceCall$default("AudioCallStateCoordinator: reset", null, 2, null);
        this.copydefault.setValue(CallStatus.DISCONNECTED);
        this.AEQbTJ.resetReplayCache();
    }
}
