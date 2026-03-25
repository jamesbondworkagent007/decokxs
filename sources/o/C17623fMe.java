package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17623fMe extends AbstractC59533zio<C17631fMm, C17626fMh> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C17626fMh onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17000euY c17000euYEZpvd = C17000euY.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17000euYEZpvd, "");
        return new C17626fMh(c17000euYEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C17626fMh c17626fMh, @NotNull C17631fMm c17631fMm) {
        Intrinsics.checkNotNullParameter(c17626fMh, "");
        Intrinsics.checkNotNullParameter(c17631fMm, "");
        c17626fMh.OLrzqt(c17631fMm);
    }
}
