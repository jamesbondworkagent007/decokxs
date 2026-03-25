package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC40510qYn;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40515qYs<Vo extends InterfaceC40516qYt, T extends ViewBinding> extends androidx.recyclerview.widget.ListAdapter<Vo, AbstractC40510qYn.Application<T>> {
    public abstract T AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    public abstract void copydefault(@NotNull T t, int i, @NotNull Vo vo);

    public AbstractC40515qYs() {
        super(new C40508qYl());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC40510qYn.Application<T> onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        return new AbstractC40510qYn.Application<>(AEQbTJ(layoutInflaterFrom, viewGroup));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC40510qYn.Application<T> application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        ViewBinding viewBindingKWHzl = application.KWHzl();
        T item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        copydefault(viewBindingKWHzl, i, (InterfaceC40516qYt) item);
    }

    public final java.util.List<Vo> OLrzqt() {
        java.util.List<T> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        return currentList;
    }
}
