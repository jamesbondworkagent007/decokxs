package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xWZ {
    public final int AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xWZ copy$default(xWZ xwz, java.lang.String str, int i, long j, java.lang.String str2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = xwz.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i = xwz.AEQbTJ;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            j = xwz.copydefault;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            str2 = xwz.KWHzl;
        }
        java.lang.String str3 = str2;
        if ((i3 & 16) != 0) {
            i2 = xwz.OLrzqt;
        }
        return xwz.KWHzl(str, i4, j2, str3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xWZ KWHzl(@NotNull java.lang.String str, int i, long j, @NotNull java.lang.String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new xWZ(str, i, j, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xWZ)) {
            return false;
        }
        xWZ xwz = (xWZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) xwz.EZpvd) && this.AEQbTJ == xwz.AEQbTJ && this.copydefault == xwz.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) xwz.KWHzl) && this.OLrzqt == xwz.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QueryWalletConfig(accountId=" + this.EZpvd + ", walletType=" + this.AEQbTJ + ", chainIndex=" + this.copydefault + ", address=" + this.KWHzl + ", addressType=" + this.OLrzqt + ")";
    }

    public xWZ(@NotNull java.lang.String str, int i, long j, @NotNull java.lang.String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AEQbTJ = i;
        this.copydefault = j;
        this.KWHzl = str2;
        this.OLrzqt = i2;
    }
}
