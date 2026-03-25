package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapedAddressData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EscapedAddressData> CREATOR = new Creator();
    private final String dexControlAddress;
    private final String dexStorageAddress;
    private final String newAddress;

    public static final class Creator implements Parcelable.Creator<EscapedAddressData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedAddressData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapedAddressData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedAddressData[] newArray(int i) {
            return new EscapedAddressData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapedAddressData copy$default(EscapedAddressData escapedAddressData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapedAddressData.newAddress;
        }
        if ((i & 2) != 0) {
            str2 = escapedAddressData.dexStorageAddress;
        }
        if ((i & 4) != 0) {
            str3 = escapedAddressData.dexControlAddress;
        }
        return escapedAddressData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dexStorageAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dexControlAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedAddressData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EscapedAddressData(str, str2, str3);
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
        if (!(obj instanceof EscapedAddressData)) {
            return false;
        }
        EscapedAddressData escapedAddressData = (EscapedAddressData) obj;
        return Intrinsics.EZpvd((Object) this.newAddress, (Object) escapedAddressData.newAddress) && Intrinsics.EZpvd((Object) this.dexStorageAddress, (Object) escapedAddressData.dexStorageAddress) && Intrinsics.EZpvd((Object) this.dexControlAddress, (Object) escapedAddressData.dexControlAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexControlAddress() {
        return this.dexControlAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexStorageAddress() {
        return this.dexStorageAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewAddress() {
        return this.newAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.newAddress.hashCode() * 31) + this.dexStorageAddress.hashCode()) * 31) + this.dexControlAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapedAddressData(newAddress=" + this.newAddress + ", dexStorageAddress=" + this.dexStorageAddress + ", dexControlAddress=" + this.dexControlAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.newAddress);
        parcel.writeString(this.dexStorageAddress);
        parcel.writeString(this.dexControlAddress);
    }

    public EscapedAddressData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.newAddress = str;
        this.dexStorageAddress = str2;
        this.dexControlAddress = str3;
    }
}
