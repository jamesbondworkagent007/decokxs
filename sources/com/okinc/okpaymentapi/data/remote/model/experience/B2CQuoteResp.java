package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class B2CQuoteResp implements Parcelable {
    private int activityQuoteTime;
    private ArrayList<B2CBankBean> bankList;
    private String baseAmount;
    private String baseColorfulIconUrl;
    private String baseCurrencySymbol;
    private String cardPaymentPrice;
    private String channelFee;
    private String codeType;
    private String convertBaseColorfulIconUrl;
    private B2CSwapBean convertDetail;
    private String exchangeAmount;
    private String exchangeRate;
    private String fee;
    private String feeRate;
    private FeeTierInfo feeTierInfo;
    private FundingToTradingBean fundingToTrading;
    private FxRateConversionBean fxRateConversion;
    private boolean isConvert;
    private String msgCode;
    private boolean needQuote;
    private String netQuoteAmount;
    private String originChannelFee;
    private String price;
    private String priceType;
    private String quoteAmount;
    private String quoteCurrencySymbol;
    private String quoteId;
    private String quoteToken;
    private boolean showExchangeRatePrice;
    private String spread;
    private String systemLogo;
    private String tradePwd;
    private String tradeType;
    private String usdAmount;
    private boolean zeroFeeOfCardPayment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<B2CQuoteResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(B2CBankBean$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<B2CQuoteResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CQuoteResp createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            B2CSwapBean b2CSwapBeanCreateFromParcel = parcel.readInt() == 0 ? null : B2CSwapBean.CREATOR.createFromParcel(parcel);
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            FxRateConversionBean fxRateConversionBeanCreateFromParcel = parcel.readInt() == 0 ? null : FxRateConversionBean.CREATOR.createFromParcel(parcel);
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            int i = parcel.readInt();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string12;
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                str = string12;
                int i3 = 0;
                while (i3 != i2) {
                    arrayList2.add(B2CBankBean.CREATOR.createFromParcel(parcel));
                    i3++;
                    i2 = i2;
                }
                arrayList = arrayList2;
            }
            return new B2CQuoteResp(string, string2, string3, string4, string5, string6, string7, string8, string9, z, string10, string11, str, string13, string14, string15, string16, z2, z3, b2CSwapBeanCreateFromParcel, string17, string18, z4, string19, string20, fxRateConversionBeanCreateFromParcel, string21, string22, i, string23, string24, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : FundingToTradingBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FeeTierInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CQuoteResp[] newArray(int i) {
            return new B2CQuoteResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CQuoteResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (B2CSwapBean) null, (String) null, (String) null, false, (String) null, (String) null, (FxRateConversionBean) null, (String) null, (String) null, 0, (String) null, (String) null, (ArrayList) null, (String) null, (FundingToTradingBean) null, (FeeTierInfo) null, -1, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.showExchangeRatePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.exchangeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.msgCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CSwapBean component20() {
        return this.convertDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.originChannelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.zeroFeeOfCardPayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.netQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FxRateConversionBean component26() {
        return this.fxRateConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.activityQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.convertBaseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<B2CBankBean> component32() {
        return this.bankList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.systemLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingToTradingBean component34() {
        return this.fundingToTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeTierInfo component35() {
        return this.feeTierInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cardPaymentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CQuoteResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z2, boolean z3, B2CSwapBean b2CSwapBean, @NotNull String str17, @NotNull String str18, boolean z4, String str19, @NotNull String str20, FxRateConversionBean fxRateConversionBean, @NotNull String str21, @NotNull String str22, int i, @NotNull String str23, @NotNull String str24, ArrayList<B2CBankBean> arrayList, @NotNull String str25, FundingToTradingBean fundingToTradingBean, FeeTierInfo feeTierInfo) {
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
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        return new B2CQuoteResp(str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, str11, str12, str13, str14, str15, str16, z2, z3, b2CSwapBean, str17, str18, z4, str19, str20, fxRateConversionBean, str21, str22, i, str23, str24, arrayList, str25, fundingToTradingBean, feeTierInfo);
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
        if (!(obj instanceof B2CQuoteResp)) {
            return false;
        }
        B2CQuoteResp b2CQuoteResp = (B2CQuoteResp) obj;
        return Intrinsics.EZpvd((Object) this.quoteId, (Object) b2CQuoteResp.quoteId) && Intrinsics.EZpvd((Object) this.price, (Object) b2CQuoteResp.price) && Intrinsics.EZpvd((Object) this.priceType, (Object) b2CQuoteResp.priceType) && Intrinsics.EZpvd((Object) this.cardPaymentPrice, (Object) b2CQuoteResp.cardPaymentPrice) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) b2CQuoteResp.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) b2CQuoteResp.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) b2CQuoteResp.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) b2CQuoteResp.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteToken, (Object) b2CQuoteResp.quoteToken) && this.showExchangeRatePrice == b2CQuoteResp.showExchangeRatePrice && Intrinsics.EZpvd((Object) this.usdAmount, (Object) b2CQuoteResp.usdAmount) && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) b2CQuoteResp.exchangeRate) && Intrinsics.EZpvd((Object) this.exchangeAmount, (Object) b2CQuoteResp.exchangeAmount) && Intrinsics.EZpvd((Object) this.tradeType, (Object) b2CQuoteResp.tradeType) && Intrinsics.EZpvd((Object) this.tradePwd, (Object) b2CQuoteResp.tradePwd) && Intrinsics.EZpvd((Object) this.codeType, (Object) b2CQuoteResp.codeType) && Intrinsics.EZpvd((Object) this.msgCode, (Object) b2CQuoteResp.msgCode) && this.needQuote == b2CQuoteResp.needQuote && this.isConvert == b2CQuoteResp.isConvert && Intrinsics.EZpvd(this.convertDetail, b2CQuoteResp.convertDetail) && Intrinsics.EZpvd((Object) this.channelFee, (Object) b2CQuoteResp.channelFee) && Intrinsics.EZpvd((Object) this.originChannelFee, (Object) b2CQuoteResp.originChannelFee) && this.zeroFeeOfCardPayment == b2CQuoteResp.zeroFeeOfCardPayment && Intrinsics.EZpvd((Object) this.spread, (Object) b2CQuoteResp.spread) && Intrinsics.EZpvd((Object) this.netQuoteAmount, (Object) b2CQuoteResp.netQuoteAmount) && Intrinsics.EZpvd(this.fxRateConversion, b2CQuoteResp.fxRateConversion) && Intrinsics.EZpvd((Object) this.feeRate, (Object) b2CQuoteResp.feeRate) && Intrinsics.EZpvd((Object) this.fee, (Object) b2CQuoteResp.fee) && this.activityQuoteTime == b2CQuoteResp.activityQuoteTime && Intrinsics.EZpvd((Object) this.baseColorfulIconUrl, (Object) b2CQuoteResp.baseColorfulIconUrl) && Intrinsics.EZpvd((Object) this.convertBaseColorfulIconUrl, (Object) b2CQuoteResp.convertBaseColorfulIconUrl) && Intrinsics.EZpvd(this.bankList, b2CQuoteResp.bankList) && Intrinsics.EZpvd((Object) this.systemLogo, (Object) b2CQuoteResp.systemLogo) && Intrinsics.EZpvd(this.fundingToTrading, b2CQuoteResp.fundingToTrading) && Intrinsics.EZpvd(this.feeTierInfo, b2CQuoteResp.feeTierInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActivityQuoteTime() {
        return this.activityQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<B2CBankBean> getBankList() {
        return this.bankList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseColorfulIconUrl() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardPaymentPrice() {
        return this.cardPaymentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFee() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCodeType() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseColorfulIconUrl() {
        return this.convertBaseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CSwapBean getConvertDetail() {
        return this.convertDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeAmount() {
        return this.exchangeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeTierInfo getFeeTierInfo() {
        return this.feeTierInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingToTradingBean getFundingToTrading() {
        return this.fundingToTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FxRateConversionBean getFxRateConversion() {
        return this.fxRateConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgCode() {
        return this.msgCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedQuote() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetQuoteAmount() {
        return this.netQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginChannelFee() {
        return this.originChannelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceType() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencySymbol() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowExchangeRatePrice() {
        return this.showExchangeRatePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpread() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemLogo() {
        return this.systemLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradePwd() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getZeroFeeOfCardPayment() {
        return this.zeroFeeOfCardPayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.quoteId.hashCode();
        int iHashCode2 = this.price.hashCode();
        int iHashCode3 = this.priceType.hashCode();
        int iHashCode4 = this.cardPaymentPrice.hashCode();
        int iHashCode5 = this.baseAmount.hashCode();
        int iHashCode6 = this.baseCurrencySymbol.hashCode();
        int iHashCode7 = this.quoteAmount.hashCode();
        int iHashCode8 = this.quoteCurrencySymbol.hashCode();
        int iHashCode9 = this.quoteToken.hashCode();
        int iHashCode10 = Boolean.hashCode(this.showExchangeRatePrice);
        int iHashCode11 = this.usdAmount.hashCode();
        int iHashCode12 = this.exchangeRate.hashCode();
        int iHashCode13 = this.exchangeAmount.hashCode();
        int iHashCode14 = this.tradeType.hashCode();
        int iHashCode15 = this.tradePwd.hashCode();
        int iHashCode16 = this.codeType.hashCode();
        int iHashCode17 = this.msgCode.hashCode();
        int iHashCode18 = Boolean.hashCode(this.needQuote);
        int iHashCode19 = Boolean.hashCode(this.isConvert);
        B2CSwapBean b2CSwapBean = this.convertDetail;
        int iHashCode20 = b2CSwapBean == null ? 0 : b2CSwapBean.hashCode();
        int iHashCode21 = this.channelFee.hashCode();
        int iHashCode22 = this.originChannelFee.hashCode();
        int iHashCode23 = Boolean.hashCode(this.zeroFeeOfCardPayment);
        String str = this.spread;
        int iHashCode24 = str == null ? 0 : str.hashCode();
        int iHashCode25 = this.netQuoteAmount.hashCode();
        FxRateConversionBean fxRateConversionBean = this.fxRateConversion;
        int iHashCode26 = fxRateConversionBean == null ? 0 : fxRateConversionBean.hashCode();
        int iHashCode27 = this.feeRate.hashCode();
        int iHashCode28 = this.fee.hashCode();
        int iHashCode29 = Integer.hashCode(this.activityQuoteTime);
        int iHashCode30 = this.baseColorfulIconUrl.hashCode();
        int iHashCode31 = this.convertBaseColorfulIconUrl.hashCode();
        ArrayList<B2CBankBean> arrayList = this.bankList;
        int iHashCode32 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode33 = this.systemLogo.hashCode();
        FundingToTradingBean fundingToTradingBean = this.fundingToTrading;
        int iHashCode34 = fundingToTradingBean == null ? 0 : fundingToTradingBean.hashCode();
        FeeTierInfo feeTierInfo = this.feeTierInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (feeTierInfo != null ? feeTierInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityQuoteTime(int i) {
        this.activityQuoteTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankList(ArrayList<B2CBankBean> arrayList) {
        this.bankList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCardPaymentPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardPaymentPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCodeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.codeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvert(boolean z) {
        this.isConvert = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertDetail(B2CSwapBean b2CSwapBean) {
        this.convertDetail = b2CSwapBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exchangeAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exchangeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeTierInfo(FeeTierInfo feeTierInfo) {
        this.feeTierInfo = feeTierInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingToTrading(FundingToTradingBean fundingToTradingBean) {
        this.fundingToTrading = fundingToTradingBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFxRateConversion(FxRateConversionBean fxRateConversionBean) {
        this.fxRateConversion = fxRateConversionBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msgCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedQuote(boolean z) {
        this.needQuote = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netQuoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginChannelFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originChannelFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowExchangeRatePrice(boolean z) {
        this.showExchangeRatePrice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpread(String str) {
        this.spread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.systemLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradePwd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradePwd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZeroFeeOfCardPayment(boolean z) {
        this.zeroFeeOfCardPayment = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CQuoteResp(quoteId=" + this.quoteId + ", price=" + this.price + ", priceType=" + this.priceType + ", cardPaymentPrice=" + this.cardPaymentPrice + ", baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteToken=" + this.quoteToken + ", showExchangeRatePrice=" + this.showExchangeRatePrice + ", usdAmount=" + this.usdAmount + ", exchangeRate=" + this.exchangeRate + ", exchangeAmount=" + this.exchangeAmount + ", tradeType=" + this.tradeType + ", tradePwd=" + this.tradePwd + ", codeType=" + this.codeType + ", msgCode=" + this.msgCode + ", needQuote=" + this.needQuote + ", isConvert=" + this.isConvert + ", convertDetail=" + this.convertDetail + ", channelFee=" + this.channelFee + ", originChannelFee=" + this.originChannelFee + ", zeroFeeOfCardPayment=" + this.zeroFeeOfCardPayment + ", spread=" + this.spread + ", netQuoteAmount=" + this.netQuoteAmount + ", fxRateConversion=" + this.fxRateConversion + ", feeRate=" + this.feeRate + ", fee=" + this.fee + ", activityQuoteTime=" + this.activityQuoteTime + ", baseColorfulIconUrl=" + this.baseColorfulIconUrl + ", convertBaseColorfulIconUrl=" + this.convertBaseColorfulIconUrl + ", bankList=" + this.bankList + ", systemLogo=" + this.systemLogo + ", fundingToTrading=" + this.fundingToTrading + ", feeTierInfo=" + this.feeTierInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteId);
        parcel.writeString(this.price);
        parcel.writeString(this.priceType);
        parcel.writeString(this.cardPaymentPrice);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.quoteToken);
        parcel.writeInt(this.showExchangeRatePrice ? 1 : 0);
        parcel.writeString(this.usdAmount);
        parcel.writeString(this.exchangeRate);
        parcel.writeString(this.exchangeAmount);
        parcel.writeString(this.tradeType);
        parcel.writeString(this.tradePwd);
        parcel.writeString(this.codeType);
        parcel.writeString(this.msgCode);
        parcel.writeInt(this.needQuote ? 1 : 0);
        parcel.writeInt(this.isConvert ? 1 : 0);
        B2CSwapBean b2CSwapBean = this.convertDetail;
        if (b2CSwapBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b2CSwapBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.channelFee);
        parcel.writeString(this.originChannelFee);
        parcel.writeInt(this.zeroFeeOfCardPayment ? 1 : 0);
        parcel.writeString(this.spread);
        parcel.writeString(this.netQuoteAmount);
        FxRateConversionBean fxRateConversionBean = this.fxRateConversion;
        if (fxRateConversionBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fxRateConversionBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.feeRate);
        parcel.writeString(this.fee);
        parcel.writeInt(this.activityQuoteTime);
        parcel.writeString(this.baseColorfulIconUrl);
        parcel.writeString(this.convertBaseColorfulIconUrl);
        ArrayList<B2CBankBean> arrayList = this.bankList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<B2CBankBean> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.systemLogo);
        FundingToTradingBean fundingToTradingBean = this.fundingToTrading;
        if (fundingToTradingBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fundingToTradingBean.writeToParcel(parcel, i);
        }
        FeeTierInfo feeTierInfo = this.feeTierInfo;
        if (feeTierInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeTierInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.B2CQuoteResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CQuoteResp> serializer() {
            return B2CQuoteResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ B2CQuoteResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, B2CSwapBean b2CSwapBean, String str17, String str18, boolean z4, String str19, String str20, FxRateConversionBean fxRateConversionBean, String str21, String str22, int i3, String str23, String str24, ArrayList arrayList, String str25, FundingToTradingBean fundingToTradingBean, FeeTierInfo feeTierInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str;
        }
        if ((i & 2) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i & 4) == 0) {
            this.priceType = "";
        } else {
            this.priceType = str3;
        }
        if ((i & 8) == 0) {
            this.cardPaymentPrice = "";
        } else {
            this.cardPaymentPrice = str4;
        }
        if ((i & 16) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str5;
        }
        if ((i & 32) == 0) {
            this.baseCurrencySymbol = "";
        } else {
            this.baseCurrencySymbol = str6;
        }
        if ((i & 64) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str7;
        }
        if ((i & 128) == 0) {
            this.quoteCurrencySymbol = "";
        } else {
            this.quoteCurrencySymbol = str8;
        }
        if ((i & 256) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str9;
        }
        if ((i & 512) == 0) {
            this.showExchangeRatePrice = false;
        } else {
            this.showExchangeRatePrice = z;
        }
        if ((i & 1024) == 0) {
            this.usdAmount = "";
        } else {
            this.usdAmount = str10;
        }
        if ((i & 2048) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str11;
        }
        if ((i & 4096) == 0) {
            this.exchangeAmount = "";
        } else {
            this.exchangeAmount = str12;
        }
        if ((i & 8192) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str13;
        }
        if ((i & 16384) == 0) {
            this.tradePwd = "";
        } else {
            this.tradePwd = str14;
        }
        if ((32768 & i) == 0) {
            this.codeType = "";
        } else {
            this.codeType = str15;
        }
        if ((65536 & i) == 0) {
            this.msgCode = "";
        } else {
            this.msgCode = str16;
        }
        if ((131072 & i) == 0) {
            this.needQuote = false;
        } else {
            this.needQuote = z2;
        }
        if ((262144 & i) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z3;
        }
        if ((524288 & i) == 0) {
            this.convertDetail = null;
        } else {
            this.convertDetail = b2CSwapBean;
        }
        if ((1048576 & i) == 0) {
            this.channelFee = "";
        } else {
            this.channelFee = str17;
        }
        if ((2097152 & i) == 0) {
            this.originChannelFee = "";
        } else {
            this.originChannelFee = str18;
        }
        if ((4194304 & i) == 0) {
            this.zeroFeeOfCardPayment = false;
        } else {
            this.zeroFeeOfCardPayment = z4;
        }
        if ((8388608 & i) == 0) {
            this.spread = null;
        } else {
            this.spread = str19;
        }
        if ((16777216 & i) == 0) {
            this.netQuoteAmount = "";
        } else {
            this.netQuoteAmount = str20;
        }
        if ((33554432 & i) == 0) {
            this.fxRateConversion = null;
        } else {
            this.fxRateConversion = fxRateConversionBean;
        }
        if ((67108864 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str21;
        }
        if ((134217728 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str22;
        }
        this.activityQuoteTime = (268435456 & i) != 0 ? i3 : 0;
        if ((536870912 & i) == 0) {
            this.baseColorfulIconUrl = "";
        } else {
            this.baseColorfulIconUrl = str23;
        }
        if ((1073741824 & i) == 0) {
            this.convertBaseColorfulIconUrl = "";
        } else {
            this.convertBaseColorfulIconUrl = str24;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.bankList = null;
        } else {
            this.bankList = arrayList;
        }
        if ((i2 & 1) == 0) {
            this.systemLogo = "";
        } else {
            this.systemLogo = str25;
        }
        if ((i2 & 2) == 0) {
            this.fundingToTrading = null;
        } else {
            this.fundingToTrading = fundingToTradingBean;
        }
        if ((i2 & 4) == 0) {
            this.feeTierInfo = null;
        } else {
            this.feeTierInfo = feeTierInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(B2CQuoteResp b2CQuoteResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) b2CQuoteResp.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, b2CQuoteResp.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CQuoteResp.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CQuoteResp.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CQuoteResp.priceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CQuoteResp.priceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) b2CQuoteResp.cardPaymentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CQuoteResp.cardPaymentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) b2CQuoteResp.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, b2CQuoteResp.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) b2CQuoteResp.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, b2CQuoteResp.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) b2CQuoteResp.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, b2CQuoteResp.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) b2CQuoteResp.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, b2CQuoteResp.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) b2CQuoteResp.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, b2CQuoteResp.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || b2CQuoteResp.showExchangeRatePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, b2CQuoteResp.showExchangeRatePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) b2CQuoteResp.usdAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, b2CQuoteResp.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) b2CQuoteResp.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, b2CQuoteResp.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) b2CQuoteResp.exchangeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, b2CQuoteResp.exchangeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) b2CQuoteResp.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, b2CQuoteResp.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) b2CQuoteResp.tradePwd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, b2CQuoteResp.tradePwd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) b2CQuoteResp.codeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, b2CQuoteResp.codeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) b2CQuoteResp.msgCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, b2CQuoteResp.msgCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || b2CQuoteResp.needQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, b2CQuoteResp.needQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || b2CQuoteResp.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, b2CQuoteResp.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || b2CQuoteResp.convertDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, B2CSwapBean$$serializer.INSTANCE, b2CQuoteResp.convertDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) b2CQuoteResp.channelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, b2CQuoteResp.channelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) b2CQuoteResp.originChannelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, b2CQuoteResp.originChannelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || b2CQuoteResp.zeroFeeOfCardPayment) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, b2CQuoteResp.zeroFeeOfCardPayment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || b2CQuoteResp.spread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, b2CQuoteResp.spread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) b2CQuoteResp.netQuoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, b2CQuoteResp.netQuoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || b2CQuoteResp.fxRateConversion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, FxRateConversionBean$$serializer.INSTANCE, b2CQuoteResp.fxRateConversion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) b2CQuoteResp.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, b2CQuoteResp.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) b2CQuoteResp.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, b2CQuoteResp.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || b2CQuoteResp.activityQuoteTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 28, b2CQuoteResp.activityQuoteTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) b2CQuoteResp.baseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, b2CQuoteResp.baseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) b2CQuoteResp.convertBaseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, b2CQuoteResp.convertBaseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || b2CQuoteResp.bankList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], b2CQuoteResp.bankList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) b2CQuoteResp.systemLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, b2CQuoteResp.systemLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || b2CQuoteResp.fundingToTrading != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, FundingToTradingBean$$serializer.INSTANCE, b2CQuoteResp.fundingToTrading);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && b2CQuoteResp.feeTierInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, FeeTierInfo$$serializer.INSTANCE, b2CQuoteResp.feeTierInfo);
    }

    public B2CQuoteResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z2, boolean z3, B2CSwapBean b2CSwapBean, @NotNull String str17, @NotNull String str18, boolean z4, String str19, @NotNull String str20, FxRateConversionBean fxRateConversionBean, @NotNull String str21, @NotNull String str22, int i, @NotNull String str23, @NotNull String str24, ArrayList<B2CBankBean> arrayList, @NotNull String str25, FundingToTradingBean fundingToTradingBean, FeeTierInfo feeTierInfo) {
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
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        this.quoteId = str;
        this.price = str2;
        this.priceType = str3;
        this.cardPaymentPrice = str4;
        this.baseAmount = str5;
        this.baseCurrencySymbol = str6;
        this.quoteAmount = str7;
        this.quoteCurrencySymbol = str8;
        this.quoteToken = str9;
        this.showExchangeRatePrice = z;
        this.usdAmount = str10;
        this.exchangeRate = str11;
        this.exchangeAmount = str12;
        this.tradeType = str13;
        this.tradePwd = str14;
        this.codeType = str15;
        this.msgCode = str16;
        this.needQuote = z2;
        this.isConvert = z3;
        this.convertDetail = b2CSwapBean;
        this.channelFee = str17;
        this.originChannelFee = str18;
        this.zeroFeeOfCardPayment = z4;
        this.spread = str19;
        this.netQuoteAmount = str20;
        this.fxRateConversion = fxRateConversionBean;
        this.feeRate = str21;
        this.fee = str22;
        this.activityQuoteTime = i;
        this.baseColorfulIconUrl = str23;
        this.convertBaseColorfulIconUrl = str24;
        this.bankList = arrayList;
        this.systemLogo = str25;
        this.fundingToTrading = fundingToTradingBean;
        this.feeTierInfo = feeTierInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x019e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r72v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r72v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r72v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r72v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r72v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r72v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r72v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r72v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r72v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r72v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r72v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r72v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r72v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r72v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r72v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r72v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0098: ARITH (r72v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r72v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r72v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean) : (r56v0 com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r72v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r72v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r72v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r59v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r72v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r72v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.FxRateConversionBean:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r72v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.FxRateConversionBean) : (r62v0 com.okinc.okpaymentapi.data.remote.model.experience.FxRateConversionBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r72v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r72v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0113: ARITH (r72v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r65v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r72v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r72v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0134: ARITH (r72v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r68v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.FundingToTradingBean:?: TERNARY null = ((wrap:int:0x0146: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.FundingToTradingBean) : (r70v0 com.okinc.okpaymentapi.data.remote.model.experience.FundingToTradingBean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.FeeTierInfo:?: TERNARY null = ((wrap:int:0x014f: ARITH (r73v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r71v0 com.okinc.okpaymentapi.data.remote.model.experience.FeeTierInfo) : (null com.okinc.okpaymentapi.data.remote.model.experience.FeeTierInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.FxRateConversionBean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.okpaymentapi.data.remote.model.experience.B2CBankBean>, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.FundingToTradingBean, com.okinc.okpaymentapi.data.remote.model.experience.FeeTierInfo):void (m)] (LINE:33) call: com.okinc.okpaymentapi.data.remote.model.experience.B2CQuoteResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.FxRateConversionBean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.FundingToTradingBean, com.okinc.okpaymentapi.data.remote.model.experience.FeeTierInfo):void type: THIS */
    public /* synthetic */ B2CQuoteResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, B2CSwapBean b2CSwapBean, String str17, String str18, boolean z4, String str19, String str20, FxRateConversionBean fxRateConversionBean, String str21, String str22, int i, String str23, String str24, ArrayList arrayList, String str25, FundingToTradingBean fundingToTradingBean, FeeTierInfo feeTierInfo, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13, (i2 & 16384) != 0 ? "" : str14, (i2 & 32768) != 0 ? "" : str15, (i2 & 65536) != 0 ? "" : str16, (i2 & 131072) != 0 ? false : z2, (i2 & 262144) != 0 ? false : z3, (i2 & 524288) != 0 ? null : b2CSwapBean, (i2 & 1048576) != 0 ? "" : str17, (i2 & 2097152) != 0 ? "" : str18, (i2 & 4194304) != 0 ? false : z4, (i2 & 8388608) != 0 ? null : str19, (i2 & 16777216) != 0 ? "" : str20, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : fxRateConversionBean, (i2 & 67108864) != 0 ? "" : str21, (i2 & 134217728) != 0 ? "" : str22, (i2 & 268435456) != 0 ? 0 : i, (i2 & 536870912) != 0 ? "" : str23, (i2 & 1073741824) != 0 ? "" : str24, (i2 & Integer.MIN_VALUE) != 0 ? null : arrayList, (i3 & 1) != 0 ? "" : str25, (i3 & 2) != 0 ? null : fundingToTradingBean, (i3 & 4) == 0 ? feeTierInfo : null);
    }
}
