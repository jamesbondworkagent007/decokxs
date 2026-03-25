package o;

import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10155bjC extends AbstractC59533zio<BaseItem.FragmentManager, C10203bjy> {
    public final TxIdOrHashHistoryDetail OLrzqt;

    public C10155bjC(TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        this.OLrzqt = txIdOrHashHistoryDetail;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C10203bjy onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16987euL abstractC16987euLEZpvd = AbstractC16987euL.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16987euLEZpvd, "");
        return new C10203bjy(abstractC16987euLEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10203bjy c10203bjy, @NotNull BaseItem.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(c10203bjy, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        c10203bjy.copydefault(fragmentManager, this.OLrzqt);
    }
}
