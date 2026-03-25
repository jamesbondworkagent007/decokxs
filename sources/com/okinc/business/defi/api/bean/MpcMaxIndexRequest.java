package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class MpcMaxIndexRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpcMaxIndexRequest> CREATOR = new Creator();
    private String mpcId;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<MpcMaxIndexRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcMaxIndexRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MpcMaxIndexRequest(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcMaxIndexRequest[] newArray(int i) {
            return new MpcMaxIndexRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcMaxIndexRequest copy$default(MpcMaxIndexRequest mpcMaxIndexRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mpcMaxIndexRequest.mpcId;
        }
        return mpcMaxIndexRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcMaxIndexRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MpcMaxIndexRequest(str);
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
        return (obj instanceof MpcMaxIndexRequest) && Intrinsics.EZpvd((Object) this.mpcId, (Object) ((MpcMaxIndexRequest) obj).mpcId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.mpcId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcMaxIndexRequest(mpcId=" + this.mpcId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
    }

    public MpcMaxIndexRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
    }
}
