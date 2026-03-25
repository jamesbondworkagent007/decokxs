package com.okinc.network.okg.log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LruLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private final ReentrantLock lock;
    private final int maxCapacity;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

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

    public LruLinkedHashMap(int i) {
        super(i, 0.75f, true);
        this.maxCapacity = i;
        this.lock = new ReentrantLock();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.log.LruLinkedHashMap.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.maxCapacity;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        try {
            this.lock.lock();
            return super.containsKey(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        try {
            this.lock.lock();
            return (V) super.get(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        try {
            this.lock.lock();
            return (V) super.put(k, v);
        } finally {
            this.lock.unlock();
        }
    }

    public int getSize() {
        try {
            this.lock.lock();
            return super.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        try {
            this.lock.lock();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public final Collection<Map.Entry<K, V>> getAll() {
        try {
            this.lock.lock();
            return new ArrayList(super.entrySet());
        } finally {
            this.lock.unlock();
        }
    }

    public final List<V> getAllThenClear() {
        try {
            this.lock.lock();
            Collection<V> collectionValues = values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            List<V> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
            clear();
            return listAxsJAYsNCnLh;
        } finally {
            this.lock.unlock();
        }
    }

    public final List<V> takeAndClear(int i) {
        try {
            this.lock.lock();
            Set<Map.Entry<K, V>> setEntrySet = entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna(setEntrySet, i);
            Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                remove(((Map.Entry) it.next()).getKey());
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listAhwBna.iterator();
            while (it2.hasNext()) {
                Object value = ((Map.Entry) it2.next()).getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            return arrayList;
        } finally {
            this.lock.unlock();
        }
    }
}
