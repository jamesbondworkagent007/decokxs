package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Channel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String acquirerBankCountryCode;
    private final boolean allowManualAddition;
    private final String availableAmount;
    private final String backgroundColor;
    private final BankingHours bankingHours;
    private String baseAmount;
    private String baseCurrency;
    private final boolean bestChannel;
    private final ChannelCategoryCode categoryCode;
    private final boolean changeDisplay;
    private final String checkoutAccountUrl;
    private String currencySymbol;
    private final String customerUrl;
    private final String depositName;
    private final String depositPlatformCode;
    private final int depositPlatformId;
    private final boolean depositToWithdraw;
    private final String description;
    private final String displayIconUrl;
    private final String displayIconUrlNight;
    private final String displayName;
    private final String displayText;
    private EarnOption earnOption;
    private final boolean exclusive;
    private final B2CExtCollectInfo extCollectInfo;
    private final String faqUrl;
    private final String feeRate;
    private final String fixedPriceTolerance;
    private boolean googlePayReadyToUse;
    private boolean googlePaySupportedButNotSetup;
    private final String h5Path;
    private final String iconUrl;
    private final String iconUrlNight;
    private final InformationBox informationBox;
    private final boolean isConvert;
    private final boolean isRealTimePrice;
    private boolean isUsingInstitutionVerification;
    private Integer kycType;
    private final LimitInfo limitInfo;
    private final Localization localization;
    private final LocalizationHighlightStyle localizationHighlightStyle;
    private final String maxLimitAmount;
    private final String maxPurchaseTime;
    private final String maxWaitTimeForOrderStatusFetch;
    private final String minFee;
    private final String minLimitAmount;
    private final String minPurchaseTime;
    private final boolean needCreateAccount;
    private final boolean needQuote;
    private final List<PaymentMethod> p2pPaymentMethodList;
    private final boolean payOnOk;
    private final PaymentMethodCategory paymentMethodCategory;
    private List<PaymentMethod> paymentMethods;
    private final List<String> preCheck;
    private final String price;
    private String quoteAmount;
    private String quoteCurrency;
    private final List<String> receiptAccount;
    private String requestCurrency;
    private final String searchUrl;
    private String supportCurrency;
    private final SupportCurrencyInfo supportCurrencyInfo;
    private Integer supportCurrencyScale;
    private final boolean supportStablecoin;
    private List<String> supportedCountries;
    private final List<String> supportedOrderTypes;
    private final List<String> supportedTransactionType;
    private final List<String> tags;
    private final String target;
    private final TermContentChannel termContent;
    private final Integer timeUnit;
    private final TradeLimit tradeLimit;
    private final TradingAgentInfo tradingAgentInfo;
    private final String tutorialUrl;
    private final UiFlowControl uiFlowControl;
    private final boolean useRealTimePrice;
    private final String withdrawHoldCryptoAmount;
    private final String withdrawHoldDays;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Channel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Channel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Channel createFromParcel(Parcel parcel) {
            B2CExtCollectInfo b2CExtCollectInfo;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            TradingAgentInfo tradingAgentInfoCreateFromParcel = parcel.readInt() == 0 ? null : TradingAgentInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            ChannelCategoryCode channelCategoryCodeCreateFromParcel = ChannelCategoryCode.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            B2CExtCollectInfo b2CExtCollectInfoCreateFromParcel = parcel.readInt() == 0 ? null : B2CExtCollectInfo.CREATOR.createFromParcel(parcel);
            String string11 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                b2CExtCollectInfo = b2CExtCollectInfoCreateFromParcel;
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i2);
                b2CExtCollectInfo = b2CExtCollectInfoCreateFromParcel;
                int i3 = 0;
                while (i3 != i2) {
                    arrayList4.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                    i3++;
                    i2 = i2;
                }
                arrayList = arrayList4;
            }
            boolean z7 = parcel.readInt() != 0;
            PaymentMethodCategory paymentMethodCategoryCreateFromParcel = PaymentMethodCategory.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i4);
                arrayList2 = arrayList;
                int i5 = 0;
                while (i5 != i4) {
                    arrayList5.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                    i5++;
                    i4 = i4;
                }
                arrayList3 = arrayList5;
            }
            return new Channel(tradingAgentInfoCreateFromParcel, string, z, string2, channelCategoryCodeCreateFromParcel, z2, string3, string4, string5, i, string6, string7, string8, string9, string10, z3, b2CExtCollectInfo, string11, z4, z5, string12, string13, string14, string15, string16, string17, z6, arrayList2, z7, paymentMethodCategoryCreateFromParcel, arrayList3, parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TermContentChannel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Localization.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalizationHighlightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LimitInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InformationBox.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BankingHours.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiFlowControl.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TradeLimit.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, SupportCurrencyInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EarnOption.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Channel[] newArray(int i) {
            return new Channel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Channel() {
        this((TradingAgentInfo) null, (String) null, false, (String) null, (ChannelCategoryCode) null, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfo) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, (PaymentMethodCategory) null, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannel) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (String) null, (String) null, (TradeLimit) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, (String) null, false, (SupportCurrencyInfo) null, (Integer) null, (EarnOption) null, (List) null, (String) null, false, false, -1, -1, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingAgentInfo component1() {
        return this.tradingAgentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.depositPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.displayIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.displayIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.displayText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.exclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CExtCollectInfo component17() {
        return this.extCollectInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.isRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.maxLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.maxPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.maxWaitTimeForOrderStatusFetch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.minLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.minPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethod> component28() {
        return this.p2pPaymentMethodList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.payOnOk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.bestChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethodCategory component30() {
        return this.paymentMethodCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethod> component31() {
        return this.paymentMethods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component32() {
        return this.preCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component34() {
        return this.receiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.searchUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component36() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannel component37() {
        return this.termContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component38() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.tutorialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.useRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.checkoutAccountUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.h5Path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component46() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component47() {
        return this.supportedOrderTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component48() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Localization component49() {
        return this.localization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode component5() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyle component50() {
        return this.localizationHighlightStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfo component51() {
        return this.limitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InformationBox component52() {
        return this.informationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BankingHours component53() {
        return this.bankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControl component54() {
        return this.uiFlowControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component55() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.withdrawHoldCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.withdrawHoldDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimit component58() {
        return this.tradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.fixedPriceTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.changeDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component60() {
        return this.needCreateAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.requestCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component68() {
        return this.kycType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component69() {
        return this.isUsingInstitutionVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.customerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.supportCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component71() {
        return this.supportStablecoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyInfo component72() {
        return this.supportCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component73() {
        return this.supportCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption component74() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component75() {
        return this.supportedCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.acquirerBankCountryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component77() {
        return this.googlePayReadyToUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component78() {
        return this.googlePaySupportedButNotSetup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel copy(TradingAgentInfo tradingAgentInfo, @NotNull String str, boolean z, @NotNull String str2, @NotNull ChannelCategoryCode channelCategoryCode, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, @NotNull String str11, boolean z4, boolean z5, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, boolean z6, List<PaymentMethod> list, boolean z7, @NotNull PaymentMethodCategory paymentMethodCategory, List<PaymentMethod> list2, List<String> list3, @NotNull String str18, List<String> list4, @NotNull String str19, List<String> list5, TermContentChannel termContentChannel, Integer num, @NotNull String str20, boolean z8, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, List<String> list6, List<String> list7, boolean z9, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, boolean z10, @NotNull String str26, @NotNull String str27, TradeLimit tradeLimit, @NotNull String str28, boolean z11, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, Integer num2, boolean z12, @NotNull String str36, boolean z13, @NotNull SupportCurrencyInfo supportCurrencyInfo, Integer num3, EarnOption earnOption, List<String> list8, String str37, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(supportCurrencyInfo, "");
        return new Channel(tradingAgentInfo, str, z, str2, channelCategoryCode, z2, str3, str4, str5, i, str6, str7, str8, str9, str10, z3, b2CExtCollectInfo, str11, z4, z5, str12, str13, str14, str15, str16, str17, z6, list, z7, paymentMethodCategory, list2, list3, str18, list4, str19, list5, termContentChannel, num, str20, z8, str21, str22, str23, str24, str25, list6, list7, z9, localization, localizationHighlightStyle, limitInfo, informationBox, bankingHours, uiFlowControl, z10, str26, str27, tradeLimit, str28, z11, str29, str30, str31, str32, str33, str34, str35, num2, z12, str36, z13, supportCurrencyInfo, num3, earnOption, list8, str37, z14, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return Intrinsics.EZpvd(this.tradingAgentInfo, channel.tradingAgentInfo) && Intrinsics.EZpvd((Object) this.availableAmount, (Object) channel.availableAmount) && this.bestChannel == channel.bestChannel && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) channel.backgroundColor) && this.categoryCode == channel.categoryCode && this.changeDisplay == channel.changeDisplay && Intrinsics.EZpvd((Object) this.customerUrl, (Object) channel.customerUrl) && Intrinsics.EZpvd((Object) this.depositName, (Object) channel.depositName) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) channel.depositPlatformCode) && this.depositPlatformId == channel.depositPlatformId && Intrinsics.EZpvd((Object) this.description, (Object) channel.description) && Intrinsics.EZpvd((Object) this.displayIconUrl, (Object) channel.displayIconUrl) && Intrinsics.EZpvd((Object) this.displayIconUrlNight, (Object) channel.displayIconUrlNight) && Intrinsics.EZpvd((Object) this.displayName, (Object) channel.displayName) && Intrinsics.EZpvd((Object) this.displayText, (Object) channel.displayText) && this.exclusive == channel.exclusive && Intrinsics.EZpvd(this.extCollectInfo, channel.extCollectInfo) && Intrinsics.EZpvd((Object) this.feeRate, (Object) channel.feeRate) && this.isConvert == channel.isConvert && this.isRealTimePrice == channel.isRealTimePrice && Intrinsics.EZpvd((Object) this.maxLimitAmount, (Object) channel.maxLimitAmount) && Intrinsics.EZpvd((Object) this.maxPurchaseTime, (Object) channel.maxPurchaseTime) && Intrinsics.EZpvd((Object) this.maxWaitTimeForOrderStatusFetch, (Object) channel.maxWaitTimeForOrderStatusFetch) && Intrinsics.EZpvd((Object) this.minFee, (Object) channel.minFee) && Intrinsics.EZpvd((Object) this.minLimitAmount, (Object) channel.minLimitAmount) && Intrinsics.EZpvd((Object) this.minPurchaseTime, (Object) channel.minPurchaseTime) && this.needQuote == channel.needQuote && Intrinsics.EZpvd(this.p2pPaymentMethodList, channel.p2pPaymentMethodList) && this.payOnOk == channel.payOnOk && this.paymentMethodCategory == channel.paymentMethodCategory && Intrinsics.EZpvd(this.paymentMethods, channel.paymentMethods) && Intrinsics.EZpvd(this.preCheck, channel.preCheck) && Intrinsics.EZpvd((Object) this.price, (Object) channel.price) && Intrinsics.EZpvd(this.receiptAccount, channel.receiptAccount) && Intrinsics.EZpvd((Object) this.searchUrl, (Object) channel.searchUrl) && Intrinsics.EZpvd(this.tags, channel.tags) && Intrinsics.EZpvd(this.termContent, channel.termContent) && Intrinsics.EZpvd(this.timeUnit, channel.timeUnit) && Intrinsics.EZpvd((Object) this.tutorialUrl, (Object) channel.tutorialUrl) && this.useRealTimePrice == channel.useRealTimePrice && Intrinsics.EZpvd((Object) this.checkoutAccountUrl, (Object) channel.checkoutAccountUrl) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) channel.iconUrl) && Intrinsics.EZpvd((Object) this.iconUrlNight, (Object) channel.iconUrlNight) && Intrinsics.EZpvd((Object) this.h5Path, (Object) channel.h5Path) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) channel.faqUrl) && Intrinsics.EZpvd(this.supportedTransactionType, channel.supportedTransactionType) && Intrinsics.EZpvd(this.supportedOrderTypes, channel.supportedOrderTypes) && this.depositToWithdraw == channel.depositToWithdraw && Intrinsics.EZpvd(this.localization, channel.localization) && Intrinsics.EZpvd(this.localizationHighlightStyle, channel.localizationHighlightStyle) && Intrinsics.EZpvd(this.limitInfo, channel.limitInfo) && Intrinsics.EZpvd(this.informationBox, channel.informationBox) && Intrinsics.EZpvd(this.bankingHours, channel.bankingHours) && Intrinsics.EZpvd(this.uiFlowControl, channel.uiFlowControl) && this.allowManualAddition == channel.allowManualAddition && Intrinsics.EZpvd((Object) this.withdrawHoldCryptoAmount, (Object) channel.withdrawHoldCryptoAmount) && Intrinsics.EZpvd((Object) this.withdrawHoldDays, (Object) channel.withdrawHoldDays) && Intrinsics.EZpvd(this.tradeLimit, channel.tradeLimit) && Intrinsics.EZpvd((Object) this.fixedPriceTolerance, (Object) channel.fixedPriceTolerance) && this.needCreateAccount == channel.needCreateAccount && Intrinsics.EZpvd((Object) this.target, (Object) channel.target) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) channel.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) channel.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) channel.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) channel.baseCurrency) && Intrinsics.EZpvd((Object) this.requestCurrency, (Object) channel.requestCurrency) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) channel.currencySymbol) && Intrinsics.EZpvd(this.kycType, channel.kycType) && this.isUsingInstitutionVerification == channel.isUsingInstitutionVerification && Intrinsics.EZpvd((Object) this.supportCurrency, (Object) channel.supportCurrency) && this.supportStablecoin == channel.supportStablecoin && Intrinsics.EZpvd(this.supportCurrencyInfo, channel.supportCurrencyInfo) && Intrinsics.EZpvd(this.supportCurrencyScale, channel.supportCurrencyScale) && Intrinsics.EZpvd(this.earnOption, channel.earnOption) && Intrinsics.EZpvd(this.supportedCountries, channel.supportedCountries) && Intrinsics.EZpvd((Object) this.acquirerBankCountryCode, (Object) channel.acquirerBankCountryCode) && this.googlePayReadyToUse == channel.googlePayReadyToUse && this.googlePaySupportedButNotSetup == channel.googlePaySupportedButNotSetup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquirerBankCountryCode() {
        return this.acquirerBankCountryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowManualAddition() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableAmount() {
        return this.availableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BankingHours getBankingHours() {
        return this.bankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestChannel() {
        return this.bestChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode getCategoryCode() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChangeDisplay() {
        return this.changeDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckoutAccountUrl() {
        return this.checkoutAccountUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomerUrl() {
        return this.customerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepositPlatformId() {
        return this.depositPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDepositToWithdraw() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayIconUrl() {
        return this.displayIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayIconUrlNight() {
        return this.displayIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayText() {
        return this.displayText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption getEarnOption() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExclusive() {
        return this.exclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CExtCollectInfo getExtCollectInfo() {
        return this.extCollectInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedPriceTolerance() {
        return this.fixedPriceTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGooglePayReadyToUse() {
        return this.googlePayReadyToUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGooglePaySupportedButNotSetup() {
        return this.googlePaySupportedButNotSetup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getH5Path() {
        return this.h5Path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrlNight() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InformationBox getInformationBox() {
        return this.informationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKycType() {
        return this.kycType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfo getLimitInfo() {
        return this.limitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Localization getLocalization() {
        return this.localization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyle getLocalizationHighlightStyle() {
        return this.localizationHighlightStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLimitAmount() {
        return this.maxLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPurchaseTime() {
        return this.maxPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxWaitTimeForOrderStatusFetch() {
        return this.maxWaitTimeForOrderStatusFetch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFee() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLimitAmount() {
        return this.minLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPurchaseTime() {
        return this.minPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedCreateAccount() {
        return this.needCreateAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedQuote() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethod> getP2pPaymentMethodList() {
        return this.p2pPaymentMethodList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPayOnOk() {
        return this.payOnOk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethodCategory getPaymentMethodCategory() {
        return this.paymentMethodCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPreCheck() {
        return this.preCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getReceiptAccount() {
        return this.receiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestCurrency() {
        return this.requestCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSearchUrl() {
        return this.searchUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportCurrency() {
        return this.supportCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyInfo getSupportCurrencyInfo() {
        return this.supportCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSupportCurrencyScale() {
        return this.supportCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportStablecoin() {
        return this.supportStablecoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSupportedCountries() {
        return this.supportedCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSupportedOrderTypes() {
        return this.supportedOrderTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSupportedTransactionType() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannel getTermContent() {
        return this.termContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimit getTradeLimit() {
        return this.tradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingAgentInfo getTradingAgentInfo() {
        return this.tradingAgentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTutorialUrl() {
        return this.tutorialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControl getUiFlowControl() {
        return this.uiFlowControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseRealTimePrice() {
        return this.useRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawHoldCryptoAmount() {
        return this.withdrawHoldCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawHoldDays() {
        return this.withdrawHoldDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TradingAgentInfo tradingAgentInfo = this.tradingAgentInfo;
        int iHashCode = tradingAgentInfo == null ? 0 : tradingAgentInfo.hashCode();
        int iHashCode2 = this.availableAmount.hashCode();
        int iHashCode3 = Boolean.hashCode(this.bestChannel);
        int iHashCode4 = this.backgroundColor.hashCode();
        int iHashCode5 = this.categoryCode.hashCode();
        int iHashCode6 = Boolean.hashCode(this.changeDisplay);
        int iHashCode7 = this.customerUrl.hashCode();
        int iHashCode8 = this.depositName.hashCode();
        int iHashCode9 = this.depositPlatformCode.hashCode();
        int iHashCode10 = Integer.hashCode(this.depositPlatformId);
        int iHashCode11 = this.description.hashCode();
        int iHashCode12 = this.displayIconUrl.hashCode();
        int iHashCode13 = this.displayIconUrlNight.hashCode();
        int iHashCode14 = this.displayName.hashCode();
        int iHashCode15 = this.displayText.hashCode();
        int iHashCode16 = Boolean.hashCode(this.exclusive);
        B2CExtCollectInfo b2CExtCollectInfo = this.extCollectInfo;
        int iHashCode17 = b2CExtCollectInfo == null ? 0 : b2CExtCollectInfo.hashCode();
        int iHashCode18 = this.feeRate.hashCode();
        int iHashCode19 = Boolean.hashCode(this.isConvert);
        int iHashCode20 = Boolean.hashCode(this.isRealTimePrice);
        int iHashCode21 = this.maxLimitAmount.hashCode();
        int iHashCode22 = this.maxPurchaseTime.hashCode();
        int iHashCode23 = this.maxWaitTimeForOrderStatusFetch.hashCode();
        int iHashCode24 = this.minFee.hashCode();
        int iHashCode25 = this.minLimitAmount.hashCode();
        int iHashCode26 = this.minPurchaseTime.hashCode();
        int iHashCode27 = Boolean.hashCode(this.needQuote);
        List<PaymentMethod> list = this.p2pPaymentMethodList;
        int iHashCode28 = list == null ? 0 : list.hashCode();
        int iHashCode29 = Boolean.hashCode(this.payOnOk);
        int iHashCode30 = this.paymentMethodCategory.hashCode();
        List<PaymentMethod> list2 = this.paymentMethods;
        int iHashCode31 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.preCheck;
        int iHashCode32 = list3 == null ? 0 : list3.hashCode();
        int iHashCode33 = this.price.hashCode();
        List<String> list4 = this.receiptAccount;
        int iHashCode34 = list4 == null ? 0 : list4.hashCode();
        int iHashCode35 = this.searchUrl.hashCode();
        List<String> list5 = this.tags;
        int iHashCode36 = list5 == null ? 0 : list5.hashCode();
        TermContentChannel termContentChannel = this.termContent;
        int iHashCode37 = termContentChannel == null ? 0 : termContentChannel.hashCode();
        Integer num = this.timeUnit;
        int iHashCode38 = num == null ? 0 : num.hashCode();
        int iHashCode39 = this.tutorialUrl.hashCode();
        int iHashCode40 = Boolean.hashCode(this.useRealTimePrice);
        int iHashCode41 = this.checkoutAccountUrl.hashCode();
        int iHashCode42 = this.iconUrl.hashCode();
        int iHashCode43 = this.iconUrlNight.hashCode();
        int iHashCode44 = this.h5Path.hashCode();
        int iHashCode45 = this.faqUrl.hashCode();
        List<String> list6 = this.supportedTransactionType;
        int iHashCode46 = list6 == null ? 0 : list6.hashCode();
        List<String> list7 = this.supportedOrderTypes;
        int iHashCode47 = list7 == null ? 0 : list7.hashCode();
        int iHashCode48 = Boolean.hashCode(this.depositToWithdraw);
        Localization localization = this.localization;
        int iHashCode49 = localization == null ? 0 : localization.hashCode();
        LocalizationHighlightStyle localizationHighlightStyle = this.localizationHighlightStyle;
        int iHashCode50 = localizationHighlightStyle == null ? 0 : localizationHighlightStyle.hashCode();
        LimitInfo limitInfo = this.limitInfo;
        int iHashCode51 = limitInfo == null ? 0 : limitInfo.hashCode();
        InformationBox informationBox = this.informationBox;
        int iHashCode52 = informationBox == null ? 0 : informationBox.hashCode();
        BankingHours bankingHours = this.bankingHours;
        int iHashCode53 = bankingHours == null ? 0 : bankingHours.hashCode();
        UiFlowControl uiFlowControl = this.uiFlowControl;
        int iHashCode54 = uiFlowControl == null ? 0 : uiFlowControl.hashCode();
        int iHashCode55 = Boolean.hashCode(this.allowManualAddition);
        int iHashCode56 = this.withdrawHoldCryptoAmount.hashCode();
        int iHashCode57 = this.withdrawHoldDays.hashCode();
        TradeLimit tradeLimit = this.tradeLimit;
        int iHashCode58 = tradeLimit == null ? 0 : tradeLimit.hashCode();
        int iHashCode59 = this.fixedPriceTolerance.hashCode();
        int iHashCode60 = Boolean.hashCode(this.needCreateAccount);
        int iHashCode61 = this.target.hashCode();
        int iHashCode62 = this.baseAmount.hashCode();
        int iHashCode63 = this.quoteAmount.hashCode();
        int iHashCode64 = this.quoteCurrency.hashCode();
        int iHashCode65 = this.baseCurrency.hashCode();
        int iHashCode66 = this.requestCurrency.hashCode();
        int iHashCode67 = this.currencySymbol.hashCode();
        Integer num2 = this.kycType;
        int iHashCode68 = num2 == null ? 0 : num2.hashCode();
        int iHashCode69 = Boolean.hashCode(this.isUsingInstitutionVerification);
        int iHashCode70 = this.supportCurrency.hashCode();
        int iHashCode71 = Boolean.hashCode(this.supportStablecoin);
        int iHashCode72 = this.supportCurrencyInfo.hashCode();
        Integer num3 = this.supportCurrencyScale;
        int iHashCode73 = num3 == null ? 0 : num3.hashCode();
        EarnOption earnOption = this.earnOption;
        int iHashCode74 = earnOption == null ? 0 : earnOption.hashCode();
        List<String> list8 = this.supportedCountries;
        int iHashCode75 = list8 == null ? 0 : list8.hashCode();
        String str = this.acquirerBankCountryCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.googlePayReadyToUse)) * 31) + Boolean.hashCode(this.googlePaySupportedButNotSetup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRealTimePrice() {
        return this.isRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUsingInstitutionVerification() {
        return this.isUsingInstitutionVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcquirerBankCountryCode(String str) {
        this.acquirerBankCountryCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnOption(EarnOption earnOption) {
        this.earnOption = earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGooglePayReadyToUse(boolean z) {
        this.googlePayReadyToUse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGooglePaySupportedButNotSetup(boolean z) {
        this.googlePaySupportedButNotSetup = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKycType(Integer num) {
        this.kycType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethods(List<PaymentMethod> list) {
        this.paymentMethods = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.supportCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportCurrencyScale(Integer num) {
        this.supportCurrencyScale = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedCountries(List<String> list) {
        this.supportedCountries = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsingInstitutionVerification(boolean z) {
        this.isUsingInstitutionVerification = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Channel(tradingAgentInfo=" + this.tradingAgentInfo + ", availableAmount=" + this.availableAmount + ", bestChannel=" + this.bestChannel + ", backgroundColor=" + this.backgroundColor + ", categoryCode=" + this.categoryCode + ", changeDisplay=" + this.changeDisplay + ", customerUrl=" + this.customerUrl + ", depositName=" + this.depositName + ", depositPlatformCode=" + this.depositPlatformCode + ", depositPlatformId=" + this.depositPlatformId + ", description=" + this.description + ", displayIconUrl=" + this.displayIconUrl + ", displayIconUrlNight=" + this.displayIconUrlNight + ", displayName=" + this.displayName + ", displayText=" + this.displayText + ", exclusive=" + this.exclusive + ", extCollectInfo=" + this.extCollectInfo + ", feeRate=" + this.feeRate + ", isConvert=" + this.isConvert + ", isRealTimePrice=" + this.isRealTimePrice + ", maxLimitAmount=" + this.maxLimitAmount + ", maxPurchaseTime=" + this.maxPurchaseTime + ", maxWaitTimeForOrderStatusFetch=" + this.maxWaitTimeForOrderStatusFetch + ", minFee=" + this.minFee + ", minLimitAmount=" + this.minLimitAmount + ", minPurchaseTime=" + this.minPurchaseTime + ", needQuote=" + this.needQuote + ", p2pPaymentMethodList=" + this.p2pPaymentMethodList + ", payOnOk=" + this.payOnOk + ", paymentMethodCategory=" + this.paymentMethodCategory + ", paymentMethods=" + this.paymentMethods + ", preCheck=" + this.preCheck + ", price=" + this.price + ", receiptAccount=" + this.receiptAccount + ", searchUrl=" + this.searchUrl + ", tags=" + this.tags + ", termContent=" + this.termContent + ", timeUnit=" + this.timeUnit + ", tutorialUrl=" + this.tutorialUrl + ", useRealTimePrice=" + this.useRealTimePrice + ", checkoutAccountUrl=" + this.checkoutAccountUrl + ", iconUrl=" + this.iconUrl + ", iconUrlNight=" + this.iconUrlNight + ", h5Path=" + this.h5Path + ", faqUrl=" + this.faqUrl + ", supportedTransactionType=" + this.supportedTransactionType + ", supportedOrderTypes=" + this.supportedOrderTypes + ", depositToWithdraw=" + this.depositToWithdraw + ", localization=" + this.localization + ", localizationHighlightStyle=" + this.localizationHighlightStyle + ", limitInfo=" + this.limitInfo + ", informationBox=" + this.informationBox + ", bankingHours=" + this.bankingHours + ", uiFlowControl=" + this.uiFlowControl + ", allowManualAddition=" + this.allowManualAddition + ", withdrawHoldCryptoAmount=" + this.withdrawHoldCryptoAmount + ", withdrawHoldDays=" + this.withdrawHoldDays + ", tradeLimit=" + this.tradeLimit + ", fixedPriceTolerance=" + this.fixedPriceTolerance + ", needCreateAccount=" + this.needCreateAccount + ", target=" + this.target + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", requestCurrency=" + this.requestCurrency + ", currencySymbol=" + this.currencySymbol + ", kycType=" + this.kycType + ", isUsingInstitutionVerification=" + this.isUsingInstitutionVerification + ", supportCurrency=" + this.supportCurrency + ", supportStablecoin=" + this.supportStablecoin + ", supportCurrencyInfo=" + this.supportCurrencyInfo + ", supportCurrencyScale=" + this.supportCurrencyScale + ", earnOption=" + this.earnOption + ", supportedCountries=" + this.supportedCountries + ", acquirerBankCountryCode=" + this.acquirerBankCountryCode + ", googlePayReadyToUse=" + this.googlePayReadyToUse + ", googlePaySupportedButNotSetup=" + this.googlePaySupportedButNotSetup + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        TradingAgentInfo tradingAgentInfo = this.tradingAgentInfo;
        if (tradingAgentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradingAgentInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.availableAmount);
        parcel.writeInt(this.bestChannel ? 1 : 0);
        parcel.writeString(this.backgroundColor);
        this.categoryCode.writeToParcel(parcel, i);
        parcel.writeInt(this.changeDisplay ? 1 : 0);
        parcel.writeString(this.customerUrl);
        parcel.writeString(this.depositName);
        parcel.writeString(this.depositPlatformCode);
        parcel.writeInt(this.depositPlatformId);
        parcel.writeString(this.description);
        parcel.writeString(this.displayIconUrl);
        parcel.writeString(this.displayIconUrlNight);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayText);
        parcel.writeInt(this.exclusive ? 1 : 0);
        B2CExtCollectInfo b2CExtCollectInfo = this.extCollectInfo;
        if (b2CExtCollectInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b2CExtCollectInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.feeRate);
        parcel.writeInt(this.isConvert ? 1 : 0);
        parcel.writeInt(this.isRealTimePrice ? 1 : 0);
        parcel.writeString(this.maxLimitAmount);
        parcel.writeString(this.maxPurchaseTime);
        parcel.writeString(this.maxWaitTimeForOrderStatusFetch);
        parcel.writeString(this.minFee);
        parcel.writeString(this.minLimitAmount);
        parcel.writeString(this.minPurchaseTime);
        parcel.writeInt(this.needQuote ? 1 : 0);
        List<PaymentMethod> list = this.p2pPaymentMethodList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.payOnOk ? 1 : 0);
        this.paymentMethodCategory.writeToParcel(parcel, i);
        List<PaymentMethod> list2 = this.paymentMethods;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PaymentMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.preCheck);
        parcel.writeString(this.price);
        parcel.writeStringList(this.receiptAccount);
        parcel.writeString(this.searchUrl);
        parcel.writeStringList(this.tags);
        TermContentChannel termContentChannel = this.termContent;
        if (termContentChannel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termContentChannel.writeToParcel(parcel, i);
        }
        Integer num = this.timeUnit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.tutorialUrl);
        parcel.writeInt(this.useRealTimePrice ? 1 : 0);
        parcel.writeString(this.checkoutAccountUrl);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.iconUrlNight);
        parcel.writeString(this.h5Path);
        parcel.writeString(this.faqUrl);
        parcel.writeStringList(this.supportedTransactionType);
        parcel.writeStringList(this.supportedOrderTypes);
        parcel.writeInt(this.depositToWithdraw ? 1 : 0);
        Localization localization = this.localization;
        if (localization == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localization.writeToParcel(parcel, i);
        }
        LocalizationHighlightStyle localizationHighlightStyle = this.localizationHighlightStyle;
        if (localizationHighlightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizationHighlightStyle.writeToParcel(parcel, i);
        }
        LimitInfo limitInfo = this.limitInfo;
        if (limitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitInfo.writeToParcel(parcel, i);
        }
        InformationBox informationBox = this.informationBox;
        if (informationBox == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            informationBox.writeToParcel(parcel, i);
        }
        BankingHours bankingHours = this.bankingHours;
        if (bankingHours == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bankingHours.writeToParcel(parcel, i);
        }
        UiFlowControl uiFlowControl = this.uiFlowControl;
        if (uiFlowControl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uiFlowControl.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.allowManualAddition ? 1 : 0);
        parcel.writeString(this.withdrawHoldCryptoAmount);
        parcel.writeString(this.withdrawHoldDays);
        TradeLimit tradeLimit = this.tradeLimit;
        if (tradeLimit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeLimit.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fixedPriceTolerance);
        parcel.writeInt(this.needCreateAccount ? 1 : 0);
        parcel.writeString(this.target);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.requestCurrency);
        parcel.writeString(this.currencySymbol);
        Integer num2 = this.kycType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.isUsingInstitutionVerification ? 1 : 0);
        parcel.writeString(this.supportCurrency);
        parcel.writeInt(this.supportStablecoin ? 1 : 0);
        this.supportCurrencyInfo.writeToParcel(parcel, i);
        Integer num3 = this.supportCurrencyScale;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        EarnOption earnOption = this.earnOption;
        if (earnOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOption.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.supportedCountries);
        parcel.writeString(this.acquirerBankCountryCode);
        parcel.writeInt(this.googlePayReadyToUse ? 1 : 0);
        parcel.writeInt(this.googlePaySupportedButNotSetup ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.Channel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Channel> serializer() {
            return Channel$$serializer.INSTANCE;
        }
    }

    static {
        PaymentMethod$$serializer paymentMethod$$serializer = PaymentMethod$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, ChannelCategoryCode.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(paymentMethod$$serializer), null, PaymentMethodCategory.Companion.serializer(), new ArrayListSerializer(paymentMethod$$serializer), new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null};
    }

    public /* synthetic */ Channel(int i, int i2, int i3, TradingAgentInfo tradingAgentInfo, String str, boolean z, String str2, ChannelCategoryCode channelCategoryCode, boolean z2, String str3, String str4, String str5, int i4, String str6, String str7, String str8, String str9, String str10, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, String str11, boolean z4, boolean z5, String str12, String str13, String str14, String str15, String str16, String str17, boolean z6, List list, boolean z7, PaymentMethodCategory paymentMethodCategory, List list2, List list3, String str18, List list4, String str19, List list5, TermContentChannel termContentChannel, Integer num, String str20, boolean z8, String str21, String str22, String str23, String str24, String str25, List list6, List list7, boolean z9, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, boolean z10, String str26, String str27, TradeLimit tradeLimit, String str28, boolean z11, String str29, String str30, String str31, String str32, String str33, String str34, String str35, Integer num2, boolean z12, String str36, boolean z13, SupportCurrencyInfo supportCurrencyInfo, Integer num3, EarnOption earnOption, List list8, String str37, boolean z14, boolean z15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradingAgentInfo = null;
        } else {
            this.tradingAgentInfo = tradingAgentInfo;
        }
        if ((i & 2) == 0) {
            this.availableAmount = "";
        } else {
            this.availableAmount = str;
        }
        if ((i & 4) == 0) {
            this.bestChannel = false;
        } else {
            this.bestChannel = z;
        }
        if ((i & 8) == 0) {
            this.backgroundColor = "";
        } else {
            this.backgroundColor = str2;
        }
        this.categoryCode = (i & 16) == 0 ? ChannelCategoryCode.BALANCE : channelCategoryCode;
        if ((i & 32) == 0) {
            this.changeDisplay = false;
        } else {
            this.changeDisplay = z2;
        }
        if ((i & 64) == 0) {
            this.customerUrl = "";
        } else {
            this.customerUrl = str3;
        }
        if ((i & 128) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str4;
        }
        if ((i & 256) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str5;
        }
        this.depositPlatformId = (i & 512) == 0 ? -1 : i4;
        if ((i & 1024) == 0) {
            this.description = "";
        } else {
            this.description = str6;
        }
        if ((i & 2048) == 0) {
            this.displayIconUrl = "";
        } else {
            this.displayIconUrl = str7;
        }
        if ((i & 4096) == 0) {
            this.displayIconUrlNight = "";
        } else {
            this.displayIconUrlNight = str8;
        }
        if ((i & 8192) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str9;
        }
        if ((i & 16384) == 0) {
            this.displayText = "";
        } else {
            this.displayText = str10;
        }
        if ((i & 32768) == 0) {
            this.exclusive = false;
        } else {
            this.exclusive = z3;
        }
        if ((i & 65536) == 0) {
            this.extCollectInfo = null;
        } else {
            this.extCollectInfo = b2CExtCollectInfo;
        }
        if ((i & 131072) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str11;
        }
        if ((262144 & i) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z4;
        }
        if ((524288 & i) == 0) {
            this.isRealTimePrice = false;
        } else {
            this.isRealTimePrice = z5;
        }
        if ((1048576 & i) == 0) {
            this.maxLimitAmount = "0";
        } else {
            this.maxLimitAmount = str12;
        }
        if ((2097152 & i) == 0) {
            this.maxPurchaseTime = "0";
        } else {
            this.maxPurchaseTime = str13;
        }
        this.maxWaitTimeForOrderStatusFetch = (4194304 & i) == 0 ? "15" : str14;
        if ((8388608 & i) == 0) {
            this.minFee = "";
        } else {
            this.minFee = str15;
        }
        if ((16777216 & i) == 0) {
            this.minLimitAmount = "0";
        } else {
            this.minLimitAmount = str16;
        }
        if ((33554432 & i) == 0) {
            this.minPurchaseTime = "0";
        } else {
            this.minPurchaseTime = str17;
        }
        if ((67108864 & i) == 0) {
            this.needQuote = false;
        } else {
            this.needQuote = z6;
        }
        if ((134217728 & i) == 0) {
            this.p2pPaymentMethodList = null;
        } else {
            this.p2pPaymentMethodList = list;
        }
        if ((268435456 & i) == 0) {
            this.payOnOk = false;
        } else {
            this.payOnOk = z7;
        }
        this.paymentMethodCategory = (536870912 & i) == 0 ? PaymentMethodCategory.CASH : paymentMethodCategory;
        if ((1073741824 & i) == 0) {
            this.paymentMethods = null;
        } else {
            this.paymentMethods = list2;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.preCheck = null;
        } else {
            this.preCheck = list3;
        }
        if ((i2 & 1) == 0) {
            this.price = "0";
        } else {
            this.price = str18;
        }
        if ((i2 & 2) == 0) {
            this.receiptAccount = null;
        } else {
            this.receiptAccount = list4;
        }
        if ((i2 & 4) == 0) {
            this.searchUrl = "";
        } else {
            this.searchUrl = str19;
        }
        if ((i2 & 8) == 0) {
            this.tags = null;
        } else {
            this.tags = list5;
        }
        if ((i2 & 16) == 0) {
            this.termContent = null;
        } else {
            this.termContent = termContentChannel;
        }
        if ((i2 & 32) == 0) {
            this.timeUnit = null;
        } else {
            this.timeUnit = num;
        }
        if ((i2 & 64) == 0) {
            this.tutorialUrl = "";
        } else {
            this.tutorialUrl = str20;
        }
        if ((i2 & 128) == 0) {
            this.useRealTimePrice = false;
        } else {
            this.useRealTimePrice = z8;
        }
        if ((i2 & 256) == 0) {
            this.checkoutAccountUrl = "";
        } else {
            this.checkoutAccountUrl = str21;
        }
        if ((i2 & 512) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str22;
        }
        if ((i2 & 1024) == 0) {
            this.iconUrlNight = "";
        } else {
            this.iconUrlNight = str23;
        }
        if ((i2 & 2048) == 0) {
            this.h5Path = "";
        } else {
            this.h5Path = str24;
        }
        if ((i2 & 4096) == 0) {
            this.faqUrl = "";
        } else {
            this.faqUrl = str25;
        }
        if ((i2 & 8192) == 0) {
            this.supportedTransactionType = null;
        } else {
            this.supportedTransactionType = list6;
        }
        if ((i2 & 16384) == 0) {
            this.supportedOrderTypes = null;
        } else {
            this.supportedOrderTypes = list7;
        }
        if ((i2 & 32768) == 0) {
            this.depositToWithdraw = false;
        } else {
            this.depositToWithdraw = z9;
        }
        if ((i2 & 65536) == 0) {
            this.localization = null;
        } else {
            this.localization = localization;
        }
        if ((i2 & 131072) == 0) {
            this.localizationHighlightStyle = null;
        } else {
            this.localizationHighlightStyle = localizationHighlightStyle;
        }
        if ((262144 & i2) == 0) {
            this.limitInfo = null;
        } else {
            this.limitInfo = limitInfo;
        }
        if ((524288 & i2) == 0) {
            this.informationBox = null;
        } else {
            this.informationBox = informationBox;
        }
        if ((1048576 & i2) == 0) {
            this.bankingHours = null;
        } else {
            this.bankingHours = bankingHours;
        }
        if ((2097152 & i2) == 0) {
            this.uiFlowControl = null;
        } else {
            this.uiFlowControl = uiFlowControl;
        }
        if ((4194304 & i2) == 0) {
            this.allowManualAddition = false;
        } else {
            this.allowManualAddition = z10;
        }
        if ((8388608 & i2) == 0) {
            this.withdrawHoldCryptoAmount = "";
        } else {
            this.withdrawHoldCryptoAmount = str26;
        }
        if ((16777216 & i2) == 0) {
            this.withdrawHoldDays = "";
        } else {
            this.withdrawHoldDays = str27;
        }
        this.tradeLimit = (33554432 & i2) == 0 ? new TradeLimit((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimit;
        if ((67108864 & i2) == 0) {
            this.fixedPriceTolerance = "";
        } else {
            this.fixedPriceTolerance = str28;
        }
        if ((134217728 & i2) == 0) {
            this.needCreateAccount = false;
        } else {
            this.needCreateAccount = z11;
        }
        if ((268435456 & i2) == 0) {
            this.target = "";
        } else {
            this.target = str29;
        }
        if ((536870912 & i2) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str30;
        }
        if ((1073741824 & i2) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str31;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str32;
        }
        if ((i3 & 1) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str33;
        }
        if ((i3 & 2) == 0) {
            this.requestCurrency = "";
        } else {
            this.requestCurrency = str34;
        }
        if ((i3 & 4) == 0) {
            this.currencySymbol = "";
        } else {
            this.currencySymbol = str35;
        }
        if ((i3 & 8) == 0) {
            this.kycType = null;
        } else {
            this.kycType = num2;
        }
        if ((i3 & 16) == 0) {
            this.isUsingInstitutionVerification = false;
        } else {
            this.isUsingInstitutionVerification = z12;
        }
        if ((i3 & 32) == 0) {
            this.supportCurrency = "";
        } else {
            this.supportCurrency = str36;
        }
        if ((i3 & 64) == 0) {
            this.supportStablecoin = false;
        } else {
            this.supportStablecoin = z13;
        }
        this.supportCurrencyInfo = (i3 & 128) == 0 ? new SupportCurrencyInfo((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null) : supportCurrencyInfo;
        if ((i3 & 256) == 0) {
            this.supportCurrencyScale = null;
        } else {
            this.supportCurrencyScale = num3;
        }
        if ((i3 & 512) == 0) {
            this.earnOption = null;
        } else {
            this.earnOption = earnOption;
        }
        if ((i3 & 1024) == 0) {
            this.supportedCountries = null;
        } else {
            this.supportedCountries = list8;
        }
        if ((i3 & 2048) == 0) {
            this.acquirerBankCountryCode = null;
        } else {
            this.acquirerBankCountryCode = str37;
        }
        if ((i3 & 4096) == 0) {
            this.googlePayReadyToUse = false;
        } else {
            this.googlePayReadyToUse = z14;
        }
        if ((i3 & 8192) == 0) {
            this.googlePaySupportedButNotSetup = false;
        } else {
            this.googlePaySupportedButNotSetup = z15;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [14=5] */
    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(Channel channel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || channel.tradingAgentInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TradingAgentInfo$$serializer.INSTANCE, channel.tradingAgentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) channel.availableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, channel.availableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || channel.bestChannel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, channel.bestChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) channel.backgroundColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, channel.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || channel.categoryCode != ChannelCategoryCode.BALANCE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], channel.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || channel.changeDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, channel.changeDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) channel.customerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, channel.customerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) channel.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, channel.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) channel.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, channel.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || channel.depositPlatformId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, channel.depositPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) channel.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, channel.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) channel.displayIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, channel.displayIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) channel.displayIconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, channel.displayIconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) channel.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, channel.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) channel.displayText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, channel.displayText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || channel.exclusive) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, channel.exclusive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || channel.extCollectInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, B2CExtCollectInfo$$serializer.INSTANCE, channel.extCollectInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) channel.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, channel.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || channel.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, channel.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || channel.isRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, channel.isRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) channel.maxLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, channel.maxLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) channel.maxPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, channel.maxPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) channel.maxWaitTimeForOrderStatusFetch, (Object) "15")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, channel.maxWaitTimeForOrderStatusFetch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) channel.minFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, channel.minFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) channel.minLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, channel.minLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) channel.minPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, channel.minPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || channel.needQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, channel.needQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || channel.p2pPaymentMethodList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], channel.p2pPaymentMethodList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || channel.payOnOk) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, channel.payOnOk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || channel.paymentMethodCategory != PaymentMethodCategory.CASH) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 29, kSerializerArr[29], channel.paymentMethodCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || channel.paymentMethods != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, kSerializerArr[30], channel.paymentMethods);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || channel.preCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], channel.preCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) channel.price, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, channel.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || channel.receiptAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, kSerializerArr[33], channel.receiptAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) channel.searchUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, channel.searchUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || channel.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], channel.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || channel.termContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, TermContentChannel$$serializer.INSTANCE, channel.termContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || channel.timeUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, IntSerializer.INSTANCE, channel.timeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) channel.tutorialUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, channel.tutorialUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || channel.useRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, channel.useRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) channel.checkoutAccountUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, channel.checkoutAccountUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) channel.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, channel.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) channel.iconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, channel.iconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) channel.h5Path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, channel.h5Path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) channel.faqUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, channel.faqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || channel.supportedTransactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, kSerializerArr[45], channel.supportedTransactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || channel.supportedOrderTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, kSerializerArr[46], channel.supportedOrderTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || channel.depositToWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 47, channel.depositToWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || channel.localization != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, Localization$$serializer.INSTANCE, channel.localization);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || channel.localizationHighlightStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, LocalizationHighlightStyle$$serializer.INSTANCE, channel.localizationHighlightStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || channel.limitInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, LimitInfo$$serializer.INSTANCE, channel.limitInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || channel.informationBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, InformationBox$$serializer.INSTANCE, channel.informationBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || channel.bankingHours != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, BankingHours$$serializer.INSTANCE, channel.bankingHours);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || channel.uiFlowControl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, UiFlowControl$$serializer.INSTANCE, channel.uiFlowControl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || channel.allowManualAddition) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 54, channel.allowManualAddition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) channel.withdrawHoldCryptoAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, channel.withdrawHoldCryptoAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) channel.withdrawHoldDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, channel.withdrawHoldDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd(channel.tradeLimit, new TradeLimit((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, TradeLimit$$serializer.INSTANCE, channel.tradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) channel.fixedPriceTolerance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, channel.fixedPriceTolerance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || channel.needCreateAccount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 59, channel.needCreateAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) channel.target, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, channel.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) channel.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, channel.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) channel.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, channel.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) channel.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, channel.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) channel.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, channel.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) channel.requestCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, channel.requestCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) channel.currencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, channel.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || channel.kycType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, IntSerializer.INSTANCE, channel.kycType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || channel.isUsingInstitutionVerification) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 68, channel.isUsingInstitutionVerification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) channel.supportCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, channel.supportCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || channel.supportStablecoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 70, channel.supportStablecoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || !Intrinsics.EZpvd(channel.supportCurrencyInfo, new SupportCurrencyInfo((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 71, SupportCurrencyInfo$$serializer.INSTANCE, channel.supportCurrencyInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || channel.supportCurrencyScale != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, IntSerializer.INSTANCE, channel.supportCurrencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || channel.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 73, EarnOption$$serializer.INSTANCE, channel.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || channel.supportedCountries != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 74, kSerializerArr[74], channel.supportedCountries);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || channel.acquirerBankCountryCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 75, StringSerializer.INSTANCE, channel.acquirerBankCountryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || channel.googlePayReadyToUse) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 76, channel.googlePayReadyToUse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || channel.googlePaySupportedButNotSetup) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 77, channel.googlePaySupportedButNotSetup);
        }
    }

    public Channel(TradingAgentInfo tradingAgentInfo, @NotNull String str, boolean z, @NotNull String str2, @NotNull ChannelCategoryCode channelCategoryCode, boolean z2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, @NotNull String str11, boolean z4, boolean z5, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, boolean z6, List<PaymentMethod> list, boolean z7, @NotNull PaymentMethodCategory paymentMethodCategory, List<PaymentMethod> list2, List<String> list3, @NotNull String str18, List<String> list4, @NotNull String str19, List<String> list5, TermContentChannel termContentChannel, Integer num, @NotNull String str20, boolean z8, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, List<String> list6, List<String> list7, boolean z9, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, boolean z10, @NotNull String str26, @NotNull String str27, TradeLimit tradeLimit, @NotNull String str28, boolean z11, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, Integer num2, boolean z12, @NotNull String str36, boolean z13, @NotNull SupportCurrencyInfo supportCurrencyInfo, Integer num3, EarnOption earnOption, List<String> list8, String str37, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(supportCurrencyInfo, "");
        this.tradingAgentInfo = tradingAgentInfo;
        this.availableAmount = str;
        this.bestChannel = z;
        this.backgroundColor = str2;
        this.categoryCode = channelCategoryCode;
        this.changeDisplay = z2;
        this.customerUrl = str3;
        this.depositName = str4;
        this.depositPlatformCode = str5;
        this.depositPlatformId = i;
        this.description = str6;
        this.displayIconUrl = str7;
        this.displayIconUrlNight = str8;
        this.displayName = str9;
        this.displayText = str10;
        this.exclusive = z3;
        this.extCollectInfo = b2CExtCollectInfo;
        this.feeRate = str11;
        this.isConvert = z4;
        this.isRealTimePrice = z5;
        this.maxLimitAmount = str12;
        this.maxPurchaseTime = str13;
        this.maxWaitTimeForOrderStatusFetch = str14;
        this.minFee = str15;
        this.minLimitAmount = str16;
        this.minPurchaseTime = str17;
        this.needQuote = z6;
        this.p2pPaymentMethodList = list;
        this.payOnOk = z7;
        this.paymentMethodCategory = paymentMethodCategory;
        this.paymentMethods = list2;
        this.preCheck = list3;
        this.price = str18;
        this.receiptAccount = list4;
        this.searchUrl = str19;
        this.tags = list5;
        this.termContent = termContentChannel;
        this.timeUnit = num;
        this.tutorialUrl = str20;
        this.useRealTimePrice = z8;
        this.checkoutAccountUrl = str21;
        this.iconUrl = str22;
        this.iconUrlNight = str23;
        this.h5Path = str24;
        this.faqUrl = str25;
        this.supportedTransactionType = list6;
        this.supportedOrderTypes = list7;
        this.depositToWithdraw = z9;
        this.localization = localization;
        this.localizationHighlightStyle = localizationHighlightStyle;
        this.limitInfo = limitInfo;
        this.informationBox = informationBox;
        this.bankingHours = bankingHours;
        this.uiFlowControl = uiFlowControl;
        this.allowManualAddition = z10;
        this.withdrawHoldCryptoAmount = str26;
        this.withdrawHoldDays = str27;
        this.tradeLimit = tradeLimit;
        this.fixedPriceTolerance = str28;
        this.needCreateAccount = z11;
        this.target = str29;
        this.baseAmount = str30;
        this.quoteAmount = str31;
        this.quoteCurrency = str32;
        this.baseCurrency = str33;
        this.requestCurrency = str34;
        this.currencySymbol = str35;
        this.kycType = num2;
        this.isUsingInstitutionVerification = z12;
        this.supportCurrency = str36;
        this.supportStablecoin = z13;
        this.supportCurrencyInfo = supportCurrencyInfo;
        this.supportCurrencyScale = num3;
        this.earnOption = earnOption;
        this.supportedCountries = list8;
        this.acquirerBankCountryCode = str37;
        this.googlePayReadyToUse = z14;
        this.googlePaySupportedButNotSetup = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Channel(TradingAgentInfo tradingAgentInfo, String str, boolean z, String str2, ChannelCategoryCode channelCategoryCode, boolean z2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, String str11, boolean z4, boolean z5, String str12, String str13, String str14, String str15, String str16, String str17, boolean z6, List list, boolean z7, PaymentMethodCategory paymentMethodCategory, List list2, List list3, String str18, List list4, String str19, List list5, TermContentChannel termContentChannel, Integer num, String str20, boolean z8, String str21, String str22, String str23, String str24, String str25, List list6, List list7, boolean z9, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, boolean z10, String str26, String str27, TradeLimit tradeLimit, String str28, boolean z11, String str29, String str30, String str31, String str32, String str33, String str34, String str35, Integer num2, boolean z12, String str36, boolean z13, SupportCurrencyInfo supportCurrencyInfo, Integer num3, EarnOption earnOption, List list8, String str37, boolean z14, boolean z15, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str38;
        TradingAgentInfo tradingAgentInfo2 = (i2 & 1) != 0 ? null : tradingAgentInfo;
        String str39 = (i2 & 2) != 0 ? "" : str;
        boolean z16 = (i2 & 4) != 0 ? false : z;
        String str40 = (i2 & 8) != 0 ? "" : str2;
        ChannelCategoryCode channelCategoryCode2 = (i2 & 16) != 0 ? ChannelCategoryCode.BALANCE : channelCategoryCode;
        boolean z17 = (i2 & 32) != 0 ? false : z2;
        String str41 = (i2 & 64) != 0 ? "" : str3;
        String str42 = (i2 & 128) != 0 ? "" : str4;
        String str43 = (i2 & 256) != 0 ? "" : str5;
        int i5 = (i2 & 512) != 0 ? -1 : i;
        String str44 = (i2 & 1024) != 0 ? "" : str6;
        String str45 = (i2 & 2048) != 0 ? "" : str7;
        str38 = "";
        String str46 = (i2 & 4096) != 0 ? str38 : str8;
        String str47 = (i2 & 8192) != 0 ? str38 : str9;
        String str48 = (i2 & 16384) != 0 ? str38 : str10;
        boolean z18 = (i2 & 32768) != 0 ? false : z3;
        B2CExtCollectInfo b2CExtCollectInfo2 = (i2 & 65536) != 0 ? null : b2CExtCollectInfo;
        String str49 = (i2 & 131072) != 0 ? str38 : str11;
        boolean z19 = (i2 & 262144) != 0 ? false : z4;
        boolean z20 = (i2 & 524288) != 0 ? false : z5;
        String str50 = (i2 & 1048576) != 0 ? "0" : str12;
        String str51 = (i2 & 2097152) != 0 ? "0" : str13;
        String str52 = (i2 & 4194304) != 0 ? "15" : str14;
        String str53 = (i2 & 8388608) != 0 ? str38 : str15;
        String str54 = (i2 & 16777216) != 0 ? "0" : str16;
        String str55 = (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "0" : str17;
        boolean z21 = (i2 & 67108864) != 0 ? false : z6;
        List list9 = (i2 & 134217728) != 0 ? null : list;
        boolean z22 = (i2 & 268435456) != 0 ? false : z7;
        PaymentMethodCategory paymentMethodCategory2 = (i2 & 536870912) != 0 ? PaymentMethodCategory.CASH : paymentMethodCategory;
        List list10 = (i2 & 1073741824) != 0 ? null : list2;
        List list11 = (i2 & Integer.MIN_VALUE) != 0 ? null : list3;
        this(tradingAgentInfo2, str39, z16, str40, channelCategoryCode2, z17, str41, str42, str43, i5, str44, str45, str46, str47, str48, z18, b2CExtCollectInfo2, str49, z19, z20, str50, str51, str52, str53, str54, str55, z21, list9, z22, paymentMethodCategory2, list10, list11, (i3 & 1) == 0 ? str18 : "0", (i3 & 2) != 0 ? null : list4, (i3 & 4) != 0 ? str38 : str19, (i3 & 8) != 0 ? null : list5, (i3 & 16) != 0 ? null : termContentChannel, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? str38 : str20, (i3 & 128) != 0 ? false : z8, (i3 & 256) != 0 ? str38 : str21, (i3 & 512) != 0 ? str38 : str22, (i3 & 1024) != 0 ? str38 : str23, (i3 & 2048) != 0 ? str38 : str24, (i3 & 4096) != 0 ? str38 : str25, (i3 & 8192) != 0 ? null : list6, (i3 & 16384) != 0 ? null : list7, (i3 & 32768) != 0 ? false : z9, (i3 & 65536) != 0 ? null : localization, (i3 & 131072) != 0 ? null : localizationHighlightStyle, (i3 & 262144) != 0 ? null : limitInfo, (i3 & 524288) != 0 ? null : informationBox, (i3 & 1048576) != 0 ? null : bankingHours, (i3 & 2097152) != 0 ? null : uiFlowControl, (i3 & 4194304) != 0 ? false : z10, (i3 & 8388608) != 0 ? str38 : str26, (i3 & 16777216) != 0 ? str38 : str27, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new TradeLimit((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimit, (i3 & 67108864) != 0 ? str38 : str28, (i3 & 134217728) != 0 ? false : z11, (i3 & 268435456) != 0 ? str38 : str29, (i3 & 536870912) != 0 ? str38 : str30, (i3 & 1073741824) != 0 ? str38 : str31, (i3 & Integer.MIN_VALUE) != 0 ? str38 : str32, (i4 & 1) != 0 ? str38 : str33, (i4 & 2) != 0 ? str38 : str34, (i4 & 4) != 0 ? str38 : str35, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? false : z12, (i4 & 32) == 0 ? str36 : "", (i4 & 64) != 0 ? false : z13, (i4 & 128) != 0 ? new SupportCurrencyInfo((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null) : supportCurrencyInfo, (i4 & 256) != 0 ? null : num3, (i4 & 512) != 0 ? null : earnOption, (i4 & 1024) != 0 ? null : list8, (i4 & 2048) != 0 ? null : str37, (i4 & 4096) != 0 ? false : z14, (i4 & 8192) != 0 ? false : z15);
    }
}
