package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_plugin.spot.SpotHoldingsViewModel$fetchAndUpdateChatData$1;
import com.okinc.planet.biz_plugin.spot.SpotHoldingsViewModel$loadSpotHoldings$1;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
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
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes19.dex */
public final class tDE extends ViewModel {
    public final StateFlow<Activity> AEQbTJ;
    public final MutableStateFlow<TaskDescription> EZpvd;
    public final C45944tCa KWHzl;
    public final tBX OLrzqt;
    public final MutableStateFlow<Activity> copydefault;
    public final StateFlow<TaskDescription> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public tDE() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tBX:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBX:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:19) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.QDqgQU():o.tBX A[MD:():o.tBX (m), WRAPPED] (LINE:19)) : (r1v0 o.tBX))
  (wrap:o.tCa:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tCa:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:20) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.QXDzTk():o.tCa A[MD:():o.tCa (m), WRAPPED] (LINE:20)) : (r2v0 o.tCa))
 A[MD:(o.tBX, o.tCa):void (m)] (LINE:18) call: o.tDE.<init>(o.tBX, o.tCa):void type: THIS */
    public /* synthetic */ tDE(tBX tbx, C45944tCa c45944tCa, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.QDqgQU() : tbx, (i & 2) != 0 ? tPF.copydefault.QXDzTk() : c45944tCa);
    }

    public tDE(@NotNull tBX tbx, @NotNull C45944tCa c45944tCa) {
        Intrinsics.checkNotNullParameter(tbx, "");
        Intrinsics.checkNotNullParameter(c45944tCa, "");
        this.OLrzqt = tbx;
        this.KWHzl = c45944tCa;
        boolean z = false;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(new TaskDescription(false, z, null, null, null, null, null, false, 255, null));
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Activity> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new Activity(null, null, z, 7, 0 == true ? 1 : 0));
        this.copydefault = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
        OLrzqt();
    }

    public static final class TaskDescription {
        public final java.util.List<SpotHoldingBean> AEQbTJ;
        public final boolean EZpvd;
        public final java.util.List<SpotHoldingBean> KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;
        public final java.lang.String djBIcL;
        public final SpotHoldingBean gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(false, false, null, null, null, null, null, false, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.tDE$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, boolean z2, java.util.List list, java.util.List list2, SpotHoldingBean spotHoldingBean, java.lang.String str, java.lang.String str2, boolean z3, int i, java.lang.Object obj) {
            return taskDescription.EZpvd((i & 1) != 0 ? taskDescription.EZpvd : z, (i & 2) != 0 ? taskDescription.valueOf : z2, (i & 4) != 0 ? taskDescription.KWHzl : list, (i & 8) != 0 ? taskDescription.AEQbTJ : list2, (i & 16) != 0 ? taskDescription.gEmmrt : spotHoldingBean, (i & 32) != 0 ? taskDescription.djBIcL : str, (i & 64) != 0 ? taskDescription.OLrzqt : str2, (i & 128) != 0 ? taskDescription.copydefault : z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SpotHoldingBean> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(boolean z, boolean z2, @NotNull java.util.List<SpotHoldingBean> list, @NotNull java.util.List<SpotHoldingBean> list2, SpotHoldingBean spotHoldingBean, java.lang.String str, java.lang.String str2, boolean z3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new TaskDescription(z, z2, list, list2, spotHoldingBean, str, str2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SpotHoldingBean> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SpotHoldingBean copydefault() {
            return this.gEmmrt;
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
            return this.EZpvd == taskDescription.EZpvd && this.valueOf == taskDescription.valueOf && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, taskDescription.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) taskDescription.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
            int iHashCode2 = java.lang.Boolean.hashCode(this.valueOf);
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = this.AEQbTJ.hashCode();
            SpotHoldingBean spotHoldingBean = this.gEmmrt;
            int iHashCode5 = spotHoldingBean == null ? 0 : spotHoldingBean.hashCode();
            java.lang.String str = this.djBIcL;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(isLoading=" + this.EZpvd + ", isLoadingChatData=" + this.valueOf + ", allItems=" + this.KWHzl + ", displayItems=" + this.AEQbTJ + ", selected=" + this.gEmmrt + ", selectedTokenName=" + this.djBIcL + ", errorMessage=" + this.OLrzqt + ", hasError=" + this.copydefault + ")";
        }

        public TaskDescription(boolean z, boolean z2, @NotNull java.util.List<SpotHoldingBean> list, @NotNull java.util.List<SpotHoldingBean> list2, SpotHoldingBean spotHoldingBean, java.lang.String str, java.lang.String str2, boolean z3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.EZpvd = z;
            this.valueOf = z2;
            this.KWHzl = list;
            this.AEQbTJ = list2;
            this.gEmmrt = spotHoldingBean;
            this.djBIcL = str;
            this.OLrzqt = str2;
            this.copydefault = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r14v0 java.util.List))
  (wrap:com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean) : (r15v0 com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : false)
 A[MD:(boolean, boolean, java.util.List<com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean>, java.util.List<com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean>, com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean, java.lang.String, java.lang.String, boolean):void (m)] (LINE:23) call: o.tDE.TaskDescription.<init>(boolean, boolean, java.util.List, java.util.List, com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, boolean z2, java.util.List list, java.util.List list2, SpotHoldingBean spotHoldingBean, java.lang.String str, java.lang.String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? null : spotHoldingBean, (i & 32) != 0 ? null : str, (i & 64) == 0 ? str2 : null, (i & 128) == 0 ? z3 : false);
        }
    }

    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final boolean OLrzqt;
        public final java.util.List<SpotHoldingBean> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tDE$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = activity.copydefault;
            }
            if ((i & 4) != 0) {
                z = activity.OLrzqt;
            }
            return activity.EZpvd(str, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SpotHoldingBean> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<SpotHoldingBean> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(str, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SearchUiState(searchQuery=" + this.AEQbTJ + ", filteredItems=" + this.copydefault + ", isSearching=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.util.List<SpotHoldingBean> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = str;
            this.copydefault = list;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.List<com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean>, boolean):void (m)] (LINE:34) call: o.tDE.Activity.<init>(java.lang.String, java.util.List, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z);
        }
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotHoldingsViewModel$loadSpotHoldings$1(this, null), 3, null);
    }

    public static final Unit AEQbTJ(SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tDE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void selectWithChatData$default(tDE tde, SpotHoldingBean spotHoldingBean, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.tDI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return tDE.AEQbTJ((SpotHoldingBean) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.tDL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return tDE.EZpvd((java.lang.String) obj2);
                }
            };
        }
        tde.EZpvd(spotHoldingBean, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull SpotHoldingBean spotHoldingBean, @NotNull Function1<? super SpotHoldingBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        java.util.List<SpotHoldingBean> listAEQbTJ = this.EZpvd.getValue().AEQbTJ();
        if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((SpotHoldingBean) it.next()).isLoadingChatData()) {
                    return;
                }
            }
        }
        if (!spotHoldingBean.getKlineList().isEmpty()) {
            KWHzl(spotHoldingBean, false);
            function1.invoke(spotHoldingBean);
        } else {
            if (spotHoldingBean.isLoadingChatData()) {
                return;
            }
            KWHzl(spotHoldingBean, true);
            copydefault(spotHoldingBean, function1, function12);
        }
    }

    public final void AhwBna() {
        OLrzqt();
    }

    public static final SpotHoldingBean KWHzl(boolean z, SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        return SpotHoldingBean.copy$default(spotHoldingBean, null, true, null, null, z, 13, null);
    }

    public final void copydefault(SpotHoldingBean spotHoldingBean, Function1<? super SpotHoldingBean, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotHoldingsViewModel$fetchAndUpdateChatData$1(this, spotHoldingBean, function1, function12, null), 3, null);
    }

    public final void EZpvd() {
        java.lang.String strKWHzl = this.EZpvd.getValue().KWHzl();
        java.util.List<SpotHoldingBean> listAEQbTJ = this.EZpvd.getValue().AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            SpotHoldingBean spotHoldingBean = (SpotHoldingBean) it.next();
            if (strKWHzl != null && Intrinsics.EZpvd((java.lang.Object) spotHoldingBean.getTradeAssetPlanetBean().getTokenName(), (java.lang.Object) strKWHzl)) {
                z = true;
            }
            arrayList.add(SpotHoldingBean.copy$default(spotHoldingBean, null, z, null, null, false, 29, null));
        }
        MutableStateFlow<Activity> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Activity("", arrayList, false))) {
        }
    }

    public final void copydefault(@NotNull SpotHoldingBean spotHoldingBean) {
        TaskDescription value;
        TaskDescription taskDescription;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        Activity value2;
        Activity activity;
        java.util.ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        java.lang.String tokenName = spotHoldingBean.getTradeAssetPlanetBean().getTokenName();
        MutableStateFlow<TaskDescription> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            taskDescription = value;
            java.util.List<SpotHoldingBean> listAEQbTJ = taskDescription.AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(SpotHoldingBean.copy$default((SpotHoldingBean) it.next(), null, false, null, null, false, 13, null));
            }
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (Intrinsics.EZpvd((java.lang.Object) ((SpotHoldingBean) obj).getTradeAssetPlanetBean().getTokenName(), (java.lang.Object) tokenName)) {
                    arrayList2.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, TaskDescription.copy$default(taskDescription, false, false, arrayList, arrayList2, null, tokenName, null, false, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, null)));
        MutableStateFlow<Activity> mutableStateFlow2 = this.copydefault;
        do {
            value2 = mutableStateFlow2.getValue();
            activity = value2;
            java.util.List<SpotHoldingBean> listEZpvd = activity.EZpvd();
            arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (SpotHoldingBean spotHoldingBean2 : listEZpvd) {
                arrayList3.add(SpotHoldingBean.copy$default(spotHoldingBean2, null, Intrinsics.EZpvd((java.lang.Object) spotHoldingBean2.getTradeAssetPlanetBean().getTokenName(), (java.lang.Object) tokenName), null, null, false, 29, null));
            }
        } while (!mutableStateFlow2.compareAndSet(value2, Activity.copy$default(activity, null, arrayList3, false, 5, null)));
    }

    private final java.util.List<SpotHoldingBean> AEQbTJ(java.util.List<SpotHoldingBean> list, java.lang.String str, Function1<? super SpotHoldingBean, SpotHoldingBean> function1) {
        SpotHoldingBean spotHoldingBeanCopy$default;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (SpotHoldingBean spotHoldingBean : list) {
            if (Intrinsics.EZpvd((java.lang.Object) spotHoldingBean.getTradeAssetPlanetBean().getInstId(), (java.lang.Object) str)) {
                spotHoldingBeanCopy$default = function1.invoke(spotHoldingBean);
            } else {
                spotHoldingBeanCopy$default = SpotHoldingBean.copy$default(spotHoldingBean, null, false, null, null, false, 13, null);
            }
            arrayList.add(spotHoldingBeanCopy$default);
        }
        return arrayList;
    }

    private final java.util.List<SpotHoldingBean> EZpvd(java.util.List<SpotHoldingBean> list, java.lang.String str) {
        if (str == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd((java.lang.Object) ((SpotHoldingBean) obj).getTradeAssetPlanetBean().getTokenName(), (java.lang.Object) str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void KWHzl(SpotHoldingBean spotHoldingBean, final boolean z) {
        TaskDescription value;
        TaskDescription taskDescription;
        java.util.List<SpotHoldingBean> listAEQbTJ;
        MutableStateFlow<TaskDescription> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            taskDescription = value;
            listAEQbTJ = AEQbTJ(taskDescription.AEQbTJ(), spotHoldingBean.getTradeAssetPlanetBean().getInstId(), new Function1() { // from class: o.tDD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tDE.KWHzl(z, (SpotHoldingBean) obj);
                }
            });
        } while (!mutableStateFlow.compareAndSet(value, TaskDescription.copy$default(taskDescription, false, false, listAEQbTJ, EZpvd(listAEQbTJ, taskDescription.KWHzl()), SpotHoldingBean.copy$default(spotHoldingBean, null, true, null, null, z, 13, null), null, null, false, 227, null)));
    }

    public final void EZpvd(SpotHoldingBean spotHoldingBean) {
        TaskDescription value;
        TaskDescription taskDescription;
        java.util.ArrayList arrayList;
        MutableStateFlow<TaskDescription> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            taskDescription = value;
            java.util.List<SpotHoldingBean> listAEQbTJ = taskDescription.AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (SpotHoldingBean spotHoldingBean2 : listAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) spotHoldingBean2.getTradeAssetPlanetBean().getInstId(), (java.lang.Object) spotHoldingBean.getTradeAssetPlanetBean().getInstId())) {
                    spotHoldingBean2 = spotHoldingBean;
                }
                arrayList.add(spotHoldingBean2);
            }
        } while (!mutableStateFlow.compareAndSet(value, TaskDescription.copy$default(taskDescription, false, false, arrayList, EZpvd(arrayList, taskDescription.KWHzl()), spotHoldingBean, null, null, false, 227, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        TaskDescription value;
        TaskDescription taskDescription;
        java.util.ArrayList arrayList;
        MutableStateFlow<TaskDescription> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            taskDescription = value;
            java.util.List<SpotHoldingBean> listAEQbTJ = taskDescription.AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (SpotHoldingBean spotHoldingBeanCopy$default : listAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) spotHoldingBeanCopy$default.getTradeAssetPlanetBean().getInstId(), (java.lang.Object) str)) {
                    spotHoldingBeanCopy$default = SpotHoldingBean.copy$default(spotHoldingBeanCopy$default, null, false, null, null, false, 15, null);
                }
                arrayList.add(spotHoldingBeanCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, TaskDescription.copy$default(taskDescription, false, false, arrayList, EZpvd(arrayList, taskDescription.KWHzl()), null, null, null, false, 243, null)));
    }

    public final void copydefault() {
        TaskDescription value;
        TaskDescription taskDescription;
        java.util.ArrayList arrayList;
        MutableStateFlow<TaskDescription> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            taskDescription = value;
            java.util.List<SpotHoldingBean> listAEQbTJ = taskDescription.AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(SpotHoldingBean.copy$default((SpotHoldingBean) it.next(), null, false, null, null, false, 13, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, TaskDescription.copy$default(taskDescription, false, false, arrayList, arrayList, null, null, null, false, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, null)));
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Activity value;
        java.util.ArrayList arrayList;
        Activity value2;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<Activity> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Activity.copy$default(value, str, null, true, 2, null)));
        java.lang.String strKWHzl = this.EZpvd.getValue().KWHzl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            java.util.List<SpotHoldingBean> listAEQbTJ = this.EZpvd.getValue().AEQbTJ();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (SpotHoldingBean spotHoldingBean : listAEQbTJ) {
                arrayList.add(SpotHoldingBean.copy$default(spotHoldingBean, null, strKWHzl != null && Intrinsics.EZpvd((java.lang.Object) spotHoldingBean.getTradeAssetPlanetBean().getTokenName(), (java.lang.Object) strKWHzl), null, null, false, 29, null));
            }
        } else {
            java.util.List<SpotHoldingBean> listAEQbTJ2 = this.EZpvd.getValue().AEQbTJ();
            java.util.ArrayList<SpotHoldingBean> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ2) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((SpotHoldingBean) obj).getTradeAssetPlanetBean().getTokenName(), (java.lang.CharSequence) str, true)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (SpotHoldingBean spotHoldingBean2 : arrayList2) {
                arrayList.add(SpotHoldingBean.copy$default(spotHoldingBean2, null, strKWHzl != null && Intrinsics.EZpvd((java.lang.Object) spotHoldingBean2.getTradeAssetPlanetBean().getTokenName(), (java.lang.Object) strKWHzl), null, null, false, 29, null));
            }
        }
        MutableStateFlow<Activity> mutableStateFlow2 = this.copydefault;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, Activity.copy$default(value2, null, arrayList, false, 1, null)));
    }
}
