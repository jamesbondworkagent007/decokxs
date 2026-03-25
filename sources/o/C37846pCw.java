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

/* JADX INFO: renamed from: o.pCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37846pCw extends AbstractC59533zio<ActivityC37844pCu.Application, TaskDescription> {
    public final Function1<ActivityC37844pCu.Application, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.pCu$Application, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37846pCw(@NotNull Function1<? super ActivityC37844pCu.Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.pCw$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final OKRegularCell EZpvd;
        public final /* synthetic */ C37846pCw KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKRegularCell EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37846pCw c37846pCw, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = c37846pCw;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.UNDaji);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (OKRegularCell) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QSBOWP, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final ActivityC37844pCu.Application application) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(application, "");
        taskDescription.EZpvd().setTitle(application.EZpvd());
        taskDescription.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.pCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37846pCw.KWHzl(this.AEQbTJ, application, view);
            }
        });
    }

    public static final void KWHzl(C37846pCw c37846pCw, ActivityC37844pCu.Application application, android.view.View view) {
        c37846pCw.KWHzl.invoke(application);
    }
}
