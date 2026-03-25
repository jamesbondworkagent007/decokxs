package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BottomSheetMessageListOptions implements Parcelable {
    public static final Parcelable.Creator<BottomSheetMessageListOptions> CREATOR = new Creator();
    public final int KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<BottomSheetMessageListOptions> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottomSheetMessageListOptions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BottomSheetMessageListOptions(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottomSheetMessageListOptions[] newArray(int i) {
            return new BottomSheetMessageListOptions[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BottomSheetMessageListOptions copy$default(BottomSheetMessageListOptions bottomSheetMessageListOptions, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bottomSheetMessageListOptions.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str = bottomSheetMessageListOptions.copydefault;
        }
        return bottomSheetMessageListOptions.KWHzl(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BottomSheetMessageListOptions KWHzl(@StringRes int i, String str) {
        return new BottomSheetMessageListOptions(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof BottomSheetMessageListOptions)) {
            return false;
        }
        BottomSheetMessageListOptions bottomSheetMessageListOptions = (BottomSheetMessageListOptions) obj;
        return this.KWHzl == bottomSheetMessageListOptions.KWHzl && Intrinsics.EZpvd((Object) this.copydefault, (Object) bottomSheetMessageListOptions.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.KWHzl);
        String str = this.copydefault;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BottomSheetMessageListOptions(titleResId=" + this.KWHzl + ", channelId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.copydefault);
    }

    public BottomSheetMessageListOptions(@StringRes int i, String str) {
        this.KWHzl = i;
        this.copydefault = str;
    }
}
