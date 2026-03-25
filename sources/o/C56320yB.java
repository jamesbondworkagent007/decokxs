package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56320yB {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [137=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> InterfaceC56347yC<K, V> EZpvd(@NotNull kotlin.Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlin.Pair<? extends K, ? extends V> pair : pairArr) {
            K first = pair.getFirst();
            java.lang.Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((java.util.List) arrayList).add(pair.getSecond());
        }
        return new C56428yF(linkedHashMap);
    }
}
