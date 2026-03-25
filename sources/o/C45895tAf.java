package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.immomo.mls.fun.lt.SILoading;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import com.okinc.planet.biz_onboarding.FollowTopOrbitersViewModel$load$1;
import com.okinc.planet.biz_onboarding.FollowTopOrbitersViewModel$onFollowClick$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45895tAf extends ViewModel {
    public final MutableStateFlow<StateListAnimator> AEQbTJ;
    public final StateFlow<java.util.Set<java.lang.String>> AYXKKw;
    public final C47660tuM AhwBna;
    public final MutableStateFlow<java.util.Set<java.lang.String>> EZpvd;
    public final MutableSharedFlow<Activity> KWHzl;
    public final SharedFlow<Activity> OLrzqt;
    public final MutableStateFlow<java.lang.Boolean> copydefault;
    public final StateFlow<StateListAnimator> djBIcL;
    public final C45912tAw gEmmrt;
    public final StateFlow<java.lang.Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45895tAf() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.Set<java.lang.String>> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tuM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tuM:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:20) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.RVsVBY():o.tuM A[MD:():o.tuM (m), WRAPPED] (LINE:20)) : (r1v0 o.tuM))
  (wrap:o.tAw:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tAw:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:21) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DcqEDu():o.tAw A[MD:():o.tAw (m), WRAPPED] (LINE:21)) : (r2v0 o.tAw))
 A[MD:(o.tuM, o.tAw):void (m)] (LINE:19) call: o.tAf.<init>(o.tuM, o.tAw):void type: THIS */
    public /* synthetic */ C45895tAf(C47660tuM c47660tuM, C45912tAw c45912tAw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.RVsVBY() : c47660tuM, (i & 2) != 0 ? tPF.copydefault.DcqEDu() : c45912tAw);
    }

    public C45895tAf(@NotNull C47660tuM c47660tuM, @NotNull C45912tAw c45912tAw) {
        Intrinsics.checkNotNullParameter(c47660tuM, "");
        Intrinsics.checkNotNullParameter(c45912tAw, "");
        this.AhwBna = c47660tuM;
        this.gEmmrt = c45912tAw;
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.C0954StateListAnimator.KWHzl);
        this.AEQbTJ = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.util.Set<java.lang.String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yEE.copydefault());
        this.EZpvd = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.copydefault = MutableStateFlow3;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: o.tAf$StateListAnimator */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.tAf$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0954StateListAnimator implements StateListAnimator {
            public static final C0954StateListAnimator KWHzl = new C0954StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0954StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2073478859;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return SILoading.LUA_CLASS_NAME;
            }

            private C0954StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.tAf$StateListAnimator$Application */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application implements StateListAnimator {
            public final java.util.List<TopOrbiter> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tAf$StateListAnimator$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = application.AEQbTJ;
                }
                return application.copydefault(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<TopOrbiter> AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull java.util.List<TopOrbiter> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Content(items=" + this.AEQbTJ + ")";
            }

            public Application(@NotNull java.util.List<TopOrbiter> list) {
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }

        /* JADX INFO: renamed from: o.tAf$StateListAnimator$ActionBar */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar copydefault = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 290770775;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error";
            }

            private ActionBar() {
            }
        }
    }

    /* JADX INFO: renamed from: o.tAf$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {

        /* JADX INFO: renamed from: o.tAf$Activity$Activity, reason: collision with other inner class name */
        public static final class C0953Activity implements Activity {
            public static final C0953Activity KWHzl = new C0953Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0953Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -795926896;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Close";
            }

            private C0953Activity() {
            }
        }

        /* JADX INFO: renamed from: o.tAf$Activity$ActionBar */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class ActionBar implements Activity {
            public static final ActionBar AEQbTJ = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1153209430;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FollowSuccess";
            }

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.tAf$Activity$TaskDescription */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription implements Activity {
            public static final TaskDescription KWHzl = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 542169014;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FollowFailed";
            }

            private TaskDescription() {
            }
        }
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FollowTopOrbitersViewModel$load$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        java.util.Set<java.lang.String> value;
        java.util.Set<java.lang.String> set;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        MutableStateFlow<java.util.Set<java.lang.String>> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            set = value;
        } while (!mutableStateFlow.compareAndSet(value, set.contains(str) ? yEJ.EZpvd((java.util.Set<? extends java.lang.String>) ((java.util.Set<? extends java.lang.Object>) set), str) : yEJ.OLrzqt(set, str)));
    }

    public final void AhwBna() {
        this.KWHzl.tryEmit(Activity.C0953Activity.KWHzl);
    }

    public final void AYXKKw() {
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd.getValue());
        if (listAxsJAYsNCnLh.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FollowTopOrbitersViewModel$onFollowClick$1(this, listAxsJAYsNCnLh, null), 3, null);
    }
}
