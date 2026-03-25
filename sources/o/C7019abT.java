package o;

import androidx.compose.material3.CalendarModelKt;
import com.flyco.tablayout.BuildConfig;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.abT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7019abT {
    public static final int[] copydefault = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] KWHzl = {0, 31, 59, 90, 120, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, BuildConfig.VERSION_CODE, 243, 273, 304, 334, 0, 31, 60, 91, 121, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 213, 244, 274, 305, 335};

    public static final boolean copydefault(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    public static final int copydefault(int i, int i2) {
        return copydefault[i2 + (copydefault(i) ? 12 : 0)];
    }

    public static final int AEQbTJ(int i, int i2) {
        if (i2 > 0) {
            return copydefault(i, i2 - 1);
        }
        return 31;
    }

    public static long copydefault(int i, int i2, int i3) {
        int i4 = i - 1;
        long j = i4;
        return ((((((((i4 * 365) + copydefault(j, 4L)) + 1721423) + copydefault(j, 400L)) - copydefault(j, 100L)) + 2) + ((long) KWHzl[i2 + (copydefault(i) ? 12 : 0)])) + ((long) i3)) - 2440588;
    }

    public static int copydefault(long j) {
        long[] jArr = new long[1];
        EZpvd(j + 5, 7L, jArr);
        int i = (int) jArr[0];
        if (i == 0) {
            return 7;
        }
        return i;
    }

    public static int[] EZpvd(long j, int[] iArr) {
        if (iArr == null || iArr.length < 5) {
            iArr = new int[5];
        }
        long[] jArr = new long[1];
        long jEZpvd = EZpvd(719162 + j, 146097L, jArr);
        long jEZpvd2 = EZpvd(jArr[0], 36524L, jArr);
        long jEZpvd3 = EZpvd(jArr[0], 1461L, jArr);
        long jEZpvd4 = EZpvd(jArr[0], 365L, jArr);
        int i = (int) ((jEZpvd * 400) + (100 * jEZpvd2) + (jEZpvd3 * 4) + jEZpvd4);
        int i2 = (int) jArr[0];
        if (jEZpvd2 == 4 || jEZpvd4 == 4) {
            i2 = 365;
        } else {
            i++;
        }
        boolean zCopydefault = copydefault(i);
        int i3 = ((((i2 >= (zCopydefault ? 60 : 59) ? zCopydefault ? 1 : 2 : 0) + i2) * 12) + 6) / 367;
        int i4 = KWHzl[zCopydefault ? i3 + 12 : i3];
        int i5 = (int) ((j + 719164) % 7);
        if (i5 < 1) {
            i5 += 7;
        }
        iArr[0] = i;
        iArr[1] = i3;
        iArr[2] = (i2 - i4) + 1;
        iArr[3] = i5;
        iArr[4] = i2 + 1;
        return iArr;
    }

    public static int[] KWHzl(long j, int[] iArr) {
        if (iArr == null || iArr.length < 6) {
            iArr = new int[6];
        }
        long[] jArr = new long[1];
        EZpvd(EZpvd(j, CalendarModelKt.MillisecondsIn24Hours, jArr), iArr);
        iArr[5] = (int) jArr[0];
        return iArr;
    }

    public static long copydefault(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static long EZpvd(long j, long j2, long[] jArr) {
        if (j >= 0) {
            jArr[0] = j % j2;
            return j / j2;
        }
        long j3 = ((j + 1) / j2) - 1;
        jArr[0] = j - (j2 * j3);
        return j3;
    }

    public static int OLrzqt(int i, int i2, int i3) {
        int i4 = (i3 + 6) / 7;
        if (i4 == 4) {
            if (i3 + 7 <= copydefault(i, i2)) {
                return i4;
            }
        } else if (i4 != 5) {
            return i4;
        }
        return -1;
    }

    public static java.lang.String AEQbTJ(long j) {
        int[] iArrKWHzl = KWHzl(j, null);
        int i = iArrKWHzl[5];
        int i2 = i / 3600000;
        int i3 = i % 3600000;
        int i4 = i3 / 60000;
        int i5 = i3 % 60000;
        return java.lang.String.format(null, "%04d-%02d-%02dT%02d:%02d:%02d.%03dZ", java.lang.Integer.valueOf(iArrKWHzl[0]), java.lang.Integer.valueOf(iArrKWHzl[1] + 1), java.lang.Integer.valueOf(iArrKWHzl[2]), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5 / 1000), java.lang.Integer.valueOf(i5 % 1000));
    }
}
