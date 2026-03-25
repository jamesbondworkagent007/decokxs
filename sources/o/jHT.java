package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jHT {
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jHT copy$default(jHT jht, java.lang.String str, boolean z, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = jht.KWHzl;
        }
        if ((i & 2) != 0) {
            z = jht.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = jht.djBIcL;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            num = jht.EZpvd;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = jht.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            str4 = jht.AEQbTJ;
        }
        return jht.KWHzl(str, z2, str5, num2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jHT KWHzl(java.lang.String str, boolean z, java.lang.String str2, java.lang.Integer num, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new jHT(str, z, str2, num, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jHT)) {
            return false;
        }
        jHT jht = (jHT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) jht.KWHzl) && this.OLrzqt == jht.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) jht.djBIcL) && Intrinsics.EZpvd(this.EZpvd, jht.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jht.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) jht.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str2 = this.djBIcL;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AnalysisAccountVo(title=" + this.KWHzl + ", isMainAccount=" + this.OLrzqt + ", uid=" + this.djBIcL + ", subAccountNumber=" + this.EZpvd + ", menuChipTitle=" + this.copydefault + ", bottomSheetTitle=" + this.AEQbTJ + ")";
    }

    public jHT(java.lang.String str, boolean z, java.lang.String str2, java.lang.Integer num, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = str;
        this.OLrzqt = z;
        this.djBIcL = str2;
        this.EZpvd = num;
        this.copydefault = str3;
        this.AEQbTJ = str4;
    }
}
