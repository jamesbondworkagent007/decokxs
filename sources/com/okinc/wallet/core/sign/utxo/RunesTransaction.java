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
public final class RunesTransaction implements Parcelable {
    private String address;
    private String feePerB;
    private List<RunesTxIn> inputs;
    private List<RunesOutPut> outputs;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RunesTransaction> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(RunesTxIn$$serializer.INSTANCE), new ArrayListSerializer(RunesOutPut$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<RunesTransaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesTransaction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(RunesTxIn.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(RunesOutPut.CREATOR.createFromParcel(parcel));
                }
            }
            return new RunesTransaction(arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesTransaction[] newArray(int i) {
            return new RunesTransaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RunesTransaction() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.wallet.core.sign.utxo.RunesTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunesTransaction copy$default(RunesTransaction runesTransaction, List list, List list2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = runesTransaction.inputs;
        }
        if ((i & 2) != 0) {
            list2 = runesTransaction.outputs;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = runesTransaction.type;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = runesTransaction.feePerB;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = runesTransaction.address;
        }
        return runesTransaction.copy(list, list3, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesTxIn> component1() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesOutPut> component2() {
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
    public final RunesTransaction copy(List<RunesTxIn> list, List<RunesOutPut> list2, String str, String str2, String str3) {
        return new RunesTransaction(list, list2, str, str2, str3);
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
        if (!(obj instanceof RunesTransaction)) {
            return false;
        }
        RunesTransaction runesTransaction = (RunesTransaction) obj;
        return Intrinsics.EZpvd(this.inputs, runesTransaction.inputs) && Intrinsics.EZpvd(this.outputs, runesTransaction.outputs) && Intrinsics.EZpvd((Object) this.type, (Object) runesTransaction.type) && Intrinsics.EZpvd((Object) this.feePerB, (Object) runesTransaction.feePerB) && Intrinsics.EZpvd((Object) this.address, (Object) runesTransaction.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeePerB() {
        return this.feePerB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesTxIn> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesOutPut> getOutputs() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<RunesTxIn> list = this.inputs;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<RunesOutPut> list2 = this.outputs;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.type;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.feePerB;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeePerB(String str) {
        this.feePerB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputs(List<RunesTxIn> list) {
        this.inputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputs(List<RunesOutPut> list) {
        this.outputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RunesTransaction(inputs=" + this.inputs + ", outputs=" + this.outputs + ", type=" + this.type + ", feePerB=" + this.feePerB + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RunesTxIn> list = this.inputs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RunesTxIn> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<RunesOutPut> list2 = this.outputs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<RunesOutPut> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.type);
        parcel.writeString(this.feePerB);
        parcel.writeString(this.address);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RunesTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RunesTransaction> serializer() {
            return RunesTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RunesTransaction(int i, List list, List list2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.type = "rune";
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
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(RunesTransaction runesTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || runesTransaction.inputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], runesTransaction.inputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || runesTransaction.outputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], runesTransaction.outputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) runesTransaction.type, (Object) "rune")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, runesTransaction.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || runesTransaction.feePerB != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, runesTransaction.feePerB);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && runesTransaction.address == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, runesTransaction.address);
    }

    public RunesTransaction(List<RunesTxIn> list, List<RunesOutPut> list2, String str, String str2, String str3) {
        this.inputs = list;
        this.outputs = list2;
        this.type = str;
        this.feePerB = str2;
        this.address = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("rune") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.utxo.RunesTxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.RunesOutPut>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.wallet.core.sign.utxo.RunesTransaction.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RunesTransaction(List list, List list2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? "rune" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
