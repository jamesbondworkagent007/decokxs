package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ConvertFiatParameters implements Parcelable {
    public static final Parcelable.Creator<ConvertFiatParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final TradeType valueOf;

    public static final class Creator implements Parcelable.Creator<ConvertFiatParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertFiatParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConvertFiatParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TradeType.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertFiatParameters[] newArray(int i) {
            return new ConvertFiatParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertFiatParameters AEQbTJ(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        return new ConvertFiatParameters(str, str2, str3, str4, str5, str6, str7, str8, tradeType);
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
        if (!(obj instanceof ConvertFiatParameters)) {
            return false;
        }
        ConvertFiatParameters convertFiatParameters = (ConvertFiatParameters) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) convertFiatParameters.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) convertFiatParameters.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) convertFiatParameters.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) convertFiatParameters.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) convertFiatParameters.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) convertFiatParameters.AhwBna) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) convertFiatParameters.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) convertFiatParameters.AEQbTJ) && this.valueOf == convertFiatParameters.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        String str = this.EZpvd;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.djBIcL;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AhwBna;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.OLrzqt;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.AEQbTJ;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertFiatParameters(fiatCurrency=" + this.AYXKKw + ", cryptoCurrency=" + this.copydefault + ", fiatAmount=" + this.EZpvd + ", cryptoAmount=" + this.KWHzl + ", fiatIconUrl=" + this.djBIcL + ", fiatIconUrlNight=" + this.AhwBna + ", cryptoIconUrl=" + this.OLrzqt + ", cryptoIconUrlNight=" + this.AEQbTJ + ", tradeType=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        this.valueOf.writeToParcel(parcel, i);
    }

    public ConvertFiatParameters(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        this.AYXKKw = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.KWHzl = str4;
        this.djBIcL = str5;
        this.AhwBna = str6;
        this.OLrzqt = str7;
        this.AEQbTJ = str8;
        this.valueOf = tradeType;
    }
}
