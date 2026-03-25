package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWG extends InterfaceC43217rlC {
    AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z);

    AbstractC58260yxt<java.lang.Boolean> KWHzl(@NotNull DappSignArgs dappSignArgs);
}
