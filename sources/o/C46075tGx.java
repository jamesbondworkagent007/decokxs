package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.trade.manager.common.position.PosShowItem;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46075tGx extends AbstractC59533zio<PosShowItem, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DWgRXt, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull PosShowItem posShowItem) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(posShowItem, "");
        taskDescription.OLrzqt().setText(posShowItem.getTitle());
        taskDescription.EZpvd().setText(posShowItem.getContent());
    }

    /* JADX INFO: renamed from: o.tGx$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C47501trL.TaskDescription.RuDPQV);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C47501trL.TaskDescription.DaTmkG);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById2;
        }
    }
}
