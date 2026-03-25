package o;

/* JADX INFO: renamed from: o.qVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40432qVq {
    public static final int copydefault = 0;
    public final long AEQbTJ;
    public final long EZpvd = android.os.SystemClock.elapsedRealtime();
    public final long KWHzl;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40432qVq copy$default(C40432qVq c40432qVq, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c40432qVq.OLrzqt;
        }
        if ((i & 2) != 0) {
            j2 = c40432qVq.KWHzl;
        }
        return c40432qVq.AEQbTJ(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40432qVq AEQbTJ(long j, long j2) {
        return new C40432qVq(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.OLrzqt) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReliableCountdown(expireMillis=" + this.OLrzqt + ", trustedNow=" + this.KWHzl + ")";
    }

    public C40432qVq(long j, long j2) {
        this.OLrzqt = j;
        this.KWHzl = j2;
        this.AEQbTJ = j - j2;
    }

    public final long KWHzl() {
        return C56548yJl.copydefault(this.AEQbTJ - (android.os.SystemClock.elapsedRealtime() - this.EZpvd), 0L);
    }

    public final boolean copydefault() {
        return KWHzl() <= 0;
    }

    public final long AEQbTJ() {
        return java.lang.System.currentTimeMillis() + KWHzl();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C40432qVq) && this.AEQbTJ == ((C40432qVq) obj).AEQbTJ;
    }
}
