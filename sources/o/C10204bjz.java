package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10204bjz extends AbstractC59533zio<AbstractC10168bjP.ActionBar, C10160bjH> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C10160bjH onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17065evk abstractC17065evkEZpvd = AbstractC17065evk.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17065evkEZpvd, "");
        return new C10160bjH(abstractC17065evkEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10160bjH c10160bjH, @NotNull AbstractC10168bjP.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c10160bjH, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        c10160bjH.AEQbTJ(actionBar);
    }
}
