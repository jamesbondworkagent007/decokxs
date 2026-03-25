package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nGS {
    public final java.lang.String AEQbTJ;
    public final int AhwBna;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nGS KWHzl(long j, @NotNull java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.String str3, boolean z, java.lang.Integer num, java.lang.String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new nGS(j, str, i, str2, str3, z, num, str4, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nGS)) {
            return false;
        }
        nGS ngs = (nGS) obj;
        return this.EZpvd == ngs.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) ngs.gEmmrt) && this.AhwBna == ngs.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ngs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ngs.OLrzqt) && this.djBIcL == ngs.djBIcL && Intrinsics.EZpvd(this.valueOf, ngs.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ngs.KWHzl) && this.copydefault == ngs.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = java.lang.Integer.hashCode(this.AhwBna);
        int iHashCode4 = this.AEQbTJ.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.Integer num = this.valueOf;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrendingGroup(id=" + this.EZpvd + ", name=" + this.gEmmrt + ", memberCount=" + this.AhwBna + ", description=" + this.AEQbTJ + ", avatarUrl=" + this.OLrzqt + ", isPaidGroup=" + this.djBIcL + ", maxMemberCount=" + this.valueOf + ", invitationId=" + this.KWHzl + ", isOfficialGroup=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.djBIcL;
    }

    public nGS(long j, @NotNull java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.String str3, boolean z, java.lang.Integer num, java.lang.String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.gEmmrt = str;
        this.AhwBna = i;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.djBIcL = z;
        this.valueOf = num;
        this.KWHzl = str4;
        this.copydefault = z2;
    }
}
