package o;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56407yEf extends C56408yEg {
    public static <T extends java.lang.Comparable<? super T>> void fIwbmz(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void copydefault(@NotNull java.util.List<T> list, @NotNull java.util.Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
