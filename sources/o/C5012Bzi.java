package o;

/* JADX INFO: renamed from: o.Bzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5012Bzi {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5012Bzi copy$default(C5012Bzi c5012Bzi, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c5012Bzi.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c5012Bzi.KWHzl;
        }
        if ((i & 4) != 0) {
            z3 = c5012Bzi.copydefault;
        }
        if ((i & 8) != 0) {
            z4 = c5012Bzi.AEQbTJ;
        }
        return c5012Bzi.OLrzqt(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5012Bzi OLrzqt(boolean z, boolean z2, boolean z3, boolean z4) {
        return new C5012Bzi(z, z2, z3, z4);
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
        if (!(obj instanceof C5012Bzi)) {
            return false;
        }
        C5012Bzi c5012Bzi = (C5012Bzi) obj;
        return this.EZpvd == c5012Bzi.EZpvd && this.KWHzl == c5012Bzi.KWHzl && this.copydefault == c5012Bzi.copydefault && this.AEQbTJ == c5012Bzi.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubAccountFunction(copyTrading=" + this.EZpvd + ", custodyDelegation=" + this.KWHzl + ", managedTrading=" + this.copydefault + ", visibleToUser=" + this.AEQbTJ + ")";
    }

    public C5012Bzi(boolean z, boolean z2, boolean z3, boolean z4) {
        this.EZpvd = z;
        this.KWHzl = z2;
        this.copydefault = z3;
        this.AEQbTJ = z4;
    }
}
