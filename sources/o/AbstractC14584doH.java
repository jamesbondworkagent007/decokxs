package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.doH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14584doH<T, VB extends ViewBinding> extends AbstractC59533zio<T, C14661dpf<VB>> {
    public final yHO<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> KWHzl;

    public abstract void OLrzqt(@NotNull VB vb, @NotNull T t);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB extends androidx.viewbinding.ViewBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC14584doH(@NotNull yHO<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.KWHzl = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C14661dpf<VB> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new C14661dpf<>(this.KWHzl.invoke(layoutInflater, viewGroup, java.lang.Boolean.FALSE));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C14661dpf<VB> c14661dpf, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c14661dpf, "");
        Intrinsics.checkNotNullParameter(t, "");
        OLrzqt(c14661dpf.KWHzl(), t);
    }
}
