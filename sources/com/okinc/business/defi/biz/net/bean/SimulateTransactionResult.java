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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SimulateTransactionResult implements Parcelable {
    private Boolean addFundsFlag;
    private String msg;
    private String msgKey;
    private Boolean result;
    private Integer resultCode;
    private String unitGasLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimulateTransactionResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SimulateTransactionResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimulateTransactionResult createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SimulateTransactionResult(boolValueOf, numValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimulateTransactionResult[] newArray(int i) {
            return new SimulateTransactionResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimulateTransactionResult() {
        this((Boolean) null, (Integer) null, (Boolean) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimulateTransactionResult copy$default(SimulateTransactionResult simulateTransactionResult, Boolean bool, Integer num, Boolean bool2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = simulateTransactionResult.result;
        }
        if ((i & 2) != 0) {
            num = simulateTransactionResult.resultCode;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            bool2 = simulateTransactionResult.addFundsFlag;
        }
        Boolean bool3 = bool2;
        if ((i & 8) != 0) {
            str = simulateTransactionResult.msgKey;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = simulateTransactionResult.msg;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = simulateTransactionResult.unitGasLimit;
        }
        return simulateTransactionResult.copy(bool, num2, bool3, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.addFundsFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.msgKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.unitGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimulateTransactionResult copy(Boolean bool, Integer num, Boolean bool2, String str, String str2, String str3) {
        return new SimulateTransactionResult(bool, num, bool2, str, str2, str3);
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
        if (!(obj instanceof SimulateTransactionResult)) {
            return false;
        }
        SimulateTransactionResult simulateTransactionResult = (SimulateTransactionResult) obj;
        return Intrinsics.EZpvd(this.result, simulateTransactionResult.result) && Intrinsics.EZpvd(this.resultCode, simulateTransactionResult.resultCode) && Intrinsics.EZpvd(this.addFundsFlag, simulateTransactionResult.addFundsFlag) && Intrinsics.EZpvd((Object) this.msgKey, (Object) simulateTransactionResult.msgKey) && Intrinsics.EZpvd((Object) this.msg, (Object) simulateTransactionResult.msg) && Intrinsics.EZpvd((Object) this.unitGasLimit, (Object) simulateTransactionResult.unitGasLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAddFundsFlag() {
        return this.addFundsFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgKey() {
        return this.msgKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitGasLimit() {
        return this.unitGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.result;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Integer num = this.resultCode;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Boolean bool2 = this.addFundsFlag;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.msgKey;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.msg;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.unitGasLimit;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddFundsFlag(Boolean bool) {
        this.addFundsFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgKey(String str) {
        this.msgKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResult(Boolean bool) {
        this.result = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResultCode(Integer num) {
        this.resultCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitGasLimit(String str) {
        this.unitGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimulateTransactionResult(result=" + this.result + ", resultCode=" + this.resultCode + ", addFundsFlag=" + this.addFundsFlag + ", msgKey=" + this.msgKey + ", msg=" + this.msg + ", unitGasLimit=" + this.unitGasLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.result;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.resultCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.addFundsFlag;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.msgKey);
        parcel.writeString(this.msg);
        parcel.writeString(this.unitGasLimit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SimulateTransactionResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimulateTransactionResult> serializer() {
            return SimulateTransactionResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimulateTransactionResult(int i, Boolean bool, Integer num, Boolean bool2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = bool;
        }
        if ((i & 2) == 0) {
            this.resultCode = null;
        } else {
            this.resultCode = num;
        }
        if ((i & 4) == 0) {
            this.addFundsFlag = null;
        } else {
            this.addFundsFlag = bool2;
        }
        if ((i & 8) == 0) {
            this.msgKey = null;
        } else {
            this.msgKey = str;
        }
        if ((i & 16) == 0) {
            this.msg = null;
        } else {
            this.msg = str2;
        }
        if ((i & 32) == 0) {
            this.unitGasLimit = null;
        } else {
            this.unitGasLimit = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SimulateTransactionResult simulateTransactionResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || simulateTransactionResult.result != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, simulateTransactionResult.result);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || simulateTransactionResult.resultCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, simulateTransactionResult.resultCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || simulateTransactionResult.addFundsFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, simulateTransactionResult.addFundsFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || simulateTransactionResult.msgKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, simulateTransactionResult.msgKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || simulateTransactionResult.msg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, simulateTransactionResult.msg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && simulateTransactionResult.unitGasLimit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, simulateTransactionResult.unitGasLimit);
    }

    public SimulateTransactionResult(Boolean bool, Integer num, Boolean bool2, String str, String str2, String str3) {
        this.result = bool;
        this.resultCode = num;
        this.addFundsFlag = bool2;
        this.msgKey = str;
        this.msg = str2;
        this.unitGasLimit = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:134) call: com.okinc.business.defi.biz.net.bean.SimulateTransactionResult.<init>(java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimulateTransactionResult(Boolean bool, Integer num, Boolean bool2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
