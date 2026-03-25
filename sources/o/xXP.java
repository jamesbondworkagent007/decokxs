package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xXP {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xXP copy$default(xXP xxp, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xxp.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = xxp.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            z = xxp.EZpvd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = xxp.copydefault;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = xxp.AEQbTJ;
        }
        return xxp.copydefault(str, str4, z3, z4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xXP copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new xXP(str, str2, z, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xXP)) {
            return false;
        }
        xXP xxp = (xXP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) xxp.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) xxp.OLrzqt) && this.EZpvd == xxp.EZpvd && this.copydefault == xxp.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) xxp.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletProfile(sourceAddress=" + this.KWHzl + ", targetAddress=" + this.OLrzqt + ", notification=" + this.EZpvd + ", following=" + this.copydefault + ", alias=" + this.AEQbTJ + ")";
    }

    public xXP(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.EZpvd = z;
        this.copydefault = z2;
        this.AEQbTJ = str3;
    }
}
