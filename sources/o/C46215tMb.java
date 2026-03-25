package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$loadTwitterBindingInfo$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$loadTwitterBindingInfo$2;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$loadTwitterBindingInfo$3;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$onAutoSyncToggled$2;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$onAutoSyncToggled$3;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$onAutoSyncToggled$4;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$unbindTwitter$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$unbindTwitter$2;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetXManageViewModel$unbindTwitter$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46215tMb extends tLY<Application> {
    public final MutableStateFlow<AbstractC46197tLk<PlanetTwitterBindingInfo>> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final tQV OLrzqt;
    public final StateFlow<AbstractC46197tLk<PlanetTwitterBindingInfo>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46215tMb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<PlanetTwitterBindingInfo>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:22)) : (r1v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:21) call: o.tMb.<init>(kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C46215tMb(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }

    public C46215tMb(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = tPF.copydefault.UscePu();
        MutableStateFlow<AbstractC46197tLk<PlanetTwitterBindingInfo>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.EZpvd = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        copydefault();
    }

    public final void copydefault() {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.m7441catch(FlowKt.flow(new PlanetXManageViewModel$loadTwitterBindingInfo$1(this, null)), new PlanetXManageViewModel$loadTwitterBindingInfo$2(this, null)), new PlanetXManageViewModel$loadTwitterBindingInfo$3(this, null)), CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), this.KWHzl));
    }

    public final void OLrzqt(final boolean z) {
        PlanetTwitterBindingInfo planetTwitterBindingInfo;
        C32866mlf.onEvent$default("Twitter_Account_Sync_Click", (TrackChannel[]) null, new Function1() { // from class: o.tMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46215tMb.AEQbTJ(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        AbstractC46197tLk<PlanetTwitterBindingInfo> value = this.EZpvd.getValue();
        AbstractC46197tLk.Application application = value instanceof AbstractC46197tLk.Application ? (AbstractC46197tLk.Application) value : null;
        if (application == null || (planetTwitterBindingInfo = (PlanetTwitterBindingInfo) application.copydefault()) == null) {
            return;
        }
        boolean zOLrzqt = planetTwitterBindingInfo.OLrzqt();
        this.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl(PlanetTwitterBindingInfo.copy$default(planetTwitterBindingInfo, null, z, 1, null)));
        EZpvd(Application.C0961Application.copydefault);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.m7441catch(FlowKt.flow(new PlanetXManageViewModel$onAutoSyncToggled$2(this, z, null)), new PlanetXManageViewModel$onAutoSyncToggled$3(this, planetTwitterBindingInfo, zOLrzqt, null)), new PlanetXManageViewModel$onAutoSyncToggled$4(this, z, null)), CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), this.KWHzl));
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C56390yDp.OLrzqt("type", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("Twitter_Account_Unlink_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        EZpvd(Application.StateListAnimator.AEQbTJ);
    }

    public final java.lang.String AEQbTJ() {
        PlanetTwitterBindingInfo planetTwitterBindingInfo;
        java.lang.String strAEQbTJ;
        AbstractC46197tLk<PlanetTwitterBindingInfo> value = this.EZpvd.getValue();
        AbstractC46197tLk.Application application = value instanceof AbstractC46197tLk.Application ? (AbstractC46197tLk.Application) value : null;
        return (application == null || (planetTwitterBindingInfo = (PlanetTwitterBindingInfo) application.copydefault()) == null || (strAEQbTJ = planetTwitterBindingInfo.AEQbTJ()) == null) ? "" : strAEQbTJ;
    }

    public final void EZpvd() {
        this.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(false));
        copydefault();
    }

    public final void AhwBna() {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.m7441catch(FlowKt.flow(new PlanetXManageViewModel$unbindTwitter$1(this, null)), new PlanetXManageViewModel$unbindTwitter$2(this, null)), new PlanetXManageViewModel$unbindTwitter$3(this, null)), CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), this.KWHzl));
    }

    /* JADX INFO: renamed from: o.tMb$Application */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tMb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.tMb$Application$StateListAnimator */
        public static final class StateListAnimator extends Application {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.tMb$Application$LoaderManager */
        public static final class LoaderManager extends Application {
            public static final LoaderManager AEQbTJ = new LoaderManager();

            private LoaderManager() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.tMb$Application$Dialog */
        public static final class Dialog extends Application {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = dialog.EZpvd;
                }
                return dialog.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Dialog(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Dialog) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "UnbindTwitterError(message=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dialog(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: renamed from: o.tMb$Application$Application, reason: collision with other inner class name */
        public static final class C0961Application extends Application {
            public static final C0961Application copydefault = new C0961Application();

            private C0961Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.tMb$Application$ActionBar */
        public static final class ActionBar extends Application {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.tMb$Application$TaskDescription */
        public static final class TaskDescription extends Application {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.AEQbTJ;
                }
                return taskDescription.AEQbTJ(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.AEQbTJ == ((TaskDescription) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AutoSyncSuccess(enabled=" + this.AEQbTJ + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.tMb$Application$Activity */
        public static final class Activity extends Application {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.KWHzl;
                }
                return activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AutoSyncError(message=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }
    }
}
