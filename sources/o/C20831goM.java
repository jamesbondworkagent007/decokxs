package o;

import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.DividerBean;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20831goM extends AbstractC59533zio<DividerBean, C20839goU> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C20839goU onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.sVvuFk, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C20839goU(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C20839goU c20839goU, @NotNull DividerBean dividerBean) {
        Intrinsics.checkNotNullParameter(c20839goU, "");
        Intrinsics.checkNotNullParameter(dividerBean, "");
        c20839goU.OLrzqt().setVisibility(dividerBean.isShowDivider() ? 0 : 8);
    }
}
