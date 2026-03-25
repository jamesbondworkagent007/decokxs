package o;

import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38571pbu extends AbstractC59533zio<C38569pbs, C38572pbv> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C38572pbv onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DCJXGO, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C38572pbv(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C38572pbv c38572pbv, @NotNull C38569pbs c38569pbs) {
        Intrinsics.checkNotNullParameter(c38572pbv, "");
        Intrinsics.checkNotNullParameter(c38569pbs, "");
        c38572pbv.AEQbTJ().setText(c38569pbs.OLrzqt());
        c38572pbv.OLrzqt().setText(c38569pbs.copydefault());
    }
}
