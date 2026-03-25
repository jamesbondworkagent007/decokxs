package o;

import java.util.LinkedHashMap;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56424yEw extends C56423yEv {
    public static <K, V> java.util.Map<K, V> KWHzl() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        Intrinsics.copydefault(emptyMap, "");
        return emptyMap;
    }

    public static <K, V> java.util.Map<K, V> gEmmrt(@NotNull kotlin.Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        return pairArr.length > 0 ? OLrzqt(pairArr, new LinkedHashMap(C56423yEv.copydefault(pairArr.length))) : KWHzl();
    }

    public static <K, V> java.util.Map<K, V> djBIcL(@NotNull kotlin.Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(pairArr.length));
        copydefault(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <K, V> java.util.HashMap<K, V> AYXKKw(@NotNull kotlin.Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.HashMap<K, V> map = new java.util.HashMap<>(C56423yEv.copydefault(pairArr.length));
        copydefault(map, pairArr);
        return map;
    }

    public static <K, V> LinkedHashMap<K, V> AhwBna(@NotNull kotlin.Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        return (LinkedHashMap) OLrzqt(pairArr, new LinkedHashMap(C56423yEv.copydefault(pairArr.length)));
    }

    public static <K, V> V EZpvd(@NotNull java.util.Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "");
        return (V) C56420yEs.KWHzl(map, k);
    }

    public static <K, V> void copydefault(@NotNull java.util.Map<? super K, ? super V> map, @NotNull kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static <K, V> void OLrzqt(@NotNull java.util.Map<? super K, ? super V> map, @NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static <K, V> void EZpvd(@NotNull java.util.Map<? super K, ? super V> map, @NotNull Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : sequence) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static <K, V> java.util.Map<K, V> copydefault(@NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return KWHzl();
            }
            if (size != 1) {
                return AEQbTJ(iterable, new LinkedHashMap(C56423yEv.copydefault(collection.size())));
            }
            return C56423yEv.EZpvd((kotlin.Pair) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next()));
        }
        return djBIcL(AEQbTJ(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M AEQbTJ(@NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable, @NotNull M m) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        OLrzqt(m, iterable);
        return m;
    }

    public static <K, V> java.util.Map<K, V> valueOf(@NotNull kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        int length = pairArr.length;
        if (length == 0) {
            return KWHzl();
        }
        if (length == 1) {
            return C56423yEv.EZpvd(pairArr[0]);
        }
        return OLrzqt(pairArr, new LinkedHashMap(C56423yEv.copydefault(pairArr.length)));
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M OLrzqt(@NotNull kotlin.Pair<? extends K, ? extends V>[] pairArr, @NotNull M m) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        Intrinsics.checkNotNullParameter(m, "");
        copydefault(m, pairArr);
        return m;
    }

    public static <K, V> java.util.Map<K, V> OLrzqt(@NotNull Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return djBIcL(EZpvd(sequence, new LinkedHashMap()));
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M EZpvd(@NotNull Sequence<? extends kotlin.Pair<? extends K, ? extends V>> sequence, @NotNull M m) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(m, "");
        EZpvd((java.util.Map) m, (Sequence) sequence);
        return m;
    }

    public static <K, V> java.util.Map<K, V> values(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        int size = map.size();
        if (size == 0) {
            return KWHzl();
        }
        if (size == 1) {
            return C56423yEv.AhwBna(map);
        }
        return isConnected(map);
    }

    public static <K, V> java.util.Map<K, V> isConnected(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new LinkedHashMap(map);
    }

    public static <K, V> java.util.Map<K, V> KWHzl(@NotNull java.util.Map<? extends K, ? extends V> map, @NotNull kotlin.Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(pair, "");
        if (map.isEmpty()) {
            return C56423yEv.EZpvd(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static <K, V> java.util.Map<K, V> OLrzqt(@NotNull java.util.Map<? extends K, ? extends V> map, @NotNull java.util.Map<? extends K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<K, V> djBIcL(@NotNull java.util.Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : C56423yEv.AhwBna(map);
        }
        return KWHzl();
    }
}
