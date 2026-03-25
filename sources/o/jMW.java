package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jMW extends AbstractC59533zio<PnlDetailVo.PnlListItem, Application> {
    public final PnlDetailPageType AEQbTJ;

    public static final class Application extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    public jMW(@NotNull PnlDetailPageType pnlDetailPageType) {
        Intrinsics.checkNotNullParameter(pnlDetailPageType, "");
        this.AEQbTJ = pnlDetailPageType;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new Application(new C55021xcA(context, null, 0, 0, 14, null));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull PnlDetailVo.PnlListItem pnlListItem) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(pnlListItem, "");
        OLrzqt(application, pnlListItem);
    }

    public final void OLrzqt(Application application, PnlDetailVo.PnlListItem pnlListItem) {
        android.view.View view = application.itemView;
        Intrinsics.copydefault(view, "");
        C55021xcA c55021xcA = (C55021xcA) view;
        c55021xcA.setCryptoStyle(1);
        C33054mpH.AEQbTJ(c55021xcA.gEmmrt(), pnlListItem.getCoinUrl(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        C55021xcA.setCryptoText$default(c55021xcA, pnlListItem.getName(), null, 2, null);
        if (this.AEQbTJ == PnlDetailPageType.ALL_TIME) {
            c55021xcA.setCryptoCellStyle(1);
            C41426qqb.setText$default(c55021xcA.AYXKKw(), pnlListItem.getPnlColor(), (java.lang.CharSequence) pnlListItem.getPnl(), 0, 0, 0, false, 60, (java.lang.Object) null);
            return;
        }
        c55021xcA.setCryptoCellStyle(0);
        c55021xcA.AYXKKw().setText(pnlListItem.getBalance());
        c55021xcA.values().setText(pnlListItem.getPositionMarketValue());
        C41426qqb.setText$default((android.widget.TextView) c55021xcA.AEQbTJ(), pnlListItem.getPnlColor(), (java.lang.CharSequence) pnlListItem.getPnl(), 0, 0, 0, false, 60, (java.lang.Object) null);
        C41426qqb.setText$default(c55021xcA.EZpvd(), pnlListItem.getPnlRateColor(), (java.lang.CharSequence) pnlListItem.getPnlRate(), 0, 0, 0, false, 60, (java.lang.Object) null);
    }
}
