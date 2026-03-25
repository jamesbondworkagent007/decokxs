package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.travel_rule.ExchangeReminderTitleBean;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rSK extends AbstractC59533zio<ExchangeReminderTitleBean, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.dvKsVJ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull ExchangeReminderTitleBean exchangeReminderTitleBean) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(exchangeReminderTitleBean, "");
        taskDescription.OLrzqt().setText(exchangeReminderTitleBean.getName());
        taskDescription.AEQbTJ().setVisibility(exchangeReminderTitleBean.getShowDivider() ? 0 : 8);
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.view.View AEQbTJ;
        public final android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C43662rtX.ActionBar.QWpYiD);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C43662rtX.ActionBar.DGOPHZDGOPHZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = viewFindViewById2;
        }
    }
}
