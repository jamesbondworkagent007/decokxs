package o;

import com.okinc.business.defi.assets.detail.biz.BaseItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10187bji extends AbstractC59533zio<BaseItem.ActionBar, C10184bjf> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C10184bjf onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16980euE abstractC16980euEAEQbTJ = AbstractC16980euE.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16980euEAEQbTJ, "");
        return new C10184bjf(abstractC16980euEAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10184bjf c10184bjf, @NotNull BaseItem.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c10184bjf, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        c10184bjf.copydefault(actionBar);
    }
}
