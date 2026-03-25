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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class RunesMainBuyTransaction implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String buyerAddress;
    private List<ARC20TxIn> buyerInputs;
    private String changeAddress;
    private String dustSize;
    private String feePerB;
    private String price;
    private final boolean rune;
    private List<ARC20TxIn> sellerInputs;
    private List<String> sellerPSBT;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RunesMainBuyTransaction> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RunesMainBuyTransaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesMainBuyTransaction createFromParcel(Parcel parcel) {
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
                    arrayList2.add(ARC20TxIn.CREATOR.createFromParcel(parcel));
                }
            }
            return new RunesMainBuyTransaction(arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesMainBuyTransaction[] newArray(int i) {
            return new RunesMainBuyTransaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RunesMainBuyTransaction() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> component1() {
        return this.buyerInputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> component2() {
        return this.sellerInputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.buyerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.feePerB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dustSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.sellerPSBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.rune;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RunesMainBuyTransaction copy(List<ARC20TxIn> list, List<ARC20TxIn> list2, String str, String str2, String str3, String str4, String str5, List<String> list3, boolean z) {
        return new RunesMainBuyTransaction(list, list2, str, str2, str3, str4, str5, list3, z);
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
        if (!(obj instanceof RunesMainBuyTransaction)) {
            return false;
        }
        RunesMainBuyTransaction runesMainBuyTransaction = (RunesMainBuyTransaction) obj;
        return Intrinsics.EZpvd(this.buyerInputs, runesMainBuyTransaction.buyerInputs) && Intrinsics.EZpvd(this.sellerInputs, runesMainBuyTransaction.sellerInputs) && Intrinsics.EZpvd((Object) this.price, (Object) runesMainBuyTransaction.price) && Intrinsics.EZpvd((Object) this.changeAddress, (Object) runesMainBuyTransaction.changeAddress) && Intrinsics.EZpvd((Object) this.buyerAddress, (Object) runesMainBuyTransaction.buyerAddress) && Intrinsics.EZpvd((Object) this.feePerB, (Object) runesMainBuyTransaction.feePerB) && Intrinsics.EZpvd((Object) this.dustSize, (Object) runesMainBuyTransaction.dustSize) && Intrinsics.EZpvd(this.sellerPSBT, runesMainBuyTransaction.sellerPSBT) && this.rune == runesMainBuyTransaction.rune;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyerAddress() {
        return this.buyerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> getBuyerInputs() {
        return this.buyerInputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddress() {
        return this.changeAddress;
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
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRune() {
        return this.rune;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> getSellerInputs() {
        return this.sellerInputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSellerPSBT() {
        return this.sellerPSBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ARC20TxIn> list = this.buyerInputs;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<ARC20TxIn> list2 = this.sellerInputs;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.price;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.changeAddress;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.buyerAddress;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.feePerB;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dustSize;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        List<String> list3 = this.sellerPSBT;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list3 != null ? list3.hashCode() : 0)) * 31) + Boolean.hashCode(this.rune);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyerAddress(String str) {
        this.buyerAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyerInputs(List<ARC20TxIn> list) {
        this.buyerInputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddress(String str) {
        this.changeAddress = str;
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
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellerInputs(List<ARC20TxIn> list) {
        this.sellerInputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellerPSBT(List<String> list) {
        this.sellerPSBT = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RunesMainBuyTransaction(buyerInputs=" + this.buyerInputs + ", sellerInputs=" + this.sellerInputs + ", price=" + this.price + ", changeAddress=" + this.changeAddress + ", buyerAddress=" + this.buyerAddress + ", feePerB=" + this.feePerB + ", dustSize=" + this.dustSize + ", sellerPSBT=" + this.sellerPSBT + ", rune=" + this.rune + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ARC20TxIn> list = this.buyerInputs;
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
        List<ARC20TxIn> list2 = this.sellerInputs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ARC20TxIn> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.price);
        parcel.writeString(this.changeAddress);
        parcel.writeString(this.buyerAddress);
        parcel.writeString(this.feePerB);
        parcel.writeString(this.dustSize);
        parcel.writeStringList(this.sellerPSBT);
        parcel.writeInt(this.rune ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RunesMainBuyTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RunesMainBuyTransaction> serializer() {
            return RunesMainBuyTransaction$$serializer.INSTANCE;
        }
    }

    static {
        ARC20TxIn$$serializer aRC20TxIn$$serializer = ARC20TxIn$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(aRC20TxIn$$serializer), new ArrayListSerializer(aRC20TxIn$$serializer), null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};
    }

    public /* synthetic */ RunesMainBuyTransaction(int i, List list, List list2, String str, String str2, String str3, String str4, String str5, List list3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buyerInputs = null;
        } else {
            this.buyerInputs = list;
        }
        if ((i & 2) == 0) {
            this.sellerInputs = null;
        } else {
            this.sellerInputs = list2;
        }
        if ((i & 4) == 0) {
            this.price = null;
        } else {
            this.price = str;
        }
        if ((i & 8) == 0) {
            this.changeAddress = null;
        } else {
            this.changeAddress = str2;
        }
        if ((i & 16) == 0) {
            this.buyerAddress = null;
        } else {
            this.buyerAddress = str3;
        }
        if ((i & 32) == 0) {
            this.feePerB = null;
        } else {
            this.feePerB = str4;
        }
        if ((i & 64) == 0) {
            this.dustSize = null;
        } else {
            this.dustSize = str5;
        }
        if ((i & 128) == 0) {
            this.sellerPSBT = null;
        } else {
            this.sellerPSBT = list3;
        }
        if ((i & 256) == 0) {
            this.rune = true;
        } else {
            this.rune = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(RunesMainBuyTransaction runesMainBuyTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || runesMainBuyTransaction.buyerInputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], runesMainBuyTransaction.buyerInputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || runesMainBuyTransaction.sellerInputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], runesMainBuyTransaction.sellerInputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || runesMainBuyTransaction.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, runesMainBuyTransaction.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || runesMainBuyTransaction.changeAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, runesMainBuyTransaction.changeAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || runesMainBuyTransaction.buyerAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, runesMainBuyTransaction.buyerAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || runesMainBuyTransaction.feePerB != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, runesMainBuyTransaction.feePerB);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || runesMainBuyTransaction.dustSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, runesMainBuyTransaction.dustSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || runesMainBuyTransaction.sellerPSBT != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], runesMainBuyTransaction.sellerPSBT);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && runesMainBuyTransaction.rune) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 8, runesMainBuyTransaction.rune);
    }

    public RunesMainBuyTransaction(List<ARC20TxIn> list, List<ARC20TxIn> list2, String str, String str2, String str3, String str4, String str5, List<String> list3, boolean z) {
        this.buyerInputs = list;
        this.sellerInputs = list2;
        this.price = str;
        this.changeAddress = str2;
        this.buyerAddress = str3;
        this.feePerB = str4;
        this.dustSize = str5;
        this.sellerPSBT = list3;
        this.rune = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.utxo.ARC20TxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.ARC20TxIn>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, boolean):void (m)] (LINE:75) call: com.okinc.wallet.core.sign.utxo.RunesMainBuyTransaction.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ RunesMainBuyTransaction(List list, List list2, String str, String str2, String str3, String str4, String str5, List list3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? list3 : null, (i & 256) != 0 ? true : z);
    }
}
