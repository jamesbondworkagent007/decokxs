package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RecurringBuyConvertOrderDetailResponseBean implements Parcelable {
    private String baseAmount;
    private String baseCurrency;
    private int baseCurrencyId;
    private String baseCurrencyName;
    private String baseCurrencyUrl;
    private String brokerId;
    private String convertBaseAmount;
    private String convertBaseCurrency;
    private int convertBaseCurrencyId;
    private String convertBaseCurrencyName;
    private String convertBaseCurrencyUrl;
    private String convertUrl;
    private long createdDate;
    private String exchangeRate;
    private String failReason;
    private String modifyDate;
    private int orderStatus;
    private String preExchangeRate;
    private int priceScale;
    private double realPremiumRate;
    private double slippageTolerance;
    private String userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyConvertOrderDetailResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringBuyConvertOrderDetailResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyConvertOrderDetailResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyConvertOrderDetailResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyConvertOrderDetailResponseBean[] newArray(int i) {
            return new RecurringBuyConvertOrderDetailResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyConvertOrderDetailResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, 0, 0, 0, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.preExchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.convertUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component14() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.modifyDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component17() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component18() {
        return this.realPremiumRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.convertBaseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.baseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.convertBaseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.convertBaseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.convertBaseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyConvertOrderDetailResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @NotNull String str13, @NotNull String str14, double d, double d2, @NotNull String str15, int i2, int i3, int i4) {
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
        return new RecurringBuyConvertOrderDetailResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, i, str10, str11, str12, j, str13, str14, d, d2, str15, i2, i3, i4);
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
        if (!(obj instanceof RecurringBuyConvertOrderDetailResponseBean)) {
            return false;
        }
        RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean = (RecurringBuyConvertOrderDetailResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) recurringBuyConvertOrderDetailResponseBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyConvertOrderDetailResponseBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyName, (Object) recurringBuyConvertOrderDetailResponseBean.baseCurrencyName) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) recurringBuyConvertOrderDetailResponseBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.brokerId, (Object) recurringBuyConvertOrderDetailResponseBean.brokerId) && Intrinsics.EZpvd((Object) this.convertBaseAmount, (Object) recurringBuyConvertOrderDetailResponseBean.convertBaseAmount) && Intrinsics.EZpvd((Object) this.convertBaseCurrency, (Object) recurringBuyConvertOrderDetailResponseBean.convertBaseCurrency) && Intrinsics.EZpvd((Object) this.convertBaseCurrencyName, (Object) recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyName) && Intrinsics.EZpvd((Object) this.convertBaseCurrencyUrl, (Object) recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyUrl) && this.orderStatus == recurringBuyConvertOrderDetailResponseBean.orderStatus && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) recurringBuyConvertOrderDetailResponseBean.exchangeRate) && Intrinsics.EZpvd((Object) this.preExchangeRate, (Object) recurringBuyConvertOrderDetailResponseBean.preExchangeRate) && Intrinsics.EZpvd((Object) this.convertUrl, (Object) recurringBuyConvertOrderDetailResponseBean.convertUrl) && this.createdDate == recurringBuyConvertOrderDetailResponseBean.createdDate && Intrinsics.EZpvd((Object) this.modifyDate, (Object) recurringBuyConvertOrderDetailResponseBean.modifyDate) && Intrinsics.EZpvd((Object) this.userId, (Object) recurringBuyConvertOrderDetailResponseBean.userId) && Double.compare(this.slippageTolerance, recurringBuyConvertOrderDetailResponseBean.slippageTolerance) == 0 && Double.compare(this.realPremiumRate, recurringBuyConvertOrderDetailResponseBean.realPremiumRate) == 0 && Intrinsics.EZpvd((Object) this.failReason, (Object) recurringBuyConvertOrderDetailResponseBean.failReason) && this.priceScale == recurringBuyConvertOrderDetailResponseBean.priceScale && this.convertBaseCurrencyId == recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyId && this.baseCurrencyId == recurringBuyConvertOrderDetailResponseBean.baseCurrencyId;
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
    public final int getBaseCurrencyId() {
        return this.baseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyUrl() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrokerId() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseAmount() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseCurrency() {
        return this.convertBaseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConvertBaseCurrencyId() {
        return this.convertBaseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseCurrencyName() {
        return this.convertBaseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseCurrencyUrl() {
        return this.convertBaseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertUrl() {
        return this.convertUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModifyDate() {
        return this.modifyDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreExchangeRate() {
        return this.preExchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriceScale() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getRealPremiumRate() {
        return this.realPremiumRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getSlippageTolerance() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.baseAmount.hashCode() * 31) + this.baseCurrency.hashCode()) * 31) + this.baseCurrencyName.hashCode()) * 31) + this.baseCurrencyUrl.hashCode()) * 31) + this.brokerId.hashCode()) * 31) + this.convertBaseAmount.hashCode()) * 31) + this.convertBaseCurrency.hashCode()) * 31) + this.convertBaseCurrencyName.hashCode()) * 31) + this.convertBaseCurrencyUrl.hashCode()) * 31) + Integer.hashCode(this.orderStatus)) * 31) + this.exchangeRate.hashCode()) * 31) + this.preExchangeRate.hashCode()) * 31) + this.convertUrl.hashCode()) * 31) + Long.hashCode(this.createdDate)) * 31) + this.modifyDate.hashCode()) * 31) + this.userId.hashCode()) * 31) + Double.hashCode(this.slippageTolerance)) * 31) + Double.hashCode(this.realPremiumRate)) * 31) + this.failReason.hashCode()) * 31) + Integer.hashCode(this.priceScale)) * 31) + Integer.hashCode(this.convertBaseCurrencyId)) * 31) + Integer.hashCode(this.baseCurrencyId);
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
    public final void setBaseCurrencyId(int i) {
        this.baseCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrokerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.brokerId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseCurrencyId(int i) {
        this.convertBaseCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseCurrencyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseCurrencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseCurrencyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseCurrencyUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreatedDate(long j) {
        this.createdDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exchangeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.modifyDate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderStatus(int i) {
        this.orderStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreExchangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.preExchangeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceScale(int i) {
        this.priceScale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealPremiumRate(double d) {
        this.realPremiumRate = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageTolerance(double d) {
        this.slippageTolerance = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyConvertOrderDetailResponseBean(baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyName=" + this.baseCurrencyName + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", brokerId=" + this.brokerId + ", convertBaseAmount=" + this.convertBaseAmount + ", convertBaseCurrency=" + this.convertBaseCurrency + ", convertBaseCurrencyName=" + this.convertBaseCurrencyName + ", convertBaseCurrencyUrl=" + this.convertBaseCurrencyUrl + ", orderStatus=" + this.orderStatus + ", exchangeRate=" + this.exchangeRate + ", preExchangeRate=" + this.preExchangeRate + ", convertUrl=" + this.convertUrl + ", createdDate=" + this.createdDate + ", modifyDate=" + this.modifyDate + ", userId=" + this.userId + ", slippageTolerance=" + this.slippageTolerance + ", realPremiumRate=" + this.realPremiumRate + ", failReason=" + this.failReason + ", priceScale=" + this.priceScale + ", convertBaseCurrencyId=" + this.convertBaseCurrencyId + ", baseCurrencyId=" + this.baseCurrencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.baseCurrencyName);
        parcel.writeString(this.baseCurrencyUrl);
        parcel.writeString(this.brokerId);
        parcel.writeString(this.convertBaseAmount);
        parcel.writeString(this.convertBaseCurrency);
        parcel.writeString(this.convertBaseCurrencyName);
        parcel.writeString(this.convertBaseCurrencyUrl);
        parcel.writeInt(this.orderStatus);
        parcel.writeString(this.exchangeRate);
        parcel.writeString(this.preExchangeRate);
        parcel.writeString(this.convertUrl);
        parcel.writeLong(this.createdDate);
        parcel.writeString(this.modifyDate);
        parcel.writeString(this.userId);
        parcel.writeDouble(this.slippageTolerance);
        parcel.writeDouble(this.realPremiumRate);
        parcel.writeString(this.failReason);
        parcel.writeInt(this.priceScale);
        parcel.writeInt(this.convertBaseCurrencyId);
        parcel.writeInt(this.baseCurrencyId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyConvertOrderDetailResponseBean> serializer() {
            return RecurringBuyConvertOrderDetailResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyConvertOrderDetailResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10, String str11, String str12, long j, String str13, String str14, double d, double d2, String str15, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.baseCurrencyName = "";
        } else {
            this.baseCurrencyName = str3;
        }
        if ((i & 8) == 0) {
            this.baseCurrencyUrl = "";
        } else {
            this.baseCurrencyUrl = str4;
        }
        if ((i & 16) == 0) {
            this.brokerId = "";
        } else {
            this.brokerId = str5;
        }
        if ((i & 32) == 0) {
            this.convertBaseAmount = "";
        } else {
            this.convertBaseAmount = str6;
        }
        if ((i & 64) == 0) {
            this.convertBaseCurrency = "";
        } else {
            this.convertBaseCurrency = str7;
        }
        if ((i & 128) == 0) {
            this.convertBaseCurrencyName = "";
        } else {
            this.convertBaseCurrencyName = str8;
        }
        if ((i & 256) == 0) {
            this.convertBaseCurrencyUrl = "";
        } else {
            this.convertBaseCurrencyUrl = str9;
        }
        this.orderStatus = (i & 512) == 0 ? 0 : i2;
        if ((i & 1024) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str10;
        }
        if ((i & 2048) == 0) {
            this.preExchangeRate = "";
        } else {
            this.preExchangeRate = str11;
        }
        if ((i & 4096) == 0) {
            this.convertUrl = "";
        } else {
            this.convertUrl = str12;
        }
        this.createdDate = (i & 8192) == 0 ? 0L : j;
        if ((i & 16384) == 0) {
            this.modifyDate = "";
        } else {
            this.modifyDate = str13;
        }
        if ((32768 & i) == 0) {
            this.userId = "";
        } else {
            this.userId = str14;
        }
        int i6 = 65536 & i;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i6 == 0) {
            this.slippageTolerance = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.slippageTolerance = d;
        }
        this.realPremiumRate = (131072 & i) != 0 ? d2 : d3;
        if ((262144 & i) == 0) {
            this.failReason = "";
        } else {
            this.failReason = str15;
        }
        if ((524288 & i) == 0) {
            this.priceScale = -1;
        } else {
            this.priceScale = i3;
        }
        if ((1048576 & i) == 0) {
            this.convertBaseCurrencyId = -1;
        } else {
            this.convertBaseCurrencyId = i4;
        }
        if ((i & 2097152) == 0) {
            this.baseCurrencyId = -1;
        } else {
            this.baseCurrencyId = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyConvertOrderDetailResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyConvertOrderDetailResponseBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.baseCurrencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyConvertOrderDetailResponseBean.baseCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.baseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyConvertOrderDetailResponseBean.baseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.brokerId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBuyConvertOrderDetailResponseBean.brokerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.convertBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, recurringBuyConvertOrderDetailResponseBean.convertBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.convertBaseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBuyConvertOrderDetailResponseBean.convertBaseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || recurringBuyConvertOrderDetailResponseBean.orderStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, recurringBuyConvertOrderDetailResponseBean.orderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recurringBuyConvertOrderDetailResponseBean.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.preExchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recurringBuyConvertOrderDetailResponseBean.preExchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.convertUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, recurringBuyConvertOrderDetailResponseBean.convertUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || recurringBuyConvertOrderDetailResponseBean.createdDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 13, recurringBuyConvertOrderDetailResponseBean.createdDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.modifyDate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, recurringBuyConvertOrderDetailResponseBean.modifyDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.userId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, recurringBuyConvertOrderDetailResponseBean.userId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || Double.compare(recurringBuyConvertOrderDetailResponseBean.slippageTolerance, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 16, recurringBuyConvertOrderDetailResponseBean.slippageTolerance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || Double.compare(recurringBuyConvertOrderDetailResponseBean.realPremiumRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 17, recurringBuyConvertOrderDetailResponseBean.realPremiumRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) recurringBuyConvertOrderDetailResponseBean.failReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, recurringBuyConvertOrderDetailResponseBean.failReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || recurringBuyConvertOrderDetailResponseBean.priceScale != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, recurringBuyConvertOrderDetailResponseBean.priceScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, recurringBuyConvertOrderDetailResponseBean.convertBaseCurrencyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && recurringBuyConvertOrderDetailResponseBean.baseCurrencyId == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 21, recurringBuyConvertOrderDetailResponseBean.baseCurrencyId);
    }

    public RecurringBuyConvertOrderDetailResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @NotNull String str13, @NotNull String str14, double d, double d2, @NotNull String str15, int i2, int i3, int i4) {
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
        this.baseAmount = str;
        this.baseCurrency = str2;
        this.baseCurrencyName = str3;
        this.baseCurrencyUrl = str4;
        this.brokerId = str5;
        this.convertBaseAmount = str6;
        this.convertBaseCurrency = str7;
        this.convertBaseCurrencyName = str8;
        this.convertBaseCurrencyUrl = str9;
        this.orderStatus = i;
        this.exchangeRate = str10;
        this.preExchangeRate = str11;
        this.convertUrl = str12;
        this.createdDate = j;
        this.modifyDate = str13;
        this.userId = str14;
        this.slippageTolerance = d;
        this.realPremiumRate = d2;
        this.failReason = str15;
        this.priceScale = i2;
        this.convertBaseCurrencyId = i3;
        this.baseCurrencyId = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00fc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r53v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r53v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r53v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r53v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r53v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r53v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r53v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r53v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r53v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r53v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r53v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r53v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r53v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x006c: ARITH (r53v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r41v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r53v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r53v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x008e: ARITH (r53v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r45v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x009b: ARITH (r53v0 int) & (131072 int) A[WRAPPED]) == (0 int)) ? (r47v0 double) : (wrap:double:0x0090: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r53v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00af: ARITH (r53v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r50v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r53v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r51v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r53v0 int) & (2097152 int) A[WRAPPED]) == (0 int)) ? (r52v0 int) : (-1 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, double, double, java.lang.String, int, int, int):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, double, double, java.lang.String, int, int, int):void type: THIS */
    public /* synthetic */ RecurringBuyConvertOrderDetailResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, long j, String str13, String str14, double d, double d2, String str15, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? "" : str5, (i5 & 32) != 0 ? "" : str6, (i5 & 64) != 0 ? "" : str7, (i5 & 128) != 0 ? "" : str8, (i5 & 256) != 0 ? "" : str9, (i5 & 512) != 0 ? 0 : i, (i5 & 1024) != 0 ? "" : str10, (i5 & 2048) != 0 ? "" : str11, (i5 & 4096) != 0 ? "" : str12, (i5 & 8192) != 0 ? 0L : j, (i5 & 16384) != 0 ? "" : str13, (i5 & 32768) != 0 ? "" : str14, (i5 & 65536) != 0 ? 0.0d : d, (i5 & 131072) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i5 & 262144) != 0 ? "" : str15, (i5 & 524288) != 0 ? -1 : i2, (i5 & 1048576) != 0 ? -1 : i3, (i5 & 2097152) == 0 ? i4 : -1);
    }
}
