package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Eip7702Status implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Eip7702Status> CREATOR = new Creator();
    private final List<Eip7702StatusItem> chainAddressInfoList;
    private int status;

    public static final class Creator implements Parcelable.Creator<Eip7702Status> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Eip7702Status createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Eip7702StatusItem.CREATOR.createFromParcel(parcel));
            }
            return new Eip7702Status(arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Eip7702Status[] newArray(int i) {
            return new Eip7702Status[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.Eip7702Status */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Eip7702Status copy$default(Eip7702Status eip7702Status, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = eip7702Status.chainAddressInfoList;
        }
        if ((i2 & 2) != 0) {
            i = eip7702Status.status;
        }
        return eip7702Status.copy(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Eip7702StatusItem> component1() {
        return this.chainAddressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Eip7702Status copy(@NotNull List<Eip7702StatusItem> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new Eip7702Status(list, i);
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
        if (!(obj instanceof Eip7702Status)) {
            return false;
        }
        Eip7702Status eip7702Status = (Eip7702Status) obj;
        return Intrinsics.EZpvd(this.chainAddressInfoList, eip7702Status.chainAddressInfoList) && this.status == eip7702Status.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Eip7702StatusItem> getChainAddressInfoList() {
        return this.chainAddressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainAddressInfoList.hashCode() * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Eip7702Status(chainAddressInfoList=" + this.chainAddressInfoList + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Eip7702StatusItem> list = this.chainAddressInfoList;
        parcel.writeInt(list.size());
        Iterator<Eip7702StatusItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.status);
    }

    public Eip7702Status(@NotNull List<Eip7702StatusItem> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainAddressInfoList = list;
        this.status = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.Eip7702StatusItem>, int):void (m)] (LINE:61) call: com.okinc.business.defi.biz.net.bean.Eip7702Status.<init>(java.util.List, int):void type: THIS */
    public /* synthetic */ Eip7702Status(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i);
    }
}
