package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class IU<E> implements java.util.Collection<E>, yIC {
    public java.util.Collection<E> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.Collection<E> collection) {
        this.EZpvd = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return C56511yIb.AEQbTJ(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) C56511yIb.EZpvd(this, tArr);
    }

    public IU(java.util.Collection<E> collection) {
        this.EZpvd = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return EZpvd();
    }

    public final java.util.Collection<E> AEQbTJ() {
        java.util.Collection<E> collection = this.EZpvd;
        Intrinsics.copydefault(collection);
        return collection;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        return AEQbTJ().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(@NotNull java.util.Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return AEQbTJ().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        AEQbTJ().clear();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return AEQbTJ().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return AEQbTJ().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return AEQbTJ().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return AEQbTJ().retainAll(collection);
    }

    public int EZpvd() {
        return AEQbTJ().size();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return AEQbTJ().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return AEQbTJ().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AEQbTJ().isEmpty();
    }
}
