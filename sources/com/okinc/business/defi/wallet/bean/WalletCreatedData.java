package com.okinc.business.defi.wallet.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCreatedData implements Parcelable {
    public static final Parcelable.Creator<WalletCreatedData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final WalletCreatedTeeData OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<WalletCreatedData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCreatedData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletCreatedData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WalletCreatedTeeData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCreatedData[] newArray(int i) {
            return new WalletCreatedData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletCreatedData copy$default(WalletCreatedData walletCreatedData, String str, String str2, WalletCreatedTeeData walletCreatedTeeData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletCreatedData.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = walletCreatedData.AEQbTJ;
        }
        if ((i & 4) != 0) {
            walletCreatedTeeData = walletCreatedData.OLrzqt;
        }
        return walletCreatedData.OLrzqt(str, str2, walletCreatedTeeData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCreatedTeeData EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCreatedData OLrzqt(@NotNull String str, @NotNull String str2, WalletCreatedTeeData walletCreatedTeeData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletCreatedData(str, str2, walletCreatedTeeData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof WalletCreatedData)) {
            return false;
        }
        WalletCreatedData walletCreatedData = (WalletCreatedData) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) walletCreatedData.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) walletCreatedData.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, walletCreatedData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        WalletCreatedTeeData walletCreatedTeeData = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (walletCreatedTeeData == null ? 0 : walletCreatedTeeData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCreatedData(id=" + this.copydefault + ", name=" + this.AEQbTJ + ", teeData=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        WalletCreatedTeeData walletCreatedTeeData = this.OLrzqt;
        if (walletCreatedTeeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletCreatedTeeData.writeToParcel(parcel, i);
        }
    }

    public WalletCreatedData(@NotNull String str, @NotNull String str2, WalletCreatedTeeData walletCreatedTeeData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.OLrzqt = walletCreatedTeeData;
    }

    public static final class WalletCreatedTeeData implements Parcelable {
        public static final Parcelable.Creator<WalletCreatedTeeData> CREATOR = new Creator();
        public final boolean OLrzqt;

        public static final class Creator implements Parcelable.Creator<WalletCreatedTeeData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletCreatedTeeData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WalletCreatedTeeData(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletCreatedTeeData[] newArray(int i) {
                return new WalletCreatedTeeData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WalletCreatedTeeData copy$default(WalletCreatedTeeData walletCreatedTeeData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = walletCreatedTeeData.OLrzqt;
            }
            return walletCreatedTeeData.copydefault(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletCreatedTeeData copydefault(boolean z) {
            return new WalletCreatedTeeData(z);
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
            return (obj instanceof WalletCreatedTeeData) && this.OLrzqt == ((WalletCreatedTeeData) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletCreatedTeeData(isTEEActive=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt ? 1 : 0);
        }

        public WalletCreatedTeeData(boolean z) {
            this.OLrzqt = z;
        }
    }
}
