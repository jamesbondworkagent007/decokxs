package o;

import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletEditTitleBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15269eCb extends AbstractC14584doH<eBX.Dialog, C16715epE> {
    public C15269eCb() {
        super(DefiWalletEditTitleBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    public void OLrzqt(@NotNull C16715epE c16715epE, @NotNull eBX.Dialog dialog) {
        Intrinsics.checkNotNullParameter(c16715epE, "");
        Intrinsics.checkNotNullParameter(dialog, "");
        c16715epE.copydefault.setText(dialog.copydefault());
    }
}
