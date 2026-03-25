package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19170fwI extends AbstractC59533zio<C18952fsC, C19169fwH> {
    public final Function1<C18952fsC, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsC, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19170fwI(@NotNull Function1<? super C18952fsC, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C19169fwH onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17176exp c17176expEZpvd = C17176exp.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17176expEZpvd, "");
        return new C19169fwH(c17176expEZpvd, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19169fwH c19169fwH, @NotNull C18952fsC c18952fsC) {
        Intrinsics.checkNotNullParameter(c19169fwH, "");
        Intrinsics.checkNotNullParameter(c18952fsC, "");
        c19169fwH.OLrzqt(c18952fsC);
    }
}
