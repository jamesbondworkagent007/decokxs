package o;

import com.okinc.okimcore.ImCoreLifeCycleEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC44120sEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sDZ implements InterfaceC44120sEa {
    public static final sDZ AEQbTJ = new sDZ();
    public static final InterfaceC56387yDm AhwBna;
    public static final StateFlow<TaskDescription> EZpvd;
    public static sEG KWHzl;
    public static final int OLrzqt;
    public static MutableStateFlow<TaskDescription> copydefault;
    public static final InterfaceC56387yDm djBIcL;
    public static boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(sEG seg) {
        KWHzl = seg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> fetchVPNInfo() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public sEG gEmmrt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return valueOf;
    }

    private sDZ() {
    }

    public boolean uzCIH() {
        return InterfaceC44120sEa.Application.EZpvd(this);
    }

    static {
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(new TaskDescription(false, true, null, null));
        copydefault = MutableStateFlow;
        EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDZ.AEQbTJ();
            }
        });
        AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sDZ.copydefault();
            }
        });
        OLrzqt = 8;
    }

    public final sEZ DbNXlk() {
        return (sEZ) djBIcL.getValue();
    }

    public static final sEZ AEQbTJ() {
        return (sEZ) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), sEZ.class);
    }

    public final sDO values() {
        return (sDO) AhwBna.getValue();
    }

    public static final sDO copydefault() {
        return AEQbTJ.DbNXlk().ggKfIT();
    }

    public void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        values().OLrzqt(context);
    }

    public void KWHzl() {
        values().EZpvd();
    }

    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objOLrzqt = values().OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public sIC djBIcL() {
        return ((sEZ) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), sEZ.class)).DPHOMC();
    }

    public sFU valueOf() {
        return ((sEZ) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), sEZ.class)).ODCBUN();
    }

    public sHZ AhwBna() {
        return values().copydefault().AuCTel();
    }

    public InterfaceC44293sKl isConnected() {
        return ((sEZ) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), sEZ.class)).invokespecialhlXVux();
    }

    public InterfaceC44487sRq getNewProxyInstance() {
        return ((sEZ) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), sEZ.class)).processStrongAuthMessage();
    }

    public sGF AYXKKw() {
        return values().OLrzqt();
    }

    public sKH fARcdN() {
        return values().copydefault();
    }

    public sKN fJNWhG() {
        return values().djBIcL();
    }

    public sKO ejfBZ() {
        return values().AhwBna();
    }

    public sKU AuCTel() {
        return values().valueOf();
    }

    public sMW fIwbmz() {
        return values().AEQbTJ();
    }

    public void EZpvd(boolean z, boolean z2) {
        C44124sEe.imLogFeatureRestriction$default("OKIMCoreService - IM Restricted: " + z + ", isCache: " + z2 + ", uuid: " + C44157sFk.copydefault(C44157sFk.gEmmrt()) + ", isLogin: " + C44157sFk.gEmmrt().values(), null, 2, null);
        copydefault.setValue(new TaskDescription(z, z2, C44157sFk.copydefault(C44157sFk.gEmmrt()), java.lang.Boolean.valueOf(C44157sFk.gEmmrt().values())));
    }

    public SharedFlow<ImCoreLifeCycleEvent> AkhnZx() {
        return values().KWHzl();
    }

    public static final class TaskDescription {
        public final java.lang.Boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, boolean z2, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                z2 = taskDescription.OLrzqt;
            }
            if ((i & 4) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 8) != 0) {
                bool = taskDescription.AEQbTJ;
            }
            return taskDescription.EZpvd(z, z2, str, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(boolean z, boolean z2, java.lang.String str, java.lang.Boolean bool) {
            return new TaskDescription(z, z2, str, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.KWHzl == taskDescription.KWHzl && this.OLrzqt == taskDescription.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
            java.lang.String str = this.EZpvd;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IMRestriction(isRestricted=" + this.KWHzl + ", isCache=" + this.OLrzqt + ", userId=" + this.EZpvd + ", isLogin=" + this.AEQbTJ + ")";
        }

        public TaskDescription(boolean z, boolean z2, java.lang.String str, java.lang.Boolean bool) {
            this.KWHzl = z;
            this.OLrzqt = z2;
            this.EZpvd = str;
            this.AEQbTJ = bool;
        }
    }
}
