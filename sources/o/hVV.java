package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hVV extends AbstractC59533zio<hUX, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        hWF hwf = new hWF(context, null, 0, 6, null);
        hwf.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new TaskDescription(hwf);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull hUX hux) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(hux, "");
        android.content.Context context = taskDescription.itemView.getContext();
        if (hux.OLrzqt() == C23274hvD.Fragment.gUEfcq) {
            taskDescription.EZpvd().setContentDescription("web3_dex_history_fromAddress_cell");
        } else {
            taskDescription.EZpvd().setContentDescription("web3_dex_history_toAddress_cell");
        }
        hWF hwfEZpvd = taskDescription.EZpvd();
        java.lang.String string = context.getString(hux.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(string, "");
        hwfEZpvd.setAddressValue(string, hux.AEQbTJ(), hux.EZpvd());
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final hWF KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final hWF EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull hWF hwf) {
            super(hwf);
            Intrinsics.checkNotNullParameter(hwf, "");
            this.KWHzl = hwf;
        }
    }
}
