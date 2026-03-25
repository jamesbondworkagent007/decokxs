package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EscapeDetailDataResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeDetailDataResp> CREATOR = new Creator();
    private final boolean boundWeb3Wallet;
    private final List<EscapeChainBean> escapeChainList;
    private final String escapeTimestamp;
    private final int status;

    public static final class Creator implements Parcelable.Creator<EscapeDetailDataResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeDetailDataResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(EscapeChainBean.CREATOR.createFromParcel(parcel));
            }
            return new EscapeDetailDataResp(i, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeDetailDataResp[] newArray(int i) {
            return new EscapeDetailDataResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapeDetailDataResp copy$default(EscapeDetailDataResp escapeDetailDataResp, int i, List list, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = escapeDetailDataResp.status;
        }
        if ((i2 & 2) != 0) {
            list = escapeDetailDataResp.escapeChainList;
        }
        if ((i2 & 4) != 0) {
            str = escapeDetailDataResp.escapeTimestamp;
        }
        if ((i2 & 8) != 0) {
            z = escapeDetailDataResp.boundWeb3Wallet;
        }
        return escapeDetailDataResp.copy(i, list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeChainBean> component2() {
        return this.escapeChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.escapeTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.boundWeb3Wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeDetailDataResp copy(int i, @NotNull List<EscapeChainBean> list, String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new EscapeDetailDataResp(i, list, str, z);
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
        if (!(obj instanceof EscapeDetailDataResp)) {
            return false;
        }
        EscapeDetailDataResp escapeDetailDataResp = (EscapeDetailDataResp) obj;
        return this.status == escapeDetailDataResp.status && Intrinsics.EZpvd(this.escapeChainList, escapeDetailDataResp.escapeChainList) && Intrinsics.EZpvd((Object) this.escapeTimestamp, (Object) escapeDetailDataResp.escapeTimestamp) && this.boundWeb3Wallet == escapeDetailDataResp.boundWeb3Wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBoundWeb3Wallet() {
        return this.boundWeb3Wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeChainBean> getEscapeChainList() {
        return this.escapeChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeTimestamp() {
        return this.escapeTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status);
        int iHashCode2 = this.escapeChainList.hashCode();
        String str = this.escapeTimestamp;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.boundWeb3Wallet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeDetailDataResp(status=" + this.status + ", escapeChainList=" + this.escapeChainList + ", escapeTimestamp=" + this.escapeTimestamp + ", boundWeb3Wallet=" + this.boundWeb3Wallet + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.status);
        List<EscapeChainBean> list = this.escapeChainList;
        parcel.writeInt(list.size());
        Iterator<EscapeChainBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.escapeTimestamp);
        parcel.writeInt(this.boundWeb3Wallet ? 1 : 0);
    }

    public EscapeDetailDataResp(int i, @NotNull List<EscapeChainBean> list, String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.status = i;
        this.escapeChainList = list;
        this.escapeTimestamp = str;
        this.boundWeb3Wallet = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 boolean)
 A[MD:(int, java.util.List<com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeChainBean>, java.lang.String, boolean):void (m)] (LINE:201) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp.<init>(int, java.util.List, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ EscapeDetailDataResp(int i, List list, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : str, z);
    }
}
