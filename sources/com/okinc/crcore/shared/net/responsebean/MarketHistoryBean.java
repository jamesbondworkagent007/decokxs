package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.net.responsebean.MarketHistoryResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHistoryBean implements Parcelable {
    private final String amount;
    private final String bizType;
    private final String channelCode;
    private final String channelName;
    private final String convertRate;
    private final String cryptoAmount;
    private final String cryptoName;
    private final String currencyFullName;
    private final String currencyIcon;
    private final String currencyName;
    private final String earnDetailId;
    private String eventStatus;
    private final Long eventTime;
    private final Integer eventType;
    private final Long expiryDateTime;
    private final String fiatAmount;
    private final String fiatSymbol;
    private final String fromAmount;
    private final String fromCurrencyFullName;
    private final String fromCurrencyIcon;
    private final String fromCurrencyName;
    private final String holdType;
    private final Long id;
    private final String receiveFrom;
    private final String sendTo;
    private final String toAmount;
    private final String toCurrencyFullName;
    private final String toCurrencyIcon;
    private final String toCurrencyName;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarketHistoryBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<MarketHistoryBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketHistoryBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketHistoryBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketHistoryBean[] newArray(int i) {
            return new MarketHistoryBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHistoryBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fiatSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.fromCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.fromCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component17() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.toCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.toCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.holdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.receiveFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.sendTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.channelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component29() {
        return this.expiryDateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cryptoName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.earnDetailId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketHistoryBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, Long l3) {
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        return new MarketHistoryBean(str, str2, str3, str4, str5, str6, str7, str8, l, num, str9, str10, str11, str12, str13, str14, l2, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, l3);
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
        if (!(obj instanceof MarketHistoryBean)) {
            return false;
        }
        MarketHistoryBean marketHistoryBean = (MarketHistoryBean) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) marketHistoryBean.amount) && Intrinsics.EZpvd((Object) this.bizType, (Object) marketHistoryBean.bizType) && Intrinsics.EZpvd((Object) this.cryptoAmount, (Object) marketHistoryBean.cryptoAmount) && Intrinsics.EZpvd((Object) this.cryptoName, (Object) marketHistoryBean.cryptoName) && Intrinsics.EZpvd((Object) this.currencyFullName, (Object) marketHistoryBean.currencyFullName) && Intrinsics.EZpvd((Object) this.currencyIcon, (Object) marketHistoryBean.currencyIcon) && Intrinsics.EZpvd((Object) this.currencyName, (Object) marketHistoryBean.currencyName) && Intrinsics.EZpvd((Object) this.earnDetailId, (Object) marketHistoryBean.earnDetailId) && Intrinsics.EZpvd(this.eventTime, marketHistoryBean.eventTime) && Intrinsics.EZpvd(this.eventType, marketHistoryBean.eventType) && Intrinsics.EZpvd((Object) this.fiatAmount, (Object) marketHistoryBean.fiatAmount) && Intrinsics.EZpvd((Object) this.fiatSymbol, (Object) marketHistoryBean.fiatSymbol) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) marketHistoryBean.fromAmount) && Intrinsics.EZpvd((Object) this.fromCurrencyFullName, (Object) marketHistoryBean.fromCurrencyFullName) && Intrinsics.EZpvd((Object) this.fromCurrencyIcon, (Object) marketHistoryBean.fromCurrencyIcon) && Intrinsics.EZpvd((Object) this.fromCurrencyName, (Object) marketHistoryBean.fromCurrencyName) && Intrinsics.EZpvd(this.id, marketHistoryBean.id) && Intrinsics.EZpvd((Object) this.toAmount, (Object) marketHistoryBean.toAmount) && Intrinsics.EZpvd((Object) this.toCurrencyFullName, (Object) marketHistoryBean.toCurrencyFullName) && Intrinsics.EZpvd((Object) this.toCurrencyIcon, (Object) marketHistoryBean.toCurrencyIcon) && Intrinsics.EZpvd((Object) this.toCurrencyName, (Object) marketHistoryBean.toCurrencyName) && Intrinsics.EZpvd((Object) this.convertRate, (Object) marketHistoryBean.convertRate) && Intrinsics.EZpvd((Object) this.holdType, (Object) marketHistoryBean.holdType) && Intrinsics.EZpvd((Object) this.receiveFrom, (Object) marketHistoryBean.receiveFrom) && Intrinsics.EZpvd((Object) this.sendTo, (Object) marketHistoryBean.sendTo) && Intrinsics.EZpvd((Object) this.channelCode, (Object) marketHistoryBean.channelCode) && Intrinsics.EZpvd((Object) this.eventStatus, (Object) marketHistoryBean.eventStatus) && Intrinsics.EZpvd((Object) this.channelName, (Object) marketHistoryBean.channelName) && Intrinsics.EZpvd(this.expiryDateTime, marketHistoryBean.expiryDateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelCode() {
        return this.channelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertRate() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoName() {
        return this.cryptoName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnDetailId() {
        return this.earnDetailId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventStatus() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEventTime() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiryDateTime() {
        return this.expiryDateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatSymbol() {
        return this.fiatSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCurrencyFullName() {
        return this.fromCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCurrencyIcon() {
        return this.fromCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCurrencyName() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldType() {
        return this.holdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveFrom() {
        return this.receiveFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSendTo() {
        return this.sendTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCurrencyFullName() {
        return this.toCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCurrencyIcon() {
        return this.toCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCurrencyName() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.bizType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cryptoAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cryptoName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.currencyFullName;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currencyIcon;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currencyName;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.earnDetailId;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Long l = this.eventTime;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Integer num = this.eventType;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        String str9 = this.fiatAmount;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.fiatSymbol;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.fromAmount;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.fromCurrencyFullName;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.fromCurrencyIcon;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.fromCurrencyName;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        Long l2 = this.id;
        int iHashCode17 = l2 == null ? 0 : l2.hashCode();
        String str15 = this.toAmount;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.toCurrencyFullName;
        int iHashCode19 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.toCurrencyIcon;
        int iHashCode20 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.toCurrencyName;
        int iHashCode21 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.convertRate;
        int iHashCode22 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.holdType;
        int iHashCode23 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.receiveFrom;
        int iHashCode24 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.sendTo;
        int iHashCode25 = str22 == null ? 0 : str22.hashCode();
        int iHashCode26 = this.channelCode.hashCode();
        int iHashCode27 = this.eventStatus.hashCode();
        int iHashCode28 = this.channelName.hashCode();
        Long l3 = this.expiryDateTime;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (l3 == null ? 0 : l3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketHistoryBean(amount=" + this.amount + ", bizType=" + this.bizType + ", cryptoAmount=" + this.cryptoAmount + ", cryptoName=" + this.cryptoName + ", currencyFullName=" + this.currencyFullName + ", currencyIcon=" + this.currencyIcon + ", currencyName=" + this.currencyName + ", earnDetailId=" + this.earnDetailId + ", eventTime=" + this.eventTime + ", eventType=" + this.eventType + ", fiatAmount=" + this.fiatAmount + ", fiatSymbol=" + this.fiatSymbol + ", fromAmount=" + this.fromAmount + ", fromCurrencyFullName=" + this.fromCurrencyFullName + ", fromCurrencyIcon=" + this.fromCurrencyIcon + ", fromCurrencyName=" + this.fromCurrencyName + ", id=" + this.id + ", toAmount=" + this.toAmount + ", toCurrencyFullName=" + this.toCurrencyFullName + ", toCurrencyIcon=" + this.toCurrencyIcon + ", toCurrencyName=" + this.toCurrencyName + ", convertRate=" + this.convertRate + ", holdType=" + this.holdType + ", receiveFrom=" + this.receiveFrom + ", sendTo=" + this.sendTo + ", channelCode=" + this.channelCode + ", eventStatus=" + this.eventStatus + ", channelName=" + this.channelName + ", expiryDateTime=" + this.expiryDateTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.bizType);
        parcel.writeString(this.cryptoAmount);
        parcel.writeString(this.cryptoName);
        parcel.writeString(this.currencyFullName);
        parcel.writeString(this.currencyIcon);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.earnDetailId);
        Long l = this.eventTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.eventType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.fiatAmount);
        parcel.writeString(this.fiatSymbol);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.fromCurrencyFullName);
        parcel.writeString(this.fromCurrencyIcon);
        parcel.writeString(this.fromCurrencyName);
        Long l2 = this.id;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.toAmount);
        parcel.writeString(this.toCurrencyFullName);
        parcel.writeString(this.toCurrencyIcon);
        parcel.writeString(this.toCurrencyName);
        parcel.writeString(this.convertRate);
        parcel.writeString(this.holdType);
        parcel.writeString(this.receiveFrom);
        parcel.writeString(this.sendTo);
        parcel.writeString(this.channelCode);
        parcel.writeString(this.eventStatus);
        parcel.writeString(this.channelName);
        Long l3 = this.expiryDateTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public MarketHistoryBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, Long l3) {
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        this.amount = str;
        this.bizType = str2;
        this.cryptoAmount = str3;
        this.cryptoName = str4;
        this.currencyFullName = str5;
        this.currencyIcon = str6;
        this.currencyName = str7;
        this.earnDetailId = str8;
        this.eventTime = l;
        this.eventType = num;
        this.fiatAmount = str9;
        this.fiatSymbol = str10;
        this.fromAmount = str11;
        this.fromCurrencyFullName = str12;
        this.fromCurrencyIcon = str13;
        this.fromCurrencyName = str14;
        this.id = l2;
        this.toAmount = str15;
        this.toCurrencyFullName = str16;
        this.toCurrencyIcon = str17;
        this.toCurrencyName = str18;
        this.convertRate = str19;
        this.holdType = str20;
        this.receiveFrom = str21;
        this.sendTo = str22;
        this.channelCode = str23;
        this.eventStatus = str24;
        this.channelName = str25;
        this.expiryDateTime = l3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0167: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r61v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r61v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r61v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r61v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r61v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r61v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r61v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r61v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r61v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r40v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0051: ARITH (r61v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r61v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r61v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r61v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r61v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r61v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r61v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0096: ARITH (r61v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r48v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r61v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r61v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r61v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r61v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r61v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r61v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r61v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r61v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r61v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r61v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r61v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x011e: ARITH (r61v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r60v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.MarketHistoryBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ MarketHistoryBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? 0L : l, (i & 512) != 0 ? 0 : num, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? 0L : l2, (i & 131072) != 0 ? "" : str15, (i & 262144) != 0 ? "" : str16, (i & 524288) != 0 ? "" : str17, (i & 1048576) != 0 ? "" : str18, (i & 2097152) != 0 ? "" : str19, (i & 4194304) != 0 ? "" : str20, (i & 8388608) != 0 ? "" : str21, (i & 16777216) != 0 ? "" : str22, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23, (i & 67108864) != 0 ? "" : str24, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? 0L : l3);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.MarketHistoryBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MarketHistoryBean EZpvd(@NotNull MarketHistoryResponseBean marketHistoryResponseBean) {
            Intrinsics.checkNotNullParameter(marketHistoryResponseBean, "");
            return new MarketHistoryBean(marketHistoryResponseBean.getAmount(), marketHistoryResponseBean.getBizType(), marketHistoryResponseBean.getCryptoAmount(), marketHistoryResponseBean.getCryptoName(), marketHistoryResponseBean.getCurrencyFullName(), marketHistoryResponseBean.getCurrencyIcon(), marketHistoryResponseBean.getCurrencyName(), marketHistoryResponseBean.getEarnDetailId(), marketHistoryResponseBean.getEventTime(), marketHistoryResponseBean.getEventType(), marketHistoryResponseBean.getFiatAmount(), marketHistoryResponseBean.getFiatSymbol(), marketHistoryResponseBean.getFromAmount(), marketHistoryResponseBean.getFromCurrencyFullName(), marketHistoryResponseBean.getFromCurrencyIcon(), marketHistoryResponseBean.getFromCurrencyName(), marketHistoryResponseBean.getId(), marketHistoryResponseBean.getToAmount(), marketHistoryResponseBean.getToCurrencyFullName(), marketHistoryResponseBean.getToCurrencyIcon(), marketHistoryResponseBean.getToCurrencyName(), marketHistoryResponseBean.getConvertRate(), marketHistoryResponseBean.getHoldType(), marketHistoryResponseBean.getReceiveFrom(), marketHistoryResponseBean.getSendTo(), marketHistoryResponseBean.getChannelCode(), marketHistoryResponseBean.getEventStatus(), marketHistoryResponseBean.getChannelName(), marketHistoryResponseBean.getExpiryDateTime());
        }
    }
}
