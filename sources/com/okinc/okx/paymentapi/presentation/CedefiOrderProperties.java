package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class CedefiOrderProperties implements Parcelable {
    public static final Parcelable.Creator<CedefiOrderProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final int KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<CedefiOrderProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiOrderProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CedefiOrderProperties(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiOrderProperties[] newArray(int i) {
            return new CedefiOrderProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CedefiOrderProperties copy$default(CedefiOrderProperties cedefiOrderProperties, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cedefiOrderProperties.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str = cedefiOrderProperties.djBIcL;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = cedefiOrderProperties.gEmmrt;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = cedefiOrderProperties.OLrzqt;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = cedefiOrderProperties.copydefault;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = cedefiOrderProperties.AEQbTJ;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = cedefiOrderProperties.EZpvd;
        }
        return cedefiOrderProperties.OLrzqt(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiOrderProperties OLrzqt(int i, @NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new CedefiOrderProperties(i, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof CedefiOrderProperties)) {
            return false;
        }
        CedefiOrderProperties cedefiOrderProperties = (CedefiOrderProperties) obj;
        return this.KWHzl == cedefiOrderProperties.KWHzl && Intrinsics.EZpvd((Object) this.djBIcL, (Object) cedefiOrderProperties.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) cedefiOrderProperties.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) cedefiOrderProperties.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) cedefiOrderProperties.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) cedefiOrderProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) cedefiOrderProperties.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.KWHzl);
        int iHashCode2 = this.djBIcL.hashCode();
        String str = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CedefiOrderProperties(chainIndex=" + this.KWHzl + ", tokenAddress=" + this.djBIcL + ", userPreferenceCurrency=" + this.gEmmrt + ", dexQuoteId=" + this.OLrzqt + ", price=" + this.copydefault + ", networkFeeCurrency=" + this.AEQbTJ + ", networkFeeAmount=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
    }

    public CedefiOrderProperties(int i, @NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.KWHzl = i;
        this.djBIcL = str;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.copydefault = str4;
        this.AEQbTJ = str5;
        this.EZpvd = str6;
    }
}
