package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListRootResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanListRootBean implements Parcelable {
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final long nextPage;
    private final long pageNum;
    private final long pageSize;
    private final long pages;
    private final List<RecurringBuyPlanListBean> planList;
    private final long prePage;
    private final long size;
    private final long totalPlanSize;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyPlanListRootBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanListRootBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanListRootBean createFromParcel(Parcel parcel) {
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
                arrayList.add(RecurringBuyPlanListBean.CREATOR.createFromParcel(parcel));
            }
            return new RecurringBuyPlanListRootBean(z, z2, j, j2, j3, j4, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanListRootBean[] newArray(int i) {
            return new RecurringBuyPlanListRootBean[i];
        }
    }

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
    public final List<RecurringBuyPlanListBean> component7() {
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
    public final RecurringBuyPlanListRootBean copy(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlanListBean> list, long j5, long j6, long j7) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecurringBuyPlanListRootBean(z, z2, j, j2, j3, j4, list, j5, j6, j7);
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
        if (!(obj instanceof RecurringBuyPlanListRootBean)) {
            return false;
        }
        RecurringBuyPlanListRootBean recurringBuyPlanListRootBean = (RecurringBuyPlanListRootBean) obj;
        return this.hasNextPage == recurringBuyPlanListRootBean.hasNextPage && this.hasPreviousPage == recurringBuyPlanListRootBean.hasPreviousPage && this.nextPage == recurringBuyPlanListRootBean.nextPage && this.pageNum == recurringBuyPlanListRootBean.pageNum && this.pageSize == recurringBuyPlanListRootBean.pageSize && this.pages == recurringBuyPlanListRootBean.pages && Intrinsics.EZpvd(this.planList, recurringBuyPlanListRootBean.planList) && this.prePage == recurringBuyPlanListRootBean.prePage && this.size == recurringBuyPlanListRootBean.size && this.totalPlanSize == recurringBuyPlanListRootBean.totalPlanSize;
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
    public final List<RecurringBuyPlanListBean> getPlanList() {
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
        return "RecurringBuyPlanListRootBean(hasNextPage=" + this.hasNextPage + ", hasPreviousPage=" + this.hasPreviousPage + ", nextPage=" + this.nextPage + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", pages=" + this.pages + ", planList=" + this.planList + ", prePage=" + this.prePage + ", size=" + this.size + ", totalPlanSize=" + this.totalPlanSize + ")";
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
        List<RecurringBuyPlanListBean> list = this.planList;
        parcel.writeInt(list.size());
        Iterator<RecurringBuyPlanListBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.prePage);
        parcel.writeLong(this.size);
        parcel.writeLong(this.totalPlanSize);
    }

    public RecurringBuyPlanListRootBean(boolean z, boolean z2, long j, long j2, long j3, long j4, @NotNull List<RecurringBuyPlanListBean> list, long j5, long j6, long j7) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r20v0 boolean)
  (r21v0 boolean)
  (r22v0 long)
  (r24v0 long)
  (r26v0 long)
  (r28v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r30v0 java.util.List))
  (r31v0 long)
  (r33v0 long)
  (r35v0 long)
 A[MD:(boolean, boolean, long, long, long, long, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListBean>, long, long, long):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListRootBean.<init>(boolean, boolean, long, long, long, long, java.util.List, long, long, long):void type: THIS */
    public /* synthetic */ RecurringBuyPlanListRootBean(boolean z, boolean z2, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, j, j2, j3, j4, (i & 64) != 0 ? yDY.AhwBna() : list, j5, j6, j7);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListRootBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringBuyPlanListRootBean EZpvd(@NotNull RecurringBuyPlanListRootResponseBean recurringBuyPlanListRootResponseBean) {
            List listAhwBna;
            Intrinsics.checkNotNullParameter(recurringBuyPlanListRootResponseBean, "");
            boolean hasNextPage = recurringBuyPlanListRootResponseBean.getHasNextPage();
            boolean hasPreviousPage = recurringBuyPlanListRootResponseBean.getHasPreviousPage();
            long nextPage = recurringBuyPlanListRootResponseBean.getNextPage();
            long pageNum = recurringBuyPlanListRootResponseBean.getPageNum();
            long pageSize = recurringBuyPlanListRootResponseBean.getPageSize();
            long pages = recurringBuyPlanListRootResponseBean.getPages();
            List<RecurringBuyPlanListResponseBean> planList = recurringBuyPlanListRootResponseBean.getPlanList();
            if (planList != null) {
                RecurringBuyPlanListBean.ActionBar actionBar = RecurringBuyPlanListBean.Companion;
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(planList, 10));
                Iterator<T> it = planList.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(actionBar.copydefault((RecurringBuyPlanListResponseBean) it.next()));
                }
            } else {
                listAhwBna = yDY.AhwBna();
            }
            return new RecurringBuyPlanListRootBean(hasNextPage, hasPreviousPage, nextPage, pageNum, pageSize, pages, listAhwBna, recurringBuyPlanListRootResponseBean.getPrePage(), recurringBuyPlanListRootResponseBean.getSize(), recurringBuyPlanListRootResponseBean.getTotalPlanSize());
        }
    }
}
