package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
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
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionSource;
import com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$onCreate$1;
import com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$onCreate$2;
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

/* JADX INFO: renamed from: o.fMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17639fMu extends androidx.fragment.app.Fragment {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> AEQbTJ;
    public SignAndSendTransactionInput EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    public C17639fMu() {
        Function0 function0 = new Function0() { // from class: o.fMv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17639fMu.OLrzqt(this.AEQbTJ);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fMC.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.transaction.ui.fragment.SignAndSendTransactionFragment$special$$inlined$viewModels$default$4
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
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.fMt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17639fMu.OLrzqt(this.copydefault, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.fMu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C17639fMu EZpvd(@NotNull SignAndSendTransactionInput signAndSendTransactionInput) {
            Intrinsics.checkNotNullParameter(signAndSendTransactionInput, "");
            C17639fMu c17639fMu = new C17639fMu();
            c17639fMu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_input", signAndSendTransactionInput)));
            return c17639fMu;
        }
    }

    public final fMC KWHzl() {
        return (fMC) this.OLrzqt.getValue();
    }

    public static final fMC copydefault(C17639fMu c17639fMu, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        SignAndSendTransactionInput signAndSendTransactionInput = c17639fMu.EZpvd;
        if (signAndSendTransactionInput == null) {
            Intrinsics.gEmmrt("");
            signAndSendTransactionInput = null;
        }
        SignAndSendTransactionSource signAndSendTransactionSourceKWHzl = signAndSendTransactionInput.KWHzl();
        C9678baC.Activity activity = C9678baC.Companion;
        return new fMC(signAndSendTransactionSourceKWHzl, new C17652fNg(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp(), Dispatchers.getIO()), new C17657fNl(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp()));
    }

    public static final void OLrzqt(C17639fMu c17639fMu, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.copydefault("SignAndSendTransactionFragment", "authenticatePasskey " + passkeyAuthenticateState);
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            c17639fMu.KWHzl().OLrzqt(new PasskeyWalletSignedMsg(((PasskeyAuthenticateState.Success) passkeyAuthenticateState).OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault) || Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
            c17639fMu.copydefault(SignAndSendTransactionResult.Cancelled.copydefault);
            return;
        }
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
            PasskeyAuthenticateState.SdkError sdkError = (PasskeyAuthenticateState.SdkError) passkeyAuthenticateState;
            c17639fMu.copydefault(new SignAndSendTransactionResult.Failed.PasskeyError(C17661fNp.OLrzqt.copydefault(sdkError.AEQbTJ(), sdkError.copydefault())));
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
            c17639fMu.copydefault(SignAndSendTransactionResult.Cancelled.copydefault);
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Failure.OLrzqt)) {
            c17639fMu.copydefault(new SignAndSendTransactionResult.Failed.PasskeyError(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
        } else {
            if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            c17639fMu.copydefault(new SignAndSendTransactionResult.Failed.PasskeyError(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        SignAndSendTransactionInput signAndSendTransactionInput;
        android.os.Parcelable parcelable;
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            EZpvd();
            return;
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("extra_input", SignAndSendTransactionInput.class);
            } else {
                parcelable = arguments.getParcelable("extra_input");
            }
            signAndSendTransactionInput = (SignAndSendTransactionInput) parcelable;
        } else {
            signAndSendTransactionInput = null;
        }
        if (signAndSendTransactionInput != null) {
            this.EZpvd = signAndSendTransactionInput;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SignAndSendTransactionFragment$onCreate$1(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SignAndSendTransactionFragment$onCreate$2(this, null), 3, null);
            pUU.copydefault("SignAndSendTransactionFragment", "createUop");
            KWHzl().AEQbTJ(signAndSendTransactionInput.AEQbTJ());
            return;
        }
        copydefault(SignAndSendTransactionResult.Cancelled.copydefault);
    }

    public final void copydefault(SignAndSendTransactionResult signAndSendTransactionResult) {
        FragmentKt.setFragmentResult(this, "request_key_cedefi_sign_and_send_transaction", BundleKt.bundleOf(C56390yDp.OLrzqt("result_data_cedefi_sign_and_send_transaction", signAndSendTransactionResult)));
        EZpvd();
    }

    private final void EZpvd() {
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static final ViewModelProvider.Factory OLrzqt(final C17639fMu c17639fMu) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fMC.class), new Function1() { // from class: o.fMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17639fMu.copydefault(this.OLrzqt, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
