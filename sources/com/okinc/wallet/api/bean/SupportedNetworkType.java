package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SupportedNetworkType implements Parcelable {
    public static final Parcelable.Creator<SupportedNetworkType> CREATOR = new Creator();
    public final long AEQbTJ;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<SupportedNetworkType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedNetworkType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportedNetworkType(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedNetworkType[] newArray(int i) {
            return new SupportedNetworkType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeLong(this.AEQbTJ);
    }

    public SupportedNetworkType(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(SupportedNetworkType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        SupportedNetworkType supportedNetworkType = (SupportedNetworkType) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) supportedNetworkType.copydefault) && this.AEQbTJ == supportedNetworkType.AEQbTJ;
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + Long.hashCode(this.AEQbTJ);
    }
}
