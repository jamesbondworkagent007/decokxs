package com.okinc.business.invest_biz.ui.screens.tvl_chart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TvlChartDialogParams implements Parcelable {
    public static final Parcelable.Creator<TvlChartDialogParams> CREATOR = new Creator();
    public final long AEQbTJ;
    public final String EZpvd;

    public static final class Creator implements Parcelable.Creator<TvlChartDialogParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TvlChartDialogParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TvlChartDialogParams(parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TvlChartDialogParams[] newArray(int i) {
            return new TvlChartDialogParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TvlChartDialogParams copy$default(TvlChartDialogParams tvlChartDialogParams, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tvlChartDialogParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = tvlChartDialogParams.EZpvd;
        }
        return tvlChartDialogParams.EZpvd(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TvlChartDialogParams EZpvd(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TvlChartDialogParams(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof TvlChartDialogParams)) {
            return false;
        }
        TvlChartDialogParams tvlChartDialogParams = (TvlChartDialogParams) obj;
        return this.AEQbTJ == tvlChartDialogParams.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tvlChartDialogParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TvlChartDialogParams(investmentId=" + this.AEQbTJ + ", initialTvl=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
    }

    public TvlChartDialogParams(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = j;
        this.EZpvd = str;
    }
}
