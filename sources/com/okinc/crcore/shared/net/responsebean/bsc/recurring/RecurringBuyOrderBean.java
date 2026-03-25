package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyOrderResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyOrderBean implements Parcelable {
    private final String address;
    private final String baseAmount;
    private final String baseCurrencyIcon;
    private final String baseCurrencySymbol;
    private final String channelFee;
    private final RecurringBuyConvertOrderDetailBean convertOrderDetail;
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
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyOrderBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringBuyOrderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyOrderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyOrderBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, RecurringBuyConvertOrderDetailBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyOrderBean[] newArray(int i) {
            return new RecurringBuyOrderBean[i];
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
    public final RecurringBuyConvertOrderDetailBean component21() {
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
    public final RecurringBuyOrderBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, long j, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z, @NotNull RecurringBuyConvertOrderDetailBean recurringBuyConvertOrderDetailBean, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26) {
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
        Intrinsics.checkNotNullParameter(recurringBuyConvertOrderDetailBean, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new RecurringBuyOrderBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, j, str16, str17, str18, z, recurringBuyConvertOrderDetailBean, str19, str20, str21, str22, str23, str24, str25, str26);
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
        if (!(obj instanceof RecurringBuyOrderBean)) {
            return false;
        }
        RecurringBuyOrderBean recurringBuyOrderBean = (RecurringBuyOrderBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) recurringBuyOrderBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyOrderBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) recurringBuyOrderBean.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyOrderBean.quoteAmount) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyOrderBean.status) && Intrinsics.EZpvd((Object) this.withdrawStatus, (Object) recurringBuyOrderBean.withdrawStatus) && Intrinsics.EZpvd((Object) this.txId, (Object) recurringBuyOrderBean.txId) && Intrinsics.EZpvd((Object) this.failReason, (Object) recurringBuyOrderBean.failReason) && Intrinsics.EZpvd((Object) this.userCountry, (Object) recurringBuyOrderBean.userCountry) && Intrinsics.EZpvd((Object) this.address, (Object) recurringBuyOrderBean.address) && Intrinsics.EZpvd((Object) this.lastFour, (Object) recurringBuyOrderBean.lastFour) && Intrinsics.EZpvd((Object) this.type, (Object) recurringBuyOrderBean.type) && Intrinsics.EZpvd((Object) this.orderNo, (Object) recurringBuyOrderBean.orderNo) && Intrinsics.EZpvd((Object) this.realOrderNo, (Object) recurringBuyOrderBean.realOrderNo) && Intrinsics.EZpvd((Object) this.depositName, (Object) recurringBuyOrderBean.depositName) && this.createDate == recurringBuyOrderBean.createDate && Intrinsics.EZpvd((Object) this.price, (Object) recurringBuyOrderBean.price) && Intrinsics.EZpvd((Object) this.icon, (Object) recurringBuyOrderBean.icon) && Intrinsics.EZpvd((Object) this.url, (Object) recurringBuyOrderBean.url) && this.isConvert == recurringBuyOrderBean.isConvert && Intrinsics.EZpvd(this.convertOrderDetail, recurringBuyOrderBean.convertOrderDetail) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) recurringBuyOrderBean.logoUrl) && Intrinsics.EZpvd((Object) this.channelFee, (Object) recurringBuyOrderBean.channelFee) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyOrderBean.quoteSymbol) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) recurringBuyOrderBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) recurringBuyOrderBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) recurringBuyOrderBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.payCardNumber, (Object) recurringBuyOrderBean.payCardNumber) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyOrderBean.baseCurrencyIcon);
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
    public final RecurringBuyConvertOrderDetailBean getConvertOrderDetail() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.userCountry.hashCode()) * 31) + this.address.hashCode()) * 31) + this.lastFour.hashCode()) * 31) + this.type.hashCode()) * 31) + this.orderNo.hashCode()) * 31) + this.realOrderNo.hashCode()) * 31) + this.depositName.hashCode()) * 31) + Long.hashCode(this.createDate)) * 31) + this.price.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isConvert)) * 31) + this.convertOrderDetail.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + this.channelFee.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.paymentMethodUrl.hashCode()) * 31) + this.paymentMethodNightUrl.hashCode()) * 31) + this.payCardNumber.hashCode()) * 31) + this.baseCurrencyIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyOrderBean(baseCurrencySymbol=" + this.baseCurrencySymbol + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", status=" + this.status + ", withdrawStatus=" + this.withdrawStatus + ", txId=" + this.txId + ", failReason=" + this.failReason + ", userCountry=" + this.userCountry + ", address=" + this.address + ", lastFour=" + this.lastFour + ", type=" + this.type + ", orderNo=" + this.orderNo + ", realOrderNo=" + this.realOrderNo + ", depositName=" + this.depositName + ", createDate=" + this.createDate + ", price=" + this.price + ", icon=" + this.icon + ", url=" + this.url + ", isConvert=" + this.isConvert + ", convertOrderDetail=" + this.convertOrderDetail + ", logoUrl=" + this.logoUrl + ", channelFee=" + this.channelFee + ", quoteSymbol=" + this.quoteSymbol + ", paymentMethod=" + this.paymentMethod + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", payCardNumber=" + this.payCardNumber + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ")";
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
        this.convertOrderDetail.writeToParcel(parcel, i);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.channelFee);
        parcel.writeString(this.quoteSymbol);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.payCardNumber);
        parcel.writeString(this.baseCurrencyIcon);
    }

    public RecurringBuyOrderBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, long j, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z, @NotNull RecurringBuyConvertOrderDetailBean recurringBuyConvertOrderDetailBean, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26) {
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
        Intrinsics.checkNotNullParameter(recurringBuyConvertOrderDetailBean, "");
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
        this.convertOrderDetail = recurringBuyConvertOrderDetailBean;
        this.logoUrl = str19;
        this.channelFee = str20;
        this.quoteSymbol = str21;
        this.paymentMethod = str22;
        this.paymentMethodUrl = str23;
        this.paymentMethodNightUrl = str24;
        this.payCardNumber = str25;
        this.baseCurrencyIcon = str26;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (r63v0 java.lang.String)
  (r64v0 java.lang.String)
  (r65v0 java.lang.String)
  (r66v0 java.lang.String)
  (r67v0 java.lang.String)
  (r68v0 java.lang.String)
  (r69v0 java.lang.String)
  (r70v0 java.lang.String)
  (r71v0 java.lang.String)
  (r72v0 java.lang.String)
  (r73v0 java.lang.String)
  (r74v0 java.lang.String)
  (r75v0 java.lang.String)
  (r76v0 long)
  (r78v0 java.lang.String)
  (r79v0 java.lang.String)
  (r80v0 java.lang.String)
  (r81v0 boolean)
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r91v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0 long)
  (null java.lang.String)
  (null java.lang.String)
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  (null java.lang.String)
  (0 int)
  (0 int)
  (0 int)
  (4194303 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, double, double, java.lang.String, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, double, double, java.lang.String, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r82v0 com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean))
  (r83v0 java.lang.String)
  (r84v0 java.lang.String)
  (r85v0 java.lang.String)
  (r86v0 java.lang.String)
  (r87v0 java.lang.String)
  (r88v0 java.lang.String)
  (r89v0 java.lang.String)
  (r90v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyOrderBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyOrderBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, String str16, String str17, String str18, boolean z, RecurringBuyConvertOrderDetailBean recurringBuyConvertOrderDetailBean, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, j, str16, str17, str18, z, (i & 1048576) != 0 ? new RecurringBuyConvertOrderDetailBean(null, null, null, null, null, null, null, null, null, 0, null, null, null, 0L, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, 0, 0, 0, 4194303, null) : recurringBuyConvertOrderDetailBean, str19, str20, str21, str22, str23, str24, str25, str26);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyOrderBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringBuyOrderBean AEQbTJ(@NotNull RecurringBuyOrderResponseBean recurringBuyOrderResponseBean) {
            RecurringBuyConvertOrderDetailBean recurringBuyConvertOrderDetailBeanOLrzqt;
            Intrinsics.checkNotNullParameter(recurringBuyOrderResponseBean, "");
            String strGEmmrt = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getBaseCurrencySymbol());
            String strGEmmrt2 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getQuoteCurrencySymbol());
            String strGEmmrt3 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getBaseAmount());
            String strGEmmrt4 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getQuoteAmount());
            String strGEmmrt5 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getStatus());
            String strGEmmrt6 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getWithdrawStatus());
            String strGEmmrt7 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getTxId());
            String failReason = recurringBuyOrderResponseBean.getFailReason();
            String strGEmmrt8 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getUserCountry());
            String strGEmmrt9 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getAddress());
            String strGEmmrt10 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getLastFour());
            String strGEmmrt11 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getType());
            String strGEmmrt12 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getOrderNo());
            String strGEmmrt13 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getRealOrderNo());
            String strGEmmrt14 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getDepositName());
            long jValueOf = C33129mqd.valueOf(Long.valueOf(recurringBuyOrderResponseBean.getCreateDate()));
            String strGEmmrt15 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getPrice());
            String strGEmmrt16 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getIcon());
            String strGEmmrt17 = C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getUrl());
            boolean zIsConvert = recurringBuyOrderResponseBean.isConvert();
            RecurringBuyConvertOrderDetailResponseBean convertOrderDetail = recurringBuyOrderResponseBean.getConvertOrderDetail();
            return new RecurringBuyOrderBean(strGEmmrt, strGEmmrt2, strGEmmrt3, strGEmmrt4, strGEmmrt5, strGEmmrt6, strGEmmrt7, failReason, strGEmmrt8, strGEmmrt9, strGEmmrt10, strGEmmrt11, strGEmmrt12, strGEmmrt13, strGEmmrt14, jValueOf, strGEmmrt15, strGEmmrt16, strGEmmrt17, zIsConvert, (convertOrderDetail == null || (recurringBuyConvertOrderDetailBeanOLrzqt = RecurringBuyConvertOrderDetailBean.Companion.OLrzqt(convertOrderDetail)) == null) ? new RecurringBuyConvertOrderDetailBean(null, null, null, null, null, null, null, null, null, 0, null, null, null, 0L, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, 0, 0, 0, 4194303, null) : recurringBuyConvertOrderDetailBeanOLrzqt, C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getLogoUrl()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getChannelFee()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getQuoteSymbol()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getPaymentMethod()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getPaymentMethodUrl()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getPaymentMethodNightUrl()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getPayCardNumber()), C33129mqd.gEmmrt(recurringBuyOrderResponseBean.getBaseCurrencyIcon()));
        }
    }
}
