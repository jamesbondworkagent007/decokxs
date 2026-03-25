package o;

/* JADX INFO: loaded from: classes6.dex */
public final class iZH {
    public final boolean AEQbTJ;
    public final boolean KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ iZH copy$default(iZH izh, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = izh.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = izh.OLrzqt;
        }
        if ((i & 4) != 0) {
            z3 = izh.AEQbTJ;
        }
        return izh.KWHzl(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iZH KWHzl(boolean z, boolean z2, boolean z3) {
        return new iZH(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iZH)) {
            return false;
        }
        iZH izh = (iZH) obj;
        return this.KWHzl == izh.KWHzl && this.OLrzqt == izh.OLrzqt && this.AEQbTJ == izh.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExpandState(canExpand=" + this.KWHzl + ", shouldShowIndicator=" + this.OLrzqt + ", shouldShowContent=" + this.AEQbTJ + ")";
    }

    public iZH(boolean z, boolean z2, boolean z3) {
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.AEQbTJ = z3;
    }
}
