package com.okinc.kline.news.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineActiveListData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineActiveListData> CREATOR = new Creator();
    private final ArrayList<KlineCampaignData> campaign;
    private final ArrayList<KlineCampaignData> contentFlash;

    public static final class Creator implements Parcelable.Creator<KlineActiveListData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineActiveListData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(KlineCampaignData.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(KlineCampaignData.CREATOR.createFromParcel(parcel));
                }
            }
            return new KlineActiveListData(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineActiveListData[] newArray(int i) {
            return new KlineActiveListData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineActiveListData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.news.data.KlineActiveListData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KlineActiveListData copy$default(KlineActiveListData klineActiveListData, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = klineActiveListData.campaign;
        }
        if ((i & 2) != 0) {
            arrayList2 = klineActiveListData.contentFlash;
        }
        return klineActiveListData.copy(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KlineCampaignData> component1() {
        return this.campaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KlineCampaignData> component2() {
        return this.contentFlash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineActiveListData copy(ArrayList<KlineCampaignData> arrayList, ArrayList<KlineCampaignData> arrayList2) {
        return new KlineActiveListData(arrayList, arrayList2);
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
        if (!(obj instanceof KlineActiveListData)) {
            return false;
        }
        KlineActiveListData klineActiveListData = (KlineActiveListData) obj;
        return Intrinsics.EZpvd(this.campaign, klineActiveListData.campaign) && Intrinsics.EZpvd(this.contentFlash, klineActiveListData.contentFlash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KlineCampaignData> getCampaign() {
        return this.campaign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KlineCampaignData> getContentFlash() {
        return this.contentFlash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<KlineCampaignData> arrayList = this.campaign;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<KlineCampaignData> arrayList2 = this.contentFlash;
        return (iHashCode * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineActiveListData(campaign=" + this.campaign + ", contentFlash=" + this.contentFlash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<KlineCampaignData> arrayList = this.campaign;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<KlineCampaignData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<KlineCampaignData> arrayList2 = this.contentFlash;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator<KlineCampaignData> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public KlineActiveListData(ArrayList<KlineCampaignData> arrayList, ArrayList<KlineCampaignData> arrayList2) {
        this.campaign = arrayList;
        this.contentFlash = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.kline.news.data.KlineCampaignData>, java.util.ArrayList<com.okinc.kline.news.data.KlineCampaignData>):void (m)] (LINE:10) call: com.okinc.kline.news.data.KlineActiveListData.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ KlineActiveListData(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2);
    }
}
