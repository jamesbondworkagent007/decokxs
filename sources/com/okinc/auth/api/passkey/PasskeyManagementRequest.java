package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyManagementRequest implements Parcelable {
    public static final Parcelable.Creator<PasskeyManagementRequest> CREATOR = new Creator();
    public final boolean EZpvd;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<PasskeyManagementRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyManagementRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyManagementRequest(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyManagementRequest[] newArray(int i) {
            return new PasskeyManagementRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyManagementRequest copy$default(PasskeyManagementRequest passkeyManagementRequest, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyManagementRequest.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = passkeyManagementRequest.EZpvd;
        }
        return passkeyManagementRequest.AEQbTJ(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyManagementRequest AEQbTJ(boolean z, boolean z2) {
        return new PasskeyManagementRequest(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
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
        if (!(obj instanceof PasskeyManagementRequest)) {
            return false;
        }
        PasskeyManagementRequest passkeyManagementRequest = (PasskeyManagementRequest) obj;
        return this.copydefault == passkeyManagementRequest.copydefault && this.EZpvd == passkeyManagementRequest.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.copydefault) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyManagementRequest(finishAfterRegistration=" + this.copydefault + ", isSmartAccountTab=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public PasskeyManagementRequest(boolean z, boolean z2) {
        this.copydefault = z;
        this.EZpvd = z2;
    }
}
