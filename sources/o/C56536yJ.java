package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56536yJ {
    public static final <T> java.util.Map<java.lang.String, java.util.List<T>> AEQbTJ(@NotNull java.util.Map<java.lang.String, ? extends java.util.List<T>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) entry.getValue()));
        }
        return linkedHashMap;
    }
}
