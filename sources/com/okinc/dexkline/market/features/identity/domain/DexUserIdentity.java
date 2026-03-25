package com.okinc.dexkline.market.features.identity.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class DexUserIdentity implements Parcelable {
    public static final Parcelable.Creator<DexUserIdentity> CREATOR = new Creator();
    public final long AEQbTJ;
    public final boolean EZpvd;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<DexUserIdentity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexUserIdentity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexUserIdentity(parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexUserIdentity[] newArray(int i) {
            return new DexUserIdentity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexUserIdentity copy$default(DexUserIdentity dexUserIdentity, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexUserIdentity.KWHzl;
        }
        if ((i & 2) != 0) {
            j = dexUserIdentity.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = dexUserIdentity.EZpvd;
        }
        return dexUserIdentity.KWHzl(str, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexUserIdentity KWHzl(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DexUserIdentity(str, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof DexUserIdentity)) {
            return false;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) dexUserIdentity.KWHzl) && this.AEQbTJ == dexUserIdentity.AEQbTJ && this.EZpvd == dexUserIdentity.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + Long.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexUserIdentity(publicAddress=" + this.KWHzl + ", chainId=" + this.AEQbTJ + ", isWatchOnlyWallet=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeLong(this.AEQbTJ);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public DexUserIdentity(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = j;
        this.EZpvd = z;
    }
}
