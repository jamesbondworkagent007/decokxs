package o;

/* JADX INFO: renamed from: o.Hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5175Hp {
    public final int AEQbTJ;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5175Hp copy$default(C5175Hp c5175Hp, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c5175Hp.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            i2 = c5175Hp.copydefault;
        }
        if ((i4 & 4) != 0) {
            i3 = c5175Hp.AEQbTJ;
        }
        return c5175Hp.AEQbTJ(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5175Hp AEQbTJ(int i, int i2, int i3) {
        return new C5175Hp(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
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
        if (!(obj instanceof C5175Hp)) {
            return false;
        }
        C5175Hp c5175Hp = (C5175Hp) obj;
        return this.OLrzqt == c5175Hp.OLrzqt && this.copydefault == c5175Hp.copydefault && this.AEQbTJ == c5175Hp.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ParsedDate(year=" + this.OLrzqt + ", month=" + this.copydefault + ", day=" + this.AEQbTJ + ')';
    }

    public C5175Hp(int i, int i2, int i3) {
        this.OLrzqt = i;
        this.copydefault = i2;
        this.AEQbTJ = i3;
    }
}
