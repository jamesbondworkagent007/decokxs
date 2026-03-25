package o;

/* JADX INFO: renamed from: o.adY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7104adY {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.KWHzl;
    }

    public C7104adY(java.lang.String str, java.lang.String str2) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
        EZpvd(0);
    }

    public java.lang.String valueOf() {
        if (EZpvd()) {
            int i = this.copydefault + 1;
            this.KWHzl = i;
            int iAEQbTJ = AEQbTJ(i);
            this.copydefault = iAEQbTJ;
            this.AYXKKw = this.EZpvd.substring(this.KWHzl, iAEQbTJ);
        } else {
            this.KWHzl = this.copydefault;
            this.AYXKKw = null;
            this.OLrzqt = true;
        }
        return this.AYXKKw;
    }

    public boolean EZpvd() {
        return this.copydefault < this.EZpvd.length();
    }

    public C7104adY EZpvd(int i) {
        if (i > this.EZpvd.length()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.KWHzl = i;
        int iAEQbTJ = AEQbTJ(i);
        this.copydefault = iAEQbTJ;
        this.AYXKKw = this.EZpvd.substring(this.KWHzl, iAEQbTJ);
        this.OLrzqt = false;
        return this;
    }

    public final int AEQbTJ(int i) {
        loop0: while (i < this.EZpvd.length()) {
            char cCharAt = this.EZpvd.charAt(i);
            for (int i2 = 0; i2 < this.AEQbTJ.length(); i2++) {
                if (cCharAt == this.AEQbTJ.charAt(i2)) {
                    break loop0;
                }
            }
            i++;
        }
        return i;
    }
}
