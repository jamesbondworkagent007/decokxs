package com.okinc.business.market.features.home_favorite_list.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavouriteListParams implements Parcelable {
    public static final Parcelable.Creator<HomeFavouriteListParams> CREATOR = new Creator();
    public final String AEQbTJ;

    public static final class Creator implements Parcelable.Creator<HomeFavouriteListParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeFavouriteListParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeFavouriteListParams(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeFavouriteListParams[] newArray(int i) {
            return new HomeFavouriteListParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeFavouriteListParams copy$default(HomeFavouriteListParams homeFavouriteListParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeFavouriteListParams.AEQbTJ;
        }
        return homeFavouriteListParams.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeFavouriteListParams EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HomeFavouriteListParams(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
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
        return (obj instanceof HomeFavouriteListParams) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((HomeFavouriteListParams) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeFavouriteListParams(pageFrom=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
    }

    public HomeFavouriteListParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    public final boolean AEQbTJ() {
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) "scanner");
    }
}
