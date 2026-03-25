package o;

/* JADX INFO: renamed from: o.ApH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3611ApH {
    public static final int $stable = 8;
    public double EZpvd;
    public double KWHzl;
    public double copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3611ApH copy$default(C3611ApH c3611ApH, double d, double d2, double d3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = c3611ApH.KWHzl;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = c3611ApH.EZpvd;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = c3611ApH.copydefault;
        }
        return c3611ApH.OLrzqt(d4, d5, d3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3611ApH OLrzqt(double d, double d2, double d3) {
        return new C3611ApH(d, d2, d3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3611ApH)) {
            return false;
        }
        C3611ApH c3611ApH = (C3611ApH) obj;
        return java.lang.Double.compare(this.KWHzl, c3611ApH.KWHzl) == 0 && java.lang.Double.compare(this.EZpvd, c3611ApH.EZpvd) == 0 && java.lang.Double.compare(this.copydefault, c3611ApH.copydefault) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Double.hashCode(this.KWHzl) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + java.lang.Double.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuyInputAmounts(inputAmount=" + this.KWHzl + ", inputQuote=" + this.EZpvd + ", balance=" + this.copydefault + ")";
    }

    public C3611ApH(double d, double d2, double d3) {
        this.KWHzl = d;
        this.EZpvd = d2;
        this.copydefault = d3;
    }
}
