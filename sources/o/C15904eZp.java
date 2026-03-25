package o;

/* JADX INFO: renamed from: o.eZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15904eZp {
    public final int AEQbTJ;
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C15904eZp copy$default(C15904eZp c15904eZp, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c15904eZp.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            z = c15904eZp.EZpvd;
        }
        return c15904eZp.KWHzl(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15904eZp KWHzl(int i, boolean z) {
        return new C15904eZp(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15904eZp)) {
            return false;
        }
        C15904eZp c15904eZp = (C15904eZp) obj;
        return this.AEQbTJ == c15904eZp.AEQbTJ && this.EZpvd == c15904eZp.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PnlTokenHeaderItem(sortType=" + this.AEQbTJ + ", isAsc=" + this.EZpvd + ")";
    }

    public C15904eZp(int i, boolean z) {
        this.AEQbTJ = i;
        this.EZpvd = z;
    }
}
