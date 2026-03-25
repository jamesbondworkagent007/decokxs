package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAGuideViewModel$onNextClicked$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTF extends ViewModel {
    public final ActivateTeeGuideModel AEQbTJ;
    public final StateFlow<Activity> AhwBna;
    public final MutableStateFlow<Activity> EZpvd;
    public final MutableSharedFlow<TaskDescription> KWHzl;
    public final MutableStateFlow<java.lang.Integer> OLrzqt;
    public final StateFlow<java.lang.Integer> copydefault;
    public final SharedFlow<TaskDescription> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Integer> OLrzqt() {
        return this.copydefault;
    }

    public fTF(ActivateTeeGuideModel activateTeeGuideModel) {
        this.AEQbTJ = activateTeeGuideModel;
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(Activity.Application.copydefault);
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(java.lang.Integer.valueOf(C13754dXa.FragmentManager.RcXXUw));
        this.OLrzqt = MutableStateFlow2;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
    }

    public interface Activity {

        public static final class Application implements Activity {
            public static final Application copydefault = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1371436550;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Intro";
            }

            private Application() {
            }
        }

        public static final class ActionBar implements Activity {
            public final int KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = actionBar.KWHzl;
                }
                return actionBar.copydefault(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(int i) {
                return new ActionBar(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.KWHzl == ((ActionBar) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Integer.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Guide(index=" + this.KWHzl + ")";
            }

            public ActionBar(int i) {
                this.KWHzl = i;
            }
        }
    }

    public interface TaskDescription {

        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator copydefault = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1263124288;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return OKGroupNotificationMessage.GROUP_OPERATION_DISMISS;
            }

            private StateListAnimator() {
            }
        }

        public static final class Application implements TaskDescription {
            public static final int KWHzl = ActivateTeeGuideModel.$stable;
            public final ActivateTeeGuideModel EZpvd;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, ActivateTeeGuideModel activateTeeGuideModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.copydefault;
                }
                if ((i & 2) != 0) {
                    activateTeeGuideModel = application.EZpvd;
                }
                return application.KWHzl(str, activateTeeGuideModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActivateTeeGuideModel EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull java.lang.String str, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
                return new Application(str, activateTeeGuideModel);
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
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ActivateOrRenew(accountId=" + this.copydefault + ", params=" + this.EZpvd + ")";
            }

            public Application(@NotNull java.lang.String str, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
                this.copydefault = str;
                this.EZpvd = activateTeeGuideModel;
            }
        }

        public static final class Activity implements TaskDescription {
            public static final int OLrzqt = ActivateTeeGuideModel.$stable;
            public final ActivateTeeGuideModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, ActivateTeeGuideModel activateTeeGuideModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    activateTeeGuideModel = activity.KWHzl;
                }
                return activity.AEQbTJ(activateTeeGuideModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull ActivateTeeGuideModel activateTeeGuideModel) {
                Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
                return new Activity(activateTeeGuideModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActivateTeeGuideModel copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RequestPasswordForNewAccount(params=" + this.KWHzl + ")";
            }

            public Activity(@NotNull ActivateTeeGuideModel activateTeeGuideModel) {
                Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
                this.KWHzl = activateTeeGuideModel;
            }
        }
    }

    public final void KWHzl() {
        Activity value = this.EZpvd.getValue();
        if (value instanceof Activity.Application) {
            this.EZpvd.setValue(new Activity.ActionBar(0));
        } else {
            if (!(value instanceof Activity.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Activity.ActionBar actionBar = (Activity.ActionBar) value;
            int iValueOf = C56548yJl.valueOf(actionBar.AEQbTJ() + 1, 3);
            if (iValueOf != actionBar.AEQbTJ()) {
                this.EZpvd.setValue(new Activity.ActionBar(iValueOf));
            }
        }
        djBIcL();
    }

    public final void copydefault() {
        Activity actionBar;
        Activity value = this.EZpvd.getValue();
        if (!(value instanceof Activity.Application)) {
            if (!(value instanceof Activity.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            MutableStateFlow<Activity> mutableStateFlow = this.EZpvd;
            if (((Activity.ActionBar) value).AEQbTJ() == 0) {
                actionBar = Activity.Application.copydefault;
            } else {
                actionBar = new Activity.ActionBar(r0.AEQbTJ() - 1);
            }
            mutableStateFlow.setValue(actionBar);
        }
        djBIcL();
    }

    public final void valueOf() {
        Activity value = this.EZpvd.getValue();
        if (value instanceof Activity.Application) {
            OLrzqt("0");
            this.EZpvd.setValue(new Activity.ActionBar(0));
            djBIcL();
        } else {
            if (!(value instanceof Activity.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Activity.ActionBar actionBar = (Activity.ActionBar) value;
            OLrzqt(C33129mqd.addS$default(java.lang.Integer.valueOf(actionBar.AEQbTJ()), 1, null, null, null, 14, null));
            if (actionBar.AEQbTJ() >= 3) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ActivateSAGuideViewModel$onNextClicked$1(this, null), 3, null);
            } else {
                this.EZpvd.setValue(new Activity.ActionBar(actionBar.AEQbTJ() + 1));
                djBIcL();
            }
        }
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3NewOnboarding_Smartacount_Next_Click", (TrackChannel[]) null, new Function1() { // from class: o.fTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fTF.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_index", str, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) {
        TaskDescription application;
        TaskDescription taskDescription;
        ActivateTeeGuideModel activateTeeGuideModel = this.AEQbTJ;
        if (activateTeeGuideModel == null) {
            java.lang.Object objEmit = this.KWHzl.emit(TaskDescription.StateListAnimator.copydefault, continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        int from = activateTeeGuideModel.getFrom();
        if (from != 0) {
            if (from == 1) {
                application = new TaskDescription.Application(activateTeeGuideModel.getAccountId(), activateTeeGuideModel);
            } else {
                taskDescription = TaskDescription.StateListAnimator.copydefault;
                java.lang.Object objEmit2 = this.KWHzl.emit(taskDescription, continuation);
                return objEmit2 != C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
            }
        } else if (activateTeeGuideModel.isNeedToCreateNewAccount()) {
            application = new TaskDescription.Activity(activateTeeGuideModel);
        } else {
            application = new TaskDescription.Application(activateTeeGuideModel.getAccountId(), activateTeeGuideModel);
        }
        taskDescription = application;
        java.lang.Object objEmit22 = this.KWHzl.emit(taskDescription, continuation);
        if (objEmit22 != C56442yFn.copydefault()) {
        }
    }

    public final void djBIcL() {
        int i;
        MutableStateFlow<java.lang.Integer> mutableStateFlow = this.OLrzqt;
        Activity value = this.EZpvd.getValue();
        if (value instanceof Activity.Application) {
            i = C13754dXa.FragmentManager.RcXXUw;
        } else {
            if (!(value instanceof Activity.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            i = ((Activity.ActionBar) value).AEQbTJ() >= 3 ? C13754dXa.FragmentManager.ibrGus : C13754dXa.FragmentManager.RcXXUw;
        }
        mutableStateFlow.setValue(java.lang.Integer.valueOf(i));
    }
}
