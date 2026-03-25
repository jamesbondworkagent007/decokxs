package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOE extends AbstractC59533zio<Application, ActionBar> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(application, "");
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uMJ umjKWHzl = uMJ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(umjKWHzl, "");
        return new ActionBar(this, umjKWHzl);
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final uMJ EZpvd;
        public final /* synthetic */ wOE OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull wOE woe, uMJ umj) {
            super(umj.getRoot());
            Intrinsics.checkNotNullParameter(umj, "");
            this.OLrzqt = woe;
            this.EZpvd = umj;
        }
    }

    public static final class Application {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }
}
