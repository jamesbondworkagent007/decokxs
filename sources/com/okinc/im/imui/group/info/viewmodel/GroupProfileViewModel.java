package com.okinc.im.imui.group.info.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.management.registry.ProfileSettingKeys;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okuser.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC34158nTo;
import o.C34150nTg;
import o.C34152nTi;
import o.C34157nTn;
import o.C34165nTv;
import o.C35751oCi;
import o.C35752oCj;
import o.C35782oDm;
import o.C37683oyU;
import o.C37721ozF;
import o.C44157sFk;
import o.C44170sFx;
import o.C44457sQn;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC47278tmy;
import o.oDA;
import o.oDF;
import o.oDO;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final StateFlow<String> AEQbTJ;
    public final MutableSharedFlow<Application> AYXKKw;
    public List<GroupMemberInfo> AhwBna;
    public final oDA AkhnZx;
    public final StateFlow<TaskDescription> AuCTel;
    public final SharedFlow<Activity> DbNXlk;
    public final MutableSharedFlow<C34165nTv.Activity> EZpvd;
    public final MutableSharedFlow<Activity> KWHzl;
    public final MutableSharedFlow<ActionBar> copydefault;
    public final SharedFlow<ActionBar> djBIcL;
    public final C35752oCj ejfBZ;
    public final SavedStateHandle fARcdN;
    public final C35751oCi fIwbmz;
    public final oDF fJNWhG;
    public final CoroutineDispatcher fetchVPNInfo;
    public final C34165nTv gEmmrt;
    public final C35782oDm getNewProxyInstance;
    public final SharedFlow<Application> isConnected;
    public final SharedFlow<C34165nTv.Activity> valueOf;
    public final oDO values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C34165nTv.Activity> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> valueOf() {
        return this.DbNXlk;
    }

    @yCM
    public GroupProfileViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oDA oda, @NotNull oDO odo, @NotNull oDF odf, @NotNull C34165nTv c34165nTv, @NotNull C35782oDm c35782oDm, @NotNull C35752oCj c35752oCj, @NotNull C35751oCi c35751oCi) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(odo, "");
        Intrinsics.checkNotNullParameter(odf, "");
        Intrinsics.checkNotNullParameter(c34165nTv, "");
        Intrinsics.checkNotNullParameter(c35782oDm, "");
        Intrinsics.checkNotNullParameter(c35752oCj, "");
        Intrinsics.checkNotNullParameter(c35751oCi, "");
        this.fARcdN = savedStateHandle;
        this.fetchVPNInfo = coroutineDispatcher;
        this.AkhnZx = oda;
        this.values = odo;
        this.fJNWhG = odf;
        this.gEmmrt = c34165nTv;
        this.getNewProxyInstance = c35782oDm;
        this.ejfBZ = c35752oCj;
        this.fIwbmz = c35751oCi;
        MutableSharedFlow<Activity> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.KWHzl = mutableSharedFlowAEQbTJ;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableSharedFlow<Application> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.AYXKKw = mutableSharedFlowAEQbTJ2;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        StateFlow<String> stateFlow = savedStateHandle.getStateFlow("group_id", null);
        this.AEQbTJ = stateFlow;
        this.AhwBna = yDY.AhwBna();
        this.AuCTel = FlowKt.stateIn(FlowKt.m7441catch(FlowKt.mapLatest(FlowKt.transformLatest(FlowKt.filterNotNull(stateFlow), new GroupProfileViewModel$special$$inlined$flatMapLatest$1(null, this)), new GroupProfileViewModel$uiState$2(this, null)), new GroupProfileViewModel$uiState$3(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), TaskDescription.StateListAnimator.AEQbTJ);
        MutableSharedFlow<ActionBar> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.copydefault = mutableSharedFlowAEQbTJ3;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        MutableSharedFlow<C34165nTv.Activity> mutableSharedFlowAEQbTJ4 = C37721ozF.AEQbTJ();
        this.EZpvd = mutableSharedFlowAEQbTJ4;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ4);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final class StateListAnimator extends TaskDescription {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        public static final class ActionBar extends TaskDescription {
            public final C34150nTg AEQbTJ;
            public final C34152nTi EZpvd;
            public final C34157nTn KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C34152nTi c34152nTi, C34157nTn c34157nTn, C34150nTg c34150nTg, int i, Object obj) {
                if ((i & 1) != 0) {
                    c34152nTi = actionBar.EZpvd;
                }
                if ((i & 2) != 0) {
                    c34157nTn = actionBar.KWHzl;
                }
                if ((i & 4) != 0) {
                    c34150nTg = actionBar.AEQbTJ;
                }
                return actionBar.KWHzl(c34152nTi, c34157nTn, c34150nTg);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C34157nTn AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull C34152nTi c34152nTi, @NotNull C34157nTn c34157nTn, @NotNull C34150nTg c34150nTg) {
                Intrinsics.checkNotNullParameter(c34152nTi, "");
                Intrinsics.checkNotNullParameter(c34157nTn, "");
                Intrinsics.checkNotNullParameter(c34150nTg, "");
                return new ActionBar(c34152nTi, c34157nTn, c34150nTg);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C34150nTg KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C34152nTi OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(headerSection=" + this.EZpvd + ", memberSection=" + this.KWHzl + ", settingsSection=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull C34152nTi c34152nTi, @NotNull C34157nTn c34157nTn, @NotNull C34150nTg c34150nTg) {
                super(null);
                Intrinsics.checkNotNullParameter(c34152nTi, "");
                Intrinsics.checkNotNullParameter(c34157nTn, "");
                Intrinsics.checkNotNullParameter(c34150nTg, "");
                this.EZpvd = c34152nTi;
                this.KWHzl = c34157nTn;
                this.AEQbTJ = c34150nTg;
            }
        }

        public static final class Activity extends TaskDescription {
            public final Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = activity.copydefault;
                }
                return activity.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Activity(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final class StateListAnimator extends Activity {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(boolean z) {
                return new StateListAnimator(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && this.AEQbTJ == ((StateListAnimator) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowLoading(show=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(boolean z) {
                super(null);
                this.AEQbTJ = z;
            }
        }

        public static final class Application extends Activity {
            public final Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = application.copydefault;
                }
                return application.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ToastError(error=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = th;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0421Activity extends Activity {
            public final Throwable EZpvd;
            public final int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0421Activity copy$default(C0421Activity c0421Activity, int i, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = c0421Activity.copydefault;
                }
                if ((i2 & 2) != 0) {
                    th = c0421Activity.EZpvd;
                }
                return c0421Activity.OLrzqt(i, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0421Activity OLrzqt(int i, @NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new C0421Activity(i, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0421Activity)) {
                    return false;
                }
                C0421Activity c0421Activity = (C0421Activity) obj;
                return this.copydefault == c0421Activity.copydefault && Intrinsics.EZpvd(this.EZpvd, c0421Activity.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.copydefault) * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CustomError(errorCode=" + this.copydefault + ", error=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421Activity(int i, @NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = i;
                this.EZpvd = th;
            }
        }
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends Application {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends Application {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    public final String AYXKKw() {
        return this.AEQbTJ.getValue();
    }

    public final GroupInfo djBIcL() {
        return (GroupInfo) this.fARcdN.get("KEY_GROUP_INFO");
    }

    public final OKConversation OLrzqt() {
        return (OKConversation) this.fARcdN.get("KEY_CONVERSATION");
    }

    public final boolean isConnected() {
        Boolean bool = (Boolean) this.fARcdN.get("KEY_DO_NOT_DISTURB");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean fetchVPNInfo() {
        Boolean bool = (Boolean) this.fARcdN.get("KEY_PIN_TO_TOP");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean values() {
        GroupInfo groupInfoDjBIcL = djBIcL();
        if (groupInfoDjBIcL != null) {
            Integer type = groupInfoDjBIcL.getType();
            int value = GroupTagType.PAID_GROUP.getValue();
            if (type != null && type.intValue() == value) {
                return true;
            }
        }
        return false;
    }

    public final boolean AkhnZx() {
        GroupInfo groupInfoDjBIcL = djBIcL();
        if (groupInfoDjBIcL != null) {
            Integer type = groupInfoDjBIcL.getType();
            int value = GroupTagType.RM_VIP_GROUP.getValue();
            if (type != null && type.intValue() == value) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Application extends ActionBar {
            public final List<String> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = application.OLrzqt;
                }
                return application.copydefault(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddMemberRegular(memberIdList=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.OLrzqt = list;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class C0420ActionBar extends ActionBar {
            public final List<String> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel$ActionBar$ActionBar */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0420ActionBar copy$default(C0420ActionBar c0420ActionBar, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = c0420ActionBar.EZpvd;
                }
                return c0420ActionBar.OLrzqt(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0420ActionBar OLrzqt(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0420ActionBar(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0420ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((C0420ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddMemberWithPaymentOptions(memberIdList=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0420ActionBar(@NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
            }
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends ActionBar {
            public final List<String> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel$ActionBar$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = stateListAnimator.KWHzl;
                }
                return stateListAnimator.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new StateListAnimator(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddAffiliateMembers(memberIdList=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
            }
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Activity extends ActionBar {
            public final long KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = activity.KWHzl;
                }
                return activity.KWHzl(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(long j) {
                return new Activity(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Long.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MaxMembersReached(maxLimit=" + this.KWHzl + ")";
            }

            public Activity(long j) {
                super(null);
                this.KWHzl = j;
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r8v18. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(oDF.StateListAnimator stateListAnimator, Continuation<? super TaskDescription> continuation) throws Throwable {
        GroupProfileViewModel$toContentState$1 groupProfileViewModel$toContentState$1;
        GroupMemberInfo groupMemberInfo;
        int i;
        oDF.StateListAnimator stateListAnimator2;
        C34152nTi c34152nTi;
        int i2;
        GroupProfileViewModel groupProfileViewModel;
        Object next;
        ?? r4;
        if (continuation instanceof GroupProfileViewModel$toContentState$1) {
            groupProfileViewModel$toContentState$1 = (GroupProfileViewModel$toContentState$1) continuation;
            int i3 = groupProfileViewModel$toContentState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                groupProfileViewModel$toContentState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                groupProfileViewModel$toContentState$1 = new GroupProfileViewModel$toContentState$1(this, continuation);
            }
        }
        Object obj = groupProfileViewModel$toContentState$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = groupProfileViewModel$toContentState$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer type = stateListAnimator.KWHzl().getType();
            boolean z = type != null && type.intValue() == GroupTagType.RM_VIP_GROUP.getValue();
            InterfaceC47278tmy interfaceC47278tmyGEmmrt = C44157sFk.gEmmrt();
            User userOLrzqt = interfaceC47278tmyGEmmrt != null ? interfaceC47278tmyGEmmrt.OLrzqt() : null;
            int i5 = (z && userOLrzqt != null && userOLrzqt.isVip()) ? 1 : 0;
            if (i5 != 0) {
                String strKWHzl = C44157sFk.KWHzl();
                Iterator it = this.AhwBna.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((GroupMemberInfo) next).getMemberId(), (Object) strKWHzl)) {
                        break;
                    }
                }
                groupMemberInfo = (GroupMemberInfo) next;
            } else {
                groupMemberInfo = null;
            }
            String name = stateListAnimator.KWHzl().getName();
            String bizGroupName = stateListAnimator.KWHzl().getBizGroupName();
            String avatar = stateListAnimator.KWHzl().getAvatar();
            String description = stateListAnimator.KWHzl().getDescription();
            int groupCount = stateListAnimator.KWHzl().getGroupCount();
            OfficialTagInfo officialTags = stateListAnimator.KWHzl().getOfficialTags();
            Integer type2 = stateListAnimator.KWHzl().getType();
            C34152nTi c34152nTi2 = new C34152nTi(name, bizGroupName, avatar, description, groupCount, officialTags, type2 != null && type2.intValue() == GroupTagType.PAID_GROUP.getValue(), stateListAnimator.KWHzl().isAllowUpdateGroupSetting(), stateListAnimator.KWHzl().getPublicGroupType(), stateListAnimator.KWHzl().getOwnerId(), i5, groupMemberInfo != null ? C44157sFk.EZpvd(groupMemberInfo) : null, groupMemberInfo != null ? groupMemberInfo.getAvatar() : null, groupMemberInfo != null ? groupMemberInfo.getOfficialTags() : null);
            GroupUserSettingInfo userSettingInfo = stateListAnimator.KWHzl().getUserSettingInfo();
            ?? KWHzl = userSettingInfo != null ? C44170sFx.KWHzl(userSettingInfo.getRole()) : 0;
            int groupCount2 = stateListAnimator.KWHzl().getGroupCount();
            List<GroupMemberInfo> list = this.AhwBna;
            groupProfileViewModel$toContentState$1.L$0 = this;
            groupProfileViewModel$toContentState$1.L$1 = stateListAnimator;
            groupProfileViewModel$toContentState$1.L$2 = c34152nTi2;
            groupProfileViewModel$toContentState$1.I$0 = i5;
            groupProfileViewModel$toContentState$1.I$1 = KWHzl;
            groupProfileViewModel$toContentState$1.I$2 = groupCount2;
            groupProfileViewModel$toContentState$1.label = 1;
            Object objKWHzl = KWHzl(list, groupProfileViewModel$toContentState$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            i = groupCount2;
            stateListAnimator2 = stateListAnimator;
            c34152nTi = c34152nTi2;
            i2 = i5;
            obj = objKWHzl;
            groupProfileViewModel = this;
            r4 = KWHzl;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = groupProfileViewModel$toContentState$1.I$2;
            int i6 = groupProfileViewModel$toContentState$1.I$1;
            i2 = groupProfileViewModel$toContentState$1.I$0;
            c34152nTi = (C34152nTi) groupProfileViewModel$toContentState$1.L$2;
            stateListAnimator2 = (oDF.StateListAnimator) groupProfileViewModel$toContentState$1.L$1;
            groupProfileViewModel = (GroupProfileViewModel) groupProfileViewModel$toContentState$1.L$0;
            C56391yDq.AEQbTJ(obj);
            r4 = i6;
        }
        return new TaskDescription.ActionBar(c34152nTi, new C34157nTn(i, (List) obj, r4 != 0, i2 != 0), new C34150nTg(groupProfileViewModel.AEQbTJ(stateListAnimator2.KWHzl(), i2 != 0), stateListAnimator2.KWHzl().isAllowUpdateGroupSetting(), stateListAnimator2.KWHzl().isAllowUpdateGroupProfile(), stateListAnimator2.AEQbTJ().isNoDisturb(), stateListAnimator2.AEQbTJ().isTop()));
    }

    public final Object KWHzl(List<GroupMemberInfo> list, Continuation<? super List<? extends AbstractC34158nTo>> continuation) {
        return BuildersKt.withContext(this.fetchVPNInfo, new GroupProfileViewModel$toTopMemberDisplayModelList$2(this, list, null), continuation);
    }

    public static /* synthetic */ void refreshGroupInfo$default(GroupProfileViewModel groupProfileViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        groupProfileViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        String value = this.AEQbTJ.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$refreshGroupInfo$1$1(this, z, value, null), 3, null);
        }
    }

    public static /* synthetic */ List buildProfileSettings$default(GroupProfileViewModel groupProfileViewModel, GroupInfo groupInfo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return groupProfileViewModel.AEQbTJ(groupInfo, z);
    }

    public final List<ProfileSettingKeys> AEQbTJ(GroupInfo groupInfo, boolean z) {
        C44457sQn c44457sQnEZpvd = C37683oyU.EZpvd(groupInfo);
        List listOLrzqt = C56402yEa.OLrzqt();
        if (groupInfo.isAllowSharingInvitationQrCode() || groupInfo.isAllowGeneratingInvitationQrCode()) {
            listOLrzqt.add(ProfileSettingKeys.INVITE_VIA_QR);
        }
        if (groupInfo.getReviewJoinApplications()) {
            listOLrzqt.add(ProfileSettingKeys.JOIN_REQUESTS);
        }
        if (!listOLrzqt.isEmpty()) {
            listOLrzqt.add(ProfileSettingKeys.DIVIDER);
        }
        if (groupInfo.isAllowUpdateGroupSetting()) {
            listOLrzqt.add(ProfileSettingKeys.GROUP_MANAGEMENT);
            listOLrzqt.add(ProfileSettingKeys.JOIN_REQUIREMENTS);
            GroupUserSettingInfo userSettingInfo = groupInfo.getUserSettingInfo();
            if (userSettingInfo != null) {
                Integer type = groupInfo.getType();
                boolean z2 = type != null && type.intValue() == GroupTagType.PAID_GROUP.getValue();
                if (C44170sFx.EZpvd(userSettingInfo.getRole()) && z2) {
                    listOLrzqt.add(ProfileSettingKeys.PAID_GROUP_DASHBOARD);
                }
            }
            listOLrzqt.add(ProfileSettingKeys.DIVIDER);
        }
        PaidGroupInfo paidGroupInfo = groupInfo.getPaidGroupInfo();
        if (paidGroupInfo != null) {
            PaidGroupMemberStatus paidGroupMemberStatus = paidGroupInfo.getPaidGroupMemberStatus();
            if ((paidGroupMemberStatus != null ? paidGroupMemberStatus.getPaymentRequiredStatus() : null) == PaymentRequiredStatus.REQUIRED) {
                listOLrzqt.add(ProfileSettingKeys.PAID_GROUP_PAY_MEMBERSHIP);
            }
        }
        listOLrzqt.add(ProfileSettingKeys.SEARCH_IN_CHAT);
        listOLrzqt.add(ProfileSettingKeys.MUTE_NOTIFICATIONS);
        listOLrzqt.add(ProfileSettingKeys.PIN_TO_TOP);
        listOLrzqt.add(ProfileSettingKeys.ANNOUNCEMENTS);
        if ((!listOLrzqt.isEmpty()) && !z) {
            listOLrzqt.add(ProfileSettingKeys.DIVIDER);
        }
        if (groupInfo.isAllowDisbandGroup()) {
            listOLrzqt.add(ProfileSettingKeys.DISBAND_GROUP);
        }
        if (groupInfo.getAllowLeaveGroup() == null) {
            if (!groupInfo.isAllowDisbandGroup() && c44457sQnEZpvd.copydefault()) {
                listOLrzqt.add(ProfileSettingKeys.LEAVE_GROUP);
            }
        } else if (Intrinsics.EZpvd(groupInfo.getAllowLeaveGroup(), Boolean.TRUE)) {
            listOLrzqt.add(ProfileSettingKeys.LEAVE_GROUP);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final void EZpvd() {
        GroupInfo groupInfoDjBIcL = djBIcL();
        if (groupInfoDjBIcL == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$addMember$1(groupInfoDjBIcL, this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$createPayment$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Function2<? super String, ? super Continuation<? super Result<Unit>>, ? extends Object> function2, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function2<? super Throwable, ? super Continuation<? super Activity>, ? extends Object> function22, Continuation<? super Unit> continuation) throws Throwable {
        GroupProfileViewModel$runUpdateGroupSetting$1 groupProfileViewModel$runUpdateGroupSetting$1;
        String strAYXKKw;
        Function2<? super Throwable, ? super Continuation<? super Activity>, ? extends Object> function23;
        GroupProfileViewModel groupProfileViewModel;
        Throwable th;
        Function2<? super Throwable, ? super Continuation<? super Activity>, ? extends Object> function24;
        Object objM7377constructorimpl;
        GroupProfileViewModel groupProfileViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th2;
        GroupProfileViewModel groupProfileViewModel3;
        MutableSharedFlow<Activity> mutableSharedFlow;
        Activity.StateListAnimator stateListAnimator;
        Activity application;
        MutableSharedFlow<Activity> mutableSharedFlow2;
        if (continuation instanceof GroupProfileViewModel$runUpdateGroupSetting$1) {
            groupProfileViewModel$runUpdateGroupSetting$1 = (GroupProfileViewModel$runUpdateGroupSetting$1) continuation;
            int i = groupProfileViewModel$runUpdateGroupSetting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupProfileViewModel$runUpdateGroupSetting$1.label = i - Integer.MIN_VALUE;
            } else {
                groupProfileViewModel$runUpdateGroupSetting$1 = new GroupProfileViewModel$runUpdateGroupSetting$1(this, continuation);
            }
        }
        Object objInvoke = groupProfileViewModel$runUpdateGroupSetting$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        switch (groupProfileViewModel$runUpdateGroupSetting$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objInvoke);
                strAYXKKw = AYXKKw();
                if (strAYXKKw == null) {
                    return Unit.INSTANCE;
                }
                MutableSharedFlow<Activity> mutableSharedFlow3 = this.KWHzl;
                Activity.StateListAnimator stateListAnimator2 = new Activity.StateListAnimator(true);
                groupProfileViewModel$runUpdateGroupSetting$1.L$0 = this;
                groupProfileViewModel$runUpdateGroupSetting$1.L$1 = function2;
                groupProfileViewModel$runUpdateGroupSetting$1.L$2 = function1;
                groupProfileViewModel$runUpdateGroupSetting$1.L$3 = function22;
                groupProfileViewModel$runUpdateGroupSetting$1.L$4 = strAYXKKw;
                groupProfileViewModel$runUpdateGroupSetting$1.label = 1;
                if (mutableSharedFlow3.emit(stateListAnimator2, groupProfileViewModel$runUpdateGroupSetting$1) == objCopydefault) {
                    return objCopydefault;
                }
                function23 = function22;
                groupProfileViewModel = this;
                try {
                    Result.Application application2 = Result.Companion;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$0 = groupProfileViewModel;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$1 = function1;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$2 = function23;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$3 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$4 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.label = 2;
                    objInvoke = function2.invoke(strAYXKKw, groupProfileViewModel$runUpdateGroupSetting$1);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    function24 = function23;
                }
                if (objInvoke != objCopydefault) {
                    return objCopydefault;
                }
                function24 = function23;
                C56391yDq.AEQbTJ(((Result) objInvoke).m7386unboximpl());
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                GroupProfileViewModel groupProfileViewModel4 = groupProfileViewModel;
                Function1<? super Continuation<? super Unit>, ? extends Object> function12 = function1;
                groupProfileViewModel2 = groupProfileViewModel4;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    groupProfileViewModel$runUpdateGroupSetting$1.L$0 = groupProfileViewModel2;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$1 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$2 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$3 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.L$4 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.label = 3;
                    if (function12.invoke(groupProfileViewModel$runUpdateGroupSetting$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    groupProfileViewModel3 = groupProfileViewModel2;
                    mutableSharedFlow = groupProfileViewModel3.KWHzl;
                    stateListAnimator = new Activity.StateListAnimator(false);
                    groupProfileViewModel$runUpdateGroupSetting$1.L$0 = null;
                    groupProfileViewModel$runUpdateGroupSetting$1.label = 4;
                    if (mutableSharedFlow.emit(stateListAnimator, groupProfileViewModel$runUpdateGroupSetting$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                groupProfileViewModel$runUpdateGroupSetting$1.L$0 = groupProfileViewModel2;
                groupProfileViewModel$runUpdateGroupSetting$1.L$1 = thM7380exceptionOrNullimpl;
                groupProfileViewModel$runUpdateGroupSetting$1.L$2 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.L$3 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.L$4 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.label = 5;
                objInvoke = function24.invoke(thM7380exceptionOrNullimpl, groupProfileViewModel$runUpdateGroupSetting$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                th2 = thM7380exceptionOrNullimpl;
                application = (Activity) objInvoke;
                if (application == null) {
                    application = new Activity.Application(th2);
                }
                mutableSharedFlow2 = groupProfileViewModel2.KWHzl;
                groupProfileViewModel$runUpdateGroupSetting$1.L$0 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.L$1 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.label = 6;
                if (mutableSharedFlow2.emit(application, groupProfileViewModel$runUpdateGroupSetting$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) groupProfileViewModel$runUpdateGroupSetting$1.L$4;
                Function2<? super Throwable, ? super Continuation<? super Activity>, ? extends Object> function25 = (Function2) groupProfileViewModel$runUpdateGroupSetting$1.L$3;
                function1 = (Function1) groupProfileViewModel$runUpdateGroupSetting$1.L$2;
                Function2<? super String, ? super Continuation<? super Result<Unit>>, ? extends Object> function26 = (Function2) groupProfileViewModel$runUpdateGroupSetting$1.L$1;
                GroupProfileViewModel groupProfileViewModel5 = (GroupProfileViewModel) groupProfileViewModel$runUpdateGroupSetting$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                strAYXKKw = str;
                function2 = function26;
                function23 = function25;
                groupProfileViewModel = groupProfileViewModel5;
                Result.Application application22 = Result.Companion;
                groupProfileViewModel$runUpdateGroupSetting$1.L$0 = groupProfileViewModel;
                groupProfileViewModel$runUpdateGroupSetting$1.L$1 = function1;
                groupProfileViewModel$runUpdateGroupSetting$1.L$2 = function23;
                groupProfileViewModel$runUpdateGroupSetting$1.L$3 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.L$4 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.label = 2;
                objInvoke = function2.invoke(strAYXKKw, groupProfileViewModel$runUpdateGroupSetting$1);
                if (objInvoke != objCopydefault) {
                }
                break;
            case 2:
                function24 = (Function2) groupProfileViewModel$runUpdateGroupSetting$1.L$2;
                function1 = (Function1) groupProfileViewModel$runUpdateGroupSetting$1.L$1;
                groupProfileViewModel = (GroupProfileViewModel) groupProfileViewModel$runUpdateGroupSetting$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objInvoke);
                    C56391yDq.AEQbTJ(((Result) objInvoke).m7386unboximpl());
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    th = th4;
                    function23 = function24;
                    Result.Application application32 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    function24 = function23;
                }
                GroupProfileViewModel groupProfileViewModel42 = groupProfileViewModel;
                Function1<? super Continuation<? super Unit>, ? extends Object> function122 = function1;
                groupProfileViewModel2 = groupProfileViewModel42;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                break;
            case 3:
                groupProfileViewModel3 = (GroupProfileViewModel) groupProfileViewModel$runUpdateGroupSetting$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                mutableSharedFlow = groupProfileViewModel3.KWHzl;
                stateListAnimator = new Activity.StateListAnimator(false);
                groupProfileViewModel$runUpdateGroupSetting$1.L$0 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.label = 4;
                if (mutableSharedFlow.emit(stateListAnimator, groupProfileViewModel$runUpdateGroupSetting$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
            case 6:
                C56391yDq.AEQbTJ(objInvoke);
                return Unit.INSTANCE;
            case 5:
                th2 = (Throwable) groupProfileViewModel$runUpdateGroupSetting$1.L$1;
                groupProfileViewModel2 = (GroupProfileViewModel) groupProfileViewModel$runUpdateGroupSetting$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                application = (Activity) objInvoke;
                if (application == null) {
                }
                mutableSharedFlow2 = groupProfileViewModel2.KWHzl;
                groupProfileViewModel$runUpdateGroupSetting$1.L$0 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.L$1 = null;
                groupProfileViewModel$runUpdateGroupSetting$1.label = 6;
                if (mutableSharedFlow2.emit(application, groupProfileViewModel$runUpdateGroupSetting$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object runUpdateGroupSetting$default(GroupProfileViewModel groupProfileViewModel, Function2 function2, Function1 function1, Function2 function22, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function22 = new GroupProfileViewModel$runUpdateGroupSetting$2(null);
        }
        return groupProfileViewModel.copydefault(function2, function1, function22, continuation);
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$toggleMuteNotifications$1(this, null), 3, null);
    }

    public final void fIwbmz() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$togglePinToTop$1(this, null), 3, null);
    }

    public final void AuCTel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$performExitGroup$1(this, null), 3, null);
    }

    public final void fJNWhG() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupProfileViewModel$performDisbandGroup$1(this, null), 3, null);
    }

    public final List<String> DbNXlk() {
        List<GroupMemberInfo> list = this.AhwBna;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupMemberInfo) it.next()).getMemberId());
        }
        return arrayList;
    }
}
