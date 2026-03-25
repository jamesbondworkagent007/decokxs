package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.UnableRedeemTip;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iSS extends RecyclerView.Adapter<iSV> {
    public final Function0<java.lang.String> AEQbTJ;
    public final java.util.List<InvestOrder> EZpvd;
    public final iSO copydefault;

    public iSS(@NotNull java.util.List<InvestOrder> list, @NotNull iSO iso, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iso, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = list;
        this.copydefault = iso;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public iSV onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23845iLl c23845iLlEZpvd = C23845iLl.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23845iLlEZpvd, "");
        return new iSV(c23845iLlEZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=4] */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull iSV isv, @android.annotation.SuppressLint({"RecyclerView"}) int i) {
        Intrinsics.checkNotNullParameter(isv, "");
        final InvestOrder investOrder = this.EZpvd.get(i);
        android.widget.TextView textView = isv.KWHzl().KWHzl;
        java.lang.String stakedAmount = investOrder.getStakedAmount();
        java.lang.String strLimitFmtNoZeroWithKMB$default = stakedAmount != null ? C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, stakedAmount, 6, 2, false, false, 24, null) : null;
        textView.setText(strLimitFmtNoZeroWithKMB$default + " " + investOrder.getTokenSymbol());
        android.widget.TextView textView2 = isv.KWHzl().AYXKKw;
        java.lang.String currencyAmount = investOrder.getCurrencyAmount();
        textView2.setText(currencyAmount != null ? C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, currencyAmount, null, null, null, 14, null) : null);
        isv.KWHzl().AhwBna.setText(investOrder.getValidatorName());
        android.widget.TextView textView3 = isv.KWHzl().EZpvd;
        UnableRedeemTip unableRedeemTip = investOrder.getUnableRedeemTip();
        textView3.setText(unableRedeemTip != null ? unableRedeemTip.getTipContent() : null);
        isv.KWHzl().AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.iSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iSS.copydefault(investOrder, this, view);
            }
        });
        android.widget.TextView textView4 = isv.KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        UnableRedeemTip unableRedeemTip2 = investOrder.getUnableRedeemTip();
        textView4.setVisibility(((unableRedeemTip2 != null ? unableRedeemTip2.getTipContent() : null) == null || investOrder.getUnableRedeemTip().getTipContent().length() <= 0) ? 8 : 0);
        isv.KWHzl().AEQbTJ.setBackground(investOrder.isAllowedRedeem() ? Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.invoke(), (java.lang.Object) investOrder.getRedeemId()) ? C33070mpX.KWHzl(C25493ixk.StateListAnimator.hDKMBd) : C33070mpX.KWHzl(C25493ixk.StateListAnimator.zsXlph) : C33070mpX.KWHzl(C25493ixk.StateListAnimator.wlaJM));
        java.lang.String orderStatus = investOrder.getOrderStatus();
        if (orderStatus == null || orderStatus.length() == 0) {
            android.widget.TextView textView5 = isv.KWHzl().djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            C55251xgS c55251xgS = isv.KWHzl().valueOf;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            return;
        }
        android.widget.TextView textView6 = isv.KWHzl().djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(0);
        C55251xgS c55251xgS2 = isv.KWHzl().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(0);
        java.lang.String orderStatus2 = investOrder.getOrderStatus();
        if (orderStatus2 != null) {
            switch (orderStatus2.hashCode()) {
                case -1422950650:
                    if (orderStatus2.equals("active")) {
                        isv.KWHzl().valueOf.setOKDSStyle(8);
                        isv.KWHzl().valueOf.setText(isv.KWHzl().valueOf.getContext().getString(C25493ixk.FragmentManager.zeUYeG));
                        return;
                    }
                    break;
                case -185602818:
                    if (orderStatus2.equals(InvestOrder.ORDER_STATUS_UNSTAKING)) {
                        isv.KWHzl().valueOf.setOKDSStyle(12);
                        isv.KWHzl().valueOf.setText(isv.KWHzl().valueOf.getContext().getString(C25493ixk.FragmentManager.QnnRaN));
                        return;
                    }
                    break;
                case -5987325:
                    if (orderStatus2.equals(InvestOrder.ORDER_STATUS_UNSTAKED)) {
                        isv.KWHzl().valueOf.setOKDSStyle(12);
                        isv.KWHzl().valueOf.setText(isv.KWHzl().valueOf.getContext().getString(C25493ixk.FragmentManager.OgHfcT));
                        return;
                    }
                    break;
                case 2041217264:
                    if (orderStatus2.equals(InvestOrder.ORDER_STATUS_ACTIVATING)) {
                        isv.KWHzl().valueOf.setOKDSStyle(8);
                        isv.KWHzl().valueOf.setText(isv.KWHzl().valueOf.getContext().getString(C25493ixk.FragmentManager.OzhFjl));
                        return;
                    }
                    break;
            }
        }
        isv.KWHzl().valueOf.setOKDSStyle(8);
        isv.KWHzl().valueOf.setText("");
    }

    public static final void copydefault(InvestOrder investOrder, iSS iss, android.view.View view) {
        if (investOrder.isAllowedRedeem()) {
            iss.copydefault.KWHzl(investOrder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }
}
