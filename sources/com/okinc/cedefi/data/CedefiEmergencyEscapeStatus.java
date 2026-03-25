package com.okinc.cedefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CedefiEmergencyEscapeStatus implements Parcelable {
    public static final Parcelable.Creator<CedefiEmergencyEscapeStatus> CREATOR = new Creator();
    public final EscapeStatus EZpvd;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<CedefiEmergencyEscapeStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiEmergencyEscapeStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CedefiEmergencyEscapeStatus(parcel.readInt() != 0, parcel.readInt() == 0 ? null : EscapeStatus.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiEmergencyEscapeStatus[] newArray(int i) {
            return new CedefiEmergencyEscapeStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CedefiEmergencyEscapeStatus copy$default(CedefiEmergencyEscapeStatus cedefiEmergencyEscapeStatus, boolean z, EscapeStatus escapeStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cedefiEmergencyEscapeStatus.copydefault;
        }
        if ((i & 2) != 0) {
            escapeStatus = cedefiEmergencyEscapeStatus.EZpvd;
        }
        return cedefiEmergencyEscapeStatus.OLrzqt(z, escapeStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiEmergencyEscapeStatus OLrzqt(boolean z, EscapeStatus escapeStatus) {
        return new CedefiEmergencyEscapeStatus(z, escapeStatus);
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
        if (!(obj instanceof CedefiEmergencyEscapeStatus)) {
            return false;
        }
        CedefiEmergencyEscapeStatus cedefiEmergencyEscapeStatus = (CedefiEmergencyEscapeStatus) obj;
        return this.copydefault == cedefiEmergencyEscapeStatus.copydefault && this.EZpvd == cedefiEmergencyEscapeStatus.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.copydefault);
        EscapeStatus escapeStatus = this.EZpvd;
        return (iHashCode * 31) + (escapeStatus == null ? 0 : escapeStatus.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CedefiEmergencyEscapeStatus(isWalletCreate=" + this.copydefault + ", escapeStatus=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.copydefault ? 1 : 0);
        EscapeStatus escapeStatus = this.EZpvd;
        if (escapeStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            escapeStatus.writeToParcel(parcel, i);
        }
    }

    public CedefiEmergencyEscapeStatus(boolean z, EscapeStatus escapeStatus) {
        this.copydefault = z;
        this.EZpvd = escapeStatus;
    }
}
