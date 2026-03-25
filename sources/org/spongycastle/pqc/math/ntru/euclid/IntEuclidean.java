package org.spongycastle.pqc.math.ntru.euclid;

/* JADX INFO: loaded from: classes25.dex */
public class IntEuclidean {
    public int gcd;
    public int x;
    public int y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i2 != 0) {
            int i7 = i / i2;
            int i8 = i6 - (i7 * i5);
            int i9 = i2;
            i2 = i % i2;
            i = i9;
            int i10 = i4;
            i4 = i3 - (i7 * i4);
            i3 = i10;
            i6 = i5;
            i5 = i8;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.x = i6;
        intEuclidean.y = i3;
        intEuclidean.gcd = i;
        return intEuclidean;
    }
}
