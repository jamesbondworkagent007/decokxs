package com.okinc.business.market.features.overview.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class StockInfo implements Parcelable {
    public static final Parcelable.Creator<StockInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<StockInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StockInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StockInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StockInfo[] newArray(int i) {
            return new StockInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StockInfo OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new StockInfo(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockInfo)) {
            return false;
        }
        StockInfo stockInfo = (StockInfo) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) stockInfo.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stockInfo.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stockInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stockInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stockInfo.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) stockInfo.djBIcL) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) stockInfo.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) stockInfo.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) stockInfo.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StockInfo(circulatingMCap=" + this.copydefault + ", companyName=" + this.EZpvd + ", companyProfile=" + this.AEQbTJ + ", industry=" + this.OLrzqt + ", listedCompany=" + this.KWHzl + ", peRatio=" + this.djBIcL + ", stockCode=" + this.AYXKKw + ", totalMCap=" + this.AhwBna + ", turnoverRatio=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
    }

    public StockInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.KWHzl = str5;
        this.djBIcL = str6;
        this.AYXKKw = str7;
        this.AhwBna = str8;
        this.gEmmrt = str9;
    }
}
