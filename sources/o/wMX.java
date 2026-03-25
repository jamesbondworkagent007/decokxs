package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wMX extends AbstractC59533zio<TacticsData, Application> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSL uslOLrzqt = uSL.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(uslOLrzqt, "");
        ConstraintLayout root = uslOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        wMZ.copydefault((android.view.ViewGroup) root);
        ConstraintLayout root2 = uslOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        C55420xjc.copydefault(root2, wMZ.KWHzl());
        android.view.ViewParent parent = uslOLrzqt.getRoot().getParent();
        android.view.View root3 = parent instanceof C5495Ty ? (C5495Ty) parent : null;
        if (root3 == null) {
            root3 = uslOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
        }
        ConstraintLayout root4 = uslOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        return new Application(root3, root4);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C55420xjc.copydefault(application.copydefault(), wMZ.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C55420xjc.copydefault(application.copydefault());
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view, @NotNull android.view.View view2) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(view2, "");
            this.copydefault = view2;
        }
    }
}
