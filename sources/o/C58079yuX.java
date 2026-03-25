package o;

/* JADX INFO: renamed from: o.yuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58079yuX implements InterfaceC58080yuY {
    public boolean AEQbTJ;
    public final long KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58080yuY
    public long backoffDurationMillisAt(int i) {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58080yuY
    public boolean getShouldBackoff() {
        return this.AEQbTJ;
    }

    public C58079yuX(long j) {
        this.KWHzl = j;
        if (j > 0) {
            this.AEQbTJ = true;
            return;
        }
        throw new java.lang.IllegalArgumentException(("durationMillis, " + j + ", must be positive").toString());
    }
}
