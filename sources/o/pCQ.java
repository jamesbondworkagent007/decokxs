package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pCQ extends AbstractC59533zio<java.lang.String, Application> {

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.getVolumeControl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.hBpjJd, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        application.AEQbTJ().setText(str);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.itemView.clearAnimation();
    }
}
