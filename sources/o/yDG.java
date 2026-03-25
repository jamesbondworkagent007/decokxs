package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDG<E> extends AbstractC56400yDz<E> implements java.util.List<E> {
    public static final TaskDescription Companion = new TaskDescription(null);
    private static final int maxArraySize = 2147483639;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    @Override // o.AbstractC56400yDz
    public abstract int getSize();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public E remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new StateListAnimator();
    }

    public java.util.ListIterator<E> listIterator() {
        return new Application(0);
    }

    public java.util.ListIterator<E> listIterator(int i) {
        return new Application(i);
    }

    public java.util.List<E> subList(int i, int i2) {
        return new ActionBar(this, i, i2);
    }

    public static final class ActionBar<E> extends yDG<E> implements java.util.RandomAccess {
        public final int AEQbTJ;
        public final yDG<E> KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yDG, o.AbstractC56400yDz
        public int getSize() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDG<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull yDG<? extends E> ydg, int i, int i2) {
            Intrinsics.checkNotNullParameter(ydg, "");
            this.KWHzl = ydg;
            this.AEQbTJ = i;
            yDG.Companion.copydefault(i, i2, ydg.size());
            this.OLrzqt = i2 - i;
        }

        @Override // o.yDG, java.util.List
        public E get(int i) {
            yDG.Companion.AEQbTJ(i, this.OLrzqt);
            return this.KWHzl.get(this.AEQbTJ + i);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            return Companion.AEQbTJ(this, (java.util.Collection<?>) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.OLrzqt(this);
    }

    public class StateListAnimator implements java.util.Iterator<E>, InterfaceC56535yIz {
        public int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd < yDG.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            yDG<E> ydg = yDG.this;
            int i = this.EZpvd;
            this.EZpvd = i + 1;
            return ydg.get(i);
        }
    }

    public class Application extends yDG<E>.StateListAnimator implements java.util.ListIterator<E> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public void add(E e) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public void set(E e) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Application(int i) {
            super();
            yDG.Companion.copydefault(i, yDG.this.size());
            OLrzqt(i);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return KWHzl() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return KWHzl();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            yDG<E> ydg = yDG.this;
            OLrzqt(KWHzl() - 1);
            return ydg.get(KWHzl());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return KWHzl() - 1;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int OLrzqt(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - yDG.maxArraySize <= 0) {
                return i3;
            }
            if (i2 > yDG.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return yDG.maxArraySize;
        }

        private TaskDescription() {
        }

        public final void AEQbTJ(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new java.lang.IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void copydefault(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new java.lang.IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void copydefault(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new java.lang.IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        public final void AEQbTJ(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new java.lang.IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new java.lang.IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        public final int OLrzqt(@NotNull java.util.Collection<?> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            java.util.Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public final boolean AEQbTJ(@NotNull java.util.Collection<?> collection, @NotNull java.util.Collection<?> collection2) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(collection2, "");
            if (collection.size() != collection2.size()) {
                return false;
            }
            java.util.Iterator<?> it = collection2.iterator();
            java.util.Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.EZpvd(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public int indexOf(E e) {
        java.util.Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        java.util.ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.EZpvd(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
