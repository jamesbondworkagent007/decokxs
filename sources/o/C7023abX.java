package o;

/* JADX INFO: renamed from: o.abX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7023abX<E> implements java.util.Set<E> {
    public final java.util.Collection<E> copydefault;

    public C7023abX(java.util.Collection<E> collection) {
        this.copydefault = collection;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.copydefault.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.copydefault.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.copydefault.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return this.copydefault.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return this.copydefault.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.copydefault.toArray(tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        return this.copydefault.add(e);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.copydefault.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<?> collection) {
        return this.copydefault.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> collection) {
        return this.copydefault.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<?> collection) {
        return this.copydefault.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        return this.copydefault.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.copydefault.clear();
    }
}
