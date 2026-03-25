package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class BSCDexTokenParameters implements Parcelable {
    public static final Parcelable.Creator<BSCDexTokenParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<BSCDexTokenParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCDexTokenParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCDexTokenParameters(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCDexTokenParameters[] newArray(int i) {
            return new BSCDexTokenParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BSCDexTokenParameters copy$default(BSCDexTokenParameters bSCDexTokenParameters, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bSCDexTokenParameters.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = bSCDexTokenParameters.AEQbTJ;
        }
        return bSCDexTokenParameters.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCDexTokenParameters KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BSCDexTokenParameters(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof BSCDexTokenParameters)) {
            return false;
        }
        BSCDexTokenParameters bSCDexTokenParameters = (BSCDexTokenParameters) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) bSCDexTokenParameters.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bSCDexTokenParameters.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCDexTokenParameters(chainId=" + this.KWHzl + ", tokenAddress=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
    }

    public BSCDexTokenParameters(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }
}
