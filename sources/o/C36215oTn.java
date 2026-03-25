package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oSJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36215oTn extends AbstractC59533zio<oSJ.Application, Application> {

    /* JADX INFO: renamed from: o.oTn$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final C36049oNj EZpvd;
        public final /* synthetic */ C36215oTn KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36049oNj EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36215oTn c36215oTn, C36049oNj c36049oNj) {
            super(c36049oNj.getRoot());
            Intrinsics.checkNotNullParameter(c36049oNj, "");
            this.KWHzl = c36215oTn;
            this.EZpvd = c36049oNj;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36049oNj c36049oNjCopydefault = C36049oNj.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36049oNjCopydefault, "");
        return new Application(this, c36049oNjCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull oSJ.Application application2) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(application2, "");
        C36049oNj c36049oNjEZpvd = application.EZpvd();
        AppCompatTextView root = c36049oNjEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(application2.AEQbTJ() ^ true ? 4 : 0);
        c36049oNjEZpvd.copydefault.setText(application2.EZpvd());
    }
}
