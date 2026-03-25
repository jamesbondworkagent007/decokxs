package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CurrentWalletSwitchTeeConfig implements Parcelable {
    public static final Parcelable.Creator<CurrentWalletSwitchTeeConfig> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final int KWHzl;
    public final int OLrzqt;

    public static final class Creator implements Parcelable.Creator<CurrentWalletSwitchTeeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentWalletSwitchTeeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CurrentWalletSwitchTeeConfig(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentWalletSwitchTeeConfig[] newArray(int i) {
            return new CurrentWalletSwitchTeeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrentWalletSwitchTeeConfig copy$default(CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = currentWalletSwitchTeeConfig.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            str = currentWalletSwitchTeeConfig.EZpvd;
        }
        if ((i3 & 4) != 0) {
            str2 = currentWalletSwitchTeeConfig.AEQbTJ;
        }
        if ((i3 & 8) != 0) {
            i2 = currentWalletSwitchTeeConfig.KWHzl;
        }
        return currentWalletSwitchTeeConfig.KWHzl(i, str, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentWalletSwitchTeeConfig KWHzl(@StringRes int i, @NotNull String str, @NotNull String str2, @StringRes int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CurrentWalletSwitchTeeConfig(i, str, str2, i2);
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
        if (!(obj instanceof CurrentWalletSwitchTeeConfig)) {
            return false;
        }
        CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig = (CurrentWalletSwitchTeeConfig) obj;
        return this.OLrzqt == currentWalletSwitchTeeConfig.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) currentWalletSwitchTeeConfig.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) currentWalletSwitchTeeConfig.AEQbTJ) && this.KWHzl == currentWalletSwitchTeeConfig.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrentWalletSwitchTeeConfig(stringRes=" + this.OLrzqt + ", numberPlaceholder=" + this.EZpvd + ", learnPlaceholder=" + this.AEQbTJ + ", learnStringRes=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.KWHzl);
    }

    public CurrentWalletSwitchTeeConfig(@StringRes int i, @NotNull String str, @NotNull String str2, @StringRes int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = i;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = i2;
    }
}
