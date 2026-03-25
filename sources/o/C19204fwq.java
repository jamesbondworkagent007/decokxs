package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19204fwq extends AbstractC59533zio<C18977fsb, C19213fwz> {
    public final Function1<C18977fsb, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsb, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19204fwq(@NotNull Function1<? super C18977fsb, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C19213fwz onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16918esw c16918eswEZpvd = C16918esw.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16918eswEZpvd, "");
        return new C19213fwz(c16918eswEZpvd, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19213fwz c19213fwz, @NotNull C18977fsb c18977fsb) {
        Intrinsics.checkNotNullParameter(c19213fwz, "");
        Intrinsics.checkNotNullParameter(c18977fsb, "");
        c19213fwz.copydefault(c18977fsb);
    }
}
