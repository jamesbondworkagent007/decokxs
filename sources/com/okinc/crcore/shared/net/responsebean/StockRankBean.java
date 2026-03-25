package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.StockRankResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.StockTokenResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class StockRankBean implements Parcelable {
    private final List<StockTokenBean> futures;
    private final List<StockTokenBean> spot;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StockRankBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StockRankBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StockRankBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(StockTokenBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(StockTokenBean.CREATOR.createFromParcel(parcel));
            }
            return new StockRankBean(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StockRankBean[] newArray(int i) {
            return new StockRankBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StockRankBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.StockRankBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StockRankBean copy$default(StockRankBean stockRankBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stockRankBean.spot;
        }
        if ((i & 2) != 0) {
            list2 = stockRankBean.futures;
        }
        return stockRankBean.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenBean> component1() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenBean> component2() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StockRankBean copy(@NotNull List<StockTokenBean> list, @NotNull List<StockTokenBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new StockRankBean(list, list2);
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
        if (!(obj instanceof StockRankBean)) {
            return false;
        }
        StockRankBean stockRankBean = (StockRankBean) obj;
        return Intrinsics.EZpvd(this.spot, stockRankBean.spot) && Intrinsics.EZpvd(this.futures, stockRankBean.futures);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenBean> getFutures() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenBean> getSpot() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.spot.hashCode() * 31) + this.futures.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StockRankBean(spot=" + this.spot + ", futures=" + this.futures + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<StockTokenBean> list = this.spot;
        parcel.writeInt(list.size());
        Iterator<StockTokenBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<StockTokenBean> list2 = this.futures;
        parcel.writeInt(list2.size());
        Iterator<StockTokenBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public StockRankBean(@NotNull List<StockTokenBean> list, @NotNull List<StockTokenBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.spot = list;
        this.futures = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:47)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.StockTokenBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.StockTokenBean>):void (m)] (LINE:46) call: com.okinc.crcore.shared.net.responsebean.StockRankBean.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ StockRankBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.StockRankBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final StockRankBean KWHzl(@NotNull StockRankResponseBean stockRankResponseBean) {
            Intrinsics.checkNotNullParameter(stockRankResponseBean, "");
            List<StockTokenResponseBean> spot = stockRankResponseBean.getSpot();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(spot, 10));
            Iterator<T> it = spot.iterator();
            while (it.hasNext()) {
                arrayList.add(StockTokenBean.Companion.OLrzqt((StockTokenResponseBean) it.next()));
            }
            List<StockTokenResponseBean> futures = stockRankResponseBean.getFutures();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(futures, 10));
            Iterator<T> it2 = futures.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StockTokenBean.Companion.OLrzqt((StockTokenResponseBean) it2.next()));
            }
            return new StockRankBean(arrayList, arrayList2);
        }
    }
}
