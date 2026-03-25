package o;

/* JADX INFO: renamed from: o.xWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54817xWk {
    public final long EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54817xWk copy$default(C54817xWk c54817xWk, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c54817xWk.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c54817xWk.copydefault;
        }
        return c54817xWk.OLrzqt(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54817xWk OLrzqt(long j, boolean z) {
        return new C54817xWk(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54817xWk)) {
            return false;
        }
        C54817xWk c54817xWk = (C54817xWk) obj;
        return this.EZpvd == c54817xWk.EZpvd && this.copydefault == c54817xWk.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StateEvent(timestamp=" + this.EZpvd + ", isBackground=" + this.copydefault + ")";
    }

    public C54817xWk(long j, boolean z) {
        this.EZpvd = j;
        this.copydefault = z;
    }
}
