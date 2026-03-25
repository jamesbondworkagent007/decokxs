package o;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.buysell.data.cedefi.BuySellDexCreateWalletResult;
import com.okinc.buysell.data.cedefi.BuySellDexEmailSetResult;
import com.okinc.buysell.data.cedefi.BuySellDexEmailState;
import com.okinc.buysell.data.cedefi.BuySellDexEscapeResult;
import com.okinc.buysell.data.cedefi.BuySellDexUpdateInfoResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC31668lzp extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super BuySellDexCreateWalletResult, Unit> function1);

    void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull InterfaceC31396ltI interfaceC31396ltI, @NotNull Function1<? super BuySellDexUpdateInfoResult, Unit> function1);

    void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super BuySellDexEscapeResult, Unit> function1);

    ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> copydefault();

    java.lang.Object copydefault(@NotNull Continuation<? super Result<BuySellDexEmailState>> continuation);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull Function1<? super BuySellDexEmailSetResult, Unit> function1);
}
