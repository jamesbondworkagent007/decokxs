package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39479ptC extends AbstractC59533zio<oLR, Activity> {

    /* JADX INFO: renamed from: o.ptC$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C39479ptC OLrzqt;
        public final C36044oNe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36044oNe AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C39479ptC c39479ptC, C36044oNe c36044oNe) {
            super(c36044oNe.getRoot());
            Intrinsics.checkNotNullParameter(c36044oNe, "");
            this.OLrzqt = c39479ptC;
            this.copydefault = c36044oNe;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36044oNe c36044oNeOLrzqt = C36044oNe.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36044oNeOLrzqt, "");
        return new Activity(this, c36044oNeOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull oLR olr) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(olr, "");
        activity.AEQbTJ().EZpvd.setText(olr.KWHzl());
    }
}
