package o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDK<E> extends java.util.AbstractCollection<E> implements java.util.Collection<E>, yIC {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return getSize();
    }
}
