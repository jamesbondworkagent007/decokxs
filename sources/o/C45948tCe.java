package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.planet.biz_plugin.future.FutureHistoryViewModel$fetchAndUpdateChatData$1;
import com.okinc.planet.biz_plugin.future.FutureHistoryViewModel$loadFuturePositions$1;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
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

/* JADX INFO: renamed from: o.tCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45948tCe extends ViewModel {
    public final MutableStateFlow<Activity> AEQbTJ;
    public final tBZ EZpvd;
    public final MutableStateFlow<Application> KWHzl;
    public final StateFlow<Activity> OLrzqt;
    public final tBU copydefault;
    public final StateFlow<Application> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45948tCe() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tBU:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBU:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:19) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.heceqZ():o.tBU A[MD:():o.tBU (m), WRAPPED] (LINE:19)) : (r1v0 o.tBU))
  (wrap:o.tBZ:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBZ:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:20) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DBxZfM():o.tBZ A[MD:():o.tBZ (m), WRAPPED] (LINE:20)) : (r2v0 o.tBZ))
 A[MD:(o.tBU, o.tBZ):void (m)] (LINE:18) call: o.tCe.<init>(o.tBU, o.tBZ):void type: THIS */
    public /* synthetic */ C45948tCe(tBU tbu, tBZ tbz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.heceqZ() : tbu, (i & 2) != 0 ? tPF.copydefault.DBxZfM() : tbz);
    }

    public C45948tCe(@NotNull tBU tbu, @NotNull tBZ tbz) {
        Intrinsics.checkNotNullParameter(tbu, "");
        Intrinsics.checkNotNullParameter(tbz, "");
        this.copydefault = tbu;
        this.EZpvd = tbz;
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(new Application(false, null, null, null, null, null, false, 127, null));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Activity> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new Activity(null, null, false, 7, 0 == true ? 1 : 0));
        this.AEQbTJ = MutableStateFlow2;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
        EZpvd();
    }

    /* JADX INFO: renamed from: o.tCe$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.util.List<FutureHistoryBean> EZpvd;
        public final java.util.List<FutureHistoryBean> KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final FutureHistoryBean djBIcL;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(false, null, null, null, null, null, false, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.tCe$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, boolean z, java.util.List list, java.util.List list2, FutureHistoryBean futureHistoryBean, java.lang.String str, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                list = application.EZpvd;
            }
            java.util.List list3 = list;
            if ((i & 4) != 0) {
                list2 = application.KWHzl;
            }
            java.util.List list4 = list2;
            if ((i & 8) != 0) {
                futureHistoryBean = application.djBIcL;
            }
            FutureHistoryBean futureHistoryBean2 = futureHistoryBean;
            if ((i & 16) != 0) {
                str = application.gEmmrt;
            }
            java.lang.String str3 = str;
            if ((i & 32) != 0) {
                str2 = application.AEQbTJ;
            }
            java.lang.String str4 = str2;
            if ((i & 64) != 0) {
                z2 = application.copydefault;
            }
            return application.AEQbTJ(z, list3, list4, futureHistoryBean2, str3, str4, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FutureHistoryBean AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(boolean z, @NotNull java.util.List<FutureHistoryBean> list, @NotNull java.util.List<FutureHistoryBean> list2, FutureHistoryBean futureHistoryBean, java.lang.String str, java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new Application(z, list, list2, futureHistoryBean, str, str2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FutureHistoryBean> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FutureHistoryBean> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            FutureHistoryBean futureHistoryBean = this.djBIcL;
            int iHashCode4 = futureHistoryBean == null ? 0 : futureHistoryBean.hashCode();
            java.lang.String str = this.gEmmrt;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(isLoading=" + this.OLrzqt + ", allItems=" + this.EZpvd + ", displayItems=" + this.KWHzl + ", selected=" + this.djBIcL + ", selectedInstName=" + this.gEmmrt + ", errorMessage=" + this.AEQbTJ + ", hasError=" + this.copydefault + ")";
        }

        public Application(boolean z, @NotNull java.util.List<FutureHistoryBean> list, @NotNull java.util.List<FutureHistoryBean> list2, FutureHistoryBean futureHistoryBean, java.lang.String str, java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.OLrzqt = z;
            this.EZpvd = list;
            this.KWHzl = list2;
            this.djBIcL = futureHistoryBean;
            this.gEmmrt = str;
            this.AEQbTJ = str2;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r8v0 java.util.List))
  (wrap:java.util.List:0x0019: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r9v0 java.util.List))
  (wrap:com.okinc.planet.biz_plugin.future.data.FutureHistoryBean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_plugin.future.data.FutureHistoryBean) : (r10v0 com.okinc.planet.biz_plugin.future.data.FutureHistoryBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(boolean, java.util.List<com.okinc.planet.biz_plugin.future.data.FutureHistoryBean>, java.util.List<com.okinc.planet.biz_plugin.future.data.FutureHistoryBean>, com.okinc.planet.biz_plugin.future.data.FutureHistoryBean, java.lang.String, java.lang.String, boolean):void (m)] (LINE:23) call: o.tCe.Application.<init>(boolean, java.util.List, java.util.List, com.okinc.planet.biz_plugin.future.data.FutureHistoryBean, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Application(boolean z, java.util.List list, java.util.List list2, FutureHistoryBean futureHistoryBean, java.lang.String str, java.lang.String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? null : futureHistoryBean, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z2);
        }
    }

    /* JADX INFO: renamed from: o.tCe$Activity */
    public static final class Activity {
        public final java.util.List<FutureHistoryBean> AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCe$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                list = activity.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z = activity.EZpvd;
            }
            return activity.OLrzqt(str, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FutureHistoryBean> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<FutureHistoryBean> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(str, list, z);
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SearchUiState(searchQuery=" + this.KWHzl + ", filteredItems=" + this.AEQbTJ + ", isSearching=" + this.EZpvd + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.util.List<FutureHistoryBean> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = str;
            this.AEQbTJ = list;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.List<com.okinc.planet.biz_plugin.future.data.FutureHistoryBean>, boolean):void (m)] (LINE:33) call: o.tCe.Activity.<init>(java.lang.String, java.util.List, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z);
        }
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FutureHistoryViewModel$loadFuturePositions$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        EZpvd();
    }

    public final void AEQbTJ() {
        java.lang.String strKWHzl = this.KWHzl.getValue().KWHzl();
        java.util.List<FutureHistoryBean> listCopydefault = this.KWHzl.getValue().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            FutureHistoryBean futureHistoryBean = (FutureHistoryBean) it.next();
            if (strKWHzl != null && Intrinsics.EZpvd((java.lang.Object) futureHistoryBean.getTradeHisPositionPlanetBean().getInstName(), (java.lang.Object) strKWHzl)) {
                z = true;
            }
            arrayList.add(FutureHistoryBean.copy$default(futureHistoryBean, null, z, null, null, null, false, 61, null));
        }
        MutableStateFlow<Activity> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Activity("", arrayList, false))) {
        }
    }

    public final void copydefault(@NotNull FutureHistoryBean futureHistoryBean) {
        Application value;
        Application application;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        Activity value2;
        Activity activity;
        java.util.ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        java.lang.String instName = futureHistoryBean.getTradeHisPositionPlanetBean().getInstName();
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            application = value;
            java.util.List<FutureHistoryBean> listCopydefault = application.copydefault();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(FutureHistoryBean.copy$default((FutureHistoryBean) it.next(), null, false, null, null, null, false, 29, null));
            }
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (Intrinsics.EZpvd((java.lang.Object) ((FutureHistoryBean) obj).getTradeHisPositionPlanetBean().getInstName(), (java.lang.Object) instName)) {
                    arrayList2.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(application, false, arrayList, arrayList2, null, instName, null, false, 97, null)));
        MutableStateFlow<Activity> mutableStateFlow2 = this.AEQbTJ;
        do {
            value2 = mutableStateFlow2.getValue();
            activity = value2;
            java.util.List<FutureHistoryBean> listAEQbTJ = activity.AEQbTJ();
            arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (FutureHistoryBean futureHistoryBean2 : listAEQbTJ) {
                arrayList3.add(FutureHistoryBean.copy$default(futureHistoryBean2, null, Intrinsics.EZpvd((java.lang.Object) futureHistoryBean2.getTradeHisPositionPlanetBean().getInstName(), (java.lang.Object) instName), null, null, null, false, 61, null));
            }
        } while (!mutableStateFlow2.compareAndSet(value2, Activity.copy$default(activity, null, arrayList3, false, 5, null)));
    }

    public static final Unit AEQbTJ(FutureHistoryBean futureHistoryBean) {
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCe */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void selectWithChatData$default(C45948tCe c45948tCe, FutureHistoryBean futureHistoryBean, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.tCf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45948tCe.AEQbTJ((FutureHistoryBean) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.tCb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45948tCe.KWHzl((java.lang.String) obj2);
                }
            };
        }
        c45948tCe.AEQbTJ(futureHistoryBean, function1, function12);
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull FutureHistoryBean futureHistoryBean, @NotNull Function1<? super FutureHistoryBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        java.util.List<FutureHistoryBean> listCopydefault = this.KWHzl.getValue().copydefault();
        if (!(listCopydefault instanceof java.util.Collection) || !listCopydefault.isEmpty()) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                if (((FutureHistoryBean) it.next()).isLoadingChatData()) {
                    return;
                }
            }
        }
        if (!futureHistoryBean.getKlineList().isEmpty()) {
            EZpvd(futureHistoryBean, false);
            function1.invoke(futureHistoryBean);
        } else {
            if (futureHistoryBean.isLoadingChatData()) {
                return;
            }
            EZpvd(futureHistoryBean, true);
            EZpvd(futureHistoryBean, function1, function12);
        }
    }

    public static final FutureHistoryBean OLrzqt(boolean z, FutureHistoryBean futureHistoryBean) {
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        return FutureHistoryBean.copy$default(futureHistoryBean, null, true, null, null, null, z, 29, null);
    }

    public final void EZpvd(FutureHistoryBean futureHistoryBean, Function1<? super FutureHistoryBean, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FutureHistoryViewModel$fetchAndUpdateChatData$1(this, futureHistoryBean, function1, function12, null), 3, null);
    }

    public final void KWHzl() {
        Application value;
        Application application;
        java.util.ArrayList arrayList;
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            application = value;
            java.util.List<FutureHistoryBean> listCopydefault = application.copydefault();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(FutureHistoryBean.copy$default((FutureHistoryBean) it.next(), null, false, null, null, null, false, 29, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(application, false, arrayList, arrayList, null, null, null, false, 97, null)));
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Activity value;
        java.util.ArrayList arrayList;
        Activity value2;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<Activity> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Activity.copy$default(value, str, null, true, 2, null)));
        java.lang.String strKWHzl = this.KWHzl.getValue().KWHzl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            java.util.List<FutureHistoryBean> listCopydefault = this.KWHzl.getValue().copydefault();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            for (FutureHistoryBean futureHistoryBean : listCopydefault) {
                arrayList.add(FutureHistoryBean.copy$default(futureHistoryBean, null, strKWHzl != null && Intrinsics.EZpvd((java.lang.Object) futureHistoryBean.getTradeHisPositionPlanetBean().getInstName(), (java.lang.Object) strKWHzl), null, null, null, false, 61, null));
            }
        } else {
            java.util.List<FutureHistoryBean> listCopydefault2 = this.KWHzl.getValue().copydefault();
            java.util.ArrayList<FutureHistoryBean> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listCopydefault2) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((FutureHistoryBean) obj).getTradeHisPositionPlanetBean().getInstName(), (java.lang.CharSequence) str, true)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (FutureHistoryBean futureHistoryBean2 : arrayList2) {
                arrayList.add(FutureHistoryBean.copy$default(futureHistoryBean2, null, strKWHzl != null && Intrinsics.EZpvd((java.lang.Object) futureHistoryBean2.getTradeHisPositionPlanetBean().getInstName(), (java.lang.Object) strKWHzl), null, null, null, false, 61, null));
            }
        }
        MutableStateFlow<Activity> mutableStateFlow2 = this.AEQbTJ;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, Activity.copy$default(value2, null, arrayList, false, 1, null)));
    }

    public final java.util.List<FutureHistoryBean> EZpvd(java.util.List<FutureHistoryBean> list, java.lang.String str, Function1<? super FutureHistoryBean, FutureHistoryBean> function1) {
        FutureHistoryBean futureHistoryBeanCopy$default;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (FutureHistoryBean futureHistoryBean : list) {
            if (Intrinsics.EZpvd((java.lang.Object) futureHistoryBean.getTradeHisPositionPlanetBean().getPosId(), (java.lang.Object) str)) {
                futureHistoryBeanCopy$default = function1.invoke(futureHistoryBean);
            } else {
                futureHistoryBeanCopy$default = FutureHistoryBean.copy$default(futureHistoryBean, null, false, null, null, null, false, 29, null);
            }
            arrayList.add(futureHistoryBeanCopy$default);
        }
        return arrayList;
    }

    public final java.util.List<FutureHistoryBean> OLrzqt(java.util.List<FutureHistoryBean> list, java.lang.String str) {
        if (str == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd((java.lang.Object) ((FutureHistoryBean) obj).getTradeHisPositionPlanetBean().getInstName(), (java.lang.Object) str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void EZpvd(FutureHistoryBean futureHistoryBean, final boolean z) {
        Application value;
        Application application;
        java.util.List<FutureHistoryBean> listEZpvd;
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            application = value;
            listEZpvd = EZpvd(application.copydefault(), futureHistoryBean.getTradeHisPositionPlanetBean().getPosId(), new Function1() { // from class: o.tCc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45948tCe.OLrzqt(z, (FutureHistoryBean) obj);
                }
            });
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(application, false, listEZpvd, OLrzqt(listEZpvd, application.KWHzl()), FutureHistoryBean.copy$default(futureHistoryBean, null, true, null, null, null, z, 29, null), null, null, false, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, null)));
    }

    public final void EZpvd(FutureHistoryBean futureHistoryBean) {
        Application value;
        Application application;
        java.util.ArrayList arrayList;
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            application = value;
            java.util.List<FutureHistoryBean> listCopydefault = application.copydefault();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            for (FutureHistoryBean futureHistoryBean2 : listCopydefault) {
                if (Intrinsics.EZpvd((java.lang.Object) futureHistoryBean2.getTradeHisPositionPlanetBean().getPosId(), (java.lang.Object) futureHistoryBean.getTradeHisPositionPlanetBean().getPosId())) {
                    futureHistoryBean2 = futureHistoryBean;
                }
                arrayList.add(futureHistoryBean2);
            }
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(application, false, arrayList, OLrzqt(arrayList, application.KWHzl()), futureHistoryBean, null, null, false, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, null)));
    }

    public final void AEQbTJ(java.lang.String str) {
        Application value;
        Application application;
        java.util.ArrayList arrayList;
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            application = value;
            java.util.List<FutureHistoryBean> listCopydefault = application.copydefault();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            for (FutureHistoryBean futureHistoryBeanCopy$default : listCopydefault) {
                if (Intrinsics.EZpvd((java.lang.Object) futureHistoryBeanCopy$default.getTradeHisPositionPlanetBean().getPosId(), (java.lang.Object) str)) {
                    futureHistoryBeanCopy$default = FutureHistoryBean.copy$default(futureHistoryBeanCopy$default, null, false, null, null, null, false, 31, null);
                }
                arrayList.add(futureHistoryBeanCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(application, false, arrayList, OLrzqt(arrayList, application.KWHzl()), null, null, null, false, 121, null)));
    }
}
