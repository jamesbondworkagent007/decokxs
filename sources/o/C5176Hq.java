package o;

/* JADX INFO: renamed from: o.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5176Hq {
    public final int AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final int djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5176Hq OLrzqt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new C5176Hq(i, i2, i3, i4, i5, i6, i7, i8);
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
        if (!(obj instanceof C5176Hq)) {
            return false;
        }
        C5176Hq c5176Hq = (C5176Hq) obj;
        return this.AYXKKw == c5176Hq.AYXKKw && this.AEQbTJ == c5176Hq.AEQbTJ && this.KWHzl == c5176Hq.KWHzl && this.copydefault == c5176Hq.copydefault && this.EZpvd == c5176Hq.EZpvd && this.AhwBna == c5176Hq.AhwBna && this.OLrzqt == c5176Hq.OLrzqt && this.djBIcL == c5176Hq.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.AYXKKw) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ParsedDatetime(year=" + this.AYXKKw + ", month=" + this.AEQbTJ + ", day=" + this.KWHzl + ", hour=" + this.copydefault + ", min=" + this.EZpvd + ", sec=" + this.AhwBna + ", ns=" + this.OLrzqt + ", offsetSec=" + this.djBIcL + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AhwBna;
    }

    public C5176Hq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.AYXKKw = i;
        this.AEQbTJ = i2;
        this.KWHzl = i3;
        this.copydefault = i4;
        this.EZpvd = i5;
        this.AhwBna = i6;
        this.OLrzqt = i7;
        this.djBIcL = i8;
    }
}
