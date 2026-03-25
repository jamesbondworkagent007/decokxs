package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19233fxS extends AbstractC59533zio<java.lang.String, C19295fyb> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19295fyb onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.HJWChPDXdlte, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19295fyb(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19295fyb c19295fyb, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c19295fyb, "");
        Intrinsics.checkNotNullParameter(str, "");
        c19295fyb.copydefault().setText(str);
    }
}
