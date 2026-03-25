package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationError;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17643fMy;
import o.C13754dXa;
import o.InterfaceC8196ayF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17647fNb extends androidx.fragment.app.Fragment {
    public final ActivityResultLauncher<java.lang.String> EZpvd;
    public final ActivityResultLauncher<PasskeyLinkScenarioRequest> KWHzl;
    public final ActivityResultLauncher<PasskeyRegisterScenarioRequest> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.fNb$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyOperationSourceType.values().length];
            try {
                iArr[PasskeyOperationSourceType.FROM_CREATE_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyOperationSourceType.FROM_SIGN_TRANSACTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyOperationSourceType.FROM_CEDEFI_RECOVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[PasskeyOperationType.values().length];
            try {
                iArr2[PasskeyOperationType.LINK_PASSKEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[PasskeyOperationType.REGISTER_PASSKEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[PasskeyOperationType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
        }
    }

    public C17647fNb() {
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityC17643fMy.Application(), new ActivityResultCallback() { // from class: o.fNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17647fNb.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PasskeyLinkScenarioRequest> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).EZpvd(), new ActivityResultCallback() { // from class: o.fNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17647fNb.EZpvd(this.EZpvd, (PasskeyLinkState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<PasskeyRegisterScenarioRequest> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), null, null, 3, null), new ActivityResultCallback() { // from class: o.fNe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17647fNb.AEQbTJ(this.KWHzl, (PasskeyRegisterState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult3;
    }

    /* JADX INFO: renamed from: o.fNb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fNb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17647fNb KWHzl(@NotNull PasskeyOperationInput passkeyOperationInput) {
            Intrinsics.checkNotNullParameter(passkeyOperationInput, "");
            C17647fNb c17647fNb = new C17647fNb();
            c17647fNb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("passkey_non_wallet_input_key", passkeyOperationInput)));
            return c17647fNb;
        }
    }

    public final PasskeyOperationInput OLrzqt() {
        android.os.Parcelable parcelable;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("passkey_non_wallet_input_key", PasskeyOperationInput.class);
            } else {
                parcelable = arguments.getParcelable("passkey_non_wallet_input_key");
            }
            PasskeyOperationInput passkeyOperationInput = (PasskeyOperationInput) parcelable;
            if (passkeyOperationInput != null) {
                return passkeyOperationInput;
            }
        }
        return new PasskeyOperationInput(PasskeyOperationSourceType.FROM_SIGN_TRANSACTION, PasskeyOperationSourceSubType.DIRECT, PasskeyOperationType.REGISTER_PASSKEY, true, (java.lang.String) null, 16, (DefaultConstructorMarker) null);
    }

    public static final void AEQbTJ(C17647fNb c17647fNb, java.lang.Boolean bool) {
        c17647fNb.copydefault(PasskeyOperationResult.Success.EZpvd);
    }

    public static final void EZpvd(C17647fNb c17647fNb, PasskeyLinkState passkeyLinkState) {
        pUU.copydefault("PerformNonWalletPasskeyOpt", "linkState result = " + passkeyLinkState);
        if (passkeyLinkState instanceof PasskeyLinkState.Success) {
            c17647fNb.copydefault(PasskeyOperationResult.Success.EZpvd);
            return;
        }
        if (Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.ReachMaximum.copydefault)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(PasskeyOperationError.ReachMaximum.KWHzl));
            return;
        }
        if (Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.NoValidPasskey.OLrzqt)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(PasskeyOperationError.NoValidPasskey.copydefault));
            return;
        }
        if (Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.Cancel.OLrzqt)) {
            c17647fNb.copydefault(PasskeyOperationResult.Cancelled.OLrzqt);
            return;
        }
        if (passkeyLinkState instanceof PasskeyLinkState.Failure) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.PasskeyNetworkFailure(new java.lang.Throwable(C17661fNp.OLrzqt.EZpvd(((PasskeyLinkState.Failure) passkeyLinkState).AEQbTJ())))));
            return;
        }
        if (passkeyLinkState instanceof PasskeyLinkState.SdkError) {
            PasskeyLinkState.SdkError sdkError = (PasskeyLinkState.SdkError) passkeyLinkState;
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.PasskeySdkError(new java.lang.Throwable(C17661fNp.OLrzqt.copydefault(sdkError.EZpvd(), sdkError.KWHzl())))));
        } else {
            if (!Intrinsics.EZpvd(passkeyLinkState, PasskeyLinkState.DeviceNotCompatible.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.PasskeySdkError(new java.lang.Throwable(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)))));
        }
    }

    public static final void AEQbTJ(C17647fNb c17647fNb, PasskeyRegisterState passkeyRegisterState) {
        pUU.copydefault("PerformNonWalletPasskeyOpt", "registerState result = " + passkeyRegisterState);
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Success.KWHzl)) {
            if (c17647fNb.OLrzqt().getPasskeyOperationSourceType() == PasskeyOperationSourceType.FROM_SIGN_TRANSACTION) {
                c17647fNb.EZpvd.launch(c17647fNb.OLrzqt().getChainIndex());
                return;
            } else {
                c17647fNb.copydefault(PasskeyOperationResult.Success.EZpvd);
                return;
            }
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.RegisteredAlready.KWHzl)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(PasskeyOperationError.Already.copydefault));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.ReachMaximum.copydefault)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(PasskeyOperationError.ReachMaximum.KWHzl));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Cancel.KWHzl)) {
            c17647fNb.copydefault(PasskeyOperationResult.Cancelled.OLrzqt);
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.IsChinaIp.AEQbTJ)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.GeneralFailure(new java.lang.Throwable(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gCiISl)))));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.AccountFrozen.AEQbTJ)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(PasskeyOperationError.AccountFrozen.KWHzl));
            return;
        }
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Failure.KWHzl)) {
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.PasskeyNetworkFailure(new java.lang.Throwable(C17661fNp.handleNetworkCommonErrorMessage$default(C17661fNp.OLrzqt, null, 1, null)))));
            return;
        }
        if (passkeyRegisterState instanceof PasskeyRegisterState.SdkError) {
            PasskeyRegisterState.SdkError sdkError = (PasskeyRegisterState.SdkError) passkeyRegisterState;
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.PasskeySdkError(new java.lang.Throwable(C17661fNp.OLrzqt.copydefault(sdkError.copydefault(), sdkError.EZpvd())))));
        } else {
            if (!Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.DeviceNotCompatible.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            c17647fNb.copydefault(new PasskeyOperationResult.Failed(new PasskeyOperationError.PasskeySdkError(new java.lang.Throwable(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)))));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        int i = StateListAnimator.copydefault[OLrzqt().getPasskeyOperationSourceType().ordinal()];
        if (i == 1) {
            str = "dex_create";
        } else if (i == 2) {
            str = "dex_trade";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "dex_recovery";
        }
        boolean z = OLrzqt().getPasskeyOperationSourceType() == PasskeyOperationSourceType.FROM_CEDEFI_RECOVER;
        int i2 = StateListAnimator.AEQbTJ[OLrzqt().getPasskeyOperationType().ordinal()];
        if (i2 == 1) {
            this.KWHzl.launch(new PasskeyLinkScenarioRequest(new PasskeyScenario.CedefiWallet(str, false, 2, null), OLrzqt().getEnableExternal()));
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.copydefault.launch(new PasskeyRegisterScenarioRequest(new PasskeyScenario.CedefiWallet(str, z), null, 2, null));
        }
    }

    public final void copydefault(PasskeyOperationResult passkeyOperationResult) {
        FragmentKt.setFragmentResult(this, "passkey_non_wallet_request_key", BundleKt.bundleOf(C56390yDp.OLrzqt("passkey_non_wallet_result_key", passkeyOperationResult)));
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
