package o;

import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletRegularCellBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.jvm.internal.Intrinsics;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15271eCd extends AbstractC14584doH<eBX.FragmentManager, C16801eql> {
    public C15271eCd() {
        super(DefiWalletRegularCellBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16801eql c16801eql, @NotNull eBX.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(c16801eql, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        OKRegularCell oKRegularCell = c16801eql.copydefault;
        oKRegularCell.setIcon(fragmentManager.AEQbTJ());
        oKRegularCell.setTitle(fragmentManager.copydefault());
        c16801eql.EZpvd.setText(fragmentManager.KWHzl());
    }
}
