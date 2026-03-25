package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class FiatOrderListResponseBean implements Parcelable {
    private final boolean hasNextPage;
    private final List<FiatOrderItem> items;
    private final int pageNum;
    private final int pageSize;
    private final int totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FiatOrderListResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FiatOrderItem$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<FiatOrderListResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatOrderListResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FiatOrderItem.CREATOR.createFromParcel(parcel));
            }
            return new FiatOrderListResponseBean(arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatOrderListResponseBean[] newArray(int i) {
            return new FiatOrderListResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatOrderListResponseBean() {
        this((List) null, 0, 0, 0, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderListResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatOrderListResponseBean copy$default(FiatOrderListResponseBean fiatOrderListResponseBean, List list, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = fiatOrderListResponseBean.items;
        }
        if ((i4 & 2) != 0) {
            i = fiatOrderListResponseBean.pageNum;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = fiatOrderListResponseBean.pageSize;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = fiatOrderListResponseBean.totalCount;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            z = fiatOrderListResponseBean.hasNextPage;
        }
        return fiatOrderListResponseBean.copy(list, i5, i6, i7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatOrderItem> component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatOrderListResponseBean copy(@NotNull List<FiatOrderItem> list, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FiatOrderListResponseBean(list, i, i2, i3, z);
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
        if (!(obj instanceof FiatOrderListResponseBean)) {
            return false;
        }
        FiatOrderListResponseBean fiatOrderListResponseBean = (FiatOrderListResponseBean) obj;
        return Intrinsics.EZpvd(this.items, fiatOrderListResponseBean.items) && this.pageNum == fiatOrderListResponseBean.pageNum && this.pageSize == fiatOrderListResponseBean.pageSize && this.totalCount == fiatOrderListResponseBean.totalCount && this.hasNextPage == fiatOrderListResponseBean.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatOrderItem> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNum() {
        return this.pageNum;
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
        return (((((((this.items.hashCode() * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalCount)) * 31) + Boolean.hashCode(this.hasNextPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatOrderListResponseBean(items=" + this.items + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", totalCount=" + this.totalCount + ", hasNextPage=" + this.hasNextPage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FiatOrderItem> list = this.items;
        parcel.writeInt(list.size());
        Iterator<FiatOrderItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.pageNum);
        parcel.writeInt(this.pageSize);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.hasNextPage ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiatOrderListResponseBean> serializer() {
            return FiatOrderListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FiatOrderListResponseBean(int i, List list, int i2, int i3, int i4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.items = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.pageNum = 1;
        } else {
            this.pageNum = i2;
        }
        if ((i & 4) == 0) {
            this.pageSize = 20;
        } else {
            this.pageSize = i3;
        }
        if ((i & 8) == 0) {
            this.totalCount = 0;
        } else {
            this.totalCount = i4;
        }
        if ((i & 16) == 0) {
            this.hasNextPage = false;
        } else {
            this.hasNextPage = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FiatOrderListResponseBean fiatOrderListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(fiatOrderListResponseBean.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], fiatOrderListResponseBean.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fiatOrderListResponseBean.pageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, fiatOrderListResponseBean.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fiatOrderListResponseBean.pageSize != 20) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, fiatOrderListResponseBean.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fiatOrderListResponseBean.totalCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, fiatOrderListResponseBean.totalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fiatOrderListResponseBean.hasNextPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, fiatOrderListResponseBean.hasNextPage);
        }
    }

    public FiatOrderListResponseBean(@NotNull List<FiatOrderItem> list, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.pageNum = i;
        this.pageSize = i2;
        this.totalCount = i3;
        this.hasNextPage = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r4v0 java.util.List))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:int:0x0014: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderItem>, int, int, int, boolean):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderListResponseBean.<init>(java.util.List, int, int, int, boolean):void type: THIS */
    public /* synthetic */ FiatOrderListResponseBean(List list, int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? yDY.AhwBna() : list, (i4 & 2) != 0 ? 1 : i, (i4 & 4) != 0 ? 20 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z);
    }
}
