package com.okinc.buysell.ui.pro.transaction.list.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class FiatThirdPartyOrder implements Parcelable {
    public static final String TYPE_BUY = "buy";
    public static final String TYPE_SELL = "sell";
    private String baseAmount;
    private String baseCurrencySymbol;
    private String chainUrl;
    private ConvertOrderDetailData convertOrderDetail;
    private long createDate;
    private String depositName;
    private String depositPlatformCode;
    private int expireSeconds;
    private String icon;
    private String iconNight;
    private boolean isConvert;
    private String orderNo;
    private String payCardNumber;
    private String paymentMethod;
    private String paymentMethodNightUrl;
    private String paymentMethodUrl;
    private String price;
    private String quoteAmount;
    private String quoteCurrencySymbol;
    private int status;
    private TradeType type;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FiatThirdPartyOrder> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, TradeType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<FiatThirdPartyOrder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatThirdPartyOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FiatThirdPartyOrder(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (TradeType) parcel.readParcelable(FiatThirdPartyOrder.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ConvertOrderDetailData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatThirdPartyOrder[] newArray(int i) {
            return new FiatThirdPartyOrder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatThirdPartyOrder() {
        this((String) null, (String) null, 0L, 0, (String) null, (String) null, (String) null, (String) null, 0, (TradeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (ConvertOrderDetailData) null, (String) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType component10() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.iconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.payCardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailData component19() {
        return this.convertOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.expireSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.price;
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
    public final int component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatThirdPartyOrder copy(@NotNull String str, String str2, long j, int i, String str3, String str4, @NotNull String str5, String str6, int i2, TradeType tradeType, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, ConvertOrderDetailData convertOrderDetailData, String str14, String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new FiatThirdPartyOrder(str, str2, j, i, str3, str4, str5, str6, i2, tradeType, str7, str8, str9, str10, str11, z, str12, str13, convertOrderDetailData, str14, str15, str16);
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
        if (!(obj instanceof FiatThirdPartyOrder)) {
            return false;
        }
        FiatThirdPartyOrder fiatThirdPartyOrder = (FiatThirdPartyOrder) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) fiatThirdPartyOrder.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) fiatThirdPartyOrder.baseCurrencySymbol) && this.createDate == fiatThirdPartyOrder.createDate && this.expireSeconds == fiatThirdPartyOrder.expireSeconds && Intrinsics.EZpvd((Object) this.orderNo, (Object) fiatThirdPartyOrder.orderNo) && Intrinsics.EZpvd((Object) this.price, (Object) fiatThirdPartyOrder.price) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) fiatThirdPartyOrder.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) fiatThirdPartyOrder.quoteCurrencySymbol) && this.status == fiatThirdPartyOrder.status && this.type == fiatThirdPartyOrder.type && Intrinsics.EZpvd((Object) this.depositName, (Object) fiatThirdPartyOrder.depositName) && Intrinsics.EZpvd((Object) this.icon, (Object) fiatThirdPartyOrder.icon) && Intrinsics.EZpvd((Object) this.iconNight, (Object) fiatThirdPartyOrder.iconNight) && Intrinsics.EZpvd((Object) this.url, (Object) fiatThirdPartyOrder.url) && Intrinsics.EZpvd((Object) this.chainUrl, (Object) fiatThirdPartyOrder.chainUrl) && this.isConvert == fiatThirdPartyOrder.isConvert && Intrinsics.EZpvd((Object) this.payCardNumber, (Object) fiatThirdPartyOrder.payCardNumber) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) fiatThirdPartyOrder.paymentMethod) && Intrinsics.EZpvd(this.convertOrderDetail, fiatThirdPartyOrder.convertOrderDetail) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) fiatThirdPartyOrder.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) fiatThirdPartyOrder.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) fiatThirdPartyOrder.depositPlatformCode);
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
    public final String getChainUrl() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailData getConvertOrderDetail() {
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
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.baseAmount.hashCode();
        String str = this.baseCurrencySymbol;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Long.hashCode(this.createDate);
        int iHashCode4 = Integer.hashCode(this.expireSeconds);
        String str2 = this.orderNo;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.price;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = this.quoteAmount.hashCode();
        String str4 = this.quoteCurrencySymbol;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        int iHashCode9 = Integer.hashCode(this.status);
        TradeType tradeType = this.type;
        int iHashCode10 = tradeType == null ? 0 : tradeType.hashCode();
        String str5 = this.depositName;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.icon;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.iconNight;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.url;
        int iHashCode14 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.chainUrl;
        int iHashCode15 = str9 == null ? 0 : str9.hashCode();
        int iHashCode16 = Boolean.hashCode(this.isConvert);
        String str10 = this.payCardNumber;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.paymentMethod;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        ConvertOrderDetailData convertOrderDetailData = this.convertOrderDetail;
        int iHashCode19 = convertOrderDetailData == null ? 0 : convertOrderDetailData.hashCode();
        String str12 = this.paymentMethodUrl;
        int iHashCode20 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.paymentMethodNightUrl;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str13 == null ? 0 : str13.hashCode())) * 31) + this.depositPlatformCode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencySymbol(String str) {
        this.baseCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainUrl(String str) {
        this.chainUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvert(boolean z) {
        this.isConvert = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertOrderDetail(ConvertOrderDetailData convertOrderDetailData) {
        this.convertOrderDetail = convertOrderDetailData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateDate(long j) {
        this.createDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositName(String str) {
        this.depositName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositPlatformCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositPlatformCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireSeconds(int i) {
        this.expireSeconds = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconNight(String str) {
        this.iconNight = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderNo(String str) {
        this.orderNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCardNumber(String str) {
        this.payCardNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(String str) {
        this.paymentMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodNightUrl(String str) {
        this.paymentMethodNightUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodUrl(String str) {
        this.paymentMethodUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencySymbol(String str) {
        this.quoteCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(TradeType tradeType) {
        this.type = tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatThirdPartyOrder(baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", createDate=" + this.createDate + ", expireSeconds=" + this.expireSeconds + ", orderNo=" + this.orderNo + ", price=" + this.price + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", status=" + this.status + ", type=" + this.type + ", depositName=" + this.depositName + ", icon=" + this.icon + ", iconNight=" + this.iconNight + ", url=" + this.url + ", chainUrl=" + this.chainUrl + ", isConvert=" + this.isConvert + ", payCardNumber=" + this.payCardNumber + ", paymentMethod=" + this.paymentMethod + ", convertOrderDetail=" + this.convertOrderDetail + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", depositPlatformCode=" + this.depositPlatformCode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeLong(this.createDate);
        parcel.writeInt(this.expireSeconds);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.price);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeInt(this.status);
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.depositName);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconNight);
        parcel.writeString(this.url);
        parcel.writeString(this.chainUrl);
        parcel.writeInt(this.isConvert ? 1 : 0);
        parcel.writeString(this.payCardNumber);
        parcel.writeString(this.paymentMethod);
        ConvertOrderDetailData convertOrderDetailData = this.convertOrderDetail;
        if (convertOrderDetailData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertOrderDetailData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.depositPlatformCode);
    }

    public /* synthetic */ FiatThirdPartyOrder(int i, String str, String str2, long j, int i2, String str3, String str4, String str5, String str6, int i3, TradeType tradeType, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, ConvertOrderDetailData convertOrderDetailData, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrencySymbol = null;
        } else {
            this.baseCurrencySymbol = str2;
        }
        this.createDate = (i & 4) == 0 ? 0L : j;
        if ((i & 8) == 0) {
            this.expireSeconds = 0;
        } else {
            this.expireSeconds = i2;
        }
        if ((i & 16) == 0) {
            this.orderNo = null;
        } else {
            this.orderNo = str3;
        }
        if ((i & 32) == 0) {
            this.price = null;
        } else {
            this.price = str4;
        }
        if ((i & 64) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str5;
        }
        if ((i & 128) == 0) {
            this.quoteCurrencySymbol = null;
        } else {
            this.quoteCurrencySymbol = str6;
        }
        if ((i & 256) == 0) {
            this.status = 0;
        } else {
            this.status = i3;
        }
        this.type = (i & 512) == 0 ? TradeType.BUY : tradeType;
        if ((i & 1024) == 0) {
            this.depositName = null;
        } else {
            this.depositName = str7;
        }
        if ((i & 2048) == 0) {
            this.icon = null;
        } else {
            this.icon = str8;
        }
        if ((i & 4096) == 0) {
            this.iconNight = null;
        } else {
            this.iconNight = str9;
        }
        if ((i & 8192) == 0) {
            this.url = null;
        } else {
            this.url = str10;
        }
        if ((i & 16384) == 0) {
            this.chainUrl = null;
        } else {
            this.chainUrl = str11;
        }
        if ((32768 & i) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z;
        }
        if ((65536 & i) == 0) {
            this.payCardNumber = null;
        } else {
            this.payCardNumber = str12;
        }
        if ((131072 & i) == 0) {
            this.paymentMethod = null;
        } else {
            this.paymentMethod = str13;
        }
        if ((262144 & i) == 0) {
            this.convertOrderDetail = null;
        } else {
            this.convertOrderDetail = convertOrderDetailData;
        }
        if ((524288 & i) == 0) {
            this.paymentMethodUrl = null;
        } else {
            this.paymentMethodUrl = str14;
        }
        if ((1048576 & i) == 0) {
            this.paymentMethodNightUrl = null;
        } else {
            this.paymentMethodNightUrl = str15;
        }
        if ((i & 2097152) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(FiatThirdPartyOrder fiatThirdPartyOrder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatThirdPartyOrder.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatThirdPartyOrder.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fiatThirdPartyOrder.baseCurrencySymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, fiatThirdPartyOrder.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fiatThirdPartyOrder.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, fiatThirdPartyOrder.createDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fiatThirdPartyOrder.expireSeconds != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, fiatThirdPartyOrder.expireSeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fiatThirdPartyOrder.orderNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, fiatThirdPartyOrder.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || fiatThirdPartyOrder.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, fiatThirdPartyOrder.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fiatThirdPartyOrder.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fiatThirdPartyOrder.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || fiatThirdPartyOrder.quoteCurrencySymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, fiatThirdPartyOrder.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || fiatThirdPartyOrder.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, fiatThirdPartyOrder.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || fiatThirdPartyOrder.type != TradeType.BUY) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], fiatThirdPartyOrder.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || fiatThirdPartyOrder.depositName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, fiatThirdPartyOrder.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || fiatThirdPartyOrder.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, fiatThirdPartyOrder.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || fiatThirdPartyOrder.iconNight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, fiatThirdPartyOrder.iconNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || fiatThirdPartyOrder.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, fiatThirdPartyOrder.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || fiatThirdPartyOrder.chainUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, fiatThirdPartyOrder.chainUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || fiatThirdPartyOrder.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, fiatThirdPartyOrder.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || fiatThirdPartyOrder.payCardNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, fiatThirdPartyOrder.payCardNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || fiatThirdPartyOrder.paymentMethod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, fiatThirdPartyOrder.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || fiatThirdPartyOrder.convertOrderDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, ConvertOrderDetailData$$serializer.INSTANCE, fiatThirdPartyOrder.convertOrderDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || fiatThirdPartyOrder.paymentMethodUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, fiatThirdPartyOrder.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || fiatThirdPartyOrder.paymentMethodNightUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, fiatThirdPartyOrder.paymentMethodNightUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) fiatThirdPartyOrder.depositPlatformCode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, fiatThirdPartyOrder.depositPlatformCode);
    }

    public FiatThirdPartyOrder(@NotNull String str, String str2, long j, int i, String str3, String str4, @NotNull String str5, String str6, int i2, TradeType tradeType, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, ConvertOrderDetailData convertOrderDetailData, String str14, String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.baseAmount = str;
        this.baseCurrencySymbol = str2;
        this.createDate = j;
        this.expireSeconds = i;
        this.orderNo = str3;
        this.price = str4;
        this.quoteAmount = str5;
        this.quoteCurrencySymbol = str6;
        this.status = i2;
        this.type = tradeType;
        this.depositName = str7;
        this.icon = str8;
        this.iconNight = str9;
        this.url = str10;
        this.chainUrl = str11;
        this.isConvert = z;
        this.payCardNumber = str12;
        this.paymentMethod = str13;
        this.convertOrderDetail = convertOrderDetailData;
        this.paymentMethodUrl = str14;
        this.paymentMethodNightUrl = str15;
        this.depositPlatformCode = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00fe: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x004d: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: SGET  A[WRAPPED] (LINE:22) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r35v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:0x0078: TERNARY null = ((wrap:int:0x0070: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0085: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData) : (r44v0 com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder.<init>(java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FiatThirdPartyOrder(String str, String str2, long j, int i, String str3, String str4, String str5, String str6, int i2, TradeType tradeType, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, ConvertOrderDetailData convertOrderDetailData, String str14, String str15, String str16, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? TradeType.BUY : tradeType, (i3 & 1024) != 0 ? null : str7, (i3 & 2048) != 0 ? null : str8, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? null : str10, (i3 & 16384) != 0 ? null : str11, (i3 & 32768) != 0 ? false : z, (i3 & 65536) != 0 ? null : str12, (i3 & 131072) != 0 ? null : str13, (i3 & 262144) != 0 ? null : convertOrderDetailData, (i3 & 524288) != 0 ? null : str14, (i3 & 1048576) != 0 ? null : str15, (i3 & 2097152) != 0 ? "" : str16);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FiatThirdPartyOrder> serializer() {
            return FiatThirdPartyOrder$$serializer.INSTANCE;
        }
    }
}
