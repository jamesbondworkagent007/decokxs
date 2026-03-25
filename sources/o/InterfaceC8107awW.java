package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.account.api.model.wallet.BindWalletCheckResult;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.account.api.model.wallet.UnbindWalletResult;
import com.okinc.account.api.model.wallet.WalletAccount;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8107awW extends InterfaceC43217rlC {
    ActivityResultContract<WalletAccount, UnbindWalletResult> AEQbTJ();

    ActivityResultContract<BindWalletInput, BindWalletResult> EZpvd();

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends BindWalletCheckResult>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super Result<Unit>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<BoundWalletAccountsResult>> continuation);

    java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Result<? extends BindWalletPreCheckResult>> continuation);

    boolean OLrzqt();

    ActivityResultContract<BindWalletInput, BindWalletResult> copydefault();

    /* JADX INFO: renamed from: o.awW$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        /* JADX INFO: renamed from: bindWalletPreCheck-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8562bindWalletPreCheckgIAlus$default(InterfaceC8107awW interfaceC8107awW, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindWalletPreCheck-gIAlu-s");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC8107awW.OLrzqt(z, (Continuation<? super Result<? extends BindWalletPreCheckResult>>) continuation);
        }
    }
}
