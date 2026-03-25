package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SupportedEVM implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportedEVM> CREATOR = new Creator();
    private final boolean ccySupported;
    private int chainId;
    private final String networkIcon;
    private final String networkName;

    public static final class Creator implements Parcelable.Creator<SupportedEVM> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedEVM createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportedEVM(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedEVM[] newArray(int i) {
            return new SupportedEVM[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportedEVM copy$default(SupportedEVM supportedEVM, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportedEVM.networkName;
        }
        if ((i2 & 2) != 0) {
            str2 = supportedEVM.networkIcon;
        }
        if ((i2 & 4) != 0) {
            i = supportedEVM.chainId;
        }
        if ((i2 & 8) != 0) {
            z = supportedEVM.ccySupported;
        }
        return supportedEVM.copy(str, str2, i, z);
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
    public final int component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.ccySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportedEVM copy(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SupportedEVM(str, str2, i, z);
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
        if (!(obj instanceof SupportedEVM)) {
            return false;
        }
        SupportedEVM supportedEVM = (SupportedEVM) obj;
        return Intrinsics.EZpvd((Object) this.networkName, (Object) supportedEVM.networkName) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) supportedEVM.networkIcon) && this.chainId == supportedEVM.chainId && this.ccySupported == supportedEVM.ccySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCcySupported() {
        return this.ccySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
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
        return (((((this.networkName.hashCode() * 31) + this.networkIcon.hashCode()) * 31) + Integer.hashCode(this.chainId)) * 31) + Boolean.hashCode(this.ccySupported);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(int i) {
        this.chainId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportedEVM(networkName=" + this.networkName + ", networkIcon=" + this.networkIcon + ", chainId=" + this.chainId + ", ccySupported=" + this.ccySupported + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.networkName);
        parcel.writeString(this.networkIcon);
        parcel.writeInt(this.chainId);
        parcel.writeInt(this.ccySupported ? 1 : 0);
    }

    public SupportedEVM(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.networkName = str;
        this.networkIcon = str2;
        this.chainId = i;
        this.ccySupported = z;
    }
}
