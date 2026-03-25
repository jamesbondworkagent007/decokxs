package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class UserDateSelectionUiModel implements Parcelable {
    public static final Parcelable.Creator<UserDateSelectionUiModel> CREATOR = new Creator();
    public final Calendar KWHzl;
    public final Period OLrzqt;
    public final Calendar copydefault;

    public static final class Creator implements Parcelable.Creator<UserDateSelectionUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserDateSelectionUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserDateSelectionUiModel(Period.valueOf(parcel.readString()), (Calendar) parcel.readSerializable(), (Calendar) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserDateSelectionUiModel[] newArray(int i) {
            return new UserDateSelectionUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserDateSelectionUiModel copy$default(UserDateSelectionUiModel userDateSelectionUiModel, Period period, Calendar calendar, Calendar calendar2, int i, Object obj) {
        if ((i & 1) != 0) {
            period = userDateSelectionUiModel.OLrzqt;
        }
        if ((i & 2) != 0) {
            calendar = userDateSelectionUiModel.copydefault;
        }
        if ((i & 4) != 0) {
            calendar2 = userDateSelectionUiModel.KWHzl;
        }
        return userDateSelectionUiModel.KWHzl(period, calendar, calendar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserDateSelectionUiModel KWHzl(@NotNull Period period, @NotNull Calendar calendar, @NotNull Calendar calendar2) {
        Intrinsics.checkNotNullParameter(period, "");
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        return new UserDateSelectionUiModel(period, calendar, calendar2);
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
        if (!(obj instanceof UserDateSelectionUiModel)) {
            return false;
        }
        UserDateSelectionUiModel userDateSelectionUiModel = (UserDateSelectionUiModel) obj;
        return this.OLrzqt == userDateSelectionUiModel.OLrzqt && Intrinsics.EZpvd(this.copydefault, userDateSelectionUiModel.copydefault) && Intrinsics.EZpvd(this.KWHzl, userDateSelectionUiModel.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserDateSelectionUiModel(period=" + this.OLrzqt + ", startDate=" + this.copydefault + ", endDate=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt.name());
        parcel.writeSerializable(this.copydefault);
        parcel.writeSerializable(this.KWHzl);
    }

    public UserDateSelectionUiModel(@NotNull Period period, @NotNull Calendar calendar, @NotNull Calendar calendar2) {
        Intrinsics.checkNotNullParameter(period, "");
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        this.OLrzqt = period;
        this.copydefault = calendar;
        this.KWHzl = calendar2;
    }
}
