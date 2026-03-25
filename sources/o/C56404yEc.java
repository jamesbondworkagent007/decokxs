package o;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56404yEc extends C56405yEd {
    public static <R> java.util.List<R> OLrzqt(@NotNull java.lang.Iterable<?> iterable, @NotNull java.lang.Class<R> cls) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (java.util.List) AEQbTJ(iterable, new java.util.ArrayList(), cls);
    }

    public static final <C extends java.util.Collection<? super R>, R> C AEQbTJ(@NotNull java.lang.Iterable<?> iterable, @NotNull C c, @NotNull java.lang.Class<R> cls) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(cls, "");
        for (java.lang.Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    public static <T> void zsXlph(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Collections.reverse(list);
    }

    public static <T> SortedSet<T> OLrzqt(@NotNull java.lang.Iterable<? extends T> iterable, @NotNull java.util.Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return (SortedSet) CollectionsKt___CollectionsKt.OLrzqt(iterable, new TreeSet(comparator));
    }
}
