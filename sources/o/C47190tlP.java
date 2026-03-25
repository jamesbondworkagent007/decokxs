package o;

/* JADX INFO: renamed from: o.tlP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47190tlP {
    public final int AEQbTJ;
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47190tlP copy$default(C47190tlP c47190tlP, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c47190tlP.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c47190tlP.AEQbTJ;
        }
        return c47190tlP.OLrzqt(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47190tlP OLrzqt(int i, int i2) {
        return new C47190tlP(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47190tlP)) {
            return false;
        }
        C47190tlP c47190tlP = (C47190tlP) obj;
        return this.EZpvd == c47190tlP.EZpvd && this.AEQbTJ == c47190tlP.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Position(start=" + this.EZpvd + ", end=" + this.AEQbTJ + ")";
    }

    public C47190tlP(int i, int i2) {
        this.EZpvd = i;
        this.AEQbTJ = i2;
    }
}
