package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.base.thread.TPM;
import com.okinc.feature.public_beta_impl.viewmodel.LandingPageViewModel$onCloseClicked$1;
import com.okinc.feature.public_beta_impl.viewmodel.LandingPageViewModel$processDeeplink$1;
import com.okinc.feature.public_beta_impl.viewmodel.LandingPageViewModel$queryFeatureInfo$2$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C34765nid;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34783niv extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nix
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34783niv.AYXKKw();
        }
    });
    public final Flow<TaskDescription> AhwBna;
    public final MutableStateFlow<Activity> EZpvd;
    public final AtomicReference<C2368AJb> OLrzqt;
    public final kotlinx.coroutines.channels.Channel<TaskDescription> copydefault;
    public final StateFlow<Activity> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<TaskDescription> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> copydefault() {
        return this.gEmmrt;
    }

    public C34783niv() {
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(new Activity(null, false, null, null, false, 31, null));
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<TaskDescription> channelChannel$default = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.copydefault = channelChannel$default;
        this.AhwBna = FlowKt.receiveAsFlow(channelChannel$default);
        this.OLrzqt = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: o.niv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.niv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2383AJq AYXKKw() {
        return new C2383AJq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2383AJq valueOf() {
        return (C2383AJq) this.AEQbTJ.getValue();
    }

    public final void OLrzqt() {
        pUU.KWHzl("ShakeFeedbackIntroViewModel", "Continue clicked for feature: " + this.EZpvd.getValue().copydefault());
        KWHzl(this.EZpvd.getValue().EZpvd());
        MutableStateFlow<Activity> mutableStateFlow = this.EZpvd;
        mutableStateFlow.setValue(Activity.copy$default(mutableStateFlow.getValue(), null, false, null, null, true, 15, null));
    }

    public final void KWHzl(C2349AIi c2349AIi) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LandingPageViewModel$processDeeplink$1(c2349AIi, this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LandingPageViewModel$onCloseClicked$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.niv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void queryFeatureInfo$default(C34783niv c34783niv, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c34783niv.OLrzqt(str, function1);
    }

    public static final void EZpvd(C34783niv c34783niv, java.lang.String str, Function1 function1) throws java.lang.InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new LandingPageViewModel$queryFeatureInfo$2$1(c34783niv, str, function1, null), 1, null);
    }

    /* JADX INFO: renamed from: o.niv$Activity */
    public static final class Activity {
        public static final int KWHzl = C2349AIi.$stable;
        public final boolean AEQbTJ;
        public final C2349AIi EZpvd;
        public final Application OLrzqt;
        public final java.lang.String copydefault;
        public final boolean gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, false, null, null, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, boolean z, C2349AIi c2349AIi, Application application, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                z = activity.gEmmrt;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                c2349AIi = activity.EZpvd;
            }
            C2349AIi c2349AIi2 = c2349AIi;
            if ((i & 8) != 0) {
                application = activity.OLrzqt;
            }
            Application application2 = application;
            if ((i & 16) != 0) {
                z2 = activity.AEQbTJ;
            }
            return activity.AEQbTJ(str, z3, c2349AIi2, application2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, boolean z, C2349AIi c2349AIi, Application application, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, z, c2349AIi, application, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C2349AIi EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && this.gEmmrt == activity.gEmmrt && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.gEmmrt);
            C2349AIi c2349AIi = this.EZpvd;
            int iHashCode3 = c2349AIi == null ? 0 : c2349AIi.hashCode();
            Application application = this.OLrzqt;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (application != null ? application.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(featureCode=" + this.copydefault + ", isLoading=" + this.gEmmrt + ", featureInfo=" + this.EZpvd + ", error=" + this.OLrzqt + ", isFinished=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str, boolean z, C2349AIi c2349AIi, Application application, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.gEmmrt = z;
            this.EZpvd = c2349AIi;
            this.OLrzqt = application;
            this.AEQbTJ = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:o.AIi:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.AIi) : (r6v0 o.AIi))
  (wrap:o.niv$Application:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 o.niv$Application) : (null o.niv$Application))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 boolean) : false)
 A[MD:(java.lang.String, boolean, o.AIi, o.niv$Application, boolean):void (m)] (LINE:170) call: o.niv.Activity.<init>(java.lang.String, boolean, o.AIi, o.niv$Application, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, boolean z, C2349AIi c2349AIi, Application application, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c2349AIi, (i & 8) == 0 ? application : null, (i & 16) == 0 ? z2 : false);
        }
    }

    /* JADX INFO: renamed from: o.niv$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = application.OLrzqt;
            }
            return application.KWHzl(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, z);
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiError(message=" + this.AEQbTJ + ", isRetryable=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:181) call: o.niv.Application.<init>(java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.niv$TaskDescription */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.niv$TaskDescription$Activity */
        public static final class Activity implements TaskDescription {
            public static final Activity EZpvd = new Activity();

            private Activity() {
            }
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Activity value;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<Activity> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Activity.copy$default(value, str, false, null, null, false, 30, null)));
        queryFeatureInfo$default(this, str, null, 2, null);
    }

    public final void OLrzqt(final java.lang.String str, final Function1<? super C2349AIi, Unit> function1) {
        Activity value;
        MutableStateFlow<Activity> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Activity.copy$default(value, null, true, null, null, false, 21, null)));
        TPM.StateListAnimator.KWHzl.AEQbTJ(new C34765nid.ActionBar()).scheduleDirect(new java.lang.Runnable() { // from class: o.niw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() throws java.lang.InterruptedException {
                C34783niv.EZpvd(this.OLrzqt, str, function1);
            }
        });
    }
}
