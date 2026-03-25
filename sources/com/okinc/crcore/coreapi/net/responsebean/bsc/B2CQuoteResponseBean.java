package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class B2CQuoteResponseBean implements Parcelable {
    private int activityQuoteTime;
    private ArrayList<B2CBankResponseBean> bankList;
    private String baseAmount;
    private String baseColorfulIconUrl;
    private String baseCurrencySymbol;
    private String cardPaymentPrice;
    private String channelFee;
    private String codeType;
    private String convertBaseColorfulIconUrl;
    private B2CSwapResponseBean convertDetail;
    private String exchangeAmount;
    private String exchangeRate;
    private String fee;
    private String feeRate;
    private FxRateConversionResponseBean fxRateConversion;
    private boolean isConvert;
    private String msgCode;
    private boolean needQuote;
    private String originChannelFee;
    private String price;
    private String priceType;
    private String quoteAmount;
    private String quoteCurrencySymbol;
    private String quoteToken;
    private boolean showExchangeRatePrice;
    private String systemLogo;
    private String tradePwd;
    private String tradeType;
    private String usdAmount;
    private boolean zeroFeeOfCardPayment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<B2CQuoteResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(B2CBankResponseBean$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<B2CQuoteResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CQuoteResponseBean createFromParcel(Parcel parcel) {
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
            boolean z = parcel.readInt() != 0;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            B2CSwapResponseBean b2CSwapResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : B2CSwapResponseBean.CREATOR.createFromParcel(parcel);
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            FxRateConversionResponseBean fxRateConversionResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : FxRateConversionResponseBean.CREATOR.createFromParcel(parcel);
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            int i = parcel.readInt();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string12;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                str = string12;
                int i3 = 0;
                while (i3 != i2) {
                    arrayList2.add(B2CBankResponseBean.CREATOR.createFromParcel(parcel));
                    i3++;
                    i2 = i2;
                }
                arrayList = arrayList2;
            }
            return new B2CQuoteResponseBean(string, string2, string3, string4, string5, string6, string7, string8, z, string9, string10, string11, str, string13, string14, string15, z2, z3, b2CSwapResponseBeanCreateFromParcel, string16, string17, z4, fxRateConversionResponseBeanCreateFromParcel, string18, string19, i, string20, string21, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CQuoteResponseBean[] newArray(int i) {
            return new B2CQuoteResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CQuoteResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (B2CSwapResponseBean) null, (String) null, (String) null, false, (FxRateConversionResponseBean) null, (String) null, (String) null, 0, (String) null, (String) null, (ArrayList) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.exchangeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.msgCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.needQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CSwapResponseBean component19() {
        return this.convertDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.originChannelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.zeroFeeOfCardPayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FxRateConversionResponseBean component23() {
        return this.fxRateConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.activityQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.convertBaseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<B2CBankResponseBean> component29() {
        return this.bankList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cardPaymentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.systemLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.showExchangeRatePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CQuoteResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, B2CSwapResponseBean b2CSwapResponseBean, @NotNull String str16, @NotNull String str17, boolean z4, FxRateConversionResponseBean fxRateConversionResponseBean, @NotNull String str18, @NotNull String str19, int i, @NotNull String str20, @NotNull String str21, ArrayList<B2CBankResponseBean> arrayList, @NotNull String str22) {
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
        return new B2CQuoteResponseBean(str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, str11, str12, str13, str14, str15, z2, z3, b2CSwapResponseBean, str16, str17, z4, fxRateConversionResponseBean, str18, str19, i, str20, str21, arrayList, str22);
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
        if (!(obj instanceof B2CQuoteResponseBean)) {
            return false;
        }
        B2CQuoteResponseBean b2CQuoteResponseBean = (B2CQuoteResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) b2CQuoteResponseBean.price) && Intrinsics.EZpvd((Object) this.priceType, (Object) b2CQuoteResponseBean.priceType) && Intrinsics.EZpvd((Object) this.cardPaymentPrice, (Object) b2CQuoteResponseBean.cardPaymentPrice) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) b2CQuoteResponseBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) b2CQuoteResponseBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) b2CQuoteResponseBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) b2CQuoteResponseBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteToken, (Object) b2CQuoteResponseBean.quoteToken) && this.showExchangeRatePrice == b2CQuoteResponseBean.showExchangeRatePrice && Intrinsics.EZpvd((Object) this.usdAmount, (Object) b2CQuoteResponseBean.usdAmount) && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) b2CQuoteResponseBean.exchangeRate) && Intrinsics.EZpvd((Object) this.exchangeAmount, (Object) b2CQuoteResponseBean.exchangeAmount) && Intrinsics.EZpvd((Object) this.tradeType, (Object) b2CQuoteResponseBean.tradeType) && Intrinsics.EZpvd((Object) this.tradePwd, (Object) b2CQuoteResponseBean.tradePwd) && Intrinsics.EZpvd((Object) this.codeType, (Object) b2CQuoteResponseBean.codeType) && Intrinsics.EZpvd((Object) this.msgCode, (Object) b2CQuoteResponseBean.msgCode) && this.needQuote == b2CQuoteResponseBean.needQuote && this.isConvert == b2CQuoteResponseBean.isConvert && Intrinsics.EZpvd(this.convertDetail, b2CQuoteResponseBean.convertDetail) && Intrinsics.EZpvd((Object) this.channelFee, (Object) b2CQuoteResponseBean.channelFee) && Intrinsics.EZpvd((Object) this.originChannelFee, (Object) b2CQuoteResponseBean.originChannelFee) && this.zeroFeeOfCardPayment == b2CQuoteResponseBean.zeroFeeOfCardPayment && Intrinsics.EZpvd(this.fxRateConversion, b2CQuoteResponseBean.fxRateConversion) && Intrinsics.EZpvd((Object) this.feeRate, (Object) b2CQuoteResponseBean.feeRate) && Intrinsics.EZpvd((Object) this.fee, (Object) b2CQuoteResponseBean.fee) && this.activityQuoteTime == b2CQuoteResponseBean.activityQuoteTime && Intrinsics.EZpvd((Object) this.baseColorfulIconUrl, (Object) b2CQuoteResponseBean.baseColorfulIconUrl) && Intrinsics.EZpvd((Object) this.convertBaseColorfulIconUrl, (Object) b2CQuoteResponseBean.convertBaseColorfulIconUrl) && Intrinsics.EZpvd(this.bankList, b2CQuoteResponseBean.bankList) && Intrinsics.EZpvd((Object) this.systemLogo, (Object) b2CQuoteResponseBean.systemLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActivityQuoteTime() {
        return this.activityQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<B2CBankResponseBean> getBankList() {
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
    public final B2CSwapResponseBean getConvertDetail() {
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
    public final FxRateConversionResponseBean getFxRateConversion() {
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
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowExchangeRatePrice() {
        return this.showExchangeRatePrice;
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
        int iHashCode = this.price.hashCode();
        int iHashCode2 = this.priceType.hashCode();
        int iHashCode3 = this.cardPaymentPrice.hashCode();
        int iHashCode4 = this.baseAmount.hashCode();
        int iHashCode5 = this.baseCurrencySymbol.hashCode();
        int iHashCode6 = this.quoteAmount.hashCode();
        int iHashCode7 = this.quoteCurrencySymbol.hashCode();
        int iHashCode8 = this.quoteToken.hashCode();
        int iHashCode9 = Boolean.hashCode(this.showExchangeRatePrice);
        int iHashCode10 = this.usdAmount.hashCode();
        int iHashCode11 = this.exchangeRate.hashCode();
        int iHashCode12 = this.exchangeAmount.hashCode();
        int iHashCode13 = this.tradeType.hashCode();
        int iHashCode14 = this.tradePwd.hashCode();
        int iHashCode15 = this.codeType.hashCode();
        int iHashCode16 = this.msgCode.hashCode();
        int iHashCode17 = Boolean.hashCode(this.needQuote);
        int iHashCode18 = Boolean.hashCode(this.isConvert);
        B2CSwapResponseBean b2CSwapResponseBean = this.convertDetail;
        int iHashCode19 = b2CSwapResponseBean == null ? 0 : b2CSwapResponseBean.hashCode();
        int iHashCode20 = this.channelFee.hashCode();
        int iHashCode21 = this.originChannelFee.hashCode();
        int iHashCode22 = Boolean.hashCode(this.zeroFeeOfCardPayment);
        FxRateConversionResponseBean fxRateConversionResponseBean = this.fxRateConversion;
        int iHashCode23 = fxRateConversionResponseBean == null ? 0 : fxRateConversionResponseBean.hashCode();
        int iHashCode24 = this.feeRate.hashCode();
        int iHashCode25 = this.fee.hashCode();
        int iHashCode26 = Integer.hashCode(this.activityQuoteTime);
        int iHashCode27 = this.baseColorfulIconUrl.hashCode();
        int iHashCode28 = this.convertBaseColorfulIconUrl.hashCode();
        ArrayList<B2CBankResponseBean> arrayList = this.bankList;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + this.systemLogo.hashCode();
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
    public final void setBankList(ArrayList<B2CBankResponseBean> arrayList) {
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
    public final void setConvertDetail(B2CSwapResponseBean b2CSwapResponseBean) {
        this.convertDetail = b2CSwapResponseBean;
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
    public final void setFxRateConversion(FxRateConversionResponseBean fxRateConversionResponseBean) {
        this.fxRateConversion = fxRateConversionResponseBean;
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
    public final void setQuoteToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowExchangeRatePrice(boolean z) {
        this.showExchangeRatePrice = z;
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
        return "B2CQuoteResponseBean(price=" + this.price + ", priceType=" + this.priceType + ", cardPaymentPrice=" + this.cardPaymentPrice + ", baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteToken=" + this.quoteToken + ", showExchangeRatePrice=" + this.showExchangeRatePrice + ", usdAmount=" + this.usdAmount + ", exchangeRate=" + this.exchangeRate + ", exchangeAmount=" + this.exchangeAmount + ", tradeType=" + this.tradeType + ", tradePwd=" + this.tradePwd + ", codeType=" + this.codeType + ", msgCode=" + this.msgCode + ", needQuote=" + this.needQuote + ", isConvert=" + this.isConvert + ", convertDetail=" + this.convertDetail + ", channelFee=" + this.channelFee + ", originChannelFee=" + this.originChannelFee + ", zeroFeeOfCardPayment=" + this.zeroFeeOfCardPayment + ", fxRateConversion=" + this.fxRateConversion + ", feeRate=" + this.feeRate + ", fee=" + this.fee + ", activityQuoteTime=" + this.activityQuoteTime + ", baseColorfulIconUrl=" + this.baseColorfulIconUrl + ", convertBaseColorfulIconUrl=" + this.convertBaseColorfulIconUrl + ", bankList=" + this.bankList + ", systemLogo=" + this.systemLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
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
        B2CSwapResponseBean b2CSwapResponseBean = this.convertDetail;
        if (b2CSwapResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b2CSwapResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.channelFee);
        parcel.writeString(this.originChannelFee);
        parcel.writeInt(this.zeroFeeOfCardPayment ? 1 : 0);
        FxRateConversionResponseBean fxRateConversionResponseBean = this.fxRateConversion;
        if (fxRateConversionResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fxRateConversionResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.feeRate);
        parcel.writeString(this.fee);
        parcel.writeInt(this.activityQuoteTime);
        parcel.writeString(this.baseColorfulIconUrl);
        parcel.writeString(this.convertBaseColorfulIconUrl);
        ArrayList<B2CBankResponseBean> arrayList = this.bankList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<B2CBankResponseBean> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.systemLogo);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuoteResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CQuoteResponseBean> serializer() {
            return B2CQuoteResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ B2CQuoteResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z2, boolean z3, B2CSwapResponseBean b2CSwapResponseBean, String str16, String str17, boolean z4, FxRateConversionResponseBean fxRateConversionResponseBean, String str18, String str19, int i2, String str20, String str21, ArrayList arrayList, String str22, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.price = "";
        } else {
            this.price = str;
        }
        if ((i & 2) == 0) {
            this.priceType = "";
        } else {
            this.priceType = str2;
        }
        if ((i & 4) == 0) {
            this.cardPaymentPrice = "";
        } else {
            this.cardPaymentPrice = str3;
        }
        if ((i & 8) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str4;
        }
        if ((i & 16) == 0) {
            this.baseCurrencySymbol = "";
        } else {
            this.baseCurrencySymbol = str5;
        }
        if ((i & 32) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str6;
        }
        if ((i & 64) == 0) {
            this.quoteCurrencySymbol = "";
        } else {
            this.quoteCurrencySymbol = str7;
        }
        if ((i & 128) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str8;
        }
        if ((i & 256) == 0) {
            this.showExchangeRatePrice = false;
        } else {
            this.showExchangeRatePrice = z;
        }
        if ((i & 512) == 0) {
            this.usdAmount = "";
        } else {
            this.usdAmount = str9;
        }
        if ((i & 1024) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str10;
        }
        if ((i & 2048) == 0) {
            this.exchangeAmount = "";
        } else {
            this.exchangeAmount = str11;
        }
        if ((i & 4096) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str12;
        }
        if ((i & 8192) == 0) {
            this.tradePwd = "";
        } else {
            this.tradePwd = str13;
        }
        if ((i & 16384) == 0) {
            this.codeType = "";
        } else {
            this.codeType = str14;
        }
        if ((32768 & i) == 0) {
            this.msgCode = "";
        } else {
            this.msgCode = str15;
        }
        if ((65536 & i) == 0) {
            this.needQuote = false;
        } else {
            this.needQuote = z2;
        }
        if ((131072 & i) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z3;
        }
        if ((262144 & i) == 0) {
            this.convertDetail = null;
        } else {
            this.convertDetail = b2CSwapResponseBean;
        }
        if ((524288 & i) == 0) {
            this.channelFee = "";
        } else {
            this.channelFee = str16;
        }
        if ((1048576 & i) == 0) {
            this.originChannelFee = "";
        } else {
            this.originChannelFee = str17;
        }
        if ((2097152 & i) == 0) {
            this.zeroFeeOfCardPayment = false;
        } else {
            this.zeroFeeOfCardPayment = z4;
        }
        if ((4194304 & i) == 0) {
            this.fxRateConversion = null;
        } else {
            this.fxRateConversion = fxRateConversionResponseBean;
        }
        if ((8388608 & i) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str18;
        }
        if ((16777216 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str19;
        }
        if ((33554432 & i) == 0) {
            this.activityQuoteTime = 0;
        } else {
            this.activityQuoteTime = i2;
        }
        if ((67108864 & i) == 0) {
            this.baseColorfulIconUrl = "";
        } else {
            this.baseColorfulIconUrl = str20;
        }
        if ((134217728 & i) == 0) {
            this.convertBaseColorfulIconUrl = "";
        } else {
            this.convertBaseColorfulIconUrl = str21;
        }
        if ((268435456 & i) == 0) {
            this.bankList = null;
        } else {
            this.bankList = arrayList;
        }
        if ((i & 536870912) == 0) {
            this.systemLogo = "";
        } else {
            this.systemLogo = str22;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(B2CQuoteResponseBean b2CQuoteResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, b2CQuoteResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.priceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CQuoteResponseBean.priceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.cardPaymentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CQuoteResponseBean.cardPaymentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CQuoteResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, b2CQuoteResponseBean.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, b2CQuoteResponseBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, b2CQuoteResponseBean.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, b2CQuoteResponseBean.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || b2CQuoteResponseBean.showExchangeRatePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, b2CQuoteResponseBean.showExchangeRatePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.usdAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, b2CQuoteResponseBean.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, b2CQuoteResponseBean.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.exchangeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, b2CQuoteResponseBean.exchangeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, b2CQuoteResponseBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.tradePwd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, b2CQuoteResponseBean.tradePwd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.codeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, b2CQuoteResponseBean.codeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.msgCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, b2CQuoteResponseBean.msgCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || b2CQuoteResponseBean.needQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, b2CQuoteResponseBean.needQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || b2CQuoteResponseBean.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, b2CQuoteResponseBean.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || b2CQuoteResponseBean.convertDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, B2CSwapResponseBean$$serializer.INSTANCE, b2CQuoteResponseBean.convertDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.channelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, b2CQuoteResponseBean.channelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.originChannelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, b2CQuoteResponseBean.originChannelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || b2CQuoteResponseBean.zeroFeeOfCardPayment) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, b2CQuoteResponseBean.zeroFeeOfCardPayment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || b2CQuoteResponseBean.fxRateConversion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, FxRateConversionResponseBean$$serializer.INSTANCE, b2CQuoteResponseBean.fxRateConversion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, b2CQuoteResponseBean.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, b2CQuoteResponseBean.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || b2CQuoteResponseBean.activityQuoteTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 25, b2CQuoteResponseBean.activityQuoteTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.baseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, b2CQuoteResponseBean.baseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) b2CQuoteResponseBean.convertBaseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, b2CQuoteResponseBean.convertBaseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || b2CQuoteResponseBean.bankList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], b2CQuoteResponseBean.bankList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && Intrinsics.EZpvd((Object) b2CQuoteResponseBean.systemLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 29, b2CQuoteResponseBean.systemLogo);
    }

    public B2CQuoteResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, B2CSwapResponseBean b2CSwapResponseBean, @NotNull String str16, @NotNull String str17, boolean z4, FxRateConversionResponseBean fxRateConversionResponseBean, @NotNull String str18, @NotNull String str19, int i, @NotNull String str20, @NotNull String str21, ArrayList<B2CBankResponseBean> arrayList, @NotNull String str22) {
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
        this.price = str;
        this.priceType = str2;
        this.cardPaymentPrice = str3;
        this.baseAmount = str4;
        this.baseCurrencySymbol = str5;
        this.quoteAmount = str6;
        this.quoteCurrencySymbol = str7;
        this.quoteToken = str8;
        this.showExchangeRatePrice = z;
        this.usdAmount = str9;
        this.exchangeRate = str10;
        this.exchangeAmount = str11;
        this.tradeType = str12;
        this.tradePwd = str13;
        this.codeType = str14;
        this.msgCode = str15;
        this.needQuote = z2;
        this.isConvert = z3;
        this.convertDetail = b2CSwapResponseBean;
        this.channelFee = str16;
        this.originChannelFee = str17;
        this.zeroFeeOfCardPayment = z4;
        this.fxRateConversion = fxRateConversionResponseBean;
        this.feeRate = str18;
        this.fee = str19;
        this.activityQuoteTime = i;
        this.baseColorfulIconUrl = str20;
        this.convertBaseColorfulIconUrl = str21;
        this.bankList = arrayList;
        this.systemLogo = str22;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0163: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r62v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r62v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r62v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r62v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r62v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r62v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r62v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r62v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r62v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r62v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r62v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r62v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r62v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r62v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r62v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r62v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r62v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0098: ARITH (r62v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.B2CSwapResponseBean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r62v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.B2CSwapResponseBean) : (r50v0 com.okinc.crcore.coreapi.net.responsebean.bsc.B2CSwapResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r62v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r62v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r62v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r62v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean) : (r54v0 com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r62v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r62v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r62v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r57v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r62v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r62v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0113: ARITH (r62v0 int) & (268435456 int) A[WRAPPED]) == (0 int)) ? (r60v0 java.util.ArrayList) : (null java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r62v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.B2CSwapResponseBean, java.lang.String, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.bsc.B2CBankResponseBean>, java.lang.String):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuoteResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.B2CSwapResponseBean, java.lang.String, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ B2CQuoteResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z2, boolean z3, B2CSwapResponseBean b2CSwapResponseBean, String str16, String str17, boolean z4, FxRateConversionResponseBean fxRateConversionResponseBean, String str18, String str19, int i, String str20, String str21, ArrayList arrayList, String str22, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13, (i2 & 16384) != 0 ? "" : str14, (i2 & 32768) != 0 ? "" : str15, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) != 0 ? false : z3, (i2 & 262144) != 0 ? null : b2CSwapResponseBean, (i2 & 524288) != 0 ? "" : str16, (i2 & 1048576) != 0 ? "" : str17, (i2 & 2097152) != 0 ? false : z4, (i2 & 4194304) != 0 ? null : fxRateConversionResponseBean, (i2 & 8388608) != 0 ? "" : str18, (i2 & 16777216) != 0 ? "" : str19, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i, (i2 & 67108864) != 0 ? "" : str20, (i2 & 134217728) != 0 ? "" : str21, (i2 & 268435456) == 0 ? arrayList : null, (i2 & 536870912) != 0 ? "" : str22);
    }
}
