package com.okinc.business.defi.wallet.mine.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class BoundWallet implements Parcelable {
    public static final Parcelable.Creator<BoundWallet> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AhwBna;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<BoundWallet> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundWallet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BoundWallet(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundWallet[] newArray(int i) {
            return new BoundWallet[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoundWallet copy$default(BoundWallet boundWallet, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boundWallet.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = boundWallet.AhwBna;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = boundWallet.EZpvd;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = boundWallet.AEQbTJ;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = boundWallet.OLrzqt;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = boundWallet.copydefault;
        }
        return boundWallet.AEQbTJ(str, str6, z2, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundWallet AEQbTJ(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BoundWallet(str, str2, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof BoundWallet)) {
            return false;
        }
        BoundWallet boundWallet = (BoundWallet) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) boundWallet.KWHzl) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) boundWallet.AhwBna) && this.EZpvd == boundWallet.EZpvd && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) boundWallet.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) boundWallet.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) boundWallet.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = Boolean.hashCode(this.EZpvd);
        int iHashCode4 = this.AEQbTJ.hashCode();
        String str = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoundWallet(walletId=" + this.KWHzl + ", walletName=" + this.AhwBna + ", isMainWallet=" + this.EZpvd + ", displayName=" + this.AEQbTJ + ", avatar=" + this.OLrzqt + ", userName=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
    }

    public BoundWallet(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.AhwBna = str2;
        this.EZpvd = z;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.copydefault = str5;
    }
}
