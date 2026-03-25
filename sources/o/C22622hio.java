package o;

/* JADX INFO: renamed from: o.hio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22622hio implements InterfaceC22618hik {
    public final int EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22622hio copy$default(C22622hio c22622hio, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c22622hio.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c22622hio.OLrzqt;
        }
        return c22622hio.EZpvd(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22618hik
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22622hio EZpvd(int i, int i2) {
        return new C22622hio(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22618hik
    public int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22622hio)) {
            return false;
        }
        C22622hio c22622hio = (C22622hio) obj;
        return this.EZpvd == c22622hio.EZpvd && this.OLrzqt == c22622hio.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavigateEventTab(primaryTab=" + this.EZpvd + ", secondaryTab=" + this.OLrzqt + ")";
    }

    public C22622hio(int i, int i2) {
        this.EZpvd = i;
        this.OLrzqt = i2;
    }
}
