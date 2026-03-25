package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HomeActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResultReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NotifyAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import o.InterfaceC43702ruK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C42045rEh extends AbstractC52779wYa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public HomeNotifyResponse EZpvd;
    public C54956xap OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        this.OLrzqt = c54956xap;
    }

    /* JADX INFO: renamed from: o.rEh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rEh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C42053rEp.KWHzl(true);
        android.os.Bundle arguments = getArguments();
        HomeNotifyResponse homeNotifyResponse = arguments != null ? (HomeNotifyResponse) arguments.getParcelable("response") : null;
        this.EZpvd = homeNotifyResponse instanceof HomeNotifyResponse ? homeNotifyResponse : null;
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        android.widget.ImageView imageViewOLrzqt;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        android.widget.ImageView imageViewOLrzqt2 = c52781wYc.OLrzqt();
        if (imageViewOLrzqt2 != null) {
            imageViewOLrzqt2.setOnClickListener(new View.OnClickListener() { // from class: o.rEf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42045rEh.OLrzqt(this.EZpvd, view);
                }
            });
        }
        HomeNotifyResponse homeNotifyResponse = this.EZpvd;
        if (homeNotifyResponse == null || !Intrinsics.EZpvd(homeNotifyResponse.getAllowClose(), java.lang.Boolean.FALSE) || (imageViewOLrzqt = c52781wYc.OLrzqt()) == null) {
            return;
        }
        imageViewOLrzqt.setVisibility(8);
    }

    public static final void OLrzqt(C42045rEh c42045rEh, android.view.View view) {
        c42045rEh.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        C42053rEp.KWHzl(false);
        pUU.EZpvd("zhoulijuan", "HomeNotifyComplianceBottomSheetDismiss");
        super.onDismiss(dialogInterface);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.app.Dialog dialog;
        super.onStart();
        HomeNotifyResponse homeNotifyResponse = this.EZpvd;
        if (homeNotifyResponse == null || !Intrinsics.EZpvd(homeNotifyResponse.getAllowClose(), java.lang.Boolean.FALSE) || (dialog = getDialog()) == null) {
            return;
        }
        dialog.setCancelable(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    @Override // o.AbstractC52779wYa, o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String buttonText;
        CtaData cta;
        BtnTips btnTips;
        int i;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        HomeNotifyResponse homeNotifyResponse = this.EZpvd;
        if (homeNotifyResponse == null || (buttonText = homeNotifyResponse.getButtonText()) == null) {
            buttonText = "";
        }
        HomeNotifyResponse homeNotifyResponse2 = this.EZpvd;
        if (homeNotifyResponse2 != null && (btnTips = homeNotifyResponse2.getBtnTips()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) btnTips.getLabel())) {
            wyf.setId(10);
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DWgRXt, wyf, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            AbstractC43974rzR abstractC43974rzR = (AbstractC43974rzR) viewDataBindingInflate;
            abstractC43974rzR.OLrzqt.setVisibility(0);
            android.widget.TextView textView = abstractC43974rzR.AEQbTJ;
            java.lang.String label = btnTips.getLabel();
            if (label == null) {
                label = "";
            }
            textView.setText(label);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) btnTips.getLabelIcon())) {
                abstractC43974rzR.KWHzl.setVisibility(0);
                android.widget.ImageView imageView = abstractC43974rzR.KWHzl;
                java.lang.String labelIcon = btnTips.getLabelIcon();
                if (labelIcon != null) {
                    switch (labelIcon.hashCode()) {
                        case -1689063219:
                            i = !labelIcon.equals("card-account-circle") ? C52761wXj.TaskDescription.DcNNRp : C43662rtX.Activity.DTwDnp;
                            break;
                        case -1354411225:
                            if (labelIcon.equals("solid-dot")) {
                                i = C43662rtX.Activity.AwvSrB;
                                break;
                            }
                            break;
                        case -1224012392:
                            if (labelIcon.equals("calendar-blank-circle")) {
                                i = C43662rtX.Activity.AubY;
                                break;
                            }
                            break;
                        case -1023983504:
                            if (labelIcon.equals("account-circle")) {
                                i = C43662rtX.Activity.hDKMBd;
                                break;
                            }
                            break;
                        case -1004807893:
                            if (labelIcon.equals("text-box")) {
                                i = C43662rtX.Activity.djSkpj;
                                break;
                            }
                            break;
                        case -737701964:
                            str = "shield-circle";
                            labelIcon.equals(str);
                            break;
                        case -355397396:
                            if (labelIcon.equals("security_solid")) {
                                i = C52761wXj.TaskDescription.QhYuFg;
                                break;
                            }
                            break;
                        case 94627080:
                            if (labelIcon.equals("check")) {
                                i = C52761wXj.TaskDescription.gGNlxh;
                                break;
                            }
                            break;
                        case 435514006:
                            str = "security-shield";
                            labelIcon.equals(str);
                            break;
                        case 1429035217:
                            if (labelIcon.equals("alert-outline")) {
                                i = C43662rtX.Activity.getNewProxyInstance;
                                break;
                            }
                            break;
                        case 1715887698:
                            if (labelIcon.equals("face-id-circle")) {
                                i = C43662rtX.Activity.OcIXYQ;
                                break;
                            }
                            break;
                        case 1821242348:
                            if (labelIcon.equals("eye-circle")) {
                                i = C43662rtX.Activity.ORxRYg;
                                break;
                            }
                            break;
                        case 1873729387:
                            if (labelIcon.equals("hollow-dot")) {
                                i = C43662rtX.Activity.zLjUOn;
                                break;
                            }
                            break;
                    }
                    imageView.setImageResource(i);
                }
            }
            android.view.ViewParent parent = wyf.getParent();
            if (parent instanceof ConstraintLayout) {
                android.view.View root = abstractC43974rzR.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                ((ConstraintLayout) parent).addView(root);
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomToTop = wyf.getId();
                    root.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
        }
        HomeNotifyResponse homeNotifyResponse3 = this.EZpvd;
        if (homeNotifyResponse3 != null && (cta = homeNotifyResponse3.getCta()) != null) {
            if (cta.getPrimaryButton() != null && cta.getSecondaryButton() != null) {
                wyf.setType(7);
            }
            DialogCtaButton primaryButton = cta.getPrimaryButton();
            Unit unit = null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (primaryButton != null ? primaryButton.getText() : null))) {
                wyf.setVisibility(0);
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setContentDescription("primaryButton");
                }
                DialogCtaButton primaryButton2 = cta.getPrimaryButton();
                wyf.setPrimaryText(primaryButton2 != null ? primaryButton2.getText() : null);
                C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
                DialogCtaButton primaryButton3 = cta.getPrimaryButton();
                copydefault(c52794wYpCopydefault2, primaryButton3 != null ? primaryButton3.getStyle() : null);
                C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
                if (c52794wYpCopydefault3 != null) {
                    DialogCtaButton primaryButton4 = cta.getPrimaryButton();
                    c52794wYpCopydefault3.setEnabled(primaryButton4 != null ? Intrinsics.EZpvd(primaryButton4.getEnabled(), java.lang.Boolean.TRUE) : false);
                }
                C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
                if (c52794wYpCopydefault4 != null) {
                    c52794wYpCopydefault4.setOnClickListener(new LoaderManager(c52794wYpCopydefault4, 1000L, this, cta));
                }
            } else {
                C52794wYp c52794wYpCopydefault5 = wyf.copydefault();
                if (c52794wYpCopydefault5 != null) {
                    c52794wYpCopydefault5.setVisibility(8);
                }
            }
            DialogCtaButton secondaryButton = cta.getSecondaryButton();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (secondaryButton != null ? secondaryButton.getText() : null))) {
                wyf.setVisibility(0);
                C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setContentDescription("secondaryButton");
                }
                DialogCtaButton secondaryButton2 = cta.getSecondaryButton();
                wyf.setSecondaryText(secondaryButton2 != null ? secondaryButton2.getText() : null);
                C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
                DialogCtaButton secondaryButton3 = cta.getSecondaryButton();
                copydefault(c52794wYpAEQbTJ2, secondaryButton3 != null ? secondaryButton3.getStyle() : null);
                C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ3 != null) {
                    DialogCtaButton secondaryButton4 = cta.getSecondaryButton();
                    c52794wYpAEQbTJ3.setEnabled(secondaryButton4 != null ? Intrinsics.EZpvd(secondaryButton4.getEnabled(), java.lang.Boolean.TRUE) : false);
                }
                C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ4 != null) {
                    c52794wYpAEQbTJ4.setOnClickListener(new Fragment(c52794wYpAEQbTJ4, 1000L, this, cta));
                    unit = Unit.INSTANCE;
                }
            } else {
                C52794wYp c52794wYpAEQbTJ5 = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ5 != null) {
                    c52794wYpAEQbTJ5.setVisibility(8);
                    unit = Unit.INSTANCE;
                }
            }
            if (unit != null) {
                return;
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) buttonText)) {
            wyf.setPrimaryText(buttonText);
        } else {
            wyf.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault6 = wyf.copydefault();
        if (c52794wYpCopydefault6 != null) {
            c52794wYpCopydefault6.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault7 = wyf.copydefault();
        if (c52794wYpCopydefault7 != null) {
            c52794wYpCopydefault7.setContentDescription("primaryButton");
        }
        C52794wYp c52794wYpCopydefault8 = wyf.copydefault();
        if (c52794wYpCopydefault8 != null) {
            c52794wYpCopydefault8.setOnClickListener(new PendingIntent(c52794wYpCopydefault8, 1000L, this));
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.rEh$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ C52794wYp AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C52794wYp c52794wYp) {
            this.AEQbTJ = c52794wYp;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            this.AEQbTJ.fIwbmz();
        }
    }

    /* JADX INFO: renamed from: o.rEh$Application */
    public static final class Application implements Function0<Unit> {
        public final /* synthetic */ C52794wYp EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C52794wYp c52794wYp) {
            this.EZpvd = c52794wYp;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C52794wYp.startLoading$default(this.EZpvd, 0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.rEh$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ CtaData AEQbTJ;
        public final /* synthetic */ C42045rEh EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C42045rEh c42045rEh, CtaData ctaData) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c42045rEh;
            this.AEQbTJ = ctaData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String action;
            java.lang.String playbook;
            HomeActionParams actionParams;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.OLrzqt;
                C42045rEh c42045rEh = this.EZpvd;
                DialogCtaButton secondaryButton = this.AEQbTJ.getSecondaryButton();
                if (secondaryButton == null || (action = secondaryButton.getAction()) == null) {
                    action = NotifyAction.OK.getAction();
                }
                DialogCtaButton secondaryButton2 = this.AEQbTJ.getSecondaryButton();
                if (secondaryButton2 == null || (playbook = secondaryButton2.getPlaybook()) == null) {
                    playbook = "";
                }
                DialogCtaButton secondaryButton3 = this.AEQbTJ.getSecondaryButton();
                java.util.HashMap<java.lang.String, java.lang.String> onboarding = (secondaryButton3 == null || (actionParams = secondaryButton3.getActionParams()) == null) ? null : actionParams.getOnboarding();
                DialogCtaButton secondaryButton4 = this.AEQbTJ.getSecondaryButton();
                c42045rEh.OLrzqt(action, playbook, onboarding, secondaryButton4 != null ? secondaryButton4.getDialog() : null, new Activity(c52794wYp), new StateListAnimator(c52794wYp));
            }
        }
    }

    /* JADX INFO: renamed from: o.rEh$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C42045rEh AEQbTJ;
        public final /* synthetic */ CtaData EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C42045rEh c42045rEh, CtaData ctaData) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c42045rEh;
            this.EZpvd = ctaData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String action;
            java.lang.String playbook;
            HomeActionParams actionParams;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.copydefault;
                C42045rEh c42045rEh = this.AEQbTJ;
                DialogCtaButton primaryButton = this.EZpvd.getPrimaryButton();
                if (primaryButton == null || (action = primaryButton.getAction()) == null) {
                    action = NotifyAction.OK.getAction();
                }
                DialogCtaButton primaryButton2 = this.EZpvd.getPrimaryButton();
                if (primaryButton2 == null || (playbook = primaryButton2.getPlaybook()) == null) {
                    playbook = "";
                }
                DialogCtaButton primaryButton3 = this.EZpvd.getPrimaryButton();
                java.util.HashMap<java.lang.String, java.lang.String> onboarding = (primaryButton3 == null || (actionParams = primaryButton3.getActionParams()) == null) ? null : actionParams.getOnboarding();
                DialogCtaButton primaryButton4 = this.EZpvd.getPrimaryButton();
                c42045rEh.OLrzqt(action, playbook, onboarding, primaryButton4 != null ? primaryButton4.getDialog() : null, new Application(c52794wYp), new ActionBar(c52794wYp));
            }
        }
    }

    /* JADX INFO: renamed from: o.rEh$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C42045rEh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C42045rEh c42045rEh) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c42045rEh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String action;
            java.lang.String playbook;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.KWHzl;
                C42045rEh c42045rEh = this.OLrzqt;
                HomeNotifyResponse homeNotifyResponse = c42045rEh.EZpvd;
                if (homeNotifyResponse == null || (action = homeNotifyResponse.getAction()) == null) {
                    action = NotifyAction.OK.getAction();
                }
                HomeNotifyResponse homeNotifyResponse2 = this.OLrzqt.EZpvd;
                if (homeNotifyResponse2 == null || (playbook = homeNotifyResponse2.getPlaybook()) == null) {
                    playbook = "";
                }
                HomeNotifyResponse homeNotifyResponse3 = this.OLrzqt.EZpvd;
                c42045rEh.OLrzqt(action, playbook, homeNotifyResponse3 != null ? homeNotifyResponse3.getActionParams() : null, null, new Dialog(c52794wYp), new FragmentManager(c52794wYp));
            }
        }
    }

    /* JADX INFO: renamed from: o.rEh$Activity */
    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ C52794wYp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C52794wYp c52794wYp) {
            this.copydefault = c52794wYp;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C52794wYp.startLoading$default(this.copydefault, 0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.rEh$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ C52794wYp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C52794wYp c52794wYp) {
            this.OLrzqt = c52794wYp;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            this.OLrzqt.fIwbmz();
        }
    }

    /* JADX INFO: renamed from: o.rEh$Dialog */
    public static final class Dialog implements Function0<Unit> {
        public final /* synthetic */ C52794wYp KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(C52794wYp c52794wYp) {
            this.KWHzl = c52794wYp;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C52794wYp.startLoading$default(this.KWHzl, 0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.rEh$FragmentManager */
    public static final class FragmentManager implements Function0<Unit> {
        public final /* synthetic */ C52794wYp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(C52794wYp c52794wYp) {
            this.copydefault = c52794wYp;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            this.copydefault.fIwbmz();
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> map, HomeButtonDialog homeButtonDialog, final Function0<Unit> function0, final Function0<Unit> function02) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) NotifyAction.OK.getAction()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) NotifyAction.CANCEL.getAction())) {
            if (isAdded()) {
                dismissAllowingStateLoss();
            }
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) NotifyAction.DIALOG.getAction())) {
                if (homeButtonDialog != null) {
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    KWHzl(fragmentActivityRequireActivity, homeButtonDialog, new Function1() { // from class: o.rEm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42045rEh.AEQbTJ(this.KWHzl, function0, function02, (DialogCtaButton) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) NotifyAction.ONBOARDING.getAction())) {
                function0.invoke();
                EZpvd(str2, map, new Function0() { // from class: o.rEt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C42045rEh.KWHzl(function02, this);
                    }
                });
            } else if (isAdded()) {
                dismissAllowingStateLoss();
            }
        }
    }

    public static final Unit AEQbTJ(C42045rEh c42045rEh, Function0 function0, Function0 function02, DialogCtaButton dialogCtaButton) {
        java.lang.String action;
        Intrinsics.checkNotNullParameter(dialogCtaButton, "");
        java.lang.String playbook = dialogCtaButton.getPlaybook();
        if (playbook != null && (action = dialogCtaButton.getAction()) != null) {
            HomeActionParams actionParams = dialogCtaButton.getActionParams();
            c42045rEh.OLrzqt(action, playbook, actionParams != null ? actionParams.getOnboarding() : null, null, function0, function02);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function0 function0, C42045rEh c42045rEh) {
        function0.invoke();
        if (c42045rEh.isAdded()) {
            c42045rEh.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull HomeButtonDialog homeButtonDialog, @NotNull final Function1<? super DialogCtaButton, Unit> function1) {
        final DialogCtaButton secondaryButton;
        DialogCtaButton secondaryButton2;
        java.lang.String text;
        final DialogCtaButton primaryButton;
        java.lang.String text2;
        DialogCtaButton primaryButton2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(homeButtonDialog, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        if (homeButtonDialog.getTitle() != null) {
            viewOnClickListenerC54939xaY.setTitle(homeButtonDialog.getTitle());
        }
        if (homeButtonDialog.getSubtitle() != null) {
            viewOnClickListenerC54939xaY.EZpvd(homeButtonDialog.getSubtitle());
        }
        CtaData cta = homeButtonDialog.getCta();
        if (cta != null && (primaryButton = cta.getPrimaryButton()) != null) {
            CtaData cta2 = homeButtonDialog.getCta();
            if (cta2 == null || (primaryButton2 = cta2.getPrimaryButton()) == null || (text2 = primaryButton2.getText()) == null) {
                text2 = "";
            }
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) text2, new View.OnClickListener() { // from class: o.rEg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42045rEh.EZpvd(primaryButton, viewOnClickListenerC54939xaY, function1, view);
                }
            });
        }
        CtaData cta3 = homeButtonDialog.getCta();
        if (cta3 != null && (secondaryButton = cta3.getSecondaryButton()) != null) {
            CtaData cta4 = homeButtonDialog.getCta();
            if (cta4 != null && (secondaryButton2 = cta4.getSecondaryButton()) != null && (text = secondaryButton2.getText()) != null) {
                str = text;
            }
            viewOnClickListenerC54939xaY.AEQbTJ(str, new View.OnClickListener() { // from class: o.rEj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42045rEh.KWHzl(secondaryButton, viewOnClickListenerC54939xaY, function1, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(DialogCtaButton dialogCtaButton, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        java.lang.String action = dialogCtaButton.getAction();
        if (Intrinsics.EZpvd((java.lang.Object) action, (java.lang.Object) NotifyAction.OK.getAction()) || Intrinsics.EZpvd((java.lang.Object) action, (java.lang.Object) NotifyAction.CANCEL.getAction())) {
            viewOnClickListenerC54939xaY.dismiss();
        } else {
            function1.invoke(dialogCtaButton);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void KWHzl(DialogCtaButton dialogCtaButton, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        java.lang.String action = dialogCtaButton.getAction();
        if (Intrinsics.EZpvd((java.lang.Object) action, (java.lang.Object) NotifyAction.OK.getAction()) || Intrinsics.EZpvd((java.lang.Object) action, (java.lang.Object) NotifyAction.CANCEL.getAction())) {
            viewOnClickListenerC54939xaY.dismiss();
        } else {
            function1.invoke(dialogCtaButton);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public final void copydefault(C52794wYp c52794wYp, java.lang.String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1174796206) {
                if (str.equals("tertiary") && c52794wYp != null) {
                    c52794wYp.setOKDSType(258);
                    return;
                }
                return;
            }
            if (iHashCode == -817598092) {
                if (str.equals("secondary") && c52794wYp != null) {
                    c52794wYp.setOKDSType(260);
                    return;
                }
                return;
            }
            if (iHashCode == -314765822 && str.equals("primary") && c52794wYp != null) {
                c52794wYp.setOKDSType(257);
            }
        }
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.Integer bannerType;
        java.lang.String playbook;
        java.lang.String content;
        java.lang.String title;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54956xap c54956xap = this.OLrzqt;
        if (c54956xap == null) {
            Intrinsics.gEmmrt("");
            c54956xap = null;
        }
        c54956xap.getRoot().setContentDescription("OKButtonedPopup");
        HomeNotifyResponse homeNotifyResponse = this.EZpvd;
        java.lang.Integer numEZpvd = rQW.EZpvd(homeNotifyResponse != null ? homeNotifyResponse.getIconName() : null, TtmlNode.TAG_IMAGE);
        if (numEZpvd != null) {
            int iIntValue = numEZpvd.intValue();
            if (Intrinsics.EZpvd((java.lang.Object) getResources().getResourceTypeName(iIntValue), (java.lang.Object) "drawable")) {
                c54956xap.OLrzqt.setVisibility(0);
                c54956xap.OLrzqt.setImageResource(iIntValue);
            } else {
                c54956xap.OLrzqt.setVisibility(8);
                android.view.ViewParent parent = c54956xap.OLrzqt.getParent();
                if (parent instanceof android.widget.LinearLayout) {
                    LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
                    android.content.Context context = lottieAnimationView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    int iOLrzqt = C55298xhM.OLrzqt(200, context);
                    android.content.Context context2 = lottieAnimationView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(200, context2));
                    layoutParams.gravity = 1;
                    lottieAnimationView.setLayoutParams(layoutParams);
                    lottieAnimationView.setRepeatCount(0);
                    lottieAnimationView.setAnimation(iIntValue);
                    ((android.widget.LinearLayout) parent).addView(lottieAnimationView, 0);
                    lottieAnimationView.playAnimation();
                }
            }
        } else {
            c54956xap.OLrzqt.setImageResource(C43662rtX.Activity.iwGUEr);
        }
        HomeNotifyResponse homeNotifyResponse2 = this.EZpvd;
        if (homeNotifyResponse2 != null && (title = homeNotifyResponse2.getTitle()) != null) {
            c54956xap.valueOf.setGravity(3);
            c54956xap.valueOf.setText(title);
        }
        HomeNotifyResponse homeNotifyResponse3 = this.EZpvd;
        if (homeNotifyResponse3 != null && (content = homeNotifyResponse3.getContent()) != null) {
            c54956xap.AEQbTJ.setText(content);
            c54956xap.AEQbTJ.setGravity(3);
        }
        HomeNotifyResponse homeNotifyResponse4 = this.EZpvd;
        if (homeNotifyResponse4 != null && (playbook = homeNotifyResponse4.getPlaybook()) != null) {
            str = playbook;
        }
        HomeNotifyResponse homeNotifyResponse5 = this.EZpvd;
        AEQbTJ(str, (homeNotifyResponse5 == null || (bannerType = homeNotifyResponse5.getBannerType()) == null) ? -1 : bannerType.intValue());
    }

    public final void AEQbTJ(java.lang.String str, int i) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).copydefault(new HomeNotifyResultReq(str, i));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33024moe.KWHzl(C58156yvv.EZpvd(abstractC58185ywXCopydefault, fragmentActivityRequireActivity)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.rEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42045rEh.AEQbTJ((java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C42045rEh.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42045rEh.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C42045rEh.KWHzl(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, final Function0<Unit> function0) {
        rTM rtm = rTM.KWHzl;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        rtm.EZpvd(fragmentActivityRequireActivity, LifecycleOwnerKt.getLifecycleScope(this), str, map, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : new Function0() { // from class: o.rEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42045rEh.OLrzqt(function0);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
