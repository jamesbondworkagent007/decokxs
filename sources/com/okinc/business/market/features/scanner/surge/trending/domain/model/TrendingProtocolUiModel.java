package com.okinc.business.market.features.scanner.surge.trending.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TrendingProtocolUiModel implements Parcelable {
    public static final Parcelable.Creator<TrendingProtocolUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<TrendingProtocolUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingProtocolUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrendingProtocolUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingProtocolUiModel[] newArray(int i) {
            return new TrendingProtocolUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrendingProtocolUiModel copy$default(TrendingProtocolUiModel trendingProtocolUiModel, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trendingProtocolUiModel.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = trendingProtocolUiModel.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = trendingProtocolUiModel.copydefault;
        }
        if ((i & 8) != 0) {
            z = trendingProtocolUiModel.EZpvd;
        }
        return trendingProtocolUiModel.OLrzqt(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingProtocolUiModel OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TrendingProtocolUiModel(str, str2, str3, z);
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
        if (!(obj instanceof TrendingProtocolUiModel)) {
            return false;
        }
        TrendingProtocolUiModel trendingProtocolUiModel = (TrendingProtocolUiModel) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) trendingProtocolUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) trendingProtocolUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) trendingProtocolUiModel.copydefault) && this.EZpvd == trendingProtocolUiModel.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingProtocolUiModel(protocolId=" + this.KWHzl + ", protocolName=" + this.AEQbTJ + ", protocolIconUrl=" + this.copydefault + ", isSelected=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public TrendingProtocolUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.EZpvd = z;
    }
}
