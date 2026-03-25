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
public final class YieldHunterInstrumentResponse implements Parcelable {
    private String estAplRatioHigh;
    private String estAplRatioLow;
    private String expTime;
    private String instId;
    private String instType;
    private String leverHigh;
    private String leverLow;
    private String maxCost;
    private String optType;
    private String settleCcy;
    private String stk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<YieldHunterInstrumentResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<YieldHunterInstrumentResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterInstrumentResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new YieldHunterInstrumentResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterInstrumentResponse[] newArray(int i) {
            return new YieldHunterInstrumentResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YieldHunterInstrumentResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estAplRatioLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estAplRatioHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.leverLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.leverHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterInstrumentResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new YieldHunterInstrumentResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof YieldHunterInstrumentResponse)) {
            return false;
        }
        YieldHunterInstrumentResponse yieldHunterInstrumentResponse = (YieldHunterInstrumentResponse) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) yieldHunterInstrumentResponse.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) yieldHunterInstrumentResponse.instId) && Intrinsics.EZpvd((Object) this.estAplRatioLow, (Object) yieldHunterInstrumentResponse.estAplRatioLow) && Intrinsics.EZpvd((Object) this.estAplRatioHigh, (Object) yieldHunterInstrumentResponse.estAplRatioHigh) && Intrinsics.EZpvd((Object) this.leverLow, (Object) yieldHunterInstrumentResponse.leverLow) && Intrinsics.EZpvd((Object) this.leverHigh, (Object) yieldHunterInstrumentResponse.leverHigh) && Intrinsics.EZpvd((Object) this.expTime, (Object) yieldHunterInstrumentResponse.expTime) && Intrinsics.EZpvd((Object) this.stk, (Object) yieldHunterInstrumentResponse.stk) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) yieldHunterInstrumentResponse.settleCcy) && Intrinsics.EZpvd((Object) this.maxCost, (Object) yieldHunterInstrumentResponse.maxCost) && Intrinsics.EZpvd((Object) this.optType, (Object) yieldHunterInstrumentResponse.optType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAplRatioHigh() {
        return this.estAplRatioHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAplRatioLow() {
        return this.estAplRatioLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
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
    public final String getLeverHigh() {
        return this.leverHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverLow() {
        return this.leverLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCost() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estAplRatioLow;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.estAplRatioHigh;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.leverLow;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.leverHigh;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.expTime;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.stk;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.settleCcy;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.maxCost;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.optType;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatioHigh(String str) {
        this.estAplRatioHigh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatioLow(String str) {
        this.estAplRatioLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTime(String str) {
        this.expTime = str;
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
    public final void setLeverHigh(String str) {
        this.leverHigh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverLow(String str) {
        this.leverLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCost(String str) {
        this.maxCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptType(String str) {
        this.optType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettleCcy(String str) {
        this.settleCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStk(String str) {
        this.stk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "YieldHunterInstrumentResponse(instType=" + this.instType + ", instId=" + this.instId + ", estAplRatioLow=" + this.estAplRatioLow + ", estAplRatioHigh=" + this.estAplRatioHigh + ", leverLow=" + this.leverLow + ", leverHigh=" + this.leverHigh + ", expTime=" + this.expTime + ", stk=" + this.stk + ", settleCcy=" + this.settleCcy + ", maxCost=" + this.maxCost + ", optType=" + this.optType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.estAplRatioLow);
        parcel.writeString(this.estAplRatioHigh);
        parcel.writeString(this.leverLow);
        parcel.writeString(this.leverHigh);
        parcel.writeString(this.expTime);
        parcel.writeString(this.stk);
        parcel.writeString(this.settleCcy);
        parcel.writeString(this.maxCost);
        parcel.writeString(this.optType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterInstrumentResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterInstrumentResponse> serializer() {
            return YieldHunterInstrumentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterInstrumentResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = null;
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.estAplRatioLow = null;
        } else {
            this.estAplRatioLow = str3;
        }
        if ((i & 8) == 0) {
            this.estAplRatioHigh = null;
        } else {
            this.estAplRatioHigh = str4;
        }
        if ((i & 16) == 0) {
            this.leverLow = null;
        } else {
            this.leverLow = str5;
        }
        if ((i & 32) == 0) {
            this.leverHigh = null;
        } else {
            this.leverHigh = str6;
        }
        if ((i & 64) == 0) {
            this.expTime = null;
        } else {
            this.expTime = str7;
        }
        if ((i & 128) == 0) {
            this.stk = null;
        } else {
            this.stk = str8;
        }
        if ((i & 256) == 0) {
            this.settleCcy = null;
        } else {
            this.settleCcy = str9;
        }
        if ((i & 512) == 0) {
            this.maxCost = null;
        } else {
            this.maxCost = str10;
        }
        if ((i & 1024) == 0) {
            this.optType = null;
        } else {
            this.optType = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterInstrumentResponse yieldHunterInstrumentResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterInstrumentResponse.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterInstrumentResponse.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterInstrumentResponse.estAplRatioLow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.estAplRatioLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || yieldHunterInstrumentResponse.estAplRatioHigh != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.estAplRatioHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || yieldHunterInstrumentResponse.leverLow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.leverLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || yieldHunterInstrumentResponse.leverHigh != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.leverHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || yieldHunterInstrumentResponse.expTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || yieldHunterInstrumentResponse.stk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || yieldHunterInstrumentResponse.settleCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.settleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || yieldHunterInstrumentResponse.maxCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.maxCost);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && yieldHunterInstrumentResponse.optType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, yieldHunterInstrumentResponse.optType);
    }

    public YieldHunterInstrumentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.instType = str;
        this.instId = str2;
        this.estAplRatioLow = str3;
        this.estAplRatioHigh = str4;
        this.leverLow = str5;
        this.leverHigh = str6;
        this.expTime = str7;
        this.stk = str8;
        this.settleCcy = str9;
        this.maxCost = str10;
        this.optType = str11;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.unify_trade.biz.YieldHunterInstrumentResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterInstrumentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}
