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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyPlanListRootResponseBean {
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final long nextPage;
    private final long pageNum;
    private final long pageSize;
    private final long pages;
    private final List<RecurringBuyPlanListResponseBean> planList;
    private final long prePage;
    private final long size;
    private final long totalPlanSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(RecurringBuyPlanListResponseBean$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.totalPlanSize;
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
    public final List<RecurringBuyPlanListResponseBean> component7() {
        return this.planList;
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
    public final RecurringBuyPlanListRootResponseBean copy(boolean z, boolean z2, long j, long j2, long j3, long j4, List<RecurringBuyPlanListResponseBean> list, long j5, long j6, long j7) {
        return new RecurringBuyPlanListRootResponseBean(z, z2, j, j2, j3, j4, list, j5, j6, j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanListRootResponseBean)) {
            return false;
        }
        RecurringBuyPlanListRootResponseBean recurringBuyPlanListRootResponseBean = (RecurringBuyPlanListRootResponseBean) obj;
        return this.hasNextPage == recurringBuyPlanListRootResponseBean.hasNextPage && this.hasPreviousPage == recurringBuyPlanListRootResponseBean.hasPreviousPage && this.nextPage == recurringBuyPlanListRootResponseBean.nextPage && this.pageNum == recurringBuyPlanListRootResponseBean.pageNum && this.pageSize == recurringBuyPlanListRootResponseBean.pageSize && this.pages == recurringBuyPlanListRootResponseBean.pages && Intrinsics.EZpvd(this.planList, recurringBuyPlanListRootResponseBean.planList) && this.prePage == recurringBuyPlanListRootResponseBean.prePage && this.size == recurringBuyPlanListRootResponseBean.size && this.totalPlanSize == recurringBuyPlanListRootResponseBean.totalPlanSize;
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
    public final List<RecurringBuyPlanListResponseBean> getPlanList() {
        return this.planList;
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
    public final long getTotalPlanSize() {
        return this.totalPlanSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasNextPage);
        int iHashCode2 = Boolean.hashCode(this.hasPreviousPage);
        int iHashCode3 = Long.hashCode(this.nextPage);
        int iHashCode4 = Long.hashCode(this.pageNum);
        int iHashCode5 = Long.hashCode(this.pageSize);
        int iHashCode6 = Long.hashCode(this.pages);
        List<RecurringBuyPlanListResponseBean> list = this.planList;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.prePage)) * 31) + Long.hashCode(this.size)) * 31) + Long.hashCode(this.totalPlanSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanListRootResponseBean(hasNextPage=" + this.hasNextPage + ", hasPreviousPage=" + this.hasPreviousPage + ", nextPage=" + this.nextPage + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", pages=" + this.pages + ", planList=" + this.planList + ", prePage=" + this.prePage + ", size=" + this.size + ", totalPlanSize=" + this.totalPlanSize + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListRootResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanListRootResponseBean> serializer() {
            return RecurringBuyPlanListRootResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanListRootResponseBean(int i, boolean z, boolean z2, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, RecurringBuyPlanListRootResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.hasNextPage = z;
        this.hasPreviousPage = z2;
        this.nextPage = j;
        this.pageNum = j2;
        this.pageSize = j3;
        this.pages = j4;
        this.planList = list;
        this.prePage = j5;
        this.size = j6;
        this.totalPlanSize = j7;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanListRootResponseBean recurringBuyPlanListRootResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, recurringBuyPlanListRootResponseBean.hasNextPage);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, recurringBuyPlanListRootResponseBean.hasPreviousPage);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, recurringBuyPlanListRootResponseBean.nextPage);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, recurringBuyPlanListRootResponseBean.pageNum);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, recurringBuyPlanListRootResponseBean.pageSize);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, recurringBuyPlanListRootResponseBean.pages);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], recurringBuyPlanListRootResponseBean.planList);
        compositeEncoder.encodeLongElement(serialDescriptor, 7, recurringBuyPlanListRootResponseBean.prePage);
        compositeEncoder.encodeLongElement(serialDescriptor, 8, recurringBuyPlanListRootResponseBean.size);
        compositeEncoder.encodeLongElement(serialDescriptor, 9, recurringBuyPlanListRootResponseBean.totalPlanSize);
    }

    public RecurringBuyPlanListRootResponseBean(boolean z, boolean z2, long j, long j2, long j3, long j4, List<RecurringBuyPlanListResponseBean> list, long j5, long j6, long j7) {
        this.hasNextPage = z;
        this.hasPreviousPage = z2;
        this.nextPage = j;
        this.pageNum = j2;
        this.pageSize = j3;
        this.pages = j4;
        this.planList = list;
        this.prePage = j5;
        this.size = j6;
        this.totalPlanSize = j7;
    }
}
