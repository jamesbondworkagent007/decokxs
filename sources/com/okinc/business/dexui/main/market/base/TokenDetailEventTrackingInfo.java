package com.okinc.business.dexui.main.market.base;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TokenDetailEventTrackingInfo implements Parcelable {
    public static final Parcelable.Creator<TokenDetailEventTrackingInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<TokenDetailEventTrackingInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetailEventTrackingInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenDetailEventTrackingInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetailEventTrackingInfo[] newArray(int i) {
            return new TokenDetailEventTrackingInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenDetailEventTrackingInfo copy$default(TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenDetailEventTrackingInfo.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = tokenDetailEventTrackingInfo.KWHzl;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = tokenDetailEventTrackingInfo.AEQbTJ;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = tokenDetailEventTrackingInfo.copydefault;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = tokenDetailEventTrackingInfo.AhwBna;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = tokenDetailEventTrackingInfo.valueOf;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = tokenDetailEventTrackingInfo.OLrzqt;
        }
        return tokenDetailEventTrackingInfo.copydefault(str, str7, str8, str9, str10, str11, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetailEventTrackingInfo copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TokenDetailEventTrackingInfo(str, str2, str3, str4, str5, str6, z);
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
        if (!(obj instanceof TokenDetailEventTrackingInfo)) {
            return false;
        }
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = (TokenDetailEventTrackingInfo) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenDetailEventTrackingInfo.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tokenDetailEventTrackingInfo.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tokenDetailEventTrackingInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tokenDetailEventTrackingInfo.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tokenDetailEventTrackingInfo.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tokenDetailEventTrackingInfo.valueOf) && this.OLrzqt == tokenDetailEventTrackingInfo.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        String str = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetailEventTrackingInfo(pageFrom=" + this.EZpvd + ", chainName=" + this.KWHzl + ", chainId=" + this.AEQbTJ + ", tokenAddress=" + this.copydefault + ", tokenSymbol=" + this.AhwBna + ", walletId=" + this.valueOf + ", isRwaToken=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public TokenDetailEventTrackingInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.copydefault = str4;
        this.AhwBna = str5;
        this.valueOf = str6;
        this.OLrzqt = z;
    }
}
