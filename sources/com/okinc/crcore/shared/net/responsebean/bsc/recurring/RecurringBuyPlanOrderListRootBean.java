package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanOrderListRootResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlacedOrderBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanOrderListRootBean implements Parcelable {
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final long nextPage;
    private final long pageNum;
    private final long pageSize;
    private final long pages;
    private final List<RecurringBuyPlacedOrderBean> placedOrderList;
    private final long prePage;
    private final long size;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyPlanOrderListRootBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanOrderListRootBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanOrderListRootBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RecurringBuyPlacedOrderBean.CREATOR.createFromParcel(parcel));
            }
            return new RecurringBuyPlanOrderListRootBean(z, z2, j, j2, j3, j4, arrayList, parcel.readLong(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanOrderListRootBean[] newArray(int i) {
            return new RecurringBuyPlanOrderListRootBean[i];
        }
    }

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
    public final List<RecurringBuyPlacedOrderBean> component7() {
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
    public final RecurringBuyPlanOrderListRootBean copy(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlacedOrderBean> list, long j5, long j6) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecurringBuyPlanOrderListRootBean(z, z2, j, j2, j3, j4, list, j5, j6);
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
        if (!(obj instanceof RecurringBuyPlanOrderListRootBean)) {
            return false;
        }
        RecurringBuyPlanOrderListRootBean recurringBuyPlanOrderListRootBean = (RecurringBuyPlanOrderListRootBean) obj;
        return this.hasNextPage == recurringBuyPlanOrderListRootBean.hasNextPage && this.hasPreviousPage == recurringBuyPlanOrderListRootBean.hasPreviousPage && this.nextPage == recurringBuyPlanOrderListRootBean.nextPage && this.pageNum == recurringBuyPlanOrderListRootBean.pageNum && this.pageSize == recurringBuyPlanOrderListRootBean.pageSize && this.pages == recurringBuyPlanOrderListRootBean.pages && Intrinsics.EZpvd(this.placedOrderList, recurringBuyPlanOrderListRootBean.placedOrderList) && this.prePage == recurringBuyPlanOrderListRootBean.prePage && this.size == recurringBuyPlanOrderListRootBean.size;
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
    public final List<RecurringBuyPlacedOrderBean> getPlacedOrderList() {
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
        return "RecurringBuyPlanOrderListRootBean(hasNextPage=" + this.hasNextPage + ", hasPreviousPage=" + this.hasPreviousPage + ", nextPage=" + this.nextPage + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", pages=" + this.pages + ", placedOrderList=" + this.placedOrderList + ", prePage=" + this.prePage + ", size=" + this.size + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.hasNextPage ? 1 : 0);
        parcel.writeInt(this.hasPreviousPage ? 1 : 0);
        parcel.writeLong(this.nextPage);
        parcel.writeLong(this.pageNum);
        parcel.writeLong(this.pageSize);
        parcel.writeLong(this.pages);
        List<RecurringBuyPlacedOrderBean> list = this.placedOrderList;
        parcel.writeInt(list.size());
        Iterator<RecurringBuyPlacedOrderBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.prePage);
        parcel.writeLong(this.size);
    }

    public RecurringBuyPlanOrderListRootBean(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlacedOrderBean> list, long j5, long j6) {
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
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r28v0 java.util.List))
  (r29v0 long)
  (r31v0 long)
 A[MD:(boolean, boolean, long, long, long, long, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlacedOrderBean>, long, long):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanOrderListRootBean.<init>(boolean, boolean, long, long, long, long, java.util.List, long, long):void type: THIS */
    public /* synthetic */ RecurringBuyPlanOrderListRootBean(boolean z, boolean z2, long j, long j2, long j3, long j4, List list, long j5, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, j, j2, j3, j4, (i & 64) != 0 ? yDY.AhwBna() : list, j5, j6);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanOrderListRootBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RecurringBuyPlanOrderListRootBean OLrzqt(@NotNull RecurringBuyPlanOrderListRootResponseBean recurringBuyPlanOrderListRootResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyPlanOrderListRootResponseBean, "");
            boolean hasNextPage = recurringBuyPlanOrderListRootResponseBean.getHasNextPage();
            boolean hasPreviousPage = recurringBuyPlanOrderListRootResponseBean.getHasPreviousPage();
            long nextPage = recurringBuyPlanOrderListRootResponseBean.getNextPage();
            long pageNum = recurringBuyPlanOrderListRootResponseBean.getPageNum();
            long pageSize = recurringBuyPlanOrderListRootResponseBean.getPageSize();
            long pages = recurringBuyPlanOrderListRootResponseBean.getPages();
            List<RecurringBuyPlacedOrderResponseBean> placedOrderList = recurringBuyPlanOrderListRootResponseBean.getPlacedOrderList();
            RecurringBuyPlacedOrderBean.TaskDescription taskDescription = RecurringBuyPlacedOrderBean.Companion;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(placedOrderList, 10));
            Iterator<T> it = placedOrderList.iterator();
            while (it.hasNext()) {
                arrayList.add(taskDescription.KWHzl((RecurringBuyPlacedOrderResponseBean) it.next()));
            }
            return new RecurringBuyPlanOrderListRootBean(hasNextPage, hasPreviousPage, nextPage, pageNum, pageSize, pages, arrayList, recurringBuyPlanOrderListRootResponseBean.getPrePage(), recurringBuyPlanOrderListRootResponseBean.getSize());
        }
    }
}
