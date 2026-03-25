package o;

import com.okinc.im.imui.messages.audio.call.service.CallTimer$startTicking$2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.ool, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37170ool {
    public static final StateFlow<java.lang.Long> EZpvd;
    public static final int KWHzl;
    public static final MutableStateFlow<java.lang.Long> OLrzqt;
    public static java.lang.Long copydefault;
    public static Job valueOf;
    public static final C37170ool AEQbTJ = new C37170ool();
    public static final CoroutineScope gEmmrt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Long> AEQbTJ() {
        return EZpvd;
    }

    private C37170ool() {
    }

    static {
        MutableStateFlow<java.lang.Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        OLrzqt = MutableStateFlow;
        EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        KWHzl = 8;
    }

    public final void EZpvd() {
        EZpvd(java.lang.System.currentTimeMillis());
    }

    public final void EZpvd(long j) {
        C44124sEe.imLogVoiceCall$default("CallTimer: startFrom timeMillis=" + j, null, 2, null);
        copydefault = java.lang.Long.valueOf(j);
        AhwBna();
    }

    public final void gEmmrt() {
        C44124sEe.imLogVoiceCall$default("CallTimer: stop", null, 2, null);
        Job job = valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        valueOf = null;
        copydefault = null;
        OLrzqt.setValue(0L);
    }

    public final boolean OLrzqt() {
        Job job = valueOf;
        return (job == null || !job.isActive() || copydefault == null) ? false : true;
    }

    public final void AhwBna() {
        Job job = valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        java.lang.Long l = copydefault;
        if (l != null) {
            OLrzqt.setValue(java.lang.Long.valueOf(C56548yJl.copydefault((java.lang.System.currentTimeMillis() - l.longValue()) / 1000, 0L)));
        }
        valueOf = BuildersKt__Builders_commonKt.launch$default(gEmmrt, null, null, new CallTimer$startTicking$2(null), 3, null);
    }
}
