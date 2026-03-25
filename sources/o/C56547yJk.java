package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yJk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56547yJk {
    public static <T extends java.lang.Comparable<? super T>> InterfaceC56538yJb<T> EZpvd(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return new yIX(t, t2);
    }

    public static yIY<java.lang.Double> copydefault(double d, double d2) {
        return new yIZ(d, d2);
    }

    public static yIY<java.lang.Float> AEQbTJ(float f, float f2) {
        return new C56537yJa(f, f2);
    }

    public static final void AEQbTJ(boolean z, @NotNull java.lang.Number number) {
        Intrinsics.checkNotNullParameter(number, "");
        if (z) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
