package com.okinc.tradingbot.impl.aiBot.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class IndicatorSectionUiModel implements Parcelable {
    public static final Parcelable.Creator<IndicatorSectionUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final List<Indicator> EZpvd;

    public static final class Creator implements Parcelable.Creator<IndicatorSectionUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndicatorSectionUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(IndicatorSectionUiModel.class.getClassLoader()));
            }
            return new IndicatorSectionUiModel(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndicatorSectionUiModel[] newArray(int i) {
            return new IndicatorSectionUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorSectionUiModel copy$default(IndicatorSectionUiModel indicatorSectionUiModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorSectionUiModel.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = indicatorSectionUiModel.EZpvd;
        }
        return indicatorSectionUiModel.EZpvd(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndicatorSectionUiModel EZpvd(@NotNull String str, @NotNull List<? extends Indicator> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new IndicatorSectionUiModel(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Indicator> OLrzqt() {
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
        if (!(obj instanceof IndicatorSectionUiModel)) {
            return false;
        }
        IndicatorSectionUiModel indicatorSectionUiModel = (IndicatorSectionUiModel) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) indicatorSectionUiModel.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, indicatorSectionUiModel.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndicatorSectionUiModel(name=" + this.AEQbTJ + ", indicators=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        List<Indicator> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<Indicator> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.aiBot.domain.model.Indicator> */
    /* JADX WARN: Multi-variable type inference failed */
    public IndicatorSectionUiModel(@NotNull String str, @NotNull List<? extends Indicator> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.EZpvd = list;
    }
}
