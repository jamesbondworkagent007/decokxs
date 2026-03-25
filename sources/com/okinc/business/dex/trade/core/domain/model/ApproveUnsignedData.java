package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ApproveUnsignedData implements Parcelable {
    public static final int $stable = 0;
    private final String approveGasLimitCoefficient;
    private final String data;
    private final String dexContractAddress;
    private final String from;
    private final Long gas;
    private final String gasPrice;
    private final String id;
    private final String maxFeePerGas;
    private final String maxPriorityFeePerGas;
    private final Integer nonce;
    private final String to;
    private final String type;
    private final String unsignedTx;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ApproveUnsignedData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ApproveUnsignedData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveUnsignedData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApproveUnsignedData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveUnsignedData[] newArray(int i) {
            return new ApproveUnsignedData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveUnsignedData() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.approveGasLimitCoefficient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dexContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveUnsignedData copy(String str, String str2, String str3, Integer num, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new ApproveUnsignedData(str, str2, str3, num, str4, str5, l, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof ApproveUnsignedData)) {
            return false;
        }
        ApproveUnsignedData approveUnsignedData = (ApproveUnsignedData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) approveUnsignedData.id) && Intrinsics.EZpvd((Object) this.data, (Object) approveUnsignedData.data) && Intrinsics.EZpvd((Object) this.type, (Object) approveUnsignedData.type) && Intrinsics.EZpvd(this.nonce, approveUnsignedData.nonce) && Intrinsics.EZpvd((Object) this.dexContractAddress, (Object) approveUnsignedData.dexContractAddress) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) approveUnsignedData.unsignedTx) && Intrinsics.EZpvd(this.gas, approveUnsignedData.gas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) approveUnsignedData.maxPriorityFeePerGas) && Intrinsics.EZpvd((Object) this.from, (Object) approveUnsignedData.from) && Intrinsics.EZpvd((Object) this.to, (Object) approveUnsignedData.to) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) approveUnsignedData.maxFeePerGas) && Intrinsics.EZpvd((Object) this.value, (Object) approveUnsignedData.value) && Intrinsics.EZpvd((Object) this.approveGasLimitCoefficient, (Object) approveUnsignedData.approveGasLimitCoefficient) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) approveUnsignedData.gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveGasLimitCoefficient() {
        return this.approveGasLimitCoefficient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexContractAddress() {
        return this.dexContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
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
    public final Integer getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
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
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.data;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.type;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.nonce;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.dexContractAddress;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.unsignedTx;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Long l = this.gas;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        String str6 = this.maxPriorityFeePerGas;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.from;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.to;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.maxFeePerGas;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.value;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.approveGasLimitCoefficient;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.gasPrice;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveUnsignedData(id=" + this.id + ", data=" + this.data + ", type=" + this.type + ", nonce=" + this.nonce + ", dexContractAddress=" + this.dexContractAddress + ", unsignedTx=" + this.unsignedTx + ", gas=" + this.gas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", from=" + this.from + ", to=" + this.to + ", maxFeePerGas=" + this.maxFeePerGas + ", value=" + this.value + ", approveGasLimitCoefficient=" + this.approveGasLimitCoefficient + ", gasPrice=" + this.gasPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.data);
        parcel.writeString(this.type);
        Integer num = this.nonce;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.dexContractAddress);
        parcel.writeString(this.unsignedTx);
        Long l = this.gas;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.maxPriorityFeePerGas);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.maxFeePerGas);
        parcel.writeString(this.value);
        parcel.writeString(this.approveGasLimitCoefficient);
        parcel.writeString(this.gasPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveUnsignedData> serializer() {
            return ApproveUnsignedData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveUnsignedData(int i, String str, String str2, String str3, Integer num, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = str2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.nonce = null;
        } else {
            this.nonce = num;
        }
        if ((i & 16) == 0) {
            this.dexContractAddress = null;
        } else {
            this.dexContractAddress = str4;
        }
        if ((i & 32) == 0) {
            this.unsignedTx = null;
        } else {
            this.unsignedTx = str5;
        }
        if ((i & 64) == 0) {
            this.gas = null;
        } else {
            this.gas = l;
        }
        if ((i & 128) == 0) {
            this.maxPriorityFeePerGas = null;
        } else {
            this.maxPriorityFeePerGas = str6;
        }
        if ((i & 256) == 0) {
            this.from = null;
        } else {
            this.from = str7;
        }
        if ((i & 512) == 0) {
            this.to = null;
        } else {
            this.to = str8;
        }
        if ((i & 1024) == 0) {
            this.maxFeePerGas = null;
        } else {
            this.maxFeePerGas = str9;
        }
        if ((i & 2048) == 0) {
            this.value = null;
        } else {
            this.value = str10;
        }
        if ((i & 4096) == 0) {
            this.approveGasLimitCoefficient = null;
        } else {
            this.approveGasLimitCoefficient = str11;
        }
        if ((i & 8192) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ApproveUnsignedData approveUnsignedData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || approveUnsignedData.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, approveUnsignedData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || approveUnsignedData.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, approveUnsignedData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || approveUnsignedData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, approveUnsignedData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || approveUnsignedData.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, approveUnsignedData.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || approveUnsignedData.dexContractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, approveUnsignedData.dexContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || approveUnsignedData.unsignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, approveUnsignedData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || approveUnsignedData.gas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, approveUnsignedData.gas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || approveUnsignedData.maxPriorityFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, approveUnsignedData.maxPriorityFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || approveUnsignedData.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, approveUnsignedData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || approveUnsignedData.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, approveUnsignedData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || approveUnsignedData.maxFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, approveUnsignedData.maxFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || approveUnsignedData.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, approveUnsignedData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || approveUnsignedData.approveGasLimitCoefficient != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, approveUnsignedData.approveGasLimitCoefficient);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && approveUnsignedData.gasPrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, approveUnsignedData.gasPrice);
    }

    public ApproveUnsignedData(String str, String str2, String str3, Integer num, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.id = str;
        this.data = str2;
        this.type = str3;
        this.nonce = num;
        this.dexContractAddress = str4;
        this.unsignedTx = str5;
        this.gas = l;
        this.maxPriorityFeePerGas = str6;
        this.from = str7;
        this.to = str8;
        this.maxFeePerGas = str9;
        this.value = str10;
        this.approveGasLimitCoefficient = str11;
        this.gasPrice = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ApproveUnsignedData(String str, String str2, String str3, Integer num, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) == 0 ? str12 : null);
    }
}
