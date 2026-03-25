package o;

/* JADX INFO: renamed from: o.vSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50546vSk {
    public final boolean AEQbTJ;
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C50546vSk copy$default(C50546vSk c50546vSk, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c50546vSk.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c50546vSk.AEQbTJ;
        }
        return c50546vSk.KWHzl(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C50546vSk KWHzl(boolean z, boolean z2) {
        return new C50546vSk(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd && this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50546vSk)) {
            return false;
        }
        C50546vSk c50546vSk = (C50546vSk) obj;
        return this.EZpvd == c50546vSk.EZpvd && this.AEQbTJ == c50546vSk.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "XYValidation(isMoreThanLowerBounds=" + this.EZpvd + ", isLessThanUpperBounds=" + this.AEQbTJ + ")";
    }

    public C50546vSk(boolean z, boolean z2) {
        this.EZpvd = z;
        this.AEQbTJ = z2;
    }
}
