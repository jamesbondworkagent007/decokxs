package com.okinc.im.imui.picker;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class ConfirmationDialogConfig implements Parcelable {
    public static final Parcelable.Creator<ConfirmationDialogConfig> CREATOR = new Creator();
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int copydefault;

    public static final class Creator implements Parcelable.Creator<ConfirmationDialogConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmationDialogConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConfirmationDialogConfig(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmationDialogConfig[] newArray(int i) {
            return new ConfirmationDialogConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConfirmationDialogConfig copy$default(ConfirmationDialogConfig confirmationDialogConfig, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = confirmationDialogConfig.copydefault;
        }
        if ((i5 & 2) != 0) {
            i2 = confirmationDialogConfig.KWHzl;
        }
        if ((i5 & 4) != 0) {
            i3 = confirmationDialogConfig.EZpvd;
        }
        if ((i5 & 8) != 0) {
            i4 = confirmationDialogConfig.AEQbTJ;
        }
        return confirmationDialogConfig.copydefault(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfirmationDialogConfig copydefault(int i, int i2, int i3, int i4) {
        return new ConfirmationDialogConfig(i, i2, i3, i4);
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
        if (!(obj instanceof ConfirmationDialogConfig)) {
            return false;
        }
        ConfirmationDialogConfig confirmationDialogConfig = (ConfirmationDialogConfig) obj;
        return this.copydefault == confirmationDialogConfig.copydefault && this.KWHzl == confirmationDialogConfig.KWHzl && this.EZpvd == confirmationDialogConfig.EZpvd && this.AEQbTJ == confirmationDialogConfig.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.copydefault) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfirmationDialogConfig(title=" + this.copydefault + ", message=" + this.KWHzl + ", confirmButton=" + this.EZpvd + ", cancelButton=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.copydefault);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
    }

    public ConfirmationDialogConfig(int i, int i2, int i3, int i4) {
        this.copydefault = i;
        this.KWHzl = i2;
        this.EZpvd = i3;
        this.AEQbTJ = i4;
    }
}
