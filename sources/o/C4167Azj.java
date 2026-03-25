package o;

/* JADX INFO: renamed from: o.Azj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4167Azj {
    public static final int $stable = 8;
    public double AEQbTJ;
    public int EZpvd;
    public boolean OLrzqt;
    public double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4167Azj copy$default(C4167Azj c4167Azj, double d, double d2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            d = c4167Azj.AEQbTJ;
        }
        double d3 = d;
        if ((i2 & 2) != 0) {
            d2 = c4167Azj.copydefault;
        }
        double d4 = d2;
        if ((i2 & 4) != 0) {
            i = c4167Azj.EZpvd;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = c4167Azj.OLrzqt;
        }
        return c4167Azj.copydefault(d3, d4, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4167Azj copydefault(double d, double d2, int i, boolean z) {
        return new C4167Azj(d, d2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4167Azj)) {
            return false;
        }
        C4167Azj c4167Azj = (C4167Azj) obj;
        return java.lang.Double.compare(this.AEQbTJ, c4167Azj.AEQbTJ) == 0 && java.lang.Double.compare(this.copydefault, c4167Azj.copydefault) == 0 && this.EZpvd == c4167Azj.EZpvd && this.OLrzqt == c4167Azj.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Double.hashCode(this.AEQbTJ) * 31) + java.lang.Double.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MotionBlurResult(blurPixels=" + this.AEQbTJ + ", totalRotationRad=" + this.copydefault + ", sampleCount=" + this.EZpvd + ", isReliable=" + this.OLrzqt + ")";
    }

    public C4167Azj(double d, double d2, int i, boolean z) {
        this.AEQbTJ = d;
        this.copydefault = d2;
        this.EZpvd = i;
        this.OLrzqt = z;
    }
}
