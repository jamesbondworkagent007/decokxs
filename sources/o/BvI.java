package o;

/* JADX INFO: loaded from: classes14.dex */
public final class BvI {
    public static final int $stable = 8;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BvI copy$default(BvI bvI, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = bvI.copydefault;
        }
        if ((i5 & 2) != 0) {
            i2 = bvI.KWHzl;
        }
        if ((i5 & 4) != 0) {
            i3 = bvI.OLrzqt;
        }
        if ((i5 & 8) != 0) {
            i4 = bvI.EZpvd;
        }
        return bvI.EZpvd(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BvI EZpvd(int i, int i2, int i3, int i4) {
        return new BvI(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BvI)) {
            return false;
        }
        BvI bvI = (BvI) obj;
        return this.copydefault == bvI.copydefault && this.KWHzl == bvI.KWHzl && this.OLrzqt == bvI.OLrzqt && this.EZpvd == bvI.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CorePersonalSetting(chargeUnit=" + this.copydefault + ", upDownColor=" + this.KWHzl + ", upDownTimeZone=" + this.OLrzqt + ", colorPalette=" + this.EZpvd + ")";
    }

    public BvI(int i, int i2, int i3, int i4) {
        this.copydefault = i;
        this.KWHzl = i2;
        this.OLrzqt = i3;
        this.EZpvd = i4;
    }
}
