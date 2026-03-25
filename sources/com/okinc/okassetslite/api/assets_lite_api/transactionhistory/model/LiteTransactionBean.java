package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LiteTransactionBean {
    public static final int $stable = 0;
    private final String amount;
    private final Integer bizRawStatus;
    private final String bizType;
    private final String channelCode;
    private final String channelName;
    private final String convertRate;
    private final String cryptoAmount;
    private final String cryptoName;
    private final String currencyFullName;
    private final String currencyIcon;
    private final Integer currencyId;
    private final String currencyName;
    private final Integer currencyType;
    private final Integer eventStatus;
    private final Long eventTime;
    private final Integer eventType;
    private final Long expiryDateTime;
    private final String fee;
    private final String fiatAmount;
    private final String fiatSymbol;
    private final String filledAmount;
    private final String fromAmount;
    private final String fromCurrencyFullName;
    private final String fromCurrencyIcon;
    private final String fromCurrencyName;
    private final Integer holdType;
    private final Long id;
    private final String orderDetailDeepLink;
    private final String orderId;
    private final Integer paymentStatus;
    private final String receiveFrom;
    private final String sendTo;
    private final String toAmount;
    private final String toCurrencyFullName;
    private final String toCurrencyIcon;
    private final String toCurrencyName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiteTransactionBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.bizRawStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.expiryDateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.fromCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.fromCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.holdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.toCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.toCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.cryptoName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.fiatSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.sendTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.receiveFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.paymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.filledAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.orderDetailDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component36() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.channelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteTransactionBean copy(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Long l2, Integer num2, Integer num3, Integer num4, Long l3, String str9, String str10, String str11, Integer num5, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num6, String str23, String str24, @NotNull String str25, @NotNull String str26, Integer num7) {
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new LiteTransactionBean(l, str, str2, str3, str4, str5, str6, str7, num, str8, l2, num2, num3, num4, l3, str9, str10, str11, num5, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, num6, str23, str24, str25, str26, num7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteTransactionBean)) {
            return false;
        }
        LiteTransactionBean liteTransactionBean = (LiteTransactionBean) obj;
        return Intrinsics.EZpvd(this.id, liteTransactionBean.id) && Intrinsics.EZpvd((Object) this.amount, (Object) liteTransactionBean.amount) && Intrinsics.EZpvd((Object) this.bizType, (Object) liteTransactionBean.bizType) && Intrinsics.EZpvd((Object) this.channelCode, (Object) liteTransactionBean.channelCode) && Intrinsics.EZpvd((Object) this.channelName, (Object) liteTransactionBean.channelName) && Intrinsics.EZpvd((Object) this.convertRate, (Object) liteTransactionBean.convertRate) && Intrinsics.EZpvd((Object) this.currencyFullName, (Object) liteTransactionBean.currencyFullName) && Intrinsics.EZpvd((Object) this.currencyIcon, (Object) liteTransactionBean.currencyIcon) && Intrinsics.EZpvd(this.currencyId, liteTransactionBean.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) liteTransactionBean.currencyName) && Intrinsics.EZpvd(this.eventTime, liteTransactionBean.eventTime) && Intrinsics.EZpvd(this.eventStatus, liteTransactionBean.eventStatus) && Intrinsics.EZpvd(this.bizRawStatus, liteTransactionBean.bizRawStatus) && Intrinsics.EZpvd(this.eventType, liteTransactionBean.eventType) && Intrinsics.EZpvd(this.expiryDateTime, liteTransactionBean.expiryDateTime) && Intrinsics.EZpvd((Object) this.fromCurrencyName, (Object) liteTransactionBean.fromCurrencyName) && Intrinsics.EZpvd((Object) this.fromCurrencyFullName, (Object) liteTransactionBean.fromCurrencyFullName) && Intrinsics.EZpvd((Object) this.fromCurrencyIcon, (Object) liteTransactionBean.fromCurrencyIcon) && Intrinsics.EZpvd(this.holdType, liteTransactionBean.holdType) && Intrinsics.EZpvd((Object) this.toCurrencyName, (Object) liteTransactionBean.toCurrencyName) && Intrinsics.EZpvd((Object) this.toCurrencyFullName, (Object) liteTransactionBean.toCurrencyFullName) && Intrinsics.EZpvd((Object) this.toCurrencyIcon, (Object) liteTransactionBean.toCurrencyIcon) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) liteTransactionBean.fromAmount) && Intrinsics.EZpvd((Object) this.toAmount, (Object) liteTransactionBean.toAmount) && Intrinsics.EZpvd((Object) this.cryptoName, (Object) liteTransactionBean.cryptoName) && Intrinsics.EZpvd((Object) this.fiatSymbol, (Object) liteTransactionBean.fiatSymbol) && Intrinsics.EZpvd((Object) this.cryptoAmount, (Object) liteTransactionBean.cryptoAmount) && Intrinsics.EZpvd((Object) this.fiatAmount, (Object) liteTransactionBean.fiatAmount) && Intrinsics.EZpvd((Object) this.sendTo, (Object) liteTransactionBean.sendTo) && Intrinsics.EZpvd((Object) this.receiveFrom, (Object) liteTransactionBean.receiveFrom) && Intrinsics.EZpvd(this.paymentStatus, liteTransactionBean.paymentStatus) && Intrinsics.EZpvd((Object) this.fee, (Object) liteTransactionBean.fee) && Intrinsics.EZpvd((Object) this.filledAmount, (Object) liteTransactionBean.filledAmount) && Intrinsics.EZpvd((Object) this.orderId, (Object) liteTransactionBean.orderId) && Intrinsics.EZpvd((Object) this.orderDetailDeepLink, (Object) liteTransactionBean.orderDetailDeepLink) && Intrinsics.EZpvd(this.currencyType, liteTransactionBean.currencyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizRawStatus() {
        return this.bizRawStatus;
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
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyType() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEventStatus() {
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
    public final String getFee() {
        return this.fee;
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
    public final String getFilledAmount() {
        return this.filledAmount;
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
    public final Integer getHoldType() {
        return this.holdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderDetailDeepLink() {
        return this.orderDetailDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPaymentStatus() {
        return this.paymentStatus;
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
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.amount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.bizType;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.channelCode;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.channelName;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.convertRate;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currencyFullName;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currencyIcon;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        Integer num = this.currencyId;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str8 = this.currencyName;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        Long l2 = this.eventTime;
        int iHashCode11 = l2 == null ? 0 : l2.hashCode();
        Integer num2 = this.eventStatus;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.bizRawStatus;
        int iHashCode13 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.eventType;
        int iHashCode14 = num4 == null ? 0 : num4.hashCode();
        Long l3 = this.expiryDateTime;
        int iHashCode15 = l3 == null ? 0 : l3.hashCode();
        String str9 = this.fromCurrencyName;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.fromCurrencyFullName;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.fromCurrencyIcon;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        Integer num5 = this.holdType;
        int iHashCode19 = num5 == null ? 0 : num5.hashCode();
        String str12 = this.toCurrencyName;
        int iHashCode20 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.toCurrencyFullName;
        int iHashCode21 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.toCurrencyIcon;
        int iHashCode22 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.fromAmount;
        int iHashCode23 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.toAmount;
        int iHashCode24 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.cryptoName;
        int iHashCode25 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.fiatSymbol;
        int iHashCode26 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.cryptoAmount;
        int iHashCode27 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.fiatAmount;
        int iHashCode28 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.sendTo;
        int iHashCode29 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.receiveFrom;
        int iHashCode30 = str22 == null ? 0 : str22.hashCode();
        Integer num6 = this.paymentStatus;
        int iHashCode31 = num6 == null ? 0 : num6.hashCode();
        String str23 = this.fee;
        int iHashCode32 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.filledAmount;
        int iHashCode33 = str24 == null ? 0 : str24.hashCode();
        int iHashCode34 = this.orderId.hashCode();
        int iHashCode35 = this.orderDetailDeepLink.hashCode();
        Integer num7 = this.currencyType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (num7 == null ? 0 : num7.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteTransactionBean(id=" + this.id + ", amount=" + this.amount + ", bizType=" + this.bizType + ", channelCode=" + this.channelCode + ", channelName=" + this.channelName + ", convertRate=" + this.convertRate + ", currencyFullName=" + this.currencyFullName + ", currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", eventTime=" + this.eventTime + ", eventStatus=" + this.eventStatus + ", bizRawStatus=" + this.bizRawStatus + ", eventType=" + this.eventType + ", expiryDateTime=" + this.expiryDateTime + ", fromCurrencyName=" + this.fromCurrencyName + ", fromCurrencyFullName=" + this.fromCurrencyFullName + ", fromCurrencyIcon=" + this.fromCurrencyIcon + ", holdType=" + this.holdType + ", toCurrencyName=" + this.toCurrencyName + ", toCurrencyFullName=" + this.toCurrencyFullName + ", toCurrencyIcon=" + this.toCurrencyIcon + ", fromAmount=" + this.fromAmount + ", toAmount=" + this.toAmount + ", cryptoName=" + this.cryptoName + ", fiatSymbol=" + this.fiatSymbol + ", cryptoAmount=" + this.cryptoAmount + ", fiatAmount=" + this.fiatAmount + ", sendTo=" + this.sendTo + ", receiveFrom=" + this.receiveFrom + ", paymentStatus=" + this.paymentStatus + ", fee=" + this.fee + ", filledAmount=" + this.filledAmount + ", orderId=" + this.orderId + ", orderDetailDeepLink=" + this.orderDetailDeepLink + ", currencyType=" + this.currencyType + ")";
    }

    public LiteTransactionBean(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Long l2, Integer num2, Integer num3, Integer num4, Long l3, String str9, String str10, String str11, Integer num5, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num6, String str23, String str24, @NotNull String str25, @NotNull String str26, Integer num7) {
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        this.id = l;
        this.amount = str;
        this.bizType = str2;
        this.channelCode = str3;
        this.channelName = str4;
        this.convertRate = str5;
        this.currencyFullName = str6;
        this.currencyIcon = str7;
        this.currencyId = num;
        this.currencyName = str8;
        this.eventTime = l2;
        this.eventStatus = num2;
        this.bizRawStatus = num3;
        this.eventType = num4;
        this.expiryDateTime = l3;
        this.fromCurrencyName = str9;
        this.fromCurrencyFullName = str10;
        this.fromCurrencyIcon = str11;
        this.holdType = num5;
        this.toCurrencyName = str12;
        this.toCurrencyFullName = str13;
        this.toCurrencyIcon = str14;
        this.fromAmount = str15;
        this.toAmount = str16;
        this.cryptoName = str17;
        this.fiatSymbol = str18;
        this.cryptoAmount = str19;
        this.fiatAmount = str20;
        this.sendTo = str21;
        this.receiveFrom = str22;
        this.paymentStatus = num6;
        this.fee = str23;
        this.filledAmount = str24;
        this.orderId = str25;
        this.orderDetailDeepLink = str26;
        this.currencyType = num7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01ab: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r37v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0042: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0052: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r47v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006a: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0072: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r51v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009e: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r55v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0122: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0135: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013e: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r74v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r71v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0150: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015a: INVOKE 
  (wrap:int:0x0156: INVOKE 
  (wrap:com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TransactionCurrencyType:0x0154: SGET  A[WRAPPED] (LINE:42) com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TransactionCurrencyType.CRYPTO com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TransactionCurrencyType)
 VIRTUAL call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TransactionCurrencyType.getCurrencyType():int A[MD:():int (m), WRAPPED] (LINE:42))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:42)) : (r72v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:6) call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.LiteTransactionBean.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ LiteTransactionBean(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Long l2, Integer num2, Integer num3, Integer num4, Long l3, String str9, String str10, String str11, Integer num5, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num6, String str23, String str24, String str25, String str26, Integer num7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : l2, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : l3, (i & 32768) != 0 ? null : str9, (i & 65536) != 0 ? null : str10, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : num5, (i & 524288) != 0 ? null : str12, (i & 1048576) != 0 ? null : str13, (i & 2097152) != 0 ? null : str14, (i & 4194304) != 0 ? null : str15, (i & 8388608) != 0 ? null : str16, (i & 16777216) != 0 ? null : str17, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str18, (i & 67108864) != 0 ? null : str19, (i & 134217728) != 0 ? null : str20, (i & 268435456) != 0 ? null : str21, (i & 536870912) != 0 ? null : str22, (i & 1073741824) != 0 ? null : num6, (i & Integer.MIN_VALUE) != 0 ? null : str23, (i2 & 1) != 0 ? null : str24, (i2 & 2) != 0 ? "" : str25, (i2 & 4) == 0 ? str26 : "", (i2 & 8) != 0 ? Integer.valueOf(TransactionCurrencyType.CRYPTO.getCurrencyType()) : num7);
    }
}
