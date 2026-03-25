package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Bzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5011Bzh {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public long KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public long djBIcL;
    public boolean gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5011Bzh EZpvd(boolean z, boolean z2, java.lang.String str, long j, boolean z3, boolean z4, long j2, boolean z5, boolean z6, boolean z7) {
        return new C5011Bzh(z, z2, str, j, z3, z4, j2, z5, z6, z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5011Bzh)) {
            return false;
        }
        C5011Bzh c5011Bzh = (C5011Bzh) obj;
        return this.EZpvd == c5011Bzh.EZpvd && this.AhwBna == c5011Bzh.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c5011Bzh.OLrzqt) && this.KWHzl == c5011Bzh.KWHzl && this.valueOf == c5011Bzh.valueOf && this.AEQbTJ == c5011Bzh.AEQbTJ && this.djBIcL == c5011Bzh.djBIcL && this.gEmmrt == c5011Bzh.gEmmrt && this.copydefault == c5011Bzh.copydefault && this.AYXKKw == c5011Bzh.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Boolean.hashCode(this.AhwBna);
        java.lang.String str = this.OLrzqt;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LocalUserData(isFromQuickSwitch=" + this.EZpvd + ", showAccountBalance=" + this.AhwBna + ", gesturePassword=" + this.OLrzqt + ", authenTimeLimit=" + this.KWHzl + ", touchIdAuthen=" + this.valueOf + ", faceIdAuthen=" + this.AEQbTJ + ", loginTimeInterval=" + this.djBIcL + ", isOrderConfirmSpot=" + this.gEmmrt + ", isOrderConfirmFutures=" + this.copydefault + ", isOrderConfirmOption=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AYXKKw;
    }

    public C5011Bzh(boolean z, boolean z2, java.lang.String str, long j, boolean z3, boolean z4, long j2, boolean z5, boolean z6, boolean z7) {
        this.EZpvd = z;
        this.AhwBna = z2;
        this.OLrzqt = str;
        this.KWHzl = j;
        this.valueOf = z3;
        this.AEQbTJ = z4;
        this.djBIcL = j2;
        this.gEmmrt = z5;
        this.copydefault = z6;
        this.AYXKKw = z7;
    }
}
