package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xWT {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xWT copy$default(xWT xwt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xwt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = xwt.EZpvd;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = xwt.KWHzl;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = xwt.AhwBna;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = xwt.valueOf;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = xwt.OLrzqt;
        }
        java.lang.String str11 = str6;
        if ((i & 64) != 0) {
            z = xwt.copydefault;
        }
        return xwt.AEQbTJ(str, str7, str8, str9, str10, str11, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xWT AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new xWT(str, str2, str3, str4, str5, str6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xWT)) {
            return false;
        }
        xWT xwt = (xWT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) xwt.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) xwt.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) xwt.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) xwt.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) xwt.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) xwt.OLrzqt) && this.copydefault == xwt.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BoundWalletInfo(accountId=" + this.AEQbTJ + ", userName=" + this.EZpvd + ", walletAccountName=" + this.KWHzl + ", walletIcon=" + this.AhwBna + ", walletAddress=" + this.valueOf + ", payoutWalletAddress=" + this.OLrzqt + ", isCurrentPayoutWallet=" + this.copydefault + ")";
    }

    public xWT(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.AhwBna = str4;
        this.valueOf = str5;
        this.OLrzqt = str6;
        this.copydefault = z;
    }
}
