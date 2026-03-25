package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C6046aHu;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6046aHu extends AbstractC6042aHq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public final ActivityResultLauncher<android.app.PendingIntent> AYXKKw;
    public C5668aAn AhwBna;
    public java.lang.String djBIcL;
    public final int fetchVPNInfo;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6046aHu() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.hUfVAv int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:33) call: o.aHu.<init>(int):void type: THIS */
    public /* synthetic */ C6046aHu(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.hUfVAv : i);
    }

    public C6046aHu(int i) {
        this.fetchVPNInfo = i;
        this.djBIcL = "SecurityAuthenticateOkxPayPasskeyServiceFragment";
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SecurityAuthenticateOkxPayPasskeyServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6046aHu.KWHzl(this.OLrzqt);
            }
        });
        ActivityResultLauncher<android.app.PendingIntent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).AEQbTJ(), new ActivityResultCallback() { // from class: o.aHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6046aHu.EZpvd(this.KWHzl, (PasskeySdkResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.aHu$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aHu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C6046aHu KWHzl(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
            Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
            C6046aHu c6046aHu = new C6046aHu(0, 1, null);
            c6046aHu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_AUTHENTICATE_REQUEST", passkeyAuthenticateRequest)));
            return c6046aHu;
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super PasskeyState, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(function1, "");
            fragmentManager.setFragmentResultListener("KEY_AUTHENTICATE_RESPONSE", lifecycleOwner, new FragmentResultListener() { // from class: o.aHB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C6046aHu.StateListAnimator.AEQbTJ(function1, str, bundle);
                }
            });
        }

        public static final void AEQbTJ(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            android.os.Parcelable authenticateError = (PasskeyState) bundle.getParcelable("KEY_PASSKEY_STATE");
            if (authenticateError == null) {
                authenticateError = new PasskeyState.AuthenticateError("null response");
            }
            function1.invoke(authenticateError);
        }
    }

    public final SecurityAuthenticateOkxPayPasskeyServiceViewModel AhwBna() {
        return (SecurityAuthenticateOkxPayPasskeyServiceViewModel) this.values.getValue();
    }

    /* JADX DEBUG: Possible override for method o.aHq.AEQbTJ()V */
    public final PasskeyAuthenticateRequest AEQbTJ() {
        return (PasskeyAuthenticateRequest) this.valueOf.getValue();
    }

    public static final PasskeyAuthenticateRequest KWHzl(C6046aHu c6046aHu) {
        return (PasskeyAuthenticateRequest) c6046aHu.requireArguments().getParcelable("KEY_AUTHENTICATE_REQUEST");
    }

    public final C5668aAn gEmmrt() {
        C5668aAn c5668aAn = this.AhwBna;
        Intrinsics.copydefault(c5668aAn);
        return c5668aAn;
    }

    public static final void EZpvd(C6046aHu c6046aHu, PasskeySdkResult passkeySdkResult) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", c6046aHu.getTAG() + " fido2 launcher: " + passkeySdkResult.EZpvd());
        c6046aHu.releaseLoading();
        SecurityAuthenticateOkxPayPasskeyServiceViewModel securityAuthenticateOkxPayPasskeyServiceViewModelAhwBna = c6046aHu.AhwBna();
        Intrinsics.copydefault(passkeySdkResult);
        securityAuthenticateOkxPayPasskeyServiceViewModelAhwBna.AEQbTJ(passkeySdkResult);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AhwBna = C5668aAn.OLrzqt(layoutInflater);
        ConstraintLayout root = gEmmrt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    @Override // o.AbstractC32996moC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        PasskeyAuthenticateRequest passkeyAuthenticateRequestAEQbTJ = AEQbTJ();
        if (passkeyAuthenticateRequestAEQbTJ != null) {
            Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(AhwBna().copydefault(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1(this, null));
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
            if (AhwBna().OLrzqt(passkeyAuthenticateRequestAEQbTJ) == null) {
                AEQbTJ(new PasskeyState.AuthenticateError("Request is null"));
                Unit unit = Unit.INSTANCE;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.addCallback(this, new TaskDescription());
        }
        C6690aUB.KWHzl(AhwBna().EZpvd(), this, new SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4(this, null));
    }

    /* JADX INFO: renamed from: o.aHu$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        public TaskDescription() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C6046aHu.this.AEQbTJ(PasskeyState.Cancel.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }

    public final void AEQbTJ(PasskeyState passkeyState) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " finish with: " + passkeyState.log());
        FragmentKt.setFragmentResult(this, "KEY_AUTHENTICATE_RESPONSE", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_PASSKEY_STATE", passkeyState)));
    }
}
