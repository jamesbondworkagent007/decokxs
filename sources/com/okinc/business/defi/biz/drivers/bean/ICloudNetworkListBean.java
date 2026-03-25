package com.okinc.business.defi.biz.drivers.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ICloudNetworkListBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ICloudNetworkListBean> CREATOR = new Creator();
    private HDWalletCloudBackupBean backupBean;
    private int cloudType;
    private Integer noOnDeviceCount;
    private boolean onDevice;
    private String walletName;

    public static final class Creator implements Parcelable.Creator<ICloudNetworkListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ICloudNetworkListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ICloudNetworkListBean(parcel.readString(), HDWalletCloudBackupBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ICloudNetworkListBean[] newArray(int i) {
            return new ICloudNetworkListBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HDWalletCloudBackupBean getBackupBean() {
        return this.backupBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCloudType() {
        return this.cloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNoOnDeviceCount() {
        return this.noOnDeviceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOnDevice() {
        return this.onDevice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletName() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackupBean(@NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        this.backupBean = hDWalletCloudBackupBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloudType(int i) {
        this.cloudType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoOnDeviceCount(Integer num) {
        this.noOnDeviceCount = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDevice(boolean z) {
        this.onDevice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletName);
        this.backupBean.writeToParcel(parcel, i);
        parcel.writeInt(this.onDevice ? 1 : 0);
        Integer num = this.noOnDeviceCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.cloudType);
    }

    public ICloudNetworkListBean(@NotNull String str, @NotNull HDWalletCloudBackupBean hDWalletCloudBackupBean, boolean z, Integer num, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hDWalletCloudBackupBean, "");
        this.walletName = str;
        this.backupBean = hDWalletCloudBackupBean;
        this.onDevice = z;
        this.noOnDeviceCount = num;
        this.cloudType = i;
    }
}
