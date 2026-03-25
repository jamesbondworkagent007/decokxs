package o;

/* JADX INFO: loaded from: classes5.dex */
public final class gFH {
    public final boolean AEQbTJ;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ gFH copy$default(gFH gfh, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = gfh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            j = gfh.copydefault;
        }
        return gfh.copydefault(z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gFH copydefault(boolean z, long j) {
        return new gFH(z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gFH)) {
            return false;
        }
        gFH gfh = (gFH) obj;
        return this.AEQbTJ == gfh.AEQbTJ && this.copydefault == gfh.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UtxoRefreshEvent(isWalletSupported=" + this.AEQbTJ + ", chainId=" + this.copydefault + ")";
    }

    public gFH(boolean z, long j) {
        this.AEQbTJ = z;
        this.copydefault = j;
    }
}
