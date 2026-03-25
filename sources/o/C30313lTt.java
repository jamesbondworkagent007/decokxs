package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.common.FiatOrderStatus;
import com.okinc.buysell.common.OKRemoteImageResource;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.components.track.TrackChannel;
import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.SubOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okx.paymentapi.service.HistoryOrderStatus;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C47244tmQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30313lTt extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final AbstractC31606lxh EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30313lTt(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC31606lxh copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:58) call: o.lTt.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30313lTt(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30313lTt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C31351lsQ.ActionBar.DLWbHP, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC31606lxh abstractC31606lxh = (AbstractC31606lxh) viewDataBindingInflate;
        this.EZpvd = abstractC31606lxh;
        final AbstractC31607lxi abstractC31607lxi = abstractC31606lxh.fIwbmz;
        abstractC31607lxi.AEQbTJ.setSelected(false);
        abstractC31607lxi.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30313lTt.KWHzl(abstractC31607lxi, view);
            }
        });
    }

    public static final void KWHzl(AbstractC31607lxi abstractC31607lxi, android.view.View view) {
        abstractC31607lxi.AEQbTJ.setSelected(!r4.isSelected());
        abstractC31607lxi.AkhnZx.setVisibility(!abstractC31607lxi.AEQbTJ.isSelected() ? 8 : 0);
        abstractC31607lxi.fetchVPNInfo.setVisibility(abstractC31607lxi.AEQbTJ.isSelected() ? 0 : 8);
    }

    public final void setData(@NotNull OrderDetailBean orderDetailBean, @NotNull final androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        java.lang.String strPrependFiatSymbol$default;
        java.lang.String strCopydefault;
        java.lang.String string2;
        int i;
        java.lang.String strAYXKKw;
        java.lang.String strPrependFiatSymbol$default2;
        java.lang.String strPrependFiatSymbol$default3;
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        AbstractC31606lxh abstractC31606lxh = this.EZpvd;
        java.util.List<SubOrderDetailBean> subOrders = orderDetailBean.getSubOrders();
        if (subOrders.size() >= 2) {
            abstractC31606lxh.DAIeex.setData(orderDetailBean, subOrders.get(0), subOrders.get(1));
            abstractC31606lxh.DAIeex.setVisibility(0);
            abstractC31606lxh.ODWQjV.setVisibility(0);
            abstractC31606lxh.AubY.setVisibility(0);
            abstractC31606lxh.OqFWZa.setVisibility(4);
        }
        FxRateConversionBean fxRateConversion = orderDetailBean.getFxRateConversion();
        if (fxRateConversion != null) {
            abstractC31606lxh.fFgQHt.setText("1 " + fxRateConversion.getBaseCurrency() + " ≈ " + C31661lzi.copydefault(fxRateConversion.getFxRate(), false) + " " + fxRateConversion.getQuoteCurrency());
            abstractC31606lxh.getNewProxyInstance.setVisibility(0);
        } else {
            abstractC31606lxh.getNewProxyInstance.setVisibility(8);
        }
        android.widget.ImageView imageView = abstractC31606lxh.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadUrl$default(imageView, orderDetailBean.isConvert() ? orderDetailBean.getConvertBaseColorfulIconUrl() : orderDetailBean.getBaseCurrencyUrl(), null, 0, 0, 14, null);
        java.lang.String tradeType = orderDetailBean.getTradeType();
        BuySellTradeType buySellTradeType = BuySellTradeType.BUY;
        if (Intrinsics.EZpvd((java.lang.Object) tradeType, (java.lang.Object) buySellTradeType.getType())) {
            if (orderDetailBean.getOrderType() == 2) {
                string = getContext().getString(C47244tmQ.Activity.AEQbTJ);
            } else {
                string = getContext().getString(C31351lsQ.Activity.DGUQLIhJrIAr);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) tradeType, (java.lang.Object) BuySellTradeType.CONVERT.getType())) {
            string = getContext().getString(C31351lsQ.Activity.DrqXHJ);
        } else {
            string = getContext().getString(C31351lsQ.Activity.frkDMe);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        abstractC31606lxh.RJOkX.setText(string);
        if (Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) BuySellTradeType.CONVERT.getType())) {
            abstractC31606lxh.fIwbmz.getRoot().setVisibility(8);
            abstractC31606lxh.gHZMYf.setVisibility(8);
            abstractC31606lxh.AEQbTJ.setVisibility(8);
            android.widget.TextView textView = abstractC31606lxh.dxcTrN;
            java.lang.String strCopydefault2 = C31661lzi.copydefault(orderDetailBean.getBaseAmount(), false);
            java.lang.String baseCurrencySymbol = orderDetailBean.getBaseCurrencySymbol();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = baseCurrencySymbol.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            textView.setText(strCopydefault2 + " " + upperCase);
            abstractC31606lxh.fJNWhG.setVisibility(0);
            android.widget.TextView textView2 = abstractC31606lxh.QVAiDq;
            if (orderDetailBean.getQuoteSymbol().length() == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (orderDetailBean.getStatus() != HistoryOrderStatus.COMPLETED.getValue() && Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) BuySellTradeType.SELL.getType())) {
                    sb.append("~");
                }
                java.lang.String strCopydefault3 = C31661lzi.copydefault(orderDetailBean.getQuoteAmount(), false);
                java.lang.String quoteCurrencySymbol = orderDetailBean.getQuoteCurrencySymbol();
                java.util.Locale locale2 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                java.lang.String upperCase2 = quoteCurrencySymbol.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                sb.append(strCopydefault3 + " " + upperCase2);
                strPrependFiatSymbol$default2 = sb.toString();
            } else {
                strPrependFiatSymbol$default2 = C31661lzi.prependFiatSymbol$default(orderDetailBean.getQuoteAmount(), orderDetailBean.getQuoteCurrencySymbol(), orderDetailBean.getQuoteSymbol(), C38307pTy.Companion.KWHzl(0, 2), null, false, 24, null);
            }
            textView2.setText(strPrependFiatSymbol$default2);
            abstractC31606lxh.uzCIH.setVisibility(0);
            android.widget.TextView textView3 = abstractC31606lxh.djSkpj;
            java.lang.String strCopydefault4 = C31661lzi.copydefault(orderDetailBean.getBaseAmount(), false);
            java.lang.String baseCurrencySymbol2 = orderDetailBean.getBaseCurrencySymbol();
            java.util.Locale locale3 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            java.lang.String upperCase3 = baseCurrencySymbol2.toUpperCase(locale3);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "");
            textView3.setText(strCopydefault4 + " " + upperCase3);
            abstractC31606lxh.AubY.setVisibility(0);
            abstractC31606lxh.accept.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DzkRMH), C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoName", orderDetailBean.getBaseCurrencySymbol()))));
            android.widget.TextView textView4 = abstractC31606lxh.QKudOq;
            if (orderDetailBean.getQuoteSymbol().length() == 0) {
                java.lang.String price = orderDetailBean.getPrice();
                java.lang.String quoteCurrencySymbol2 = orderDetailBean.getQuoteCurrencySymbol();
                java.util.Locale locale4 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "");
                java.lang.String upperCase4 = quoteCurrencySymbol2.toUpperCase(locale4);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                strPrependFiatSymbol$default3 = price + " " + upperCase4;
            } else {
                strPrependFiatSymbol$default3 = C31661lzi.prependFiatSymbol$default(orderDetailBean.getPrice(), orderDetailBean.getQuoteCurrencySymbol(), orderDetailBean.getQuoteSymbol(), C38307pTy.Companion.KWHzl(0, C56548yJl.copydefault(C33129mqd.EZpvd(orderDetailBean.getPrice()).stripTrailingZeros().scale(), 0)), null, false, 24, null);
            }
            textView4.setText(strPrependFiatSymbol$default3);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) buySellTradeType.getType()) && orderDetailBean.getOrderType() == 2 && C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getFrequency())) {
                ConstraintLayout constraintLayout = abstractC31606lxh.AuCTelauCTel;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                abstractC31606lxh.gGvvIC.setText(orderDetailBean.getFrequency());
            } else {
                ConstraintLayout constraintLayout2 = abstractC31606lxh.AuCTelauCTel;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(8);
            }
            if (orderDetailBean.isConvert()) {
                KWHzl(orderDetailBean);
                abstractC31606lxh.fIwbmz.getRoot().setVisibility(0);
                abstractC31606lxh.AubY.setVisibility(8);
            } else {
                abstractC31606lxh.fIwbmz.getRoot().setVisibility(8);
                abstractC31606lxh.AubY.setVisibility(0);
            }
            java.lang.String tradeType2 = orderDetailBean.getTradeType();
            BuySellTradeType buySellTradeType2 = BuySellTradeType.SELL;
            if (Intrinsics.EZpvd((java.lang.Object) tradeType2, (java.lang.Object) buySellTradeType2.getType())) {
                abstractC31606lxh.RlQdEF.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fmB));
                abstractC31606lxh.fvQaOB.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDCKfqP));
            } else {
                abstractC31606lxh.RlQdEF.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DCUTEI));
                abstractC31606lxh.fvQaOB.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DlABUU));
            }
            android.widget.TextView textView5 = abstractC31606lxh.accept;
            if (orderDetailBean.getDexOrderDetail() != null) {
                strOLrzqt = C33070mpX.AYXKKw(C31351lsQ.Activity.htlTjW);
            } else {
                strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DzkRMH), C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoName", orderDetailBean.getBaseCurrencySymbol())));
            }
            textView5.setText(strOLrzqt);
            android.widget.TextView textView6 = abstractC31606lxh.QKudOq;
            if (orderDetailBean.getDexOrderDetail() != null) {
                java.lang.String strOLrzqt2 = C31661lzi.OLrzqt(orderDetailBean.getPrice(), false, orderDetailBean.getQuoteCurrencySymbol(), orderDetailBean.getQuoteCurrencySymbol(), C38307pTy.Companion.KWHzl(0, 15), RoundingMode.DOWN);
                strPrependFiatSymbol$default = "1 " + orderDetailBean.getBaseCurrencySymbol() + "≈" + strOLrzqt2;
            } else if (orderDetailBean.getQuoteSymbol().length() == 0) {
                if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY)) {
                    strPrependFiatSymbol$default = ((InterfaceC31780mDq) C43248rlh.KWHzl.AEQbTJ(InterfaceC31780mDq.class)).copydefault(new C31775mDl(orderDetailBean.getQuoteCurrencySymbol(), AmountDisplayType.DETAIL, C33129mqd.EZpvd(orderDetailBean.getPrice()), false, null, null, 56, null));
                } else {
                    java.lang.String price2 = orderDetailBean.getPrice();
                    java.lang.String quoteCurrencySymbol3 = orderDetailBean.getQuoteCurrencySymbol();
                    java.util.Locale locale5 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale5, "");
                    java.lang.String upperCase5 = quoteCurrencySymbol3.toUpperCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(upperCase5, "");
                    strPrependFiatSymbol$default = price2 + " " + upperCase5;
                }
            } else {
                strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(orderDetailBean.getPrice(), orderDetailBean.getQuoteCurrencySymbol(), orderDetailBean.getQuoteSymbol(), C38307pTy.Companion.KWHzl(0, C56548yJl.copydefault(C33129mqd.EZpvd(orderDetailBean.getPrice()).stripTrailingZeros().scale(), 0)), null, false, 24, null);
            }
            textView6.setText(strPrependFiatSymbol$default);
            android.widget.TextView textView7 = abstractC31606lxh.dxcTrN;
            if (orderDetailBean.isConvert()) {
                ConvertOrderDetailBean convertOrderDetail = orderDetailBean.getConvertOrderDetail();
                java.lang.String convertBaseAmount = convertOrderDetail != null ? convertOrderDetail.getConvertBaseAmount() : null;
                if (convertBaseAmount == null) {
                    convertBaseAmount = "";
                }
                ConvertOrderDetailBean convertOrderDetail2 = orderDetailBean.getConvertOrderDetail();
                java.lang.String convertBaseCurrency = convertOrderDetail2 != null ? convertOrderDetail2.getConvertBaseCurrency() : null;
                if (convertBaseCurrency == null) {
                    convertBaseCurrency = "";
                }
                if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY)) {
                    strCopydefault = ((InterfaceC31780mDq) C43248rlh.KWHzl.AEQbTJ(InterfaceC31780mDq.class)).copydefault(new C31775mDl(convertBaseCurrency, AmountDisplayType.DETAIL, C33129mqd.EZpvd(convertBaseAmount), false, null, null, 56, null));
                } else {
                    java.lang.String strCopydefault5 = C31661lzi.copydefault(convertBaseAmount, false);
                    java.util.Locale locale6 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale6, "");
                    java.lang.String upperCase6 = convertBaseCurrency.toUpperCase(locale6);
                    Intrinsics.checkNotNullExpressionValue(upperCase6, "");
                    strCopydefault = strCopydefault5 + " " + upperCase6;
                }
            } else if (orderDetailBean.getDexOrderDetail() != null && orderDetailBean.getStatus() != HistoryOrderStatus.COMPLETED.getValue()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                if (Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) buySellTradeType.getType())) {
                    sb2.append("~");
                }
                java.lang.String strCopydefault6 = C31661lzi.copydefault(orderDetailBean.getBaseAmount(), false);
                java.lang.String baseCurrencySymbol3 = orderDetailBean.getBaseCurrencySymbol();
                java.util.Locale locale7 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale7, "");
                java.lang.String upperCase7 = baseCurrencySymbol3.toUpperCase(locale7);
                Intrinsics.checkNotNullExpressionValue(upperCase7, "");
                sb2.append(strCopydefault6 + " " + upperCase7);
                strCopydefault = sb2.toString();
            } else if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY)) {
                strCopydefault = ((InterfaceC31780mDq) C43248rlh.KWHzl.AEQbTJ(InterfaceC31780mDq.class)).copydefault(new C31775mDl(orderDetailBean.getBaseCurrencySymbol(), AmountDisplayType.DETAIL, C33129mqd.EZpvd(orderDetailBean.getBaseAmount()), false, null, null, 56, null));
            } else {
                java.lang.String strCopydefault7 = C31661lzi.copydefault(orderDetailBean.getBaseAmount(), false);
                java.lang.String baseCurrencySymbol4 = orderDetailBean.getBaseCurrencySymbol();
                java.util.Locale locale8 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale8, "");
                java.lang.String upperCase8 = baseCurrencySymbol4.toUpperCase(locale8);
                Intrinsics.checkNotNullExpressionValue(upperCase8, "");
                strCopydefault = strCopydefault7 + " " + upperCase8;
            }
            textView7.setText(strCopydefault);
            if (orderDetailBean.getDexOrderDetail() != null || orderDetailBean.getQuoteSymbol().length() == 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                if (orderDetailBean.getStatus() != HistoryOrderStatus.COMPLETED.getValue() && Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) buySellTradeType2.getType())) {
                    sb3.append("~");
                }
                if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY) && orderDetailBean.getDexOrderDetail() == null) {
                    sb3.append(((InterfaceC31780mDq) C43248rlh.KWHzl.AEQbTJ(InterfaceC31780mDq.class)).copydefault(new C31775mDl(orderDetailBean.getQuoteCurrencySymbol(), AmountDisplayType.DETAIL, C33129mqd.EZpvd(orderDetailBean.getQuoteAmount()), false, null, null, 56, null)));
                } else {
                    java.lang.String strCopydefault8 = C31661lzi.copydefault(orderDetailBean.getQuoteAmount(), false);
                    java.lang.String quoteCurrencySymbol4 = orderDetailBean.getQuoteCurrencySymbol();
                    java.util.Locale locale9 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale9, "");
                    java.lang.String upperCase9 = quoteCurrencySymbol4.toUpperCase(locale9);
                    Intrinsics.checkNotNullExpressionValue(upperCase9, "");
                    sb3.append(strCopydefault8 + " " + upperCase9);
                }
                string2 = sb3.toString();
            } else {
                string2 = C31661lzi.prependFiatSymbol$default(orderDetailBean.getQuoteAmount(), orderDetailBean.getQuoteCurrencySymbol(), orderDetailBean.getQuoteSymbol(), C38307pTy.Companion.KWHzl(0, 2), null, false, 24, null);
            }
            abstractC31606lxh.AxsJAYsNCnLh.setText(string2);
            if (AhwBna(orderDetailBean)) {
                android.widget.ImageView imageView2 = abstractC31606lxh.OcIXYQ;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.loadUrl$default(imageView2, EZpvd(orderDetailBean), null, 0, 0, 14, null);
                abstractC31606lxh.OcIXYQ.setVisibility(0);
                i = 8;
                abstractC31606lxh.DTwDnp.setVisibility(8);
            } else {
                android.widget.ImageView imageView3 = abstractC31606lxh.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                C33054mpH.loadUrl$default(imageView3, EZpvd(orderDetailBean), null, 0, 0, 14, null);
                i = 8;
                abstractC31606lxh.OcIXYQ.setVisibility(8);
            }
            if (!OLrzqt(orderDetailBean)) {
                abstractC31606lxh.AuCTel.setVisibility(i);
            } else {
                abstractC31606lxh.AuCTel.setVisibility(0);
                abstractC31606lxh.giSNqX.setText(AEQbTJ(orderDetailBean));
                if (orderDetailBean.getAccountType().length() > 0) {
                    abstractC31606lxh.AxsJAY.setText(orderDetailBean.getAccountType());
                    abstractC31606lxh.AxsJAY.setVisibility(0);
                } else {
                    abstractC31606lxh.AxsJAY.setVisibility(8);
                }
            }
            abstractC31606lxh.QUSxYX.setText(orderDetailBean.getDepositName());
            android.widget.ImageView imageView4 = abstractC31606lxh.ORxRYg;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            C33054mpH.loadUrl$default(imageView4, copydefault(orderDetailBean), null, 0, 0, 14, null);
            final DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
            if (dexOrderDetail != null) {
                abstractC31606lxh.sSMYrx.setVisibility(8);
                abstractC31606lxh.AYXKKw.setVisibility(0);
                android.widget.ImageView imageView5 = abstractC31606lxh.valueOf;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                C33054mpH.KWHzl(imageView5, C33492mxV.OLrzqt() ? dexOrderDetail.getDexCryptoIconNightUrl() : dexOrderDetail.getDexCryptoIconDayUrl());
                android.widget.ImageView imageView6 = abstractC31606lxh.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(imageView6, "");
                C33054mpH.KWHzl(imageView6, dexOrderDetail.getNetworkIconUrl());
                abstractC31606lxh.getFieldNames.setVisibility(0);
                android.widget.ImageView imageView7 = abstractC31606lxh.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(imageView7, "");
                C33054mpH.loadUrl$default(imageView7, dexOrderDetail.getNetworkIconUrl(), null, 0, 0, 14, null);
                abstractC31606lxh.dNCPSb.setText(dexOrderDetail.getNetwork());
                abstractC31606lxh.iZzfmt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.tIwhY));
                if (orderDetailBean.getStatus() == HistoryOrderStatus.COMPLETED.getValue() && dexOrderDetail.getDisclaimerDesc().length() > 0 && dexOrderDetail.getDisclaimerLearnMoreUrl().length() > 0) {
                    android.widget.TextView textView8 = abstractC31606lxh.UeEOUB;
                    textView8.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    textView8.setClickable(true);
                    textView8.setVisibility(0);
                    C30329lUi c30329lUi = C30329lUi.AEQbTJ;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    abstractC31606lxh.UeEOUB.setText(c30329lUi.AEQbTJ(context, C33069mpW.OLrzqt(dexOrderDetail.getDisclaimerDesc(), C56423yEv.EZpvd(C56390yDp.OLrzqt("disclaimerLearnMore", C33070mpX.AYXKKw(C31351lsQ.Activity.zKcAg)))), C33070mpX.AYXKKw(C31351lsQ.Activity.zKcAg), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new Function0() { // from class: o.lTs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C30313lTt.AEQbTJ(this.OLrzqt, dexOrderDetail);
                        }
                    }));
                }
            } else {
                abstractC31606lxh.sSMYrx.setVisibility(0);
                abstractC31606lxh.AYXKKw.setVisibility(8);
                abstractC31606lxh.UeEOUB.setVisibility(8);
                abstractC31606lxh.getFieldNames.setVisibility(8);
                abstractC31606lxh.iZzfmt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dzCpvv));
            }
            final UnFreezeDateBean unFreezeDateResponse = orderDetailBean.getUnFreezeDateResponse();
            if (unFreezeDateResponse != null) {
                if (unFreezeDateResponse.getFiatDepositFiatHold() == null && unFreezeDateResponse.getFiatDepositCryptoHold() == null) {
                    abstractC31606lxh.AEQbTJ.setVisibility(8);
                } else {
                    abstractC31606lxh.QKVWgx.setText(KWHzl(unFreezeDateResponse.getFiatDepositFiatHold(), unFreezeDateResponse.getFiatDepositCryptoHold()));
                    abstractC31606lxh.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lTu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30313lTt.setData$lambda$15$lambda$13$lambda$12(unFreezeDateResponse, fragmentManager, view);
                        }
                    });
                    abstractC31606lxh.AEQbTJ.setVisibility(0);
                }
            } else {
                abstractC31606lxh.AEQbTJ.setVisibility(8);
            }
        }
        abstractC31606lxh.dvKsVJ.setText(pTA.formatSimpleDateTime$default(new Date(orderDetailBean.getCreateDate()), null, 1, null));
        C57635ymD c57635ymD = abstractC31606lxh.iRxXKY;
        Intrinsics.checkNotNullExpressionValue(c57635ymD, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        if (orderDetailBean.getDexOrderDetail() != null) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.tIwhY);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.dzCpvv);
        }
        C31661lzi.OLrzqt(c57635ymD, context2, (20 & 2) != 0 ? null : OtcExtraKeys.ORDER_ID, (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : strAYXKKw, (20 & 16) != 0 ? null : null);
        abstractC31606lxh.iRxXKY.setText(orderDetailBean.getOrderNo());
    }

    public static final Unit AEQbTJ(C30313lTt c30313lTt, DexOrderDetailBean dexOrderDetailBean) {
        android.content.Context context = c30313lTt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c30313lTt.OLrzqt(context, dexOrderDetailBean.getDisclaimerLearnMoreUrl());
        return Unit.INSTANCE;
    }

    public static final void setData$lambda$15$lambda$13$lambda$12(UnFreezeDateBean unFreezeDateBean, androidx.fragment.app.FragmentManager fragmentManager, android.view.View view) {
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_RiskTooltip_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C30308lTo.Companion.EZpvd(unFreezeDateBean.getFiatDepositFiatHold(), unFreezeDateBean.getFiatDepositCryptoHold()).show(fragmentManager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0.intValue() != r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(OrderDetailBean orderDetailBean) {
        DexOrderDetailBean dexOrderDetail;
        if (orderDetailBean.getCategoryCode() == ChannelCategoryCode.BALANCE.getCode() && C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getQuoteCurrencySymbol())) {
            if (orderDetailBean.getDexOrderDetail() != null && (dexOrderDetail = orderDetailBean.getDexOrderDetail()) != null) {
                java.lang.Integer fiatOrderStatus = dexOrderDetail.getFiatOrderStatus();
                int value = FiatOrderStatus.IGNORED.getValue();
                if (fiatOrderStatus != null) {
                }
            }
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.gCZUJG), C56423yEv.EZpvd(C56390yDp.OLrzqt("fiatName", orderDetailBean.getQuoteCurrencySymbol())));
        }
        java.lang.String depositPlatformCode = orderDetailBean.getDepositPlatformCode();
        if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.CARD.getCode()) || Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode())) {
            return orderDetailBean.getPaymentMethod() + " " + orderDetailBean.getLast4();
        }
        if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            return orderDetailBean.getLast4();
        }
        return orderDetailBean.getPaymentMethod();
    }

    public final boolean AhwBna(OrderDetailBean orderDetailBean) {
        java.lang.String depositPlatformCode = orderDetailBean.getDepositPlatformCode();
        return Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode()) || Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.BLIK_BUY.getCode()) || Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.APPLE_PAY.getCode());
    }

    public final java.lang.String EZpvd(OrderDetailBean orderDetailBean) {
        if (orderDetailBean.getCategoryCode() == ChannelCategoryCode.BALANCE.getCode() && C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getQuoteCurrencyUrl())) {
            return orderDetailBean.getQuoteCurrencyUrl();
        }
        java.lang.String paymentMethodNightUrl = C33492mxV.OLrzqt() ? orderDetailBean.getPaymentMethodNightUrl() : orderDetailBean.getPaymentMethodUrl();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodNightUrl)) {
            return paymentMethodNightUrl;
        }
        return null;
    }

    public final java.lang.String copydefault(OrderDetailBean orderDetailBean) {
        if (C33492mxV.OLrzqt()) {
            return orderDetailBean.getChannelIconNight();
        }
        return orderDetailBean.getChannelIcon();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x03a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(OrderDetailBean orderDetailBean) {
        android.graphics.drawable.Drawable drawableOLrzqt;
        java.lang.String strCopydefault;
        java.lang.String upperCase;
        java.lang.String preExchangeRate;
        java.lang.String localized$default;
        java.lang.String exchangeRate;
        java.lang.String convertBaseCurrency;
        java.lang.String convertBaseAmount;
        AbstractC31607lxi abstractC31607lxi = this.EZpvd.fIwbmz;
        OKRemoteImageResource oKRemoteImageResource = OKRemoteImageResource.copydefault;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zAEQbTJ = oKRemoteImageResource.AEQbTJ(context);
        abstractC31607lxi.KWHzl.setVisibility(0);
        abstractC31607lxi.AuCTel.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fjfviF));
        ConvertOrderDetailBean convertOrderDetail = orderDetailBean.getConvertOrderDetail();
        java.lang.String strValueOf = java.lang.String.valueOf(convertOrderDetail != null ? convertOrderDetail.getConvertBaseCurrency() : null);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase2 = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (upperCase2 == null) {
            upperCase2 = "";
        }
        android.widget.TextView textView = abstractC31607lxi.djBIcL;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setText(C33069mpW.KWHzl(context2, C31351lsQ.Activity.fERRXa, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, upperCase2))));
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(mDC.StateListAnimator.AhwBna);
        if (drawableKWHzl != null) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawableOLrzqt = C33057mpK.OLrzqt(drawableKWHzl, context3, C52761wXj.Activity.TarCU);
        } else {
            drawableOLrzqt = null;
        }
        abstractC31607lxi.gEmmrt.AEQbTJ.setBackground(drawableOLrzqt);
        abstractC31607lxi.gEmmrt.copydefault.setText("1");
        abstractC31607lxi.AhwBna.copydefault.setText("2");
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(mDC.StateListAnimator.AhwBna);
        if (orderDetailBean.getStatus() == HistoryOrderStatus.COMPLETED.getValue()) {
            ConvertOrderDetailBean convertOrderDetail2 = orderDetailBean.getConvertOrderDetail();
            java.lang.Integer numValueOf = convertOrderDetail2 != null ? java.lang.Integer.valueOf(convertOrderDetail2.getOrderStatus()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView2 = abstractC31607lxi.djBIcL;
                int i = C52761wXj.Activity.ULRxlR;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                textView2.setTextColor(C33070mpX.OLrzqt(i, context4));
                ConstraintLayout constraintLayout = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout.setBackground(drawableKWHzl2);
            } else if (numValueOf != null && numValueOf.intValue() == -1) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView3 = abstractC31607lxi.djBIcL;
                int i2 = C52761wXj.Activity.ULRxlR;
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                textView3.setTextColor(C33070mpX.OLrzqt(i2, context5));
                ConstraintLayout constraintLayout2 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout2.setBackground(drawableKWHzl2);
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_FINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView4 = abstractC31607lxi.djBIcL;
                int i3 = C52761wXj.Activity.TarCU;
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                textView4.setTextColor(C33070mpX.OLrzqt(i3, context6));
                ConstraintLayout constraintLayout3 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.TarCU));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout3.setBackground(drawableKWHzl2);
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView5 = abstractC31607lxi.djBIcL;
                int i4 = C52761wXj.Activity.ULRxlR;
                android.content.Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                textView5.setTextColor(C33070mpX.OLrzqt(i4, context7));
                ConstraintLayout constraintLayout4 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout4.setBackground(drawableKWHzl2);
            } else {
                Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
                android.widget.TextView textView6 = abstractC31607lxi.djBIcL;
                int i5 = C52761wXj.Activity.ULRxlR;
                android.content.Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                textView6.setTextColor(C33070mpX.OLrzqt(i5, context8));
                ConstraintLayout constraintLayout5 = abstractC31607lxi.AhwBna.AEQbTJ;
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
                } else {
                    drawableKWHzl2 = null;
                }
                constraintLayout5.setBackground(drawableKWHzl2);
            }
        } else {
            Glide.AEQbTJ(getContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.CONVERT_PROGRESS_UNFINISHED, zAEQbTJ)).EZpvd(abstractC31607lxi.AYXKKw);
            android.widget.TextView textView7 = abstractC31607lxi.djBIcL;
            int i6 = C52761wXj.Activity.ULRxlR;
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            textView7.setTextColor(C33070mpX.OLrzqt(i6, context9));
            ConstraintLayout constraintLayout6 = abstractC31607lxi.AhwBna.AEQbTJ;
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.ULRxlR));
            } else {
                drawableKWHzl2 = null;
            }
            constraintLayout6.setBackground(drawableKWHzl2);
        }
        android.widget.TextView textView8 = abstractC31607lxi.values;
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY) && orderDetailBean.getDexOrderDetail() == null) {
            strCopydefault = ((InterfaceC31780mDq) C43248rlh.KWHzl.AEQbTJ(InterfaceC31780mDq.class)).copydefault(new C31775mDl(orderDetailBean.getBaseCurrencySymbol(), AmountDisplayType.DETAIL, C33129mqd.EZpvd(orderDetailBean.getBaseAmount()), false, null, null, 56, null));
        } else {
            java.lang.String strCopydefault2 = C31661lzi.copydefault(orderDetailBean.getBaseAmount(), false);
            java.lang.String upperCase3 = orderDetailBean.getBaseCurrencySymbol().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "");
            strCopydefault = strCopydefault2 + " " + upperCase3;
        }
        textView8.setText(strCopydefault);
        android.widget.TextView textView9 = abstractC31607lxi.valueOf;
        android.content.Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        int i7 = C31351lsQ.Activity.igXuih;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String strCopydefault3 = C31661lzi.copydefault(orderDetailBean.getBaseAmount(), false);
        java.lang.String upperCase4 = orderDetailBean.getBaseCurrencySymbol().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
        pairArr[0] = C56390yDp.OLrzqt("usdtamount", strCopydefault3 + " " + upperCase4);
        ConvertOrderDetailBean convertOrderDetail3 = orderDetailBean.getConvertOrderDetail();
        java.lang.String strCopydefault4 = (convertOrderDetail3 == null || (convertBaseAmount = convertOrderDetail3.getConvertBaseAmount()) == null) ? null : C31661lzi.copydefault(convertBaseAmount, false);
        ConvertOrderDetailBean convertOrderDetail4 = orderDetailBean.getConvertOrderDetail();
        if (convertOrderDetail4 == null || (convertBaseCurrency = convertOrderDetail4.getConvertBaseCurrency()) == null) {
            upperCase = null;
        } else {
            upperCase = convertBaseCurrency.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        }
        pairArr[1] = C56390yDp.OLrzqt("cryptoamount", strCopydefault4 + " " + upperCase);
        textView9.setText(C33069mpW.KWHzl(context10, i7, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)));
        android.widget.TextView textView10 = abstractC31607lxi.AkhnZx;
        java.lang.String strCopydefault5 = C31661lzi.copydefault(orderDetailBean.getPrice(), false);
        java.lang.String upperCase5 = orderDetailBean.getQuoteCurrencySymbol().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
        textView10.setText(strCopydefault5 + " " + upperCase5 + " ≈ 1 " + orderDetailBean.getBaseCurrencySymbol());
        ConvertOrderDetailBean convertOrderDetail5 = orderDetailBean.getConvertOrderDetail();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (convertOrderDetail5 != null ? convertOrderDetail5.getExchangeRate() : null))) {
            ConvertOrderDetailBean convertOrderDetail6 = orderDetailBean.getConvertOrderDetail();
            localized$default = (convertOrderDetail6 == null || (exchangeRate = convertOrderDetail6.getExchangeRate()) == null) ? null : pTB.formatLocalized$default(exchangeRate, null, 1, null);
        } else {
            ConvertOrderDetailBean convertOrderDetail7 = orderDetailBean.getConvertOrderDetail();
            if (convertOrderDetail7 != null && (preExchangeRate = convertOrderDetail7.getPreExchangeRate()) != null) {
                localized$default = pTB.formatLocalized$default(preExchangeRate, null, 1, null);
            }
        }
        android.widget.TextView textView11 = abstractC31607lxi.fetchVPNInfo;
        java.lang.String upperCase6 = orderDetailBean.getBaseCurrencySymbol().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase6, "");
        ConvertOrderDetailBean convertOrderDetail8 = orderDetailBean.getConvertOrderDetail();
        textView11.setText(localized$default + " " + upperCase6 + " ≈ 1 " + (convertOrderDetail8 != null ? convertOrderDetail8.getConvertBaseCurrency() : null));
    }

    public final boolean OLrzqt(OrderDetailBean orderDetailBean) {
        return orderDetailBean.getPaymentMethod().length() > 0 || EZpvd(orderDetailBean) != null || Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode());
    }

    public final java.lang.String KWHzl(java.lang.Long l, java.lang.Long l2) {
        long jEZpvd = EZpvd(l, l2);
        if (jEZpvd <= -1) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.awiJhF);
        }
        return pTA.formatSimpleDate$default(new Date(jEZpvd), null, 1, null);
    }

    public final long EZpvd(java.lang.Long l, java.lang.Long l2) {
        if (l == null || l.longValue() <= -1) {
            l = null;
        }
        if (l2 == null || l2.longValue() <= -1) {
            l2 = null;
        }
        if (l != null && l2 != null) {
            return java.lang.Math.max(l.longValue(), l2.longValue());
        }
        if (l != null) {
            return l.longValue();
        }
        if (l2 != null) {
            return l2.longValue();
        }
        return -1L;
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(context), BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("special", java.lang.Boolean.TRUE)), null, 4, null);
    }

    /* JADX INFO: renamed from: o.lTt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lTt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
