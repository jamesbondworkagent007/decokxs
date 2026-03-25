package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class ANX {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ANX copy$default(ANX anx, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, boolean z, java.lang.String str4, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = anx.AhwBna;
        }
        if ((i3 & 2) != 0) {
            str2 = anx.EZpvd;
        }
        java.lang.String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = anx.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i3 & 8) != 0) {
            i = anx.OLrzqt;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = anx.gEmmrt;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = anx.AEQbTJ;
        }
        boolean z2 = z;
        if ((i3 & 64) != 0) {
            str4 = anx.KWHzl;
        }
        return anx.AEQbTJ(str, str5, str6, i4, i5, z2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ANX AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, boolean z, java.lang.String str4) {
        return new ANX(str, str2, str3, i, i2, z, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ANX)) {
            return false;
        }
        ANX anx = (ANX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) anx.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) anx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) anx.copydefault) && this.OLrzqt == anx.OLrzqt && this.gEmmrt == anx.gEmmrt && this.AEQbTJ == anx.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) anx.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AhwBna;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode5 = java.lang.Integer.hashCode(this.gEmmrt);
        int iHashCode6 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str4 = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageFooterConfig(title=" + this.AhwBna + ", subtitle=" + this.EZpvd + ", qrcode=" + this.copydefault + ", position=" + this.OLrzqt + ", theme=" + this.gEmmrt + ", enableLogo=" + this.AEQbTJ + ", shareFrom=" + this.KWHzl + ")";
    }

    public ANX(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, boolean z, java.lang.String str4) {
        this.AhwBna = str;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.OLrzqt = i;
        this.gEmmrt = i2;
        this.AEQbTJ = z;
        this.KWHzl = str4;
    }
}
