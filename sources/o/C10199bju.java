package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10199bju extends AbstractC59533zio<AbstractC10168bjP.TaskDescription, C10202bjx> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C10202bjx onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17055eva abstractC17055evaOLrzqt = AbstractC17055eva.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17055evaOLrzqt, "");
        return new C10202bjx(abstractC17055evaOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10202bjx c10202bjx, @NotNull AbstractC10168bjP.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c10202bjx, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c10202bjx.KWHzl(taskDescription);
    }
}
