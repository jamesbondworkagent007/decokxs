package com.okinc.okpaymentapi.data.remote.model.management;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class RecurringBuyPlanListRoot {
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final long nextPage;
    private final long pageNum;
    private final long pageSize;
    private final long pages;
    private final List<RecurringBuyPlanList> planList;
    private final long prePage;
    private final long size;
    private final long totalPlanSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(RecurringBuyPlanList$$serializer.INSTANCE), null, null, null};

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
    public final List<RecurringBuyPlanList> component7() {
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
    public final RecurringBuyPlanListRoot copy(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlanList> list, long j5, long j6, long j7) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecurringBuyPlanListRoot(z, z2, j, j2, j3, j4, list, j5, j6, j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanListRoot)) {
            return false;
        }
        RecurringBuyPlanListRoot recurringBuyPlanListRoot = (RecurringBuyPlanListRoot) obj;
        return this.hasNextPage == recurringBuyPlanListRoot.hasNextPage && this.hasPreviousPage == recurringBuyPlanListRoot.hasPreviousPage && this.nextPage == recurringBuyPlanListRoot.nextPage && this.pageNum == recurringBuyPlanListRoot.pageNum && this.pageSize == recurringBuyPlanListRoot.pageSize && this.pages == recurringBuyPlanListRoot.pages && Intrinsics.EZpvd(this.planList, recurringBuyPlanListRoot.planList) && this.prePage == recurringBuyPlanListRoot.prePage && this.size == recurringBuyPlanListRoot.size && this.totalPlanSize == recurringBuyPlanListRoot.totalPlanSize;
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
    public final List<RecurringBuyPlanList> getPlanList() {
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
        return (((((((((((((((((Boolean.hashCode(this.hasNextPage) * 31) + Boolean.hashCode(this.hasPreviousPage)) * 31) + Long.hashCode(this.nextPage)) * 31) + Long.hashCode(this.pageNum)) * 31) + Long.hashCode(this.pageSize)) * 31) + Long.hashCode(this.pages)) * 31) + this.planList.hashCode()) * 31) + Long.hashCode(this.prePage)) * 31) + Long.hashCode(this.size)) * 31) + Long.hashCode(this.totalPlanSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanListRoot(hasNextPage=" + this.hasNextPage + ", hasPreviousPage=" + this.hasPreviousPage + ", nextPage=" + this.nextPage + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", pages=" + this.pages + ", planList=" + this.planList + ", prePage=" + this.prePage + ", size=" + this.size + ", totalPlanSize=" + this.totalPlanSize + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.RecurringBuyPlanListRoot.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanListRoot> serializer() {
            return RecurringBuyPlanListRoot$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanListRoot(int i, boolean z, boolean z2, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, RecurringBuyPlanListRoot$$serializer.INSTANCE.getDescriptor());
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

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(RecurringBuyPlanListRoot recurringBuyPlanListRoot, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, recurringBuyPlanListRoot.hasNextPage);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, recurringBuyPlanListRoot.hasPreviousPage);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, recurringBuyPlanListRoot.nextPage);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, recurringBuyPlanListRoot.pageNum);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, recurringBuyPlanListRoot.pageSize);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, recurringBuyPlanListRoot.pages);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], recurringBuyPlanListRoot.planList);
        compositeEncoder.encodeLongElement(serialDescriptor, 7, recurringBuyPlanListRoot.prePage);
        compositeEncoder.encodeLongElement(serialDescriptor, 8, recurringBuyPlanListRoot.size);
        compositeEncoder.encodeLongElement(serialDescriptor, 9, recurringBuyPlanListRoot.totalPlanSize);
    }

    public RecurringBuyPlanListRoot(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlanList> list, long j5, long j6, long j7) {
        Intrinsics.checkNotNullParameter(list, "");
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
