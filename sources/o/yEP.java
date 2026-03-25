package o;

import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yEP<V> extends yDK<V> implements java.util.Collection<V> {
    public final MapBuilder<?, V> KWHzl;

    public yEP(@NotNull MapBuilder<?, V> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "");
        this.KWHzl = mapBuilder;
    }

    @Override // o.yDK
    public int getSize() {
        return this.KWHzl.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.KWHzl.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.KWHzl.containsValue(obj);
    }

    @Override // o.yDK, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull java.util.Collection<? extends V> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.KWHzl.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<V> iterator() {
        return this.KWHzl.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.KWHzl.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.KWHzl.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.KWHzl.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
