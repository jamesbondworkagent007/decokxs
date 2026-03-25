package o;

import com.okinc.buysell.data.AccountStatus;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31662lzj {
    public static final boolean EZpvd(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getCategoryCode() == ChannelCategoryCode.NATIVE && Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.CARD.getCode());
    }

    public static final boolean AEQbTJ(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getCategoryCode() == ChannelCategoryCode.BALANCE && Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.BALANCE.getCode());
    }

    public static final boolean OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return AEQbTJ(channel) && channel.getPaymentMethodCategory() == PaymentMethodCategory.CASH;
    }

    public static final boolean djBIcL(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return AEQbTJ(channel) && gEmmrt(channel);
    }

    public static final boolean gEmmrt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getPaymentMethodCategory() == PaymentMethodCategory.STABLECOIN;
    }

    public static final boolean AhwBna(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getPaymentMethodCategory() == PaymentMethodCategory.CRYPTO;
    }

    public static final boolean valueOf(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getCategoryCode() == ChannelCategoryCode.THIRD_PARTY;
    }

    public static final boolean KWHzl(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getCategoryCode() == ChannelCategoryCode.NATIVE && Intrinsics.EZpvd((java.lang.Object) channel.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode());
    }

    public static final boolean AYXKKw(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return channel.getCategoryCode() == ChannelCategoryCode.NATIVE && KWHzl(channel.getDepositPlatformCode());
    }

    public static final LinkedHashMap<java.lang.String, java.lang.String> copydefault(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        java.lang.String maxChannelLimit;
        Intrinsics.checkNotNullParameter(channel, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.gSBher);
        LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap = new LinkedHashMap<>();
        TradeLimit tradeLimit = channel.getTradeLimit();
        if (tradeLimit != null && (maxChannelLimit = tradeLimit.getMaxChannelLimit()) != null) {
            linkedHashMap.put(strAYXKKw, maxChannelLimit);
        }
        LimitInfo limitInfo = channel.getLimitInfo();
        if (limitInfo != null) {
            if (!limitInfo.getUnlimitedDailyLimit()) {
                linkedHashMap.put(C33070mpX.AYXKKw(C31351lsQ.Activity.aJFbMH), limitInfo.getDailyLimit());
            }
            if (!limitInfo.getUnlimitedWeeklyLimit()) {
                linkedHashMap.put(C33070mpX.AYXKKw(C31351lsQ.Activity.akftKQ), limitInfo.getWeeklyLimit());
            }
            if (!limitInfo.getUnlimitedMonthlyLimit()) {
                linkedHashMap.put(C33070mpX.AYXKKw(C31351lsQ.Activity.alsFma), limitInfo.getMonthlyLimit());
            }
            if (!limitInfo.getUnlimitedSingleTransactionMax()) {
                linkedHashMap.put(C33070mpX.AYXKKw(C31351lsQ.Activity.aHXSQp), limitInfo.getSingleTransactionMax());
            }
        }
        return linkedHashMap;
    }

    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ChannelPlatformCode.DEPOSIT_PAYPAL.getCode());
    }

    public static final boolean OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Account account) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(account, "");
        java.lang.String status = account.getStatus();
        if (status != null) {
            lowerCase = status.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        return Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) AccountStatus.INACTIVE.getValue());
    }

    public static final boolean copydefault(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Account account) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(account, "");
        java.lang.String status = account.getStatus();
        if (status != null) {
            lowerCase = status.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        return Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) AccountStatus.REQUIRES_VERIFICATION.getValue());
    }

    public static final boolean KWHzl(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Account account) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(account, "");
        java.lang.String status = account.getStatus();
        if (status != null) {
            lowerCase = status.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        return Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) AccountStatus.DISCONNECTED.getValue());
    }
}
