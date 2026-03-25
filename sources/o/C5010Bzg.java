package o;

/* JADX INFO: renamed from: o.Bzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5010Bzg {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5010Bzg copy$default(C5010Bzg c5010Bzg, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c5010Bzg.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c5010Bzg.copydefault;
        }
        if ((i & 4) != 0) {
            z3 = c5010Bzg.KWHzl;
        }
        if ((i & 8) != 0) {
            z4 = c5010Bzg.AEQbTJ;
        }
        return c5010Bzg.EZpvd(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5010Bzg EZpvd(boolean z, boolean z2, boolean z3, boolean z4) {
        return new C5010Bzg(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5010Bzg)) {
            return false;
        }
        C5010Bzg c5010Bzg = (C5010Bzg) obj;
        return this.EZpvd == c5010Bzg.EZpvd && this.copydefault == c5010Bzg.copydefault && this.KWHzl == c5010Bzg.KWHzl && this.AEQbTJ == c5010Bzg.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RbacFeatures(isRoleBasedAdmin=" + this.EZpvd + ", isRoleBasedUser=" + this.copydefault + ", isMainAccountApprover=" + this.KWHzl + ", isMainAccountWithdrawalInitiator=" + this.AEQbTJ + ")";
    }

    public C5010Bzg(boolean z, boolean z2, boolean z3, boolean z4) {
        this.EZpvd = z;
        this.copydefault = z2;
        this.KWHzl = z3;
        this.AEQbTJ = z4;
    }
}
