package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.planet.biz_plugin.future.FuturePositionViewModel$fetchAndUpdateChatData$1;
import com.okinc.planet.biz_plugin.future.FuturePositionViewModel$loadFuturePositions$1;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tCh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45951tCh extends ViewModel {
    public final MutableStateFlow<TaskDescription> AEQbTJ;
    public final MutableStateFlow<StateListAnimator> EZpvd;
    public final StateFlow<TaskDescription> KWHzl;
    public final tBW OLrzqt;
    public final tBZ copydefault;
    public final StateFlow<StateListAnimator> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45951tCh() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tBW:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBW:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:20) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DGUQLI():o.tBW A[MD:():o.tBW (m), WRAPPED] (LINE:20)) : (r1v0 o.tBW))
  (wrap:o.tBZ:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBZ:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:21) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DBxZfM():o.tBZ A[MD:():o.tBZ (m), WRAPPED] (LINE:21)) : (r2v0 o.tBZ))
 A[MD:(o.tBW, o.tBZ):void (m)] (LINE:19) call: o.tCh.<init>(o.tBW, o.tBZ):void type: THIS */
    public /* synthetic */ C45951tCh(tBW tbw, tBZ tbz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.DGUQLI() : tbw, (i & 2) != 0 ? tPF.copydefault.DBxZfM() : tbz);
    }

    public C45951tCh(@NotNull tBW tbw, @NotNull tBZ tbz) {
        Intrinsics.checkNotNullParameter(tbw, "");
        Intrinsics.checkNotNullParameter(tbz, "");
        this.OLrzqt = tbw;
        this.copydefault = tbz;
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(new StateListAnimator(false, null, null, null, null, null, false, 127, null));
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<TaskDescription> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new TaskDescription(null, null, false, 7, 0 == true ? 1 : 0));
        this.AEQbTJ = MutableStateFlow2;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow2);
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tCh$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final boolean EZpvd;
        public final java.util.List<FuturePositionBean> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.List<FuturePositionBean> copydefault;
        public final java.lang.String gEmmrt;
        public final FuturePositionBean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(false, null, null, null, null, null, false, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.tCh$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, java.util.List list, java.util.List list2, FuturePositionBean futurePositionBean, java.lang.String str, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                list = stateListAnimator.copydefault;
            }
            java.util.List list3 = list;
            if ((i & 4) != 0) {
                list2 = stateListAnimator.KWHzl;
            }
            java.util.List list4 = list2;
            if ((i & 8) != 0) {
                futurePositionBean = stateListAnimator.valueOf;
            }
            FuturePositionBean futurePositionBean2 = futurePositionBean;
            if ((i & 16) != 0) {
                str = stateListAnimator.gEmmrt;
            }
            java.lang.String str3 = str;
            if ((i & 32) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            java.lang.String str4 = str2;
            if ((i & 64) != 0) {
                z2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(z, list3, list4, futurePositionBean2, str3, str4, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FuturePositionBean AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FuturePositionBean> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FuturePositionBean> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(boolean z, @NotNull java.util.List<FuturePositionBean> list, @NotNull java.util.List<FuturePositionBean> list2, FuturePositionBean futurePositionBean, java.lang.String str, java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new StateListAnimator(z, list, list2, futurePositionBean, str, str2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.valueOf, stateListAnimator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) stateListAnimator.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            FuturePositionBean futurePositionBean = this.valueOf;
            int iHashCode4 = futurePositionBean == null ? 0 : futurePositionBean.hashCode();
            java.lang.String str = this.gEmmrt;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(isLoading=" + this.EZpvd + ", allItems=" + this.copydefault + ", displayItems=" + this.KWHzl + ", selected=" + this.valueOf + ", selectedInstName=" + this.gEmmrt + ", errorMessage=" + this.OLrzqt + ", hasError=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.util.List<FuturePositionBean> list, @NotNull java.util.List<FuturePositionBean> list2, FuturePositionBean futurePositionBean, java.lang.String str, java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.EZpvd = z;
            this.copydefault = list;
            this.KWHzl = list2;
            this.valueOf = futurePositionBean;
            this.gEmmrt = str;
            this.OLrzqt = str2;
            this.AEQbTJ = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r8v0 java.util.List))
  (wrap:java.util.List:0x0019: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r9v0 java.util.List))
  (wrap:com.okinc.planet.biz_plugin.future.data.FuturePositionBean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_plugin.future.data.FuturePositionBean) : (r10v0 com.okinc.planet.biz_plugin.future.data.FuturePositionBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(boolean, java.util.List<com.okinc.planet.biz_plugin.future.data.FuturePositionBean>, java.util.List<com.okinc.planet.biz_plugin.future.data.FuturePositionBean>, com.okinc.planet.biz_plugin.future.data.FuturePositionBean, java.lang.String, java.lang.String, boolean):void (m)] (LINE:24) call: o.tCh.StateListAnimator.<init>(boolean, java.util.List, java.util.List, com.okinc.planet.biz_plugin.future.data.FuturePositionBean, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, java.util.List list, java.util.List list2, FuturePositionBean futurePositionBean, java.lang.String str, java.lang.String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? null : futurePositionBean, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z2);
        }
    }

    /* JADX INFO: renamed from: o.tCh$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final java.util.List<FuturePositionBean> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCh$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                list = taskDescription.copydefault;
            }
            if ((i & 4) != 0) {
                z = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(str, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<FuturePositionBean> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(str, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FuturePositionBean> copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SearchUiState(searchQuery=" + this.EZpvd + ", filteredItems=" + this.copydefault + ", isSearching=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.util.List<FuturePositionBean> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = str;
            this.copydefault = list;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.List<com.okinc.planet.biz_plugin.future.data.FuturePositionBean>, boolean):void (m)] (LINE:34) call: o.tCh.TaskDescription.<init>(java.lang.String, java.util.List, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z);
        }
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturePositionViewModel$loadFuturePositions$1(this, null), 3, null);
    }

    public final void AhwBna() {
        AEQbTJ();
    }

    public final void EZpvd() {
        java.lang.String strCopydefault = this.EZpvd.getValue().copydefault();
        java.util.List<FuturePositionBean> listEZpvd = this.EZpvd.getValue().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            FuturePositionBean futurePositionBean = (FuturePositionBean) it.next();
            if (strCopydefault != null && Intrinsics.EZpvd((java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getInstName(), (java.lang.Object) strCopydefault)) {
                z = true;
            }
            arrayList.add(FuturePositionBean.copy$default(futurePositionBean, null, z, null, null, null, false, 61, null));
        }
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new TaskDescription("", arrayList, false))) {
        }
    }

    public final void KWHzl(@NotNull FuturePositionBean futurePositionBean) {
        StateListAnimator value;
        StateListAnimator stateListAnimator;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        TaskDescription value2;
        TaskDescription taskDescription;
        java.util.ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        java.lang.String instName = futurePositionBean.getTradePositionPlanetBean().getInstName();
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            stateListAnimator = value;
            java.util.List<FuturePositionBean> listEZpvd = stateListAnimator.EZpvd();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturePositionBean.copy$default((FuturePositionBean) it.next(), null, false, null, null, null, false, 29, null));
            }
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (Intrinsics.EZpvd((java.lang.Object) ((FuturePositionBean) obj).getTradePositionPlanetBean().getInstName(), (java.lang.Object) instName)) {
                    arrayList2.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(stateListAnimator, false, arrayList, arrayList2, null, instName, null, false, 97, null)));
        MutableStateFlow<TaskDescription> mutableStateFlow2 = this.AEQbTJ;
        do {
            value2 = mutableStateFlow2.getValue();
            taskDescription = value2;
            java.util.List<FuturePositionBean> listCopydefault = taskDescription.copydefault();
            arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            for (FuturePositionBean futurePositionBean2 : listCopydefault) {
                arrayList3.add(FuturePositionBean.copy$default(futurePositionBean2, null, Intrinsics.EZpvd((java.lang.Object) futurePositionBean2.getTradePositionPlanetBean().getInstName(), (java.lang.Object) instName), null, null, null, false, 61, null));
            }
        } while (!mutableStateFlow2.compareAndSet(value2, TaskDescription.copy$default(taskDescription, null, arrayList3, false, 5, null)));
    }

    public static final Unit EZpvd(FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void selectWithChatData$default(C45951tCh c45951tCh, FuturePositionBean futurePositionBean, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.tCj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45951tCh.EZpvd((FuturePositionBean) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.tCk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45951tCh.copydefault((java.lang.String) obj2);
                }
            };
        }
        c45951tCh.KWHzl(futurePositionBean, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull FuturePositionBean futurePositionBean, @NotNull Function1<? super FuturePositionBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        java.util.List<FuturePositionBean> listEZpvd = this.EZpvd.getValue().EZpvd();
        if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                if (((FuturePositionBean) it.next()).isLoadingChatData()) {
                    return;
                }
            }
        }
        if (!futurePositionBean.getKlineList().isEmpty()) {
            copydefault(futurePositionBean, false);
            function1.invoke(futurePositionBean);
        } else {
            if (futurePositionBean.isLoadingChatData()) {
                return;
            }
            copydefault(futurePositionBean, true);
            OLrzqt(futurePositionBean, function1, function12);
        }
    }

    public static final FuturePositionBean copydefault(boolean z, FuturePositionBean futurePositionBean) {
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        return FuturePositionBean.copy$default(futurePositionBean, null, true, null, null, null, z, 29, null);
    }

    public final void OLrzqt(FuturePositionBean futurePositionBean, Function1<? super FuturePositionBean, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturePositionViewModel$fetchAndUpdateChatData$1(this, futurePositionBean, function1, function12, null), 3, null);
    }

    public final void KWHzl() {
        StateListAnimator value;
        StateListAnimator stateListAnimator;
        java.util.ArrayList arrayList;
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            stateListAnimator = value;
            java.util.List<FuturePositionBean> listEZpvd = stateListAnimator.EZpvd();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturePositionBean.copy$default((FuturePositionBean) it.next(), null, false, null, null, null, false, 29, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(stateListAnimator, false, arrayList, arrayList, null, null, null, false, 97, null)));
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        TaskDescription value;
        java.util.ArrayList arrayList;
        TaskDescription value2;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, TaskDescription.copy$default(value, str, null, true, 2, null)));
        java.lang.String strCopydefault = this.EZpvd.getValue().copydefault();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            java.util.List<FuturePositionBean> listEZpvd = this.EZpvd.getValue().EZpvd();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (FuturePositionBean futurePositionBean : listEZpvd) {
                arrayList.add(FuturePositionBean.copy$default(futurePositionBean, null, strCopydefault != null && Intrinsics.EZpvd((java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getInstName(), (java.lang.Object) strCopydefault), null, null, null, false, 61, null));
            }
        } else {
            java.util.List<FuturePositionBean> listEZpvd2 = this.EZpvd.getValue().EZpvd();
            java.util.ArrayList<FuturePositionBean> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd2) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((FuturePositionBean) obj).getTradePositionPlanetBean().getInstName(), (java.lang.CharSequence) str, true)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (FuturePositionBean futurePositionBean2 : arrayList2) {
                arrayList.add(FuturePositionBean.copy$default(futurePositionBean2, null, strCopydefault != null && Intrinsics.EZpvd((java.lang.Object) futurePositionBean2.getTradePositionPlanetBean().getInstName(), (java.lang.Object) strCopydefault), null, null, null, false, 61, null));
            }
        }
        MutableStateFlow<TaskDescription> mutableStateFlow2 = this.AEQbTJ;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, TaskDescription.copy$default(value2, null, arrayList, false, 1, null)));
    }

    private final java.util.List<FuturePositionBean> AEQbTJ(java.util.List<FuturePositionBean> list, java.lang.String str, Function1<? super FuturePositionBean, FuturePositionBean> function1) {
        FuturePositionBean futurePositionBeanCopy$default;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (FuturePositionBean futurePositionBean : list) {
            if (Intrinsics.EZpvd((java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getPosId(), (java.lang.Object) str)) {
                futurePositionBeanCopy$default = function1.invoke(futurePositionBean);
            } else {
                futurePositionBeanCopy$default = FuturePositionBean.copy$default(futurePositionBean, null, false, null, null, null, false, 29, null);
            }
            arrayList.add(futurePositionBeanCopy$default);
        }
        return arrayList;
    }

    private final java.util.List<FuturePositionBean> copydefault(java.util.List<FuturePositionBean> list, java.lang.String str) {
        if (str == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd((java.lang.Object) ((FuturePositionBean) obj).getTradePositionPlanetBean().getInstName(), (java.lang.Object) str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void copydefault(FuturePositionBean futurePositionBean, final boolean z) {
        StateListAnimator value;
        StateListAnimator stateListAnimator;
        java.util.List<FuturePositionBean> listAEQbTJ;
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            stateListAnimator = value;
            listAEQbTJ = AEQbTJ(stateListAnimator.EZpvd(), futurePositionBean.getTradePositionPlanetBean().getPosId(), new Function1() { // from class: o.tCi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45951tCh.copydefault(z, (FuturePositionBean) obj);
                }
            });
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(stateListAnimator, false, listAEQbTJ, copydefault(listAEQbTJ, stateListAnimator.copydefault()), FuturePositionBean.copy$default(futurePositionBean, null, true, null, null, null, z, 29, null), null, null, false, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, null)));
    }

    public final void copydefault(FuturePositionBean futurePositionBean) {
        StateListAnimator value;
        StateListAnimator stateListAnimator;
        java.util.ArrayList arrayList;
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            stateListAnimator = value;
            java.util.List<FuturePositionBean> listEZpvd = stateListAnimator.EZpvd();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (FuturePositionBean futurePositionBean2 : listEZpvd) {
                if (Intrinsics.EZpvd((java.lang.Object) futurePositionBean2.getTradePositionPlanetBean().getPosId(), (java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getPosId())) {
                    futurePositionBean2 = futurePositionBean;
                }
                arrayList.add(futurePositionBean2);
            }
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(stateListAnimator, false, arrayList, copydefault(arrayList, stateListAnimator.copydefault()), futurePositionBean, null, null, false, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        StateListAnimator value;
        StateListAnimator stateListAnimator;
        java.util.ArrayList arrayList;
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            stateListAnimator = value;
            java.util.List<FuturePositionBean> listEZpvd = stateListAnimator.EZpvd();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (FuturePositionBean futurePositionBeanCopy$default : listEZpvd) {
                if (Intrinsics.EZpvd((java.lang.Object) futurePositionBeanCopy$default.getTradePositionPlanetBean().getPosId(), (java.lang.Object) str)) {
                    futurePositionBeanCopy$default = FuturePositionBean.copy$default(futurePositionBeanCopy$default, null, false, null, null, null, false, 31, null);
                }
                arrayList.add(futurePositionBeanCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(stateListAnimator, false, arrayList, copydefault(arrayList, stateListAnimator.copydefault()), null, null, null, false, 121, null)));
    }
}
