package com.okinc.tradingbot.impl.aiBot.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TimeframeModel implements Parcelable {
    public static final Parcelable.Creator<TimeframeModel> CREATOR = new Creator();
    public final String EZpvd;
    public final int copydefault;

    public static final class Creator implements Parcelable.Creator<TimeframeModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimeframeModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TimeframeModel(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimeframeModel[] newArray(int i) {
            return new TimeframeModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TimeframeModel copy$default(TimeframeModel timeframeModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = timeframeModel.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = timeframeModel.EZpvd;
        }
        return timeframeModel.OLrzqt(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeframeModel OLrzqt(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TimeframeModel(i, str);
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
        if (!(obj instanceof TimeframeModel)) {
            return false;
        }
        TimeframeModel timeframeModel = (TimeframeModel) obj;
        return this.copydefault == timeframeModel.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) timeframeModel.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.copydefault) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TimeframeModel(index=" + this.copydefault + ", value=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.copydefault);
        parcel.writeString(this.EZpvd);
    }

    public TimeframeModel(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = i;
        this.EZpvd = str;
    }
}
