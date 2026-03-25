package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10157bjE extends AbstractC59533zio<AbstractC10168bjP.Activity, C10156bjD> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C10156bjD onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17064evj abstractC17064evjCopydefault = AbstractC17064evj.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17064evjCopydefault, "");
        return new C10156bjD(abstractC17064evjCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10156bjD c10156bjD, @NotNull AbstractC10168bjP.Activity activity) {
        Intrinsics.checkNotNullParameter(c10156bjD, "");
        Intrinsics.checkNotNullParameter(activity, "");
        c10156bjD.KWHzl(activity);
    }
}
