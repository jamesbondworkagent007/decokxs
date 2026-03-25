package com.okinc.business.market.features.tag.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagStaticDataParams implements Parcelable {
    public static final Parcelable.Creator<TagStaticDataParams> CREATOR = new Creator();
    public final LatestMarketInfoBean AEQbTJ;
    public final List<TagWrapper> EZpvd;
    public final boolean KWHzl;
    public final Overview OLrzqt;

    public static final class Creator implements Parcelable.Creator<TagStaticDataParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagStaticDataParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
            }
            return new TagStaticDataParams(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : LatestMarketInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Overview.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagStaticDataParams[] newArray(int i) {
            return new TagStaticDataParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.tag.ui.TagStaticDataParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagStaticDataParams copy$default(TagStaticDataParams tagStaticDataParams, List list, boolean z, LatestMarketInfoBean latestMarketInfoBean, Overview overview, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tagStaticDataParams.EZpvd;
        }
        if ((i & 2) != 0) {
            z = tagStaticDataParams.KWHzl;
        }
        if ((i & 4) != 0) {
            latestMarketInfoBean = tagStaticDataParams.AEQbTJ;
        }
        if ((i & 8) != 0) {
            overview = tagStaticDataParams.OLrzqt;
        }
        return tagStaticDataParams.copydefault(list, z, latestMarketInfoBean, overview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Overview AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestMarketInfoBean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagStaticDataParams copydefault(@NotNull List<TagWrapper> list, boolean z, LatestMarketInfoBean latestMarketInfoBean, Overview overview) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TagStaticDataParams(list, z, latestMarketInfoBean, overview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof TagStaticDataParams)) {
            return false;
        }
        TagStaticDataParams tagStaticDataParams = (TagStaticDataParams) obj;
        return Intrinsics.EZpvd(this.EZpvd, tagStaticDataParams.EZpvd) && this.KWHzl == tagStaticDataParams.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, tagStaticDataParams.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, tagStaticDataParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = Boolean.hashCode(this.KWHzl);
        LatestMarketInfoBean latestMarketInfoBean = this.AEQbTJ;
        int iHashCode3 = latestMarketInfoBean == null ? 0 : latestMarketInfoBean.hashCode();
        Overview overview = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (overview != null ? overview.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagStaticDataParams(tags=" + this.EZpvd + ", showDevAnalysis=" + this.KWHzl + ", latestInfo=" + this.AEQbTJ + ", overviewData=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TagWrapper> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.KWHzl ? 1 : 0);
        LatestMarketInfoBean latestMarketInfoBean = this.AEQbTJ;
        if (latestMarketInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            latestMarketInfoBean.writeToParcel(parcel, i);
        }
        Overview overview = this.OLrzqt;
        if (overview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overview.writeToParcel(parcel, i);
        }
    }

    public TagStaticDataParams(@NotNull List<TagWrapper> list, boolean z, LatestMarketInfoBean latestMarketInfoBean, Overview overview) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.KWHzl = z;
        this.AEQbTJ = latestMarketInfoBean;
        this.OLrzqt = overview;
    }
}
