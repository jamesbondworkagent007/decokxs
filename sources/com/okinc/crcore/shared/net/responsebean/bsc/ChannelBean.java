package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CExtCollectInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CExtCollectInfoResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.BankingHoursResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.BankingHoursResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.ChannelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.EarnOptionResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.InformationBoxResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.InformationBoxResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LimitInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LimitInfoResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationHighlightStyleResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationHighlightStyleResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrencyInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrencyInfoResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TermContentChannelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TermContentChannelResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradeLimitResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradeLimitResponseBean$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradingAgentInfo;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradingAgentInfo$$serializer;
import com.okinc.crcore.coreapi.net.responsebean.bsc.UiFlowControlResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.UiFlowControlResponseBean$$serializer;
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
public final class ChannelBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String acquirerBankCountryCode;
    private final boolean allowManualAddition;
    private final String availableAmount;
    private final String backgroundColor;
    private final BankingHoursResponseBean bankingHours;
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
    private EarnOptionBean earnOption;
    private final boolean exclusive;
    private final B2CExtCollectInfoResponseBean extCollectInfo;
    private final String faqUrl;
    private final String feeRate;
    private boolean googlePayReadyToUse;
    private boolean googlePaySupportedButNotSetup;
    private final String h5Path;
    private final String iconUrl;
    private final String iconUrlNight;
    private final InformationBoxResponseBean informationBox;
    private final boolean isConvert;
    private final boolean isRealTimePrice;
    private boolean isUsingInstitutionVerification;
    private Integer kycType;
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
    private String quoteAmount;
    private String quoteCurrency;
    private final List<String> receiptAccount;
    private String requestCurrency;
    private final String searchUrl;
    private String supportCurrency;
    private final SupportCurrencyInfoResponseBean supportCurrencyInfo;
    private Integer supportCurrencyScale;
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
    public static final Parcelable.Creator<ChannelBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ChannelBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelBean createFromParcel(Parcel parcel) {
            B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            TradingAgentInfo tradingAgentInfoCreateFromParcel = parcel.readInt() == 0 ? null : TradingAgentInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            ChannelCategoryCode channelCategoryCodeCreateFromParcel = ChannelCategoryCode.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : B2CExtCollectInfoResponseBean.CREATOR.createFromParcel(parcel);
            String string12 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                b2CExtCollectInfoResponseBean = b2CExtCollectInfoResponseBeanCreateFromParcel;
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i2);
                b2CExtCollectInfoResponseBean = b2CExtCollectInfoResponseBeanCreateFromParcel;
                int i3 = 0;
                while (i3 != i2) {
                    arrayList4.add(PaymentMethodResponseBean.CREATOR.createFromParcel(parcel));
                    i3++;
                    i2 = i2;
                }
                arrayList = arrayList4;
            }
            boolean z7 = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                arrayList2 = arrayList;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList5.add(PaymentMethodResponseBean.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList3 = arrayList5;
            }
            return new ChannelBean(tradingAgentInfoCreateFromParcel, string, string2, z, string3, channelCategoryCodeCreateFromParcel, z2, string4, string5, string6, i, string7, string8, string9, string10, string11, z3, b2CExtCollectInfoResponseBean, string12, z4, z5, string13, string14, string15, string16, string17, string18, z6, arrayList2, z7, i4, arrayList3, parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TermContentChannelResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : LocalizationResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalizationHighlightStyleResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LimitInfoResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InformationBoxResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BankingHoursResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiFlowControlResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TradeLimitResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EarnOptionBean.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, SupportCurrencyInfoResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelBean[] newArray(int i) {
            return new ChannelBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelBean() {
        this((TradingAgentInfo) null, (String) null, (String) null, false, (String) null, (ChannelCategoryCode) null, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfoResponseBean) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, 0, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannelResponseBean) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, (LocalizationResponseBean) null, (LocalizationHighlightStyleResponseBean) null, (LimitInfoResponseBean) null, (InformationBoxResponseBean) null, (BankingHoursResponseBean) null, (UiFlowControlResponseBean) null, false, (String) null, (String) null, (TradeLimitResponseBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, (String) null, (Integer) null, (EarnOptionBean) null, (List) null, (String) null, false, false, (SupportCurrencyInfoResponseBean) null, -1, -1, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingAgentInfo component1() {
        return this.tradingAgentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.depositPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.displayIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.displayIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.displayText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.exclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CExtCollectInfoResponseBean component18() {
        return this.extCollectInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.isRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.maxLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.maxPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.maxWaitTimeForOrderStatusFetch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.minLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.minPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethodResponseBean> component29() {
        return this.p2pPaymentMethodList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unavailableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.payOnOk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component31() {
        return this.paymentMethodCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethodResponseBean> component32() {
        return this.paymentMethods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component33() {
        return this.preCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component35() {
        return this.receiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.searchUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component37() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannelResponseBean component38() {
        return this.termContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.bestChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.tutorialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component41() {
        return this.useRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.checkoutAccountUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.h5Path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component47() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component48() {
        return this.supportedOrderTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component49() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationResponseBean component50() {
        return this.localization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyleResponseBean component51() {
        return this.localizationHighlightStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfoResponseBean component52() {
        return this.limitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InformationBoxResponseBean component53() {
        return this.informationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BankingHoursResponseBean component54() {
        return this.bankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControlResponseBean component55() {
        return this.uiFlowControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component56() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.withdrawHoldCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.withdrawHoldDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimitResponseBean component59() {
        return this.tradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode component6() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.requestCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component67() {
        return this.kycType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component68() {
        return this.isUsingInstitutionVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.supportCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.changeDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component70() {
        return this.supportCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionBean component71() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component72() {
        return this.supportedCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.acquirerBankCountryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component74() {
        return this.googlePayReadyToUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component75() {
        return this.googlePaySupportedButNotSetup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyInfoResponseBean component76() {
        return this.supportCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.customerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelBean copy(TradingAgentInfo tradingAgentInfo, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull ChannelCategoryCode channelCategoryCode, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, @NotNull String str12, boolean z4, boolean z5, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z6, List<PaymentMethodResponseBean> list, boolean z7, int i2, List<PaymentMethodResponseBean> list2, List<String> list3, @NotNull String str19, List<String> list4, @NotNull String str20, List<String> list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, @NotNull String str21, boolean z8, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, List<String> list6, List<String> list7, boolean z9, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, boolean z10, @NotNull String str27, @NotNull String str28, TradeLimitResponseBean tradeLimitResponseBean, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, Integer num2, boolean z11, @NotNull String str36, Integer num3, EarnOptionBean earnOptionBean, List<String> list8, String str37, boolean z12, boolean z13, @NotNull SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
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
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(supportCurrencyInfoResponseBean, "");
        return new ChannelBean(tradingAgentInfo, str, str2, z, str3, channelCategoryCode, z2, str4, str5, str6, i, str7, str8, str9, str10, str11, z3, b2CExtCollectInfoResponseBean, str12, z4, z5, str13, str14, str15, str16, str17, str18, z6, list, z7, i2, list2, list3, str19, list4, str20, list5, termContentChannelResponseBean, num, str21, z8, str22, str23, str24, str25, str26, list6, list7, z9, localizationResponseBean, localizationHighlightStyleResponseBean, limitInfoResponseBean, informationBoxResponseBean, bankingHoursResponseBean, uiFlowControlResponseBean, z10, str27, str28, tradeLimitResponseBean, str29, str30, str31, str32, str33, str34, str35, num2, z11, str36, num3, earnOptionBean, list8, str37, z12, z13, supportCurrencyInfoResponseBean);
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
        if (!(obj instanceof ChannelBean)) {
            return false;
        }
        ChannelBean channelBean = (ChannelBean) obj;
        return Intrinsics.EZpvd(this.tradingAgentInfo, channelBean.tradingAgentInfo) && Intrinsics.EZpvd((Object) this.availableAmount, (Object) channelBean.availableAmount) && Intrinsics.EZpvd((Object) this.unavailableAmount, (Object) channelBean.unavailableAmount) && this.bestChannel == channelBean.bestChannel && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) channelBean.backgroundColor) && this.categoryCode == channelBean.categoryCode && this.changeDisplay == channelBean.changeDisplay && Intrinsics.EZpvd((Object) this.customerUrl, (Object) channelBean.customerUrl) && Intrinsics.EZpvd((Object) this.depositName, (Object) channelBean.depositName) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) channelBean.depositPlatformCode) && this.depositPlatformId == channelBean.depositPlatformId && Intrinsics.EZpvd((Object) this.description, (Object) channelBean.description) && Intrinsics.EZpvd((Object) this.displayIconUrl, (Object) channelBean.displayIconUrl) && Intrinsics.EZpvd((Object) this.displayIconUrlNight, (Object) channelBean.displayIconUrlNight) && Intrinsics.EZpvd((Object) this.displayName, (Object) channelBean.displayName) && Intrinsics.EZpvd((Object) this.displayText, (Object) channelBean.displayText) && this.exclusive == channelBean.exclusive && Intrinsics.EZpvd(this.extCollectInfo, channelBean.extCollectInfo) && Intrinsics.EZpvd((Object) this.feeRate, (Object) channelBean.feeRate) && this.isConvert == channelBean.isConvert && this.isRealTimePrice == channelBean.isRealTimePrice && Intrinsics.EZpvd((Object) this.maxLimitAmount, (Object) channelBean.maxLimitAmount) && Intrinsics.EZpvd((Object) this.maxPurchaseTime, (Object) channelBean.maxPurchaseTime) && Intrinsics.EZpvd((Object) this.maxWaitTimeForOrderStatusFetch, (Object) channelBean.maxWaitTimeForOrderStatusFetch) && Intrinsics.EZpvd((Object) this.minFee, (Object) channelBean.minFee) && Intrinsics.EZpvd((Object) this.minLimitAmount, (Object) channelBean.minLimitAmount) && Intrinsics.EZpvd((Object) this.minPurchaseTime, (Object) channelBean.minPurchaseTime) && this.needQuote == channelBean.needQuote && Intrinsics.EZpvd(this.p2pPaymentMethodList, channelBean.p2pPaymentMethodList) && this.payOnOk == channelBean.payOnOk && this.paymentMethodCategory == channelBean.paymentMethodCategory && Intrinsics.EZpvd(this.paymentMethods, channelBean.paymentMethods) && Intrinsics.EZpvd(this.preCheck, channelBean.preCheck) && Intrinsics.EZpvd((Object) this.price, (Object) channelBean.price) && Intrinsics.EZpvd(this.receiptAccount, channelBean.receiptAccount) && Intrinsics.EZpvd((Object) this.searchUrl, (Object) channelBean.searchUrl) && Intrinsics.EZpvd(this.tags, channelBean.tags) && Intrinsics.EZpvd(this.termContent, channelBean.termContent) && Intrinsics.EZpvd(this.timeUnit, channelBean.timeUnit) && Intrinsics.EZpvd((Object) this.tutorialUrl, (Object) channelBean.tutorialUrl) && this.useRealTimePrice == channelBean.useRealTimePrice && Intrinsics.EZpvd((Object) this.checkoutAccountUrl, (Object) channelBean.checkoutAccountUrl) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) channelBean.iconUrl) && Intrinsics.EZpvd((Object) this.iconUrlNight, (Object) channelBean.iconUrlNight) && Intrinsics.EZpvd((Object) this.h5Path, (Object) channelBean.h5Path) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) channelBean.faqUrl) && Intrinsics.EZpvd(this.supportedTransactionType, channelBean.supportedTransactionType) && Intrinsics.EZpvd(this.supportedOrderTypes, channelBean.supportedOrderTypes) && this.depositToWithdraw == channelBean.depositToWithdraw && Intrinsics.EZpvd(this.localization, channelBean.localization) && Intrinsics.EZpvd(this.localizationHighlightStyle, channelBean.localizationHighlightStyle) && Intrinsics.EZpvd(this.limitInfo, channelBean.limitInfo) && Intrinsics.EZpvd(this.informationBox, channelBean.informationBox) && Intrinsics.EZpvd(this.bankingHours, channelBean.bankingHours) && Intrinsics.EZpvd(this.uiFlowControl, channelBean.uiFlowControl) && this.allowManualAddition == channelBean.allowManualAddition && Intrinsics.EZpvd((Object) this.withdrawHoldCryptoAmount, (Object) channelBean.withdrawHoldCryptoAmount) && Intrinsics.EZpvd((Object) this.withdrawHoldDays, (Object) channelBean.withdrawHoldDays) && Intrinsics.EZpvd(this.tradeLimit, channelBean.tradeLimit) && Intrinsics.EZpvd((Object) this.target, (Object) channelBean.target) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) channelBean.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) channelBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) channelBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) channelBean.baseCurrency) && Intrinsics.EZpvd((Object) this.requestCurrency, (Object) channelBean.requestCurrency) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) channelBean.currencySymbol) && Intrinsics.EZpvd(this.kycType, channelBean.kycType) && this.isUsingInstitutionVerification == channelBean.isUsingInstitutionVerification && Intrinsics.EZpvd((Object) this.supportCurrency, (Object) channelBean.supportCurrency) && Intrinsics.EZpvd(this.supportCurrencyScale, channelBean.supportCurrencyScale) && Intrinsics.EZpvd(this.earnOption, channelBean.earnOption) && Intrinsics.EZpvd(this.supportedCountries, channelBean.supportedCountries) && Intrinsics.EZpvd((Object) this.acquirerBankCountryCode, (Object) channelBean.acquirerBankCountryCode) && this.googlePayReadyToUse == channelBean.googlePayReadyToUse && this.googlePaySupportedButNotSetup == channelBean.googlePaySupportedButNotSetup && Intrinsics.EZpvd(this.supportCurrencyInfo, channelBean.supportCurrencyInfo);
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
    public final EarnOptionBean getEarnOption() {
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
        int iHashCode4 = Boolean.hashCode(this.bestChannel);
        int iHashCode5 = this.backgroundColor.hashCode();
        int iHashCode6 = this.categoryCode.hashCode();
        int iHashCode7 = Boolean.hashCode(this.changeDisplay);
        int iHashCode8 = this.customerUrl.hashCode();
        int iHashCode9 = this.depositName.hashCode();
        int iHashCode10 = this.depositPlatformCode.hashCode();
        int iHashCode11 = Integer.hashCode(this.depositPlatformId);
        int iHashCode12 = this.description.hashCode();
        int iHashCode13 = this.displayIconUrl.hashCode();
        int iHashCode14 = this.displayIconUrlNight.hashCode();
        int iHashCode15 = this.displayName.hashCode();
        int iHashCode16 = this.displayText.hashCode();
        int iHashCode17 = Boolean.hashCode(this.exclusive);
        B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean = this.extCollectInfo;
        int iHashCode18 = b2CExtCollectInfoResponseBean == null ? 0 : b2CExtCollectInfoResponseBean.hashCode();
        int iHashCode19 = this.feeRate.hashCode();
        int iHashCode20 = Boolean.hashCode(this.isConvert);
        int iHashCode21 = Boolean.hashCode(this.isRealTimePrice);
        int iHashCode22 = this.maxLimitAmount.hashCode();
        int iHashCode23 = this.maxPurchaseTime.hashCode();
        int iHashCode24 = this.maxWaitTimeForOrderStatusFetch.hashCode();
        int iHashCode25 = this.minFee.hashCode();
        int iHashCode26 = this.minLimitAmount.hashCode();
        int iHashCode27 = this.minPurchaseTime.hashCode();
        int iHashCode28 = Boolean.hashCode(this.needQuote);
        List<PaymentMethodResponseBean> list = this.p2pPaymentMethodList;
        int iHashCode29 = list == null ? 0 : list.hashCode();
        int iHashCode30 = Boolean.hashCode(this.payOnOk);
        int iHashCode31 = Integer.hashCode(this.paymentMethodCategory);
        List<PaymentMethodResponseBean> list2 = this.paymentMethods;
        int iHashCode32 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.preCheck;
        int iHashCode33 = list3 == null ? 0 : list3.hashCode();
        int iHashCode34 = this.price.hashCode();
        List<String> list4 = this.receiptAccount;
        int iHashCode35 = list4 == null ? 0 : list4.hashCode();
        int iHashCode36 = this.searchUrl.hashCode();
        List<String> list5 = this.tags;
        int iHashCode37 = list5 == null ? 0 : list5.hashCode();
        TermContentChannelResponseBean termContentChannelResponseBean = this.termContent;
        int iHashCode38 = termContentChannelResponseBean == null ? 0 : termContentChannelResponseBean.hashCode();
        Integer num = this.timeUnit;
        int iHashCode39 = num == null ? 0 : num.hashCode();
        int iHashCode40 = this.tutorialUrl.hashCode();
        int iHashCode41 = Boolean.hashCode(this.useRealTimePrice);
        int iHashCode42 = this.checkoutAccountUrl.hashCode();
        int iHashCode43 = this.iconUrl.hashCode();
        int iHashCode44 = this.iconUrlNight.hashCode();
        int iHashCode45 = this.h5Path.hashCode();
        int iHashCode46 = this.faqUrl.hashCode();
        List<String> list6 = this.supportedTransactionType;
        int iHashCode47 = list6 == null ? 0 : list6.hashCode();
        List<String> list7 = this.supportedOrderTypes;
        int iHashCode48 = list7 == null ? 0 : list7.hashCode();
        int iHashCode49 = Boolean.hashCode(this.depositToWithdraw);
        LocalizationResponseBean localizationResponseBean = this.localization;
        int iHashCode50 = localizationResponseBean == null ? 0 : localizationResponseBean.hashCode();
        LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean = this.localizationHighlightStyle;
        int iHashCode51 = localizationHighlightStyleResponseBean == null ? 0 : localizationHighlightStyleResponseBean.hashCode();
        LimitInfoResponseBean limitInfoResponseBean = this.limitInfo;
        int iHashCode52 = limitInfoResponseBean == null ? 0 : limitInfoResponseBean.hashCode();
        InformationBoxResponseBean informationBoxResponseBean = this.informationBox;
        int iHashCode53 = informationBoxResponseBean == null ? 0 : informationBoxResponseBean.hashCode();
        BankingHoursResponseBean bankingHoursResponseBean = this.bankingHours;
        int iHashCode54 = bankingHoursResponseBean == null ? 0 : bankingHoursResponseBean.hashCode();
        UiFlowControlResponseBean uiFlowControlResponseBean = this.uiFlowControl;
        int iHashCode55 = uiFlowControlResponseBean == null ? 0 : uiFlowControlResponseBean.hashCode();
        int iHashCode56 = Boolean.hashCode(this.allowManualAddition);
        int iHashCode57 = this.withdrawHoldCryptoAmount.hashCode();
        int iHashCode58 = this.withdrawHoldDays.hashCode();
        TradeLimitResponseBean tradeLimitResponseBean = this.tradeLimit;
        int iHashCode59 = tradeLimitResponseBean == null ? 0 : tradeLimitResponseBean.hashCode();
        int iHashCode60 = this.target.hashCode();
        int iHashCode61 = this.baseAmount.hashCode();
        int iHashCode62 = this.quoteAmount.hashCode();
        int iHashCode63 = this.quoteCurrency.hashCode();
        int iHashCode64 = this.baseCurrency.hashCode();
        int iHashCode65 = this.requestCurrency.hashCode();
        int iHashCode66 = this.currencySymbol.hashCode();
        Integer num2 = this.kycType;
        int iHashCode67 = num2 == null ? 0 : num2.hashCode();
        int iHashCode68 = Boolean.hashCode(this.isUsingInstitutionVerification);
        int iHashCode69 = this.supportCurrency.hashCode();
        Integer num3 = this.supportCurrencyScale;
        int iHashCode70 = num3 == null ? 0 : num3.hashCode();
        EarnOptionBean earnOptionBean = this.earnOption;
        int iHashCode71 = earnOptionBean == null ? 0 : earnOptionBean.hashCode();
        List<String> list8 = this.supportedCountries;
        int iHashCode72 = list8 == null ? 0 : list8.hashCode();
        String str = this.acquirerBankCountryCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.googlePayReadyToUse)) * 31) + Boolean.hashCode(this.googlePaySupportedButNotSetup)) * 31) + this.supportCurrencyInfo.hashCode();
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
    public final void setEarnOption(EarnOptionBean earnOptionBean) {
        this.earnOption = earnOptionBean;
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
    public final void setPaymentMethods(List<PaymentMethodResponseBean> list) {
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
        return "ChannelBean(tradingAgentInfo=" + this.tradingAgentInfo + ", availableAmount=" + this.availableAmount + ", unavailableAmount=" + this.unavailableAmount + ", bestChannel=" + this.bestChannel + ", backgroundColor=" + this.backgroundColor + ", categoryCode=" + this.categoryCode + ", changeDisplay=" + this.changeDisplay + ", customerUrl=" + this.customerUrl + ", depositName=" + this.depositName + ", depositPlatformCode=" + this.depositPlatformCode + ", depositPlatformId=" + this.depositPlatformId + ", description=" + this.description + ", displayIconUrl=" + this.displayIconUrl + ", displayIconUrlNight=" + this.displayIconUrlNight + ", displayName=" + this.displayName + ", displayText=" + this.displayText + ", exclusive=" + this.exclusive + ", extCollectInfo=" + this.extCollectInfo + ", feeRate=" + this.feeRate + ", isConvert=" + this.isConvert + ", isRealTimePrice=" + this.isRealTimePrice + ", maxLimitAmount=" + this.maxLimitAmount + ", maxPurchaseTime=" + this.maxPurchaseTime + ", maxWaitTimeForOrderStatusFetch=" + this.maxWaitTimeForOrderStatusFetch + ", minFee=" + this.minFee + ", minLimitAmount=" + this.minLimitAmount + ", minPurchaseTime=" + this.minPurchaseTime + ", needQuote=" + this.needQuote + ", p2pPaymentMethodList=" + this.p2pPaymentMethodList + ", payOnOk=" + this.payOnOk + ", paymentMethodCategory=" + this.paymentMethodCategory + ", paymentMethods=" + this.paymentMethods + ", preCheck=" + this.preCheck + ", price=" + this.price + ", receiptAccount=" + this.receiptAccount + ", searchUrl=" + this.searchUrl + ", tags=" + this.tags + ", termContent=" + this.termContent + ", timeUnit=" + this.timeUnit + ", tutorialUrl=" + this.tutorialUrl + ", useRealTimePrice=" + this.useRealTimePrice + ", checkoutAccountUrl=" + this.checkoutAccountUrl + ", iconUrl=" + this.iconUrl + ", iconUrlNight=" + this.iconUrlNight + ", h5Path=" + this.h5Path + ", faqUrl=" + this.faqUrl + ", supportedTransactionType=" + this.supportedTransactionType + ", supportedOrderTypes=" + this.supportedOrderTypes + ", depositToWithdraw=" + this.depositToWithdraw + ", localization=" + this.localization + ", localizationHighlightStyle=" + this.localizationHighlightStyle + ", limitInfo=" + this.limitInfo + ", informationBox=" + this.informationBox + ", bankingHours=" + this.bankingHours + ", uiFlowControl=" + this.uiFlowControl + ", allowManualAddition=" + this.allowManualAddition + ", withdrawHoldCryptoAmount=" + this.withdrawHoldCryptoAmount + ", withdrawHoldDays=" + this.withdrawHoldDays + ", tradeLimit=" + this.tradeLimit + ", target=" + this.target + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", requestCurrency=" + this.requestCurrency + ", currencySymbol=" + this.currencySymbol + ", kycType=" + this.kycType + ", isUsingInstitutionVerification=" + this.isUsingInstitutionVerification + ", supportCurrency=" + this.supportCurrency + ", supportCurrencyScale=" + this.supportCurrencyScale + ", earnOption=" + this.earnOption + ", supportedCountries=" + this.supportedCountries + ", acquirerBankCountryCode=" + this.acquirerBankCountryCode + ", googlePayReadyToUse=" + this.googlePayReadyToUse + ", googlePaySupportedButNotSetup=" + this.googlePaySupportedButNotSetup + ", supportCurrencyInfo=" + this.supportCurrencyInfo + ")";
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
        parcel.writeStringList(this.supportedOrderTypes);
        parcel.writeInt(this.depositToWithdraw ? 1 : 0);
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
        parcel.writeInt(this.allowManualAddition ? 1 : 0);
        parcel.writeString(this.withdrawHoldCryptoAmount);
        parcel.writeString(this.withdrawHoldDays);
        TradeLimitResponseBean tradeLimitResponseBean = this.tradeLimit;
        if (tradeLimitResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeLimitResponseBean.writeToParcel(parcel, i);
        }
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
        Integer num3 = this.supportCurrencyScale;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        EarnOptionBean earnOptionBean = this.earnOption;
        if (earnOptionBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOptionBean.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.supportedCountries);
        parcel.writeString(this.acquirerBankCountryCode);
        parcel.writeInt(this.googlePayReadyToUse ? 1 : 0);
        parcel.writeInt(this.googlePaySupportedButNotSetup ? 1 : 0);
        this.supportCurrencyInfo.writeToParcel(parcel, i);
    }

    public /* synthetic */ ChannelBean(int i, int i2, int i3, TradingAgentInfo tradingAgentInfo, String str, String str2, boolean z, String str3, ChannelCategoryCode channelCategoryCode, boolean z2, String str4, String str5, String str6, int i4, String str7, String str8, String str9, String str10, String str11, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, String str12, boolean z4, boolean z5, String str13, String str14, String str15, String str16, String str17, String str18, boolean z6, List list, boolean z7, int i5, List list2, List list3, String str19, List list4, String str20, List list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, String str21, boolean z8, String str22, String str23, String str24, String str25, String str26, List list6, List list7, boolean z9, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, boolean z10, String str27, String str28, TradeLimitResponseBean tradeLimitResponseBean, String str29, String str30, String str31, String str32, String str33, String str34, String str35, Integer num2, boolean z11, String str36, Integer num3, EarnOptionBean earnOptionBean, List list8, String str37, boolean z12, boolean z13, SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.bestChannel = false;
        } else {
            this.bestChannel = z;
        }
        if ((i & 16) == 0) {
            this.backgroundColor = "";
        } else {
            this.backgroundColor = str3;
        }
        this.categoryCode = (i & 32) == 0 ? ChannelCategoryCode.BALANCE : channelCategoryCode;
        if ((i & 64) == 0) {
            this.changeDisplay = false;
        } else {
            this.changeDisplay = z2;
        }
        if ((i & 128) == 0) {
            this.customerUrl = "";
        } else {
            this.customerUrl = str4;
        }
        if ((i & 256) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str5;
        }
        if ((i & 512) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str6;
        }
        this.depositPlatformId = (i & 1024) == 0 ? -1 : i4;
        if ((i & 2048) == 0) {
            this.description = "";
        } else {
            this.description = str7;
        }
        if ((i & 4096) == 0) {
            this.displayIconUrl = "";
        } else {
            this.displayIconUrl = str8;
        }
        if ((i & 8192) == 0) {
            this.displayIconUrlNight = "";
        } else {
            this.displayIconUrlNight = str9;
        }
        if ((i & 16384) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str10;
        }
        if ((i & 32768) == 0) {
            this.displayText = "";
        } else {
            this.displayText = str11;
        }
        if ((i & 65536) == 0) {
            this.exclusive = false;
        } else {
            this.exclusive = z3;
        }
        if ((i & 131072) == 0) {
            this.extCollectInfo = null;
        } else {
            this.extCollectInfo = b2CExtCollectInfoResponseBean;
        }
        if ((262144 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str12;
        }
        if ((524288 & i) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z4;
        }
        if ((1048576 & i) == 0) {
            this.isRealTimePrice = false;
        } else {
            this.isRealTimePrice = z5;
        }
        if ((2097152 & i) == 0) {
            this.maxLimitAmount = "0";
        } else {
            this.maxLimitAmount = str13;
        }
        if ((4194304 & i) == 0) {
            this.maxPurchaseTime = "0";
        } else {
            this.maxPurchaseTime = str14;
        }
        this.maxWaitTimeForOrderStatusFetch = (8388608 & i) == 0 ? "15" : str15;
        if ((16777216 & i) == 0) {
            this.minFee = "";
        } else {
            this.minFee = str16;
        }
        if ((33554432 & i) == 0) {
            this.minLimitAmount = "0";
        } else {
            this.minLimitAmount = str17;
        }
        if ((67108864 & i) == 0) {
            this.minPurchaseTime = "0";
        } else {
            this.minPurchaseTime = str18;
        }
        if ((134217728 & i) == 0) {
            this.needQuote = false;
        } else {
            this.needQuote = z6;
        }
        if ((268435456 & i) == 0) {
            this.p2pPaymentMethodList = null;
        } else {
            this.p2pPaymentMethodList = list;
        }
        if ((536870912 & i) == 0) {
            this.payOnOk = false;
        } else {
            this.payOnOk = z7;
        }
        if ((1073741824 & i) == 0) {
            this.paymentMethodCategory = 0;
        } else {
            this.paymentMethodCategory = i5;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.paymentMethods = null;
        } else {
            this.paymentMethods = list2;
        }
        if ((i2 & 1) == 0) {
            this.preCheck = null;
        } else {
            this.preCheck = list3;
        }
        if ((i2 & 2) == 0) {
            this.price = "0";
        } else {
            this.price = str19;
        }
        if ((i2 & 4) == 0) {
            this.receiptAccount = null;
        } else {
            this.receiptAccount = list4;
        }
        if ((i2 & 8) == 0) {
            this.searchUrl = "";
        } else {
            this.searchUrl = str20;
        }
        if ((i2 & 16) == 0) {
            this.tags = null;
        } else {
            this.tags = list5;
        }
        if ((i2 & 32) == 0) {
            this.termContent = null;
        } else {
            this.termContent = termContentChannelResponseBean;
        }
        if ((i2 & 64) == 0) {
            this.timeUnit = null;
        } else {
            this.timeUnit = num;
        }
        if ((i2 & 128) == 0) {
            this.tutorialUrl = "";
        } else {
            this.tutorialUrl = str21;
        }
        if ((i2 & 256) == 0) {
            this.useRealTimePrice = false;
        } else {
            this.useRealTimePrice = z8;
        }
        if ((i2 & 512) == 0) {
            this.checkoutAccountUrl = "";
        } else {
            this.checkoutAccountUrl = str22;
        }
        if ((i2 & 1024) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str23;
        }
        if ((i2 & 2048) == 0) {
            this.iconUrlNight = "";
        } else {
            this.iconUrlNight = str24;
        }
        if ((i2 & 4096) == 0) {
            this.h5Path = "";
        } else {
            this.h5Path = str25;
        }
        if ((i2 & 8192) == 0) {
            this.faqUrl = "";
        } else {
            this.faqUrl = str26;
        }
        if ((i2 & 16384) == 0) {
            this.supportedTransactionType = null;
        } else {
            this.supportedTransactionType = list6;
        }
        if ((i2 & 32768) == 0) {
            this.supportedOrderTypes = null;
        } else {
            this.supportedOrderTypes = list7;
        }
        if ((i2 & 65536) == 0) {
            this.depositToWithdraw = false;
        } else {
            this.depositToWithdraw = z9;
        }
        if ((i2 & 131072) == 0) {
            this.localization = null;
        } else {
            this.localization = localizationResponseBean;
        }
        if ((262144 & i2) == 0) {
            this.localizationHighlightStyle = null;
        } else {
            this.localizationHighlightStyle = localizationHighlightStyleResponseBean;
        }
        if ((524288 & i2) == 0) {
            this.limitInfo = null;
        } else {
            this.limitInfo = limitInfoResponseBean;
        }
        if ((1048576 & i2) == 0) {
            this.informationBox = null;
        } else {
            this.informationBox = informationBoxResponseBean;
        }
        if ((2097152 & i2) == 0) {
            this.bankingHours = null;
        } else {
            this.bankingHours = bankingHoursResponseBean;
        }
        if ((4194304 & i2) == 0) {
            this.uiFlowControl = null;
        } else {
            this.uiFlowControl = uiFlowControlResponseBean;
        }
        if ((8388608 & i2) == 0) {
            this.allowManualAddition = false;
        } else {
            this.allowManualAddition = z10;
        }
        if ((16777216 & i2) == 0) {
            this.withdrawHoldCryptoAmount = "";
        } else {
            this.withdrawHoldCryptoAmount = str27;
        }
        if ((33554432 & i2) == 0) {
            this.withdrawHoldDays = "";
        } else {
            this.withdrawHoldDays = str28;
        }
        this.tradeLimit = (67108864 & i2) == 0 ? new TradeLimitResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimitResponseBean;
        if ((134217728 & i2) == 0) {
            this.target = "";
        } else {
            this.target = str29;
        }
        if ((268435456 & i2) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str30;
        }
        if ((536870912 & i2) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str31;
        }
        if ((1073741824 & i2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str32;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str33;
        }
        if ((i3 & 1) == 0) {
            this.requestCurrency = "";
        } else {
            this.requestCurrency = str34;
        }
        if ((i3 & 2) == 0) {
            this.currencySymbol = "";
        } else {
            this.currencySymbol = str35;
        }
        if ((i3 & 4) == 0) {
            this.kycType = null;
        } else {
            this.kycType = num2;
        }
        if ((i3 & 8) == 0) {
            this.isUsingInstitutionVerification = false;
        } else {
            this.isUsingInstitutionVerification = z11;
        }
        if ((i3 & 16) == 0) {
            this.supportCurrency = "";
        } else {
            this.supportCurrency = str36;
        }
        if ((i3 & 32) == 0) {
            this.supportCurrencyScale = null;
        } else {
            this.supportCurrencyScale = num3;
        }
        if ((i3 & 64) == 0) {
            this.earnOption = null;
        } else {
            this.earnOption = earnOptionBean;
        }
        if ((i3 & 128) == 0) {
            this.supportedCountries = null;
        } else {
            this.supportedCountries = list8;
        }
        if ((i3 & 256) == 0) {
            this.acquirerBankCountryCode = null;
        } else {
            this.acquirerBankCountryCode = str37;
        }
        if ((i3 & 512) == 0) {
            this.googlePayReadyToUse = false;
        } else {
            this.googlePayReadyToUse = z12;
        }
        if ((i3 & 1024) == 0) {
            this.googlePaySupportedButNotSetup = false;
        } else {
            this.googlePaySupportedButNotSetup = z13;
        }
        this.supportCurrencyInfo = (i3 & 2048) == 0 ? new SupportCurrencyInfoResponseBean((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null) : supportCurrencyInfoResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [27=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ChannelBean channelBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || channelBean.tradingAgentInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TradingAgentInfo$$serializer.INSTANCE, channelBean.tradingAgentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) channelBean.availableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, channelBean.availableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) channelBean.unavailableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, channelBean.unavailableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || channelBean.bestChannel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, channelBean.bestChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) channelBean.backgroundColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, channelBean.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || channelBean.categoryCode != ChannelCategoryCode.BALANCE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], channelBean.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || channelBean.changeDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, channelBean.changeDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) channelBean.customerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, channelBean.customerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) channelBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, channelBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) channelBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, channelBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || channelBean.depositPlatformId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, channelBean.depositPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) channelBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, channelBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) channelBean.displayIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, channelBean.displayIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) channelBean.displayIconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, channelBean.displayIconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) channelBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, channelBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) channelBean.displayText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, channelBean.displayText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || channelBean.exclusive) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, channelBean.exclusive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || channelBean.extCollectInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, B2CExtCollectInfoResponseBean$$serializer.INSTANCE, channelBean.extCollectInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) channelBean.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, channelBean.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || channelBean.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, channelBean.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || channelBean.isRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, channelBean.isRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) channelBean.maxLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, channelBean.maxLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) channelBean.maxPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, channelBean.maxPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) channelBean.maxWaitTimeForOrderStatusFetch, (Object) "15")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, channelBean.maxWaitTimeForOrderStatusFetch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) channelBean.minFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, channelBean.minFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) channelBean.minLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, channelBean.minLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) channelBean.minPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, channelBean.minPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || channelBean.needQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, channelBean.needQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || channelBean.p2pPaymentMethodList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], channelBean.p2pPaymentMethodList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || channelBean.payOnOk) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, channelBean.payOnOk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || channelBean.paymentMethodCategory != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 30, channelBean.paymentMethodCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || channelBean.paymentMethods != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], channelBean.paymentMethods);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || channelBean.preCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, kSerializerArr[32], channelBean.preCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) channelBean.price, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, channelBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || channelBean.receiptAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, kSerializerArr[34], channelBean.receiptAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) channelBean.searchUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, channelBean.searchUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || channelBean.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, kSerializerArr[36], channelBean.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || channelBean.termContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, TermContentChannelResponseBean$$serializer.INSTANCE, channelBean.termContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || channelBean.timeUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, channelBean.timeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) channelBean.tutorialUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, channelBean.tutorialUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || channelBean.useRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 40, channelBean.useRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) channelBean.checkoutAccountUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, channelBean.checkoutAccountUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) channelBean.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, channelBean.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) channelBean.iconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, channelBean.iconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) channelBean.h5Path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, channelBean.h5Path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) channelBean.faqUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, channelBean.faqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || channelBean.supportedTransactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, kSerializerArr[46], channelBean.supportedTransactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || channelBean.supportedOrderTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, kSerializerArr[47], channelBean.supportedOrderTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || channelBean.depositToWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 48, channelBean.depositToWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || channelBean.localization != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, LocalizationResponseBean$$serializer.INSTANCE, channelBean.localization);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || channelBean.localizationHighlightStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, LocalizationHighlightStyleResponseBean$$serializer.INSTANCE, channelBean.localizationHighlightStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || channelBean.limitInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, LimitInfoResponseBean$$serializer.INSTANCE, channelBean.limitInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || channelBean.informationBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, InformationBoxResponseBean$$serializer.INSTANCE, channelBean.informationBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || channelBean.bankingHours != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, BankingHoursResponseBean$$serializer.INSTANCE, channelBean.bankingHours);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || channelBean.uiFlowControl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, UiFlowControlResponseBean$$serializer.INSTANCE, channelBean.uiFlowControl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || channelBean.allowManualAddition) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 55, channelBean.allowManualAddition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) channelBean.withdrawHoldCryptoAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, channelBean.withdrawHoldCryptoAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) channelBean.withdrawHoldDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, channelBean.withdrawHoldDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd(channelBean.tradeLimit, new TradeLimitResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 58, TradeLimitResponseBean$$serializer.INSTANCE, channelBean.tradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) channelBean.target, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, channelBean.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) channelBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, channelBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) channelBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, channelBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) channelBean.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, channelBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) channelBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, channelBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) channelBean.requestCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, channelBean.requestCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) channelBean.currencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, channelBean.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || channelBean.kycType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, IntSerializer.INSTANCE, channelBean.kycType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || channelBean.isUsingInstitutionVerification) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 67, channelBean.isUsingInstitutionVerification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) channelBean.supportCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, channelBean.supportCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || channelBean.supportCurrencyScale != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, IntSerializer.INSTANCE, channelBean.supportCurrencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || channelBean.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, EarnOptionBean$$serializer.INSTANCE, channelBean.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || channelBean.supportedCountries != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, kSerializerArr[71], channelBean.supportedCountries);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || channelBean.acquirerBankCountryCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, StringSerializer.INSTANCE, channelBean.acquirerBankCountryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || channelBean.googlePayReadyToUse) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 73, channelBean.googlePayReadyToUse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || channelBean.googlePaySupportedButNotSetup) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 74, channelBean.googlePaySupportedButNotSetup);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) && Intrinsics.EZpvd(channelBean.supportCurrencyInfo, new SupportCurrencyInfoResponseBean((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 75, SupportCurrencyInfoResponseBean$$serializer.INSTANCE, channelBean.supportCurrencyInfo);
    }

    public ChannelBean(TradingAgentInfo tradingAgentInfo, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull ChannelCategoryCode channelCategoryCode, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, @NotNull String str12, boolean z4, boolean z5, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z6, List<PaymentMethodResponseBean> list, boolean z7, int i2, List<PaymentMethodResponseBean> list2, List<String> list3, @NotNull String str19, List<String> list4, @NotNull String str20, List<String> list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, @NotNull String str21, boolean z8, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, List<String> list6, List<String> list7, boolean z9, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, boolean z10, @NotNull String str27, @NotNull String str28, TradeLimitResponseBean tradeLimitResponseBean, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, Integer num2, boolean z11, @NotNull String str36, Integer num3, EarnOptionBean earnOptionBean, List<String> list8, String str37, boolean z12, boolean z13, @NotNull SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
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
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(supportCurrencyInfoResponseBean, "");
        this.tradingAgentInfo = tradingAgentInfo;
        this.availableAmount = str;
        this.unavailableAmount = str2;
        this.bestChannel = z;
        this.backgroundColor = str3;
        this.categoryCode = channelCategoryCode;
        this.changeDisplay = z2;
        this.customerUrl = str4;
        this.depositName = str5;
        this.depositPlatformCode = str6;
        this.depositPlatformId = i;
        this.description = str7;
        this.displayIconUrl = str8;
        this.displayIconUrlNight = str9;
        this.displayName = str10;
        this.displayText = str11;
        this.exclusive = z3;
        this.extCollectInfo = b2CExtCollectInfoResponseBean;
        this.feeRate = str12;
        this.isConvert = z4;
        this.isRealTimePrice = z5;
        this.maxLimitAmount = str13;
        this.maxPurchaseTime = str14;
        this.maxWaitTimeForOrderStatusFetch = str15;
        this.minFee = str16;
        this.minLimitAmount = str17;
        this.minPurchaseTime = str18;
        this.needQuote = z6;
        this.p2pPaymentMethodList = list;
        this.payOnOk = z7;
        this.paymentMethodCategory = i2;
        this.paymentMethods = list2;
        this.preCheck = list3;
        this.price = str19;
        this.receiptAccount = list4;
        this.searchUrl = str20;
        this.tags = list5;
        this.termContent = termContentChannelResponseBean;
        this.timeUnit = num;
        this.tutorialUrl = str21;
        this.useRealTimePrice = z8;
        this.checkoutAccountUrl = str22;
        this.iconUrl = str23;
        this.iconUrlNight = str24;
        this.h5Path = str25;
        this.faqUrl = str26;
        this.supportedTransactionType = list6;
        this.supportedOrderTypes = list7;
        this.depositToWithdraw = z9;
        this.localization = localizationResponseBean;
        this.localizationHighlightStyle = localizationHighlightStyleResponseBean;
        this.limitInfo = limitInfoResponseBean;
        this.informationBox = informationBoxResponseBean;
        this.bankingHours = bankingHoursResponseBean;
        this.uiFlowControl = uiFlowControlResponseBean;
        this.allowManualAddition = z10;
        this.withdrawHoldCryptoAmount = str27;
        this.withdrawHoldDays = str28;
        this.tradeLimit = tradeLimitResponseBean;
        this.target = str29;
        this.baseAmount = str30;
        this.quoteAmount = str31;
        this.quoteCurrency = str32;
        this.baseCurrency = str33;
        this.requestCurrency = str34;
        this.currencySymbol = str35;
        this.kycType = num2;
        this.isUsingInstitutionVerification = z11;
        this.supportCurrency = str36;
        this.supportCurrencyScale = num3;
        this.earnOption = earnOptionBean;
        this.supportedCountries = list8;
        this.acquirerBankCountryCode = str37;
        this.googlePayReadyToUse = z12;
        this.googlePaySupportedButNotSetup = z13;
        this.supportCurrencyInfo = supportCurrencyInfoResponseBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelBean(TradingAgentInfo tradingAgentInfo, String str, String str2, boolean z, String str3, ChannelCategoryCode channelCategoryCode, boolean z2, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, boolean z3, B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean, String str12, boolean z4, boolean z5, String str13, String str14, String str15, String str16, String str17, String str18, boolean z6, List list, boolean z7, int i2, List list2, List list3, String str19, List list4, String str20, List list5, TermContentChannelResponseBean termContentChannelResponseBean, Integer num, String str21, boolean z8, String str22, String str23, String str24, String str25, String str26, List list6, List list7, boolean z9, LocalizationResponseBean localizationResponseBean, LocalizationHighlightStyleResponseBean localizationHighlightStyleResponseBean, LimitInfoResponseBean limitInfoResponseBean, InformationBoxResponseBean informationBoxResponseBean, BankingHoursResponseBean bankingHoursResponseBean, UiFlowControlResponseBean uiFlowControlResponseBean, boolean z10, String str27, String str28, TradeLimitResponseBean tradeLimitResponseBean, String str29, String str30, String str31, String str32, String str33, String str34, String str35, Integer num2, boolean z11, String str36, Integer num3, EarnOptionBean earnOptionBean, List list8, String str37, boolean z12, boolean z13, SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str38;
        TradingAgentInfo tradingAgentInfo2 = (i3 & 1) != 0 ? null : tradingAgentInfo;
        String str39 = (i3 & 2) != 0 ? "" : str;
        String str40 = (i3 & 4) != 0 ? "" : str2;
        boolean z14 = (i3 & 8) != 0 ? false : z;
        String str41 = (i3 & 16) != 0 ? "" : str3;
        ChannelCategoryCode channelCategoryCode2 = (i3 & 32) != 0 ? ChannelCategoryCode.BALANCE : channelCategoryCode;
        boolean z15 = (i3 & 64) != 0 ? false : z2;
        String str42 = (i3 & 128) != 0 ? "" : str4;
        String str43 = (i3 & 256) != 0 ? "" : str5;
        String str44 = (i3 & 512) != 0 ? "" : str6;
        int i6 = (i3 & 1024) != 0 ? -1 : i;
        String str45 = (i3 & 2048) != 0 ? "" : str7;
        str38 = "";
        String str46 = (i3 & 4096) != 0 ? str38 : str8;
        String str47 = (i3 & 8192) != 0 ? str38 : str9;
        String str48 = (i3 & 16384) != 0 ? str38 : str10;
        String str49 = (i3 & 32768) != 0 ? str38 : str11;
        boolean z16 = (i3 & 65536) != 0 ? false : z3;
        B2CExtCollectInfoResponseBean b2CExtCollectInfoResponseBean2 = (i3 & 131072) != 0 ? null : b2CExtCollectInfoResponseBean;
        String str50 = (i3 & 262144) != 0 ? str38 : str12;
        boolean z17 = (i3 & 524288) != 0 ? false : z4;
        boolean z18 = (i3 & 1048576) != 0 ? false : z5;
        String str51 = (i3 & 2097152) != 0 ? "0" : str13;
        String str52 = (i3 & 4194304) != 0 ? "0" : str14;
        String str53 = (i3 & 8388608) != 0 ? "15" : str15;
        String str54 = (i3 & 16777216) != 0 ? str38 : str16;
        String str55 = (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "0" : str17;
        String str56 = (i3 & 67108864) != 0 ? "0" : str18;
        boolean z19 = (i3 & 134217728) != 0 ? false : z6;
        List list9 = (i3 & 268435456) != 0 ? null : list;
        boolean z20 = (i3 & 536870912) != 0 ? false : z7;
        int i7 = (i3 & 1073741824) != 0 ? 0 : i2;
        List list10 = (i3 & Integer.MIN_VALUE) != 0 ? null : list2;
        this(tradingAgentInfo2, str39, str40, z14, str41, channelCategoryCode2, z15, str42, str43, str44, i6, str45, str46, str47, str48, str49, z16, b2CExtCollectInfoResponseBean2, str50, z17, z18, str51, str52, str53, str54, str55, str56, z19, list9, z20, i7, list10, (i4 & 1) != 0 ? null : list3, (i4 & 2) == 0 ? str19 : "0", (i4 & 4) != 0 ? null : list4, (i4 & 8) != 0 ? str38 : str20, (i4 & 16) != 0 ? null : list5, (i4 & 32) != 0 ? null : termContentChannelResponseBean, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? str38 : str21, (i4 & 256) != 0 ? false : z8, (i4 & 512) != 0 ? str38 : str22, (i4 & 1024) != 0 ? str38 : str23, (i4 & 2048) != 0 ? str38 : str24, (i4 & 4096) != 0 ? str38 : str25, (i4 & 8192) != 0 ? str38 : str26, (i4 & 16384) != 0 ? null : list6, (i4 & 32768) != 0 ? null : list7, (i4 & 65536) != 0 ? false : z9, (i4 & 131072) != 0 ? null : localizationResponseBean, (i4 & 262144) != 0 ? null : localizationHighlightStyleResponseBean, (i4 & 524288) != 0 ? null : limitInfoResponseBean, (i4 & 1048576) != 0 ? null : informationBoxResponseBean, (i4 & 2097152) != 0 ? null : bankingHoursResponseBean, (i4 & 4194304) != 0 ? null : uiFlowControlResponseBean, (i4 & 8388608) != 0 ? false : z10, (i4 & 16777216) != 0 ? str38 : str27, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? str38 : str28, (i4 & 67108864) != 0 ? new TradeLimitResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimitResponseBean, (i4 & 134217728) != 0 ? str38 : str29, (i4 & 268435456) != 0 ? str38 : str30, (i4 & 536870912) != 0 ? str38 : str31, (i4 & 1073741824) != 0 ? str38 : str32, (i4 & Integer.MIN_VALUE) != 0 ? str38 : str33, (i5 & 1) != 0 ? str38 : str34, (i5 & 2) != 0 ? str38 : str35, (i5 & 4) != 0 ? null : num2, (i5 & 8) != 0 ? false : z11, (i5 & 16) == 0 ? str36 : "", (i5 & 32) != 0 ? null : num3, (i5 & 64) != 0 ? null : earnOptionBean, (i5 & 128) != 0 ? null : list8, (i5 & 256) != 0 ? null : str37, (i5 & 512) != 0 ? false : z12, (i5 & 1024) != 0 ? false : z13, (i5 & 2048) != 0 ? new SupportCurrencyInfoResponseBean((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null) : supportCurrencyInfoResponseBean);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChannelBean> serializer() {
            return ChannelBean$$serializer.INSTANCE;
        }

        public final ChannelBean copydefault(@NotNull ChannelResponseBean channelResponseBean) {
            Intrinsics.checkNotNullParameter(channelResponseBean, "");
            TradingAgentInfo tradingAgentInfo = channelResponseBean.getTradingAgentInfo();
            String availableAmount = channelResponseBean.getAvailableAmount();
            String unavailableAmount = channelResponseBean.getUnavailableAmount();
            String baseAmount = channelResponseBean.getBaseAmount();
            boolean bestChannel = channelResponseBean.getBestChannel();
            String backgroundColor = channelResponseBean.getBackgroundColor();
            ChannelCategoryCode channelCategoryCodeKWHzl = KWHzl(channelResponseBean.getCategoryCode());
            boolean changeDisplay = channelResponseBean.getChangeDisplay();
            String customerUrl = channelResponseBean.getCustomerUrl();
            String depositName = channelResponseBean.getDepositName();
            String depositPlatformCode = channelResponseBean.getDepositPlatformCode();
            int depositPlatformId = channelResponseBean.getDepositPlatformId();
            String description = channelResponseBean.getDescription();
            String displayIconUrl = channelResponseBean.getDisplayIconUrl();
            String displayIconUrlNight = channelResponseBean.getDisplayIconUrlNight();
            String displayName = channelResponseBean.getDisplayName();
            String displayText = channelResponseBean.getDisplayText();
            boolean exclusive = channelResponseBean.getExclusive();
            B2CExtCollectInfoResponseBean extCollectInfo = channelResponseBean.getExtCollectInfo();
            String feeRate = channelResponseBean.getFeeRate();
            boolean zIsConvert = channelResponseBean.isConvert();
            boolean zIsRealTimePrice = channelResponseBean.isRealTimePrice();
            String maxLimitAmount = channelResponseBean.getMaxLimitAmount();
            String maxPurchaseTime = channelResponseBean.getMaxPurchaseTime();
            String minFee = channelResponseBean.getMinFee();
            String minLimitAmount = channelResponseBean.getMinLimitAmount();
            String minPurchaseTime = channelResponseBean.getMinPurchaseTime();
            String maxWaitTimeForOrderStatusFetch = channelResponseBean.getMaxWaitTimeForOrderStatusFetch();
            boolean needQuote = channelResponseBean.getNeedQuote();
            List<PaymentMethodResponseBean> p2pPaymentMethodList = channelResponseBean.getP2pPaymentMethodList();
            boolean payOnOk = channelResponseBean.getPayOnOk();
            int paymentMethodCategory = channelResponseBean.getPaymentMethodCategory();
            List<PaymentMethodResponseBean> paymentMethods = channelResponseBean.getPaymentMethods();
            List<String> preCheck = channelResponseBean.getPreCheck();
            String price = channelResponseBean.getPrice();
            String quoteAmount = channelResponseBean.getQuoteAmount();
            List<String> receiptAccount = channelResponseBean.getReceiptAccount();
            String searchUrl = channelResponseBean.getSearchUrl();
            List<String> tags = channelResponseBean.getTags();
            TermContentChannelResponseBean termContent = channelResponseBean.getTermContent();
            Integer timeUnit = channelResponseBean.getTimeUnit();
            String tutorialUrl = channelResponseBean.getTutorialUrl();
            boolean useRealTimePrice = channelResponseBean.getUseRealTimePrice();
            String checkoutAccountUrl = channelResponseBean.getCheckoutAccountUrl();
            String iconUrl = channelResponseBean.getIconUrl();
            String iconUrlNight = channelResponseBean.getIconUrlNight();
            String h5Path = channelResponseBean.getH5Path();
            String faqUrl = channelResponseBean.getFaqUrl();
            List<String> supportedTransactionType = channelResponseBean.getSupportedTransactionType();
            List<String> supportedOrderTypes = channelResponseBean.getSupportedOrderTypes();
            boolean depositToWithdraw = channelResponseBean.getDepositToWithdraw();
            LocalizationResponseBean localization = channelResponseBean.getLocalization();
            LocalizationHighlightStyleResponseBean localizationHighlightStyle = channelResponseBean.getLocalizationHighlightStyle();
            LimitInfoResponseBean limitInfo = channelResponseBean.getLimitInfo();
            InformationBoxResponseBean informationBox = channelResponseBean.getInformationBox();
            BankingHoursResponseBean bankingHours = channelResponseBean.getBankingHours();
            boolean allowManualAddition = channelResponseBean.getAllowManualAddition();
            UiFlowControlResponseBean uiFlowControl = channelResponseBean.getUiFlowControl();
            String target = channelResponseBean.getTarget();
            String withdrawHoldCryptoAmount = channelResponseBean.getWithdrawHoldCryptoAmount();
            String withdrawHoldDays = channelResponseBean.getWithdrawHoldDays();
            Integer kycType = channelResponseBean.getKycType();
            boolean zIsUsingInstitutionVerification = channelResponseBean.isUsingInstitutionVerification();
            String supportCurrency = channelResponseBean.getSupportCurrency();
            Integer supportCurrencyScale = channelResponseBean.getSupportCurrencyScale();
            SupportCurrencyInfoResponseBean supportCurrencyInfo = channelResponseBean.getSupportCurrencyInfo();
            if (supportCurrencyInfo == null) {
                supportCurrencyInfo = new SupportCurrencyInfoResponseBean((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null);
            }
            SupportCurrencyInfoResponseBean supportCurrencyInfoResponseBean = supportCurrencyInfo;
            EarnOptionResponseBean earnOption = channelResponseBean.getEarnOption();
            return new ChannelBean(tradingAgentInfo, availableAmount, unavailableAmount, bestChannel, backgroundColor, channelCategoryCodeKWHzl, changeDisplay, customerUrl, depositName, depositPlatformCode, depositPlatformId, description, displayIconUrl, displayIconUrlNight, displayName, displayText, exclusive, extCollectInfo, feeRate, zIsConvert, zIsRealTimePrice, maxLimitAmount, maxPurchaseTime, maxWaitTimeForOrderStatusFetch, minFee, minLimitAmount, minPurchaseTime, needQuote, (List) p2pPaymentMethodList, payOnOk, paymentMethodCategory, (List) paymentMethods, (List) preCheck, price, (List) receiptAccount, searchUrl, (List) tags, termContent, timeUnit, tutorialUrl, useRealTimePrice, checkoutAccountUrl, iconUrl, iconUrlNight, h5Path, faqUrl, (List) supportedTransactionType, (List) supportedOrderTypes, depositToWithdraw, localization, localizationHighlightStyle, limitInfo, informationBox, bankingHours, uiFlowControl, allowManualAddition, withdrawHoldCryptoAmount, withdrawHoldDays, channelResponseBean.getTradeLimit(), target, baseAmount, quoteAmount, (String) null, (String) null, (String) null, (String) null, kycType, zIsUsingInstitutionVerification, supportCurrency, supportCurrencyScale, earnOption != null ? EarnOptionBean.Companion.KWHzl(earnOption) : null, (List) channelResponseBean.getSupportedCountries(), channelResponseBean.getAcquirerBankCountryCode(), false, false, supportCurrencyInfoResponseBean, 0, -1073741824, 1539, (DefaultConstructorMarker) null);
        }

        public final ChannelCategoryCode KWHzl(int i) {
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
    }

    static {
        PaymentMethodResponseBean$$serializer paymentMethodResponseBean$$serializer = PaymentMethodResponseBean$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, ChannelCategoryCode.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(paymentMethodResponseBean$$serializer), null, null, new ArrayListSerializer(paymentMethodResponseBean$$serializer), new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null};
    }
}
