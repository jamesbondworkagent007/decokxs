package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46903tfu extends AbstractC59533zio<C46900tfr, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42938rfp c42938rfpEZpvd = C42938rfp.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42938rfpEZpvd, "");
        return new ActionBar(c42938rfpEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull C46900tfr c46900tfr) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c46900tfr, "");
        actionBar.KWHzl().copydefault.setText(c46900tfr.OLrzqt());
        android.widget.TextView textView = actionBar.KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setPaddingRelative(0, c46900tfr.EZpvd(), 0, 0);
    }

    /* JADX INFO: renamed from: o.tfu$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C42938rfp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42938rfp KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C42938rfp c42938rfp) {
            super(c42938rfp.getRoot());
            Intrinsics.checkNotNullParameter(c42938rfp, "");
            this.OLrzqt = c42938rfp;
        }
    }
}
