package com.okinc.im.imui.group.management.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35782oDm;
import o.C35783oDn;
import o.InterfaceC35180nqU;
import o.oDA;
import o.oDI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<Activity> AEQbTJ;
    public final Flow<GroupInfo> AYXKKw;
    public final SharedFlow<Activity> AhwBna;
    public final C35783oDn DbNXlk;
    public final MutableSharedFlow<GroupInfo> EZpvd;
    public final MutableStateFlow<StateListAnimator> KWHzl;
    public final oDA copydefault;
    public final SavedStateHandle djBIcL;
    public final C35782oDm fetchVPNInfo;
    public final oDI gEmmrt;
    public final InterfaceC35180nqU valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<GroupInfo> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> EZpvd() {
        return this.AhwBna;
    }

    @yCM
    public GroupManagementViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDA oda, @NotNull oDI odi, @NotNull C35782oDm c35782oDm, @NotNull C35783oDn c35783oDn, InterfaceC35180nqU interfaceC35180nqU) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(c35782oDm, "");
        Intrinsics.checkNotNullParameter(c35783oDn, "");
        this.djBIcL = savedStateHandle;
        this.copydefault = oda;
        this.gEmmrt = odi;
        this.fetchVPNInfo = c35782oDm;
        this.DbNXlk = c35783oDn;
        this.valueOf = interfaceC35180nqU;
        this.EZpvd = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AYXKKw = FlowKt.filterNotNull(FlowKt.transformLatest(FlowKt.filterNotNull(savedStateHandle.getStateFlow("KEY_GROUP_ID", null)), new GroupManagementViewModel$special$$inlined$flatMapLatest$1(null, this)));
        this.KWHzl = StateFlowKt.MutableStateFlow(new StateListAnimator.TaskDescription(true));
        savedStateHandle.set("KEY_GROUP_ID", valueOf());
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static final class TaskDescription extends StateListAnimator {
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.KWHzl;
                }
                return taskDescription.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.KWHzl == ((TaskDescription) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(showLoading=" + this.KWHzl + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.KWHzl = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends StateListAnimator {
            public final Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = activity.copydefault;
                }
                return activity.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable OLrzqt() {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends Activity {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GroupDescriptionUpdated(groupId=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends Activity {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Activity {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0437Activity extends Activity {
            public static final C0437Activity copydefault = new C0437Activity();

            private C0437Activity() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Activity {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.AEQbTJ;
                }
                return application.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpgradeGroupLimitSizeSuccess(displaySize=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }

    public final GroupInfo KWHzl() {
        return (GroupInfo) this.djBIcL.get("KEY_GROUP_INFO");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String valueOf() {
        String groupId;
        GroupInfo groupInfoKWHzl = KWHzl();
        return (groupInfoKWHzl == null || (groupId = groupInfoKWHzl.getGroupId()) == null) ? "" : groupId;
    }

    public final StateFlow<StateListAnimator> OLrzqt() {
        return FlowKt.asStateFlow(this.KWHzl);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupManagementViewModel$refreshGroupInfo$1(this, null), 3, null);
    }

    public final Job OLrzqt(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupManagementViewModel$executeGroupSettingsUpdate$1(this, function1, null), 3, null);
    }

    public final Job copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new GroupManagementViewModel$modifyGroupMute$1(this, str, z, null));
    }

    public final Job KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new GroupManagementViewModel$modifyMentionOthersStatus$1(this, str, z, null));
    }

    public final Job OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new GroupManagementViewModel$modifyRequireAdminApprovalToJoinStatus$1(this, str, z, null));
    }

    public final Job copydefault(@NotNull String str, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new GroupManagementViewModel$modifyInvitePermissionSettings$1(this, str, bool, bool2, null));
    }

    public final Job AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new GroupManagementViewModel$modifyGroupPrivateChatStatus$1(this, str, z, null));
    }

    public final Job KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupManagementViewModel$updateGroupDescription$1(this, str, str2, null), 3, null);
    }

    public final Job EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupManagementViewModel$convertToPublicGroup$1(this, str, null), 3, null);
    }

    public final void KWHzl(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupManagementViewModel$upgradeGroupSize$1(this, i, null), 3, null);
    }
}
