package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DcdOrderReq implements Parcelable {
    public static final int $stable = 0;
    private final String altCurrencyId;
    private final String apr;
    private final String currencyId;
    private final String currentStrike;
    private final String dcdOptionType;
    private final String expiryTime;
    private final String maxSettlementDay;
    private final String minAnnualYieldPercentage;
    private final String notional;
    private final String notionalCcy;
    private final String quoteId;
    private final String reinvestment;
    private final String stopPercentage;
    private final String stopPrice;
    private final String strike;
    private final String strikePercentage;
    private final String term;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DcdOrderReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DcdOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdOrderReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcdOrderReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdOrderReq[] newArray(int i) {
            return new DcdOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.stopPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.stopPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.altCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.currentStrike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdOrderReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        return new DcdOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
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
        if (!(obj instanceof DcdOrderReq)) {
            return false;
        }
        DcdOrderReq dcdOrderReq = (DcdOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.quoteId, (Object) dcdOrderReq.quoteId) && Intrinsics.EZpvd((Object) this.notional, (Object) dcdOrderReq.notional) && Intrinsics.EZpvd((Object) this.notionalCcy, (Object) dcdOrderReq.notionalCcy) && Intrinsics.EZpvd((Object) this.currencyId, (Object) dcdOrderReq.currencyId) && Intrinsics.EZpvd((Object) this.altCurrencyId, (Object) dcdOrderReq.altCurrencyId) && Intrinsics.EZpvd((Object) this.dcdOptionType, (Object) dcdOrderReq.dcdOptionType) && Intrinsics.EZpvd((Object) this.strike, (Object) dcdOrderReq.strike) && Intrinsics.EZpvd((Object) this.currentStrike, (Object) dcdOrderReq.currentStrike) && Intrinsics.EZpvd((Object) this.strikePercentage, (Object) dcdOrderReq.strikePercentage) && Intrinsics.EZpvd((Object) this.minAnnualYieldPercentage, (Object) dcdOrderReq.minAnnualYieldPercentage) && Intrinsics.EZpvd((Object) this.maxSettlementDay, (Object) dcdOrderReq.maxSettlementDay) && Intrinsics.EZpvd((Object) this.stopPrice, (Object) dcdOrderReq.stopPrice) && Intrinsics.EZpvd((Object) this.stopPercentage, (Object) dcdOrderReq.stopPercentage) && Intrinsics.EZpvd((Object) this.reinvestment, (Object) dcdOrderReq.reinvestment) && Intrinsics.EZpvd((Object) this.term, (Object) dcdOrderReq.term) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) dcdOrderReq.expiryTime) && Intrinsics.EZpvd((Object) this.apr, (Object) dcdOrderReq.apr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAltCurrencyId() {
        return this.altCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentStrike() {
        return this.currentStrike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdOptionType() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSettlementDay() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAnnualYieldPercentage() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCcy() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReinvestment() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopPercentage() {
        return this.stopPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopPrice() {
        return this.stopPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikePercentage() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTerm() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.quoteId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.notional;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.notionalCcy;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currencyId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.altCurrencyId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.dcdOptionType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.strike;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.currentStrike;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.strikePercentage;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.minAnnualYieldPercentage;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.maxSettlementDay;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.stopPrice;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.stopPercentage;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.reinvestment;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.term;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.expiryTime;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.apr;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str17 == null ? 0 : str17.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcdOrderReq(quoteId=" + this.quoteId + ", notional=" + this.notional + ", notionalCcy=" + this.notionalCcy + ", currencyId=" + this.currencyId + ", altCurrencyId=" + this.altCurrencyId + ", dcdOptionType=" + this.dcdOptionType + ", strike=" + this.strike + ", currentStrike=" + this.currentStrike + ", strikePercentage=" + this.strikePercentage + ", minAnnualYieldPercentage=" + this.minAnnualYieldPercentage + ", maxSettlementDay=" + this.maxSettlementDay + ", stopPrice=" + this.stopPrice + ", stopPercentage=" + this.stopPercentage + ", reinvestment=" + this.reinvestment + ", term=" + this.term + ", expiryTime=" + this.expiryTime + ", apr=" + this.apr + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteId);
        parcel.writeString(this.notional);
        parcel.writeString(this.notionalCcy);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.altCurrencyId);
        parcel.writeString(this.dcdOptionType);
        parcel.writeString(this.strike);
        parcel.writeString(this.currentStrike);
        parcel.writeString(this.strikePercentage);
        parcel.writeString(this.minAnnualYieldPercentage);
        parcel.writeString(this.maxSettlementDay);
        parcel.writeString(this.stopPrice);
        parcel.writeString(this.stopPercentage);
        parcel.writeString(this.reinvestment);
        parcel.writeString(this.term);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.apr);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcdOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcdOrderReq> serializer() {
            return DcdOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcdOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str;
        }
        if ((i & 2) == 0) {
            this.notional = null;
        } else {
            this.notional = str2;
        }
        if ((i & 4) == 0) {
            this.notionalCcy = null;
        } else {
            this.notionalCcy = str3;
        }
        if ((i & 8) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = str4;
        }
        if ((i & 16) == 0) {
            this.altCurrencyId = null;
        } else {
            this.altCurrencyId = str5;
        }
        if ((i & 32) == 0) {
            this.dcdOptionType = null;
        } else {
            this.dcdOptionType = str6;
        }
        if ((i & 64) == 0) {
            this.strike = null;
        } else {
            this.strike = str7;
        }
        if ((i & 128) == 0) {
            this.currentStrike = null;
        } else {
            this.currentStrike = str8;
        }
        if ((i & 256) == 0) {
            this.strikePercentage = null;
        } else {
            this.strikePercentage = str9;
        }
        if ((i & 512) == 0) {
            this.minAnnualYieldPercentage = null;
        } else {
            this.minAnnualYieldPercentage = str10;
        }
        if ((i & 1024) == 0) {
            this.maxSettlementDay = null;
        } else {
            this.maxSettlementDay = str11;
        }
        if ((i & 2048) == 0) {
            this.stopPrice = null;
        } else {
            this.stopPrice = str12;
        }
        if ((i & 4096) == 0) {
            this.stopPercentage = null;
        } else {
            this.stopPercentage = str13;
        }
        if ((i & 8192) == 0) {
            this.reinvestment = null;
        } else {
            this.reinvestment = str14;
        }
        if ((i & 16384) == 0) {
            this.term = null;
        } else {
            this.term = str15;
        }
        if ((32768 & i) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str16;
        }
        if ((i & 65536) == 0) {
            this.apr = null;
        } else {
            this.apr = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcdOrderReq dcdOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dcdOrderReq.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dcdOrderReq.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dcdOrderReq.notional != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dcdOrderReq.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dcdOrderReq.notionalCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dcdOrderReq.notionalCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dcdOrderReq.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dcdOrderReq.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dcdOrderReq.altCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dcdOrderReq.altCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dcdOrderReq.dcdOptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dcdOrderReq.dcdOptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dcdOrderReq.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dcdOrderReq.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dcdOrderReq.currentStrike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dcdOrderReq.currentStrike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dcdOrderReq.strikePercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, dcdOrderReq.strikePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dcdOrderReq.minAnnualYieldPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dcdOrderReq.minAnnualYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || dcdOrderReq.maxSettlementDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, dcdOrderReq.maxSettlementDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || dcdOrderReq.stopPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, dcdOrderReq.stopPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || dcdOrderReq.stopPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, dcdOrderReq.stopPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dcdOrderReq.reinvestment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, dcdOrderReq.reinvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || dcdOrderReq.term != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, dcdOrderReq.term);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dcdOrderReq.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, dcdOrderReq.expiryTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && dcdOrderReq.apr == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, dcdOrderReq.apr);
    }

    public DcdOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.quoteId = str;
        this.notional = str2;
        this.notionalCcy = str3;
        this.currencyId = str4;
        this.altCurrencyId = str5;
        this.dcdOptionType = str6;
        this.strike = str7;
        this.currentStrike = str8;
        this.strikePercentage = str9;
        this.minAnnualYieldPercentage = str10;
        this.maxSettlementDay = str11;
        this.stopPrice = str12;
        this.stopPercentage = str13;
        this.reinvestment = str14;
        this.term = str15;
        this.expiryTime = str16;
        this.apr = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1373) call: com.okinc.unify_trade.biz.DcdOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcdOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17);
    }
}
