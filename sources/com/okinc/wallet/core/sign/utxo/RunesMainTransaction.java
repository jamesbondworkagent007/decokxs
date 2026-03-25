package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class RunesMainTransaction implements Parcelable {
    private String address;
    private String defaultOutput;
    private String feePerB;
    private List<RunesMainTxIn> inputs;
    private boolean isDefaultOutput;
    private String minOutput;
    private List<RunesMainOutPut> outputs;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RunesMainTransaction> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(RunesMainTxIn$$serializer.INSTANCE), new ArrayListSerializer(RunesMainOutPut$$serializer.INSTANCE), null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<RunesMainTransaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesMainTransaction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(RunesMainTxIn.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(RunesMainOutPut.CREATOR.createFromParcel(parcel));
                }
            }
            return new RunesMainTransaction(arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesMainTransaction[] newArray(int i) {
            return new RunesMainTransaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RunesMainTransaction() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesMainTxIn> component1() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesMainOutPut> component2() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.feePerB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isDefaultOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.defaultOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RunesMainTransaction copy(List<RunesMainTxIn> list, List<RunesMainOutPut> list2, String str, String str2, String str3, boolean z, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new RunesMainTransaction(list, list2, str, str2, str3, z, str4, str5);
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
        if (!(obj instanceof RunesMainTransaction)) {
            return false;
        }
        RunesMainTransaction runesMainTransaction = (RunesMainTransaction) obj;
        return Intrinsics.EZpvd(this.inputs, runesMainTransaction.inputs) && Intrinsics.EZpvd(this.outputs, runesMainTransaction.outputs) && Intrinsics.EZpvd((Object) this.type, (Object) runesMainTransaction.type) && Intrinsics.EZpvd((Object) this.feePerB, (Object) runesMainTransaction.feePerB) && Intrinsics.EZpvd((Object) this.address, (Object) runesMainTransaction.address) && this.isDefaultOutput == runesMainTransaction.isDefaultOutput && Intrinsics.EZpvd((Object) this.defaultOutput, (Object) runesMainTransaction.defaultOutput) && Intrinsics.EZpvd((Object) this.minOutput, (Object) runesMainTransaction.minOutput);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultOutput() {
        return this.defaultOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeePerB() {
        return this.feePerB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesMainTxIn> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinOutput() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesMainOutPut> getOutputs() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<RunesMainTxIn> list = this.inputs;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<RunesMainOutPut> list2 = this.outputs;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.type;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.feePerB;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDefaultOutput)) * 31) + this.defaultOutput.hashCode()) * 31) + this.minOutput.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDefaultOutput() {
        return this.isDefaultOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultOutput(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defaultOutput = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultOutput(boolean z) {
        this.isDefaultOutput = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeePerB(String str) {
        this.feePerB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputs(List<RunesMainTxIn> list) {
        this.inputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinOutput(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minOutput = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputs(List<RunesMainOutPut> list) {
        this.outputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RunesMainTransaction(inputs=" + this.inputs + ", outputs=" + this.outputs + ", type=" + this.type + ", feePerB=" + this.feePerB + ", address=" + this.address + ", isDefaultOutput=" + this.isDefaultOutput + ", defaultOutput=" + this.defaultOutput + ", minOutput=" + this.minOutput + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RunesMainTxIn> list = this.inputs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RunesMainTxIn> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<RunesMainOutPut> list2 = this.outputs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<RunesMainOutPut> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.type);
        parcel.writeString(this.feePerB);
        parcel.writeString(this.address);
        parcel.writeInt(this.isDefaultOutput ? 1 : 0);
        parcel.writeString(this.defaultOutput);
        parcel.writeString(this.minOutput);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RunesMainTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RunesMainTransaction> serializer() {
            return RunesMainTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RunesMainTransaction(int i, List list, List list2, String str, String str2, String str3, boolean z, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.inputs = null;
        } else {
            this.inputs = list;
        }
        if ((i & 2) == 0) {
            this.outputs = null;
        } else {
            this.outputs = list2;
        }
        if ((i & 4) == 0) {
            this.type = "runeMain";
        } else {
            this.type = str;
        }
        if ((i & 8) == 0) {
            this.feePerB = null;
        } else {
            this.feePerB = str2;
        }
        if ((i & 16) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 32) == 0) {
            this.isDefaultOutput = false;
        } else {
            this.isDefaultOutput = z;
        }
        if ((i & 64) == 0) {
            this.defaultOutput = "0";
        } else {
            this.defaultOutput = str4;
        }
        if ((i & 128) == 0) {
            this.minOutput = "";
        } else {
            this.minOutput = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(RunesMainTransaction runesMainTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || runesMainTransaction.inputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], runesMainTransaction.inputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || runesMainTransaction.outputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], runesMainTransaction.outputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) runesMainTransaction.type, (Object) "runeMain")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, runesMainTransaction.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || runesMainTransaction.feePerB != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, runesMainTransaction.feePerB);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || runesMainTransaction.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, runesMainTransaction.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || runesMainTransaction.isDefaultOutput) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, runesMainTransaction.isDefaultOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) runesMainTransaction.defaultOutput, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, runesMainTransaction.defaultOutput);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) runesMainTransaction.minOutput, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, runesMainTransaction.minOutput);
    }

    public RunesMainTransaction(List<RunesMainTxIn> list, List<RunesMainOutPut> list2, String str, String str2, String str3, boolean z, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.inputs = list;
        this.outputs = list2;
        this.type = str;
        this.feePerB = str2;
        this.address = str3;
        this.isDefaultOutput = z;
        this.defaultOutput = str4;
        this.minOutput = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("runeMain") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.utxo.RunesMainTxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.RunesMainOutPut>, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.wallet.core.sign.utxo.RunesMainTransaction.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RunesMainTransaction(List list, List list2, String str, String str2, String str3, boolean z, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? "runeMain" : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "0" : str4, (i & 128) != 0 ? "" : str5);
    }
}
