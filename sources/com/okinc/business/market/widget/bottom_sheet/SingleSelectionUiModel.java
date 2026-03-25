package com.okinc.business.market.widget.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SingleSelectionUiModel implements Parcelable, kMU {
    public static final Parcelable.Creator<SingleSelectionUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final boolean OLrzqt;

    public static final class Creator implements Parcelable.Creator<SingleSelectionUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleSelectionUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SingleSelectionUiModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleSelectionUiModel[] newArray(int i) {
            return new SingleSelectionUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleSelectionUiModel copy$default(SingleSelectionUiModel singleSelectionUiModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleSelectionUiModel.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = singleSelectionUiModel.EZpvd;
        }
        if ((i & 4) != 0) {
            z = singleSelectionUiModel.OLrzqt;
        }
        return singleSelectionUiModel.AEQbTJ(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleSelectionUiModel AEQbTJ(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SingleSelectionUiModel(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
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
        if (!(obj instanceof SingleSelectionUiModel)) {
            return false;
        }
        SingleSelectionUiModel singleSelectionUiModel = (SingleSelectionUiModel) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) singleSelectionUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) singleSelectionUiModel.EZpvd) && this.OLrzqt == singleSelectionUiModel.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleSelectionUiModel(key=" + this.AEQbTJ + ", title=" + this.EZpvd + ", isSelected=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public SingleSelectionUiModel(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = z;
    }
}
