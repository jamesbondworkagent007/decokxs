package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeAnd7702WalletStatusResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeAnd7702WalletStatusResp> CREATOR = new Creator();
    private final List<TeeAndEip7702StatusItem> statusList;

    public static final class Creator implements Parcelable.Creator<TeeAnd7702WalletStatusResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAnd7702WalletStatusResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TeeAndEip7702StatusItem.CREATOR.createFromParcel(parcel));
            }
            return new TeeAnd7702WalletStatusResp(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAnd7702WalletStatusResp[] newArray(int i) {
            return new TeeAnd7702WalletStatusResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeeAnd7702WalletStatusResp copy$default(TeeAnd7702WalletStatusResp teeAnd7702WalletStatusResp, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teeAnd7702WalletStatusResp.statusList;
        }
        return teeAnd7702WalletStatusResp.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeAndEip7702StatusItem> component1() {
        return this.statusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeAnd7702WalletStatusResp copy(@NotNull List<TeeAndEip7702StatusItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TeeAnd7702WalletStatusResp(list);
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
        return (obj instanceof TeeAnd7702WalletStatusResp) && Intrinsics.EZpvd(this.statusList, ((TeeAnd7702WalletStatusResp) obj).statusList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeAndEip7702StatusItem> getStatusList() {
        return this.statusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.statusList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeAnd7702WalletStatusResp(statusList=" + this.statusList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TeeAndEip7702StatusItem> list = this.statusList;
        parcel.writeInt(list.size());
        Iterator<TeeAndEip7702StatusItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public TeeAnd7702WalletStatusResp(@NotNull List<TeeAndEip7702StatusItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.statusList = list;
    }
}
