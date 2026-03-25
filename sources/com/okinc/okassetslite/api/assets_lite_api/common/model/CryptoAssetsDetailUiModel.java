package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CryptoAssetsDetailUiModel implements Parcelable {
    public static final Parcelable.Creator<CryptoAssetsDetailUiModel> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final boolean gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<CryptoAssetsDetailUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAssetsDetailUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CryptoAssetsDetailUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAssetsDetailUiModel[] newArray(int i) {
            return new CryptoAssetsDetailUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoAssetsDetailUiModel EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CryptoAssetsDetailUiModel(str, str2, str3, str4, str5, str6, z, str7, z2, z3);
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
        if (!(obj instanceof CryptoAssetsDetailUiModel)) {
            return false;
        }
        CryptoAssetsDetailUiModel cryptoAssetsDetailUiModel = (CryptoAssetsDetailUiModel) obj;
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) cryptoAssetsDetailUiModel.djBIcL) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) cryptoAssetsDetailUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) cryptoAssetsDetailUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) cryptoAssetsDetailUiModel.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) cryptoAssetsDetailUiModel.AhwBna) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) cryptoAssetsDetailUiModel.KWHzl) && this.AYXKKw == cryptoAssetsDetailUiModel.AYXKKw && Intrinsics.EZpvd((Object) this.copydefault, (Object) cryptoAssetsDetailUiModel.copydefault) && this.gEmmrt == cryptoAssetsDetailUiModel.gEmmrt && this.AEQbTJ == cryptoAssetsDetailUiModel.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.djBIcL.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CryptoAssetsDetailUiModel(name=" + this.djBIcL + ", fullName=" + this.EZpvd + ", currencyId=" + this.OLrzqt + ", totalValuation=" + this.valueOf + ", totalAmount=" + this.AhwBna + ", icon=" + this.KWHzl + ", isFiat=" + this.AYXKKw + ", fiatSign=" + this.copydefault + ", isTradable=" + this.gEmmrt + ", isEntitySupported=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    public CryptoAssetsDetailUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.djBIcL = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.valueOf = str4;
        this.AhwBna = str5;
        this.KWHzl = str6;
        this.AYXKKw = z;
        this.copydefault = str7;
        this.gEmmrt = z2;
        this.AEQbTJ = z3;
    }
}
