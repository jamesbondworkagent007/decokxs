package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TokenViewData implements Parcelable {
    public static final Parcelable.Creator<TokenViewData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<TokenViewData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenViewData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenViewData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenViewData[] newArray(int i) {
            return new TokenViewData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenViewData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TokenViewData(str, str2, str3, str4, str5, str6, z, z2, z3);
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
        if (!(obj instanceof TokenViewData)) {
            return false;
        }
        TokenViewData tokenViewData = (TokenViewData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tokenViewData.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenViewData.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tokenViewData.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tokenViewData.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) tokenViewData.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tokenViewData.AhwBna) && this.OLrzqt == tokenViewData.OLrzqt && this.copydefault == tokenViewData.copydefault && this.gEmmrt == tokenViewData.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenViewData(chainIndex=" + this.AEQbTJ + ", chainName=" + this.EZpvd + ", chainLogo=" + this.KWHzl + ", tokenLogo=" + this.valueOf + ", tokenSymbol=" + this.AYXKKw + ", tokenCoinTypeNo=" + this.AhwBna + ", pay=" + this.OLrzqt + ", cefiSupport=" + this.copydefault + ", sendSupport=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
    }

    public TokenViewData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.valueOf = str4;
        this.AYXKKw = str5;
        this.AhwBna = str6;
        this.OLrzqt = z;
        this.copydefault = z2;
        this.gEmmrt = z3;
    }
}
