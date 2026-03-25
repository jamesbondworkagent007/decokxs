package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ChannelResponseBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String acquirerBankCountryCode;
    private final boolean allowManualAddition;
    private final String availableAmount;
    private final String backgroundColor;
    private final BankingHoursResponseBean bankingHours;
    private final String baseAmount;
    private final boolean bestChannel;
    private final int categoryCode;
    private final boolean changeDisplay;
    private final String checkoutAccountUrl;
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
    private final EarnOptionResponseBean earnOption;
    private final boolean exclusive;
    private final B2CExtCollectInfoResponseBean extCollectInfo;
    private final String faqUrl;
    private final String feeRate;
    private final String h5Path;
    private final String iconUrl;
    private final String iconUrlNight;
    private final InformationBoxResponseBean informationBox;
    private final boolean isConvert;
    private final boolean isRealTimePrice;
    private boolean isUsingInstitutionVerification;
    private final Integer kycType;
    private final LimitInfoResponseBean limitInfo;
    private final LocalizationResponseBean localization;
    private final LocalizationHighlightStyleResponseBean localizationHighlightStyle;
    private final String maxLimitAmount;
    private final String maxPurchaseTime;
    private final String maxWaitTimeForOrderStatusFetch;
    private final String minFee;
    private final String minLimitAmount;
    private final String minPurchaseTime;
    private final boolean needQuote;
    private final List<PaymentMethodResponseBean> p2pPaymentMethodList;
    private final boolean payOnOk;
    private final int paymentMethodCategory;
    private List<PaymentMethodResponseBean> paymentMethods;
    private final List<String> preCheck;
    private final String price;
    private final String quoteAmount;
    private final List<String> receiptAccount;
    private final String searchUrl;
    private final String supportCurrency;
    private final SupportCurrencyInfoResponseBean supportCurrencyInfo;
    private final Integer supportCurrencyScale;
    private List<String> supportedCountries;
    private final List<String> supportedOrderTypes;
    private final List<String> supportedTransactionType;
    private final List<String> tags;
    private final String target;
    private final TermContentChannelResponseBean termContent;
    private final Integer timeUnit;
    private final TradeLimitResponseBean tradeLimit;
    private final TradingAgentInfo tradingAgentInfo;
    private final String tutorialUrl;
    private final UiFlowControlResponseBean uiFlowControl;
    private final String unavailableAmount;
    private final boolean useRealTimePrice;
    private final String withdrawHoldCryptoAmount;
    private final String withdrawHoldDays;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChannelResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ChannelResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelResponseBean createFromParcel(Parcel parcel) {
            B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            TradingAgentInfo tradingAgentInfoCreateFromParcel = parcel.readInt() == 0 ? null : TradingAgentInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            int i = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i2 = parcel.readInt();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : B2CExtCollectInfoResponseBean.CREATOR.createFromParcel(parcel);
            String string13 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                b2CExtCollectInfoResponseBean = b2CExtCollectInfoResponseBeanCreateFromParcel;
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                b2CExtCollectInfoResponseBean = b2CExtCollectInfoResponseBeanCreateFromParcel;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList4.add(PaymentMethodResponseBean.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList4;
            }
            boolean z7 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                arrayList2 = arrayList;
                int i7 = 0;
                while (i7 != i6) {
                    arrayList5.add(PaymentMethodResponseBean.CREATOR.createFromParcel(parcel));
                    i7++;
                    i6 = i6;
                }
                arrayList3 = arrayList5;
            }
            return new ChannelResponseBean(tradingAgentInfoCreateFromParcel, string, string2, string3, z, string4, i, z2, string5, string6, string7, i2, string8, string9, string10, string11, string12, z3, b2CExtCollectInfoResponseBean, string13, z4, z5, string14, string15, string16, string17, string18, string19, z6, arrayList2, z7, i5, arrayList3, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TermContentChannelResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : LocalizationResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalizationHighlightStyleResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LimitInfoResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InformationBoxResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BankingHoursResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiFlowControlResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TradeLimitResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : SupportCurrencyInfoResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EarnOptionResponseBean.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelResponseBean[] newArray(int i) {
            return new ChannelResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelResponseBean() {
        this((TradingAgentInfo) null, (String) null, (String) null, (String) null, false, (String) null, 0, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfoResponseBean) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, 0, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannelResponseBean) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (List) null, false, false, (LocalizationResponseBean) null, (LocalizationHighlightStyleResponseBean) null, (LimitInfoResponseBean) null, (InformationBoxResponseBean) null, (BankingHoursResponseBean) null, (UiFlowControlResponseBean) null, (String) null, (String) null, (String) null, (TradeLimitResponseBean) null, (Integer) null, false, (String) null, (SupportCurrencyInfoResponseBean) null, (EarnOptionResponseBean) null, (List) null, (String) null, -1, -1, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingAgentInfo component1() {
        return this.tradingAgentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.depositPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.displayIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.displayIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.displayText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.exclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CExtCollectInfoResponseBean component19() {
        return this.extCollectInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.maxLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.maxPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.maxWaitTimeForOrderStatusFetch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.minLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.minPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unavailableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethodResponseBean> component30() {
        return this.p2pPaymentMethodList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.payOnOk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component32() {
        return this.paymentMethodCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethodResponseBean> component33() {
        return this.paymentMethods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component34() {
        return this.preCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component37() {
        return this.receiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.searchUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component39() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannelResponseBean component40() {
        return this.termContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component41() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.tutorialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.useRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.checkoutAccountUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.h5Path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component49() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.bestChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component50() {
        return this.supportCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component51() {
        return this.supportedOrderTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component52() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component53() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationResponseBean component54() {
        return this.localization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyleResponseBean component55() {
        return this.localizationHighlightStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfoResponseBean component56() {
        return this.limitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InformationBoxResponseBean component57() {
        return this.informationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BankingHoursResponseBean component58() {
        return this.bankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControlResponseBean component59() {
        return this.uiFlowControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.withdrawHoldCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.withdrawHoldDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimitResponseBean component63() {
        return this.tradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component64() {
        return this.kycType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component65() {
        return this.isUsingInstitutionVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.supportCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyInfoResponseBean component67() {
        return this.supportCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionResponseBean component68() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component69() {
        return this.supportedCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.acquirerBankCountryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.changeDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.customerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelResponseBean copy(TradingAgentInfo tradingAgentInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i, boolean z2, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, @NotNull String str13, boolean z4, boolean z5, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z6, List<PaymentMethodResponseBean> list, boolean z7, int i3, List<PaymentMethodResponseBean> list2, List<String> list3, @NotNull String str20, @NotNull String str21, List<String> list4, @NotNull String str22, List<String> list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, @NotNull String str23, boolean z8, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, List<String> list6, Integer num2, List<String> list7, boolean z9, boolean z10, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, @NotNull String str29, @NotNull String str30, @NotNull String str31, TradeLimitResponseBean tradeLimitResponseBean, Integer num3, boolean z11, @NotNull String str32, SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, EarnOptionResponseBean earnOptionResponseBean, List<String> list8, String str33) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
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
        return new ChannelResponseBean(tradingAgentInfo, str, str2, str3, z, str4, i, z2, str5, str6, str7, i2, str8, str9, str10, str11, str12, z3, b2CExtCollectInfoResponseBean, str13, z4, z5, str14, str15, str16, str17, str18, str19, z6, list, z7, i3, list2, list3, str20, str21, list4, str22, list5, termContentChannelResponseBean, num, str23, z8, str24, str25, str26, str27, str28, list6, num2, list7, z9, z10, localizationResponseBean, localizationHighlightStyleResponseBean, limitInfoResponseBean, informationBoxResponseBean, bankingHoursResponseBean, uiFlowControlResponseBean, str29, str30, str31, tradeLimitResponseBean, num3, z11, str32, supportCurrencyInfoResponseBean, earnOptionResponseBean, list8, str33);
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
        if (!(obj instanceof ChannelResponseBean)) {
            return false;
        }
        ChannelResponseBean channelResponseBean = (ChannelResponseBean) obj;
        return Intrinsics.EZpvd(this.tradingAgentInfo, channelResponseBean.tradingAgentInfo) && Intrinsics.EZpvd((Object) this.availableAmount, (Object) channelResponseBean.availableAmount) && Intrinsics.EZpvd((Object) this.unavailableAmount, (Object) channelResponseBean.unavailableAmount) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) channelResponseBean.baseAmount) && this.bestChannel == channelResponseBean.bestChannel && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) channelResponseBean.backgroundColor) && this.categoryCode == channelResponseBean.categoryCode && this.changeDisplay == channelResponseBean.changeDisplay && Intrinsics.EZpvd((Object) this.customerUrl, (Object) channelResponseBean.customerUrl) && Intrinsics.EZpvd((Object) this.depositName, (Object) channelResponseBean.depositName) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) channelResponseBean.depositPlatformCode) && this.depositPlatformId == channelResponseBean.depositPlatformId && Intrinsics.EZpvd((Object) this.description, (Object) channelResponseBean.description) && Intrinsics.EZpvd((Object) this.displayIconUrl, (Object) channelResponseBean.displayIconUrl) && Intrinsics.EZpvd((Object) this.displayIconUrlNight, (Object) channelResponseBean.displayIconUrlNight) && Intrinsics.EZpvd((Object) this.displayName, (Object) channelResponseBean.displayName) && Intrinsics.EZpvd((Object) this.displayText, (Object) channelResponseBean.displayText) && this.exclusive == channelResponseBean.exclusive && Intrinsics.EZpvd(this.extCollectInfo, channelResponseBean.extCollectInfo) && Intrinsics.EZpvd((Object) this.feeRate, (Object) channelResponseBean.feeRate) && this.isConvert == channelResponseBean.isConvert && this.isRealTimePrice == channelResponseBean.isRealTimePrice && Intrinsics.EZpvd((Object) this.maxLimitAmount, (Object) channelResponseBean.maxLimitAmount) && Intrinsics.EZpvd((Object) this.maxPurchaseTime, (Object) channelResponseBean.maxPurchaseTime) && Intrinsics.EZpvd((Object) this.maxWaitTimeForOrderStatusFetch, (Object) channelResponseBean.maxWaitTimeForOrderStatusFetch) && Intrinsics.EZpvd((Object) this.minFee, (Object) channelResponseBean.minFee) && Intrinsics.EZpvd((Object) this.minLimitAmount, (Object) channelResponseBean.minLimitAmount) && Intrinsics.EZpvd((Object) this.minPurchaseTime, (Object) channelResponseBean.minPurchaseTime) && this.needQuote == channelResponseBean.needQuote && Intrinsics.EZpvd(this.p2pPaymentMethodList, channelResponseBean.p2pPaymentMethodList) && this.payOnOk == channelResponseBean.payOnOk && this.paymentMethodCategory == channelResponseBean.paymentMethodCategory && Intrinsics.EZpvd(this.paymentMethods, channelResponseBean.paymentMethods) && Intrinsics.EZpvd(this.preCheck, channelResponseBean.preCheck) && Intrinsics.EZpvd((Object) this.price, (Object) channelResponseBean.price) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) channelResponseBean.quoteAmount) && Intrinsics.EZpvd(this.receiptAccount, channelResponseBean.receiptAccount) && Intrinsics.EZpvd((Object) this.searchUrl, (Object) channelResponseBean.searchUrl) && Intrinsics.EZpvd(this.tags, channelResponseBean.tags) && Intrinsics.EZpvd(this.termContent, channelResponseBean.termContent) && Intrinsics.EZpvd(this.timeUnit, channelResponseBean.timeUnit) && Intrinsics.EZpvd((Object) this.tutorialUrl, (Object) channelResponseBean.tutorialUrl) && this.useRealTimePrice == channelResponseBean.useRealTimePrice && Intrinsics.EZpvd((Object) this.checkoutAccountUrl, (Object) channelResponseBean.checkoutAccountUrl) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) channelResponseBean.iconUrl) && Intrinsics.EZpvd((Object) this.iconUrlNight, (Object) channelResponseBean.iconUrlNight) && Intrinsics.EZpvd((Object) this.h5Path, (Object) channelResponseBean.h5Path) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) channelResponseBean.faqUrl) && Intrinsics.EZpvd(this.supportedTransactionType, channelResponseBean.supportedTransactionType) && Intrinsics.EZpvd(this.supportCurrencyScale, channelResponseBean.supportCurrencyScale) && Intrinsics.EZpvd(this.supportedOrderTypes, channelResponseBean.supportedOrderTypes) && this.depositToWithdraw == channelResponseBean.depositToWithdraw && this.allowManualAddition == channelResponseBean.allowManualAddition && Intrinsics.EZpvd(this.localization, channelResponseBean.localization) && Intrinsics.EZpvd(this.localizationHighlightStyle, channelResponseBean.localizationHighlightStyle) && Intrinsics.EZpvd(this.limitInfo, channelResponseBean.limitInfo) && Intrinsics.EZpvd(this.informationBox, channelResponseBean.informationBox) && Intrinsics.EZpvd(this.bankingHours, channelResponseBean.bankingHours) && Intrinsics.EZpvd(this.uiFlowControl, channelResponseBean.uiFlowControl) && Intrinsics.EZpvd((Object) this.target, (Object) channelResponseBean.target) && Intrinsics.EZpvd((Object) this.withdrawHoldCryptoAmount, (Object) channelResponseBean.withdrawHoldCryptoAmount) && Intrinsics.EZpvd((Object) this.withdrawHoldDays, (Object) channelResponseBean.withdrawHoldDays) && Intrinsics.EZpvd(this.tradeLimit, channelResponseBean.tradeLimit) && Intrinsics.EZpvd(this.kycType, channelResponseBean.kycType) && this.isUsingInstitutionVerification == channelResponseBean.isUsingInstitutionVerification && Intrinsics.EZpvd((Object) this.supportCurrency, (Object) channelResponseBean.supportCurrency) && Intrinsics.EZpvd(this.supportCurrencyInfo, channelResponseBean.supportCurrencyInfo) && Intrinsics.EZpvd(this.earnOption, channelResponseBean.earnOption) && Intrinsics.EZpvd(this.supportedCountries, channelResponseBean.supportedCountries) && Intrinsics.EZpvd((Object) this.acquirerBankCountryCode, (Object) channelResponseBean.acquirerBankCountryCode);
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
    public final BankingHoursResponseBean getBankingHours() {
        return this.bankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestChannel() {
        return this.bestChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategoryCode() {
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
    public final EarnOptionResponseBean getEarnOption() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExclusive() {
        return this.exclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CExtCollectInfoResponseBean getExtCollectInfo() {
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
    public final InformationBoxResponseBean getInformationBox() {
        return this.informationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKycType() {
        return this.kycType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfoResponseBean getLimitInfo() {
        return this.limitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationResponseBean getLocalization() {
        return this.localization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyleResponseBean getLocalizationHighlightStyle() {
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
    public final boolean getNeedQuote() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethodResponseBean> getP2pPaymentMethodList() {
        return this.p2pPaymentMethodList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPayOnOk() {
        return this.payOnOk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPaymentMethodCategory() {
        return this.paymentMethodCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethodResponseBean> getPaymentMethods() {
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
    public final List<String> getReceiptAccount() {
        return this.receiptAccount;
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
    public final SupportCurrencyInfoResponseBean getSupportCurrencyInfo() {
        return this.supportCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSupportCurrencyScale() {
        return this.supportCurrencyScale;
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
    public final TermContentChannelResponseBean getTermContent() {
        return this.termContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimitResponseBean getTradeLimit() {
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
    public final UiFlowControlResponseBean getUiFlowControl() {
        return this.uiFlowControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnavailableAmount() {
        return this.unavailableAmount;
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
        int iHashCode3 = this.unavailableAmount.hashCode();
        int iHashCode4 = this.baseAmount.hashCode();
        int iHashCode5 = Boolean.hashCode(this.bestChannel);
        int iHashCode6 = this.backgroundColor.hashCode();
        int iHashCode7 = Integer.hashCode(this.categoryCode);
        int iHashCode8 = Boolean.hashCode(this.changeDisplay);
        int iHashCode9 = this.customerUrl.hashCode();
        int iHashCode10 = this.depositName.hashCode();
        int iHashCode11 = this.depositPlatformCode.hashCode();
        int iHashCode12 = Integer.hashCode(this.depositPlatformId);
        int iHashCode13 = this.description.hashCode();
        int iHashCode14 = this.displayIconUrl.hashCode();
        int iHashCode15 = this.displayIconUrlNight.hashCode();
        int iHashCode16 = this.displayName.hashCode();
        int iHashCode17 = this.displayText.hashCode();
        int iHashCode18 = Boolean.hashCode(this.exclusive);
        B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean = this.extCollectInfo;
        int iHashCode19 = b2CExtCollectInfoResponseBean == null ? 0 : b2CExtCollectInfoResponseBean.hashCode();
        int iHashCode20 = this.feeRate.hashCode();
        int iHashCode21 = Boolean.hashCode(this.isConvert);
        int iHashCode22 = Boolean.hashCode(this.isRealTimePrice);
        int iHashCode23 = this.maxLimitAmount.hashCode();
        int iHashCode24 = this.maxPurchaseTime.hashCode();
        int iHashCode25 = this.maxWaitTimeForOrderStatusFetch.hashCode();
        int iHashCode26 = this.minFee.hashCode();
        int iHashCode27 = this.minLimitAmount.hashCode();
        int iHashCode28 = this.minPurchaseTime.hashCode();
        int iHashCode29 = Boolean.hashCode(this.needQuote);
        List<PaymentMethodResponseBean> list = this.p2pPaymentMethodList;
        int iHashCode30 = list == null ? 0 : list.hashCode();
        int iHashCode31 = Boolean.hashCode(this.payOnOk);
        int iHashCode32 = Integer.hashCode(this.paymentMethodCategory);
        List<PaymentMethodResponseBean> list2 = this.paymentMethods;
        int iHashCode33 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.preCheck;
        int iHashCode34 = list3 == null ? 0 : list3.hashCode();
        int iHashCode35 = this.price.hashCode();
        int iHashCode36 = this.quoteAmount.hashCode();
        List<String> list4 = this.receiptAccount;
        int iHashCode37 = list4 == null ? 0 : list4.hashCode();
        int iHashCode38 = this.searchUrl.hashCode();
        List<String> list5 = this.tags;
        int iHashCode39 = list5 == null ? 0 : list5.hashCode();
        TermContentChannelResponseBean termContentChannelResponseBean = this.termContent;
        int iHashCode40 = termContentChannelResponseBean == null ? 0 : termContentChannelResponseBean.hashCode();
        Integer num = this.timeUnit;
        int iHashCode41 = num == null ? 0 : num.hashCode();
        int iHashCode42 = this.tutorialUrl.hashCode();
        int iHashCode43 = Boolean.hashCode(this.useRealTimePrice);
        int iHashCode44 = this.checkoutAccountUrl.hashCode();
        int iHashCode45 = this.iconUrl.hashCode();
        int iHashCode46 = this.iconUrlNight.hashCode();
        int iHashCode47 = this.h5Path.hashCode();
        int iHashCode48 = this.faqUrl.hashCode();
        List<String> list6 = this.supportedTransactionType;
        int iHashCode49 = list6 == null ? 0 : list6.hashCode();
        Integer num2 = this.supportCurrencyScale;
        int iHashCode50 = num2 == null ? 0 : num2.hashCode();
        List<String> list7 = this.supportedOrderTypes;
        int iHashCode51 = list7 == null ? 0 : list7.hashCode();
        int iHashCode52 = Boolean.hashCode(this.depositToWithdraw);
        int iHashCode53 = Boolean.hashCode(this.allowManualAddition);
        LocalizationResponseBean localizationResponseBean = this.localization;
        int iHashCode54 = localizationResponseBean == null ? 0 : localizationResponseBean.hashCode();
        LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean = this.localizationHighlightStyle;
        int iHashCode55 = localizationHighlightStyleResponseBean == null ? 0 : localizationHighlightStyleResponseBean.hashCode();
        LimitInfoResponseBean limitInfoResponseBean = this.limitInfo;
        int iHashCode56 = limitInfoResponseBean == null ? 0 : limitInfoResponseBean.hashCode();
        InformationBoxResponseBean informationBoxResponseBean = this.informationBox;
        int iHashCode57 = informationBoxResponseBean == null ? 0 : informationBoxResponseBean.hashCode();
        BankingHoursResponseBean bankingHoursResponseBean = this.bankingHours;
        int iHashCode58 = bankingHoursResponseBean == null ? 0 : bankingHoursResponseBean.hashCode();
        UiFlowControlResponseBean uiFlowControlResponseBean = this.uiFlowControl;
        int iHashCode59 = uiFlowControlResponseBean == null ? 0 : uiFlowControlResponseBean.hashCode();
        int iHashCode60 = this.target.hashCode();
        int iHashCode61 = this.withdrawHoldCryptoAmount.hashCode();
        int iHashCode62 = this.withdrawHoldDays.hashCode();
        TradeLimitResponseBean tradeLimitResponseBean = this.tradeLimit;
        int iHashCode63 = tradeLimitResponseBean == null ? 0 : tradeLimitResponseBean.hashCode();
        Integer num3 = this.kycType;
        int iHashCode64 = num3 == null ? 0 : num3.hashCode();
        int iHashCode65 = Boolean.hashCode(this.isUsingInstitutionVerification);
        int iHashCode66 = this.supportCurrency.hashCode();
        SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean = this.supportCurrencyInfo;
        int iHashCode67 = supportCurrencyInfoResponseBean == null ? 0 : supportCurrencyInfoResponseBean.hashCode();
        EarnOptionResponseBean earnOptionResponseBean = this.earnOption;
        int iHashCode68 = earnOptionResponseBean == null ? 0 : earnOptionResponseBean.hashCode();
        List<String> list8 = this.supportedCountries;
        int iHashCode69 = list8 == null ? 0 : list8.hashCode();
        String str = this.acquirerBankCountryCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + (str == null ? 0 : str.hashCode());
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
    public final void setPaymentMethods(List<PaymentMethodResponseBean> list) {
        this.paymentMethods = list;
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
        return "ChannelResponseBean(tradingAgentInfo=" + this.tradingAgentInfo + ", availableAmount=" + this.availableAmount + ", unavailableAmount=" + this.unavailableAmount + ", baseAmount=" + this.baseAmount + ", bestChannel=" + this.bestChannel + ", backgroundColor=" + this.backgroundColor + ", categoryCode=" + this.categoryCode + ", changeDisplay=" + this.changeDisplay + ", customerUrl=" + this.customerUrl + ", depositName=" + this.depositName + ", depositPlatformCode=" + this.depositPlatformCode + ", depositPlatformId=" + this.depositPlatformId + ", description=" + this.description + ", displayIconUrl=" + this.displayIconUrl + ", displayIconUrlNight=" + this.displayIconUrlNight + ", displayName=" + this.displayName + ", displayText=" + this.displayText + ", exclusive=" + this.exclusive + ", extCollectInfo=" + this.extCollectInfo + ", feeRate=" + this.feeRate + ", isConvert=" + this.isConvert + ", isRealTimePrice=" + this.isRealTimePrice + ", maxLimitAmount=" + this.maxLimitAmount + ", maxPurchaseTime=" + this.maxPurchaseTime + ", maxWaitTimeForOrderStatusFetch=" + this.maxWaitTimeForOrderStatusFetch + ", minFee=" + this.minFee + ", minLimitAmount=" + this.minLimitAmount + ", minPurchaseTime=" + this.minPurchaseTime + ", needQuote=" + this.needQuote + ", p2pPaymentMethodList=" + this.p2pPaymentMethodList + ", payOnOk=" + this.payOnOk + ", paymentMethodCategory=" + this.paymentMethodCategory + ", paymentMethods=" + this.paymentMethods + ", preCheck=" + this.preCheck + ", price=" + this.price + ", quoteAmount=" + this.quoteAmount + ", receiptAccount=" + this.receiptAccount + ", searchUrl=" + this.searchUrl + ", tags=" + this.tags + ", termContent=" + this.termContent + ", timeUnit=" + this.timeUnit + ", tutorialUrl=" + this.tutorialUrl + ", useRealTimePrice=" + this.useRealTimePrice + ", checkoutAccountUrl=" + this.checkoutAccountUrl + ", iconUrl=" + this.iconUrl + ", iconUrlNight=" + this.iconUrlNight + ", h5Path=" + this.h5Path + ", faqUrl=" + this.faqUrl + ", supportedTransactionType=" + this.supportedTransactionType + ", supportCurrencyScale=" + this.supportCurrencyScale + ", supportedOrderTypes=" + this.supportedOrderTypes + ", depositToWithdraw=" + this.depositToWithdraw + ", allowManualAddition=" + this.allowManualAddition + ", localization=" + this.localization + ", localizationHighlightStyle=" + this.localizationHighlightStyle + ", limitInfo=" + this.limitInfo + ", informationBox=" + this.informationBox + ", bankingHours=" + this.bankingHours + ", uiFlowControl=" + this.uiFlowControl + ", target=" + this.target + ", withdrawHoldCryptoAmount=" + this.withdrawHoldCryptoAmount + ", withdrawHoldDays=" + this.withdrawHoldDays + ", tradeLimit=" + this.tradeLimit + ", kycType=" + this.kycType + ", isUsingInstitutionVerification=" + this.isUsingInstitutionVerification + ", supportCurrency=" + this.supportCurrency + ", supportCurrencyInfo=" + this.supportCurrencyInfo + ", earnOption=" + this.earnOption + ", supportedCountries=" + this.supportedCountries + ", acquirerBankCountryCode=" + this.acquirerBankCountryCode + ")";
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
        parcel.writeString(this.unavailableAmount);
        parcel.writeString(this.baseAmount);
        parcel.writeInt(this.bestChannel ? 1 : 0);
        parcel.writeString(this.backgroundColor);
        parcel.writeInt(this.categoryCode);
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
        B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean = this.extCollectInfo;
        if (b2CExtCollectInfoResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b2CExtCollectInfoResponseBean.writeToParcel(parcel, i);
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
        List<PaymentMethodResponseBean> list = this.p2pPaymentMethodList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PaymentMethodResponseBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.payOnOk ? 1 : 0);
        parcel.writeInt(this.paymentMethodCategory);
        List<PaymentMethodResponseBean> list2 = this.paymentMethods;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PaymentMethodResponseBean> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.preCheck);
        parcel.writeString(this.price);
        parcel.writeString(this.quoteAmount);
        parcel.writeStringList(this.receiptAccount);
        parcel.writeString(this.searchUrl);
        parcel.writeStringList(this.tags);
        TermContentChannelResponseBean termContentChannelResponseBean = this.termContent;
        if (termContentChannelResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termContentChannelResponseBean.writeToParcel(parcel, i);
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
        Integer num2 = this.supportCurrencyScale;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeStringList(this.supportedOrderTypes);
        parcel.writeInt(this.depositToWithdraw ? 1 : 0);
        parcel.writeInt(this.allowManualAddition ? 1 : 0);
        LocalizationResponseBean localizationResponseBean = this.localization;
        if (localizationResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizationResponseBean.writeToParcel(parcel, i);
        }
        LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean = this.localizationHighlightStyle;
        if (localizationHighlightStyleResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizationHighlightStyleResponseBean.writeToParcel(parcel, i);
        }
        LimitInfoResponseBean limitInfoResponseBean = this.limitInfo;
        if (limitInfoResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limitInfoResponseBean.writeToParcel(parcel, i);
        }
        InformationBoxResponseBean informationBoxResponseBean = this.informationBox;
        if (informationBoxResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            informationBoxResponseBean.writeToParcel(parcel, i);
        }
        BankingHoursResponseBean bankingHoursResponseBean = this.bankingHours;
        if (bankingHoursResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bankingHoursResponseBean.writeToParcel(parcel, i);
        }
        UiFlowControlResponseBean uiFlowControlResponseBean = this.uiFlowControl;
        if (uiFlowControlResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uiFlowControlResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.target);
        parcel.writeString(this.withdrawHoldCryptoAmount);
        parcel.writeString(this.withdrawHoldDays);
        TradeLimitResponseBean tradeLimitResponseBean = this.tradeLimit;
        if (tradeLimitResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeLimitResponseBean.writeToParcel(parcel, i);
        }
        Integer num3 = this.kycType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.isUsingInstitutionVerification ? 1 : 0);
        parcel.writeString(this.supportCurrency);
        SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean = this.supportCurrencyInfo;
        if (supportCurrencyInfoResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            supportCurrencyInfoResponseBean.writeToParcel(parcel, i);
        }
        EarnOptionResponseBean earnOptionResponseBean = this.earnOption;
        if (earnOptionResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOptionResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.supportedCountries);
        parcel.writeString(this.acquirerBankCountryCode);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.ChannelResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelResponseBean> serializer() {
            return ChannelResponseBean$$serializer.INSTANCE;
        }
    }

    static {
        PaymentMethodResponseBean$$serializer paymentMethodResponseBean$$serializer = PaymentMethodResponseBean$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(paymentMethodResponseBean$$serializer), null, null, new ArrayListSerializer(paymentMethodResponseBean$$serializer), new ArrayListSerializer(stringSerializer), null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null};
    }

    public /* synthetic */ ChannelResponseBean(int i, int i2, int i3, TradingAgentInfo tradingAgentInfo, String str, String str2, String str3, boolean z, String str4, int i4, boolean z2, String str5, String str6, String str7, int i5, String str8, String str9, String str10, String str11, String str12, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, String str13, boolean z4, boolean z5, String str14, String str15, String str16, String str17, String str18, String str19, boolean z6, List list, boolean z7, int i6, List list2, List list3, String str20, String str21, List list4, String str22, List list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, String str23, boolean z8, String str24, String str25, String str26, String str27, String str28, List list6, Integer num2, List list7, boolean z9, boolean z10, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, String str29, String str30, String str31, TradeLimitResponseBean tradeLimitResponseBean, Integer num3, boolean z11, String str32, SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, EarnOptionResponseBean earnOptionResponseBean, List list8, String str33, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.unavailableAmount = "";
        } else {
            this.unavailableAmount = str2;
        }
        if ((i & 8) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str3;
        }
        if ((i & 16) == 0) {
            this.bestChannel = false;
        } else {
            this.bestChannel = z;
        }
        if ((i & 32) == 0) {
            this.backgroundColor = "";
        } else {
            this.backgroundColor = str4;
        }
        this.categoryCode = (i & 64) == 0 ? 3 : i4;
        if ((i & 128) == 0) {
            this.changeDisplay = false;
        } else {
            this.changeDisplay = z2;
        }
        if ((i & 256) == 0) {
            this.customerUrl = "";
        } else {
            this.customerUrl = str5;
        }
        if ((i & 512) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str6;
        }
        if ((i & 1024) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str7;
        }
        this.depositPlatformId = (i & 2048) == 0 ? -1 : i5;
        if ((i & 4096) == 0) {
            this.description = "";
        } else {
            this.description = str8;
        }
        if ((i & 8192) == 0) {
            this.displayIconUrl = "";
        } else {
            this.displayIconUrl = str9;
        }
        if ((i & 16384) == 0) {
            this.displayIconUrlNight = "";
        } else {
            this.displayIconUrlNight = str10;
        }
        if ((i & 32768) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str11;
        }
        if ((i & 65536) == 0) {
            this.displayText = "";
        } else {
            this.displayText = str12;
        }
        if ((i & 131072) == 0) {
            this.exclusive = false;
        } else {
            this.exclusive = z3;
        }
        if ((262144 & i) == 0) {
            this.extCollectInfo = null;
        } else {
            this.extCollectInfo = b2CExtCollectInfoResponseBean;
        }
        if ((524288 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str13;
        }
        if ((1048576 & i) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z4;
        }
        if ((2097152 & i) == 0) {
            this.isRealTimePrice = false;
        } else {
            this.isRealTimePrice = z5;
        }
        if ((4194304 & i) == 0) {
            this.maxLimitAmount = "0";
        } else {
            this.maxLimitAmount = str14;
        }
        if ((8388608 & i) == 0) {
            this.maxPurchaseTime = "0";
        } else {
            this.maxPurchaseTime = str15;
        }
        this.maxWaitTimeForOrderStatusFetch = (16777216 & i) == 0 ? "15" : str16;
        if ((33554432 & i) == 0) {
            this.minFee = "";
        } else {
            this.minFee = str17;
        }
        if ((67108864 & i) == 0) {
            this.minLimitAmount = "0";
        } else {
            this.minLimitAmount = str18;
        }
        if ((134217728 & i) == 0) {
            this.minPurchaseTime = "0";
        } else {
            this.minPurchaseTime = str19;
        }
        if ((268435456 & i) == 0) {
            this.needQuote = false;
        } else {
            this.needQuote = z6;
        }
        if ((536870912 & i) == 0) {
            this.p2pPaymentMethodList = null;
        } else {
            this.p2pPaymentMethodList = list;
        }
        if ((1073741824 & i) == 0) {
            this.payOnOk = false;
        } else {
            this.payOnOk = z7;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.paymentMethodCategory = 0;
        } else {
            this.paymentMethodCategory = i6;
        }
        if ((i2 & 1) == 0) {
            this.paymentMethods = null;
        } else {
            this.paymentMethods = list2;
        }
        if ((i2 & 2) == 0) {
            this.preCheck = null;
        } else {
            this.preCheck = list3;
        }
        if ((i2 & 4) == 0) {
            this.price = "0";
        } else {
            this.price = str20;
        }
        if ((i2 & 8) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str21;
        }
        if ((i2 & 16) == 0) {
            this.receiptAccount = null;
        } else {
            this.receiptAccount = list4;
        }
        if ((i2 & 32) == 0) {
            this.searchUrl = "";
        } else {
            this.searchUrl = str22;
        }
        if ((i2 & 64) == 0) {
            this.tags = null;
        } else {
            this.tags = list5;
        }
        if ((i2 & 128) == 0) {
            this.termContent = null;
        } else {
            this.termContent = termContentChannelResponseBean;
        }
        if ((i2 & 256) == 0) {
            this.timeUnit = null;
        } else {
            this.timeUnit = num;
        }
        if ((i2 & 512) == 0) {
            this.tutorialUrl = "";
        } else {
            this.tutorialUrl = str23;
        }
        if ((i2 & 1024) == 0) {
            this.useRealTimePrice = false;
        } else {
            this.useRealTimePrice = z8;
        }
        if ((i2 & 2048) == 0) {
            this.checkoutAccountUrl = "";
        } else {
            this.checkoutAccountUrl = str24;
        }
        if ((i2 & 4096) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str25;
        }
        if ((i2 & 8192) == 0) {
            this.iconUrlNight = "";
        } else {
            this.iconUrlNight = str26;
        }
        if ((i2 & 16384) == 0) {
            this.h5Path = "";
        } else {
            this.h5Path = str27;
        }
        if ((i2 & 32768) == 0) {
            this.faqUrl = "";
        } else {
            this.faqUrl = str28;
        }
        if ((i2 & 65536) == 0) {
            this.supportedTransactionType = null;
        } else {
            this.supportedTransactionType = list6;
        }
        if ((i2 & 131072) == 0) {
            this.supportCurrencyScale = null;
        } else {
            this.supportCurrencyScale = num2;
        }
        if ((262144 & i2) == 0) {
            this.supportedOrderTypes = null;
        } else {
            this.supportedOrderTypes = list7;
        }
        if ((524288 & i2) == 0) {
            this.depositToWithdraw = false;
        } else {
            this.depositToWithdraw = z9;
        }
        if ((1048576 & i2) == 0) {
            this.allowManualAddition = false;
        } else {
            this.allowManualAddition = z10;
        }
        if ((2097152 & i2) == 0) {
            this.localization = null;
        } else {
            this.localization = localizationResponseBean;
        }
        if ((4194304 & i2) == 0) {
            this.localizationHighlightStyle = null;
        } else {
            this.localizationHighlightStyle = localizationHighlightStyleResponseBean;
        }
        if ((8388608 & i2) == 0) {
            this.limitInfo = null;
        } else {
            this.limitInfo = limitInfoResponseBean;
        }
        if ((16777216 & i2) == 0) {
            this.informationBox = null;
        } else {
            this.informationBox = informationBoxResponseBean;
        }
        if ((33554432 & i2) == 0) {
            this.bankingHours = null;
        } else {
            this.bankingHours = bankingHoursResponseBean;
        }
        if ((67108864 & i2) == 0) {
            this.uiFlowControl = null;
        } else {
            this.uiFlowControl = uiFlowControlResponseBean;
        }
        if ((134217728 & i2) == 0) {
            this.target = "";
        } else {
            this.target = str29;
        }
        if ((268435456 & i2) == 0) {
            this.withdrawHoldCryptoAmount = "";
        } else {
            this.withdrawHoldCryptoAmount = str30;
        }
        if ((536870912 & i2) == 0) {
            this.withdrawHoldDays = "";
        } else {
            this.withdrawHoldDays = str31;
        }
        this.tradeLimit = (1073741824 & i2) == 0 ? new TradeLimitResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimitResponseBean;
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.kycType = null;
        } else {
            this.kycType = num3;
        }
        if ((i3 & 1) == 0) {
            this.isUsingInstitutionVerification = false;
        } else {
            this.isUsingInstitutionVerification = z11;
        }
        if ((i3 & 2) == 0) {
            this.supportCurrency = "";
        } else {
            this.supportCurrency = str32;
        }
        if ((i3 & 4) == 0) {
            this.supportCurrencyInfo = null;
        } else {
            this.supportCurrencyInfo = supportCurrencyInfoResponseBean;
        }
        if ((i3 & 8) == 0) {
            this.earnOption = null;
        } else {
            this.earnOption = earnOptionResponseBean;
        }
        if ((i3 & 16) == 0) {
            this.supportedCountries = null;
        } else {
            this.supportedCountries = list8;
        }
        if ((i3 & 32) == 0) {
            this.acquirerBankCountryCode = null;
        } else {
            this.acquirerBankCountryCode = str33;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ChannelResponseBean channelResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || channelResponseBean.tradingAgentInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TradingAgentInfo$$serializer.INSTANCE, channelResponseBean.tradingAgentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) channelResponseBean.availableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, channelResponseBean.availableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) channelResponseBean.unavailableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, channelResponseBean.unavailableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) channelResponseBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, channelResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || channelResponseBean.bestChannel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, channelResponseBean.bestChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) channelResponseBean.backgroundColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, channelResponseBean.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || channelResponseBean.categoryCode != 3) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, channelResponseBean.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || channelResponseBean.changeDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, channelResponseBean.changeDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) channelResponseBean.customerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, channelResponseBean.customerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) channelResponseBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, channelResponseBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) channelResponseBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, channelResponseBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || channelResponseBean.depositPlatformId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, channelResponseBean.depositPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) channelResponseBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, channelResponseBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) channelResponseBean.displayIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, channelResponseBean.displayIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) channelResponseBean.displayIconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, channelResponseBean.displayIconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) channelResponseBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, channelResponseBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) channelResponseBean.displayText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, channelResponseBean.displayText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || channelResponseBean.exclusive) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, channelResponseBean.exclusive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || channelResponseBean.extCollectInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, B2CExtCollectInfoResponseBean$$serializer.INSTANCE, channelResponseBean.extCollectInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) channelResponseBean.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, channelResponseBean.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || channelResponseBean.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, channelResponseBean.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || channelResponseBean.isRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, channelResponseBean.isRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) channelResponseBean.maxLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, channelResponseBean.maxLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) channelResponseBean.maxPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, channelResponseBean.maxPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) channelResponseBean.maxWaitTimeForOrderStatusFetch, (Object) "15")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, channelResponseBean.maxWaitTimeForOrderStatusFetch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) channelResponseBean.minFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, channelResponseBean.minFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) channelResponseBean.minLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, channelResponseBean.minLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) channelResponseBean.minPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, channelResponseBean.minPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || channelResponseBean.needQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, channelResponseBean.needQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || channelResponseBean.p2pPaymentMethodList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, kSerializerArr[29], channelResponseBean.p2pPaymentMethodList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || channelResponseBean.payOnOk) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 30, channelResponseBean.payOnOk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || channelResponseBean.paymentMethodCategory != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 31, channelResponseBean.paymentMethodCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || channelResponseBean.paymentMethods != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, kSerializerArr[32], channelResponseBean.paymentMethods);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || channelResponseBean.preCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, kSerializerArr[33], channelResponseBean.preCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) channelResponseBean.price, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, channelResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) channelResponseBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, channelResponseBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || channelResponseBean.receiptAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, kSerializerArr[36], channelResponseBean.receiptAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) channelResponseBean.searchUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, channelResponseBean.searchUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || channelResponseBean.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, kSerializerArr[38], channelResponseBean.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || channelResponseBean.termContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, TermContentChannelResponseBean$$serializer.INSTANCE, channelResponseBean.termContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || channelResponseBean.timeUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, IntSerializer.INSTANCE, channelResponseBean.timeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) channelResponseBean.tutorialUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, channelResponseBean.tutorialUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || channelResponseBean.useRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, channelResponseBean.useRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) channelResponseBean.checkoutAccountUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, channelResponseBean.checkoutAccountUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) channelResponseBean.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, channelResponseBean.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) channelResponseBean.iconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, channelResponseBean.iconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) channelResponseBean.h5Path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, channelResponseBean.h5Path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) channelResponseBean.faqUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, channelResponseBean.faqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || channelResponseBean.supportedTransactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, kSerializerArr[48], channelResponseBean.supportedTransactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || channelResponseBean.supportCurrencyScale != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, IntSerializer.INSTANCE, channelResponseBean.supportCurrencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || channelResponseBean.supportedOrderTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, kSerializerArr[50], channelResponseBean.supportedOrderTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || channelResponseBean.depositToWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 51, channelResponseBean.depositToWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || channelResponseBean.allowManualAddition) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 52, channelResponseBean.allowManualAddition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || channelResponseBean.localization != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, LocalizationResponseBean$$serializer.INSTANCE, channelResponseBean.localization);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || channelResponseBean.localizationHighlightStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, LocalizationHighlightStyleResponseBean$$serializer.INSTANCE, channelResponseBean.localizationHighlightStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || channelResponseBean.limitInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, LimitInfoResponseBean$$serializer.INSTANCE, channelResponseBean.limitInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || channelResponseBean.informationBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, InformationBoxResponseBean$$serializer.INSTANCE, channelResponseBean.informationBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || channelResponseBean.bankingHours != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, BankingHoursResponseBean$$serializer.INSTANCE, channelResponseBean.bankingHours);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || channelResponseBean.uiFlowControl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, UiFlowControlResponseBean$$serializer.INSTANCE, channelResponseBean.uiFlowControl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) channelResponseBean.target, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, channelResponseBean.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) channelResponseBean.withdrawHoldCryptoAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, channelResponseBean.withdrawHoldCryptoAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) channelResponseBean.withdrawHoldDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, channelResponseBean.withdrawHoldDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd(channelResponseBean.tradeLimit, new TradeLimitResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, TradeLimitResponseBean$$serializer.INSTANCE, channelResponseBean.tradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || channelResponseBean.kycType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, IntSerializer.INSTANCE, channelResponseBean.kycType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || channelResponseBean.isUsingInstitutionVerification) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 64, channelResponseBean.isUsingInstitutionVerification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) channelResponseBean.supportCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, channelResponseBean.supportCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || channelResponseBean.supportCurrencyInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, SupportCurrencyInfoResponseBean$$serializer.INSTANCE, channelResponseBean.supportCurrencyInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || channelResponseBean.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, EarnOptionResponseBean$$serializer.INSTANCE, channelResponseBean.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || channelResponseBean.supportedCountries != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 68, kSerializerArr[68], channelResponseBean.supportedCountries);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) && channelResponseBean.acquirerBankCountryCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, StringSerializer.INSTANCE, channelResponseBean.acquirerBankCountryCode);
    }

    public ChannelResponseBean(TradingAgentInfo tradingAgentInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i, boolean z2, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, @NotNull String str13, boolean z4, boolean z5, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z6, List<PaymentMethodResponseBean> list, boolean z7, int i3, List<PaymentMethodResponseBean> list2, List<String> list3, @NotNull String str20, @NotNull String str21, List<String> list4, @NotNull String str22, List<String> list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, @NotNull String str23, boolean z8, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, List<String> list6, Integer num2, List<String> list7, boolean z9, boolean z10, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, @NotNull String str29, @NotNull String str30, @NotNull String str31, TradeLimitResponseBean tradeLimitResponseBean, Integer num3, boolean z11, @NotNull String str32, SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, EarnOptionResponseBean earnOptionResponseBean, List<String> list8, String str33) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
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
        this.tradingAgentInfo = tradingAgentInfo;
        this.availableAmount = str;
        this.unavailableAmount = str2;
        this.baseAmount = str3;
        this.bestChannel = z;
        this.backgroundColor = str4;
        this.categoryCode = i;
        this.changeDisplay = z2;
        this.customerUrl = str5;
        this.depositName = str6;
        this.depositPlatformCode = str7;
        this.depositPlatformId = i2;
        this.description = str8;
        this.displayIconUrl = str9;
        this.displayIconUrlNight = str10;
        this.displayName = str11;
        this.displayText = str12;
        this.exclusive = z3;
        this.extCollectInfo = b2CExtCollectInfoResponseBean;
        this.feeRate = str13;
        this.isConvert = z4;
        this.isRealTimePrice = z5;
        this.maxLimitAmount = str14;
        this.maxPurchaseTime = str15;
        this.maxWaitTimeForOrderStatusFetch = str16;
        this.minFee = str17;
        this.minLimitAmount = str18;
        this.minPurchaseTime = str19;
        this.needQuote = z6;
        this.p2pPaymentMethodList = list;
        this.payOnOk = z7;
        this.paymentMethodCategory = i3;
        this.paymentMethods = list2;
        this.preCheck = list3;
        this.price = str20;
        this.quoteAmount = str21;
        this.receiptAccount = list4;
        this.searchUrl = str22;
        this.tags = list5;
        this.termContent = termContentChannelResponseBean;
        this.timeUnit = num;
        this.tutorialUrl = str23;
        this.useRealTimePrice = z8;
        this.checkoutAccountUrl = str24;
        this.iconUrl = str25;
        this.iconUrlNight = str26;
        this.h5Path = str27;
        this.faqUrl = str28;
        this.supportedTransactionType = list6;
        this.supportCurrencyScale = num2;
        this.supportedOrderTypes = list7;
        this.depositToWithdraw = z9;
        this.allowManualAddition = z10;
        this.localization = localizationResponseBean;
        this.localizationHighlightStyle = localizationHighlightStyleResponseBean;
        this.limitInfo = limitInfoResponseBean;
        this.informationBox = informationBoxResponseBean;
        this.bankingHours = bankingHoursResponseBean;
        this.uiFlowControl = uiFlowControlResponseBean;
        this.target = str29;
        this.withdrawHoldCryptoAmount = str30;
        this.withdrawHoldDays = str31;
        this.tradeLimit = tradeLimitResponseBean;
        this.kycType = num3;
        this.isUsingInstitutionVerification = z11;
        this.supportCurrency = str32;
        this.supportCurrencyInfo = supportCurrencyInfoResponseBean;
        this.earnOption = earnOptionResponseBean;
        this.supportedCountries = list8;
        this.acquirerBankCountryCode = str33;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelResponseBean(TradingAgentInfo tradingAgentInfo, String str, String str2, String str3, boolean z, String str4, int i, boolean z2, String str5, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, String str13, boolean z4, boolean z5, String str14, String str15, String str16, String str17, String str18, String str19, boolean z6, List list, boolean z7, int i3, List list2, List list3, String str20, String str21, List list4, String str22, List list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, String str23, boolean z8, String str24, String str25, String str26, String str27, String str28, List list6, Integer num2, List list7, boolean z9, boolean z10, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, String str29, String str30, String str31, TradeLimitResponseBean tradeLimitResponseBean, Integer num3, boolean z11, String str32, SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, EarnOptionResponseBean earnOptionResponseBean, List list8, String str33, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str34;
        str34 = "";
        this((i4 & 1) != 0 ? null : tradingAgentInfo, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? 3 : i, (i4 & 128) != 0 ? false : z2, (i4 & 256) != 0 ? "" : str5, (i4 & 512) != 0 ? "" : str6, (i4 & 1024) != 0 ? "" : str7, (i4 & 2048) != 0 ? -1 : i2, (i4 & 4096) != 0 ? "" : str8, (i4 & 8192) != 0 ? str34 : str9, (i4 & 16384) != 0 ? str34 : str10, (i4 & 32768) != 0 ? str34 : str11, (i4 & 65536) != 0 ? str34 : str12, (i4 & 131072) != 0 ? false : z3, (i4 & 262144) != 0 ? null : b2CExtCollectInfoResponseBean, (i4 & 524288) != 0 ? str34 : str13, (i4 & 1048576) != 0 ? false : z4, (i4 & 2097152) != 0 ? false : z5, (i4 & 4194304) != 0 ? "0" : str14, (i4 & 8388608) != 0 ? "0" : str15, (i4 & 16777216) != 0 ? "15" : str16, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? str34 : str17, (i4 & 67108864) != 0 ? "0" : str18, (i4 & 134217728) != 0 ? "0" : str19, (i4 & 268435456) != 0 ? false : z6, (i4 & 536870912) != 0 ? null : list, (i4 & 1073741824) != 0 ? false : z7, (i4 & Integer.MIN_VALUE) != 0 ? 0 : i3, (i5 & 1) != 0 ? null : list2, (i5 & 2) != 0 ? null : list3, (i5 & 4) == 0 ? str20 : "0", (i5 & 8) != 0 ? str34 : str21, (i5 & 16) != 0 ? null : list4, (i5 & 32) != 0 ? str34 : str22, (i5 & 64) != 0 ? null : list5, (i5 & 128) != 0 ? null : termContentChannelResponseBean, (i5 & 256) != 0 ? null : num, (i5 & 512) != 0 ? str34 : str23, (i5 & 1024) != 0 ? false : z8, (i5 & 2048) != 0 ? str34 : str24, (i5 & 4096) != 0 ? str34 : str25, (i5 & 8192) != 0 ? str34 : str26, (i5 & 16384) != 0 ? str34 : str27, (i5 & 32768) != 0 ? str34 : str28, (i5 & 65536) != 0 ? null : list6, (i5 & 131072) != 0 ? null : num2, (i5 & 262144) != 0 ? null : list7, (i5 & 524288) != 0 ? false : z9, (i5 & 1048576) != 0 ? false : z10, (i5 & 2097152) != 0 ? null : localizationResponseBean, (i5 & 4194304) != 0 ? null : localizationHighlightStyleResponseBean, (i5 & 8388608) != 0 ? null : limitInfoResponseBean, (i5 & 16777216) != 0 ? null : informationBoxResponseBean, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : bankingHoursResponseBean, (i5 & 67108864) != 0 ? null : uiFlowControlResponseBean, (i5 & 134217728) != 0 ? str34 : str29, (i5 & 268435456) != 0 ? str34 : str30, (i5 & 536870912) != 0 ? str34 : str31, (i5 & 1073741824) != 0 ? new TradeLimitResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimitResponseBean, (i5 & Integer.MIN_VALUE) != 0 ? null : num3, (i6 & 1) != 0 ? false : z11, (i6 & 2) == 0 ? str32 : "", (i6 & 4) != 0 ? null : supportCurrencyInfoResponseBean, (i6 & 8) != 0 ? null : earnOptionResponseBean, (i6 & 16) != 0 ? null : list8, (i6 & 32) != 0 ? null : str33);
    }
}
