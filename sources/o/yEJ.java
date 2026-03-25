package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yEJ extends yEE {
    public static <T> java.util.Set<T> EZpvd(@NotNull java.util.Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C56423yEv.copydefault(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.EZpvd(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static <T> java.util.Set<T> EZpvd(@NotNull java.util.Set<? extends T> set, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Collection<?> collectionORxRYg = C56406yEe.ORxRYg(iterable);
        if (collectionORxRYg.isEmpty()) {
            return CollectionsKt___CollectionsKt.OqFWZa(set);
        }
        if (!(collectionORxRYg instanceof java.util.Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionORxRYg);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!((java.util.Set) collectionORxRYg).contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    public static <T> java.util.Set<T> OLrzqt(@NotNull java.util.Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C56423yEv.copydefault(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static <T> java.util.Set<T> KWHzl(@NotNull java.util.Set<? extends T> set, @NotNull java.lang.Iterable<? extends T> iterable) {
        int size;
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.lang.Integer numQKVWgx = C56403yEb.QKVWgx(iterable);
        if (numQKVWgx != null) {
            size = set.size() + numQKVWgx.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C56423yEv.copydefault(size));
        linkedHashSet.addAll(set);
        C56406yEe.KWHzl(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
