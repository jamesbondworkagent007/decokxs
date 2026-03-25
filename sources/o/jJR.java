package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jJR extends AbstractC59533zio<CoinPairVo, ActionBar> {
    public final Function1<CoinPairVo, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jJR(@NotNull Function1<? super CoinPairVo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42674raq c42674raqCopydefault = C42674raq.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42674raqCopydefault, "");
        return new ActionBar(this, c42674raqCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull CoinPairVo coinPairVo) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(coinPairVo, "");
        C42674raq c42674raqAEQbTJ = actionBar.AEQbTJ();
        c42674raqAEQbTJ.KWHzl.setText(coinPairVo.getTitle());
        android.widget.ImageView imageView = c42674raqAEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(coinPairVo.isSelected() ? 0 : 8);
        LinearLayoutCompat root = c42674raqAEQbTJ.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, coinPairVo));
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ jJR OLrzqt;
        public final C42674raq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42674raq AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull jJR jjr, C42674raq c42674raq) {
            super(c42674raq.getRoot());
            Intrinsics.checkNotNullParameter(c42674raq, "");
            this.OLrzqt = jjr;
            this.copydefault = c42674raq;
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jJR KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ CoinPairVo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jJR jjr, CoinPairVo coinPairVo) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = jjr;
            this.copydefault = coinPairVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ.invoke(this.copydefault);
            }
        }
    }
}
