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
public final class ARC20Transaction implements Parcelable {
    private String address;
    private String dustSize;
    private String feePerB;
    private List<ARC20TxIn> inputs;
    private List<ARC20OutPut> outputs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ARC20Transaction> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ARC20TxIn$$serializer.INSTANCE), new ArrayListSerializer(ARC20OutPut$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<ARC20Transaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ARC20Transaction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(ARC20TxIn.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ARC20OutPut.CREATOR.createFromParcel(parcel));
                }
            }
            return new ARC20Transaction(arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ARC20Transaction[] newArray(int i) {
            return new ARC20Transaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ARC20Transaction() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.wallet.core.sign.utxo.ARC20Transaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ARC20Transaction copy$default(ARC20Transaction aRC20Transaction, List list, List list2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aRC20Transaction.inputs;
        }
        if ((i & 2) != 0) {
            list2 = aRC20Transaction.outputs;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = aRC20Transaction.dustSize;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = aRC20Transaction.feePerB;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = aRC20Transaction.address;
        }
        return aRC20Transaction.copy(list, list3, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> component1() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20OutPut> component2() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dustSize;
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
    public final ARC20Transaction copy(List<ARC20TxIn> list, List<ARC20OutPut> list2, String str, String str2, String str3) {
        return new ARC20Transaction(list, list2, str, str2, str3);
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
        if (!(obj instanceof ARC20Transaction)) {
            return false;
        }
        ARC20Transaction aRC20Transaction = (ARC20Transaction) obj;
        return Intrinsics.EZpvd(this.inputs, aRC20Transaction.inputs) && Intrinsics.EZpvd(this.outputs, aRC20Transaction.outputs) && Intrinsics.EZpvd((Object) this.dustSize, (Object) aRC20Transaction.dustSize) && Intrinsics.EZpvd((Object) this.feePerB, (Object) aRC20Transaction.feePerB) && Intrinsics.EZpvd((Object) this.address, (Object) aRC20Transaction.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDustSize() {
        return this.dustSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeePerB() {
        return this.feePerB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20OutPut> getOutputs() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ARC20TxIn> list = this.inputs;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<ARC20OutPut> list2 = this.outputs;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.dustSize;
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
    public final void setDustSize(String str) {
        this.dustSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeePerB(String str) {
        this.feePerB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputs(List<ARC20TxIn> list) {
        this.inputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputs(List<ARC20OutPut> list) {
        this.outputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ARC20Transaction(inputs=" + this.inputs + ", outputs=" + this.outputs + ", dustSize=" + this.dustSize + ", feePerB=" + this.feePerB + ", address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ARC20TxIn> list = this.inputs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ARC20TxIn> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<ARC20OutPut> list2 = this.outputs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ARC20OutPut> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.dustSize);
        parcel.writeString(this.feePerB);
        parcel.writeString(this.address);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.ARC20Transaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ARC20Transaction> serializer() {
            return ARC20Transaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ARC20Transaction(int i, List list, List list2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.dustSize = null;
        } else {
            this.dustSize = str;
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

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ARC20Transaction aRC20Transaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aRC20Transaction.inputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], aRC20Transaction.inputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aRC20Transaction.outputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], aRC20Transaction.outputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || aRC20Transaction.dustSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aRC20Transaction.dustSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aRC20Transaction.feePerB != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, aRC20Transaction.feePerB);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && aRC20Transaction.address == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, aRC20Transaction.address);
    }

    public ARC20Transaction(List<ARC20TxIn> list, List<ARC20OutPut> list2, String str, String str2, String str3) {
        this.inputs = list;
        this.outputs = list2;
        this.dustSize = str;
        this.feePerB = str2;
        this.address = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.utxo.ARC20TxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.ARC20OutPut>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.wallet.core.sign.utxo.ARC20Transaction.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ARC20Transaction(List list, List list2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
