package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.mine.WalletSecurityActivity;
import com.okinc.business.defi.wallet.mine.binder.DefiWalletSecurityLineBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18806fpP extends AbstractC14584doH<WalletSecurityActivity.DefiWalletSecurityBean.TaskDescription, C16794eqe> {
    public C18806fpP() {
        super(DefiWalletSecurityLineBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16794eqe c16794eqe, @NotNull WalletSecurityActivity.DefiWalletSecurityBean.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c16794eqe, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        android.view.View view = c16794eqe.copydefault;
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), taskDescription.copydefault()));
    }
}
