package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class InfoListNew implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InfoListNew> CREATOR = new Creator();
    private final List<BannerInfoNew> allBannerList;
    private final int maxShowBannerNum;

    public static final class Creator implements Parcelable.Creator<InfoListNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoListNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(BannerInfoNew.CREATOR.createFromParcel(parcel));
            }
            return new InfoListNew(i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoListNew[] newArray(int i) {
            return new InfoListNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.InfoListNew */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoListNew copy$default(InfoListNew infoListNew, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = infoListNew.maxShowBannerNum;
        }
        if ((i2 & 2) != 0) {
            list = infoListNew.allBannerList;
        }
        return infoListNew.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.maxShowBannerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerInfoNew> component2() {
        return this.allBannerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InfoListNew copy(int i, @NotNull List<BannerInfoNew> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InfoListNew(i, list);
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
        if (!(obj instanceof InfoListNew)) {
            return false;
        }
        InfoListNew infoListNew = (InfoListNew) obj;
        return this.maxShowBannerNum == infoListNew.maxShowBannerNum && Intrinsics.EZpvd(this.allBannerList, infoListNew.allBannerList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerInfoNew> getAllBannerList() {
        return this.allBannerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxShowBannerNum() {
        return this.maxShowBannerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.maxShowBannerNum) * 31) + this.allBannerList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InfoListNew(maxShowBannerNum=" + this.maxShowBannerNum + ", allBannerList=" + this.allBannerList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.maxShowBannerNum);
        List<BannerInfoNew> list = this.allBannerList;
        parcel.writeInt(list.size());
        Iterator<BannerInfoNew> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public InfoListNew(int i, @NotNull List<BannerInfoNew> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.maxShowBannerNum = i;
        this.allBannerList = list;
    }
}
