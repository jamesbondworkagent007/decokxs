package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_plugin.future.FutureQuicklyViewModel$loadPositions$1;
import com.okinc.planet.biz_plugin.future.FutureQuicklyViewModel$selectWithChatData$3;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45957tCn extends ViewModel {
    public final tBW AEQbTJ;
    public final MutableStateFlow<TaskDescription> EZpvd;
    public final StateFlow<TaskDescription> KWHzl;
    public final tBZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45957tCn() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tBW:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBW:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:17) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DGUQLI():o.tBW A[MD:():o.tBW (m), WRAPPED] (LINE:17)) : (r1v0 o.tBW))
  (wrap:o.tBZ:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBZ:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:18) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DBxZfM():o.tBZ A[MD:():o.tBZ (m), WRAPPED] (LINE:18)) : (r2v0 o.tBZ))
 A[MD:(o.tBW, o.tBZ):void (m)] (LINE:16) call: o.tCn.<init>(o.tBW, o.tBZ):void type: THIS */
    public /* synthetic */ C45957tCn(tBW tbw, tBZ tbz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.DGUQLI() : tbw, (i & 2) != 0 ? tPF.copydefault.DBxZfM() : tbz);
    }

    public C45957tCn(@NotNull tBW tbw, @NotNull tBZ tbz) {
        Intrinsics.checkNotNullParameter(tbw, "");
        Intrinsics.checkNotNullParameter(tbz, "");
        this.AEQbTJ = tbw;
        this.copydefault = tbz;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(new TaskDescription(false, null, null, false, 15, null));
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        KWHzl();
    }

    /* JADX INFO: renamed from: o.tCn$TaskDescription */
    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.List<FuturePositionBean> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(false, null, null, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCn$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, java.util.List list, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = taskDescription.copydefault;
            }
            if ((i & 4) != 0) {
                str = taskDescription.OLrzqt;
            }
            if ((i & 8) != 0) {
                z2 = taskDescription.KWHzl;
            }
            return taskDescription.KWHzl(z, list, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FuturePositionBean> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(boolean z, @NotNull java.util.List<FuturePositionBean> list, java.lang.String str, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(z, list, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
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
            return this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.String str = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(isLoading=" + this.AEQbTJ + ", allItems=" + this.copydefault + ", errorMessage=" + this.OLrzqt + ", hasError=" + this.KWHzl + ")";
        }

        public TaskDescription(boolean z, @NotNull java.util.List<FuturePositionBean> list, java.lang.String str, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = z;
            this.copydefault = list;
            this.OLrzqt = str;
            this.KWHzl = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, java.util.List<com.okinc.planet.biz_plugin.future.data.FuturePositionBean>, java.lang.String, boolean):void (m)] (LINE:22) call: o.tCn.TaskDescription.<init>(boolean, java.util.List, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, java.util.List list, java.lang.String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2);
        }
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FutureQuicklyViewModel$loadPositions$1(this, null), 3, null);
    }

    public static final Unit AEQbTJ(FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void selectWithChatData$default(C45957tCn c45957tCn, FuturePositionBean futurePositionBean, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.tCo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45957tCn.AEQbTJ((FuturePositionBean) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.tCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45957tCn.copydefault((java.lang.String) obj2);
                }
            };
        }
        c45957tCn.EZpvd(futurePositionBean, function1, function12);
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull FuturePositionBean futurePositionBean, @NotNull Function1<? super FuturePositionBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (!futurePositionBean.getKlineList().isEmpty()) {
            function1.invoke(futurePositionBean);
        } else {
            if (futurePositionBean.isLoadingChatData()) {
                return;
            }
            FuturePositionBean.copy$default(futurePositionBean, null, false, null, null, null, true, 31, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FutureQuicklyViewModel$selectWithChatData$3(this, futurePositionBean, function1, function12, null), 3, null);
        }
    }
}
