package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderItem;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatOrderListResponseBean;
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
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class FiatOrderListBean {
    private final boolean hasNextPage;
    private final List<FiatOrderItemBean> items;
    private final int pageNum;
    private final int pageSize;
    private final int totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FiatOrderItemBean$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatOrderListBean() {
        this((List) null, 0, 0, 0, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatOrderListBean copy$default(FiatOrderListBean fiatOrderListBean, List list, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = fiatOrderListBean.items;
        }
        if ((i4 & 2) != 0) {
            i = fiatOrderListBean.pageNum;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = fiatOrderListBean.pageSize;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = fiatOrderListBean.totalCount;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            z = fiatOrderListBean.hasNextPage;
        }
        return fiatOrderListBean.copy(list, i5, i6, i7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatOrderItemBean> component1() {
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
    public final FiatOrderListBean copy(@NotNull List<FiatOrderItemBean> list, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FiatOrderListBean(list, i, i2, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiatOrderListBean)) {
            return false;
        }
        FiatOrderListBean fiatOrderListBean = (FiatOrderListBean) obj;
        return Intrinsics.EZpvd(this.items, fiatOrderListBean.items) && this.pageNum == fiatOrderListBean.pageNum && this.pageSize == fiatOrderListBean.pageSize && this.totalCount == fiatOrderListBean.totalCount && this.hasNextPage == fiatOrderListBean.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatOrderItemBean> getItems() {
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
        return "FiatOrderListBean(items=" + this.items + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", totalCount=" + this.totalCount + ", hasNextPage=" + this.hasNextPage + ")";
    }

    public /* synthetic */ FiatOrderListBean(int i, List list, int i2, int i3, int i4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FiatOrderListBean fiatOrderListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(fiatOrderListBean.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], fiatOrderListBean.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fiatOrderListBean.pageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, fiatOrderListBean.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fiatOrderListBean.pageSize != 20) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, fiatOrderListBean.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fiatOrderListBean.totalCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, fiatOrderListBean.totalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fiatOrderListBean.hasNextPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, fiatOrderListBean.hasNextPage);
        }
    }

    public FiatOrderListBean(@NotNull List<FiatOrderItemBean> list, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.pageNum = i;
        this.pageSize = i2;
        this.totalCount = i3;
        this.hasNextPage = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r4v0 java.util.List))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:int:0x0014: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderItemBean>, int, int, int, boolean):void (m)] (LINE:16) call: com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderListBean.<init>(java.util.List, int, int, int, boolean):void type: THIS */
    public /* synthetic */ FiatOrderListBean(List list, int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? yDY.AhwBna() : list, (i4 & 2) != 0 ? 1 : i, (i4 & 4) != 0 ? 20 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FiatOrderListBean> serializer() {
            return FiatOrderListBean$$serializer.INSTANCE;
        }

        public final FiatOrderListBean EZpvd(@NotNull FiatOrderListResponseBean fiatOrderListResponseBean) {
            Intrinsics.checkNotNullParameter(fiatOrderListResponseBean, "");
            List<FiatOrderItem> items = fiatOrderListResponseBean.getItems();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(FiatOrderItemBean.Companion.OLrzqt((FiatOrderItem) it.next()));
            }
            return new FiatOrderListBean(arrayList, fiatOrderListResponseBean.getPageNum(), fiatOrderListResponseBean.getPageSize(), fiatOrderListResponseBean.getTotalCount(), fiatOrderListResponseBean.getHasNextPage());
        }
    }
}
