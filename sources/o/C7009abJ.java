package o;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: o.abJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7009abJ {
    public long[] AhwBna;
    public long[] KWHzl;
    public int copydefault;
    public int valueOf;
    public static final int[] OLrzqt = {61, 127, 509, PointerIconCompat.TYPE_GRABBING, 2039, 4093, 8191, 16381, 32749, 65521, 131071, 262139};
    public static long EZpvd = Long.MIN_VALUE;
    public int AEQbTJ = 0;
    public int djBIcL = 0;

    public C7009abJ() {
        int i = OLrzqt[0];
        this.copydefault = i;
        this.valueOf = (i * 3) / 4;
        this.KWHzl = new long[i];
        this.AhwBna = new long[i];
        KWHzl(i);
    }

    public final void KWHzl(int i) {
        this.KWHzl = new long[i];
        this.AhwBna = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.AhwBna[i2] = EZpvd;
        }
        this.copydefault = i;
        this.valueOf = (int) (((double) i) * 0.75d);
        this.djBIcL = 0;
    }

    public long OLrzqt(long j) {
        long j2;
        synchronized (this) {
            j2 = this.AhwBna[copydefault(j)];
        }
        return j2;
    }

    public void copydefault(long j, long j2) {
        synchronized (this) {
            if (this.djBIcL >= this.valueOf) {
                OLrzqt();
            }
            int iCopydefault = copydefault(j);
            this.KWHzl[iCopydefault] = j;
            this.AhwBna[iCopydefault] = j2;
            this.djBIcL++;
        }
    }

    public final int copydefault(long j) {
        int iKWHzl = KWHzl(j);
        int iAEQbTJ = 0;
        while (this.AhwBna[iKWHzl] != EZpvd && this.KWHzl[iKWHzl] != j) {
            if (iAEQbTJ == 0) {
                iAEQbTJ = AEQbTJ(j);
            }
            iKWHzl = (iKWHzl + iAEQbTJ) % this.copydefault;
        }
        return iKWHzl;
    }

    public final void OLrzqt() {
        int i;
        int i2 = this.copydefault;
        long[] jArr = this.KWHzl;
        long[] jArr2 = this.AhwBna;
        int i3 = this.AEQbTJ;
        int[] iArr = OLrzqt;
        if (i3 < iArr.length - 1) {
            int i4 = i3 + 1;
            this.AEQbTJ = i4;
            i = iArr[i4];
        } else {
            i = (i2 * 2) + 1;
        }
        this.copydefault = i;
        this.djBIcL = 0;
        KWHzl(this.copydefault);
        for (int i5 = 0; i5 < i2; i5++) {
            long j = jArr2[i5];
            if (j != EZpvd) {
                copydefault(jArr[i5], j);
            }
        }
    }

    public final int KWHzl(long j) {
        int i = this.copydefault;
        int i2 = (int) (((j * 15821) + 1) % ((long) i));
        return i2 < 0 ? i2 + i : i2;
    }

    public final int AEQbTJ(long j) {
        int i = this.copydefault - 2;
        return i - ((int) (j % ((long) i)));
    }
}
