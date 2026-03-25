package o;

import android.view.View;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import com.okinc.im.imui.group.management.registry.ProfileSettingKeys;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.ActivityC34064nQb;
import o.ActivityC34130nSn;
import o.ActivityC34183nUn;
import o.ActivityC34308nZd;
import o.C34235nWl;
import o.C35399nuc;
import o.C52761wXj;
import o.nZV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34235nWl {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final java.util.Map<ProfileSettingKeys, InterfaceC56387yDm<C35694oAf>> EZpvd;
    public final GroupProfileViewModel KWHzl;
    public final AbstractActivityC33041mov copydefault;

    /* JADX INFO: renamed from: o.nWl$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProfileSettingKeys.values().length];
            try {
                iArr[ProfileSettingKeys.MUTE_NOTIFICATIONS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileSettingKeys.PIN_TO_TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public C34235nWl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull GroupProfileViewModel groupProfileViewModel) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(groupProfileViewModel, "");
        this.copydefault = abstractActivityC33041mov;
        this.KWHzl = groupProfileViewModel;
        this.EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt(ProfileSettingKeys.INVITE_VIA_QR, C56392yDr.copydefault(new Function0() { // from class: o.nWC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.fIwbmz(this.copydefault);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.JOIN_REQUESTS, C56392yDr.copydefault(new Function0() { // from class: o.nWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.fARcdN(this.KWHzl);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.GROUP_MANAGEMENT, C56392yDr.copydefault(new Function0() { // from class: o.nWu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.hDKMBd(this.EZpvd);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.JOIN_REQUIREMENTS, C56392yDr.copydefault(new Function0() { // from class: o.nWt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.getNewProxyInstance(this.OLrzqt);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.PAID_GROUP_DASHBOARD, C56392yDr.copydefault(new Function0() { // from class: o.nWs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.iwGUEr(this.EZpvd);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.PAID_GROUP_PAY_MEMBERSHIP, C56392yDr.copydefault(new Function0() { // from class: o.nWr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.getFieldNames(this.KWHzl);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.SEARCH_IN_CHAT, C56392yDr.copydefault(new Function0() { // from class: o.nWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.uzCIH(this.copydefault);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.ANNOUNCEMENTS, C56392yDr.copydefault(new Function0() { // from class: o.nWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.zsXlph(this.KWHzl);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.DISBAND_GROUP, C56392yDr.copydefault(new Function0() { // from class: o.nWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.zLjUOn(this.AEQbTJ);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.LEAVE_GROUP, C56392yDr.copydefault(new Function0() { // from class: o.nWz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.AuCTelauCTel(this.EZpvd);
            }
        })), C56390yDp.OLrzqt(ProfileSettingKeys.DIVIDER, C56392yDr.copydefault(new Function0() { // from class: o.nWG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.OLrzqt();
            }
        })));
    }

    /* JADX INFO: renamed from: o.nWl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nWl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.nWl$StateListAnimator */
    public static final class StateListAnimator extends C37739ozX {
        public StateListAnimator(java.lang.String str, android.graphics.drawable.Drawable drawable) {
            super(str, null, null, drawable, "Invite via QR code", 6, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            nZV.Application application = nZV.Companion;
            java.lang.String strAYXKKw = C34235nWl.this.KWHzl.AYXKKw();
            C34235nWl.this.copydefault.startActivity(application.copydefault(context, strAYXKKw != null ? StringsKt__StringNumberConversionsKt.getFieldNames(strAYXKKw) : null));
        }
    }

    public static final StateListAnimator fIwbmz(C34235nWl c34235nWl) {
        return c34235nWl.new StateListAnimator(C33070mpX.AYXKKw(C35399nuc.LoaderManager.hfdhUn), C33070mpX.KWHzl(C52761wXj.TaskDescription.sEcTXd));
    }

    /* JADX INFO: renamed from: o.nWl$Dialog */
    public static final class Dialog extends C37739ozX {
        public Dialog(java.lang.String str, java.lang.String str2) {
            super(str, null, str2, null, "Join Requests", 10, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            java.lang.Long fieldNames;
            Intrinsics.checkNotNullParameter(context, "");
            ActivityC34183nUn.ActionBar actionBar = ActivityC34183nUn.Companion;
            java.lang.String strAYXKKw = C34235nWl.this.KWHzl.AYXKKw();
            C34235nWl.this.copydefault.startActivity(actionBar.AEQbTJ(context, (strAYXKKw == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strAYXKKw)) == null) ? -1L : fieldNames.longValue()));
        }
    }

    public static final Dialog fARcdN(C34235nWl c34235nWl) {
        GroupInfo groupInfoDjBIcL = c34235nWl.KWHzl.djBIcL();
        return c34235nWl.new Dialog(C33070mpX.AYXKKw(C35399nuc.LoaderManager.dTTfOR), groupInfoDjBIcL != null ? java.lang.Integer.valueOf(groupInfoDjBIcL.getPendingJoinRequests()).toString() : null);
    }

    /* JADX INFO: renamed from: o.nWl$LoaderManager */
    public static final class LoaderManager extends C37739ozX {
        public LoaderManager(java.lang.String str) {
            super(str, null, null, null, "Group Settings", 14, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            GroupInfo groupInfoDjBIcL = C34235nWl.this.KWHzl.djBIcL();
            if (groupInfoDjBIcL != null) {
                C34235nWl c34235nWl = C34235nWl.this;
                c34235nWl.copydefault.startActivity(ActivityC34200nVd.Companion.KWHzl(context, groupInfoDjBIcL));
            }
        }
    }

    public static final LoaderManager hDKMBd(C34235nWl c34235nWl) {
        return c34235nWl.new LoaderManager(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QfZsXX));
    }

    /* JADX INFO: renamed from: o.nWl$FragmentManager */
    public static final class FragmentManager extends C37739ozX {
        public FragmentManager(java.lang.String str) {
            super(str, null, null, null, "Join Requirements", 14, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            ActivityC34130nSn.TaskDescription taskDescription = ActivityC34130nSn.Companion;
            java.lang.String strAYXKKw = C34235nWl.this.KWHzl.AYXKKw();
            C34235nWl.this.copydefault.startActivity(taskDescription.copydefault(context, strAYXKKw != null ? strAYXKKw : ""));
        }
    }

    public static final FragmentManager getNewProxyInstance(C34235nWl c34235nWl) {
        return c34235nWl.new FragmentManager(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QfgJNx));
    }

    /* JADX INFO: renamed from: o.nWl$Fragment */
    public static final class Fragment extends C37739ozX {
        public Fragment(java.lang.String str) {
            super(str, null, null, null, "Membership earnings", 14, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            java.lang.Long fieldNames;
            Intrinsics.checkNotNullParameter(context, "");
            ActivityC34308nZd.Activity activity = ActivityC34308nZd.Companion;
            java.lang.String strAYXKKw = C34235nWl.this.KWHzl.AYXKKw();
            C34235nWl.this.copydefault.startActivity(activity.AEQbTJ(context, java.lang.Long.valueOf((strAYXKKw == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strAYXKKw)) == null) ? -1L : fieldNames.longValue())));
        }
    }

    public static final Fragment iwGUEr(C34235nWl c34235nWl) {
        return c34235nWl.new Fragment(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcNNRp));
    }

    /* JADX INFO: renamed from: o.nWl$TaskStackBuilder */
    public static final class TaskStackBuilder extends C37739ozX {

        /* JADX INFO: renamed from: o.nWl$TaskStackBuilder$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[BillingCyclePaymentStatus.values().length];
                try {
                    iArr[BillingCyclePaymentStatus.OVERDUE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[BillingCyclePaymentStatus.DUE_SOON.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                EZpvd = iArr;
            }
        }

        public TaskStackBuilder(java.lang.String str) {
            super(str, null, null, null, "Pay membership fee", 14, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            java.lang.String amount;
            PaidGroupInfo paidGroupInfo;
            PaidGroupInfo paidGroupInfo2;
            Intrinsics.checkNotNullParameter(context, "");
            GroupInfo groupInfoDjBIcL = C34235nWl.this.KWHzl.djBIcL();
            GroupEntryBillingModel billingModel = (groupInfoDjBIcL == null || (paidGroupInfo2 = groupInfoDjBIcL.getPaidGroupInfo()) == null) ? null : paidGroupInfo2.getBillingModel();
            PaidGroupMemberStatus paidGroupMemberStatus = (groupInfoDjBIcL == null || (paidGroupInfo = groupInfoDjBIcL.getPaidGroupInfo()) == null) ? null : paidGroupInfo.getPaidGroupMemberStatus();
            BillingCyclePaymentStatus billingCyclePaymentStatus = paidGroupMemberStatus != null ? paidGroupMemberStatus.getBillingCyclePaymentStatus() : null;
            int i = billingCyclePaymentStatus == null ? -1 : TaskDescription.EZpvd[billingCyclePaymentStatus.ordinal()];
            if (i == 1 || i == 2) {
                C34235nWl.this.KWHzl.KWHzl();
                return;
            }
            C34153nTj c34153nTjAEQbTJ = C34153nTj.Companion.AEQbTJ(billingModel != null ? billingModel.getBillingType() : null, (billingModel == null || (amount = billingModel.getAmount()) == null) ? null : pTB.formatLocalizedWithMinPrecision$default(amount, 2, null, 2, null), billingModel != null ? billingModel.getCurrencyCode() : null, pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(paidGroupMemberStatus != null ? paidGroupMemberStatus.getNextPaymentDatetime() : null)), null, 1, null), pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(paidGroupMemberStatus != null ? paidGroupMemberStatus.getLastPaymentDatetime() : null)), null, 1, null));
            androidx.fragment.app.FragmentManager supportFragmentManager = C34235nWl.this.copydefault.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c34153nTjAEQbTJ.show(supportFragmentManager);
        }
    }

    public static final TaskStackBuilder getFieldNames(C34235nWl c34235nWl) {
        return c34235nWl.new TaskStackBuilder(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OqHLSf));
    }

    /* JADX INFO: renamed from: o.nWl$AssistContent */
    public static final class AssistContent extends C37739ozX {
        public AssistContent(java.lang.String str) {
            super(str, null, null, null, "Search in Chat", 14, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            OKConversation oKConversationOLrzqt = C34235nWl.this.KWHzl.OLrzqt();
            if (oKConversationOLrzqt != null) {
                C33764nEz.OLrzqt.OLrzqt(C34235nWl.this.copydefault, oKConversationOLrzqt, null);
            }
        }
    }

    public static final AssistContent uzCIH(C34235nWl c34235nWl) {
        return c34235nWl.new AssistContent(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ZaDspl));
    }

    /* JADX INFO: renamed from: o.nWl$SharedElementCallback */
    public static final class SharedElementCallback extends C37739ozX {
        public SharedElementCallback(java.lang.String str) {
            super(str, null, null, null, "Announcements", 14, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C37760ozs.EZpvd("had_click_announcement", java.lang.Boolean.TRUE);
            C34235nWl.this.copydefault.startActivity(ActivityC34064nQb.Application.createIntent$default(ActivityC34064nQb.Companion, context, C34235nWl.this.KWHzl.djBIcL(), null, null, 8, null));
        }
    }

    public static final SharedElementCallback zsXlph(C34235nWl c34235nWl) {
        return c34235nWl.new SharedElementCallback(C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPOKBmQN));
    }

    /* JADX INFO: renamed from: o.nWl$PictureInPictureParams */
    public static final class PictureInPictureParams extends C37741ozZ {
        public PictureInPictureParams(java.lang.String str, java.lang.String str2) {
            super(str, str2, null, 4, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            if (C34235nWl.this.KWHzl.values()) {
                C34235nWl.this.EZpvd();
            } else {
                C34235nWl.this.KWHzl();
            }
        }
    }

    public static final PictureInPictureParams zLjUOn(C34235nWl c34235nWl) {
        return c34235nWl.new PictureInPictureParams(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fDu), c34235nWl.KWHzl.values() ? "Leave Premium Group" : "Disband Group");
    }

    /* JADX INFO: renamed from: o.nWl$PendingIntent */
    public static final class PendingIntent extends C37741ozZ {
        public PendingIntent(java.lang.String str, java.lang.String str2) {
            super(str, str2, null, 4, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            final C34235nWl c34235nWl = C34235nWl.this;
            C32866mlf.onEvent$default("IMChat_Full_Quit_Click", (TrackChannel[]) null, new Function1() { // from class: o.nWH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34235nWl.PendingIntent.AEQbTJ(c34235nWl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            if (C34235nWl.this.KWHzl.values()) {
                C34235nWl.this.AhwBna();
            } else {
                C34235nWl.this.copydefault();
            }
        }

        public static final Unit AEQbTJ(C34235nWl c34235nWl, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(c34235nWl.KWHzl.AYXKKw()), false, 4, null);
            EventParamsList.put$default(eventParamsList, "channel_type", "0", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final PendingIntent AuCTelauCTel(C34235nWl c34235nWl) {
        return c34235nWl.new PendingIntent(C33070mpX.AYXKKw(C35399nuc.LoaderManager.identifier), c34235nWl.KWHzl.values() ? "Leave Premium Group" : "Leave Group");
    }

    public static final C35689oAa OLrzqt() {
        return C35689oAa.EZpvd;
    }

    public final C35694oAf KWHzl(@NotNull ProfileSettingKeys profileSettingKeys) {
        C35694oAf actionBar;
        Intrinsics.checkNotNullParameter(profileSettingKeys, "");
        int i = Application.OLrzqt[profileSettingKeys.ordinal()];
        if (i == 1) {
            actionBar = new ActionBar(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getStatusCode), this.KWHzl.isConnected());
        } else if (i == 2) {
            actionBar = new TaskDescription(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fbC), this.KWHzl.fetchVPNInfo());
        } else {
            InterfaceC56387yDm<C35694oAf> interfaceC56387yDm = this.EZpvd.get(profileSettingKeys);
            if (interfaceC56387yDm != null) {
                return interfaceC56387yDm.getValue();
            }
            return null;
        }
        return actionBar;
    }

    /* JADX INFO: renamed from: o.nWl$ActionBar */
    public static final class ActionBar extends C35690oAb {
        public ActionBar(java.lang.String str, boolean z) {
            super(str, false, null, z, "Mute Notifications", 6, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C34235nWl.this.KWHzl.fARcdN();
        }
    }

    /* JADX INFO: renamed from: o.nWl$TaskDescription */
    public static final class TaskDescription extends C35690oAb {
        public TaskDescription(java.lang.String str, boolean z) {
            super(str, false, null, z, "Pin to Top", 6, null);
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C34235nWl.this.KWHzl.fIwbmz();
        }
    }

    public final void KWHzl() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.fjfviF);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.igXuih);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.dUDNAs, new View.OnClickListener() { // from class: o.nWB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34235nWl.copydefault(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.OqFWZa, new View.OnClickListener() { // from class: o.nWA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34235nWl.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(C34235nWl c34235nWl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c34235nWl.KWHzl.fJNWhG();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd() {
        oHT ohtAEQbTJ = oHT.Companion.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zHQtTQ), C33070mpX.AYXKKw(C35399nuc.LoaderManager.fJk), C33070mpX.AYXKKw(C35399nuc.LoaderManager.setProfilesSinceInitCount));
        ohtAEQbTJ.copydefault(new Function0() { // from class: o.nWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34235nWl.fJNWhG(this.OLrzqt);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        ohtAEQbTJ.show(supportFragmentManager);
    }

    public static final Unit fJNWhG(C34235nWl c34235nWl) {
        c34235nWl.KWHzl.fJNWhG();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.fTEjYi);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.FhERFw);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.sVvuFk, new View.OnClickListener() { // from class: o.nWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34235nWl.AEQbTJ(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.DrqXHJ, new View.OnClickListener() { // from class: o.nWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34235nWl.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(C34235nWl c34235nWl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c34235nWl.KWHzl.AuCTel();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AhwBna() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.dGrqPl);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.zbGDDc);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.ardYFU, new View.OnClickListener() { // from class: o.nWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34235nWl.AhwBna(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.iwGUEr, new View.OnClickListener() { // from class: o.nWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34235nWl.djBIcL(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AhwBna(C34235nWl c34235nWl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c34235nWl.KWHzl.AuCTel();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
