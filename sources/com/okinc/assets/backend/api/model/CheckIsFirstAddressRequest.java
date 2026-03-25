package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CheckIsFirstAddressRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CheckIsFirstAddressRequest> CREATOR = new Creator();
    private final String address;

    public static final class Creator implements Parcelable.Creator<CheckIsFirstAddressRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckIsFirstAddressRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckIsFirstAddressRequest(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckIsFirstAddressRequest[] newArray(int i) {
            return new CheckIsFirstAddressRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckIsFirstAddressRequest copy$default(CheckIsFirstAddressRequest checkIsFirstAddressRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkIsFirstAddressRequest.address;
        }
        return checkIsFirstAddressRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckIsFirstAddressRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckIsFirstAddressRequest(str);
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
        return (obj instanceof CheckIsFirstAddressRequest) && Intrinsics.EZpvd((Object) this.address, (Object) ((CheckIsFirstAddressRequest) obj).address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckIsFirstAddressRequest(address=" + this.address + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
    }

    public CheckIsFirstAddressRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }
}
