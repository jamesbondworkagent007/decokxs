package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CurrencyAssetsDetailUiModel implements Parcelable {
    public static final Parcelable.Creator<CurrencyAssetsDetailUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final boolean AkhnZx;
    public final Boolean AuCTel;
    public final boolean DbNXlk;
    public final EarnUIGroup EZpvd;
    public final Boolean KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final EarnUIStatusWithAPY djBIcL;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final boolean isConnected;
    public final String valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<CurrencyAssetsDetailUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyAssetsDetailUiModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string7 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            EarnUIStatusWithAPY earnUIStatusWithAPY = (EarnUIStatusWithAPY) parcel.readParcelable(CurrencyAssetsDetailUiModel.class.getClassLoader());
            EarnUIGroup earnUIGroupCreateFromParcel = EarnUIGroup.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CurrencyAssetsDetailUiModel(string, string2, string3, string4, string5, string6, z, string7, z2, z3, z4, z5, earnUIStatusWithAPY, earnUIGroupCreateFromParcel, boolValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyAssetsDetailUiModel[] newArray(int i) {
            return new CurrencyAssetsDetailUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyAssetsDetailUiModel OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull EarnUIStatusWithAPY earnUIStatusWithAPY, @NotNull EarnUIGroup earnUIGroup, Boolean bool, Boolean bool2, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(earnUIStatusWithAPY, "");
        Intrinsics.checkNotNullParameter(earnUIGroup, "");
        return new CurrencyAssetsDetailUiModel(str, str2, str3, str4, str5, str6, z, str7, z2, z3, z4, z5, earnUIStatusWithAPY, earnUIGroup, bool, bool2, str8, str9, str10);
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
        if (!(obj instanceof CurrencyAssetsDetailUiModel)) {
            return false;
        }
        CurrencyAssetsDetailUiModel currencyAssetsDetailUiModel = (CurrencyAssetsDetailUiModel) obj;
        return Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) currencyAssetsDetailUiModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) currencyAssetsDetailUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) currencyAssetsDetailUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) currencyAssetsDetailUiModel.fIwbmz) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) currencyAssetsDetailUiModel.fJNWhG) && Intrinsics.EZpvd((Object) this.valueOf, (Object) currencyAssetsDetailUiModel.valueOf) && this.AkhnZx == currencyAssetsDetailUiModel.AkhnZx && Intrinsics.EZpvd((Object) this.AhwBna, (Object) currencyAssetsDetailUiModel.AhwBna) && this.isConnected == currencyAssetsDetailUiModel.isConnected && this.values == currencyAssetsDetailUiModel.values && this.AYXKKw == currencyAssetsDetailUiModel.AYXKKw && this.DbNXlk == currencyAssetsDetailUiModel.DbNXlk && Intrinsics.EZpvd(this.djBIcL, currencyAssetsDetailUiModel.djBIcL) && this.EZpvd == currencyAssetsDetailUiModel.EZpvd && Intrinsics.EZpvd(this.AuCTel, currencyAssetsDetailUiModel.AuCTel) && Intrinsics.EZpvd(this.KWHzl, currencyAssetsDetailUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) currencyAssetsDetailUiModel.copydefault) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) currencyAssetsDetailUiModel.fARcdN) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) currencyAssetsDetailUiModel.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fetchVPNInfo.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.fIwbmz.hashCode();
        int iHashCode5 = this.fJNWhG.hashCode();
        int iHashCode6 = this.valueOf.hashCode();
        int iHashCode7 = Boolean.hashCode(this.AkhnZx);
        int iHashCode8 = this.AhwBna.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isConnected);
        int iHashCode10 = Boolean.hashCode(this.values);
        int iHashCode11 = Boolean.hashCode(this.AYXKKw);
        int iHashCode12 = Boolean.hashCode(this.DbNXlk);
        int iHashCode13 = this.djBIcL.hashCode();
        int iHashCode14 = this.EZpvd.hashCode();
        Boolean bool = this.AuCTel;
        int iHashCode15 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.KWHzl;
        int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.copydefault;
        int iHashCode17 = str == null ? 0 : str.hashCode();
        String str2 = this.fARcdN;
        int iHashCode18 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AEQbTJ;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyAssetsDetailUiModel(name=" + this.fetchVPNInfo + ", fullName=" + this.gEmmrt + ", currencyId=" + this.OLrzqt + ", totalValuation=" + this.fIwbmz + ", totalAmount=" + this.fJNWhG + ", icon=" + this.valueOf + ", isFiat=" + this.AkhnZx + ", fiatSign=" + this.AhwBna + ", isTradable=" + this.isConnected + ", isEntitySupported=" + this.values + ", fiatCategory=" + this.AYXKKw + ", isStableCoin=" + this.DbNXlk + ", earnUIStatus=" + this.djBIcL + ", earnUIGroup=" + this.EZpvd + ", shouldShowInsightsEarnCard=" + this.AuCTel + ", cedefi=" + this.KWHzl + ", balance=" + this.copydefault + ", tokenAddress=" + this.fARcdN + ", chainIndex=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.AkhnZx ? 1 : 0);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.isConnected ? 1 : 0);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.DbNXlk ? 1 : 0);
        parcel.writeParcelable(this.djBIcL, i);
        this.EZpvd.writeToParcel(parcel, i);
        Boolean bool = this.AuCTel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.KWHzl;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.copydefault);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.AEQbTJ);
    }

    public CurrencyAssetsDetailUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull EarnUIStatusWithAPY earnUIStatusWithAPY, @NotNull EarnUIGroup earnUIGroup, Boolean bool, Boolean bool2, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(earnUIStatusWithAPY, "");
        Intrinsics.checkNotNullParameter(earnUIGroup, "");
        this.fetchVPNInfo = str;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.fIwbmz = str4;
        this.fJNWhG = str5;
        this.valueOf = str6;
        this.AkhnZx = z;
        this.AhwBna = str7;
        this.isConnected = z2;
        this.values = z3;
        this.AYXKKw = z4;
        this.DbNXlk = z5;
        this.djBIcL = earnUIStatusWithAPY;
        this.EZpvd = earnUIGroup;
        this.AuCTel = bool;
        this.KWHzl = bool2;
        this.copydefault = str8;
        this.fARcdN = str9;
        this.AEQbTJ = str10;
    }
}
