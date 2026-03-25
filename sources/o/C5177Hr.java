package o;

/* JADX INFO: renamed from: o.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5177Hr {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5177Hr copy$default(C5177Hr c5177Hr, int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            i = c5177Hr.EZpvd;
        }
        if ((i6 & 2) != 0) {
            i2 = c5177Hr.OLrzqt;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = c5177Hr.KWHzl;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = c5177Hr.copydefault;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = c5177Hr.AEQbTJ;
        }
        return c5177Hr.copydefault(i, i7, i8, i9, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5177Hr copydefault(int i, int i2, int i3, int i4, int i5) {
        return new C5177Hr(i, i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5177Hr)) {
            return false;
        }
        C5177Hr c5177Hr = (C5177Hr) obj;
        return this.EZpvd == c5177Hr.EZpvd && this.OLrzqt == c5177Hr.OLrzqt && this.KWHzl == c5177Hr.KWHzl && this.copydefault == c5177Hr.copydefault && this.AEQbTJ == c5177Hr.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ParsedTime(hour=" + this.EZpvd + ", min=" + this.OLrzqt + ", sec=" + this.KWHzl + ", ns=" + this.copydefault + ", offsetSec=" + this.AEQbTJ + ')';
    }

    public C5177Hr(int i, int i2, int i3, int i4, int i5) {
        this.EZpvd = i;
        this.OLrzqt = i2;
        this.KWHzl = i3;
        this.copydefault = i4;
        this.AEQbTJ = i5;
    }
}
