package o;

/* JADX INFO: renamed from: o.blt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10304blt {
    public final long AEQbTJ;
    public final int EZpvd;
    public final int OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C10304blt copy$default(C10304blt c10304blt, int i, int i2, long j, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c10304blt.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c10304blt.OLrzqt;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            j = c10304blt.AEQbTJ;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            z = c10304blt.copydefault;
        }
        return c10304blt.OLrzqt(i, i4, j2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10304blt OLrzqt(int i, int i2, long j, boolean z) {
        return new C10304blt(i, i2, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10304blt)) {
            return false;
        }
        C10304blt c10304blt = (C10304blt) obj;
        return this.EZpvd == c10304blt.EZpvd && this.OLrzqt == c10304blt.OLrzqt && this.AEQbTJ == c10304blt.AEQbTJ && this.copydefault == c10304blt.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUtxoSelectionState(selectionCount=" + this.EZpvd + ", totalUtxoCount=" + this.OLrzqt + ", selectedTokenAmount=" + this.AEQbTJ + ", selectedAll=" + this.copydefault + ")";
    }

    public C10304blt(int i, int i2, long j, boolean z) {
        this.EZpvd = i;
        this.OLrzqt = i2;
        this.AEQbTJ = j;
        this.copydefault = z;
    }
}
