package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yEY extends yET {
    public static <T extends java.lang.Comparable<? super T>> T OLrzqt(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static int AEQbTJ(int i, @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = java.lang.Math.max(i, i2);
        }
        return i;
    }

    public static long KWHzl(long j, @NotNull long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        for (long j2 : jArr) {
            j = java.lang.Math.max(j, j2);
        }
        return j;
    }

    public static float EZpvd(float f, @NotNull float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = java.lang.Math.max(f, f2);
        }
        return f;
    }

    public static float copydefault(float f, @NotNull float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = java.lang.Math.min(f, f2);
        }
        return f;
    }
}
