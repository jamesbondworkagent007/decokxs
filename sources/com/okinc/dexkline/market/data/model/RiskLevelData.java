package com.okinc.dexkline.market.data.model;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RiskLevelData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<RiskDetailData> highRiskList;
    private final List<RiskDetailData> lowRiskList;
    private final List<RiskDetailData> middleRiskList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RiskLevelData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RiskLevelData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskLevelData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RiskDetailData.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(RiskDetailData.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(RiskDetailData.CREATOR.createFromParcel(parcel));
            }
            return new RiskLevelData(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskLevelData[] newArray(int i) {
            return new RiskLevelData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskLevelData() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.data.model.RiskLevelData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RiskLevelData copy$default(RiskLevelData riskLevelData, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = riskLevelData.highRiskList;
        }
        if ((i & 2) != 0) {
            list2 = riskLevelData.lowRiskList;
        }
        if ((i & 4) != 0) {
            list3 = riskLevelData.middleRiskList;
        }
        return riskLevelData.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskDetailData> component1() {
        return this.highRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskDetailData> component2() {
        return this.lowRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskDetailData> component3() {
        return this.middleRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskLevelData copy(@NotNull List<RiskDetailData> list, @NotNull List<RiskDetailData> list2, @NotNull List<RiskDetailData> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new RiskLevelData(list, list2, list3);
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
        if (!(obj instanceof RiskLevelData)) {
            return false;
        }
        RiskLevelData riskLevelData = (RiskLevelData) obj;
        return Intrinsics.EZpvd(this.highRiskList, riskLevelData.highRiskList) && Intrinsics.EZpvd(this.lowRiskList, riskLevelData.lowRiskList) && Intrinsics.EZpvd(this.middleRiskList, riskLevelData.middleRiskList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskDetailData> getHighRiskList() {
        return this.highRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskDetailData> getLowRiskList() {
        return this.lowRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskDetailData> getMiddleRiskList() {
        return this.middleRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.highRiskList.hashCode() * 31) + this.lowRiskList.hashCode()) * 31) + this.middleRiskList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskLevelData(highRiskList=" + this.highRiskList + ", lowRiskList=" + this.lowRiskList + ", middleRiskList=" + this.middleRiskList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RiskDetailData> list = this.highRiskList;
        parcel.writeInt(list.size());
        Iterator<RiskDetailData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<RiskDetailData> list2 = this.lowRiskList;
        parcel.writeInt(list2.size());
        Iterator<RiskDetailData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<RiskDetailData> list3 = this.middleRiskList;
        parcel.writeInt(list3.size());
        Iterator<RiskDetailData> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.RiskLevelData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RiskLevelData> serializer() {
            return RiskLevelData$$serializer.INSTANCE;
        }
    }

    static {
        RiskDetailData$$serializer riskDetailData$$serializer = RiskDetailData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(riskDetailData$$serializer), new ArrayListSerializer(riskDetailData$$serializer), new ArrayListSerializer(riskDetailData$$serializer)};
    }

    public /* synthetic */ RiskLevelData(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        this.highRiskList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.lowRiskList = yDY.AhwBna();
        } else {
            this.lowRiskList = list2;
        }
        if ((i & 4) == 0) {
            this.middleRiskList = yDY.AhwBna();
        } else {
            this.middleRiskList = list3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [25=4] */
    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(RiskLevelData riskLevelData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(riskLevelData.highRiskList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], riskLevelData.highRiskList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(riskLevelData.lowRiskList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], riskLevelData.lowRiskList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(riskLevelData.middleRiskList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], riskLevelData.middleRiskList);
    }

    public RiskLevelData(@NotNull List<RiskDetailData> list, @NotNull List<RiskDetailData> list2, @NotNull List<RiskDetailData> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.highRiskList = list;
        this.lowRiskList = list2;
        this.middleRiskList = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:29)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.dexkline.market.data.model.RiskDetailData>, java.util.List<com.okinc.dexkline.market.data.model.RiskDetailData>, java.util.List<com.okinc.dexkline.market.data.model.RiskDetailData>):void (m)] (LINE:28) call: com.okinc.dexkline.market.data.model.RiskLevelData.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ RiskLevelData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}
