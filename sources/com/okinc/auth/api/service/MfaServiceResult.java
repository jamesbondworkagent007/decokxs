package com.okinc.auth.api.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class MfaServiceResult implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MfaServiceResult> CREATOR = new Creator();
    private final String mfaSessionId;
    private final MfaState mfaState;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<MfaServiceResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaServiceResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MfaServiceResult((MfaState) parcel.readParcelable(MfaServiceResult.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaServiceResult[] newArray(int i) {
            return new MfaServiceResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MfaServiceResult copy$default(MfaServiceResult mfaServiceResult, MfaState mfaState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mfaState = mfaServiceResult.mfaState;
        }
        if ((i & 2) != 0) {
            str = mfaServiceResult.mfaSessionId;
        }
        return mfaServiceResult.copy(mfaState, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaState component1() {
        return this.mfaState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaServiceResult copy(@NotNull MfaState mfaState, @NotNull String str) {
        Intrinsics.checkNotNullParameter(mfaState, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MfaServiceResult(mfaState, str);
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
        if (!(obj instanceof MfaServiceResult)) {
            return false;
        }
        MfaServiceResult mfaServiceResult = (MfaServiceResult) obj;
        return Intrinsics.EZpvd(this.mfaState, mfaServiceResult.mfaState) && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) mfaServiceResult.mfaSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfaSessionId() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaState getMfaState() {
        return this.mfaState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mfaState.hashCode() * 31) + this.mfaSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MfaServiceResult(mfaState=" + this.mfaState + ", mfaSessionId=" + this.mfaSessionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.mfaState, i);
        parcel.writeString(this.mfaSessionId);
    }

    public MfaServiceResult(@NotNull MfaState mfaState, @NotNull String str) {
        Intrinsics.checkNotNullParameter(mfaState, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.mfaState = mfaState;
        this.mfaSessionId = str;
    }
}
