package o;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDL<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, yIG {
    public abstract java.util.Set getEntries();

    @Override // java.util.AbstractMap, java.util.Map
    public abstract V put(K k, V v);

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public java.util.Set<java.lang.Object> getKeys() {
        return super.keySet();
    }

    public int getSize() {
        return super.size();
    }

    public java.util.Collection<java.lang.Object> getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        return (java.util.Set<K>) getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        return (java.util.Collection<V>) getValues();
    }
}
