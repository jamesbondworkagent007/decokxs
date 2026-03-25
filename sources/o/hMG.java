package o;

import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import com.okinc.business.dexui.main.limitorder.orderdetail.itemviewbinding.LimitNetworkFeeOrderItemViewBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMG extends AbstractC25436iwg<C21798hMs, C21480hAy> {
    public final java.lang.String OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hMG(@NotNull java.lang.String str) {
        super(LimitNetworkFeeOrderItemViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21480hAy> c25435iwf, @NotNull final C21798hMs c21798hMs) {
        java.lang.String fromTokenSymbol;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c21798hMs, "");
        android.content.Context context = c25435iwf.itemView.getContext();
        OrderDetailResult orderDetailResultOLrzqt = c21798hMs.OLrzqt();
        java.lang.String status = orderDetailResultOLrzqt.getStatus();
        OrderSubStatus orderSubStatus = OrderSubStatus.Completed;
        if (!Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) java.lang.String.valueOf(orderSubStatus.getStatus())) && c21798hMs.EZpvd() != null) {
            ((C21480hAy) c25435iwf.EZpvd()).copydefault.OLrzqt(true);
            ((C21480hAy) c25435iwf.EZpvd()).copydefault.setOnTipClickListener(new Function0() { // from class: o.hMJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hMG.OLrzqt(c21798hMs);
                }
            });
        } else {
            ((C21480hAy) c25435iwf.EZpvd()).copydefault.OLrzqt(false);
        }
        java.lang.String strAEQbTJ = c21798hMs.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_NETWORK_FEE.getValue())) {
            C22481hgF c22481hgF = C22481hgF.copydefault;
            java.lang.String strAEQbTJ2 = c22481hgF.AEQbTJ(orderDetailResultOLrzqt);
            if (Intrinsics.EZpvd((java.lang.Object) orderDetailResultOLrzqt.getStatus(), (java.lang.Object) java.lang.String.valueOf(orderSubStatus.getStatus()))) {
                string = context.getString(C23274hvD.Fragment.RAaltf);
            } else {
                string = context.getString(C23274hvD.Fragment.PlaybackStateCompatApi22);
            }
            java.lang.String str2 = string;
            Intrinsics.copydefault((java.lang.Object) str2);
            ((C21480hAy) c25435iwf.EZpvd()).copydefault.setNetworkInfo(str2, c22481hgF.copydefault(orderDetailResultOLrzqt, false), orderDetailResultOLrzqt.getChainSymbol(), "", (32 & 16) != 0 ? false : strAEQbTJ2.length() == 0, (32 & 32) != 0 ? false : false);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_NETWORK_FEE_BENEFIT.getValue())) {
            C22481hgF c22481hgF2 = C22481hgF.copydefault;
            java.lang.String strOLrzqt = c22481hgF2.OLrzqt(orderDetailResultOLrzqt);
            hWP hwp = ((C21480hAy) c25435iwf.EZpvd()).copydefault;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.RgaQzq);
            java.lang.String strOLrzqt2 = c22481hgF2.OLrzqt(orderDetailResultOLrzqt, false);
            FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResultOLrzqt.getFromChildOrderDetailVO();
            java.lang.String str3 = (fromChildOrderDetailVO == null || (fromTokenSymbol = fromChildOrderDetailVO.getFromTokenSymbol()) == null) ? "" : fromTokenSymbol;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
                str = "(" + strOLrzqt;
            }
            hwp.setNetworkInfo(strAYXKKw, strOLrzqt2, str3, str, (32 & 16) != 0 ? false : strOLrzqt.length() == 0, (32 & 32) != 0 ? false : false);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_MAX_TXN_FEE.getValue())) {
            ((C21480hAy) c25435iwf.EZpvd()).copydefault.setNetworkInfo(C33070mpX.AYXKKw(C23274hvD.Fragment.gCiISl), c21798hMs.OLrzqt().getPriorityFee(), c21798hMs.OLrzqt().getFeeToken(), "", (32 & 16) != 0 ? false : true, (32 & 32) != 0 ? false : false);
        }
    }

    public static final Unit OLrzqt(C21798hMs c21798hMs) {
        Function0<Unit> function0EZpvd = c21798hMs.EZpvd();
        if (function0EZpvd != null) {
            function0EZpvd.invoke();
        }
        return Unit.INSTANCE;
    }
}
