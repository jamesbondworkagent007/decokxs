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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class DcdQuotesReq implements Parcelable {
    public static final int $stable = 0;
    private final String altCurrencyId;
    private final String currencyId;
    private final String dcdOptionType;
    private final String expiryTime;
    private final String launchTime;
    private final String notional;
    private final String settlementTime;
    private final String side;
    private final String strike;
    private final String symbol;
    private final String underlyingIndex;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DcdQuotesReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DcdQuotesReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdQuotesReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcdQuotesReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdQuotesReq[] newArray(int i) {
            return new DcdQuotesReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdQuotesReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.altCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.launchTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdQuotesReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new DcdQuotesReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof DcdQuotesReq)) {
            return false;
        }
        DcdQuotesReq dcdQuotesReq = (DcdQuotesReq) obj;
        return Intrinsics.EZpvd((Object) this.currencyId, (Object) dcdQuotesReq.currencyId) && Intrinsics.EZpvd((Object) this.altCurrencyId, (Object) dcdQuotesReq.altCurrencyId) && Intrinsics.EZpvd((Object) this.symbol, (Object) dcdQuotesReq.symbol) && Intrinsics.EZpvd((Object) this.underlyingIndex, (Object) dcdQuotesReq.underlyingIndex) && Intrinsics.EZpvd((Object) this.dcdOptionType, (Object) dcdQuotesReq.dcdOptionType) && Intrinsics.EZpvd((Object) this.side, (Object) dcdQuotesReq.side) && Intrinsics.EZpvd((Object) this.strike, (Object) dcdQuotesReq.strike) && Intrinsics.EZpvd((Object) this.launchTime, (Object) dcdQuotesReq.launchTime) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) dcdQuotesReq.expiryTime) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) dcdQuotesReq.settlementTime) && Intrinsics.EZpvd((Object) this.notional, (Object) dcdQuotesReq.notional);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAltCurrencyId() {
        return this.altCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
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
    public final String getLaunchTime() {
        return this.launchTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
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
    public final String getUnderlyingIndex() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currencyId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.altCurrencyId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.symbol;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.underlyingIndex;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dcdOptionType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.side;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.strike;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.launchTime;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.expiryTime;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.settlementTime;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.notional;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcdQuotesReq(currencyId=" + this.currencyId + ", altCurrencyId=" + this.altCurrencyId + ", symbol=" + this.symbol + ", underlyingIndex=" + this.underlyingIndex + ", dcdOptionType=" + this.dcdOptionType + ", side=" + this.side + ", strike=" + this.strike + ", launchTime=" + this.launchTime + ", expiryTime=" + this.expiryTime + ", settlementTime=" + this.settlementTime + ", notional=" + this.notional + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currencyId);
        parcel.writeString(this.altCurrencyId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.underlyingIndex);
        parcel.writeString(this.dcdOptionType);
        parcel.writeString(this.side);
        parcel.writeString(this.strike);
        parcel.writeString(this.launchTime);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.settlementTime);
        parcel.writeString(this.notional);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcdQuotesReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcdQuotesReq> serializer() {
            return DcdQuotesReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcdQuotesReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = str;
        }
        if ((i & 2) == 0) {
            this.altCurrencyId = null;
        } else {
            this.altCurrencyId = str2;
        }
        if ((i & 4) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str3;
        }
        if ((i & 8) == 0) {
            this.underlyingIndex = null;
        } else {
            this.underlyingIndex = str4;
        }
        if ((i & 16) == 0) {
            this.dcdOptionType = null;
        } else {
            this.dcdOptionType = str5;
        }
        if ((i & 32) == 0) {
            this.side = null;
        } else {
            this.side = str6;
        }
        if ((i & 64) == 0) {
            this.strike = null;
        } else {
            this.strike = str7;
        }
        if ((i & 128) == 0) {
            this.launchTime = null;
        } else {
            this.launchTime = str8;
        }
        if ((i & 256) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str9;
        }
        if ((i & 512) == 0) {
            this.settlementTime = null;
        } else {
            this.settlementTime = str10;
        }
        if ((i & 1024) == 0) {
            this.notional = null;
        } else {
            this.notional = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcdQuotesReq dcdQuotesReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dcdQuotesReq.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dcdQuotesReq.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dcdQuotesReq.altCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dcdQuotesReq.altCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dcdQuotesReq.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dcdQuotesReq.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dcdQuotesReq.underlyingIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dcdQuotesReq.underlyingIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dcdQuotesReq.dcdOptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dcdQuotesReq.dcdOptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dcdQuotesReq.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dcdQuotesReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dcdQuotesReq.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dcdQuotesReq.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dcdQuotesReq.launchTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dcdQuotesReq.launchTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dcdQuotesReq.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, dcdQuotesReq.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dcdQuotesReq.settlementTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dcdQuotesReq.settlementTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && dcdQuotesReq.notional == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, dcdQuotesReq.notional);
    }

    public DcdQuotesReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.currencyId = str;
        this.altCurrencyId = str2;
        this.symbol = str3;
        this.underlyingIndex = str4;
        this.dcdOptionType = str5;
        this.side = str6;
        this.strike = str7;
        this.launchTime = str8;
        this.expiryTime = str9;
        this.settlementTime = str10;
        this.notional = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1396) call: com.okinc.unify_trade.biz.DcdQuotesReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcdQuotesReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}
