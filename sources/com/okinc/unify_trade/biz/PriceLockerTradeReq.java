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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PriceLockerTradeReq implements Parcelable {
    private String brokerId;
    private String clientTradeId;
    private String notional;
    private String notionalCurrency;
    private String quoteId;
    private String size;
    private String tradeSide;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerTradeReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PriceLockerTradeReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradeReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceLockerTradeReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradeReq[] newArray(int i) {
            return new PriceLockerTradeReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceLockerTradeReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceLockerTradeReq copy$default(PriceLockerTradeReq priceLockerTradeReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceLockerTradeReq.brokerId;
        }
        if ((i & 2) != 0) {
            str2 = priceLockerTradeReq.clientTradeId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = priceLockerTradeReq.notional;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = priceLockerTradeReq.notionalCurrency;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = priceLockerTradeReq.quoteId;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = priceLockerTradeReq.size;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = priceLockerTradeReq.tradeSide;
        }
        return priceLockerTradeReq.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.clientTradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new PriceLockerTradeReq(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof PriceLockerTradeReq)) {
            return false;
        }
        PriceLockerTradeReq priceLockerTradeReq = (PriceLockerTradeReq) obj;
        return Intrinsics.EZpvd((Object) this.brokerId, (Object) priceLockerTradeReq.brokerId) && Intrinsics.EZpvd((Object) this.clientTradeId, (Object) priceLockerTradeReq.clientTradeId) && Intrinsics.EZpvd((Object) this.notional, (Object) priceLockerTradeReq.notional) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) priceLockerTradeReq.notionalCurrency) && Intrinsics.EZpvd((Object) this.quoteId, (Object) priceLockerTradeReq.quoteId) && Intrinsics.EZpvd((Object) this.size, (Object) priceLockerTradeReq.size) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) priceLockerTradeReq.tradeSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrokerId() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientTradeId() {
        return this.clientTradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCurrency() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.brokerId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.clientTradeId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.notional;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.notionalCurrency;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.quoteId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.size;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tradeSide;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrokerId(String str) {
        this.brokerId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientTradeId(String str) {
        this.clientTradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotional(String str) {
        this.notional = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalCurrency(String str) {
        this.notionalCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteId(String str) {
        this.quoteId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSize(String str) {
        this.size = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerTradeReq(brokerId=" + this.brokerId + ", clientTradeId=" + this.clientTradeId + ", notional=" + this.notional + ", notionalCurrency=" + this.notionalCurrency + ", quoteId=" + this.quoteId + ", size=" + this.size + ", tradeSide=" + this.tradeSide + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.brokerId);
        parcel.writeString(this.clientTradeId);
        parcel.writeString(this.notional);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.quoteId);
        parcel.writeString(this.size);
        parcel.writeString(this.tradeSide);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerTradeReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerTradeReq> serializer() {
            return PriceLockerTradeReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerTradeReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.brokerId = null;
        } else {
            this.brokerId = str;
        }
        if ((i & 2) == 0) {
            this.clientTradeId = null;
        } else {
            this.clientTradeId = str2;
        }
        if ((i & 4) == 0) {
            this.notional = null;
        } else {
            this.notional = str3;
        }
        if ((i & 8) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str4;
        }
        if ((i & 16) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str5;
        }
        if ((i & 32) == 0) {
            this.size = null;
        } else {
            this.size = str6;
        }
        if ((i & 64) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerTradeReq priceLockerTradeReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceLockerTradeReq.brokerId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceLockerTradeReq.brokerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceLockerTradeReq.clientTradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, priceLockerTradeReq.clientTradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceLockerTradeReq.notional != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, priceLockerTradeReq.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceLockerTradeReq.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, priceLockerTradeReq.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || priceLockerTradeReq.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, priceLockerTradeReq.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || priceLockerTradeReq.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, priceLockerTradeReq.size);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && priceLockerTradeReq.tradeSide == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, priceLockerTradeReq.tradeSide);
    }

    public PriceLockerTradeReq(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.brokerId = str;
        this.clientTradeId = str2;
        this.notional = str3;
        this.notionalCurrency = str4;
        this.quoteId = str5;
        this.size = str6;
        this.tradeSide = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:187) call: com.okinc.unify_trade.biz.PriceLockerTradeReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PriceLockerTradeReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
