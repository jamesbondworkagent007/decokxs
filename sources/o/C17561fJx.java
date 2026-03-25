package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionInput;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C17561fJx extends androidx.fragment.app.Fragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> KWHzl;
    public InternalTransactionInput OLrzqt;

    public C17561fJx() {
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.fJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17561fJx.AEQbTJ(this.AEQbTJ, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.fJx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fJx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17561fJx KWHzl(@NotNull InternalTransactionInput internalTransactionInput) {
            Intrinsics.checkNotNullParameter(internalTransactionInput, "");
            C17561fJx c17561fJx = new C17561fJx();
            c17561fJx.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_input", internalTransactionInput)));
            return c17561fJx;
        }
    }

    public static final void AEQbTJ(C17561fJx c17561fJx, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.copydefault("SignDexTransactionFragment", "authenticatePasskey " + passkeyAuthenticateState);
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            PasskeyAuthenticateState.Success success = (PasskeyAuthenticateState.Success) passkeyAuthenticateState;
            c17561fJx.AEQbTJ(new InternalTransactionResult.Success(success.OLrzqt(), success.copydefault()));
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault) || Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
            c17561fJx.AEQbTJ(InternalTransactionResult.Cancelled.EZpvd);
            return;
        }
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
            PasskeyAuthenticateState.SdkError sdkError = (PasskeyAuthenticateState.SdkError) passkeyAuthenticateState;
            c17561fJx.AEQbTJ(new InternalTransactionResult.Failed(C17661fNp.OLrzqt.copydefault(sdkError.AEQbTJ(), sdkError.copydefault())));
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
            c17561fJx.AEQbTJ(InternalTransactionResult.Cancelled.EZpvd);
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Failure.OLrzqt)) {
            c17561fJx.AEQbTJ(new InternalTransactionResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
        } else {
            if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            c17561fJx.AEQbTJ(new InternalTransactionResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        InternalTransactionInput internalTransactionInput;
        android.os.Parcelable parcelable;
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            OLrzqt();
            return;
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("extra_input", InternalTransactionInput.class);
            } else {
                parcelable = arguments.getParcelable("extra_input");
            }
            internalTransactionInput = (InternalTransactionInput) parcelable;
        } else {
            internalTransactionInput = null;
        }
        if (internalTransactionInput == null) {
            AEQbTJ(InternalTransactionResult.Cancelled.EZpvd);
            return;
        }
        this.OLrzqt = internalTransactionInput;
        pUU.copydefault("SignDexTransactionFragment", "authenticate");
        this.KWHzl.launch(new PasskeyAuthenticateScenarioRequest(new PasskeyScenario.CedefiWallet(null, false, 3, null), true, internalTransactionInput.OLrzqt()));
    }

    public final void AEQbTJ(InternalTransactionResult internalTransactionResult) {
        FragmentKt.setFragmentResult(this, "request_key_cedefi_sign_dex_transaction", BundleKt.bundleOf(C56390yDp.OLrzqt("result_data_cedefi_sign_dex_transaction", internalTransactionResult)));
        OLrzqt();
    }

    private final void OLrzqt() {
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
