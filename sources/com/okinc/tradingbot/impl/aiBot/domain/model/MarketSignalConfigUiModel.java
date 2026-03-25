package com.okinc.tradingbot.impl.aiBot.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketSignalConfigUiModel implements Parcelable {
    public static final Parcelable.Creator<MarketSignalConfigUiModel> CREATOR = new Creator();
    public final List<String> EZpvd;
    public final int KWHzl;
    public final List<TimeframeModel> OLrzqt;
    public final int copydefault;

    public static final class Creator implements Parcelable.Creator<MarketSignalConfigUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketSignalConfigUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TimeframeModel.CREATOR.createFromParcel(parcel));
            }
            return new MarketSignalConfigUiModel(arrayListCreateStringArrayList, arrayList, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketSignalConfigUiModel[] newArray(int i) {
            return new MarketSignalConfigUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketSignalConfigUiModel copy$default(MarketSignalConfigUiModel marketSignalConfigUiModel, List list, List list2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = marketSignalConfigUiModel.EZpvd;
        }
        if ((i3 & 2) != 0) {
            list2 = marketSignalConfigUiModel.OLrzqt;
        }
        if ((i3 & 4) != 0) {
            i = marketSignalConfigUiModel.KWHzl;
        }
        if ((i3 & 8) != 0) {
            i2 = marketSignalConfigUiModel.copydefault;
        }
        return marketSignalConfigUiModel.EZpvd(list, list2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TimeframeModel> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketSignalConfigUiModel EZpvd(@NotNull List<String> list, @NotNull List<TimeframeModel> list2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new MarketSignalConfigUiModel(list, list2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
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
        if (!(obj instanceof MarketSignalConfigUiModel)) {
            return false;
        }
        MarketSignalConfigUiModel marketSignalConfigUiModel = (MarketSignalConfigUiModel) obj;
        return Intrinsics.EZpvd(this.EZpvd, marketSignalConfigUiModel.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, marketSignalConfigUiModel.OLrzqt) && this.KWHzl == marketSignalConfigUiModel.KWHzl && this.copydefault == marketSignalConfigUiModel.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketSignalConfigUiModel(availableThinkingIntervals=" + this.EZpvd + ", availableChartTimeframes=" + this.OLrzqt + ", maxTechnicalIndicators=" + this.KWHzl + ", maxKLinesSize=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.EZpvd);
        List<TimeframeModel> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<TimeframeModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.copydefault);
    }

    public MarketSignalConfigUiModel(@NotNull List<String> list, @NotNull List<TimeframeModel> list2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = list;
        this.OLrzqt = list2;
        this.KWHzl = i;
        this.copydefault = i2;
    }
}
