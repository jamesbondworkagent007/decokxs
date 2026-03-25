package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResultReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.QuestionItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.InterfaceC43702ruK;
import o.rRP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class rRV extends AbstractC52779wYa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C54956xap AYXKKw;
    public ButtonDialog OLrzqt;
    public Quit djBIcL;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.rSj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return rRV.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rSi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(rRV.OLrzqt(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rSb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return rRV.AhwBna(this.OLrzqt);
        }
    });

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ComplianceTheme.values().length];
            try {
                iArr[ComplianceTheme.OKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ComplianceTheme.OKX_LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[ButtonAction.values().length];
            try {
                iArr3[ButtonAction.Cancel.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[ButtonAction.Dialog.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[ButtonAction.Quit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialog OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        this.AYXKKw = c54956xap;
    }

    public rRV() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.DismissibleWithIconComplianceBottomSheet$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.DismissibleWithIconComplianceBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.DismissibleWithIconComplianceBottomSheet$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String djBIcL(rRV rrv) {
        java.lang.String string;
        android.os.Bundle arguments = rrv.getArguments();
        return (arguments == null || (string = arguments.getString("playbook")) == null) ? "" : string;
    }

    public final int copydefault() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int OLrzqt(rRV rrv) {
        android.os.Bundle arguments = rrv.getArguments();
        if (arguments != null) {
            return arguments.getInt("bannerType");
        }
        return -1;
    }

    private final C42163rIr KWHzl() {
        return (C42163rIr) this.AEQbTJ.getValue();
    }

    private final rQO EZpvd() {
        return (rQO) this.EZpvd.getValue();
    }

    public static final rQO AhwBna(rRV rrv) {
        androidx.fragment.app.FragmentManager childFragmentManager = rrv.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = rrv.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new rQO(childFragmentManager, fragmentActivityRequireActivity);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rRV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final rRV EZpvd(@NotNull ButtonDialog buttonDialog, Quit quit, java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.Boolean bool, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(buttonDialog, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("dialog", buttonDialog), C56390yDp.OLrzqt("question_dialog", quit), C56390yDp.OLrzqt(EopTrackEvent.KEY_COR, str), C56390yDp.OLrzqt("playbook", str2), C56390yDp.OLrzqt("playbookParams", map), C56390yDp.OLrzqt("pageId", str3), C56390yDp.OLrzqt("isFromHomePage", bool), C56390yDp.OLrzqt("bannerType", num));
            rRV rrv = new rRV();
            rrv.setArguments(bundleBundleOf);
            return rrv;
        }
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog == null || !Intrinsics.EZpvd(buttonDialog.isFullPage(), java.lang.Boolean.TRUE)) {
            return 0.0f;
        }
        return super.getHeightScale();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? (ButtonDialog) arguments.getParcelable("dialog") : null;
        android.os.Bundle arguments2 = getArguments();
        this.djBIcL = arguments2 != null ? (Quit) arguments2.getParcelable("question_dialog") : null;
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        ComplianceTheme complianceThemeCopydefault = rsf != null ? rsf.copydefault() : null;
        int i = complianceThemeCopydefault == null ? -1 : Application.EZpvd[complianceThemeCopydefault.ordinal()];
        if (i == 1) {
            requireActivity().setTheme(C43662rtX.FragmentManager.copydefault);
        } else if (i == 2) {
            requireActivity().setTheme(C43662rtX.FragmentManager.EZpvd);
        } else {
            int i2 = C43246rlf.OLrzqt.valueOf().getApplicationInfo().theme;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.app.Dialog dialog;
        super.onStart();
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog != null && Intrinsics.EZpvd(buttonDialog.isDismissable(), java.lang.Boolean.FALSE) && (dialog = getDialog()) != null) {
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
        }
        android.os.Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isFromHomePage")) {
            return;
        }
        AEQbTJ(gEmmrt(), copydefault());
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String entryPageId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.EZpvd().setVisibility(8);
        wxq.setStyle(3);
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog != null) {
            java.lang.Boolean allowClose = buttonDialog.getAllowClose();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean zEZpvd = Intrinsics.EZpvd(allowClose, bool);
            if (!(!Intrinsics.EZpvd(buttonDialog.isDismissable(), java.lang.Boolean.FALSE))) {
                wxq.setCloseVisibility(false);
                wxq.AEQbTJ().setVisibility(8);
            } else {
                wxq.setCloseVisibility(zEZpvd || Intrinsics.EZpvd(buttonDialog.isFullPage(), bool));
                wxq.AEQbTJ().setVisibility(zEZpvd ^ true ? 0 : 8);
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) buttonDialog.getIconState())) {
                java.lang.String title = buttonDialog.getTitle();
                if (title != null && title.length() != 0) {
                    wxq.setTitle(buttonDialog.getTitle());
                } else {
                    wxq.AYXKKw().setVisibility(8);
                    android.os.Bundle arguments = getArguments();
                    if (arguments != null && arguments.getBoolean("isFromHomePage")) {
                        wxq.setCloseVisibility(true);
                        wxq.AEQbTJ().setVisibility((wxq.KWHzl().getVisibility() == 0) ^ true ? 0 : 8);
                    }
                }
            } else {
                wxq.AYXKKw().setVisibility(8);
            }
        }
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
        ButtonDialog buttonDialog2 = this.OLrzqt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (buttonDialog2 != null ? buttonDialog2.getEntryPageId() : null))) {
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            ButtonDialog buttonDialog3 = this.OLrzqt;
            if (buttonDialog3 != null && (entryPageId = buttonDialog3.getEntryPageId()) != null) {
                str = entryPageId;
            }
            pairArr[0] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ENTRY_PAGE, str);
            C43693ruB.copydefault("KYCPage_Popup_Step_View", C56424yEw.AYXKKw(pairArr));
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ rRV EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ CTAButtonAppModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rRV rrv, CTAButtonAppModel cTAButtonAppModel) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = rrv;
            this.copydefault = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.OLrzqt((C52794wYp) this.AEQbTJ, this.copydefault);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ CTAButtonAppModel AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ rRV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rRV rrv, CTAButtonAppModel cTAButtonAppModel) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = rrv;
            this.AEQbTJ = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt((C52794wYp) this.EZpvd, this.AEQbTJ);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ rRV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, rRV rrv) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = rrv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String entryPageId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ButtonDialog buttonDialogOLrzqt = this.copydefault.OLrzqt();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (buttonDialogOLrzqt != null ? buttonDialogOLrzqt.getEntryPageId() : null))) {
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    ButtonDialog buttonDialogOLrzqt2 = this.copydefault.OLrzqt();
                    if (buttonDialogOLrzqt2 == null || (entryPageId = buttonDialogOLrzqt2.getEntryPageId()) == null) {
                        entryPageId = "";
                    }
                    pairArr[0] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ENTRY_PAGE, entryPageId);
                    pairArr[1] = C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "exit_close");
                    C43693ruB.copydefault("KYCPage_Popup_Step_Close", C56424yEw.AYXKKw(pairArr));
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog == null || !Intrinsics.EZpvd(buttonDialog.isFullPage(), java.lang.Boolean.TRUE)) {
            view.post(new java.lang.Runnable() { // from class: o.rRX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    rRV.AYXKKw(this.copydefault);
                }
            });
        }
    }

    public static final void AYXKKw(rRV rrv) {
        android.view.View viewFindViewById;
        C54956xap c54956xap = rrv.AYXKKw;
        if (c54956xap == null) {
            Intrinsics.gEmmrt("");
            c54956xap = null;
        }
        android.widget.RelativeLayout relativeLayoutAEQbTJ = c54956xap.getRoot();
        Intrinsics.checkNotNullExpressionValue(relativeLayoutAEQbTJ, "");
        relativeLayoutAEQbTJ.measure(View.MeasureSpec.makeMeasureSpec(relativeLayoutAEQbTJ.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = relativeLayoutAEQbTJ.getMeasuredHeight();
        C54946xaf binding = rrv.getBinding();
        C52781wYc c52781wYc = binding != null ? binding.EZpvd : null;
        C54946xaf binding2 = rrv.getBinding();
        wXQ wxq = binding2 != null ? binding2.KWHzl : null;
        C54946xaf binding3 = rrv.getBinding();
        ConstraintLayout constraintLayout = binding3 != null ? binding3.OLrzqt : null;
        int height = (c52781wYc != null ? c52781wYc.getHeight() : 0) + (wxq != null ? wxq.getHeight() : 0) + measuredHeight + (constraintLayout != null ? constraintLayout.getHeight() : 0);
        android.app.Dialog dialog = rrv.getDialog();
        if (dialog == null || (viewFindViewById = dialog.findViewById(com.google.android.material.R.id.design_bottom_sheet)) == null || height <= 0 || height >= viewFindViewById.getHeight()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = height;
        }
        viewFindViewById.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178  */
    @Override // o.AbstractC52779wYa, o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFooterCreated(@NotNull final wYF wyf) {
        int i;
        int i2;
        C54956xap c54956xap;
        DialogCheckboxAppModel dialogCheckbox;
        C54956xap c54956xap2;
        FreeTextAppModel dialogBottomText;
        CtaPopUp cta;
        int i3;
        int i4;
        int i5;
        CTAButtonAppModel secondaryButton;
        Unit unit;
        java.lang.CharSequence charSequenceName;
        Unit unit2;
        java.lang.CharSequence charSequenceName2;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog == null || (cta = buttonDialog.getCta()) == null) {
            i = 8;
        } else {
            if (cta.getPrimaryButton() != null && cta.getSecondaryButton() != null) {
                wyf.setType(7);
            } else if (cta.getPrimaryButton() == null && cta.getSecondaryButton() == null) {
                wyf.setVisibility(8);
            }
            CTAButtonAppModel primaryButton = cta.getPrimaryButton();
            if (primaryButton != null) {
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    ButtonAction action = primaryButton.getAction();
                    if (action == null || (charSequenceName2 = action.name()) == null) {
                        charSequenceName2 = "primary";
                    }
                    c52794wYpCopydefault.setContentDescription(charSequenceName2);
                }
                java.lang.CharSequence text = primaryButton.getText();
                if (text == null) {
                    text = "";
                }
                wyf.setPrimaryText(text);
                C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    i3 = 2;
                    i4 = 257;
                    i5 = 3;
                    c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, this, primaryButton));
                } else {
                    i3 = 2;
                    i4 = 257;
                    i5 = 3;
                }
                ButtonStyle style = primaryButton.getStyle();
                int i6 = style == null ? -1 : Application.copydefault[style.ordinal()];
                if (i6 == 1) {
                    C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
                    if (c52794wYpCopydefault3 != null) {
                        c52794wYpCopydefault3.setOKDSType(i4);
                        unit2 = Unit.INSTANCE;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                    }
                    secondaryButton = cta.getSecondaryButton();
                    if (secondaryButton != null) {
                    }
                } else if (i6 == i3) {
                    C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
                    if (c52794wYpCopydefault4 != null) {
                        c52794wYpCopydefault4.setOKDSType(260);
                        unit2 = Unit.INSTANCE;
                        if (unit2 == null) {
                        }
                        secondaryButton = cta.getSecondaryButton();
                        if (secondaryButton != null) {
                        }
                    }
                    unit2 = null;
                    if (unit2 == null) {
                    }
                    secondaryButton = cta.getSecondaryButton();
                    if (secondaryButton != null) {
                    }
                } else if (i6 == i5) {
                    C52794wYp c52794wYpCopydefault5 = wyf.copydefault();
                    if (c52794wYpCopydefault5 != null) {
                        c52794wYpCopydefault5.setOKDSType(258);
                        unit2 = Unit.INSTANCE;
                        if (unit2 == null) {
                        }
                        secondaryButton = cta.getSecondaryButton();
                        if (secondaryButton != null) {
                        }
                    }
                    unit2 = null;
                    if (unit2 == null) {
                    }
                    secondaryButton = cta.getSecondaryButton();
                    if (secondaryButton != null) {
                    }
                } else {
                    C52794wYp c52794wYpCopydefault6 = wyf.copydefault();
                    if (c52794wYpCopydefault6 != null) {
                        c52794wYpCopydefault6.setOKDSType(i4);
                        unit2 = Unit.INSTANCE;
                        if (unit2 == null) {
                        }
                        secondaryButton = cta.getSecondaryButton();
                        if (secondaryButton != null) {
                            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
                            if (c52794wYpAEQbTJ != null) {
                                ButtonAction action2 = secondaryButton.getAction();
                                if (action2 == null || (charSequenceName = action2.name()) == null) {
                                    charSequenceName = "secondary";
                                }
                                c52794wYpAEQbTJ.setContentDescription(charSequenceName);
                            }
                            java.lang.CharSequence text2 = secondaryButton.getText();
                            if (text2 == null) {
                                text2 = "";
                            }
                            wyf.setSecondaryText(text2);
                            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
                            if (c52794wYpAEQbTJ2 != null) {
                                c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, this, secondaryButton));
                            }
                            ButtonStyle style2 = secondaryButton.getStyle();
                            int i7 = style2 == null ? -1 : Application.copydefault[style2.ordinal()];
                            if (i7 == 1) {
                                C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
                                if (c52794wYpAEQbTJ3 != null) {
                                    c52794wYpAEQbTJ3.setOKDSType(i4);
                                    unit = Unit.INSTANCE;
                                }
                                if (unit != null) {
                                }
                            } else if (i7 == i3) {
                                C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
                                if (c52794wYpAEQbTJ4 != null) {
                                    c52794wYpAEQbTJ4.setOKDSType(260);
                                    unit = Unit.INSTANCE;
                                }
                                if (unit != null) {
                                }
                            } else if (i7 == i5) {
                                C52794wYp c52794wYpAEQbTJ5 = wyf.AEQbTJ();
                                if (c52794wYpAEQbTJ5 != null) {
                                    c52794wYpAEQbTJ5.setOKDSType(258);
                                    unit = Unit.INSTANCE;
                                }
                                if (unit != null) {
                                }
                            } else {
                                C52794wYp c52794wYpAEQbTJ6 = wyf.AEQbTJ();
                                if (c52794wYpAEQbTJ6 != null) {
                                    c52794wYpAEQbTJ6.setOKDSType(i4);
                                    unit = Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                if (unit != null) {
                                }
                            }
                        } else {
                            C52794wYp c52794wYpAEQbTJ7 = wyf.AEQbTJ();
                            if (c52794wYpAEQbTJ7 != null) {
                                i = 8;
                                c52794wYpAEQbTJ7.setVisibility(8);
                            } else {
                                i = 8;
                            }
                        }
                    }
                    unit2 = null;
                    if (unit2 == null) {
                    }
                    secondaryButton = cta.getSecondaryButton();
                    if (secondaryButton != null) {
                    }
                }
            } else {
                i3 = 2;
                i4 = 257;
                i5 = 3;
            }
            C52794wYp c52794wYpCopydefault7 = wyf.copydefault();
            if (c52794wYpCopydefault7 != null) {
                c52794wYpCopydefault7.setVisibility(8);
            }
            secondaryButton = cta.getSecondaryButton();
            if (secondaryButton != null) {
            }
        }
        ButtonDialog buttonDialog2 = this.OLrzqt;
        if (buttonDialog2 != null && (dialogBottomText = buttonDialog2.getDialogBottomText()) != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C42267rMn c42267rMn = new C42267rMn(fragmentActivityRequireActivity, null, 0, 6, null);
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            c42267rMn.EZpvd(fragmentActivityRequireActivity2, (AbstractC42074rFj) null, dialogBottomText);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
            Unit unit3 = Unit.INSTANCE;
            wyf.addView(c42267rMn, layoutParams);
        }
        ButtonDialog buttonDialog3 = this.OLrzqt;
        if ((buttonDialog3 != null ? buttonDialog3.getCta() : null) != null) {
            i2 = 0;
        } else {
            ButtonDialog buttonDialog4 = this.OLrzqt;
            if ((buttonDialog4 != null ? buttonDialog4.getDialogBottomText() : null) == null) {
                i2 = i;
            }
        }
        wyf.setVisibility(i2);
        wyf.setPadding(wyf.getPaddingLeft(), C55298xhM.dp2px$default(24.0f, null, 1, null), wyf.getPaddingRight(), wyf.getPaddingBottom());
        ButtonDialog buttonDialog5 = this.OLrzqt;
        if (buttonDialog5 != null && (dialogCheckbox = buttonDialog5.getDialogCheckbox()) != null) {
            C52794wYp c52794wYpCopydefault8 = wyf.copydefault();
            if (c52794wYpCopydefault8 != null) {
                c52794wYpCopydefault8.setEnabled(false);
            }
            C54956xap c54956xap3 = this.AYXKKw;
            if (c54956xap3 == null) {
                Intrinsics.gEmmrt("");
                c54956xap3 = null;
            }
            c54956xap3.EZpvd.setText(dialogCheckbox.getText());
            java.lang.Integer fontSize = dialogCheckbox.getFontSize();
            if (fontSize != null) {
                int iIntValue = fontSize.intValue();
                C54956xap c54956xap4 = this.AYXKKw;
                if (c54956xap4 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap4 = null;
                }
                c54956xap4.EZpvd.setTextSize(iIntValue);
            }
            java.lang.String textColor = dialogCheckbox.getTextColor();
            if (textColor != null) {
                C54956xap c54956xap5 = this.AYXKKw;
                if (c54956xap5 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap5 = null;
                }
                wYK wyk = c54956xap5.EZpvd;
                rQR rqr = rQR.AEQbTJ;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                wyk.setTextColor(rqr.AEQbTJ(contextRequireContext, textColor));
            }
            C54956xap c54956xap6 = this.AYXKKw;
            if (c54956xap6 == null) {
                Intrinsics.gEmmrt("");
                c54956xap6 = null;
            }
            wYK wyk2 = c54956xap6.EZpvd;
            Intrinsics.checkNotNullExpressionValue(wyk2, "");
            wyk2.setVisibility(0);
            ButtonDialog buttonDialog6 = this.OLrzqt;
            if (buttonDialog6 == null || !Intrinsics.EZpvd(buttonDialog6.isFullPage(), java.lang.Boolean.TRUE)) {
                C54956xap c54956xap7 = this.AYXKKw;
                if (c54956xap7 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap7 = null;
                }
                c54956xap7.EZpvd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                C54956xap c54956xap8 = this.AYXKKw;
                if (c54956xap8 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap8 = null;
                }
                int measuredHeight = c54956xap8.EZpvd.getMeasuredHeight();
                int iDp2px$default = C55298xhM.dp2px$default(64.0f, null, 1, null);
                C54956xap c54956xap9 = this.AYXKKw;
                if (c54956xap9 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap9 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = c54956xap9.copydefault.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = measuredHeight + iDp2px$default;
                    C54956xap c54956xap10 = this.AYXKKw;
                    if (c54956xap10 == null) {
                        Intrinsics.gEmmrt("");
                        c54956xap10 = null;
                    }
                    c54956xap10.copydefault.setLayoutParams(marginLayoutParams);
                }
            }
            C54956xap c54956xap11 = this.AYXKKw;
            if (c54956xap11 == null) {
                Intrinsics.gEmmrt("");
                c54956xap2 = null;
            } else {
                c54956xap2 = c54956xap11;
            }
            c54956xap2.EZpvd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.rSa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    rRV.AEQbTJ(wyf, compoundButton, z);
                }
            });
            return;
        }
        ButtonDialog buttonDialog7 = this.OLrzqt;
        if (buttonDialog7 == null || !Intrinsics.EZpvd(buttonDialog7.isFullPage(), java.lang.Boolean.TRUE)) {
            C54956xap c54956xap12 = this.AYXKKw;
            if (c54956xap12 == null) {
                Intrinsics.gEmmrt("");
                c54956xap12 = null;
            }
            ViewGroup.LayoutParams layoutParams3 = c54956xap12.copydefault.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
                C54956xap c54956xap13 = this.AYXKKw;
                if (c54956xap13 == null) {
                    Intrinsics.gEmmrt("");
                    c54956xap = null;
                } else {
                    c54956xap = c54956xap13;
                }
                c54956xap.copydefault.setLayoutParams(marginLayoutParams2);
            }
        }
    }

    public static final void AEQbTJ(wYF wyf, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(z);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rQO.getItemViewsForPopUp$default(o.rQO, androidx.fragment.app.FragmentActivity, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus, int, java.lang.Object):java.util.List */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // o.AbstractC52779wYa, o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        int i;
        Unit unit;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setMinHeight(0);
        C54956xap c54956xap = this.AYXKKw;
        if (c54956xap == null) {
            Intrinsics.gEmmrt("");
            c54956xap = null;
        }
        AppCompatTextView appCompatTextView = c54956xap.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        final ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog != null) {
            java.lang.String iconState = buttonDialog.getIconState();
            if (iconState != null) {
                AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
                if (Intrinsics.EZpvd((java.lang.Object) iconState, (java.lang.Object) "Mystery_Box")) {
                    i = C43662rtX.Activity.QSBOWP;
                } else {
                    Intrinsics.EZpvd((java.lang.Object) iconState, (java.lang.Object) OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK);
                    i = C43662rtX.Activity.RdAHlO;
                }
                appCompatImageView.setImageResource(i);
                java.lang.String title = buttonDialog.getTitle();
                if (title != null) {
                    c54956xap.valueOf.setGravity(1);
                    c54956xap.valueOf.setText(title);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    AppCompatImageView appCompatImageView2 = c54956xap.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                    appCompatImageView2.setVisibility(8);
                    AppCompatTextView appCompatTextView2 = c54956xap.valueOf;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                    appCompatTextView2.setVisibility(8);
                }
            }
            ViewGroup.LayoutParams layoutParams = c54956xap.AEQbTJ.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            marginLayoutParams.topMargin = 0;
            c54956xap.AEQbTJ.setLayoutParams(marginLayoutParams);
            if (C33129mqd.KWHzl((java.util.Collection) buttonDialog.getItems())) {
                c54956xap.AEQbTJ.setTextSize(1.0f);
                rQO rqoEZpvd = EZpvd();
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                java.util.List<UIComponentAppModel> items = buttonDialog.getItems();
                Intrinsics.copydefault(items);
                for (android.view.View view : rQO.getItemViewsForPopUp$default(rqoEZpvd, fragmentActivityRequireActivity, items, null, 4, null)) {
                    if (view instanceof C42267rMn) {
                        ((C42267rMn) view).setDialogBtClickCallBack(new Function1() { // from class: o.rSc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rRV.copydefault(this.EZpvd, buttonDialog, (CTAButtonAppModel) obj);
                            }
                        });
                    }
                    if (view instanceof C42224rKy) {
                        ((C42224rKy) view).setDialogBtClickCallBack(new Function1() { // from class: o.rSk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rRV.KWHzl(this.OLrzqt, (CTAButtonAppModel) obj);
                            }
                        });
                    }
                    C54956xap c54956xap2 = this.AYXKKw;
                    if (c54956xap2 == null) {
                        Intrinsics.gEmmrt("");
                        c54956xap2 = null;
                    }
                    c54956xap2.copydefault.addView(view);
                }
                return;
            }
            java.lang.String subtitle = buttonDialog.getSubtitle();
            if (subtitle != null) {
                c54956xap.AEQbTJ.setGravity(8388611);
                c54956xap.AEQbTJ.setText(subtitle);
            }
        }
    }

    public static final Unit copydefault(rRV rrv, ButtonDialog buttonDialog, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = rrv.KWHzl().KWHzl();
        java.lang.String pageId = buttonDialog.getPageId();
        mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(pageId == null ? "" : pageId, false, null, 4, null))));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(rRV rrv, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        rrv.KWHzl().KWHzl().setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation("", false, null, 4, null))));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OLrzqt(final C52794wYp c52794wYp, final CTAButtonAppModel cTAButtonAppModel) {
        java.lang.String entryPageId;
        java.lang.String pageId;
        java.lang.String pageId2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String pageId3;
        java.util.HashMap<java.lang.String, java.lang.String> map;
        java.util.HashMap<java.lang.String, java.lang.String> map2;
        java.lang.String entryPageId2;
        CtaPopUp cta;
        CTAButtonAppModel primaryButton;
        ActionParams actionParams;
        CtaPopUp cta2;
        CTAButtonAppModel primaryButton2;
        java.lang.String target;
        CtaPopUp cta3;
        CTAButtonAppModel primaryButton3;
        ActionParams actionParams2;
        CtaPopUp cta4;
        CTAButtonAppModel primaryButton4;
        java.lang.String playbook;
        java.lang.String pageId4;
        ButtonAction action = cTAButtonAppModel.getAction();
        int i = action == null ? -1 : Application.OLrzqt[action.ordinal()];
        java.lang.String str = "";
        if (i == 1) {
            ButtonDialog buttonDialog = this.OLrzqt;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (buttonDialog != null ? buttonDialog.getEntryPageId() : null))) {
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                ButtonDialog buttonDialog2 = this.OLrzqt;
                if (buttonDialog2 != null && (entryPageId = buttonDialog2.getEntryPageId()) != null) {
                    str = entryPageId;
                }
                pairArr[0] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ENTRY_PAGE, str);
                pairArr[1] = C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "continue");
                C43693ruB.copydefault("KYCPage_Popup_Step_Close", C56424yEw.AYXKKw(pairArr));
            }
            dismissAllowingStateLoss();
            return;
        }
        if (i == 2) {
            final ButtonDialog dialog = cTAButtonAppModel.getDialog();
            if (dialog != null) {
                rQZ rqz = rQZ.KWHzl;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                rqz.AEQbTJ(fragmentActivityRequireActivity, dialog, new Function1() { // from class: o.rRZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rRV.EZpvd(this.EZpvd, dialog, c52794wYp, (CTAButtonAppModel) obj);
                    }
                });
                return;
            }
            return;
        }
        if (i == 3) {
            Quit quit = this.djBIcL;
            if (quit != null) {
                if (C33129mqd.KWHzl((java.util.Collection) quit.getQuestionList())) {
                    ButtonDialog buttonDialogInitFileUploadDialog$default = C42427rSl.initFileUploadDialog$default(quit.getTitle(), quit.getContent(), quit.getSecondaryLabel(), quit.getPrimaryLabel(), quit.getIconState(), ButtonAction.Cancel, ButtonAction.Quit, null, quit.getSecondaryStyle(), quit.getPrimaryStyle(), 128, null);
                    rRP.StateListAnimator stateListAnimator = rRP.Companion;
                    java.util.ArrayList<QuestionItem> questionList = quit.getQuestionList();
                    Intrinsics.copydefault(questionList);
                    android.os.Bundle arguments = getArguments();
                    java.lang.String str2 = (arguments == null || (string2 = arguments.getString(EopTrackEvent.KEY_COR)) == null) ? "" : string2;
                    java.lang.String strGEmmrt = gEmmrt();
                    android.os.Bundle arguments2 = getArguments();
                    java.io.Serializable serializable = arguments2 != null ? arguments2.getSerializable("playbookParams") : null;
                    java.util.HashMap<java.lang.String, java.lang.String> map3 = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
                    java.util.HashMap<java.lang.String, java.lang.String> map4 = map3 == null ? new java.util.HashMap<>() : map3;
                    android.os.Bundle arguments3 = getArguments();
                    rRP rrpCopydefault = stateListAnimator.copydefault(buttonDialogInitFileUploadDialog$default, questionList, str2, strGEmmrt, map4, (arguments3 == null || (string = arguments3.getString("pageId")) == null) ? "" : string);
                    androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    rrpCopydefault.show(parentFragmentManager);
                } else {
                    MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = KWHzl().KWHzl();
                    ButtonDialog buttonDialog3 = this.OLrzqt;
                    mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation((buttonDialog3 == null || (pageId2 = buttonDialog3.getPageId()) == null) ? "" : pageId2, false, null, 4, null))));
                }
                dismissAllowingStateLoss();
                return;
            }
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl2 = KWHzl().KWHzl();
            ButtonDialog buttonDialog4 = this.OLrzqt;
            mutableLiveDataKWHzl2.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation((buttonDialog4 == null || (pageId = buttonDialog4.getPageId()) == null) ? "" : pageId, false, null, 4, null))));
            dismissAllowingStateLoss();
            return;
        }
        if (Intrinsics.EZpvd(cTAButtonAppModel.getLoadingInDialog(), java.lang.Boolean.TRUE)) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl3 = KWHzl().KWHzl();
            ButtonDialog buttonDialog5 = this.OLrzqt;
            if (buttonDialog5 == null || (pageId4 = buttonDialog5.getPageId()) == null) {
                pageId4 = "";
            }
            mutableLiveDataKWHzl3.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(pageId4, false, c52794wYp))));
            MutableLiveData<C43734ruq<java.lang.Boolean>> mutableLiveDataValueOf = KWHzl().valueOf();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C43733rup.copydefault(mutableLiveDataValueOf, viewLifecycleOwner, new Function1() { // from class: o.rRY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rRV.EZpvd(cTAButtonAppModel, this, (C43734ruq) obj);
                }
            });
            return;
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null && arguments4.getBoolean("isFromHomePage")) {
            rTM rtm = rTM.KWHzl;
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            ButtonDialog buttonDialog6 = this.OLrzqt;
            java.lang.String str3 = (buttonDialog6 == null || (cta4 = buttonDialog6.getCta()) == null || (primaryButton4 = cta4.getPrimaryButton()) == null || (playbook = primaryButton4.getPlaybook()) == null) ? "" : playbook;
            ButtonDialog buttonDialog7 = this.OLrzqt;
            if (buttonDialog7 == null || (cta3 = buttonDialog7.getCta()) == null || (primaryButton3 = cta3.getPrimaryButton()) == null || (actionParams2 = primaryButton3.getActionParams()) == null || (map = actionParams2.getOnboarding()) == null) {
                map = new java.util.HashMap<>();
            }
            java.util.HashMap<java.lang.String, java.lang.String> map5 = map;
            ButtonDialog buttonDialog8 = this.OLrzqt;
            java.lang.String str4 = (buttonDialog8 == null || (cta2 = buttonDialog8.getCta()) == null || (primaryButton2 = cta2.getPrimaryButton()) == null || (target = primaryButton2.getTarget()) == null) ? "" : target;
            ButtonDialog buttonDialog9 = this.OLrzqt;
            if (buttonDialog9 == null || (cta = buttonDialog9.getCta()) == null || (primaryButton = cta.getPrimaryButton()) == null || (actionParams = primaryButton.getActionParams()) == null || (map2 = actionParams.getOnboarding()) == null) {
                map2 = new java.util.HashMap<>();
            }
            java.util.HashMap<java.lang.String, java.lang.String> map6 = map2;
            ButtonDialog buttonDialog10 = this.OLrzqt;
            rtm.copydefault(fragmentActivityRequireActivity2, new CompliancePostOnboardingModel(str3, map5, str4, map6, (buttonDialog10 == null || (entryPageId2 = buttonDialog10.getEntryPageId()) == null) ? "" : entryPageId2));
        } else {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl4 = KWHzl().KWHzl();
            ButtonDialog buttonDialog11 = this.OLrzqt;
            if (buttonDialog11 != null && (pageId3 = buttonDialog11.getPageId()) != null) {
                str = pageId3;
            }
            mutableLiveDataKWHzl4.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(str, false, null))));
        }
        if (cTAButtonAppModel.getAction() == ButtonAction.SubmitGps) {
            AEQbTJ();
        } else {
            dismissAllowingStateLoss();
        }
    }

    public static final Unit EZpvd(final rRV rrv, ButtonDialog buttonDialog, C52794wYp c52794wYp, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        if (Intrinsics.EZpvd(cTAButtonAppModel.getLoadingInDialog(), java.lang.Boolean.TRUE)) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = rrv.KWHzl().KWHzl();
            java.lang.String pageId = buttonDialog.getPageId();
            if (pageId == null) {
                pageId = "";
            }
            mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(pageId, false, c52794wYp))));
            MutableLiveData<C43734ruq<java.lang.Boolean>> mutableLiveDataValueOf = rrv.KWHzl().valueOf();
            LifecycleOwner viewLifecycleOwner = rrv.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C43733rup.copydefault(mutableLiveDataValueOf, viewLifecycleOwner, new Function1() { // from class: o.rRS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rRV.EZpvd(this.KWHzl, (C43734ruq) obj);
                }
            });
        } else {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl2 = rrv.KWHzl().KWHzl();
            java.lang.String pageId2 = buttonDialog.getPageId();
            mutableLiveDataKWHzl2.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(pageId2 == null ? "" : pageId2, false, null, 4, null))));
            rrv.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(rRV rrv, C43734ruq c43734ruq) {
        java.lang.Boolean bool;
        if (c43734ruq != null && (bool = (java.lang.Boolean) c43734ruq.EZpvd()) != null && !bool.booleanValue()) {
            rrv.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(CTAButtonAppModel cTAButtonAppModel, rRV rrv, C43734ruq c43734ruq) {
        java.lang.Boolean bool;
        if (c43734ruq != null && (bool = (java.lang.Boolean) c43734ruq.EZpvd()) != null && !bool.booleanValue()) {
            if (cTAButtonAppModel.getAction() == ButtonAction.SubmitGps) {
                rrv.AEQbTJ();
            } else {
                rrv.dismissAllowingStateLoss();
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        android.view.View viewFindViewById = bottomSheetDialog != null ? bottomSheetDialog.findViewById(com.google.android.material.R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "");
            bottomSheetBehaviorFrom.setHideable(true);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
            bottomSheetBehaviorFrom.setState(5);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog != null && Intrinsics.EZpvd(buttonDialog.isDismissable(), java.lang.Boolean.FALSE)) {
            bottomSheetBehavior.setHideable(false);
        }
        ButtonDialog buttonDialog2 = this.OLrzqt;
        if (buttonDialog2 == null || !Intrinsics.EZpvd(buttonDialog2.isFullPage(), java.lang.Boolean.TRUE)) {
            bottomSheetBehavior.setFitToContents(true);
            bottomSheetBehavior.setSkipCollapsed(true);
        }
        bottomSheetBehavior.addBottomSheetCallback(new Fragment());
    }

    public static final class Fragment extends BottomSheetBehavior.BottomSheetCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Fragment() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View view, int i) {
            java.lang.String entryPageId;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 5) {
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                ButtonDialog buttonDialogOLrzqt = rRV.this.OLrzqt();
                if (buttonDialogOLrzqt != null && (entryPageId = buttonDialogOLrzqt.getEntryPageId()) != null) {
                    str = entryPageId;
                }
                pairArr[0] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ENTRY_PAGE, str);
                pairArr[1] = C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "scroll_close");
                C43693ruB.copydefault("KYCPage_Popup_Step_Close", C56424yEw.AYXKKw(pairArr));
            }
        }
    }

    private final void AEQbTJ(java.lang.String str, int i) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).copydefault(new HomeNotifyResultReq(str, i));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33024moe.KWHzl(C58156yvv.EZpvd(abstractC58185ywXCopydefault, fragmentActivityRequireActivity)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.rSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rRV.AEQbTJ((java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rRV.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rRV.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rRV.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
