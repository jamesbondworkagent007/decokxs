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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RequestForQuoteBean implements Parcelable {
    private String alternativeCurrency;
    private String clientId;
    private String currency;
    private String estimateProfit;
    private String expiryTime;
    private String notional;
    private String notionalCurrency;
    private String participationRatio;
    private String strike;
    private String ttlMs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RequestForQuoteBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RequestForQuoteBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestForQuoteBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RequestForQuoteBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestForQuoteBean[] newArray(int i) {
            return new RequestForQuoteBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestForQuoteBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.estimateProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.participationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ttlMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequestForQuoteBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new RequestForQuoteBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof RequestForQuoteBean)) {
            return false;
        }
        RequestForQuoteBean requestForQuoteBean = (RequestForQuoteBean) obj;
        return Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) requestForQuoteBean.alternativeCurrency) && Intrinsics.EZpvd((Object) this.clientId, (Object) requestForQuoteBean.clientId) && Intrinsics.EZpvd((Object) this.currency, (Object) requestForQuoteBean.currency) && Intrinsics.EZpvd((Object) this.participationRatio, (Object) requestForQuoteBean.participationRatio) && Intrinsics.EZpvd((Object) this.notional, (Object) requestForQuoteBean.notional) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) requestForQuoteBean.notionalCurrency) && Intrinsics.EZpvd((Object) this.strike, (Object) requestForQuoteBean.strike) && Intrinsics.EZpvd((Object) this.ttlMs, (Object) requestForQuoteBean.ttlMs) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) requestForQuoteBean.expiryTime) && Intrinsics.EZpvd((Object) this.estimateProfit, (Object) requestForQuoteBean.estimateProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
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
    public final String getNotional() {
        return this.notional;
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
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTtlMs() {
        return this.ttlMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.alternativeCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.clientId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currency;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.participationRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.notional;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.notionalCurrency;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.strike;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.ttlMs;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.expiryTime;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.estimateProfit;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientId(String str) {
        this.clientId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateProfit(String str) {
        this.estimateProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiryTime(String str) {
        this.expiryTime = str;
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
    public final void setParticipationRatio(String str) {
        this.participationRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTtlMs(String str) {
        this.ttlMs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RequestForQuoteBean(alternativeCurrency=" + this.alternativeCurrency + ", clientId=" + this.clientId + ", currency=" + this.currency + ", participationRatio=" + this.participationRatio + ", notional=" + this.notional + ", notionalCurrency=" + this.notionalCurrency + ", strike=" + this.strike + ", ttlMs=" + this.ttlMs + ", expiryTime=" + this.expiryTime + ", estimateProfit=" + this.estimateProfit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.clientId);
        parcel.writeString(this.currency);
        parcel.writeString(this.participationRatio);
        parcel.writeString(this.notional);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.strike);
        parcel.writeString(this.ttlMs);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.estimateProfit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RequestForQuoteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RequestForQuoteBean> serializer() {
            return RequestForQuoteBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RequestForQuoteBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str;
        }
        if ((i & 2) == 0) {
            this.clientId = null;
        } else {
            this.clientId = str2;
        }
        if ((i & 4) == 0) {
            this.currency = null;
        } else {
            this.currency = str3;
        }
        if ((i & 8) == 0) {
            this.participationRatio = null;
        } else {
            this.participationRatio = str4;
        }
        if ((i & 16) == 0) {
            this.notional = null;
        } else {
            this.notional = str5;
        }
        if ((i & 32) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str6;
        }
        if ((i & 64) == 0) {
            this.strike = null;
        } else {
            this.strike = str7;
        }
        if ((i & 128) == 0) {
            this.ttlMs = null;
        } else {
            this.ttlMs = str8;
        }
        if ((i & 256) == 0) {
            this.expiryTime = null;
        } else {
            this.expiryTime = str9;
        }
        if ((i & 512) == 0) {
            this.estimateProfit = null;
        } else {
            this.estimateProfit = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RequestForQuoteBean requestForQuoteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || requestForQuoteBean.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, requestForQuoteBean.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || requestForQuoteBean.clientId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, requestForQuoteBean.clientId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || requestForQuoteBean.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, requestForQuoteBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || requestForQuoteBean.participationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, requestForQuoteBean.participationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || requestForQuoteBean.notional != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, requestForQuoteBean.notional);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || requestForQuoteBean.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, requestForQuoteBean.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || requestForQuoteBean.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, requestForQuoteBean.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || requestForQuoteBean.ttlMs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, requestForQuoteBean.ttlMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || requestForQuoteBean.expiryTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, requestForQuoteBean.expiryTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && requestForQuoteBean.estimateProfit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, requestForQuoteBean.estimateProfit);
    }

    public RequestForQuoteBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.alternativeCurrency = str;
        this.clientId = str2;
        this.currency = str3;
        this.participationRatio = str4;
        this.notional = str5;
        this.notionalCurrency = str6;
        this.strike = str7;
        this.ttlMs = str8;
        this.expiryTime = str9;
        this.estimateProfit = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:142) call: com.okinc.unify_trade.biz.RequestForQuoteBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RequestForQuoteBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
