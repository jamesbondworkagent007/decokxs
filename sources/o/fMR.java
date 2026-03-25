package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoInput;
import com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$onCreate$2;
import com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$onCreate$3;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalUpdateInfoResult;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyUpdatedResult;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C13754dXa;
import o.C9678baC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fMR extends androidx.fragment.app.Fragment {
    public final ActivityResultLauncher<EmailRecoveryInput> EZpvd;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public UpdateInfoInput copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public fMR() {
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.fMN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fMR.OLrzqt(this.copydefault, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<EmailRecoveryInput> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).EZpvd(), new ActivityResultCallback() { // from class: o.fMT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fMR.KWHzl(this.copydefault, (EmailRecoveryResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult2;
        Function0 function0 = new Function0() { // from class: o.fMU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fMR.copydefault();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fMX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final fMR AEQbTJ(@NotNull UpdateInfoInput updateInfoInput, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(updateInfoInput, "");
            fMR fmr = new fMR();
            fmr.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key_input", updateInfoInput), C56390yDp.OLrzqt("key_auto_update", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("key_remove_self_after_update", java.lang.Boolean.valueOf(z2))));
            return fmr;
        }
    }

    public static final void OLrzqt(fMR fmr, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.copydefault("UpdateInfoFragment", "authenticatePasskey " + passkeyAuthenticateState);
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            fmr.OLrzqt().EZpvd(new PasskeyWalletSignedMsg(((PasskeyAuthenticateState.Success) passkeyAuthenticateState).OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault) || Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
            androidx.fragment.app.FragmentManager childFragmentManager = fmr.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.add(fMP.Companion.OLrzqt(), (java.lang.String) null);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            return;
        }
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
            PasskeyAuthenticateState.SdkError sdkError = (PasskeyAuthenticateState.SdkError) passkeyAuthenticateState;
            fmr.AEQbTJ(new InternalUpdateInfoResult.Failed(C17661fNp.OLrzqt.copydefault(sdkError.AEQbTJ(), sdkError.copydefault())));
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
            fmr.AEQbTJ(InternalUpdateInfoResult.Cancelled.AEQbTJ);
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Failure.OLrzqt)) {
            fmr.AEQbTJ(new InternalUpdateInfoResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
        } else {
            if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            fmr.AEQbTJ(new InternalUpdateInfoResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)));
        }
    }

    public static final void KWHzl(fMR fmr, EmailRecoveryResult emailRecoveryResult) {
        if (Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.Success.OLrzqt)) {
            fmr.AEQbTJ(InternalUpdateInfoResult.EmailRecovery.EZpvd);
        } else {
            fmr.AEQbTJ(InternalUpdateInfoResult.Cancelled.AEQbTJ);
        }
    }

    public final fMX OLrzqt() {
        return (fMX) this.OLrzqt.getValue();
    }

    public static final fMX OLrzqt(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        C9678baC.Activity activity = C9678baC.Companion;
        return new fMX(new C17652fNg(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp(), Dispatchers.getIO()), new C17657fNl(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        UpdateInfoInput updateInfoInput;
        android.os.Parcelable parcelable;
        super.onCreate(bundle);
        if (bundle != null) {
            KWHzl();
            return;
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("key_input", UpdateInfoInput.class);
            } else {
                parcelable = arguments.getParcelable("key_input");
            }
            updateInfoInput = (UpdateInfoInput) parcelable;
        } else {
            updateInfoInput = null;
        }
        if (updateInfoInput == null) {
            AEQbTJ(InternalUpdateInfoResult.Cancelled.AEQbTJ);
            return;
        }
        this.copydefault = updateInfoInput;
        getChildFragmentManager().setFragmentResultListener("request_key_passkey_updated", this, new FragmentResultListener() { // from class: o.fMV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                fMR.copydefault(this.copydefault, str, bundle2);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UpdateInfoFragment$onCreate$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UpdateInfoFragment$onCreate$3(this, null), 3, null);
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || !arguments2.getBoolean("key_auto_update")) {
            return;
        }
        pUU.copydefault("UpdateInfoFragment", "createUop");
        AEQbTJ();
    }

    public final void AEQbTJ() {
        fMX fmxOLrzqt = OLrzqt();
        UpdateInfoInput updateInfoInput = this.copydefault;
        if (updateInfoInput == null) {
            Intrinsics.gEmmrt("");
            updateInfoInput = null;
        }
        fmxOLrzqt.copydefault(updateInfoInput.copydefault());
    }

    public final void AEQbTJ(InternalUpdateInfoResult internalUpdateInfoResult) {
        FragmentKt.setFragmentResult(this, "UpdateInfoFragmentRequestKey", BundleKt.bundleOf(C56390yDp.OLrzqt("UpdateInfoFragmentResultKey", internalUpdateInfoResult)));
        android.os.Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("key_remove_self_after_update")) {
            return;
        }
        KWHzl();
    }

    private final void KWHzl() {
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static final ViewModelProvider.Factory copydefault() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fMX.class), new Function1() { // from class: o.fMS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fMR.OLrzqt((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final void copydefault(fMR fmr, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("result_data_passkey_updated", PasskeyUpdatedResult.class);
        } else {
            parcelable = bundle.getParcelable("result_data_passkey_updated");
        }
        PasskeyUpdatedResult passkeyUpdatedResult = (PasskeyUpdatedResult) parcelable;
        if (passkeyUpdatedResult == null) {
            fmr.AEQbTJ(InternalUpdateInfoResult.Cancelled.AEQbTJ);
        } else {
            if (!Intrinsics.EZpvd(passkeyUpdatedResult, PasskeyUpdatedResult.EmailRecovery.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            fmr.EZpvd.launch(new EmailRecoveryInput(ProjectSource.CeDeFi));
        }
    }
}
