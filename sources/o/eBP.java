package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailLineBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBP extends AbstractC14584doH<DefiWalletAccountDetailBean.StateListAnimator, C16714epD> {
    public eBP() {
        super(DefiWalletAccountDetailLineBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16714epD c16714epD, @NotNull DefiWalletAccountDetailBean.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c16714epD, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        android.view.View view = c16714epD.KWHzl;
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), stateListAnimator.OLrzqt()));
    }
}
