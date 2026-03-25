package o;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56423yEv extends C56420yEs {
    public static int copydefault(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> java.util.Map<K, V> EZpvd(@NotNull kotlin.Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
        return mapSingletonMap;
    }

    public static <K, V> java.util.Map<K, V> OLrzqt() {
        return new MapBuilder();
    }

    public static <K, V> java.util.Map<K, V> EZpvd(int i) {
        return new MapBuilder(i);
    }

    public static <K, V> java.util.Map<K, V> AYXKKw(@NotNull java.util.Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return ((MapBuilder) map).build();
    }

    public static <K extends java.lang.Comparable<? super K>, V> SortedMap<K, V> gEmmrt(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new TreeMap(map);
    }

    public static <K, V> SortedMap<K, V> AEQbTJ(@NotNull java.util.Map<? extends K, ? extends V> map, @NotNull java.util.Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static final <K, V> java.util.Map<K, V> AhwBna(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        java.util.Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
        return mapSingletonMap;
    }
}
