package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19182fwU extends AbstractC59533zio<C18987fsl, C19162fwA> {
    public final Function1<C18987fsl, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsl, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19182fwU(@NotNull Function1<? super C18987fsl, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C19162fwA onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16875esF c16875esFCopydefault = C16875esF.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16875esFCopydefault, "");
        return new C19162fwA(c16875esFCopydefault, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19162fwA c19162fwA, @NotNull C18987fsl c18987fsl) {
        Intrinsics.checkNotNullParameter(c19162fwA, "");
        Intrinsics.checkNotNullParameter(c18987fsl, "");
        c19162fwA.copydefault(c18987fsl);
    }
}
