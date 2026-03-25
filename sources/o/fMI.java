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
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EnableLimitOrderInput;
import com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.EnableLimitOrderFragment$onCreate$1;
import com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.EnableLimitOrderFragment$onCreate$2;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalEnableLimitOrderResult;
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

/* JADX INFO: loaded from: classes23.dex */
public final class fMI extends androidx.fragment.app.Fragment {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> AEQbTJ;
    public EnableLimitOrderInput EZpvd;
    public final InterfaceC56387yDm KWHzl;

    public fMI() {
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.fMQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fMI.KWHzl(this.KWHzl, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
        Function0 function0 = new Function0() { // from class: o.fMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fMI.copydefault();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.EnableLimitOrderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.EnableLimitOrderFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fMW.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.EnableLimitOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.EnableLimitOrderFragment$special$$inlined$viewModels$default$4
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final void KWHzl(fMI fmi, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.copydefault("EnableLimitOrderFragment", "authenticatePasskey " + passkeyAuthenticateState);
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            fmi.KWHzl().copydefault(new PasskeyWalletSignedMsg(((PasskeyAuthenticateState.Success) passkeyAuthenticateState).OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault) || Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
            fmi.OLrzqt(InternalEnableLimitOrderResult.Cancelled.EZpvd);
            return;
        }
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
            PasskeyAuthenticateState.SdkError sdkError = (PasskeyAuthenticateState.SdkError) passkeyAuthenticateState;
            fmi.OLrzqt(new InternalEnableLimitOrderResult.Failed(C17661fNp.OLrzqt.copydefault(sdkError.AEQbTJ(), sdkError.copydefault())));
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
            fmi.OLrzqt(InternalEnableLimitOrderResult.Cancelled.EZpvd);
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Failure.OLrzqt)) {
            fmi.OLrzqt(new InternalEnableLimitOrderResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
        } else {
            if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            fmi.OLrzqt(new InternalEnableLimitOrderResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)));
        }
    }

    public final fMW KWHzl() {
        return (fMW) this.KWHzl.getValue();
    }

    public static final fMW KWHzl(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        C9678baC.Activity activity = C9678baC.Companion;
        return new fMW(new C17652fNg(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp(), Dispatchers.getIO()), new C17657fNl(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        EnableLimitOrderInput enableLimitOrderInput;
        android.os.Parcelable parcelable;
        super.onCreate(bundle);
        if (bundle != null) {
            EZpvd();
            return;
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("key_input", EnableLimitOrderInput.class);
            } else {
                parcelable = arguments.getParcelable("key_input");
            }
            enableLimitOrderInput = (EnableLimitOrderInput) parcelable;
        } else {
            enableLimitOrderInput = null;
        }
        if (enableLimitOrderInput != null) {
            this.EZpvd = enableLimitOrderInput;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EnableLimitOrderFragment$onCreate$1(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EnableLimitOrderFragment$onCreate$2(this, null), 3, null);
            KWHzl().AEQbTJ(enableLimitOrderInput.copydefault());
            return;
        }
        OLrzqt(InternalEnableLimitOrderResult.Cancelled.EZpvd);
    }

    public final void OLrzqt(InternalEnableLimitOrderResult internalEnableLimitOrderResult) {
        FragmentKt.setFragmentResult(this, "EnableLimitOrderFragmentRequestKey", BundleKt.bundleOf(C56390yDp.OLrzqt("EnableLimitOrderFragmentResultKey", internalEnableLimitOrderResult)));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory copydefault() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fMW.class), new Function1() { // from class: o.fMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fMI.KWHzl((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
