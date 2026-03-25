package o;

import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46876tfT {
    public static final boolean OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        java.util.List<PaymentMethod> paymentMethods;
        Intrinsics.checkNotNullParameter(channel, "");
        boolean z2 = Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.CARD.getCode()) || Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode()) || (Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode()) && ((paymentMethods = channel.getPaymentMethods()) == null || paymentMethods.isEmpty())) || Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.CARDPAYMENT.getCode());
        return z ? EZpvd(channel) && z2 : z2;
    }

    public static final boolean copydefault(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        java.util.List<PaymentMethod> paymentMethods;
        Intrinsics.checkNotNullParameter(channel, "");
        return Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.CARD.getCode()) || Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode()) || !(!Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode()) || (paymentMethods = channel.getPaymentMethods()) == null || paymentMethods.isEmpty()) || Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.CARDPAYMENT.getCode());
    }

    public static final boolean EZpvd(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getSupportedOrderTypes() != null && channel.getSupportedOrderTypes().contains("recurring");
    }

    public static final BigDecimal KWHzl(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(channel, "");
        java.lang.String maxLimitAmount = channel.getMaxLimitAmount();
        int length = maxLimitAmount.length();
        java.lang.Double dValueOf = java.lang.Double.valueOf(Double.MAX_VALUE);
        BigDecimal bigDecimalEZpvd2 = length == 0 ? C33129mqd.EZpvd(dValueOf) : C33129mqd.EZpvd(maxLimitAmount);
        java.lang.String availableAmount = channel.getAvailableAmount();
        if (availableAmount.length() == 0) {
            bigDecimalEZpvd = C33129mqd.EZpvd(dValueOf);
        } else {
            bigDecimalEZpvd = C33129mqd.EZpvd(availableAmount);
        }
        BigDecimal bigDecimalMin = bigDecimalEZpvd2.min(bigDecimalEZpvd);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMin, "");
        return bigDecimalMin;
    }
}
