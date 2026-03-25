package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32989mnw;
import o.oDR;
import o.oDU;
import o.oDW;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectRelationViewModel extends ViewModel {
    public final oDW AYXKKw;
    public final oDR AhwBna;
    public final LiveData<Integer> AkhnZx;
    public final SavedStateHandle DbNXlk;
    public final MutableLiveData<Unit> EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<C32989mnw<Application>> copydefault;
    public final MutableLiveData<Integer> djBIcL;
    public SelectionActionType fARcdN;
    public final LiveData<Unit> fetchVPNInfo;
    public final oDU gEmmrt;
    public String isConnected;
    public final MutableStateFlow<List<String>> valueOf;
    public final LiveData<Boolean> values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SelectionActionType.values().length];
            try {
                iArr[SelectionActionType.CREATE_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectionActionType.CREATE_PREMIUM_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectionActionType.ADD_MEMBER_TO_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionActionType AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> isConnected() {
        return this.OLrzqt;
    }

    @yCM
    public SelectRelationViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDR odr, @NotNull oDU odu, @NotNull oDW odw) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odr, "");
        Intrinsics.checkNotNullParameter(odu, "");
        Intrinsics.checkNotNullParameter(odw, "");
        this.DbNXlk = savedStateHandle;
        this.AhwBna = odr;
        this.gEmmrt = odu;
        this.AYXKKw = odw;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.djBIcL = mutableLiveData;
        this.AkhnZx = mutableLiveData;
        this.copydefault = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.valueOf = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.fARcdN = SelectionActionType.UNKNOWN;
        this.OLrzqt = new MutableLiveData<>();
        this.values = Transformations.map(djBIcL(), new Function1() { // from class: o.otR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SelectRelationViewModel.AEQbTJ(this.OLrzqt, (java.util.List) obj));
            }
        });
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.fetchVPNInfo = mutableLiveData2;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends Application {
            public final boolean AEQbTJ;
            public final List<String> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel$Application$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, List list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = stateListAnimator.OLrzqt;
                }
                if ((i & 2) != 0) {
                    z = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.copydefault(list, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull List<String> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return new StateListAnimator(list, z);
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
                return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && this.AEQbTJ == stateListAnimator.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartCreateGroupFlow(selectedList=" + this.OLrzqt + ", isCreatePremiumGroup=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull List<String> list, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.OLrzqt = list;
                this.AEQbTJ = z;
            }
        }

        private Application() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends Application {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                return activity.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Toast(message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0477Application extends Application {
            public static final int copydefault = GroupAddMembersResult.$stable;
            public final GroupAddMembersResult OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0477Application copy$default(C0477Application c0477Application, GroupAddMembersResult groupAddMembersResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    groupAddMembersResult = c0477Application.OLrzqt;
                }
                return c0477Application.EZpvd(groupAddMembersResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupAddMembersResult AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0477Application EZpvd(@NotNull GroupAddMembersResult groupAddMembersResult) {
                Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
                return new C0477Application(groupAddMembersResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0477Application) && Intrinsics.EZpvd(this.OLrzqt, ((C0477Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "HandleAddMembersFailure(result=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0477Application(@NotNull GroupAddMembersResult groupAddMembersResult) {
                super(null);
                Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
                this.OLrzqt = groupAddMembersResult;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Application {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.KWHzl;
                }
                return taskDescription.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartGroupChat(groupId=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }
    }

    public final Boolean EZpvd() {
        return (Boolean) this.DbNXlk.get("KEY_ADD_NON_PAYING_MEMBER");
    }

    public final LiveData<List<String>> djBIcL() {
        return FlowLiveDataConversions.asLiveData$default(this.valueOf, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final boolean AEQbTJ(SelectRelationViewModel selectRelationViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return selectRelationViewModel.EZpvd((List<String>) list);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(List<String> list) {
        boolean z = true;
        if (ActionBar.KWHzl[this.fARcdN.ordinal()] == 1) {
            Integer value = this.AkhnZx.getValue();
            Intrinsics.copydefault(value);
            int iIntValue = value.intValue();
            int size = list.size();
            if (1 > size || size > iIntValue) {
                z = false;
            }
        } else if (!list.isEmpty()) {
            int size2 = list.size();
            Integer value2 = this.AkhnZx.getValue();
            Intrinsics.copydefault(value2);
            if (size2 > value2.intValue()) {
            }
        }
        pUU.KWHzl("SelectRelationViewModel", "isNextActionAllowed:" + z);
        return z;
    }

    public final void KWHzl(@NotNull SelectionActionType selectionActionType, String str) {
        Intrinsics.checkNotNullParameter(selectionActionType, "");
        pUU.AEQbTJ("Init with selectionActionType:" + selectionActionType + ", groupId:" + str + ", selectedList:" + djBIcL());
        this.fARcdN = selectionActionType;
        this.isConnected = str;
        OLrzqt(str);
    }

    public final void OLrzqt(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("SelectRelationViewModel", "Selected List updated, size:" + list.size());
        this.valueOf.setValue(list);
        this.EZpvd.setValue(Unit.INSTANCE);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectRelationViewModel$addMembersToGroup$1(this, null), 3, null);
    }

    public final void valueOf() {
        int i = ActionBar.KWHzl[this.fARcdN.ordinal()];
        if (i == 1) {
            List<String> value = djBIcL().getValue();
            if (value != null) {
                pUU.KWHzl("SelectRelationViewModel", "Handle next button for create group, selectedList size:" + value.size());
                this.copydefault.setValue(new C32989mnw<>(new Application.StateListAnimator(value, false)));
                return;
            }
            pUU.KWHzl("SelectRelationViewModel", "Handle next button for create group, selected list null");
            return;
        }
        if (i != 2) {
            if (i == 3) {
                pUU.KWHzl("SelectRelationViewModel", "Handle next button for adding member to group");
                copydefault();
                return;
            } else {
                pUU.KWHzl("SelectRelationViewModel", "Handle next button with unknown type");
                return;
            }
        }
        List<String> value2 = djBIcL().getValue();
        if (value2 != null) {
            pUU.KWHzl("SelectRelationViewModel", "Handle next button for create premium group, selectedList size:" + value2.size());
            this.copydefault.setValue(new C32989mnw<>(new Application.StateListAnimator(value2, true)));
            return;
        }
        pUU.KWHzl("SelectRelationViewModel", "Handle next button for create premium group, selected list null");
    }

    public final void AhwBna() {
        this.copydefault.setValue(new C32989mnw<>(new Application.StateListAnimator(yDY.AhwBna(), this.fARcdN == SelectionActionType.CREATE_PREMIUM_GROUP)));
    }

    private final void OLrzqt(String str) {
        this.djBIcL.setValue(3000);
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectRelationViewModel$loadMaxNumberAsync$1(this, str, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectRelationViewModel$loadMaxNumberAsync$2(this, null), 3, null);
        }
        pUU.EZpvd("SelectRelationViewModel", "Get max number: " + this.djBIcL.getValue());
    }

    public final void EZpvd(boolean z) {
        this.OLrzqt.setValue(Boolean.valueOf(z));
    }
}
