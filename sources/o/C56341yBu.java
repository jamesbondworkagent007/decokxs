package o;

/* JADX INFO: renamed from: o.yBu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56341yBu<T> {
    public final float AEQbTJ;
    public T[] EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    public static int AEQbTJ(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object[] copydefault() {
        return this.EZpvd;
    }

    public C56341yBu() {
        this(16, 0.75f);
    }

    public C56341yBu(int i) {
        this(i, 0.75f);
    }

    public C56341yBu(int i, float f) {
        this.AEQbTJ = f;
        int iAEQbTJ = C56343yBw.AEQbTJ(i);
        this.copydefault = iAEQbTJ - 1;
        this.OLrzqt = (int) (f * iAEQbTJ);
        this.EZpvd = (T[]) new java.lang.Object[iAEQbTJ];
    }

    public boolean EZpvd(T t) {
        T t2;
        T[] tArr = this.EZpvd;
        int i = this.copydefault;
        int iAEQbTJ = AEQbTJ(t.hashCode()) & i;
        T t3 = tArr[iAEQbTJ];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iAEQbTJ = (iAEQbTJ + 1) & i;
                t2 = tArr[iAEQbTJ];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iAEQbTJ] = t;
        int i2 = this.KWHzl + 1;
        this.KWHzl = i2;
        if (i2 >= this.OLrzqt) {
            EZpvd();
        }
        return true;
    }

    public boolean copydefault(T t) {
        T t2;
        T[] tArr = this.EZpvd;
        int i = this.copydefault;
        int iAEQbTJ = AEQbTJ(t.hashCode()) & i;
        T t3 = tArr[iAEQbTJ];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return KWHzl(iAEQbTJ, tArr, i);
        }
        do {
            iAEQbTJ = (iAEQbTJ + 1) & i;
            t2 = tArr[iAEQbTJ];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return KWHzl(iAEQbTJ, tArr, i);
    }

    public boolean KWHzl(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.KWHzl--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int iAEQbTJ = AEQbTJ(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= iAEQbTJ || iAEQbTJ > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < iAEQbTJ || iAEQbTJ <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public void EZpvd() {
        T t;
        T[] tArr = this.EZpvd;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new java.lang.Object[i];
        for (int i3 = this.KWHzl; i3 != 0; i3--) {
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iAEQbTJ = AEQbTJ(t.hashCode()) & i2;
            if (tArr2[iAEQbTJ] != null) {
                do {
                    iAEQbTJ = (iAEQbTJ + 1) & i2;
                } while (tArr2[iAEQbTJ] != null);
            }
            tArr2[iAEQbTJ] = tArr[length];
        }
        this.copydefault = i2;
        this.OLrzqt = (int) (i * this.AEQbTJ);
        this.EZpvd = tArr2;
    }
}
