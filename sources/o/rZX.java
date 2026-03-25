package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZX extends AbstractC42594rYq<rZP, rYE> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public rYE KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYE ryeEZpvd = rYE.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ryeEZpvd, "");
        return ryeEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<rZP, rYE>.StateListAnimator<rYE> stateListAnimator, @NotNull rZP rzp) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(rzp, "");
        android.view.View view = ((rYE) stateListAnimator.AEQbTJ()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        C55296xhK.margin$default(view, null, java.lang.Float.valueOf(rzp.EZpvd()), null, java.lang.Float.valueOf(rzp.OLrzqt()), 5, null);
    }
}
