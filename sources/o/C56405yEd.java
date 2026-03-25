package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56405yEd extends C56406yEe {
    public static final int AhwBna(java.util.List<?> list, int i) {
        if (i >= 0 && i <= yDY.AuCTel(list)) {
            return yDY.AuCTel(list) - i;
        }
        throw new java.lang.IndexOutOfBoundsException("Element index " + i + " must be in range [" + new kotlin.ranges.IntRange(0, yDY.AuCTel(list)) + "].");
    }

    public static final int valueOf(java.util.List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new java.lang.IndexOutOfBoundsException("Position index " + i + " must be in range [" + new kotlin.ranges.IntRange(0, list.size()) + "].");
    }

    public static final int gEmmrt(java.util.List<?> list, int i) {
        return yDY.AuCTel(list) - i;
    }

    public static <T> java.util.List<T> hDKMBd(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new yEF(list);
    }

    public static <T> java.util.List<T> zLjUOn(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C56426yEy(list);
    }
}
