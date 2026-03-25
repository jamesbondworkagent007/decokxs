package com.okinc.localization.adapter;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class SimpleLRUMap<K, V> extends LinkedHashMap<K, V> {
    public static final int $stable = 0;
    private final int maxSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxSize() {
        return this.maxSize;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (16 int) : (r2v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.75f float) : (r3v0 float))
 A[MD:(int, int, float):void (m)] (LINE:13) call: com.okinc.localization.adapter.SimpleLRUMap.<init>(int, int, float):void type: THIS */
    public /* synthetic */ SimpleLRUMap(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 16 : i2, (i3 & 4) != 0 ? 0.75f : f);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public Set<Object> getKeys() {
        return super.keySet();
    }

    public int getSize() {
        return super.size();
    }

    public Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) getValues();
    }

    public SimpleLRUMap(int i, int i2, float f) {
        super(i2, f, true);
        this.maxSize = i;
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxSize must be greater than 0, but was " + i).toString());
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.maxSize;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "SimpleLRUMap(size=" + size() + ", maxSize=" + this.maxSize + ")";
    }
}
