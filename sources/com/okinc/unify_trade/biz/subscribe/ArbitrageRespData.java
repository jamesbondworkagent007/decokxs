package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ArbitrageRespData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitrageRespData> CREATOR = new Creator();
    private final ArrayList<FundingRateArbitrageData> fundingList;
    private final ArrayList<SpreadArbitrageData> spreadList;

    public static final class Creator implements Parcelable.Creator<ArbitrageRespData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageRespData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SpreadArbitrageData.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(FundingRateArbitrageData.CREATOR.createFromParcel(parcel));
            }
            return new ArbitrageRespData(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageRespData[] newArray(int i) {
            return new ArbitrageRespData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.ArbitrageRespData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArbitrageRespData copy$default(ArbitrageRespData arbitrageRespData, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = arbitrageRespData.spreadList;
        }
        if ((i & 2) != 0) {
            arrayList2 = arbitrageRespData.fundingList;
        }
        return arbitrageRespData.copy(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SpreadArbitrageData> component1() {
        return this.spreadList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FundingRateArbitrageData> component2() {
        return this.fundingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageRespData copy(@NotNull ArrayList<SpreadArbitrageData> arrayList, @NotNull ArrayList<FundingRateArbitrageData> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new ArbitrageRespData(arrayList, arrayList2);
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
        if (!(obj instanceof ArbitrageRespData)) {
            return false;
        }
        ArbitrageRespData arbitrageRespData = (ArbitrageRespData) obj;
        return Intrinsics.EZpvd(this.spreadList, arbitrageRespData.spreadList) && Intrinsics.EZpvd(this.fundingList, arbitrageRespData.fundingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FundingRateArbitrageData> getFundingList() {
        return this.fundingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SpreadArbitrageData> getSpreadList() {
        return this.spreadList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.spreadList.hashCode() * 31) + this.fundingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageRespData(spreadList=" + this.spreadList + ", fundingList=" + this.fundingList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<SpreadArbitrageData> arrayList = this.spreadList;
        parcel.writeInt(arrayList.size());
        Iterator<SpreadArbitrageData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<FundingRateArbitrageData> arrayList2 = this.fundingList;
        parcel.writeInt(arrayList2.size());
        Iterator<FundingRateArbitrageData> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ArbitrageRespData(@NotNull ArrayList<SpreadArbitrageData> arrayList, @NotNull ArrayList<FundingRateArbitrageData> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.spreadList = arrayList;
        this.fundingList = arrayList2;
    }
}
