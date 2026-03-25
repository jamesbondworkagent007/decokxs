package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NftAll implements Parcelable {
    private ArrayList<NftBean> collections;
    private Integer created;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NftAll> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(NftBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<NftAll> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftAll createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(NftBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new NftAll(numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NftAll[] newArray(int i) {
            return new NftAll[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NftAll() {
        this((Integer) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.NftAll */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NftAll copy$default(NftAll nftAll, Integer num, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            num = nftAll.created;
        }
        if ((i & 2) != 0) {
            arrayList = nftAll.collections;
        }
        return nftAll.copy(num, arrayList);
    }

    @SerialName("col")
    public static /* synthetic */ void getCollections$annotations() {
    }

    @SerialName("ctd")
    public static /* synthetic */ void getCreated$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.created;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NftBean> component2() {
        return this.collections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftAll copy(Integer num, ArrayList<NftBean> arrayList) {
        return new NftAll(num, arrayList);
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
        if (!(obj instanceof NftAll)) {
            return false;
        }
        NftAll nftAll = (NftAll) obj;
        return Intrinsics.EZpvd(this.created, nftAll.created) && Intrinsics.EZpvd(this.collections, nftAll.collections);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NftBean> getCollections() {
        return this.collections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCreated() {
        return this.created;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.created;
        int iHashCode = num == null ? 0 : num.hashCode();
        ArrayList<NftBean> arrayList = this.collections;
        return (iHashCode * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollections(ArrayList<NftBean> arrayList) {
        this.collections = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreated(Integer num) {
        this.created = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NftAll(created=" + this.created + ", collections=" + this.collections + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.created;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ArrayList<NftBean> arrayList = this.collections;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<NftBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.NftAll.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NftAll> serializer() {
            return NftAll$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NftAll(int i, Integer num, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.created = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.collections = null;
        } else {
            this.collections = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NftAll nftAll, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = nftAll.created) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, nftAll.created);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && nftAll.collections == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], nftAll.collections);
    }

    public NftAll(Integer num, ArrayList<NftBean> arrayList) {
        this.created = num;
        this.collections = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 java.lang.Integer))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
 A[MD:(java.lang.Integer, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.NftBean>):void (m)] (LINE:320) call: com.okinc.business.defi.biz.net.bean.NftAll.<init>(java.lang.Integer, java.util.ArrayList):void type: THIS */
    public /* synthetic */ NftAll(Integer num, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : arrayList);
    }
}
