package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.zpG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59870zpG<T> implements InterfaceC59880zpQ<T> {
    public boolean AEQbTJ = false;
    public final org.jdom2.filter.Filter<T> EZpvd;
    public final C59904zpx OLrzqt;
    public T copydefault;

    public C59870zpG(C59904zpx c59904zpx, org.jdom2.filter.Filter<T> filter) {
        if (filter == null) {
            throw new java.lang.NullPointerException("Cannot specify a null Filter for a FilterIterator");
        }
        this.OLrzqt = c59904zpx;
        this.EZpvd = filter;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new C59870zpG(this.OLrzqt.iterator(), this.EZpvd);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        this.AEQbTJ = false;
        if (this.copydefault != null) {
            return true;
        }
        while (this.OLrzqt.hasNext()) {
            T tFilter = this.EZpvd.filter(this.OLrzqt.next());
            if (tFilter != null) {
                this.copydefault = tFilter;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T t = this.copydefault;
        this.copydefault = null;
        this.AEQbTJ = true;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.AEQbTJ) {
            throw new java.lang.IllegalStateException("remove() can only be called on the FilterIterator immediately after a successful call to next(). A call to remove() immediately after a call to hasNext() or remove() will also fail.");
        }
        this.AEQbTJ = false;
        this.OLrzqt.remove();
    }
}
