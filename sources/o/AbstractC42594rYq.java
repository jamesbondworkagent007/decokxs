package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC42594rYq<T, B extends ViewBinding> extends AbstractC59533zio<T, AbstractC42594rYq<T, B>.StateListAnimator<B>> {
    public abstract B KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC42594rYq<T, B>.StateListAnimator<B> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new StateListAnimator<>(this, KWHzl(layoutInflater, viewGroup));
    }

    /* JADX INFO: renamed from: o.rYq$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator<B extends ViewBinding> extends RecyclerView.ViewHolder {
        public final /* synthetic */ AbstractC42594rYq<T, B> AEQbTJ;
        public final B copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC42594rYq abstractC42594rYq, B b) {
            super(b.getRoot());
            Intrinsics.checkNotNullParameter(b, "");
            this.AEQbTJ = abstractC42594rYq;
            this.copydefault = b;
        }
    }
}
