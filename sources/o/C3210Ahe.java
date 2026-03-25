package o;

/* JADX INFO: renamed from: o.Ahe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3210Ahe {
    public static final int $stable = 8;
    public int AEQbTJ;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3210Ahe copy$default(C3210Ahe c3210Ahe, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c3210Ahe.AEQbTJ;
        }
        if ((i3 & 2) != 0) {
            i2 = c3210Ahe.OLrzqt;
        }
        return c3210Ahe.EZpvd(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3210Ahe EZpvd(int i, int i2) {
        return new C3210Ahe(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3210Ahe)) {
            return false;
        }
        C3210Ahe c3210Ahe = (C3210Ahe) obj;
        return this.AEQbTJ == c3210Ahe.AEQbTJ && this.OLrzqt == c3210Ahe.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TwoFactorCodeRequirement(behavior=" + this.AEQbTJ + ", codeType=" + this.OLrzqt + ")";
    }

    public C3210Ahe(int i, int i2) {
        this.AEQbTJ = i;
        this.OLrzqt = i2;
    }
}
