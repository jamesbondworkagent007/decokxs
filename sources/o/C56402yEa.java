package o;

import java.util.Collections;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56402yEa {
    public static <T> java.util.List<T> EZpvd(T t) {
        java.util.List<T> listSingletonList = Collections.singletonList(t);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "");
        return listSingletonList;
    }

    public static <E> java.util.List<E> OLrzqt() {
        return new ListBuilder(0, 1, null);
    }

    public static <E> java.util.List<E> OLrzqt(int i) {
        return new ListBuilder(i);
    }

    public static <E> java.util.List<E> fARcdN(@NotNull java.util.List<E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return ((ListBuilder) list).build();
    }

    public static <T> T[] AEQbTJ(int i, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    public static final <T> java.lang.Object[] KWHzl(@NotNull T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (z && Intrinsics.EZpvd(tArr.getClass(), java.lang.Object[].class)) {
            return tArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(tArr, tArr.length, java.lang.Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        return objArrCopyOf;
    }
}
