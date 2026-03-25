package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14737drB extends AbstractC59533zio<C14738drC, C14787drz> {
    public boolean EZpvd;
    public final Function1<C14738drC, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.drC, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14737drB(@NotNull Function1<? super C14738drC, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        this.EZpvd = true;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C14787drz onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17172exl c17172exlKWHzl = C17172exl.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17172exlKWHzl, "");
        return new C14787drz(c17172exlKWHzl, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C14787drz c14787drz, @NotNull C14738drC c14738drC) {
        Intrinsics.checkNotNullParameter(c14787drz, "");
        Intrinsics.checkNotNullParameter(c14738drC, "");
        c14787drz.OLrzqt(this.EZpvd);
        c14787drz.OLrzqt(c14738drC);
    }
}
