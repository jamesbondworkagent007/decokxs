package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37844pCu;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pCR extends AbstractC59533zio<ActivityC37844pCu.TaskDescription, Activity> {
    public final Function1<ActivityC37844pCu.TaskDescription, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.pCu$TaskDescription, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public pCR(@NotNull Function1<? super ActivityC37844pCu.TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ pCR AEQbTJ;
        public final OKRegularCell KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKRegularCell EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull pCR pcr, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = pcr;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.UNDaji);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (OKRegularCell) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QSBOWP, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull final ActivityC37844pCu.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        activity.EZpvd().setTitle(taskDescription.KWHzl());
        activity.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.pCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pCR.copydefault(this.OLrzqt, taskDescription, view);
            }
        });
    }

    public static final void copydefault(pCR pcr, ActivityC37844pCu.TaskDescription taskDescription, android.view.View view) {
        pcr.KWHzl.invoke(taskDescription);
    }
}
