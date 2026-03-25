package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DeriveInfoList implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeriveInfoList> CREATOR = new Creator();
    private final List<DeriveItem> deriveInfoList;

    public static final class Creator implements Parcelable.Creator<DeriveInfoList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeriveInfoList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DeriveItem.CREATOR.createFromParcel(parcel));
            }
            return new DeriveInfoList(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeriveInfoList[] newArray(int i) {
            return new DeriveInfoList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.DeriveInfoList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeriveInfoList copy$default(DeriveInfoList deriveInfoList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deriveInfoList.deriveInfoList;
        }
        return deriveInfoList.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeriveItem> component1() {
        return this.deriveInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeriveInfoList copy(@NotNull List<DeriveItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DeriveInfoList(list);
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
        return (obj instanceof DeriveInfoList) && Intrinsics.EZpvd(this.deriveInfoList, ((DeriveInfoList) obj).deriveInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeriveItem> getDeriveInfoList() {
        return this.deriveInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.deriveInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeriveInfoList(deriveInfoList=" + this.deriveInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DeriveItem> list = this.deriveInfoList;
        parcel.writeInt(list.size());
        Iterator<DeriveItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public DeriveInfoList(@NotNull List<DeriveItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.deriveInfoList = list;
    }
}
