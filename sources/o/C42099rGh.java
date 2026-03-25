package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import com.google.gson.Gson;
import com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.common.VendorSource;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Exit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.notification.RecallNotificationConfig;
import com.okinc.ok_kyc_core.notification.RecallNotificationType;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.web.WebActivity;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import o.ActivityC42162rIq;
import o.C43662rtX;
import o.C52761wXj;
import o.InterfaceC32801mkT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42099rGh extends AbstractC42060rEw<AbstractC43844rwu, rGL> {
    public rLY AuCTelauCTel;
    public int AubY;
    public androidx.core.view.OnApplyWindowInsetsListener AwvSrB;
    public boolean AxsJAY;
    public final InterfaceC56387yDm QKVWgx;
    public final InterfaceC56387yDm gHZMYf;
    public final InterfaceC56387yDm getNewProxyInstance;
    public java.util.List<? extends android.view.View> iwGUEr;
    public FormAppModel sSMYrx;
    public java.util.List<? extends android.view.View> wlaJM;
    public boolean zLjUOn;
    public final ActivityResultLauncher<android.content.Intent> zsXlph;
    public final int zuBGHE = C43662rtX.TaskDescription.zsXlph;

    /* JADX INFO: renamed from: o.rGh$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.Quit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.rGh$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public static final void AEQbTJ(ActivityResult activityResult) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public int OLrzqt() {
        return this.zuBGHE;
    }

    public C42099rGh() {
        final Function0 function0 = null;
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$activityViewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C42099rGh.KWHzl(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.zsXlph = activityResultLauncherRegisterForActivityResult;
        this.gHZMYf = C56392yDr.copydefault(new Function0() { // from class: o.rGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42099rGh.valueOf(this.copydefault);
            }
        });
        Function0 function02 = new Function0() { // from class: o.rGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42099rGh.values(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.QKVWgx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(rGL.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.formTemplate.FormFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function02);
        this.wlaJM = new java.util.ArrayList();
        this.iwGUEr = new java.util.ArrayList();
    }

    @Override // o.AbstractC42060rEw
    public C42163rIr KWHzl() {
        return (C42163rIr) this.getNewProxyInstance.getValue();
    }

    public static final void KWHzl(C42099rGh c42099rGh, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.io.Serializable serializableExtra = data != null ? data.getSerializableExtra("info_form_data") : null;
            java.util.ArrayList<FieldDisplay> arrayList = serializableExtra instanceof java.util.ArrayList ? (java.util.ArrayList) serializableExtra : null;
            if (arrayList != null) {
                c42099rGh.fetchVPNInfo().AEQbTJ(arrayList);
            }
        }
    }

    private final rQO hDKMBd() {
        return (rQO) this.gHZMYf.getValue();
    }

    public static final rQO valueOf(C42099rGh c42099rGh) {
        androidx.fragment.app.FragmentManager childFragmentManager = c42099rGh.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = c42099rGh.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new rQO(childFragmentManager, fragmentActivityRequireActivity);
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/rFj; */
    @Override // o.AbstractC42060rEw
    /* JADX INFO: renamed from: fARcdN, reason: merged with bridge method [inline-methods] */
    public rGL fetchVPNInfo() {
        return (rGL) this.QKVWgx.getValue();
    }

    /* JADX INFO: renamed from: o.rGh$PictureInPictureParams */
    public static final class PictureInPictureParams implements ViewModelProvider.Factory {
        public PictureInPictureParams() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(C42099rGh.this.KWHzl().fetchVPNInfo(), C42099rGh.this.KWHzl().AhwBna()), null, 4, null);
            C41970rBn c41970rBn = new C41970rBn(new rBD(c43746rvB), new rBP(c43746rvB), new C41973rBq(c43746rvB), new C41975rBs(c43746rvB), new rBF(c43746rvB), new rBE(c43746rvB), new rBB(c43746rvB), new C41979rBw(c43746rvB), new SingleFileUploadUseCase(c43746rvB), new rBA(c43746rvB));
            rBT rbt = new rBT(new C41977rBu(c43746rvB), new C41981rBy(c43746rvB), new C41971rBo(c43746rvB), new C41968rBl(c43746rvB));
            return new rGL(c41970rBn, new rBQ(new C41978rBv(c43746rvB), new C41982rBz(c43746rvB)), rbt, new rBM(new rBL(c43746rvB), new rBN(c43746rvB), new rBO(c43746rvB), new rBK(c43746rvB)));
        }
    }

    public static final ViewModelProvider.Factory values(C42099rGh c42099rGh) {
        return c42099rGh.new PictureInPictureParams();
    }

    /* JADX INFO: renamed from: o.rGh$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C42099rGh AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42099rGh c42099rGh, android.view.View view2) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c42099rGh;
            this.OLrzqt = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.copydefault;
                NavDestination currentDestination = FragmentKt.findNavController(this.AEQbTJ).getCurrentDestination();
                if (currentDestination == null || currentDestination.getId() != C43662rtX.ActionBar.QDqgQU) {
                    return;
                }
                rGL rglFetchVPNInfo = this.AEQbTJ.fetchVPNInfo();
                CTAButtonAppModel cTAButtonAppModelKWHzl = ((C42249rLw) this.OLrzqt).KWHzl();
                java.lang.String strAYXKKw = this.AEQbTJ.AYXKKw();
                java.lang.String strCopydefault = this.AEQbTJ.copydefault();
                FormAppModel formAppModel = this.AEQbTJ.sSMYrx;
                if (formAppModel == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel = null;
                }
                java.lang.String id = formAppModel.getId();
                if (id == null) {
                    id = "";
                }
                java.util.HashMap mapValueOf = this.AEQbTJ.valueOf();
                C43739ruv c43739ruv = new C43739ruv();
                ComplianceTheme complianceThemeOLrzqt = this.AEQbTJ.KWHzl().OLrzqt();
                FragmentActivity activity = this.AEQbTJ.getActivity();
                PageComponentProfile pageComponentProfileAhwBna = this.AEQbTJ.AhwBna();
                java.lang.String countryOfResidence = pageComponentProfileAhwBna != null ? pageComponentProfileAhwBna.getCountryOfResidence() : null;
                PageComponentProfile pageComponentProfileAhwBna2 = this.AEQbTJ.AhwBna();
                java.lang.String certificateType = pageComponentProfileAhwBna2 != null ? pageComponentProfileAhwBna2.getCertificateType() : null;
                java.lang.String str = (java.lang.String) this.AEQbTJ.valueOf().get("refreshType");
                AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, c52794wYp, cTAButtonAppModelKWHzl, strAYXKKw, strCopydefault, id, mapValueOf, c43739ruv, complianceThemeOLrzqt, activity, null, null, null, countryOfResidence, certificateType, str == null ? "" : str, this.AEQbTJ.djBIcL(), this.AEQbTJ.new ActionBar(), 3584, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.rGh$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ CTAButtonAppModel OLrzqt;
        public final /* synthetic */ C42099rGh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C42099rGh c42099rGh, CTAButtonAppModel cTAButtonAppModel) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c42099rGh;
            this.OLrzqt = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                rGL rglFetchVPNInfo = this.copydefault.fetchVPNInfo();
                CTAButtonAppModel cTAButtonAppModel = this.OLrzqt;
                java.lang.String strAYXKKw = this.copydefault.AYXKKw();
                java.lang.String strCopydefault = this.copydefault.copydefault();
                FormAppModel formAppModel = this.copydefault.sSMYrx;
                if (formAppModel == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel = null;
                }
                java.lang.String id = formAppModel.getId();
                AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, null, cTAButtonAppModel, strAYXKKw, strCopydefault, id == null ? "" : id, this.copydefault.valueOf(), new C43739ruv(), this.copydefault.KWHzl().OLrzqt(), this.copydefault.getActivity(), null, null, null, null, null, null, null, null, 130560, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.rGh$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ CTAButtonAppModel KWHzl;
        public final /* synthetic */ C42099rGh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C42099rGh c42099rGh, CTAButtonAppModel cTAButtonAppModel) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c42099rGh;
            this.KWHzl = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                rGL rglFetchVPNInfo = this.copydefault.fetchVPNInfo();
                CTAButtonAppModel cTAButtonAppModel = this.KWHzl;
                java.lang.String strAYXKKw = this.copydefault.AYXKKw();
                java.lang.String strCopydefault = this.copydefault.copydefault();
                FormAppModel formAppModel = this.copydefault.sSMYrx;
                if (formAppModel == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel = null;
                }
                java.lang.String id = formAppModel.getId();
                AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, null, cTAButtonAppModel, strAYXKKw, strCopydefault, id == null ? "" : id, this.copydefault.valueOf(), new C43739ruv(), this.copydefault.KWHzl().OLrzqt(), this.copydefault.getActivity(), null, null, null, null, null, null, null, null, 130560, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.rGh$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C42099rGh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C42099rGh c42099rGh) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c42099rGh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.fetchVPNInfo().wlaJM();
            }
        }
    }

    /* JADX INFO: renamed from: o.rGh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C42099rGh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42099rGh c42099rGh) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c42099rGh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Quit quitKWHzl;
            java.lang.String countryOfResidence;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FormAppModel formAppModel = this.copydefault.sSMYrx;
                FormAppModel formAppModel2 = null;
                if (formAppModel == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel = null;
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) formAppModel.getFaqUrl())) {
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    FormAppModel formAppModel3 = this.copydefault.sSMYrx;
                    if (formAppModel3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        formAppModel2 = formAppModel3;
                    }
                    pairArr[0] = C56390yDp.OLrzqt("url", formAppModel2.getFaqUrl());
                    pairArr[1] = C56390yDp.OLrzqt("title", "");
                    android.os.Bundle bundleBundleOf = BundleKt.bundleOf(pairArr);
                    WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                    FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
                    return;
                }
                FormAppModel formAppModel4 = this.copydefault.sSMYrx;
                if (formAppModel4 == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel4 = null;
                }
                if (formAppModel4.getQuit() != null) {
                    FormAppModel formAppModel5 = this.copydefault.sSMYrx;
                    if (formAppModel5 == null) {
                        Intrinsics.gEmmrt("");
                        formAppModel5 = null;
                    }
                    Quit quit = formAppModel5.getQuit();
                    Intrinsics.copydefault(quit);
                    if (Intrinsics.EZpvd(quit.getShouldShow(), java.lang.Boolean.FALSE)) {
                        C42163rIr c42163rIrKWHzl = this.copydefault.KWHzl();
                        From fromAhwBna = this.copydefault.fetchVPNInfo().AhwBna("");
                        java.lang.String strAYXKKw = this.copydefault.AYXKKw();
                        java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = this.copydefault.valueOf();
                        FormAppModel formAppModel6 = this.copydefault.sSMYrx;
                        if (formAppModel6 == null) {
                            Intrinsics.gEmmrt("");
                            formAppModel6 = null;
                        }
                        Exit onExit = formAppModel6.getOnExit();
                        FormAppModel formAppModel7 = this.copydefault.sSMYrx;
                        if (formAppModel7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            formAppModel2 = formAppModel7;
                        }
                        c42163rIrKWHzl.OLrzqt(null, fromAhwBna, strAYXKKw, mapValueOf, onExit, formAppModel2.getId());
                        return;
                    }
                }
                rGL rglFetchVPNInfo = this.copydefault.fetchVPNInfo();
                FormAppModel formAppModel8 = this.copydefault.sSMYrx;
                if (formAppModel8 == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel8 = null;
                }
                if (formAppModel8.getQuit() != null) {
                    FormAppModel formAppModel9 = this.copydefault.sSMYrx;
                    if (formAppModel9 == null) {
                        Intrinsics.gEmmrt("");
                        formAppModel9 = null;
                    }
                    quitKWHzl = formAppModel9.getQuit();
                    Intrinsics.copydefault(quitKWHzl);
                } else {
                    quitKWHzl = this.copydefault.KWHzl().KWHzl(this.copydefault.requireActivity());
                }
                Quit quit2 = quitKWHzl;
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                PageComponentProfile pageComponentProfileAhwBna = this.copydefault.AhwBna();
                java.lang.String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
                java.lang.String strAYXKKw2 = this.copydefault.AYXKKw();
                java.util.HashMap<java.lang.String, java.lang.String> mapValueOf2 = this.copydefault.valueOf();
                FormAppModel formAppModel10 = this.copydefault.sSMYrx;
                if (formAppModel10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    formAppModel2 = formAppModel10;
                }
                java.lang.String id = formAppModel2.getId();
                rglFetchVPNInfo.copydefault(quit2, childFragmentManager, str, strAYXKKw2, mapValueOf2, id == null ? "" : id);
            }
        }
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new Fragment());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: o.rGh$Fragment */
    public static final class Fragment extends OnBackPressedCallback {
        public Fragment() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C42099rGh.this.fetchVPNInfo().wlaJM();
        }
    }

    public final void fIwbmz() {
        C55055xci c55055xci;
        FormAppModel formAppModel = this.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        if (formAppModel.getPageStackType() == PageStackType.APP_RESIZING_BOTTOM_SHEET) {
            return;
        }
        fetchVPNInfo().AwvSrB().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.rGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.KWHzl(this.copydefault, (java.lang.Integer) obj);
            }
        }));
        fetchVPNInfo().giSNqX().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.rGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.KWHzl(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AbstractC43844rwu abstractC43844rwuAEQbTJ = AEQbTJ();
        if (abstractC43844rwuAEQbTJ == null || (c55055xci = abstractC43844rwuAEQbTJ.OLrzqt) == null) {
            return;
        }
        androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener = new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.rGB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C42099rGh.EZpvd(this.EZpvd, view, windowInsetsCompat);
            }
        };
        this.AwvSrB = onApplyWindowInsetsListener;
        ViewCompat.setOnApplyWindowInsetsListener(c55055xci, onApplyWindowInsetsListener);
    }

    public static final Unit KWHzl(C42099rGh c42099rGh, java.lang.Integer num) {
        c42099rGh.AubY = num.intValue();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C42099rGh c42099rGh, java.lang.Boolean bool) {
        java.util.List<? extends android.view.View> list = c42099rGh.wlaJM;
        if (list != null) {
            for (android.view.View view : list) {
                if (!bool.booleanValue()) {
                    view.clearFocus();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final WindowInsetsCompat EZpvd(final C42099rGh c42099rGh, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        AbstractC43844rwu abstractC43844rwuAEQbTJ;
        C55055xci c55055xci;
        C55055xci c55055xci2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        final int iOLrzqt = C33566myq.EZpvd.OLrzqt(C43246rlf.OLrzqt.valueOf()) - i;
        AbstractC43844rwu abstractC43844rwuAEQbTJ2 = c42099rGh.AEQbTJ();
        if (abstractC43844rwuAEQbTJ2 != null && (c55055xci2 = abstractC43844rwuAEQbTJ2.OLrzqt) != null) {
            c55055xci2.setPadding(0, 0, 0, i);
        }
        if (i > 0) {
            c42099rGh.fetchVPNInfo().giSNqX().setValue(java.lang.Boolean.TRUE);
            if (iOLrzqt - c42099rGh.fetchVPNInfo().zLjUOn() < c42099rGh.AubY && (abstractC43844rwuAEQbTJ = c42099rGh.AEQbTJ()) != null && (c55055xci = abstractC43844rwuAEQbTJ.OLrzqt) != null) {
                c55055xci.post(new java.lang.Runnable() { // from class: o.rGG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C42099rGh.copydefault(this.AEQbTJ, iOLrzqt);
                    }
                });
            }
        } else {
            c42099rGh.fetchVPNInfo().giSNqX().setValue(java.lang.Boolean.FALSE);
        }
        return windowInsetsCompat;
    }

    public static final void copydefault(C42099rGh c42099rGh, int i) {
        C55055xci c55055xci;
        AbstractC43844rwu abstractC43844rwuAEQbTJ = c42099rGh.AEQbTJ();
        if (abstractC43844rwuAEQbTJ == null || (c55055xci = abstractC43844rwuAEQbTJ.OLrzqt) == null) {
            return;
        }
        c55055xci.smoothScrollBy(0, (c42099rGh.AubY - i) + c42099rGh.fetchVPNInfo().zLjUOn());
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String countryOfResidence;
        super.onCreate(bundle);
        KWHzl(java.lang.Boolean.FALSE);
        android.os.Bundle arguments = getArguments();
        PageComponentAppModel pageComponentAppModel = arguments != null ? (PageComponentAppModel) arguments.getParcelable("arg") : null;
        Intrinsics.copydefault(pageComponentAppModel, "");
        this.sSMYrx = (FormAppModel) pageComponentAppModel;
        android.os.Bundle arguments2 = getArguments();
        this.zLjUOn = arguments2 != null ? arguments2.getBoolean("firstPage") : false;
        android.os.Bundle arguments3 = getArguments();
        this.AxsJAY = arguments3 != null ? arguments3.getBoolean("from_processing") : false;
        rGL rglFetchVPNInfo = fetchVPNInfo();
        FormAppModel formAppModel = this.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        rglFetchVPNInfo.OLrzqt(formAppModel);
        fetchVPNInfo().copydefault(InterfaceC55124xdy.Companion.EZpvd(this));
        FormAppModel formAppModel2 = this.sSMYrx;
        if (formAppModel2 == null) {
            Intrinsics.gEmmrt("");
            formAppModel2 = null;
        }
        java.lang.String id = formAppModel2.getId();
        if (id != null) {
            C43739ruv c43739ruv = new C43739ruv();
            java.lang.String strAYXKKw = AYXKKw();
            java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = valueOf();
            PageComponentProfile pageComponentProfileAhwBna = AhwBna();
            java.lang.String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
            FormAppModel formAppModel3 = this.sSMYrx;
            if (formAppModel3 == null) {
                Intrinsics.gEmmrt("");
                formAppModel3 = null;
            }
            java.util.HashMap<java.lang.String, java.lang.String> amplitudeParams = formAppModel3.getAmplitudeParams();
            FormAppModel formAppModel4 = this.sSMYrx;
            if (formAppModel4 == null) {
                Intrinsics.gEmmrt("");
                formAppModel4 = null;
            }
            TitleStepper titleWithSteps = formAppModel4.getTitleWithSteps();
            java.lang.Integer currentStep = titleWithSteps != null ? titleWithSteps.getCurrentStep() : null;
            FormAppModel formAppModel5 = this.sSMYrx;
            if (formAppModel5 == null) {
                Intrinsics.gEmmrt("");
                formAppModel5 = null;
            }
            TitleStepper titleWithSteps2 = formAppModel5.getTitleWithSteps();
            c43739ruv.AEQbTJ(id, strAYXKKw, "form", (456 & 8) != 0 ? null : null, mapValueOf, str, (456 & 64) != 0 ? null : amplitudeParams, (456 & 128) != 0 ? null : currentStep, (456 & 256) != 0 ? null : titleWithSteps2 != null ? titleWithSteps2.getTotalSteps() : null);
        }
        fetchVPNInfo().OLrzqt(registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C42099rGh.EZpvd(this.copydefault, (ActivityResult) obj);
            }
        }));
        fetchVPNInfo().copydefault(registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C42099rGh.AEQbTJ((ActivityResult) obj);
            }
        }));
    }

    public static final void EZpvd(C42099rGh c42099rGh, ActivityResult activityResult) {
        android.content.ContentResolver contentResolver;
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.util.ArrayList<POACameraGalleryOutputBean> parcelableArrayListExtra = data != null ? data.getParcelableArrayListExtra(POACameraGalleryOutputBean.KEY) : null;
            if (parcelableArrayListExtra != null) {
                for (POACameraGalleryOutputBean pOACameraGalleryOutputBean : parcelableArrayListExtra) {
                    try {
                        FragmentActivity activity = c42099rGh.getActivity();
                        if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                            contentResolver.takePersistableUriPermission(pOACameraGalleryOutputBean.getUri(), 1);
                        }
                    } catch (java.lang.Exception e) {
                        pUU.KWHzl("File_Upload", "takePersistableUriPermission e=" + e);
                    }
                }
            }
            pUU.KWHzl("File_Upload", "okComplianceCameraLauncher listImage=" + parcelableArrayListExtra);
            c42099rGh.fetchVPNInfo().copydefault(new kotlin.Pair<>(java.lang.Integer.valueOf(activityResult.getResultCode()), parcelableArrayListExtra));
            c42099rGh.fetchVPNInfo().fFgQHt().setValue(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        c42099rGh.fetchVPNInfo().copydefault(new kotlin.Pair<>(java.lang.Integer.valueOf(activityResult.getResultCode()), null));
        c42099rGh.fetchVPNInfo().fFgQHt().setValue(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        FormAppModel formAppModel = this.sSMYrx;
        FormAppModel formAppModel2 = null;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) formAppModel.getId(), (java.lang.Object) "kycSelectId")) {
            C42163rIr c42163rIrKWHzl = KWHzl();
            VendorSource vendorSource = VendorSource.UNKNOWN;
            c42163rIrKWHzl.copydefault(vendorSource);
            fetchVPNInfo().EZpvd(vendorSource);
        }
        FormAppModel formAppModel3 = this.sSMYrx;
        if (formAppModel3 == null) {
            Intrinsics.gEmmrt("");
            formAppModel3 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) formAppModel3.getId(), (java.lang.Object) "kycFillEIdInfo")) {
            C42163rIr c42163rIrKWHzl2 = KWHzl();
            VendorSource vendorSource2 = VendorSource.EID;
            c42163rIrKWHzl2.copydefault(vendorSource2);
            fetchVPNInfo().EZpvd(vendorSource2);
        }
        FormAppModel formAppModel4 = this.sSMYrx;
        if (formAppModel4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            formAppModel2 = formAppModel4;
        }
        if (Intrinsics.EZpvd((java.lang.Object) formAppModel2.getId(), (java.lang.Object) "kycUploadIdFrontWithOcr")) {
            C42163rIr c42163rIrKWHzl3 = KWHzl();
            VendorSource vendorSource3 = VendorSource.CHINA_ID;
            c42163rIrKWHzl3.copydefault(vendorSource3);
            fetchVPNInfo().EZpvd(vendorSource3);
        }
        getFieldNames();
        LiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner, new Function1() { // from class: o.rGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.djBIcL(this.OLrzqt, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<android.view.View, java.lang.Boolean>>> liveDataGEmmrt = fetchVPNInfo().gEmmrt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C43733rup.copydefault(liveDataGEmmrt, viewLifecycleOwner2, new Function1() { // from class: o.rGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.gEmmrt(this.OLrzqt, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<From, ResultStatus>>> liveDataDjBIcL = fetchVPNInfo().djBIcL();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C43733rup.copydefault(liveDataDjBIcL, viewLifecycleOwner3, new Function1() { // from class: o.rGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.AhwBna(this.copydefault, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<java.util.ArrayList<FieldDisplay>>> liveDataQOLQEE = fetchVPNInfo().QOLQEE();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C43733rup.copydefault(liveDataQOLQEE, viewLifecycleOwner4, new Function1() { // from class: o.rGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.isConnected(this.AEQbTJ, (C43734ruq) obj);
            }
        });
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = KWHzl().KWHzl();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C43733rup.copydefault(mutableLiveDataKWHzl, viewLifecycleOwner5, new Function1() { // from class: o.rGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.fetchVPNInfo(this.EZpvd, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<PageComponentAppModel>> liveDataDxcTrN = fetchVPNInfo().dxcTrN();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        C43733rup.copydefault(liveDataDxcTrN, viewLifecycleOwner6, new Function1() { // from class: o.rGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.values(this.copydefault, (C43734ruq) obj);
            }
        });
        MutableLiveData<C43734ruq<UpdateFormAppModel>> mutableLiveDataCopydefault = KWHzl().copydefault();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        C43733rup.copydefault(mutableLiveDataCopydefault, viewLifecycleOwner7, new Function1() { // from class: o.rGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.DbNXlk(this.KWHzl, (C43734ruq) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit djBIcL(final C42099rGh c42099rGh, C43734ruq c43734ruq) {
        PageComponentProfile pageComponentProfile;
        PageComponentAppModel viewModel;
        java.lang.Integer maxLevel;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            C43700ruI c43700ruI = (C43700ruI) pair.getFirst();
            if (c43700ruI.OLrzqt().getOnDemandFeatureFlagEnabled()) {
                java.lang.Boolean boolValueOf = c43700ruI.valueOf();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(boolValueOf, bool)) {
                    c42099rGh.KWHzl().OLrzqt(c43700ruI.OLrzqt().getViewModel());
                }
                PageComponentProfile profile = c43700ruI.OLrzqt().getProfile();
                if (profile != null) {
                    if (profile.getMaxLevel() == null || ((maxLevel = profile.getMaxLevel()) != null && maxLevel.intValue() == -1)) {
                        profile = null;
                    }
                    pageComponentProfile = profile;
                } else {
                    pageComponentProfile = null;
                }
                c42099rGh.KWHzl().KWHzl(c43700ruI.KWHzl());
                c42099rGh.KWHzl().AEQbTJ(c43700ruI.EZpvd());
                if (!(c43700ruI.OLrzqt().getViewModel() instanceof PopUpAppModel) && !(c43700ruI.OLrzqt().getViewModel() instanceof UpdateFormAppModel) && (viewModel = c43700ruI.OLrzqt().getViewModel()) != null && Intrinsics.EZpvd(viewModel.getPageStack(), bool)) {
                    PageComponentAppModel viewModel2 = c43700ruI.OLrzqt().getViewModel();
                    if (viewModel2 instanceof FormAppModel) {
                        FormAppModel formAppModel = (FormAppModel) viewModel2;
                        if (formAppModel.getPageStackType() == PageStackType.APP_RESIZING_BOTTOM_SHEET) {
                            c42099rGh.KWHzl().OLrzqt(viewModel2);
                            c42099rGh.KWHzl().OLrzqt(pageComponentProfile);
                            c42099rGh.KWHzl().KWHzl(true);
                            c42099rGh.KWHzl().copydefault().setValue(null);
                            C42246rLt c42246rLtKWHzl = C42246rLt.Companion.KWHzl(Intrinsics.EZpvd(formAppModel.getCanClose(), bool));
                            androidx.fragment.app.FragmentManager childFragmentManager = c42099rGh.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c42246rLtKWHzl.show(childFragmentManager);
                        } else {
                            ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                            FragmentActivity fragmentActivityRequireActivity = c42099rGh.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                            ActivityC42162rIq.TaskDescription.goActivity$default(taskDescription, fragmentActivityRequireActivity, c42099rGh.AYXKKw(), c42099rGh.copydefault(), c42099rGh.valueOf(), c43700ruI.OLrzqt(), c42099rGh.gEmmrt(), null, 64, null);
                        }
                    }
                } else {
                    PageComponentAppModel viewModel3 = c43700ruI.OLrzqt().getViewModel();
                    if (viewModel3 instanceof FormAppModel) {
                        c42099rGh.KWHzl().ejfBZ();
                        c42099rGh.fetchVPNInfo().EZpvd(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel3 instanceof ResultAppModel) {
                        c42099rGh.KWHzl().ejfBZ();
                        c42099rGh.fetchVPNInfo().AEQbTJ(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel3 instanceof SelectWalletVerificationAppModel) {
                        c42099rGh.KWHzl().ejfBZ();
                        AbstractC42074rFj.navigateToSelectWalletVerificationPage$default(c42099rGh.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, null, 16, null);
                    } else if (viewModel3 instanceof VirtualActionAppModel) {
                        c42099rGh.KWHzl(pageComponentProfile);
                        AbstractC42074rFj.navigateVirtualAction$default(c42099rGh.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), (C52794wYp) pair.getSecond(), c43700ruI.KWHzl(), ActivityC42162rIq.Companion.EZpvd(c43700ruI.KWHzl()), c43700ruI.EZpvd(), c42099rGh.KWHzl().OLrzqt(), c42099rGh.requireActivity(), null, new Function1() { // from class: o.rGq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42099rGh.AhwBna(this.AEQbTJ, (java.util.HashMap) obj);
                            }
                        }, 128, null);
                    } else if (viewModel3 instanceof PopUpAppModel) {
                        FragmentActivity activity = c42099rGh.getActivity();
                        if (activity != null) {
                            rGL rglFetchVPNInfo = c42099rGh.fetchVPNInfo();
                            PageComponentAppModel viewModel4 = c43700ruI.OLrzqt().getViewModel();
                            androidx.fragment.app.FragmentManager childFragmentManager2 = c42099rGh.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                            rglFetchVPNInfo.OLrzqt(viewModel4, activity, childFragmentManager2, c43700ruI.KWHzl(), c43700ruI.EZpvd(), c42099rGh.djBIcL());
                        }
                    } else if (viewModel3 instanceof ProcessingAppModel) {
                        if (c42099rGh.getActivity() != null) {
                            c42099rGh.fetchVPNInfo().OLrzqt(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.AEQbTJ(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                        }
                    } else if (viewModel3 instanceof UpdateFormAppModel) {
                        MutableLiveData<C43734ruq<UpdateFormAppModel>> mutableLiveDataDjBIcL = c42099rGh.KWHzl().djBIcL();
                        PageComponentAppModel viewModel5 = c43700ruI.OLrzqt().getViewModel();
                        Intrinsics.copydefault(viewModel5, "");
                        mutableLiveDataDjBIcL.setValue(new C43734ruq<>((UpdateFormAppModel) viewModel5));
                    }
                }
            } else {
                c42099rGh.KWHzl().OLrzqt(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C42099rGh c42099rGh, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        c42099rGh.KWHzl().AEQbTJ((java.util.HashMap<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C42099rGh c42099rGh, C43734ruq c43734ruq) {
        kotlin.Pair pair;
        if (c43734ruq != null && (pair = (kotlin.Pair) c43734ruq.EZpvd()) != null) {
            c42099rGh.KWHzl().valueOf().setValue(new C43734ruq<>(pair.getSecond()));
            if (!((java.lang.Boolean) pair.getSecond()).booleanValue()) {
                java.lang.Object first = pair.getFirst();
                Intrinsics.copydefault(first, "");
                ((C52794wYp) first).fIwbmz();
            } else {
                java.lang.Object first2 = pair.getFirst();
                Intrinsics.copydefault(first2, "");
                C52794wYp.startLoading$default((C52794wYp) first2, 0L, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C42099rGh c42099rGh, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            c42099rGh.KWHzl().AEQbTJ((ResultStatus) pair.getSecond(), (From) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C42099rGh c42099rGh, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        c42099rGh.KWHzl().EZpvd().setValue(c43734ruq);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(final C42099rGh c42099rGh, C43734ruq c43734ruq) {
        C52794wYp c52794wYpOLrzqt;
        java.lang.String id;
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) pair.getFirst();
            DialogInformation dialogInformation = (DialogInformation) pair.getSecond();
            ButtonAction action = cTAButtonAppModel.getAction();
            FormAppModel formAppModel = null;
            if (action != null && Application.copydefault[action.ordinal()] == 1) {
                C42163rIr c42163rIrKWHzl = c42099rGh.KWHzl();
                From from = From.NONE;
                java.lang.String strAYXKKw = c42099rGh.AYXKKw();
                java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = c42099rGh.valueOf();
                FormAppModel formAppModel2 = c42099rGh.sSMYrx;
                if (formAppModel2 == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel2 = null;
                }
                Exit onExit = formAppModel2.getOnExit();
                FormAppModel formAppModel3 = c42099rGh.sSMYrx;
                if (formAppModel3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    formAppModel = formAppModel3;
                }
                c42163rIrKWHzl.OLrzqt(null, from, strAYXKKw, mapValueOf, onExit, formAppModel.getId());
            } else {
                rGL rglFetchVPNInfo = c42099rGh.fetchVPNInfo();
                if (dialogInformation.getButton() != null) {
                    c52794wYpOLrzqt = dialogInformation.getButton();
                } else {
                    c52794wYpOLrzqt = !dialogInformation.isPopUp() ? c42099rGh.fetchVPNInfo().OLrzqt() : null;
                }
                java.lang.String strAYXKKw2 = c42099rGh.AYXKKw();
                java.lang.String strCopydefault = c42099rGh.copydefault();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) dialogInformation.getPageId())) {
                    id = dialogInformation.getPageId();
                } else {
                    FormAppModel formAppModel4 = c42099rGh.sSMYrx;
                    if (formAppModel4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        formAppModel = formAppModel4;
                    }
                    id = formAppModel.getId();
                    if (id == null) {
                        id = "";
                    }
                }
                AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, c52794wYpOLrzqt, cTAButtonAppModel, strAYXKKw2, strCopydefault, id, c42099rGh.valueOf(), new C43739ruv(), c42099rGh.KWHzl().OLrzqt(), c42099rGh.getActivity(), java.lang.Boolean.TRUE, null, null, null, null, null, null, new Function1() { // from class: o.rGs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42099rGh.djBIcL(this.AEQbTJ, (java.util.HashMap) obj);
                    }
                }, 64512, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C42099rGh c42099rGh, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        c42099rGh.KWHzl().AEQbTJ((java.util.HashMap<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    public static final Unit values(C42099rGh c42099rGh, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        PageComponentAppModel pageComponentAppModel = (PageComponentAppModel) c43734ruq.EZpvd();
        if (pageComponentAppModel != null) {
            ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
            FragmentActivity fragmentActivityRequireActivity = c42099rGh.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            java.lang.String strAYXKKw = c42099rGh.AYXKKw();
            java.lang.String strCopydefault = c42099rGh.copydefault();
            java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = c42099rGh.valueOf();
            OnDemandKYCAppModel onDemandKYCAppModel = new OnDemandKYCAppModel(false, false, (PageComponentProfile) null, (PageComponentAppModel) null, 15, (DefaultConstructorMarker) null);
            onDemandKYCAppModel.setViewModel(pageComponentAppModel);
            Unit unit = Unit.INSTANCE;
            ActivityC42162rIq.TaskDescription.goActivity$default(taskDescription, fragmentActivityRequireActivity, strAYXKKw, strCopydefault, mapValueOf, onDemandKYCAppModel, c42099rGh.zsXlph, null, 64, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C42099rGh c42099rGh, C43734ruq c43734ruq) {
        UpdateFormAppModel updateFormAppModel = (UpdateFormAppModel) c43734ruq.EZpvd();
        if (updateFormAppModel != null) {
            c42099rGh.AEQbTJ(updateFormAppModel);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC42060rEw
    public void AEQbTJ(@NotNull UpdateFormAppModel updateFormAppModel) {
        Intrinsics.checkNotNullParameter(updateFormAppModel, "");
        FormAppModel formAppModel = this.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        formAppModel.setItems(updateFormAppModel.getItems());
        AuCTel();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c A[PHI: r2
  0x021c: PHI (r2v45 java.lang.Integer) = (r2v44 java.lang.Integer), (r2v50 java.lang.Integer) binds: [B:84:0x0207, B:90:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AuCTel() {
        boolean z;
        fetchVPNInfo().fvQaOB();
        AbstractC43844rwu abstractC43844rwuAEQbTJ = AEQbTJ();
        if (abstractC43844rwuAEQbTJ != null) {
            abstractC43844rwuAEQbTJ.OLrzqt.removeAllViews();
            abstractC43844rwuAEQbTJ.AEQbTJ.copydefault.removeAllViews();
            androidx.appcompat.widget.Toolbar toolbar = abstractC43844rwuAEQbTJ.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            FormAppModel formAppModel = this.sSMYrx;
            FormAppModel formAppModel2 = null;
            if (formAppModel == null) {
                Intrinsics.gEmmrt("");
                formAppModel = null;
            }
            toolbar.setVisibility(formAppModel.getPageStackType() != PageStackType.APP_RESIZING_BOTTOM_SHEET ? 0 : 8);
            AbstractC43977rzU abstractC43977rzU = abstractC43844rwuAEQbTJ.KWHzl;
            android.widget.TextView textView = abstractC43977rzU.EZpvd;
            FormAppModel formAppModel3 = this.sSMYrx;
            if (formAppModel3 == null) {
                Intrinsics.gEmmrt("");
                formAppModel3 = null;
            }
            java.lang.String pageTitle = formAppModel3.getPageTitle();
            if (pageTitle == null) {
                pageTitle = "";
            }
            textView.setText(pageTitle);
            android.widget.ImageView imageView = abstractC43977rzU.AEQbTJ;
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
            FormAppModel formAppModel4 = this.sSMYrx;
            if (formAppModel4 == null) {
                Intrinsics.gEmmrt("");
                formAppModel4 = null;
            }
            java.lang.Boolean canClose = formAppModel4.getCanClose();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (Intrinsics.EZpvd(canClose, bool)) {
                abstractC43977rzU.AEQbTJ.setVisibility(8);
            }
            android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(abstractC43977rzU.AEQbTJ.getDrawable());
            Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
            DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(requireContext(), C52761wXj.Activity.fdOvFl));
            abstractC43977rzU.AEQbTJ.setImageDrawable(drawableWrap);
            FormAppModel formAppModel5 = this.sSMYrx;
            if (formAppModel5 == null) {
                Intrinsics.gEmmrt("");
                formAppModel5 = null;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) formAppModel5.getFaqUrl())) {
                abstractC43977rzU.AEQbTJ.setVisibility(0);
                abstractC43977rzU.AEQbTJ.setImageResource(C43662rtX.Activity.sSMYrx);
            }
            android.widget.ImageButton imageButton = abstractC43977rzU.KWHzl;
            imageButton.setOnClickListener(new PendingIntent(imageButton, 1000L, this));
            if (this.AxsJAY) {
                abstractC43977rzU.KWHzl.setVisibility(8);
                abstractC43977rzU.AEQbTJ.setVisibility(0);
            } else {
                FormAppModel formAppModel6 = this.sSMYrx;
                if (formAppModel6 == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel6 = null;
                }
                if (Intrinsics.EZpvd(formAppModel6.getCanGoBack(), java.lang.Boolean.TRUE)) {
                    abstractC43977rzU.KWHzl.setVisibility(0);
                } else if (this.zLjUOn) {
                    abstractC43977rzU.KWHzl.setVisibility(8);
                } else {
                    FormAppModel formAppModel7 = this.sSMYrx;
                    if (formAppModel7 == null) {
                        Intrinsics.gEmmrt("");
                        formAppModel7 = null;
                    }
                    if (Intrinsics.EZpvd(formAppModel7.getCanGoBack(), bool)) {
                    }
                }
            }
            FormAppModel formAppModel8 = this.sSMYrx;
            if (formAppModel8 == null) {
                Intrinsics.gEmmrt("");
                formAppModel8 = null;
            }
            CTAButtonAppModel skipCta = formAppModel8.getSkipCta();
            if (skipCta != null) {
                android.widget.TextView textView2 = abstractC43977rzU.valueOf;
                java.lang.String text = skipCta.getText();
                if (text == null) {
                    text = "";
                }
                textView2.setText(text);
                android.widget.TextView textView3 = abstractC43977rzU.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(0);
                android.widget.TextView textView4 = abstractC43977rzU.valueOf;
                textView4.setOnClickListener(new FragmentManager(textView4, 1000L, this, skipCta));
                Unit unit = Unit.INSTANCE;
            }
            FormAppModel formAppModel9 = this.sSMYrx;
            if (formAppModel9 == null) {
                Intrinsics.gEmmrt("");
                formAppModel9 = null;
            }
            CTAButtonAppModel deleteButton = formAppModel9.getDeleteButton();
            if (deleteButton != null) {
                abstractC43977rzU.AEQbTJ.setVisibility(0);
                abstractC43977rzU.AEQbTJ.setImageResource(C52761wXj.TaskDescription.dTTfOR);
                deleteButton.setDelete(java.lang.Boolean.TRUE);
                android.widget.ImageView imageView2 = abstractC43977rzU.AEQbTJ;
                imageView2.setOnClickListener(new Dialog(imageView2, 1000L, this, deleteButton));
                Unit unit2 = Unit.INSTANCE;
            }
            FormAppModel formAppModel10 = this.sSMYrx;
            if (formAppModel10 == null) {
                Intrinsics.gEmmrt("");
                formAppModel10 = null;
            }
            final CTAButtonAppModel rightButton = formAppModel10.getRightButton();
            if (rightButton != null) {
                CtaIcon icon = rightButton.getIcon();
                if (icon != null) {
                    rQR rqr = rQR.AEQbTJ;
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    android.graphics.drawable.Drawable drawableOLrzqt = rqr.OLrzqt(contextRequireContext, icon.getName());
                    if (drawableOLrzqt != null) {
                        android.graphics.drawable.Drawable drawableWrap2 = DrawableCompat.wrap(drawableOLrzqt.mutate());
                        Intrinsics.checkNotNullExpressionValue(drawableWrap2, "");
                        android.content.Context contextRequireContext2 = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        DrawableCompat.setTint(drawableWrap2, rqr.AEQbTJ(contextRequireContext2, icon.getRenderColor()));
                        Unit unit3 = Unit.INSTANCE;
                        abstractC43977rzU.AEQbTJ.setImageDrawable(drawableWrap2);
                    }
                }
                abstractC43977rzU.AEQbTJ.setVisibility(0);
                abstractC43977rzU.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rGv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C42099rGh.AEQbTJ(this.copydefault, rightButton, view);
                    }
                });
                Unit unit4 = Unit.INSTANCE;
            }
            OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            onBackPressedDispatcher.addCallback(viewLifecycleOwner, new StateListAnimator());
            FormAppModel formAppModel11 = this.sSMYrx;
            if (formAppModel11 == null) {
                Intrinsics.gEmmrt("");
                formAppModel11 = null;
            }
            Stepper stepper = formAppModel11.getStepper();
            if (stepper != null) {
                java.lang.Integer total = stepper.getTotal();
                if (total != null && total.intValue() > 1) {
                    C55172xet c55172xet = abstractC43844rwuAEQbTJ.KWHzl.OLrzqt;
                    c55172xet.setVisibility(0);
                    java.lang.Integer total2 = stepper.getTotal();
                    if (total2 == null) {
                        java.util.List<java.lang.String> titles = stepper.getTitles();
                        total2 = titles != null ? java.lang.Integer.valueOf(titles.size()) : null;
                        int iIntValue = total2 != null ? total2.intValue() : 0;
                        c55172xet.setCount(iIntValue);
                        c55172xet.setCurrentIndex(stepper.getCurrent());
                    }
                }
                Unit unit5 = Unit.INSTANCE;
            }
            abstractC43844rwuAEQbTJ.OLrzqt.setItemSpace(0);
            C55055xci c55055xci = abstractC43844rwuAEQbTJ.OLrzqt;
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            C42274rMu c42274rMu = new C42274rMu(contextRequireContext3, null, 0, 6, null);
            C55172xet c55172xet2 = abstractC43844rwuAEQbTJ.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55172xet2, "");
            if (c55172xet2.getVisibility() == 8) {
                c42274rMu.setHeaderMarginVertical(C55298xhM.dp2px$default(24.0f, null, 1, null), 0);
            } else {
                c42274rMu.setHeaderMarginVertical(0, 0);
            }
            java.lang.String strName = KWHzl().OLrzqt().name();
            FormAppModel formAppModel12 = this.sSMYrx;
            if (formAppModel12 == null) {
                Intrinsics.gEmmrt("");
                formAppModel12 = null;
            }
            java.lang.String title = formAppModel12.getTitle();
            FormAppModel formAppModel13 = this.sSMYrx;
            if (formAppModel13 == null) {
                Intrinsics.gEmmrt("");
                formAppModel13 = null;
            }
            pUU.KWHzl("qjf", "--->theme = " + strName + " , title=" + title + " , subtitle=" + formAppModel13.getSubtitle());
            FormAppModel formAppModel14 = this.sSMYrx;
            if (formAppModel14 == null) {
                Intrinsics.gEmmrt("");
                formAppModel14 = null;
            }
            java.lang.String title2 = formAppModel14.getTitle();
            FormAppModel formAppModel15 = this.sSMYrx;
            if (formAppModel15 == null) {
                Intrinsics.gEmmrt("");
                formAppModel15 = null;
            }
            java.lang.String subtitle = formAppModel15.getSubtitle();
            FormAppModel formAppModel16 = this.sSMYrx;
            if (formAppModel16 == null) {
                Intrinsics.gEmmrt("");
                formAppModel16 = null;
            }
            java.lang.String align = formAppModel16.getAlign();
            FormAppModel formAppModel17 = this.sSMYrx;
            if (formAppModel17 == null) {
                Intrinsics.gEmmrt("");
                formAppModel17 = null;
            }
            TitleStepper titleWithSteps = formAppModel17.getTitleWithSteps();
            FormAppModel formAppModel18 = this.sSMYrx;
            if (formAppModel18 == null) {
                Intrinsics.gEmmrt("");
                formAppModel18 = null;
            }
            RichTitle richTitle = formAppModel18.getRichTitle();
            FormAppModel formAppModel19 = this.sSMYrx;
            if (formAppModel19 == null) {
                Intrinsics.gEmmrt("");
                formAppModel19 = null;
            }
            c42274rMu.KWHzl(title2, subtitle, align, titleWithSteps, richTitle, formAppModel19.getRichSubtitle(), new Function1() { // from class: o.rGy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42099rGh.EZpvd(this.KWHzl, (CTAButtonAppModel) obj);
                }
            });
            c55055xci.addView(c42274rMu);
            iwGUEr();
            rQO rqoHDKMBd = hDKMBd();
            android.content.Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FormAppModel formAppModel20 = this.sSMYrx;
            if (formAppModel20 == null) {
                Intrinsics.gEmmrt("");
                formAppModel20 = null;
            }
            java.util.List<android.view.View> listAEQbTJ = rqoHDKMBd.AEQbTJ(contextRequireContext4, childFragmentManager, formAppModel20, fetchVPNInfo(), this);
            this.wlaJM = listAEQbTJ;
            if (listAEQbTJ != null) {
                z = false;
                for (android.view.View view : listAEQbTJ) {
                    if (view instanceof rQT) {
                        rQT rqt = (rQT) view;
                        FormAppModel formAppModel21 = this.sSMYrx;
                        if (formAppModel21 == null) {
                            Intrinsics.gEmmrt("");
                            formAppModel21 = null;
                        }
                        rqt.OLrzqt(formAppModel21.getNotifications(), new Function1() { // from class: o.rGw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42099rGh.OLrzqt(this.KWHzl, (CTAButtonAppModel) obj);
                            }
                        });
                        z = true;
                    }
                    abstractC43844rwuAEQbTJ.OLrzqt.addView(view);
                    copydefault(view);
                }
                Unit unit6 = Unit.INSTANCE;
            } else {
                z = false;
            }
            FormAppModel formAppModel22 = this.sSMYrx;
            if (formAppModel22 == null) {
                Intrinsics.gEmmrt("");
                formAppModel22 = null;
            }
            AlertCardAppModel alertCard = formAppModel22.getAlertCard();
            if (alertCard != null) {
                abstractC43844rwuAEQbTJ.EZpvd.setVisibility(0);
                alertCard.setBottomMargin(java.lang.Float.valueOf(20.0f));
                C42224rKy c42224rKy = abstractC43844rwuAEQbTJ.EZpvd;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c42224rKy.copydefault(fragmentActivityRequireActivity, fetchVPNInfo(), alertCard);
                Unit unit7 = Unit.INSTANCE;
            }
            if (!z) {
                FormAppModel formAppModel23 = this.sSMYrx;
                if (formAppModel23 == null) {
                    Intrinsics.gEmmrt("");
                    formAppModel23 = null;
                }
                java.util.List<Reminder> notifications = formAppModel23.getNotifications();
                if (notifications != null) {
                    for (Reminder reminder : notifications) {
                        C55055xci c55055xci2 = abstractC43844rwuAEQbTJ.OLrzqt;
                        android.content.Context contextRequireContext5 = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
                        rQA rqa = new rQA(contextRequireContext5);
                        rqa.EZpvd(reminder, new Function1() { // from class: o.rGA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42099rGh.valueOf(this.copydefault, (CTAButtonAppModel) obj);
                            }
                        });
                        c55055xci2.addView(rqa);
                    }
                    Unit unit8 = Unit.INSTANCE;
                }
            }
            FormAppModel formAppModel24 = this.sSMYrx;
            if (formAppModel24 == null) {
                Intrinsics.gEmmrt("");
            } else {
                formAppModel2 = formAppModel24;
            }
            CtaAppModel cta = formAppModel2.getCta();
            if (cta != null) {
                rQO rqoHDKMBd2 = hDKMBd();
                android.content.Context contextRequireContext6 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
                androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                java.util.List<android.view.View> listKWHzl = rqoHDKMBd2.KWHzl(contextRequireContext6, childFragmentManager2, cta, fetchVPNInfo(), this);
                this.iwGUEr = listKWHzl;
                if (listKWHzl != null) {
                    for (android.view.View view2 : listKWHzl) {
                        abstractC43844rwuAEQbTJ.AEQbTJ.copydefault.addView(view2);
                        copydefault(view2);
                        if (view2 instanceof C42249rLw) {
                            InterfaceC32801mkT.ActionBar.setupClickProtection$default((InterfaceC32801mkT) C43251rlk.copydefault(InterfaceC32801mkT.class), view2, null, getContext(), null, null, 26, null);
                        }
                    }
                    Unit unit9 = Unit.INSTANCE;
                }
            }
            fIwbmz();
            Unit unit10 = Unit.INSTANCE;
        }
    }

    public static final void AEQbTJ(C42099rGh c42099rGh, CTAButtonAppModel cTAButtonAppModel, android.view.View view) {
        rGL rglFetchVPNInfo = c42099rGh.fetchVPNInfo();
        java.lang.String strAYXKKw = c42099rGh.AYXKKw();
        java.lang.String strCopydefault = c42099rGh.copydefault();
        FormAppModel formAppModel = c42099rGh.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        java.lang.String id = formAppModel.getId();
        AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, null, cTAButtonAppModel, strAYXKKw, strCopydefault, id != null ? id : "", c42099rGh.valueOf(), new C43739ruv(), c42099rGh.KWHzl().OLrzqt(), c42099rGh.getActivity(), null, null, null, null, null, null, null, null, 130560, null);
    }

    /* JADX INFO: renamed from: o.rGh$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (C42099rGh.this.AxsJAY) {
                return;
            }
            FormAppModel formAppModel = C42099rGh.this.sSMYrx;
            FormAppModel formAppModel2 = null;
            if (formAppModel == null) {
                Intrinsics.gEmmrt("");
                formAppModel = null;
            }
            if (!Intrinsics.EZpvd(formAppModel.getCanGoBack(), java.lang.Boolean.TRUE)) {
                if (C42099rGh.this.zLjUOn) {
                    return;
                }
                FormAppModel formAppModel3 = C42099rGh.this.sSMYrx;
                if (formAppModel3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    formAppModel2 = formAppModel3;
                }
                if (Intrinsics.EZpvd(formAppModel2.getCanGoBack(), java.lang.Boolean.FALSE)) {
                    return;
                }
                C42099rGh.this.fetchVPNInfo().wlaJM();
                return;
            }
            C42099rGh.this.fetchVPNInfo().wlaJM();
        }
    }

    public static final Unit EZpvd(C42099rGh c42099rGh, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        C43693ruB.OLrzqt("KYC_SubTitle_cta_Click");
        rGL rglFetchVPNInfo = c42099rGh.fetchVPNInfo();
        java.lang.String strAYXKKw = c42099rGh.AYXKKw();
        java.lang.String strCopydefault = c42099rGh.copydefault();
        FormAppModel formAppModel = c42099rGh.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        java.lang.String id = formAppModel.getId();
        if (id == null) {
            id = "";
        }
        AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, null, cTAButtonAppModel, strAYXKKw, strCopydefault, id, c42099rGh.valueOf(), new C43739ruv(), c42099rGh.KWHzl().OLrzqt(), c42099rGh.getActivity(), null, null, null, null, null, null, null, null, 130560, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C42099rGh c42099rGh, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        rGL rglFetchVPNInfo = c42099rGh.fetchVPNInfo();
        java.lang.String strAYXKKw = c42099rGh.AYXKKw();
        java.lang.String strCopydefault = c42099rGh.copydefault();
        FormAppModel formAppModel = c42099rGh.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        java.lang.String id = formAppModel.getId();
        AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, null, cTAButtonAppModel, strAYXKKw, strCopydefault, id == null ? "" : id, c42099rGh.valueOf(), new C43739ruv(), c42099rGh.KWHzl().OLrzqt(), c42099rGh.getActivity(), null, null, null, null, null, null, null, new Function1() { // from class: o.rGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.OLrzqt(this.copydefault, (java.util.HashMap) obj);
            }
        }, 65024, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C42099rGh c42099rGh, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        c42099rGh.KWHzl().AEQbTJ((java.util.HashMap<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(final C42099rGh c42099rGh, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        rGL rglFetchVPNInfo = c42099rGh.fetchVPNInfo();
        java.lang.String strAYXKKw = c42099rGh.AYXKKw();
        java.lang.String strCopydefault = c42099rGh.copydefault();
        FormAppModel formAppModel = c42099rGh.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        java.lang.String id = formAppModel.getId();
        AbstractC42074rFj.onButtonClicked$default(rglFetchVPNInfo, null, cTAButtonAppModel, strAYXKKw, strCopydefault, id == null ? "" : id, c42099rGh.valueOf(), new C43739ruv(), c42099rGh.KWHzl().OLrzqt(), c42099rGh.getActivity(), null, null, null, null, null, null, null, new Function1() { // from class: o.rGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.gEmmrt(this.KWHzl, (java.util.HashMap) obj);
            }
        }, 65024, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C42099rGh c42099rGh, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        c42099rGh.KWHzl().AEQbTJ((java.util.HashMap<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    private final void copydefault(final android.view.View view) {
        AbstractC43890rxn abstractC43890rxnAEQbTJ;
        C52794wYp c52794wYp;
        if (!(view instanceof C42249rLw)) {
            if (view instanceof rLY) {
                this.AuCTelauCTel = (rLY) view;
                return;
            }
            return;
        }
        java.util.Iterator<T> it = fetchVPNInfo().RJOkX().iterator();
        while (it.hasNext()) {
            rAX rax = (rAX) it.next();
            C42249rLw c42249rLw = (C42249rLw) view;
            pUU.KWHzl("qjf", "CtaButtonItemView id = " + c42249rLw.EZpvd() + ",key = " + rax.OLrzqt());
            if (Intrinsics.EZpvd((java.lang.Object) c42249rLw.EZpvd(), (java.lang.Object) rax.OLrzqt()) && (abstractC43890rxnAEQbTJ = c42249rLw.AEQbTJ()) != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null) {
                c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, view));
            }
        }
        fetchVPNInfo().gasjUx().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.rGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.KWHzl(view, (C42156rIk) obj);
            }
        }));
        fetchVPNInfo().fIwbmz().AEQbTJ().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.rGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42099rGh.copydefault(view, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.rGh$ActionBar */
    public static final class ActionBar implements Function1<java.util.HashMap<java.lang.String, java.lang.String>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.util.HashMap<java.lang.String, java.lang.String> map) {
            KWHzl(map);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.util.HashMap<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            C42099rGh.this.KWHzl().AEQbTJ(map);
        }
    }

    public static final Unit KWHzl(android.view.View view, C42156rIk c42156rIk) {
        AbstractC43890rxn abstractC43890rxnAEQbTJ;
        C52794wYp c52794wYp;
        AbstractC43890rxn abstractC43890rxnAEQbTJ2;
        C52794wYp c52794wYp2;
        AbstractC43890rxn abstractC43890rxnAEQbTJ3;
        C52794wYp c52794wYp3;
        AbstractC43890rxn abstractC43890rxnAEQbTJ4;
        C52794wYp c52794wYp4;
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            C42249rLw c42249rLw = (C42249rLw) view;
            if (listKWHzl.contains(c42249rLw.KWHzl().getId()) && (abstractC43890rxnAEQbTJ3 = c42249rLw.AEQbTJ()) != null && (c52794wYp3 = abstractC43890rxnAEQbTJ3.AEQbTJ) != null && c52794wYp3.getVisibility() == 0 && (abstractC43890rxnAEQbTJ4 = c42249rLw.AEQbTJ()) != null && (c52794wYp4 = abstractC43890rxnAEQbTJ4.AEQbTJ) != null) {
                c52794wYp4.setVisibility(8);
            }
        }
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            C42249rLw c42249rLw2 = (C42249rLw) view;
            if (listCopydefault.contains(c42249rLw2.KWHzl().getId()) && (abstractC43890rxnAEQbTJ = c42249rLw2.AEQbTJ()) != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null && c52794wYp.getVisibility() == 8 && (abstractC43890rxnAEQbTJ2 = c42249rLw2.AEQbTJ()) != null && (c52794wYp2 = abstractC43890rxnAEQbTJ2.AEQbTJ) != null) {
                c52794wYp2.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.view.View view, java.lang.Boolean bool) {
        AbstractC43890rxn abstractC43890rxnAEQbTJ;
        C52794wYp c52794wYp;
        C42249rLw c42249rLw = (C42249rLw) view;
        ButtonStyle style = c42249rLw.KWHzl().getStyle();
        if (style != null && Application.KWHzl[style.ordinal()] == 1 && (abstractC43890rxnAEQbTJ = c42249rLw.AEQbTJ()) != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        rGL rglFetchVPNInfo = fetchVPNInfo();
        FormAppModel formAppModel = this.sSMYrx;
        if (formAppModel == null) {
            Intrinsics.gEmmrt("");
            formAppModel = null;
        }
        rglFetchVPNInfo.AEQbTJ(formAppModel);
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Job jobEZpvd;
        super.onDestroyView();
        rLY rly = this.AuCTelauCTel;
        if (rly != null && (jobEZpvd = rly.EZpvd()) != null && (!jobEZpvd.isCompleted() || jobEZpvd.isActive() || !jobEZpvd.isCancelled())) {
            Job.DefaultImpls.cancel$default(jobEZpvd, (CancellationException) null, 1, (java.lang.Object) null);
        }
        fJNWhG();
        AbstractC43844rwu abstractC43844rwuAEQbTJ = AEQbTJ();
        if (abstractC43844rwuAEQbTJ != null) {
            ViewCompat.setOnApplyWindowInsetsListener(abstractC43844rwuAEQbTJ.OLrzqt, null);
        }
        this.AwvSrB = null;
        this.wlaJM = null;
        this.iwGUEr = null;
        ejfBZ();
    }

    public final void fJNWhG() {
        rGL rglFetchVPNInfo = fetchVPNInfo();
        rglFetchVPNInfo.copydefault();
        rglFetchVPNInfo.gEmmrt().removeObservers(getViewLifecycleOwner());
        rglFetchVPNInfo.fIwbmz().AEQbTJ().removeObservers(getViewLifecycleOwner());
        rglFetchVPNInfo.djBIcL().removeObservers(getViewLifecycleOwner());
        rglFetchVPNInfo.fetchVPNInfo().removeObservers(getViewLifecycleOwner());
        rglFetchVPNInfo.AwvSrB().removeObservers(getViewLifecycleOwner());
        rglFetchVPNInfo.giSNqX().removeObservers(getViewLifecycleOwner());
        rglFetchVPNInfo.fFgQHt().removeObservers(getViewLifecycleOwner());
    }

    public final void getFieldNames() {
        C42459rTq c42459rTq = C42459rTq.KWHzl;
        if (c42459rTq.AhwBna()) {
            java.lang.String strValueOf = c42459rTq.valueOf();
            if (strValueOf != null) {
                try {
                    RecallNotificationConfig recallNotificationConfig = (RecallNotificationConfig) new Gson().fromJson(strValueOf, RecallNotificationConfig.class);
                    if (recallNotificationConfig == null) {
                        pUU.copydefault("ScheduleRecallNotification", "Form | inner getRecallNotificationConfig response is null");
                        return;
                    }
                    FormAppModel formAppModel = this.sSMYrx;
                    if (formAppModel == null) {
                        Intrinsics.gEmmrt("");
                        formAppModel = null;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) formAppModel.getId(), (java.lang.Object) recallNotificationConfig.getPageKey())) {
                        rDZ rdz = rDZ.OLrzqt;
                        FragmentActivity fragmentActivityRequireActivity = requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                        rdz.copydefault(fragmentActivityRequireActivity, RecallNotificationType.LOCAL_PUSH_NOTIFICATION, recallNotificationConfig.getRecallDurationInSecs(), recallNotificationConfig.getMaxResendCount());
                        return;
                    }
                    return;
                } catch (java.lang.Exception e) {
                    pUU.copydefault("ScheduleRecallNotification", "Form | getRecallNotificationConfig fail to parse json | msg: " + e.getMessage());
                    return;
                }
            }
            pUU.copydefault("ScheduleRecallNotification", "Form | outer getRecallNotificationConfig response is null");
            return;
        }
        pUU.EZpvd("ScheduleRecallNotification", "Form | AB Flag off");
    }
}
