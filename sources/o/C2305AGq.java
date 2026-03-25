package o;

/* JADX INFO: renamed from: o.AGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C2305AGq {
    public static final int $stable = 8;
    public long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2305AGq copy$default(C2305AGq c2305AGq, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c2305AGq.OLrzqt;
        }
        return c2305AGq.KWHzl(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2305AGq KWHzl(long j) {
        return new C2305AGq(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2305AGq) && this.OLrzqt == ((C2305AGq) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Long.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RouteConfig(routerModeType=" + this.OLrzqt + ")";
    }

    public C2305AGq(long j) {
        this.OLrzqt = j;
    }
}
