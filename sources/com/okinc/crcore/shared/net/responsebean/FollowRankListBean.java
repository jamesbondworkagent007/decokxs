package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.FollowRankListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.FollowRankResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class FollowRankListBean implements Parcelable {
    private final List<FollowRankBean> ranks;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FollowRankListBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FollowRankListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowRankListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FollowRankBean.CREATOR.createFromParcel(parcel));
            }
            return new FollowRankListBean(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowRankListBean[] newArray(int i) {
            return new FollowRankListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowRankListBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.FollowRankListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowRankListBean copy$default(FollowRankListBean followRankListBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = followRankListBean.ranks;
        }
        return followRankListBean.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FollowRankBean> component1() {
        return this.ranks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowRankListBean copy(@NotNull List<FollowRankBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FollowRankListBean(list);
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
        return (obj instanceof FollowRankListBean) && Intrinsics.EZpvd(this.ranks, ((FollowRankListBean) obj).ranks);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FollowRankBean> getRanks() {
        return this.ranks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.ranks.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowRankListBean(ranks=" + this.ranks + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FollowRankBean> list = this.ranks;
        parcel.writeInt(list.size());
        Iterator<FollowRankBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public FollowRankListBean(@NotNull List<FollowRankBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ranks = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.FollowRankBean>):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.FollowRankListBean.<init>(java.util.List):void type: THIS */
    public /* synthetic */ FollowRankListBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.FollowRankListBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final List<FollowRankListBean> OLrzqt(@NotNull List<FollowRankListResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList<FollowRankResponseBean> ranks = ((FollowRankListResponseBean) it.next()).getRanks();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(ranks, 10));
                Iterator<T> it2 = ranks.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(FollowRankBean.Companion.OLrzqt((FollowRankResponseBean) it2.next()));
                }
                arrayList.add(new FollowRankListBean(arrayList2));
            }
            return arrayList;
        }
    }
}
