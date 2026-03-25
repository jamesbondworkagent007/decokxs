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
public final class TeeAnd7702WalletStatusReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeAnd7702WalletStatusReq> CREATOR = new Creator();
    private final List<TeeAndEip7702Item> accountList;
    private final boolean eip7702Status;

    public static final class Creator implements Parcelable.Creator<TeeAnd7702WalletStatusReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAnd7702WalletStatusReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TeeAndEip7702Item.CREATOR.createFromParcel(parcel));
            }
            return new TeeAnd7702WalletStatusReq(z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAnd7702WalletStatusReq[] newArray(int i) {
            return new TeeAnd7702WalletStatusReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeAnd7702WalletStatusReq() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeeAnd7702WalletStatusReq copy$default(TeeAnd7702WalletStatusReq teeAnd7702WalletStatusReq, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = teeAnd7702WalletStatusReq.eip7702Status;
        }
        if ((i & 2) != 0) {
            list = teeAnd7702WalletStatusReq.accountList;
        }
        return teeAnd7702WalletStatusReq.copy(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.eip7702Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeAndEip7702Item> component2() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeAnd7702WalletStatusReq copy(boolean z, @NotNull List<TeeAndEip7702Item> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TeeAnd7702WalletStatusReq(z, list);
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
        if (!(obj instanceof TeeAnd7702WalletStatusReq)) {
            return false;
        }
        TeeAnd7702WalletStatusReq teeAnd7702WalletStatusReq = (TeeAnd7702WalletStatusReq) obj;
        return this.eip7702Status == teeAnd7702WalletStatusReq.eip7702Status && Intrinsics.EZpvd(this.accountList, teeAnd7702WalletStatusReq.accountList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeAndEip7702Item> getAccountList() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEip7702Status() {
        return this.eip7702Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.eip7702Status) * 31) + this.accountList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeAnd7702WalletStatusReq(eip7702Status=" + this.eip7702Status + ", accountList=" + this.accountList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.eip7702Status ? 1 : 0);
        List<TeeAndEip7702Item> list = this.accountList;
        parcel.writeInt(list.size());
        Iterator<TeeAndEip7702Item> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public TeeAnd7702WalletStatusReq(boolean z, @NotNull List<TeeAndEip7702Item> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.eip7702Status = z;
        this.accountList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r2v0 java.util.List))
 A[MD:(boolean, java.util.List<com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item>):void (m)] (LINE:10) call: com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusReq.<init>(boolean, java.util.List):void type: THIS */
    public /* synthetic */ TeeAnd7702WalletStatusReq(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
