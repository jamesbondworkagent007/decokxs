package com.okinc.gray.remoteconfig;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.C35207nqv;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoteGrayConfig extends ConcurrentHashMap<String, C35207nqv> {
    public static final int $stable = 0;

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof C35207nqv) {
            return containsValue((C35207nqv) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(C35207nqv c35207nqv) {
        return super.containsValue((Object) c35207nqv);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, C35207nqv>> entrySet() {
        return getEntries();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C35207nqv get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ C35207nqv get(String str) {
        return (C35207nqv) super.get((Object) str);
    }

    public Set<Map.Entry<String, C35207nqv>> getEntries() {
        return super.entrySet();
    }

    public Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (C35207nqv) obj2);
    }

    public final /* bridge */ C35207nqv getOrDefault(Object obj, C35207nqv c35207nqv) {
        return !(obj instanceof String) ? c35207nqv : getOrDefault((String) obj, c35207nqv);
    }

    public /* bridge */ C35207nqv getOrDefault(String str, C35207nqv c35207nqv) {
        return (C35207nqv) super.getOrDefault((Object) str, c35207nqv);
    }

    public int getSize() {
        return super.size();
    }

    public Collection<C35207nqv> getValues() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C35207nqv remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ C35207nqv remove(String str) {
        return (C35207nqv) super.remove((Object) str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof C35207nqv)) {
            return remove((String) obj, (C35207nqv) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, C35207nqv c35207nqv) {
        return super.remove((Object) str, (Object) c35207nqv);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Collection<C35207nqv> values() {
        return getValues();
    }
}
