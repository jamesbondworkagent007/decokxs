package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RecurringBuyOrderResponseBean implements Parcelable {
    private final String address;
    private final String baseAmount;
    private final String baseCurrencyIcon;
    private final String baseCurrencySymbol;
    private final String channelFee;
    private final RecurringBuyConvertOrderDetailResponseBean convertOrderDetail;
    private final long createDate;
    private final String depositName;
    private final String failReason;
    private final String icon;
    private final boolean isConvert;
    private final String lastFour;
    private final String logoUrl;
    private final String orderNo;
    private final String payCardNumber;
    private final String paymentMethod;
    private final String paymentMethodNightUrl;
    private final String paymentMethodUrl;
    private final String price;
    private final String quoteAmount;
    private final String quoteCurrencySymbol;
    private final String quoteSymbol;
    private final String realOrderNo;
    private final String status;
    private final String txId;
    private final String type;
    private final String url;
    private final String userCountry;
    private final String withdrawStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyOrderResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringBuyOrderResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyOrderResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyOrderResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : RecurringBuyConvertOrderDetailResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyOrderResponseBean[] newArray(int i) {
            return new RecurringBuyOrderResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.lastFour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.realOrderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyConvertOrderDetailResponseBean component21() {
        return this.convertOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.payCardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.withdrawStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.userCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyOrderResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, long j, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z, RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
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
        return new RecurringBuyOrderResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, j, str16, str17, str18, z, recurringBuyConvertOrderDetailResponseBean, str19, str20, str21, str22, str23, str24, str25, str26);
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
        if (!(obj instanceof RecurringBuyOrderResponseBean)) {
            return false;
        }
        RecurringBuyOrderResponseBean recurringBuyOrderResponseBean = (RecurringBuyOrderResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) recurringBuyOrderResponseBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyOrderResponseBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) recurringBuyOrderResponseBean.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyOrderResponseBean.quoteAmount) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyOrderResponseBean.status) && Intrinsics.EZpvd((Object) this.withdrawStatus, (Object) recurringBuyOrderResponseBean.withdrawStatus) && Intrinsics.EZpvd((Object) this.txId, (Object) recurringBuyOrderResponseBean.txId) && Intrinsics.EZpvd((Object) this.failReason, (Object) recurringBuyOrderResponseBean.failReason) && Intrinsics.EZpvd((Object) this.userCountry, (Object) recurringBuyOrderResponseBean.userCountry) && Intrinsics.EZpvd((Object) this.address, (Object) recurringBuyOrderResponseBean.address) && Intrinsics.EZpvd((Object) this.lastFour, (Object) recurringBuyOrderResponseBean.lastFour) && Intrinsics.EZpvd((Object) this.type, (Object) recurringBuyOrderResponseBean.type) && Intrinsics.EZpvd((Object) this.orderNo, (Object) recurringBuyOrderResponseBean.orderNo) && Intrinsics.EZpvd((Object) this.realOrderNo, (Object) recurringBuyOrderResponseBean.realOrderNo) && Intrinsics.EZpvd((Object) this.depositName, (Object) recurringBuyOrderResponseBean.depositName) && this.createDate == recurringBuyOrderResponseBean.createDate && Intrinsics.EZpvd((Object) this.price, (Object) recurringBuyOrderResponseBean.price) && Intrinsics.EZpvd((Object) this.icon, (Object) recurringBuyOrderResponseBean.icon) && Intrinsics.EZpvd((Object) this.url, (Object) recurringBuyOrderResponseBean.url) && this.isConvert == recurringBuyOrderResponseBean.isConvert && Intrinsics.EZpvd(this.convertOrderDetail, recurringBuyOrderResponseBean.convertOrderDetail) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) recurringBuyOrderResponseBean.logoUrl) && Intrinsics.EZpvd((Object) this.channelFee, (Object) recurringBuyOrderResponseBean.channelFee) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyOrderResponseBean.quoteSymbol) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) recurringBuyOrderResponseBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) recurringBuyOrderResponseBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) recurringBuyOrderResponseBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.payCardNumber, (Object) recurringBuyOrderResponseBean.payCardNumber) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyOrderResponseBean.baseCurrencyIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyIcon() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFee() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyConvertOrderDetailResponseBean getConvertOrderDetail() {
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
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
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
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealOrderNo() {
        return this.realOrderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
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
    public final String getUserCountry() {
        return this.userCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawStatus() {
        return this.withdrawStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.baseCurrencySymbol.hashCode();
        int iHashCode2 = this.quoteCurrencySymbol.hashCode();
        int iHashCode3 = this.baseAmount.hashCode();
        int iHashCode4 = this.quoteAmount.hashCode();
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = this.withdrawStatus.hashCode();
        int iHashCode7 = this.txId.hashCode();
        String str = this.failReason;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.userCountry.hashCode();
        int iHashCode10 = this.address.hashCode();
        int iHashCode11 = this.lastFour.hashCode();
        int iHashCode12 = this.type.hashCode();
        int iHashCode13 = this.orderNo.hashCode();
        int iHashCode14 = this.realOrderNo.hashCode();
        int iHashCode15 = this.depositName.hashCode();
        int iHashCode16 = Long.hashCode(this.createDate);
        int iHashCode17 = this.price.hashCode();
        int iHashCode18 = this.icon.hashCode();
        int iHashCode19 = this.url.hashCode();
        int iHashCode20 = Boolean.hashCode(this.isConvert);
        RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean = this.convertOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (recurringBuyConvertOrderDetailResponseBean == null ? 0 : recurringBuyConvertOrderDetailResponseBean.hashCode())) * 31) + this.logoUrl.hashCode()) * 31) + this.channelFee.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.paymentMethodUrl.hashCode()) * 31) + this.paymentMethodNightUrl.hashCode()) * 31) + this.payCardNumber.hashCode()) * 31) + this.baseCurrencyIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyOrderResponseBean(baseCurrencySymbol=" + this.baseCurrencySymbol + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", status=" + this.status + ", withdrawStatus=" + this.withdrawStatus + ", txId=" + this.txId + ", failReason=" + this.failReason + ", userCountry=" + this.userCountry + ", address=" + this.address + ", lastFour=" + this.lastFour + ", type=" + this.type + ", orderNo=" + this.orderNo + ", realOrderNo=" + this.realOrderNo + ", depositName=" + this.depositName + ", createDate=" + this.createDate + ", price=" + this.price + ", icon=" + this.icon + ", url=" + this.url + ", isConvert=" + this.isConvert + ", convertOrderDetail=" + this.convertOrderDetail + ", logoUrl=" + this.logoUrl + ", channelFee=" + this.channelFee + ", quoteSymbol=" + this.quoteSymbol + ", paymentMethod=" + this.paymentMethod + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", payCardNumber=" + this.payCardNumber + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.status);
        parcel.writeString(this.withdrawStatus);
        parcel.writeString(this.txId);
        parcel.writeString(this.failReason);
        parcel.writeString(this.userCountry);
        parcel.writeString(this.address);
        parcel.writeString(this.lastFour);
        parcel.writeString(this.type);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.realOrderNo);
        parcel.writeString(this.depositName);
        parcel.writeLong(this.createDate);
        parcel.writeString(this.price);
        parcel.writeString(this.icon);
        parcel.writeString(this.url);
        parcel.writeInt(this.isConvert ? 1 : 0);
        RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean = this.convertOrderDetail;
        if (recurringBuyConvertOrderDetailResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recurringBuyConvertOrderDetailResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.channelFee);
        parcel.writeString(this.quoteSymbol);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.payCardNumber);
        parcel.writeString(this.baseCurrencyIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyOrderResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyOrderResponseBean> serializer() {
            return RecurringBuyOrderResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyOrderResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, String str16, String str17, String str18, boolean z, RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        if (268435455 != (i & 268435455)) {
            PluginExceptionsKt.throwMissingFieldException(i, 268435455, RecurringBuyOrderResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.baseCurrencySymbol = str;
        this.quoteCurrencySymbol = str2;
        this.baseAmount = str3;
        this.quoteAmount = str4;
        this.status = str5;
        this.withdrawStatus = str6;
        this.txId = str7;
        this.failReason = str8;
        this.userCountry = str9;
        this.address = str10;
        this.lastFour = str11;
        this.type = str12;
        this.orderNo = str13;
        this.realOrderNo = str14;
        this.depositName = str15;
        this.createDate = j;
        this.price = str16;
        this.icon = str17;
        this.url = str18;
        this.isConvert = z;
        this.convertOrderDetail = recurringBuyConvertOrderDetailResponseBean;
        this.logoUrl = str19;
        this.channelFee = str20;
        this.quoteSymbol = str21;
        this.paymentMethod = str22;
        this.paymentMethodUrl = str23;
        this.paymentMethodNightUrl = str24;
        this.payCardNumber = str25;
        this.baseCurrencyIcon = (i & 268435456) == 0 ? "" : str26;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyOrderResponseBean recurringBuyOrderResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyOrderResponseBean.baseCurrencySymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyOrderResponseBean.quoteCurrencySymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyOrderResponseBean.baseAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyOrderResponseBean.quoteAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBuyOrderResponseBean.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, recurringBuyOrderResponseBean.withdrawStatus);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBuyOrderResponseBean.txId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, recurringBuyOrderResponseBean.failReason);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBuyOrderResponseBean.userCountry);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, recurringBuyOrderResponseBean.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, recurringBuyOrderResponseBean.lastFour);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, recurringBuyOrderResponseBean.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, recurringBuyOrderResponseBean.orderNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, recurringBuyOrderResponseBean.realOrderNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, recurringBuyOrderResponseBean.depositName);
        compositeEncoder.encodeLongElement(serialDescriptor, 15, recurringBuyOrderResponseBean.createDate);
        compositeEncoder.encodeStringElement(serialDescriptor, 16, recurringBuyOrderResponseBean.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 17, recurringBuyOrderResponseBean.icon);
        compositeEncoder.encodeStringElement(serialDescriptor, 18, recurringBuyOrderResponseBean.url);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 19, recurringBuyOrderResponseBean.isConvert);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, RecurringBuyConvertOrderDetailResponseBean$$serializer.INSTANCE, recurringBuyOrderResponseBean.convertOrderDetail);
        compositeEncoder.encodeStringElement(serialDescriptor, 21, recurringBuyOrderResponseBean.logoUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 22, recurringBuyOrderResponseBean.channelFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 23, recurringBuyOrderResponseBean.quoteSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 24, recurringBuyOrderResponseBean.paymentMethod);
        compositeEncoder.encodeStringElement(serialDescriptor, 25, recurringBuyOrderResponseBean.paymentMethodUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 26, recurringBuyOrderResponseBean.paymentMethodNightUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 27, recurringBuyOrderResponseBean.payCardNumber);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && Intrinsics.EZpvd((Object) recurringBuyOrderResponseBean.baseCurrencyIcon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 28, recurringBuyOrderResponseBean.baseCurrencyIcon);
    }

    public RecurringBuyOrderResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, long j, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z, RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
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
        this.baseCurrencySymbol = str;
        this.quoteCurrencySymbol = str2;
        this.baseAmount = str3;
        this.quoteAmount = str4;
        this.status = str5;
        this.withdrawStatus = str6;
        this.txId = str7;
        this.failReason = str8;
        this.userCountry = str9;
        this.address = str10;
        this.lastFour = str11;
        this.type = str12;
        this.orderNo = str13;
        this.realOrderNo = str14;
        this.depositName = str15;
        this.createDate = j;
        this.price = str16;
        this.icon = str17;
        this.url = str18;
        this.isConvert = z;
        this.convertOrderDetail = recurringBuyConvertOrderDetailResponseBean;
        this.logoUrl = str19;
        this.channelFee = str20;
        this.quoteSymbol = str21;
        this.paymentMethod = str22;
        this.paymentMethodUrl = str23;
        this.paymentMethodNightUrl = str24;
        this.payCardNumber = str25;
        this.baseCurrencyIcon = str26;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (r48v0 long)
  (r50v0 java.lang.String)
  (r51v0 java.lang.String)
  (r52v0 java.lang.String)
  (r53v0 boolean)
  (r54v0 com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 java.lang.String)
  (r58v0 java.lang.String)
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
  (r61v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r63v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyOrderResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyOrderResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, String str16, String str17, String str18, boolean z, RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, j, str16, str17, str18, z, recurringBuyConvertOrderDetailResponseBean, str19, str20, str21, str22, str23, str24, str25, (i & 268435456) != 0 ? "" : str26);
    }
}
