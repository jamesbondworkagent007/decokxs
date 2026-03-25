package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56403yEb extends yDY {
    public static final <T> java.lang.Integer QKVWgx(@NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof java.util.Collection) {
            return java.lang.Integer.valueOf(((java.util.Collection) iterable).size());
        }
        return null;
    }

    public static <T> int AYXKKw(@NotNull java.lang.Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i;
    }

    public static <T> java.util.List<T> QOLQEE(@NotNull java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends java.lang.Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, it.next());
        }
        return arrayList;
    }

    public static <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> DTwDnp(@NotNull java.lang.Iterable<? extends kotlin.Pair<? extends T, ? extends R>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        int iAYXKKw = AYXKKw(iterable, 10);
        java.util.ArrayList arrayList = new java.util.ArrayList(iAYXKKw);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(iAYXKKw);
        for (kotlin.Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return C56390yDp.OLrzqt(arrayList, arrayList2);
    }
}
