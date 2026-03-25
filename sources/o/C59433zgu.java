package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59433zgu {
    public static final <K> java.util.Map<K, java.lang.Integer> copydefault(@NotNull java.lang.Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <T> void EZpvd(@NotNull java.util.Collection<T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <K, V> java.util.HashMap<K, V> AEQbTJ(int i) {
        return new java.util.HashMap<>(OLrzqt(i));
    }

    public static final <E> java.util.HashSet<E> copydefault(int i) {
        return new java.util.HashSet<>(OLrzqt(i));
    }

    public static final <E> LinkedHashSet<E> KWHzl(int i) {
        return new LinkedHashSet<>(OLrzqt(i));
    }

    public static final int OLrzqt(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <T> java.util.List<T> OLrzqt(@NotNull java.util.ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        int size = arrayList.size();
        if (size == 0) {
            return yDY.AhwBna();
        }
        if (size == 1) {
            return C56402yEa.EZpvd(CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
