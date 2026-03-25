package o;

/* JADX INFO: renamed from: o.yFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56453yFy {
    public static final int KWHzl(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final long EZpvd(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    public static final int OLrzqt(int i, int i2, int i3) {
        return KWHzl(KWHzl(i, i3) - KWHzl(i2, i3), i3);
    }

    public static final long EZpvd(long j, long j2, long j3) {
        return EZpvd(EZpvd(j, j3) - EZpvd(j2, j3), j3);
    }

    public static final int EZpvd(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - OLrzqt(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + OLrzqt(i, i2, -i3);
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    public static final long copydefault(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - EZpvd(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + EZpvd(j, j2, -j3);
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }
}
