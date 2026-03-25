package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class mUT<T, VB extends ViewBinding> extends AbstractC59533zio<T, mUU<VB>> {
    public final yHO<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB extends androidx.viewbinding.ViewBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    public mUT(@NotNull yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.EZpvd = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public final mUU<VB> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new mUU<>(this.EZpvd.invoke(layoutInflater, viewGroup, java.lang.Boolean.FALSE));
    }
}
