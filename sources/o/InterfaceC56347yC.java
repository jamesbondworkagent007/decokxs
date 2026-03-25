package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC56347yC<K, V> extends java.util.Map<K, java.util.List<V>>, yIG {
    boolean AEQbTJ(K k, V v);

    boolean AEQbTJ(K k, @NotNull java.util.Collection<? extends V> collection);

    java.util.List<V> OLrzqt(K k, V v);

    InterfaceC58267yy<K, V> OLrzqt();

    Sequence<Map.Entry<K, V>> copydefault();

    void copydefault(@NotNull java.util.Map<K, ? extends java.util.List<? extends V>> map);

    /* JADX INFO: renamed from: o.yC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yC<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        public static <K, V> void OLrzqt(@NotNull InterfaceC56347yC<K, V> interfaceC56347yC, @NotNull java.util.Map<K, ? extends java.util.List<? extends V>> map) {
            Intrinsics.checkNotNullParameter(map, "");
            java.util.Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                interfaceC56347yC.AEQbTJ(entry.getKey(), (java.util.Collection) entry.getValue());
            }
        }

        public static <K, V> java.util.List<V> OLrzqt(@NotNull InterfaceC56347yC<K, V> interfaceC56347yC, K k, V v) {
            return (java.util.List) interfaceC56347yC.put(k, yDY.AhwBna(v));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.LinkedHashMap */
        /* JADX WARN: Multi-variable type inference failed */
        public static <K, V> InterfaceC58267yy<K, V> EZpvd(@NotNull InterfaceC56347yC<K, V> interfaceC56347yC) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(interfaceC56347yC.size()));
            java.util.Iterator<T> it = interfaceC56347yC.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), CollectionsKt___CollectionsKt.AxsJAYsNCnLh((java.util.List) entry.getValue()));
            }
            return new C56374yD(C56424yEw.values(linkedHashMap));
        }
    }
}
