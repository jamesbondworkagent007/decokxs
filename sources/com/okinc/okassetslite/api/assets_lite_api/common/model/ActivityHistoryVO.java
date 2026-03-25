package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ActivityHistoryVO implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;

    @SerializedName("abnormalStatusStr")
    private final String abnormalStatusStr;

    @SerializedName("activitySource")
    private final Integer activitySource;

    @SerializedName("activityStr")
    private final String activityStr;

    @SerializedName(OtcExtraKeys.AMOUNT)
    private final String amount;

    @SerializedName("bizType")
    private final String bizType;

    @SerializedName("cellType")
    private final Integer cellType;

    @SerializedName("chainIcon")
    private final String chainIcon;

    @SerializedName("chainIndex")
    private final Integer chainIndex;

    @SerializedName("convertRate")
    private final String convertRate;

    @SerializedName("createdTime")
    private final Long createdTime;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("currencyIcon")
    private final String currencyIcon;

    @SerializedName("currencyId")
    private final int currencyId;

    @SerializedName("currencyType")
    private final CurrencyType currencyType;

    @SerializedName("customCell")
    private final CustomCell customCell;

    @SerializedName("eventStatus")
    private final Integer eventStatus;

    @SerializedName("eventTime")
    private final long eventTime;

    @SerializedName("eventType")
    private final Integer eventType;

    @SerializedName("fiatValuation")
    private final String fiatValuation;

    @SerializedName("fromCurrencyAmount")
    private final String fromCurrencyAmount;

    @SerializedName("fromCurrencyFullName")
    private final String fromCurrencyFullName;

    @SerializedName("fromCurrencyIcon")
    private final String fromCurrencyIcon;

    @SerializedName("fromCurrencyName")
    private final String fromCurrencyName;

    @SerializedName("fromCurrencyType")
    private final CurrencyType fromCurrencyType;

    @SerializedName("id")
    private final long id;

    @SerializedName("modifyTime")
    private final Long modifyTime;

    @SerializedName("orderId")
    private final String orderId;

    @SerializedName("paymentInfo")
    private final PaymentInfo paymentInfo;

    @SerializedName("rawEventStatus")
    private final Integer rawEventStatus;

    @SerializedName("redirectDeeplink")
    private final String redirectDeeplink;

    @SerializedName("riseColor")
    private final Boolean riseColor;

    @SerializedName("sign")
    private final Sign sign;

    @SerializedName("statusStr")
    private final String statusStr;

    @SerializedName("toCurrencyAmount")
    private final String toCurrencyAmount;

    @SerializedName("toCurrencyFullName")
    private final String toCurrencyFullName;

    @SerializedName("toCurrencyIcon")
    private final String toCurrencyIcon;

    @SerializedName("toCurrencyName")
    private final String toCurrencyName;

    @SerializedName("toCurrencyType")
    private final CurrencyType toCurrencyType;

    @SerializedName("tokenAddress")
    private final String tokenAddress;

    @SerializedName("tradeId")
    private final String tradeId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ActivityHistoryVO> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ActivityHistoryVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivityHistoryVO createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Sign signCreateFromParcel = Sign.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ActivityHistoryVO(j, i, string, string2, string3, numValueOf, numValueOf2, numValueOf3, string4, string5, string6, string7, string8, string9, signCreateFromParcel, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CustomCell.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CurrencyType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CurrencyType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CurrencyType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PaymentInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivityHistoryVO[] newArray(int i) {
            return new ActivityHistoryVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivityHistoryVO() {
        this(0L, 0, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Sign) null, (Boolean) null, (String) null, (String) null, (Integer) null, (CustomCell) null, (Long) null, (Long) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (CurrencyType) null, (CurrencyType) null, (CurrencyType) null, (Integer) null, (Integer) null, (String) null, (String) null, (PaymentInfo) null, -1, 255, (DefaultConstructorMarker) null);
    }

    @SerialName("customCell")
    public static /* synthetic */ void getCustomCell$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.activityStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.abnormalStatusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.fiatValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Sign component15() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.riseColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.redirectDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.cellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomCell component20() {
        return this.customCell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component21() {
        return this.createdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component22() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component23() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.toCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.toCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.toCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.fromCurrencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.fromCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.fromCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyType component33() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyType component34() {
        return this.toCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyType component35() {
        return this.fromCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component36() {
        return this.activitySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component37() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentInfo component40() {
        return this.paymentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.rawEventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityHistoryVO copy(long j, int i, @NotNull String str, @NotNull String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull Sign sign, Boolean bool, String str10, String str11, Integer num4, CustomCell customCell, Long l, Long l2, long j2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, CurrencyType currencyType, CurrencyType currencyType2, CurrencyType currencyType3, Integer num5, Integer num6, String str21, String str22, PaymentInfo paymentInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(sign, "");
        return new ActivityHistoryVO(j, i, str, str2, str3, num, num2, num3, str4, str5, str6, str7, str8, str9, sign, bool, str10, str11, num4, customCell, l, l2, j2, str12, str13, str14, str15, str16, str17, str18, str19, str20, currencyType, currencyType2, currencyType3, num5, num6, str21, str22, paymentInfo);
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
        if (!(obj instanceof ActivityHistoryVO)) {
            return false;
        }
        ActivityHistoryVO activityHistoryVO = (ActivityHistoryVO) obj;
        return this.id == activityHistoryVO.id && this.currencyId == activityHistoryVO.currencyId && Intrinsics.EZpvd((Object) this.currency, (Object) activityHistoryVO.currency) && Intrinsics.EZpvd((Object) this.currencyIcon, (Object) activityHistoryVO.currencyIcon) && Intrinsics.EZpvd((Object) this.bizType, (Object) activityHistoryVO.bizType) && Intrinsics.EZpvd(this.eventType, activityHistoryVO.eventType) && Intrinsics.EZpvd(this.eventStatus, activityHistoryVO.eventStatus) && Intrinsics.EZpvd(this.rawEventStatus, activityHistoryVO.rawEventStatus) && Intrinsics.EZpvd((Object) this.tradeId, (Object) activityHistoryVO.tradeId) && Intrinsics.EZpvd((Object) this.activityStr, (Object) activityHistoryVO.activityStr) && Intrinsics.EZpvd((Object) this.statusStr, (Object) activityHistoryVO.statusStr) && Intrinsics.EZpvd((Object) this.abnormalStatusStr, (Object) activityHistoryVO.abnormalStatusStr) && Intrinsics.EZpvd((Object) this.amount, (Object) activityHistoryVO.amount) && Intrinsics.EZpvd((Object) this.fiatValuation, (Object) activityHistoryVO.fiatValuation) && this.sign == activityHistoryVO.sign && Intrinsics.EZpvd(this.riseColor, activityHistoryVO.riseColor) && Intrinsics.EZpvd((Object) this.orderId, (Object) activityHistoryVO.orderId) && Intrinsics.EZpvd((Object) this.redirectDeeplink, (Object) activityHistoryVO.redirectDeeplink) && Intrinsics.EZpvd(this.cellType, activityHistoryVO.cellType) && Intrinsics.EZpvd(this.customCell, activityHistoryVO.customCell) && Intrinsics.EZpvd(this.createdTime, activityHistoryVO.createdTime) && Intrinsics.EZpvd(this.modifyTime, activityHistoryVO.modifyTime) && this.eventTime == activityHistoryVO.eventTime && Intrinsics.EZpvd((Object) this.toCurrencyName, (Object) activityHistoryVO.toCurrencyName) && Intrinsics.EZpvd((Object) this.toCurrencyFullName, (Object) activityHistoryVO.toCurrencyFullName) && Intrinsics.EZpvd((Object) this.toCurrencyIcon, (Object) activityHistoryVO.toCurrencyIcon) && Intrinsics.EZpvd((Object) this.toCurrencyAmount, (Object) activityHistoryVO.toCurrencyAmount) && Intrinsics.EZpvd((Object) this.fromCurrencyName, (Object) activityHistoryVO.fromCurrencyName) && Intrinsics.EZpvd((Object) this.fromCurrencyFullName, (Object) activityHistoryVO.fromCurrencyFullName) && Intrinsics.EZpvd((Object) this.fromCurrencyIcon, (Object) activityHistoryVO.fromCurrencyIcon) && Intrinsics.EZpvd((Object) this.fromCurrencyAmount, (Object) activityHistoryVO.fromCurrencyAmount) && Intrinsics.EZpvd((Object) this.convertRate, (Object) activityHistoryVO.convertRate) && this.currencyType == activityHistoryVO.currencyType && this.toCurrencyType == activityHistoryVO.toCurrencyType && this.fromCurrencyType == activityHistoryVO.fromCurrencyType && Intrinsics.EZpvd(this.activitySource, activityHistoryVO.activitySource) && Intrinsics.EZpvd(this.chainIndex, activityHistoryVO.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) activityHistoryVO.tokenAddress) && Intrinsics.EZpvd((Object) this.chainIcon, (Object) activityHistoryVO.chainIcon) && Intrinsics.EZpvd(this.paymentInfo, activityHistoryVO.paymentInfo);
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
    public final String getBizType() {
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
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomCell getCustomCell() {
        return this.customCell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventTime() {
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
    public final String getFromCurrencyName() {
        return this.fromCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyType getFromCurrencyType() {
        return this.fromCurrencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
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
    public final Sign getSign() {
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
    public final String getToCurrencyName() {
        return this.toCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyType getToCurrencyType() {
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
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = Long.hashCode(this.id);
        int iHashCode3 = Integer.hashCode(this.currencyId);
        int iHashCode4 = this.currency.hashCode();
        int iHashCode5 = this.currencyIcon.hashCode();
        String str = this.bizType;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Integer num = this.eventType;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.eventStatus;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.rawEventStatus;
        int iHashCode9 = num3 == null ? 0 : num3.hashCode();
        String str2 = this.tradeId;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.activityStr;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.statusStr;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.abnormalStatusStr;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.amount;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.fiatValuation;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        int iHashCode16 = this.sign.hashCode();
        Boolean bool = this.riseColor;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        String str8 = this.orderId;
        int iHashCode18 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.redirectDeeplink;
        int iHashCode19 = str9 == null ? 0 : str9.hashCode();
        Integer num4 = this.cellType;
        int iHashCode20 = num4 == null ? 0 : num4.hashCode();
        CustomCell customCell = this.customCell;
        int iHashCode21 = customCell == null ? 0 : customCell.hashCode();
        Long l = this.createdTime;
        int iHashCode22 = l == null ? 0 : l.hashCode();
        Long l2 = this.modifyTime;
        if (l2 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = l2.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode23 = Long.hashCode(this.eventTime);
        String str10 = this.toCurrencyName;
        int iHashCode24 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.toCurrencyFullName;
        int iHashCode25 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.toCurrencyIcon;
        int iHashCode26 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.toCurrencyAmount;
        int iHashCode27 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.fromCurrencyName;
        int iHashCode28 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.fromCurrencyFullName;
        int iHashCode29 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.fromCurrencyIcon;
        int iHashCode30 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.fromCurrencyAmount;
        int iHashCode31 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.convertRate;
        int iHashCode32 = str18 == null ? 0 : str18.hashCode();
        CurrencyType currencyType = this.currencyType;
        int iHashCode33 = currencyType == null ? 0 : currencyType.hashCode();
        CurrencyType currencyType2 = this.toCurrencyType;
        int iHashCode34 = currencyType2 == null ? 0 : currencyType2.hashCode();
        CurrencyType currencyType3 = this.fromCurrencyType;
        int iHashCode35 = currencyType3 == null ? 0 : currencyType3.hashCode();
        Integer num5 = this.activitySource;
        int iHashCode36 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.chainIndex;
        int iHashCode37 = num6 == null ? 0 : num6.hashCode();
        String str19 = this.tokenAddress;
        int iHashCode38 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.chainIcon;
        int iHashCode39 = str20 == null ? 0 : str20.hashCode();
        PaymentInfo paymentInfo = this.paymentInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + (paymentInfo == null ? 0 : paymentInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityHistoryVO(id=" + this.id + ", currencyId=" + this.currencyId + ", currency=" + this.currency + ", currencyIcon=" + this.currencyIcon + ", bizType=" + this.bizType + ", eventType=" + this.eventType + ", eventStatus=" + this.eventStatus + ", rawEventStatus=" + this.rawEventStatus + ", tradeId=" + this.tradeId + ", activityStr=" + this.activityStr + ", statusStr=" + this.statusStr + ", abnormalStatusStr=" + this.abnormalStatusStr + ", amount=" + this.amount + ", fiatValuation=" + this.fiatValuation + ", sign=" + this.sign + ", riseColor=" + this.riseColor + ", orderId=" + this.orderId + ", redirectDeeplink=" + this.redirectDeeplink + ", cellType=" + this.cellType + ", customCell=" + this.customCell + ", createdTime=" + this.createdTime + ", modifyTime=" + this.modifyTime + ", eventTime=" + this.eventTime + ", toCurrencyName=" + this.toCurrencyName + ", toCurrencyFullName=" + this.toCurrencyFullName + ", toCurrencyIcon=" + this.toCurrencyIcon + ", toCurrencyAmount=" + this.toCurrencyAmount + ", fromCurrencyName=" + this.fromCurrencyName + ", fromCurrencyFullName=" + this.fromCurrencyFullName + ", fromCurrencyIcon=" + this.fromCurrencyIcon + ", fromCurrencyAmount=" + this.fromCurrencyAmount + ", convertRate=" + this.convertRate + ", currencyType=" + this.currencyType + ", toCurrencyType=" + this.toCurrencyType + ", fromCurrencyType=" + this.fromCurrencyType + ", activitySource=" + this.activitySource + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", chainIcon=" + this.chainIcon + ", paymentInfo=" + this.paymentInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.currency);
        parcel.writeString(this.currencyIcon);
        parcel.writeString(this.bizType);
        Integer num = this.eventType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.eventStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.rawEventStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.tradeId);
        parcel.writeString(this.activityStr);
        parcel.writeString(this.statusStr);
        parcel.writeString(this.abnormalStatusStr);
        parcel.writeString(this.amount);
        parcel.writeString(this.fiatValuation);
        this.sign.writeToParcel(parcel, i);
        Boolean bool = this.riseColor;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.orderId);
        parcel.writeString(this.redirectDeeplink);
        Integer num4 = this.cellType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        CustomCell customCell = this.customCell;
        if (customCell == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customCell.writeToParcel(parcel, i);
        }
        Long l = this.createdTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.modifyTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeLong(this.eventTime);
        parcel.writeString(this.toCurrencyName);
        parcel.writeString(this.toCurrencyFullName);
        parcel.writeString(this.toCurrencyIcon);
        parcel.writeString(this.toCurrencyAmount);
        parcel.writeString(this.fromCurrencyName);
        parcel.writeString(this.fromCurrencyFullName);
        parcel.writeString(this.fromCurrencyIcon);
        parcel.writeString(this.fromCurrencyAmount);
        parcel.writeString(this.convertRate);
        CurrencyType currencyType = this.currencyType;
        if (currencyType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currencyType.writeToParcel(parcel, i);
        }
        CurrencyType currencyType2 = this.toCurrencyType;
        if (currencyType2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currencyType2.writeToParcel(parcel, i);
        }
        CurrencyType currencyType3 = this.fromCurrencyType;
        if (currencyType3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currencyType3.writeToParcel(parcel, i);
        }
        Integer num5 = this.activitySource;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.chainIndex;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.chainIcon);
        PaymentInfo paymentInfo = this.paymentInfo;
        if (paymentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityHistoryVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityHistoryVO> serializer() {
            return ActivityHistoryVO$$serializer.INSTANCE;
        }
    }

    static {
        KSerializer<Sign> kSerializerSerializer = Sign.Companion.serializer();
        CurrencyType.Companion companion = CurrencyType.Companion;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, kSerializerSerializer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, companion.serializer(), companion.serializer(), companion.serializer(), null, null, null, null, null};
    }

    public /* synthetic */ ActivityHistoryVO(int i, int i2, long j, int i3, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, String str6, String str7, String str8, String str9, Sign sign, Boolean bool, String str10, String str11, Integer num4, CustomCell customCell, Long l, Long l2, long j2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, CurrencyType currencyType, CurrencyType currencyType2, CurrencyType currencyType3, Integer num5, Integer num6, String str21, String str22, PaymentInfo paymentInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 2) == 0) {
            this.currencyId = 0;
        } else {
            this.currencyId = i3;
        }
        if ((i & 4) == 0) {
            this.currency = "";
        } else {
            this.currency = str;
        }
        if ((i & 8) == 0) {
            this.currencyIcon = "";
        } else {
            this.currencyIcon = str2;
        }
        if ((i & 16) == 0) {
            this.bizType = null;
        } else {
            this.bizType = str3;
        }
        this.eventType = (i & 32) == 0 ? 0 : num;
        this.eventStatus = (i & 64) == 0 ? 0 : num2;
        this.rawEventStatus = (i & 128) == 0 ? 0 : num3;
        if ((i & 256) == 0) {
            this.tradeId = "";
        } else {
            this.tradeId = str4;
        }
        if ((i & 512) == 0) {
            this.activityStr = "";
        } else {
            this.activityStr = str5;
        }
        if ((i & 1024) == 0) {
            this.statusStr = "";
        } else {
            this.statusStr = str6;
        }
        if ((i & 2048) == 0) {
            this.abnormalStatusStr = "";
        } else {
            this.abnormalStatusStr = str7;
        }
        if ((i & 4096) == 0) {
            this.amount = "";
        } else {
            this.amount = str8;
        }
        if ((i & 8192) == 0) {
            this.fiatValuation = "";
        } else {
            this.fiatValuation = str9;
        }
        this.sign = (i & 16384) == 0 ? Sign.NO_SIGN : sign;
        this.riseColor = (32768 & i) == 0 ? Boolean.FALSE : bool;
        if ((65536 & i) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str10;
        }
        if ((131072 & i) == 0) {
            this.redirectDeeplink = "";
        } else {
            this.redirectDeeplink = str11;
        }
        this.cellType = (262144 & i) == 0 ? 0 : num4;
        if ((524288 & i) == 0) {
            this.customCell = null;
        } else {
            this.customCell = customCell;
        }
        this.createdTime = (1048576 & i) == 0 ? 0L : l;
        this.modifyTime = (2097152 & i) == 0 ? 0L : l2;
        if ((4194304 & i) == 0) {
            this.eventTime = 0L;
        } else {
            this.eventTime = j2;
        }
        if ((8388608 & i) == 0) {
            this.toCurrencyName = null;
        } else {
            this.toCurrencyName = str12;
        }
        if ((16777216 & i) == 0) {
            this.toCurrencyFullName = null;
        } else {
            this.toCurrencyFullName = str13;
        }
        if ((33554432 & i) == 0) {
            this.toCurrencyIcon = null;
        } else {
            this.toCurrencyIcon = str14;
        }
        if ((67108864 & i) == 0) {
            this.toCurrencyAmount = null;
        } else {
            this.toCurrencyAmount = str15;
        }
        if ((134217728 & i) == 0) {
            this.fromCurrencyName = null;
        } else {
            this.fromCurrencyName = str16;
        }
        if ((268435456 & i) == 0) {
            this.fromCurrencyFullName = null;
        } else {
            this.fromCurrencyFullName = str17;
        }
        if ((536870912 & i) == 0) {
            this.fromCurrencyIcon = null;
        } else {
            this.fromCurrencyIcon = str18;
        }
        if ((1073741824 & i) == 0) {
            this.fromCurrencyAmount = null;
        } else {
            this.fromCurrencyAmount = str19;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.convertRate = null;
        } else {
            this.convertRate = str20;
        }
        this.currencyType = (i2 & 1) == 0 ? CurrencyType.NORMAL_CRYPTO : currencyType;
        this.toCurrencyType = (i2 & 2) == 0 ? CurrencyType.NORMAL_CRYPTO : currencyType2;
        this.fromCurrencyType = (i2 & 4) == 0 ? CurrencyType.NORMAL_CRYPTO : currencyType3;
        this.activitySource = (i2 & 8) == 0 ? Integer.valueOf(ActivityCurrencySource.CEFI.getSource()) : num5;
        this.chainIndex = (i2 & 16) == 0 ? -1 : num6;
        if ((i2 & 32) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str21;
        }
        if ((i2 & 64) == 0) {
            this.chainIcon = null;
        } else {
            this.chainIcon = str22;
        }
        if ((i2 & 128) == 0) {
            this.paymentInfo = null;
        } else {
            this.paymentInfo = paymentInfo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [34=6] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKAssetsLite_assets_lite_api(ActivityHistoryVO activityHistoryVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Long l;
        Long l2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || activityHistoryVO.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, activityHistoryVO.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || activityHistoryVO.currencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, activityHistoryVO.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) activityHistoryVO.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, activityHistoryVO.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) activityHistoryVO.currencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, activityHistoryVO.currencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || activityHistoryVO.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, activityHistoryVO.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num5 = activityHistoryVO.eventType) == null || num5.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, activityHistoryVO.eventType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num4 = activityHistoryVO.eventStatus) == null || num4.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, activityHistoryVO.eventStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num3 = activityHistoryVO.rawEventStatus) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, activityHistoryVO.rawEventStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) activityHistoryVO.tradeId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, activityHistoryVO.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) activityHistoryVO.activityStr, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, activityHistoryVO.activityStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) activityHistoryVO.statusStr, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, activityHistoryVO.statusStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) activityHistoryVO.abnormalStatusStr, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, activityHistoryVO.abnormalStatusStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) activityHistoryVO.amount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, activityHistoryVO.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) activityHistoryVO.fiatValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, activityHistoryVO.fiatValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || activityHistoryVO.sign != Sign.NO_SIGN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], activityHistoryVO.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(activityHistoryVO.riseColor, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, activityHistoryVO.riseColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) activityHistoryVO.orderId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, activityHistoryVO.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) activityHistoryVO.redirectDeeplink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, activityHistoryVO.redirectDeeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || (num2 = activityHistoryVO.cellType) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, activityHistoryVO.cellType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || activityHistoryVO.customCell != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, CustomCell$$serializer.INSTANCE, activityHistoryVO.customCell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || (l2 = activityHistoryVO.createdTime) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, LongSerializer.INSTANCE, activityHistoryVO.createdTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || (l = activityHistoryVO.modifyTime) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, LongSerializer.INSTANCE, activityHistoryVO.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || activityHistoryVO.eventTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 22, activityHistoryVO.eventTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || activityHistoryVO.toCurrencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || activityHistoryVO.toCurrencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || activityHistoryVO.toCurrencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || activityHistoryVO.toCurrencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, activityHistoryVO.toCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || activityHistoryVO.fromCurrencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || activityHistoryVO.fromCurrencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || activityHistoryVO.fromCurrencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || activityHistoryVO.fromCurrencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, activityHistoryVO.fromCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || activityHistoryVO.convertRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, activityHistoryVO.convertRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || activityHistoryVO.currencyType != CurrencyType.NORMAL_CRYPTO) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, kSerializerArr[32], activityHistoryVO.currencyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || activityHistoryVO.toCurrencyType != CurrencyType.NORMAL_CRYPTO) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, kSerializerArr[33], activityHistoryVO.toCurrencyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || activityHistoryVO.fromCurrencyType != CurrencyType.NORMAL_CRYPTO) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, kSerializerArr[34], activityHistoryVO.fromCurrencyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, IntSerializer.INSTANCE, activityHistoryVO.activitySource);
        } else {
            Integer num6 = activityHistoryVO.activitySource;
            int source = ActivityCurrencySource.CEFI.getSource();
            if (num6 == null || num6.intValue() != source) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || (num = activityHistoryVO.chainIndex) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, IntSerializer.INSTANCE, activityHistoryVO.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || activityHistoryVO.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, activityHistoryVO.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || activityHistoryVO.chainIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, activityHistoryVO.chainIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) && activityHistoryVO.paymentInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, PaymentInfo$$serializer.INSTANCE, activityHistoryVO.paymentInfo);
    }

    public ActivityHistoryVO(long j, int i, @NotNull String str, @NotNull String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull Sign sign, Boolean bool, String str10, String str11, Integer num4, CustomCell customCell, Long l, Long l2, long j2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, CurrencyType currencyType, CurrencyType currencyType2, CurrencyType currencyType3, Integer num5, Integer num6, String str21, String str22, PaymentInfo paymentInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(sign, "");
        this.id = j;
        this.currencyId = i;
        this.currency = str;
        this.currencyIcon = str2;
        this.bizType = str3;
        this.eventType = num;
        this.eventStatus = num2;
        this.rawEventStatus = num3;
        this.tradeId = str4;
        this.activityStr = str5;
        this.statusStr = str6;
        this.abnormalStatusStr = str7;
        this.amount = str8;
        this.fiatValuation = str9;
        this.sign = sign;
        this.riseColor = bool;
        this.orderId = str10;
        this.redirectDeeplink = str11;
        this.cellType = num4;
        this.customCell = customCell;
        this.createdTime = l;
        this.modifyTime = l2;
        this.eventTime = j2;
        this.toCurrencyName = str12;
        this.toCurrencyFullName = str13;
        this.toCurrencyIcon = str14;
        this.toCurrencyAmount = str15;
        this.fromCurrencyName = str16;
        this.fromCurrencyFullName = str17;
        this.fromCurrencyIcon = str18;
        this.fromCurrencyAmount = str19;
        this.convertRate = str20;
        this.currencyType = currencyType;
        this.toCurrencyType = currencyType2;
        this.fromCurrencyType = currencyType3;
        this.activitySource = num5;
        this.chainIndex = num6;
        this.tokenAddress = str21;
        this.chainIcon = str22;
        this.paymentInfo = paymentInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01fd: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r85v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r43v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r85v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r85v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r85v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r85v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0035: ARITH (r85v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0040: ARITH (r85v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004b: ARITH (r85v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r51v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r85v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r85v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r85v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r85v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:0x0083: TERNARY null = ((wrap:int:0x007a: ARITH (r85v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:0x008e: TERNARY null = ((wrap:int:0x0085: ARITH (r85v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.Sign:?: TERNARY null = ((wrap:int:0x0090: ARITH (r85v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0094: SGET  A[WRAPPED] (LINE:69) com.okinc.okassetslite.api.assets_lite_api.common.model.Sign.NO_SIGN com.okinc.okassetslite.api.assets_lite_api.common.model.Sign) : (r58v0 com.okinc.okassetslite.api.assets_lite_api.common.model.Sign))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x009c: ARITH (r85v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a0: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r59v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r85v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r85v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r85v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r62v0 java.lang.Integer))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell:?: TERNARY null = ((wrap:int:0x00cc: ARITH (r85v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell) : (r63v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r85v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r64v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r85v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r65v0 java.lang.Long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r85v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r66v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r85v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0103: ARITH (r85v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010e: ARITH (r85v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0119: ARITH (r85v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0124: ARITH (r85v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012f: ARITH (r85v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013a: ARITH (r85v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0145: ARITH (r85v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0150: ARITH (r85v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType:?: TERNARY null = ((wrap:int:0x0158: ARITH (r86v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015c: SGET  A[WRAPPED] (LINE:119) com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType.NORMAL_CRYPTO com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType) : (r77v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType:?: TERNARY null = ((wrap:int:0x0161: ARITH (r86v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0165: SGET  A[WRAPPED] (LINE:122) com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType.NORMAL_CRYPTO com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType) : (r78v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType:?: TERNARY null = ((wrap:int:0x016a: ARITH (r86v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x016e: SGET  A[WRAPPED] (LINE:125) com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType.NORMAL_CRYPTO com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType) : (r79v0 com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0173: ARITH (r86v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x017d: INVOKE 
  (wrap:int:0x0179: INVOKE 
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityCurrencySource:0x0177: SGET  A[WRAPPED] (LINE:129) com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityCurrencySource.CEFI com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityCurrencySource)
 VIRTUAL call: com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityCurrencySource.getSource():int A[MD:():int (m), WRAPPED] (LINE:129))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:129)) : (r80v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0184: ARITH (r86v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r81v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0191: ARITH (r86v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x019a: ARITH (r86v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.PaymentInfo:?: TERNARY null = ((wrap:int:0x01a3: ARITH (r86v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.PaymentInfo) : (r84v0 com.okinc.okassetslite.api.assets_lite_api.common.model.PaymentInfo))
 A[MD:(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okassetslite.api.assets_lite_api.common.model.Sign, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell, java.lang.Long, java.lang.Long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType, com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType, com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.okassetslite.api.assets_lite_api.common.model.PaymentInfo):void (m)] (LINE:37) call: com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityHistoryVO.<init>(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okassetslite.api.assets_lite_api.common.model.Sign, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell, java.lang.Long, java.lang.Long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType, com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType, com.okinc.okassetslite.api.assets_lite_api.common.model.CurrencyType, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.okassetslite.api.assets_lite_api.common.model.PaymentInfo):void type: THIS */
    public /* synthetic */ ActivityHistoryVO(long j, int i, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, String str6, String str7, String str8, String str9, Sign sign, Boolean bool, String str10, String str11, Integer num4, CustomCell customCell, Long l, Long l2, long j2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, CurrencyType currencyType, CurrencyType currencyType2, CurrencyType currencyType3, Integer num5, Integer num6, String str21, String str22, PaymentInfo paymentInfo, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : num, (i2 & 64) != 0 ? 0 : num2, (i2 & 128) != 0 ? 0 : num3, (i2 & 256) != 0 ? "" : str4, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? "" : str6, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) != 0 ? "" : str8, (i2 & 8192) != 0 ? "" : str9, (i2 & 16384) != 0 ? Sign.NO_SIGN : sign, (i2 & 32768) != 0 ? Boolean.FALSE : bool, (i2 & 65536) != 0 ? "" : str10, (i2 & 131072) != 0 ? "" : str11, (i2 & 262144) != 0 ? 0 : num4, (i2 & 524288) != 0 ? null : customCell, (i2 & 1048576) != 0 ? 0L : l, (i2 & 2097152) != 0 ? 0L : l2, (i2 & 4194304) != 0 ? 0L : j2, (i2 & 8388608) != 0 ? null : str12, (i2 & 16777216) != 0 ? null : str13, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str14, (i2 & 67108864) != 0 ? null : str15, (i2 & 134217728) != 0 ? null : str16, (i2 & 268435456) != 0 ? null : str17, (i2 & 536870912) != 0 ? null : str18, (i2 & 1073741824) != 0 ? null : str19, (i2 & Integer.MIN_VALUE) != 0 ? null : str20, (i3 & 1) != 0 ? CurrencyType.NORMAL_CRYPTO : currencyType, (i3 & 2) != 0 ? CurrencyType.NORMAL_CRYPTO : currencyType2, (i3 & 4) != 0 ? CurrencyType.NORMAL_CRYPTO : currencyType3, (i3 & 8) != 0 ? Integer.valueOf(ActivityCurrencySource.CEFI.getSource()) : num5, (i3 & 16) != 0 ? -1 : num6, (i3 & 32) != 0 ? null : str21, (i3 & 64) != 0 ? null : str22, (i3 & 128) != 0 ? null : paymentInfo);
    }
}
