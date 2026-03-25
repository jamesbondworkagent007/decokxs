package o;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17613fLv extends AbstractC59533zio<EscapeSignAddressData, C17614fLw> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C17614fLw onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16993euR c16993euREZpvd = C16993euR.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16993euREZpvd, "");
        return new C17614fLw(c16993euREZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C17614fLw c17614fLw, @NotNull EscapeSignAddressData escapeSignAddressData) {
        Intrinsics.checkNotNullParameter(c17614fLw, "");
        Intrinsics.checkNotNullParameter(escapeSignAddressData, "");
        c17614fLw.AEQbTJ(escapeSignAddressData);
    }
}
