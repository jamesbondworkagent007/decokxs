package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalEscapeTransactionResult;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionInput;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17609fLr extends androidx.fragment.app.Fragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> EZpvd;
    public InternalTransactionInput OLrzqt;

    public C17609fLr() {
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.fLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17609fLr.OLrzqt(this.KWHzl, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.fLr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17609fLr copydefault(@NotNull InternalTransactionInput internalTransactionInput) {
            Intrinsics.checkNotNullParameter(internalTransactionInput, "");
            C17609fLr c17609fLr = new C17609fLr();
            c17609fLr.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_input", internalTransactionInput)));
            return c17609fLr;
        }
    }

    public static final void OLrzqt(C17609fLr c17609fLr, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.copydefault("SignEscapeTransactionFragment", "authenticatePasskey " + passkeyAuthenticateState);
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            c17609fLr.OLrzqt(new InternalEscapeTransactionResult.Success(((PasskeyAuthenticateState.Success) passkeyAuthenticateState).OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Cancel.copydefault)) {
            c17609fLr.OLrzqt(InternalEscapeTransactionResult.Cancelled.copydefault);
            return;
        }
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.SdkError) {
            PasskeyAuthenticateState.SdkError sdkError = (PasskeyAuthenticateState.SdkError) passkeyAuthenticateState;
            c17609fLr.OLrzqt(new InternalEscapeTransactionResult.Failed(C17661fNp.OLrzqt.copydefault(sdkError.AEQbTJ(), sdkError.copydefault())));
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.AccountFrozen.KWHzl)) {
            c17609fLr.OLrzqt(InternalEscapeTransactionResult.Cancelled.copydefault);
            return;
        }
        if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.Failure.OLrzqt)) {
            c17609fLr.OLrzqt(new InternalEscapeTransactionResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
        } else if (Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.NoValidPasskey.OLrzqt)) {
            c17609fLr.OLrzqt(InternalEscapeTransactionResult.Cancelled.copydefault);
        } else {
            if (!Intrinsics.EZpvd(passkeyAuthenticateState, PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            c17609fLr.OLrzqt(new InternalEscapeTransactionResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Ohcwxs)));
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
            KWHzl();
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
            OLrzqt(InternalEscapeTransactionResult.Cancelled.copydefault);
        } else {
            this.OLrzqt = internalTransactionInput;
            copydefault();
        }
    }

    public final void copydefault() {
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncher = this.EZpvd;
        InternalTransactionInput internalTransactionInput = null;
        PasskeyScenario.CedefiWallet cedefiWallet = new PasskeyScenario.CedefiWallet(null, false, 3, null);
        InternalTransactionInput internalTransactionInput2 = this.OLrzqt;
        if (internalTransactionInput2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            internalTransactionInput = internalTransactionInput2;
        }
        activityResultLauncher.launch(new PasskeyAuthenticateScenarioRequest(cedefiWallet, true, internalTransactionInput.OLrzqt()));
    }

    public final void OLrzqt(InternalEscapeTransactionResult internalEscapeTransactionResult) {
        FragmentKt.setFragmentResult(this, "request_key_cedefi_sign_escape_transaction", BundleKt.bundleOf(C56390yDp.OLrzqt("result_data_cedefi_sign_escape_transaction", internalEscapeTransactionResult)));
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
}
