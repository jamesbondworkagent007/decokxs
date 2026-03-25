package o;

/* JADX INFO: renamed from: o.AwD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3976AwD {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3976AwD copy$default(C3976AwD c3976AwD, double d, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = c3976AwD.copydefault;
        }
        if ((i & 2) != 0) {
            z = c3976AwD.AEQbTJ;
        }
        return c3976AwD.EZpvd(d, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3976AwD EZpvd(double d, boolean z) {
        return new C3976AwD(d, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3976AwD)) {
            return false;
        }
        C3976AwD c3976AwD = (C3976AwD) obj;
        return java.lang.Double.compare(this.copydefault, c3976AwD.copydefault) == 0 && this.AEQbTJ == c3976AwD.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Double.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BlurResult(score=" + this.copydefault + ", isBlurry=" + this.AEQbTJ + ")";
    }

    public C3976AwD(double d, boolean z) {
        this.copydefault = d;
        this.AEQbTJ = z;
    }
}
