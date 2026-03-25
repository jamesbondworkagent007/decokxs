package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyPlanOrderListRootResponseBean {
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final long nextPage;
    private final long pageNum;
    private final long pageSize;
    private final long pages;
    private final List<RecurringBuyPlacedOrderResponseBean> placedOrderList;
    private final long prePage;
    private final long size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(RecurringBuyPlacedOrderResponseBean$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasPreviousPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.nextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.pages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyPlacedOrderResponseBean> component7() {
        return this.placedOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.prePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanOrderListRootResponseBean copy(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlacedOrderResponseBean> list, long j5, long j6) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecurringBuyPlanOrderListRootResponseBean(z, z2, j, j2, j3, j4, list, j5, j6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanOrderListRootResponseBean)) {
            return false;
        }
        RecurringBuyPlanOrderListRootResponseBean recurringBuyPlanOrderListRootResponseBean = (RecurringBuyPlanOrderListRootResponseBean) obj;
        return this.hasNextPage == recurringBuyPlanOrderListRootResponseBean.hasNextPage && this.hasPreviousPage == recurringBuyPlanOrderListRootResponseBean.hasPreviousPage && this.nextPage == recurringBuyPlanOrderListRootResponseBean.nextPage && this.pageNum == recurringBuyPlanOrderListRootResponseBean.pageNum && this.pageSize == recurringBuyPlanOrderListRootResponseBean.pageSize && this.pages == recurringBuyPlanOrderListRootResponseBean.pages && Intrinsics.EZpvd(this.placedOrderList, recurringBuyPlanOrderListRootResponseBean.placedOrderList) && this.prePage == recurringBuyPlanOrderListRootResponseBean.prePage && this.size == recurringBuyPlanOrderListRootResponseBean.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getNextPage() {
        return this.nextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPages() {
        return this.pages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyPlacedOrderResponseBean> getPlacedOrderList() {
        return this.placedOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPrePage() {
        return this.prePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.hasNextPage) * 31) + Boolean.hashCode(this.hasPreviousPage)) * 31) + Long.hashCode(this.nextPage)) * 31) + Long.hashCode(this.pageNum)) * 31) + Long.hashCode(this.pageSize)) * 31) + Long.hashCode(this.pages)) * 31) + this.placedOrderList.hashCode()) * 31) + Long.hashCode(this.prePage)) * 31) + Long.hashCode(this.size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanOrderListRootResponseBean(hasNextPage=" + this.hasNextPage + ", hasPreviousPage=" + this.hasPreviousPage + ", nextPage=" + this.nextPage + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", pages=" + this.pages + ", placedOrderList=" + this.placedOrderList + ", prePage=" + this.prePage + ", size=" + this.size + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanOrderListRootResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanOrderListRootResponseBean> serializer() {
            return RecurringBuyPlanOrderListRootResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanOrderListRootResponseBean(int i, boolean z, boolean z2, long j, long j2, long j3, long j4, List list, long j5, long j6, SerializationConstructorMarker serializationConstructorMarker) {
        if (447 != (i & 447)) {
            PluginExceptionsKt.throwMissingFieldException(i, 447, RecurringBuyPlanOrderListRootResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.hasNextPage = z;
        this.hasPreviousPage = z2;
        this.nextPage = j;
        this.pageNum = j2;
        this.pageSize = j3;
        this.pages = j4;
        this.placedOrderList = (i & 64) == 0 ? yDY.AhwBna() : list;
        this.prePage = j5;
        this.size = j6;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanOrderListRootResponseBean recurringBuyPlanOrderListRootResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, recurringBuyPlanOrderListRootResponseBean.hasNextPage);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, recurringBuyPlanOrderListRootResponseBean.hasPreviousPage);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, recurringBuyPlanOrderListRootResponseBean.nextPage);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, recurringBuyPlanOrderListRootResponseBean.pageNum);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, recurringBuyPlanOrderListRootResponseBean.pageSize);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, recurringBuyPlanOrderListRootResponseBean.pages);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(recurringBuyPlanOrderListRootResponseBean.placedOrderList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], recurringBuyPlanOrderListRootResponseBean.placedOrderList);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 7, recurringBuyPlanOrderListRootResponseBean.prePage);
        compositeEncoder.encodeLongElement(serialDescriptor, 8, recurringBuyPlanOrderListRootResponseBean.size);
    }

    public RecurringBuyPlanOrderListRootResponseBean(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlacedOrderResponseBean> list, long j5, long j6) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hasNextPage = z;
        this.hasPreviousPage = z2;
        this.nextPage = j;
        this.pageNum = j2;
        this.pageSize = j3;
        this.pages = j4;
        this.placedOrderList = list;
        this.prePage = j5;
        this.size = j6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r18v0 boolean)
  (r19v0 boolean)
  (r20v0 long)
  (r22v0 long)
  (r24v0 long)
  (r26v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r28v0 java.util.List))
  (r29v0 long)
  (r31v0 long)
 A[MD:(boolean, boolean, long, long, long, long, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean>, long, long):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanOrderListRootResponseBean.<init>(boolean, boolean, long, long, long, long, java.util.List, long, long):void type: THIS */
    public /* synthetic */ RecurringBuyPlanOrderListRootResponseBean(boolean z, boolean z2, long j, long j2, long j3, long j4, List list, long j5, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, j, j2, j3, j4, (i & 64) != 0 ? yDY.AhwBna() : list, j5, j6);
    }
}
