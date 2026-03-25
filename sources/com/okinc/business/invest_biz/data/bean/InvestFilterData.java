package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestFilterData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<InvestBaseFilter> networkCondition;
    private final List<InvestOrderTypeFilter> orderTypeCondition;
    private List<InvestBaseFilter> simplifyInvestTypesCondition;
    private List<InvestRateFilterBean> simplifyRateCondition;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFilterData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestFilterData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFilterData createFromParcel(Parcel parcel) {
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
                    arrayList.add(InvestRateFilterBean.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(InvestBaseFilter.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(InvestBaseFilter.CREATOR.createFromParcel(parcel));
                }
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(InvestOrderTypeFilter.CREATOR.createFromParcel(parcel));
            }
            return new InvestFilterData(arrayList, arrayList2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFilterData[] newArray(int i) {
            return new InvestFilterData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestFilterData() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestFilterData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestFilterData copy$default(InvestFilterData investFilterData, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investFilterData.simplifyRateCondition;
        }
        if ((i & 2) != 0) {
            list2 = investFilterData.simplifyInvestTypesCondition;
        }
        if ((i & 4) != 0) {
            list3 = investFilterData.networkCondition;
        }
        if ((i & 8) != 0) {
            list4 = investFilterData.orderTypeCondition;
        }
        return investFilterData.copy(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestRateFilterBean> component1() {
        return this.simplifyRateCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseFilter> component2() {
        return this.simplifyInvestTypesCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseFilter> component3() {
        return this.networkCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestOrderTypeFilter> component4() {
        return this.orderTypeCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestFilterData copy(List<InvestRateFilterBean> list, List<InvestBaseFilter> list2, List<InvestBaseFilter> list3, @NotNull List<InvestOrderTypeFilter> list4) {
        Intrinsics.checkNotNullParameter(list4, "");
        return new InvestFilterData(list, list2, list3, list4);
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
        if (!(obj instanceof InvestFilterData)) {
            return false;
        }
        InvestFilterData investFilterData = (InvestFilterData) obj;
        return Intrinsics.EZpvd(this.simplifyRateCondition, investFilterData.simplifyRateCondition) && Intrinsics.EZpvd(this.simplifyInvestTypesCondition, investFilterData.simplifyInvestTypesCondition) && Intrinsics.EZpvd(this.networkCondition, investFilterData.networkCondition) && Intrinsics.EZpvd(this.orderTypeCondition, investFilterData.orderTypeCondition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseFilter> getNetworkCondition() {
        return this.networkCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestOrderTypeFilter> getOrderTypeCondition() {
        return this.orderTypeCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseFilter> getSimplifyInvestTypesCondition() {
        return this.simplifyInvestTypesCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestRateFilterBean> getSimplifyRateCondition() {
        return this.simplifyRateCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestRateFilterBean> list = this.simplifyRateCondition;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<InvestBaseFilter> list2 = this.simplifyInvestTypesCondition;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<InvestBaseFilter> list3 = this.networkCondition;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0)) * 31) + this.orderTypeCondition.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkCondition(List<InvestBaseFilter> list) {
        this.networkCondition = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimplifyInvestTypesCondition(List<InvestBaseFilter> list) {
        this.simplifyInvestTypesCondition = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimplifyRateCondition(List<InvestRateFilterBean> list) {
        this.simplifyRateCondition = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestFilterData(simplifyRateCondition=" + this.simplifyRateCondition + ", simplifyInvestTypesCondition=" + this.simplifyInvestTypesCondition + ", networkCondition=" + this.networkCondition + ", orderTypeCondition=" + this.orderTypeCondition + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestRateFilterBean> list = this.simplifyRateCondition;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestRateFilterBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<InvestBaseFilter> list2 = this.simplifyInvestTypesCondition;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InvestBaseFilter> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<InvestBaseFilter> list3 = this.networkCondition;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<InvestBaseFilter> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<InvestOrderTypeFilter> list4 = this.orderTypeCondition;
        parcel.writeInt(list4.size());
        Iterator<InvestOrderTypeFilter> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestFilterData> serializer() {
            return InvestFilterData$$serializer.INSTANCE;
        }
    }

    static {
        InvestBaseFilter$$serializer investBaseFilter$$serializer = InvestBaseFilter$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(InvestRateFilterBean$$serializer.INSTANCE), new ArrayListSerializer(investBaseFilter$$serializer), new ArrayListSerializer(investBaseFilter$$serializer), new ArrayListSerializer(InvestOrderTypeFilter$$serializer.INSTANCE)};
    }

    public /* synthetic */ InvestFilterData(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.simplifyRateCondition = null;
        } else {
            this.simplifyRateCondition = list;
        }
        if ((i & 2) == 0) {
            this.simplifyInvestTypesCondition = null;
        } else {
            this.simplifyInvestTypesCondition = list2;
        }
        if ((i & 4) == 0) {
            this.networkCondition = null;
        } else {
            this.networkCondition = list3;
        }
        if ((i & 8) == 0) {
            this.orderTypeCondition = yDY.AhwBna();
        } else {
            this.orderTypeCondition = list4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestFilterData investFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investFilterData.simplifyRateCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investFilterData.simplifyRateCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investFilterData.simplifyInvestTypesCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investFilterData.simplifyInvestTypesCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investFilterData.networkCondition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investFilterData.networkCondition);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(investFilterData.orderTypeCondition, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investFilterData.orderTypeCondition);
    }

    public InvestFilterData(List<InvestRateFilterBean> list, List<InvestBaseFilter> list2, List<InvestBaseFilter> list3, @NotNull List<InvestOrderTypeFilter> list4) {
        Intrinsics.checkNotNullParameter(list4, "");
        this.simplifyRateCondition = list;
        this.simplifyInvestTypesCondition = list2;
        this.networkCondition = list3;
        this.orderTypeCondition = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:150)) : (r5v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestRateFilterBean>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseFilter>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseFilter>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrderTypeFilter>):void (m)] (LINE:146) call: com.okinc.business.invest_biz.data.bean.InvestFilterData.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ InvestFilterData(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? yDY.AhwBna() : list4);
    }
}
