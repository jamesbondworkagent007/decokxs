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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BlackTagRes implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<BlackTagItemRes> approveAddress;
    private final List<BlackTagItemRes> to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BlackTagRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BlackTagRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackTagRes createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BlackTagItemRes.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(BlackTagItemRes.CREATOR.createFromParcel(parcel));
                }
            }
            return new BlackTagRes(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackTagRes[] newArray(int i) {
            return new BlackTagRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BlackTagRes() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.BlackTagRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlackTagRes copy$default(BlackTagRes blackTagRes, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = blackTagRes.approveAddress;
        }
        if ((i & 2) != 0) {
            list2 = blackTagRes.to;
        }
        return blackTagRes.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlackTagItemRes> component1() {
        return this.approveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlackTagItemRes> component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackTagRes copy(List<BlackTagItemRes> list, List<BlackTagItemRes> list2) {
        return new BlackTagRes(list, list2);
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
        if (!(obj instanceof BlackTagRes)) {
            return false;
        }
        BlackTagRes blackTagRes = (BlackTagRes) obj;
        return Intrinsics.EZpvd(this.approveAddress, blackTagRes.approveAddress) && Intrinsics.EZpvd(this.to, blackTagRes.to);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlackTagItemRes> getApproveAddress() {
        return this.approveAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BlackTagItemRes> getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<BlackTagItemRes> list = this.approveAddress;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<BlackTagItemRes> list2 = this.to;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BlackTagRes(approveAddress=" + this.approveAddress + ", to=" + this.to + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<BlackTagItemRes> list = this.approveAddress;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BlackTagItemRes> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<BlackTagItemRes> list2 = this.to;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<BlackTagItemRes> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BlackTagRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlackTagRes> serializer() {
            return BlackTagRes$$serializer.INSTANCE;
        }
    }

    static {
        BlackTagItemRes$$serializer blackTagItemRes$$serializer = BlackTagItemRes$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(blackTagItemRes$$serializer), new ArrayListSerializer(blackTagItemRes$$serializer)};
    }

    public /* synthetic */ BlackTagRes(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.approveAddress = null;
        } else {
            this.approveAddress = list;
        }
        if ((i & 2) == 0) {
            this.to = null;
        } else {
            this.to = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BlackTagRes blackTagRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || blackTagRes.approveAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], blackTagRes.approveAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && blackTagRes.to == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], blackTagRes.to);
    }

    public BlackTagRes(List<BlackTagItemRes> list, List<BlackTagItemRes> list2) {
        this.approveAddress = list;
        this.to = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.BlackTagItemRes>, java.util.List<com.okinc.business.defi.biz.net.bean.BlackTagItemRes>):void (m)] (LINE:146) call: com.okinc.business.defi.biz.net.bean.BlackTagRes.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ BlackTagRes(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
