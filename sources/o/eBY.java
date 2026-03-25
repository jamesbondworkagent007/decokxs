package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletEditLineBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eBY extends AbstractC14584doH<eBX.Application, C16714epD> {
    public eBY() {
        super(DefiWalletEditLineBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16714epD c16714epD, @NotNull eBX.Application application) {
        Intrinsics.checkNotNullParameter(c16714epD, "");
        Intrinsics.checkNotNullParameter(application, "");
        android.view.View view = c16714epD.KWHzl;
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), application.KWHzl()));
    }
}
