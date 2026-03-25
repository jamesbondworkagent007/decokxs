package com.okinc.auth.api.reset2fa;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ResetMfaServiceResult implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ResetMfaServiceResult> CREATOR = new Creator();
    private final boolean isSuccess;

    public static final class Creator implements Parcelable.Creator<ResetMfaServiceResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResetMfaServiceResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ResetMfaServiceResult(parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResetMfaServiceResult[] newArray(int i) {
            return new ResetMfaServiceResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ResetMfaServiceResult copy$default(ResetMfaServiceResult resetMfaServiceResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = resetMfaServiceResult.isSuccess;
        }
        return resetMfaServiceResult.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetMfaServiceResult copy(boolean z) {
        return new ResetMfaServiceResult(z);
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
        return (obj instanceof ResetMfaServiceResult) && this.isSuccess == ((ResetMfaServiceResult) obj).isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.isSuccess);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetMfaServiceResult(isSuccess=" + this.isSuccess + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isSuccess ? 1 : 0);
    }

    public ResetMfaServiceResult(boolean z) {
        this.isSuccess = z;
    }
}
