package o;

/* JADX INFO: renamed from: o.adu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7126adu {
    public final int[] KWHzl;
    public final byte OLrzqt;
    public final boolean copydefault;

    public static C7126adu copydefault(float f, C7080adA c7080adA) {
        EZpvd(f);
        return new C7126adu(0, false, f, c7080adA);
    }

    public static C7126adu KWHzl(float f, C7080adA c7080adA) {
        EZpvd(f);
        return new C7126adu(2, false, f, c7080adA);
    }

    public static C7126adu EZpvd(float f, C7080adA c7080adA) {
        EZpvd(f);
        return new C7126adu(1, false, f, c7080adA);
    }

    public C7126adu OLrzqt(float f, C7080adA c7080adA) {
        EZpvd(f);
        return OLrzqt(c7080adA, f);
    }

    public C7126adu KWHzl() {
        return OLrzqt(true);
    }

    public C7126adu EZpvd() {
        return OLrzqt(false);
    }

    public C7126adu copydefault(boolean z) {
        return OLrzqt(!z);
    }

    public boolean AEQbTJ() {
        int i = 0;
        while (true) {
            int[] iArr = this.KWHzl;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != 0) {
                return true;
            }
            i++;
        }
    }

    public boolean equals(java.lang.Object obj) {
        try {
            return EZpvd((C7126adu) obj);
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public boolean EZpvd(C7126adu c7126adu) {
        if (c7126adu == null || this.OLrzqt != c7126adu.OLrzqt || this.copydefault != c7126adu.copydefault) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.KWHzl;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != c7126adu.KWHzl[i]) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = (this.OLrzqt << 1) | (this.copydefault ? 1 : 0);
        int i2 = 0;
        while (true) {
            int[] iArr = this.KWHzl;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i << 2) ^ iArr[i2];
            i2++;
        }
    }

    public C7126adu(int i, boolean z, float f, C7080adA c7080adA) {
        this.OLrzqt = (byte) i;
        this.copydefault = z;
        int[] iArr = new int[C7080adA.AYXKKw.length];
        this.KWHzl = iArr;
        iArr[c7080adA.isConnected] = ((int) (f * 1000.0f)) + 1;
    }

    public C7126adu(int i, boolean z, int[] iArr) {
        this.OLrzqt = (byte) i;
        this.copydefault = z;
        this.KWHzl = iArr;
    }

    public final C7126adu OLrzqt(C7080adA c7080adA, float f) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException("value: " + f);
        }
        return copydefault(c7080adA, ((int) (f * 1000.0f)) + 1);
    }

    public final C7126adu copydefault(C7080adA c7080adA, int i) {
        byte b = c7080adA.isConnected;
        int[] iArr = this.KWHzl;
        if (iArr[b] == i) {
            return this;
        }
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int[] iArr3 = this.KWHzl;
            if (i2 < iArr3.length) {
                iArr2[i2] = iArr3[i2];
                i2++;
            } else {
                iArr2[b] = i;
                return new C7126adu(this.OLrzqt, this.copydefault, iArr2);
            }
        }
    }

    public final C7126adu OLrzqt(boolean z) {
        return this.copydefault != z ? new C7126adu(this.OLrzqt, z, this.KWHzl) : this;
    }

    public static void EZpvd(float f) {
        if (f >= 0.0f) {
            return;
        }
        throw new java.lang.IllegalArgumentException("count (" + f + ") cannot be negative");
    }
}
