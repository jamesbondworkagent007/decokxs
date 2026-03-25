package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17420fEr {
    public final java.lang.CharSequence AEQbTJ;
    public final java.lang.CharSequence AYXKKw;
    public final dTH EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C17420fEr copy$default(C17420fEr c17420fEr, java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, dTH dth, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c17420fEr.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c17420fEr.OLrzqt;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            charSequence = c17420fEr.AYXKKw;
        }
        java.lang.CharSequence charSequence3 = charSequence;
        if ((i & 8) != 0) {
            charSequence2 = c17420fEr.AEQbTJ;
        }
        java.lang.CharSequence charSequence4 = charSequence2;
        if ((i & 16) != 0) {
            dth = c17420fEr.EZpvd;
        }
        dTH dth2 = dth;
        if ((i & 32) != 0) {
            z = c17420fEr.copydefault;
        }
        return c17420fEr.OLrzqt(str, str3, charSequence3, charSequence4, dth2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dTH OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17420fEr OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, @NotNull dTH dth, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(dth, "");
        return new C17420fEr(str, str2, charSequence, charSequence2, dth, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17420fEr)) {
            return false;
        }
        C17420fEr c17420fEr = (C17420fEr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c17420fEr.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c17420fEr.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, c17420fEr.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, c17420fEr.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c17420fEr.EZpvd) && this.copydefault == c17420fEr.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        java.lang.CharSequence charSequence = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.KWHzl;
        java.lang.String str2 = this.OLrzqt;
        java.lang.CharSequence charSequence = this.AYXKKw;
        java.lang.CharSequence charSequence2 = this.AEQbTJ;
        return "AccountBean(walletId=" + str + ", avatarIconAddress=" + str2 + ", walletName=" + ((java.lang.Object) charSequence) + ", walletAddress=" + ((java.lang.Object) charSequence2) + ", teeWalletStatus=" + this.EZpvd + ", isSelected=" + this.copydefault + ")";
    }

    public C17420fEr(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, @NotNull dTH dth, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(dth, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.AYXKKw = charSequence;
        this.AEQbTJ = charSequence2;
        this.EZpvd = dth;
        this.copydefault = z;
    }
}
