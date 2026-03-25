package o;

/* JADX INFO: renamed from: o.AvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3921AvB {
    public static final int $stable = 8;
    public double AEQbTJ;
    public boolean EZpvd;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3921AvB copy$default(C3921AvB c3921AvB, double d, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = c3921AvB.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c3921AvB.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = c3921AvB.copydefault;
        }
        return c3921AvB.OLrzqt(d, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3921AvB OLrzqt(double d, boolean z, boolean z2) {
        return new C3921AvB(d, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3921AvB)) {
            return false;
        }
        C3921AvB c3921AvB = (C3921AvB) obj;
        return java.lang.Double.compare(this.AEQbTJ, c3921AvB.AEQbTJ) == 0 && this.EZpvd == c3921AvB.EZpvd && this.copydefault == c3921AvB.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Double.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeLimitInfo(value=" + this.AEQbTJ + ", inclusive=" + this.EZpvd + ", enabled=" + this.copydefault + ")";
    }

    public C3921AvB(double d, boolean z, boolean z2) {
        this.AEQbTJ = d;
        this.EZpvd = z;
        this.copydefault = z2;
    }
}
