package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22352hdj extends AbstractC59533zio<C28244kUf, TaskDescription> {

    /* JADX INFO: renamed from: o.hdj$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21546hDj KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21546hDj EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C21546hDj c21546hDj) {
            super(c21546hDj.getRoot());
            Intrinsics.checkNotNullParameter(c21546hDj, "");
            this.KWHzl = c21546hDj;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21546hDj c21546hDjCopydefault = C21546hDj.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21546hDjCopydefault, "");
        return new TaskDescription(c21546hDjCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C28244kUf c28244kUf) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c28244kUf, "");
        taskDescription.EZpvd().OLrzqt.setText(c28244kUf.KWHzl());
    }
}
