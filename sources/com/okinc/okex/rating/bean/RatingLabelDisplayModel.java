package com.okinc.okex.rating.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingLabelDisplayModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RatingLabelDisplayModel> CREATOR = new Creator();
    private final long id;
    private final boolean isSelected;
    private final String text;

    public static final class Creator implements Parcelable.Creator<RatingLabelDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingLabelDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RatingLabelDisplayModel(parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingLabelDisplayModel[] newArray(int i) {
            return new RatingLabelDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RatingLabelDisplayModel copy$default(RatingLabelDisplayModel ratingLabelDisplayModel, long j, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ratingLabelDisplayModel.id;
        }
        if ((i & 2) != 0) {
            str = ratingLabelDisplayModel.text;
        }
        if ((i & 4) != 0) {
            z = ratingLabelDisplayModel.isSelected;
        }
        return ratingLabelDisplayModel.copy(j, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingLabelDisplayModel copy(long j, String str, boolean z) {
        return new RatingLabelDisplayModel(j, str, z);
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
        if (!(obj instanceof RatingLabelDisplayModel)) {
            return false;
        }
        RatingLabelDisplayModel ratingLabelDisplayModel = (RatingLabelDisplayModel) obj;
        return this.id == ratingLabelDisplayModel.id && Intrinsics.EZpvd((Object) this.text, (Object) ratingLabelDisplayModel.text) && this.isSelected == ratingLabelDisplayModel.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.text;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RatingLabelDisplayModel(id=" + this.id + ", text=" + this.text + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.text);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public RatingLabelDisplayModel(long j, String str, boolean z) {
        this.id = j;
        this.text = str;
        this.isSelected = z;
    }
}
