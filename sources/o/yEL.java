package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yEL {
    public static final <E> E[] copydefault(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("capacity must be non-negative.".toString());
        }
        return (E[]) new java.lang.Object[i];
    }

    public static final <T> java.lang.String EZpvd(T[] tArr, int i, int i2, java.util.Collection<? extends T> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append("]");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final <T> int AEQbTJ(T[] tArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i + i3];
            iHashCode = (iHashCode * 31) + (t != null ? t.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final <T> boolean OLrzqt(T[] tArr, int i, int i2, java.util.List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!Intrinsics.EZpvd(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T[] EZpvd(@NotNull T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "");
        T[] tArr2 = (T[]) java.util.Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "");
        return tArr2;
    }

    public static final <E> void OLrzqt(@NotNull E[] eArr, int i) {
        Intrinsics.checkNotNullParameter(eArr, "");
        eArr[i] = null;
    }

    public static final <E> void OLrzqt(@NotNull E[] eArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(eArr, "");
        while (i < i2) {
            OLrzqt(eArr, i);
            i++;
        }
    }
}
