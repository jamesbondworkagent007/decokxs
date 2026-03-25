package com.okinc.assets.backend.api.model.addressbook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class EvmNetworkInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EvmNetworkInfo> CREATOR = new Creator();
    private final boolean ccySupported;
    private final String networkIcon;
    private final String networkName;

    public static final class Creator implements Parcelable.Creator<EvmNetworkInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmNetworkInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EvmNetworkInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmNetworkInfo[] newArray(int i) {
            return new EvmNetworkInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EvmNetworkInfo copy$default(EvmNetworkInfo evmNetworkInfo, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = evmNetworkInfo.networkName;
        }
        if ((i & 2) != 0) {
            str2 = evmNetworkInfo.networkIcon;
        }
        if ((i & 4) != 0) {
            z = evmNetworkInfo.ccySupported;
        }
        return evmNetworkInfo.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.ccySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmNetworkInfo copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EvmNetworkInfo(str, str2, z);
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
        if (!(obj instanceof EvmNetworkInfo)) {
            return false;
        }
        EvmNetworkInfo evmNetworkInfo = (EvmNetworkInfo) obj;
        return Intrinsics.EZpvd((Object) this.networkName, (Object) evmNetworkInfo.networkName) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) evmNetworkInfo.networkIcon) && this.ccySupported == evmNetworkInfo.ccySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCcySupported() {
        return this.ccySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.networkName.hashCode() * 31) + this.networkIcon.hashCode()) * 31) + Boolean.hashCode(this.ccySupported);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvmNetworkInfo(networkName=" + this.networkName + ", networkIcon=" + this.networkIcon + ", ccySupported=" + this.ccySupported + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.networkName);
        parcel.writeString(this.networkIcon);
        parcel.writeInt(this.ccySupported ? 1 : 0);
    }

    public EvmNetworkInfo(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.networkName = str;
        this.networkIcon = str2;
        this.ccySupported = z;
    }
}
