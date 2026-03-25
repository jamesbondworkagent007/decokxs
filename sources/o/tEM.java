package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_positions.LatestRecordsViewModel$loadData$2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tEM extends tLY<Unit> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final SavedStateHandle AEQbTJ;
    public final StateFlow<AbstractC46197tLk<TaskDescription>> AhwBna;
    public final MutableStateFlow<AbstractC46197tLk<TaskDescription>> EZpvd;
    public final /* synthetic */ tRM KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final tGA djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<TaskDescription>> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.KWHzl.AEQbTJ();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tGA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tGA:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:19) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.call():o.tGA A[MD:():o.tGA (m), WRAPPED] (LINE:19)) : (r2v0 o.tGA))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tGA):void (m)] (LINE:17) call: o.tEM.<init>(androidx.lifecycle.SavedStateHandle, o.tGA):void type: THIS */
    public /* synthetic */ tEM(SavedStateHandle savedStateHandle, tGA tga, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.call() : tga);
    }

    public tEM(@NotNull SavedStateHandle savedStateHandle, @NotNull tGA tga) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(tga, "");
        this.KWHzl = new tRM(savedStateHandle);
        this.AEQbTJ = savedStateHandle;
        this.djBIcL = tga;
        MutableStateFlow<AbstractC46197tLk<TaskDescription>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(tEM.copydefault(this.KWHzl));
            }
        });
    }

    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean copydefault(tEM tem) {
        java.lang.Boolean bool = (java.lang.Boolean) tem.AEQbTJ.get("isSummary");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strOLrzqt = OLrzqt();
        if (strOLrzqt == null) {
            return;
        }
        C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), new StateListAnimator(CoroutineExceptionHandler.Key, this), null, new LatestRecordsViewModel$loadData$2(this, strOLrzqt, str, str2, z, null), 2, null);
    }

    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ tEM OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(CoroutineExceptionHandler.Key key, tEM tem) {
            super(key);
            this.OLrzqt = tem;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            this.OLrzqt.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(th));
        }
    }

    public static final class TaskDescription {
        public final java.util.List<tEF> AEQbTJ;
        public final boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tEM$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                list = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(boolean z, @NotNull java.util.List<? extends tEF> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<tEF> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
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
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "State(canLoadMore=" + this.EZpvd + ", list=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.tEF> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(boolean z, @NotNull java.util.List<? extends tEF> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = z;
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:84)) : (r2v0 java.util.List))
 A[MD:(boolean, java.util.List<? extends o.tEF>):void (m)] (LINE:82) call: o.tEM.TaskDescription.<init>(boolean, java.util.List):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list);
        }
    }
}
