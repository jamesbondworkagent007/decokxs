package com.okinc.business.dexui.main.swap.widget.mev.simple;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MevInfoParam implements Parcelable {
    public static final Parcelable.Creator<MevInfoParam> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public boolean OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<MevInfoParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevInfoParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MevInfoParam(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevInfoParam[] newArray(int i) {
            return new MevInfoParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MevInfoParam copy$default(MevInfoParam mevInfoParam, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mevInfoParam.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = mevInfoParam.EZpvd;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = mevInfoParam.AYXKKw;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = mevInfoParam.KWHzl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = mevInfoParam.AhwBna;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            z2 = mevInfoParam.AEQbTJ;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            z3 = mevInfoParam.copydefault;
        }
        return mevInfoParam.AEQbTJ(z, str5, str6, str7, str8, z4, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevInfoParam AEQbTJ(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MevInfoParam(z, str, str2, str3, str4, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AYXKKw;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MevInfoParam)) {
            return false;
        }
        MevInfoParam mevInfoParam = (MevInfoParam) obj;
        return this.OLrzqt == mevInfoParam.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) mevInfoParam.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) mevInfoParam.AYXKKw) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) mevInfoParam.KWHzl) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) mevInfoParam.AhwBna) && this.AEQbTJ == mevInfoParam.AEQbTJ && this.copydefault == mevInfoParam.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MevInfoParam(isChecked=" + this.OLrzqt + ", fromChainName=" + this.EZpvd + ", toChainName=" + this.AYXKKw + ", fromChainLogoUrl=" + this.KWHzl + ", toChainLogoUrl=" + this.AhwBna + ", isMevSupportedFromChain=" + this.AEQbTJ + ", isMevSupportedToChain=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public MevInfoParam(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = z;
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.KWHzl = str3;
        this.AhwBna = str4;
        this.AEQbTJ = z2;
        this.copydefault = z3;
    }
}
