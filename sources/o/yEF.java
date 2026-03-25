package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yEF<T> extends yDG<T> {
    public final java.util.List<T> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public yEF(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    @Override // o.yDG, o.AbstractC56400yDz
    public int getSize() {
        return this.copydefault.size();
    }

    @Override // o.yDG, java.util.List
    public T get(int i) {
        return this.copydefault.get(C56405yEd.AhwBna(this, i));
    }

    @Override // o.yDG, o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // o.yDG, java.util.List
    public java.util.ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public static final class TaskDescription implements java.util.ListIterator<T>, InterfaceC56535yIz {
        public final java.util.ListIterator<T> EZpvd;
        public final /* synthetic */ yEF<T> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public void add(T t) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public void set(T t) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yEF<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(yEF<? extends T> yef, int i) {
            this.OLrzqt = yef;
            this.EZpvd = yef.copydefault.listIterator(C56405yEd.valueOf((java.util.List<?>) yef, i));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.EZpvd.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.EZpvd.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C56405yEd.gEmmrt((java.util.List<?>) this.OLrzqt, this.EZpvd.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.EZpvd.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C56405yEd.gEmmrt((java.util.List<?>) this.OLrzqt, this.EZpvd.nextIndex());
        }
    }

    @Override // o.yDG, java.util.List
    public java.util.ListIterator<T> listIterator(int i) {
        return new TaskDescription(this, i);
    }
}
