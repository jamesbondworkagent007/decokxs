package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oRf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36153oRf extends AbstractC59533zio<MarketEventsVo.TaskDescription, TaskDescription> {

    /* JADX INFO: renamed from: o.oRf$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ C36153oRf EZpvd;
        public final C36042oNc KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36042oNc AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36153oRf c36153oRf, C36042oNc c36042oNc) {
            super(c36042oNc.getRoot());
            Intrinsics.checkNotNullParameter(c36042oNc, "");
            this.EZpvd = c36153oRf;
            this.KWHzl = c36042oNc;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36042oNc c36042oNcOLrzqt = C36042oNc.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36042oNcOLrzqt, "");
        return new TaskDescription(this, c36042oNcOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull MarketEventsVo.TaskDescription taskDescription2) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(taskDescription2, "");
        taskDescription.AEQbTJ().KWHzl.setText(oQQ.KWHzl(taskDescription2.OLrzqt()));
    }
}
