package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleEip7702Status implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleEip7702Status> CREATOR = new Creator();
    private final List<ChainStatusItem> chainAddressInfoList;

    public static final class Creator implements Parcelable.Creator<SingleEip7702Status> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleEip7702Status createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChainStatusItem.CREATOR.createFromParcel(parcel));
            }
            return new SingleEip7702Status(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleEip7702Status[] newArray(int i) {
            return new SingleEip7702Status[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SingleEip7702Status() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.SingleEip7702Status */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleEip7702Status copy$default(SingleEip7702Status singleEip7702Status, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = singleEip7702Status.chainAddressInfoList;
        }
        return singleEip7702Status.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainStatusItem> component1() {
        return this.chainAddressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleEip7702Status copy(@NotNull List<ChainStatusItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SingleEip7702Status(list);
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
        return (obj instanceof SingleEip7702Status) && Intrinsics.EZpvd(this.chainAddressInfoList, ((SingleEip7702Status) obj).chainAddressInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainStatusItem> getChainAddressInfoList() {
        return this.chainAddressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chainAddressInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleEip7702Status(chainAddressInfoList=" + this.chainAddressInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ChainStatusItem> list = this.chainAddressInfoList;
        parcel.writeInt(list.size());
        Iterator<ChainStatusItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public SingleEip7702Status(@NotNull List<ChainStatusItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainAddressInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:102)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.ChainStatusItem>):void (m)] (LINE:101) call: com.okinc.business.defi.biz.net.bean.SingleEip7702Status.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SingleEip7702Status(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
