package com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ActivityHistoryVO {
    private final String abnormalStatusStr;
    private final Integer activitySource;
    private final String activityStr;
    private final String amount;
    private final Integer bizType;
    private final Integer cellType;
    private final String chainIcon;
    private final Integer chainIndex;
    private final String convertRate;
    private final Long createdTime;
    private final String currency;
    private final String currencyIcon;
    private final Integer currencyId;
    private final Integer currencyType;
    private final JsonElement customCell;
    private final Long earnDetailId;
    private final Integer eventStatus;
    private final Long eventTime;
    private final Integer eventType;
    private final String fiatValuation;
    private final String fiatValuationSymbol;
    private final String fromCurrencyAmount;
    private final String fromCurrencyFullName;
    private final String fromCurrencyIcon;
    private final Integer fromCurrencyId;
    private final String fromCurrencyName;
    private final Integer fromCurrencyType;
    private final Long id;
    private final Long modifyTime;
    private final String orderId;
    private final PaymentInfo paymentInfo;
    private final Integer rawEventStatus;
    private final String redirectDeeplink;
    private final Boolean riseColor;
    private final Integer sign;
    private final String statusStr;
    private final String toCurrencyAmount;
    private final String toCurrencyFullName;
    private final String toCurrencyIcon;
    private final Integer toCurrencyId;
    private final String toCurrencyName;
    private final Integer toCurrencyType;
    private final String tokenAddress;
    private final String tradeId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivityHistoryVO() {
        this((String) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (Integer) null, (JsonElement) null, (Long) null, (Integer) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, (String) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (PaymentInfo) null, -1, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.abnormalStatusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.createdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component15() {
        return this.customCell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component16() {
        return this.earnDetailId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component18() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.activitySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.fiatValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.fiatValuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.fromCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.fromCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.fromCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component25() {
        return this.fromCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.fromCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component28() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component29() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.activityStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.rawEventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.redirectDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component33() {
        return this.riseColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.toCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.toCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.toCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.toCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component41() {
        return this.toCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentInfo component44() {
        return this.paymentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.cellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityHistoryVO copy(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, Integer num4, String str5, Long l, String str6, String str7, Integer num5, Integer num6, JsonElement jsonElement, Long l2, Integer num7, Long l3, Integer num8, String str8, String str9, String str10, String str11, String str12, Integer num9, String str13, Integer num10, Long l4, Long l5, String str14, Integer num11, String str15, Boolean bool, Integer num12, String str16, String str17, String str18, String str19, Integer num13, String str20, Integer num14, String str21, String str22, PaymentInfo paymentInfo) {
        return new ActivityHistoryVO(str, num, str2, str3, num2, num3, str4, num4, str5, l, str6, str7, num5, num6, jsonElement, l2, num7, l3, num8, str8, str9, str10, str11, str12, num9, str13, num10, l4, l5, str14, num11, str15, bool, num12, str16, str17, str18, str19, num13, str20, num14, str21, str22, paymentInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistoryVO)) {
            return false;
        }
        ActivityHistoryVO activityHistoryVO = (ActivityHistoryVO) obj;
        return Intrinsics.EZpvd((Object) this.abnormalStatusStr, (Object) activityHistoryVO.abnormalStatusStr) && Intrinsics.EZpvd(this.activitySource, activityHistoryVO.activitySource) && Intrinsics.EZpvd((Object) this.activityStr, (Object) activityHistoryVO.activityStr) && Intrinsics.EZpvd((Object) this.amount, (Object) activityHistoryVO.amount) && Intrinsics.EZpvd(this.bizType, activityHistoryVO.bizType) && Intrinsics.EZpvd(this.cellType, activityHistoryVO.cellType) && Intrinsics.EZpvd((Object) this.chainIcon, (Object) activityHistoryVO.chainIcon) && Intrinsics.EZpvd(this.chainIndex, activityHistoryVO.chainIndex) && Intrinsics.EZpvd((Object) this.convertRate, (Object) activityHistoryVO.convertRate) && Intrinsics.EZpvd(this.createdTime, activityHistoryVO.createdTime) && Intrinsics.EZpvd((Object) this.currency, (Object) activityHistoryVO.currency) && Intrinsics.EZpvd((Object) this.currencyIcon, (Object) activityHistoryVO.currencyIcon) && Intrinsics.EZpvd(this.currencyId, activityHistoryVO.currencyId) && Intrinsics.EZpvd(this.currencyType, activityHistoryVO.currencyType) && Intrinsics.EZpvd(this.customCell, activityHistoryVO.customCell) && Intrinsics.EZpvd(this.earnDetailId, activityHistoryVO.earnDetailId) && Intrinsics.EZpvd(this.eventStatus, activityHistoryVO.eventStatus) && Intrinsics.EZpvd(this.eventTime, activityHistoryVO.eventTime) && Intrinsics.EZpvd(this.eventType, activityHistoryVO.eventType) && Intrinsics.EZpvd((Object) this.fiatValuation, (Object) activityHistoryVO.fiatValuation) && Intrinsics.EZpvd((Object) this.fiatValuationSymbol, (Object) activityHistoryVO.fiatValuationSymbol) && Intrinsics.EZpvd((Object) this.fromCurrencyAmount, (Object) activityHistoryVO.fromCurrencyAmount) && Intrinsics.EZpvd((Object) this.fromCurrencyFullName, (Object) activityHistoryVO.fromCurrencyFullName) && Intrinsics.EZpvd((Object) this.fromCurrencyIcon, (Object) activityHistoryVO.fromCurrencyIcon) && Intrinsics.EZpvd(this.fromCurrencyId, activityHistoryVO.fromCurrencyId) && Intrinsics.EZpvd((Object) this.fromCurrencyName, (Object) activityHistoryVO.fromCurrencyName) && Intrinsics.EZpvd(this.fromCurrencyType, activityHistoryVO.fromCurrencyType) && Intrinsics.EZpvd(this.id, activityHistoryVO.id) && Intrinsics.EZpvd(this.modifyTime, activityHistoryVO.modifyTime) && Intrinsics.EZpvd((Object) this.orderId, (Object) activityHistoryVO.orderId) && Intrinsics.EZpvd(this.rawEventStatus, activityHistoryVO.rawEventStatus) && Intrinsics.EZpvd((Object) this.redirectDeeplink, (Object) activityHistoryVO.redirectDeeplink) && Intrinsics.EZpvd(this.riseColor, activityHistoryVO.riseColor) && Intrinsics.EZpvd(this.sign, activityHistoryVO.sign) && Intrinsics.EZpvd((Object) this.statusStr, (Object) activityHistoryVO.statusStr) && Intrinsics.EZpvd((Object) this.toCurrencyAmount, (Object) activityHistoryVO.toCurrencyAmount) && Intrinsics.EZpvd((Object) this.toCurrencyFullName, (Object) activityHistoryVO.toCurrencyFullName) && Intrinsics.EZpvd((Object) this.toCurrencyIcon, (Object) activityHistoryVO.toCurrencyIcon) && Intrinsics.EZpvd(this.toCurrencyId, activityHistoryVO.toCurrencyId) && Intrinsics.EZpvd((Object) this.toCurrencyName, (Object) activityHistoryVO.toCurrencyName) && Intrinsics.EZpvd(this.toCurrencyType, activityHistoryVO.toCurrencyType) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) activityHistoryVO.tokenAddress) && Intrinsics.EZpvd((Object) this.tradeId, (Object) activityHistoryVO.tradeId) && Intrinsics.EZpvd(this.paymentInfo, activityHistoryVO.paymentInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbnormalStatusStr() {
        return this.abnormalStatusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getActivitySource() {
        return this.activitySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityStr() {
        return this.activityStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCellType() {
        return this.cellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertRate() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
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
    public final Integer getCurrencyType() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getCustomCell() {
        return this.customCell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEarnDetailId() {
        return this.earnDetailId;
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
    public final String getFiatValuation() {
        return this.fiatValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatValuationSymbol() {
        return this.fiatValuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCurrencyAmount() {
        return this.fromCurrencyAmount;
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
    public final Integer getFromCurrencyId() {
        return this.fromCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCurrencyName() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFromCurrencyType() {
        return this.fromCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getModifyTime() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRawEventStatus() {
        return this.rawEventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirectDeeplink() {
        return this.redirectDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRiseColor() {
        return this.riseColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatusStr() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCurrencyAmount() {
        return this.toCurrencyAmount;
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
    public final Integer getToCurrencyId() {
        return this.toCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCurrencyName() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToCurrencyType() {
        return this.toCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.abnormalStatusStr;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.activitySource;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.activityStr;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.bizType;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.cellType;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        String str4 = this.chainIcon;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Integer num4 = this.chainIndex;
        int iHashCode8 = num4 == null ? 0 : num4.hashCode();
        String str5 = this.convertRate;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        Long l = this.createdTime;
        int iHashCode10 = l == null ? 0 : l.hashCode();
        String str6 = this.currency;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currencyIcon;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        Integer num5 = this.currencyId;
        int iHashCode13 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.currencyType;
        int iHashCode14 = num6 == null ? 0 : num6.hashCode();
        JsonElement jsonElement = this.customCell;
        int iHashCode15 = jsonElement == null ? 0 : jsonElement.hashCode();
        Long l2 = this.earnDetailId;
        int iHashCode16 = l2 == null ? 0 : l2.hashCode();
        Integer num7 = this.eventStatus;
        int iHashCode17 = num7 == null ? 0 : num7.hashCode();
        Long l3 = this.eventTime;
        int iHashCode18 = l3 == null ? 0 : l3.hashCode();
        Integer num8 = this.eventType;
        int iHashCode19 = num8 == null ? 0 : num8.hashCode();
        String str8 = this.fiatValuation;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.fiatValuationSymbol;
        int iHashCode21 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.fromCurrencyAmount;
        int iHashCode22 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.fromCurrencyFullName;
        int iHashCode23 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.fromCurrencyIcon;
        int iHashCode24 = str12 == null ? 0 : str12.hashCode();
        Integer num9 = this.fromCurrencyId;
        int iHashCode25 = num9 == null ? 0 : num9.hashCode();
        String str13 = this.fromCurrencyName;
        int iHashCode26 = str13 == null ? 0 : str13.hashCode();
        Integer num10 = this.fromCurrencyType;
        int iHashCode27 = num10 == null ? 0 : num10.hashCode();
        Long l4 = this.id;
        int iHashCode28 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.modifyTime;
        int iHashCode29 = l5 == null ? 0 : l5.hashCode();
        String str14 = this.orderId;
        int iHashCode30 = str14 == null ? 0 : str14.hashCode();
        Integer num11 = this.rawEventStatus;
        int iHashCode31 = num11 == null ? 0 : num11.hashCode();
        String str15 = this.redirectDeeplink;
        int iHashCode32 = str15 == null ? 0 : str15.hashCode();
        Boolean bool = this.riseColor;
        int iHashCode33 = bool == null ? 0 : bool.hashCode();
        Integer num12 = this.sign;
        int iHashCode34 = num12 == null ? 0 : num12.hashCode();
        String str16 = this.statusStr;
        int iHashCode35 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.toCurrencyAmount;
        int iHashCode36 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.toCurrencyFullName;
        int iHashCode37 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.toCurrencyIcon;
        int iHashCode38 = str19 == null ? 0 : str19.hashCode();
        Integer num13 = this.toCurrencyId;
        int iHashCode39 = num13 == null ? 0 : num13.hashCode();
        String str20 = this.toCurrencyName;
        int iHashCode40 = str20 == null ? 0 : str20.hashCode();
        Integer num14 = this.toCurrencyType;
        int iHashCode41 = num14 == null ? 0 : num14.hashCode();
        String str21 = this.tokenAddress;
        int iHashCode42 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.tradeId;
        int iHashCode43 = str22 == null ? 0 : str22.hashCode();
        PaymentInfo paymentInfo = this.paymentInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + (paymentInfo == null ? 0 : paymentInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityHistoryVO(abnormalStatusStr=" + this.abnormalStatusStr + ", activitySource=" + this.activitySource + ", activityStr=" + this.activityStr + ", amount=" + this.amount + ", bizType=" + this.bizType + ", cellType=" + this.cellType + ", chainIcon=" + this.chainIcon + ", chainIndex=" + this.chainIndex + ", convertRate=" + this.convertRate + ", createdTime=" + this.createdTime + ", currency=" + this.currency + ", currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", currencyType=" + this.currencyType + ", customCell=" + this.customCell + ", earnDetailId=" + this.earnDetailId + ", eventStatus=" + this.eventStatus + ", eventTime=" + this.eventTime + ", eventType=" + this.eventType + ", fiatValuation=" + this.fiatValuation + ", fiatValuationSymbol=" + this.fiatValuationSymbol + ", fromCurrencyAmount=" + this.fromCurrencyAmount + ", fromCurrencyFullName=" + this.fromCurrencyFullName + ", fromCurrencyIcon=" + this.fromCurrencyIcon + ", fromCurrencyId=" + this.fromCurrencyId + ", fromCurrencyName=" + this.fromCurrencyName + ", fromCurrencyType=" + this.fromCurrencyType + ", id=" + this.id + ", modifyTime=" + this.modifyTime + ", orderId=" + this.orderId + ", rawEventStatus=" + this.rawEventStatus + ", redirectDeeplink=" + this.redirectDeeplink + ", riseColor=" + this.riseColor + ", sign=" + this.sign + ", statusStr=" + this.statusStr + ", toCurrencyAmount=" + this.toCurrencyAmount + ", toCurrencyFullName=" + this.toCurrencyFullName + ", toCurrencyIcon=" + this.toCurrencyIcon + ", toCurrencyId=" + this.toCurrencyId + ", toCurrencyName=" + this.toCurrencyName + ", toCurrencyType=" + this.toCurrencyType + ", tokenAddress=" + this.tokenAddress + ", tradeId=" + this.tradeId + ", paymentInfo=" + this.paymentInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.ActivityHistoryVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityHistoryVO> serializer() {
            return ActivityHistoryVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityHistoryVO(int i, int i2, String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, Integer num4, String str5, Long l, String str6, String str7, Integer num5, Integer num6, JsonElement jsonElement, Long l2, Integer num7, Long l3, Integer num8, String str8, String str9, String str10, String str11, String str12, Integer num9, String str13, Integer num10, Long l4, Long l5, String str14, Integer num11, String str15, Boolean bool, Integer num12, String str16, String str17, String str18, String str19, Integer num13, String str20, Integer num14, String str21, String str22, PaymentInfo paymentInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.abnormalStatusStr = null;
        } else {
            this.abnormalStatusStr = str;
        }
        if ((i & 2) == 0) {
            this.activitySource = null;
        } else {
            this.activitySource = num;
        }
        if ((i & 4) == 0) {
            this.activityStr = null;
        } else {
            this.activityStr = str2;
        }
        if ((i & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 16) == 0) {
            this.bizType = null;
        } else {
            this.bizType = num2;
        }
        if ((i & 32) == 0) {
            this.cellType = null;
        } else {
            this.cellType = num3;
        }
        if ((i & 64) == 0) {
            this.chainIcon = null;
        } else {
            this.chainIcon = str4;
        }
        if ((i & 128) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = num4;
        }
        if ((i & 256) == 0) {
            this.convertRate = null;
        } else {
            this.convertRate = str5;
        }
        if ((i & 512) == 0) {
            this.createdTime = null;
        } else {
            this.createdTime = l;
        }
        if ((i & 1024) == 0) {
            this.currency = null;
        } else {
            this.currency = str6;
        }
        if ((i & 2048) == 0) {
            this.currencyIcon = null;
        } else {
            this.currencyIcon = str7;
        }
        if ((i & 4096) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num5;
        }
        if ((i & 8192) == 0) {
            this.currencyType = null;
        } else {
            this.currencyType = num6;
        }
        if ((i & 16384) == 0) {
            this.customCell = null;
        } else {
            this.customCell = jsonElement;
        }
        if ((32768 & i) == 0) {
            this.earnDetailId = null;
        } else {
            this.earnDetailId = l2;
        }
        if ((65536 & i) == 0) {
            this.eventStatus = null;
        } else {
            this.eventStatus = num7;
        }
        if ((131072 & i) == 0) {
            this.eventTime = null;
        } else {
            this.eventTime = l3;
        }
        if ((262144 & i) == 0) {
            this.eventType = null;
        } else {
            this.eventType = num8;
        }
        if ((524288 & i) == 0) {
            this.fiatValuation = null;
        } else {
            this.fiatValuation = str8;
        }
        if ((1048576 & i) == 0) {
            this.fiatValuationSymbol = null;
        } else {
            this.fiatValuationSymbol = str9;
        }
        if ((2097152 & i) == 0) {
            this.fromCurrencyAmount = null;
        } else {
            this.fromCurrencyAmount = str10;
        }
        if ((4194304 & i) == 0) {
            this.fromCurrencyFullName = null;
        } else {
            this.fromCurrencyFullName = str11;
        }
        if ((8388608 & i) == 0) {
            this.fromCurrencyIcon = null;
        } else {
            this.fromCurrencyIcon = str12;
        }
        if ((16777216 & i) == 0) {
            this.fromCurrencyId = null;
        } else {
            this.fromCurrencyId = num9;
        }
        if ((33554432 & i) == 0) {
            this.fromCurrencyName = null;
        } else {
            this.fromCurrencyName = str13;
        }
        if ((67108864 & i) == 0) {
            this.fromCurrencyType = null;
        } else {
            this.fromCurrencyType = num10;
        }
        if ((134217728 & i) == 0) {
            this.id = null;
        } else {
            this.id = l4;
        }
        if ((268435456 & i) == 0) {
            this.modifyTime = null;
        } else {
            this.modifyTime = l5;
        }
        if ((536870912 & i) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str14;
        }
        if ((1073741824 & i) == 0) {
            this.rawEventStatus = null;
        } else {
            this.rawEventStatus = num11;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.redirectDeeplink = null;
        } else {
            this.redirectDeeplink = str15;
        }
        if ((i2 & 1) == 0) {
            this.riseColor = null;
        } else {
            this.riseColor = bool;
        }
        if ((i2 & 2) == 0) {
            this.sign = null;
        } else {
            this.sign = num12;
        }
        if ((i2 & 4) == 0) {
            this.statusStr = null;
        } else {
            this.statusStr = str16;
        }
        if ((i2 & 8) == 0) {
            this.toCurrencyAmount = null;
        } else {
            this.toCurrencyAmount = str17;
        }
        if ((i2 & 16) == 0) {
            this.toCurrencyFullName = null;
        } else {
            this.toCurrencyFullName = str18;
        }
        if ((i2 & 32) == 0) {
            this.toCurrencyIcon = null;
        } else {
            this.toCurrencyIcon = str19;
        }
        if ((i2 & 64) == 0) {
            this.toCurrencyId = null;
        } else {
            this.toCurrencyId = num13;
        }
        if ((i2 & 128) == 0) {
            this.toCurrencyName = null;
        } else {
            this.toCurrencyName = str20;
        }
        if ((i2 & 256) == 0) {
            this.toCurrencyType = null;
        } else {
            this.toCurrencyType = num14;
        }
        if ((i2 & 512) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str21;
        }
        if ((i2 & 1024) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str22;
        }
        if ((i2 & 2048) == 0) {
            this.paymentInfo = null;
        } else {
            this.paymentInfo = paymentInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ActivityHistoryVO activityHistoryVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || activityHistoryVO.abnormalStatusStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, activityHistoryVO.abnormalStatusStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || activityHistoryVO.activitySource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, activityHistoryVO.activitySource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || activityHistoryVO.activityStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, activityHistoryVO.activityStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || activityHistoryVO.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, activityHistoryVO.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || activityHistoryVO.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, activityHistoryVO.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || activityHistoryVO.cellType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, activityHistoryVO.cellType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || activityHistoryVO.chainIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, activityHistoryVO.chainIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || activityHistoryVO.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, activityHistoryVO.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || activityHistoryVO.convertRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, activityHistoryVO.convertRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || activityHistoryVO.createdTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, activityHistoryVO.createdTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || activityHistoryVO.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, activityHistoryVO.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || activityHistoryVO.currencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, activityHistoryVO.currencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || activityHistoryVO.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, activityHistoryVO.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || activityHistoryVO.currencyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, activityHistoryVO.currencyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || activityHistoryVO.customCell != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, JsonElementSerializer.INSTANCE, activityHistoryVO.customCell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || activityHistoryVO.earnDetailId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, LongSerializer.INSTANCE, activityHistoryVO.earnDetailId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || activityHistoryVO.eventStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, activityHistoryVO.eventStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || activityHistoryVO.eventTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, LongSerializer.INSTANCE, activityHistoryVO.eventTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || activityHistoryVO.eventType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, activityHistoryVO.eventType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || activityHistoryVO.fiatValuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, activityHistoryVO.fiatValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || activityHistoryVO.fiatValuationSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, activityHistoryVO.fiatValuationSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || activityHistoryVO.fromCurrencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || activityHistoryVO.fromCurrencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || activityHistoryVO.fromCurrencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || activityHistoryVO.fromCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, IntSerializer.INSTANCE, activityHistoryVO.fromCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || activityHistoryVO.fromCurrencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || activityHistoryVO.fromCurrencyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, activityHistoryVO.fromCurrencyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || activityHistoryVO.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, LongSerializer.INSTANCE, activityHistoryVO.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || activityHistoryVO.modifyTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, LongSerializer.INSTANCE, activityHistoryVO.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || activityHistoryVO.orderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, activityHistoryVO.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || activityHistoryVO.rawEventStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, activityHistoryVO.rawEventStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || activityHistoryVO.redirectDeeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, activityHistoryVO.redirectDeeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || activityHistoryVO.riseColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, activityHistoryVO.riseColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || activityHistoryVO.sign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntSerializer.INSTANCE, activityHistoryVO.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || activityHistoryVO.statusStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, activityHistoryVO.statusStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || activityHistoryVO.toCurrencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || activityHistoryVO.toCurrencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || activityHistoryVO.toCurrencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || activityHistoryVO.toCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, activityHistoryVO.toCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || activityHistoryVO.toCurrencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || activityHistoryVO.toCurrencyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, IntSerializer.INSTANCE, activityHistoryVO.toCurrencyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || activityHistoryVO.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, activityHistoryVO.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || activityHistoryVO.tradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, activityHistoryVO.tradeId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) && activityHistoryVO.paymentInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, PaymentInfo$$serializer.INSTANCE, activityHistoryVO.paymentInfo);
    }

    public ActivityHistoryVO(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, Integer num4, String str5, Long l, String str6, String str7, Integer num5, Integer num6, JsonElement jsonElement, Long l2, Integer num7, Long l3, Integer num8, String str8, String str9, String str10, String str11, String str12, Integer num9, String str13, Integer num10, Long l4, Long l5, String str14, Integer num11, String str15, Boolean bool, Integer num12, String str16, String str17, String str18, String str19, Integer num13, String str20, Integer num14, String str21, String str22, PaymentInfo paymentInfo) {
        this.abnormalStatusStr = str;
        this.activitySource = num;
        this.activityStr = str2;
        this.amount = str3;
        this.bizType = num2;
        this.cellType = num3;
        this.chainIcon = str4;
        this.chainIndex = num4;
        this.convertRate = str5;
        this.createdTime = l;
        this.currency = str6;
        this.currencyIcon = str7;
        this.currencyId = num5;
        this.currencyType = num6;
        this.customCell = jsonElement;
        this.earnDetailId = l2;
        this.eventStatus = num7;
        this.eventTime = l3;
        this.eventType = num8;
        this.fiatValuation = str8;
        this.fiatValuationSymbol = str9;
        this.fromCurrencyAmount = str10;
        this.fromCurrencyFullName = str11;
        this.fromCurrencyIcon = str12;
        this.fromCurrencyId = num9;
        this.fromCurrencyName = str13;
        this.fromCurrencyType = num10;
        this.id = l4;
        this.modifyTime = l5;
        this.orderId = str14;
        this.rawEventStatus = num11;
        this.redirectDeeplink = str15;
        this.riseColor = bool;
        this.sign = num12;
        this.statusStr = str16;
        this.toCurrencyAmount = str17;
        this.toCurrencyFullName = str18;
        this.toCurrencyIcon = str19;
        this.toCurrencyId = num13;
        this.toCurrencyName = str20;
        this.toCurrencyType = num14;
        this.tokenAddress = str21;
        this.tradeId = str22;
        this.paymentInfo = paymentInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0202: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r88v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r88v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r88v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r88v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r88v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r88v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r88v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003c: ARITH (r88v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r51v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r88v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004c: ARITH (r88v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r53v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r88v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r88v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0064: ARITH (r88v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r56v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r88v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r57v0 java.lang.Integer))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0076: ARITH (r88v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r58v0 kotlinx.serialization.json.JsonElement))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0081: ARITH (r88v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r59v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x008c: ARITH (r88v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0097: ARITH (r88v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r61v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r88v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r62v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r88v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r88v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r88v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r88v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r88v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r88v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r68v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r88v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r88v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r70v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0105: ARITH (r88v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r71v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0110: ARITH (r88v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r72v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011b: ARITH (r88v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0126: ARITH (r88v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r74v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0131: ARITH (r88v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0139: ARITH (r89v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r76v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0142: ARITH (r89v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r77v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014b: ARITH (r89v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0154: ARITH (r89v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015d: ARITH (r89v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0166: ARITH (r89v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x016f: ARITH (r89v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r82v0 java.lang.Integer))
  (wrap:java.lang.String:0x0182: TERNARY null = ((wrap:int:0x017a: ARITH (r89v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:java.lang.Integer:0x018c: TERNARY null = ((wrap:int:0x0184: ARITH (r89v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r84v0 java.lang.Integer))
  (wrap:java.lang.String:0x0196: TERNARY null = ((wrap:int:0x018e: ARITH (r89v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0198: ARITH (r89v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r86v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.PaymentInfo:?: TERNARY null = ((wrap:int:0x01a0: ARITH (r89v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.PaymentInfo) : (r87v0 com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.PaymentInfo))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.json.JsonElement, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.PaymentInfo):void (m)] (LINE:19) call: com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.ActivityHistoryVO.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.json.JsonElement, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.PaymentInfo):void type: THIS */
    public /* synthetic */ ActivityHistoryVO(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, Integer num4, String str5, Long l, String str6, String str7, Integer num5, Integer num6, JsonElement jsonElement, Long l2, Integer num7, Long l3, Integer num8, String str8, String str9, String str10, String str11, String str12, Integer num9, String str13, Integer num10, Long l4, Long l5, String str14, Integer num11, String str15, Boolean bool, Integer num12, String str16, String str17, String str18, String str19, Integer num13, String str20, Integer num14, String str21, String str22, PaymentInfo paymentInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : num6, (i & 16384) != 0 ? null : jsonElement, (i & 32768) != 0 ? null : l2, (i & 65536) != 0 ? null : num7, (i & 131072) != 0 ? null : l3, (i & 262144) != 0 ? null : num8, (i & 524288) != 0 ? null : str8, (i & 1048576) != 0 ? null : str9, (i & 2097152) != 0 ? null : str10, (i & 4194304) != 0 ? null : str11, (i & 8388608) != 0 ? null : str12, (i & 16777216) != 0 ? null : num9, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str13, (i & 67108864) != 0 ? null : num10, (i & 134217728) != 0 ? null : l4, (i & 268435456) != 0 ? null : l5, (i & 536870912) != 0 ? null : str14, (i & 1073741824) != 0 ? null : num11, (i & Integer.MIN_VALUE) != 0 ? null : str15, (i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : num12, (i2 & 4) != 0 ? null : str16, (i2 & 8) != 0 ? null : str17, (i2 & 16) != 0 ? null : str18, (i2 & 32) != 0 ? null : str19, (i2 & 64) != 0 ? null : num13, (i2 & 128) != 0 ? null : str20, (i2 & 256) != 0 ? null : num14, (i2 & 512) != 0 ? null : str21, (i2 & 1024) != 0 ? null : str22, (i2 & 2048) != 0 ? null : paymentInfo);
    }
}
