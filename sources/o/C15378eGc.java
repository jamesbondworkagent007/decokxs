package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eGc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C15378eGc extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: o.eGc$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public TaskDescription(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new TaskDescription(layoutInflater.inflate(C13754dXa.TaskDescription.HJWChPiaHEvk, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((android.widget.TextView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1)).setText(str);
    }
}
