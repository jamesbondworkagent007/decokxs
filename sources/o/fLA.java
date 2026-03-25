package o;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletItemUIData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class fLA extends AbstractC59533zio<EscapedWalletItemUIData, fLE> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public fLE onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16997euV c16997euVKWHzl = C16997euV.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16997euVKWHzl, "");
        return new fLE(c16997euVKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull fLE fle, @NotNull EscapedWalletItemUIData escapedWalletItemUIData) {
        Intrinsics.checkNotNullParameter(fle, "");
        Intrinsics.checkNotNullParameter(escapedWalletItemUIData, "");
        fle.AEQbTJ(escapedWalletItemUIData);
    }
}
