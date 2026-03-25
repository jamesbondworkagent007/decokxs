package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56420yEs {
    public static final <K, V> V KWHzl(@NotNull java.util.Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map instanceof InterfaceC56419yEr) {
            return (V) ((InterfaceC56419yEr) map).KWHzl(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
