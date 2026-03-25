package o;

import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes22.dex */
public class Zd {
    private static long OLrzqt(long j, long j2, int i, int i2) {
        return (j2 * (j ^ (j >> i))) + ((long) i2);
    }

    static long[] OLrzqt(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i2) & BodyPartID.bodyIdMax) | ((((long) i) & BodyPartID.bodyIdMax) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            jArr[i3] = copydefault(jArr[i3 - 1], i3);
        }
        return jArr;
    }

    private static long copydefault(long j, int i) {
        return OLrzqt(j, 1812433253L, 30, i);
    }

    static void KWHzl(long[] jArr, long[] jArr2, int i) {
        long j = jArr[i % 4] * 2147483085;
        long j2 = jArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j2) / 2147483647L;
        jArr[i2] = (j + j2) % 2147483647L;
    }
}
