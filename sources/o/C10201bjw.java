package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10201bjw extends AbstractC59533zio<AbstractC10168bjP.TaskDescription, C10200bjv> {
    public final Function2<java.lang.Long, android.view.View, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10201bjw(@NotNull Function2<? super java.lang.Long, ? super android.view.View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C10200bjv onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17057evc abstractC17057evcOLrzqt = AbstractC17057evc.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17057evcOLrzqt, "");
        return new C10200bjv(abstractC17057evcOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10200bjv c10200bjv, @NotNull AbstractC10168bjP.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c10200bjv, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c10200bjv.KWHzl(taskDescription, this.KWHzl);
    }
}
