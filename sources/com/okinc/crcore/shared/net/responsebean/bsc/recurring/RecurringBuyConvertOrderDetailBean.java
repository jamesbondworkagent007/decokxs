package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyConvertOrderDetailResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyConvertOrderDetailBean implements Parcelable {
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
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyConvertOrderDetailBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringBuyConvertOrderDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyConvertOrderDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyConvertOrderDetailBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyConvertOrderDetailBean[] newArray(int i) {
            return new RecurringBuyConvertOrderDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyConvertOrderDetailBean() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, 0L, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, 0, 0, 0, 4194303, null);
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
    public final RecurringBuyConvertOrderDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @NotNull String str13, @NotNull String str14, double d, double d2, @NotNull String str15, int i2, int i3, int i4) {
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
        return new RecurringBuyConvertOrderDetailBean(str, str2, str3, str4, str5, str6, str7, str8, str9, i, str10, str11, str12, j, str13, str14, d, d2, str15, i2, i3, i4);
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
        if (!(obj instanceof RecurringBuyConvertOrderDetailBean)) {
            return false;
        }
        RecurringBuyConvertOrderDetailBean recurringBuyConvertOrderDetailBean = (RecurringBuyConvertOrderDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) recurringBuyConvertOrderDetailBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyConvertOrderDetailBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyName, (Object) recurringBuyConvertOrderDetailBean.baseCurrencyName) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) recurringBuyConvertOrderDetailBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.brokerId, (Object) recurringBuyConvertOrderDetailBean.brokerId) && Intrinsics.EZpvd((Object) this.convertBaseAmount, (Object) recurringBuyConvertOrderDetailBean.convertBaseAmount) && Intrinsics.EZpvd((Object) this.convertBaseCurrency, (Object) recurringBuyConvertOrderDetailBean.convertBaseCurrency) && Intrinsics.EZpvd((Object) this.convertBaseCurrencyName, (Object) recurringBuyConvertOrderDetailBean.convertBaseCurrencyName) && Intrinsics.EZpvd((Object) this.convertBaseCurrencyUrl, (Object) recurringBuyConvertOrderDetailBean.convertBaseCurrencyUrl) && this.orderStatus == recurringBuyConvertOrderDetailBean.orderStatus && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) recurringBuyConvertOrderDetailBean.exchangeRate) && Intrinsics.EZpvd((Object) this.preExchangeRate, (Object) recurringBuyConvertOrderDetailBean.preExchangeRate) && Intrinsics.EZpvd((Object) this.convertUrl, (Object) recurringBuyConvertOrderDetailBean.convertUrl) && this.createdDate == recurringBuyConvertOrderDetailBean.createdDate && Intrinsics.EZpvd((Object) this.modifyDate, (Object) recurringBuyConvertOrderDetailBean.modifyDate) && Intrinsics.EZpvd((Object) this.userId, (Object) recurringBuyConvertOrderDetailBean.userId) && Double.compare(this.slippageTolerance, recurringBuyConvertOrderDetailBean.slippageTolerance) == 0 && Double.compare(this.realPremiumRate, recurringBuyConvertOrderDetailBean.realPremiumRate) == 0 && Intrinsics.EZpvd((Object) this.failReason, (Object) recurringBuyConvertOrderDetailBean.failReason) && this.priceScale == recurringBuyConvertOrderDetailBean.priceScale && this.convertBaseCurrencyId == recurringBuyConvertOrderDetailBean.convertBaseCurrencyId && this.baseCurrencyId == recurringBuyConvertOrderDetailBean.baseCurrencyId;
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
        return "RecurringBuyConvertOrderDetailBean(baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyName=" + this.baseCurrencyName + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", brokerId=" + this.brokerId + ", convertBaseAmount=" + this.convertBaseAmount + ", convertBaseCurrency=" + this.convertBaseCurrency + ", convertBaseCurrencyName=" + this.convertBaseCurrencyName + ", convertBaseCurrencyUrl=" + this.convertBaseCurrencyUrl + ", orderStatus=" + this.orderStatus + ", exchangeRate=" + this.exchangeRate + ", preExchangeRate=" + this.preExchangeRate + ", convertUrl=" + this.convertUrl + ", createdDate=" + this.createdDate + ", modifyDate=" + this.modifyDate + ", userId=" + this.userId + ", slippageTolerance=" + this.slippageTolerance + ", realPremiumRate=" + this.realPremiumRate + ", failReason=" + this.failReason + ", priceScale=" + this.priceScale + ", convertBaseCurrencyId=" + this.convertBaseCurrencyId + ", baseCurrencyId=" + this.baseCurrencyId + ")";
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

    public RecurringBuyConvertOrderDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @NotNull String str13, @NotNull String str14, double d, double d2, @NotNull String str15, int i2, int i3, int i4) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, double, double, java.lang.String, int, int, int):void (m)] (LINE:16) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, double, double, java.lang.String, int, int, int):void type: THIS */
    public /* synthetic */ RecurringBuyConvertOrderDetailBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, long j, String str13, String str14, double d, double d2, String str15, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? "" : str5, (i5 & 32) != 0 ? "" : str6, (i5 & 64) != 0 ? "" : str7, (i5 & 128) != 0 ? "" : str8, (i5 & 256) != 0 ? "" : str9, (i5 & 512) != 0 ? 0 : i, (i5 & 1024) != 0 ? "" : str10, (i5 & 2048) != 0 ? "" : str11, (i5 & 4096) != 0 ? "" : str12, (i5 & 8192) != 0 ? 0L : j, (i5 & 16384) != 0 ? "" : str13, (i5 & 32768) != 0 ? "" : str14, (i5 & 65536) != 0 ? 0.0d : d, (i5 & 131072) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i5 & 262144) != 0 ? "" : str15, (i5 & 524288) != 0 ? -1 : i2, (i5 & 1048576) != 0 ? -1 : i3, (i5 & 2097152) == 0 ? i4 : -1);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyConvertOrderDetailBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final RecurringBuyConvertOrderDetailBean OLrzqt(@NotNull RecurringBuyConvertOrderDetailResponseBean recurringBuyConvertOrderDetailResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyConvertOrderDetailResponseBean, "");
            return new RecurringBuyConvertOrderDetailBean(C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getBaseAmount()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getBaseCurrency()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getBaseCurrencyName()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getBaseCurrencyUrl()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getBrokerId()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getConvertBaseAmount()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getConvertBaseCurrency()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getConvertBaseCurrencyName()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getConvertBaseCurrencyUrl()), C33129mqd.AhwBna(Integer.valueOf(recurringBuyConvertOrderDetailResponseBean.getOrderStatus())), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getExchangeRate()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getPreExchangeRate()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getConvertUrl()), C33129mqd.valueOf(Long.valueOf(recurringBuyConvertOrderDetailResponseBean.getCreatedDate())), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getModifyDate()), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getUserId()), C33129mqd.AEQbTJ(Double.valueOf(recurringBuyConvertOrderDetailResponseBean.getSlippageTolerance())), C33129mqd.AEQbTJ(Double.valueOf(recurringBuyConvertOrderDetailResponseBean.getRealPremiumRate())), C33129mqd.gEmmrt(recurringBuyConvertOrderDetailResponseBean.getFailReason()), recurringBuyConvertOrderDetailResponseBean.getPriceScale(), recurringBuyConvertOrderDetailResponseBean.getConvertBaseCurrencyId(), recurringBuyConvertOrderDetailResponseBean.getBaseCurrencyId());
        }
    }
}
