package o;

/* JADX INFO: renamed from: o.yqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57846yqC {
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    public C57846yqC(java.lang.String str, java.lang.String str2) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.AEQbTJ) + ": " + this.OLrzqt;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C57846yqC)) {
            return false;
        }
        C57846yqC c57846yqC = (C57846yqC) obj;
        return c57846yqC.AEQbTJ.equalsIgnoreCase(this.AEQbTJ) && c57846yqC.OLrzqt.equalsIgnoreCase(this.OLrzqt);
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
