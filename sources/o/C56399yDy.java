package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: o.yDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56399yDy {
    public static final double OLrzqt(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final long KWHzl(long j, long j2) {
        if (j2 < 0) {
            return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? C56396yDv.copydefault(0L) : C56396yDv.copydefault(1L);
        }
        if (j >= 0) {
            return C56396yDv.copydefault(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return C56396yDv.copydefault(j3 + ((long) (java.lang.Long.compare(C56396yDv.copydefault(j - (j3 * j2)) ^ Long.MIN_VALUE, C56396yDv.copydefault(j2) ^ Long.MIN_VALUE) < 0 ? 0 : 1)));
    }

    public static final int KWHzl(int i, int i2) {
        return Intrinsics.copydefault(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int AEQbTJ(long j, long j2) {
        return Intrinsics.copydefault(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final java.lang.String OLrzqt(long j, int i) {
        if (j >= 0) {
            java.lang.String string = java.lang.Long.toString(j, CharsKt__CharJVMKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String string2 = java.lang.Long.toString(j3, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        sb.append(string2);
        java.lang.String string3 = java.lang.Long.toString(j4, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "");
        sb.append(string3);
        return sb.toString();
    }
}
