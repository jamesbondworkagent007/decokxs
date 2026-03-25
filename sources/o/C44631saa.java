package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44631saa extends AbstractC42594rYq<rZV, rYL> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public rYL KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYL rylKWHzl = rYL.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(rylKWHzl, "");
        return rylKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<rZV, rYL>.StateListAnimator<rYL> stateListAnimator, @NotNull rZV rzv) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(rzv, "");
        ((rYL) stateListAnimator.AEQbTJ()).KWHzl.setText(rzv.KWHzl());
    }
}
