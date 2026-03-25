package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SignInfoReq implements Parcelable {
    public Long callValue;
    public String coinId;
    public String dataLength;
    public Long feeLimit;
    public String fromAddr;
    public String functionSelector;
    public String inputData;
    public Integer permissionId;
    public Integer protocolId;
    public int scenario;
    public String toAddr;
    public String value;
    public Boolean visible;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignInfoReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignInfoReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignInfoReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SignInfoReq(string, string2, string3, i, string4, string5, string6, numValueOf, lValueOf, lValueOf2, string7, numValueOf2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignInfoReq[] newArray(int i) {
            return new SignInfoReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignInfoReq OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, String str4, @NotNull String str5, String str6, Integer num, Long l, Long l2, String str7, Integer num2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SignInfoReq(str, str2, str3, i, str4, str5, str6, num, l, l2, str7, num2, bool);
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
        if (!(obj instanceof SignInfoReq)) {
            return false;
        }
        SignInfoReq signInfoReq = (SignInfoReq) obj;
        return Intrinsics.EZpvd((Object) this.coinId, (Object) signInfoReq.coinId) && Intrinsics.EZpvd((Object) this.fromAddr, (Object) signInfoReq.fromAddr) && Intrinsics.EZpvd((Object) this.toAddr, (Object) signInfoReq.toAddr) && this.scenario == signInfoReq.scenario && Intrinsics.EZpvd((Object) this.inputData, (Object) signInfoReq.inputData) && Intrinsics.EZpvd((Object) this.value, (Object) signInfoReq.value) && Intrinsics.EZpvd((Object) this.dataLength, (Object) signInfoReq.dataLength) && Intrinsics.EZpvd(this.protocolId, signInfoReq.protocolId) && Intrinsics.EZpvd(this.callValue, signInfoReq.callValue) && Intrinsics.EZpvd(this.feeLimit, signInfoReq.feeLimit) && Intrinsics.EZpvd((Object) this.functionSelector, (Object) signInfoReq.functionSelector) && Intrinsics.EZpvd(this.permissionId, signInfoReq.permissionId) && Intrinsics.EZpvd(this.visible, signInfoReq.visible);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.coinId.hashCode();
        int iHashCode2 = this.fromAddr.hashCode();
        int iHashCode3 = this.toAddr.hashCode();
        int iHashCode4 = Integer.hashCode(this.scenario);
        String str = this.inputData;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.value.hashCode();
        String str2 = this.dataLength;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.protocolId;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Long l = this.callValue;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Long l2 = this.feeLimit;
        int iHashCode10 = l2 == null ? 0 : l2.hashCode();
        String str3 = this.functionSelector;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.permissionId;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.visible;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignInfoReq(coinId=" + this.coinId + ", fromAddr=" + this.fromAddr + ", toAddr=" + this.toAddr + ", scenario=" + this.scenario + ", inputData=" + this.inputData + ", value=" + this.value + ", dataLength=" + this.dataLength + ", protocolId=" + this.protocolId + ", callValue=" + this.callValue + ", feeLimit=" + this.feeLimit + ", functionSelector=" + this.functionSelector + ", permissionId=" + this.permissionId + ", visible=" + this.visible + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinId);
        parcel.writeString(this.fromAddr);
        parcel.writeString(this.toAddr);
        parcel.writeInt(this.scenario);
        parcel.writeString(this.inputData);
        parcel.writeString(this.value);
        parcel.writeString(this.dataLength);
        Integer num = this.protocolId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.callValue;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.feeLimit;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.functionSelector);
        Integer num2 = this.permissionId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.visible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SignInfoReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignInfoReq> serializer() {
            return SignInfoReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignInfoReq(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, Integer num, Long l, Long l2, String str7, Integer num2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SignInfoReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = str;
        this.fromAddr = str2;
        if ((i & 4) == 0) {
            this.toAddr = "";
        } else {
            this.toAddr = str3;
        }
        this.scenario = (i & 8) == 0 ? 0 : i2;
        if ((i & 16) == 0) {
            this.inputData = null;
        } else {
            this.inputData = str4;
        }
        if ((i & 32) == 0) {
            this.value = "";
        } else {
            this.value = str5;
        }
        if ((i & 64) == 0) {
            this.dataLength = null;
        } else {
            this.dataLength = str6;
        }
        if ((i & 128) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num;
        }
        if ((i & 256) == 0) {
            this.callValue = null;
        } else {
            this.callValue = l;
        }
        if ((i & 512) == 0) {
            this.feeLimit = null;
        } else {
            this.feeLimit = l2;
        }
        if ((i & 1024) == 0) {
            this.functionSelector = null;
        } else {
            this.functionSelector = str7;
        }
        if ((i & 2048) == 0) {
            this.permissionId = null;
        } else {
            this.permissionId = num2;
        }
        if ((i & 4096) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
    }

    public static final /* synthetic */ void EZpvd(SignInfoReq signInfoReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signInfoReq.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signInfoReq.fromAddr);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signInfoReq.toAddr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signInfoReq.toAddr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signInfoReq.scenario != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, signInfoReq.scenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signInfoReq.inputData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signInfoReq.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signInfoReq.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signInfoReq.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signInfoReq.dataLength != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signInfoReq.dataLength);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signInfoReq.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, signInfoReq.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signInfoReq.callValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, signInfoReq.callValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signInfoReq.feeLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, signInfoReq.feeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signInfoReq.functionSelector != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signInfoReq.functionSelector);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || signInfoReq.permissionId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, signInfoReq.permissionId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && signInfoReq.visible == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, signInfoReq.visible);
    }

    public SignInfoReq(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, String str4, @NotNull String str5, String str6, Integer num, Long l, Long l2, String str7, Integer num2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coinId = str;
        this.fromAddr = str2;
        this.toAddr = str3;
        this.scenario = i;
        this.inputData = str4;
        this.value = str5;
        this.dataLength = str6;
        this.protocolId = num;
        this.callValue = l;
        this.feeLimit = l2;
        this.functionSelector = str7;
        this.permissionId = num2;
        this.visible = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003e: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r27v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004e: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r30v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Boolean):void (m)] (LINE:630) call: com.okinc.business.defi.biz.net.bean.SignInfoReq.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SignInfoReq(String str, String str2, String str3, int i, String str4, String str5, String str6, Integer num, Long l, Long l2, String str7, Integer num2, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : l, (i2 & 512) != 0 ? null : l2, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : num2, (i2 & 4096) != 0 ? null : bool);
    }
}
