package o;

import android.app.ComponentCaller;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.web3pay.api.model.Web3PayProjectId;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$1;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$2;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$3;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$4;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$5;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$6;
import com.okinc.im.imui.group.join.view.JoinGroupActivity$initViewModel$7;
import com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import o.nTF;
import o.nTH;
import o.nTK;
import o.nTN;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nTQ extends nTR<nHX> {
    public final int AYXKKw = C35399nuc.Dialog.fetchVPNInfo;
    public final InterfaceC56387yDm djBIcL;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupBillingType.values().length];
            try {
                iArr[GroupBillingType.YEARLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GroupBillingType.MONTHLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    public nTQ() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(JoinGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.join.view.JoinGroupActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.join.view.JoinGroupActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.join.view.JoinGroupActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.nTR.AhwBna()V */
    public final JoinGroupViewModel AhwBna() {
        return (JoinGroupViewModel) this.djBIcL.getValue();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Application application, android.content.Context context, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                l = null;
            }
            return application.AEQbTJ(context, str, l);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nTQ.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_INVITE_ID", str), C56390yDp.OLrzqt("KEY_GROUP_ID", l)));
            intent.setFlags(603979776);
            return intent;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.nTR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        nHX nhx = (nHX) KWHzl();
        androidx.appcompat.widget.Toolbar toolbar = nhx.zsXlph;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, null, null);
        nhx.isConnected.setImageDrawable(IMImageHelper.OLrzqt.AhwBna());
        gEmmrt();
    }

    public void onNewIntent(@NotNull android.content.Intent intent, @NotNull ComponentCaller componentCaller) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(componentCaller, "");
        super.onNewIntent(intent, componentCaller);
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("KEY_INVITE_ID");
        java.lang.Long lValueOf = java.lang.Long.valueOf(intent.getLongExtra("KEY_GROUP_ID", -1L));
        if (lValueOf.longValue() == -1) {
            lValueOf = null;
        }
        AhwBna().EZpvd(stringExtra, lValueOf);
    }

    @Override // o.nTR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        final java.lang.Long lValueOf = java.lang.Long.valueOf(getIntent().getLongExtra("KEY_GROUP_ID", -1L));
        if (lValueOf.longValue() == -1) {
            lValueOf = null;
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Full_Join_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nTQ.OLrzqt(lValueOf, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.Long l, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(l), false, 4, null);
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        C37721ozF.collectOnLifecycle$default(AhwBna().fetchVPNInfo(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$1(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AhwBna().AhwBna(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$2(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AhwBna().valueOf(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$3(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AhwBna().KWHzl(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$4(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AhwBna().values(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$5(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AhwBna().copydefault(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$6(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AhwBna().AEQbTJ(), this, (Lifecycle.State) null, new JoinGroupActivity$initViewModel$7(this, null), 2, (java.lang.Object) null);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ nTH AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ nTQ KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, nTH nth, nTQ ntq, boolean z) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = nth;
            this.KWHzl = ntq;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel.refreshInviteInfo$default(com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel, boolean, boolean, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                nTH nth = this.AEQbTJ;
                if (Intrinsics.EZpvd(nth, nTH.LoaderManager.EZpvd)) {
                    JoinGroupViewModel.refreshInviteInfo$default(this.KWHzl.AhwBna(), true, false, 2, null);
                    return;
                }
                if (nth instanceof nTH.PendingIntent) {
                    this.KWHzl.AhwBna().AEQbTJ(((nTH.PendingIntent) this.AEQbTJ).AEQbTJ());
                    return;
                }
                if (Intrinsics.EZpvd(nth, nTH.StateListAnimator.OLrzqt)) {
                    rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
                    if (rtu != null) {
                        rTU.Application.checkAndRestrictsDistributary$default(rtu, this.KWHzl, null, null, null, null, null, 62, null);
                        return;
                    }
                    return;
                }
                if (nth instanceof nTH.ActionBar) {
                    this.KWHzl.AEQbTJ(((nTH.ActionBar) this.AEQbTJ).OLrzqt());
                    return;
                }
                if (Intrinsics.EZpvd(nth, nTH.Activity.copydefault) || Intrinsics.EZpvd(nth, nTH.Application.copydefault)) {
                    C32866mlf.onEvent$default("IMChat_Full_Join_Click", (TrackChannel[]) null, this.KWHzl.new StateListAnimator(), 1, (java.lang.Object) null);
                    this.KWHzl.djBIcL();
                } else if (Intrinsics.EZpvd(nth, nTH.Dialog.OLrzqt)) {
                    this.KWHzl.copydefault(this.OLrzqt);
                } else if (nth instanceof nTH.Fragment) {
                    nTQ.actionCreatePayment$default(this.KWHzl, null, 1, null);
                } else if (!Intrinsics.EZpvd(nth, nTH.TaskDescription.AEQbTJ)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, int i) {
        nHX nhx = (nHX) KWHzl();
        LinearLayoutCompat linearLayoutCompat = nhx.valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
        java.lang.String avatar = groupOwnerInfo.getAvatar();
        if (avatar == null || avatar.length() == 0) {
            C35893oHp c35893oHp = nhx.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(groupOwnerInfo.getUserUid());
            java.lang.String nickname = groupOwnerInfo.getNickname();
            java.lang.String str = nickname == null ? "" : nickname;
            java.lang.String avatar2 = groupOwnerInfo.getAvatar();
            C35891oHn.OLrzqt(c35893oHp, new RelationInfo(strGEmmrt, avatar2 == null ? "" : avatar2, str, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, (java.lang.String) null, (OfficialTagInfo) null, 0L, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (RelationSourceType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, -8, 63, (DefaultConstructorMarker) null));
        } else {
            Intrinsics.copydefault(Glide.AEQbTJ(nhx.fIwbmz.getContext()).EZpvd(groupOwnerInfo.getAvatar()).gEmmrt().EZpvd((android.widget.ImageView) nhx.fIwbmz));
        }
        java.lang.String nickname2 = groupOwnerInfo.getNickname();
        java.lang.String str2 = nickname2 != null ? nickname2 : "";
        android.text.SpannableString spannableString = new android.text.SpannableString(str2 + "・" + C59449zhJ.replace$default(C33070mpX.EZpvd(C35399nuc.Fragment.wlaJM, i), "{num}", pTB.formatLocalized$default(java.lang.String.valueOf(i), null, 1, null), false, 4, (java.lang.Object) null));
        int length = str2.length();
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(nhx.AYXKKw.getContext(), C52761wXj.Activity.UlJrfe)), length, length + 1, 0);
        nhx.AYXKKw.setText(spannableString);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final nHX AEQbTJ(nTN ntn) {
        nHX nhx = (nHX) KWHzl();
        if (ntn instanceof nTN.TaskDescription) {
            android.widget.ScrollView scrollView = nhx.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            scrollView.setVisibility(0);
            nhx.copydefault.setEnabled(false);
            C55173xeu c55173xeu = nhx.wlaJM;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            C55113xdn c55113xdn = nhx.AubY;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(8);
        } else if (ntn instanceof nTN.ActionBar) {
            android.widget.ScrollView scrollView2 = nhx.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "");
            scrollView2.setVisibility(0);
            nhx.copydefault.setEnabled(false);
            C55173xeu c55173xeu2 = nhx.wlaJM;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(8);
            C55113xdn c55113xdn2 = nhx.AubY;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            c55113xdn2.setVisibility(0);
        } else if (ntn instanceof nTN.StateListAnimator) {
            nhx.hDKMBd.setVisibility(4);
            nhx.copydefault.setEnabled(false);
            C55173xeu c55173xeu3 = nhx.wlaJM;
            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
            c55173xeu3.setVisibility(8);
            C55113xdn c55113xdn3 = nhx.AubY;
            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
            c55113xdn3.setVisibility(0);
        } else if (ntn instanceof nTN.Application) {
            android.widget.ScrollView scrollView3 = nhx.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(scrollView3, "");
            scrollView3.setVisibility(8);
            C52794wYp c52794wYp = nhx.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            C55113xdn c55113xdn4 = nhx.AubY;
            Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
            c55113xdn4.setVisibility(8);
            C55173xeu c55173xeu4 = nhx.wlaJM;
            Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
            c55173xeu4.setVisibility(0);
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C55113xdn c55113xdn5 = nhx.AubY;
            Intrinsics.checkNotNullExpressionValue(c55113xdn5, "");
            c55113xdn5.setVisibility(8);
            C55173xeu c55173xeu5 = nhx.wlaJM;
            Intrinsics.checkNotNullExpressionValue(c55173xeu5, "");
            c55173xeu5.setVisibility(8);
            android.widget.ScrollView scrollView4 = nhx.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(scrollView4, "");
            scrollView4.setVisibility(0);
            C52794wYp c52794wYp2 = nhx.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
        }
        return nhx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final nHX EZpvd(nTN ntn) {
        nHX nhx = (nHX) KWHzl();
        if (!(ntn instanceof nTN.ActionBar) && !(ntn instanceof nTN.StateListAnimator) && !(ntn instanceof nTN.Application)) {
            if (ntn instanceof nTN.TaskDescription) {
                C55326xho.toastWithFailedIcon$default(((nTN.TaskDescription) ntn).copydefault(), 0, 1, (java.lang.Object) null);
                rVN.reportFullyDrawn$default((android.app.Activity) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            } else {
                if (!(ntn instanceof nTN.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                AEQbTJ(nhx, (nTN.Activity) ntn);
            }
        }
        return nhx;
    }

    public final void AEQbTJ(nHX nhx, nTN.Activity activity) {
        pUU.EZpvd("join_group_flow", "joinGroupStatus: " + activity.KWHzl());
        JoinGroupDisplayModel joinGroupDisplayModelCopydefault = activity.copydefault();
        nTK ntkKWHzl = activity.KWHzl();
        AhwBna(joinGroupDisplayModelCopydefault);
        if ((ntkKWHzl instanceof nTK.TaskDescription) && ((nTK.TaskDescription) ntkKWHzl).EZpvd()) {
            AEQbTJ(joinGroupDisplayModelCopydefault);
            return;
        }
        AEQbTJ(nhx, ntkKWHzl, joinGroupDisplayModelCopydefault);
        OLrzqt(ntkKWHzl, joinGroupDisplayModelCopydefault);
        copydefault(nhx, activity);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nTQ.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(nTQ ntq) {
        rVN.reportFullyDrawn$default((android.app.Activity) ntq, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(nHX nhx, nTK ntk, JoinGroupDisplayModel joinGroupDisplayModel) {
        if (nTM.valueOf(joinGroupDisplayModel)) {
            CardView cardView = nhx.uzCIH;
            Intrinsics.checkNotNullExpressionValue(cardView, "");
            cardView.setVisibility(0);
            ConstraintLayout constraintLayout = nhx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            OLrzqt(joinGroupDisplayModel);
            return;
        }
        CardView cardView2 = nhx.uzCIH;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setVisibility(8);
        boolean zGEmmrt = nTM.gEmmrt(joinGroupDisplayModel);
        ConstraintLayout constraintLayout2 = nhx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(zGEmmrt ? 0 : 8);
        if (zGEmmrt) {
            copydefault(joinGroupDisplayModel);
        }
    }

    public final void OLrzqt(nTK ntk, JoinGroupDisplayModel joinGroupDisplayModel) {
        if (ntk instanceof nTK.PendingIntent) {
            KWHzl(joinGroupDisplayModel);
        } else if (ntk instanceof nTK.Activity) {
            djBIcL();
        } else if (ntk instanceof nTK.LoaderManager) {
            AhwBna().EZpvd();
        }
    }

    public final void copydefault(nHX nhx, nTN.Activity activity) {
        GroupEntryBillingModel billingModel;
        nTH nthCopydefault = nTJ.copydefault(activity);
        pUU.EZpvd("join_group_flow", "buttonState: " + nthCopydefault);
        EZpvd(nthCopydefault, nTM.valueOf(activity.copydefault()));
        boolean zDjBIcL = nTM.djBIcL(activity.copydefault());
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = activity.copydefault().isConnected();
        java.lang.CharSequence charSequenceKWHzl = KWHzl(nthCopydefault, zDjBIcL, (paidGroupPreviewIsConnected == null || (billingModel = paidGroupPreviewIsConnected.getBillingModel()) == null) ? null : billingModel.getBillingType());
        nhx.AuCTelauCTel.setText(charSequenceKWHzl);
        boolean z = ((nthCopydefault instanceof nTH.Dialog) || ((nthCopydefault instanceof nTH.ActionBar) && (((nTH.ActionBar) nthCopydefault).OLrzqt() instanceof nTF.TaskDescription))) ? false : true;
        android.widget.TextView textView = nhx.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((charSequenceKWHzl.length() <= 0 || !z) ? 8 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final nHX AhwBna(JoinGroupDisplayModel joinGroupDisplayModel) {
        nHX nhx = (nHX) KWHzl();
        C35893oHp c35893oHp = nhx.isConnected;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.loadGroupAvatar$default(c35893oHp, joinGroupDisplayModel.OLrzqt(), null, 2, null);
        nhx.values.setText(joinGroupDisplayModel.AYXKKw());
        nhx.AhwBna.setText(joinGroupDisplayModel.djBIcL());
        if (joinGroupDisplayModel.gEmmrt() == GroupTagType.PAID_GROUP) {
            android.widget.TextView textView = nhx.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            oJD ojd = nhx.fARcdN;
            Intrinsics.checkNotNullExpressionValue(ojd, "");
            ojd.setVisibility(0);
            android.widget.TextView textView2 = nhx.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        } else {
            oJD ojd2 = nhx.fARcdN;
            Intrinsics.checkNotNullExpressionValue(ojd2, "");
            ojd2.setVisibility(8);
            android.widget.TextView textView3 = nhx.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView3, joinGroupDisplayModel.values(), 8, null, false, false, false, 60, null);
            nhx.fetchVPNInfo.setText(pTD.EZpvd(this, C35399nuc.Fragment.fIwbmz, joinGroupDisplayModel.DbNXlk(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(java.lang.String.valueOf(joinGroupDisplayModel.DbNXlk()), null, 1, null)))));
            android.widget.TextView textView4 = nhx.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(joinGroupDisplayModel.DbNXlk() > 0 ? 0 : 8);
        }
        return nhx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final nHX copydefault(JoinGroupDisplayModel joinGroupDisplayModel) {
        nHX nhx = (nHX) KWHzl();
        ConstraintLayout constraintLayout = nhx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        nhx.AkhnZx.setText(EZpvd(joinGroupDisplayModel));
        return nhx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final nHX OLrzqt(JoinGroupDisplayModel joinGroupDisplayModel) {
        GroupEntryBillingModel billingModel;
        java.lang.String amount;
        GroupEntryBillingModel billingModel2;
        nHX nhx = (nHX) KWHzl();
        OLrzqt("images/im/card_gradient_v2.webp");
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = joinGroupDisplayModel.isConnected();
        java.lang.String currencySign = (paidGroupPreviewIsConnected == null || (billingModel2 = paidGroupPreviewIsConnected.getBillingModel()) == null) ? null : billingModel2.getCurrencySign();
        if (currencySign == null) {
            currencySign = "";
        }
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected2 = joinGroupDisplayModel.isConnected();
        java.lang.String str = currencySign + ((paidGroupPreviewIsConnected2 == null || (billingModel = paidGroupPreviewIsConnected2.getBillingModel()) == null || (amount = billingModel.getAmount()) == null) ? null : pTB.formatLocalizedWithMinPrecision$default(amount, 2, null, 2, null));
        GroupBillingType groupBillingTypeAEQbTJ = nTM.AEQbTJ(joinGroupDisplayModel);
        if (groupBillingTypeAEQbTJ != null) {
            boolean zDjBIcL = nTM.djBIcL(joinGroupDisplayModel);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(" " + getString(C35399nuc.LoaderManager.aWuQzD));
            if (!zDjBIcL) {
                android.widget.TextView textView = nhx.ejfBZ;
                android.text.SpannableStringBuilder spannableStringBuilderEZpvd = EZpvd(groupBillingTypeAEQbTJ, str);
                textView.setText(spannableStringBuilderEZpvd != null ? spannableStringBuilderEZpvd.append((java.lang.CharSequence) spannableStringBuilder) : null);
            } else {
                android.widget.TextView textView2 = nhx.ejfBZ;
                android.text.SpannableStringBuilder spannableStringBuilderAEQbTJ = AEQbTJ(groupBillingTypeAEQbTJ, str);
                textView2.setText(spannableStringBuilderAEQbTJ != null ? spannableStringBuilderAEQbTJ.append((java.lang.CharSequence) spannableStringBuilder) : null);
            }
        }
        if (joinGroupDisplayModel.KWHzl() != null) {
            Group group = nhx.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            nhx.getNewProxyInstance.setText(EZpvd(joinGroupDisplayModel));
        } else {
            Group group2 = nhx.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(8);
        }
        return nhx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(final nTF ntf) {
        nTY ntyAEQbTJ;
        ((nHX) KWHzl()).copydefault.setEnabled(false);
        if (ntf instanceof nTF.TaskDescription) {
            nTF.TaskDescription taskDescription = (nTF.TaskDescription) ntf;
            ntyAEQbTJ = nTY.Companion.AEQbTJ(true, taskDescription.OLrzqt(), taskDescription.AEQbTJ());
        } else {
            if (!Intrinsics.EZpvd(ntf, nTF.StateListAnimator.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            ntyAEQbTJ = nTY.Companion.AEQbTJ(false, "", "");
        }
        getSupportFragmentManager().setFragmentResultListener("RESULT_KEY_JOIN_REQUEST_FORM", this, new FragmentResultListener() { // from class: o.nTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                nTQ.OLrzqt(ntf, this, str, bundle);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        ntyAEQbTJ.show(supportFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(nTF ntf, nTQ ntq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("KEY_REQUEST_REASON")) {
            java.lang.String string = bundle.getString("KEY_REQUEST_REASON");
            if (ntf instanceof nTF.TaskDescription) {
                ntq.KWHzl(string);
                return;
            } else {
                if (!Intrinsics.EZpvd(ntf, nTF.StateListAnimator.AEQbTJ)) {
                    throw new NoWhenBranchMatchedException();
                }
                ntq.AhwBna().OLrzqt(string);
                return;
            }
        }
        ((nHX) ntq.KWHzl()).copydefault.setEnabled(true);
    }

    public final void copydefault(boolean z) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.QYNZmZ);
        viewOnClickListenerC54939xaY.copydefault(z ? C35399nuc.LoaderManager.FF : C35399nuc.LoaderManager.Dfv);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.avCqka, new View.OnClickListener() { // from class: o.nTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nTQ.KWHzl(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(nTQ ntq, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        android.widget.TextView textView = ((nHX) ntq.KWHzl()).AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        ntq.AhwBna().AkhnZx();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(final JoinGroupDisplayModel joinGroupDisplayModel) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.ORWKdN);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.Dfm);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.getNewProxyInstance, new View.OnClickListener() { // from class: o.nTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nTQ.AEQbTJ(this.copydefault, joinGroupDisplayModel, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(nTQ ntq, JoinGroupDisplayModel joinGroupDisplayModel, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        ((nHX) ntq.KWHzl()).AkhnZx.setText(ntq.EZpvd(joinGroupDisplayModel));
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(JoinGroupDisplayModel joinGroupDisplayModel) {
        OKConversation.Companion companion = OKConversation.Companion;
        OKConversationType oKConversationType = OKConversationType.GROUP;
        long jValueOf = joinGroupDisplayModel.valueOf();
        C33764nEz.OLrzqt.copydefault(companion.AEQbTJ(oKConversationType, java.lang.String.valueOf(jValueOf), joinGroupDisplayModel.AYXKKw()), this, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : null, (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
        C37290oqz.copydefault.AEQbTJ(this);
    }

    public final void djBIcL() {
        AhwBna().OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final nHX EZpvd(nTH nth, boolean z) {
        nHX nhx = (nHX) KWHzl();
        nhx.copydefault.setText(KWHzl(nth, z));
        nhx.copydefault.setEnabled(!Intrinsics.EZpvd(nth, nTH.TaskDescription.AEQbTJ));
        C52794wYp c52794wYp = nhx.copydefault;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, nth, this, z));
        return nhx;
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(nTQ.this.AhwBna().gEmmrt())), false, 4, null);
        }
    }

    public static /* synthetic */ void actionCreatePayment$default(nTQ ntq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        ntq.KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        AhwBna().AEQbTJ(str);
    }

    public final java.lang.String EZpvd(JoinGroupDisplayModel joinGroupDisplayModel) {
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfoKWHzl = joinGroupDisplayModel.KWHzl();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(groupEntryAssetVerificationInfoKWHzl != null ? groupEntryAssetVerificationInfoKWHzl.getAssetAmount() : null);
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfoKWHzl2 = joinGroupDisplayModel.KWHzl();
        return C38305pTw.formatCryptoCode$default(bigDecimalEZpvd, C33129mqd.gEmmrt(groupEntryAssetVerificationInfoKWHzl2 != null ? groupEntryAssetVerificationInfoKWHzl2.getCurrencyCode() : null), null, C38307pTy.Companion.AEQbTJ(100), null, null, null, 58, null);
    }

    public final android.text.SpannableStringBuilder EZpvd(GroupBillingType groupBillingType, java.lang.String str) {
        java.lang.String strKWHzl;
        java.lang.String string = getString(C35399nuc.LoaderManager.dYepVG);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i = Activity.AEQbTJ[groupBillingType.ordinal()];
        if (i == 1) {
            strKWHzl = C33069mpW.KWHzl(this, C35399nuc.LoaderManager.adevsa, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str)));
        } else {
            if (i != 2) {
                return null;
            }
            strKWHzl = C33069mpW.KWHzl(this, C35399nuc.LoaderManager.OFqMGB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str)));
        }
        java.lang.String strKWHzl2 = C33069mpW.KWHzl(this, C35399nuc.LoaderManager.hpmliR, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("strikethrough", strKWHzl), C56390yDp.OLrzqt(FirebaseAnalytics.Param.DISCOUNT, string)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strKWHzl2);
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strKWHzl2, strKWHzl, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default != -1) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), iIndexOf$default, strKWHzl.length() + iIndexOf$default, 33);
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default, strKWHzl.length() + iIndexOf$default, 33);
        }
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strKWHzl2, string, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default2 != -1) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default2, string.length() + iIndexOf$default2, 33);
        }
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder AEQbTJ(GroupBillingType groupBillingType, java.lang.String str) {
        int i;
        int i2 = Activity.AEQbTJ[groupBillingType.ordinal()];
        if (i2 == 1) {
            i = C35399nuc.LoaderManager.jFiva;
        } else {
            if (i2 != 2) {
                return null;
            }
            i = C35399nuc.LoaderManager.iMXFZQ;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.KWHzl(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final java.lang.CharSequence KWHzl(nTH nth, boolean z) {
        if (Intrinsics.EZpvd(nth, nTH.LoaderManager.EZpvd)) {
            java.lang.String string = getString(C35399nuc.LoaderManager.dzCpvv);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (nth instanceof nTH.PendingIntent) {
            java.lang.String string2 = (z || ((nTH.PendingIntent) nth).AEQbTJ()) ? getString(C35399nuc.LoaderManager.UfveVb) : getString(C35399nuc.LoaderManager.FQMcgEfQMcgE);
            Intrinsics.copydefault((java.lang.Object) string2);
            return string2;
        }
        if (Intrinsics.EZpvd(nth, nTH.StateListAnimator.OLrzqt)) {
            java.lang.String string3 = getString(C35399nuc.LoaderManager.zDGrpR);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (Intrinsics.EZpvd(nth, nTH.Dialog.OLrzqt)) {
            java.lang.String string4 = getString(C35399nuc.LoaderManager.hPlhRW);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        if (nth instanceof nTH.ActionBar) {
            java.lang.String string5 = getString(C35399nuc.LoaderManager.iLAtSv);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        if (Intrinsics.EZpvd(nth, nTH.Application.copydefault) || Intrinsics.EZpvd(nth, nTH.Activity.copydefault)) {
            java.lang.String string6 = getString(C35399nuc.LoaderManager.DIIpTV);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            return string6;
        }
        if (nth instanceof nTH.Fragment) {
            nTH.Fragment fragment = (nTH.Fragment) nth;
            return C33069mpW.KWHzl(this, C35399nuc.LoaderManager.QOeQqh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, fragment.AEQbTJ() + pTB.formatLocalizedWithMinPrecision$default(fragment.KWHzl(), 2, null, 2, null))));
        }
        if (!Intrinsics.EZpvd(nth, nTH.TaskDescription.AEQbTJ)) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String string7 = getString(C35399nuc.LoaderManager.DsfknC);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        return string7;
    }

    public final java.lang.CharSequence KWHzl(nTH nth, boolean z, GroupBillingType groupBillingType) {
        java.lang.String string;
        java.lang.String string2;
        string = "";
        if (Intrinsics.EZpvd(nth, nTH.StateListAnimator.OLrzqt)) {
            java.lang.String string3 = getString(C35399nuc.LoaderManager.GiPPlLQAswws);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (nth instanceof nTH.ActionBar) {
            string = z ? getString(C35399nuc.LoaderManager.hfFNez) : "";
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (nth instanceof nTH.Fragment) {
            int i = groupBillingType == null ? -1 : Activity.AEQbTJ[groupBillingType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    string2 = getString(C35399nuc.LoaderManager.isInitInProgress);
                }
                Intrinsics.copydefault((java.lang.Object) string);
                return string;
            }
            string2 = getString(C35399nuc.LoaderManager.aChkwz);
            string = string2;
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (!Intrinsics.EZpvd(nth, nTH.Dialog.OLrzqt)) {
            return "";
        }
        string = z ? getString(C35399nuc.LoaderManager.hfFNez) : "";
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final void valueOf() {
        InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
        if (interfaceC31257lqc != null) {
            interfaceC31257lqc.EZpvd((android.content.Context) this, false, true, true, "");
        }
    }

    public final void KWHzl(JoinGroupViewModel.Dialog.StateListAnimator stateListAnimator) {
        getSupportFragmentManager().setFragmentResultListener("RESULT_KEY_PAID_CONFIRM", this, new FragmentResultListener() { // from class: o.nTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                nTQ.OLrzqt(this.EZpvd, str, bundle);
            }
        });
        C34174nUd.Companion.OLrzqt(stateListAnimator.KWHzl().OLrzqt(), stateListAnimator.KWHzl().AEQbTJ(), stateListAnimator.KWHzl().KWHzl()).show(getSupportFragmentManager(), C34174nUd.class.getSimpleName());
    }

    public static final void OLrzqt(nTQ ntq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("KEY_REQUEST_CONFIRM") && bundle.getBoolean("KEY_REQUEST_CONFIRM")) {
            actionCreatePayment$default(ntq, null, 1, null);
        }
    }

    public final void AEQbTJ(JoinGroupViewModel.Dialog.Application application) {
        InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
        if (interfaceC31257lqc != null) {
            getSupportFragmentManager().setFragmentResultListener(interfaceC31257lqc.EZpvd(), this, new FragmentResultListener() { // from class: o.nTO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    nTQ.copydefault(this.KWHzl, str, bundle);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC31257lqc.OLrzqt(supportFragmentManager, Web3PayProjectId.IM_PAY, application.EZpvd());
        }
    }

    public static final void copydefault(nTQ ntq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        JoinGroupViewModel.refreshInviteInfo$default(ntq.AhwBna(), false, false, 3, null);
        ntq.AhwBna().EZpvd();
    }

    public final void OLrzqt(java.lang.String str) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (16 * f);
        Glide.copydefault((FragmentActivity) this).EZpvd(C7827arF.EZpvd(str, this, true)).EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(i)).OLrzqt(new TaskDescription(i, (int) (1 * f), ContextCompat.getColor(this, C52761wXj.Activity.zuBGHE)));
    }

    public static final class TaskDescription extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public TaskDescription(int i, int i2, int i3) {
            this.AEQbTJ = i;
            this.OLrzqt = i2;
            this.copydefault = i3;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i = this.AEQbTJ;
            int i2 = this.OLrzqt;
            int i3 = this.copydefault;
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(i);
            gradientDrawable.setStroke(i2, i3);
            gradientDrawable.setColor(0);
            ((nHX) nTQ.this.KWHzl()).KWHzl.setBackground(new LayerDrawable(new android.graphics.drawable.Drawable[]{drawable, gradientDrawable}));
        }
    }

    @Override // o.nTR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nTR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nTR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
