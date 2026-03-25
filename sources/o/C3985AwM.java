package o;

/* JADX INFO: renamed from: o.AwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3985AwM {
    public static final int $stable = 8;
    public int AEQbTJ;
    public boolean KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3985AwM copy$default(C3985AwM c3985AwM, boolean z, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z = c3985AwM.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i = c3985AwM.AEQbTJ;
        }
        if ((i3 & 4) != 0) {
            i2 = c3985AwM.OLrzqt;
        }
        return c3985AwM.KWHzl(z, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3985AwM KWHzl(boolean z, int i, int i2) {
        return new C3985AwM(z, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3985AwM)) {
            return false;
        }
        C3985AwM c3985AwM = (C3985AwM) obj;
        return this.KWHzl == c3985AwM.KWHzl && this.AEQbTJ == c3985AwM.AEQbTJ && this.OLrzqt == c3985AwM.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GlareCheckBridgeResult(passed=" + this.KWHzl + ", fullGlareCount=" + this.AEQbTJ + ", splitGlareCount=" + this.OLrzqt + ")";
    }

    public C3985AwM(boolean z, int i, int i2) {
        this.KWHzl = z;
        this.AEQbTJ = i;
        this.OLrzqt = i2;
    }
}
