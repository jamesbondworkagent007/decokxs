package o;

/* JADX INFO: renamed from: o.Asv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3810Asv {
    public static final int $stable = 8;
    public double AEQbTJ;
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3810Asv copy$default(C3810Asv c3810Asv, double d, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = c3810Asv.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c3810Asv.EZpvd;
        }
        return c3810Asv.KWHzl(d, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv KWHzl(double d, boolean z) {
        return new C3810Asv(d, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3810Asv)) {
            return false;
        }
        C3810Asv c3810Asv = (C3810Asv) obj;
        return java.lang.Double.compare(this.AEQbTJ, c3810Asv.AEQbTJ) == 0 && this.EZpvd == c3810Asv.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Double.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LimitValue(value=" + this.AEQbTJ + ", enabled=" + this.EZpvd + ")";
    }

    public C3810Asv(double d, boolean z) {
        this.AEQbTJ = d;
        this.EZpvd = z;
    }
}
