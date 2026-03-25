package o;

import com.okinc.buysell.ui.transaction.convert.LimitTransactionEventStatus;
import com.okinc.buysell.ui.transaction.convert.view.LiteLimitTransactionData;
import com.okinc.buysell.ui.transaction.convert.view.LiteStatusBadge;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lTS extends AbstractC59533zio<LiteLimitTransactionData, lTP> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public lTP onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C31351lsQ.ActionBar.QSBOWP, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new lTP(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull lTP ltp, @NotNull LiteLimitTransactionData liteLimitTransactionData) {
        Intrinsics.checkNotNullParameter(ltp, "");
        Intrinsics.checkNotNullParameter(liteLimitTransactionData, "");
        ltp.OLrzqt().setText(liteLimitTransactionData.getTitle());
        ltp.EZpvd().setText(liteLimitTransactionData.getBody());
        ltp.AEQbTJ().setText(AEQbTJ(liteLimitTransactionData.getStatus()));
        ltp.KWHzl().setText(liteLimitTransactionData.getHint());
        android.widget.TextView textViewKWHzl = ltp.KWHzl();
        java.lang.String hint = liteLimitTransactionData.getHint();
        textViewKWHzl.setVisibility((hint == null || hint.length() == 0) ? 8 : 0);
        android.widget.TextView textViewEZpvd = ltp.EZpvd();
        java.lang.String body = liteLimitTransactionData.getBody();
        textViewEZpvd.setVisibility((body == null || body.length() == 0) ? 8 : 0);
        LiteStatusBadge liteStatusBadgeAEQbTJ = ltp.AEQbTJ();
        java.lang.String status = liteLimitTransactionData.getStatus();
        liteStatusBadgeAEQbTJ.setVisibility((status == null || status.length() == 0) ? 8 : 0);
        ltp.AEQbTJ().setBadgeColour(EZpvd(liteLimitTransactionData.getStatus()));
    }

    public final LiteStatusBadge.BadgeColour EZpvd(java.lang.String str) {
        int iAhwBna = C33129mqd.AhwBna(str);
        if (iAhwBna != LimitTransactionEventStatus.CANCELED.getEventStatus() && iAhwBna != LimitTransactionEventStatus.FILLED.getEventStatus()) {
            return LiteStatusBadge.BadgeColour.GREY;
        }
        return LiteStatusBadge.BadgeColour.GREEN;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        int iAhwBna = C33129mqd.AhwBna(str);
        return iAhwBna == LimitTransactionEventStatus.CANCELED.getEventStatus() ? C33070mpX.AYXKKw(C31351lsQ.Activity.QfsBiF) : iAhwBna == LimitTransactionEventStatus.FILLED.getEventStatus() ? C33070mpX.AYXKKw(C31351lsQ.Activity.AYXKKw) : "";
    }
}
