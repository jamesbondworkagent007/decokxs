package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22062hWm extends AbstractC59533zio<C22028hVf, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21479hAx c21479hAxOLrzqt = C21479hAx.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21479hAxOLrzqt, "");
        return new TaskDescription(c21479hAxOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C22028hVf c22028hVf) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c22028hVf, "");
        C22689hkB c22689hkB = C22689hkB.EZpvd;
        boolean z = !c22689hkB.EZpvd(c22028hVf.KWHzl().getToAmount()) && c22028hVf.EZpvd();
        taskDescription.copydefault().OLrzqt.setContentDescription("web3_dex_history_rate_cell");
        taskDescription.copydefault().OLrzqt.copydefault(z);
        taskDescription.copydefault().OLrzqt.setRadioTag(true);
        taskDescription.copydefault().OLrzqt.setRadioInfo(c22689hkB.copydefault(c22028hVf.KWHzl(), true));
        if (c22028hVf.EZpvd()) {
            taskDescription.copydefault().OLrzqt.AEQbTJ(c22028hVf.KWHzl());
        }
    }

    /* JADX INFO: renamed from: o.hWm$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21479hAx OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21479hAx copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C21479hAx c21479hAx) {
            super(c21479hAx.getRoot());
            Intrinsics.checkNotNullParameter(c21479hAx, "");
            this.OLrzqt = c21479hAx;
        }
    }
}
