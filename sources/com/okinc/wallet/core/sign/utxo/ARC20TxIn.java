package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ARC20TxIn implements Parcelable {
    private String address;
    private Integer addressIndex;
    private Integer addressType;
    private String amount;
    private List<ARC20Data> data;
    private String rawTransaction;
    private String sequence;
    private String txId;
    private String vOut;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ARC20TxIn> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(ARC20Data$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<ARC20TxIn> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ARC20TxIn createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ARC20Data.CREATOR.createFromParcel(parcel));
                }
            }
            return new ARC20TxIn(string, string2, string3, string4, numValueOf, numValueOf2, string5, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ARC20TxIn[] newArray(int i) {
            return new ARC20TxIn[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ARC20TxIn() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (List) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20Data> component8() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ARC20TxIn copy(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, List<ARC20Data> list, String str6) {
        return new ARC20TxIn(str, str2, str3, str4, num, num2, str5, list, str6);
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
        if (!(obj instanceof ARC20TxIn)) {
            return false;
        }
        ARC20TxIn aRC20TxIn = (ARC20TxIn) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) aRC20TxIn.txId) && Intrinsics.EZpvd((Object) this.vOut, (Object) aRC20TxIn.vOut) && Intrinsics.EZpvd((Object) this.amount, (Object) aRC20TxIn.amount) && Intrinsics.EZpvd((Object) this.address, (Object) aRC20TxIn.address) && Intrinsics.EZpvd(this.addressType, aRC20TxIn.addressType) && Intrinsics.EZpvd(this.addressIndex, aRC20TxIn.addressIndex) && Intrinsics.EZpvd((Object) this.sequence, (Object) aRC20TxIn.sequence) && Intrinsics.EZpvd(this.data, aRC20TxIn.data) && Intrinsics.EZpvd((Object) this.rawTransaction, (Object) aRC20TxIn.rawTransaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20Data> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTransaction() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVOut() {
        return this.vOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.vOut;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.address;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.addressType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.addressIndex;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.sequence;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        List<ARC20Data> list = this.data;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        String str6 = this.rawTransaction;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(Integer num) {
        this.addressIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(Integer num) {
        this.addressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(List<ARC20Data> list) {
        this.data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawTransaction(String str) {
        this.rawTransaction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSequence(String str) {
        this.sequence = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVOut(String str) {
        this.vOut = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ARC20TxIn(txId=" + this.txId + ", vOut=" + this.vOut + ", amount=" + this.amount + ", address=" + this.address + ", addressType=" + this.addressType + ", addressIndex=" + this.addressIndex + ", sequence=" + this.sequence + ", data=" + this.data + ", rawTransaction=" + this.rawTransaction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.vOut);
        parcel.writeString(this.amount);
        parcel.writeString(this.address);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.addressIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.sequence);
        List<ARC20Data> list = this.data;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ARC20Data> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.rawTransaction);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.ARC20TxIn.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ARC20TxIn> serializer() {
            return ARC20TxIn$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ARC20TxIn(int i, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = null;
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.vOut = null;
        } else {
            this.vOut = str2;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 8) == 0) {
            this.address = null;
        } else {
            this.address = str4;
        }
        if ((i & 16) == 0) {
            this.addressType = null;
        } else {
            this.addressType = num;
        }
        if ((i & 32) == 0) {
            this.addressIndex = null;
        } else {
            this.addressIndex = num2;
        }
        if ((i & 64) == 0) {
            this.sequence = null;
        } else {
            this.sequence = str5;
        }
        if ((i & 128) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
        if ((i & 256) == 0) {
            this.rawTransaction = null;
        } else {
            this.rawTransaction = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ARC20TxIn aRC20TxIn, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aRC20TxIn.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aRC20TxIn.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aRC20TxIn.vOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, aRC20TxIn.vOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || aRC20TxIn.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aRC20TxIn.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aRC20TxIn.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, aRC20TxIn.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || aRC20TxIn.addressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, aRC20TxIn.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || aRC20TxIn.addressIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, aRC20TxIn.addressIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || aRC20TxIn.sequence != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, aRC20TxIn.sequence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || aRC20TxIn.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], aRC20TxIn.data);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && aRC20TxIn.rawTransaction == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, aRC20TxIn.rawTransaction);
    }

    public ARC20TxIn(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, List<ARC20Data> list, String str6) {
        this.txId = str;
        this.vOut = str2;
        this.amount = str3;
        this.address = str4;
        this.addressType = num;
        this.addressIndex = num2;
        this.sequence = str5;
        this.data = list;
        this.rawTransaction = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List<com.okinc.wallet.core.sign.utxo.ARC20Data>, java.lang.String):void (m)] (LINE:59) call: com.okinc.wallet.core.sign.utxo.ARC20TxIn.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ ARC20TxIn(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) == 0 ? str6 : null);
    }
}
