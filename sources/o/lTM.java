package o;

import com.okinc.buysell.ui.transaction.convert.view.LiteLimitCoinData;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lTM extends AbstractC59533zio<LiteLimitCoinData, lTR> {
    public final android.content.Context EZpvd;

    public lTM(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public lTR onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C31351lsQ.ActionBar.QHmsKR, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new lTR(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull lTR ltr, @NotNull LiteLimitCoinData liteLimitCoinData) {
        Intrinsics.checkNotNullParameter(ltr, "");
        Intrinsics.checkNotNullParameter(liteLimitCoinData, "");
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        java.lang.String string = c32979mnm.OLrzqt().getString(C31351lsQ.Activity.valueOf);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ltr.KWHzl().setText(C33069mpW.KWHzl(c32979mnm.OLrzqt(), C31351lsQ.Activity.AhwBna, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromCrypto", liteLimitCoinData.getFromCoinName()), C56390yDp.OLrzqt("toCrypto", liteLimitCoinData.getToCoinName()), C56390yDp.OLrzqt("orderType", java.lang.String.valueOf(string)))));
        C33054mpH.AEQbTJ(ltr.copydefault(), liteLimitCoinData.getFromCoinUrl());
        ltr.AEQbTJ().setText(liteLimitCoinData.getFromCoinName());
        ltr.EZpvd().setText(liteLimitCoinData.getFromCoinFullName());
        ltr.OLrzqt().setText("- " + liteLimitCoinData.getFromCoinAmount() + " " + liteLimitCoinData.getFromCoinName());
        C33054mpH.AEQbTJ(ltr.AYXKKw(), liteLimitCoinData.getToCoinUrl());
        ltr.valueOf().setText(liteLimitCoinData.getToCoinName());
        ltr.AhwBna().setText(liteLimitCoinData.getToCoinFullName());
        ltr.djBIcL().setText(liteLimitCoinData.getToCoinAmount() + " " + liteLimitCoinData.getToCoinName());
        android.widget.TextView textViewDjBIcL = ltr.djBIcL();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        textViewDjBIcL.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, this.EZpvd, 0.0f, 2, null));
        ltr.OLrzqt().setTextColor(C33512mxp.tradeFallDefault$default(c33512mxp, this.EZpvd, 0.0f, 2, null));
    }
}
