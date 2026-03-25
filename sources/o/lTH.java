package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.common.FiatOrderStatus;
import com.okinc.buysell.common.HistoryOrderStatus;
import com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lTH extends android.widget.FrameLayout {
    public final AbstractC31618lxt EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lTH(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:24) call: o.lTH.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ lTH(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lTH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C31351lsQ.ActionBar.OFhtUX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC31618lxt) viewDataBindingInflate;
    }

    public final void setData(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        AEQbTJ(orderDetailBean);
        KWHzl(orderDetailBean);
    }

    public final void AEQbTJ(OrderDetailBean orderDetailBean) {
        this.EZpvd.AEQbTJ.setVisibility(0);
        int status = orderDetailBean.getStatus();
        if (status == HistoryOrderStatus.PENDING.getValue()) {
            setPendingStatus();
            return;
        }
        if (status == HistoryOrderStatus.PROCESSING.getValue()) {
            AhwBna(orderDetailBean);
            return;
        }
        if (status == HistoryOrderStatus.FAILED.getValue()) {
            AYXKKw(orderDetailBean);
            return;
        }
        if (status == HistoryOrderStatus.COMPLETED.getValue()) {
            gEmmrt(orderDetailBean);
            return;
        }
        if (status == HistoryOrderStatus.REFUNDED.getValue()) {
            setRefundedStatus();
            return;
        }
        if (status == HistoryOrderStatus.EXPIRED.getValue()) {
            setExpiredStatus();
        } else if (status == HistoryOrderStatus.CANCELLED.getValue()) {
            setCancelledStatus();
        } else {
            this.EZpvd.AEQbTJ.setVisibility(8);
        }
    }

    public final void setPendingStatus() {
        this.EZpvd.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.PENDING.getDisplayName()));
        this.EZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.Swccd));
    }

    private final void AhwBna(OrderDetailBean orderDetailBean) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        android.widget.TextView textView = this.EZpvd.KWHzl;
        if (orderDetailBean.getDexOrderDetail() != null) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.zOIQXb);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(HistoryOrderStatus.PROCESSING.getDisplayName());
        }
        textView.setText(strAYXKKw);
        android.widget.TextView textView2 = this.EZpvd.OLrzqt;
        if (orderDetailBean.getDexOrderDetail() != null) {
            strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.zAEkPU);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.geLlBI);
        }
        textView2.setText(strAYXKKw2);
    }

    private final void AYXKKw(OrderDetailBean orderDetailBean) {
        java.lang.String strAYXKKw;
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(FiatOrderStatus.FAILED.getValue()), java.lang.Integer.valueOf(FiatOrderStatus.SUCCESS.getValue()), java.lang.Integer.valueOf(FiatOrderStatus.IGNORED.getValue()));
        DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
        boolean zKWHzl = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), dexOrderDetail != null ? dexOrderDetail.getFiatOrderStatus() : null);
        android.widget.TextView textView = this.EZpvd.KWHzl;
        if (zKWHzl) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.zqTOFw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(HistoryOrderStatus.FAILED.getDisplayName());
        }
        textView.setText(strAYXKKw);
        this.EZpvd.OLrzqt.setText(copydefault(orderDetailBean));
    }

    public final java.lang.String copydefault(OrderDetailBean orderDetailBean) {
        DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
        if (dexOrderDetail != null) {
            java.lang.Integer fiatOrderStatus = dexOrderDetail.getFiatOrderStatus();
            int value = FiatOrderStatus.FAILED.getValue();
            if (fiatOrderStatus != null && fiatOrderStatus.intValue() == value) {
                return C33070mpX.AYXKKw(C31351lsQ.Activity.zDUObI);
            }
            int value2 = FiatOrderStatus.SUCCESS.getValue();
            if (fiatOrderStatus != null && fiatOrderStatus.intValue() == value2) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.vLaW);
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("refundAmount", C31661lzi.copydefault(dexOrderDetail.getRefundAmount(), false));
                java.lang.String refundCurrency = dexOrderDetail.getRefundCurrency();
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = refundCurrency.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                return C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt("asset", upperCase)));
            }
            return valueOf(orderDetailBean);
        }
        return valueOf(orderDetailBean);
    }

    public final java.lang.String valueOf(OrderDetailBean orderDetailBean) {
        if (yDY.gEmmrt(ChannelPlatformCode.BUY_IDEAL.getCode(), ChannelPlatformCode.ACH_BUY.getCode()).contains(orderDetailBean.getDepositPlatformCode()) && C33129mqd.KWHzl((java.util.Collection) orderDetailBean.getSubOrders()) && orderDetailBean.getSubOrders().size() >= 2 && orderDetailBean.getSubOrders().get(0).getStatus() == HistoryOrderStatus.COMPLETED.getValue() && orderDetailBean.getSubOrders().get(1).getStatus() == HistoryOrderStatus.FAILED.getValue()) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.DrNnAm);
        }
        return orderDetailBean.getCategoryCode() == ChannelCategoryCode.THIRD_PARTY.getCode() ? djBIcL(orderDetailBean) : C33070mpX.AYXKKw(C31351lsQ.Activity.aJZHYI);
    }

    public final java.lang.String djBIcL(OrderDetailBean orderDetailBean) {
        if (orderDetailBean.getShowCustomer() && orderDetailBean.getCustomerUrl().length() > 0) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DPHsZd), C56423yEv.EZpvd(C56390yDp.OLrzqt("thirdparty", orderDetailBean.getDepositName())));
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DPhTBN);
    }

    private final void gEmmrt(OrderDetailBean orderDetailBean) {
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(FiatOrderStatus.SUCCESS.getValue()), java.lang.Integer.valueOf(FiatOrderStatus.IGNORED.getValue()));
        DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), dexOrderDetail != null ? dexOrderDetail.getFiatOrderStatus() : null)) {
            this.EZpvd.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zlvcHA));
            this.EZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.swzYdv));
        } else {
            this.EZpvd.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.COMPLETED.getDisplayName()));
            this.EZpvd.OLrzqt.setText(OLrzqt(orderDetailBean));
        }
    }

    public final java.lang.String OLrzqt(OrderDetailBean orderDetailBean) {
        return orderDetailBean.isConvert() ? EZpvd(orderDetailBean) : Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) BuySellTradeType.SELL.getType()) ? C33070mpX.AYXKKw(C31351lsQ.Activity.RAQtXZ) : C33070mpX.AYXKKw(C31351lsQ.Activity.DKtBnz);
    }

    public final java.lang.String EZpvd(OrderDetailBean orderDetailBean) {
        java.lang.String strAYXKKw;
        ConvertOrderDetailBean convertOrderDetail = orderDetailBean.getConvertOrderDetail();
        if (convertOrderDetail != null) {
            int orderStatus = convertOrderDetail.getOrderStatus();
            if (orderStatus == -3 || orderStatus == -2 || orderStatus == -1 || (orderStatus != 2 && orderStatus == 3)) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DPHNDa);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DKtBnz);
            }
            if (strAYXKKw != null) {
                return strAYXKKw;
            }
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DKtBnz);
    }

    public final void setRefundedStatus() {
        this.EZpvd.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.REFUNDED.getDisplayName()));
        this.EZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fkESqH));
    }

    public final void setExpiredStatus() {
        this.EZpvd.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.EXPIRED.getDisplayName()));
        this.EZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.iKEqwx));
    }

    public final void setCancelledStatus() {
        this.EZpvd.KWHzl.setText(C33070mpX.AYXKKw(HistoryOrderStatus.CANCELLED.getDisplayName()));
        this.EZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DLGVGj));
    }

    public final void KWHzl(OrderDetailBean orderDetailBean) {
        if (orderDetailBean.isConvert()) {
            ConvertOrderDetailBean convertOrderDetail = orderDetailBean.getConvertOrderDetail();
            java.lang.String failReason = convertOrderDetail != null ? convertOrderDetail.getFailReason() : null;
            if (failReason == null || failReason.length() == 0) {
                this.EZpvd.EZpvd.setVisibility(8);
                return;
            } else {
                this.EZpvd.EZpvd.setVisibility(0);
                this.EZpvd.EZpvd.setText(failReason);
                return;
            }
        }
        this.EZpvd.EZpvd.setVisibility(8);
    }
}
