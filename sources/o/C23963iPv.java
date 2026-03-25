package o;

/* JADX INFO: renamed from: o.iPv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23963iPv {
    public final boolean EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23963iPv copy$default(C23963iPv c23963iPv, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c23963iPv.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c23963iPv.EZpvd;
        }
        return c23963iPv.AEQbTJ(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23963iPv AEQbTJ(boolean z, boolean z2) {
        return new C23963iPv(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23963iPv)) {
            return false;
        }
        C23963iPv c23963iPv = (C23963iPv) obj;
        return this.copydefault == c23963iPv.copydefault && this.EZpvd == c23963iPv.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3PageUIBean(isShowInputPage=" + this.copydefault + ", isNeedAnimation=" + this.EZpvd + ")";
    }

    public C23963iPv(boolean z, boolean z2) {
        this.copydefault = z;
        this.EZpvd = z2;
    }
}
