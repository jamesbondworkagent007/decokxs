package o;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDH<T> implements java.util.Iterator<T>, InterfaceC56535yIz {
    public T AEQbTJ;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.KWHzl = 2;
    }

    public abstract void copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(T t) {
        this.AEQbTJ = t;
        this.KWHzl = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.KWHzl;
        if (i == 0) {
            return OLrzqt();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.KWHzl;
        if (i == 1) {
            this.KWHzl = 0;
            return this.AEQbTJ;
        }
        if (i == 2 || !OLrzqt()) {
            throw new NoSuchElementException();
        }
        this.KWHzl = 0;
        return this.AEQbTJ;
    }

    public final boolean OLrzqt() {
        this.KWHzl = 3;
        copydefault();
        return this.KWHzl == 1;
    }
}
