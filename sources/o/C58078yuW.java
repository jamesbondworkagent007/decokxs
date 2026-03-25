package o;

/* JADX INFO: renamed from: o.yuW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58078yuW implements InterfaceC58080yuY {
    public boolean EZpvd;
    public final long OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58080yuY
    public boolean getShouldBackoff() {
        return this.EZpvd;
    }

    public C58078yuW(long j, long j2) {
        this.OLrzqt = j;
        this.copydefault = j2;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException(("initialDurationMillis, " + j + ", must be positive").toString());
        }
        if (j2 > 0) {
            this.EZpvd = true;
            return;
        }
        throw new java.lang.IllegalArgumentException(("maxDurationMillis, " + j2 + ", must be positive").toString());
    }

    @Override // o.InterfaceC58080yuY
    public long backoffDurationMillisAt(int i) {
        return (long) java.lang.Math.min(this.copydefault, this.OLrzqt * java.lang.Math.pow(2.0d, i));
    }
}
