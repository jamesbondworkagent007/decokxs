package com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChainInfoResult implements Parcelable {
    public static final Parcelable.Creator<ChainInfoResult> CREATOR = new Creator();
    public final String EZpvd;
    public final String KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<ChainInfoResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainInfoResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChainInfoResult(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainInfoResult[] newArray(int i) {
            return new ChainInfoResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainInfoResult copy$default(ChainInfoResult chainInfoResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chainInfoResult.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = chainInfoResult.KWHzl;
        }
        if ((i & 4) != 0) {
            str3 = chainInfoResult.EZpvd;
        }
        return chainInfoResult.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfoResult OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ChainInfoResult(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof ChainInfoResult)) {
            return false;
        }
        ChainInfoResult chainInfoResult = (ChainInfoResult) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) chainInfoResult.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) chainInfoResult.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) chainInfoResult.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainInfoResult(chainId=" + this.copydefault + ", chainName=" + this.KWHzl + ", chainLogo=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
    }

    public ChainInfoResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
    }
}
