package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22070hWu extends AbstractC59533zio<C22033hVk, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21481hAz c21481hAzKWHzl = C21481hAz.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21481hAzKWHzl, "");
        return new TaskDescription(c21481hAzKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C22033hVk c22033hVk) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c22033hVk, "");
        boolean zCopydefault = C22822hmc.copydefault(false, c22033hVk.KWHzl().getStatus());
        if (c22033hVk.KWHzl().isSingleSwapStyle()) {
            taskDescription.copydefault().copydefault.setServiceFeeInfo(AEQbTJ(c22033hVk.KWHzl()), zCopydefault);
            return;
        }
        if (c22033hVk.KWHzl().getToSwapServiceFeeUsd().length() == 0) {
            taskDescription.copydefault().copydefault.setServiceFeeInfo("--", zCopydefault);
        } else if (C23313hvq.copydefault(c22033hVk.KWHzl().getToSwapServiceFeeUsd(), 0)) {
            taskDescription.copydefault().copydefault.setServiceFeeInfo(C23322hvz.toLocalizedCurrencyNumberWithPrefix$default("0", false, null, false, false, 15, null), zCopydefault);
        } else {
            taskDescription.copydefault().copydefault.setServiceFeeInfo(C23322hvz.toLocalizedNumberWithSymbol$default(c22033hVk.KWHzl().getToSwapServiceFee(), c22033hVk.KWHzl().getToSwapServiceFeeTokenSymbol(), false, null, false, false, 30, null), zCopydefault);
        }
    }

    public final java.lang.String AEQbTJ(OrderDetailBean orderDetailBean) {
        java.lang.String status = orderDetailBean.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode == 49 ? status.equals("1") : iHashCode == 1444 ? status.equals(MultiTransferSignData.DEFAULT_INTERVAL) : iHashCode == 1445 && status.equals("-2")) {
            return (orderDetailBean.getServiceFee().length() <= 0 || !C23313hvq.OLrzqt(orderDetailBean.getServiceFee(), 0)) ? "--" : C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, orderDetailBean.getServiceFee(), orderDetailBean.getServiceFeeTokenSymbol(), false, null, false, false, 60, null);
        }
        if (orderDetailBean.getServiceFeeRate().length() > 0 && C23313hvq.OLrzqt(orderDetailBean.getServiceFeeRate(), 0)) {
            return C23311hvo.formatPercent$default(orderDetailBean.getServiceFeeRate(), false, 0, 0, null, null, 31, null);
        }
        return C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
    }

    /* JADX INFO: renamed from: o.hWu$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21481hAz KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21481hAz copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C21481hAz c21481hAz) {
            super(c21481hAz.getRoot());
            Intrinsics.checkNotNullParameter(c21481hAz, "");
            this.KWHzl = c21481hAz;
        }
    }
}
