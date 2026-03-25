package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19181fwT extends AbstractC59533zio<C18989fsn, C19209fwv> {
    public final Function1<C18989fsn, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19181fwT(@NotNull Function1<? super C18989fsn, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C19209fwv onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16871esB c16871esBEZpvd = C16871esB.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16871esBEZpvd, "");
        return new C19209fwv(c16871esBEZpvd, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19209fwv c19209fwv, @NotNull C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c19209fwv, "");
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        c19209fwv.AEQbTJ(c18989fsn);
    }
}
