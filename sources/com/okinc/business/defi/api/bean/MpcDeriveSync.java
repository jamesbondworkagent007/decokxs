package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MpcDeriveSync implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpcDeriveSync> CREATOR = new Creator();
    private int deriveIndex;
    private String mpcId;

    public static final class Creator implements Parcelable.Creator<MpcDeriveSync> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcDeriveSync createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MpcDeriveSync(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcDeriveSync[] newArray(int i) {
            return new MpcDeriveSync[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcDeriveSync copy$default(MpcDeriveSync mpcDeriveSync, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mpcDeriveSync.mpcId;
        }
        if ((i2 & 2) != 0) {
            i = mpcDeriveSync.deriveIndex;
        }
        return mpcDeriveSync.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.deriveIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcDeriveSync copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MpcDeriveSync(str, i);
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
        if (!(obj instanceof MpcDeriveSync)) {
            return false;
        }
        MpcDeriveSync mpcDeriveSync = (MpcDeriveSync) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) mpcDeriveSync.mpcId) && this.deriveIndex == mpcDeriveSync.deriveIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDeriveIndex() {
        return this.deriveIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mpcId.hashCode() * 31) + Integer.hashCode(this.deriveIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeriveIndex(int i) {
        this.deriveIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcDeriveSync(mpcId=" + this.mpcId + ", deriveIndex=" + this.deriveIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeInt(this.deriveIndex);
    }

    public MpcDeriveSync(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
        this.deriveIndex = i;
    }
}
