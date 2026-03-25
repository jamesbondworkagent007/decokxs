package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UTXONFTListResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXONFTListResp> CREATOR = new Creator();
    private List<UTXONFTResp> list;
    private Integer total;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<UTXONFTListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXONFTListResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(UTXONFTResp.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new UTXONFTListResp(numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXONFTListResp[] newArray(int i) {
            return new UTXONFTListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXONFTListResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.UTXONFTListResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UTXONFTListResp copy$default(UTXONFTListResp uTXONFTListResp, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = uTXONFTListResp.total;
        }
        if ((i & 2) != 0) {
            list = uTXONFTListResp.list;
        }
        return uTXONFTListResp.copy(num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXONFTResp> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXONFTListResp copy(Integer num, List<UTXONFTResp> list) {
        return new UTXONFTListResp(num, list);
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
        if (!(obj instanceof UTXONFTListResp)) {
            return false;
        }
        UTXONFTListResp uTXONFTListResp = (UTXONFTListResp) obj;
        return Intrinsics.EZpvd(this.total, uTXONFTListResp.total) && Intrinsics.EZpvd(this.list, uTXONFTListResp.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXONFTResp> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.total;
        int iHashCode = num == null ? 0 : num.hashCode();
        List<UTXONFTResp> list = this.list;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setList(List<UTXONFTResp> list) {
        this.list = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(Integer num) {
        this.total = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXONFTListResp(total=" + this.total + ", list=" + this.list + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.total;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<UTXONFTResp> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<UTXONFTResp> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public UTXONFTListResp(Integer num, List<UTXONFTResp> list) {
        this.total = num;
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.Integer, java.util.List<com.okinc.business.defi.api.bean.UTXONFTResp>):void (m)] (LINE:501) call: com.okinc.business.defi.api.bean.UTXONFTListResp.<init>(java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ UTXONFTListResp(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
