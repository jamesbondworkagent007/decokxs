package o;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* JADX INFO: renamed from: o.acA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7027acA<K, V> implements InterfaceC7054acb<K, V> {
    public volatile Reference<java.util.Map<K, V>> EZpvd = null;
    public int AEQbTJ = 0;
    public int copydefault = 16;

    @Override // o.InterfaceC7054acb
    public V EZpvd(java.lang.Object obj) {
        java.util.Map<K, V> map;
        Reference<java.util.Map<K, V>> reference = this.EZpvd;
        if (reference == null || (map = reference.get()) == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // o.InterfaceC7054acb
    public void KWHzl(K k, V v) {
        Reference<java.util.Map<K, V>> softReference;
        Reference<java.util.Map<K, V>> reference = this.EZpvd;
        java.util.Map<K, V> mapSynchronizedMap = reference != null ? reference.get() : null;
        if (mapSynchronizedMap == null) {
            mapSynchronizedMap = Collections.synchronizedMap(new java.util.HashMap(this.copydefault));
            if (this.AEQbTJ == 1) {
                softReference = new WeakReference<>(mapSynchronizedMap);
            } else {
                softReference = new SoftReference<>(mapSynchronizedMap);
            }
            this.EZpvd = softReference;
        }
        mapSynchronizedMap.put(k, v);
    }
}
