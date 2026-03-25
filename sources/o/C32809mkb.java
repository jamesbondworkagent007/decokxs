package o;

/* JADX INFO: renamed from: o.mkb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32809mkb {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32809mkb copy$default(C32809mkb c32809mkb, int i, boolean z, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c32809mkb.KWHzl;
        }
        if ((i2 & 2) != 0) {
            z = c32809mkb.EZpvd;
        }
        if ((i2 & 4) != 0) {
            z2 = c32809mkb.AEQbTJ;
        }
        if ((i2 & 8) != 0) {
            z3 = c32809mkb.OLrzqt;
        }
        return c32809mkb.copydefault(i, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32809mkb copydefault(int i, boolean z, boolean z2, boolean z3) {
        return new C32809mkb(i, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32809mkb)) {
            return false;
        }
        C32809mkb c32809mkb = (C32809mkb) obj;
        return this.KWHzl == c32809mkb.KWHzl && this.EZpvd == c32809mkb.EZpvd && this.AEQbTJ == c32809mkb.AEQbTJ && this.OLrzqt == c32809mkb.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ScanItemStateInfo(scanType=" + this.KWHzl + ", isCompleted=" + this.EZpvd + ", hasRisk=" + this.AEQbTJ + ", hasStarted=" + this.OLrzqt + ")";
    }

    public C32809mkb(int i, boolean z, boolean z2, boolean z3) {
        this.KWHzl = i;
        this.EZpvd = z;
        this.AEQbTJ = z2;
        this.OLrzqt = z3;
    }
}
