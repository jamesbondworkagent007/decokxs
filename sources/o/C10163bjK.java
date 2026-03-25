package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10163bjK extends AbstractC59533zio<AbstractC10168bjP.StateListAnimator, C10165bjM> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C10165bjM onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17058evd abstractC17058evdKWHzl = AbstractC17058evd.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17058evdKWHzl, "");
        return new C10165bjM(abstractC17058evdKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10165bjM c10165bjM, @NotNull AbstractC10168bjP.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c10165bjM, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        c10165bjM.EZpvd(stateListAnimator);
    }
}
