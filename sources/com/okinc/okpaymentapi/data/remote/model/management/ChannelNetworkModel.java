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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ChannelNetworkModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String acquirerBankCountryCode;
    private final boolean allowManualAddition;
    private final String availableAmount;
    private final String backgroundColor;
    private final BankingHours bankingHours;
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
    private final EarnOption earnOption;
    private final boolean exclusive;
    private final B2CExtCollectInfo extCollectInfo;
    private final String faqUrl;
    private final String feeRate;
    private final String fixedPriceTolerance;
    private final String h5Path;
    private final String iconUrl;
    private final String iconUrlNight;
    private final InformationBox informationBox;
    private final boolean isConvert;
    private final boolean isRealTimePrice;
    private boolean isUsingInstitutionVerification;
    private final Integer kycType;
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
    private final int paymentMethodCategory;
    private List<PaymentMethod> paymentMethods;
    private final List<String> preCheck;
    private final String price;
    private final String quoteAmount;
    private final List<String> receiptAccount;
    private final String searchUrl;
    private final String supportCurrency;
    private final SupportCurrencyInfo supportCurrencyInfo;
    private final Integer supportCurrencyScale;
    private final boolean supportStablecoin;
    private List<String> supportedCountries;
    private final List<String> supportedOrderTypes;
    private final List<String> supportedTransactionType;
    private final List<String> tags;
    private final String target;
    private final TermContentChannel termContent;
    private final Integer timeUnit;
    private final TradeLimit tradeLimit;
    private final String tutorialUrl;
    private final UiFlowControl uiFlowControl;
    private final String unavailableAmount;
    private final boolean useRealTimePrice;
    private final String withdrawHoldCryptoAmount;
    private final String withdrawHoldDays;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChannelNetworkModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChannelNetworkModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelNetworkModel createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
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
            B2CExtCollectInfo b2CExtCollectInfoCreateFromParcel = parcel.readInt() == 0 ? null : B2CExtCollectInfo.CREATOR.createFromParcel(parcel);
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
                str = string9;
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                str = string9;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList3.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList3;
            }
            boolean z7 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int i7 = 0;
                while (i7 != i6) {
                    arrayList4.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                    i7++;
                    i6 = i6;
                }
                arrayList2 = arrayList4;
            }
            return new ChannelNetworkModel(string, string2, string3, z, string4, i, z2, string5, string6, string7, i2, string8, str, string10, string11, string12, z3, b2CExtCollectInfoCreateFromParcel, string13, z4, z5, string14, string15, string16, string17, string18, string19, z6, arrayList, z7, i5, arrayList2, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TermContentChannel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Localization.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalizationHighlightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LimitInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InformationBox.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BankingHours.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiFlowControl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TradeLimit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SupportCurrencyInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EarnOption.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelNetworkModel[] newArray(int i) {
            return new ChannelNetworkModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelNetworkModel() {
        this((String) null, (String) null, (String) null, false, (String) null, 0, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfo) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, 0, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannel) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (List) null, false, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, (String) null, (String) null, (String) null, (TradeLimit) null, (Integer) null, false, (String) null, false, (SupportCurrencyInfo) null, (EarnOption) null, false, (List) null, (String) null, (String) null, -1, -1, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availableAmount;
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
    public final B2CExtCollectInfo component18() {
        return this.extCollectInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.unavailableAmount;
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
    public final List<PaymentMethod> component29() {
        return this.p2pPaymentMethodList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseAmount;
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
    public final List<PaymentMethod> component32() {
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
    public final String component35() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component36() {
        return this.receiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.searchUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component38() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannel component39() {
        return this.termContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.bestChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.tutorialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component42() {
        return this.useRealTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.checkoutAccountUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.h5Path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component48() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component49() {
        return this.supportCurrencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component50() {
        return this.supportedOrderTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component51() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component52() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Localization component53() {
        return this.localization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationHighlightStyle component54() {
        return this.localizationHighlightStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfo component55() {
        return this.limitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InformationBox component56() {
        return this.informationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BankingHours component57() {
        return this.bankingHours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControl component58() {
        return this.uiFlowControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.withdrawHoldCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.withdrawHoldDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimit component62() {
        return this.tradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component63() {
        return this.kycType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component64() {
        return this.isUsingInstitutionVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component65() {
        return this.supportCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component66() {
        return this.supportStablecoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencyInfo component67() {
        return this.supportCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption component68() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component69() {
        return this.needCreateAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.changeDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component70() {
        return this.supportedCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.acquirerBankCountryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component72() {
        return this.fixedPriceTolerance;
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
    public final ChannelNetworkModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i, boolean z2, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, @NotNull String str13, boolean z4, boolean z5, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z6, List<PaymentMethod> list, boolean z7, int i3, List<PaymentMethod> list2, List<String> list3, @NotNull String str20, @NotNull String str21, List<String> list4, @NotNull String str22, List<String> list5, TermContentChannel termContentChannel, Integer num, @NotNull String str23, boolean z8, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, List<String> list6, Integer num2, List<String> list7, boolean z9, boolean z10, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, @NotNull String str29, @NotNull String str30, @NotNull String str31, TradeLimit tradeLimit, Integer num3, boolean z11, @NotNull String str32, boolean z12, SupportCurrencyInfo supportCurrencyInfo, EarnOption earnOption, boolean z13, List<String> list8, String str33, @NotNull String str34) {
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
        Intrinsics.checkNotNullParameter(str34, "");
        return new ChannelNetworkModel(str, str2, str3, z, str4, i, z2, str5, str6, str7, i2, str8, str9, str10, str11, str12, z3, b2CExtCollectInfo, str13, z4, z5, str14, str15, str16, str17, str18, str19, z6, list, z7, i3, list2, list3, str20, str21, list4, str22, list5, termContentChannel, num, str23, z8, str24, str25, str26, str27, str28, list6, num2, list7, z9, z10, localization, localizationHighlightStyle, limitInfo, informationBox, bankingHours, uiFlowControl, str29, str30, str31, tradeLimit, num3, z11, str32, z12, supportCurrencyInfo, earnOption, z13, list8, str33, str34);
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
        if (!(obj instanceof ChannelNetworkModel)) {
            return false;
        }
        ChannelNetworkModel channelNetworkModel = (ChannelNetworkModel) obj;
        return Intrinsics.EZpvd((Object) this.availableAmount, (Object) channelNetworkModel.availableAmount) && Intrinsics.EZpvd((Object) this.unavailableAmount, (Object) channelNetworkModel.unavailableAmount) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) channelNetworkModel.baseAmount) && this.bestChannel == channelNetworkModel.bestChannel && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) channelNetworkModel.backgroundColor) && this.categoryCode == channelNetworkModel.categoryCode && this.changeDisplay == channelNetworkModel.changeDisplay && Intrinsics.EZpvd((Object) this.customerUrl, (Object) channelNetworkModel.customerUrl) && Intrinsics.EZpvd((Object) this.depositName, (Object) channelNetworkModel.depositName) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) channelNetworkModel.depositPlatformCode) && this.depositPlatformId == channelNetworkModel.depositPlatformId && Intrinsics.EZpvd((Object) this.description, (Object) channelNetworkModel.description) && Intrinsics.EZpvd((Object) this.displayIconUrl, (Object) channelNetworkModel.displayIconUrl) && Intrinsics.EZpvd((Object) this.displayIconUrlNight, (Object) channelNetworkModel.displayIconUrlNight) && Intrinsics.EZpvd((Object) this.displayName, (Object) channelNetworkModel.displayName) && Intrinsics.EZpvd((Object) this.displayText, (Object) channelNetworkModel.displayText) && this.exclusive == channelNetworkModel.exclusive && Intrinsics.EZpvd(this.extCollectInfo, channelNetworkModel.extCollectInfo) && Intrinsics.EZpvd((Object) this.feeRate, (Object) channelNetworkModel.feeRate) && this.isConvert == channelNetworkModel.isConvert && this.isRealTimePrice == channelNetworkModel.isRealTimePrice && Intrinsics.EZpvd((Object) this.maxLimitAmount, (Object) channelNetworkModel.maxLimitAmount) && Intrinsics.EZpvd((Object) this.maxPurchaseTime, (Object) channelNetworkModel.maxPurchaseTime) && Intrinsics.EZpvd((Object) this.maxWaitTimeForOrderStatusFetch, (Object) channelNetworkModel.maxWaitTimeForOrderStatusFetch) && Intrinsics.EZpvd((Object) this.minFee, (Object) channelNetworkModel.minFee) && Intrinsics.EZpvd((Object) this.minLimitAmount, (Object) channelNetworkModel.minLimitAmount) && Intrinsics.EZpvd((Object) this.minPurchaseTime, (Object) channelNetworkModel.minPurchaseTime) && this.needQuote == channelNetworkModel.needQuote && Intrinsics.EZpvd(this.p2pPaymentMethodList, channelNetworkModel.p2pPaymentMethodList) && this.payOnOk == channelNetworkModel.payOnOk && this.paymentMethodCategory == channelNetworkModel.paymentMethodCategory && Intrinsics.EZpvd(this.paymentMethods, channelNetworkModel.paymentMethods) && Intrinsics.EZpvd(this.preCheck, channelNetworkModel.preCheck) && Intrinsics.EZpvd((Object) this.price, (Object) channelNetworkModel.price) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) channelNetworkModel.quoteAmount) && Intrinsics.EZpvd(this.receiptAccount, channelNetworkModel.receiptAccount) && Intrinsics.EZpvd((Object) this.searchUrl, (Object) channelNetworkModel.searchUrl) && Intrinsics.EZpvd(this.tags, channelNetworkModel.tags) && Intrinsics.EZpvd(this.termContent, channelNetworkModel.termContent) && Intrinsics.EZpvd(this.timeUnit, channelNetworkModel.timeUnit) && Intrinsics.EZpvd((Object) this.tutorialUrl, (Object) channelNetworkModel.tutorialUrl) && this.useRealTimePrice == channelNetworkModel.useRealTimePrice && Intrinsics.EZpvd((Object) this.checkoutAccountUrl, (Object) channelNetworkModel.checkoutAccountUrl) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) channelNetworkModel.iconUrl) && Intrinsics.EZpvd((Object) this.iconUrlNight, (Object) channelNetworkModel.iconUrlNight) && Intrinsics.EZpvd((Object) this.h5Path, (Object) channelNetworkModel.h5Path) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) channelNetworkModel.faqUrl) && Intrinsics.EZpvd(this.supportedTransactionType, channelNetworkModel.supportedTransactionType) && Intrinsics.EZpvd(this.supportCurrencyScale, channelNetworkModel.supportCurrencyScale) && Intrinsics.EZpvd(this.supportedOrderTypes, channelNetworkModel.supportedOrderTypes) && this.depositToWithdraw == channelNetworkModel.depositToWithdraw && this.allowManualAddition == channelNetworkModel.allowManualAddition && Intrinsics.EZpvd(this.localization, channelNetworkModel.localization) && Intrinsics.EZpvd(this.localizationHighlightStyle, channelNetworkModel.localizationHighlightStyle) && Intrinsics.EZpvd(this.limitInfo, channelNetworkModel.limitInfo) && Intrinsics.EZpvd(this.informationBox, channelNetworkModel.informationBox) && Intrinsics.EZpvd(this.bankingHours, channelNetworkModel.bankingHours) && Intrinsics.EZpvd(this.uiFlowControl, channelNetworkModel.uiFlowControl) && Intrinsics.EZpvd((Object) this.target, (Object) channelNetworkModel.target) && Intrinsics.EZpvd((Object) this.withdrawHoldCryptoAmount, (Object) channelNetworkModel.withdrawHoldCryptoAmount) && Intrinsics.EZpvd((Object) this.withdrawHoldDays, (Object) channelNetworkModel.withdrawHoldDays) && Intrinsics.EZpvd(this.tradeLimit, channelNetworkModel.tradeLimit) && Intrinsics.EZpvd(this.kycType, channelNetworkModel.kycType) && this.isUsingInstitutionVerification == channelNetworkModel.isUsingInstitutionVerification && Intrinsics.EZpvd((Object) this.supportCurrency, (Object) channelNetworkModel.supportCurrency) && this.supportStablecoin == channelNetworkModel.supportStablecoin && Intrinsics.EZpvd(this.supportCurrencyInfo, channelNetworkModel.supportCurrencyInfo) && Intrinsics.EZpvd(this.earnOption, channelNetworkModel.earnOption) && this.needCreateAccount == channelNetworkModel.needCreateAccount && Intrinsics.EZpvd(this.supportedCountries, channelNetworkModel.supportedCountries) && Intrinsics.EZpvd((Object) this.acquirerBankCountryCode, (Object) channelNetworkModel.acquirerBankCountryCode) && Intrinsics.EZpvd((Object) this.fixedPriceTolerance, (Object) channelNetworkModel.fixedPriceTolerance);
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
    public final int getPaymentMethodCategory() {
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
    public final String getTutorialUrl() {
        return this.tutorialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControl getUiFlowControl() {
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
        int iHashCode = this.availableAmount.hashCode();
        int iHashCode2 = this.unavailableAmount.hashCode();
        int iHashCode3 = this.baseAmount.hashCode();
        int iHashCode4 = Boolean.hashCode(this.bestChannel);
        int iHashCode5 = this.backgroundColor.hashCode();
        int iHashCode6 = Integer.hashCode(this.categoryCode);
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
        B2CExtCollectInfo b2CExtCollectInfo = this.extCollectInfo;
        int iHashCode18 = b2CExtCollectInfo == null ? 0 : b2CExtCollectInfo.hashCode();
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
        List<PaymentMethod> list = this.p2pPaymentMethodList;
        int iHashCode29 = list == null ? 0 : list.hashCode();
        int iHashCode30 = Boolean.hashCode(this.payOnOk);
        int iHashCode31 = Integer.hashCode(this.paymentMethodCategory);
        List<PaymentMethod> list2 = this.paymentMethods;
        int iHashCode32 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.preCheck;
        int iHashCode33 = list3 == null ? 0 : list3.hashCode();
        int iHashCode34 = this.price.hashCode();
        int iHashCode35 = this.quoteAmount.hashCode();
        List<String> list4 = this.receiptAccount;
        int iHashCode36 = list4 == null ? 0 : list4.hashCode();
        int iHashCode37 = this.searchUrl.hashCode();
        List<String> list5 = this.tags;
        int iHashCode38 = list5 == null ? 0 : list5.hashCode();
        TermContentChannel termContentChannel = this.termContent;
        int iHashCode39 = termContentChannel == null ? 0 : termContentChannel.hashCode();
        Integer num = this.timeUnit;
        int iHashCode40 = num == null ? 0 : num.hashCode();
        int iHashCode41 = this.tutorialUrl.hashCode();
        int iHashCode42 = Boolean.hashCode(this.useRealTimePrice);
        int iHashCode43 = this.checkoutAccountUrl.hashCode();
        int iHashCode44 = this.iconUrl.hashCode();
        int iHashCode45 = this.iconUrlNight.hashCode();
        int iHashCode46 = this.h5Path.hashCode();
        int iHashCode47 = this.faqUrl.hashCode();
        List<String> list6 = this.supportedTransactionType;
        int iHashCode48 = list6 == null ? 0 : list6.hashCode();
        Integer num2 = this.supportCurrencyScale;
        int iHashCode49 = num2 == null ? 0 : num2.hashCode();
        List<String> list7 = this.supportedOrderTypes;
        int iHashCode50 = list7 == null ? 0 : list7.hashCode();
        int iHashCode51 = Boolean.hashCode(this.depositToWithdraw);
        int iHashCode52 = Boolean.hashCode(this.allowManualAddition);
        Localization localization = this.localization;
        int iHashCode53 = localization == null ? 0 : localization.hashCode();
        LocalizationHighlightStyle localizationHighlightStyle = this.localizationHighlightStyle;
        int iHashCode54 = localizationHighlightStyle == null ? 0 : localizationHighlightStyle.hashCode();
        LimitInfo limitInfo = this.limitInfo;
        int iHashCode55 = limitInfo == null ? 0 : limitInfo.hashCode();
        InformationBox informationBox = this.informationBox;
        int iHashCode56 = informationBox == null ? 0 : informationBox.hashCode();
        BankingHours bankingHours = this.bankingHours;
        int iHashCode57 = bankingHours == null ? 0 : bankingHours.hashCode();
        UiFlowControl uiFlowControl = this.uiFlowControl;
        int iHashCode58 = uiFlowControl == null ? 0 : uiFlowControl.hashCode();
        int iHashCode59 = this.target.hashCode();
        int iHashCode60 = this.withdrawHoldCryptoAmount.hashCode();
        int iHashCode61 = this.withdrawHoldDays.hashCode();
        TradeLimit tradeLimit = this.tradeLimit;
        int iHashCode62 = tradeLimit == null ? 0 : tradeLimit.hashCode();
        Integer num3 = this.kycType;
        int iHashCode63 = num3 == null ? 0 : num3.hashCode();
        int iHashCode64 = Boolean.hashCode(this.isUsingInstitutionVerification);
        int iHashCode65 = this.supportCurrency.hashCode();
        int iHashCode66 = Boolean.hashCode(this.supportStablecoin);
        SupportCurrencyInfo supportCurrencyInfo = this.supportCurrencyInfo;
        int iHashCode67 = supportCurrencyInfo == null ? 0 : supportCurrencyInfo.hashCode();
        EarnOption earnOption = this.earnOption;
        int iHashCode68 = earnOption == null ? 0 : earnOption.hashCode();
        int iHashCode69 = Boolean.hashCode(this.needCreateAccount);
        List<String> list8 = this.supportedCountries;
        int iHashCode70 = list8 == null ? 0 : list8.hashCode();
        String str = this.acquirerBankCountryCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.fixedPriceTolerance.hashCode();
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
    public final void setPaymentMethods(List<PaymentMethod> list) {
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
        return "ChannelNetworkModel(availableAmount=" + this.availableAmount + ", unavailableAmount=" + this.unavailableAmount + ", baseAmount=" + this.baseAmount + ", bestChannel=" + this.bestChannel + ", backgroundColor=" + this.backgroundColor + ", categoryCode=" + this.categoryCode + ", changeDisplay=" + this.changeDisplay + ", customerUrl=" + this.customerUrl + ", depositName=" + this.depositName + ", depositPlatformCode=" + this.depositPlatformCode + ", depositPlatformId=" + this.depositPlatformId + ", description=" + this.description + ", displayIconUrl=" + this.displayIconUrl + ", displayIconUrlNight=" + this.displayIconUrlNight + ", displayName=" + this.displayName + ", displayText=" + this.displayText + ", exclusive=" + this.exclusive + ", extCollectInfo=" + this.extCollectInfo + ", feeRate=" + this.feeRate + ", isConvert=" + this.isConvert + ", isRealTimePrice=" + this.isRealTimePrice + ", maxLimitAmount=" + this.maxLimitAmount + ", maxPurchaseTime=" + this.maxPurchaseTime + ", maxWaitTimeForOrderStatusFetch=" + this.maxWaitTimeForOrderStatusFetch + ", minFee=" + this.minFee + ", minLimitAmount=" + this.minLimitAmount + ", minPurchaseTime=" + this.minPurchaseTime + ", needQuote=" + this.needQuote + ", p2pPaymentMethodList=" + this.p2pPaymentMethodList + ", payOnOk=" + this.payOnOk + ", paymentMethodCategory=" + this.paymentMethodCategory + ", paymentMethods=" + this.paymentMethods + ", preCheck=" + this.preCheck + ", price=" + this.price + ", quoteAmount=" + this.quoteAmount + ", receiptAccount=" + this.receiptAccount + ", searchUrl=" + this.searchUrl + ", tags=" + this.tags + ", termContent=" + this.termContent + ", timeUnit=" + this.timeUnit + ", tutorialUrl=" + this.tutorialUrl + ", useRealTimePrice=" + this.useRealTimePrice + ", checkoutAccountUrl=" + this.checkoutAccountUrl + ", iconUrl=" + this.iconUrl + ", iconUrlNight=" + this.iconUrlNight + ", h5Path=" + this.h5Path + ", faqUrl=" + this.faqUrl + ", supportedTransactionType=" + this.supportedTransactionType + ", supportCurrencyScale=" + this.supportCurrencyScale + ", supportedOrderTypes=" + this.supportedOrderTypes + ", depositToWithdraw=" + this.depositToWithdraw + ", allowManualAddition=" + this.allowManualAddition + ", localization=" + this.localization + ", localizationHighlightStyle=" + this.localizationHighlightStyle + ", limitInfo=" + this.limitInfo + ", informationBox=" + this.informationBox + ", bankingHours=" + this.bankingHours + ", uiFlowControl=" + this.uiFlowControl + ", target=" + this.target + ", withdrawHoldCryptoAmount=" + this.withdrawHoldCryptoAmount + ", withdrawHoldDays=" + this.withdrawHoldDays + ", tradeLimit=" + this.tradeLimit + ", kycType=" + this.kycType + ", isUsingInstitutionVerification=" + this.isUsingInstitutionVerification + ", supportCurrency=" + this.supportCurrency + ", supportStablecoin=" + this.supportStablecoin + ", supportCurrencyInfo=" + this.supportCurrencyInfo + ", earnOption=" + this.earnOption + ", needCreateAccount=" + this.needCreateAccount + ", supportedCountries=" + this.supportedCountries + ", acquirerBankCountryCode=" + this.acquirerBankCountryCode + ", fixedPriceTolerance=" + this.fixedPriceTolerance + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
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
        parcel.writeInt(this.paymentMethodCategory);
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
        parcel.writeString(this.quoteAmount);
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
        parcel.writeString(this.target);
        parcel.writeString(this.withdrawHoldCryptoAmount);
        parcel.writeString(this.withdrawHoldDays);
        TradeLimit tradeLimit = this.tradeLimit;
        if (tradeLimit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeLimit.writeToParcel(parcel, i);
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
        parcel.writeInt(this.supportStablecoin ? 1 : 0);
        SupportCurrencyInfo supportCurrencyInfo = this.supportCurrencyInfo;
        if (supportCurrencyInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            supportCurrencyInfo.writeToParcel(parcel, i);
        }
        EarnOption earnOption = this.earnOption;
        if (earnOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOption.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.needCreateAccount ? 1 : 0);
        parcel.writeStringList(this.supportedCountries);
        parcel.writeString(this.acquirerBankCountryCode);
        parcel.writeString(this.fixedPriceTolerance);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.ChannelNetworkModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelNetworkModel> serializer() {
            return ChannelNetworkModel$$serializer.INSTANCE;
        }
    }

    static {
        PaymentMethod$$serializer paymentMethod$$serializer = PaymentMethod$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(paymentMethod$$serializer), null, null, new ArrayListSerializer(paymentMethod$$serializer), new ArrayListSerializer(stringSerializer), null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ ChannelNetworkModel(int i, int i2, int i3, String str, String str2, String str3, boolean z, String str4, int i4, boolean z2, String str5, String str6, String str7, int i5, String str8, String str9, String str10, String str11, String str12, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, String str13, boolean z4, boolean z5, String str14, String str15, String str16, String str17, String str18, String str19, boolean z6, List list, boolean z7, int i6, List list2, List list3, String str20, String str21, List list4, String str22, List list5, TermContentChannel termContentChannel, Integer num, String str23, boolean z8, String str24, String str25, String str26, String str27, String str28, List list6, Integer num2, List list7, boolean z9, boolean z10, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, String str29, String str30, String str31, TradeLimit tradeLimit, Integer num3, boolean z11, String str32, boolean z12, SupportCurrencyInfo supportCurrencyInfo, EarnOption earnOption, boolean z13, List list8, String str33, String str34, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availableAmount = "";
        } else {
            this.availableAmount = str;
        }
        if ((i & 2) == 0) {
            this.unavailableAmount = "";
        } else {
            this.unavailableAmount = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str3;
        }
        if ((i & 8) == 0) {
            this.bestChannel = false;
        } else {
            this.bestChannel = z;
        }
        if ((i & 16) == 0) {
            this.backgroundColor = "";
        } else {
            this.backgroundColor = str4;
        }
        this.categoryCode = (i & 32) == 0 ? 3 : i4;
        if ((i & 64) == 0) {
            this.changeDisplay = false;
        } else {
            this.changeDisplay = z2;
        }
        if ((i & 128) == 0) {
            this.customerUrl = "";
        } else {
            this.customerUrl = str5;
        }
        if ((i & 256) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str6;
        }
        if ((i & 512) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str7;
        }
        this.depositPlatformId = (i & 1024) == 0 ? -1 : i5;
        if ((i & 2048) == 0) {
            this.description = "";
        } else {
            this.description = str8;
        }
        if ((i & 4096) == 0) {
            this.displayIconUrl = "";
        } else {
            this.displayIconUrl = str9;
        }
        if ((i & 8192) == 0) {
            this.displayIconUrlNight = "";
        } else {
            this.displayIconUrlNight = str10;
        }
        if ((i & 16384) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str11;
        }
        if ((i & 32768) == 0) {
            this.displayText = "";
        } else {
            this.displayText = str12;
        }
        if ((i & 65536) == 0) {
            this.exclusive = false;
        } else {
            this.exclusive = z3;
        }
        if ((i & 131072) == 0) {
            this.extCollectInfo = null;
        } else {
            this.extCollectInfo = b2CExtCollectInfo;
        }
        if ((262144 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str13;
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
            this.maxLimitAmount = str14;
        }
        if ((4194304 & i) == 0) {
            this.maxPurchaseTime = "0";
        } else {
            this.maxPurchaseTime = str15;
        }
        this.maxWaitTimeForOrderStatusFetch = (8388608 & i) == 0 ? "15" : str16;
        if ((16777216 & i) == 0) {
            this.minFee = "";
        } else {
            this.minFee = str17;
        }
        if ((33554432 & i) == 0) {
            this.minLimitAmount = "0";
        } else {
            this.minLimitAmount = str18;
        }
        if ((67108864 & i) == 0) {
            this.minPurchaseTime = "0";
        } else {
            this.minPurchaseTime = str19;
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
            this.paymentMethodCategory = i6;
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
            this.price = str20;
        }
        if ((i2 & 4) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str21;
        }
        if ((i2 & 8) == 0) {
            this.receiptAccount = null;
        } else {
            this.receiptAccount = list4;
        }
        if ((i2 & 16) == 0) {
            this.searchUrl = "";
        } else {
            this.searchUrl = str22;
        }
        if ((i2 & 32) == 0) {
            this.tags = null;
        } else {
            this.tags = list5;
        }
        if ((i2 & 64) == 0) {
            this.termContent = null;
        } else {
            this.termContent = termContentChannel;
        }
        if ((i2 & 128) == 0) {
            this.timeUnit = null;
        } else {
            this.timeUnit = num;
        }
        if ((i2 & 256) == 0) {
            this.tutorialUrl = "";
        } else {
            this.tutorialUrl = str23;
        }
        if ((i2 & 512) == 0) {
            this.useRealTimePrice = false;
        } else {
            this.useRealTimePrice = z8;
        }
        if ((i2 & 1024) == 0) {
            this.checkoutAccountUrl = "";
        } else {
            this.checkoutAccountUrl = str24;
        }
        if ((i2 & 2048) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str25;
        }
        if ((i2 & 4096) == 0) {
            this.iconUrlNight = "";
        } else {
            this.iconUrlNight = str26;
        }
        if ((i2 & 8192) == 0) {
            this.h5Path = "";
        } else {
            this.h5Path = str27;
        }
        if ((i2 & 16384) == 0) {
            this.faqUrl = "";
        } else {
            this.faqUrl = str28;
        }
        if ((i2 & 32768) == 0) {
            this.supportedTransactionType = null;
        } else {
            this.supportedTransactionType = list6;
        }
        if ((i2 & 65536) == 0) {
            this.supportCurrencyScale = null;
        } else {
            this.supportCurrencyScale = num2;
        }
        if ((i2 & 131072) == 0) {
            this.supportedOrderTypes = null;
        } else {
            this.supportedOrderTypes = list7;
        }
        if ((262144 & i2) == 0) {
            this.depositToWithdraw = false;
        } else {
            this.depositToWithdraw = z9;
        }
        if ((524288 & i2) == 0) {
            this.allowManualAddition = false;
        } else {
            this.allowManualAddition = z10;
        }
        if ((1048576 & i2) == 0) {
            this.localization = null;
        } else {
            this.localization = localization;
        }
        if ((2097152 & i2) == 0) {
            this.localizationHighlightStyle = null;
        } else {
            this.localizationHighlightStyle = localizationHighlightStyle;
        }
        if ((4194304 & i2) == 0) {
            this.limitInfo = null;
        } else {
            this.limitInfo = limitInfo;
        }
        if ((8388608 & i2) == 0) {
            this.informationBox = null;
        } else {
            this.informationBox = informationBox;
        }
        if ((16777216 & i2) == 0) {
            this.bankingHours = null;
        } else {
            this.bankingHours = bankingHours;
        }
        if ((33554432 & i2) == 0) {
            this.uiFlowControl = null;
        } else {
            this.uiFlowControl = uiFlowControl;
        }
        if ((67108864 & i2) == 0) {
            this.target = "";
        } else {
            this.target = str29;
        }
        if ((134217728 & i2) == 0) {
            this.withdrawHoldCryptoAmount = "";
        } else {
            this.withdrawHoldCryptoAmount = str30;
        }
        if ((268435456 & i2) == 0) {
            this.withdrawHoldDays = "";
        } else {
            this.withdrawHoldDays = str31;
        }
        this.tradeLimit = (536870912 & i2) == 0 ? new TradeLimit((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimit;
        if ((1073741824 & i2) == 0) {
            this.kycType = null;
        } else {
            this.kycType = num3;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.isUsingInstitutionVerification = false;
        } else {
            this.isUsingInstitutionVerification = z11;
        }
        if ((i3 & 1) == 0) {
            this.supportCurrency = "";
        } else {
            this.supportCurrency = str32;
        }
        if ((i3 & 2) == 0) {
            this.supportStablecoin = false;
        } else {
            this.supportStablecoin = z12;
        }
        this.supportCurrencyInfo = (i3 & 4) == 0 ? new SupportCurrencyInfo((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null) : supportCurrencyInfo;
        if ((i3 & 8) == 0) {
            this.earnOption = null;
        } else {
            this.earnOption = earnOption;
        }
        if ((i3 & 16) == 0) {
            this.needCreateAccount = false;
        } else {
            this.needCreateAccount = z13;
        }
        if ((i3 & 32) == 0) {
            this.supportedCountries = null;
        } else {
            this.supportedCountries = list8;
        }
        if ((i3 & 64) == 0) {
            this.acquirerBankCountryCode = null;
        } else {
            this.acquirerBankCountryCode = str33;
        }
        if ((i3 & 128) == 0) {
            this.fixedPriceTolerance = "";
        } else {
            this.fixedPriceTolerance = str34;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(ChannelNetworkModel channelNetworkModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) channelNetworkModel.availableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, channelNetworkModel.availableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) channelNetworkModel.unavailableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, channelNetworkModel.unavailableAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) channelNetworkModel.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, channelNetworkModel.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || channelNetworkModel.bestChannel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, channelNetworkModel.bestChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) channelNetworkModel.backgroundColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, channelNetworkModel.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || channelNetworkModel.categoryCode != 3) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, channelNetworkModel.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || channelNetworkModel.changeDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, channelNetworkModel.changeDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) channelNetworkModel.customerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, channelNetworkModel.customerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) channelNetworkModel.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, channelNetworkModel.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) channelNetworkModel.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, channelNetworkModel.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || channelNetworkModel.depositPlatformId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, channelNetworkModel.depositPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) channelNetworkModel.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, channelNetworkModel.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) channelNetworkModel.displayIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, channelNetworkModel.displayIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) channelNetworkModel.displayIconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, channelNetworkModel.displayIconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) channelNetworkModel.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, channelNetworkModel.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) channelNetworkModel.displayText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, channelNetworkModel.displayText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || channelNetworkModel.exclusive) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, channelNetworkModel.exclusive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || channelNetworkModel.extCollectInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, B2CExtCollectInfo$$serializer.INSTANCE, channelNetworkModel.extCollectInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) channelNetworkModel.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, channelNetworkModel.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || channelNetworkModel.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, channelNetworkModel.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || channelNetworkModel.isRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, channelNetworkModel.isRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) channelNetworkModel.maxLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, channelNetworkModel.maxLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) channelNetworkModel.maxPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, channelNetworkModel.maxPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) channelNetworkModel.maxWaitTimeForOrderStatusFetch, (Object) "15")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, channelNetworkModel.maxWaitTimeForOrderStatusFetch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) channelNetworkModel.minFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, channelNetworkModel.minFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) channelNetworkModel.minLimitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, channelNetworkModel.minLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) channelNetworkModel.minPurchaseTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, channelNetworkModel.minPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || channelNetworkModel.needQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, channelNetworkModel.needQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || channelNetworkModel.p2pPaymentMethodList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], channelNetworkModel.p2pPaymentMethodList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || channelNetworkModel.payOnOk) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, channelNetworkModel.payOnOk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || channelNetworkModel.paymentMethodCategory != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 30, channelNetworkModel.paymentMethodCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || channelNetworkModel.paymentMethods != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], channelNetworkModel.paymentMethods);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || channelNetworkModel.preCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, kSerializerArr[32], channelNetworkModel.preCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) channelNetworkModel.price, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, channelNetworkModel.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) channelNetworkModel.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, channelNetworkModel.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || channelNetworkModel.receiptAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], channelNetworkModel.receiptAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) channelNetworkModel.searchUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, channelNetworkModel.searchUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || channelNetworkModel.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, kSerializerArr[37], channelNetworkModel.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || channelNetworkModel.termContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, TermContentChannel$$serializer.INSTANCE, channelNetworkModel.termContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || channelNetworkModel.timeUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, IntSerializer.INSTANCE, channelNetworkModel.timeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) channelNetworkModel.tutorialUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, channelNetworkModel.tutorialUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || channelNetworkModel.useRealTimePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 41, channelNetworkModel.useRealTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) channelNetworkModel.checkoutAccountUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, channelNetworkModel.checkoutAccountUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) channelNetworkModel.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, channelNetworkModel.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) channelNetworkModel.iconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, channelNetworkModel.iconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) channelNetworkModel.h5Path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, channelNetworkModel.h5Path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) channelNetworkModel.faqUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, channelNetworkModel.faqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || channelNetworkModel.supportedTransactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, kSerializerArr[47], channelNetworkModel.supportedTransactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || channelNetworkModel.supportCurrencyScale != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, IntSerializer.INSTANCE, channelNetworkModel.supportCurrencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || channelNetworkModel.supportedOrderTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, kSerializerArr[49], channelNetworkModel.supportedOrderTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || channelNetworkModel.depositToWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 50, channelNetworkModel.depositToWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || channelNetworkModel.allowManualAddition) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 51, channelNetworkModel.allowManualAddition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || channelNetworkModel.localization != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, Localization$$serializer.INSTANCE, channelNetworkModel.localization);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || channelNetworkModel.localizationHighlightStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, LocalizationHighlightStyle$$serializer.INSTANCE, channelNetworkModel.localizationHighlightStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || channelNetworkModel.limitInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, LimitInfo$$serializer.INSTANCE, channelNetworkModel.limitInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || channelNetworkModel.informationBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, InformationBox$$serializer.INSTANCE, channelNetworkModel.informationBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || channelNetworkModel.bankingHours != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, BankingHours$$serializer.INSTANCE, channelNetworkModel.bankingHours);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || channelNetworkModel.uiFlowControl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, UiFlowControl$$serializer.INSTANCE, channelNetworkModel.uiFlowControl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) channelNetworkModel.target, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, channelNetworkModel.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) channelNetworkModel.withdrawHoldCryptoAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, channelNetworkModel.withdrawHoldCryptoAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) channelNetworkModel.withdrawHoldDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, channelNetworkModel.withdrawHoldDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd(channelNetworkModel.tradeLimit, new TradeLimit((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 61, TradeLimit$$serializer.INSTANCE, channelNetworkModel.tradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || channelNetworkModel.kycType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, IntSerializer.INSTANCE, channelNetworkModel.kycType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || channelNetworkModel.isUsingInstitutionVerification) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 63, channelNetworkModel.isUsingInstitutionVerification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || !Intrinsics.EZpvd((Object) channelNetworkModel.supportCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 64, channelNetworkModel.supportCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || channelNetworkModel.supportStablecoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 65, channelNetworkModel.supportStablecoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd(channelNetworkModel.supportCurrencyInfo, new SupportCurrencyInfo((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 66, SupportCurrencyInfo$$serializer.INSTANCE, channelNetworkModel.supportCurrencyInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || channelNetworkModel.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 67, EarnOption$$serializer.INSTANCE, channelNetworkModel.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || channelNetworkModel.needCreateAccount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 68, channelNetworkModel.needCreateAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || channelNetworkModel.supportedCountries != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 69, kSerializerArr[69], channelNetworkModel.supportedCountries);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || channelNetworkModel.acquirerBankCountryCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, StringSerializer.INSTANCE, channelNetworkModel.acquirerBankCountryCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) && Intrinsics.EZpvd((Object) channelNetworkModel.fixedPriceTolerance, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 71, channelNetworkModel.fixedPriceTolerance);
    }

    public ChannelNetworkModel(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i, boolean z2, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, @NotNull String str13, boolean z4, boolean z5, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z6, List<PaymentMethod> list, boolean z7, int i3, List<PaymentMethod> list2, List<String> list3, @NotNull String str20, @NotNull String str21, List<String> list4, @NotNull String str22, List<String> list5, TermContentChannel termContentChannel, Integer num, @NotNull String str23, boolean z8, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, List<String> list6, Integer num2, List<String> list7, boolean z9, boolean z10, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, @NotNull String str29, @NotNull String str30, @NotNull String str31, TradeLimit tradeLimit, Integer num3, boolean z11, @NotNull String str32, boolean z12, SupportCurrencyInfo supportCurrencyInfo, EarnOption earnOption, boolean z13, List<String> list8, String str33, @NotNull String str34) {
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
        Intrinsics.checkNotNullParameter(str34, "");
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
        this.extCollectInfo = b2CExtCollectInfo;
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
        this.termContent = termContentChannel;
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
        this.localization = localization;
        this.localizationHighlightStyle = localizationHighlightStyle;
        this.limitInfo = limitInfo;
        this.informationBox = informationBox;
        this.bankingHours = bankingHours;
        this.uiFlowControl = uiFlowControl;
        this.target = str29;
        this.withdrawHoldCryptoAmount = str30;
        this.withdrawHoldDays = str31;
        this.tradeLimit = tradeLimit;
        this.kycType = num3;
        this.isUsingInstitutionVerification = z11;
        this.supportCurrency = str32;
        this.supportStablecoin = z12;
        this.supportCurrencyInfo = supportCurrencyInfo;
        this.earnOption = earnOption;
        this.needCreateAccount = z13;
        this.supportedCountries = list8;
        this.acquirerBankCountryCode = str33;
        this.fixedPriceTolerance = str34;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x03af: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r148v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r148v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r148v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r148v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r79v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r148v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0030: ARITH (r148v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r81v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r148v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r82v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r148v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r148v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r148v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r148v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r86v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r148v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:0x0073: TERNARY null = ((wrap:int:0x006a: ARITH (r148v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:0x007e: TERNARY null = ((wrap:int:0x0075: ARITH (r148v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0080: ARITH (r148v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r148v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0097: ARITH (r148v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r92v0 boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r148v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo) : (r93v0 com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r148v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r148v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r95v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r148v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r96v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r148v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("0") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r148v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("0") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r148v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("15") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r148v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r148v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("0") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r148v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("0") : (r102v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0114: ARITH (r148v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? false : (r103v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x011f: ARITH (r148v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r104v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x012a: ARITH (r148v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? false : (r105v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0135: ARITH (r148v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r106v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0140: ARITH (r148v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r107v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0149: ARITH (r149v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r108v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r149v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r109v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0159: ARITH (r149v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0162: ARITH (r149v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r111v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016b: ARITH (r149v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0174: ARITH (r149v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r113v0 java.util.List))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel:?: TERNARY null = ((wrap:int:0x017d: ARITH (r149v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel) : (r114v0 com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel))
  (wrap:java.lang.Integer:0x0191: TERNARY null = ((wrap:int:0x0188: ARITH (r149v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r115v0 java.lang.Integer))
  (wrap:java.lang.String:0x019c: TERNARY null = ((wrap:int:0x0193: ARITH (r149v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:boolean:0x01a6: TERNARY null = ((wrap:int:0x019e: ARITH (r149v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r117v0 boolean))
  (wrap:java.lang.String:0x01b1: TERNARY null = ((wrap:int:0x01a8: ARITH (r149v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:0x01bc: TERNARY null = ((wrap:int:0x01b3: ARITH (r149v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:0x01c7: TERNARY null = ((wrap:int:0x01be: ARITH (r149v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r120v0 java.lang.String))
  (wrap:java.lang.String:0x01d2: TERNARY null = ((wrap:int:0x01c9: ARITH (r149v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d4: ARITH (r149v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r122v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01dd: ARITH (r149v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r123v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x01e6: ARITH (r149v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r124v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01ef: ARITH (r149v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r125v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01fa: ARITH (r149v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r126v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0205: ARITH (r149v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r127v0 boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Localization:?: TERNARY null = ((wrap:int:0x0210: ARITH (r149v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Localization) : (r128v0 com.okinc.okpaymentapi.data.remote.model.management.Localization))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle:?: TERNARY null = ((wrap:int:0x021b: ARITH (r149v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle) : (r129v0 com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.LimitInfo:?: TERNARY null = ((wrap:int:0x0226: ARITH (r149v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.LimitInfo) : (r130v0 com.okinc.okpaymentapi.data.remote.model.management.LimitInfo))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.InformationBox:?: TERNARY null = ((wrap:int:0x0231: ARITH (r149v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.InformationBox) : (r131v0 com.okinc.okpaymentapi.data.remote.model.management.InformationBox))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.BankingHours:?: TERNARY null = ((wrap:int:0x023c: ARITH (r149v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.BankingHours) : (r132v0 com.okinc.okpaymentapi.data.remote.model.management.BankingHours))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl:?: TERNARY null = ((wrap:int:0x0247: ARITH (r149v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl) : (r133v0 com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0252: ARITH (r149v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r134v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x025d: ARITH (r149v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r135v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0268: ARITH (r149v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r136v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeLimit:?: TERNARY null = ((wrap:int:0x0273: ARITH (r149v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x029b: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:226) call: com.okinc.okpaymentapi.data.remote.model.management.TradeLimit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r137v0 com.okinc.okpaymentapi.data.remote.model.management.TradeLimit))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x02a3: ARITH (r149v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r138v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x02ae: ARITH (r149v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r139v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x02b6: ARITH (r150v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r140v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x02bf: ARITH (r150v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r141v0 boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo:?: TERNARY null = ((wrap:int:0x02c8: ARITH (r150v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x02ec: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  false
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:231) call: com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r142v0 com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.EarnOption:?: TERNARY null = ((wrap:int:0x02f2: ARITH (r150v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.EarnOption) : (r143v0 com.okinc.okpaymentapi.data.remote.model.management.EarnOption))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x02fb: ARITH (r150v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r144v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0304: ARITH (r150v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r145v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x030d: ARITH (r150v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r146v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0314: ARITH (r150v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r147v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod>, boolean, int, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Integer, java.util.List<java.lang.String>, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.management.Localization, com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle, com.okinc.okpaymentapi.data.remote.model.management.LimitInfo, com.okinc.okpaymentapi.data.remote.model.management.InformationBox, com.okinc.okpaymentapi.data.remote.model.management.BankingHours, com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeLimit, java.lang.Integer, boolean, java.lang.String, boolean, com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, boolean, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:164) call: com.okinc.okpaymentapi.data.remote.model.management.ChannelNetworkModel.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, boolean, int, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.util.List, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.management.Localization, com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle, com.okinc.okpaymentapi.data.remote.model.management.LimitInfo, com.okinc.okpaymentapi.data.remote.model.management.InformationBox, com.okinc.okpaymentapi.data.remote.model.management.BankingHours, com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeLimit, java.lang.Integer, boolean, java.lang.String, boolean, com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, boolean, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChannelNetworkModel(String str, String str2, String str3, boolean z, String str4, int i, boolean z2, String str5, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, boolean z3, B2CExtCollectInfo b2CExtCollectInfo, String str13, boolean z4, boolean z5, String str14, String str15, String str16, String str17, String str18, String str19, boolean z6, List list, boolean z7, int i3, List list2, List list3, String str20, String str21, List list4, String str22, List list5, TermContentChannel termContentChannel, Integer num, String str23, boolean z8, String str24, String str25, String str26, String str27, String str28, List list6, Integer num2, List list7, boolean z9, boolean z10, Localization localization, LocalizationHighlightStyle localizationHighlightStyle, LimitInfo limitInfo, InformationBox informationBox, BankingHours bankingHours, UiFlowControl uiFlowControl, String str29, String str30, String str31, TradeLimit tradeLimit, Integer num3, boolean z11, String str32, boolean z12, SupportCurrencyInfo supportCurrencyInfo, EarnOption earnOption, boolean z13, List list8, String str33, String str34, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 3 : i, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? -1 : i2, (i4 & 2048) != 0 ? "" : str8, (i4 & 4096) != 0 ? "" : str9, (i4 & 8192) != 0 ? "" : str10, (i4 & 16384) != 0 ? "" : str11, (i4 & 32768) != 0 ? "" : str12, (i4 & 65536) != 0 ? false : z3, (i4 & 131072) != 0 ? null : b2CExtCollectInfo, (i4 & 262144) != 0 ? "" : str13, (i4 & 524288) != 0 ? false : z4, (i4 & 1048576) != 0 ? false : z5, (i4 & 2097152) != 0 ? "0" : str14, (i4 & 4194304) != 0 ? "0" : str15, (i4 & 8388608) != 0 ? "15" : str16, (i4 & 16777216) != 0 ? "" : str17, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "0" : str18, (i4 & 67108864) != 0 ? "0" : str19, (i4 & 134217728) != 0 ? false : z6, (i4 & 268435456) != 0 ? null : list, (i4 & 536870912) != 0 ? false : z7, (i4 & 1073741824) != 0 ? 0 : i3, (i4 & Integer.MIN_VALUE) != 0 ? null : list2, (i5 & 1) != 0 ? null : list3, (i5 & 2) == 0 ? str20 : "0", (i5 & 4) != 0 ? "" : str21, (i5 & 8) != 0 ? null : list4, (i5 & 16) != 0 ? "" : str22, (i5 & 32) != 0 ? null : list5, (i5 & 64) != 0 ? null : termContentChannel, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? "" : str23, (i5 & 512) != 0 ? false : z8, (i5 & 1024) != 0 ? "" : str24, (i5 & 2048) != 0 ? "" : str25, (i5 & 4096) != 0 ? "" : str26, (i5 & 8192) != 0 ? "" : str27, (i5 & 16384) != 0 ? "" : str28, (i5 & 32768) != 0 ? null : list6, (i5 & 65536) != 0 ? null : num2, (i5 & 131072) != 0 ? null : list7, (i5 & 262144) != 0 ? false : z9, (i5 & 524288) != 0 ? false : z10, (i5 & 1048576) != 0 ? null : localization, (i5 & 2097152) != 0 ? null : localizationHighlightStyle, (i5 & 4194304) != 0 ? null : limitInfo, (i5 & 8388608) != 0 ? null : informationBox, (i5 & 16777216) != 0 ? null : bankingHours, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : uiFlowControl, (i5 & 67108864) != 0 ? "" : str29, (i5 & 134217728) != 0 ? "" : str30, (i5 & 268435456) != 0 ? "" : str31, (i5 & 536870912) != 0 ? new TradeLimit((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : tradeLimit, (i5 & 1073741824) != 0 ? null : num3, (i5 & Integer.MIN_VALUE) != 0 ? false : z11, (i6 & 1) != 0 ? "" : str32, (i6 & 2) != 0 ? false : z12, (i6 & 4) != 0 ? new SupportCurrencyInfo((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null) : supportCurrencyInfo, (i6 & 8) != 0 ? null : earnOption, (i6 & 16) != 0 ? false : z13, (i6 & 32) != 0 ? null : list8, (i6 & 64) == 0 ? str33 : null, (i6 & 128) != 0 ? "" : str34);
    }
}
