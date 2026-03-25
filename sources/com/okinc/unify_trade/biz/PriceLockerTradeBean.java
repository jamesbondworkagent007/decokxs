package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PriceLockerTradeBean implements Parcelable {
    private String alternativeCurrency;
    private String createTime;
    private String currency;
    private String earlyFillAmount;
    private String earlyFillCurrency;
    private String earlyFillPrice;
    private String earlyFillSettleTime;
    private String earlyFilledTime;
    private boolean endStatusFlag;
    private String estimateProfit;
    private String expiryTime;
    private String instId;
    private String instType;
    private String notionalAmount;
    private String notionalAmountPrecision;
    private String notionalCurrency;
    private String participationRatio;
    private String settledTime;
    private String settlementAltAmount;
    private String settlementAltCurrency;
    private String settlementAmount;
    private String settlementCurrency;
    private String settlementPrice;
    private String settlementPricePrecision;
    private String settlementTime;
    private String sizePrecision;
    private String status;
    private String strike;
    private String strikePrecision;
    private boolean supportEarlyFill;
    private String timeLeft;
    private String tradeId;
    private String tradeSide;
    private String turnoverRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerTradeBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PriceLockerTradeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradeBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceLockerTradeBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradeBean[] newArray(int i) {
            return new PriceLockerTradeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceLockerTradeBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.settlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.settlementAltAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.settlementAltCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.settlementPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.settledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.timeLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.sizePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.settlementPricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.earlyFilledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.earlyFillSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.earlyFillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, @NotNull String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z2) {
        Intrinsics.checkNotNullParameter(str26, "");
        return new PriceLockerTradeBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, z, str26, str27, str28, str29, str30, str31, str32, z2);
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
        if (!(obj instanceof PriceLockerTradeBean)) {
            return false;
        }
        PriceLockerTradeBean priceLockerTradeBean = (PriceLockerTradeBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) priceLockerTradeBean.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) priceLockerTradeBean.instType) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) priceLockerTradeBean.alternativeCurrency) && Intrinsics.EZpvd((Object) this.currency, (Object) priceLockerTradeBean.currency) && Intrinsics.EZpvd((Object) this.createTime, (Object) priceLockerTradeBean.createTime) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) priceLockerTradeBean.expiryTime) && Intrinsics.EZpvd((Object) this.notionalAmount, (Object) priceLockerTradeBean.notionalAmount) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) priceLockerTradeBean.notionalCurrency) && Intrinsics.EZpvd((Object) this.participationRatio, (Object) priceLockerTradeBean.participationRatio) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) priceLockerTradeBean.settlementTime) && Intrinsics.EZpvd((Object) this.settlementAmount, (Object) priceLockerTradeBean.settlementAmount) && Intrinsics.EZpvd((Object) this.settlementCurrency, (Object) priceLockerTradeBean.settlementCurrency) && Intrinsics.EZpvd((Object) this.settlementAltAmount, (Object) priceLockerTradeBean.settlementAltAmount) && Intrinsics.EZpvd((Object) this.settlementAltCurrency, (Object) priceLockerTradeBean.settlementAltCurrency) && Intrinsics.EZpvd((Object) this.settlementPrice, (Object) priceLockerTradeBean.settlementPrice) && Intrinsics.EZpvd((Object) this.settledTime, (Object) priceLockerTradeBean.settledTime) && Intrinsics.EZpvd((Object) this.status, (Object) priceLockerTradeBean.status) && Intrinsics.EZpvd((Object) this.strike, (Object) priceLockerTradeBean.strike) && Intrinsics.EZpvd((Object) this.tradeId, (Object) priceLockerTradeBean.tradeId) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) priceLockerTradeBean.tradeSide) && Intrinsics.EZpvd((Object) this.timeLeft, (Object) priceLockerTradeBean.timeLeft) && Intrinsics.EZpvd((Object) this.notionalAmountPrecision, (Object) priceLockerTradeBean.notionalAmountPrecision) && Intrinsics.EZpvd((Object) this.sizePrecision, (Object) priceLockerTradeBean.sizePrecision) && Intrinsics.EZpvd((Object) this.strikePrecision, (Object) priceLockerTradeBean.strikePrecision) && Intrinsics.EZpvd((Object) this.settlementPricePrecision, (Object) priceLockerTradeBean.settlementPricePrecision) && this.endStatusFlag == priceLockerTradeBean.endStatusFlag && Intrinsics.EZpvd((Object) this.estimateProfit, (Object) priceLockerTradeBean.estimateProfit) && Intrinsics.EZpvd((Object) this.earlyFilledTime, (Object) priceLockerTradeBean.earlyFilledTime) && Intrinsics.EZpvd((Object) this.earlyFillAmount, (Object) priceLockerTradeBean.earlyFillAmount) && Intrinsics.EZpvd((Object) this.earlyFillCurrency, (Object) priceLockerTradeBean.earlyFillCurrency) && Intrinsics.EZpvd((Object) this.earlyFillSettleTime, (Object) priceLockerTradeBean.earlyFillSettleTime) && Intrinsics.EZpvd((Object) this.earlyFillPrice, (Object) priceLockerTradeBean.earlyFillPrice) && Intrinsics.EZpvd((Object) this.turnoverRatio, (Object) priceLockerTradeBean.turnoverRatio) && this.supportEarlyFill == priceLockerTradeBean.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillAmount() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillCurrency() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillPrice() {
        return this.earlyFillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillSettleTime() {
        return this.earlyFillSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFilledTime() {
        return this.earlyFilledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEndStatusFlag() {
        return this.endStatusFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateProfit() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalAmount() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalAmountPrecision() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCurrency() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParticipationRatio() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceDigit() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettledTime() {
        return this.settledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementAltAmount() {
        return this.settlementAltAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementAltCurrency() {
        return this.settlementAltCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementAmount() {
        return this.settlementAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementCurrency() {
        return this.settlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementPrice() {
        return this.settlementPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementPricePrecision() {
        return this.settlementPricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSizePrecision() {
        return this.sizePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikePrecision() {
        return this.strikePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEarlyFill() {
        return this.supportEarlyFill;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeLeft() {
        return this.timeLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnoverRatio() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.alternativeCurrency;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currency;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.createTime;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.expiryTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.notionalAmount;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.notionalCurrency;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.participationRatio;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.settlementTime;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.settlementAmount;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.settlementCurrency;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.settlementAltAmount;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.settlementAltCurrency;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.settlementPrice;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.settledTime;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.status;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.strike;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.tradeId;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.tradeSide;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.timeLeft;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.notionalAmountPrecision;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.sizePrecision;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.strikePrecision;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.settlementPricePrecision;
        int iHashCode25 = str25 == null ? 0 : str25.hashCode();
        int iHashCode26 = Boolean.hashCode(this.endStatusFlag);
        int iHashCode27 = this.estimateProfit.hashCode();
        String str26 = this.earlyFilledTime;
        int iHashCode28 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.earlyFillAmount;
        int iHashCode29 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.earlyFillCurrency;
        int iHashCode30 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.earlyFillSettleTime;
        int iHashCode31 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.earlyFillPrice;
        int iHashCode32 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.turnoverRatio;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (str31 == null ? 0 : str31.hashCode())) * 31) + Boolean.hashCode(this.supportEarlyFill);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillAmount(String str) {
        this.earlyFillAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillCurrency(String str) {
        this.earlyFillCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillPrice(String str) {
        this.earlyFillPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillSettleTime(String str) {
        this.earlyFillSettleTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFilledTime(String str) {
        this.earlyFilledTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndStatusFlag(boolean z) {
        this.endStatusFlag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiryTime(String str) {
        this.expiryTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalAmount(String str) {
        this.notionalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalAmountPrecision(String str) {
        this.notionalAmountPrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalCurrency(String str) {
        this.notionalCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParticipationRatio(String str) {
        this.participationRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettledTime(String str) {
        this.settledTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAltAmount(String str) {
        this.settlementAltAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAltCurrency(String str) {
        this.settlementAltCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementAmount(String str) {
        this.settlementAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementCurrency(String str) {
        this.settlementCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementPrice(String str) {
        this.settlementPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementPricePrecision(String str) {
        this.settlementPricePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementTime(String str) {
        this.settlementTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSizePrecision(String str) {
        this.sizePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikePrecision(String str) {
        this.strikePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEarlyFill(boolean z) {
        this.supportEarlyFill = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeLeft(String str) {
        this.timeLeft = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeId(String str) {
        this.tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTurnoverRatio(String str) {
        this.turnoverRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerTradeBean(instId=" + this.instId + ", instType=" + this.instType + ", alternativeCurrency=" + this.alternativeCurrency + ", currency=" + this.currency + ", createTime=" + this.createTime + ", expiryTime=" + this.expiryTime + ", notionalAmount=" + this.notionalAmount + ", notionalCurrency=" + this.notionalCurrency + ", participationRatio=" + this.participationRatio + ", settlementTime=" + this.settlementTime + ", settlementAmount=" + this.settlementAmount + ", settlementCurrency=" + this.settlementCurrency + ", settlementAltAmount=" + this.settlementAltAmount + ", settlementAltCurrency=" + this.settlementAltCurrency + ", settlementPrice=" + this.settlementPrice + ", settledTime=" + this.settledTime + ", status=" + this.status + ", strike=" + this.strike + ", tradeId=" + this.tradeId + ", tradeSide=" + this.tradeSide + ", timeLeft=" + this.timeLeft + ", notionalAmountPrecision=" + this.notionalAmountPrecision + ", sizePrecision=" + this.sizePrecision + ", strikePrecision=" + this.strikePrecision + ", settlementPricePrecision=" + this.settlementPricePrecision + ", endStatusFlag=" + this.endStatusFlag + ", estimateProfit=" + this.estimateProfit + ", earlyFilledTime=" + this.earlyFilledTime + ", earlyFillAmount=" + this.earlyFillAmount + ", earlyFillCurrency=" + this.earlyFillCurrency + ", earlyFillSettleTime=" + this.earlyFillSettleTime + ", earlyFillPrice=" + this.earlyFillPrice + ", turnoverRatio=" + this.turnoverRatio + ", supportEarlyFill=" + this.supportEarlyFill + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.currency);
        parcel.writeString(this.createTime);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.notionalAmount);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.participationRatio);
        parcel.writeString(this.settlementTime);
        parcel.writeString(this.settlementAmount);
        parcel.writeString(this.settlementCurrency);
        parcel.writeString(this.settlementAltAmount);
        parcel.writeString(this.settlementAltCurrency);
        parcel.writeString(this.settlementPrice);
        parcel.writeString(this.settledTime);
        parcel.writeString(this.status);
        parcel.writeString(this.strike);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.tradeSide);
        parcel.writeString(this.timeLeft);
        parcel.writeString(this.notionalAmountPrecision);
        parcel.writeString(this.sizePrecision);
        parcel.writeString(this.strikePrecision);
        parcel.writeString(this.settlementPricePrecision);
        parcel.writeInt(this.endStatusFlag ? 1 : 0);
        parcel.writeString(this.estimateProfit);
        parcel.writeString(this.earlyFilledTime);
        parcel.writeString(this.earlyFillAmount);
        parcel.writeString(this.earlyFillCurrency);
        parcel.writeString(this.earlyFillSettleTime);
        parcel.writeString(this.earlyFillPrice);
        parcel.writeString(this.turnoverRatio);
        parcel.writeInt(this.supportEarlyFill ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerTradeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerTradeBean> serializer() {
            return PriceLockerTradeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerTradeBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = null;
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 16) == 0) {
            this.createTime = null;
        } else {
            this.createTime = str5;
        }
        if ((i & 32) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str6;
        }
        if ((i & 64) == 0) {
            this.notionalAmount = null;
        } else {
            this.notionalAmount = str7;
        }
        if ((i & 128) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str8;
        }
        if ((i & 256) == 0) {
            this.participationRatio = null;
        } else {
            this.participationRatio = str9;
        }
        if ((i & 512) == 0) {
            this.settlementTime = null;
        } else {
            this.settlementTime = str10;
        }
        if ((i & 1024) == 0) {
            this.settlementAmount = null;
        } else {
            this.settlementAmount = str11;
        }
        if ((i & 2048) == 0) {
            this.settlementCurrency = null;
        } else {
            this.settlementCurrency = str12;
        }
        if ((i & 4096) == 0) {
            this.settlementAltAmount = null;
        } else {
            this.settlementAltAmount = str13;
        }
        if ((i & 8192) == 0) {
            this.settlementAltCurrency = null;
        } else {
            this.settlementAltCurrency = str14;
        }
        if ((i & 16384) == 0) {
            this.settlementPrice = null;
        } else {
            this.settlementPrice = str15;
        }
        if ((32768 & i) == 0) {
            this.settledTime = null;
        } else {
            this.settledTime = str16;
        }
        if ((65536 & i) == 0) {
            this.status = null;
        } else {
            this.status = str17;
        }
        if ((131072 & i) == 0) {
            this.strike = null;
        } else {
            this.strike = str18;
        }
        if ((262144 & i) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str19;
        }
        if ((524288 & i) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str20;
        }
        if ((1048576 & i) == 0) {
            this.timeLeft = null;
        } else {
            this.timeLeft = str21;
        }
        if ((2097152 & i) == 0) {
            this.notionalAmountPrecision = null;
        } else {
            this.notionalAmountPrecision = str22;
        }
        if ((4194304 & i) == 0) {
            this.sizePrecision = null;
        } else {
            this.sizePrecision = str23;
        }
        if ((8388608 & i) == 0) {
            this.strikePrecision = null;
        } else {
            this.strikePrecision = str24;
        }
        if ((16777216 & i) == 0) {
            this.settlementPricePrecision = null;
        } else {
            this.settlementPricePrecision = str25;
        }
        if ((33554432 & i) == 0) {
            this.endStatusFlag = false;
        } else {
            this.endStatusFlag = z;
        }
        this.estimateProfit = (67108864 & i) == 0 ? "" : str26;
        if ((134217728 & i) == 0) {
            this.earlyFilledTime = null;
        } else {
            this.earlyFilledTime = str27;
        }
        if ((268435456 & i) == 0) {
            this.earlyFillAmount = null;
        } else {
            this.earlyFillAmount = str28;
        }
        if ((536870912 & i) == 0) {
            this.earlyFillCurrency = null;
        } else {
            this.earlyFillCurrency = str29;
        }
        if ((1073741824 & i) == 0) {
            this.earlyFillSettleTime = null;
        } else {
            this.earlyFillSettleTime = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.earlyFillPrice = null;
        } else {
            this.earlyFillPrice = str31;
        }
        if ((i2 & 1) == 0) {
            this.turnoverRatio = null;
        } else {
            this.turnoverRatio = str32;
        }
        if ((i2 & 2) == 0) {
            this.supportEarlyFill = false;
        } else {
            this.supportEarlyFill = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerTradeBean priceLockerTradeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceLockerTradeBean.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceLockerTradeBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceLockerTradeBean.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, priceLockerTradeBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceLockerTradeBean.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, priceLockerTradeBean.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceLockerTradeBean.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, priceLockerTradeBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || priceLockerTradeBean.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, priceLockerTradeBean.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || priceLockerTradeBean.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, priceLockerTradeBean.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || priceLockerTradeBean.notionalAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, priceLockerTradeBean.notionalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || priceLockerTradeBean.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, priceLockerTradeBean.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || priceLockerTradeBean.participationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, priceLockerTradeBean.participationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || priceLockerTradeBean.settlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, priceLockerTradeBean.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || priceLockerTradeBean.settlementAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, priceLockerTradeBean.settlementAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || priceLockerTradeBean.settlementCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, priceLockerTradeBean.settlementCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || priceLockerTradeBean.settlementAltAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, priceLockerTradeBean.settlementAltAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || priceLockerTradeBean.settlementAltCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, priceLockerTradeBean.settlementAltCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || priceLockerTradeBean.settlementPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, priceLockerTradeBean.settlementPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || priceLockerTradeBean.settledTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, priceLockerTradeBean.settledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || priceLockerTradeBean.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, priceLockerTradeBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || priceLockerTradeBean.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, priceLockerTradeBean.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || priceLockerTradeBean.tradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, priceLockerTradeBean.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || priceLockerTradeBean.tradeSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, priceLockerTradeBean.tradeSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || priceLockerTradeBean.timeLeft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, priceLockerTradeBean.timeLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || priceLockerTradeBean.notionalAmountPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, priceLockerTradeBean.notionalAmountPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || priceLockerTradeBean.sizePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, priceLockerTradeBean.sizePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || priceLockerTradeBean.strikePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, priceLockerTradeBean.strikePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || priceLockerTradeBean.settlementPricePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, priceLockerTradeBean.settlementPricePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || priceLockerTradeBean.endStatusFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, priceLockerTradeBean.endStatusFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) priceLockerTradeBean.estimateProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, priceLockerTradeBean.estimateProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || priceLockerTradeBean.earlyFilledTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, priceLockerTradeBean.earlyFilledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || priceLockerTradeBean.earlyFillAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, priceLockerTradeBean.earlyFillAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || priceLockerTradeBean.earlyFillCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, priceLockerTradeBean.earlyFillCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || priceLockerTradeBean.earlyFillSettleTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, priceLockerTradeBean.earlyFillSettleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || priceLockerTradeBean.earlyFillPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, priceLockerTradeBean.earlyFillPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || priceLockerTradeBean.turnoverRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, priceLockerTradeBean.turnoverRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || priceLockerTradeBean.supportEarlyFill) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, priceLockerTradeBean.supportEarlyFill);
        }
    }

    public PriceLockerTradeBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, @NotNull String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z2) {
        Intrinsics.checkNotNullParameter(str26, "");
        this.instId = str;
        this.instType = str2;
        this.alternativeCurrency = str3;
        this.currency = str4;
        this.createTime = str5;
        this.expiryTime = str6;
        this.notionalAmount = str7;
        this.notionalCurrency = str8;
        this.participationRatio = str9;
        this.settlementTime = str10;
        this.settlementAmount = str11;
        this.settlementCurrency = str12;
        this.settlementAltAmount = str13;
        this.settlementAltCurrency = str14;
        this.settlementPrice = str15;
        this.settledTime = str16;
        this.status = str17;
        this.strike = str18;
        this.tradeId = str19;
        this.tradeSide = str20;
        this.timeLeft = str21;
        this.notionalAmountPrecision = str22;
        this.sizePrecision = str23;
        this.strikePrecision = str24;
        this.settlementPricePrecision = str25;
        this.endStatusFlag = z;
        this.estimateProfit = str26;
        this.earlyFilledTime = str27;
        this.earlyFillAmount = str28;
        this.earlyFillCurrency = str29;
        this.earlyFillSettleTime = str30;
        this.earlyFillPrice = str31;
        this.turnoverRatio = str32;
        this.supportEarlyFill = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x018d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r70v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r70v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r70v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r70v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r70v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r70v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r70v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r70v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r70v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r70v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r70v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r70v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r70v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r70v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r70v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r70v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r70v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r70v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r70v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r70v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r70v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r70v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r70v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r70v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0103: ARITH (r70v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010e: ARITH (r70v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0119: ARITH (r70v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0124: ARITH (r70v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012f: ARITH (r70v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0140: ARITH (r71v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r69v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:219) call: com.okinc.unify_trade.biz.PriceLockerTradeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PriceLockerTradeBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z, (i & 67108864) != 0 ? "" : str26, (i & 134217728) != 0 ? null : str27, (i & 268435456) != 0 ? null : str28, (i & 536870912) != 0 ? null : str29, (i & 1073741824) != 0 ? null : str30, (i & Integer.MIN_VALUE) != 0 ? null : str31, (i2 & 1) != 0 ? null : str32, (i2 & 2) == 0 ? z2 : false);
    }

    public final String getRealAmount() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? C33129mqd.divS$default(this.notionalAmount, this.strike, null, null, null, 14, null) : this.notionalAmount;
    }

    public final String getLockAmount() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.notionalAmount : C33129mqd.mulS$default(this.notionalAmount, this.strike, null, null, null, 14, null);
    }

    public final String getBaseDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.sizePrecision : this.notionalAmountPrecision;
    }

    public final String getQuoteDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.notionalAmountPrecision : this.sizePrecision;
    }

    public final String getTotalDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.notionalAmountPrecision : this.strikePrecision;
    }
}
