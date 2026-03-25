package o;

import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean;
import com.okinc.crcore.shared.net.responsebean.bsc.EarnOptionBean;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.InformationBox;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo;
import com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31667lzo {
    public static final boolean valueOf(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        return !tradeSuggestionBean.getPaymentChannels().isEmpty();
    }

    public static final boolean KWHzl(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        java.util.List<ChannelBean> paymentChannels = tradeSuggestionBean.getPaymentChannels();
        if (!(paymentChannels instanceof java.util.Collection) || !paymentChannels.isEmpty()) {
            java.util.Iterator<T> it = paymentChannels.iterator();
            while (it.hasNext()) {
                if (((ChannelBean) it.next()).getCategoryCode().getCode() == ChannelCategoryCode.BALANCE.getCode()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final java.lang.String OLrzqt(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        return tradeSuggestionBean.getBaseCurrency().getAvailableBalance();
    }

    public static final java.lang.String copydefault(@NotNull TradeSuggestionBean tradeSuggestionBean, @NotNull java.lang.String str) {
        java.util.List<PaymentMethod> paymentMethods;
        PaymentMethod paymentMethod;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelKWHzl = KWHzl(tradeSuggestionBean, str);
        java.lang.String availableBalance = (channelKWHzl == null || (paymentMethods = channelKWHzl.getPaymentMethods()) == null || (paymentMethod = (PaymentMethod) CollectionsKt___CollectionsKt.firstOrNull(paymentMethods)) == null || (account = paymentMethod.getAccount()) == null) ? null : account.getAvailableBalance();
        return availableBalance == null ? "" : availableBalance;
    }

    public static final java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> copydefault(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> listAEQbTJ = AEQbTJ(tradeSuggestionBean);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.okinc.okpaymentapi.data.remote.model.management.Channel channel : listAEQbTJ) {
            java.util.List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
            if (paymentMethods == null) {
                paymentMethods = yDY.AhwBna();
            }
            for (PaymentMethod paymentMethod : paymentMethods) {
                if (C31662lzj.OLrzqt(channel)) {
                    arrayList.add(channel);
                }
            }
        }
        return arrayList;
    }

    public static final com.okinc.okpaymentapi.data.remote.model.management.Channel KWHzl(TradeSuggestionBean tradeSuggestionBean, java.lang.String str) {
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> listAEQbTJ = AEQbTJ(tradeSuggestionBean);
        java.lang.Object obj = null;
        if (tradeSuggestionBean.getMultipleCurrencyEnabled()) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) next;
                if (channel.getCategoryCode() == ChannelCategoryCode.BALANCE && Intrinsics.EZpvd((java.lang.Object) channel.getSupportCurrency(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            return (com.okinc.okpaymentapi.data.remote.model.management.Channel) obj;
        }
        java.util.Iterator<T> it2 = listAEQbTJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (((com.okinc.okpaymentapi.data.remote.model.management.Channel) next2).getCategoryCode() == ChannelCategoryCode.BALANCE) {
                obj = next2;
                break;
            }
        }
        return (com.okinc.okpaymentapi.data.remote.model.management.Channel) obj;
    }

    public static /* synthetic */ com.okinc.okpaymentapi.data.remote.model.management.Channel getMatchedOrFirstChannel$default(TradeSuggestionBean tradeSuggestionBean, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return EZpvd(tradeSuggestionBean, channel, paymentMethod, z);
    }

    public static final com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd(@NotNull TradeSuggestionBean tradeSuggestionBean, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, boolean z) {
        java.lang.String lowerCase;
        java.util.List arrayList;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel2;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        java.lang.String depositName;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> listAEQbTJ = AEQbTJ(tradeSuggestionBean);
        if (listAEQbTJ.isEmpty()) {
            return new com.okinc.okpaymentapi.data.remote.model.management.Channel((TradingAgentInfo) null, (java.lang.String) null, false, (java.lang.String) null, (ChannelCategoryCode) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (B2CExtCollectInfo) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, false, (PaymentMethodCategory) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (TermContentChannel) null, (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (java.lang.String) null, (java.lang.String) null, (TradeLimit) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, false, (java.lang.String) null, false, (SupportCurrencyInfo) null, (java.lang.Integer) null, (EarnOption) null, (java.util.List) null, (java.lang.String) null, false, false, -1, -1, 16383, (DefaultConstructorMarker) null);
        }
        java.lang.Object obj = null;
        if (channel == null || (depositName = channel.getDepositName()) == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) depositName).toString()) == null) {
            lowerCase = null;
        } else {
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        java.lang.String str = lowerCase != null ? lowerCase : "";
        java.lang.String supportCurrency = channel != null ? channel.getSupportCurrency() : null;
        java.lang.String paymentAccountId = (paymentMethod == null || (account = paymentMethod.getAccount()) == null) ? null : account.getPaymentAccountId();
        if (z) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listAEQbTJ) {
                if (C46876tfT.EZpvd((com.okinc.okpaymentapi.data.remote.model.management.Channel) obj2)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = listAEQbTJ;
        }
        if (z && (channel == null || !C46876tfT.EZpvd(channel))) {
            channel2 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.okinc.okpaymentapi.data.remote.model.management.Channel channel3 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) next;
                if (copydefault(channel3, str) && AEQbTJ(channel3, supportCurrency) && KWHzl(channel3, paymentAccountId)) {
                    obj = next;
                    break;
                }
            }
            channel2 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) obj;
        }
        return channel2 == null ? (com.okinc.okpaymentapi.data.remote.model.management.Channel) CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ) : channel2;
    }

    public static final boolean copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, java.lang.String str) {
        java.lang.String lowerCase;
        java.lang.String string;
        java.lang.String depositName = channel.getDepositName();
        if (depositName == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) depositName).toString()) == null) {
            lowerCase = null;
        } else {
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            lowerCase = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        return Intrinsics.EZpvd((java.lang.Object) (lowerCase != null ? lowerCase : ""), (java.lang.Object) str);
    }

    public static final boolean AEQbTJ(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) channel.getSupportCurrency(), (java.lang.Object) str);
    }

    public static final boolean KWHzl(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, java.lang.String str) {
        java.util.List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
        if (paymentMethods != null && !paymentMethods.isEmpty()) {
            java.util.Iterator<T> it = paymentMethods.iterator();
            while (it.hasNext()) {
                com.okinc.okpaymentapi.data.remote.model.management.Account account = ((PaymentMethod) it.next()).getAccount();
                if (Intrinsics.EZpvd((java.lang.Object) (account != null ? account.getPaymentAccountId() : null), (java.lang.Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean AEQbTJ(@NotNull TradeSuggestionBean tradeSuggestionBean, @NotNull java.lang.String str) {
        java.util.List<PaymentMethod> paymentMethods;
        PaymentMethod paymentMethod;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelKWHzl = KWHzl(tradeSuggestionBean, str);
        return Intrinsics.EZpvd((java.lang.Object) ((channelKWHzl == null || (paymentMethods = channelKWHzl.getPaymentMethods()) == null || (paymentMethod = (PaymentMethod) CollectionsKt___CollectionsKt.firstOrNull(paymentMethods)) == null || (account = paymentMethod.getAccount()) == null) ? null : account.getBalanceAccountType()), (java.lang.Object) BalanceAccountType.TRADING.getValue());
    }

    public static final java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> AEQbTJ(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        java.util.List<ChannelBean> paymentChannels = tradeSuggestionBean.getPaymentChannels();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(paymentChannels, 10));
        java.util.Iterator<T> it = paymentChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(lyC.AEQbTJ.AEQbTJ((ChannelBean) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> EZpvd(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        java.util.ArrayList arrayList;
        java.lang.String availableBalance;
        PaymentMethod paymentMethod;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> listAEQbTJ = AEQbTJ(tradeSuggestionBean);
        if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
            for (com.okinc.okpaymentapi.data.remote.model.management.Channel channel : listAEQbTJ) {
                if (channel.getCategoryCode() != ChannelCategoryCode.BALANCE || channel.getPaymentMethodCategory() != PaymentMethodCategory.CASH) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listAEQbTJ) {
                        com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) obj;
                        if (channel2.getCategoryCode() == ChannelCategoryCode.BALANCE) {
                            java.util.List<PaymentMethod> paymentMethods = channel2.getPaymentMethods();
                            if (paymentMethods == null || (paymentMethod = (PaymentMethod) CollectionsKt___CollectionsKt.firstOrNull(paymentMethods)) == null || (account = paymentMethod.getAccount()) == null || (availableBalance = account.getAvailableBalance()) == null) {
                                availableBalance = "0";
                            }
                            if (C33129mqd.copydefault(availableBalance, channel2.getMinLimitAmount())) {
                                arrayList.add(obj);
                            }
                        } else {
                            if (channel2.getPaymentMethods() != null && (!r3.isEmpty()) && C33129mqd.copydefault(channel2.getAvailableAmount(), channel2.getMinLimitAmount())) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
            }
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listAEQbTJ) {
                com.okinc.okpaymentapi.data.remote.model.management.Channel channel3 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) obj2;
                if (channel3.getCategoryCode() != ChannelCategoryCode.BALANCE && C33129mqd.copydefault(channel3.getAvailableAmount(), channel3.getMinLimitAmount())) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = new java.util.ArrayList();
            while (r5.hasNext()) {
            }
        }
        return arrayList;
    }

    public static final CurrencyToken AYXKKw(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        EarnOptionBean earnOption;
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        java.lang.String availableBalance = tradeSuggestionBean.getBaseCurrency().getAvailableBalance();
        boolean zKWHzl = KWHzl(tradeSuggestionBean);
        java.util.List listAhwBna = yDY.AhwBna();
        java.lang.String currency = tradeSuggestionBean.getBaseCurrency().getCurrency();
        java.lang.String currencyId = tradeSuggestionBean.getBaseCurrency().getCurrencyId();
        java.lang.String currencyName = tradeSuggestionBean.getBaseCurrency().getCurrencyName();
        java.lang.String displayName = tradeSuggestionBean.getBaseCurrency().getDisplayName();
        java.lang.String icon = tradeSuggestionBean.getBaseCurrency().getIcon();
        java.lang.String nightIcon = tradeSuggestionBean.getBaseCurrency().getNightIcon();
        int scale = tradeSuggestionBean.getBaseCurrency().getScale();
        java.lang.String symbol = tradeSuggestionBean.getBaseCurrency().getSymbol();
        double usdRate = tradeSuggestionBean.getBaseCurrency().getUsdRate();
        ChannelBean channelBean = (ChannelBean) CollectionsKt___CollectionsKt.firstOrNull(tradeSuggestionBean.getPaymentChannels());
        return new CurrencyToken(availableBalance, zKWHzl, listAhwBna, currency, currencyId, currencyName, displayName, false, icon, nightIcon, 0, (java.util.List) null, scale, symbol, "", usdRate, "", (java.lang.String) null, (java.lang.String) null, (channelBean == null || (earnOption = channelBean.getEarnOption()) == null) ? null : lyC.AEQbTJ.EZpvd(earnOption), (java.util.List) null, (java.lang.String) null, (kotlin.Pair) null, false, false, KWHzl(tradeSuggestionBean.getBaseCurrency().getDexInfoBean()), 32902144, (DefaultConstructorMarker) null);
    }

    public static final DexInfo KWHzl(DexInfoBean dexInfoBean) {
        return new DexInfo(dexInfoBean.getUniqueId(), dexInfoBean.getChainIndex(), dexInfoBean.getChainName(), C33129mqd.gEmmrt(dexInfoBean.getChainLogo()), dexInfoBean.getTokenAddress(), dexInfoBean.getPrice(), C33129mqd.gEmmrt(dexInfoBean.getLiquidity()), C33129mqd.gEmmrt(dexInfoBean.getMarketCap()), dexInfoBean.getRiskLevel(), dexInfoBean.getBalanceTag(), dexInfoBean.getDecimal(), dexInfoBean.getBalance(), dexInfoBean.getBalanceUsd(), dexInfoBean.getCommunityRecognized(), false, (java.lang.String) null, 49152, (DefaultConstructorMarker) null);
    }

    public static final BuySellCurrency AhwBna(@NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        return new BuySellCurrency(copydefault(tradeSuggestionBean, tradeSuggestionBean.getQuoteCurrency().getCurrency()), valueOf(tradeSuggestionBean), yDY.AhwBna(), tradeSuggestionBean.getQuoteCurrency().getCurrency(), tradeSuggestionBean.getQuoteCurrency().getCurrencyId(), tradeSuggestionBean.getQuoteCurrency().getCurrencyName(), tradeSuggestionBean.getQuoteCurrency().getDisplayName(), false, tradeSuggestionBean.getQuoteCurrency().getIcon(), tradeSuggestionBean.getQuoteCurrency().getNightIcon(), 0, (java.util.List) tradeSuggestionBean.getQuoteCurrency().getQuickAmountList(), tradeSuggestionBean.getQuoteCurrency().getScale(), tradeSuggestionBean.getQuoteCurrency().getSymbol(), "", tradeSuggestionBean.getQuoteCurrency().getUsdRate(), "", 1024, (DefaultConstructorMarker) null);
    }
}
