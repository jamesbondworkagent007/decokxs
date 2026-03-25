package o;

/* JADX INFO: loaded from: classes8.dex */
public final class oRU {
    public final double KWHzl;
    public final double OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ oRU copy$default(oRU oru, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = oru.KWHzl;
        }
        if ((i & 2) != 0) {
            d2 = oru.OLrzqt;
        }
        return oru.copydefault(d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oRU copydefault(double d, double d2) {
        return new oRU(d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oRU)) {
            return false;
        }
        oRU oru = (oRU) obj;
        return java.lang.Double.compare(this.KWHzl, oru.KWHzl) == 0 && java.lang.Double.compare(this.OLrzqt, oru.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Double.hashCode(this.KWHzl) * 31) + java.lang.Double.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PriceVolumeData(price=" + this.KWHzl + ", volume=" + this.OLrzqt + ")";
    }

    public oRU(double d, double d2) {
        this.KWHzl = d;
        this.OLrzqt = d2;
    }
}
