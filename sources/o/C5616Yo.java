package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.Yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5616Yo<T> implements java.util.Iterator<T>, java.lang.Iterable<T> {
    public final T[] AEQbTJ;
    public int KWHzl = 0;

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return this;
    }

    public C5616Yo(T[] tArr) {
        this.AEQbTJ = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.KWHzl < this.AEQbTJ.length;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.KWHzl;
        T[] tArr = this.AEQbTJ;
        if (i >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.KWHzl = i + 1;
        return tArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
