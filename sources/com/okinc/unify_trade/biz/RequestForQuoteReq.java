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
public final class RequestForQuoteReq implements Parcelable {
    private String alternativeCurrency;
    private String currency;
    private String expiryTime;
    private String size;
    private String strike;
    private String totalAmount;
    private String tradeSide;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RequestForQuoteReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RequestForQuoteReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestForQuoteReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RequestForQuoteReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestForQuoteReq[] newArray(int i) {
            return new RequestForQuoteReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestForQuoteReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RequestForQuoteReq copy$default(RequestForQuoteReq requestForQuoteReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestForQuoteReq.alternativeCurrency;
        }
        if ((i & 2) != 0) {
            str2 = requestForQuoteReq.currency;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = requestForQuoteReq.expiryTime;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = requestForQuoteReq.size;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = requestForQuoteReq.strike;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = requestForQuoteReq.totalAmount;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = requestForQuoteReq.tradeSide;
        }
        return requestForQuoteReq.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alternativeCurrency;
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
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequestForQuoteReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new RequestForQuoteReq(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof RequestForQuoteReq)) {
            return false;
        }
        RequestForQuoteReq requestForQuoteReq = (RequestForQuoteReq) obj;
        return Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) requestForQuoteReq.alternativeCurrency) && Intrinsics.EZpvd((Object) this.currency, (Object) requestForQuoteReq.currency) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) requestForQuoteReq.expiryTime) && Intrinsics.EZpvd((Object) this.size, (Object) requestForQuoteReq.size) && Intrinsics.EZpvd((Object) this.strike, (Object) requestForQuoteReq.strike) && Intrinsics.EZpvd((Object) this.totalAmount, (Object) requestForQuoteReq.totalAmount) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) requestForQuoteReq.tradeSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
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
    public final String getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.alternativeCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.expiryTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.size;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.strike;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalAmount;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tradeSide;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
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
    public final void setSize(String str) {
        this.size = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RequestForQuoteReq(alternativeCurrency=" + this.alternativeCurrency + ", currency=" + this.currency + ", expiryTime=" + this.expiryTime + ", size=" + this.size + ", strike=" + this.strike + ", totalAmount=" + this.totalAmount + ", tradeSide=" + this.tradeSide + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.currency);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.size);
        parcel.writeString(this.strike);
        parcel.writeString(this.totalAmount);
        parcel.writeString(this.tradeSide);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RequestForQuoteReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RequestForQuoteReq> serializer() {
            return RequestForQuoteReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RequestForQuoteReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str;
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
            this.size = null;
        } else {
            this.size = str4;
        }
        if ((i & 16) == 0) {
            this.strike = null;
        } else {
            this.strike = str5;
        }
        if ((i & 32) == 0) {
            this.totalAmount = null;
        } else {
            this.totalAmount = str6;
        }
        if ((i & 64) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RequestForQuoteReq requestForQuoteReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || requestForQuoteReq.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, requestForQuoteReq.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || requestForQuoteReq.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, requestForQuoteReq.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || requestForQuoteReq.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, requestForQuoteReq.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || requestForQuoteReq.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, requestForQuoteReq.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || requestForQuoteReq.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, requestForQuoteReq.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || requestForQuoteReq.totalAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, requestForQuoteReq.totalAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && requestForQuoteReq.tradeSide == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, requestForQuoteReq.tradeSide);
    }

    public RequestForQuoteReq(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.alternativeCurrency = str;
        this.currency = str2;
        this.expiryTime = str3;
        this.size = str4;
        this.strike = str5;
        this.totalAmount = str6;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:117) call: com.okinc.unify_trade.biz.RequestForQuoteReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RequestForQuoteReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
