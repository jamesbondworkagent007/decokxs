package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IT<K, V> implements java.util.Map<K, V>, yIG {
    public java.util.Map<K, V> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt = map;
    }

    public IT(@NotNull java.util.Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt = map;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return AEQbTJ();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return KWHzl();
    }

    @Override // java.util.Map
    public final int size() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return copydefault();
    }

    public int EZpvd() {
        return this.OLrzqt.size();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.OLrzqt.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.OLrzqt.containsValue(obj);
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        return this.OLrzqt.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.OLrzqt.isEmpty();
    }

    public java.util.Set<Map.Entry<K, V>> AEQbTJ() {
        return this.OLrzqt.entrySet();
    }

    public java.util.Set<K> KWHzl() {
        return this.OLrzqt.keySet();
    }

    public java.util.Collection<V> copydefault() {
        return this.OLrzqt.values();
    }

    @Override // java.util.Map
    public void clear() {
        this.OLrzqt.clear();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return this.OLrzqt.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt.putAll(map);
    }

    @Override // java.util.Map
    public V remove(java.lang.Object obj) {
        return this.OLrzqt.remove(obj);
    }
}
