package o;

/* JADX INFO: renamed from: o.AwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3995AwW {
    public static final int $stable = 8;
    public long EZpvd;
    public double KWHzl;
    public double OLrzqt;
    public double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3995AwW KWHzl(double d, double d2, double d3, long j) {
        return new C3995AwW(d, d2, d3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3995AwW)) {
            return false;
        }
        C3995AwW c3995AwW = (C3995AwW) obj;
        return java.lang.Double.compare(this.OLrzqt, c3995AwW.OLrzqt) == 0 && java.lang.Double.compare(this.KWHzl, c3995AwW.KWHzl) == 0 && java.lang.Double.compare(this.copydefault, c3995AwW.copydefault) == 0 && this.EZpvd == c3995AwW.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Double.hashCode(this.OLrzqt) * 31) + java.lang.Double.hashCode(this.KWHzl)) * 31) + java.lang.Double.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GyroSample(x=" + this.OLrzqt + ", y=" + this.KWHzl + ", z=" + this.copydefault + ", timestampNs=" + this.EZpvd + ")";
    }

    public C3995AwW(double d, double d2, double d3, long j) {
        this.OLrzqt = d;
        this.KWHzl = d2;
        this.copydefault = d3;
        this.EZpvd = j;
    }
}
