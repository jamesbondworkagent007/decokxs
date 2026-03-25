package o;

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
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailSetResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyFromSource;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.WalletCreationError;
import com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$onCreate$1;
import com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$onCreate$2;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17562fJy;
import o.C13754dXa;
import o.InterfaceC8196ayF;

/* JADX INFO: renamed from: o.fJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17545fJh extends androidx.fragment.app.Fragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final ActivityResultLauncher<EmailOperationInput> AhwBna;
    public final ActivityResultLauncher<PasskeyLinkScenarioRequest> EZpvd;
    public final ActivityResultLauncher<PasskeyRegisterScenarioRequest> KWHzl;
    public boolean copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.fJh$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyOperationType.values().length];
            try {
                iArr[PasskeyOperationType.REGISTER_PASSKEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyOperationType.LINK_PASSKEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyOperationType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public C17545fJh() {
        ActivityResultLauncher<EmailOperationInput> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC17562fJy.Application.OLrzqt, new ActivityResultCallback() { // from class: o.fJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17545fJh.copydefault(this.OLrzqt, (EmailSetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PasskeyLinkScenarioRequest> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).EZpvd(), new ActivityResultCallback() { // from class: o.fJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17545fJh.KWHzl(this.OLrzqt, (PasskeyLinkState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult2;
        final Function0 function0 = null;
        ActivityResultLauncher<PasskeyRegisterScenarioRequest> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), null, null, 3, null), new ActivityResultCallback() { // from class: o.fJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17545fJh.AEQbTJ(this.copydefault, (PasskeyRegisterState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult3;
        Function0 function02 = new Function0() { // from class: o.fJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17545fJh.KWHzl();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C17560fJw.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$4
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
        Function0 function04 = new Function0() { // from class: o.fJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17545fJh.copydefault();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fJL.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.create.ui.CreatePasskeyWalletContainerFragment$special$$inlined$viewModels$default$9
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
                Function0 function06 = function0;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function04);
    }

    /* JADX INFO: renamed from: o.fJh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fJh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17545fJh AEQbTJ() {
            C17545fJh c17545fJh = new C17545fJh();
            c17545fJh.setArguments(BundleKt.bundleOf());
            return c17545fJh;
        }
    }

    public static final void copydefault(C17545fJh c17545fJh, EmailSetResult emailSetResult) {
        pUU.copydefault("CreatePasskeyWalletContainer", "CeDeFiAddOrUpdateEmailActivity result = " + emailSetResult);
        if (Intrinsics.EZpvd(emailSetResult, EmailSetResult.Success.copydefault)) {
            c17545fJh.OLrzqt().AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(emailSetResult, EmailSetResult.Cancelled.KWHzl)) {
            c17545fJh.copydefault(CeDeFiWalletResult.Cancelled.KWHzl);
        } else {
            if (!(emailSetResult instanceof EmailSetResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            C17661fNp c17661fNp = C17661fNp.OLrzqt;
            C55326xho.toastWithFailedIcon$default(C17661fNp.handleNetworkCommonErrorMessage$default(c17661fNp, null, 1, null), 0, 1, (java.lang.Object) null);
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.GeneralFailure(new java.lang.Throwable(C17661fNp.handleNetworkCommonErrorMessage$default(c17661fNp, null, 1, null)))));
        }
    }

    public static final void KWHzl(C17545fJh c17545fJh, PasskeyLinkState passkeyLinkState) {
        PasskeyFromSource passkeyFromSource;
        pUU.copydefault("CreatePasskeyWalletContainer", "linkState result = " + passkeyLinkState);
        if (passkeyLinkState instanceof PasskeyLinkState.Success) {
            c17545fJh.copydefault = false;
            C17662fNq c17662fNq = C17662fNq.KWHzl;
            if (((PasskeyLinkState.Success) passkeyLinkState).KWHzl()) {
                passkeyFromSource = PasskeyFromSource.LINK_EXTERNAL_DEVICE;
            } else {
                passkeyFromSource = PasskeyFromSource.LINK_EXCHANGE_PASSKEY;
            }
            c17662fNq.OLrzqt(passkeyFromSource);
            c17545fJh.OLrzqt().AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.ReachMaximum.copydefault)) {
            c17545fJh.copydefault(CeDeFiWalletResult.Cancelled.KWHzl);
            return;
        }
        if (Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.NoValidPasskey.OLrzqt) || Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.Cancel.OLrzqt)) {
            if (c17545fJh.copydefault) {
                c17545fJh.copydefault(CeDeFiWalletResult.Ignored.EZpvd);
                return;
            } else {
                c17545fJh.AYXKKw();
                return;
            }
        }
        if (passkeyLinkState instanceof PasskeyLinkState.Failure) {
            PasskeyLinkState.Failure failure = (PasskeyLinkState.Failure) passkeyLinkState;
            C55326xho.toastWithFailedIcon$default(C17661fNp.OLrzqt.EZpvd(failure.AEQbTJ()), 0, 1, (java.lang.Object) null);
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.PasskeyNetworkFailure(new java.lang.Throwable(failure.AEQbTJ()))));
        } else {
            if (passkeyLinkState instanceof PasskeyLinkState.SdkError) {
                PasskeyLinkState.SdkError sdkError = (PasskeyLinkState.SdkError) passkeyLinkState;
                java.lang.String strCopydefault = C17661fNp.OLrzqt.copydefault(sdkError.EZpvd(), sdkError.KWHzl());
                if (strCopydefault != null) {
                    C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
                }
                c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.PasskeySdkError(new java.lang.Throwable(sdkError.EZpvd()))));
                return;
            }
            if (!Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.DeviceNotCompatible.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs), 0, 1, (java.lang.Object) null);
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.PasskeySdkError(new java.lang.Throwable("PasskeyLinkState.DeviceNotCompatible"))));
        }
    }

    public final void AYXKKw() {
        try {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("PasskeyNotFoundBottomSheet");
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            fragmentTransactionBeginTransaction.add(C17555fJr.Companion.EZpvd(), "PasskeyNotFoundBottomSheet");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (java.lang.Exception e) {
            this.copydefault = false;
            pUU.copydefault("CreatePasskeyWalletContainer", "handleNoValidPasskey e = " + e.getMessage());
        }
    }

    public static final void AEQbTJ(C17545fJh c17545fJh, PasskeyRegisterState passkeyRegisterState) {
        pUU.copydefault("CreatePasskeyWalletContainer", "registerState result = " + passkeyRegisterState);
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Success.KWHzl)) {
            c17545fJh.copydefault = false;
            C17662fNq.KWHzl.OLrzqt(PasskeyFromSource.CREATE_NEW_PASSKEY);
            c17545fJh.OLrzqt().AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.RegisteredAlready.KWHzl)) {
            c17545fJh.djBIcL();
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.ReachMaximum.copydefault)) {
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(WalletCreationError.ReachMaximum.OLrzqt));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Cancel.KWHzl)) {
            c17545fJh.copydefault(CeDeFiWalletResult.Cancelled.KWHzl);
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.IsChinaIp.AEQbTJ)) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gCiISl), 0, 1, (java.lang.Object) null);
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.GeneralFailure(new java.lang.Throwable(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gCiISl)))));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.AccountFrozen.AEQbTJ)) {
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(WalletCreationError.AccountFrozen.AEQbTJ));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Failure.KWHzl)) {
            C17661fNp c17661fNp = C17661fNp.OLrzqt;
            C55326xho.toastWithFailedIcon$default(C17661fNp.handleNetworkCommonErrorMessage$default(c17661fNp, null, 1, null), 0, 1, (java.lang.Object) null);
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.PasskeyNetworkFailure(new java.lang.Throwable(C17661fNp.handleNetworkCommonErrorMessage$default(c17661fNp, null, 1, null)))));
        } else {
            if (passkeyRegisterState instanceof PasskeyRegisterState.SdkError) {
                PasskeyRegisterState.SdkError sdkError = (PasskeyRegisterState.SdkError) passkeyRegisterState;
                java.lang.String strCopydefault = C17661fNp.OLrzqt.copydefault(sdkError.copydefault(), sdkError.EZpvd());
                if (strCopydefault != null) {
                    C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
                }
                c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.PasskeySdkError(new java.lang.Throwable(sdkError.copydefault()))));
                return;
            }
            if (!Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.DeviceNotCompatible.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs), 0, 1, (java.lang.Object) null);
            c17545fJh.copydefault(new CeDeFiWalletResult.Failed(new WalletCreationError.PasskeySdkError(new java.lang.Throwable("PasskeyRegisterState.DeviceNotCompatible"))));
        }
    }

    public final C17560fJw OLrzqt() {
        return (C17560fJw) this.valueOf.getValue();
    }

    public static final C17560fJw OLrzqt(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C17560fJw(new C17554fJq(C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).DTwDnp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fJL AhwBna() {
        return (fJL) this.AEQbTJ.getValue();
    }

    public static final fJL EZpvd(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new fJL(new fJK(C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).DTwDnp()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CreatePasskeyWalletContainerFragment$onCreate$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CreatePasskeyWalletContainerFragment$onCreate$2(this, null), 3, null);
        pUU.copydefault("CreatePasskeyWalletContainer", "ceDeFiWalletPasskeyFromSource = " + C17662fNq.KWHzl.AEQbTJ());
        OLrzqt().AEQbTJ();
        getChildFragmentManager().setFragmentResultListener("request_key_passkey_not_found", this, new FragmentResultListener() { // from class: o.fJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C17545fJh.OLrzqt(this.AEQbTJ, str, bundle2);
            }
        });
    }

    public static final void OLrzqt(C17545fJh c17545fJh, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        int i = bundle.getInt("result_key_passkey_not_found");
        pUU.copydefault("CreatePasskeyWalletContainer", "PasskeyNotFoundBottomSheet result passkeyOperationType = " + i);
        int i2 = TaskDescription.AEQbTJ[PasskeyOperationType.Companion.copydefault(i).ordinal()];
        if (i2 == 1) {
            c17545fJh.copydefault = true;
            c17545fJh.KWHzl.launch(new PasskeyRegisterScenarioRequest(new PasskeyScenario.CedefiWallet("dex_create", false, 2, null), null, 2, null));
        } else if (i2 == 2) {
            c17545fJh.copydefault = true;
            c17545fJh.djBIcL();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c17545fJh.copydefault(CeDeFiWalletResult.Ignored.EZpvd);
        }
    }

    public final void djBIcL() {
        this.EZpvd.launch(new PasskeyLinkScenarioRequest(new PasskeyScenario.CedefiWallet("dex_create", false, 2, null), true));
    }

    public final void copydefault(CeDeFiWalletResult ceDeFiWalletResult) {
        this.copydefault = false;
        FragmentKt.setFragmentResult(this, "create_passkey_wallet_request_key", BundleKt.bundleOf(C56390yDp.OLrzqt("create_passkey_wallet_result_key", ceDeFiWalletResult)));
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = false;
    }

    public static final ViewModelProvider.Factory KWHzl() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C17560fJw.class), new Function1() { // from class: o.fJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17545fJh.OLrzqt((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final ViewModelProvider.Factory copydefault() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fJL.class), new Function1() { // from class: o.fJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17545fJh.EZpvd((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
