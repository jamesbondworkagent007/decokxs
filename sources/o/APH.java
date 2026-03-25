package o;

/* JADX INFO: loaded from: classes13.dex */
public final class APH {
    public static final int $stable = 8;
    public int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ APH copy$default(APH aph, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = aph.copydefault;
        }
        if ((i5 & 2) != 0) {
            i2 = aph.AEQbTJ;
        }
        if ((i5 & 4) != 0) {
            i3 = aph.EZpvd;
        }
        if ((i5 & 8) != 0) {
            i4 = aph.KWHzl;
        }
        return aph.OLrzqt(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APH OLrzqt(int i, int i2, int i3, int i4) {
        return new APH(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APH)) {
            return false;
        }
        APH aph = (APH) obj;
        return this.copydefault == aph.copydefault && this.AEQbTJ == aph.AEQbTJ && this.EZpvd == aph.EZpvd && this.KWHzl == aph.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Rect(left=" + this.copydefault + ", top=" + this.AEQbTJ + ", right=" + this.EZpvd + ", bottom=" + this.KWHzl + ")";
    }

    public APH(int i, int i2, int i3, int i4) {
        this.copydefault = i;
        this.AEQbTJ = i2;
        this.EZpvd = i3;
        this.KWHzl = i4;
    }
}
