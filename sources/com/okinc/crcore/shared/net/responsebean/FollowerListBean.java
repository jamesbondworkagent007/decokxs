package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.FollowerListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.FollowerResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class FollowerListBean implements Parcelable {
    private final List<FollowerBean> followers;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FollowerListBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FollowerListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowerListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FollowerBean.CREATOR.createFromParcel(parcel));
            }
            return new FollowerListBean(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowerListBean[] newArray(int i) {
            return new FollowerListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowerListBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.FollowerListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowerListBean copy$default(FollowerListBean followerListBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = followerListBean.followers;
        }
        return followerListBean.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FollowerBean> component1() {
        return this.followers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowerListBean copy(@NotNull List<FollowerBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FollowerListBean(list);
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
        return (obj instanceof FollowerListBean) && Intrinsics.EZpvd(this.followers, ((FollowerListBean) obj).followers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FollowerBean> getFollowers() {
        return this.followers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.followers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowerListBean(followers=" + this.followers + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FollowerBean> list = this.followers;
        parcel.writeInt(list.size());
        Iterator<FollowerBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public FollowerListBean(@NotNull List<FollowerBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.followers = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.FollowerBean>):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.FollowerListBean.<init>(java.util.List):void type: THIS */
    public /* synthetic */ FollowerListBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.FollowerListBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<FollowerListBean> copydefault(@NotNull List<FollowerListResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList<FollowerResponseBean> followers = ((FollowerListResponseBean) it.next()).getFollowers();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(followers, 10));
                Iterator<T> it2 = followers.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(FollowerBean.Companion.EZpvd((FollowerResponseBean) it2.next()));
                }
                arrayList.add(new FollowerListBean(arrayList2));
            }
            return arrayList;
        }
    }
}
