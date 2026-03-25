package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecommendBulletMPData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendBulletMPData> CREATOR = new Creator();
    private List<RecommendBulletItem> bulletChatInfo;
    private final List<RecommendInvestItem> latestInvestors;

    public static final class Creator implements Parcelable.Creator<RecommendBulletMPData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendBulletMPData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RecommendBulletItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(RecommendInvestItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new RecommendBulletMPData(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendBulletMPData[] newArray(int i) {
            return new RecommendBulletMPData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendBulletMPData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.RecommendBulletMPData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendBulletMPData copy$default(RecommendBulletMPData recommendBulletMPData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendBulletMPData.bulletChatInfo;
        }
        if ((i & 2) != 0) {
            list2 = recommendBulletMPData.latestInvestors;
        }
        return recommendBulletMPData.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendBulletItem> component1() {
        return this.bulletChatInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendInvestItem> component2() {
        return this.latestInvestors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendBulletMPData copy(List<RecommendBulletItem> list, List<RecommendInvestItem> list2) {
        return new RecommendBulletMPData(list, list2);
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
        if (!(obj instanceof RecommendBulletMPData)) {
            return false;
        }
        RecommendBulletMPData recommendBulletMPData = (RecommendBulletMPData) obj;
        return Intrinsics.EZpvd(this.bulletChatInfo, recommendBulletMPData.bulletChatInfo) && Intrinsics.EZpvd(this.latestInvestors, recommendBulletMPData.latestInvestors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendBulletItem> getBulletChatInfo() {
        return this.bulletChatInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendInvestItem> getLatestInvestors() {
        return this.latestInvestors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<RecommendBulletItem> list = this.bulletChatInfo;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<RecommendInvestItem> list2 = this.latestInvestors;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBulletChatInfo(List<RecommendBulletItem> list) {
        this.bulletChatInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendBulletMPData(bulletChatInfo=" + this.bulletChatInfo + ", latestInvestors=" + this.latestInvestors + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RecommendBulletItem> list = this.bulletChatInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RecommendBulletItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<RecommendInvestItem> list2 = this.latestInvestors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<RecommendInvestItem> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public RecommendBulletMPData(List<RecommendBulletItem> list, List<RecommendInvestItem> list2) {
        this.bulletChatInfo = list;
        this.latestInvestors = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1485)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1486)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.RecommendBulletItem>, java.util.List<com.okinc.unify_trade.biz.RecommendInvestItem>):void (m)] (LINE:1484) call: com.okinc.unify_trade.biz.RecommendBulletMPData.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ RecommendBulletMPData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
