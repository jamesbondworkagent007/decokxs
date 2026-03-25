package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BlE {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BlE copy$default(BlE blE, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = blE.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = blE.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = blE.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = blE.OLrzqt;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = blE.EZpvd;
        }
        return blE.EZpvd(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlE EZpvd(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new BlE(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlE)) {
            return false;
        }
        BlE blE = (BlE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) blE.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) blE.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) blE.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) blE.OLrzqt) && this.EZpvd == blE.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeGroupData(id=" + this.KWHzl + ", name=" + this.AEQbTJ + ", groupType=" + this.copydefault + ", mark=" + this.OLrzqt + ", isHeatTab=" + this.EZpvd + ")";
    }

    public BlE(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.OLrzqt = str4;
        this.EZpvd = z;
    }
}
