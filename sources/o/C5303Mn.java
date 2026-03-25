package o;

/* JADX INFO: renamed from: o.Mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5303Mn {
    public final long AEQbTJ;
    public final float EZpvd;
    public final long KWHzl;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5303Mn KWHzl(long j, long j2, long j3, float f) {
        return new C5303Mn(j, j2, j3, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5303Mn)) {
            return false;
        }
        C5303Mn c5303Mn = (C5303Mn) obj;
        return this.KWHzl == c5303Mn.KWHzl && this.OLrzqt == c5303Mn.OLrzqt && this.AEQbTJ == c5303Mn.AEQbTJ && java.lang.Float.compare(this.EZpvd, c5303Mn.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Float.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BackoffConfig(attempts=" + this.KWHzl + ", min=" + this.OLrzqt + ", max=" + this.AEQbTJ + ", scalar=" + this.EZpvd + ')';
    }

    public C5303Mn(long j, long j2, long j3, float f) {
        this.KWHzl = j;
        this.OLrzqt = j2;
        this.AEQbTJ = j3;
        this.EZpvd = f;
    }
}
