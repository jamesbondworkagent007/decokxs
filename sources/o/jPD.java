package o;

/* JADX INFO: loaded from: classes6.dex */
public final class jPD {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jPD copy$default(jPD jpd, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = jpd.AEQbTJ;
        }
        if ((i4 & 2) != 0) {
            i2 = jpd.OLrzqt;
        }
        if ((i4 & 4) != 0) {
            i3 = jpd.EZpvd;
        }
        return jpd.EZpvd(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jPD EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3) {
        return new jPD(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jPD)) {
            return false;
        }
        jPD jpd = (jPD) obj;
        return this.AEQbTJ == jpd.AEQbTJ && this.OLrzqt == jpd.OLrzqt && this.EZpvd == jpd.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DialogInfo(dialogTitle=" + this.AEQbTJ + ", dialogBody=" + this.OLrzqt + ", dialogActionButton=" + this.EZpvd + ")";
    }

    public jPD(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3) {
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
    }
}
