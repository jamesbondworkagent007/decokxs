package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47828txV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47825txS<Vo extends InterfaceC47828txV, T extends ViewBinding> extends AbstractC59533zio<Vo, Activity<T>> {
    public abstract void AEQbTJ(@NotNull T t, int i, @NotNull Vo vo);

    public abstract T copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    /* JADX INFO: renamed from: o.txS$Activity */
    public static final class Activity<T extends ViewBinding> extends RecyclerView.ViewHolder {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull T t) {
            super(t.getRoot());
            Intrinsics.checkNotNullParameter(t, "");
            this.copydefault = t;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity<T> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Activity<>(copydefault(layoutInflater, viewGroup));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity<T> activity, @NotNull Vo vo) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(vo, "");
        AEQbTJ(activity.copydefault(), activity.getBindingAdapterPosition(), vo);
    }
}
