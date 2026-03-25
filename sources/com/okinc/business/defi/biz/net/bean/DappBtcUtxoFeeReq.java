package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappBtcUtxoFeeReq implements Parcelable {
    private String address;
    private long chainIndex;
    private List<String> hexStringList;
    private List<InputAndOutput> utxoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappBtcUtxoFeeReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(InputAndOutput$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappBtcUtxoFeeReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBtcUtxoFeeReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InputAndOutput.CREATOR.createFromParcel(parcel));
            }
            return new DappBtcUtxoFeeReq(string, arrayListCreateStringArrayList, j, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBtcUtxoFeeReq[] newArray(int i) {
            return new DappBtcUtxoFeeReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappBtcUtxoFeeReq copy$default(DappBtcUtxoFeeReq dappBtcUtxoFeeReq, String str, List list, long j, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappBtcUtxoFeeReq.address;
        }
        if ((i & 2) != 0) {
            list = dappBtcUtxoFeeReq.hexStringList;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            j = dappBtcUtxoFeeReq.chainIndex;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            list2 = dappBtcUtxoFeeReq.utxoList;
        }
        return dappBtcUtxoFeeReq.copy(str, list3, j2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.hexStringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InputAndOutput> component4() {
        return this.utxoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappBtcUtxoFeeReq copy(String str, List<String> list, long j, @NotNull List<InputAndOutput> list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return new DappBtcUtxoFeeReq(str, list, j, list2);
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
        if (!(obj instanceof DappBtcUtxoFeeReq)) {
            return false;
        }
        DappBtcUtxoFeeReq dappBtcUtxoFeeReq = (DappBtcUtxoFeeReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) dappBtcUtxoFeeReq.address) && Intrinsics.EZpvd(this.hexStringList, dappBtcUtxoFeeReq.hexStringList) && this.chainIndex == dappBtcUtxoFeeReq.chainIndex && Intrinsics.EZpvd(this.utxoList, dappBtcUtxoFeeReq.utxoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHexStringList() {
        return this.hexStringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InputAndOutput> getUtxoList() {
        return this.utxoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.hexStringList;
        return (((((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + Long.hashCode(this.chainIndex)) * 31) + this.utxoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(long j) {
        this.chainIndex = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHexStringList(List<String> list) {
        this.hexStringList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoList(@NotNull List<InputAndOutput> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.utxoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappBtcUtxoFeeReq(address=" + this.address + ", hexStringList=" + this.hexStringList + ", chainIndex=" + this.chainIndex + ", utxoList=" + this.utxoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeStringList(this.hexStringList);
        parcel.writeLong(this.chainIndex);
        List<InputAndOutput> list = this.utxoList;
        parcel.writeInt(list.size());
        Iterator<InputAndOutput> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappBtcUtxoFeeReq> serializer() {
            return DappBtcUtxoFeeReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappBtcUtxoFeeReq(int i, String str, List list, long j, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, DappBtcUtxoFeeReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.hexStringList = null;
        } else {
            this.hexStringList = list;
        }
        this.chainIndex = j;
        if ((i & 8) == 0) {
            this.utxoList = new ArrayList();
        } else {
            this.utxoList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappBtcUtxoFeeReq dappBtcUtxoFeeReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappBtcUtxoFeeReq.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dappBtcUtxoFeeReq.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappBtcUtxoFeeReq.hexStringList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], dappBtcUtxoFeeReq.hexStringList);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, dappBtcUtxoFeeReq.chainIndex);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(dappBtcUtxoFeeReq.utxoList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], dappBtcUtxoFeeReq.utxoList);
    }

    public DappBtcUtxoFeeReq(String str, List<String> list, long j, @NotNull List<InputAndOutput> list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        this.address = str;
        this.hexStringList = list;
        this.chainIndex = j;
        this.utxoList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (r10v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1530) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, long, java.util.List<com.okinc.business.defi.biz.net.bean.InputAndOutput>):void (m)] (LINE:1526) call: com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq.<init>(java.lang.String, java.util.List, long, java.util.List):void type: THIS */
    public /* synthetic */ DappBtcUtxoFeeReq(String str, List list, long j, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, j, (i & 8) != 0 ? new ArrayList() : list2);
    }
}
