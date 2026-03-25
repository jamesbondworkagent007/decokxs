package o;

import aws.smithy.kotlin.runtime.collections.SimpleMutableMultiMap$entryValues$1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.InterfaceC56347yC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56428yF<K, V> implements java.util.Map<K, java.util.List<V>>, InterfaceC56347yC<K, V> {
    public final java.util.Map<K, java.util.List<V>> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<K> EZpvd() {
        return this.EZpvd.keySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<V> remove(K k) {
        return this.EZpvd.remove(k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<Map.Entry<K, java.util.List<V>>> KWHzl() {
        return this.EZpvd.entrySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<V> put(K k, @NotNull java.util.List<V> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.EZpvd.put(k, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        this.EZpvd.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.EZpvd.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<V> get(K k) {
        return this.EZpvd.get(k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault(@NotNull java.util.List<V> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.EZpvd.containsValue(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Collection<java.util.List<V>> gEmmrt() {
        return this.EZpvd.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean isEmpty() {
        return this.EZpvd.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(@NotNull java.util.Map<? extends K, ? extends java.util.List<V>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd.putAll(map);
    }

    public C56428yF(@NotNull java.util.Map<K, java.util.List<V>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = map;
    }

    @Override // o.InterfaceC56347yC
    public java.util.List<V> OLrzqt(K k, V v) {
        return InterfaceC56347yC.TaskDescription.OLrzqt(this, k, v);
    }

    @Override // o.InterfaceC56347yC
    public InterfaceC58267yy<K, V> OLrzqt() {
        return InterfaceC56347yC.TaskDescription.EZpvd(this);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (C56532yIw.DbNXlk(obj)) {
            return copydefault((java.util.List) obj);
        }
        return false;
    }

    @Override // o.InterfaceC56347yC
    public void copydefault(@NotNull java.util.Map<K, ? extends java.util.List<? extends V>> map) {
        InterfaceC56347yC.TaskDescription.OLrzqt(this, map);
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, java.util.List<V>>> entrySet() {
        return KWHzl();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final int size() {
        return AEQbTJ();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.util.List<V>> values() {
        return gEmmrt();
    }

    @Override // o.InterfaceC56347yC
    public boolean AEQbTJ(K k, V v) {
        return OLrzqt(k).add(v);
    }

    @Override // o.InterfaceC56347yC
    public boolean AEQbTJ(K k, @NotNull java.util.Collection<? extends V> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return OLrzqt(k).addAll(collection);
    }

    @Override // o.InterfaceC56347yC
    public Sequence<Map.Entry<K, V>> copydefault() {
        return C59404zgR.EZpvd(new SimpleMutableMultiMap$entryValues$1(this, null));
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C56428yF.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.EZpvd(this.EZpvd, ((C56428yF) obj).EZpvd);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public java.lang.String toString() {
        return this.EZpvd.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yF<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<V> OLrzqt(K k) {
        java.lang.Object arrayList = get(k);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            put(k, arrayList);
        }
        return (java.util.List) arrayList;
    }
}
