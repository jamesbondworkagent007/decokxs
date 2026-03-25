package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class DcdBotQuotesDetail implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DcdBotQuotesDetail> CREATOR = new Creator();
    private final String absYieldPercentage;
    private final String alternativeCurrency;
    private final String annualYieldPercentage;
    private final String availableQuota;
    private final String currency;
    private final String currencyScale;
    private final String expiryTime;
    private final String indicativeAbsYieldPercentage;
    private final String indicativeAnnualYieldPercentage;
    private final String interestAccuralTime;
    private final String launchTime;
    private final String notional;
    private final String quoteId;
    private final String settlementTime;
    private final String stopTradingTime;
    private final String strike;
    private final String symbol;
    private final String term;
    private final String tradeSizeMax;
    private final String tradeSizeMin;
    private final String tradeStepSize;
    private final String type;
    private final String underlyingIndex;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<DcdBotQuotesDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdBotQuotesDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcdBotQuotesDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdBotQuotesDetail[] newArray(int i) {
            return new DcdBotQuotesDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdBotQuotesDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.indicativeAbsYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.interestAccuralTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.availableQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tradeSizeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.tradeSizeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.tradeStepSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.currencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.launchTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stopTradingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.annualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.indicativeAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdBotQuotesDetail copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        return new DcdBotQuotesDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
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
        if (!(obj instanceof DcdBotQuotesDetail)) {
            return false;
        }
        DcdBotQuotesDetail dcdBotQuotesDetail = (DcdBotQuotesDetail) obj;
        return Intrinsics.EZpvd((Object) this.quoteId, (Object) dcdBotQuotesDetail.quoteId) && Intrinsics.EZpvd((Object) this.symbol, (Object) dcdBotQuotesDetail.symbol) && Intrinsics.EZpvd((Object) this.underlyingIndex, (Object) dcdBotQuotesDetail.underlyingIndex) && Intrinsics.EZpvd((Object) this.launchTime, (Object) dcdBotQuotesDetail.launchTime) && Intrinsics.EZpvd((Object) this.stopTradingTime, (Object) dcdBotQuotesDetail.stopTradingTime) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) dcdBotQuotesDetail.settlementTime) && Intrinsics.EZpvd((Object) this.annualYieldPercentage, (Object) dcdBotQuotesDetail.annualYieldPercentage) && Intrinsics.EZpvd((Object) this.indicativeAnnualYieldPercentage, (Object) dcdBotQuotesDetail.indicativeAnnualYieldPercentage) && Intrinsics.EZpvd((Object) this.absYieldPercentage, (Object) dcdBotQuotesDetail.absYieldPercentage) && Intrinsics.EZpvd((Object) this.indicativeAbsYieldPercentage, (Object) dcdBotQuotesDetail.indicativeAbsYieldPercentage) && Intrinsics.EZpvd((Object) this.term, (Object) dcdBotQuotesDetail.term) && Intrinsics.EZpvd((Object) this.interestAccuralTime, (Object) dcdBotQuotesDetail.interestAccuralTime) && Intrinsics.EZpvd((Object) this.notional, (Object) dcdBotQuotesDetail.notional) && Intrinsics.EZpvd((Object) this.currency, (Object) dcdBotQuotesDetail.currency) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) dcdBotQuotesDetail.alternativeCurrency) && Intrinsics.EZpvd((Object) this.type, (Object) dcdBotQuotesDetail.type) && Intrinsics.EZpvd((Object) this.strike, (Object) dcdBotQuotesDetail.strike) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) dcdBotQuotesDetail.expiryTime) && Intrinsics.EZpvd((Object) this.availableQuota, (Object) dcdBotQuotesDetail.availableQuota) && Intrinsics.EZpvd((Object) this.tradeSizeMin, (Object) dcdBotQuotesDetail.tradeSizeMin) && Intrinsics.EZpvd((Object) this.tradeSizeMax, (Object) dcdBotQuotesDetail.tradeSizeMax) && Intrinsics.EZpvd((Object) this.tradeStepSize, (Object) dcdBotQuotesDetail.tradeStepSize) && Intrinsics.EZpvd((Object) this.currencyScale, (Object) dcdBotQuotesDetail.currencyScale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbsYieldPercentage() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualYieldPercentage() {
        return this.annualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableQuota() {
        return this.availableQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyScale() {
        return this.currencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndicativeAbsYieldPercentage() {
        return this.indicativeAbsYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndicativeAnnualYieldPercentage() {
        return this.indicativeAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestAccuralTime() {
        return this.interestAccuralTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLaunchTime() {
        return this.launchTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopTradingTime() {
        return this.stopTradingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTerm() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSizeMax() {
        return this.tradeSizeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSizeMin() {
        return this.tradeSizeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeStepSize() {
        return this.tradeStepSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingIndex() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.quoteId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.underlyingIndex;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.launchTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.stopTradingTime;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.settlementTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.annualYieldPercentage;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.indicativeAnnualYieldPercentage;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.absYieldPercentage;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.indicativeAbsYieldPercentage;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.term;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.interestAccuralTime;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.notional;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.currency;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.alternativeCurrency;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.type;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.strike;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.expiryTime;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.availableQuota;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.tradeSizeMin;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.tradeSizeMax;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.tradeStepSize;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.currencyScale;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str23 == null ? 0 : str23.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcdBotQuotesDetail(quoteId=" + this.quoteId + ", symbol=" + this.symbol + ", underlyingIndex=" + this.underlyingIndex + ", launchTime=" + this.launchTime + ", stopTradingTime=" + this.stopTradingTime + ", settlementTime=" + this.settlementTime + ", annualYieldPercentage=" + this.annualYieldPercentage + ", indicativeAnnualYieldPercentage=" + this.indicativeAnnualYieldPercentage + ", absYieldPercentage=" + this.absYieldPercentage + ", indicativeAbsYieldPercentage=" + this.indicativeAbsYieldPercentage + ", term=" + this.term + ", interestAccuralTime=" + this.interestAccuralTime + ", notional=" + this.notional + ", currency=" + this.currency + ", alternativeCurrency=" + this.alternativeCurrency + ", type=" + this.type + ", strike=" + this.strike + ", expiryTime=" + this.expiryTime + ", availableQuota=" + this.availableQuota + ", tradeSizeMin=" + this.tradeSizeMin + ", tradeSizeMax=" + this.tradeSizeMax + ", tradeStepSize=" + this.tradeStepSize + ", currencyScale=" + this.currencyScale + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.underlyingIndex);
        parcel.writeString(this.launchTime);
        parcel.writeString(this.stopTradingTime);
        parcel.writeString(this.settlementTime);
        parcel.writeString(this.annualYieldPercentage);
        parcel.writeString(this.indicativeAnnualYieldPercentage);
        parcel.writeString(this.absYieldPercentage);
        parcel.writeString(this.indicativeAbsYieldPercentage);
        parcel.writeString(this.term);
        parcel.writeString(this.interestAccuralTime);
        parcel.writeString(this.notional);
        parcel.writeString(this.currency);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.type);
        parcel.writeString(this.strike);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.availableQuota);
        parcel.writeString(this.tradeSizeMin);
        parcel.writeString(this.tradeSizeMax);
        parcel.writeString(this.tradeStepSize);
        parcel.writeString(this.currencyScale);
    }

    public DcdBotQuotesDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        this.quoteId = str;
        this.symbol = str2;
        this.underlyingIndex = str3;
        this.launchTime = str4;
        this.stopTradingTime = str5;
        this.settlementTime = str6;
        this.annualYieldPercentage = str7;
        this.indicativeAnnualYieldPercentage = str8;
        this.absYieldPercentage = str9;
        this.indicativeAbsYieldPercentage = str10;
        this.term = str11;
        this.interestAccuralTime = str12;
        this.notional = str13;
        this.currency = str14;
        this.alternativeCurrency = str15;
        this.type = str16;
        this.strike = str17;
        this.expiryTime = str18;
        this.availableQuota = str19;
        this.tradeSizeMin = str20;
        this.tradeSizeMax = str21;
        this.tradeStepSize = str22;
        this.currencyScale = str23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0102: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1412) call: com.okinc.unify_trade.biz.DcdBotQuotesDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcdBotQuotesDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23);
    }
}
