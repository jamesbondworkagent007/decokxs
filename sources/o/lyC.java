package o;

import androidx.camera.video.AudioStats;
import com.okinc.buysell.data.GetBannerResp;
import com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CExtCollectInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.BankingHoursResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.BillingAddressResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.InformationBoxResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LimitInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationHighlightStyleResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrencyInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TermContentChannelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradeLimitResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradingAgentInfo;
import com.okinc.crcore.coreapi.net.responsebean.bsc.UiFlowControlResponseBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.BuySellCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DisplayPageBean;
import com.okinc.crcore.shared.net.responsebean.bsc.EarnOptionBean;
import com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean;
import com.okinc.crcore.shared.net.responsebean.bsc.LocalizedTextBean;
import com.okinc.crcore.shared.net.responsebean.bsc.SupportBannerBean;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.BillingAddress;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.EddLimitLevel;
import com.okinc.okpaymentapi.data.remote.model.management.InformationBox;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizedText;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel;
import com.okinc.okpaymentapi.data.remote.model.management.TermsURLContentData;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl;
import com.okinc.okx.paymentapi.service.DisplayPage;
import com.okinc.okx.paymentapi.service.SupportBanner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyC {
    public static final lyC AEQbTJ = new lyC();

    private lyC() {
    }

    public final ConvertCurrencyBean OLrzqt(@NotNull CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        java.lang.String currency = currencyToken.getCurrency();
        int iAhwBna = C33129mqd.AhwBna(currencyToken.getCurrencyId());
        java.lang.String icon = currencyToken.getIcon();
        java.lang.String availableBalance = currencyToken.getAvailableBalance();
        java.lang.String currencyName = currencyToken.getCurrencyName();
        boolean fiatFlag = currencyToken.getFiatFlag();
        java.lang.String symbol = currencyToken.getSymbol();
        boolean transferable = currencyToken.getTransferable();
        java.lang.String cryptoToLocalCurrencyPrice = currencyToken.getCryptoToLocalCurrencyPrice();
        int scale = currencyToken.getScale();
        double usdRate = currencyToken.getUsdRate();
        EarnOption earnOption = currencyToken.getEarnOption();
        java.lang.String earnRate = earnOption != null ? earnOption.getEarnRate() : null;
        EarnOption earnOption2 = currencyToken.getEarnOption();
        return new ConvertCurrencyBean(currency, iAhwBna, icon, availableBalance, cryptoToLocalCurrencyPrice, currencyName, (java.lang.String) null, 0, java.lang.Boolean.valueOf(fiatFlag), (java.lang.String) null, (java.lang.String) null, false, false, symbol, transferable, scale, java.lang.String.valueOf(usdRate), new com.okinc.crcore.coreapi.net.responsebean.EarnOption(earnRate, earnOption2 != null ? earnOption2.getRewardType() : null), 7872, (DefaultConstructorMarker) null);
    }

    public final CurrencyToken EZpvd(@NotNull ConvertCurrencyBean convertCurrencyBean) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        java.lang.String strMulS$default = C33129mqd.mulS$default(convertCurrencyBean.getAvailable(), convertCurrencyBean.getLocalCurrentPrice(), null, null, null, 14, null);
        java.lang.String localCurrentPrice = convertCurrencyBean.getLocalCurrentPrice();
        java.lang.String available = convertCurrencyBean.getAvailable();
        java.lang.String ccy = convertCurrencyBean.getCcy();
        int ccyId = convertCurrencyBean.getCcyId();
        java.lang.String ccyFullName = convertCurrencyBean.getCcyFullName();
        java.lang.String ccyFullName2 = convertCurrencyBean.getCcyFullName();
        java.lang.String icon = convertCurrencyBean.getIcon();
        java.lang.String icon2 = convertCurrencyBean.getIcon();
        int scale = convertCurrencyBean.getScale();
        int scale2 = convertCurrencyBean.getScale();
        java.lang.Boolean fiatFlag = convertCurrencyBean.getFiatFlag();
        boolean zBooleanValue = fiatFlag != null ? fiatFlag.booleanValue() : false;
        boolean transferable = convertCurrencyBean.getTransferable();
        double dAEQbTJ = C33129mqd.AEQbTJ(convertCurrencyBean.getLocalCurrencyToUsdRate());
        java.lang.String sign = convertCurrencyBean.getSign();
        com.okinc.crcore.coreapi.net.responsebean.EarnOption earnOption = convertCurrencyBean.getEarnOption();
        java.lang.String earnRate = earnOption != null ? earnOption.getEarnRate() : null;
        com.okinc.crcore.coreapi.net.responsebean.EarnOption earnOption2 = convertCurrencyBean.getEarnOption();
        return new CurrencyToken(available, false, (java.util.List) null, ccy, java.lang.String.valueOf(ccyId), ccyFullName, ccyFullName2, false, icon, icon2, scale, (java.util.List) null, scale2, sign, (java.lang.String) null, dAEQbTJ, strMulS$default, localCurrentPrice, (java.lang.String) null, new EarnOption(java.lang.Long.valueOf(C33129mqd.valueOf(java.lang.Integer.valueOf(convertCurrencyBean.getCcyId()))), null, null, null, null, null, null, null, null, null, earnRate, null, null, earnOption2 != null ? earnOption2.getRewardType() : null), (java.util.List) null, (java.lang.String) null, (kotlin.Pair) null, zBooleanValue, transferable, (DexInfo) null, 41175174, (DefaultConstructorMarker) null);
    }

    public final CryptoListModel AEQbTJ(@NotNull CryptoListModelBean cryptoListModelBean) {
        Intrinsics.checkNotNullParameter(cryptoListModelBean, "");
        java.util.List<CurrencyTokenBean> buyCryptoList = cryptoListModelBean.getBuyCryptoList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(buyCryptoList, 10));
        java.util.Iterator<T> it = buyCryptoList.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ.EZpvd((CurrencyTokenBean) it.next()));
        }
        java.util.List<BuySellCurrencyBean> buyCurrencyList = cryptoListModelBean.getBuyCurrencyList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(buyCurrencyList, 10));
        java.util.Iterator<T> it2 = buyCurrencyList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AEQbTJ.copydefault((BuySellCurrencyBean) it2.next()));
        }
        java.util.List<BuySellCurrencyBean> sellCurrencyList = cryptoListModelBean.getSellCurrencyList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(sellCurrencyList, 10));
        java.util.Iterator<T> it3 = sellCurrencyList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(AEQbTJ.copydefault((BuySellCurrencyBean) it3.next()));
        }
        return new CryptoListModel(arrayList, arrayList2, arrayList3, cryptoListModelBean.getBalanceAccountType());
    }

    public final GetBannerResp KWHzl(@NotNull GetBannerBean getBannerBean) {
        Intrinsics.checkNotNullParameter(getBannerBean, "");
        java.util.List<SupportBannerBean> supportBanners = getBannerBean.getSupportBanners();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(supportBanners, 10));
        java.util.Iterator<T> it = supportBanners.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ.KWHzl((SupportBannerBean) it.next()));
        }
        return new GetBannerResp(new java.util.ArrayList(arrayList));
    }

    public final SupportBanner KWHzl(@NotNull SupportBannerBean supportBannerBean) {
        Intrinsics.checkNotNullParameter(supportBannerBean, "");
        java.lang.String content = supportBannerBean.getContent();
        boolean dismissible = supportBannerBean.getDismissible();
        int bannerId = supportBannerBean.getBannerId();
        java.lang.String url = supportBannerBean.getUrl();
        java.lang.String urlDisplayLabel = supportBannerBean.getUrlDisplayLabel();
        java.util.List<DisplayPageBean> displayPages = supportBannerBean.getDisplayPages();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(displayPages, 10));
        java.util.Iterator<T> it = displayPages.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ.copydefault((DisplayPageBean) it.next()));
        }
        return new SupportBanner(content, dismissible, java.lang.Integer.valueOf(bannerId), url, urlDisplayLabel, arrayList, java.lang.Integer.valueOf(supportBannerBean.getPollingTimeFrameInSeconds()));
    }

    public final DisplayPage copydefault(@NotNull DisplayPageBean displayPageBean) {
        Intrinsics.checkNotNullParameter(displayPageBean, "");
        return new DisplayPage(displayPageBean.getFlowType(), displayPageBean.getPageNames());
    }

    public final BuySellCurrency copydefault(@NotNull BuySellCurrencyBean buySellCurrencyBean) {
        Intrinsics.checkNotNullParameter(buySellCurrencyBean, "");
        return new BuySellCurrency(buySellCurrencyBean.getAvailableBalance(), buySellCurrencyBean.getChannelAvailable(), buySellCurrencyBean.getCountryNames(), buySellCurrencyBean.getCurrency(), buySellCurrencyBean.getCurrencyId(), buySellCurrencyBean.getCurrencyName(), buySellCurrencyBean.getDisplayName(), buySellCurrencyBean.getHidden(), buySellCurrencyBean.getIcon(), buySellCurrencyBean.getNightIcon(), buySellCurrencyBean.getPriceScale(), buySellCurrencyBean.getQuickAmountList(), buySellCurrencyBean.getScale(), buySellCurrencyBean.getSymbol(), buySellCurrencyBean.getTradeRange(), buySellCurrencyBean.getUsdRate(), buySellCurrencyBean.getValuation());
    }

    public final CurrencyToken EZpvd(@NotNull CurrencyTokenBean currencyTokenBean) {
        Intrinsics.checkNotNullParameter(currencyTokenBean, "");
        java.lang.String availableBalance = currencyTokenBean.getAvailableBalance();
        boolean channelAvailable = currencyTokenBean.getChannelAvailable();
        java.util.List<java.lang.String> countryNames = currencyTokenBean.getCountryNames();
        java.lang.String currency = currencyTokenBean.getCurrency();
        java.lang.String currencyId = currencyTokenBean.getCurrencyId();
        java.lang.String currencyName = currencyTokenBean.getCurrencyName();
        java.lang.String displayName = currencyTokenBean.getDisplayName();
        boolean hidden = currencyTokenBean.getHidden();
        java.lang.String icon = currencyTokenBean.getIcon();
        java.lang.String nightIcon = currencyTokenBean.getNightIcon();
        int priceScale = currencyTokenBean.getPriceScale();
        java.util.List<java.lang.Integer> quickAmountList = currencyTokenBean.getQuickAmountList();
        int scale = currencyTokenBean.getScale();
        java.lang.String symbol = currencyTokenBean.getSymbol();
        java.lang.String tradeRange = currencyTokenBean.getTradeRange();
        double usdRate = currencyTokenBean.getUsdRate();
        java.lang.String valuation = currencyTokenBean.getValuation();
        java.lang.String cryptoToLocalCurrencyPrice = currencyTokenBean.getCryptoToLocalCurrencyPrice();
        java.lang.String earnRate = currencyTokenBean.getEarnRate();
        EarnOptionBean earnOption = currencyTokenBean.getEarnOption();
        if (earnOption == null) {
            earnOption = new EarnOptionBean((java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, false, false, false, (java.lang.String) null, (LocalizedTextBean) null, (java.lang.String) null, (java.lang.Integer) null, 16383, (DefaultConstructorMarker) null);
        }
        return new CurrencyToken(availableBalance, channelAvailable, (java.util.List) countryNames, currency, currencyId, currencyName, displayName, hidden, icon, nightIcon, priceScale, (java.util.List) quickAmountList, scale, symbol, tradeRange, usdRate, valuation, cryptoToLocalCurrencyPrice, earnRate, EZpvd(earnOption), (java.util.List) currencyTokenBean.getTradeSupportedCurrencies(), (java.lang.String) null, (kotlin.Pair) null, false, false, EZpvd(currencyTokenBean.getDexInfoBean()), 31457280, (DefaultConstructorMarker) null);
    }

    public final DexInfo EZpvd(DexInfoBean dexInfoBean) {
        return new DexInfo(dexInfoBean.getUniqueId(), dexInfoBean.getChainIndex(), dexInfoBean.getChainName(), C33129mqd.gEmmrt(dexInfoBean.getChainLogo()), dexInfoBean.getTokenAddress(), dexInfoBean.getPrice(), C33129mqd.gEmmrt(dexInfoBean.getLiquidity()), C33129mqd.gEmmrt(dexInfoBean.getMarketCap()), dexInfoBean.getRiskLevel(), dexInfoBean.getBalanceTag(), dexInfoBean.getDecimal(), dexInfoBean.getBalance(), dexInfoBean.getBalanceUsd(), dexInfoBean.getCommunityRecognized(), false, (java.lang.String) null, 49152, (DefaultConstructorMarker) null);
    }

    public final EarnOption EZpvd(@NotNull EarnOptionBean earnOptionBean) {
        Intrinsics.checkNotNullParameter(earnOptionBean, "");
        java.lang.Long currencyId = earnOptionBean.getCurrencyId();
        java.lang.Long productTypeId = earnOptionBean.getProductTypeId();
        java.lang.String productTypeName = earnOptionBean.getProductTypeName();
        java.lang.Long savingTypeId = earnOptionBean.getSavingTypeId();
        java.lang.String savingTypeName = earnOptionBean.getSavingTypeName();
        double eligibleAmountMax = earnOptionBean.getEligibleAmountMax();
        double eligibleAmountMin = earnOptionBean.getEligibleAmountMin();
        boolean earnMaxUnlimited = earnOptionBean.getEarnMaxUnlimited();
        boolean toggle = earnOptionBean.getToggle();
        boolean autoEarnEnabled = earnOptionBean.getAutoEarnEnabled();
        return new EarnOption(currencyId, productTypeId, productTypeName, savingTypeId, savingTypeName, java.lang.Double.valueOf(eligibleAmountMax), java.lang.Double.valueOf(eligibleAmountMin), java.lang.Boolean.valueOf(earnMaxUnlimited), java.lang.Boolean.valueOf(toggle), java.lang.Boolean.valueOf(autoEarnEnabled), earnOptionBean.getEarnRate(), EZpvd(earnOptionBean.getLocalizedText()), earnOptionBean.getEarnAgreementContext(), earnOptionBean.getRewardType());
    }

    public final SupportCurrencyInfo EZpvd(@NotNull SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean) {
        Intrinsics.checkNotNullParameter(supportCurrencyInfoResponseBean, "");
        return new SupportCurrencyInfo(supportCurrencyInfoResponseBean.getPricingType(), supportCurrencyInfoResponseBean.getPeggedCurrency(), supportCurrencyInfoResponseBean.getPeggedCurrencySymbol(), supportCurrencyInfoResponseBean.getPeggedCurrencyScale(), supportCurrencyInfoResponseBean.getPeggedCurrencyTradeable());
    }

    public final LocalizedText EZpvd(@NotNull LocalizedTextBean localizedTextBean) {
        Intrinsics.checkNotNullParameter(localizedTextBean, "");
        return new LocalizedText(localizedTextBean.getShowLearnMore(), localizedTextBean.getTitle(), localizedTextBean.getContent(), localizedTextBean.getPreviewTitle(), localizedTextBean.getPreviewBody(), localizedTextBean.getHoldToEarnText());
    }

    public final com.okinc.okpaymentapi.data.remote.model.management.Channel AEQbTJ(@NotNull ChannelBean channelBean) {
        B2CExtCollectInfo b2CExtCollectInfo;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        TermContentChannel termContentChannel;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        java.util.Iterator it;
        B2CExtCollectInfo b2CExtCollectInfo2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.ArrayList arrayList2;
        char c;
        java.util.ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(channelBean, "");
        TradingAgentInfo tradingAgentInfo = channelBean.getTradingAgentInfo();
        com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo tradingAgentInfo2 = tradingAgentInfo != null ? new com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo(tradingAgentInfo.getQuoteLimit()) : null;
        java.lang.String availableAmount = channelBean.getAvailableAmount();
        boolean bestChannel = channelBean.getBestChannel();
        java.lang.String backgroundColor = channelBean.getBackgroundColor();
        ChannelCategoryCode channelCategoryCodeAEQbTJ = AEQbTJ(channelBean.getCategoryCode().getCode());
        boolean changeDisplay = channelBean.getChangeDisplay();
        java.lang.String customerUrl = channelBean.getCustomerUrl();
        java.lang.String depositName = channelBean.getDepositName();
        java.lang.String depositPlatformCode = channelBean.getDepositPlatformCode();
        int depositPlatformId = channelBean.getDepositPlatformId();
        java.lang.String description = channelBean.getDescription();
        java.lang.String displayIconUrl = channelBean.getDisplayIconUrl();
        java.lang.String displayIconUrlNight = channelBean.getDisplayIconUrlNight();
        java.lang.String displayName = channelBean.getDisplayName();
        java.lang.String displayText = channelBean.getDisplayText();
        boolean exclusive = channelBean.getExclusive();
        B2CExtCollectInfoResponseBean extCollectInfo = channelBean.getExtCollectInfo();
        B2CExtCollectInfo b2CExtCollectInfo3 = extCollectInfo != null ? new B2CExtCollectInfo(extCollectInfo.getConfigName(), extCollectInfo.getDepositName(), extCollectInfo.getSide()) : null;
        java.lang.String feeRate = channelBean.getFeeRate();
        boolean zIsConvert = channelBean.isConvert();
        boolean zIsRealTimePrice = channelBean.isRealTimePrice();
        java.lang.String maxLimitAmount = channelBean.getMaxLimitAmount();
        java.lang.String maxPurchaseTime = channelBean.getMaxPurchaseTime();
        java.lang.String maxWaitTimeForOrderStatusFetch = channelBean.getMaxWaitTimeForOrderStatusFetch();
        java.lang.String minFee = channelBean.getMinFee();
        java.lang.String minLimitAmount = channelBean.getMinLimitAmount();
        java.lang.String minPurchaseTime = channelBean.getMinPurchaseTime();
        boolean needQuote = channelBean.getNeedQuote();
        boolean payOnOk = channelBean.getPayOnOk();
        PaymentMethodCategory paymentMethodCategoryOLrzqt = OLrzqt(channelBean.getPaymentMethodCategory());
        java.util.List<PaymentMethodResponseBean> paymentMethods = channelBean.getPaymentMethods();
        if (paymentMethods != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(paymentMethods, 10));
            java.util.Iterator it2 = paymentMethods.iterator();
            while (it2.hasNext()) {
                PaymentMethodResponseBean paymentMethodResponseBean = (PaymentMethodResponseBean) it2.next();
                java.lang.String payment = paymentMethodResponseBean.getPayment();
                java.lang.String description2 = paymentMethodResponseBean.getDescription();
                java.lang.String backgroundColor2 = paymentMethodResponseBean.getBackgroundColor();
                java.lang.String iconUrl = paymentMethodResponseBean.getIconUrl();
                java.lang.String iconUrlNight = paymentMethodResponseBean.getIconUrlNight();
                java.lang.String mainColor = paymentMethodResponseBean.getMainColor();
                java.lang.String paymentCurrency = paymentMethodResponseBean.getPaymentCurrency();
                java.lang.String paymentMethodType = paymentMethodResponseBean.getPaymentMethodType();
                java.lang.String paymentMethodId = paymentMethodResponseBean.getPaymentMethodId();
                java.lang.String paymentMethod = paymentMethodResponseBean.getPaymentMethod();
                java.util.List<java.lang.String> supportedTransactionType = paymentMethodResponseBean.getSupportedTransactionType();
                java.lang.String baseAmount = paymentMethodResponseBean.getBaseAmount();
                boolean depositToWithdraw = paymentMethodResponseBean.getDepositToWithdraw();
                boolean allowManualAddition = paymentMethodResponseBean.getAllowManualAddition();
                AccountResponseBean account2 = paymentMethodResponseBean.getAccount();
                if (account2 != null) {
                    java.lang.String paymentAccountId = account2.getPaymentAccountId();
                    java.lang.String recipientName = account2.getRecipientName();
                    java.lang.String accountNumber = account2.getAccountNumber();
                    java.lang.String accountType = account2.getAccountType();
                    java.lang.String bankAccountType = account2.getBankAccountType();
                    java.lang.String bankName = account2.getBankName();
                    boolean zIsAccountLabel = account2.isAccountLabel();
                    java.lang.String bankAddress = account2.getBankAddress();
                    java.lang.String bankIdentifierCode = account2.getBankIdentifierCode();
                    java.lang.String bankCode = account2.getBankCode();
                    java.lang.String routingNumber = account2.getRoutingNumber();
                    java.lang.String iban = account2.getIban();
                    java.lang.String bsbNumber = account2.getBsbNumber();
                    java.lang.String status = account2.getStatus();
                    java.lang.String description3 = account2.getDescription();
                    java.lang.String sortCode = account2.getSortCode();
                    java.lang.String last4 = account2.getLast4();
                    java.lang.String brand = account2.getBrand();
                    BillingAddressResponseBean billing = account2.getBilling();
                    account = new com.okinc.okpaymentapi.data.remote.model.management.Account(paymentAccountId, recipientName, accountNumber, accountType, bankAccountType, bankName, zIsAccountLabel, bankAddress, bankIdentifierCode, bankCode, routingNumber, iban, bsbNumber, status, description3, sortCode, last4, brand, billing != null ? new BillingAddress(billing.getCity(), billing.getCountry(), billing.getLine1(), billing.getLine2(), billing.getPostalCode(), billing.getState()) : null, account2.getRedirectUrl(), account2.getCountry(), account2.getExpMonth(), account2.getExpYear(), account2.getAvailableBalance(), account2.getUnavailableBalance(), account2.getTotalBalance(), account2.getBalanceAccountType(), account2.getUserId(), account2.getRemainVerificationAttempts(), account2.getIntermediaryBankName(), account2.getIntermediaryBankAddress(), account2.getIntermediaryBankIdentifierCode(), account2.getBestOption(), account2.isSelected(), account2.getPixKey(), account2.getMerchantId(), account2.getCountryCode(), account2.getAllowCreditCard());
                } else {
                    account = null;
                }
                java.lang.String quoteCurrency = paymentMethodResponseBean.getQuoteCurrency();
                java.lang.String price = paymentMethodResponseBean.getPrice();
                java.lang.String publicTradingOrderId = paymentMethodResponseBean.getPublicTradingOrderId();
                java.util.List<SellerReceiptAccountResponseBean> sellerReceiptAccountList = paymentMethodResponseBean.getSellerReceiptAccountList();
                if (sellerReceiptAccountList != null) {
                    it = it2;
                    b2CExtCollectInfo2 = b2CExtCollectInfo3;
                    str4 = depositPlatformCode;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(sellerReceiptAccountList, 10));
                    java.util.Iterator it3 = sellerReceiptAccountList.iterator();
                    while (it3.hasNext()) {
                        SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean = (SellerReceiptAccountResponseBean) it3.next();
                        arrayList5.add(new SellerReceiptAccount(sellerReceiptAccountResponseBean.getId(), sellerReceiptAccountResponseBean.getAccountNo(), sellerReceiptAccountResponseBean.isSelected()));
                        it3 = it3;
                        depositName = depositName;
                    }
                    str3 = depositName;
                    arrayList2 = arrayList5;
                } else {
                    it = it2;
                    b2CExtCollectInfo2 = b2CExtCollectInfo3;
                    str3 = depositName;
                    str4 = depositPlatformCode;
                    arrayList2 = null;
                }
                boolean bestOption = paymentMethodResponseBean.getBestOption();
                java.lang.String finalPriceForDisplay = paymentMethodResponseBean.getFinalPriceForDisplay();
                boolean zIsSelected = paymentMethodResponseBean.isSelected();
                SellerReceiptAccountResponseBean selectedSellerReceiptAccount = paymentMethodResponseBean.getSelectedSellerReceiptAccount();
                SellerReceiptAccount sellerReceiptAccount = selectedSellerReceiptAccount != null ? new SellerReceiptAccount(selectedSellerReceiptAccount.getId(), selectedSellerReceiptAccount.getAccountNo(), selectedSellerReceiptAccount.isSelected()) : null;
                java.lang.String depositPlatformCode2 = paymentMethodResponseBean.getDepositPlatformCode();
                java.lang.String deepLink = paymentMethodResponseBean.getDeepLink();
                java.lang.String storeUrl = paymentMethodResponseBean.getStoreUrl();
                boolean showTransfer = paymentMethodResponseBean.getShowTransfer();
                int numOfRecurringPlans = paymentMethodResponseBean.getNumOfRecurringPlans();
                java.util.List<AccountResponseBean> accounts = paymentMethodResponseBean.getAccounts();
                if (accounts != null) {
                    c = '\n';
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(accounts, 10));
                    for (AccountResponseBean accountResponseBean : accounts) {
                        java.lang.String paymentAccountId2 = accountResponseBean.getPaymentAccountId();
                        java.lang.String recipientName2 = accountResponseBean.getRecipientName();
                        java.lang.String accountNumber2 = accountResponseBean.getAccountNumber();
                        java.lang.String accountType2 = accountResponseBean.getAccountType();
                        java.lang.String bankAccountType2 = accountResponseBean.getBankAccountType();
                        java.lang.String bankName2 = accountResponseBean.getBankName();
                        boolean zIsAccountLabel2 = accountResponseBean.isAccountLabel();
                        java.lang.String bankAddress2 = accountResponseBean.getBankAddress();
                        java.lang.String bankIdentifierCode2 = accountResponseBean.getBankIdentifierCode();
                        java.lang.String bankCode2 = accountResponseBean.getBankCode();
                        java.lang.String routingNumber2 = accountResponseBean.getRoutingNumber();
                        java.lang.String iban2 = accountResponseBean.getIban();
                        java.lang.String bsbNumber2 = accountResponseBean.getBsbNumber();
                        java.lang.String status2 = accountResponseBean.getStatus();
                        java.lang.String description4 = accountResponseBean.getDescription();
                        java.lang.String sortCode2 = accountResponseBean.getSortCode();
                        java.lang.String last42 = accountResponseBean.getLast4();
                        java.lang.String brand2 = accountResponseBean.getBrand();
                        BillingAddressResponseBean billing2 = accountResponseBean.getBilling();
                        arrayList6.add(new com.okinc.okpaymentapi.data.remote.model.management.Account(paymentAccountId2, recipientName2, accountNumber2, accountType2, bankAccountType2, bankName2, zIsAccountLabel2, bankAddress2, bankIdentifierCode2, bankCode2, routingNumber2, iban2, bsbNumber2, status2, description4, sortCode2, last42, brand2, billing2 != null ? new BillingAddress(billing2.getCity(), billing2.getCountry(), billing2.getLine1(), billing2.getLine2(), billing2.getPostalCode(), billing2.getState()) : null, accountResponseBean.getRedirectUrl(), accountResponseBean.getCountry(), accountResponseBean.getExpMonth(), accountResponseBean.getExpYear(), accountResponseBean.getAvailableBalance(), (java.lang.String) null, (java.lang.String) null, accountResponseBean.getBalanceAccountType(), accountResponseBean.getUserId(), accountResponseBean.getRemainVerificationAttempts(), accountResponseBean.getIntermediaryBankName(), accountResponseBean.getIntermediaryBankAddress(), accountResponseBean.getIntermediaryBankIdentifierCode(), accountResponseBean.getBestOption(), accountResponseBean.isSelected(), accountResponseBean.getPixKey(), accountResponseBean.getMerchantId(), accountResponseBean.getCountryCode(), accountResponseBean.getAllowCreditCard(), 50331648, 0, (DefaultConstructorMarker) null));
                    }
                    arrayList3 = arrayList6;
                } else {
                    c = '\n';
                    arrayList3 = null;
                }
                arrayList4.add(new PaymentMethod(payment, description2, backgroundColor2, iconUrl, iconUrlNight, mainColor, paymentCurrency, paymentMethodType, paymentMethodId, paymentMethod, supportedTransactionType, baseAmount, depositToWithdraw, allowManualAddition, account, quoteCurrency, price, publicTradingOrderId, arrayList2, bestOption, finalPriceForDisplay, zIsSelected, sellerReceiptAccount, depositPlatformCode2, deepLink, storeUrl, showTransfer, arrayList3, numOfRecurringPlans));
                it2 = it;
                b2CExtCollectInfo3 = b2CExtCollectInfo2;
                depositPlatformCode = str4;
                depositName = str3;
            }
            b2CExtCollectInfo = b2CExtCollectInfo3;
            str = depositName;
            str2 = depositPlatformCode;
            arrayList = arrayList4;
        } else {
            b2CExtCollectInfo = b2CExtCollectInfo3;
            str = depositName;
            str2 = depositPlatformCode;
            arrayList = null;
        }
        java.util.List<java.lang.String> preCheck = channelBean.getPreCheck();
        java.lang.String price2 = channelBean.getPrice();
        java.util.List<java.lang.String> receiptAccount = channelBean.getReceiptAccount();
        java.lang.String searchUrl = channelBean.getSearchUrl();
        java.util.List<java.lang.String> tags = channelBean.getTags();
        TermContentChannelResponseBean termContent = channelBean.getTermContent();
        if (termContent != null) {
            int mode = termContent.getMode();
            TermsURLContentDataResponseBean content = termContent.getContent();
            termContentChannel = new TermContentChannel(mode, content != null ? new TermsURLContentData(content.getPolicyUrl(), content.getServiceUrl(), content.getDexLearnMoreUrl(), content.getTcDesc(), content.getTcKey()) : null);
        } else {
            termContentChannel = null;
        }
        java.lang.Integer timeUnit = channelBean.getTimeUnit();
        java.lang.String tutorialUrl = channelBean.getTutorialUrl();
        boolean useRealTimePrice = channelBean.getUseRealTimePrice();
        java.lang.String checkoutAccountUrl = channelBean.getCheckoutAccountUrl();
        java.lang.String iconUrl2 = channelBean.getIconUrl();
        java.lang.String iconUrlNight2 = channelBean.getIconUrlNight();
        java.lang.String h5Path = channelBean.getH5Path();
        java.lang.String faqUrl = channelBean.getFaqUrl();
        java.util.List<java.lang.String> supportedTransactionType2 = channelBean.getSupportedTransactionType();
        java.util.List<java.lang.String> supportedOrderTypes = channelBean.getSupportedOrderTypes();
        boolean depositToWithdraw2 = channelBean.getDepositToWithdraw();
        LocalizationResponseBean localization = channelBean.getLocalization();
        Localization localization2 = localization != null ? new Localization(localization.getProcessingTimeForDisplay(), (java.lang.String) null, localization.getFeeRateForDisplay(), localization.getLimitForDisplay(), localization.getRangeForDisplay(), localization.getGeneralDescriptionForDisplay(), localization.getDailyLimitForDisplay(), localization.getDailyLimitRemainingForDisplay(), localization.getFrequencyLimitForDisplay(), localization.getSingleTransactionLimitForDisplay(), localization.getAccountProtectionForDisplay(), localization.getInfoBoxForDisplay(), localization.getPriceInfoBoxForDisplay(), localization.getAvailableToTradeForDisplay(), localization.getAvailableToWithdrawForDisplay(), localization.getCryptoWithdrawHoldDaysInfoBoxForDisplay(), localization.getFiatWithdrawHoldDaysInfoBoxForDisplay(), localization.getDisclaimerForDisplay(), localization.getDisclaimerHeaderForDisplay(), localization.getDisclaimerBodyForDisplay(), (java.lang.String) null, localization.getGoogleWalletBottomSheetTitle(), localization.getGoogleWalletBottomSheetDescFirstPar(), localization.getGoogleWalletBottomSheetDescSecondPar(), 1048578, (DefaultConstructorMarker) null) : null;
        LocalizationHighlightStyleResponseBean localizationHighlightStyle = channelBean.getLocalizationHighlightStyle();
        LocalizationHighlightStyle localizationHighlightStyle2 = localizationHighlightStyle != null ? new LocalizationHighlightStyle(localizationHighlightStyle.getProcessingTimeForDisplay(), localizationHighlightStyle.getFeeRateForDisplay(), localizationHighlightStyle.getLimitForDisplay(), localizationHighlightStyle.getDailyLimitRemainingForDisplay(), localizationHighlightStyle.getSingleTransactionLimitForDisplay()) : null;
        LimitInfoResponseBean limitInfo = channelBean.getLimitInfo();
        LimitInfo limitInfo2 = limitInfo != null ? new LimitInfo("", limitInfo.getDailyLimit(), limitInfo.getWeeklyLimit(), limitInfo.getMonthlyLimit(), limitInfo.getLifetimeLimit(), limitInfo.getSingleTransactionMax(), limitInfo.getSingleTransactionMin(), limitInfo.getDailyLimitRemaining(), limitInfo.getWeeklyLimitRemaining(), limitInfo.getMonthlyLimitRemaining(), limitInfo.getLifetimeLimitRemaining(), limitInfo.getLimitedByTradeFrequency(), limitInfo.getFrequencyCheckWindow(), limitInfo.getTradeFrequencyLimit(), (EddLimitLevel) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, limitInfo.getUnlimitedDailyFreqLimit(), limitInfo.getUnlimitedDailyLimit(), limitInfo.getUnlimitedDailyLimitRemaining(), limitInfo.getUnlimitedLifetimeLimit(), limitInfo.getUnlimitedLifetimeLimitRemaining(), limitInfo.getUnlimitedMonthlyFreqLimit(), limitInfo.getUnlimitedMonthlyLimit(), limitInfo.getUnlimitedMonthlyLimitRemaining(), limitInfo.getUnlimitedSingleTransactionMax(), limitInfo.getUnlimitedSingleTransactionMin(), limitInfo.getUnlimitedWeeklyFreqLimit(), limitInfo.getUnlimitedWeeklyLimit(), limitInfo.getUnlimitedWeeklyLimitRemaining(), 245760, (DefaultConstructorMarker) null) : null;
        InformationBoxResponseBean informationBox = channelBean.getInformationBox();
        InformationBox informationBox2 = informationBox != null ? new InformationBox(informationBox.getLimit(), "") : null;
        BankingHoursResponseBean bankingHours = channelBean.getBankingHours();
        BankingHours bankingHours2 = bankingHours != null ? new BankingHours(bankingHours.getWithinBankingHours(), bankingHours.getBankingHoursStartTimeUTC(), bankingHours.getBankingHoursEndTimeUTC(), bankingHours.getNextAvailableBankingHoursStartTimeUTC(), bankingHours.getNextAvailableBankingHoursEndTimeUTC()) : null;
        UiFlowControlResponseBean uiFlowControl = channelBean.getUiFlowControl();
        UiFlowControl uiFlowControl2 = uiFlowControl != null ? new UiFlowControl(uiFlowControl.getShowTOC(), uiFlowControl.getShowWarningBox(), uiFlowControl.getShowInformationBox(), uiFlowControl.getSkipTwoFactorAuth(), uiFlowControl.getSkipWireEducation(), uiFlowControl.getAllowManualAdditionInfoPage(), uiFlowControl.getSkipManagementSingleChannelSelectionScreen(), uiFlowControl.getShowWithdrawAccountsForDeposit(), uiFlowControl.getShowWithdrawHoldScreen()) : null;
        boolean allowManualAddition2 = channelBean.getAllowManualAddition();
        java.lang.String withdrawHoldCryptoAmount = channelBean.getWithdrawHoldCryptoAmount();
        java.lang.String withdrawHoldDays = channelBean.getWithdrawHoldDays();
        TradeLimitResponseBean tradeLimit = channelBean.getTradeLimit();
        TradeLimit tradeLimit2 = tradeLimit != null ? new TradeLimit(tradeLimit.getMinChannelLimit(), tradeLimit.getMaxChannelLimit(), tradeLimit.getMinTradeLimit(), tradeLimit.getMaxTradeLimit(), tradeLimit.getMaxDexDailyLimit(), tradeLimit.getRemainDexDailyLimit()) : null;
        java.lang.String target = channelBean.getTarget();
        java.lang.String baseAmount2 = channelBean.getBaseAmount();
        java.lang.String quoteAmount = channelBean.getQuoteAmount();
        java.lang.String quoteCurrency2 = channelBean.getQuoteCurrency();
        java.lang.String baseCurrency = channelBean.getBaseCurrency();
        java.lang.String requestCurrency = channelBean.getRequestCurrency();
        java.lang.String currencySymbol = channelBean.getCurrencySymbol();
        java.lang.Integer kycType = channelBean.getKycType();
        boolean zIsUsingInstitutionVerification = channelBean.isUsingInstitutionVerification();
        java.lang.String supportCurrency = channelBean.getSupportCurrency();
        SupportCurrencyInfo supportCurrencyInfoEZpvd = EZpvd(channelBean.getSupportCurrencyInfo());
        java.lang.Integer supportCurrencyScale = channelBean.getSupportCurrencyScale();
        EarnOptionBean earnOption = channelBean.getEarnOption();
        return new com.okinc.okpaymentapi.data.remote.model.management.Channel(tradingAgentInfo2, availableAmount, bestChannel, backgroundColor, channelCategoryCodeAEQbTJ, changeDisplay, customerUrl, str, str2, depositPlatformId, description, displayIconUrl, displayIconUrlNight, displayName, displayText, exclusive, b2CExtCollectInfo, feeRate, zIsConvert, zIsRealTimePrice, maxLimitAmount, maxPurchaseTime, maxWaitTimeForOrderStatusFetch, minFee, minLimitAmount, minPurchaseTime, needQuote, (java.util.List) null, payOnOk, paymentMethodCategoryOLrzqt, (java.util.List) arrayList, (java.util.List) preCheck, price2, (java.util.List) receiptAccount, searchUrl, (java.util.List) tags, termContentChannel, timeUnit, tutorialUrl, useRealTimePrice, checkoutAccountUrl, iconUrl2, iconUrlNight2, h5Path, faqUrl, (java.util.List) supportedTransactionType2, (java.util.List) supportedOrderTypes, depositToWithdraw2, localization2, localizationHighlightStyle2, limitInfo2, informationBox2, bankingHours2, uiFlowControl2, allowManualAddition2, withdrawHoldCryptoAmount, withdrawHoldDays, tradeLimit2, (java.lang.String) null, false, target, baseAmount2, quoteAmount, quoteCurrency2, baseCurrency, requestCurrency, currencySymbol, kycType, zIsUsingInstitutionVerification, supportCurrency, false, supportCurrencyInfoEZpvd, supportCurrencyScale, earnOption != null ? AEQbTJ.EZpvd(earnOption) : null, (java.util.List) channelBean.getSupportedCountries(), channelBean.getAcquirerBankCountryCode(), channelBean.getGooglePayReadyToUse(), channelBean.getGooglePaySupportedButNotSetup(), 134217728, 201326592, 64, (DefaultConstructorMarker) null);
    }

    public final ChannelCategoryCode AEQbTJ(int i) {
        if (i == 2) {
            return ChannelCategoryCode.THIRD_PARTY;
        }
        if (i == 3) {
            return ChannelCategoryCode.BALANCE;
        }
        if (i == 4) {
            return ChannelCategoryCode.NATIVE;
        }
        return ChannelCategoryCode.THIRD_PARTY;
    }

    public final PaymentMethodCategory OLrzqt(int i) {
        if (i == 0) {
            return PaymentMethodCategory.CASH;
        }
        if (i == 1) {
            return PaymentMethodCategory.STABLECOIN;
        }
        if (i == 2) {
            return PaymentMethodCategory.CRYPTO;
        }
        return PaymentMethodCategory.CASH;
    }
}
