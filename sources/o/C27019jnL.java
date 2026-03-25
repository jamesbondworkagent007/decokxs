package o;

/* JADX INFO: renamed from: o.jnL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27019jnL {
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27019jnL copy$default(C27019jnL c27019jnL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c27019jnL.OLrzqt;
        }
        return c27019jnL.EZpvd(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27019jnL EZpvd(boolean z) {
        return new C27019jnL(z);
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
        return (obj instanceof C27019jnL) && this.OLrzqt == ((C27019jnL) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Univ3PriceRangeUpdateBean(forceUpdate=" + this.OLrzqt + ")";
    }

    public C27019jnL(boolean z) {
        this.OLrzqt = z;
    }
}
