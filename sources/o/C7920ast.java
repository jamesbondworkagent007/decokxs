package o;

/* JADX INFO: renamed from: o.ast, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C7920ast {
    public static final int[] KWHzl = new int[0];
    public static final long[] OLrzqt = new long[0];

    public static int OLrzqt(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static int AEQbTJ(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int[] EZpvd(int[] iArr, int i, int i2, int i3) {
        if (i + 1 <= iArr.length) {
            java.lang.System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
            iArr[i2] = i3;
            return iArr;
        }
        int[] iArr2 = new int[OLrzqt(i)];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
        iArr2[i2] = i3;
        java.lang.System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
        return iArr2;
    }

    public static long[] copydefault(long[] jArr, int i, int i2, long j) {
        if (i + 1 <= jArr.length) {
            java.lang.System.arraycopy(jArr, i2, jArr, i2 + 1, i - i2);
            jArr[i2] = j;
            return jArr;
        }
        long[] jArr2 = new long[OLrzqt(i)];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, i2);
        jArr2[i2] = j;
        java.lang.System.arraycopy(jArr, i2, jArr2, i2 + 1, jArr.length - i2);
        return jArr2;
    }
}
