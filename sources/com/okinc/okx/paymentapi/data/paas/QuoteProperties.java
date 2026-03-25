package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class QuoteProperties implements Parcelable {
    public static final Parcelable.Creator<QuoteProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final TradeType AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final Float valueOf;

    public static final class Creator implements Parcelable.Creator<QuoteProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuoteProperties(TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteProperties[] newArray(int i) {
            return new QuoteProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteProperties EZpvd(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, Float f, String str6) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new QuoteProperties(tradeType, str, str2, str3, str4, str5, z, f, str6);
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
        if (!(obj instanceof QuoteProperties)) {
            return false;
        }
        QuoteProperties quoteProperties = (QuoteProperties) obj;
        return this.AhwBna == quoteProperties.AhwBna && Intrinsics.EZpvd((Object) this.EZpvd, (Object) quoteProperties.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) quoteProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) quoteProperties.AYXKKw) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) quoteProperties.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) quoteProperties.djBIcL) && this.OLrzqt == quoteProperties.OLrzqt && Intrinsics.EZpvd(this.valueOf, quoteProperties.valueOf) && Intrinsics.EZpvd((Object) this.copydefault, (Object) quoteProperties.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        int iHashCode6 = this.djBIcL.hashCode();
        int iHashCode7 = Boolean.hashCode(this.OLrzqt);
        Float f = this.valueOf;
        int iHashCode8 = f == null ? 0 : f.hashCode();
        String str = this.copydefault;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteProperties(tradeType=" + this.AhwBna + ", baseCurrency=" + this.EZpvd + ", baseAmount=" + this.AEQbTJ + ", quoteCurrency=" + this.AYXKKw + ", quoteAmount=" + this.KWHzl + ", quoteToken=" + this.djBIcL + ", needConvert=" + this.OLrzqt + ", slippageTolerance=" + this.valueOf + ", fundingToTradingAmount=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AhwBna.writeToParcel(parcel, i);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        Float f = this.valueOf;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.copydefault);
    }

    public QuoteProperties(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, Float f, String str6) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AhwBna = tradeType;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.AYXKKw = str3;
        this.KWHzl = str4;
        this.djBIcL = str5;
        this.OLrzqt = z;
        this.valueOf = f;
        this.copydefault = str6;
    }
}
