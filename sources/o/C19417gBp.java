package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19417gBp extends AbstractC59533zio<C19414gBm, C19423gBv> {
    public final Function1<C19414gBm, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gBm, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19417gBp(@NotNull Function1<? super C19414gBm, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C19423gBv onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16762epz c16762epzAEQbTJ = C16762epz.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16762epzAEQbTJ, "");
        return new C19423gBv(c16762epzAEQbTJ, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19423gBv c19423gBv, @NotNull C19414gBm c19414gBm) {
        Intrinsics.checkNotNullParameter(c19423gBv, "");
        Intrinsics.checkNotNullParameter(c19414gBm, "");
        c19423gBv.OLrzqt(c19414gBm);
    }
}
