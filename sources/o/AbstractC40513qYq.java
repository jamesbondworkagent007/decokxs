package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40513qYq<Vo extends InterfaceC40516qYt, T extends android.view.View> extends androidx.recyclerview.widget.ListAdapter<Vo, StateListAnimator<T>> {
    public abstract void OLrzqt(@NotNull T t, int i, @NotNull Vo vo);

    public abstract T copydefault(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup);

    public AbstractC40513qYq() {
        super(new C40508qYl());
    }

    /* JADX INFO: renamed from: o.qYq$StateListAnimator */
    public static final class StateListAnimator<T extends android.view.View> extends RecyclerView.ViewHolder {
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull T t) {
            super(t);
            Intrinsics.checkNotNullParameter(t, "");
            this.OLrzqt = t;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator<T> onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new StateListAnimator<>(copydefault(context, viewGroup));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator<T> stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        android.view.View viewEZpvd = stateListAnimator.EZpvd();
        T item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        OLrzqt(viewEZpvd, i, (InterfaceC40516qYt) item);
    }
}
