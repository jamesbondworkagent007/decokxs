package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yIW {
    public static final int KWHzl(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final int copydefault(@NotNull kotlin.random.Random random, @NotNull kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        if (!intRange.isEmpty()) {
            return intRange.copydefault() < Integer.MAX_VALUE ? random.nextInt(intRange.KWHzl(), intRange.copydefault() + 1) : intRange.KWHzl() > Integer.MIN_VALUE ? random.nextInt(intRange.KWHzl() - 1, intRange.copydefault()) + 1 : random.nextInt();
        }
        throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + intRange);
    }

    public static final int OLrzqt(int i) {
        return 31 - java.lang.Integer.numberOfLeadingZeros(i);
    }

    public static final void EZpvd(int i, int i2) {
        if (i2 <= i) {
            throw new java.lang.IllegalArgumentException(OLrzqt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)).toString());
        }
    }

    public static final void KWHzl(long j, long j2) {
        if (j2 <= j) {
            throw new java.lang.IllegalArgumentException(OLrzqt(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)).toString());
        }
    }

    public static final void AEQbTJ(double d, double d2) {
        if (d2 <= d) {
            throw new java.lang.IllegalArgumentException(OLrzqt(java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2)).toString());
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }
}
