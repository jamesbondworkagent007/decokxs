package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DexPreviewParameters implements Parcelable {
    public static final Parcelable.Creator<DexPreviewParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public int AhwBna;
    public int EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public String gEmmrt;

    public static final class Creator implements Parcelable.Creator<DexPreviewParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexPreviewParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexPreviewParameters(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexPreviewParameters[] newArray(int i) {
            return new DexPreviewParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexPreviewParameters copy$default(DexPreviewParameters dexPreviewParameters, String str, int i, int i2, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dexPreviewParameters.gEmmrt;
        }
        if ((i3 & 2) != 0) {
            i = dexPreviewParameters.AhwBna;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = dexPreviewParameters.EZpvd;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = dexPreviewParameters.KWHzl;
        }
        String str6 = str2;
        if ((i3 & 16) != 0) {
            str3 = dexPreviewParameters.AEQbTJ;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = dexPreviewParameters.copydefault;
        }
        String str8 = str4;
        if ((i3 & 64) != 0) {
            str5 = dexPreviewParameters.OLrzqt;
        }
        return dexPreviewParameters.KWHzl(str, i4, i5, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPreviewParameters KWHzl(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DexPreviewParameters(str, i, i2, str2, str3, str4, str5);
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
        if (!(obj instanceof DexPreviewParameters)) {
            return false;
        }
        DexPreviewParameters dexPreviewParameters = (DexPreviewParameters) obj;
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) dexPreviewParameters.gEmmrt) && this.AhwBna == dexPreviewParameters.AhwBna && this.EZpvd == dexPreviewParameters.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dexPreviewParameters.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dexPreviewParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) dexPreviewParameters.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dexPreviewParameters.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.gEmmrt.hashCode() * 31) + Integer.hashCode(this.AhwBna)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexPreviewParameters(tokenAddress=" + this.gEmmrt + ", tokenDecimal=" + this.AhwBna + ", chainIndex=" + this.EZpvd + ", referenceDexQuoteId=" + this.KWHzl + ", dexTokenIcon=" + this.AEQbTJ + ", chainLogoIcon=" + this.copydefault + ", dexQuoteFromAmount=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt);
        parcel.writeInt(this.AhwBna);
        parcel.writeInt(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
    }

    public DexPreviewParameters(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.gEmmrt = str;
        this.AhwBna = i;
        this.EZpvd = i2;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.copydefault = str4;
        this.OLrzqt = str5;
    }
}
