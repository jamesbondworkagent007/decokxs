package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CallData implements Parcelable {
    public static final int $stable = 0;
    private final String bridgeId;
    private final String data;
    private final String from;
    private final String gas;
    private final String gasPrice;
    private final boolean hasReferralCommission;
    private final String maxFeePerGas;
    private final String maxPriorityFeePerGas;
    private final String memo;
    private final String memoPos;
    private final String priorityFee;
    private final String sender;
    private final String to;
    private final String unsignedTx;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CallData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CallData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CallData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallData[] newArray(int i) {
            return new CallData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.memoPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, String str7, @NotNull String str8, String str9, String str10, String str11, String str12, String str13, @NotNull String str14, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new CallData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z);
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
        if (!(obj instanceof CallData)) {
            return false;
        }
        CallData callData = (CallData) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) callData.from) && Intrinsics.EZpvd((Object) this.to, (Object) callData.to) && Intrinsics.EZpvd((Object) this.data, (Object) callData.data) && Intrinsics.EZpvd((Object) this.value, (Object) callData.value) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) callData.gasPrice) && Intrinsics.EZpvd((Object) this.gas, (Object) callData.gas) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) callData.priorityFee) && Intrinsics.EZpvd((Object) this.sender, (Object) callData.sender) && Intrinsics.EZpvd((Object) this.memo, (Object) callData.memo) && Intrinsics.EZpvd((Object) this.memoPos, (Object) callData.memoPos) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) callData.bridgeId) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) callData.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) callData.maxPriorityFeePerGas) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) callData.unsignedTx) && this.hasReferralCommission == callData.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasReferralCommission() {
        return this.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemoPos() {
        return this.memoPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSender() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.data.hashCode();
        int iHashCode4 = this.value.hashCode();
        String str = this.gasPrice;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.gas.hashCode();
        String str2 = this.priorityFee;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.sender.hashCode();
        String str3 = this.memo;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.memoPos;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.bridgeId;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxFeePerGas;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.maxPriorityFeePerGas;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + this.unsignedTx.hashCode()) * 31) + Boolean.hashCode(this.hasReferralCommission);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallData(from=" + this.from + ", to=" + this.to + ", data=" + this.data + ", value=" + this.value + ", gasPrice=" + this.gasPrice + ", gas=" + this.gas + ", priorityFee=" + this.priorityFee + ", sender=" + this.sender + ", memo=" + this.memo + ", memoPos=" + this.memoPos + ", bridgeId=" + this.bridgeId + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", unsignedTx=" + this.unsignedTx + ", hasReferralCommission=" + this.hasReferralCommission + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.data);
        parcel.writeString(this.value);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.gas);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.sender);
        parcel.writeString(this.memo);
        parcel.writeString(this.memoPos);
        parcel.writeString(this.bridgeId);
        parcel.writeString(this.maxFeePerGas);
        parcel.writeString(this.maxPriorityFeePerGas);
        parcel.writeString(this.unsignedTx);
        parcel.writeInt(this.hasReferralCommission ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CallData> serializer() {
            return CallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CallData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.data = "";
        } else {
            this.data = str3;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 16) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str5;
        }
        if ((i & 32) == 0) {
            this.gas = "";
        } else {
            this.gas = str6;
        }
        if ((i & 64) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str7;
        }
        if ((i & 128) == 0) {
            this.sender = "";
        } else {
            this.sender = str8;
        }
        if ((i & 256) == 0) {
            this.memo = null;
        } else {
            this.memo = str9;
        }
        if ((i & 512) == 0) {
            this.memoPos = null;
        } else {
            this.memoPos = str10;
        }
        if ((i & 1024) == 0) {
            this.bridgeId = null;
        } else {
            this.bridgeId = str11;
        }
        if ((i & 2048) == 0) {
            this.maxFeePerGas = null;
        } else {
            this.maxFeePerGas = str12;
        }
        if ((i & 4096) == 0) {
            this.maxPriorityFeePerGas = null;
        } else {
            this.maxPriorityFeePerGas = str13;
        }
        if ((i & 8192) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str14;
        }
        this.hasReferralCommission = (i & 16384) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CallData callData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) callData.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, callData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) callData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, callData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) callData.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, callData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) callData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, callData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) callData.gasPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, callData.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) callData.gas, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, callData.gas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) callData.priorityFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, callData.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) callData.sender, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, callData.sender);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || callData.memo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, callData.memo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || callData.memoPos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, callData.memoPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || callData.bridgeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, callData.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || callData.maxFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, callData.maxFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || callData.maxPriorityFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, callData.maxPriorityFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) callData.unsignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, callData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || callData.hasReferralCommission) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, callData.hasReferralCommission);
        }
    }

    public CallData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, String str7, @NotNull String str8, String str9, String str10, String str11, String str12, String str13, @NotNull String str14, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.from = str;
        this.to = str2;
        this.data = str3;
        this.value = str4;
        this.gasPrice = str5;
        this.gas = str6;
        this.priorityFee = str7;
        this.sender = str8;
        this.memo = str9;
        this.memoPos = str10;
        this.bridgeId = str11;
        this.maxFeePerGas = str12;
        this.maxPriorityFeePerGas = str13;
        this.unsignedTx = str14;
        this.hasReferralCommission = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:1831) call: com.okinc.business.dexlogic.bean.CallData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CallData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null, (i & 8192) == 0 ? str14 : "", (i & 16384) != 0 ? false : z);
    }
}
