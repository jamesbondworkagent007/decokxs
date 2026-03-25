package com.okinc.im.imui.group.create.viewmodel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.okimcore.model.im.group.GroupActionError;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C33129mqd;
import o.C35778oDi;
import o.C35864oGn;
import o.C37683oyU;
import o.C37721ozF;
import o.C43251rlk;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sKN;
import o.tWL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final Flow<Activity.C0415Activity> AEQbTJ;
    public final StateFlow<Boolean> AYXKKw;
    public final StateFlow<List<CreateGroupDisplayItem.MemberItem>> AhwBna;
    public final Flow<Boolean> AkhnZx;
    public final CoroutineDispatcher AuCTel;
    public final C35778oDi DbNXlk;
    public final StateFlow<String> EZpvd;
    public final StateFlow<String> OLrzqt;
    public final StateFlow<String> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public final C35864oGn ejfBZ;
    public final tWL fARcdN;
    public final SavedStateHandle fIwbmz;
    public final sKN fJNWhG;
    public final MutableStateFlow<Activity> fetchVPNInfo;
    public final MutableSharedFlow<Application> gEmmrt;
    public final SharedFlow<Application> getNewProxyInstance;
    public final StateFlow<Boolean> hDKMBd;
    public final StateFlow<Boolean> isConnected;
    public final StateFlow<Activity> uzCIH;
    public final StateFlow<InvitePermissions> valueOf;
    public final MutableStateFlow<Boolean> values;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CreateGroupDisplayItem.OptionKey.values().length];
            try {
                iArr[CreateGroupDisplayItem.OptionKey.PUBLIC_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateGroupDisplayItem.OptionKey.RESTRICTED_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> AYXKKw() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> EZpvd() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> valueOf() {
        return this.hDKMBd;
    }

    public static final class TaskDescription implements Flow<List<? extends String>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CreateGroupViewModel$special$$inlined$filterNot$1$2$1 createGroupViewModel$special$$inlined$filterNot$1$2$1;
                if (continuation instanceof CreateGroupViewModel$special$$inlined$filterNot$1$2$1) {
                    createGroupViewModel$special$$inlined$filterNot$1$2$1 = (CreateGroupViewModel$special$$inlined$filterNot$1$2$1) continuation;
                    int i = createGroupViewModel$special$$inlined$filterNot$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        createGroupViewModel$special$$inlined$filterNot$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        createGroupViewModel$special$$inlined$filterNot$1$2$1 = new CreateGroupViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                }
                Object obj2 = createGroupViewModel$special$$inlined$filterNot$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = createGroupViewModel$special$$inlined$filterNot$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    if (!((List) obj).isEmpty()) {
                        createGroupViewModel$special$$inlined$filterNot$1$2$1.label = 1;
                        if (flowCollector.emit(obj, createGroupViewModel$special$$inlined$filterNot$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public CreateGroupViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C35864oGn c35864oGn, @NotNull C35778oDi c35778oDi, @NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c35864oGn, "");
        Intrinsics.checkNotNullParameter(c35778oDi, "");
        Intrinsics.checkNotNullParameter(skn, "");
        this.fIwbmz = savedStateHandle;
        this.AuCTel = coroutineDispatcher;
        this.ejfBZ = c35864oGn;
        this.DbNXlk = c35778oDi;
        this.fJNWhG = skn;
        StateFlow<String> stateFlow = savedStateHandle.getStateFlow("KEY_GROUP_IMAGE_URI", null);
        this.copydefault = stateFlow;
        StateFlow<String> stateFlow2 = savedStateHandle.getStateFlow("KEY_GROUP_NAME", "");
        this.OLrzqt = stateFlow2;
        StateFlow<String> stateFlow3 = savedStateHandle.getStateFlow("KEY_GROUP_DESCRIPTION", "");
        this.EZpvd = stateFlow3;
        Boolean bool = Boolean.FALSE;
        StateFlow<Boolean> stateFlow4 = savedStateHandle.getStateFlow("KEY_IS_PUBLIC_GROUP", bool);
        this.djBIcL = stateFlow4;
        StateFlow<Boolean> stateFlow5 = savedStateHandle.getStateFlow("KEY_IS_RESTRICTED_GROUP", bool);
        this.AYXKKw = stateFlow5;
        this.isConnected = savedStateHandle.getStateFlow("KEY_HIDE_GUIDELINE", bool);
        this.valueOf = savedStateHandle.getStateFlow("KEY_INVITE_PERMISSIONS", new InvitePermissions(false, false, false, 7, null));
        StateFlow<List<CreateGroupDisplayItem.MemberItem>> stateFlowStateIn = FlowKt.stateIn(FlowKt.mapLatest(new TaskDescription(savedStateHandle.getStateFlow("KEY_MEMBER_IDS", yDY.AhwBna())), new CreateGroupViewModel$_memberListFlow$2(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), yDY.AhwBna());
        this.AhwBna = stateFlowStateIn;
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.fetchVPNInfo = MutableStateFlow;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.values = MutableStateFlow2;
        this.hDKMBd = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<Application> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.gEmmrt = mutableSharedFlowAEQbTJ;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        this.fARcdN = (tWL) C43251rlk.copydefault(tWL.class);
        this.AEQbTJ = FlowKt.mapLatest(FlowKt.combine(stateFlow, stateFlow4, stateFlow5, stateFlowStateIn, new CreateGroupViewModel$_contentUpdateFlow$1(this, null)), new CreateGroupViewModel$_contentUpdateFlow$2(null));
        this.AkhnZx = FlowKt.combine(stateFlow2, stateFlow3, stateFlow4, new CreateGroupViewModel$_validateCreateFormFlow$1(this, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        C44124sEe.imLogGroup$default("CreateGroupViewModel: groupType: " + copydefault() + ", billingCycle=" + AhwBna() + ", membershipFee=" + gEmmrt() + ", currencyId=" + djBIcL(), null, 2, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0415Activity extends Activity {
            public final List<CreateGroupDisplayItem> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel$Activity$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0415Activity copy$default(C0415Activity c0415Activity, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = c0415Activity.KWHzl;
                }
                return c0415Activity.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0415Activity AEQbTJ(@NotNull List<? extends CreateGroupDisplayItem> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0415Activity(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<CreateGroupDisplayItem> AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0415Activity) && Intrinsics.EZpvd(this.KWHzl, ((C0415Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(items=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.imui.group.create.model.CreateGroupDisplayItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0415Activity(@NotNull List<? extends CreateGroupDisplayItem> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class LoaderManager extends Activity {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = loaderManager.EZpvd;
                }
                return loaderManager.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager copydefault(boolean z) {
                return new LoaderManager(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoaderManager) && this.EZpvd == ((LoaderManager) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidationResult(isValid=" + this.EZpvd + ")";
            }

            public LoaderManager(boolean z) {
                super(null);
                this.EZpvd = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends Activity {
            public static final Application AEQbTJ = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription extends Activity {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Dialog extends Activity {
            public static final int OLrzqt = GroupInfo.$stable;
            public final GroupInfo AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, GroupInfo groupInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    groupInfo = dialog.AEQbTJ;
                }
                return dialog.OLrzqt(groupInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupInfo AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog OLrzqt(@NotNull GroupInfo groupInfo) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                return new Dialog(groupInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd(this.AEQbTJ, ((Dialog) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ResultSuccess(groupInfo=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dialog(@NotNull GroupInfo groupInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(groupInfo, "");
                this.AEQbTJ = groupInfo;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends Activity {
            public static final int EZpvd = GroupAddMembersResult.$stable | GroupInfo.$stable;
            public final GroupInfo AEQbTJ;
            public final GroupAddMembersResult OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, GroupInfo groupInfo, GroupAddMembersResult groupAddMembersResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    groupInfo = stateListAnimator.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    groupAddMembersResult = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.KWHzl(groupInfo, groupAddMembersResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull GroupInfo groupInfo, @NotNull GroupAddMembersResult groupAddMembersResult) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
                return new StateListAnimator(groupInfo, groupAddMembersResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupInfo OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupAddMembersResult copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ResultPartialSuccess(groupInfo=" + this.AEQbTJ + ", addMembersResult=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull GroupInfo groupInfo, @NotNull GroupAddMembersResult groupAddMembersResult) {
                super(null);
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
                this.AEQbTJ = groupInfo;
                this.OLrzqt = groupAddMembersResult;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends Activity {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public final Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.KWHzl;
                }
                return stateListAnimator.OLrzqt(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
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
                return "ToastError(error=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }

        public static final class TaskDescription extends Application {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        public static final class Activity extends Application {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
                super(null);
            }
        }
    }

    public static final class InvitePermissions implements Parcelable {
        public static final Parcelable.Creator<InvitePermissions> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final boolean EZpvd;
        public final boolean KWHzl;

        public static final class Creator implements Parcelable.Creator<InvitePermissions> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvitePermissions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new InvitePermissions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvitePermissions[] newArray(int i) {
                return new InvitePermissions[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvitePermissions() {
            this(false, false, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvitePermissions copy$default(InvitePermissions invitePermissions, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = invitePermissions.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z2 = invitePermissions.EZpvd;
            }
            if ((i & 4) != 0) {
                z3 = invitePermissions.KWHzl;
            }
            return invitePermissions.EZpvd(z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvitePermissions EZpvd(boolean z, boolean z2, boolean z3) {
            return new InvitePermissions(z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvitePermissions)) {
                return false;
            }
            InvitePermissions invitePermissions = (InvitePermissions) obj;
            return this.AEQbTJ == invitePermissions.AEQbTJ && this.EZpvd == invitePermissions.EZpvd && this.KWHzl == invitePermissions.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Boolean.hashCode(this.AEQbTJ) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvitePermissions(allowMembersToInvite=" + this.AEQbTJ + ", joinApprovalRequired=" + this.EZpvd + ", joinWithQrCode=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
            parcel.writeInt(this.EZpvd ? 1 : 0);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public InvitePermissions(boolean z, boolean z2, boolean z3) {
            this.AEQbTJ = z;
            this.EZpvd = z2;
            this.KWHzl = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:119) call: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel.InvitePermissions.<init>(boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ InvitePermissions(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3);
        }
    }

    public final Double gEmmrt() {
        return (Double) this.fIwbmz.get("KEY_MEMBERSHIP_FEE");
    }

    public final GroupBillingType AhwBna() {
        return (GroupBillingType) this.fIwbmz.get("KEY_BILLING_CYCLE");
    }

    public final Integer djBIcL() {
        return (Integer) this.fIwbmz.get("KEY_CURRENCY_ID");
    }

    public final GroupType copydefault() {
        GroupType groupType = (GroupType) this.fIwbmz.get("KEY_GROUP_TYPE");
        return groupType == null ? GroupType.STANDARD : groupType;
    }

    public final InvitePermissions AEQbTJ() {
        return this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = CreateGroupViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateGroupViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04141(CreateGroupViewModel createGroupViewModel, Continuation<? super C04141> continuation) {
                super(2, continuation);
                this.this$0 = createGroupViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04141(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableStateFlow mutableStateFlow = this.this$0.fetchVPNInfo;
                    Flow flow = this.this$0.AEQbTJ;
                    this.label = 1;
                    if (FlowKt.emitAll(mutableStateFlow, flow, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C04141(CreateGroupViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CreateGroupViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateGroupViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CreateGroupViewModel createGroupViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = createGroupViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableStateFlow mutableStateFlow = this.this$0.values;
                    Flow flow = this.this$0.AkhnZx;
                    this.label = 1;
                    if (FlowKt.emitAll(mutableStateFlow, flow, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final boolean KWHzl(String str, String str2, boolean z) {
        if (z) {
            return C33129mqd.OLrzqt((CharSequence) str) && C37683oyU.copydefault(str2);
        }
        return C33129mqd.OLrzqt((CharSequence) str);
    }

    public final void OLrzqt(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        this.fIwbmz.set("KEY_GROUP_IMAGE_URI", uri.toString());
        C44124sEe.imLogGroup$default("updateGroupImageUrl: " + this.copydefault, null, 2, null);
    }

    public final void copydefault(String str) {
        this.fIwbmz.set("KEY_GROUP_NAME", str);
    }

    public final void OLrzqt(String str) {
        this.fIwbmz.set("KEY_GROUP_DESCRIPTION", str);
    }

    public final void copydefault(@NotNull InvitePermissions invitePermissions) {
        Intrinsics.checkNotNullParameter(invitePermissions, "");
        this.fIwbmz.set("KEY_INVITE_PERMISSIONS", invitePermissions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(List<String> list, Continuation<? super List<CreateGroupDisplayItem.MemberItem>> continuation) throws Throwable {
        CreateGroupViewModel$toMemberList$1 createGroupViewModel$toMemberList$1;
        Object objM7377constructorimpl;
        if (continuation instanceof CreateGroupViewModel$toMemberList$1) {
            createGroupViewModel$toMemberList$1 = (CreateGroupViewModel$toMemberList$1) continuation;
            int i = createGroupViewModel$toMemberList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createGroupViewModel$toMemberList$1.label = i - Integer.MIN_VALUE;
            } else {
                createGroupViewModel$toMemberList$1 = new CreateGroupViewModel$toMemberList$1(this, continuation);
            }
        }
        Object objWithContext = createGroupViewModel$toMemberList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = createGroupViewModel$toMemberList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.AuCTel;
                CreateGroupViewModel$toMemberList$2$1 createGroupViewModel$toMemberList$2$1 = new CreateGroupViewModel$toMemberList$2$1(list, this, null);
                createGroupViewModel$toMemberList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, createGroupViewModel$toMemberList$2$1, createGroupViewModel$toMemberList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) objWithContext);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        C44124sEe.AYXKKw("Failed to load member list", thM7380exceptionOrNullimpl);
        return yDY.AhwBna();
    }

    public final List<CreateGroupDisplayItem> copydefault(String str, String str2, boolean z, boolean z2, List<CreateGroupDisplayItem.MemberItem> list) {
        CreateGroupDisplayItem[] createGroupDisplayItemArr = new CreateGroupDisplayItem[6];
        createGroupDisplayItemArr[0] = new CreateGroupDisplayItem.GroupProfileHeader(str, str2);
        createGroupDisplayItemArr[1] = new CreateGroupDisplayItem.Description(this.EZpvd.getValue(), z);
        createGroupDisplayItemArr[2] = (this.fARcdN.AhwBna() && this.fARcdN.EZpvd()) ? new CreateGroupDisplayItem.SwitchOption(CreateGroupDisplayItem.OptionKey.PUBLIC_GROUP, z) : null;
        createGroupDisplayItemArr[3] = new CreateGroupDisplayItem.SwitchOption(CreateGroupDisplayItem.OptionKey.RESTRICTED_GROUP, z2);
        createGroupDisplayItemArr[4] = new CreateGroupDisplayItem.ActionOption(CreateGroupDisplayItem.OptionKey.INVITE_PERMISSIONS);
        createGroupDisplayItemArr[5] = true ^ list.isEmpty() ? new CreateGroupDisplayItem.MemberCount(list.size()) : null;
        return CollectionsKt___CollectionsKt.djBIcL((Collection) yDY.valueOf(createGroupDisplayItemArr), (Iterable) list);
    }

    public final void KWHzl(@NotNull CreateGroupDisplayItem.OptionKey optionKey, boolean z) {
        Intrinsics.checkNotNullParameter(optionKey, "");
        int i = StateListAnimator.EZpvd[optionKey.ordinal()];
        if (i == 1) {
            this.fIwbmz.set("KEY_IS_PUBLIC_GROUP", Boolean.valueOf(z));
            this.fIwbmz.set("KEY_INVITE_PERMISSIONS", InvitePermissions.copy$default(this.valueOf.getValue(), false, z, false, 5, null));
        } else {
            if (i == 2) {
                this.fIwbmz.set("KEY_IS_RESTRICTED_GROUP", Boolean.valueOf(z));
                return;
            }
            C44124sEe.imLogGroup$default("Unhandled switch option key: " + optionKey, null, 2, null);
        }
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreateGroupViewModel$createGroup$1(this, null), 3, null);
    }

    public static /* synthetic */ Object handleCreateFailure$default(CreateGroupViewModel createGroupViewModel, Throwable th, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return createGroupViewModel.KWHzl(th, num, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Throwable th, Integer num, Continuation<? super Unit> continuation) throws Throwable {
        CreateGroupViewModel$handleCreateFailure$1 createGroupViewModel$handleCreateFailure$1;
        Application stateListAnimator;
        CreateGroupViewModel createGroupViewModel;
        if (continuation instanceof CreateGroupViewModel$handleCreateFailure$1) {
            createGroupViewModel$handleCreateFailure$1 = (CreateGroupViewModel$handleCreateFailure$1) continuation;
            int i = createGroupViewModel$handleCreateFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createGroupViewModel$handleCreateFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                createGroupViewModel$handleCreateFailure$1 = new CreateGroupViewModel$handleCreateFailure$1(this, continuation);
            }
        }
        Object obj = createGroupViewModel$handleCreateFailure$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = createGroupViewModel$handleCreateFailure$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            int code = GroupActionError.IM_GROUP_MAX_PUBLIC_GROUP_CREATED_ERROR.getCode();
            if (num != null && num.intValue() == code) {
                stateListAnimator = Application.TaskDescription.EZpvd;
            } else {
                int code2 = GroupActionError.ORBIT_PROFILE_EDIT.getCode();
                if (num != null && num.intValue() == code2) {
                    this.fIwbmz.set("KEY_HIDE_GUIDELINE", C56443yFo.KWHzl(true));
                    stateListAnimator = Application.Activity.AEQbTJ;
                } else {
                    stateListAnimator = new Application.StateListAnimator(th);
                }
            }
            MutableSharedFlow<Application> mutableSharedFlow = this.gEmmrt;
            createGroupViewModel$handleCreateFailure$1.L$0 = this;
            createGroupViewModel$handleCreateFailure$1.label = 1;
            if (mutableSharedFlow.emit(stateListAnimator, createGroupViewModel$handleCreateFailure$1) == objCopydefault) {
                return objCopydefault;
            }
            createGroupViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            createGroupViewModel = (CreateGroupViewModel) createGroupViewModel$handleCreateFailure$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow<Activity> mutableStateFlow = createGroupViewModel.fetchVPNInfo;
        Activity.ActionBar actionBar = Activity.ActionBar.OLrzqt;
        createGroupViewModel$handleCreateFailure$1.L$0 = null;
        createGroupViewModel$handleCreateFailure$1.label = 2;
        if (mutableStateFlow.emit(actionBar, createGroupViewModel$handleCreateFailure$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
