package o;

/* JADX INFO: renamed from: o.fhd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18397fhd {
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18397fhd copy$default(C18397fhd c18397fhd, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c18397fhd.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            i2 = c18397fhd.copydefault;
        }
        return c18397fhd.KWHzl(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18397fhd KWHzl(int i, int i2) {
        return new C18397fhd(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18397fhd)) {
            return false;
        }
        C18397fhd c18397fhd = (C18397fhd) obj;
        return this.OLrzqt == c18397fhd.OLrzqt && this.copydefault == c18397fhd.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CloudBackupStatusBean(status=" + this.OLrzqt + ", walletCount=" + this.copydefault + ")";
    }

    public C18397fhd(int i, int i2) {
        this.OLrzqt = i;
        this.copydefault = i2;
    }
}
