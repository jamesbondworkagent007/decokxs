package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BSCBuySellBaseCurrencyInfo implements Parcelable {
    public static final Parcelable.Creator<BSCBuySellBaseCurrencyInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BSCBuySellBaseCurrencyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCBuySellBaseCurrencyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCBuySellBaseCurrencyInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCBuySellBaseCurrencyInfo[] newArray(int i) {
            return new BSCBuySellBaseCurrencyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BSCBuySellBaseCurrencyInfo copy$default(BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bSCBuySellBaseCurrencyInfo.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = bSCBuySellBaseCurrencyInfo.EZpvd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bSCBuySellBaseCurrencyInfo.KWHzl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bSCBuySellBaseCurrencyInfo.copydefault;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bSCBuySellBaseCurrencyInfo.OLrzqt;
        }
        return bSCBuySellBaseCurrencyInfo.AEQbTJ(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCBuySellBaseCurrencyInfo AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BSCBuySellBaseCurrencyInfo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof BSCBuySellBaseCurrencyInfo)) {
            return false;
        }
        BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo = (BSCBuySellBaseCurrencyInfo) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bSCBuySellBaseCurrencyInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) bSCBuySellBaseCurrencyInfo.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) bSCBuySellBaseCurrencyInfo.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) bSCBuySellBaseCurrencyInfo.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bSCBuySellBaseCurrencyInfo.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCBuySellBaseCurrencyInfo(tokenName=" + this.AEQbTJ + ", coinUrl=" + this.EZpvd + ", coinUrlNight=" + this.KWHzl + ", chainIcon=" + this.copydefault + ", sellTotalCryptoAmount=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
    }

    public BSCBuySellBaseCurrencyInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.copydefault = str4;
        this.OLrzqt = str5;
    }
}
