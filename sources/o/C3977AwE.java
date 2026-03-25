package o;

/* JADX INFO: renamed from: o.AwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3977AwE {
    public static final int $stable = 8;
    public double AEQbTJ;
    public double EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3977AwE copy$default(C3977AwE c3977AwE, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = c3977AwE.AEQbTJ;
        }
        if ((i & 2) != 0) {
            d2 = c3977AwE.EZpvd;
        }
        return c3977AwE.copydefault(d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3977AwE copydefault(double d, double d2) {
        return new C3977AwE(d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3977AwE)) {
            return false;
        }
        C3977AwE c3977AwE = (C3977AwE) obj;
        return java.lang.Double.compare(this.AEQbTJ, c3977AwE.AEQbTJ) == 0 && java.lang.Double.compare(this.EZpvd, c3977AwE.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Double.hashCode(this.AEQbTJ) * 31) + java.lang.Double.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BrightnessResult(averageBrightness=" + this.AEQbTJ + ", maxBrightness=" + this.EZpvd + ")";
    }

    public C3977AwE(double d, double d2) {
        this.AEQbTJ = d;
        this.EZpvd = d2;
    }
}
