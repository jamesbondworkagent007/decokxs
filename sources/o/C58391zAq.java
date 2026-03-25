package o;

import kotlin.jvm.internal.Intrinsics;
import uniffi.account.ConsentDisplayType;

/* JADX INFO: renamed from: o.zAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58391zAq {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.Boolean AhwBna;
    public java.lang.Boolean EZpvd;
    public java.lang.String KWHzl;
    public ConsentDisplayType OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.util.List<C58453zCy> gEmmrt;
    public java.lang.Boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58453zCy> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsentDisplayType OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58391zAq copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ConsentDisplayType consentDisplayType, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str5, java.util.List<C58453zCy> list, java.lang.Boolean bool3) {
        return new C58391zAq(str, str2, str3, str4, consentDisplayType, bool, bool2, str5, list, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58391zAq)) {
            return false;
        }
        C58391zAq c58391zAq = (C58391zAq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58391zAq.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c58391zAq.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c58391zAq.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c58391zAq.AYXKKw) && this.OLrzqt == c58391zAq.OLrzqt && Intrinsics.EZpvd(this.AhwBna, c58391zAq.AhwBna) && Intrinsics.EZpvd(this.valueOf, c58391zAq.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c58391zAq.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c58391zAq.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, c58391zAq.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AYXKKw;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        ConsentDisplayType consentDisplayType = this.OLrzqt;
        int iHashCode5 = consentDisplayType == null ? 0 : consentDisplayType.hashCode();
        java.lang.Boolean bool = this.AhwBna;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.valueOf;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str5 = this.djBIcL;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        java.util.List<C58453zCy> list = this.gEmmrt;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        java.lang.Boolean bool3 = this.EZpvd;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConsentItem(consentType=" + this.KWHzl + ", consentId=" + this.AEQbTJ + ", content=" + this.copydefault + ", title=" + this.AYXKKw + ", displayType=" + this.OLrzqt + ", mandatory=" + this.AhwBna + ", required=" + this.valueOf + ", url=" + this.djBIcL + ", params=" + this.gEmmrt + ", isChecked=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean valueOf() {
        return this.valueOf;
    }

    public C58391zAq(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ConsentDisplayType consentDisplayType, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str5, java.util.List<C58453zCy> list, java.lang.Boolean bool3) {
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.AYXKKw = str4;
        this.OLrzqt = consentDisplayType;
        this.AhwBna = bool;
        this.valueOf = bool2;
        this.djBIcL = str5;
        this.gEmmrt = list;
        this.EZpvd = bool3;
    }
}
