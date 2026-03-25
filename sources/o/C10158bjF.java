package o;

import com.okinc.business.defi.assets.detail.biz.BaseItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10158bjF extends AbstractC59533zio<BaseItem.Dialog, C10162bjJ> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C10162bjJ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16992euQ abstractC16992euQEZpvd = AbstractC16992euQ.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16992euQEZpvd, "");
        return new C10162bjJ(abstractC16992euQEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10162bjJ c10162bjJ, @NotNull BaseItem.Dialog dialog) {
        Intrinsics.checkNotNullParameter(c10162bjJ, "");
        Intrinsics.checkNotNullParameter(dialog, "");
        c10162bjJ.copydefault(dialog);
    }
}
