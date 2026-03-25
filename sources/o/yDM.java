package o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDM<E> extends java.util.AbstractSet<E> implements java.util.Set<E>, yIF {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }
}
