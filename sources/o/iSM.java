package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iSM extends RecyclerView.Adapter<iSQ> {
    public java.lang.String EZpvd;
    public final Function1<InvestOrder, Unit> KWHzl;
    public final java.util.List<InvestOrder> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestOrder, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public iSM(@NotNull java.util.List<InvestOrder> list, @NotNull Function1<? super InvestOrder, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = list;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public iSQ onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC23777iIy abstractC23777iIyOLrzqt = AbstractC23777iIy.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC23777iIyOLrzqt, "");
        return new iSQ(abstractC23777iIyOLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [51=6, 60=4] */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull iSQ isq, int i) {
        int color;
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(isq, "");
        final InvestOrder investOrder = this.copydefault.get(i);
        AbstractC23777iIy abstractC23777iIyKWHzl = isq.KWHzl();
        AppCompatTextView appCompatTextView = abstractC23777iIyKWHzl.KWHzl;
        android.content.Context context = abstractC23777iIyKWHzl.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i2 = C25493ixk.FragmentManager.sYcwUD;
        java.lang.String redeemId = investOrder.getRedeemId();
        if (redeemId == null) {
            redeemId = "";
        }
        appCompatTextView.setText(C33069mpW.KWHzl(context, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", EZpvd(redeemId)))));
        abstractC23777iIyKWHzl.AhwBna.setText(investOrder.getValidatorName());
        abstractC23777iIyKWHzl.copydefault.setText(pTA.formatStandardDate$default(new Date(C33129mqd.valueOf(investOrder.getStakeTime())), null, 1, null));
        C55251xgS c55251xgS = abstractC23777iIyKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        java.lang.Boolean boolIsOverflow = investOrder.isOverflow();
        c55251xgS.setVisibility((boolIsOverflow == null || !boolIsOverflow.booleanValue()) ? 8 : 0);
        abstractC23777iIyKWHzl.AEQbTJ.setText(investOrder.getStakedAmount() + " " + investOrder.getTokenSymbol());
        AppCompatTextView appCompatTextView2 = abstractC23777iIyKWHzl.EZpvd;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        java.lang.String currencyAmount = investOrder.getCurrencyAmount();
        appCompatTextView2.setText(C27492jwH.formatCurrencyData$default(c27492jwH, currencyAmount == null ? "" : currencyAmount, 2, null, null, 12, null));
        AppCompatTextView appCompatTextView3 = abstractC23777iIyKWHzl.djBIcL;
        java.lang.String babylonOrderStatus = investOrder.getBabylonOrderStatus();
        if (babylonOrderStatus != null) {
            switch (babylonOrderStatus.hashCode()) {
                case -1573593409:
                    if (babylonOrderStatus.equals(InvestOrder.BABYLON_ORDER_STATUS_REDEEM_SUBMITTED)) {
                        string = abstractC23777iIyKWHzl.getRoot().getContext().getString(C25493ixk.FragmentManager.gVEiQJ);
                    }
                    break;
                case -892490710:
                    if (babylonOrderStatus.equals(InvestOrder.BABYLON_ORDER_STATUS_STAKED)) {
                        InvestTipInfoVo remainTimeTip = investOrder.getRemainTimeTip();
                        java.lang.String tipContent = remainTimeTip != null ? remainTimeTip.getTipContent() : null;
                        if (tipContent != null) {
                            string = tipContent;
                        }
                    }
                    break;
                case 53639455:
                    if (babylonOrderStatus.equals(InvestOrder.BABYLON_ORDER_STATUS_READY_TO_REDEEM)) {
                        string = abstractC23777iIyKWHzl.getRoot().getContext().getString(C25493ixk.FragmentManager.gbIfDn);
                    }
                    break;
                case 1273703216:
                    if (babylonOrderStatus.equals(InvestOrder.BABYLON_ORDER_STATUS_STAKE_IN_PROCESS)) {
                        string = abstractC23777iIyKWHzl.getRoot().getContext().getString(C25493ixk.FragmentManager.fMBJsc);
                    }
                    break;
                case 1775355270:
                    if (babylonOrderStatus.equals(InvestOrder.BABYLON_ORDER_STATUS_UNBONDING)) {
                        string = abstractC23777iIyKWHzl.getRoot().getContext().getString(C25493ixk.FragmentManager.GCXiNH);
                    }
                    break;
            }
        }
        appCompatTextView3.setText(string);
        AppCompatTextView appCompatTextView4 = abstractC23777iIyKWHzl.djBIcL;
        java.lang.String babylonOrderStatus2 = investOrder.getBabylonOrderStatus();
        if (babylonOrderStatus2 != null) {
            switch (babylonOrderStatus2.hashCode()) {
                case -1573593409:
                    color = !babylonOrderStatus2.equals(InvestOrder.BABYLON_ORDER_STATUS_REDEEM_SUBMITTED) ? ContextCompat.getColor(abstractC23777iIyKWHzl.getRoot().getContext(), C52761wXj.Activity.QwvEab) : ContextCompat.getColor(abstractC23777iIyKWHzl.getRoot().getContext(), C52761wXj.Activity.DcMfJK);
                    break;
                case -892490710:
                    if (babylonOrderStatus2.equals(InvestOrder.BABYLON_ORDER_STATUS_STAKED)) {
                        color = ContextCompat.getColor(abstractC23777iIyKWHzl.getRoot().getContext(), C52761wXj.Activity.gdmIOq);
                        break;
                    }
                    break;
                case 53639455:
                    if (babylonOrderStatus2.equals(InvestOrder.BABYLON_ORDER_STATUS_READY_TO_REDEEM)) {
                    }
                    break;
                case 1273703216:
                    if (babylonOrderStatus2.equals(InvestOrder.BABYLON_ORDER_STATUS_STAKE_IN_PROCESS)) {
                        color = ContextCompat.getColor(abstractC23777iIyKWHzl.getRoot().getContext(), C52761wXj.Activity.QwvEab);
                        break;
                    }
                    break;
                case 1775355270:
                    if (!babylonOrderStatus2.equals(InvestOrder.BABYLON_ORDER_STATUS_UNBONDING)) {
                    }
                    break;
            }
        }
        appCompatTextView4.setTextColor(color);
        abstractC23777iIyKWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.iSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iSM.AEQbTJ(investOrder, this, view);
            }
        });
        abstractC23777iIyKWHzl.getRoot().setBackground(investOrder.isAllowedRedeem() ? Intrinsics.EZpvd((java.lang.Object) investOrder.getRedeemId(), (java.lang.Object) this.EZpvd) ? C33070mpX.KWHzl(C25493ixk.StateListAnimator.hDKMBd) : C33070mpX.KWHzl(C25493ixk.StateListAnimator.zsXlph) : C33070mpX.KWHzl(C25493ixk.StateListAnimator.wlaJM));
    }

    public static final void AEQbTJ(InvestOrder investOrder, iSM ism, android.view.View view) {
        if (investOrder.isAllowedRedeem()) {
            ism.copydefault(investOrder.getRedeemId());
            ism.KWHzl.invoke(investOrder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    public final void copydefault(java.lang.String str) {
        this.EZpvd = str;
        notifyDataSetChanged();
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str.length() <= 10) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strSubstring2 = str.substring(str.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring + ".." + strSubstring2;
    }
}
