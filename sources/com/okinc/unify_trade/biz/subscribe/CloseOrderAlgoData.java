package com.okinc.unify_trade.biz.subscribe;

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
public final class CloseOrderAlgoData implements Parcelable {
    private final String algoId;
    private final String closeFraction;
    private final String ordType;
    private final String reduceOnly;
    private final String slTriggerPx;
    private String slTriggerPxType;
    private final String tpTriggerPx;
    private String tpTriggerPxType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CloseOrderAlgoData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CloseOrderAlgoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CloseOrderAlgoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CloseOrderAlgoData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CloseOrderAlgoData[] newArray(int i) {
            return new CloseOrderAlgoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CloseOrderAlgoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseOrderAlgoData copy(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CloseOrderAlgoData(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof CloseOrderAlgoData)) {
            return false;
        }
        CloseOrderAlgoData closeOrderAlgoData = (CloseOrderAlgoData) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) closeOrderAlgoData.algoId) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) closeOrderAlgoData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) closeOrderAlgoData.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) closeOrderAlgoData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) closeOrderAlgoData.slTriggerPxType) && Intrinsics.EZpvd((Object) this.closeFraction, (Object) closeOrderAlgoData.closeFraction) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) closeOrderAlgoData.reduceOnly) && Intrinsics.EZpvd((Object) this.ordType, (Object) closeOrderAlgoData.ordType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseFraction() {
        return this.closeFraction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.tpTriggerPx.hashCode();
        String str = this.tpTriggerPxType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.slTriggerPx.hashCode();
        String str2 = this.slTriggerPxType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.closeFraction.hashCode()) * 31) + this.reduceOnly.hashCode()) * 31) + this.ordType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CloseOrderAlgoData(algoId=" + this.algoId + ", tpTriggerPx=" + this.tpTriggerPx + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPx=" + this.slTriggerPx + ", slTriggerPxType=" + this.slTriggerPxType + ", closeFraction=" + this.closeFraction + ", reduceOnly=" + this.reduceOnly + ", ordType=" + this.ordType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.closeFraction);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.ordType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.CloseOrderAlgoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CloseOrderAlgoData> serializer() {
            return CloseOrderAlgoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloseOrderAlgoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str2;
        }
        if ((i & 4) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str3;
        }
        if ((i & 8) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str4;
        }
        if ((i & 16) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str5;
        }
        if ((i & 32) == 0) {
            this.closeFraction = "";
        } else {
            this.closeFraction = str6;
        }
        if ((i & 64) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str7;
        }
        if ((i & 128) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CloseOrderAlgoData closeOrderAlgoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) closeOrderAlgoData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, closeOrderAlgoData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) closeOrderAlgoData.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, closeOrderAlgoData.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || closeOrderAlgoData.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, closeOrderAlgoData.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) closeOrderAlgoData.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, closeOrderAlgoData.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || closeOrderAlgoData.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, closeOrderAlgoData.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) closeOrderAlgoData.closeFraction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, closeOrderAlgoData.closeFraction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) closeOrderAlgoData.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, closeOrderAlgoData.reduceOnly);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) closeOrderAlgoData.ordType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, closeOrderAlgoData.ordType);
    }

    public CloseOrderAlgoData(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.algoId = str;
        this.tpTriggerPx = str2;
        this.tpTriggerPxType = str3;
        this.slTriggerPx = str4;
        this.slTriggerPxType = str5;
        this.closeFraction = str6;
        this.reduceOnly = str7;
        this.ordType = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:92) call: com.okinc.unify_trade.biz.subscribe.CloseOrderAlgoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CloseOrderAlgoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : null, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
