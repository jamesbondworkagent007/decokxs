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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class HistoryOrdersBean implements Parcelable {
    private final int curPageNum;
    private List<DefiBridgeOrderInfo> dataList;
    private final int maxPageNum;
    private final int pageSize;
    private final int totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HistoryOrdersBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DefiBridgeOrderInfo$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<HistoryOrdersBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryOrdersBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DefiBridgeOrderInfo.CREATOR.createFromParcel(parcel));
            }
            return new HistoryOrdersBean(i, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryOrdersBean[] newArray(int i) {
            return new HistoryOrdersBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryOrdersBean() {
        this(0, (List) null, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dexlogic.bean.HistoryOrdersBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryOrdersBean copy$default(HistoryOrdersBean historyOrdersBean, int i, List list, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = historyOrdersBean.curPageNum;
        }
        if ((i5 & 2) != 0) {
            list = historyOrdersBean.dataList;
        }
        List list2 = list;
        if ((i5 & 4) != 0) {
            i2 = historyOrdersBean.maxPageNum;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = historyOrdersBean.pageSize;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = historyOrdersBean.totalCount;
        }
        return historyOrdersBean.copy(i, list2, i6, i7, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.curPageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DefiBridgeOrderInfo> component2() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.maxPageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryOrdersBean copy(int i, @NotNull List<DefiBridgeOrderInfo> list, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HistoryOrdersBean(i, list, i2, i3, i4);
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
        if (!(obj instanceof HistoryOrdersBean)) {
            return false;
        }
        HistoryOrdersBean historyOrdersBean = (HistoryOrdersBean) obj;
        return this.curPageNum == historyOrdersBean.curPageNum && Intrinsics.EZpvd(this.dataList, historyOrdersBean.dataList) && this.maxPageNum == historyOrdersBean.maxPageNum && this.pageSize == historyOrdersBean.pageSize && this.totalCount == historyOrdersBean.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurPageNum() {
        return this.curPageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DefiBridgeOrderInfo> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxPageNum() {
        return this.maxPageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.curPageNum) * 31) + this.dataList.hashCode()) * 31) + Integer.hashCode(this.maxPageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataList(@NotNull List<DefiBridgeOrderInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dataList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryOrdersBean(curPageNum=" + this.curPageNum + ", dataList=" + this.dataList + ", maxPageNum=" + this.maxPageNum + ", pageSize=" + this.pageSize + ", totalCount=" + this.totalCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.curPageNum);
        List<DefiBridgeOrderInfo> list = this.dataList;
        parcel.writeInt(list.size());
        Iterator<DefiBridgeOrderInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.maxPageNum);
        parcel.writeInt(this.pageSize);
        parcel.writeInt(this.totalCount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.HistoryOrdersBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryOrdersBean> serializer() {
            return HistoryOrdersBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryOrdersBean(int i, int i2, List list, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.curPageNum = 1;
        } else {
            this.curPageNum = i2;
        }
        if ((i & 2) == 0) {
            this.dataList = new ArrayList();
        } else {
            this.dataList = list;
        }
        if ((i & 4) == 0) {
            this.maxPageNum = 1;
        } else {
            this.maxPageNum = i3;
        }
        if ((i & 8) == 0) {
            this.pageSize = 1;
        } else {
            this.pageSize = i4;
        }
        if ((i & 16) == 0) {
            this.totalCount = 1;
        } else {
            this.totalCount = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HistoryOrdersBean historyOrdersBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || historyOrdersBean.curPageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, historyOrdersBean.curPageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(historyOrdersBean.dataList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], historyOrdersBean.dataList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || historyOrdersBean.maxPageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, historyOrdersBean.maxPageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || historyOrdersBean.pageSize != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, historyOrdersBean.pageSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && historyOrdersBean.totalCount == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, historyOrdersBean.totalCount);
    }

    public HistoryOrdersBean(int i, @NotNull List<DefiBridgeOrderInfo> list, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(list, "");
        this.curPageNum = i;
        this.dataList = list;
        this.maxPageNum = i2;
        this.pageSize = i3;
        this.totalCount = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:java.util.List:0x0011: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:35) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r9v0 int))
 A[MD:(int, java.util.List<com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo>, int, int, int):void (m)] (LINE:33) call: com.okinc.business.dexlogic.bean.HistoryOrdersBean.<init>(int, java.util.List, int, int, int):void type: THIS */
    public /* synthetic */ HistoryOrdersBean(int i, List list, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? new ArrayList() : list, (i5 & 4) != 0 ? 1 : i2, (i5 & 8) != 0 ? 1 : i3, (i5 & 16) != 0 ? 1 : i4);
    }
}
