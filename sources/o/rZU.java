package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZU extends AbstractC42594rYq<rZS, rYG> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public rYG KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYG rygEZpvd = rYG.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(rygEZpvd, "");
        return rygEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<rZS, rYG>.StateListAnimator<rYG> stateListAnimator, @NotNull rZS rzs) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(rzs, "");
        ((rYG) stateListAnimator.AEQbTJ()).EZpvd.setText(C33070mpX.AYXKKw(rzs.KWHzl()));
    }
}
