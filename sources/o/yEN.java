package o;

import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yEN<K, V> extends yEO<Map.Entry<K, V>, K, V> {
    public final MapBuilder<K, V> copydefault;

    public yEN(@NotNull MapBuilder<K, V> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "");
        this.copydefault = mapBuilder;
    }

    @Override // o.yDM
    public int getSize() {
        return this.copydefault.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.copydefault.isEmpty();
    }

    @Override // o.yEO
    public boolean OLrzqt(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return this.copydefault.containsEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.copydefault.clear();
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // o.yDM, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull java.util.Collection<? extends Map.Entry<K, V>> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o.yEO
    public boolean KWHzl(@NotNull Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return this.copydefault.removeEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<Map.Entry<K, V>> iterator() {
        return this.copydefault.entriesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.copydefault.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.copydefault.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.copydefault.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
