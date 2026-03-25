package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DWProperties implements Parcelable {
    public static final Parcelable.Creator<DWProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final TradeType gEmmrt;

    public static final class Creator implements Parcelable.Creator<DWProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DWProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DWProperties(TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DWProperties[] newArray(int i) {
            return new DWProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DWProperties copy$default(DWProperties dWProperties, TradeType tradeType, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeType = dWProperties.gEmmrt;
        }
        if ((i & 2) != 0) {
            str = dWProperties.AEQbTJ;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = dWProperties.copydefault;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            z = dWProperties.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = dWProperties.KWHzl;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = dWProperties.EZpvd;
        }
        return dWProperties.OLrzqt(tradeType, str5, str6, z2, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DWProperties OLrzqt(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, boolean z, String str3, String str4) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DWProperties(tradeType, str, str2, z, str3, str4);
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
        if (!(obj instanceof DWProperties)) {
            return false;
        }
        DWProperties dWProperties = (DWProperties) obj;
        return this.gEmmrt == dWProperties.gEmmrt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dWProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) dWProperties.copydefault) && this.OLrzqt == dWProperties.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dWProperties.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) dWProperties.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = Boolean.hashCode(this.OLrzqt);
        String str = this.KWHzl;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DWProperties(tradeType=" + this.gEmmrt + ", requestAmount=" + this.AEQbTJ + ", requestCurrency=" + this.copydefault + ", splitEnabled=" + this.OLrzqt + ", successUrl=" + this.KWHzl + ", failUrl=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.gEmmrt.writeToParcel(parcel, i);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
    }

    public DWProperties(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, boolean z, String str3, String str4) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt = tradeType;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.OLrzqt = z;
        this.KWHzl = str3;
        this.EZpvd = str4;
    }
}
