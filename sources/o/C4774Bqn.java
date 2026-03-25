package o;

/* JADX INFO: renamed from: o.Bqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4774Bqn {
    public static final int $stable = 8;
    public int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4774Bqn copy$default(C4774Bqn c4774Bqn, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = c4774Bqn.EZpvd;
        }
        if ((i5 & 2) != 0) {
            i2 = c4774Bqn.KWHzl;
        }
        if ((i5 & 4) != 0) {
            i3 = c4774Bqn.OLrzqt;
        }
        if ((i5 & 8) != 0) {
            i4 = c4774Bqn.AEQbTJ;
        }
        return c4774Bqn.OLrzqt(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4774Bqn OLrzqt(int i, int i2, int i3, int i4) {
        return new C4774Bqn(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4774Bqn)) {
            return false;
        }
        C4774Bqn c4774Bqn = (C4774Bqn) obj;
        return this.EZpvd == c4774Bqn.EZpvd && this.KWHzl == c4774Bqn.KWHzl && this.OLrzqt == c4774Bqn.OLrzqt && this.AEQbTJ == c4774Bqn.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserSettings(chargeUnit=" + this.EZpvd + ", upDownColor=" + this.KWHzl + ", upDownTimeZone=" + this.OLrzqt + ", colorPalette=" + this.AEQbTJ + ")";
    }

    public C4774Bqn(int i, int i2, int i3, int i4) {
        this.EZpvd = i;
        this.KWHzl = i2;
        this.OLrzqt = i3;
        this.AEQbTJ = i4;
    }
}
