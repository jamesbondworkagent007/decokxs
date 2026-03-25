package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zid, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59522zid {
    public static final long KWHzl(long j, @NotNull DurationUnit durationUnit, long j2) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        long jKWHzl = C59462zhW.KWHzl(j2, durationUnit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return copydefault(j, j2, jKWHzl);
        }
        if ((1 | (jKWHzl - 1)) == Long.MAX_VALUE) {
            return AEQbTJ(j, durationUnit, j2);
        }
        long j3 = j + jKWHzl;
        return ((j ^ j3) & (jKWHzl ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    public static final long copydefault(long j, long j2, long j3) {
        if (!C59462zhW.hDKMBd(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException("Summing infinities of different signs");
    }

    public static final long AEQbTJ(long j, DurationUnit durationUnit, long j2) {
        long jOLrzqt = C59462zhW.OLrzqt(j2, 2);
        long jKWHzl = C59462zhW.KWHzl(jOLrzqt, durationUnit);
        return (1 | (jKWHzl - 1)) == Long.MAX_VALUE ? jKWHzl : KWHzl(KWHzl(j, durationUnit, jOLrzqt), durationUnit, C59462zhW.OLrzqt(j2, jOLrzqt));
    }

    public static final long copydefault(long j) {
        return j < 0 ? C59462zhW.OLrzqt.copydefault() : C59462zhW.OLrzqt.EZpvd();
    }

    public static final long KWHzl(long j, long j2, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return C59462zhW.wlaJM(copydefault(j2));
        }
        return copydefault(j, j2, durationUnit);
    }

    public static final long EZpvd(long j, long j2, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return C59462zhW.OLrzqt.KWHzl();
            }
            return C59462zhW.wlaJM(copydefault(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return copydefault(j);
        }
        return copydefault(j, j2, durationUnit);
    }

    public static final long copydefault(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
            if (durationUnit.compareTo(durationUnit2) < 0) {
                long jAEQbTJ = C59465zhZ.AEQbTJ(1L, durationUnit2, durationUnit);
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                return C59462zhW.copydefault(C59519zia.AEQbTJ((j / jAEQbTJ) - (j2 / jAEQbTJ), durationUnit2), C59519zia.AEQbTJ((j % jAEQbTJ) - (j2 % jAEQbTJ), durationUnit));
            }
            return C59462zhW.wlaJM(copydefault(j3));
        }
        return C59519zia.AEQbTJ(j3, durationUnit);
    }
}
