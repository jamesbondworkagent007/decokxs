package com.okinc.wallet.hardware.api.onekey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyConnectedDevice implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OneKeyConnectedDevice> CREATOR = new Creator();
    private final OneKeyDevice device;
    private final String deviceId;
    private final String label;
    private final String passphraseState;

    public static final class Creator implements Parcelable.Creator<OneKeyConnectedDevice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OneKeyConnectedDevice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OneKeyConnectedDevice(OneKeyDevice.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OneKeyConnectedDevice[] newArray(int i) {
            return new OneKeyConnectedDevice[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeyDevice getDevice() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPassphraseState() {
        return this.passphraseState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.device.writeToParcel(parcel, i);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.passphraseState);
        parcel.writeString(this.label);
    }

    public OneKeyConnectedDevice(@NotNull OneKeyDevice oneKeyDevice, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        this.device = oneKeyDevice;
        this.deviceId = str;
        this.passphraseState = str2;
        this.label = str3;
    }

    public String toString() {
        return "OneKeyConnectedDevice(device=" + this.device + ", deviceId=" + this.deviceId + ", passphraseState=" + this.passphraseState + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(OneKeyConnectedDevice.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        OneKeyConnectedDevice oneKeyConnectedDevice = (OneKeyConnectedDevice) obj;
        return Intrinsics.EZpvd(this.device, oneKeyConnectedDevice.device) && Intrinsics.EZpvd((Object) this.deviceId, (Object) oneKeyConnectedDevice.deviceId) && Intrinsics.EZpvd((Object) this.passphraseState, (Object) oneKeyConnectedDevice.passphraseState) && Intrinsics.EZpvd((Object) this.label, (Object) oneKeyConnectedDevice.label);
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode();
        String str = this.deviceId;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.passphraseState;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.label;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
