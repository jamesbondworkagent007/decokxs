package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetail;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class FiatOrderItemBean implements Parcelable {
    private final String baseAmount;
    private final String baseCurrencySymbol;
    private final String baseCurrencyUrl;
    private final String chainUrl;
    private final String channelIcon;
    private final String channelIconNight;
    private final String completedTime;
    private final ConvertOrderDetailBean convertOrderDetail;
    private final long createDate;
    private final String depositName;
    private final String depositPlatformCode;
    private final String errorCode;
    private final int expireSeconds;
    private final String icon;
    private final String iconNight;
    private final boolean isConvert;
    private final String last4;
    private final String network;
    private final String networkFee;
    private final String networkFeeCurrency;
    private final String orderNo;
    private final String payCardNumber;
    private final String paymentMethod;
    private final String paymentMethodNightUrl;
    private final String paymentMethodUrl;
    private final String price;
    private final String quoteAmount;
    private final String quoteCurrencySymbol;
    private final String realAmount;
    private final String requestAmount;
    private final String requestCurrencySign;
    private final String requestCurrencySymbol;
    private final int status;
    private final String totalFee;
    private final String tradeType;
    private final String type;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FiatOrderItemBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FiatOrderItemBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatOrderItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FiatOrderItemBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ConvertOrderDetailBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatOrderItemBean[] newArray(int i) {
            return new FiatOrderItemBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatOrderItemBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0L, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ConvertOrderDetailBean) null, (String) null, (String) null, (String) null, -1, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.completedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.expireSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.iconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.payCardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.channelIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.channelIconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.requestCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.requestCurrencySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailBean component34() {
        return this.convertOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.networkFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseCurrencyUrl;
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
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatOrderItemBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, long j, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, ConvertOrderDetailBean convertOrderDetailBean, @NotNull String str30, @NotNull String str31, @NotNull String str32) {
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
        return new FiatOrderItemBean(str, str2, str3, str4, str5, str6, str7, str8, i, j, str9, i2, str10, str11, str12, str13, str14, str15, z, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, convertOrderDetailBean, str30, str31, str32);
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
        if (!(obj instanceof FiatOrderItemBean)) {
            return false;
        }
        FiatOrderItemBean fiatOrderItemBean = (FiatOrderItemBean) obj;
        return Intrinsics.EZpvd((Object) this.orderNo, (Object) fiatOrderItemBean.orderNo) && Intrinsics.EZpvd((Object) this.tradeType, (Object) fiatOrderItemBean.tradeType) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) fiatOrderItemBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) fiatOrderItemBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) fiatOrderItemBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) fiatOrderItemBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) fiatOrderItemBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.price, (Object) fiatOrderItemBean.price) && this.status == fiatOrderItemBean.status && this.createDate == fiatOrderItemBean.createDate && Intrinsics.EZpvd((Object) this.completedTime, (Object) fiatOrderItemBean.completedTime) && this.expireSeconds == fiatOrderItemBean.expireSeconds && Intrinsics.EZpvd((Object) this.type, (Object) fiatOrderItemBean.type) && Intrinsics.EZpvd((Object) this.depositName, (Object) fiatOrderItemBean.depositName) && Intrinsics.EZpvd((Object) this.icon, (Object) fiatOrderItemBean.icon) && Intrinsics.EZpvd((Object) this.iconNight, (Object) fiatOrderItemBean.iconNight) && Intrinsics.EZpvd((Object) this.url, (Object) fiatOrderItemBean.url) && Intrinsics.EZpvd((Object) this.chainUrl, (Object) fiatOrderItemBean.chainUrl) && this.isConvert == fiatOrderItemBean.isConvert && Intrinsics.EZpvd((Object) this.payCardNumber, (Object) fiatOrderItemBean.payCardNumber) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) fiatOrderItemBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) fiatOrderItemBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) fiatOrderItemBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) fiatOrderItemBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.channelIcon, (Object) fiatOrderItemBean.channelIcon) && Intrinsics.EZpvd((Object) this.channelIconNight, (Object) fiatOrderItemBean.channelIconNight) && Intrinsics.EZpvd((Object) this.totalFee, (Object) fiatOrderItemBean.totalFee) && Intrinsics.EZpvd((Object) this.errorCode, (Object) fiatOrderItemBean.errorCode) && Intrinsics.EZpvd((Object) this.requestCurrencySymbol, (Object) fiatOrderItemBean.requestCurrencySymbol) && Intrinsics.EZpvd((Object) this.requestCurrencySign, (Object) fiatOrderItemBean.requestCurrencySign) && Intrinsics.EZpvd((Object) this.requestAmount, (Object) fiatOrderItemBean.requestAmount) && Intrinsics.EZpvd((Object) this.realAmount, (Object) fiatOrderItemBean.realAmount) && Intrinsics.EZpvd((Object) this.last4, (Object) fiatOrderItemBean.last4) && Intrinsics.EZpvd(this.convertOrderDetail, fiatOrderItemBean.convertOrderDetail) && Intrinsics.EZpvd((Object) this.network, (Object) fiatOrderItemBean.network) && Intrinsics.EZpvd((Object) this.networkFee, (Object) fiatOrderItemBean.networkFee) && Intrinsics.EZpvd((Object) this.networkFeeCurrency, (Object) fiatOrderItemBean.networkFeeCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyUrl() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainUrl() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelIcon() {
        return this.channelIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelIconNight() {
        return this.channelIconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedTime() {
        return this.completedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailBean getConvertOrderDetail() {
        return this.convertOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
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
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExpireSeconds() {
        return this.expireSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconNight() {
        return this.iconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeCurrency() {
        return this.networkFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCardNumber() {
        return this.payCardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodNightUrl() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodUrl() {
        return this.paymentMethodUrl;
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
    public final String getQuoteCurrencySymbol() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealAmount() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestAmount() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestCurrencySign() {
        return this.requestCurrencySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestCurrencySymbol() {
        return this.requestCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFee() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderNo.hashCode();
        int iHashCode2 = this.tradeType.hashCode();
        int iHashCode3 = this.baseAmount.hashCode();
        int iHashCode4 = this.baseCurrencySymbol.hashCode();
        int iHashCode5 = this.baseCurrencyUrl.hashCode();
        int iHashCode6 = this.quoteAmount.hashCode();
        int iHashCode7 = this.quoteCurrencySymbol.hashCode();
        int iHashCode8 = this.price.hashCode();
        int iHashCode9 = Integer.hashCode(this.status);
        int iHashCode10 = Long.hashCode(this.createDate);
        int iHashCode11 = this.completedTime.hashCode();
        int iHashCode12 = Integer.hashCode(this.expireSeconds);
        int iHashCode13 = this.type.hashCode();
        int iHashCode14 = this.depositName.hashCode();
        int iHashCode15 = this.icon.hashCode();
        int iHashCode16 = this.iconNight.hashCode();
        int iHashCode17 = this.url.hashCode();
        int iHashCode18 = this.chainUrl.hashCode();
        int iHashCode19 = Boolean.hashCode(this.isConvert);
        int iHashCode20 = this.payCardNumber.hashCode();
        int iHashCode21 = this.paymentMethod.hashCode();
        int iHashCode22 = this.paymentMethodUrl.hashCode();
        int iHashCode23 = this.paymentMethodNightUrl.hashCode();
        int iHashCode24 = this.depositPlatformCode.hashCode();
        int iHashCode25 = this.channelIcon.hashCode();
        int iHashCode26 = this.channelIconNight.hashCode();
        int iHashCode27 = this.totalFee.hashCode();
        int iHashCode28 = this.errorCode.hashCode();
        int iHashCode29 = this.requestCurrencySymbol.hashCode();
        int iHashCode30 = this.requestCurrencySign.hashCode();
        int iHashCode31 = this.requestAmount.hashCode();
        int iHashCode32 = this.realAmount.hashCode();
        int iHashCode33 = this.last4.hashCode();
        ConvertOrderDetailBean convertOrderDetailBean = this.convertOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (convertOrderDetailBean == null ? 0 : convertOrderDetailBean.hashCode())) * 31) + this.network.hashCode()) * 31) + this.networkFee.hashCode()) * 31) + this.networkFeeCurrency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatOrderItemBean(orderNo=" + this.orderNo + ", tradeType=" + this.tradeType + ", baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", price=" + this.price + ", status=" + this.status + ", createDate=" + this.createDate + ", completedTime=" + this.completedTime + ", expireSeconds=" + this.expireSeconds + ", type=" + this.type + ", depositName=" + this.depositName + ", icon=" + this.icon + ", iconNight=" + this.iconNight + ", url=" + this.url + ", chainUrl=" + this.chainUrl + ", isConvert=" + this.isConvert + ", payCardNumber=" + this.payCardNumber + ", paymentMethod=" + this.paymentMethod + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", depositPlatformCode=" + this.depositPlatformCode + ", channelIcon=" + this.channelIcon + ", channelIconNight=" + this.channelIconNight + ", totalFee=" + this.totalFee + ", errorCode=" + this.errorCode + ", requestCurrencySymbol=" + this.requestCurrencySymbol + ", requestCurrencySign=" + this.requestCurrencySign + ", requestAmount=" + this.requestAmount + ", realAmount=" + this.realAmount + ", last4=" + this.last4 + ", convertOrderDetail=" + this.convertOrderDetail + ", network=" + this.network + ", networkFee=" + this.networkFee + ", networkFeeCurrency=" + this.networkFeeCurrency + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderNo);
        parcel.writeString(this.tradeType);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeString(this.baseCurrencyUrl);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.price);
        parcel.writeInt(this.status);
        parcel.writeLong(this.createDate);
        parcel.writeString(this.completedTime);
        parcel.writeInt(this.expireSeconds);
        parcel.writeString(this.type);
        parcel.writeString(this.depositName);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconNight);
        parcel.writeString(this.url);
        parcel.writeString(this.chainUrl);
        parcel.writeInt(this.isConvert ? 1 : 0);
        parcel.writeString(this.payCardNumber);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.depositPlatformCode);
        parcel.writeString(this.channelIcon);
        parcel.writeString(this.channelIconNight);
        parcel.writeString(this.totalFee);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.requestCurrencySymbol);
        parcel.writeString(this.requestCurrencySign);
        parcel.writeString(this.requestAmount);
        parcel.writeString(this.realAmount);
        parcel.writeString(this.last4);
        ConvertOrderDetailBean convertOrderDetailBean = this.convertOrderDetail;
        if (convertOrderDetailBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertOrderDetailBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.network);
        parcel.writeString(this.networkFee);
        parcel.writeString(this.networkFeeCurrency);
    }

    public /* synthetic */ FiatOrderItemBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, long j, String str9, int i4, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, ConvertOrderDetailBean convertOrderDetailBean, String str30, String str31, String str32, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str;
        }
        if ((i & 2) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str3;
        }
        if ((i & 8) == 0) {
            this.baseCurrencySymbol = "";
        } else {
            this.baseCurrencySymbol = str4;
        }
        if ((i & 16) == 0) {
            this.baseCurrencyUrl = "";
        } else {
            this.baseCurrencyUrl = str5;
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
            this.price = "";
        } else {
            this.price = str8;
        }
        if ((i & 256) == 0) {
            this.status = 0;
        } else {
            this.status = i3;
        }
        this.createDate = (i & 512) == 0 ? 0L : j;
        if ((i & 1024) == 0) {
            this.completedTime = "";
        } else {
            this.completedTime = str9;
        }
        if ((i & 2048) == 0) {
            this.expireSeconds = 0;
        } else {
            this.expireSeconds = i4;
        }
        if ((i & 4096) == 0) {
            this.type = "";
        } else {
            this.type = str10;
        }
        if ((i & 8192) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str11;
        }
        if ((i & 16384) == 0) {
            this.icon = "";
        } else {
            this.icon = str12;
        }
        if ((32768 & i) == 0) {
            this.iconNight = "";
        } else {
            this.iconNight = str13;
        }
        if ((65536 & i) == 0) {
            this.url = "";
        } else {
            this.url = str14;
        }
        if ((131072 & i) == 0) {
            this.chainUrl = "";
        } else {
            this.chainUrl = str15;
        }
        this.isConvert = (262144 & i) != 0 ? z : false;
        if ((524288 & i) == 0) {
            this.payCardNumber = "";
        } else {
            this.payCardNumber = str16;
        }
        if ((1048576 & i) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str17;
        }
        if ((2097152 & i) == 0) {
            this.paymentMethodUrl = "";
        } else {
            this.paymentMethodUrl = str18;
        }
        if ((4194304 & i) == 0) {
            this.paymentMethodNightUrl = "";
        } else {
            this.paymentMethodNightUrl = str19;
        }
        if ((8388608 & i) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str20;
        }
        if ((16777216 & i) == 0) {
            this.channelIcon = "";
        } else {
            this.channelIcon = str21;
        }
        if ((33554432 & i) == 0) {
            this.channelIconNight = "";
        } else {
            this.channelIconNight = str22;
        }
        if ((67108864 & i) == 0) {
            this.totalFee = "";
        } else {
            this.totalFee = str23;
        }
        if ((134217728 & i) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str24;
        }
        if ((268435456 & i) == 0) {
            this.requestCurrencySymbol = "";
        } else {
            this.requestCurrencySymbol = str25;
        }
        if ((536870912 & i) == 0) {
            this.requestCurrencySign = "";
        } else {
            this.requestCurrencySign = str26;
        }
        if ((1073741824 & i) == 0) {
            this.requestAmount = "";
        } else {
            this.requestAmount = str27;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.realAmount = "";
        } else {
            this.realAmount = str28;
        }
        if ((i2 & 1) == 0) {
            this.last4 = "";
        } else {
            this.last4 = str29;
        }
        this.convertOrderDetail = (i2 & 2) == 0 ? null : convertOrderDetailBean;
        if ((i2 & 4) == 0) {
            this.network = "";
        } else {
            this.network = str30;
        }
        if ((i2 & 8) == 0) {
            this.networkFee = "";
        } else {
            this.networkFee = str31;
        }
        if ((i2 & 16) == 0) {
            this.networkFeeCurrency = "";
        } else {
            this.networkFeeCurrency = str32;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FiatOrderItemBean fiatOrderItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatOrderItemBean.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatOrderItemBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fiatOrderItemBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fiatOrderItemBean.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.baseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fiatOrderItemBean.baseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fiatOrderItemBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fiatOrderItemBean.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fiatOrderItemBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || fiatOrderItemBean.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, fiatOrderItemBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || fiatOrderItemBean.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, fiatOrderItemBean.createDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.completedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, fiatOrderItemBean.completedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || fiatOrderItemBean.expireSeconds != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, fiatOrderItemBean.expireSeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, fiatOrderItemBean.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, fiatOrderItemBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, fiatOrderItemBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.iconNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, fiatOrderItemBean.iconNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, fiatOrderItemBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.chainUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, fiatOrderItemBean.chainUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || fiatOrderItemBean.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, fiatOrderItemBean.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.payCardNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, fiatOrderItemBean.payCardNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, fiatOrderItemBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.paymentMethodUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, fiatOrderItemBean.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.paymentMethodNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, fiatOrderItemBean.paymentMethodNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, fiatOrderItemBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.channelIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, fiatOrderItemBean.channelIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.channelIconNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, fiatOrderItemBean.channelIconNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.totalFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, fiatOrderItemBean.totalFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, fiatOrderItemBean.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.requestCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, fiatOrderItemBean.requestCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.requestCurrencySign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, fiatOrderItemBean.requestCurrencySign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.requestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, fiatOrderItemBean.requestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.realAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, fiatOrderItemBean.realAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.last4, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, fiatOrderItemBean.last4);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || fiatOrderItemBean.convertOrderDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, ConvertOrderDetailBean$$serializer.INSTANCE, fiatOrderItemBean.convertOrderDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, fiatOrderItemBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) fiatOrderItemBean.networkFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, fiatOrderItemBean.networkFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) && Intrinsics.EZpvd((Object) fiatOrderItemBean.networkFeeCurrency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 36, fiatOrderItemBean.networkFeeCurrency);
    }

    public FiatOrderItemBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, long j, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, ConvertOrderDetailBean convertOrderDetailBean, @NotNull String str30, @NotNull String str31, @NotNull String str32) {
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
        this.orderNo = str;
        this.tradeType = str2;
        this.baseAmount = str3;
        this.baseCurrencySymbol = str4;
        this.baseCurrencyUrl = str5;
        this.quoteAmount = str6;
        this.quoteCurrencySymbol = str7;
        this.price = str8;
        this.status = i;
        this.createDate = j;
        this.completedTime = str9;
        this.expireSeconds = i2;
        this.type = str10;
        this.depositName = str11;
        this.icon = str12;
        this.iconNight = str13;
        this.url = str14;
        this.chainUrl = str15;
        this.isConvert = z;
        this.payCardNumber = str16;
        this.paymentMethod = str17;
        this.paymentMethodUrl = str18;
        this.paymentMethodNightUrl = str19;
        this.depositPlatformCode = str20;
        this.channelIcon = str21;
        this.channelIconNight = str22;
        this.totalFee = str23;
        this.errorCode = str24;
        this.requestCurrencySymbol = str25;
        this.requestCurrencySign = str26;
        this.requestAmount = str27;
        this.realAmount = str28;
        this.last4 = str29;
        this.convertOrderDetail = convertOrderDetailBean;
        this.network = str30;
        this.networkFee = str31;
        this.networkFeeCurrency = str32;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01b8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r77v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r77v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r77v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r77v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r77v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r77v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r77v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r47v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004c: ARITH (r77v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r48v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r77v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005d: ARITH (r77v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r51v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r77v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:0x0078: TERNARY null = ((wrap:int:0x006f: ARITH (r77v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r77v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r77v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r77v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (r77v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r77v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r77v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r77v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r77v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d3: ARITH (r77v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00de: ARITH (r77v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e9: ARITH (r77v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r77v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r77v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (r77v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0115: ARITH (r77v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0120: ARITH (r77v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012b: ARITH (r77v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0136: ARITH (r77v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013f: ARITH (r78v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean:?: TERNARY null = ((wrap:int:0x0148: ARITH (r78v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean) : (r73v0 com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0151: ARITH (r78v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015a: ARITH (r78v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0163: ARITH (r78v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderItemBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FiatOrderItemBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j, String str9, int i2, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, ConvertOrderDetailBean convertOrderDetailBean, String str30, String str31, String str32, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "" : str8, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? 0L : j, (i3 & 1024) != 0 ? "" : str9, (i3 & 2048) != 0 ? 0 : i2, (i3 & 4096) != 0 ? "" : str10, (i3 & 8192) != 0 ? "" : str11, (i3 & 16384) != 0 ? "" : str12, (i3 & 32768) != 0 ? "" : str13, (i3 & 65536) != 0 ? "" : str14, (i3 & 131072) != 0 ? "" : str15, (i3 & 262144) != 0 ? false : z, (i3 & 524288) != 0 ? "" : str16, (i3 & 1048576) != 0 ? "" : str17, (i3 & 2097152) != 0 ? "" : str18, (i3 & 4194304) != 0 ? "" : str19, (i3 & 8388608) != 0 ? "" : str20, (i3 & 16777216) != 0 ? "" : str21, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str22, (i3 & 67108864) != 0 ? "" : str23, (i3 & 134217728) != 0 ? "" : str24, (i3 & 268435456) != 0 ? "" : str25, (i3 & 536870912) != 0 ? "" : str26, (i3 & 1073741824) != 0 ? "" : str27, (i3 & Integer.MIN_VALUE) != 0 ? "" : str28, (i4 & 1) != 0 ? "" : str29, (i4 & 2) != 0 ? null : convertOrderDetailBean, (i4 & 4) != 0 ? "" : str30, (i4 & 8) != 0 ? "" : str31, (i4 & 16) != 0 ? "" : str32);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FiatOrderItemBean> serializer() {
            return FiatOrderItemBean$$serializer.INSTANCE;
        }

        public final FiatOrderItemBean OLrzqt(@NotNull FiatOrderItem fiatOrderItem) {
            Intrinsics.checkNotNullParameter(fiatOrderItem, "");
            String orderNo = fiatOrderItem.getOrderNo();
            String tradeType = fiatOrderItem.getTradeType();
            String baseAmount = fiatOrderItem.getBaseAmount();
            String baseCurrencySymbol = fiatOrderItem.getBaseCurrencySymbol();
            String baseCurrencyUrl = fiatOrderItem.getBaseCurrencyUrl();
            String quoteAmount = fiatOrderItem.getQuoteAmount();
            String quoteCurrencySymbol = fiatOrderItem.getQuoteCurrencySymbol();
            String price = fiatOrderItem.getPrice();
            int status = fiatOrderItem.getStatus();
            long createDate = fiatOrderItem.getCreateDate();
            String completedTime = fiatOrderItem.getCompletedTime();
            int expireSeconds = fiatOrderItem.getExpireSeconds();
            String type = fiatOrderItem.getType();
            String depositName = fiatOrderItem.getDepositName();
            String icon = fiatOrderItem.getIcon();
            String iconNight = fiatOrderItem.getIconNight();
            String url = fiatOrderItem.getUrl();
            String chainUrl = fiatOrderItem.getChainUrl();
            boolean zIsConvert = fiatOrderItem.isConvert();
            String payCardNumber = fiatOrderItem.getPayCardNumber();
            String paymentMethod = fiatOrderItem.getPaymentMethod();
            String paymentMethodUrl = fiatOrderItem.getPaymentMethodUrl();
            String paymentMethodNightUrl = fiatOrderItem.getPaymentMethodNightUrl();
            String depositPlatformCode = fiatOrderItem.getDepositPlatformCode();
            String channelIcon = fiatOrderItem.getChannelIcon();
            String channelIconNight = fiatOrderItem.getChannelIconNight();
            String totalFee = fiatOrderItem.getTotalFee();
            String errorCode = fiatOrderItem.getErrorCode();
            String requestCurrencySymbol = fiatOrderItem.getRequestCurrencySymbol();
            String requestCurrencySign = fiatOrderItem.getRequestCurrencySign();
            String requestAmount = fiatOrderItem.getRequestAmount();
            String realAmount = fiatOrderItem.getRealAmount();
            String last4 = fiatOrderItem.getLast4();
            ConvertOrderDetail convertOrderDetail = fiatOrderItem.getConvertOrderDetail();
            return new FiatOrderItemBean(orderNo, tradeType, baseAmount, baseCurrencySymbol, baseCurrencyUrl, quoteAmount, quoteCurrencySymbol, price, status, createDate, completedTime, expireSeconds, type, depositName, icon, iconNight, url, chainUrl, zIsConvert, payCardNumber, paymentMethod, paymentMethodUrl, paymentMethodNightUrl, depositPlatformCode, channelIcon, channelIconNight, totalFee, errorCode, requestCurrencySymbol, requestCurrencySign, requestAmount, realAmount, last4, convertOrderDetail != null ? ConvertOrderDetailBean.Companion.EZpvd(convertOrderDetail) : null, fiatOrderItem.getNetwork(), fiatOrderItem.getNetworkFee(), fiatOrderItem.getNetworkFeeCurrency());
        }
    }
}
