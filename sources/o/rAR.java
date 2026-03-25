package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Content;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Page;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Step;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rAR extends AbstractC52779wYa {
    public C54956xap AhwBna;
    public rAO EZpvd;
    public Activity KWHzl;
    public RiskStatus OLrzqt;
    public int copydefault;
    public ActivityResultLauncher<android.content.Intent> djBIcL;
    public CheckUKRiskStatusResponse gEmmrt;
    public Page valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RiskStatus.values().length];
            try {
                iArr[RiskStatus.QUESTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RiskStatus.COOLING_PERIOD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RiskStatus.GoToKyc.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RiskStatus.REDIRECTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[RiskStatus.VERIFY_CENTER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[RiskStatus.EXIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(rAO rao) {
        this.EZpvd = rao;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        this.AhwBna = c54956xap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rAO copydefault() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rAR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ rAR newInstance$default(ActionBar actionBar, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bundle = new android.os.Bundle();
            }
            return actionBar.OLrzqt(bundle);
        }

        public final rAR OLrzqt(android.os.Bundle bundle) {
            rAR rar = new rAR();
            rar.setArguments(bundle);
            return rar;
        }
    }

    public rAR() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                rAR.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
        this.copydefault = -1;
    }

    public static final void EZpvd(rAR rar, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.io.Serializable serializableExtra = data != null ? data.getSerializableExtra("kyc_result_data") : null;
            ResultBackStatus resultBackStatus = serializableExtra instanceof ResultBackStatus ? (ResultBackStatus) serializableExtra : null;
            pUU.KWHzl("zhoulijuan", java.lang.String.valueOf(resultBackStatus != null ? resultBackStatus.name() : null));
            rar.dismissAllowingStateLoss();
            rAO rao = rar.EZpvd;
            if (rao != null) {
                rao.copydefault(resultBackStatus);
            }
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rAZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rAR.OLrzqt(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void OLrzqt(rAR rar, android.view.View view) {
        rar.copydefault = 0;
        rar.dismissAllowingStateLoss();
        rAO rao = rar.EZpvd;
        if (rao != null) {
            rao.KWHzl(rar.copydefault);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = (RiskStatus) (arguments != null ? arguments.getSerializable("EXTRA_ACTION") : null);
        android.os.Bundle arguments2 = getArguments();
        CheckUKRiskStatusResponse checkUKRiskStatusResponse = arguments2 != null ? (CheckUKRiskStatusResponse) arguments2.getParcelable("EXTRA_PAGES") : null;
        this.gEmmrt = checkUKRiskStatusResponse;
        if (checkUKRiskStatusResponse != null) {
            RiskStatus riskStatus = this.OLrzqt;
            if (riskStatus != null && StateListAnimator.KWHzl[riskStatus.ordinal()] == 1) {
                if (checkUKRiskStatusResponse.getPages() != null && checkUKRiskStatusResponse.getPages().size() == 2) {
                    this.valueOf = checkUKRiskStatusResponse.getPages().get(1);
                }
            } else if (checkUKRiskStatusResponse.getPages() != null && checkUKRiskStatusResponse.getPages().size() == 1) {
                this.valueOf = checkUKRiskStatusResponse.getPages().get(0);
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static final class FragmentManager extends BottomSheetBehavior.BottomSheetCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public FragmentManager() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 5) {
                rAR.this.copydefault = 2;
                rAO raoCopydefault = rAR.this.copydefault();
                if (raoCopydefault != null) {
                    raoCopydefault.KWHzl(rAR.this.copydefault);
                }
            }
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.addBottomSheetCallback(new FragmentManager());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0140  */
    @Override // o.AbstractC52779wYa, o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String label;
        int i;
        java.lang.String str;
        BtnTips btnTips;
        BtnTips btnTips2;
        BtnTips btnTips3;
        BtnTips btnTips4;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        Page page = this.valueOf;
        if (page != null && page.getBtnTips() != null) {
            Page page2 = this.valueOf;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((page2 == null || (btnTips4 = page2.getBtnTips()) == null) ? null : btnTips4.getLabel()))) {
                wyf.setId(10);
                ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DWgRXt, wyf, false);
                Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                AbstractC43974rzR abstractC43974rzR = (AbstractC43974rzR) viewDataBindingInflate;
                abstractC43974rzR.OLrzqt.setVisibility(0);
                android.widget.TextView textView = abstractC43974rzR.AEQbTJ;
                Page page3 = this.valueOf;
                if (page3 == null || (btnTips3 = page3.getBtnTips()) == null || (label = btnTips3.getLabel()) == null) {
                    label = "";
                }
                textView.setText(label);
                Page page4 = this.valueOf;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((page4 == null || (btnTips2 = page4.getBtnTips()) == null) ? null : btnTips2.getLabelIcon()))) {
                    android.widget.ImageView imageView = abstractC43974rzR.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    android.widget.ImageView imageView2 = abstractC43974rzR.KWHzl;
                    Page page5 = this.valueOf;
                    java.lang.String labelIcon = (page5 == null || (btnTips = page5.getBtnTips()) == null) ? null : btnTips.getLabelIcon();
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
                                    abstractC43974rzR.KWHzl.setImageTintList(ContextCompat.getColorStateList(requireContext(), C52761wXj.Activity.finishInit));
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
                        imageView2.setImageResource(i);
                    }
                }
                android.view.ViewParent parent = wyf.getParent();
                if (parent instanceof ConstraintLayout) {
                    android.view.View root = abstractC43974rzR.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    root.setId(android.view.View.generateViewId());
                    ((ConstraintLayout) parent).addView(root);
                    ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        layoutParams2.startToStart = 0;
                        layoutParams2.endToEnd = 0;
                        layoutParams2.bottomToBottom = 0;
                        root.setLayoutParams(layoutParams2);
                        ViewGroup.LayoutParams layoutParams3 = wyf.getLayoutParams();
                        if (layoutParams3 != null) {
                            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                            layoutParams4.bottomToTop = root.getId();
                            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = C55298xhM.px2dp$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                            wyf.setLayoutParams(layoutParams4);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
            }
        }
        Page page6 = this.valueOf;
        if (page6 != null) {
            PrimaryButton primaryButton = page6.getPrimaryButton();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (primaryButton != null ? primaryButton.getText() : null))) {
                wyf.setVisibility(0);
                PrimaryButton primaryButton2 = page6.getPrimaryButton();
                wyf.setPrimaryText(primaryButton2 != null ? primaryButton2.getText() : null);
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                PrimaryButton primaryButton3 = page6.getPrimaryButton();
                EZpvd(c52794wYpCopydefault, primaryButton3 != null ? primaryButton3.getStyle() : null);
                C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    PrimaryButton primaryButton4 = page6.getPrimaryButton();
                    c52794wYpCopydefault2.setEnabled(primaryButton4 != null ? Intrinsics.EZpvd(primaryButton4.getEnabled(), java.lang.Boolean.TRUE) : false);
                }
            } else {
                wyf.setVisibility(8);
            }
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new Fragment(c52794wYpCopydefault3, 1000L, this, wyf));
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ wYF AEQbTJ;
        public final /* synthetic */ rAR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, rAR rar, wYF wyf) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = rar;
            this.AEQbTJ = wyf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.HashMap<java.lang.String, java.lang.String> actionParams;
            rTU rtu;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                RiskStatus riskStatus = this.EZpvd.OLrzqt;
                switch (riskStatus == null ? -1 : StateListAnimator.KWHzl[riskStatus.ordinal()]) {
                    case 1:
                        CheckUKRiskStatusResponse checkUKRiskStatusResponse = this.EZpvd.gEmmrt;
                        if (checkUKRiskStatusResponse != null) {
                            java.lang.String playbook = checkUKRiskStatusResponse.getPlaybook();
                            java.lang.String str = playbook == null ? "" : playbook;
                            java.util.HashMap<java.lang.String, java.lang.String> playbookParams = checkUKRiskStatusResponse.getPlaybookParams();
                            C52794wYp c52794wYpCopydefault = this.AEQbTJ.copydefault();
                            if (c52794wYpCopydefault != null) {
                                C52794wYp.startLoading$default(c52794wYpCopydefault, 0L, 1, null);
                            }
                            rTM rtm = rTM.KWHzl;
                            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                            rtm.EZpvd(fragmentActivityRequireActivity, LifecycleOwnerKt.getLifecycleScope(this.EZpvd), str, playbookParams, this.EZpvd.djBIcL, new TaskDescription(this.AEQbTJ));
                        }
                        break;
                    case 2:
                        this.EZpvd.dismissAllowingStateLoss();
                        this.EZpvd.copydefault = 0;
                        rAO raoCopydefault = this.EZpvd.copydefault();
                        if (raoCopydefault != null) {
                            raoCopydefault.KWHzl(this.EZpvd.copydefault);
                        }
                        break;
                    case 3:
                        CheckUKRiskStatusResponse checkUKRiskStatusResponse2 = this.EZpvd.gEmmrt;
                        if (checkUKRiskStatusResponse2 != null) {
                            java.lang.String playbook2 = checkUKRiskStatusResponse2.getPlaybook();
                            java.lang.String str2 = playbook2 == null ? "" : playbook2;
                            java.util.HashMap<java.lang.String, java.lang.String> playbookParams2 = checkUKRiskStatusResponse2.getPlaybookParams();
                            C52794wYp c52794wYpCopydefault2 = this.AEQbTJ.copydefault();
                            if (c52794wYpCopydefault2 != null) {
                                C52794wYp.startLoading$default(c52794wYpCopydefault2, 0L, 1, null);
                            }
                            this.EZpvd.requireContext();
                            rTM rtm2 = rTM.KWHzl;
                            FragmentActivity fragmentActivityRequireActivity2 = this.EZpvd.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                            rtm2.EZpvd(fragmentActivityRequireActivity2, LifecycleOwnerKt.getLifecycleScope(this.EZpvd), str2, playbookParams2, this.EZpvd.djBIcL, new Dialog(this.AEQbTJ));
                        }
                        break;
                    case 4:
                        CheckUKRiskStatusResponse checkUKRiskStatusResponse3 = this.EZpvd.gEmmrt;
                        if (checkUKRiskStatusResponse3 != null && (actionParams = checkUKRiskStatusResponse3.getActionParams()) != null) {
                            java.lang.String str3 = actionParams.get("deeplink");
                            java.lang.String str4 = str3 == null ? "" : str3;
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
                                C42463rTu c42463rTu = C42463rTu.KWHzl;
                                FragmentActivity fragmentActivityRequireActivity3 = this.EZpvd.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
                                C42463rTu.deepLinkJump$default(c42463rTu, fragmentActivityRequireActivity3, str4, null, 4, null);
                            }
                            break;
                        }
                        break;
                    case 5:
                        this.EZpvd.dismissAllowingStateLoss();
                        android.content.Context context = this.EZpvd.getContext();
                        if (context != null && (rtu = (rTU) C43251rlk.OLrzqt(rTU.class)) != null) {
                            rTU.Application.openKYCUserCenter$default(rtu, context, null, 2, null);
                            break;
                        }
                        break;
                    case 6:
                        this.EZpvd.dismissAllowingStateLoss();
                        break;
                }
            }
        }
    }

    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ wYF EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(wYF wyf) {
            this.EZpvd = wyf;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C52794wYp c52794wYpCopydefault = this.EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.fIwbmz();
            }
        }
    }

    public static final class Dialog implements Function0<Unit> {
        public final /* synthetic */ wYF AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(wYF wyf) {
            this.AEQbTJ = wyf;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C52794wYp c52794wYpCopydefault = this.AEQbTJ.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.fIwbmz();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:0x01ff */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:116:0x01fc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0237  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    @Override // o.AbstractC52779wYa, o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        int i;
        C54956xap c54956xap;
        int i2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Page page = this.valueOf;
        if (page != null) {
            C54956xap c54956xap2 = this.AhwBna;
            if (c54956xap2 == null) {
                Intrinsics.gEmmrt("");
                c54956xap2 = null;
            }
            CheckUKRiskStatusResponse checkUKRiskStatusResponse = this.gEmmrt;
            java.lang.Integer numEZpvd = rQW.EZpvd(checkUKRiskStatusResponse != null ? checkUKRiskStatusResponse.getName() : null, TtmlNode.TAG_IMAGE);
            if (numEZpvd != null) {
                int iIntValue = numEZpvd.intValue();
                if (Intrinsics.EZpvd((java.lang.Object) getResources().getResourceTypeName(iIntValue), (java.lang.Object) "drawable")) {
                    c54956xap2.OLrzqt.setVisibility(0);
                    c54956xap2.OLrzqt.setImageResource(iIntValue);
                    CheckUKRiskStatusResponse checkUKRiskStatusResponse2 = this.gEmmrt;
                    if (Intrinsics.EZpvd((java.lang.Object) (checkUKRiskStatusResponse2 != null ? checkUKRiskStatusResponse2.getName() : null), (java.lang.Object) "onboarding")) {
                        ViewGroup.LayoutParams layoutParams = c54956xap2.OLrzqt.getLayoutParams();
                        if (layoutParams instanceof LinearLayout.LayoutParams) {
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.gravity = 8388611;
                            android.content.Context contextRequireContext = requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            layoutParams2.height = C55298xhM.OLrzqt(200, contextRequireContext);
                            android.content.Context contextRequireContext2 = requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                            layoutParams2.width = C55298xhM.OLrzqt(200, contextRequireContext2);
                        }
                        c54956xap2.OLrzqt.setLayoutParams(layoutParams);
                    }
                } else {
                    c54956xap2.OLrzqt.setVisibility(8);
                    android.view.ViewParent parent = c54956xap2.OLrzqt.getParent();
                    if (parent instanceof android.widget.LinearLayout) {
                        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
                        android.content.Context context = lottieAnimationView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        int iOLrzqt = C55298xhM.OLrzqt(200, context);
                        android.content.Context context2 = lottieAnimationView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(200, context2));
                        layoutParams3.gravity = 1;
                        lottieAnimationView.setLayoutParams(layoutParams3);
                        lottieAnimationView.setRepeatCount(0);
                        lottieAnimationView.setAnimation(iIntValue);
                        ((android.widget.LinearLayout) parent).addView(lottieAnimationView, 0);
                        lottieAnimationView.playAnimation();
                    }
                }
            } else {
                ViewGroup.LayoutParams layoutParams4 = c54956xap2.OLrzqt.getLayoutParams();
                if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388611;
                }
                c54956xap2.OLrzqt.setLayoutParams(layoutParams4);
                c54956xap2.OLrzqt.setImageResource(C43662rtX.Activity.iwGUEr);
            }
            AppCompatTextView appCompatTextView = c54956xap2.valueOf;
            java.lang.String titleAlign = page.getTitleAlign();
            if (titleAlign == null) {
                i = 8388611;
            } else {
                int iHashCode = titleAlign.hashCode();
                if (iHashCode != -1364013995) {
                    if (iHashCode == 50359046) {
                        titleAlign.equals("leading");
                    } else if (iHashCode == 1276059676 && titleAlign.equals("trailing")) {
                        i = 8388613;
                    }
                    i = 8388611;
                } else if (titleAlign.equals(TtmlNode.CENTER)) {
                    i = 17;
                }
            }
            appCompatTextView.setGravity(i);
            c54956xap2.valueOf.setTextSize(28.0f);
            c54956xap2.valueOf.setText(page.getTitle());
            if (C33129mqd.KWHzl((java.util.Collection) page.getContent())) {
                ?? sb = new java.lang.StringBuilder();
                java.util.List<Content> content = page.getContent();
                Intrinsics.copydefault(content);
                int size = content.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Content content2 = page.getContent().get(i3);
                    java.lang.String text = content2.getText();
                    java.lang.String str = text == null ? "" : text;
                    java.util.HashMap<java.lang.String, java.lang.String> bold = content2.getBold();
                    if (bold == null) {
                        bold = new java.util.HashMap<>();
                    }
                    sb.append(C33069mpW.OLrzqt(str, bold));
                    if (i3 < page.getContent().size() - 1) {
                        sb.append('\n');
                    }
                }
                if (C33129mqd.KWHzl((java.util.Collection) page.getContent())) {
                    int size2 = page.getContent().size();
                    int i4 = 0;
                    sb = sb;
                    while (i4 < size2) {
                        java.util.HashMap<java.lang.String, java.lang.String> bold2 = page.getContent().get(i4).getBold();
                        if (bold2 != null) {
                            java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it = bold2.entrySet().iterator();
                            sb = sb;
                            while (it.hasNext()) {
                                sb = C33061mpO.setupSpanStyles$default((java.lang.CharSequence) sb, new java.lang.String[]{it.next().getValue()}, 0, null, false, new Function1() { // from class: o.rAV
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return rAR.EZpvd((java.util.List) obj);
                                    }
                                }, 14, null);
                            }
                        }
                        i4++;
                        sb = sb;
                    }
                }
                c54956xap2.AEQbTJ.setText((java.lang.CharSequence) sb);
                AppCompatTextView appCompatTextView2 = c54956xap2.AEQbTJ;
                java.lang.String contentAlign = page.getContentAlign();
                if (contentAlign == null) {
                    i2 = 8388611;
                    appCompatTextView2.setGravity(i2);
                } else {
                    int iHashCode2 = contentAlign.hashCode();
                    if (iHashCode2 != -1364013995) {
                        if (iHashCode2 != 50359046) {
                            if (iHashCode2 == 1276059676 && contentAlign.equals("trailing")) {
                                i2 = 8388613;
                            }
                            appCompatTextView2.setGravity(i2);
                        } else {
                            contentAlign.equals("leading");
                        }
                        i2 = 8388611;
                        appCompatTextView2.setGravity(i2);
                    } else {
                        if (contentAlign.equals(TtmlNode.CENTER)) {
                            i2 = 17;
                        }
                        appCompatTextView2.setGravity(i2);
                    }
                }
            }
            c54956xap2.KWHzl.setVisibility(8);
            java.util.List<Step> steps = page.getSteps();
            if (steps != null) {
                ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DGUQLI, constraintLayout, false);
                Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                AbstractC43971rzO abstractC43971rzO = (AbstractC43971rzO) viewDataBindingInflate;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) page.getStepTitle())) {
                    android.widget.TextView textView = abstractC43971rzO.OLrzqt;
                    java.lang.String stepTitle = page.getStepTitle();
                    if (stepTitle == null) {
                        stepTitle = "";
                    }
                    textView.setText(stepTitle);
                    abstractC43971rzO.OLrzqt.setVisibility(0);
                }
                this.KWHzl = new Activity(steps);
                abstractC43971rzO.EZpvd.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                RecyclerView recyclerView = abstractC43971rzO.EZpvd;
                Activity activity = this.KWHzl;
                if (activity == null) {
                    Intrinsics.gEmmrt("");
                    activity = null;
                }
                recyclerView.setAdapter(activity);
                android.view.View root = abstractC43971rzO.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                C54956xap c54956xap3 = this.AhwBna;
                if (c54956xap3 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap = null;
                } else {
                    c54956xap = c54956xap3;
                }
                c54956xap.copydefault.addView(root);
            }
        }
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.StyleSpan(1));
        return Unit.INSTANCE;
    }

    public static final class Activity extends RecyclerView.Adapter<Application> {
        public java.util.List<Step> OLrzqt;

        public Activity(@NotNull java.util.List<Step> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC43929ryZ abstractC43929ryZEZpvd = AbstractC43929ryZ.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC43929ryZEZpvd, "");
            return new Application(abstractC43929ryZEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.AEQbTJ(i, this.OLrzqt.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC43929ryZ KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC43929ryZ abstractC43929ryZ) {
            super(abstractC43929ryZ.getRoot());
            Intrinsics.checkNotNullParameter(abstractC43929ryZ, "");
            this.KWHzl = abstractC43929ryZ;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(int i, @NotNull Step step) {
            int i2;
            Intrinsics.checkNotNullParameter(step, "");
            this.KWHzl.copydefault.setText(step.getText());
            if (Intrinsics.EZpvd((java.lang.Object) step.getIcon(), (java.lang.Object) DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER)) {
                this.KWHzl.KWHzl.setPadding(0, 0, 0, C55298xhM.dp2px$default(20.0f, null, 1, null));
                if (Intrinsics.EZpvd(step.getCompleted(), java.lang.Boolean.TRUE)) {
                    android.widget.TextView textView = this.KWHzl.OLrzqt;
                    textView.setBackground(ContextCompat.getDrawable(textView.getContext(), C52761wXj.TaskDescription.fdt));
                    textView.setText("");
                    return;
                } else {
                    android.widget.TextView textView2 = this.KWHzl.OLrzqt;
                    textView2.setBackground(ContextCompat.getDrawable(textView2.getContext(), C43662rtX.Activity.hBpjJd));
                    textView2.setText(java.lang.String.valueOf(i + 1));
                    return;
                }
            }
            this.KWHzl.KWHzl.setPadding(0, 0, 0, C55298xhM.dp2px$default(5.0f, null, 1, null));
            android.widget.TextView textView3 = this.KWHzl.OLrzqt;
            android.content.Context context = textView3.getContext();
            java.lang.String icon = step.getIcon();
            if (icon != null) {
                switch (icon.hashCode()) {
                    case -1354411225:
                        i2 = !icon.equals("solid-dot") ? C52761wXj.TaskDescription.fdt : C43662rtX.Activity.AwvSrB;
                        break;
                    case -355397396:
                        if (icon.equals("security_solid")) {
                            i2 = C52761wXj.TaskDescription.QhYuFg;
                            break;
                        }
                        break;
                    case 435514006:
                        if (icon.equals("security-shield")) {
                            i2 = C52761wXj.TaskDescription.DcNNRp;
                            break;
                        }
                        break;
                    case 1873729387:
                        if (icon.equals("hollow-dot")) {
                            i2 = C43662rtX.Activity.zLjUOn;
                            break;
                        }
                        break;
                }
            }
            textView3.setBackground(ContextCompat.getDrawable(context, i2));
            textView3.setText("");
        }
    }

    private final void EZpvd(C52794wYp c52794wYp, ButtonStyle buttonStyle) {
        int i = buttonStyle == null ? -1 : StateListAnimator.AEQbTJ[buttonStyle.ordinal()];
        if (i == 1) {
            if (c52794wYp != null) {
                c52794wYp.setOKDSType(257);
            }
        } else if (i == 2) {
            if (c52794wYp != null) {
                c52794wYp.setOKDSType(260);
            }
        } else if (i == 3 && c52794wYp != null) {
            c52794wYp.setOKDSType(258);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        pUU.EZpvd("qjf", "stepper dialog dismiss closeActionType = " + this.copydefault);
        int i = this.copydefault;
        if (i == 0 || i == 1 || i == 2) {
            return;
        }
        this.copydefault = 3;
        rAO rao = this.EZpvd;
        if (rao != null) {
            rao.KWHzl(3);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (isAdded()) {
            super.dismissAllowingStateLoss();
        }
    }
}
