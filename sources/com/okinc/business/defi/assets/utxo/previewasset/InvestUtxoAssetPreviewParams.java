package com.okinc.business.defi.assets.utxo.previewasset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoAssetPreviewParams implements Parcelable {
    public static final Parcelable.Creator<InvestUtxoAssetPreviewParams> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final int KWHzl;
    public final long OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<InvestUtxoAssetPreviewParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUtxoAssetPreviewParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUtxoAssetPreviewParams(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUtxoAssetPreviewParams[] newArray(int i) {
            return new InvestUtxoAssetPreviewParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUtxoAssetPreviewParams copy$default(InvestUtxoAssetPreviewParams investUtxoAssetPreviewParams, String str, int i, long j, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = investUtxoAssetPreviewParams.copydefault;
        }
        if ((i3 & 2) != 0) {
            i = investUtxoAssetPreviewParams.AEQbTJ;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            j = investUtxoAssetPreviewParams.OLrzqt;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i2 = investUtxoAssetPreviewParams.KWHzl;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = investUtxoAssetPreviewParams.EZpvd;
        }
        return investUtxoAssetPreviewParams.copydefault(str, i4, j2, i5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUtxoAssetPreviewParams copydefault(@NotNull String str, int i, long j, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestUtxoAssetPreviewParams(str, i, j, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof InvestUtxoAssetPreviewParams)) {
            return false;
        }
        InvestUtxoAssetPreviewParams investUtxoAssetPreviewParams = (InvestUtxoAssetPreviewParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) investUtxoAssetPreviewParams.copydefault) && this.AEQbTJ == investUtxoAssetPreviewParams.AEQbTJ && this.OLrzqt == investUtxoAssetPreviewParams.OLrzqt && this.KWHzl == investUtxoAssetPreviewParams.KWHzl && Intrinsics.EZpvd((Object) this.EZpvd, (Object) investUtxoAssetPreviewParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Long.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUtxoAssetPreviewParams(txnHash=" + this.copydefault + ", vout=" + this.AEQbTJ + ", chainId=" + this.OLrzqt + ", txnStatus=" + this.KWHzl + ", address=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeLong(this.OLrzqt);
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.EZpvd);
    }

    public InvestUtxoAssetPreviewParams(@NotNull String str, int i, long j, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = i;
        this.OLrzqt = j;
        this.KWHzl = i2;
        this.EZpvd = str2;
    }
}
