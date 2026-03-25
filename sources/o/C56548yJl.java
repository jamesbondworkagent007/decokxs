package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import o.C56539yJc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56548yJl extends C56547yJk {
    public static long AEQbTJ(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static double KWHzl(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static float copydefault(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int copydefault(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long copydefault(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static double gEmmrt(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static float valueOf(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int valueOf(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int EZpvd(@NotNull kotlin.ranges.IntRange intRange, @NotNull kotlin.random.Random random) {
        Intrinsics.checkNotNullParameter(intRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return yIW.copydefault(random, intRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static C56539yJc AYXKKw(int i, int i2) {
        return C56539yJc.AEQbTJ.EZpvd(i, i2, -1);
    }

    public static C56539yJc OLrzqt(@NotNull C56539yJc c56539yJc) {
        Intrinsics.checkNotNullParameter(c56539yJc, "");
        return C56539yJc.AEQbTJ.EZpvd(c56539yJc.copydefault(), c56539yJc.KWHzl(), -c56539yJc.OLrzqt());
    }

    public static C56539yJc AEQbTJ(@NotNull C56539yJc c56539yJc, int i) {
        Intrinsics.checkNotNullParameter(c56539yJc, "");
        C56547yJk.AEQbTJ(i > 0, java.lang.Integer.valueOf(i));
        C56539yJc.TaskDescription taskDescription = C56539yJc.AEQbTJ;
        int iKWHzl = c56539yJc.KWHzl();
        int iCopydefault = c56539yJc.copydefault();
        if (c56539yJc.OLrzqt() <= 0) {
            i = -i;
        }
        return taskDescription.EZpvd(iKWHzl, iCopydefault, i);
    }

    public static kotlin.ranges.IntRange AhwBna(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.KWHzl.AEQbTJ();
        }
        return new kotlin.ranges.IntRange(i, i2 - 1);
    }

    public static <T extends java.lang.Comparable<? super T>> T KWHzl(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    public static <T extends java.lang.Comparable<? super T>> T AYXKKw(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    public static int EZpvd(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long copydefault(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static float KWHzl(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static double KWHzl(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static <T extends java.lang.Comparable<? super T>> T OLrzqt(@NotNull T t, @NotNull yIY<T> yiy) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(yiy, "");
        if (!yiy.isEmpty()) {
            return (!yiy.OLrzqt(t, yiy.getStart()) || yiy.OLrzqt(yiy.getStart(), t)) ? (!yiy.OLrzqt(yiy.getEndInclusive(), t) || yiy.OLrzqt(t, yiy.getEndInclusive())) ? t : yiy.getEndInclusive() : yiy.getStart();
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + yiy + '.');
    }

    public static int AEQbTJ(int i, @NotNull InterfaceC56538yJb<java.lang.Integer> interfaceC56538yJb) {
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        if (interfaceC56538yJb instanceof yIY) {
            return ((java.lang.Number) OLrzqt(java.lang.Integer.valueOf(i), (yIY) interfaceC56538yJb)).intValue();
        }
        if (!interfaceC56538yJb.isEmpty()) {
            return i < ((java.lang.Number) interfaceC56538yJb.getStart()).intValue() ? ((java.lang.Number) interfaceC56538yJb.getStart()).intValue() : i > ((java.lang.Number) interfaceC56538yJb.getEndInclusive()).intValue() ? ((java.lang.Number) interfaceC56538yJb.getEndInclusive()).intValue() : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC56538yJb + '.');
    }

    public static long AEQbTJ(long j, @NotNull InterfaceC56538yJb<java.lang.Long> interfaceC56538yJb) {
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        if (interfaceC56538yJb instanceof yIY) {
            return ((java.lang.Number) OLrzqt(java.lang.Long.valueOf(j), (yIY) interfaceC56538yJb)).longValue();
        }
        if (!interfaceC56538yJb.isEmpty()) {
            return j < ((java.lang.Number) interfaceC56538yJb.getStart()).longValue() ? ((java.lang.Number) interfaceC56538yJb.getStart()).longValue() : j > ((java.lang.Number) interfaceC56538yJb.getEndInclusive()).longValue() ? ((java.lang.Number) interfaceC56538yJb.getEndInclusive()).longValue() : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC56538yJb + '.');
    }
}
