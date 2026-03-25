package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC58267yy<K, V> extends java.util.Map<K, java.util.List<? extends V>>, InterfaceC56535yIz {
    InterfaceC56347yC<K, V> AEQbTJ();

    Sequence<Map.Entry<K, V>> OLrzqt();

    /* JADX INFO: renamed from: o.yy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.LinkedHashMap */
        /* JADX WARN: Multi-variable type inference failed */
        public static <K, V> InterfaceC56347yC<K, V> EZpvd(@NotNull InterfaceC58267yy<K, V> interfaceC58267yy) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Iterator<T> it = interfaceC58267yy.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) entry.getValue()));
            }
            return new C56428yF(linkedHashMap);
        }
    }
}
