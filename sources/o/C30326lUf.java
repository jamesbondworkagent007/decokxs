package o;

import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lUf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30326lUf {
    public static final C30326lUf KWHzl = new C30326lUf();

    /* JADX INFO: renamed from: o.lUf$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelCategoryCode.values().length];
            try {
                iArr[ChannelCategoryCode.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelCategoryCode.NATIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelCategoryCode.THIRD_PARTY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    private C30326lUf() {
    }

    public final java.lang.String AEQbTJ(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod, boolean z, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(str, "");
        ChannelCategoryCode categoryCode = channel != null ? channel.getCategoryCode() : null;
        int i2 = categoryCode == null ? -1 : Activity.KWHzl[categoryCode.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? "" : AEQbTJ(channel, i, str);
        }
        return EZpvd(channel, paymentMethod, z, i, str);
    }

    public final java.lang.String EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, boolean z, int i, java.lang.String str) {
        java.lang.String availableBalance;
        com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
        if (account == null || (availableBalance = account.getAvailableBalance()) == null) {
            availableBalance = "0";
        }
        java.lang.String str2 = availableBalance;
        return C31662lzj.gEmmrt(channel) ? AEQbTJ(channel, str2, z, i, str) : (!C31662lzj.AhwBna(channel) || z) ? KWHzl(channel, str2, z, i, str) : copydefault(channel, str2);
    }

    public final java.lang.String AEQbTJ(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, java.lang.String str, boolean z, int i, java.lang.String str2) {
        if (z) {
            channel.getSupportCurrencyInfo().getPeggedCurrencyScale();
            return C31661lzi.prependFiatSymbol$default(str, channel.getSupportCurrencyInfo().getPeggedCurrency(), str2, null, RoundingMode.DOWN, false, 20, null);
        }
        return C31661lzi.appendCryptoSymbol$default(str, channel.getSupportCurrency(), 0, C38307pTy.Companion.KWHzl(0, i), null, null, 26, null);
    }

    public final java.lang.String copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, java.lang.String str) {
        return C31661lzi.appendCryptoSymbol$default(str, channel.getSupportCurrency(), 0, null, null, null, 30, null);
    }

    public final java.lang.String KWHzl(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, java.lang.String str, boolean z, int i, java.lang.String str2) {
        java.lang.String supportCurrency;
        if (z) {
            supportCurrency = channel.getSupportCurrencyInfo().getPeggedCurrency();
        } else {
            supportCurrency = channel.getSupportCurrency();
        }
        return C31661lzi.prependFiatSymbol$default(str, supportCurrency, str2, null, RoundingMode.DOWN, false, 20, null);
    }

    public final java.lang.String AEQbTJ(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, int i, java.lang.String str) {
        java.lang.String maxChannelLimit;
        TradeLimit tradeLimit = channel.getTradeLimit();
        if (tradeLimit == null || (maxChannelLimit = tradeLimit.getMaxChannelLimit()) == null) {
            maxChannelLimit = "0";
        }
        return C31661lzi.prependFiatSymbol$default(maxChannelLimit, channel.getSupportCurrency(), str, null, null, false, 28, null);
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return false;
        }
        java.lang.String strCopydefault = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).copydefault();
        java.util.Iterator<com.okinc.okpaymentapi.data.remote.model.management.Channel> it = list.iterator();
        while (it.hasNext()) {
            if (C59449zhJ.gEmmrt(it.next().getSupportCurrency(), str, true)) {
                return C59449zhJ.gEmmrt(strCopydefault, str, true);
            }
        }
        return false;
    }

    public static /* synthetic */ java.lang.String getPaymentMethodDisplay$default(C30326lUf c30326lUf, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c30326lUf.OLrzqt(channel, paymentMethod, z);
    }

    public final java.lang.String OLrzqt(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod, boolean z) {
        java.lang.String quoteCurrency;
        java.lang.String brand;
        java.lang.String bankName;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        ChannelCategoryCode categoryCode = channel != null ? channel.getCategoryCode() : null;
        int i = categoryCode == null ? -1 : Activity.KWHzl[categoryCode.ordinal()];
        if (i == 1) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) channel.getSupportCurrency())) {
                quoteCurrency = channel.getSupportCurrency();
            } else {
                quoteCurrency = channel.getQuoteCurrency();
            }
            java.lang.String str = quoteCurrency;
            return z ? (C31662lzj.gEmmrt(channel) || C31662lzj.AhwBna(channel)) ? str : C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.gCZUJG), C56423yEv.EZpvd(C56390yDp.OLrzqt("fiatName", str))) : channel.getChangeDisplay() ? channel.getDisplayName() : channel.getDepositName();
        }
        if (i == 2) {
            java.lang.String depositPlatformCode = channel.getDepositPlatformCode();
            if (!Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode())) {
                    com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
                    if (account != null && (bankName = account.getBankName()) != null && bankName.length() > 0) {
                        com.okinc.okpaymentapi.data.remote.model.management.Account account2 = paymentMethod.getAccount();
                        java.lang.String bankName2 = account2 != null ? account2.getBankName() : null;
                        com.okinc.okpaymentapi.data.remote.model.management.Account account3 = paymentMethod.getAccount();
                        return bankName2 + " " + (account3 != null ? account3.getLast4() : null);
                    }
                    java.lang.String paymentMethod2 = paymentMethod.getPaymentMethod();
                    com.okinc.okpaymentapi.data.remote.model.management.Account account4 = paymentMethod.getAccount();
                    return paymentMethod2 + " " + (account4 != null ? account4.getLast4() : null);
                }
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode())) {
                    return channel.getDisplayName();
                }
                com.okinc.okpaymentapi.data.remote.model.management.Account account5 = paymentMethod.getAccount();
                if (account5 != null && (brand = account5.getBrand()) != null && brand.length() > 0) {
                    com.okinc.okpaymentapi.data.remote.model.management.Account account6 = paymentMethod.getAccount();
                    java.lang.String brand2 = account6 != null ? account6.getBrand() : null;
                    com.okinc.okpaymentapi.data.remote.model.management.Account account7 = paymentMethod.getAccount();
                    return brand2 + " " + (account7 != null ? account7.getLast4() : null);
                }
                java.lang.String paymentMethod3 = paymentMethod.getPaymentMethod();
                com.okinc.okpaymentapi.data.remote.model.management.Account account8 = paymentMethod.getAccount();
                return paymentMethod3 + " " + (account8 != null ? account8.getLast4() : null);
            }
            if (z) {
                com.okinc.okpaymentapi.data.remote.model.management.Account account9 = paymentMethod.getAccount();
                java.lang.String accountNumber = account9 != null ? account9.getAccountNumber() : null;
                if (accountNumber != null && accountNumber.length() > 0) {
                    depositName = accountNumber;
                }
                if (depositName == null) {
                    return channel.getDisplayName();
                }
            } else {
                return channel.getDisplayName();
            }
        } else {
            java.lang.String displayName = channel != null ? channel.getDisplayName() : null;
            if (channel == null || !channel.getChangeDisplay()) {
                displayName = null;
            }
            if (displayName != null) {
                return displayName;
            }
            depositName = channel != null ? channel.getDepositName() : null;
            if (depositName == null) {
                return "";
            }
        }
        return depositName;
    }

    public final java.lang.String copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        if (channel != null) {
            return Activity.KWHzl[channel.getCategoryCode().ordinal()] == 2 ? C33492mxV.OLrzqt() ? paymentMethod.getIconUrlNight() : paymentMethod.getIconUrl() : channel.getChangeDisplay() ? C33492mxV.OLrzqt() ? channel.getDisplayIconUrlNight() : channel.getDisplayIconUrl() : C33492mxV.OLrzqt() ? channel.getIconUrlNight() : channel.getIconUrl();
        }
        return C33492mxV.OLrzqt() ? paymentMethod.getIconUrlNight() : paymentMethod.getIconUrl();
    }

    public final java.lang.String copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        return channel != null ? channel.getChangeDisplay() ? C33492mxV.OLrzqt() ? channel.getDisplayIconUrlNight() : channel.getDisplayIconUrl() : C33492mxV.OLrzqt() ? channel.getIconUrlNight() : channel.getIconUrl() : "";
    }

    public final java.lang.String EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        ChannelCategoryCode categoryCode = channel != null ? channel.getCategoryCode() : null;
        int i = categoryCode == null ? -1 : Activity.KWHzl[categoryCode.ordinal()];
        if (i != 1) {
            return i != 2 ? "" : C33070mpX.AYXKKw(C31351lsQ.Activity.QSLkRj);
        }
        if (((sxI) C43251rlk.copydefault(sxI.class)).AEQbTJ() && C34703nhO.AEQbTJ()) {
            return C33070mpX.AYXKKw(C31351lsQ.Activity.DLWbHP);
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.QCjLjM);
    }

    public final boolean copydefault(java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        java.util.List<PaymentMethod> paymentMethods;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (com.okinc.okpaymentapi.data.remote.model.management.Channel channel : list) {
            if (C46876tfT.OLrzqt(channel, false) && (paymentMethods = channel.getPaymentMethods()) != null && !paymentMethods.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
