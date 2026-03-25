package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40510qYn<Vo extends InterfaceC40516qYt, T extends ViewBinding> extends AbstractC59533zio<Vo, Application<T>> {
    public abstract T AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    public abstract void AEQbTJ(@NotNull T t, int i, @NotNull Vo vo);

    /* JADX INFO: renamed from: o.qYn$Application */
    public static class Application<T extends ViewBinding> extends RecyclerView.ViewHolder {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull T t) {
            super(t.getRoot());
            Intrinsics.checkNotNullParameter(t, "");
            this.copydefault = t;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public Application<T> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Application<>(AEQbTJ(layoutInflater, viewGroup));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application<T> application, @NotNull Vo vo) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(vo, "");
        AEQbTJ(application.KWHzl(), application.getBindingAdapterPosition(), vo);
    }
}
