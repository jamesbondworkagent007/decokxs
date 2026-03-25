package o;

/* JADX INFO: loaded from: classes18.dex */
public final class eFM {
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eFM copy$default(eFM efm, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = efm.copydefault;
        }
        return efm.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFM copydefault(boolean z) {
        return new eFM(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eFM) && this.copydefault == ((eFM) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExpandItem(isExpand=" + this.copydefault + ")";
    }

    public eFM(boolean z) {
        this.copydefault = z;
    }
}
