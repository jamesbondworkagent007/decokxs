package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;
import o.Yu;

/* JADX INFO: loaded from: classes21.dex */
public class LRUMap<K, V> implements Yu<K, V>, Serializable {
    private static final long serialVersionUID = 2;
    protected final int _initialEntries;
    protected final transient PrivateMaxEntriesMap<K, V> _map;
    protected final int _maxEntries;

    public LRUMap(int i, int i2) {
        this._initialEntries = i;
        this._maxEntries = i2;
        this._map = new PrivateMaxEntriesMap.TaskDescription().AEQbTJ(i).AEQbTJ(i2).KWHzl(4).copydefault();
    }

    public V put(K k, V v) {
        return this._map.put(k, v);
    }

    @Override // o.Yu
    public V putIfAbsent(K k, V v) {
        return this._map.putIfAbsent(k, v);
    }

    @Override // o.Yu
    public V get(Object obj) {
        return this._map.get(obj);
    }

    @Override // o.Yu
    public void clear() {
        this._map.clear();
    }

    public int size() {
        return this._map.size();
    }

    public void contents(BiConsumer<K, V> biConsumer) {
        for (Map.Entry<K, V> entry : this._map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public Object readResolve() {
        return new LRUMap(this._initialEntries, this._maxEntries);
    }
}
