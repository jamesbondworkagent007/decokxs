package com.okinc.business.market.features.rwa.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RwaStatusesBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<RwaStatusesBottomSheetParams> CREATOR = new Creator();
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<RwaStatusesBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RwaStatusesBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RwaStatusesBottomSheetParams(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RwaStatusesBottomSheetParams[] newArray(int i) {
            return new RwaStatusesBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RwaStatusesBottomSheetParams copy$default(RwaStatusesBottomSheetParams rwaStatusesBottomSheetParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rwaStatusesBottomSheetParams.copydefault;
        }
        return rwaStatusesBottomSheetParams.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RwaStatusesBottomSheetParams EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RwaStatusesBottomSheetParams(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
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
        return (obj instanceof RwaStatusesBottomSheetParams) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((RwaStatusesBottomSheetParams) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RwaStatusesBottomSheetParams(rwaPlatformId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
    }

    public RwaStatusesBottomSheetParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }
}
