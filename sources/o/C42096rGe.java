package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C42095rGd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42096rGe extends AbstractC59533zio<C42095rGd.TaskDescription.Application, Application> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull C42095rGd.TaskDescription.Application application2) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(application2, "");
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C43826rwc c43826rwcOLrzqt = C43826rwc.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c43826rwcOLrzqt, "");
        return new Application(c43826rwcOLrzqt);
    }

    /* JADX INFO: renamed from: o.rGe$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final C43826rwc AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C43826rwc c43826rwc) {
            super(c43826rwc.getRoot());
            Intrinsics.checkNotNullParameter(c43826rwc, "");
            this.AEQbTJ = c43826rwc;
        }
    }
}
