package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class WalletAddressInfo implements Parcelable {
    public static final Parcelable.Creator<WalletAddressInfo> CREATOR = new Creator();
    public final long AEQbTJ;
    public final String KWHzl;
    public final String OLrzqt;
    public final int copydefault;

    public static final class Creator implements Parcelable.Creator<WalletAddressInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAddressInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletAddressInfo(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAddressInfo[] newArray(int i) {
            return new WalletAddressInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletAddressInfo copy$default(WalletAddressInfo walletAddressInfo, long j, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = walletAddressInfo.AEQbTJ;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = walletAddressInfo.copydefault;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = walletAddressInfo.KWHzl;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = walletAddressInfo.OLrzqt;
        }
        return walletAddressInfo.OLrzqt(j2, i3, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressInfo OLrzqt(long j, int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletAddressInfo(j, i, str, str2);
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
        if (!(obj instanceof WalletAddressInfo)) {
            return false;
        }
        WalletAddressInfo walletAddressInfo = (WalletAddressInfo) obj;
        return this.AEQbTJ == walletAddressInfo.AEQbTJ && this.copydefault == walletAddressInfo.copydefault && Intrinsics.EZpvd((Object) this.KWHzl, (Object) walletAddressInfo.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) walletAddressInfo.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.AEQbTJ) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAddressInfo(chainIndex=" + this.AEQbTJ + ", addressType=" + this.copydefault + ", address=" + this.KWHzl + ", pubKey=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.AEQbTJ);
        parcel.writeInt(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
    }

    public WalletAddressInfo(long j, int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = j;
        this.copydefault = i;
        this.KWHzl = str;
        this.OLrzqt = str2;
    }
}
