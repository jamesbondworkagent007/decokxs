package com.okinc.im.imui.group.join.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.okimcore.model.im.DisbandGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.UpdateGroupMemberMessage;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.TransactionStatus;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC44414sOy;
import o.C33070mpX;
import o.C34165nTv;
import o.C35399nuc;
import o.C35864oGn;
import o.C37721ozF;
import o.C43251rlk;
import o.C44124sEe;
import o.C44157sFk;
import o.C44270sJp;
import o.C44373sNk;
import o.C44467sQx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC31257lqc;
import o.InterfaceC44293sKl;
import o.InterfaceC56551yJo;
import o.nTF;
import o.nTK;
import o.nTL;
import o.nTM;
import o.nTN;
import o.oDD;
import o.oDE;
import o.oDL;
import o.oDN;
import o.oDZ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MutableSharedFlow<StateListAnimator> AEQbTJ;
    public final MutableStateFlow<nTN> AYXKKw;
    public final MutableSharedFlow<Fragment> AhwBna;
    public final oDZ AkhnZx;
    public final PendingIntent AuCTel;
    public final oDN AuCTelauCTel;
    public final StateFlow<nTN> AubY;
    public final List<InterfaceC56551yJo<? extends GroupSystemMessage>> DbNXlk;
    public final MutableSharedFlow<ActionBar> KWHzl;
    public final MutableSharedFlow<TaskDescription> OLrzqt;
    public final MutableSharedFlow<Application> copydefault;
    public final oDE djBIcL;
    public final C35864oGn ejfBZ;
    public final SharedFlow<Application> fARcdN;
    public final oDD fIwbmz;
    public final InterfaceC44293sKl fJNWhG;
    public final C34165nTv fetchVPNInfo;
    public final SharedFlow<ActionBar> gEmmrt;
    public final SavedStateHandle getFieldNames;
    public final oDL getNewProxyInstance;
    public final C44270sJp hDKMBd;
    public final SharedFlow<StateListAnimator> isConnected;
    public final SharedFlow<Dialog> iwGUEr;
    public final SharedFlow<Fragment> uzCIH;
    public final MutableSharedFlow<Dialog> valueOf;
    public final SharedFlow<TaskDescription> values;

    public final /* synthetic */ class FragmentManager {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionStatus.values().length];
            try {
                iArr[TransactionStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionStatus.FROZEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionStatus.REFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransactionStatus.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransactionStatus.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StateListAnimator> KWHzl() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<nTN> fetchVPNInfo() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Fragment> valueOf() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Dialog> values() {
        return this.iwGUEr;
    }

    @yCM
    public JoinGroupViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDL odl, @NotNull oDE ode, @NotNull oDZ odz, @NotNull oDN odn, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull oDD odd, @NotNull C34165nTv c34165nTv, @NotNull C44270sJp c44270sJp, @NotNull C35864oGn c35864oGn) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odl, "");
        Intrinsics.checkNotNullParameter(ode, "");
        Intrinsics.checkNotNullParameter(odz, "");
        Intrinsics.checkNotNullParameter(odn, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(odd, "");
        Intrinsics.checkNotNullParameter(c34165nTv, "");
        Intrinsics.checkNotNullParameter(c44270sJp, "");
        Intrinsics.checkNotNullParameter(c35864oGn, "");
        this.getFieldNames = savedStateHandle;
        this.getNewProxyInstance = odl;
        this.djBIcL = ode;
        this.AkhnZx = odz;
        this.AuCTelauCTel = odn;
        this.fJNWhG = interfaceC44293sKl;
        this.fIwbmz = odd;
        this.fetchVPNInfo = c34165nTv;
        this.hDKMBd = c44270sJp;
        this.ejfBZ = c35864oGn;
        MutableStateFlow<nTN> MutableStateFlow = StateFlowKt.MutableStateFlow(nTN.ActionBar.OLrzqt);
        this.AYXKKw = MutableStateFlow;
        this.AubY = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Application> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.copydefault = mutableSharedFlowAEQbTJ;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableSharedFlow<Fragment> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.AhwBna = mutableSharedFlowAEQbTJ2;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        MutableSharedFlow<StateListAnimator> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.AEQbTJ = mutableSharedFlowAEQbTJ3;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        MutableSharedFlow<Dialog> mutableSharedFlowAEQbTJ4 = C37721ozF.AEQbTJ();
        this.valueOf = mutableSharedFlowAEQbTJ4;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ4);
        MutableSharedFlow<ActionBar> mutableSharedFlowAEQbTJ5 = C37721ozF.AEQbTJ();
        this.KWHzl = mutableSharedFlowAEQbTJ5;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ5);
        MutableSharedFlow<TaskDescription> mutableSharedFlowAEQbTJ6 = C37721ozF.AEQbTJ();
        this.OLrzqt = mutableSharedFlowAEQbTJ6;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ6);
        this.DbNXlk = yDY.gEmmrt(C56524yIo.AEQbTJ(UpdateGroupMemberMessage.class), C56524yIo.AEQbTJ(DisbandGroupMessage.class));
        PendingIntent pendingIntent = new PendingIntent();
        this.AuCTel = pendingIntent;
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>init: invitationId: " + djBIcL() + ", groupId: " + gEmmrt(), null, 2, null);
        interfaceC44293sKl.OLrzqt(pendingIntent);
        refreshInviteInfo$default(this, true, false, 2, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final String djBIcL() {
        String str = (String) this.getFieldNames.get("KEY_INVITE_ID");
        return str == null ? "" : str;
    }

    public final long gEmmrt() {
        Long l = (Long) this.getFieldNames.get("KEY_GROUP_ID");
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final JoinGroupDisplayModel AYXKKw() {
        return (JoinGroupDisplayModel) this.getFieldNames.get("KEY_DISPLAY_MODEL");
    }

    public interface Application {

        /* JADX INFO: renamed from: com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0422Application implements Application {
            public static final C0422Application copydefault = new C0422Application();

            private C0422Application() {
            }
        }

        public static final class StateListAnimator implements Application {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
            }
        }
    }

    public interface Fragment {

        public static final class Activity implements Fragment {
            public static final int EZpvd = ((GroupInvitationInfoResponse.PaidGroupPreview.$stable | GroupInvitationInfoResponse.GroupOwnerInfo.$stable) | GroupEntryAssetVerificationInfo.$stable) | OfficialTagInfo.$stable;
            public final JoinGroupDisplayModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, JoinGroupDisplayModel joinGroupDisplayModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    joinGroupDisplayModel = activity.KWHzl;
                }
                return activity.EZpvd(joinGroupDisplayModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
                Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
                return new Activity(joinGroupDisplayModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JoinGroupDisplayModel OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
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
            public String toString() {
                return "NavigateToGroupConversation(groupDisplayModel=" + this.KWHzl + ")";
            }

            public Activity(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
                Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
                this.KWHzl = joinGroupDisplayModel;
            }
        }
    }

    public interface StateListAnimator {

        /* JADX INFO: renamed from: com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0424StateListAnimator implements StateListAnimator {
            public static final int AEQbTJ = GroupInvitationInfoResponse.GroupOwnerInfo.$stable;
            public final int KWHzl;
            public final GroupInvitationInfoResponse.GroupOwnerInfo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0424StateListAnimator copy$default(C0424StateListAnimator c0424StateListAnimator, GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    groupOwnerInfo = c0424StateListAnimator.copydefault;
                }
                if ((i2 & 2) != 0) {
                    i = c0424StateListAnimator.KWHzl;
                }
                return c0424StateListAnimator.copydefault(groupOwnerInfo, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupInvitationInfoResponse.GroupOwnerInfo KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0424StateListAnimator copydefault(@NotNull GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, int i) {
                Intrinsics.checkNotNullParameter(groupOwnerInfo, "");
                return new C0424StateListAnimator(groupOwnerInfo, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0424StateListAnimator)) {
                    return false;
                }
                C0424StateListAnimator c0424StateListAnimator = (C0424StateListAnimator) obj;
                return Intrinsics.EZpvd(this.copydefault, c0424StateListAnimator.copydefault) && this.KWHzl == c0424StateListAnimator.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + Integer.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdateGroupInfoInfo(info=" + this.copydefault + ", totalMemberCount=" + this.KWHzl + ")";
            }

            public C0424StateListAnimator(@NotNull GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, int i) {
                Intrinsics.checkNotNullParameter(groupOwnerInfo, "");
                this.copydefault = groupOwnerInfo;
                this.KWHzl = i;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface Dialog {

        public static final class Activity implements Dialog {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
            }
        }

        public static final class StateListAnimator implements Dialog {
            public final nTL KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, nTL ntl, int i, Object obj) {
                if ((i & 1) != 0) {
                    ntl = stateListAnimator.KWHzl;
                }
                return stateListAnimator.copydefault(ntl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final nTL KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull nTL ntl) {
                Intrinsics.checkNotNullParameter(ntl, "");
                return new StateListAnimator(ntl);
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
                return "ShowPaymentBottomSheet(paymentData=" + this.KWHzl + ")";
            }

            public StateListAnimator(@NotNull nTL ntl) {
                Intrinsics.checkNotNullParameter(ntl, "");
                this.KWHzl = ntl;
            }
        }

        public static final class Application implements Dialog {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.copydefault;
                }
                return application.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PaymentFlowSuccess(orderId=" + this.copydefault + ")";
            }

            public Application(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar implements Dialog {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.copydefault;
                }
                return actionBar.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(String str) {
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((ActionBar) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.copydefault;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PaymentFlowError(message=" + this.copydefault + ")";
            }

            public ActionBar(String str) {
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel$Dialog$Dialog, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0423Dialog implements Dialog {
            public static final C0423Dialog EZpvd = new C0423Dialog();

            private C0423Dialog() {
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription implements Dialog {
            public final Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = taskDescription.KWHzl;
                }
                return taskDescription.OLrzqt(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new TaskDescription(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WithdrawError(error=" + this.KWHzl + ")";
            }

            public TaskDescription(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {

        public static final class StateListAnimator implements ActionBar {
            public final nTF AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, nTF ntf, int i, Object obj) {
                if ((i & 1) != 0) {
                    ntf = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.AEQbTJ(ntf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull nTF ntf) {
                Intrinsics.checkNotNullParameter(ntf, "");
                return new StateListAnimator(ntf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final nTF AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowApprovalForm(approvalData=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(@NotNull nTF ntf) {
                Intrinsics.checkNotNullParameter(ntf, "");
                this.AEQbTJ = ntf;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {

        public static final class Activity implements TaskDescription {
            public final boolean EZpvd;
            public final Throwable OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, Throwable th, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = activity.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str = activity.copydefault;
                }
                if ((i & 4) != 0) {
                    z = activity.EZpvd;
                }
                return activity.copydefault(th, str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull Throwable th, @NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(th, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(th, str, z);
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
                return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) activity.copydefault) && this.EZpvd == activity.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AssetsRequirementFetchError(error=" + this.OLrzqt + ", toast=" + this.copydefault + ", disableVerifyButton=" + this.EZpvd + ")";
            }

            public Activity(@NotNull Throwable th, @NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(th, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = th;
                this.copydefault = str;
                this.EZpvd = z;
            }
        }
    }

    public static final class PendingIntent extends C44373sNk {
        public PendingIntent() {
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void KWHzl(C44467sQx c44467sQx) {
            Intrinsics.checkNotNullParameter(c44467sQx, "");
            OKMessage oKMessageCopydefault = c44467sQx.copydefault();
            JoinGroupViewModel joinGroupViewModel = JoinGroupViewModel.this;
            if (Intrinsics.EZpvd((Object) oKMessageCopydefault.getTargetId(), (Object) String.valueOf(joinGroupViewModel.gEmmrt()))) {
                List list = joinGroupViewModel.DbNXlk;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC56551yJo) it.next()).copydefault(oKMessageCopydefault.getContent())) {
                        JoinGroupViewModel.refreshInviteInfo$default(joinGroupViewModel, false, false, 3, null);
                        return;
                    }
                }
            }
        }
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.fJNWhG.AEQbTJ(this.AuCTel);
        super.onCleared();
    }

    public final void copydefault(GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$getOwnerInfo$1(this, groupOwnerInfo, i, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Boolean> continuation) throws Throwable {
        JoinGroupViewModel$hasSmartAccount$1 joinGroupViewModel$hasSmartAccount$1;
        Object objOLrzqt;
        if (continuation instanceof JoinGroupViewModel$hasSmartAccount$1) {
            joinGroupViewModel$hasSmartAccount$1 = (JoinGroupViewModel$hasSmartAccount$1) continuation;
            int i = joinGroupViewModel$hasSmartAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                joinGroupViewModel$hasSmartAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                joinGroupViewModel$hasSmartAccount$1 = new JoinGroupViewModel$hasSmartAccount$1(this, continuation);
            }
        }
        Object obj = joinGroupViewModel$hasSmartAccount$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = joinGroupViewModel$hasSmartAccount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
            if (interfaceC31257lqc != null) {
                joinGroupViewModel$hasSmartAccount$1.label = 1;
                objOLrzqt = interfaceC31257lqc.OLrzqt(joinGroupViewModel$hasSmartAccount$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>hasSmartAccount: result=" + z, null, 2, null);
            return C56443yFo.KWHzl(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objOLrzqt = ((Result) obj).m7386unboximpl();
        boolean z = Result.m7384isSuccessimpl(objOLrzqt);
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>hasSmartAccount: result=" + z, null, 2, null);
        return C56443yFo.KWHzl(z);
    }

    public static /* synthetic */ void refreshInviteInfo$default(JoinGroupViewModel joinGroupViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        joinGroupViewModel.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$refreshInviteInfo$1(this, z, z2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(JoinGroupDisplayModel joinGroupDisplayModel, Continuation<? super nTK> continuation) throws Throwable {
        JoinGroupViewModel$getPaymentRequiredStatus$1 joinGroupViewModel$getPaymentRequiredStatus$1;
        TransactionStatus transactionStatusAYXKKw;
        Object objKWHzl;
        if (continuation instanceof JoinGroupViewModel$getPaymentRequiredStatus$1) {
            joinGroupViewModel$getPaymentRequiredStatus$1 = (JoinGroupViewModel$getPaymentRequiredStatus$1) continuation;
            int i = joinGroupViewModel$getPaymentRequiredStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                joinGroupViewModel$getPaymentRequiredStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                joinGroupViewModel$getPaymentRequiredStatus$1 = new JoinGroupViewModel$getPaymentRequiredStatus$1(this, continuation);
            }
        }
        Object obj = joinGroupViewModel$getPaymentRequiredStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = joinGroupViewModel$getPaymentRequiredStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            transactionStatusAYXKKw = nTM.AYXKKw(joinGroupDisplayModel);
            joinGroupViewModel$getPaymentRequiredStatus$1.L$0 = joinGroupDisplayModel;
            joinGroupViewModel$getPaymentRequiredStatus$1.L$1 = transactionStatusAYXKKw;
            joinGroupViewModel$getPaymentRequiredStatus$1.label = 1;
            objKWHzl = KWHzl(joinGroupViewModel$getPaymentRequiredStatus$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TransactionStatus transactionStatus = (TransactionStatus) joinGroupViewModel$getPaymentRequiredStatus$1.L$1;
            JoinGroupDisplayModel joinGroupDisplayModel2 = (JoinGroupDisplayModel) joinGroupViewModel$getPaymentRequiredStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
            transactionStatusAYXKKw = transactionStatus;
            joinGroupDisplayModel = joinGroupDisplayModel2;
            objKWHzl = obj;
        }
        boolean zBooleanValue = ((Boolean) objKWHzl).booleanValue();
        boolean zGEmmrt = nTM.gEmmrt(joinGroupDisplayModel);
        boolean zAhwBna = nTM.AhwBna(joinGroupDisplayModel);
        boolean zCopydefault = nTM.copydefault(joinGroupDisplayModel);
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: paymentStatus=" + transactionStatusAYXKKw + ", hasPayAccount=" + zBooleanValue + ", isMinAssetsRequired=" + zGEmmrt + ", isAdminApprovalRequired=" + zAhwBna + ", isAdminApprovalPending=" + zCopydefault, null, 2, null);
        switch (FragmentManager.KWHzl[transactionStatusAYXKKw.ordinal()]) {
            case 1:
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Payment pending", null, 2, null);
                return nTK.LoaderManager.copydefault;
            case 2:
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Payment successful", null, 2, null);
                if (zCopydefault) {
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Admin approval pending", null, 2, null);
                    return nTK.ActionBar.copydefault;
                }
                if (zAhwBna) {
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Admin approval required with payment", null, 2, null);
                    return new nTK.Application(new nTF.TaskDescription(nTM.OLrzqt(joinGroupDisplayModel), nTM.EZpvd(joinGroupDisplayModel)));
                }
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Direct trigger info success", null, 2, null);
                return nTK.Activity.copydefault;
            case 3:
            case 4:
            case 5:
            case 6:
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Payment not successful, status=" + transactionStatusAYXKKw, null, 2, null);
                if (zGEmmrt) {
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Minimum assets required", null, 2, null);
                    return new nTK.Dialog(zAhwBna);
                }
                if (!zBooleanValue) {
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Payment required - no smart account", null, 2, null);
                    return nTK.Fragment.OLrzqt;
                }
                if (zAhwBna) {
                    C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Admin approval required with payment", null, 2, null);
                    return new nTK.Application(new nTF.TaskDescription(nTM.OLrzqt(joinGroupDisplayModel), nTM.EZpvd(joinGroupDisplayModel)));
                }
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>getPaymentRequiredStatus: Payment required", null, 2, null);
                return nTK.Fragment.OLrzqt;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final nTK KWHzl(JoinGroupDisplayModel joinGroupDisplayModel) {
        nTK application;
        boolean zCopydefault = nTM.copydefault(joinGroupDisplayModel);
        boolean zGEmmrt = nTM.gEmmrt(joinGroupDisplayModel);
        boolean zAhwBna = nTM.AhwBna(joinGroupDisplayModel);
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>getStandardJoinStatus: isAdminApprovalPending=" + zCopydefault + ", isMinAssetsRequired=" + zGEmmrt + ", isAdminApprovalRequired=" + zAhwBna, null, 2, null);
        if (zCopydefault) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>getStandardJoinStatus: Admin approval pending", null, 2, null);
            return nTK.ActionBar.copydefault;
        }
        if (zGEmmrt) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>getStandardJoinStatus: Minimum assets required", null, 2, null);
            application = new nTK.Dialog(zAhwBna);
        } else if (zAhwBna) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>getStandardJoinStatus: Admin approval required (no payment)", null, 2, null);
            application = new nTK.Application(nTF.StateListAnimator.AEQbTJ);
        } else {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>getStandardJoinStatus: Info success", null, 2, null);
            return nTK.StateListAnimator.OLrzqt;
        }
        return application;
    }

    public final void AEQbTJ(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$verifyAssetsRequirement$1(this, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(AbstractC44414sOy.Activity activity, Continuation<? super Unit> continuation) throws Throwable {
        JoinGroupViewModel$handleVerificationFailure$1 joinGroupViewModel$handleVerificationFailure$1;
        JoinGroupViewModel joinGroupViewModel;
        Object objM7377constructorimpl;
        if (continuation instanceof JoinGroupViewModel$handleVerificationFailure$1) {
            joinGroupViewModel$handleVerificationFailure$1 = (JoinGroupViewModel$handleVerificationFailure$1) continuation;
            int i = joinGroupViewModel$handleVerificationFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                joinGroupViewModel$handleVerificationFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                joinGroupViewModel$handleVerificationFailure$1 = new JoinGroupViewModel$handleVerificationFailure$1(this, continuation);
            }
        }
        Object objCopydefault = joinGroupViewModel$handleVerificationFailure$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = joinGroupViewModel$handleVerificationFailure$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                Result.Application application = Result.Companion;
                oDL odl = this.getNewProxyInstance;
                String strDjBIcL = djBIcL();
                joinGroupViewModel$handleVerificationFailure$1.L$0 = this;
                joinGroupViewModel$handleVerificationFailure$1.L$1 = activity;
                joinGroupViewModel$handleVerificationFailure$1.label = 1;
                objCopydefault = odl.copydefault(strDjBIcL, joinGroupViewModel$handleVerificationFailure$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                joinGroupViewModel = this;
            } catch (Throwable th) {
                th = th;
                joinGroupViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return Unit.INSTANCE;
            }
            activity = (AbstractC44414sOy.Activity) joinGroupViewModel$handleVerificationFailure$1.L$1;
            joinGroupViewModel = (JoinGroupViewModel) joinGroupViewModel$handleVerificationFailure$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((oDL.ActionBar) objCopydefault);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        oDL.ActionBar actionBar = (oDL.ActionBar) objM7377constructorimpl;
        if (actionBar instanceof oDL.ActionBar.Application) {
            JoinGroupDisplayModel joinGroupDisplayModelEZpvd = ((oDL.ActionBar.Application) actionBar).EZpvd();
            joinGroupViewModel$handleVerificationFailure$1.L$0 = null;
            joinGroupViewModel$handleVerificationFailure$1.L$1 = null;
            joinGroupViewModel$handleVerificationFailure$1.label = 2;
            if (joinGroupViewModel.EZpvd(joinGroupDisplayModelEZpvd, activity, joinGroupViewModel$handleVerificationFailure$1) == objCopydefault2) {
                return objCopydefault2;
            }
            return Unit.INSTANCE;
        }
        Throwable thEZpvd = activity.EZpvd();
        joinGroupViewModel$handleVerificationFailure$1.L$0 = null;
        joinGroupViewModel$handleVerificationFailure$1.L$1 = null;
        joinGroupViewModel$handleVerificationFailure$1.label = 3;
        if (joinGroupViewModel.AEQbTJ(thEZpvd, true, (Continuation<? super Unit>) joinGroupViewModel$handleVerificationFailure$1) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(JoinGroupDisplayModel joinGroupDisplayModel, AbstractC44414sOy.Activity activity, Continuation<? super Unit> continuation) throws Throwable {
        JoinGroupViewModel$handleFailureWithUpdatedModel$1 joinGroupViewModel$handleFailureWithUpdatedModel$1;
        JoinGroupViewModel joinGroupViewModel;
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfoKWHzl;
        if (continuation instanceof JoinGroupViewModel$handleFailureWithUpdatedModel$1) {
            joinGroupViewModel$handleFailureWithUpdatedModel$1 = (JoinGroupViewModel$handleFailureWithUpdatedModel$1) continuation;
            int i = joinGroupViewModel$handleFailureWithUpdatedModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                joinGroupViewModel$handleFailureWithUpdatedModel$1.label = i - Integer.MIN_VALUE;
            } else {
                joinGroupViewModel$handleFailureWithUpdatedModel$1 = new JoinGroupViewModel$handleFailureWithUpdatedModel$1(this, continuation);
            }
        }
        Object obj = joinGroupViewModel$handleFailureWithUpdatedModel$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = joinGroupViewModel$handleFailureWithUpdatedModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfoKWHzl2 = joinGroupDisplayModel.KWHzl();
            String assetAmount = null;
            String assetAmount2 = groupEntryAssetVerificationInfoKWHzl2 != null ? groupEntryAssetVerificationInfoKWHzl2.getAssetAmount() : null;
            JoinGroupDisplayModel joinGroupDisplayModelAYXKKw = AYXKKw();
            if (joinGroupDisplayModelAYXKKw != null && (groupEntryAssetVerificationInfoKWHzl = joinGroupDisplayModelAYXKKw.KWHzl()) != null) {
                assetAmount = groupEntryAssetVerificationInfoKWHzl.getAssetAmount();
            }
            if (!Intrinsics.EZpvd((Object) assetAmount2, (Object) assetAmount)) {
                MutableStateFlow<nTN> mutableStateFlow = this.AYXKKw;
                nTN.Activity activity2 = new nTN.Activity(joinGroupDisplayModel, new nTK.PendingIntent(nTM.AhwBna(joinGroupDisplayModel)));
                joinGroupViewModel$handleFailureWithUpdatedModel$1.L$0 = this;
                joinGroupViewModel$handleFailureWithUpdatedModel$1.L$1 = joinGroupDisplayModel;
                joinGroupViewModel$handleFailureWithUpdatedModel$1.label = 1;
                if (mutableStateFlow.emit(activity2, joinGroupViewModel$handleFailureWithUpdatedModel$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Throwable thEZpvd = activity.EZpvd();
                joinGroupViewModel$handleFailureWithUpdatedModel$1.L$0 = this;
                joinGroupViewModel$handleFailureWithUpdatedModel$1.L$1 = joinGroupDisplayModel;
                joinGroupViewModel$handleFailureWithUpdatedModel$1.label = 2;
                if (AEQbTJ(thEZpvd, false, (Continuation<? super Unit>) joinGroupViewModel$handleFailureWithUpdatedModel$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            joinGroupViewModel = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            joinGroupDisplayModel = (JoinGroupDisplayModel) joinGroupViewModel$handleFailureWithUpdatedModel$1.L$1;
            joinGroupViewModel = (JoinGroupViewModel) joinGroupViewModel$handleFailureWithUpdatedModel$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        joinGroupViewModel.getFieldNames.set("KEY_GROUP_ID", C56443yFo.KWHzl(joinGroupDisplayModel.valueOf()));
        joinGroupViewModel.getFieldNames.set("KEY_DISPLAY_MODEL", joinGroupDisplayModel);
        return Unit.INSTANCE;
    }

    public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) throws Throwable {
        JoinGroupDisplayModel joinGroupDisplayModelAYXKKw = AYXKKw();
        if (joinGroupDisplayModelAYXKKw != null) {
            boolean zValueOf = nTM.valueOf(joinGroupDisplayModelAYXKKw);
            boolean zDjBIcL = nTM.djBIcL(joinGroupDisplayModelAYXKKw);
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleVerificationSuccess: isPaidGroup=" + zValueOf + ", isPaymentRequired=" + zDjBIcL + ", approvalRequired=" + z, null, 2, null);
            if (zValueOf && zDjBIcL) {
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleVerificationSuccess: Handling paid group with payment required", null, 2, null);
                Object objKWHzl = KWHzl(joinGroupDisplayModelAYXKKw, z, continuation);
                if (objKWHzl == C56442yFn.copydefault()) {
                    return objKWHzl;
                }
            } else if (zValueOf) {
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleVerificationSuccess: Handling paid group without payment required", null, 2, null);
                Object objOLrzqt = OLrzqt(joinGroupDisplayModelAYXKKw, z, continuation);
                if (objOLrzqt == C56442yFn.copydefault()) {
                    return objOLrzqt;
                }
            } else if (z) {
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleVerificationSuccess: Showing approval form (no payment)", null, 2, null);
                Object objEmit = this.KWHzl.emit(new ActionBar.StateListAnimator(nTF.StateListAnimator.AEQbTJ), continuation);
                if (objEmit == C56442yFn.copydefault()) {
                    return objEmit;
                }
            } else {
                C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleVerificationSuccess: Direct trigger info success", null, 2, null);
                Object objEmit2 = this.AYXKKw.emit(new nTN.Activity(joinGroupDisplayModelAYXKKw, nTK.Activity.copydefault), continuation);
                if (objEmit2 == C56442yFn.copydefault()) {
                    return objEmit2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(JoinGroupDisplayModel joinGroupDisplayModel, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        JoinGroupViewModel$handlePaymentRequired$1 joinGroupViewModel$handlePaymentRequired$1;
        JoinGroupViewModel joinGroupViewModel;
        if (continuation instanceof JoinGroupViewModel$handlePaymentRequired$1) {
            joinGroupViewModel$handlePaymentRequired$1 = (JoinGroupViewModel$handlePaymentRequired$1) continuation;
            int i = joinGroupViewModel$handlePaymentRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                joinGroupViewModel$handlePaymentRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                joinGroupViewModel$handlePaymentRequired$1 = new JoinGroupViewModel$handlePaymentRequired$1(this, continuation);
            }
        }
        Object objKWHzl = joinGroupViewModel$handlePaymentRequired$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = joinGroupViewModel$handlePaymentRequired$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            joinGroupViewModel$handlePaymentRequired$1.L$0 = this;
            joinGroupViewModel$handlePaymentRequired$1.L$1 = joinGroupDisplayModel;
            joinGroupViewModel$handlePaymentRequired$1.Z$0 = z;
            joinGroupViewModel$handlePaymentRequired$1.label = 1;
            objKWHzl = KWHzl(joinGroupViewModel$handlePaymentRequired$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            joinGroupViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    return Unit.INSTANCE;
                }
                if (i2 == 3) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return Unit.INSTANCE;
            }
            z = joinGroupViewModel$handlePaymentRequired$1.Z$0;
            joinGroupDisplayModel = (JoinGroupDisplayModel) joinGroupViewModel$handlePaymentRequired$1.L$1;
            joinGroupViewModel = (JoinGroupViewModel) joinGroupViewModel$handlePaymentRequired$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        boolean zBooleanValue = ((Boolean) objKWHzl).booleanValue();
        String strOLrzqt = nTM.OLrzqt(joinGroupDisplayModel);
        String strEZpvd = nTM.EZpvd(joinGroupDisplayModel);
        GroupBillingType groupBillingTypeAEQbTJ = nTM.AEQbTJ(joinGroupDisplayModel);
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaymentRequired: hasPayAccount=" + zBooleanValue + ", approvalRequired=" + z + ", sign=" + strOLrzqt + ", amount=" + strEZpvd + ", billingType=" + groupBillingTypeAEQbTJ, null, 2, null);
        if (zBooleanValue && z) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaymentRequired: Showing approval form with payment", null, 2, null);
            MutableSharedFlow<ActionBar> mutableSharedFlow = joinGroupViewModel.KWHzl;
            ActionBar.StateListAnimator stateListAnimator = new ActionBar.StateListAnimator(new nTF.TaskDescription(strOLrzqt, strEZpvd));
            joinGroupViewModel$handlePaymentRequired$1.L$0 = null;
            joinGroupViewModel$handlePaymentRequired$1.L$1 = null;
            joinGroupViewModel$handlePaymentRequired$1.label = 2;
            if (mutableSharedFlow.emit(stateListAnimator, joinGroupViewModel$handlePaymentRequired$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (zBooleanValue) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaymentRequired: Showing payment bottom sheet", null, 2, null);
            MutableSharedFlow<Dialog> mutableSharedFlow2 = joinGroupViewModel.valueOf;
            Dialog.StateListAnimator stateListAnimator2 = new Dialog.StateListAnimator(new nTL(groupBillingTypeAEQbTJ, strOLrzqt, strEZpvd));
            joinGroupViewModel$handlePaymentRequired$1.L$0 = null;
            joinGroupViewModel$handlePaymentRequired$1.L$1 = null;
            joinGroupViewModel$handlePaymentRequired$1.label = 3;
            if (mutableSharedFlow2.emit(stateListAnimator2, joinGroupViewModel$handlePaymentRequired$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaymentRequired: Creating pay account", null, 2, null);
        MutableSharedFlow<Dialog> mutableSharedFlow3 = joinGroupViewModel.valueOf;
        Dialog.Activity activity = Dialog.Activity.OLrzqt;
        joinGroupViewModel$handlePaymentRequired$1.L$0 = null;
        joinGroupViewModel$handlePaymentRequired$1.L$1 = null;
        joinGroupViewModel$handlePaymentRequired$1.label = 4;
        if (mutableSharedFlow3.emit(activity, joinGroupViewModel$handlePaymentRequired$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Object OLrzqt(JoinGroupDisplayModel joinGroupDisplayModel, boolean z, Continuation<? super Unit> continuation) {
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaidGroupNoPayment: approvalRequired=" + z, null, 2, null);
        if (z) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaidGroupNoPayment: Showing approval form (no payment)", null, 2, null);
            Object objEmit = this.KWHzl.emit(new ActionBar.StateListAnimator(nTF.StateListAnimator.AEQbTJ), continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>handlePaidGroupNoPayment: Direct trigger info success", null, 2, null);
        Object objEmit2 = this.AYXKKw.emit(new nTN.Activity(joinGroupDisplayModel, nTK.Activity.copydefault), continuation);
        return objEmit2 == C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
    }

    public final Object AEQbTJ(Throwable th, boolean z, Continuation<? super Unit> continuation) {
        MutableSharedFlow<TaskDescription> mutableSharedFlow = this.OLrzqt;
        String strCopydefault = C44157sFk.copydefault(th);
        if (strCopydefault == null) {
            strCopydefault = C33070mpX.AYXKKw(C35399nuc.LoaderManager.iUnTnt);
        }
        Object objEmit = mutableSharedFlow.emit(new TaskDescription.Activity(th, strCopydefault, z), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final void OLrzqt(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$submitJoinRequest$1(this, str, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$acceptInvite$1(this, null), 3, null);
    }

    public final Object OLrzqt(Integer num, Throwable th, Continuation<? super Unit> continuation) {
        nTN taskDescription;
        JoinGroupDisplayModel joinGroupDisplayModelAYXKKw;
        if (num != null && num.intValue() == 2012 && (joinGroupDisplayModelAYXKKw = AYXKKw()) != null) {
            Object objEmit = this.AhwBna.emit(new Fragment.Activity(joinGroupDisplayModelAYXKKw), continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        if (num != null && num.intValue() == 2010) {
            taskDescription = new nTN.TaskDescription(th, C33070mpX.AYXKKw(C35399nuc.LoaderManager.dbwnZN));
        } else if (num != null && num.intValue() == 2011) {
            taskDescription = new nTN.TaskDescription(th, C33070mpX.AYXKKw(C35399nuc.LoaderManager.fVjYLc));
        } else if (num != null && num.intValue() == 2013) {
            taskDescription = nTN.Application.EZpvd;
        } else {
            String strCopydefault = C44157sFk.copydefault(th);
            if (strCopydefault == null) {
                strCopydefault = C33070mpX.AYXKKw(C35399nuc.LoaderManager.iUnTnt);
            }
            taskDescription = new nTN.TaskDescription(th, strCopydefault);
        }
        Object objEmit2 = this.AYXKKw.emit(taskDescription, continuation);
        return objEmit2 == C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
    }

    public final void AEQbTJ(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$createPayment$1(this, str, null), 3, null);
    }

    public final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$withdrawPayment$1(this, null), 3, null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinGroupViewModel$checkPaymentStatusRegularly$1(this, null), 3, null);
    }

    public final void EZpvd(String str, Long l) {
        if (Intrinsics.EZpvd((Object) djBIcL(), (Object) str)) {
            C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleNewIntent: invite ID unchanged, skipping update", null, 2, null);
            return;
        }
        this.getFieldNames.set("KEY_INVITE_ID", str);
        this.getFieldNames.set("KEY_GROUP_ID", l);
        this.getFieldNames.set("KEY_DISPLAY_MODEL", null);
        refreshInviteInfo$default(this, true, false, 2, null);
        C44124sEe.imLogGroup$default("JoinGroupViewModel=>handleNewIntent: updated invitationId from '" + djBIcL() + "' to '" + str + "', groupId: " + gEmmrt(), null, 2, null);
    }
}
