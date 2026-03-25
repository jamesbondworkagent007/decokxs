package o;

/* JADX INFO: renamed from: o.rWg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42530rWg {
    public final long AEQbTJ;
    public final long EZpvd;
    public final long KWHzl;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42530rWg copydefault(long j, long j2, long j3, long j4) {
        return new C42530rWg(j, j2, j3, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42530rWg)) {
            return false;
        }
        C42530rWg c42530rWg = (C42530rWg) obj;
        return this.KWHzl == c42530rWg.KWHzl && this.EZpvd == c42530rWg.EZpvd && this.AEQbTJ == c42530rWg.AEQbTJ && this.copydefault == c42530rWg.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LifecycleAPICosts(created=" + this.KWHzl + ", viewCreated=" + this.EZpvd + ", started=" + this.AEQbTJ + ", resumed=" + this.copydefault + ")";
    }

    public C42530rWg(long j, long j2, long j3, long j4) {
        this.KWHzl = j;
        this.EZpvd = j2;
        this.AEQbTJ = j3;
        this.copydefault = j4;
    }
}
