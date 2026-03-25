package o;

import com.okinc.business.dexui.main.limitorder.orderdetail.itemviewbinding.LimitTxHashOrderItemViewBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hML extends AbstractC25436iwg<C21801hMv, hAD> {
    public hML() {
        super(LimitTxHashOrderItemViewBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hAD> c25435iwf, @NotNull C21801hMv c21801hMv) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c21801hMv, "");
        if (c21801hMv.OLrzqt().getLatestTransactionHash().length() > 0) {
            ((hAD) c25435iwf.EZpvd()).OLrzqt.setTxHashValue(c21801hMv.OLrzqt().getLatestTransactionHash());
            ((hAD) c25435iwf.EZpvd()).OLrzqt.copydefault(c21801hMv.OLrzqt().getExploreUrl());
        } else {
            ((hAD) c25435iwf.EZpvd()).OLrzqt.setTxHashValue("");
        }
    }
}
