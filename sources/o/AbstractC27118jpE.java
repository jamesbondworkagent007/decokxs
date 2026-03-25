package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27118jpE<T, VB extends ViewBinding> extends AbstractC59533zio<T, C27120jpG<VB>> {
    public final yHO<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull VB vb, @NotNull T t) {
        Intrinsics.checkNotNullParameter(vb, "");
        Intrinsics.checkNotNullParameter(t, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB extends androidx.viewbinding.ViewBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC27118jpE(@NotNull yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.gEmmrt = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public final C27120jpG<VB> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new C27120jpG<>(this.gEmmrt.invoke(layoutInflater, viewGroup, java.lang.Boolean.FALSE));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@NotNull C27120jpG<VB> c27120jpG, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(t, "");
        OLrzqt(c27120jpG, t);
    }

    public void OLrzqt(@NotNull C27120jpG<VB> c27120jpG, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(t, "");
        KWHzl(c27120jpG.KWHzl(), t);
    }
}
