package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19249fxi extends AbstractC59533zio<C18998fsw, C19248fxh> {
    public final Function0<Unit> AEQbTJ;

    public C19249fxi(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19248fxh onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17116ewi c17116ewiOLrzqt = C17116ewi.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17116ewiOLrzqt, "");
        return new C19248fxh(c17116ewiOLrzqt, this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19248fxh c19248fxh, @NotNull C18998fsw c18998fsw) {
        Intrinsics.checkNotNullParameter(c19248fxh, "");
        Intrinsics.checkNotNullParameter(c18998fsw, "");
        c19248fxh.copydefault(c18998fsw);
    }
}
