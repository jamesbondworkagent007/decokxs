package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class DexCrossChainRouterParam implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final DexQuoteBridgeVO bridge;
    private final List<DexRouterList> fromDexRouterList;
    private final List<DexRouterList> originFromDexRouterList;
    private final List<DexRouterList> toDexRouterToList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexCrossChainRouterParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexCrossChainRouterParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexCrossChainRouterParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DexRouterList.CREATOR.createFromParcel(parcel));
                }
            }
            DexQuoteBridgeVO dexQuoteBridgeVOCreateFromParcel = parcel.readInt() == 0 ? null : DexQuoteBridgeVO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(DexRouterList.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(DexRouterList.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList4;
            }
            return new DexCrossChainRouterParam(arrayList, dexQuoteBridgeVOCreateFromParcel, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexCrossChainRouterParam[] newArray(int i) {
            return new DexCrossChainRouterParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexCrossChainRouterParam() {
        this((List) null, (DexQuoteBridgeVO) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.DexCrossChainRouterParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexCrossChainRouterParam copy$default(DexCrossChainRouterParam dexCrossChainRouterParam, List list, DexQuoteBridgeVO dexQuoteBridgeVO, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexCrossChainRouterParam.fromDexRouterList;
        }
        if ((i & 2) != 0) {
            dexQuoteBridgeVO = dexCrossChainRouterParam.bridge;
        }
        if ((i & 4) != 0) {
            list2 = dexCrossChainRouterParam.toDexRouterToList;
        }
        if ((i & 8) != 0) {
            list3 = dexCrossChainRouterParam.originFromDexRouterList;
        }
        return dexCrossChainRouterParam.copy(list, dexQuoteBridgeVO, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component1() {
        return this.fromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteBridgeVO component2() {
        return this.bridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component3() {
        return this.toDexRouterToList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component4() {
        return this.originFromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexCrossChainRouterParam copy(List<DexRouterList> list, DexQuoteBridgeVO dexQuoteBridgeVO, List<DexRouterList> list2, List<DexRouterList> list3) {
        return new DexCrossChainRouterParam(list, dexQuoteBridgeVO, list2, list3);
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
        if (!(obj instanceof DexCrossChainRouterParam)) {
            return false;
        }
        DexCrossChainRouterParam dexCrossChainRouterParam = (DexCrossChainRouterParam) obj;
        return Intrinsics.EZpvd(this.fromDexRouterList, dexCrossChainRouterParam.fromDexRouterList) && Intrinsics.EZpvd(this.bridge, dexCrossChainRouterParam.bridge) && Intrinsics.EZpvd(this.toDexRouterToList, dexCrossChainRouterParam.toDexRouterToList) && Intrinsics.EZpvd(this.originFromDexRouterList, dexCrossChainRouterParam.originFromDexRouterList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteBridgeVO getBridge() {
        return this.bridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> getFromDexRouterList() {
        return this.fromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> getOriginFromDexRouterList() {
        return this.originFromDexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> getToDexRouterToList() {
        return this.toDexRouterToList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<DexRouterList> list = this.fromDexRouterList;
        int iHashCode = list == null ? 0 : list.hashCode();
        DexQuoteBridgeVO dexQuoteBridgeVO = this.bridge;
        int iHashCode2 = dexQuoteBridgeVO == null ? 0 : dexQuoteBridgeVO.hashCode();
        List<DexRouterList> list2 = this.toDexRouterToList;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List<DexRouterList> list3 = this.originFromDexRouterList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexCrossChainRouterParam(fromDexRouterList=" + this.fromDexRouterList + ", bridge=" + this.bridge + ", toDexRouterToList=" + this.toDexRouterToList + ", originFromDexRouterList=" + this.originFromDexRouterList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DexRouterList> list = this.fromDexRouterList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DexRouterList> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        DexQuoteBridgeVO dexQuoteBridgeVO = this.bridge;
        if (dexQuoteBridgeVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexQuoteBridgeVO.writeToParcel(parcel, i);
        }
        List<DexRouterList> list2 = this.toDexRouterToList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<DexRouterList> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<DexRouterList> list3 = this.originFromDexRouterList;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<DexRouterList> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexCrossChainRouterParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexCrossChainRouterParam> serializer() {
            return DexCrossChainRouterParam$$serializer.INSTANCE;
        }
    }

    static {
        DexRouterList$$serializer dexRouterList$$serializer = DexRouterList$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(dexRouterList$$serializer), null, new ArrayListSerializer(dexRouterList$$serializer), new ArrayListSerializer(dexRouterList$$serializer)};
    }

    public /* synthetic */ DexCrossChainRouterParam(int i, List list, DexQuoteBridgeVO dexQuoteBridgeVO, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromDexRouterList = null;
        } else {
            this.fromDexRouterList = list;
        }
        if ((i & 2) == 0) {
            this.bridge = null;
        } else {
            this.bridge = dexQuoteBridgeVO;
        }
        if ((i & 4) == 0) {
            this.toDexRouterToList = null;
        } else {
            this.toDexRouterToList = list2;
        }
        if ((i & 8) == 0) {
            this.originFromDexRouterList = null;
        } else {
            this.originFromDexRouterList = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexCrossChainRouterParam dexCrossChainRouterParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexCrossChainRouterParam.fromDexRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], dexCrossChainRouterParam.fromDexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dexCrossChainRouterParam.bridge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexQuoteBridgeVO$$serializer.INSTANCE, dexCrossChainRouterParam.bridge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dexCrossChainRouterParam.toDexRouterToList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], dexCrossChainRouterParam.toDexRouterToList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && dexCrossChainRouterParam.originFromDexRouterList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], dexCrossChainRouterParam.originFromDexRouterList);
    }

    public DexCrossChainRouterParam(List<DexRouterList> list, DexQuoteBridgeVO dexQuoteBridgeVO, List<DexRouterList> list2, List<DexRouterList> list3) {
        this.fromDexRouterList = list;
        this.bridge = dexQuoteBridgeVO;
        this.toDexRouterToList = list2;
        this.originFromDexRouterList = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.DexQuoteBridgeVO:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexQuoteBridgeVO) : (r3v0 com.okinc.business.dexlogic.bean.DexQuoteBridgeVO))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>, com.okinc.business.dexlogic.bean.DexQuoteBridgeVO, java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>, java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>):void (m)] (LINE:1623) call: com.okinc.business.dexlogic.bean.DexCrossChainRouterParam.<init>(java.util.List, com.okinc.business.dexlogic.bean.DexQuoteBridgeVO, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ DexCrossChainRouterParam(List list, DexQuoteBridgeVO dexQuoteBridgeVO, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : dexQuoteBridgeVO, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
