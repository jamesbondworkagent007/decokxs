package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.navigation.fragment.NavHostFragment;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint;
import com.okinc.account.api.service.ResetMfaUploadPersonalInfoService;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity;
import com.okinc.auth.impl.reset2fa.ui.ResetMfaActivity$observeNextStep$1;
import com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC6596aSN;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6629aSu extends AbstractActivityC6627aSs {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<ResetMfaUploadPersonalInfoService.Args> AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aSy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6629aSu.OLrzqt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm gEmmrt;
    public final ActivityResultLauncher<android.content.Intent> valueOf;

    /* JADX INFO: renamed from: o.aSu$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public ActivityC6629aSu() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(ResetMfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.ResetMfaActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.ResetMfaActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.ResetMfaActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6629aSu.KWHzl(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<ResetMfaUploadPersonalInfoService.Args> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((ResetMfaUploadPersonalInfoService) C43251rlk.copydefault(ResetMfaUploadPersonalInfoService.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.aSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6629aSu.OLrzqt(this.OLrzqt, (ResetMfaUploadPersonalInfoService.Activity) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6629aSu.OLrzqt(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult3;
    }

    private final ResetMfaViewModel values() {
        return (ResetMfaViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.aSs.AEQbTJ()V */
    public final SubdomainStrategy AEQbTJ() {
        return (SubdomainStrategy) this.djBIcL.getValue();
    }

    public static final SubdomainStrategy OLrzqt(ActivityC6629aSu activityC6629aSu) {
        android.os.Parcelable parcelableExtra = activityC6629aSu.getIntent().getParcelableExtra("KEY_SUBDOMAIN_STRATEGY");
        if (parcelableExtra instanceof SubdomainStrategy) {
            return (SubdomainStrategy) parcelableExtra;
        }
        return null;
    }

    public static final void KWHzl(ActivityC6629aSu activityC6629aSu, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            activityC6629aSu.setResult(-1);
            activityC6629aSu.finish();
        }
    }

    public static final void OLrzqt(ActivityC6629aSu activityC6629aSu, ResetMfaUploadPersonalInfoService.Activity activity) {
        pUU.EZpvd(activityC6629aSu.getTAG(), "upload personal info: " + activity.KWHzl());
        if (activity.KWHzl()) {
            ResetMfaViewModel resetMfaViewModelValues = activityC6629aSu.values();
            java.lang.String strOLrzqt = activity.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            resetMfaViewModelValues.copydefault(strOLrzqt);
        }
    }

    public static final void OLrzqt(ActivityC6629aSu activityC6629aSu, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            MfaServiceResult mfaServiceResult = data != null ? (MfaServiceResult) data.getParcelableExtra("KEY_RESPONSE") : null;
            if (mfaServiceResult != null) {
                MfaState mfaStateComponent1 = mfaServiceResult.component1();
                java.lang.String strComponent2 = mfaServiceResult.component2();
                if (Intrinsics.EZpvd(mfaStateComponent1, MfaState.Success.AEQbTJ)) {
                    activityC6629aSu.values().EZpvd(strComponent2, activityC6629aSu.AEQbTJ());
                    return;
                } else {
                    pUU.copydefault(C56524yIo.AEQbTJ(activityC6629aSu.getClass()).valueOf(), "Failed to verify MFA module");
                    return;
                }
            }
            pUU.copydefault(activityC6629aSu.getTAG(), "No MFA result received");
        }
    }

    /* JADX INFO: renamed from: o.aSu$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aSu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ android.content.Intent intentOf$default(TaskDescription taskDescription, android.content.Context context, RebindMfaEntryPoint rebindMfaEntryPoint, java.lang.String str, SubdomainStrategy subdomainStrategy, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            return taskDescription.EZpvd(context, rebindMfaEntryPoint, str, subdomainStrategy);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull RebindMfaEntryPoint rebindMfaEntryPoint, java.lang.String str, SubdomainStrategy subdomainStrategy) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rebindMfaEntryPoint, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6629aSu.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_ENTRY_POINT", rebindMfaEntryPoint), C56390yDp.OLrzqt("KEY_SUBDOMAIN_STRATEGY", subdomainStrategy), C56390yDp.OLrzqt("KEY_SOURCE_MFA_TYPE", str)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC6627aSs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.AEQbTJ);
        RebindMfaEntryPoint rebindMfaEntryPoint = (RebindMfaEntryPoint) getIntent().getParcelableExtra("KEY_ENTRY_POINT");
        if (rebindMfaEntryPoint != null) {
            values().OLrzqt(rebindMfaEntryPoint);
        }
        androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C8206ayP.StateListAnimator.DGOPHZDGOPHZ);
        Intrinsics.copydefault(fragmentFindFragmentById, "");
        ((NavHostFragment) fragmentFindFragmentById).getNavController().setGraph(C8206ayP.TaskDescription.KWHzl, getIntent().getExtras());
        AhwBna();
        AYXKKw();
        fetchVPNInfo();
        djBIcL();
        gEmmrt();
        valueOf();
        values().copydefault().observe(this, new C32991mny(new Function1() { // from class: o.aSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6629aSu.OLrzqt((java.lang.String) obj);
            }
        }));
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        C6690aUB.AEQbTJ(values().OLrzqt(), this, new ResetMfaActivity$observeNextStep$1(this, null));
    }

    public final void AYXKKw() {
        values().valueOf().observe(this, new Application(new Function1() { // from class: o.aSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6629aSu.AEQbTJ(this.OLrzqt, (Unit) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(ActivityC6629aSu activityC6629aSu, Unit unit) {
        activityC6629aSu.setResult(-1);
        activityC6629aSu.finish();
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        values().AEQbTJ().observe(this, new C32991mny(new Function1() { // from class: o.aSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6629aSu.djBIcL(this.EZpvd, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit djBIcL(ActivityC6629aSu activityC6629aSu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC6629aSu.valueOf.launch(MfaForResultActivity.Companion.AEQbTJ(activityC6629aSu, str, null, activityC6629aSu.values().isConnected(), null, MfaScenario.IsPostLogin));
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        values().AYXKKw().observe(this, new C32991mny(new Function1() { // from class: o.aSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6629aSu.AhwBna(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AhwBna(ActivityC6629aSu activityC6629aSu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC6629aSu.valueOf.launch(MfaForResultActivity.Companion.AEQbTJ(activityC6629aSu, str, null, activityC6629aSu.values().isConnected(), null, MfaScenario.IsPartialAuth));
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        values().gEmmrt().observe(this, new C32991mny(new Function1() { // from class: o.aSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6629aSu.AYXKKw(this.copydefault, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AYXKKw(ActivityC6629aSu activityC6629aSu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC6629aSu.valueOf.launch(MfaForResultActivity.Companion.AEQbTJ(activityC6629aSu, str, null, activityC6629aSu.values().isConnected(), null, MfaScenario.IsNonAuth));
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        values().values().observe(this, new C32991mny(new Function1() { // from class: o.aSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6629aSu.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit EZpvd(final ActivityC6629aSu activityC6629aSu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC6629aSu);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.RlQdEF));
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.RvdRAu), new View.OnClickListener() { // from class: o.aSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC6629aSu.OLrzqt(this.copydefault, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC6629aSu activityC6629aSu, android.view.View view) {
        activityC6629aSu.finish();
    }

    public final void KWHzl(AbstractC6596aSN abstractC6596aSN) {
        ResetMfaUploadPersonalInfoService.UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa;
        androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C8206ayP.StateListAnimator.DGOPHZDGOPHZ);
        NavController navControllerFindNavController = fragmentFindFragmentById != null ? FragmentKt.findNavController(fragmentFindFragmentById) : null;
        if (abstractC6596aSN instanceof AbstractC6596aSN.ActionBar) {
            values().OLrzqt(((AbstractC6596aSN.ActionBar) abstractC6596aSN).EZpvd(), AEQbTJ());
            return;
        }
        if (abstractC6596aSN instanceof AbstractC6596aSN.TaskDescription) {
            if (navControllerFindNavController != null) {
                int i = C8206ayP.StateListAnimator.DTeKQX;
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                AbstractC6596aSN.TaskDescription taskDescription = (AbstractC6596aSN.TaskDescription) abstractC6596aSN;
                pairArr[0] = C56390yDp.OLrzqt("KEY_TOKEN", taskDescription.AEQbTJ());
                android.os.Bundle extras = getIntent().getExtras();
                pairArr[1] = C56390yDp.OLrzqt("KEY_ENTRY_POINT", extras != null ? extras.getParcelable("KEY_ENTRY_POINT") : null);
                pairArr[2] = C56390yDp.OLrzqt("KEY_TYPE", taskDescription.copydefault());
                android.os.Bundle extras2 = getIntent().getExtras();
                pairArr[3] = C56390yDp.OLrzqt("KEY_SUBDOMAIN_STRATEGY", extras2 != null ? extras2.getParcelable("KEY_SUBDOMAIN_STRATEGY") : null);
                navControllerFindNavController.navigate(i, BundleKt.bundleOf(pairArr));
                return;
            }
            return;
        }
        if (abstractC6596aSN instanceof AbstractC6596aSN.Activity) {
            AbstractC6596aSN.Activity activity = (AbstractC6596aSN.Activity) abstractC6596aSN;
            UploadPersonalInfoEntryPoint uploadPersonalInfoEntryPointEZpvd = activity.EZpvd();
            if (uploadPersonalInfoEntryPointEZpvd instanceof UploadPersonalInfoEntryPoint.Rebind2fa) {
                uploadPersonalInfoEntryPointReset2fa = new ResetMfaUploadPersonalInfoService.UploadPersonalInfoEntryPointReset2fa("rebind", java.lang.Integer.valueOf(((UploadPersonalInfoEntryPoint.Rebind2fa) activity.EZpvd()).getBusinessId()), ((UploadPersonalInfoEntryPoint.Rebind2fa) activity.EZpvd()).getWorkflowToken(), activity.OLrzqt());
            } else if (uploadPersonalInfoEntryPointEZpvd instanceof UploadPersonalInfoEntryPoint.NonAuthRebind2fa) {
                uploadPersonalInfoEntryPointReset2fa = new ResetMfaUploadPersonalInfoService.UploadPersonalInfoEntryPointReset2fa("non_auth_rebind", java.lang.Integer.valueOf(((UploadPersonalInfoEntryPoint.NonAuthRebind2fa) activity.EZpvd()).getBusinessId()), ((UploadPersonalInfoEntryPoint.NonAuthRebind2fa) activity.EZpvd()).getWorkflowToken(), activity.OLrzqt());
            } else {
                uploadPersonalInfoEntryPointReset2fa = new ResetMfaUploadPersonalInfoService.UploadPersonalInfoEntryPointReset2fa("rebind", java.lang.Integer.valueOf(activity.EZpvd().getBusinessId()), null, false, 8, null);
            }
            this.AYXKKw.launch(new ResetMfaUploadPersonalInfoService.Args(new ResetMfaUploadPersonalInfoService.UploadPersonalInfoRequestReset2fa(activity.AEQbTJ().getEmail(), activity.AEQbTJ().getAreaCode(), activity.AEQbTJ().getPhone(), activity.AEQbTJ().getToken()), uploadPersonalInfoEntryPointReset2fa, activity.OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd(abstractC6596aSN, AbstractC6596aSN.StateListAnimator.AEQbTJ)) {
            if (navControllerFindNavController != null) {
                navControllerFindNavController.navigate(C8206ayP.StateListAnimator.RIuxYh);
            }
        } else if (Intrinsics.EZpvd(abstractC6596aSN, AbstractC6596aSN.Dialog.OLrzqt)) {
            this.AhwBna.launch(ActivityC6653aTR.Companion.KWHzl(this));
        } else {
            if (!Intrinsics.EZpvd(abstractC6596aSN, AbstractC6596aSN.Application.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.copydefault("ResetMfaActivity: handleNextStep: ResponseErrorCase");
            C55326xho.toast$default(C8206ayP.Dialog.DPHNDa, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            finish();
        }
    }

    @Override // o.AbstractActivityC6627aSs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6627aSs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6627aSs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6627aSs, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
