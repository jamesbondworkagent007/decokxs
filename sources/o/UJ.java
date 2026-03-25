package o;

import o.UM;

/* JADX INFO: loaded from: classes21.dex */
public class UJ {
    public static final float[] EZpvd = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    private UJ() {
    }

    public static float AEQbTJ(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return 0.0f;
        }
        if (z2) {
            if (-45 <= i2 && i2 <= 38) {
                float fCopydefault = copydefault(z, j, i2);
                float fCopydefault2 = copydefault(z, j + 1, i2);
                if (!java.lang.Float.isNaN(fCopydefault) && fCopydefault2 == fCopydefault) {
                    return fCopydefault;
                }
            }
        } else if (-45 <= i && i <= 38) {
            return copydefault(z, j, i);
        }
        return Float.NaN;
    }

    public static float copydefault(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return 0.0f;
        }
        if (z2) {
            if (-126 <= i2 && i2 <= 127) {
                float fOLrzqt = OLrzqt(z, j, i2);
                float fOLrzqt2 = OLrzqt(z, j + 1, i2);
                if (!java.lang.Double.isNaN(fOLrzqt) && fOLrzqt2 == fOLrzqt) {
                    return fOLrzqt;
                }
            }
        } else if (-126 <= i && i <= 127) {
            return OLrzqt(z, j, i);
        }
        return Float.NaN;
    }

    public static float copydefault(boolean z, long j, int i) {
        float f;
        if (-10 <= i && i <= 10 && java.lang.Long.compare(j ^ Long.MIN_VALUE, 16777215 ^ Long.MIN_VALUE) <= 0) {
            float f2 = j;
            if (i < 0) {
                f = f2 / EZpvd[-i];
            } else {
                f = f2 * EZpvd[i];
            }
            return z ? -f : f;
        }
        int i2 = i + 325;
        long j2 = UM.copydefault[i2];
        long j3 = i;
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j);
        long j4 = j << iNumberOfLeadingZeros;
        UM.Application applicationAEQbTJ = UM.AEQbTJ(j4, j2);
        long j5 = applicationAEQbTJ.AEQbTJ;
        long j6 = applicationAEQbTJ.EZpvd;
        if ((j6 & 274877906943L) == 274877906943L && java.lang.Long.compare((j5 + j4) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) < 0) {
            UM.Application applicationAEQbTJ2 = UM.AEQbTJ(j4, UM.AEQbTJ[i2]);
            long j7 = applicationAEQbTJ2.AEQbTJ;
            long j8 = applicationAEQbTJ2.EZpvd + j5;
            if (java.lang.Long.compare(j8 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) < 0) {
                j6++;
            }
            if (j8 + 1 == 0 && (j6 & 549755813887L) == 549755813887L && j7 + ((long) java.lang.Long.compare(j4 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE)) < 0) {
                return Float.NaN;
            }
        }
        long j9 = j6 >>> 63;
        long j10 = j6 >>> ((int) (38 + j9));
        int i3 = iNumberOfLeadingZeros + ((int) (j9 ^ 1));
        long j11 = j6 & 274877906943L;
        if (j11 != 274877906943L && (j11 != 0 || (3 & j10) != 1)) {
            long j12 = (j10 + 1) >>> 1;
            if (j12 >= 16777216) {
                i3--;
                j12 = 8388608;
            }
            long j13 = (((j3 * 217706) >> 16) + 191) - ((long) i3);
            if (j13 >= 1 && j13 <= 254) {
                return java.lang.Float.intBitsToFloat((int) ((j13 << 23) | ((-8388609) & j12) | (z ? 2147483648L : 0L)));
            }
        }
        return Float.NaN;
    }

    public static float OLrzqt(boolean z, long j, int i) {
        if (j == 0 || i < -180) {
            return 0.0f;
        }
        if (i > 127) {
            return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (java.lang.Long.compare(j ^ Long.MIN_VALUE, 9007199254740991L ^ Long.MIN_VALUE) > 0) {
            return Float.NaN;
        }
        float fScalb = j * java.lang.Math.scalb(1.0f, i);
        return z ? -fScalb : fScalb;
    }
}
