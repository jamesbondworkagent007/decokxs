package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56426yEy<T> extends yDJ<T> {
    public final java.util.List<T> KWHzl;

    public C56426yEy(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    @Override // o.yDJ
    public int getSize() {
        return this.KWHzl.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.KWHzl.get(C56405yEd.AhwBna(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.KWHzl.clear();
    }

    @Override // o.yDJ
    public T removeAt(int i) {
        return this.KWHzl.remove(C56405yEd.AhwBna(this, i));
    }

    @Override // o.yDJ, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.KWHzl.set(C56405yEd.AhwBna(this, i), t);
    }

    @Override // o.yDJ, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.KWHzl.add(C56405yEd.valueOf((java.util.List<?>) this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: o.yEy$Activity */
    public static final class Activity implements java.util.ListIterator<T>, yID {
        public final /* synthetic */ C56426yEy<T> EZpvd;
        public final java.util.ListIterator<T> copydefault;

        public Activity(C56426yEy<T> c56426yEy, int i) {
            this.EZpvd = c56426yEy;
            this.copydefault = c56426yEy.KWHzl.listIterator(C56405yEd.valueOf((java.util.List<?>) c56426yEy, i));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.copydefault.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.copydefault.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.copydefault.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C56405yEd.gEmmrt((java.util.List<?>) this.EZpvd, this.copydefault.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.copydefault.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C56405yEd.gEmmrt((java.util.List<?>) this.EZpvd, this.copydefault.nextIndex());
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.copydefault.add(t);
            this.copydefault.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.copydefault.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.copydefault.set(t);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator(int i) {
        return new Activity(this, i);
    }
}
