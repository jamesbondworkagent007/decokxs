package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZZ extends AbstractC59533zio<SelectCoinData, TaskDescription> {
    public final Function1<SelectCoinData, Unit> AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.SelectCoinData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public vZZ(@NotNull java.lang.String str, @NotNull Function1<? super SelectCoinData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = str;
        this.AEQbTJ = function1;
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public android.widget.ImageView AEQbTJ;
        public AppCompatTextView OLrzqt;
        public android.widget.ImageView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppCompatTextView EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.UimiPOhkCVbT);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.allOf);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (AppCompatTextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.setContentView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QjzqRB, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final TaskDescription taskDescription, @NotNull final SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        Glide.AEQbTJ(taskDescription.itemView.getContext()).EZpvd(selectCoinData.getIcon()).EZpvd(taskDescription.copydefault());
        taskDescription.EZpvd().setText(selectCoinData.getName());
        taskDescription.KWHzl().setVisibility(selectCoinData.isSelected() ? 0 : 8);
        taskDescription.KWHzl().setImageResource(C49511upt.TaskDescription.copydefault);
        taskDescription.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.vZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vZZ.EZpvd(this.AEQbTJ, selectCoinData, taskDescription, view);
            }
        });
    }

    public static final void EZpvd(vZZ vzz, SelectCoinData selectCoinData, TaskDescription taskDescription, android.view.View view) {
        FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKTRADECORE_SINGLE_COIN.getSource(), vzz.copydefault, C33129mqd.gEmmrt(selectCoinData.getPrimary()), C33129mqd.gEmmrt(selectCoinData.getSecondary()), C33129mqd.gEmmrt(java.lang.Double.valueOf(selectCoinData.getPrimarySimilarity())), C33129mqd.gEmmrt(java.lang.Double.valueOf(selectCoinData.getSecondarySimilarity())), java.lang.String.valueOf(taskDescription.getAbsoluteAdapterPosition() + 1));
        vzz.AEQbTJ.invoke(selectCoinData);
    }
}
