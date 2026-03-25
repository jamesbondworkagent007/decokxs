package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class PriceLockerProduct implements Parcelable {
    private String alternativeCurrency;
    private String annualYield;
    private String cpType;
    private String currency;
    private String expiryTime;
    private String lockPeriod;
    private String notionalCurrency;
    private String participationRatio;
    private String profit;
    private String strike;
    private String symbol;
    private List<String> tag;
    private String underlyingIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerProduct> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<PriceLockerProduct> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerProduct createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceLockerProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerProduct[] newArray(int i) {
            return new PriceLockerProduct[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceLockerProduct() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cpType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.annualYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lockPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerProduct copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, String str9, String str10, String str11, String str12) {
        return new PriceLockerProduct(str, str2, str3, str4, str5, str6, str7, str8, list, str9, str10, str11, str12);
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
        if (!(obj instanceof PriceLockerProduct)) {
            return false;
        }
        PriceLockerProduct priceLockerProduct = (PriceLockerProduct) obj;
        return Intrinsics.EZpvd((Object) this.cpType, (Object) priceLockerProduct.cpType) && Intrinsics.EZpvd((Object) this.currency, (Object) priceLockerProduct.currency) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) priceLockerProduct.expiryTime) && Intrinsics.EZpvd((Object) this.lockPeriod, (Object) priceLockerProduct.lockPeriod) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) priceLockerProduct.notionalCurrency) && Intrinsics.EZpvd((Object) this.participationRatio, (Object) priceLockerProduct.participationRatio) && Intrinsics.EZpvd((Object) this.profit, (Object) priceLockerProduct.profit) && Intrinsics.EZpvd((Object) this.strike, (Object) priceLockerProduct.strike) && Intrinsics.EZpvd(this.tag, priceLockerProduct.tag) && Intrinsics.EZpvd((Object) this.underlyingIndex, (Object) priceLockerProduct.underlyingIndex) && Intrinsics.EZpvd((Object) this.symbol, (Object) priceLockerProduct.symbol) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) priceLockerProduct.alternativeCurrency) && Intrinsics.EZpvd((Object) this.annualYield, (Object) priceLockerProduct.annualYield);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualYield() {
        return this.annualYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCpType() {
        return this.cpType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLockPeriod() {
        return this.lockPeriod;
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
    public final String getProfit() {
        return this.profit;
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
    public final List<String> getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingIndex() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cpType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.expiryTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lockPeriod;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.notionalCurrency;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.participationRatio;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.profit;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.strike;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        List<String> list = this.tag;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        String str9 = this.underlyingIndex;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.symbol;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.alternativeCurrency;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.annualYield;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualYield(String str) {
        this.annualYield = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCpType(String str) {
        this.cpType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiryTime(String str) {
        this.expiryTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockPeriod(String str) {
        this.lockPeriod = str;
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
    public final void setProfit(String str) {
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(List<String> list) {
        this.tag = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnderlyingIndex(String str) {
        this.underlyingIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerProduct(cpType=" + this.cpType + ", currency=" + this.currency + ", expiryTime=" + this.expiryTime + ", lockPeriod=" + this.lockPeriod + ", notionalCurrency=" + this.notionalCurrency + ", participationRatio=" + this.participationRatio + ", profit=" + this.profit + ", strike=" + this.strike + ", tag=" + this.tag + ", underlyingIndex=" + this.underlyingIndex + ", symbol=" + this.symbol + ", alternativeCurrency=" + this.alternativeCurrency + ", annualYield=" + this.annualYield + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cpType);
        parcel.writeString(this.currency);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.lockPeriod);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.participationRatio);
        parcel.writeString(this.profit);
        parcel.writeString(this.strike);
        parcel.writeStringList(this.tag);
        parcel.writeString(this.underlyingIndex);
        parcel.writeString(this.symbol);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.annualYield);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerProduct.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerProduct> serializer() {
            return PriceLockerProduct$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerProduct(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cpType = null;
        } else {
            this.cpType = str;
        }
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
        if ((i & 4) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str3;
        }
        if ((i & 8) == 0) {
            this.lockPeriod = null;
        } else {
            this.lockPeriod = str4;
        }
        if ((i & 16) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str5;
        }
        if ((i & 32) == 0) {
            this.participationRatio = null;
        } else {
            this.participationRatio = str6;
        }
        if ((i & 64) == 0) {
            this.profit = null;
        } else {
            this.profit = str7;
        }
        if ((i & 128) == 0) {
            this.strike = null;
        } else {
            this.strike = str8;
        }
        if ((i & 256) == 0) {
            this.tag = null;
        } else {
            this.tag = list;
        }
        if ((i & 512) == 0) {
            this.underlyingIndex = null;
        } else {
            this.underlyingIndex = str9;
        }
        if ((i & 1024) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str10;
        }
        if ((i & 2048) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str11;
        }
        if ((i & 4096) == 0) {
            this.annualYield = null;
        } else {
            this.annualYield = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerProduct priceLockerProduct, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceLockerProduct.cpType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceLockerProduct.cpType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceLockerProduct.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, priceLockerProduct.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceLockerProduct.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, priceLockerProduct.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceLockerProduct.lockPeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, priceLockerProduct.lockPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || priceLockerProduct.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, priceLockerProduct.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || priceLockerProduct.participationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, priceLockerProduct.participationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || priceLockerProduct.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, priceLockerProduct.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || priceLockerProduct.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, priceLockerProduct.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || priceLockerProduct.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], priceLockerProduct.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || priceLockerProduct.underlyingIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, priceLockerProduct.underlyingIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || priceLockerProduct.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, priceLockerProduct.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || priceLockerProduct.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, priceLockerProduct.alternativeCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && priceLockerProduct.annualYield == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, priceLockerProduct.annualYield);
    }

    public PriceLockerProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, String str9, String str10, String str11, String str12) {
        this.cpType = str;
        this.currency = str2;
        this.expiryTime = str3;
        this.lockPeriod = str4;
        this.notionalCurrency = str5;
        this.participationRatio = str6;
        this.profit = str7;
        this.strike = str8;
        this.tag = list;
        this.underlyingIndex = str9;
        this.symbol = str10;
        this.alternativeCurrency = str11;
        this.annualYield = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:302) call: com.okinc.unify_trade.biz.PriceLockerProduct.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PriceLockerProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) == 0 ? str12 : null);
    }
}
