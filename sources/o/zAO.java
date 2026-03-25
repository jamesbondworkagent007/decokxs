package o;

/* JADX INFO: loaded from: classes25.dex */
public final class zAO {
    public static final int $stable = 8;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zAO copy$default(zAO zao, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = zao.copydefault;
        }
        return zao.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAO AEQbTJ(boolean z) {
        return new zAO(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zAO) && this.copydefault == ((zAO) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CredPropsData(rk=" + this.copydefault + ")";
    }

    public zAO(boolean z) {
        this.copydefault = z;
    }
}
