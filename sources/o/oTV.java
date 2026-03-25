package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTV extends AbstractC59533zio<oTB.Activity, TaskDescription> {

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ oTV EZpvd;
        public final C36053oNn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36053oNn KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull oTV otv, C36053oNn c36053oNn) {
            super(c36053oNn.getRoot());
            Intrinsics.checkNotNullParameter(c36053oNn, "");
            this.EZpvd = otv;
            this.copydefault = c36053oNn;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36053oNn c36053oNnEZpvd = C36053oNn.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36053oNnEZpvd, "");
        return new TaskDescription(this, c36053oNnEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull oTB.Activity activity) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(activity, "");
        C36053oNn c36053oNnKWHzl = taskDescription.KWHzl();
        android.view.View view = c36053oNnKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(activity.AEQbTJ() ? 0 : 8);
        AppCompatTextView appCompatTextView = c36053oNnKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C55307xhV.AEQbTJ(appCompatTextView, activity.copydefault());
    }
}
