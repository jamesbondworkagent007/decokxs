package o;

/* JADX INFO: renamed from: o.fMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17637fMs {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C17637fMs copy$default(C17637fMs c17637fMs, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c17637fMs.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = c17637fMs.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z3 = c17637fMs.EZpvd;
        }
        return c17637fMs.copydefault(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17637fMs copydefault(boolean z, boolean z2, boolean z3) {
        return new C17637fMs(z, z2, z3);
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
        if (!(obj instanceof C17637fMs)) {
            return false;
        }
        C17637fMs c17637fMs = (C17637fMs) obj;
        return this.KWHzl == c17637fMs.KWHzl && this.AEQbTJ == c17637fMs.AEQbTJ && this.EZpvd == c17637fMs.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecoveryPreCheckInfo(isOverRecoverLimit=" + this.KWHzl + ", existRecoveringProcess=" + this.AEQbTJ + ", hasActiveLimitOrder=" + this.EZpvd + ")";
    }

    public C17637fMs(boolean z, boolean z2, boolean z3) {
        this.KWHzl = z;
        this.AEQbTJ = z2;
        this.EZpvd = z3;
    }
}
