package o;

/* JADX INFO: renamed from: o.iPq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23958iPq {
    public final boolean AEQbTJ;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23958iPq copy$default(C23958iPq c23958iPq, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c23958iPq.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c23958iPq.AEQbTJ;
        }
        return c23958iPq.EZpvd(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23958iPq EZpvd(boolean z, boolean z2) {
        return new C23958iPq(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23958iPq)) {
            return false;
        }
        C23958iPq c23958iPq = (C23958iPq) obj;
        return this.copydefault == c23958iPq.copydefault && this.AEQbTJ == c23958iPq.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3FarmInitialUIBean(isSuccess=" + this.copydefault + ", isNetworkError=" + this.AEQbTJ + ")";
    }

    public C23958iPq(boolean z, boolean z2) {
        this.copydefault = z;
        this.AEQbTJ = z2;
    }
}
