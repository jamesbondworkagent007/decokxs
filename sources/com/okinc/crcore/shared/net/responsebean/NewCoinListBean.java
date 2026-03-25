package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.NewCoinListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.NewCoinRankResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.WaitOnlineRankResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NewCoinListBean implements Parcelable {
    private final List<NewCoinRank> online;
    private final List<WaitOnlineRank> waitOnlineNew;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewCoinListBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewCoinListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCoinListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(NewCoinRank.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(WaitOnlineRank.CREATOR.createFromParcel(parcel));
            }
            return new NewCoinListBean(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCoinListBean[] newArray(int i) {
            return new NewCoinListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinListBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.NewCoinListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewCoinListBean copy$default(NewCoinListBean newCoinListBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newCoinListBean.online;
        }
        if ((i & 2) != 0) {
            list2 = newCoinListBean.waitOnlineNew;
        }
        return newCoinListBean.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewCoinRank> component1() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WaitOnlineRank> component2() {
        return this.waitOnlineNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinListBean copy(@NotNull List<NewCoinRank> list, @NotNull List<WaitOnlineRank> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new NewCoinListBean(list, list2);
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
        if (!(obj instanceof NewCoinListBean)) {
            return false;
        }
        NewCoinListBean newCoinListBean = (NewCoinListBean) obj;
        return Intrinsics.EZpvd(this.online, newCoinListBean.online) && Intrinsics.EZpvd(this.waitOnlineNew, newCoinListBean.waitOnlineNew);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewCoinRank> getOnline() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WaitOnlineRank> getWaitOnlineNew() {
        return this.waitOnlineNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.online.hashCode() * 31) + this.waitOnlineNew.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinListBean(online=" + this.online + ", waitOnlineNew=" + this.waitOnlineNew + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<NewCoinRank> list = this.online;
        parcel.writeInt(list.size());
        Iterator<NewCoinRank> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<WaitOnlineRank> list2 = this.waitOnlineNew;
        parcel.writeInt(list2.size());
        Iterator<WaitOnlineRank> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public NewCoinListBean(@NotNull List<NewCoinRank> list, @NotNull List<WaitOnlineRank> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.online = list;
        this.waitOnlineNew = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.NewCoinRank>, java.util.List<com.okinc.crcore.shared.net.responsebean.WaitOnlineRank>):void (m)] (LINE:15) call: com.okinc.crcore.shared.net.responsebean.NewCoinListBean.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ NewCoinListBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.NewCoinListBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<NewCoinListBean> copydefault(@NotNull List<NewCoinListResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (NewCoinListResponseBean newCoinListResponseBean : list) {
                ArrayList<NewCoinRankResponseBean> online = newCoinListResponseBean.getOnline();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(online, 10));
                Iterator<T> it = online.iterator();
                while (it.hasNext()) {
                    arrayList2.add(NewCoinRank.Companion.EZpvd((NewCoinRankResponseBean) it.next()));
                }
                ArrayList<WaitOnlineRankResponseBean> waitOnlineNew = newCoinListResponseBean.getWaitOnlineNew();
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(waitOnlineNew, 10));
                Iterator<T> it2 = waitOnlineNew.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(WaitOnlineRank.Companion.KWHzl((WaitOnlineRankResponseBean) it2.next()));
                }
                arrayList.add(new NewCoinListBean(arrayList2, arrayList3));
            }
            return arrayList;
        }
    }
}
