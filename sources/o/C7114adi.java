package o;

/* JADX INFO: renamed from: o.adi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7114adi {
    public int[] KWHzl = new int[32];
    public int OLrzqt = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.OLrzqt == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.OLrzqt = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[] OLrzqt() {
        return this.KWHzl;
    }

    public int OLrzqt(int i) {
        return this.KWHzl[i];
    }

    public void copydefault(int i) {
        copydefault();
        int[] iArr = this.KWHzl;
        int i2 = this.OLrzqt;
        this.OLrzqt = i2 + 1;
        iArr[i2] = i;
    }

    public final void copydefault() {
        int i = this.OLrzqt;
        int[] iArr = this.KWHzl;
        if (i >= iArr.length) {
            int[] iArr2 = new int[iArr.length <= 65535 ? iArr.length * 4 : iArr.length * 2];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            this.KWHzl = iArr2;
        }
    }
}
