package com.okinc.business.defi.wallet.mine.addressbook.detail;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressChainUiData implements Parcelable {
    public static final Parcelable.Creator<AddressChainUiData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public boolean AhwBna;
    public final long EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean gEmmrt;

    public static final class Creator implements Parcelable.Creator<AddressChainUiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressChainUiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressChainUiData(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressChainUiData[] newArray(int i) {
            return new AddressChainUiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressChainUiData EZpvd(@NotNull String str, long j, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressChainUiData(str, j, str2, z, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof AddressChainUiData)) {
            return false;
        }
        AddressChainUiData addressChainUiData = (AddressChainUiData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) addressChainUiData.AEQbTJ) && this.EZpvd == addressChainUiData.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) addressChainUiData.KWHzl) && this.gEmmrt == addressChainUiData.gEmmrt && this.AYXKKw == addressChainUiData.AYXKKw && this.OLrzqt == addressChainUiData.OLrzqt && this.copydefault == addressChainUiData.copydefault && this.AhwBna == addressChainUiData.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.AEQbTJ.hashCode() * 31) + Long.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressChainUiData(chainName=" + this.AEQbTJ + ", chainId=" + this.EZpvd + ", imageUrl=" + this.KWHzl + ", isEVMNetwork=" + this.gEmmrt + ", isSVMNetwork=" + this.AYXKKw + ", isAptosNetwork=" + this.OLrzqt + ", isBTCNetwork=" + this.copydefault + ", isSelected=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeLong(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
    }

    public AddressChainUiData(@NotNull String str, long j, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.EZpvd = j;
        this.KWHzl = str2;
        this.gEmmrt = z;
        this.AYXKKw = z2;
        this.OLrzqt = z3;
        this.copydefault = z4;
        this.AhwBna = z5;
    }
}
