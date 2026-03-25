package o;

/* JADX INFO: renamed from: o.mxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33510mxn {
    public final int EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C33510mxn copy$default(C33510mxn c33510mxn, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c33510mxn.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c33510mxn.OLrzqt;
        }
        return c33510mxn.OLrzqt(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33510mxn OLrzqt(int i, int i2) {
        return new C33510mxn(i, i2);
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
        if (!(obj instanceof C33510mxn)) {
            return false;
        }
        C33510mxn c33510mxn = (C33510mxn) obj;
        return this.EZpvd == c33510mxn.EZpvd && this.OLrzqt == c33510mxn.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ThemePair(defaultThemeId=" + this.EZpvd + ", inverseThemeId=" + this.OLrzqt + ")";
    }

    public C33510mxn(int i, int i2) {
        this.EZpvd = i;
        this.OLrzqt = i2;
    }
}
