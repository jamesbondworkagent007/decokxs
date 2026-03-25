package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public interface xWF {
    WalletBtcAddressBean AEQbTJ();

    java.lang.String AEQbTJ(boolean z);

    InterfaceC9731bbC EZpvd();

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0);

    boolean KWHzl();

    AbstractC58185ywX<java.lang.Boolean> OLrzqt(@NotNull android.app.Activity activity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str);

    boolean OLrzqt();

    AbstractC58185ywX<WalletDappInteractionBizService.FeeInfo> copydefault();

    AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager);

    AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z);

    void copydefault(@NotNull WalletBtcAddressBean walletBtcAddressBean);
}
