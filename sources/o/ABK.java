package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class ABK {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABK AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        return new ABK(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ABK)) {
            return false;
        }
        ABK abk = (ABK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) abk.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) abk.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) abk.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) abk.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) abk.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) abk.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) abk.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) abk.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.djBIcL;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AYXKKw;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.OLrzqt;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.KWHzl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.AhwBna;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.copydefault;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExtraTagInfo(name=" + this.djBIcL + ", kolTwitterLink=" + this.AYXKKw + ", kolTwitterImage=" + this.EZpvd + ", kolTwitterImageFullPath=" + this.OLrzqt + ", deepLink=" + this.KWHzl + ", link=" + this.AhwBna + ", isLinkInternal=" + this.copydefault + ", iconText=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public ABK(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.djBIcL = str;
        this.AYXKKw = str2;
        this.EZpvd = str3;
        this.OLrzqt = str4;
        this.KWHzl = str5;
        this.AhwBna = str6;
        this.copydefault = str7;
        this.AEQbTJ = str8;
    }
}
