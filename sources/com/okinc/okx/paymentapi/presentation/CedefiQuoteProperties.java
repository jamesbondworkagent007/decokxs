package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class CedefiQuoteProperties implements Parcelable {
    public static final Parcelable.Creator<CedefiQuoteProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<CedefiQuoteProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiQuoteProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CedefiQuoteProperties(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiQuoteProperties[] newArray(int i) {
            return new CedefiQuoteProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CedefiQuoteProperties copy$default(CedefiQuoteProperties cedefiQuoteProperties, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cedefiQuoteProperties.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = cedefiQuoteProperties.KWHzl;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = cedefiQuoteProperties.gEmmrt;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = cedefiQuoteProperties.OLrzqt;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = cedefiQuoteProperties.AEQbTJ;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = cedefiQuoteProperties.copydefault;
        }
        return cedefiQuoteProperties.KWHzl(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiQuoteProperties KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CedefiQuoteProperties(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof CedefiQuoteProperties)) {
            return false;
        }
        CedefiQuoteProperties cedefiQuoteProperties = (CedefiQuoteProperties) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) cedefiQuoteProperties.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) cedefiQuoteProperties.KWHzl) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) cedefiQuoteProperties.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) cedefiQuoteProperties.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) cedefiQuoteProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) cedefiQuoteProperties.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        String str = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CedefiQuoteProperties(fromCurrency=" + this.EZpvd + ", fromAmount=" + this.KWHzl + ", toCurrency=" + this.gEmmrt + ", toAmount=" + this.OLrzqt + ", slippageTolerance=" + this.AEQbTJ + ", fundingToTradingAmount=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
    }

    public CedefiQuoteProperties(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.gEmmrt = str3;
        this.OLrzqt = str4;
        this.AEQbTJ = str5;
        this.copydefault = str6;
    }
}
