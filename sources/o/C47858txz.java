package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.immomo.mls.fun.lt.SILoading;
import com.okinc.planet.biz_create_centre.data.ContentsData;
import com.okinc.planet.biz_create_centre.data.GroupsData;
import com.okinc.planet.biz_create_centre.data.LiveStreamsData;
import com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo;
import com.okinc.planet.biz_create_centre.viewmode.CreatorCentreViewModel$loadKeyMetrics$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47858txz extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<GroupsData> AEQbTJ;
    public final StateFlow<GroupsData> AYXKKw;
    public final C47779twZ AhwBna = tPF.copydefault.DGOPHZDGOPHZ();
    public final StateFlow<StateListAnimator> DbNXlk;
    public final MutableStateFlow<ContentsData> KWHzl;
    public final MutableStateFlow<LiveStreamsData> OLrzqt;
    public final MutableStateFlow<kotlin.Pair<java.lang.Long, java.lang.Long>> copydefault;
    public final StateFlow<kotlin.Pair<java.lang.Long, java.lang.Long>> djBIcL;
    public final MutableStateFlow<StateListAnimator> gEmmrt;
    public final StateFlow<ContentsData> valueOf;
    public final StateFlow<LiveStreamsData> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ContentsData> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<kotlin.Pair<java.lang.Long, java.lang.Long>> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<LiveStreamsData> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<GroupsData> copydefault() {
        return this.AYXKKw;
    }

    public C47858txz() {
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.TaskDescription.EZpvd);
        this.gEmmrt = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<ContentsData> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<LiveStreamsData> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.values = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<GroupsData> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow4;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<kotlin.Pair<java.lang.Long, java.lang.Long>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow5;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow5);
        AYXKKw();
    }

    /* JADX INFO: renamed from: o.txz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.txz$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.txz$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription EZpvd = new TaskDescription();

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
                return -1990577369;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return SILoading.LUA_CLASS_NAME;
            }

            private TaskDescription() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.txz$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0967StateListAnimator extends StateListAnimator {
            public final OrbitCreateCentreInfo EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0967StateListAnimator copy$default(C0967StateListAnimator c0967StateListAnimator, OrbitCreateCentreInfo orbitCreateCentreInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    orbitCreateCentreInfo = c0967StateListAnimator.EZpvd;
                }
                return c0967StateListAnimator.EZpvd(orbitCreateCentreInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OrbitCreateCentreInfo AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0967StateListAnimator EZpvd(@NotNull OrbitCreateCentreInfo orbitCreateCentreInfo) {
                Intrinsics.checkNotNullParameter(orbitCreateCentreInfo, "");
                return new C0967StateListAnimator(orbitCreateCentreInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0967StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((C0967StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(data=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0967StateListAnimator(@NotNull OrbitCreateCentreInfo orbitCreateCentreInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(orbitCreateCentreInfo, "");
                this.EZpvd = orbitCreateCentreInfo;
            }
        }

        /* JADX INFO: renamed from: o.txz$StateListAnimator$ActionBar */
        public static final class ActionBar extends StateListAnimator {
            public final int AEQbTJ;
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    str = actionBar.KWHzl;
                }
                if ((i2 & 2) != 0) {
                    i = actionBar.AEQbTJ;
                }
                return actionBar.EZpvd(str, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull java.lang.String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && this.AEQbTJ == actionBar.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(message=" + this.KWHzl + ", code=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.String str, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
                this.AEQbTJ = i;
            }
        }
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreatorCentreViewModel$loadKeyMetrics$1(this, null), 3, null);
    }
}
