package o;

import androidx.camera.video.AudioStats;
import com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData;
import com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder;
import com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderItemBean;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lPp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30201lPp {
    public static final FiatThirdPartyOrder KWHzl(@NotNull FiatOrderItemBean fiatOrderItemBean) {
        Intrinsics.checkNotNullParameter(fiatOrderItemBean, "");
        java.lang.String baseAmount = fiatOrderItemBean.getBaseAmount();
        java.lang.String baseCurrencySymbol = fiatOrderItemBean.getBaseCurrencySymbol();
        long createDate = fiatOrderItemBean.getCreateDate();
        int expireSeconds = fiatOrderItemBean.getExpireSeconds();
        java.lang.String orderNo = fiatOrderItemBean.getOrderNo();
        java.lang.String price = fiatOrderItemBean.getPrice();
        java.lang.String quoteAmount = fiatOrderItemBean.getQuoteAmount();
        java.lang.String quoteCurrencySymbol = fiatOrderItemBean.getQuoteCurrencySymbol();
        int status = fiatOrderItemBean.getStatus();
        TradeType tradeTypeCopydefault = copydefault(fiatOrderItemBean.getType());
        java.lang.String depositName = fiatOrderItemBean.getDepositName();
        java.lang.String icon = fiatOrderItemBean.getIcon();
        java.lang.String iconNight = fiatOrderItemBean.getIconNight();
        java.lang.String url = fiatOrderItemBean.getUrl();
        java.lang.String chainUrl = fiatOrderItemBean.getChainUrl();
        boolean zIsConvert = fiatOrderItemBean.isConvert();
        java.lang.String payCardNumber = fiatOrderItemBean.getPayCardNumber();
        java.lang.String paymentMethod = fiatOrderItemBean.getPaymentMethod();
        ConvertOrderDetailBean convertOrderDetail = fiatOrderItemBean.getConvertOrderDetail();
        return new FiatThirdPartyOrder(baseAmount, baseCurrencySymbol, createDate, expireSeconds, orderNo, price, quoteAmount, quoteCurrencySymbol, status, tradeTypeCopydefault, depositName, icon, iconNight, url, chainUrl, zIsConvert, payCardNumber, paymentMethod, convertOrderDetail != null ? AEQbTJ(convertOrderDetail) : null, fiatOrderItemBean.getPaymentMethodUrl(), fiatOrderItemBean.getPaymentMethodNightUrl(), fiatOrderItemBean.getDepositPlatformCode());
    }

    public static final ConvertOrderDetailData AEQbTJ(@NotNull ConvertOrderDetailBean convertOrderDetailBean) {
        Intrinsics.checkNotNullParameter(convertOrderDetailBean, "");
        return new ConvertOrderDetailData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, convertOrderDetailBean.getConvertBaseAmount(), convertOrderDetailBean.getConvertBaseCurrency(), (java.lang.String) null, (java.lang.String) null, convertOrderDetailBean.getOrderStatus(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0L, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) null, 0, 0, 0, 4193695, (DefaultConstructorMarker) null);
    }

    public static final TradeType copydefault(@NotNull java.lang.String str) {
        TradeType tradeType;
        Intrinsics.checkNotNullParameter(str, "");
        TradeType[] tradeTypeArrValues = TradeType.values();
        int length = tradeTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                tradeType = null;
                break;
            }
            tradeType = tradeTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) tradeType.getType(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return tradeType == null ? TradeType.BUY : tradeType;
    }
}
