package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC40510qYn;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40511qYo<Vo extends InterfaceC40516qYt, T extends ViewBinding> extends androidx.recyclerview.widget.ListAdapter<Vo, Activity<T>> {
    public abstract T OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    public AbstractC40511qYo() {
        super(new C40508qYl());
    }

    /* JADX INFO: renamed from: o.qYo$Activity */
    public static final class Activity<T extends ViewBinding> extends AbstractC40510qYn.Application<T> implements LifecycleOwner {
        public final CoroutineScope AEQbTJ;
        public final LifecycleRegistry OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LifecycleRegistry EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoroutineScope OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull T t) {
            super(t);
            Intrinsics.checkNotNullParameter(t, "");
            this.OLrzqt = new LifecycleRegistry(this);
            this.AEQbTJ = CoroutineScopeKt.plus(LifecycleOwnerKt.getLifecycleScope(this), new C41783qxN());
            this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) { // from class: o.qYo.Activity.3
                public final /* synthetic */ Activity<T> AEQbTJ;

                {
                    this.AEQbTJ = this;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view) {
                    Intrinsics.checkNotNullParameter(view, "");
                    if (this.AEQbTJ.EZpvd().getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
                        this.AEQbTJ.EZpvd().setCurrentState(Lifecycle.State.STARTED);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view) {
                    Intrinsics.checkNotNullParameter(view, "");
                    if (this.AEQbTJ.EZpvd().getCurrentState().compareTo(Lifecycle.State.STARTED) >= 0) {
                        this.AEQbTJ.EZpvd().setCurrentState(Lifecycle.State.CREATED);
                    }
                }
            });
        }

        public final void AEQbTJ() {
            this.OLrzqt.setCurrentState(Lifecycle.State.CREATED);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity<T> onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        Activity<T> activity = new Activity<>(OLrzqt(layoutInflaterFrom, viewGroup));
        if (activity.EZpvd().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            activity.EZpvd().setCurrentState(Lifecycle.State.CREATED);
        }
        return activity;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl */
    public void onViewRecycled(@NotNull Activity<T> activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onViewRecycled(activity);
        activity.AEQbTJ();
    }
}
