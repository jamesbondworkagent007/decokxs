package o;

/* JADX INFO: renamed from: o.AwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3978AwF {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public double AYXKKw;
    public boolean AhwBna;
    public double EZpvd;
    public double KWHzl;
    public double OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public double fetchVPNInfo;
    public double gEmmrt;
    public double valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3978AwF AEQbTJ(double d, double d2, boolean z, double d3, double d4, double d5, boolean z2, double d6, double d7, boolean z3, boolean z4) {
        return new C3978AwF(d, d2, z, d3, d4, d5, z2, d6, d7, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3978AwF)) {
            return false;
        }
        C3978AwF c3978AwF = (C3978AwF) obj;
        return java.lang.Double.compare(this.valueOf, c3978AwF.valueOf) == 0 && java.lang.Double.compare(this.fetchVPNInfo, c3978AwF.fetchVPNInfo) == 0 && this.djBIcL == c3978AwF.djBIcL && java.lang.Double.compare(this.KWHzl, c3978AwF.KWHzl) == 0 && java.lang.Double.compare(this.OLrzqt, c3978AwF.OLrzqt) == 0 && java.lang.Double.compare(this.EZpvd, c3978AwF.EZpvd) == 0 && this.AEQbTJ == c3978AwF.AEQbTJ && java.lang.Double.compare(this.AYXKKw, c3978AwF.AYXKKw) == 0 && java.lang.Double.compare(this.gEmmrt, c3978AwF.gEmmrt) == 0 && this.AhwBna == c3978AwF.AhwBna && this.copydefault == c3978AwF.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((java.lang.Double.hashCode(this.valueOf) * 31) + java.lang.Double.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Double.hashCode(this.KWHzl)) * 31) + java.lang.Double.hashCode(this.OLrzqt)) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Double.hashCode(this.AYXKKw)) * 31) + java.lang.Double.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BlurMethodScores(laplacianScore=" + this.valueOf + ", laplacianThreshold=" + this.fetchVPNInfo + ", laplacianIsBlurry=" + this.djBIcL + ", creteScore=" + this.KWHzl + ", creteRawScore=" + this.OLrzqt + ", creteThreshold=" + this.EZpvd + ", creteIsBlurry=" + this.AEQbTJ + ", gyroMotionPixels=" + this.AYXKKw + ", gyroThreshold=" + this.gEmmrt + ", gyroIsBlurry=" + this.AhwBna + ", gyroAvailable=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double valueOf() {
        return this.AYXKKw;
    }

    public C3978AwF(double d, double d2, boolean z, double d3, double d4, double d5, boolean z2, double d6, double d7, boolean z3, boolean z4) {
        this.valueOf = d;
        this.fetchVPNInfo = d2;
        this.djBIcL = z;
        this.KWHzl = d3;
        this.OLrzqt = d4;
        this.EZpvd = d5;
        this.AEQbTJ = z2;
        this.AYXKKw = d6;
        this.gEmmrt = d7;
        this.AhwBna = z3;
        this.copydefault = z4;
    }
}
