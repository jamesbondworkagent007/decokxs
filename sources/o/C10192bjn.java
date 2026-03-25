package o;

import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10192bjn extends AbstractC59533zio<BaseItem.Application, C10191bjm> {
    public final long EZpvd;
    public final TxIdOrHashHistoryDetail KWHzl;
    public final androidx.fragment.app.FragmentManager copydefault;

    public C10192bjn(@NotNull androidx.fragment.app.FragmentManager fragmentManager, long j, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.copydefault = fragmentManager;
        this.EZpvd = j;
        this.KWHzl = txIdOrHashHistoryDetail;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C10191bjm onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16988euM abstractC16988euMAEQbTJ = AbstractC16988euM.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16988euMAEQbTJ, "");
        return new C10191bjm(abstractC16988euMAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10191bjm c10191bjm, @NotNull BaseItem.Application application) {
        Intrinsics.checkNotNullParameter(c10191bjm, "");
        Intrinsics.checkNotNullParameter(application, "");
        c10191bjm.EZpvd(application, this.copydefault, this.EZpvd, this.KWHzl);
    }
}
