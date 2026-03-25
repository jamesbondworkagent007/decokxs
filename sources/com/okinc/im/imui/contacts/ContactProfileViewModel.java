package com.okinc.im.imui.contacts;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.p2p.api.OTCService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC58185ywX;
import o.C35182nqW;
import o.C35399nuc;
import o.C35748oCf;
import o.C35859oGi;
import o.C35951oJt;
import o.C43251rlk;
import o.C44269sJo;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC35180nqU;
import o.InterfaceC56445yFq;
import o.oDB;
import o.oDP;
import o.oDT;
import o.oDZ;
import o.tWL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<Activity> AEQbTJ;
    public final oDT AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final OTCService AkhnZx;
    public final SavedStateHandle DbNXlk;
    public final C35748oCf EZpvd;
    public final MutableStateFlow<StateListAnimator> KWHzl;
    public final oDP OLrzqt;
    public final oDZ djBIcL;
    public final C44269sJo ejfBZ;
    public final StateFlow<StateListAnimator> fetchVPNInfo;
    public final InterfaceC35180nqU gEmmrt;
    public final SharedFlow<Activity> isConnected;
    public final oDB valueOf;
    public final C35859oGi values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> valueOf() {
        return this.fetchVPNInfo;
    }

    @yCM
    public ContactProfileViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SavedStateHandle savedStateHandle, @NotNull C35859oGi c35859oGi, @NotNull oDZ odz, @NotNull C35748oCf c35748oCf, InterfaceC35180nqU interfaceC35180nqU, OTCService oTCService, @NotNull oDB odb, @NotNull oDP odp, @NotNull oDT odt, @NotNull C44269sJo c44269sJo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(odz, "");
        Intrinsics.checkNotNullParameter(c35748oCf, "");
        Intrinsics.checkNotNullParameter(odb, "");
        Intrinsics.checkNotNullParameter(odp, "");
        Intrinsics.checkNotNullParameter(odt, "");
        Intrinsics.checkNotNullParameter(c44269sJo, "");
        this.AhwBna = coroutineDispatcher;
        this.DbNXlk = savedStateHandle;
        this.values = c35859oGi;
        this.djBIcL = odz;
        this.EZpvd = c35748oCf;
        this.gEmmrt = interfaceC35180nqU;
        this.AkhnZx = oTCService;
        this.valueOf = odb;
        this.OLrzqt = odp;
        this.AYXKKw = odt;
        this.ejfBZ = c44269sJo;
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.TaskDescription.AEQbTJ);
        this.KWHzl = MutableStateFlow;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.contacts.ContactProfileViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AkhnZx() {
        this.DbNXlk.set("info", null);
        OLrzqt();
    }

    public final String AEQbTJ() {
        return (String) this.DbNXlk.get("conversationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OKConversation DbNXlk() {
        return (OKConversation) this.DbNXlk.get("conversation");
    }

    public final RelationInfo AhwBna() {
        return (RelationInfo) this.DbNXlk.get("info");
    }

    public final String KWHzl() {
        String str = (String) this.DbNXlk.get("id");
        return str == null ? "" : str;
    }

    public final ChatOrigin djBIcL() {
        ChatOrigin chatOriginKWHzl;
        String str = (String) this.DbNXlk.get("origin");
        return (str == null || (chatOriginKWHzl = C35182nqW.KWHzl(str)) == null) ? ChatOrigin.UNKNOWN : chatOriginKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupInfo ejfBZ() {
        return (GroupInfo) this.DbNXlk.get("KEY_GROUP_INFO");
    }

    public final Boolean values() {
        return (Boolean) this.DbNXlk.get("KEY_IS_PAYING_MEMBER");
    }

    public final GroupInfo copydefault() {
        return ejfBZ();
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new ContactProfileViewModel$getContactProfile$1(this, null), 2, null);
    }

    public final Object KWHzl(String str, String str2, Continuation<? super RelationInfo> continuation) {
        return BuildersKt.withContext(this.AhwBna, new ContactProfileViewModel$getRelationInfo$2(this, str, str2, null), continuation);
    }

    public final Object AEQbTJ(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.AhwBna, new ContactProfileViewModel$refreshConversation$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final List<C35951oJt> KWHzl(boolean z, RelationInfo relationInfo, boolean z2) {
        tWL twl;
        ArrayList arrayList = new ArrayList();
        if (!z2 && KWHzl(relationInfo)) {
            arrayList.add(new C35951oJt(C35399nuc.LoaderManager.UlpNxW, C52761wXj.TaskDescription.Qsauvs, ProfileQuickAction.SEND_MESSAGE.ordinal(), "IMContactsInfo_Full_Button_Click"));
        }
        if (this.EZpvd.KWHzl() && relationInfo.isFriend()) {
            arrayList.add(new C35951oJt(C35399nuc.LoaderManager.DztXDE, C52761wXj.TaskDescription.aJZHYI, ProfileQuickAction.PAY.ordinal(), "IMProfile_Button_Pay_Click"));
        }
        if (z && !relationInfo.isFriend() && EZpvd()) {
            arrayList.add(new C35951oJt(C35399nuc.LoaderManager.wlaJM, C35399nuc.ActionBar.uzCIH, ProfileQuickAction.ADD_FRIEND.ordinal(), "IMContactsInfo_Full_Button_Click"));
        }
        if (Intrinsics.EZpvd(relationInfo.getAllowPlanetProfile(), Boolean.TRUE) && (twl = (tWL) C43251rlk.OLrzqt(tWL.class)) != null && twl.AhwBna()) {
            arrayList.add(new C35951oJt(C35399nuc.LoaderManager.hQufeQ, C52761wXj.TaskDescription.UimiPOhkCVbT, ProfileQuickAction.VIEW_PROFILE.ordinal(), "IMProfile_Button_Profile_Click"));
        }
        return arrayList;
    }

    public final boolean EZpvd() {
        return Intrinsics.EZpvd(this.DbNXlk.get("show_messages_settings"), Boolean.TRUE);
    }

    public final boolean KWHzl(RelationInfo relationInfo) {
        Object obj = this.DbNXlk.get("show_messages_settings");
        Boolean bool = Boolean.TRUE;
        boolean zEZpvd = Intrinsics.EZpvd(obj, bool);
        return (zEZpvd && Intrinsics.EZpvd(relationInfo.isAllowSendMessage(), bool)) || (!zEZpvd && Intrinsics.EZpvd(relationInfo.isAllowSingleChatInGroup(), bool));
    }

    public final boolean OLrzqt(String str) {
        Object objM7377constructorimpl;
        AbstractC58185ywX<Boolean> abstractC58185ywXShowReportButton;
        try {
            Result.Application application = Result.Companion;
            OTCService oTCService = this.AkhnZx;
            objM7377constructorimpl = Result.m7377constructorimpl((oTCService == null || (abstractC58185ywXShowReportButton = oTCService.showReportButton(str)) == null) ? null : abstractC58185ywXShowReportButton.AEQbTJ());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Boolean bool = (Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void isConnected() {
        RelationInfo relationInfoAhwBna;
        String contactsId;
        Boolean boolValues;
        PaymentRequiredStatus paymentRequiredStatus;
        String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null || (relationInfoAhwBna = AhwBna()) == null || (contactsId = relationInfoAhwBna.getContactsId()) == null || (boolValues = values()) == null) {
            return;
        }
        if (boolValues.booleanValue()) {
            paymentRequiredStatus = PaymentRequiredStatus.NOT_REQUIRED;
        } else {
            paymentRequiredStatus = PaymentRequiredStatus.REQUIRED;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContactProfileViewModel$updatePaymentRequiredStatus$1(this, strAEQbTJ, contactsId, paymentRequiredStatus, null), 3, null);
    }

    public final void AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContactProfileViewModel$actionWithConversation$1(this, actionBar, null), 3, null);
    }

    public final void AEQbTJ(@NotNull UserInfoAction userInfoAction) {
        Intrinsics.checkNotNullParameter(userInfoAction, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContactProfileViewModel$actionWithUserInfo$1(this, userInfoAction, null), 3, null);
    }

    public final void EZpvd(@NotNull GroupInfoAction groupInfoAction) {
        Intrinsics.checkNotNullParameter(groupInfoAction, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContactProfileViewModel$actionWithGroupInfo$1(groupInfoAction, this, null), 3, null);
    }

    public final boolean AYXKKw() {
        Integer orbitStatus;
        Integer orbitStatus2;
        RelationInfo relationInfoAhwBna = AhwBna();
        if (relationInfoAhwBna != null && (orbitStatus2 = relationInfoAhwBna.getOrbitStatus()) != null && orbitStatus2.intValue() == 1) {
            return true;
        }
        RelationInfo relationInfoAhwBna2 = AhwBna();
        return (relationInfoAhwBna2 == null || (orbitStatus = relationInfoAhwBna2.getOrbitStatus()) == null || orbitStatus.intValue() != 2) ? false : true;
    }

    public final boolean fetchVPNInfo() {
        GroupInfo groupInfoEjfBZ = ejfBZ();
        if (groupInfoEjfBZ != null) {
            Integer type = groupInfoEjfBZ.getType();
            int value = GroupTagType.PAID_GROUP.getValue();
            if (type != null && type.intValue() == value) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProfileQuickAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ProfileQuickAction[] $VALUES;
        public static final Activity Companion;
        public static final ProfileQuickAction SEND_MESSAGE = new ProfileQuickAction("SEND_MESSAGE", 0);
        public static final ProfileQuickAction PAY = new ProfileQuickAction("PAY", 1);
        public static final ProfileQuickAction ADD_FRIEND = new ProfileQuickAction("ADD_FRIEND", 2);
        public static final ProfileQuickAction VIEW_PROFILE = new ProfileQuickAction("VIEW_PROFILE", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ProfileQuickAction[] $values() {
            return new ProfileQuickAction[]{SEND_MESSAGE, PAY, ADD_FRIEND, VIEW_PROFILE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ProfileQuickAction> getEntries() {
            return $ENTRIES;
        }

        private ProfileQuickAction(String str, int i) {
        }

        static {
            ProfileQuickAction[] profileQuickActionArr$values = $values();
            $VALUES = profileQuickActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(profileQuickActionArr$values);
            Companion = new Activity(null);
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.contacts.ContactProfileViewModel.ProfileQuickAction.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final ProfileQuickAction AEQbTJ(int i) {
                for (ProfileQuickAction profileQuickAction : ProfileQuickAction.values()) {
                    if (profileQuickAction.ordinal() == i) {
                        return profileQuickAction;
                    }
                }
                return null;
            }
        }

        public static ProfileQuickAction valueOf(String str) {
            return (ProfileQuickAction) Enum.valueOf(ProfileQuickAction.class, str);
        }

        public static ProfileQuickAction[] values() {
            return (ProfileQuickAction[]) $VALUES.clone();
        }
    }

    public interface ActionBar {

        public static final class Activity implements ActionBar {
            public static final Activity copydefault = new Activity();

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.contacts.ContactProfileViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0401ActionBar implements ActionBar {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0401ActionBar copy$default(C0401ActionBar c0401ActionBar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = c0401ActionBar.EZpvd;
                }
                return c0401ActionBar.AEQbTJ(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0401ActionBar AEQbTJ(boolean z) {
                return new C0401ActionBar(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0401ActionBar) && this.EZpvd == ((C0401ActionBar) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdateMute(isMute=" + this.EZpvd + ")";
            }

            public C0401ActionBar(boolean z) {
                this.EZpvd = z;
            }
        }

        public static final class Application implements ActionBar {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = application.EZpvd;
                }
                return application.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(boolean z) {
                return new Application(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && this.EZpvd == ((Application) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdatePin(isPin=" + this.EZpvd + ")";
            }

            public Application(boolean z) {
                this.EZpvd = z;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UserInfoAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UserInfoAction[] $VALUES;
        public static final UserInfoAction SHOW_AVATAR = new UserInfoAction("SHOW_AVATAR", 0);
        public static final UserInfoAction EDIT_ALIAS = new UserInfoAction("EDIT_ALIAS", 1);
        public static final UserInfoAction BLOCK_CONTACT = new UserInfoAction("BLOCK_CONTACT", 2);
        public static final UserInfoAction REMOVE_CONTACT = new UserInfoAction("REMOVE_CONTACT", 3);
        public static final UserInfoAction REPORT = new UserInfoAction("REPORT", 4);
        public static final UserInfoAction USER_VIP_PROFILE = new UserInfoAction("USER_VIP_PROFILE", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UserInfoAction[] $values() {
            return new UserInfoAction[]{SHOW_AVATAR, EDIT_ALIAS, BLOCK_CONTACT, REMOVE_CONTACT, REPORT, USER_VIP_PROFILE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UserInfoAction> getEntries() {
            return $ENTRIES;
        }

        private UserInfoAction(String str, int i) {
        }

        static {
            UserInfoAction[] userInfoActionArr$values = $values();
            $VALUES = userInfoActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(userInfoActionArr$values);
        }

        public static UserInfoAction valueOf(String str) {
            return (UserInfoAction) Enum.valueOf(UserInfoAction.class, str);
        }

        public static UserInfoAction[] values() {
            return (UserInfoAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class GroupInfoAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ GroupInfoAction[] $VALUES;
        public static final GroupInfoAction REMOVE_MEMBER = new GroupInfoAction("REMOVE_MEMBER", 0);
        public static final GroupInfoAction CHANGE_PAID_MEMBER_TYPE = new GroupInfoAction("CHANGE_PAID_MEMBER_TYPE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ GroupInfoAction[] $values() {
            return new GroupInfoAction[]{REMOVE_MEMBER, CHANGE_PAID_MEMBER_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<GroupInfoAction> getEntries() {
            return $ENTRIES;
        }

        private GroupInfoAction(String str, int i) {
        }

        static {
            GroupInfoAction[] groupInfoActionArr$values = $values();
            $VALUES = groupInfoActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(groupInfoActionArr$values);
        }

        public static GroupInfoAction valueOf(String str) {
            return (GroupInfoAction) Enum.valueOf(GroupInfoAction.class, str);
        }

        public static GroupInfoAction[] values() {
            return (GroupInfoAction[]) $VALUES.clone();
        }
    }

    public interface StateListAnimator {

        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            private TaskDescription() {
            }
        }

        public static final class Activity implements StateListAnimator {
            public final List<C35951oJt> AEQbTJ;
            public final boolean AYXKKw;
            public final Boolean AhwBna;
            public final boolean EZpvd;
            public final OKConversation KWHzl;
            public final boolean OLrzqt;
            public final boolean copydefault;
            public final boolean djBIcL;
            public final ChatOrigin gEmmrt;
            public final RelationInfo valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull ChatOrigin chatOrigin, @NotNull RelationInfo relationInfo, OKConversation oKConversation, boolean z, boolean z2, @NotNull List<C35951oJt> list, boolean z3, Boolean bool, boolean z4, boolean z5) {
                Intrinsics.checkNotNullParameter(chatOrigin, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(chatOrigin, relationInfo, oKConversation, z, z2, list, z3, bool, z4, z5);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChatOrigin AYXKKw() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AhwBna() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKConversation OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<C35951oJt> copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo djBIcL() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return this.gEmmrt == activity.gEmmrt && Intrinsics.EZpvd(this.valueOf, activity.valueOf) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AYXKKw == activity.AYXKKw && this.EZpvd == activity.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && this.copydefault == activity.copydefault && Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && this.OLrzqt == activity.OLrzqt && this.djBIcL == activity.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean gEmmrt() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.gEmmrt.hashCode();
                int iHashCode2 = this.valueOf.hashCode();
                OKConversation oKConversation = this.KWHzl;
                int iHashCode3 = oKConversation == null ? 0 : oKConversation.hashCode();
                int iHashCode4 = Boolean.hashCode(this.AYXKKw);
                int iHashCode5 = Boolean.hashCode(this.EZpvd);
                int iHashCode6 = this.AEQbTJ.hashCode();
                int iHashCode7 = Boolean.hashCode(this.copydefault);
                Boolean bool = this.AhwBna;
                return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.djBIcL);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowProfile(origin=" + this.gEmmrt + ", userInfo=" + this.valueOf + ", conversation=" + this.KWHzl + ", isFriend=" + this.AYXKKw + ", canReport=" + this.EZpvd + ", actionList=" + this.AEQbTJ + ", canManageMember=" + this.copydefault + ", isPayingMember=" + this.AhwBna + ", canRemoveMember=" + this.OLrzqt + ", isVipUserMode=" + this.djBIcL + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean valueOf() {
                return this.djBIcL;
            }

            public Activity(@NotNull ChatOrigin chatOrigin, @NotNull RelationInfo relationInfo, OKConversation oKConversation, boolean z, boolean z2, @NotNull List<C35951oJt> list, boolean z3, Boolean bool, boolean z4, boolean z5) {
                Intrinsics.checkNotNullParameter(chatOrigin, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.gEmmrt = chatOrigin;
                this.valueOf = relationInfo;
                this.KWHzl = oKConversation;
                this.AYXKKw = z;
                this.EZpvd = z2;
                this.AEQbTJ = list;
                this.copydefault = z3;
                this.AhwBna = bool;
                this.OLrzqt = z4;
                this.djBIcL = z5;
            }
        }

        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
            }
        }
    }

    public interface Activity {

        public static final class PendingIntent implements Activity {
            public static final int copydefault = RelationInfo.$stable;
            public final RelationInfo AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = pendingIntent.AEQbTJ;
                }
                return pendingIntent.AEQbTJ(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent AEQbTJ(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new PendingIntent(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.AEQbTJ, ((PendingIntent) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowAvatar(userInfo=" + this.AEQbTJ + ")";
            }

            public PendingIntent(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.AEQbTJ = relationInfo;
            }
        }

        public static final class LoaderManager implements Activity {
            public static final int KWHzl = OKConversation.$stable;
            public final OKConversation EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, OKConversation oKConversation, int i, Object obj) {
                if ((i & 1) != 0) {
                    oKConversation = loaderManager.EZpvd;
                }
                return loaderManager.copydefault(oKConversation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKConversation AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager copydefault(@NotNull OKConversation oKConversation) {
                Intrinsics.checkNotNullParameter(oKConversation, "");
                return new LoaderManager(oKConversation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.EZpvd, ((LoaderManager) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Search(conversation=" + this.EZpvd + ")";
            }

            public LoaderManager(@NotNull OKConversation oKConversation) {
                Intrinsics.checkNotNullParameter(oKConversation, "");
                this.EZpvd = oKConversation;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.contacts.ContactProfileViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0402Activity implements Activity {
            public static final int AEQbTJ = RelationInfo.$stable;
            public final RelationInfo KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0402Activity copy$default(C0402Activity c0402Activity, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = c0402Activity.KWHzl;
                }
                return c0402Activity.EZpvd(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0402Activity EZpvd(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new C0402Activity(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0402Activity) && Intrinsics.EZpvd(this.KWHzl, ((C0402Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BlockContact(userInfo=" + this.KWHzl + ")";
            }

            public C0402Activity(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.KWHzl = relationInfo;
            }
        }

        public static final class StateListAnimator implements Activity {
            public static final int OLrzqt = RelationInfo.$stable;
            public final RelationInfo EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = stateListAnimator.EZpvd;
                }
                return stateListAnimator.EZpvd(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new StateListAnimator(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RemoveContact(userInfo=" + this.EZpvd + ")";
            }

            public StateListAnimator(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.EZpvd = relationInfo;
            }
        }

        public static final class Application implements Activity {
            public static final int AEQbTJ = RelationInfo.$stable;
            public final RelationInfo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = application.copydefault;
                }
                return application.AEQbTJ(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new Application(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo KWHzl() {
                return this.copydefault;
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
                return "EditAlias(userInfo=" + this.copydefault + ")";
            }

            public Application(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.copydefault = relationInfo;
            }
        }

        public static final class Dialog implements Activity {
            public static final int EZpvd = RelationInfo.$stable;
            public final RelationInfo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = dialog.copydefault;
                }
                return dialog.EZpvd(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog EZpvd(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new Dialog(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd(this.copydefault, ((Dialog) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Report(userInfo=" + this.copydefault + ")";
            }

            public Dialog(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.copydefault = relationInfo;
            }
        }

        public static final class VoiceInteractor implements Activity {
            public static final int EZpvd = RelationInfo.$stable;
            public final RelationInfo AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = voiceInteractor.AEQbTJ;
                }
                return voiceInteractor.OLrzqt(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final VoiceInteractor OLrzqt(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new VoiceInteractor(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VoiceInteractor) && Intrinsics.EZpvd(this.AEQbTJ, ((VoiceInteractor) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UerVipProfile(userInfo=" + this.AEQbTJ + ")";
            }

            public VoiceInteractor(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.AEQbTJ = relationInfo;
            }
        }

        public static final class ActionBar implements Activity {
            public final long AEQbTJ;
            public final boolean EZpvd;
            public final long KWHzl;
            public final GroupBillingType OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, long j, long j2, boolean z, GroupBillingType groupBillingType, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = actionBar.KWHzl;
                }
                long j3 = j;
                if ((i & 2) != 0) {
                    j2 = actionBar.AEQbTJ;
                }
                long j4 = j2;
                if ((i & 4) != 0) {
                    z = actionBar.EZpvd;
                }
                boolean z2 = z;
                if ((i & 8) != 0) {
                    groupBillingType = actionBar.OLrzqt;
                }
                return actionBar.EZpvd(j3, j4, z2, groupBillingType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(long j, long j2, boolean z, @NotNull GroupBillingType groupBillingType) {
                Intrinsics.checkNotNullParameter(groupBillingType, "");
                return new ActionBar(j, j2, z, groupBillingType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupBillingType OLrzqt() {
                return this.OLrzqt;
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
                return this.KWHzl == actionBar.KWHzl && this.AEQbTJ == actionBar.AEQbTJ && this.EZpvd == actionBar.EZpvd && this.OLrzqt == actionBar.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Long.hashCode(this.KWHzl) * 31) + Long.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ChangePaidMemberType(groupId=" + this.KWHzl + ", memberId=" + this.AEQbTJ + ", paymentRequired=" + this.EZpvd + ", groupBillingType=" + this.OLrzqt + ")";
            }

            public ActionBar(long j, long j2, boolean z, @NotNull GroupBillingType groupBillingType) {
                Intrinsics.checkNotNullParameter(groupBillingType, "");
                this.KWHzl = j;
                this.AEQbTJ = j2;
                this.EZpvd = z;
                this.OLrzqt = groupBillingType;
            }
        }

        public static final class TaskDescription implements Activity {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
            }
        }

        public static final class Fragment implements Activity {
            public static final int KWHzl = RelationInfo.$stable | GroupInfo.$stable;
            public final RelationInfo AEQbTJ;
            public final GroupInfo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Fragment copy$default(Fragment fragment, GroupInfo groupInfo, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    groupInfo = fragment.OLrzqt;
                }
                if ((i & 2) != 0) {
                    relationInfo = fragment.AEQbTJ;
                }
                return fragment.AEQbTJ(groupInfo, relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment AEQbTJ(@NotNull GroupInfo groupInfo, @NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new Fragment(groupInfo, relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupInfo OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fragment)) {
                    return false;
                }
                Fragment fragment = (Fragment) obj;
                return Intrinsics.EZpvd(this.OLrzqt, fragment.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, fragment.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RemoveMember(groupInfo=" + this.OLrzqt + ", userInfo=" + this.AEQbTJ + ")";
            }

            public Fragment(@NotNull GroupInfo groupInfo, @NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.OLrzqt = groupInfo;
                this.AEQbTJ = relationInfo;
            }
        }

        public static final class TaskStackBuilder implements Activity {
            public static final TaskStackBuilder copydefault = new TaskStackBuilder();

            private TaskStackBuilder() {
            }
        }

        public static final class FragmentManager implements Activity {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fragmentManager.OLrzqt;
                }
                return fragmentManager.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentManager copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new FragmentManager(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FragmentManager) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((FragmentManager) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorMessage(message=" + this.OLrzqt + ")";
            }

            public FragmentManager(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }
}
