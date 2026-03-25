package o;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailSetResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailStateInfo;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateEmailInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9916bec extends InterfaceC9914bea {
    Flow<C9767bbm> AEQbTJ();

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull PasskeyOperationInput passkeyOperationInput, @NotNull Function1<? super PasskeyOperationResult, Unit> function1);

    void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull SignAndSendTransactionInput signAndSendTransactionInput, @NotNull Function1<? super SignAndSendTransactionResult, Unit> function1);

    void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull UpdateInfoInput updateInfoInput, @NotNull Function1<? super UpdateInfoResult, Unit> function1);

    ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> EZpvd();

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull UpdateEmailInput updateEmailInput, @NotNull Function1<? super EmailSetResult, Unit> function1);

    java.lang.Object copydefault(@NotNull Continuation<? super Result<EmailStateInfo>> continuation);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull CeDeFiWalletInput ceDeFiWalletInput, @NotNull Function1<? super CeDeFiWalletResult, Unit> function1);
}
