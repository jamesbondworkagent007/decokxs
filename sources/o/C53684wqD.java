package o;

/* JADX INFO: renamed from: o.wqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53684wqD {
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C53684wqD copy$default(C53684wqD c53684wqD, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c53684wqD.OLrzqt;
        }
        if ((i & 2) != 0) {
            z2 = c53684wqD.copydefault;
        }
        return c53684wqD.KWHzl(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53684wqD KWHzl(boolean z, boolean z2) {
        return new C53684wqD(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof C53684wqD)) {
            return false;
        }
        C53684wqD c53684wqD = (C53684wqD) obj;
        return this.OLrzqt == c53684wqD.OLrzqt && this.copydefault == c53684wqD.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PreviewState(isInPreview=" + this.OLrzqt + ", needEditIconPadding=" + this.copydefault + ")";
    }

    public C53684wqD(boolean z, boolean z2) {
        this.OLrzqt = z;
        this.copydefault = z2;
    }
}
