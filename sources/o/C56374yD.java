package o;

import aws.smithy.kotlin.runtime.collections.SimpleMultiMap$entryValues$1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.InterfaceC58267yy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56374yD<K, V> implements InterfaceC58267yy<K, V>, java.util.Map<K, java.util.List<? extends V>> {
    public final java.util.Map<K, java.util.List<V>> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ(@NotNull java.util.List<? extends V> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.EZpvd.containsValue(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<V> get(K k) {
        return this.EZpvd.get(k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<Map.Entry<K, java.util.List<V>>> EZpvd() {
        return this.EZpvd.entrySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.EZpvd.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<V> remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<K> copydefault() {
        return this.EZpvd.keySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Collection<java.util.List<V>> djBIcL() {
        return this.EZpvd.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean isEmpty() {
        return this.EZpvd.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends java.util.List<? extends V>> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super K, ? super java.util.List<? extends V>, ? extends java.util.List<? extends V>> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends java.util.List<? extends V>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56374yD(@NotNull java.util.Map<K, ? extends java.util.List<? extends V>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = map;
    }

    @Override // o.InterfaceC58267yy
    public InterfaceC56347yC<K, V> AEQbTJ() {
        return InterfaceC58267yy.Activity.EZpvd(this);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            return AEQbTJ((java.util.List) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, java.util.List<V>>> entrySet() {
        return EZpvd();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return copydefault();
    }

    @Override // java.util.Map
    public final int size() {
        return KWHzl();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.util.List<V>> values() {
        return djBIcL();
    }

    @Override // o.InterfaceC58267yy
    public Sequence<Map.Entry<K, V>> OLrzqt() {
        return C59404zgR.EZpvd(new SimpleMultiMap$entryValues$1(this, null));
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C56374yD.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.EZpvd(this.EZpvd, ((C56374yD) obj).EZpvd);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public java.lang.String toString() {
        return this.EZpvd.toString();
    }
}
