package com.okinc.business.market.common.marketconfig.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class BannerConfig implements Parcelable {
    public static final Parcelable.Creator<BannerConfig> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final List<BannerTokenInfo> OLrzqt;
    public final List<String> copydefault;

    public static final class Creator implements Parcelable.Creator<BannerConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(BannerTokenInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BannerConfig(string, string2, string3, string4, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerConfig[] newArray(int i) {
            return new BannerConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.common.marketconfig.domain.BannerConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerConfig copy$default(BannerConfig bannerConfig, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerConfig.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = bannerConfig.AYXKKw;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bannerConfig.AEQbTJ;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bannerConfig.EZpvd;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = bannerConfig.copydefault;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = bannerConfig.OLrzqt;
        }
        return bannerConfig.OLrzqt(str, str5, str6, str7, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerTokenInfo> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerConfig OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<String> list, List<BannerTokenInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BannerConfig(str, str2, str3, str4, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof BannerConfig)) {
            return false;
        }
        BannerConfig bannerConfig = (BannerConfig) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) bannerConfig.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) bannerConfig.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bannerConfig.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) bannerConfig.EZpvd) && Intrinsics.EZpvd(this.copydefault, bannerConfig.copydefault) && Intrinsics.EZpvd(this.OLrzqt, bannerConfig.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        List<String> list = this.copydefault;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<BannerTokenInfo> list2 = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerConfig(id=" + this.KWHzl + ", url=" + this.AYXKKw + ", title=" + this.AEQbTJ + ", description=" + this.EZpvd + ", chainList=" + this.copydefault + ", tokenList=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeStringList(this.copydefault);
        List<BannerTokenInfo> list = this.OLrzqt;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<BannerTokenInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public BannerConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<String> list, List<BannerTokenInfo> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = str;
        this.AYXKKw = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
        this.copydefault = list;
        this.OLrzqt = list2;
    }
}
