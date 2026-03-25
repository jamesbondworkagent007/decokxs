package o;

import java.util.Map;

/* JADX INFO: renamed from: o.ywx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58211ywx<V> implements java.util.Map<java.lang.Class<?>, V> {
    public final java.util.Map<java.lang.String, V> EZpvd;

    public static <V> java.util.Map<java.lang.Class<?>, V> AEQbTJ(java.util.Map<java.lang.String, V> map) {
        return new C58211ywx(map);
    }

    public C58211ywx(java.util.Map<java.lang.String, V> map) {
        this.EZpvd = map;
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("Key must be a class");
        }
        return this.EZpvd.get(((java.lang.Class) obj).getName());
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.Class<?>> keySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        return this.EZpvd.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.EZpvd.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("Key must be a class");
        }
        return this.EZpvd.containsKey(((java.lang.Class) obj).getName());
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.EZpvd.containsValue(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.EZpvd.size();
    }

    @Override // java.util.Map
    public java.util.Set<Map.Entry<java.lang.Class<?>, V>> entrySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public V put(java.lang.Class<?> cls, V v) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.Class<?>, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }
}
