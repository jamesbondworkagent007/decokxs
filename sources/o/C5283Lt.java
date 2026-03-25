package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5283Lt {
    public static final <T> java.util.Map<java.lang.String, T> EZpvd(java.util.Map<java.lang.String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ? extends T> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            Intrinsics.copydefault(value);
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }
}
