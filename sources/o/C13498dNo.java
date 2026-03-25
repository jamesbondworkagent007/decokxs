package o;

import android.os.Build;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeProcessInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.fLW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13498dNo extends AbstractC43215rlA implements InterfaceC9914bea {
    public ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> EZpvd() {
        return fLW.Application.EZpvd;
    }

    @Override // o.InterfaceC9914bea
    public void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull EscapeProcessInput escapeProcessInput, @NotNull final Function1<? super EscapeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(escapeProcessInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentManager.isStateSaved()) {
            function1.invoke(EscapeResult.Cancelled.AEQbTJ);
            pUU.copydefault("PasskeyWalletServiceImpl", "startEscapeProcessWithCallback isStateSaved");
            return;
        }
        fragmentManager.setFragmentResultListener("escape_container_request_key", lifecycleOwner, new FragmentResultListener() { // from class: o.dNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C13498dNo.isConnected(function1, str, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("EscapeContainerFragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.add(C17600fLi.Companion.KWHzl(escapeProcessInput), "EscapeContainerFragment");
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // o.InterfaceC9914bea
    public void copydefault(@NotNull android.app.Activity activity, @NotNull EscapeStatusInput escapeStatusInput) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(escapeStatusInput, "");
        fKG.Companion.AEQbTJ(activity, escapeStatusInput);
    }

    public void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull SignAndSendTransactionInput signAndSendTransactionInput, @NotNull final Function1<? super SignAndSendTransactionResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(signAndSendTransactionInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentManager.isStateSaved()) {
            pUU.copydefault("PasskeyWalletServiceImpl", "signAndSendTransaction isStateSaved");
            function1.invoke(SignAndSendTransactionResult.Cancelled.copydefault);
            return;
        }
        fragmentManager.setFragmentResultListener("request_key_cedefi_sign_and_send_transaction", lifecycleOwner, new FragmentResultListener() { // from class: o.dNt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C13498dNo.AkhnZx(function1, str, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("cedefi_sign_and_send_transaction_fragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.add(C17639fMu.Companion.EZpvd(signAndSendTransactionInput), "cedefi_sign_and_send_transaction_fragment");
        fragmentTransactionBeginTransaction.commit();
    }

    public Flow<C9767bbm> AEQbTJ() {
        java.lang.Object objCopydefault = C58113yvE.copydefault(C9678baC.Companion.AEQbTJ(), InterfaceC13418dKp.class);
        Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
        return ((InterfaceC13418dKp) objCopydefault).AEQbTJ().OLrzqt();
    }

    public static final void isConnected(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("escape_container_result_key", EscapeResult.class);
        } else {
            parcelable = bundle.getParcelable("escape_container_result_key");
        }
        EscapeResult escapeResult = (EscapeResult) parcelable;
        if (escapeResult == null) {
            return;
        }
        function1.invoke(escapeResult);
    }

    public static final void AkhnZx(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("result_data_cedefi_sign_and_send_transaction", SignAndSendTransactionResult.class);
        } else {
            parcelable = bundle.getParcelable("result_data_cedefi_sign_and_send_transaction");
        }
        android.os.Parcelable parcelable2 = (SignAndSendTransactionResult) parcelable;
        if (parcelable2 == null) {
            parcelable2 = SignAndSendTransactionResult.Cancelled.copydefault;
        }
        function1.invoke(parcelable2);
    }
}
