package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31189lpN<T, VB extends ViewBinding> extends AbstractC59533zio<T, AbstractC31189lpN<T, VB>.Activity> {
    public abstract VB KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull VB vb, @NotNull T t) {
        Intrinsics.checkNotNullParameter(vb, "");
        Intrinsics.checkNotNullParameter(t, "");
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public AbstractC31189lpN<T, VB>.Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Activity(this, KWHzl(layoutInflater, viewGroup));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC31189lpN<T, VB>.Activity activity, @NotNull T t) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(t, "");
        KWHzl(activity.KWHzl(), t);
    }

    /* JADX INFO: renamed from: o.lpN$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ AbstractC31189lpN<T, VB> KWHzl;
        public final VB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VB KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractC31189lpN abstractC31189lpN, VB vb) {
            super(vb.getRoot());
            Intrinsics.checkNotNullParameter(vb, "");
            this.KWHzl = abstractC31189lpN;
            this.copydefault = vb;
        }
    }
}
